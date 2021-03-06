package com.uliamar.restaurant.app.Bus;

import com.uliamar.restaurant.app.model.Dishe;
import com.uliamar.restaurant.app.model.User;
import com.uliamar.restaurant.app.model.Restaurant;

import java.util.List;

/**
 * Created by Pol on 07/05/14.
 */
public class OnRestaurantDatasReceivedEvent {
    Restaurant mR;
    List<Dishe> mDishes;
    List<User> mUsers;

    public OnRestaurantDatasReceivedEvent(Restaurant r, List<User> friends) {
        mR = r;
        mUsers = friends;
        mDishes = r.getDishes();
    }

    public Restaurant getRestaurant() {
        return mR;
    }


    public List<Dishe> getDishes() {
       // mDishes = mR.getDishes();
        return mDishes;
    }


    public List<User> getFriends() {
        return mUsers;
    }

}

