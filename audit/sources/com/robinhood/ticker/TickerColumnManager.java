package com.robinhood.ticker;

import android.graphics.Canvas;
import android.graphics.Paint;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes12.dex */
class TickerColumnManager {
    private TickerCharacterList[] characterLists;
    private final TickerDrawMetrics metrics;
    private Set<Character> supportedCharacters;
    final ArrayList<TickerColumn> tickerColumns = new ArrayList<>();

    TickerColumnManager(TickerDrawMetrics tickerDrawMetrics) {
        this.metrics = tickerDrawMetrics;
    }

    void setCharacterLists(String... strArr) {
        this.characterLists = new TickerCharacterList[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            this.characterLists[i] = new TickerCharacterList(strArr[i]);
        }
        this.supportedCharacters = new HashSet();
        for (int i2 = 0; i2 < strArr.length; i2++) {
            this.supportedCharacters.addAll(this.characterLists[i2].getSupportedCharacters());
        }
        Iterator<TickerColumn> it = this.tickerColumns.iterator();
        while (it.hasNext()) {
            it.next().setCharacterLists(this.characterLists);
        }
    }

    TickerCharacterList[] getCharacterLists() {
        return this.characterLists;
    }

    void setText(char[] cArr) {
        if (this.characterLists == null) {
            throw new IllegalStateException("Need to call #setCharacterLists first.");
        }
        int i = 0;
        while (i < this.tickerColumns.size()) {
            if (this.tickerColumns.get(i).getCurrentWidth() > 0.0f) {
                i++;
            } else {
                this.tickerColumns.remove(i);
            }
        }
        int[] iArrComputeColumnActions = LevenshteinUtils.computeColumnActions(getCurrentText(), cArr, this.supportedCharacters);
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < iArrComputeColumnActions.length; i4++) {
            int i5 = iArrComputeColumnActions[i4];
            if (i5 == 0) {
                this.tickerColumns.get(i2).setTargetChar(cArr[i3]);
                i2++;
                i3++;
            } else if (i5 == 1) {
                this.tickerColumns.add(i2, new TickerColumn(this.characterLists, this.metrics));
                this.tickerColumns.get(i2).setTargetChar(cArr[i3]);
                i2++;
                i3++;
            } else if (i5 == 2) {
                this.tickerColumns.get(i2).setTargetChar((char) 0);
                i2++;
            } else {
                throw new IllegalArgumentException("Unknown action: " + iArrComputeColumnActions[i4]);
            }
        }
    }

    void onAnimationEnd() {
        int size = this.tickerColumns.size();
        for (int i = 0; i < size; i++) {
            this.tickerColumns.get(i).onAnimationEnd();
        }
    }

    void setAnimationProgress(float f) {
        int size = this.tickerColumns.size();
        for (int i = 0; i < size; i++) {
            this.tickerColumns.get(i).setAnimationProgress(f);
        }
    }

    float getMinimumRequiredWidth() {
        int size = this.tickerColumns.size();
        float minimumRequiredWidth = 0.0f;
        for (int i = 0; i < size; i++) {
            minimumRequiredWidth += this.tickerColumns.get(i).getMinimumRequiredWidth();
        }
        return minimumRequiredWidth;
    }

    float getCurrentWidth() {
        int size = this.tickerColumns.size();
        float currentWidth = 0.0f;
        for (int i = 0; i < size; i++) {
            currentWidth += this.tickerColumns.get(i).getCurrentWidth();
        }
        return currentWidth;
    }

    char[] getCurrentText() {
        int size = this.tickerColumns.size();
        char[] cArr = new char[size];
        for (int i = 0; i < size; i++) {
            cArr[i] = this.tickerColumns.get(i).getCurrentChar();
        }
        return cArr;
    }

    void draw(Canvas canvas, Paint paint) {
        int size = this.tickerColumns.size();
        for (int i = 0; i < size; i++) {
            TickerColumn tickerColumn = this.tickerColumns.get(i);
            tickerColumn.draw(canvas, paint);
            canvas.translate(tickerColumn.getCurrentWidth(), 0.0f);
        }
    }
}
