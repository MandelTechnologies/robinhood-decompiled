package com.robinhood.ticker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;

/* loaded from: classes21.dex */
public class TickerView extends View {
    private static final int DEFAULT_ANIMATION_DURATION = 350;
    private static final Interpolator DEFAULT_ANIMATION_INTERPOLATOR = new AccelerateDecelerateInterpolator();
    private static final int DEFAULT_GRAVITY = 8388611;
    private static final int DEFAULT_TEXT_COLOR = -16777216;
    private static final int DEFAULT_TEXT_SIZE = 12;
    private boolean animateMeasurementChange;
    private long animationDelayInMillis;
    private long animationDurationInMillis;
    private Interpolator animationInterpolator;
    private final ValueAnimator animator;
    private final TickerColumnManager columnManager;
    private AnimationHolder currentAnimation;
    private int gravity;
    private int lastMeasuredDesiredHeight;
    private int lastMeasuredDesiredWidth;
    private final TickerDrawMetrics metrics;
    private AnimationHolder nextAnimation;
    private String pendingTextToSet;
    private String text;
    private int textColor;
    public final Paint textPaint;
    private float textSize;
    private int textStyle;
    private final Rect viewBounds;

    /* loaded from: classes12.dex */
    public enum ScrollingDirection {
        ANY,
        UP,
        DOWN
    }

    public TickerView(Context context) throws Resources.NotFoundException {
        super(context);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TickerDrawMetrics tickerDrawMetrics = new TickerDrawMetrics(textPaint);
        this.metrics = tickerDrawMetrics;
        this.columnManager = new TickerColumnManager(tickerDrawMetrics);
        this.animator = ValueAnimator.ofFloat(1.0f);
        this.viewBounds = new Rect();
        init(context, null, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
        super(context, attributeSet);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TickerDrawMetrics tickerDrawMetrics = new TickerDrawMetrics(textPaint);
        this.metrics = tickerDrawMetrics;
        this.columnManager = new TickerColumnManager(tickerDrawMetrics);
        this.animator = ValueAnimator.ofFloat(1.0f);
        this.viewBounds = new Rect();
        init(context, attributeSet, 0, 0);
    }

    public TickerView(Context context, AttributeSet attributeSet, int i) throws Resources.NotFoundException {
        super(context, attributeSet, i);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TickerDrawMetrics tickerDrawMetrics = new TickerDrawMetrics(textPaint);
        this.metrics = tickerDrawMetrics;
        this.columnManager = new TickerColumnManager(tickerDrawMetrics);
        this.animator = ValueAnimator.ofFloat(1.0f);
        this.viewBounds = new Rect();
        init(context, attributeSet, i, 0);
    }

    @TargetApi(21)
    public TickerView(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        super(context, attributeSet, i, i2);
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        TickerDrawMetrics tickerDrawMetrics = new TickerDrawMetrics(textPaint);
        this.metrics = tickerDrawMetrics;
        this.columnManager = new TickerColumnManager(tickerDrawMetrics);
        this.animator = ValueAnimator.ofFloat(1.0f);
        this.viewBounds = new Rect();
        init(context, attributeSet, i, i2);
    }

    protected void init(Context context, AttributeSet attributeSet, int i, int i2) throws Resources.NotFoundException {
        StyledAttributes styledAttributes = new StyledAttributes(context.getResources());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C41644R.styleable.TickerView, i, i2);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C41644R.styleable.TickerView_android_textAppearance, -1);
        if (resourceId != -1) {
            TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(resourceId, C41644R.styleable.TickerView);
            styledAttributes.applyTypedArray(typedArrayObtainStyledAttributes2);
            typedArrayObtainStyledAttributes2.recycle();
        }
        styledAttributes.applyTypedArray(typedArrayObtainStyledAttributes);
        this.animationInterpolator = DEFAULT_ANIMATION_INTERPOLATOR;
        this.animationDurationInMillis = typedArrayObtainStyledAttributes.getInt(C41644R.styleable.TickerView_ticker_animationDuration, DEFAULT_ANIMATION_DURATION);
        this.animateMeasurementChange = typedArrayObtainStyledAttributes.getBoolean(C41644R.styleable.TickerView_ticker_animateMeasurementChange, false);
        this.gravity = styledAttributes.gravity;
        int i3 = styledAttributes.shadowColor;
        if (i3 != 0) {
            this.textPaint.setShadowLayer(styledAttributes.shadowRadius, styledAttributes.shadowDx, styledAttributes.shadowDy, i3);
        }
        int i4 = styledAttributes.textStyle;
        if (i4 != 0) {
            this.textStyle = i4;
            setTypeface(this.textPaint.getTypeface());
        }
        setTextColor(styledAttributes.textColor);
        setTextSize(styledAttributes.textSize);
        int i5 = typedArrayObtainStyledAttributes.getInt(C41644R.styleable.TickerView_ticker_defaultCharacterList, 0);
        if (i5 == 1) {
            setCharacterLists(TickerUtils.provideNumberList());
        } else if (i5 == 2) {
            setCharacterLists(TickerUtils.provideAlphabeticalList());
        } else if (isInEditMode()) {
            setCharacterLists(TickerUtils.provideNumberList());
        }
        int i6 = typedArrayObtainStyledAttributes.getInt(C41644R.styleable.TickerView_ticker_defaultPreferredScrollingDirection, 0);
        if (i6 == 0) {
            this.metrics.setPreferredScrollingDirection(ScrollingDirection.ANY);
        } else if (i6 == 1) {
            this.metrics.setPreferredScrollingDirection(ScrollingDirection.UP);
        } else if (i6 == 2) {
            this.metrics.setPreferredScrollingDirection(ScrollingDirection.DOWN);
        } else {
            throw new IllegalArgumentException("Unsupported ticker_defaultPreferredScrollingDirection: " + i6);
        }
        if (isCharacterListsSet()) {
            setText(styledAttributes.text, false);
        } else {
            this.pendingTextToSet = styledAttributes.text;
        }
        typedArrayObtainStyledAttributes.recycle();
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.robinhood.ticker.TickerView.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                TickerView.this.columnManager.setAnimationProgress(valueAnimator.getAnimatedFraction());
                TickerView.this.checkForRelayout();
                TickerView.this.invalidate();
            }
        });
        final Runnable runnable = new Runnable() { // from class: com.robinhood.ticker.TickerView.2
            @Override // java.lang.Runnable
            public void run() {
                TickerView.this.startNextAnimation();
            }
        };
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.robinhood.ticker.TickerView.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                TickerView.this.columnManager.onAnimationEnd();
                TickerView.this.checkForRelayout();
                TickerView.this.invalidate();
                if (Build.VERSION.SDK_INT >= 26) {
                    runnable.run();
                } else {
                    TickerView.this.post(runnable);
                }
            }
        });
    }

    /* loaded from: classes12.dex */
    private class StyledAttributes {
        int shadowColor;
        float shadowDx;
        float shadowDy;
        float shadowRadius;
        String text;
        float textSize;
        int textStyle;
        int textColor = TickerView.DEFAULT_TEXT_COLOR;
        int gravity = TickerView.DEFAULT_GRAVITY;

        StyledAttributes(Resources resources) {
            this.textSize = TypedValue.applyDimension(2, 12.0f, resources.getDisplayMetrics());
        }

        void applyTypedArray(TypedArray typedArray) {
            this.gravity = typedArray.getInt(C41644R.styleable.TickerView_android_gravity, this.gravity);
            this.shadowColor = typedArray.getColor(C41644R.styleable.TickerView_android_shadowColor, this.shadowColor);
            this.shadowDx = typedArray.getFloat(C41644R.styleable.TickerView_android_shadowDx, this.shadowDx);
            this.shadowDy = typedArray.getFloat(C41644R.styleable.TickerView_android_shadowDy, this.shadowDy);
            this.shadowRadius = typedArray.getFloat(C41644R.styleable.TickerView_android_shadowRadius, this.shadowRadius);
            this.text = typedArray.getString(C41644R.styleable.TickerView_android_text);
            this.textColor = typedArray.getColor(C41644R.styleable.TickerView_android_textColor, this.textColor);
            this.textSize = typedArray.getDimension(C41644R.styleable.TickerView_android_textSize, this.textSize);
            this.textStyle = typedArray.getInt(C41644R.styleable.TickerView_android_textStyle, this.textStyle);
        }
    }

    public void setCharacterLists(String... strArr) {
        this.columnManager.setCharacterLists(strArr);
        String str = this.pendingTextToSet;
        if (str != null) {
            setText(str, false);
            this.pendingTextToSet = null;
        }
    }

    public boolean isCharacterListsSet() {
        return this.columnManager.getCharacterLists() != null;
    }

    public void setText(String str) {
        setText(str, !TextUtils.isEmpty(this.text));
    }

    public void setText(String str, boolean z) {
        if (TextUtils.equals(str, this.text)) {
            return;
        }
        if (!z && this.animator.isRunning()) {
            this.animator.cancel();
            this.nextAnimation = null;
            this.currentAnimation = null;
        }
        if (z) {
            this.nextAnimation = new AnimationHolder(str, this.animationDelayInMillis, this.animationDurationInMillis, this.animationInterpolator);
            if (this.currentAnimation == null) {
                startNextAnimation();
                return;
            }
            return;
        }
        setTextInternal(str);
        this.columnManager.setAnimationProgress(1.0f);
        this.columnManager.onAnimationEnd();
        checkForRelayout();
        invalidate();
    }

    public String getText() {
        return this.text;
    }

    public int getTextColor() {
        return this.textColor;
    }

    public void setTextColor(int i) {
        if (this.textColor != i) {
            this.textColor = i;
            this.textPaint.setColor(i);
            invalidate();
        }
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextSize(float f) {
        if (this.textSize != f) {
            this.textSize = f;
            this.textPaint.setTextSize(f);
            onTextPaintMeasurementChanged();
        }
    }

    public Typeface getTypeface() {
        return this.textPaint.getTypeface();
    }

    public void setTypeface(Typeface typeface) {
        int i = this.textStyle;
        if (i == 3) {
            typeface = Typeface.create(typeface, 3);
        } else if (i == 1) {
            typeface = Typeface.create(typeface, 1);
        } else if (i == 2) {
            typeface = Typeface.create(typeface, 2);
        }
        this.textPaint.setTypeface(typeface);
        onTextPaintMeasurementChanged();
    }

    public long getAnimationDelay() {
        return this.animationDelayInMillis;
    }

    public void setAnimationDelay(long j) {
        this.animationDelayInMillis = j;
    }

    public long getAnimationDuration() {
        return this.animationDurationInMillis;
    }

    public void setAnimationDuration(long j) {
        this.animationDurationInMillis = j;
    }

    public Interpolator getAnimationInterpolator() {
        return this.animationInterpolator;
    }

    public void setAnimationInterpolator(Interpolator interpolator) {
        this.animationInterpolator = interpolator;
    }

    public void setPreferredScrollingDirection(ScrollingDirection scrollingDirection) {
        this.metrics.setPreferredScrollingDirection(scrollingDirection);
    }

    public int getGravity() {
        return this.gravity;
    }

    public void setGravity(int i) {
        if (this.gravity != i) {
            this.gravity = i;
            invalidate();
        }
    }

    public void setAnimateMeasurementChange(boolean z) {
        this.animateMeasurementChange = z;
    }

    public boolean getAnimateMeasurementChange() {
        return this.animateMeasurementChange;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.addListener(animatorListener);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.animator.removeListener(animatorListener);
    }

    public void setPaintFlags(int i) {
        this.textPaint.setFlags(i);
        onTextPaintMeasurementChanged();
    }

    public void setBlurMaskFilter(BlurMaskFilter.Blur blur, float f) {
        if (blur != null && f > 0.0f) {
            this.textPaint.setMaskFilter(new BlurMaskFilter(f, blur));
        } else {
            setLayerType(1, null);
            this.textPaint.setMaskFilter(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkForRelayout() {
        boolean z = this.lastMeasuredDesiredWidth != computeDesiredWidth();
        boolean z2 = this.lastMeasuredDesiredHeight != computeDesiredHeight();
        if (z || z2) {
            requestLayout();
        }
    }

    private int computeDesiredWidth() {
        return ((int) (this.animateMeasurementChange ? this.columnManager.getCurrentWidth() : this.columnManager.getMinimumRequiredWidth())) + getPaddingLeft() + getPaddingRight();
    }

    private int computeDesiredHeight() {
        return ((int) this.metrics.getCharHeight()) + getPaddingTop() + getPaddingBottom();
    }

    private void onTextPaintMeasurementChanged() {
        this.metrics.invalidate();
        checkForRelayout();
        invalidate();
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        this.lastMeasuredDesiredWidth = computeDesiredWidth();
        this.lastMeasuredDesiredHeight = computeDesiredHeight();
        setMeasuredDimension(View.resolveSize(this.lastMeasuredDesiredWidth, i), View.resolveSize(this.lastMeasuredDesiredHeight, i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.viewBounds.set(getPaddingLeft(), getPaddingTop(), i - getPaddingRight(), i2 - getPaddingBottom());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.save();
        realignAndClipCanvasForGravity(canvas);
        canvas.translate(0.0f, this.metrics.getCharBaseline());
        this.columnManager.draw(canvas, this.textPaint);
        canvas.restore();
    }

    private void realignAndClipCanvasForGravity(Canvas canvas) {
        realignAndClipCanvasForGravity(canvas, this.gravity, this.viewBounds, this.columnManager.getCurrentWidth(), this.metrics.getCharHeight());
    }

    static void realignAndClipCanvasForGravity(Canvas canvas, int i, Rect rect, float f, float f2) {
        int iWidth = rect.width();
        int iHeight = rect.height();
        float f3 = (i & 16) == 16 ? rect.top + ((iHeight - f2) / 2.0f) : 0.0f;
        float f4 = (i & 1) == 1 ? rect.left + ((iWidth - f) / 2.0f) : 0.0f;
        if ((i & 48) == 48) {
            f3 = 0.0f;
        }
        if ((i & 80) == 80) {
            f3 = rect.top + (iHeight - f2);
        }
        if ((i & DEFAULT_GRAVITY) == DEFAULT_GRAVITY) {
            f4 = 0.0f;
        }
        if ((i & 8388613) == 8388613) {
            f4 = rect.left + (iWidth - f);
        }
        canvas.translate(f4, f3);
        canvas.clipRect(0.0f, 0.0f, f, f2);
    }

    private void setTextInternal(String str) {
        this.text = str;
        this.columnManager.setText(str == null ? new char[0] : str.toCharArray());
        setContentDescription(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startNextAnimation() {
        AnimationHolder animationHolder = this.nextAnimation;
        this.currentAnimation = animationHolder;
        this.nextAnimation = null;
        if (animationHolder == null) {
            return;
        }
        setTextInternal(animationHolder.text);
        this.animator.setStartDelay(animationHolder.animationDelayInMillis);
        this.animator.setDuration(animationHolder.animationDurationInMillis);
        this.animator.setInterpolator(animationHolder.animationInterpolator);
        this.animator.start();
    }

    /* loaded from: classes12.dex */
    private static final class AnimationHolder {
        public final long animationDelayInMillis;
        public final long animationDurationInMillis;
        public final Interpolator animationInterpolator;
        public final String text;

        private AnimationHolder(String str, long j, long j2, Interpolator interpolator) {
            this.text = str;
            this.animationDelayInMillis = j;
            this.animationDurationInMillis = j2;
            this.animationInterpolator = interpolator;
        }
    }
}
