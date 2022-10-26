/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.thogakade.model;

import java.util.Date;

/**
 *
 * @author DELL
 */
public class BookingCustomer {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String trainFrom;
    private String trainTo;
    private String time;
    private String train;
    private String seatNo;
    private String trainClass;
    private String price;
    private Date Date;

    public BookingCustomer() {
    }

    public BookingCustomer(String id, String name, String address, String contact, String trainFrom, String trainTo, String time, String train, String seatNo, String trainClass, String price, Date Date) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.contact = contact;
        this.trainFrom = trainFrom;
        this.trainTo = trainTo;
        this.time = time;
        this.train = train;
        this.seatNo = seatNo;
        this.trainClass = trainClass;
        this.price = price;
        this.Date = Date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTrainFrom() {
        return trainFrom;
    }

    public void setTrainFrom(String trainFrom) {
        this.trainFrom = trainFrom;
    }

    public String getTrainTo() {
        return trainTo;
    }

    public void setTrainTo(String trainTo) {
        this.trainTo = trainTo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTrain() {
        return train;
    }

    public void setTrain(String train) {
        this.train = train;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getTrainClass() {
        return trainClass;
    }

    public void setTrainClass(String trainClass) {
        this.trainClass = trainClass;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Date getDate() {
        return Date;
    }

    public void setDate(Date Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "BookingCustomer{" + "id=" + id + ", name=" + name + ", address=" + address + ", contact=" + contact + ", trainFrom=" + trainFrom + ", trainTo=" + trainTo + ", time=" + time + ", train=" + train + ", seatNo=" + seatNo + ", trainClass=" + trainClass + ", price=" + price + ", Date=" + Date + '}';
    }
    
    
}
