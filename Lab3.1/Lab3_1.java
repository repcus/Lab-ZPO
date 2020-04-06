import com.google.gson.*;
import java.util.*;
import java.io.*;
import javax.swing.*;

public class Lab3_1 {
    public static void main(String args[]){
        Gson dictionary = new Gson();
        try(Reader reader = new FileReader("src/dictionary.json")){
            Quiz[] key = dictionary.fromJson(reader, Quiz[].class);
            ArrayList<Integer> questions = new ArrayList<>();
            Random rand = new Random();
            for(int j = 0; j < 5; j++){
                int a = rand.nextInt(9) + 1;
                if(questions.contains(a)){
                    j--;
                }else{
                    questions.add(a);
                }
            }

            JPanel naming = new JPanel();
            JTextField name, surname;
            naming.add(new JLabel("Name:"));
            name = new JTextField(5);
            naming.add(name);
            naming.add(new JLabel("Surname:"));
            surname = new JTextField(5);
            naming.add(surname);
            JOptionPane.showConfirmDialog(null, naming,"English words test - insert your name", JOptionPane.DEFAULT_OPTION);

            BufferedWriter writer = new BufferedWriter(new FileWriter(name.getText().toLowerCase() + "_" + surname.getText().toLowerCase() + ".json"));

            String answer;
            double points = 0;
            double startTime = System.currentTimeMillis();

            JTextField[] qarr = new JTextField[5];
            for(int i = 0; i < 5; i++){
                qarr[i] = new JTextField(5);
            }
            JPanel questionsPanel = new JPanel();

            for(int i = 0; i < 5; i++){
                questionsPanel.add(new JLabel(key[questions.get(i)].getQuestion()));
                questionsPanel.add(qarr[i]);
                questionsPanel.add(Box.createHorizontalStrut(15));
            }
            Quiz[] currentAnswers = new Quiz[5];
            int counter = 0;
            int result = JOptionPane.showConfirmDialog(null, questionsPanel,"English words test", JOptionPane.OK_CANCEL_OPTION);
            if (result == JOptionPane.OK_OPTION) {
                for(int i = 0; i < 5; i++){
                    String question = key[questions.get(i)].getQuestion();
                    String[] defaultAnswers = key[questions.get(i)].getAnswers();
                    answer = qarr[i].getText();
                    points += Quiz.assessPoints(defaultAnswers, answer);
                    currentAnswers[counter++] = new Quiz(question, answer);
                }
                long endTime = System.currentTimeMillis();
                double time = (endTime - startTime);
                time = time/1000;

                JPanel aftermath = new JPanel();
                aftermath.add(new JLabel(String.format("Points: %.1f", points)));
                aftermath.add(new JLabel(String.format("Lapsed time: %.2f s", ((double)Math.round(time*100)/100))));
                JOptionPane.showConfirmDialog(null, aftermath,"Results", JOptionPane.DEFAULT_OPTION);

                Gson toSave = new GsonBuilder().setPrettyPrinting().create();
                writer.write(toSave.toJson(currentAnswers));
                writer.close();
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
