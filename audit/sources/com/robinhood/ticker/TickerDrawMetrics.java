package com.robinhood.ticker;

import android.graphics.Paint;
import com.robinhood.ticker.TickerView;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes12.dex */
class TickerDrawMetrics {
    private float charBaseline;
    private float charHeight;
    private final Map<Character, Float> charWidths = new HashMap(256);
    private TickerView.ScrollingDirection preferredScrollingDirection = TickerView.ScrollingDirection.ANY;
    private final Paint textPaint;

    TickerDrawMetrics(Paint paint) {
        this.textPaint = paint;
        invalidate();
    }

    void invalidate() {
        this.charWidths.clear();
        Paint.FontMetrics fontMetrics = this.textPaint.getFontMetrics();
        float f = fontMetrics.bottom;
        float f2 = fontMetrics.top;
        this.charHeight = f - f2;
        this.charBaseline = -f2;
    }

    float getCharWidth(char c) {
        if (c == 0) {
            return 0.0f;
        }
        Float f = this.charWidths.get(Character.valueOf(c));
        if (f != null) {
            return f.floatValue();
        }
        float fMeasureText = this.textPaint.measureText(Character.toString(c));
        this.charWidths.put(Character.valueOf(c), Float.valueOf(fMeasureText));
        return fMeasureText;
    }

    float getCharHeight() {
        return this.charHeight;
    }

    float getCharBaseline() {
        return this.charBaseline;
    }

    TickerView.ScrollingDirection getPreferredScrollingDirection() {
        return this.preferredScrollingDirection;
    }

    void setPreferredScrollingDirection(TickerView.ScrollingDirection scrollingDirection) {
        this.preferredScrollingDirection = scrollingDirection;
    }
}
