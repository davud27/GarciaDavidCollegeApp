public class SectionContainer {
    public static GenericBag<Section> sectionBag;
    public SectionContainer(){
        sectionBag = new GenericBag<>(Section.class,Settings.MAX_SECTION_SIZE.getMaxSize());
    }
    public void addSection(Section section){
        sectionBag.add(section);
        System.out.println("Section added: " + section);
    }
    public void displaySections() {
        System.out.println("Current Sections:");
        sectionBag.display();
    }
}
