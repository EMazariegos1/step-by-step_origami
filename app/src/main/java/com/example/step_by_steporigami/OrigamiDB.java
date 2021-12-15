package com.example.step_by_steporigami;

public class OrigamiDB {
    public static final String[] names = {
            "Pigeon",
            "Penguin",
            "Fox"
    };
    public static final int[] images = {
            R.drawable.origami_bird,
            R.drawable.origami_penguin,
            R.drawable.origami_fox
    };

    public static final int[][] instructions = {
            {R.drawable.bird_step1,
                    R.drawable.bird_step2,
                    R.drawable.bird_step3,
                    R.drawable.bird_step4,
                    R.drawable.bird_step5,
                    R.drawable.bird_step6,
                    R.drawable.bird_step7,
                    R.drawable.bird_step8,
                    R.drawable.bird_step9_part1,
                    R.drawable.bird_step9_part2,
                    R.drawable.bird_step10},
            {R.drawable.penguin_step1,
                    R.drawable.penguin_step2_part1,
                    R.drawable.penguin_step2_part2,
                    R.drawable.penguin_step3,
                    R.drawable.penguin_step4,
                    R.drawable.penguin_step5_part1,
                    R.drawable.penguin_step5_part2,
                    R.drawable.penguin_step6,
                    R.drawable.penguin_step7_part1,
                    R.drawable.penguin_step7_part2,
                    R.drawable.penguin_step8,
                    R.drawable.penguin_step9},
            {R.drawable.fox_step1,
                    R.drawable.fox_step2,
                    R.drawable.fox_step3_part1,
                    R.drawable.fox_step3_part2,
                    R.drawable.fox_step4_part1,
                    R.drawable.fox_step4_part2,
                    R.drawable.fox_step5_part1,
                    R.drawable.origami_fox}
    };

    public static final String[][] descriptions = {
            {"Step 1: Start with a square piece of origami paper.",
                    "Step 2: Fold the paper in half by folding the top corner to the bottom corner. You should have an upside down triangle.",
                    "Step 3: Fold part of the top down so that the edge is about halfway down. Don't make this flap too thin because this will become the wings.",
                    "Step 4: Turn the paper over.",
                    "Step 5: Take the bottom corner of the top layer and fold it up like this.",
                    "Step 6: Fold the figure in half by folding the left side over to the right.",
                    "Step 7: Now fold that same flap back like this to make one of the wings.",
                    "Step 8: Fold the other wing back also.",
                    "Step 9: Push the center of the head in and flatten. This is called an inside reverse fold.",
                    "Step 10: This is how it should look.",
                    "Step 11: And tada! You have yourself a bird. Now set it free! Just kidding. Don't throw it in the air. It will just fall down and you'll be disappointed."},
            {"Step 1: Start with a square piece of origami paper",
                    "Step 2: Let's create a crease in the center to use as a guideline fold the paper in half",
            "Step 3: Then unfold it",
            "Step 4: Fold the bottom corner up like this",
            "Step 5: Turn the paper over",
            "Step 6: Fold in the left side like this",
            "Step 7: Then fold in the right side like this",
            "Step 8: Fold the top point down like this. This will be the head",
            "Step 9: Fold the penguin in half by raising the center crease up and folding the sides back. This is called a mountain fold.",
            "Step 10: This is how it should look",
            "Step 11: Pull the beak out and flatten the back of the head like this.",
            "Step 12: You are done with your origami penguin"},
            {"Step 1: Start with a square piece of origami paper",
            "Step 2: Fold paper in half by folding the top corner to the bottom corner.",
            "Step 3: Let's make a line in the center. Fold in half again by folding left corner to right corner",
            "Step 4: Then unfold",
            "Step 5: Fold the left and right triangle edges toward the center, but not all the way to the center.",
            "Step 6: This is how it should look",
            "Step 7: Turn the figure over and Draw on the face if you like",
            "Step 8: You are done with your origami fox"}
    };
}
