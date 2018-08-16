package com.capgemini.merchantstore.beans;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.databind.annotation.JacksonStdImpl;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int productId;
	private String productName;
	private String productDesc;
	private String productImageURL;
	private String productBannerURL;
	private double productPrice;
	private int productQuantityAvailable;
//	@OneToMany(mappedBy="product", cascade=CascadeType.ALL)
	//private List<Review> review = new ArrayList<Review>();
//	@OneToOne(cascade=CascadeType.ALL)
//	@JoinColumn(name = "discountId")
	//private Discount discount;
	
	private long productViews;
	private long productTimesBought;
	private boolean productStatus;
	private Date deliveryDate;
//	@ManyToOne
//	@JoinColumn(name="wishListId")
	//private Wishlist wishlist;
	
	@ManyToMany
	@JoinColumn(name="merchantId")
	private List<Merchant> merchant = new ArrayList<Merchant>();
	
	private Date productAddedDate;
	private String brand;
	private Date productRemovedDate;
//	@ManyToOne
//	@JoinColumn(name="cartId")
	//private Cart cart;
//	@ManyToOne
//	@JoinColumn(name="orderId")
//	private Orders order;
//	@ManyToOne
//	@JoinColumn(name="inventoryId")
//	private Inventory inventory;
//	@ManyToOne
//	@JoinColumn(name="categoryId")
//	private Category category;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductImageURL() {
		return productImageURL;
	}
	public void setProductImageURL(String productImageURL) {
		this.productImageURL = productImageURL;
	}
	public String getProductBannerURL() {
		return productBannerURL;
	}
	public void setProductBannerURL(String productBannerURL) {
		this.productBannerURL = productBannerURL;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantityAvailable() {
		return productQuantityAvailable;
	}
	public void setProductQuantityAvailable(int productQuantityAvailable) {
		this.productQuantityAvailable = productQuantityAvailable;
	}
	public long getProductViews() {
		return productViews;
	}
	public void setProductViews(long productViews) {
		this.productViews = productViews;
	}
	public long getProductTimesBought() {
		return productTimesBought;
	}
	public void setProductTimesBought(long productTimesBought) {
		this.productTimesBought = productTimesBought;
	}
	public boolean isProductStatus() {
		return productStatus;
	}
	public void setProductStatus(boolean productStatus) {
		this.productStatus = productStatus;
	}
	public Date getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(Date deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Merchant> getMerchant() {
		return merchant;
	}
	public void setMerchant(List<Merchant> merchant) {
		this.merchant = merchant;
	}
	public Date getProductAddedDate() {
		return productAddedDate;
	}
	public void setProductAddedDate(Date productAddedDate) {
		this.productAddedDate = productAddedDate;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Date getProductRemovedDate() {
		return productRemovedDate;
	}
	public void setProductRemovedDate(Date productRemovedDate) {
		this.productRemovedDate = productRemovedDate;
	}
	public Product(int productId, String productName, String productDesc, String productImageURL,
			String productBannerURL, double productPrice, int productQuantityAvailable, long productViews,
			long productTimesBought, boolean productStatus, Date deliveryDate, List<Merchant> merchant,
			Date productAddedDate, String brand, Date productRemovedDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productImageURL = productImageURL;
		this.productBannerURL = productBannerURL;
		this.productPrice = productPrice;
		this.productQuantityAvailable = productQuantityAvailable;
		this.productViews = productViews;
		this.productTimesBought = productTimesBought;
		this.productStatus = productStatus;
		this.deliveryDate = deliveryDate;
		this.merchant = merchant;
		this.productAddedDate = productAddedDate;
		this.brand = brand;
		this.productRemovedDate = productRemovedDate;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productDesc=" + productDesc
				+ ", productImageURL=" + productImageURL + ", productBannerURL=" + productBannerURL + ", productPrice="
				+ productPrice + ", productQuantityAvailable=" + productQuantityAvailable + ", productViews="
				+ productViews + ", productTimesBought=" + productTimesBought + ", productStatus=" + productStatus
				+ ", deliveryDate=" + deliveryDate + ", merchant=" + merchant + ", productAddedDate=" + productAddedDate
				+ ", brand=" + brand + ", productRemovedDate=" + productRemovedDate + "]";
	}
	
	
	
}
