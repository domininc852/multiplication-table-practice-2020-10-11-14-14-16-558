package com.tw;

public class MultiplicationTable {
    public String generateMultiplicationTableWithRange(int start, int end) {
        boolean isStartSmallerThanEnd = isStartSmallerThanEnd(start, end);
        boolean isStartAndEndValid = isStartAndEndValid(start, end);
        return isStartSmallerThanEnd && isStartAndEndValid?generateMultiplicationTable(start, end):null;

    }

    private boolean isStartSmallerThanEnd(int start, int end) {
        return  end >= start;
    }

    private boolean isStartAndEndValid(int start, int end) {
        return (start >= 1) && (start <= 1000) && (end >= 1) && (end <= 1000);

    }

    private String generateMultiplicationTable(int start, int end) {
        String multiplicationTable = "";
        for (int i = start; i <= end; i++) {
            multiplicationTable += generateMultiplicationLine(start, i);
            if (i != end) {
                multiplicationTable += "\r\n";
            }
        }
        return multiplicationTable;
    }

    private String generateMultiplicationLine(int start, int end) {
        String line = "";
        for (int i = start; i <= end; i++) {
            line += i + "*" + end + "=" + i * end;
            if (i != end) {
                line += "  ";
            }
        }
        return line;
    }

}
