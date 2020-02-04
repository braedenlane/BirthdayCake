package cs301.birthdaycake;

import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.SeekBar;

public class CakeController implements View.OnClickListener, CompoundButton.OnCheckedChangeListener,
        SeekBar.OnSeekBarChangeListener {
    private CakeView view;
    private CakeModel model;

    public CakeController(CakeView view) {
        this.view = view;
        this.model = view.getModel();
    }

    @Override
    public void onClick(View v) {
        this.model.candlesLit = false;
        this.view.invalidate();
    }

    @Override
    public void onCheckedChanged(CompoundButton c, boolean cur) {
        this.model.hasCandles = cur;
        this.view.invalidate();
    }

    @Override
    public void onProgressChanged(SeekBar s, int p, boolean f) {
        this.model.numCandles = p;
        this.view.invalidate();
    }

    @Override
    public void onStartTrackingTouch(SeekBar s) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar s) {

    }
}
