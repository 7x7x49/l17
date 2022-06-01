package com.company;

//Во всех фабричных паттернах проектирования есть две группы участников — создатели (сами фабрики) и продукты (объекты, создаваемые фабриками)

abstract class Transportation{
    String name;
    public String toString(){
        return "Delivery method: -> " + name;
                            }}

abstract  class TypesOfTransport{
    public abstract Transportation createTransport();
                                }
class TruckGo extends TypesOfTransport{         //Перевозки могут быть по дороге (класс грузовик)
    public Transportation createTransport(){
        return new Truck();                }
                                           }

class ShipGo extends TypesOfTransport{          //Перевозки могут быть по воде (класс суд)
    public Transportation createTransport(){
        return new Ship();                 }
                                          }

class AirplaneGo extends TypesOfTransport{     //Перевозки могут быть по воздуху (класс самолёт)
    public Transportation createTransport(){
        return new Airplane();             }  }

class Truck extends Transportation{
    public Truck(){
        name = "Delivery by truck";
                  }               }

class Ship extends Transportation{
    public Ship(){
        name = "Delivery by sea";
                 }               }

class Airplane extends Transportation{
    public Airplane(){
        name = "Delivery by sky";
                     }               }

public class Main{
    public static void main(String[] args){

        TypesOfTransport airplaneDelivery = new AirplaneGo();
        Transportation airDel = airplaneDelivery.createTransport();
        System.out.println(airDel);

        TypesOfTransport truckDelivery = new TruckGo();
        Transportation truckDel = truckDelivery.createTransport();
        System.out.println(truckDel);

        TypesOfTransport oceanDelivery = new ShipGo();
        Transportation oceanDel = oceanDelivery.createTransport();
        System.out.println(oceanDel);

                                          }
                 }