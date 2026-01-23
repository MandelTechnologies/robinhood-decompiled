package com.robinhood.android.common.view;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.android.advisory.portfolio.update.results.UpdatePortfolioResultsScreenKt;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.ticker.TickerUtils;
import com.robinhood.ticker.TickerView;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: AnimatedRhTextView.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 =2\u00020\u0001:\u0001=B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J(\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020\u000bH\u0015J\u000e\u0010&\u001a\u00020#2\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010'\u001a\u00020#2\u0006\u0010(\u001a\u00020\tH\u0016J\u0010\u0010)\u001a\u00020#2\u0006\u0010*\u001a\u00020\u000bH\u0016J\b\u0010+\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010)\u001a\u00020#2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010,\u001a\u00020#J\u001a\u0010-\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\tH\u0016J\u0018\u00101\u001a\u00020#2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u00020\tJ0\u00102\u001a\u00020#2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\u000b2\u0006\u00105\u001a\u00020\u000b2\u0006\u00106\u001a\u00020\u000b2\u0006\u00107\u001a\u00020\u000bH\u0014J\u0010\u00108\u001a\u00020#2\u0006\u00109\u001a\u00020:H\u0014J\b\u0010;\u001a\u00020#H\u0002J\u0010\u0010<\u001a\u00020#2\u0006\u0010.\u001a\u00020/H\u0002R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u000e\u0010 \u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, m3636d2 = {"Lcom/robinhood/android/common/view/AnimatedRhTextView;", "Lcom/robinhood/ticker/TickerView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "stale", "", "staleColor", "", "nonStaleColor", "selectedColor", "colors", "Landroid/content/res/ColorStateList;", "value", "shadowColor", "getShadowColor", "()I", "setShadowColor", "(I)V", "cryptoShadowRadius", "", "glitchManager", "Lcom/robinhood/android/common/view/GlitchManager;", "tempTextPaint", "Landroid/text/TextPaint;", "getTempTextPaint", "()Landroid/text/TextPaint;", "tempTextPaint$delegate", "Lkotlin/Lazy;", "minTextSize", "preferredTextSize", "init", "", "defStyleAttr", "defStyleRes", "setStale", "setSelected", "selected", "setTextColor", ResourceTypes.COLOR, "getTextColors", "animateGlitch", "setText", "text", "", "animate", "setVisibilityText", "onLayout", UpdatePortfolioResultsScreenKt.ChangeLoggingIdentifier, "left", "top", "right", "bottom", "onDraw", "canvas", "Landroid/graphics/Canvas;", "updateTextColor", "adjustTextSizeToFit", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class AnimatedRhTextView extends TickerView {
    private ColorStateList colors;
    private float cryptoShadowRadius;
    private GlitchManager glitchManager;
    private float minTextSize;
    private int nonStaleColor;
    private float preferredTextSize;
    private int selectedColor;
    private int shadowColor;
    private boolean stale;
    private int staleColor;

    /* renamed from: tempTextPaint$delegate, reason: from kotlin metadata */
    private final Lazy tempTextPaint;
    public static final int $stable = 8;
    private static final String SUPPORTED_CHARACTERS = TickerUtils.provideNumberList();
    private static final int[] STALE_STATE_SET = {C11048R.attr.state_stale};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedRhTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        this.tempTextPaint = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.common.view.AnimatedRhTextView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimatedRhTextView.tempTextPaint_delegate$lambda$0();
            }
        });
    }

    public final int getShadowColor() {
        return this.shadowColor;
    }

    public final void setShadowColor(int i) {
        this.shadowColor = i;
        this.textPaint.setShadowLayer(this.cryptoShadowRadius, 0.0f, 0.0f, i);
        invalidate();
    }

    private final TextPaint getTempTextPaint() {
        return (TextPaint) this.tempTextPaint.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextPaint tempTextPaint_delegate$lambda$0() {
        return new TextPaint();
    }

    @Override // com.robinhood.ticker.TickerView
    @SuppressLint({"ResourceType"})
    protected void init(Context context, AttributeSet attrs, int defStyleAttr, int defStyleRes) throws Resources.NotFoundException {
        int resourceId;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        setCharacterLists(SUPPORTED_CHARACTERS);
        int[] iArr = {R.attr.fontFamily, R.attr.shadowColor, C13997R.attr.staleColor};
        this.staleColor = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, new int[]{R.attr.textAppearance}, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int[] AnimatedRhTextView = C11048R.styleable.AnimatedRhTextView;
        Intrinsics.checkNotNullExpressionValue(AnimatedRhTextView, "AnimatedRhTextView");
        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attrs, AnimatedRhTextView, 0, 0);
        this.minTextSize = typedArrayObtainStyledAttributes2.getDimension(C11048R.styleable.AnimatedRhTextView_minTextSize, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        if (resourceId2 != 0) {
            TypedArray typedArrayObtainStyledAttributes3 = context.obtainStyledAttributes(resourceId2, iArr);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes3, "obtainStyledAttributes(...)");
            resourceId = typedArrayObtainStyledAttributes3.getResourceId(0, 0);
            setShadowColor(typedArrayObtainStyledAttributes3.getColor(1, 0));
            this.staleColor = typedArrayObtainStyledAttributes3.getColor(2, this.staleColor);
            typedArrayObtainStyledAttributes3.recycle();
        } else {
            resourceId = 0;
        }
        typedArrayObtainStyledAttributes.recycle();
        TypedArray typedArrayObtainStyledAttributes4 = context.obtainStyledAttributes(attrs, iArr, defStyleAttr, defStyleRes);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes4, "obtainStyledAttributes(...)");
        int resourceId3 = typedArrayObtainStyledAttributes4.getResourceId(0, resourceId);
        this.staleColor = typedArrayObtainStyledAttributes4.getColor(1, this.staleColor);
        typedArrayObtainStyledAttributes4.recycle();
        if (resourceId3 != 0) {
            this.textPaint.setTypeface(ResourcesCompat.getFont(getContext(), resourceId3));
        }
        this.cryptoShadowRadius = RangesKt.coerceIn(getResources().getDimension(C11048R.dimen.crypto_font_glow_radius), 0.0f, 25.0f);
        super.init(context, attrs, defStyleAttr, defStyleRes);
        this.preferredTextSize = getTextSize();
    }

    public final void setStale(boolean stale) {
        if (this.staleColor == 0) {
            throw new IllegalStateException("AnimatedRhTextView needs to declare stale color");
        }
        if (this.stale != stale) {
            this.stale = stale;
            updateTextColor();
        }
    }

    @Override // android.view.View
    public void setSelected(boolean selected) {
        super.setSelected(selected);
        updateTextColor();
    }

    @Override // com.robinhood.ticker.TickerView
    public void setTextColor(int color) {
        this.nonStaleColor = color;
        updateTextColor();
    }

    /* renamed from: getTextColors, reason: from getter */
    public final ColorStateList getColors() {
        return this.colors;
    }

    public final void setTextColor(ColorStateList colors) {
        Intrinsics.checkNotNullParameter(colors, "colors");
        this.colors = colors;
        int defaultColor = colors.getDefaultColor();
        this.nonStaleColor = defaultColor;
        this.staleColor = colors.getColorForState(STALE_STATE_SET, defaultColor);
        this.selectedColor = colors.getColorForState(View.SELECTED_STATE_SET, this.nonStaleColor);
        updateTextColor();
    }

    public final void animateGlitch() {
        if (this.glitchManager == null) {
            this.glitchManager = new GlitchManager(this);
        }
        GlitchManager glitchManager = this.glitchManager;
        Intrinsics.checkNotNull(glitchManager);
        glitchManager.animateGlitch();
    }

    @Override // com.robinhood.ticker.TickerView
    public synchronized void setText(String text, boolean animate) {
        try {
            GlitchManager glitchManager = this.glitchManager;
            if (glitchManager != null) {
                glitchManager.cancel();
            }
            super.setText(text, animate);
            if (isLaidOut() && this.minTextSize > 0.0f) {
                if (text == null) {
                    text = "";
                }
                adjustTextSizeToFit(text);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void setVisibilityText(String text, boolean animate) {
        int i = 0;
        if (text == null || text.length() == 0) {
            setText("", false);
            i = 8;
        } else {
            setText(text, animate);
        }
        setVisibility(i);
    }

    @Override // android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (this.minTextSize > 0.0f) {
            String text = getText();
            if (text == null) {
                text = "";
            }
            adjustTextSizeToFit(text);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onDraw$lambda$3(AnimatedRhTextView animatedRhTextView, Canvas it) {
        Intrinsics.checkNotNullParameter(it, "it");
        super.onDraw(it);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.ticker.TickerView, android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        GlitchManager glitchManager = this.glitchManager;
        if (glitchManager != null) {
            Paint textPaint = this.textPaint;
            Intrinsics.checkNotNullExpressionValue(textPaint, "textPaint");
            glitchManager.draw(canvas, textPaint, this.shadowColor, new Function1() { // from class: com.robinhood.android.common.view.AnimatedRhTextView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AnimatedRhTextView.onDraw$lambda$3(this.f$0, (Canvas) obj);
                }
            });
        }
        super.onDraw(canvas);
    }

    private final void updateTextColor() {
        int i;
        if (this.stale) {
            i = this.staleColor;
        } else {
            i = isSelected() ? this.selectedColor : this.nonStaleColor;
        }
        super.setTextColor(i);
    }

    private final void adjustTextSizeToFit(String text) {
        float f;
        if (this.minTextSize <= 0.0f) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        getTempTextPaint().set(this.textPaint);
        getTempTextPaint().setTextSize(this.preferredTextSize);
        if (getTempTextPaint().measureText(text) > getMeasuredWidth()) {
            f = this.minTextSize;
        } else {
            f = this.preferredTextSize;
        }
        setTextSize(f);
    }
}
