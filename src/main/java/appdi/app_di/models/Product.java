package appdi.app_di.models;

public class Product implements Cloneable{
    private Long id;
    private String name;
    private Long prices;
    
    public Product(){

    }

    public Product(Long id, String name, Long prices) {
        this.id = id;
        this.name = name;
        this.prices = prices;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrices() {
        return prices;
    }

    public void setPrices(Long prices) {
        this.prices = prices;
    }

    
    public Object clone() {
        
        try{
            return super.clone();
        }catch(CloneNotSupportedException e){
            return new Product(this.id,this.name,this.prices);
        }
    }
    

}
