package com.tut;

import jakarta.persistence.*;

import java.util.Arrays;
import java.util.Date;

@Entity
@Table(name="student_address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="address_id")
    private int addressId;
    @Column(length = 50,name = "STREET")
    private String city;
    @Column(length = 100,name="CITY")
    private String Street;
    @Column(name="is_open")
    private boolean isOpen;
    @Transient
    private double x;
    @Column(name="added_date")
    @Temporal(TemporalType.DATE)
    private Date addedDate;
    @Lob
    private byte[] Image;

    public Address() {
        super();
    }
    public Address(int addressId, String city, String street, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.city = city;
        Street = street;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        Image = image;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public void setImage(byte[] image) {
        Image = image;
    }

/*    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", Street='" + Street + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", Image=" + Arrays.toString(Image) +
                '}';*/
    }
//}
