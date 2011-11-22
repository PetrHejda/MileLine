package country.quiz;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;

public class DifficultyMenu extends Activity {
	public int difficult; 
	private RadioGroup radioGroup;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.menu);

		difficult = 0;
		radioGroup = (RadioGroup) findViewById(R.id.radioGroup1);
		
	}
	
	public void difficultClickHandler(View view){
//		if(radioGroup.isSelected()){
			switch (radioGroup.getCheckedRadioButtonId()) {
			case R.id.radio0:
				difficult = 0;
				break;
			case R.id.radio1:
				difficult = 1;
				break;
			case R.id.radio2:
				difficult = 2;
				break;
			default:
				break;
			}
		setContentView(R.layout.main);	
		Intent intent = new Intent();
		intent.putExtra("lives", difficult);
		setResult(RESULT_OK, intent);
        finish();
//		}
//		Button butt = (Button) findViewById(R.id.zvolitDiff);
//		butt.setHint("Zvolte prosím obtížnost");
	}
	
//	public void radioClickHandler(View view){
//		
//		
//		if()
//	}
	
}
