package com.robinhood.shared.crypto.p375ui.tickerinputview;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.NonNull;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.text.TextPaint;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.shared.crypto.p375ui.tickerinputview.CryptoTickerInputView;
import com.singular.sdk.internal.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Column.kt */
@Metadata(m3635d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 J2\u00020\u0001:\u0001JB?\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u00109\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020\u001cJ$\u0010;\u001a\u00020&2\b\b\u0002\u0010:\u001a\u00020\u001c2\u0012\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020&0$J\u0010\u0010>\u001a\u00020\u00122\b\b\u0002\u0010)\u001a\u00020*J\u000e\u0010?\u001a\u00020&2\u0006\u0010@\u001a\u00020AJ\u0016\u0010B\u001a\u00020&2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u001cJ\u0016\u0010D\u001a\u00020&2\u0006\u0010C\u001a\u00020\u00042\u0006\u0010:\u001a\u00020\u001cJ0\u0010E\u001a\u00020&2\u0006\u00101\u001a\u00020\b2\b\b\u0002\u0010:\u001a\u00020\u001c2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020&0$H\u0002J&\u0010F\u001a\u00020&2\u0006\u0010:\u001a\u00020\u001c2\u0014\b\u0002\u0010<\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020&0$H\u0002J\"\u0010G\u001a\u00020\u00122\b\b\u0001\u0010H\u001a\u00020\u00122\u0006\u0010F\u001a\u00020\u00122\u0006\u0010I\u001a\u00020\u0012H\u0002R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\u0019\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001dR\u0011\u0010\u001f\u001a\u00020\u001c8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u001dR\u0011\u0010 \u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u001a\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010'\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u0014R\u0014\u0010)\u001a\u00020*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010\u0014R\u0014\u0010/\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0014R\u000e\u00101\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u00103\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006K"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/tickerinputview/Column;", "", "chars", "", "", "textPaintRegistry", "Lcom/robinhood/shared/crypto/ui/tickerinputview/TextPaintRegistry;", "gravity", "", "currencySymbolSet", "", "currencySymbolSide", "Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$CurrencySymbolSide;", "<init>", "(Ljava/util/List;Lcom/robinhood/shared/crypto/ui/tickerinputview/TextPaintRegistry;ILjava/util/Set;Lcom/robinhood/shared/crypto/ui/tickerinputview/CryptoTickerInputView$CurrencySymbolSide;)V", "getChars", "()Ljava/util/List;", "x", "", "getX", "()F", "setX", "(F)V", "width", "getWidth", "widthWeight", "getWidthWeight", "isCurrencyColumn", "", "()Z", "isPercentColumn", "isHidden", "charAtIndex", "getCharAtIndex", "()C", "progressUpdateCallback", "Lkotlin/Function1;", "Landroid/animation/ValueAnimator;", "", "targetProgress", "getTargetProgress", "textPaint", "Landroid/text/TextPaint;", "getTextPaint", "()Landroid/text/TextPaint;", "yOffset", "getYOffset", "charHeight", "getCharHeight", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "progress", "tempBounds", "Landroid/graphics/Rect;", "getTempBounds", "()Landroid/graphics/Rect;", "setTempBounds", "(Landroid/graphics/Rect;)V", "invalidate", "shouldAnimate", "hide", "doOnEnd", "Landroid/animation/Animator;", "maxWidth", "draw", "canvas", "Landroid/graphics/Canvas;", "enterBottom", "char", "enterTop", "jumpTo", "start", "weightedAverage", "weightRatio", "end", "Companion", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes6.dex */
public final class Column {
    private final List<Character> chars;
    private final Set<Character> currencySymbolSet;
    private final CryptoTickerInputView.CurrencySymbolSide currencySymbolSide;
    private final int gravity;
    private int index;
    private float progress;
    private final Function1<ValueAnimator, Unit> progressUpdateCallback;
    private Rect tempBounds;
    private final TextPaintRegistry textPaintRegistry;
    private float x;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final FastOutSlowInInterpolator DEFAULT_INTERPOLATOR = new FastOutSlowInInterpolator();

    private final float weightedAverage(float weightRatio, float start, float end) {
        return ((1 - weightRatio) * start) + (weightRatio * end);
    }

    public Column(List<Character> chars, TextPaintRegistry textPaintRegistry, int i, Set<Character> currencySymbolSet, CryptoTickerInputView.CurrencySymbolSide currencySymbolSide) {
        Intrinsics.checkNotNullParameter(chars, "chars");
        Intrinsics.checkNotNullParameter(textPaintRegistry, "textPaintRegistry");
        Intrinsics.checkNotNullParameter(currencySymbolSet, "currencySymbolSet");
        Intrinsics.checkNotNullParameter(currencySymbolSide, "currencySymbolSide");
        this.chars = chars;
        this.textPaintRegistry = textPaintRegistry;
        this.gravity = i;
        this.currencySymbolSet = currencySymbolSet;
        this.currencySymbolSide = currencySymbolSide;
        this.progressUpdateCallback = new Function1() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Column.progressUpdateCallback$lambda$0(this.f$0, (ValueAnimator) obj);
            }
        };
        this.progress = -1.0f;
        this.tempBounds = new Rect();
    }

    public final List<Character> getChars() {
        return this.chars;
    }

    public /* synthetic */ Column(List list, TextPaintRegistry textPaintRegistry, int i, Set set, CryptoTickerInputView.CurrencySymbolSide currencySymbolSide, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(list, textPaintRegistry, (i2 & 4) != 0 ? 80 : i, set, (i2 & 16) != 0 ? CryptoTickerInputView.CurrencySymbolSide.LEFT : currencySymbolSide);
    }

    public final float getX() {
        return this.x;
    }

    public final void setX(float f) {
        this.x = f;
    }

    public final float getWidth() {
        int iCeil = (int) Math.ceil(this.progress);
        int iFloor = (int) Math.floor(this.progress);
        return weightedAverage(this.progress - iFloor, iFloor >= 0 ? TextPaints2.calculateWidth(getTextPaint(), this.chars.get(iFloor).charValue()) : 0.0f, iCeil < 0 ? 0.0f : TextPaints2.calculateWidth(getTextPaint(), this.chars.get(iCeil).charValue()));
    }

    public final float getWidthWeight() {
        return isCurrencyColumn() ? this.currencySymbolSide == CryptoTickerInputView.CurrencySymbolSide.LEFT ? 2.0f : 0.0f : isPercentColumn() ? 0.5f : 1.0f;
    }

    private final boolean isCurrencyColumn() {
        return CollectionsKt.contains(this.currencySymbolSet, CollectionsKt.singleOrNull((List) this.chars));
    }

    private final boolean isPercentColumn() {
        Character ch = (Character) CollectionsKt.singleOrNull((List) this.chars);
        return ch != null && ch.charValue() == CryptoTickerInputView.INSTANCE.getPERCENT_SYMBOL();
    }

    public final boolean isHidden() {
        return this.index == -1;
    }

    public final char getCharAtIndex() {
        int i = this.index;
        if (i == -1) {
            return ' ';
        }
        return this.chars.get(i).charValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit progressUpdateCallback$lambda$0(Column column, ValueAnimator animator) {
        Intrinsics.checkNotNullParameter(animator, "animator");
        Object animatedValue = animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        column.progress = ((Float) animatedValue).floatValue();
        return Unit.INSTANCE;
    }

    private final float getTargetProgress() {
        return this.index;
    }

    private final TextPaint getTextPaint() {
        return this.textPaintRegistry.getTextPaint(getCharAtIndex());
    }

    private final float getYOffset() {
        return (-this.progress) * getCharHeight();
    }

    private final float getCharHeight() {
        return TextPaints2.height(getTextPaint());
    }

    public final Rect getTempBounds() {
        return this.tempBounds;
    }

    public final void setTempBounds(Rect rect) {
        Intrinsics.checkNotNullParameter(rect, "<set-?>");
        this.tempBounds = rect;
    }

    public static /* synthetic */ void invalidate$default(Column column, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        column.invalidate(z);
    }

    public final void invalidate(boolean shouldAnimate) {
        start$default(this, shouldAnimate, null, 2, null);
    }

    public static /* synthetic */ void hide$default(Column column, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        column.hide(z, function1);
    }

    public final void hide(boolean shouldAnimate, Function1<? super Animator, Unit> doOnEnd) {
        Intrinsics.checkNotNullParameter(doOnEnd, "doOnEnd");
        this.index = -1;
        start(shouldAnimate, doOnEnd);
    }

    public static /* synthetic */ float maxWidth$default(Column column, TextPaint textPaint, int i, Object obj) {
        if ((i & 1) != 0) {
            textPaint = column.getTextPaint();
        }
        return column.maxWidth(textPaint);
    }

    public final float maxWidth(TextPaint textPaint) {
        Intrinsics.checkNotNullParameter(textPaint, "textPaint");
        List<Character> list = this.chars;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Float.valueOf(TextPaints2.calculateWidth(textPaint, ((Character) it.next()).charValue())));
        }
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) arrayList);
        Intrinsics.checkNotNull(fMaxOrNull);
        return fMaxOrNull.floatValue();
    }

    public final void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        List<Character> list = this.chars;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (Character ch : list) {
            ch.charValue();
            arrayList.add(ch);
        }
        int i = 0;
        for (Object obj : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            char cCharValue = ((Character) obj).charValue();
            canvas.save();
            if (this.gravity == 48) {
                canvas.translate(0.0f, (-TextPaints2.calculateHeight(this.textPaintRegistry.textPaintMaxBy(new Function1() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Float.valueOf(Column.draw$lambda$4$lambda$3((TextPaint) obj2));
                    }
                }), Constants.SdidMigrationStatusCodes.ALREADY_SDID, this.tempBounds)) + TextPaints2.calculateHeight(getTextPaint(), String.valueOf(cCharValue), this.tempBounds));
            }
            canvas.drawText(String.valueOf(cCharValue), this.x, getYOffset() + (i * TextPaints2.height(getTextPaint())), getTextPaint());
            canvas.restore();
            i = i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float draw$lambda$4$lambda$3(TextPaint it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getTextSize();
    }

    public final void enterBottom(char c, boolean shouldAnimate) {
        int i = this.index;
        int i2 = i + 1;
        if (i < CollectionsKt.getLastIndex(this.chars)) {
            this.chars.set(i2, Character.valueOf(c));
        } else {
            this.chars.add(Character.valueOf(c));
        }
        jumpTo$default(this, i2, shouldAnimate, null, 4, null);
    }

    public final void enterTop(char c, boolean shouldAnimate) {
        int i;
        int i2 = this.index;
        if (i2 > 0) {
            i = i2 - 1;
            this.chars.set(i, Character.valueOf(c));
        } else {
            if (this.chars.size() == 1) {
                this.chars.add(Character.valueOf(c));
            }
            Collections.rotate(this.chars, 1);
            jumpTo$default(this, 1, false, null, 4, null);
            i = 0;
        }
        jumpTo$default(this, i, shouldAnimate, null, 4, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void jumpTo$default(Column column, int i, boolean z, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = true;
        }
        if ((i2 & 4) != 0) {
            function1 = new Function1() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Column.jumpTo$lambda$5((Animator) obj2);
                }
            };
        }
        column.jumpTo(i, z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit jumpTo$lambda$5(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void jumpTo(int index, boolean shouldAnimate, Function1<? super Animator, Unit> doOnEnd) {
        this.index = index;
        start(shouldAnimate, doOnEnd);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void start$default(Column column, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = new Function1() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return Column.start$lambda$6((Animator) obj2);
                }
            };
        }
        column.start(z, function1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit start$lambda$6(Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    private final void start(boolean shouldAnimate, final Function1<? super Animator, Unit> doOnEnd) {
        if (!shouldAnimate) {
            this.progress = getTargetProgress();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.progress, getTargetProgress());
        valueAnimatorOfFloat.setInterpolator(DEFAULT_INTERPOLATOR);
        final Function1<ValueAnimator, Unit> function1 = this.progressUpdateCallback;
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(function1) { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$sam$android_animation_ValueAnimator_AnimatorUpdateListener$0
            private final /* synthetic */ Function1 function;

            {
                Intrinsics.checkNotNullParameter(function1, "function");
                this.function = function1;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final /* synthetic */ void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
                this.function.invoke(valueAnimator);
            }
        });
        Intrinsics.checkNotNull(valueAnimatorOfFloat);
        valueAnimatorOfFloat.addListener(new Animator.AnimatorListener() { // from class: com.robinhood.shared.crypto.ui.tickerinputview.Column$start$$inlined$doOnEnd$1
            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationCancel(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationRepeat(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
            }

            @Override // android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                doOnEnd.invoke(animator);
            }
        });
        valueAnimatorOfFloat.start();
    }

    /* compiled from: Column.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/ui/tickerinputview/Column$Companion;", "", "<init>", "()V", "DEFAULT_INTERPOLATOR", "Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "getDEFAULT_INTERPOLATOR", "()Landroidx/interpolator/view/animation/FastOutSlowInInterpolator;", "lib-crypto-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final FastOutSlowInInterpolator getDEFAULT_INTERPOLATOR() {
            return Column.DEFAULT_INTERPOLATOR;
        }
    }
}
