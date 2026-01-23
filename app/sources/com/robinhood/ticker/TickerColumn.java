package com.robinhood.ticker;

import android.graphics.Canvas;
import android.graphics.Paint;
import com.robinhood.ticker.TickerCharacterList;

/* loaded from: classes12.dex */
class TickerColumn {
    private int bottomCharIndex;
    private float bottomDelta;
    private float charHeight;
    private TickerCharacterList[] characterLists;
    private float currentBottomDelta;
    private char[] currentCharacterList;
    private float currentWidth;
    private int directionAdjustment;
    private int endIndex;
    private final TickerDrawMetrics metrics;
    private float minimumRequiredWidth;
    private float previousBottomDelta;
    private float sourceWidth;
    private int startIndex;
    private float targetWidth;
    private char currentChar = 0;
    private char targetChar = 0;

    TickerColumn(TickerCharacterList[] tickerCharacterListArr, TickerDrawMetrics tickerDrawMetrics) {
        this.characterLists = tickerCharacterListArr;
        this.metrics = tickerDrawMetrics;
    }

    void setCharacterLists(TickerCharacterList[] tickerCharacterListArr) {
        this.characterLists = tickerCharacterListArr;
    }

    void setTargetChar(char c) {
        this.targetChar = c;
        this.sourceWidth = this.currentWidth;
        float charWidth = this.metrics.getCharWidth(c);
        this.targetWidth = charWidth;
        this.minimumRequiredWidth = Math.max(this.sourceWidth, charWidth);
        setCharacterIndices();
        this.directionAdjustment = this.endIndex >= this.startIndex ? 1 : -1;
        this.previousBottomDelta = this.currentBottomDelta;
        this.currentBottomDelta = 0.0f;
    }

    char getCurrentChar() {
        return this.currentChar;
    }

    char getTargetChar() {
        return this.targetChar;
    }

    float getCurrentWidth() {
        checkForDrawMetricsChanges();
        return this.currentWidth;
    }

    float getMinimumRequiredWidth() {
        checkForDrawMetricsChanges();
        return this.minimumRequiredWidth;
    }

    private void setCharacterIndices() {
        this.currentCharacterList = null;
        int i = 0;
        while (true) {
            TickerCharacterList[] tickerCharacterListArr = this.characterLists;
            if (i >= tickerCharacterListArr.length) {
                break;
            }
            TickerCharacterList.CharacterIndices characterIndices = tickerCharacterListArr[i].getCharacterIndices(this.currentChar, this.targetChar, this.metrics.getPreferredScrollingDirection());
            if (characterIndices != null) {
                this.currentCharacterList = this.characterLists[i].getCharacterList();
                this.startIndex = characterIndices.startIndex;
                this.endIndex = characterIndices.endIndex;
            }
            i++;
        }
        if (this.currentCharacterList == null) {
            char c = this.currentChar;
            char c2 = this.targetChar;
            if (c == c2) {
                this.currentCharacterList = new char[]{c};
                this.endIndex = 0;
                this.startIndex = 0;
            } else {
                this.currentCharacterList = new char[]{c, c2};
                this.startIndex = 0;
                this.endIndex = 1;
            }
        }
    }

    void onAnimationEnd() {
        checkForDrawMetricsChanges();
        this.minimumRequiredWidth = this.currentWidth;
    }

    private void checkForDrawMetricsChanges() {
        float charWidth = this.metrics.getCharWidth(this.targetChar);
        float f = this.currentWidth;
        float f2 = this.targetWidth;
        if (f != f2 || f2 == charWidth) {
            return;
        }
        this.targetWidth = charWidth;
        this.currentWidth = charWidth;
        this.minimumRequiredWidth = charWidth;
    }

    void setAnimationProgress(float f) {
        if (f == 1.0f) {
            this.currentChar = this.targetChar;
            this.currentBottomDelta = 0.0f;
            this.previousBottomDelta = 0.0f;
        }
        float charHeight = this.metrics.getCharHeight();
        float fAbs = ((Math.abs(this.endIndex - this.startIndex) * charHeight) * f) / charHeight;
        int i = (int) fAbs;
        float f2 = this.previousBottomDelta * (1.0f - f);
        int i2 = this.directionAdjustment;
        this.bottomDelta = ((fAbs - i) * charHeight * i2) + f2;
        this.bottomCharIndex = this.startIndex + (i * i2);
        this.charHeight = charHeight;
        float f3 = this.sourceWidth;
        this.currentWidth = f3 + ((this.targetWidth - f3) * f);
    }

    void draw(Canvas canvas, Paint paint) {
        if (drawText(canvas, paint, this.currentCharacterList, this.bottomCharIndex, this.bottomDelta)) {
            int i = this.bottomCharIndex;
            if (i >= 0) {
                this.currentChar = this.currentCharacterList[i];
            }
            this.currentBottomDelta = this.bottomDelta;
        }
        drawText(canvas, paint, this.currentCharacterList, this.bottomCharIndex + 1, this.bottomDelta - this.charHeight);
        drawText(canvas, paint, this.currentCharacterList, this.bottomCharIndex - 1, this.bottomDelta + this.charHeight);
    }

    private boolean drawText(Canvas canvas, Paint paint, char[] cArr, int i, float f) {
        if (i < 0 || i >= cArr.length) {
            return false;
        }
        canvas.drawText(cArr, i, 1, 0.0f, f, paint);
        return true;
    }
}
