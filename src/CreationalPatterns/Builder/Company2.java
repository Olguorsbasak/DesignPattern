package CreationalPatterns.Builder;

public class Company2 {
	private String name, phone, address;

    public Company2(Builder builder) {
        this.name = builder.name;
        this.phone = builder.phone;
        this.address = builder.address;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public static class Builder{

        private String name, phone, address;

        public Builder(){ }

        public Builder name(String name){
            this.name = name;
            return this;
        }
        
        public Builder phone(String phone){
            this.phone = phone;
            return this;
        }
        
        public Builder address(String address){
            this.address = address;
            return this;
        }

        public Company2 build(){
            return new Company2(this);
        }
/* Company sınıfı içinde static bir inner class
 *var ve bunun üstünden asıl nesne oluşturulur.
 *Nesne oluştururken yalnızca istenilen alanlar ile 
 *birlikte oluşturabilir.Tuğlaları tek tek dizmek
 *olarak düşünülebilir.
 * 
 * 
 * 
 * 
 */
    }
}
