package com.cloud.master.core.bean;


import com.cloud.master.core.Constants;


public class BasePaginator {


    /** 总行数 */
    private int totalRowsAmount;

    /** 每页行数 */
    private int pageSize = Constants.DEFAULT_PAGE_SIZE;

    /** 当前页码 */
    private Integer currentPage = 1; // modify int to Integer

    /** 总页数 */
    private int totalPages;

    /**  设定要获取的第一条记录的位置，计算该页起始行 */
    private int offset;

    /** 设定要获取最大记录的位置  */
    private  int maxResult = 10;

    private int pageRangeSize =  Constants.DEFAULT_PAGE_RANGE_SIZE;


    // 当前区域所包含的页码
    private int[] currentRangePages;


    /**
     * 默认构造函数
     */
    public BasePaginator() {
        setPageSize(Constants.DEFAULT_PAGE_SIZE);
        setPageRangeSize(Constants.DEFAULT_PAGE_RANGE_SIZE);
    }

    /**
     * 带页面大小的构造函数
     * @param pageSize
     */
    public BasePaginator(int pageSize) {
        setPageSize(pageSize);
        setPageRangeSize( Constants.DEFAULT_PAGE_RANGE_SIZE);
    }

    public BasePaginator(int pageSize,int pageRangeSize) {
        setPageSize(pageSize);
        setPageRangeSize( pageRangeSize);
    }

    /**
     * 获取任一页第一条数据在数据库中的位置
     */
    protected static int getStartOfPage(int pageNo, int pageSize) {
        int startIndex = ((pageNo - 1) > 0 ? pageNo - 1 : 0) * pageSize;
        return startIndex;
    }

    public void setTotalRowsAmount(int i) {
        totalRowsAmount = i;
        // 用于临时记录当前页面的页码
        int tmpCurrentPage;
        if (i > 0) {
            // 计算页码
            totalPages = totalRowsAmount % pageSize == 0 ? totalRowsAmount
                    / pageSize : totalRowsAmount / pageSize + 1;
            // 设置当前页
            tmpCurrentPage = currentPage > 1 && currentPage > totalPages ? totalPages
                    : currentPage;
            // 必须通过Set方法保证相关数据的更改
            setCurrentPage(tmpCurrentPage);
        }
    }

    /**
     * 设置当前页
     */
    public void setCurrentPage(int currentPageNumber) {
        currentPage = currentPageNumber;

        offset = getStartOfPage(currentPageNumber, pageSize);
        // rowLength = pageSize;
        if (totalPages > pageRangeSize) {
            int center = pageRangeSize / 2;
            if (currentPage > (center + 1)) {
                int y = totalPages - currentPage;
                if (y > center) {
                    currentRangePages = new int[pageRangeSize];
                    for (int j = 0; j < currentRangePages.length; j++) {
                        currentRangePages[j] = currentPage - center + j;
                    }
                } else {
                    currentRangePages = new int[center + 1 + y];
                    for (int j = 0; j < currentRangePages.length; j++) {
                        currentRangePages[j] = currentPage - center + j;
                    }
                }
            } else {
                currentRangePages = new int[pageRangeSize];
                for (int j = 0; j < currentRangePages.length; j++) {
                    currentRangePages[j] = j + 1;
                }
            }
        } else {
            // 剩余的页数
            currentRangePages = new int[totalPages];
            for (int j = 0; j < currentRangePages.length; j++) {
                currentRangePages[j] = j + 1;
            }
        }
        if(currentPage>0){
            maxResult = currentPage*pageSize;
        }
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public int getMaxResult() {
        return maxResult;
    }

    public boolean isHasNext() {
        return currentPage < totalPages;
    }

    public boolean isHasPrevious() {
        return totalPages > 1;
    }

    public int getNextPage() {
        return currentPage + 1;
    }

    public int getPageSize() {
        return pageSize;
    }

    public int getPreviousPage() {
        return currentPage - 1;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public int getTotalRowsAmount() {
        return totalRowsAmount;
    }

    public void setPageSize(int i) {
        pageSize = i;
    }

    public void setTotalPages(int i) {
        totalPages = i;
    }

    public int getOffset() {
        return offset;
    }

    public int[] getCurrentRangePages() {
        return currentRangePages;
    }

    public int getPageRangeSize() {
        return pageRangeSize;
    }

    public void setCurrentRangePages(int[] i) {
        currentRangePages = i;
    }

    public void setPageRangeSize(int i) {
        pageRangeSize = i;
    }

    public void setMaxResult(int maxResult) {
        this.maxResult = maxResult;
    }

    public String getDescription() {
        return null;
    }

}
