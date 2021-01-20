package com.example.orthocare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpGum {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> plaque = new ArrayList<String>();
        plaque.add("Dental plaque is a sticky, colorless or pale yellow film that is constantly forming on your teeth. When saliva, " +
                "food and fluids combine, plaque - which contains bacteria - forms between your teeth and along the gum line.");

        List<String> calculus = new ArrayList<String>();
        calculus.add("Teeth tartar, also called dental calculus, is a crusty deposit that can trap stains on the teeth and cause discoloration. " +
                "It creates a strong bond that can only be removed by a dental professional. " +
                "Tartar formation may also make it more difficult to remove new plaque and bacteria. " +
                "Individuals vary greatly in their susceptibility to plaque and tartar on teeth. " +
                "For many of us, these deposits build up faster as we age.");

        List<String> gingivitis = new ArrayList<String>();
        gingivitis.add("Gingivitis is a common and mild form of gum disease (periodontal disease) that causes irritation, " +
                "redness and swelling (inflammation) of your gingiva, the part of your gum around the base of your teeth.\n\n" +
                "Gingivitis is a form of gum disease that happens when plaque, a naturally-occurring sticky film containing bacteria, " +
                "builds up on teeth and causes the inflammation of the surrounding gum tissue. " +
                "Plaque produces toxins that irritate the gums.");

        List<String> periodontitis = new ArrayList<String>();
        periodontitis.add("Periodontitis (per-e-o-don-TIE-tis), also called gum disease, " +
                "is a serious gum infection that damages the soft tissue and, without treatment, " +
                "can destroy the bone that supports your teeth. " +
                "Periodontitis can cause teeth to loosen or lead to tooth loss. " +
                "Periodontitis is common but largely preventable.");

        List<String> prevent = new ArrayList<String>();
        prevent.add("Periodontitis (per-e-o-don-TIE-tis), also called gum disease, " +
                "is a serious gum infection that damages the soft tissue and, without treatment, " +
                "can destroy the bone that supports your teeth. " +
                "Periodontitis can cause teeth to loosen or lead to tooth loss. " +
                "Periodontitis is common but largely preventable.");


        expandableListDetail.put("What is dental Plaque?", plaque);
        expandableListDetail.put("What is Calculus?", calculus);
        expandableListDetail.put("What is Gingivitis?", gingivitis);
        expandableListDetail.put("What is Periodontitis?", periodontitis);
        expandableListDetail.put("How can you help prevent a Gum Diesease?", prevent);
        return expandableListDetail;
    }
}
