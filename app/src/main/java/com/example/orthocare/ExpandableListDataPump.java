package com.example.orthocare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> intro = new ArrayList<String>();
        intro.add("Your diet can greatly affect the health of your teeth. " +
                "This is why it is important to understand how small dietary changes can significantly help to prevent tooth decay and acid erosion. " +
                "\n\nThis section will primarily focus on how dietary sugars affect teeth and can lead to tooth decay." +
                " Therefore, it might be helpful to read the Tooth Decay section beforehand. Remember that sugar from your diet " +
                "is broken down by bacteria in your mouth, which results in the production of acids and leads to tooth decay.");

        List<String> affect = new ArrayList<String>();
        affect.add("We all know that our diet is impactful on the health of our bodies, " +
                "but did you know that your diet can affect your teeth as well? " +
                "It’s true! There are certain foods that benefit the health of your teeth, " +
                "and others that degrade their physical condition. Some may be obvious, like sodas and candy, " +
                "but others are often less apparent." +
                "\n\nEvery food or beverage you consume comes into contact with your teeth, meaning that those foods will " +
                "impact the health of your teeth and gums. " +
                "How exactly does that work? We’ve compiled a guide to " +
                "explain food’s impact on your oral health." +
                "\n\nDid you know that the benefits of straight teeth extend much further than simply building " +
                "your confidence? They can have a significant impact on your overall dental health as well. " +
                "Try Impressions invisible aligners to straighten your teeth for 50% less than traditional orthodontics like braces.");

        List<String> food = new ArrayList<String>();
        food.add("Below is a list of foods and drinks released by Public Health England, which contain high amounts of sugar and can cause tooth decay." +
                "The point of showing you this list isn't to say you can never have these items in your diet. However, it is so you can plan your diet accordingly." +
                " It is all about balance and if you can take on some of the tips mentioned in the next question and limit these high sugary foods then hopefully you can" +
                " still enjoy your cake and remain tooth decay free!" +
                "\n\nThese items should really be limited in your diet:" +
                "\n\n•Sugary soft drinks" +
                "\n•Sugar and chocolate confectionery\n•Cakes and biscuits\n•Buns, pastries, fruit pies\n•Sponge puddings and other puddings" +
                "\n•Table sugar\n•Breakfast cereal\n•Jams, preserves, honey\n•Ice cream and sorbet" +
                "\n•Fruit in syrup or canned in juice\n•Fresh fruit juices\n•Sugared, milk-based beverages" +
                "\n•Sugar-containing alcoholic drinks\n•Dried fruits\n•Syrups and sweet sauces ");

        expandableListDetail.put("Introduction", intro);
        expandableListDetail.put("How Does Diet Affect Your Teeth?", affect);
        expandableListDetail.put("Which Foods And Drinks Are Bad For My Teeth?", food);
        return expandableListDetail;
    }
}
