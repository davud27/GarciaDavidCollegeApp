public enum Settings {
    MAX_COURSE_SIZE(200),
    MAX_SECTION_SIZE(1000),
    MAX_STUDENT_SIZE(10000),
    MAX_MAJORS(4);

    private int maxSize;

    Settings(int maxSize) {
        this.maxSize = maxSize;
    }
    public void setMaxSize(int maxSize){
        this.maxSize = maxSize;
    }

    public int getMaxSize(){
        return maxSize;
    }
}
