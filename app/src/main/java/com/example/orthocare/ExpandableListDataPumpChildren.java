package com.example.orthocare;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPumpChildren {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> when = new ArrayList<String>();
        when.add("•Cleaning and brushing teeth removes plaque (the build-up on teeth) that causes tooth decay.\n" +
                "•You can start cleaning your baby’s teeth by wiping with a soft cloth or brushing with a small soft toothbrush and water.\n\n" +
                "•At 18 months start using a pea sized amount of low-fluoride toothpaste to brush your child’s teeth. Encourage your child to spit out toothpaste after brushing, but not rinse.\n\n" +
                "•Clean all surfaces of the teeth and gums twice a day (after breakfast and before bed).\n\n" +
                "•Children will need an adult to help them brush their teeth until about 7 or 8 years of age.");

        List<String> much = new ArrayList<String>();
        much.add("You may stick to the “pea-sized rule” when it comes to measuring out your own toothpaste, " +
                "but do you know what guidelines children should use? There’s a good chance your child is using too much. " +
                "In fact, nearly 40% of children ages 3 to 6 use too much toothpaste, according to a 2019 study by the Centers for Disease Control and Prevention.");

        List<String> visit = new ArrayList<String>();
        visit.add("Childrens should have an oral assessment by 2 years of age.\n\n" +
                "•The first oral health assessment can be provided by a Dentist or other Oral Health Professional, Maternal and Child Health Nurse or Doctor.\n\n" +
                "•Having regular check-ups can help to spot problems early. Early stages of tooth decay can be treated.\n\n" +
                "•Find out more about free or low-cost public dental services available to children.");

        List<String> baby = new ArrayList<String>();
        baby.add("Baby teeth are very important to your child’s health and development. " +
                "They help him or her chew, speak and smile. " +
                "They also hold space in the jaws for permanent teeth that are growing under the gums. " +
                "When a baby tooth is lost too early, the permanent teeth can drift into the empty space and make it difficult for other adult teeth to find room when they come in. " +
                "This can make teeth crooked or crowded. " +
                "That’s why starting infants off with good oral care can help protect their teeth for decades to come.");

        List<String> come = new ArrayList<String>();
        come.add("A baby’s 20 primary teeth are already present in the jaws at birth and typically begin to appear when a baby is between 6 months and 1 year." +
                "Most children have a full set of 20 primary teeth by the time they are 3. " +
                "Check out this baby teeth eruption chart to see the order in which teeth break through and at what ages you can expect specific teeth to appear. " +
                "Every child is different, but usually the first teeth to come in are located in the top and bottom front of their mouth.\n\n" +
                "When teeth first come in, some babies may have sore or tender gums. " +
                "Gently rubbing your child's gums with a clean finger, a small, cool spoon or a wet gauze pad can be soothing. " +
                "You can also give the baby a clean teething ring to chew on. " +
                "If your child is still cranky and in pain, consult your dentist or physician.");

        List<String> care = new ArrayList<String>();
        care.add("It’s important to care for your baby’s teeth from the start. Here's what to do:\n" +
                "\n" +
                "•Begin cleaning your baby’s mouth during the first few days after birth by wiping the gums with a clean, moist gauze pad or washcloth. " +
                "As soon as teeth appear, decay can occur. A baby’s front four teeth usually push through the gums at about 6 months of age, " +
                "although some children don’t have their first tooth until 12 or 14 months.\n\n" +
                "•For children younger than 3 years, " +
                "start brushing their teeth as soon as they begin to come into the mouth by using fluoride " +
                "toothpaste in an amount no more than a smear or the size of a grain of rice. Brush teeth thoroughly twice per day " +
                "(morning and night) or as directed by a dentist or physician. " +
                "Supervise children’s brushing to ensure that they use of the appropriate amount of toothpaste.\n\n" +
                "•For children 3 to 6 years of age, use a pea-sized amount of fluoride toothpaste. " +
                "Brush teeth thoroughly twice per day (morning and night) or as directed by a dentist or physician. " +
                "Supervise children’s brushing and remind them not to swallow the toothpaste.\n\n" +
                "•Until you’re comfortable that your child can brush on his or her own, " +
                "continue to brush your child's teeth twice a day with a child-size toothbrush and a pea-sized amount of fluoride toothpaste. " +
                "When your child has two teeth that touch, you should begin cleaning between their teeth daily.");


        expandableListDetail.put("When should you start to brush your Children's Teeth?", when);
        expandableListDetail.put("How much toothpaste should my child be using?", much);
        expandableListDetail.put("When should your child start to visit the dentist?", visit);
        expandableListDetail.put("Why are baby teeth important?", baby);
        expandableListDetail.put("When do baby teeth come in?", come);
        expandableListDetail.put("How to care your childs teeth?", care);

        return expandableListDetail;
    }
}
