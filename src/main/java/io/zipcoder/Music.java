package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        int countUp = 0;
        int countBack = 0;
        for (int i = startIndex; i < playList.length; i++) {
            if (playList[i] == selection) break;
            else countUp++;
        }
        for (int i = startIndex; i < playList.length; i--) {
            if (playList[i] == selection) break;
            else countBack++;
            if (i == 0) i = playList.length;
        }
        if (countBack < countUp && countBack >= 0) return countBack;
        else return countUp;
    }
}
