package com.linkedin.javacodechallenges;

import java.util.Collection;
import java.util.Optional;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class StoreItem {
  String name;
  double retailPrice;
  double discount;

  public static Optional<StoreItem> findLeastExpensive(Collection<StoreItem> items) {
    if (items.isEmpty()) return Optional.empty();
    StoreItem currentLeast = null;
    for (StoreItem s : items) {
      if ((currentLeast == null)
          || ((currentLeast.getRetailPrice() * (1 - currentLeast.getDiscount())) > (s.getRetailPrice()
              * (1 - s.getDiscount())))) {
        currentLeast = s;
      }
    }
    return Optional.of(currentLeast);
  }

  @Override
  public String toString() {
    return "Name: " + name + ", " + "Retail price: " + retailPrice + ", " + "Discount " + discount;
  }
}