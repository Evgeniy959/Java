package com.topacademy.springapp;

public class Transmission {
   private int numberTtransmissions;
   private String type;
   private float weight;
   private float price;

   public int getNumberTtransmissions() {
      return numberTtransmissions;
   }

   public String getType() {
      return type;
   }

   public float getWeight() {
      return weight;
   }

   public float getPrice() {
      return price;
   }

   public void setNumberTtransmissions(int numberTtransmissions) {
      this.numberTtransmissions = numberTtransmissions;
   }

   public void setType(String type) {
      this.type = type;
   }

   public void setWeight(float weight) {
      this.weight = weight;
   }

   public void setPrice(float price) {
      this.price = price;
   }
}
