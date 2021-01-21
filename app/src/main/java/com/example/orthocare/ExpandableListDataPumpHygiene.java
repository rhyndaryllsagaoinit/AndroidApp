package com.example.orthocare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpHygiene {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> what = new ArrayList<String>();
        what.add("Welcome to this new temporary " +
                "section we have created with the " +
                "help of Digimax in response to this " +
                "lockdown and COVID-19 outbreak. " +
                "NHS England and the Department of " +
                "Health have advised all elective dental treatment will need to be postponed until further notice to help reduce the risk of spreading COVID-1 9. Dental " +
                "practices across the UK can only provide telephone help/advice for patients with " +
                "dental problems. This new section is created to demonstrate what you can do " +
                "at home to manage short term dental pain and to inform you about when you should seek urgent dental treatment.\n\n" +
                "The purpose of this dental app is to provide a helpful guide on how to protect your teeth at home and prevent dental problems. In this current " +
                "situation with limited access to seeing a dental professional, it is vitally important now more than ever before that you know how to look after your " +
                "oral health and avoid dental problems. So in light of this, we hope that you take the time to read all the sections " +
                "you find relevant which can help you protect your teeth.");

        List<String> seek = new ArrayList<String>();
        seek.add("Below is a list of reasons when you should seek urgent dental care:\n\n" +
                "•Facial swelling extending to the eye or neck or floor of the mouth.\n\n" +
                "•Bleeding following an extraction that does not stop after 20 mins of solid pressure with a piece of gauze/handkerchief.\n\n" +
                "•Bleeding due to trauma.\n\n" +
                "•Severely broken tooth or a tooth has fallen out with pain.\n\n" +
                "•Toothache that is preventing sleep, eating combined with swelling or fever that is not manageable with painkillers.");

        List<String> need = new ArrayList<String>();
        need.add("You should go straight to A and E if you have:\n\n" +
                "•Facial swelling affecting your vision, breathing or preventing your mouth opening more than two fingers width.\n\n" +
                "•Trauma causing loss of consciousness, double vision or vomiting.");

        List<String> considered = new ArrayList<String>();
        considered.add("Unfortunately, you may need to wait until your local dental practise re-opens for the following dental issues:" +
                "•Loose or lost crowns, bridges or veneers.\n\n" +
                "•Broken, rubbing or loose dentures.\n\n" +
                "•Bleeding gums\n\n" +
                "•Broken, loose or lost fillings.\n\n" +
                "•Chipped teeth with no pain.\n\n" +
                "•Loose orthodontic wires.");

        List<String> manage = new ArrayList<String>();
        manage.add("Over-the-counter painkillers can help (take in accordance with instructions on the packet.\n\n" +
                "Patients who have confirmed COVID-19, or believe they have COVID-19, should take paracetamol in preference to ibuprofen.");

        List<String> sensitivity = new ArrayList<String>();
        sensitivity.add("If you have extreme sensitivity to hot or cold then a sensitive toothpaste such as Sensodyne or Colgate Sensitive" +
                " Pro-Relief can help. Rub the toothpaste directly on the affected area and do not rinse your mouth with water or use mouthwash " +
                "afterwards. The longer the toothpaste is directly on the surface of your tooth, the more time it has to work.");



        expandableListDetail.put("Introduction - new temporary section for guidance during this Covid-19 outbreak:", what);
        expandableListDetail.put("What do you need to seek urgent dental treatment? (during lockdown)" , seek);
        expandableListDetail.put("When do you need to go straight to A&E? (during lockdown)" , need);
        expandableListDetail.put("What is considered non-urgent dental care? (during lockdown)" , considered);
        expandableListDetail.put("How can you manage dental pain at home (during lockdown)" , manage);
        expandableListDetail.put("What can you do if you have tooth sensitivity? (during lockdown)" , sensitivity);
        return expandableListDetail;
    }
}
