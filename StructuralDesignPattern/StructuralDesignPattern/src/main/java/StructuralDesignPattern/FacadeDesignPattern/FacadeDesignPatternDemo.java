/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDesignPattern.FacadeDesignPattern;

/**
 *
 * @author simchu
 */
class TravelFacade{
    private TrainBooking train;
    private HotelBooking hotel;
    private FlightBooking flight;
    enum BookingType{
      Flight,Train,Hotel,Train_And_Hotel,Flight_And_Hotel ; 
    };
    public TravelFacade() {
        this.train = new TrainBooking();
        this.hotel = new HotelBooking();
        this.flight = new FlightBooking();
    }
    public void book(BookingType type,String name){
        switch(type){
            case Flight:
                flight.bookFlight(name);
                return;
            case Train:
                train.bookTrain(name);
                return;
            case Hotel:
                hotel.bookHotel(name);
                return;
            case Train_And_Hotel:
                train.bookTrain(name);
                hotel.bookHotel(name);
                return;
            case Flight_And_Hotel:
                flight.bookFlight(name);
                hotel.bookHotel(name);
                return;
        }
    }
    
}
class FlightBooking{
    public void bookFlight(String name){
        System.out.println("Flight Booked for: "+name);
    }
}
class TrainBooking{
    public void bookTrain(String name){
        System.out.println("Train Booked for: "+name);
    }
}
class HotelBooking{
    public void bookHotel(String name){
        System.out.println("Hotel Booked for "+name);
    }
}
public class FacadeDesignPatternDemo {
 public static void main(String[] args){
     TravelFacade facade = new TravelFacade();
     facade.book(TravelFacade.BookingType.Train, "Lalit");
     facade.book(TravelFacade.BookingType.Flight_And_Hotel, "Lait");
 }   
}
