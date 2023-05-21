package pages;

public abstract class BasePage<ELEMENT_REPOSITORY extends BaseElementRepository> {

    protected ELEMENT_REPOSITORY elementRepository;

    public BasePage(ELEMENT_REPOSITORY elementRepository) {
        this.elementRepository = elementRepository;
    }
}
