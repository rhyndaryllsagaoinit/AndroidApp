package com.example.orthocare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpWear {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> wear = new ArrayList<String>();
        wear.add("Tooth wear is a natural, dynamic, and inevitable process that consists in the gradual " +
                "loss of dental hard tissue expressed in the alteration of crown surface morphology\n\n" +
                "Tooth wear is a very common condition that occurs in approximately 97% of the population.");

        List<String> cause = new ArrayList<String>();
        cause.add("Tooth wear is majorly the result of three processes; attrition, abrasion and erosion." +
                "These forms of tooth wear can further lead to a condition known as abfraction, " +
                "where by tooth tissue is 'fractured' due to stress lesions caused by extrinsic forces on the enamel. " +
                "Tooth wear is a complex, multi-factorial problem and there is difficulty identifying a single causative factor.\n\n" +
                "•Attrition. Attrition is loss of tooth substance caused by physical tooth-to-tooth contact." +
                " The word attrition is derived from the Latin verb attritium, which refers to the action of rubbing against something. " +
                "Attrition mostly causes wear of the incisal and occlusal surfaces of the teeth. Attrition has been associated with masticatory force and " +
                "parafunctional activity" +
                " such as bruxism. A degree of attrition is normal, especially in elderly individuals.\n\n" +
                "•Abrasion. Abrasion is loss of tooth substance caused by physical means other than teeth." +
                " The term is derived from the Latin verb abrasum, which means ‘to scrape off’." +
                "It tends to present as rounded ditching around the cervical margins of teeth, commonly described as ‘shallow’, concave or wedge shaped notches. " +
                "Causative factors have been linked to this condition and include vigorous, horizontal tooth brushing, using toothpaste with a " +
                "too high RDA value, pipe smoking or nail biting. It has also been shown that improper use of dental floss or Toothpicks " +
                "can lead to wear on the interproximal (in-between) surfaces of the teeth.\n\n" +
                "•Erosion. Erosion is chemical dissolution of tooth substance caused by acids, unrelated to the acid produced by bacteria in dental plaque." +
                "  Erosion may occur with excessive consumption of acidic foods and drinks, or medical conditions involving repeated regurgitation and reflux of gastric acid. " +
                "Derived from the Latin word erosum, which describes the action ‘to corrode’. " +
                "his is usually on the palatal (inside) surfaces of upper front teeth and the occluding (top) surfaces of the molar teeth. " +
                "Dental erosion is rarely seen in the archaeological record, but certain cases have been described suggesting acidic fruits and/or plants were regularly consumed.\n\n" +
                "•Abfraction. Abfraction is loss of tooth substance at the cervical margins, purportedly caused by minute flexure of teeth under occlusal loading. " +
                "The term is derived from the Latin words ab and functio meaning ‘away’ and ‘breaking’ respectively." +
                " Abfraction presents as triangular lesions along the cervical margins of the buccal surfaces of the teeth where the enamel is thinner and therefore, in the presence of occluding forces, is prone to fracture. " +
                "Whether abfraction exists or not is debated.");

        List<String> prevent = new ArrayList<String>();
        prevent.add("Preventing tooth wear is not the same as preventing caries. " +
                "Dental caries is regarded as a disease that will affect most people in the world to some extent during their lifetime. " +
                "This inevitability of caries developing, at least historically, " +
                "was a strong stimulus to the development and promotion of preventive measures, " +
                "especially those based on fluoride use and oral hygiene. Developed countries have experienced, by and large, " +
                "higher prevalences of caries than less developed countries and their need for preventive measures has, therefore, been greater. " +
                "Well-structured prevention programmes based on fluoride, " +
                "organised dental examinations and regular recall and even financially subsidised treatments have become available that not only protect " +
                "non-diseased teeth but also reduce the cariogenic challenge by removing the diseased tissue.");

        List<String> treat = new ArrayList<String>();
        treat.add("A number of materials/restorations are commonly used for the treatment of cases presenting with tooth wear (TW). " +
                "According to Poyser et al. the position within the dental arch of each worn tooth and the quantity of remaining tooth tissue will determine the most appropriate form of restoration. " +
                "While conventional restorations have been used historically, such as conventional cast gold onlays, partial and full veneer crowns or " +
                "metallo-ceramic crowns, with advances in adhesive dentistry a number of other options have become available, including:\n\n" +
                "•Direct composite resin restorations\n" +
                "\n" +
                "•Indirect composite resin restorations\n" +
                "\n" +
                "•Cast adhesive alloys (metal palatal veneers and metal adhesive onlays)\n" +
                "\n" +
                "•Adhesive ceramic restorations.");

        expandableListDetail.put("What is Tooth Wear", wear);
        expandableListDetail.put("What causes Tooth Wear?", cause);
        expandableListDetail.put("How can you help prevent Tooth Wear?", prevent);
        expandableListDetail.put("How can you help treat Tooth Wear?", treat);
        return expandableListDetail;
    }
}
