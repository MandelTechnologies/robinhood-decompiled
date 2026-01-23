package com.github.jinatonic.confetti;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.github.jinatonic.confetti.confetto.Confetto;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes16.dex */
public class ConfettiView extends View implements View.OnLayoutChangeListener {
    private List<Confetto> confetti;
    private Confetto draggedConfetto;
    private boolean terminated;
    private boolean touchEnabled;

    public static ConfettiView newInstance(Context context) {
        ConfettiView confettiView = new ConfettiView(context, null);
        confettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        confettiView.setElevation(context.getResources().getDimensionPixelOffset(R$dimen.confetti_default_elevation));
        return confettiView;
    }

    public ConfettiView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void bind(List<Confetto> list) {
        this.confetti = list;
    }

    public void setTouchEnabled(boolean z) {
        this.touchEnabled = z;
    }

    public void terminate() {
        if (this.terminated) {
            return;
        }
        this.terminated = true;
        getParent().requestLayout();
    }

    public void reset() {
        this.terminated = false;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        viewGroup.removeOnLayoutChangeListener(this);
        viewGroup.addOnLayoutChangeListener(this);
        if (this.confetti == null) {
            terminate();
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        ViewParent parent;
        if (this.terminated && (parent = getParent()) != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeViewInLayout(this);
            viewGroup.removeOnLayoutChangeListener(this);
            viewGroup.invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.terminated) {
            return;
        }
        canvas.save();
        Iterator<Confetto> it = this.confetti.iterator();
        while (it.hasNext()) {
            it.next().draw(canvas);
        }
        canvas.restore();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x001c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0049 A[RETURN] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.touchEnabled) {
            int action = motionEvent.getAction();
            if (action == 0) {
                for (Confetto confetto : this.confetti) {
                    if (confetto.onTouchDown(motionEvent)) {
                        this.draggedConfetto = confetto;
                        break;
                    }
                }
                if (!super.onTouchEvent(motionEvent)) {
                    break;
                }
            } else if (action == 1) {
                Confetto confetto2 = this.draggedConfetto;
                if (confetto2 != null) {
                    confetto2.onTouchUp(motionEvent);
                    this.draggedConfetto = null;
                }
            } else {
                if (action == 2) {
                    Confetto confetto3 = this.draggedConfetto;
                    if (confetto3 != null) {
                        confetto3.onTouchMove(motionEvent);
                    }
                } else if (action != 3) {
                }
                if (!super.onTouchEvent(motionEvent)) {
                }
            }
        } else if (!super.onTouchEvent(motionEvent)) {
            return false;
        }
        return true;
    }
}
