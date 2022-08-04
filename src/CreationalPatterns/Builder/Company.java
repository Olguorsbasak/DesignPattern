package CreationalPatterns.Builder;

public class Company {

	private String name;
	private String phone;
	private String address;
	public Company(String name, String phone, String address) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return this.phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
/*Bu sıınıfı oluşturmak istediğimizde yapıcı metodunda 
 * 3 parametre gerekli olacaktır ama  hepsini 
 * kullanmayacaksa başka bir yapıcı method oluşturup 
 * istenilen  parametreleri o method da tanımlayıp da oluşturulur.
 * Bu sınıftan bir nesne oluşturmamız için 3 alanı da constructor 
 * içinde göndermemiz gerekmekte. Peki ya yalnızca name ve surname 
 * başta atama yapılacaksa, adres bilgisine gerek yoksa? ‘name’ ve 
 * ‘surname’ alanlarını parametre olarak alan ayrı bir constructor 
 * yazarak sorunu çözerdik. Peki ya bu gibi 10 tane alan olsa ve 
 * nesneyi oluştururken hangi alanların başta atanacağını bilmiyorsak? 
 * Her bir durum için constructor yazardık ancak bu içinden çıkılmaz 
 * bir hal alırdı. Builder Pattern bu gibi durumlara çözüm sunabiliyor. 
 * 
 */
}
