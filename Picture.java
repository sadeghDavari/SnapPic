package model;

public class Picture extends Group {
    private Group group;
    private int picID;
    private String name;
    private String path;
    private int Like;
    private int disLike;

    @Override
    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public int getPicID() {
        return picID;
    }

    public void setPicID(int picID) {
        this.picID = picID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public int getLike() {
        return Like;
    }

    public void setLike(int like) {
        Like = like;
    }

    public int getDisLike() {
        return disLike;
    }

    public void setDisLike(int disLike) {
        this.disLike = disLike;
    }
}
