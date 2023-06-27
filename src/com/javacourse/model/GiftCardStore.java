package com.javacourse.model;

import com.javacourse.model.GiftCard;

import java.util.ArrayList;
import java.util.List;

public class GiftCardStore {
        private List<GiftCard> giftCards;

        public GiftCardStore() {
            giftCards = new ArrayList<>();
        }

        public void addGiftCard(GiftCard giftCard) {
            giftCards.add(giftCard);
        }

        public List<GiftCard> getGiftCards() {
            return giftCards;
        }

        public GiftCard findGiftCardById(int id) {
            for (GiftCard giftCard : giftCards) {
                if (giftCard.getId() == id) {
                    return giftCard;
                }
            }
            return null;
        }

        public void redeemGiftCard(int id, double amount) {
            GiftCard giftCard = findGiftCardById(id);
            if (giftCard != null) {
                giftCard.redeem(amount);
            }
        }
}
