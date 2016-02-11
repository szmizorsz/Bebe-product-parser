import java.util.HashSet;
import java.util.Set;

/**
 * Created by szabolcs on 11/02/16.
 */
public class ProductFieldDictionaries {

    private Set<String> sku_id_dictionary;

    private Set<String> class_dictionary;

    private Set<String> classname_dictionary;

    private Set<String> dept_dictionary;

    private Set<String> deptname_dictionary;

    private Set<String> color_dictionary;

    private Set<String> material_dictionary;

    private Set<String> color_name_dictionary;

    private Set<String> pattern_dictionary;

    private Set<String> size_dictionary;

    private Set<String> size_system_dictionary;

    private Set<String> size_type_dictionary;

    private Set<String> product_id_dictionary;

    private Set<String> name_dictionary;

    private Set<String> description_dictionary;

    private Set<String> gender_dictionary;

    private Set<String> brand_dictionary;

    private Set<String> product_category_dictionary;

    private Set<String> condition_dictionary;

    private Set<String> ticket_price_dictionary;

    private Set<String> current_pric_dictionary;

    public ProductFieldDictionaries() {

        sku_id_dictionary = new HashSet<String>();

        class_dictionary = new HashSet<String>();

        classname_dictionary = new HashSet<String>();

        dept_dictionary = new HashSet<String>();

        deptname_dictionary = new HashSet<String>();

        material_dictionary = new HashSet<String>();

        color_dictionary = new HashSet<String>();

        color_name_dictionary = new HashSet<String>();

        pattern_dictionary = new HashSet<String>();

        size_dictionary = new HashSet<String>();

        size_system_dictionary = new HashSet<String>();

        size_type_dictionary = new HashSet<String>();

        product_id_dictionary = new HashSet<String>();

        name_dictionary = new HashSet<String>();

        description_dictionary = new HashSet<String>();

        gender_dictionary = new HashSet<String>();

        brand_dictionary = new HashSet<String>();

        product_category_dictionary = new HashSet<String>();

        condition_dictionary = new HashSet<String>();

        ticket_price_dictionary = new HashSet<String>();

        current_pric_dictionary = new HashSet<String>();
    }

    public Set<String> getSku_id_dictionary() {
        return sku_id_dictionary;
    }

    public Set<String> getClass_dictionary() {
        return class_dictionary;
    }

    public Set<String> getClassname_dictionary() {
        return classname_dictionary;
    }

    public Set<String> getDept_dictionary() {
        return dept_dictionary;
    }

    public Set<String> getDeptname_dictionary() {
        return deptname_dictionary;
    }

    public Set<String> getColor_dictionary() {
        return color_dictionary;
    }

    public Set<String> getMaterial_dictionary() {
        return material_dictionary;
    }

    public Set<String> getColor_name_dictionary() {
        return color_name_dictionary;
    }

    public Set<String> getPattern_dictionary() {
        return pattern_dictionary;
    }

    public Set<String> getSize_dictionary() {
        return size_dictionary;
    }

    public Set<String> getSize_system_dictionary() {
        return size_system_dictionary;
    }

    public Set<String> getSize_type_dictionary() {
        return size_type_dictionary;
    }

    public Set<String> getProduct_id_dictionary() {
        return product_id_dictionary;
    }

    public Set<String> getName_dictionary() {
        return name_dictionary;
    }

    public Set<String> getDescription_dictionary() {
        return description_dictionary;
    }

    public Set<String> getGender_dictionary() {
        return gender_dictionary;
    }

    public Set<String> getBrand_dictionary() {
        return brand_dictionary;
    }

    public Set<String> getProduct_category_dictionary() {
        return product_category_dictionary;
    }

    public Set<String> getCondition_dictionary() {
        return condition_dictionary;
    }

    public Set<String> getTicket_price_dictionary() {
        return ticket_price_dictionary;
    }

    public Set<String> getCurrent_pric_dictionary() {
        return current_pric_dictionary;
    }

    public void DictionaryInformation() {
        System.out.println("SKU dictionary size: " + getSku_id_dictionary().size());
        System.out.println("Class dictionary size: " + getClass_dictionary().size());
        System.out.println("Classname dictionary size: " + getClassname_dictionary().size());
        System.out.println("Dept dictionary size: " + getDept_dictionary().size() + " values: " + getDept_dictionary());
        System.out.println("Deptname dictionary size: " + getDeptname_dictionary().size() + " values: " + getDeptname_dictionary());
        System.out.println("Color dictionary size: " + getColor_dictionary().size());
        System.out.println("Color name dictionary size: " + getColor_name_dictionary().size());
        System.out.println("Material dictionary size: " + getMaterial_dictionary().size());
        System.out.println("Pattern dictionary size: " + getPattern_dictionary().size());
        System.out.println("Size dictionary size: " + getSize_dictionary().size());
        System.out.println("Size system dictionary size: " + getSize_system_dictionary().size());
        System.out.println("Size type dictionary size: " + getSize_type_dictionary().size());
        System.out.println("Product id dictionary size: " + getProduct_id_dictionary().size());
        System.out.println("Name dictionary size: " + getName_dictionary().size());
        System.out.println("Product category size: " + getProduct_category_dictionary().size());
        System.out.println("Description dictionary size: " + getDescription_dictionary().size());
        System.out.println("Gender dictionary size: " + getGender_dictionary().size());
        System.out.println("Brand dictionary size: " + getBrand_dictionary().size());
        System.out.println("Condition dictionary size: " + getCondition_dictionary().size());
        System.out.println("Ticket price dictionary size: " + getTicket_price_dictionary().size());
        System.out.println("Current price dictionary size: " + getCurrent_pric_dictionary().size());

    }

}
