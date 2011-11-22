package country.quiz;

import java.util.ArrayList;
import java.util.Random;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

public class EuropeanCountryQuizActivity extends Activity{
	private Random random;
	private ArrayList<Button> buttons;

	private TextView question;
	private TextView score;
	private RatingBar lives;
	private int correct, wrong, currentQuestion, currentAnswer,numLives;
	private Button answer1;
	private Button answer2;
	private Button answer3;
	private Button answer4;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		
		Intent myIntent = new Intent(this, DifficultyMenu.class);
        startActivityForResult(myIntent, 0);
		
		
		correct = 0;
		wrong = 0;
		random = new Random();
		buttons = new ArrayList<Button>();

		question = (TextView) findViewById(R.id.question);

		lives = (RatingBar) findViewById(R.id.ratingBar1);
		setDifficult();
		
		answer1 = (Button) findViewById(R.id.button1);
		answer2 = (Button) findViewById(R.id.button2);
		answer3 = (Button) findViewById(R.id.button3);
		answer4 = (Button) findViewById(R.id.button4);
		buttons.add(answer1);
		buttons.add(answer2);
		buttons.add(answer3);
		buttons.add(answer4);

		newQuestion();

		score = (TextView) findViewById(R.id.score);
		setScore(computeScore());
	}

	private void setDifficult() {
//		numLives = getIntent().getIntExtra("lives", 0);
		numLives = (3-numLives)*2;
		int step = -1;
		
		lives.setNumStars(numLives);
		lives.setMax(numLives);
		lives.setRating((float)numLives);
		lives.setStepSize(step);
		
	}

	private void newQuestion() {
		randomize();

		question.setText(Countries.values()[currentQuestion].toValue());
		int r = random.nextInt(4);
		int count = 0;

		for (Button butt : buttons) {
			if (count == r) {
				butt.setText(Cities.values()[currentAnswer].toValue());
			} else {
				butt.setText(Cities.getRandomCity().toValue());
			}
			count++;
		}

	}

	private void randomize() {
		int r = random.nextInt(Countries.values().length);
		currentQuestion = Countries.values()[r].ordinal();
		currentAnswer = currentQuestion;
	}

	private int computeScore() {
		int result = correct - wrong;
		return result;
		// return (result <= 0) ? 0 : result;
	}

	private void setScore(int scr) {
		score.setText("Score: " + scr);
	}

	private boolean isCorrectAnswer(String answer) {
		if (answer.equals(Cities.values()[currentAnswer].toValue())) {
			return true;
		}
		return false;
	}


	public void myClickHandler(View view) {
		Button butt = (Button) view;

		if (isCorrectAnswer(butt.getText().toString())) {
			correct++;
		} else {
			wrong++;
			lives.setRating(lives.getRating()-1);
			if(lives.getRating() == 0){
				writeEndScore();
			}
		}

		setScore(computeScore());
		newQuestion();
	}
	
	

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		Bundle extras = data.getExtras();
		numLives = extras.getInt("lives");
	}

private void writeEndScore() {
	// TODO Auto-generated method stub
	
}
	

}