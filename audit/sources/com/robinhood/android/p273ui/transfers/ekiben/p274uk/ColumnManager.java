package com.robinhood.android.p273ui.transfers.ekiben.p274uk;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Region;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextPaint;
import com.robinhood.android.navigation.compose.NavTransition2;
import com.robinhood.android.tickerinputview.TextPaints;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ColumnManager.kt */
@Metadata(m3635d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0019\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\b\u0007\u0018\u00002\u00020\u0001:\u0003XYZB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u000e\u00107\u001a\u0002082\u0006\u0010\"\u001a\u00020\u0018J\u000e\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020;J\u0006\u0010<\u001a\u000208J\u001e\u0010=\u001a\u0002082\f\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?2\b\b\u0002\u0010A\u001a\u00020\fJ\u0010\u0010B\u001a\u0002082\u0006\u0010C\u001a\u00020+H\u0016J1\u0010D\u001a\u0002HE\"\u0004\b\u0000\u0010E*\b\u0012\u0004\u0012\u0002HE0F2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u0002HE\u0012\u0004\u0012\u00020\f0HH\u0002¢\u0006\u0002\u0010IJ\u0010\u0010J\u001a\u0002082\u0006\u0010A\u001a\u00020\fH\u0002J\b\u0010K\u001a\u000208H\u0002J\b\u0010L\u001a\u00020.H\u0002J\u001e\u0010M\u001a\u0002082\b\b\u0002\u0010N\u001a\u00020\u00032\n\b\u0002\u0010O\u001a\u0004\u0018\u00010.H\u0002J\u0010\u0010P\u001a\u0002082\u0006\u0010Q\u001a\u00020\u0003H\u0002J\b\u0010R\u001a\u000208H\u0002J\u0010\u0010S\u001a\u0002082\u0006\u0010(\u001a\u00020\u0003H\u0002J\b\u0010T\u001a\u000208H\u0002J\"\u0010,\u001a\u00020\u00032\b\b\u0001\u0010U\u001a\u00020\u00032\u0006\u0010J\u001a\u00020\u00032\u0006\u0010V\u001a\u00020\u0003H\u0002J\u0012\u0010W\u001a\u00020\u0003*\b\u0012\u0004\u0012\u0002010?H\u0002J\u0012\u0010\u001e\u001a\u00020\u001f*\b\u0012\u0004\u0012\u0002010?H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\f@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R(\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u000b\u001a\u0004\u0018\u00010\u0012@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0018@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0011\u0010\u001e\u001a\u00020\u001f8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\"\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010%\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b&\u0010$R\u000e\u0010'\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020100X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006["}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager;", "Landroid/animation/ValueAnimator$AnimatorUpdateListener;", "maxTextSize", "", "callback", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Callbacks;", "currencySymbolSet", "", "", "<init>", "(FLcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Callbacks;Ljava/util/Set;)V", "value", "", "useLegacyTextSizingAndLayout", "getUseLegacyTextSizingAndLayout", "()Z", "setUseLegacyTextSizingAndLayout", "(Z)V", "Landroid/graphics/Typeface;", "typeface", "getTypeface", "()Landroid/graphics/Typeface;", "setTypeface", "(Landroid/graphics/Typeface;)V", "", "textColor", "getTextColor", "()I", "setTextColor", "(I)V", "charArray", "", "getCharArray", "()[C", "width", "getWidth", "()F", "height", "getHeight", "xOffset", "textSize", "canvasWidth", "animator", "Landroid/animation/ValueAnimator;", "progress", "snapshot", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Snapshot;", "columns", "", "Lcom/robinhood/android/ui/transfers/ekiben/uk/Column;", "textPaint", "Landroid/text/TextPaint;", "targetTextSizePaint", "textPaintRegistry", "Lcom/robinhood/android/ui/transfers/ekiben/uk/TextPaintRegistry;", "updateWidth", "", "draw", "canvas", "Landroid/graphics/Canvas;", "reset", "apply", "operations", "", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "shouldAnimate", "onAnimationUpdate", "animation", "nextUntil", "T", "", "predicate", "Lkotlin/Function1;", "(Ljava/util/Iterator;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "start", "invalidate", "takeSnapshot", "update", "animatedValue", "startValues", "updateXOffset", "newXOffset", "recalculateTextSize", "updateTextSize", "updateX", "ratio", "end", "weightedWidth", "Callbacks", "Operation", "Snapshot", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ColumnManager implements ValueAnimator.AnimatorUpdateListener {
    public static final int $stable = 8;
    private ValueAnimator animator;
    private final Callbacks callback;
    private int canvasWidth;
    private final List<Column> columns;
    private final Set<Character> currencySymbolSet;
    private final float maxTextSize;
    private float progress;
    private Snapshot snapshot;
    private final TextPaint targetTextSizePaint;
    private int textColor;
    private final TextPaint textPaint;
    private final TextPaintRegistry textPaintRegistry;
    private float textSize;
    private Typeface typeface;
    private boolean useLegacyTextSizingAndLayout;
    private float xOffset;

    /* compiled from: ColumnManager.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Callbacks;", "", "onAnimationUpdate", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAnimationUpdate();
    }

    /* compiled from: ColumnManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Operation.Transition.values().length];
            try {
                iArr[Operation.Transition.ENTER_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Operation.Transition.ENTER_TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final float progress(float ratio, float start, float end) {
        return ((1 - ratio) * start) + (ratio * end);
    }

    public ColumnManager(float f, Callbacks callback, Set<Character> currencySymbolSet) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(currencySymbolSet, "currencySymbolSet");
        this.maxTextSize = f;
        this.callback = callback;
        this.currencySymbolSet = currencySymbolSet;
        this.useLegacyTextSizingAndLayout = true;
        this.textColor = -16777216;
        this.textSize = f;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f);
        Intrinsics.checkNotNullExpressionValue(valueAnimatorOfFloat, "ofFloat(...)");
        this.animator = valueAnimatorOfFloat;
        this.progress = 1.0f;
        this.columns = new ArrayList();
        TextPaint textPaint = new TextPaint(1);
        this.textPaint = textPaint;
        this.targetTextSizePaint = new TextPaint(textPaint);
        this.textPaintRegistry = new TextPaintRegistry(textPaint, currencySymbolSet);
        textPaint.setColor(-16777216);
        textPaint.setTextSize(f);
        this.animator.addUpdateListener(this);
    }

    public final boolean getUseLegacyTextSizingAndLayout() {
        return this.useLegacyTextSizingAndLayout;
    }

    public final void setUseLegacyTextSizingAndLayout(boolean z) {
        this.useLegacyTextSizingAndLayout = z;
        invalidate();
    }

    public final Typeface getTypeface() {
        return this.typeface;
    }

    public final void setTypeface(Typeface typeface) {
        this.textPaintRegistry.updateTypeface(typeface);
        this.typeface = typeface;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    public final void setTextColor(int i) {
        this.textPaintRegistry.updateColor(i);
        invalidate();
        this.textColor = i;
    }

    public final char[] getCharArray() {
        return charArray(this.columns);
    }

    public final float getWidth() {
        return weightedWidth(this.columns);
    }

    public final float getHeight() {
        return TextPaints.height(this.targetTextSizePaint);
    }

    public final void updateWidth(int width) {
        this.canvasWidth = width;
        recalculateTextSize();
    }

    public final void draw(Canvas canvas) {
        Canvas canvas2;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        canvas.save();
        if (this.useLegacyTextSizingAndLayout) {
            float width = canvas.getWidth();
            float height = canvas.getHeight() - TextPaints.height(this.textPaint);
            if (Build.VERSION.SDK_INT >= 26) {
                canvas.clipOutRect(0.0f, 0.0f, width, height);
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.clipRect(0.0f, 0.0f, width, height, Region.Op.DIFFERENCE);
            }
            canvas2.translate(0.0f, canvas2.getHeight() - this.textPaint.getFontMetrics().bottom);
        } else {
            canvas2 = canvas;
            float f = 2;
            float height2 = (canvas2.getHeight() / 2) - (TextPaints.height(this.textPaint) / f);
            float height3 = (canvas2.getHeight() / 2) + (TextPaints.height(this.textPaint) / f);
            canvas2.clipRect(0.0f, height2, canvas2.getWidth(), height3);
            canvas2.translate(0.0f, height3 - this.textPaint.getFontMetrics().bottom);
        }
        canvas2.translate(this.xOffset, 0.0f);
        Iterator<T> it = this.columns.iterator();
        while (it.hasNext()) {
            ((Column) it.next()).draw(canvas2);
        }
        canvas2.restore();
    }

    public final void reset() {
        this.columns.clear();
    }

    public static /* synthetic */ void apply$default(ColumnManager columnManager, List list, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        columnManager.apply(list, z);
    }

    public final void apply(List<? extends Operation> operations2, boolean shouldAnimate) {
        Intrinsics.checkNotNullParameter(operations2, "operations");
        if (operations2.isEmpty()) {
            return;
        }
        ListIterator<Column> listIterator = this.columns.listIterator();
        ListIterator<? extends Operation> listIterator2 = operations2.listIterator();
        while (listIterator2.hasNext()) {
            Operation next = listIterator2.next();
            if (next instanceof Operation.Equal) {
                nextUntil(listIterator, new Function1() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ColumnManager.apply$lambda$1((Column) obj));
                    }
                });
            } else if (next instanceof Operation.Insert) {
                Operation.Insert insert = (Operation.Insert) next;
                Column column = new Column(CollectionsKt.mutableListOf(Character.valueOf(insert.getChar())), this.textPaintRegistry, insert.getGravity(), this.currencySymbolSet);
                listIterator.add(column);
                column.invalidate(shouldAnimate);
            } else if (next instanceof Operation.Delete) {
                final Column column2 = (Column) nextUntil(listIterator, new Function1() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ColumnManager.apply$lambda$2((Column) obj));
                    }
                });
                column2.hide(shouldAnimate, new Function1() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ColumnManager.apply$lambda$3(this.f$0, column2, (Animator) obj);
                    }
                });
            } else {
                if (!(next instanceof Operation.Edit)) {
                    throw new NoWhenBranchMatchedException();
                }
                Column column3 = (Column) nextUntil(listIterator, new Function1() { // from class: com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(ColumnManager.apply$lambda$4((Column) obj));
                    }
                });
                Operation.Edit edit = (Operation.Edit) next;
                int i = WhenMappings.$EnumSwitchMapping$0[edit.getTransition().ordinal()];
                if (i == 1) {
                    column3.enterBottom(edit.getChar(), shouldAnimate);
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    column3.enterTop(edit.getChar(), shouldAnimate);
                }
            }
        }
        start(shouldAnimate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apply$lambda$1(Column it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isHidden();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apply$lambda$2(Column it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isHidden();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit apply$lambda$3(ColumnManager columnManager, Column column, Animator it) {
        Intrinsics.checkNotNullParameter(it, "it");
        columnManager.columns.remove(column);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean apply$lambda$4(Column it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return !it.isHidden();
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public void onAnimationUpdate(ValueAnimator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        Object animatedValue = this.animator.getAnimatedValue();
        Intrinsics.checkNotNull(animatedValue, "null cannot be cast to non-null type kotlin.Float");
        float fFloatValue = ((Float) animatedValue).floatValue();
        this.progress = fFloatValue;
        Snapshot snapshot = this.snapshot;
        if (snapshot == null) {
            Intrinsics.throwUninitializedPropertyAccessException("snapshot");
            snapshot = null;
        }
        update(fFloatValue, snapshot);
        this.callback.onAnimationUpdate();
    }

    private final <T> T nextUntil(Iterator<? extends T> it, Function1<? super T, Boolean> function1) {
        T next = it.next();
        while (!function1.invoke(next).booleanValue()) {
            next = it.next();
        }
        return next;
    }

    private final void start(boolean shouldAnimate) {
        this.snapshot = takeSnapshot();
        recalculateTextSize();
        this.animator.cancel();
        if (shouldAnimate) {
            this.animator.start();
        } else {
            this.progress = 1.0f;
            invalidate();
        }
    }

    /* compiled from: ColumnManager.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0005\b\t\n\u000b\fB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0004\r\u000e\u000f\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "", "char", "", "<init>", "(C)V", "getChar", "()C", "Delete", "Insert", "Equal", "Edit", "Transition", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Delete;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Edit;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Equal;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Insert;", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class Operation {
        public static final int $stable = 0;
        private final char char;

        public /* synthetic */ Operation(char c, DefaultConstructorMarker defaultConstructorMarker) {
            this(c);
        }

        private Operation(char c) {
            this.char = c;
        }

        public char getChar() {
            return this.char;
        }

        /* compiled from: ColumnManager.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Delete;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "char", "", "<init>", "(C)V", "getChar", "()C", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Delete extends Operation {
            public static final int $stable = 0;
            private final char char;

            public static /* synthetic */ Delete copy$default(Delete delete, char c, int i, Object obj) {
                if ((i & 1) != 0) {
                    c = delete.char;
                }
                return delete.copy(c);
            }

            /* renamed from: component1, reason: from getter */
            public final char getChar() {
                return this.char;
            }

            public final Delete copy(char c) {
                return new Delete(c);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Delete) && this.char == ((Delete) other).char;
            }

            public int hashCode() {
                return Character.hashCode(this.char);
            }

            public String toString() {
                return "Delete(char=" + this.char + ")";
            }

            public Delete(char c) {
                super(c, null);
                this.char = c;
            }

            @Override // com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager.Operation
            public char getChar() {
                return this.char;
            }
        }

        /* compiled from: ColumnManager.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Insert;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "char", "", "gravity", "", "<init>", "(CI)V", "getChar", "()C", "getGravity", "()I", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Insert extends Operation {
            public static final int $stable = 0;
            private final char char;
            private final int gravity;

            public static /* synthetic */ Insert copy$default(Insert insert, char c, int i, int i2, Object obj) {
                if ((i2 & 1) != 0) {
                    c = insert.char;
                }
                if ((i2 & 2) != 0) {
                    i = insert.gravity;
                }
                return insert.copy(c, i);
            }

            /* renamed from: component1, reason: from getter */
            public final char getChar() {
                return this.char;
            }

            /* renamed from: component2, reason: from getter */
            public final int getGravity() {
                return this.gravity;
            }

            public final Insert copy(char c, int gravity) {
                return new Insert(c, gravity);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Insert)) {
                    return false;
                }
                Insert insert = (Insert) other;
                return this.char == insert.char && this.gravity == insert.gravity;
            }

            public int hashCode() {
                return (Character.hashCode(this.char) * 31) + Integer.hashCode(this.gravity);
            }

            public String toString() {
                return "Insert(char=" + this.char + ", gravity=" + this.gravity + ")";
            }

            @Override // com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager.Operation
            public char getChar() {
                return this.char;
            }

            public final int getGravity() {
                return this.gravity;
            }

            public Insert(char c, int i) {
                super(c, null);
                this.char = c;
                this.gravity = i;
            }
        }

        /* compiled from: ColumnManager.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Equal;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "char", "", "<init>", "(C)V", "getChar", "()C", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Equal extends Operation {
            public static final int $stable = 0;
            private final char char;

            public static /* synthetic */ Equal copy$default(Equal equal, char c, int i, Object obj) {
                if ((i & 1) != 0) {
                    c = equal.char;
                }
                return equal.copy(c);
            }

            /* renamed from: component1, reason: from getter */
            public final char getChar() {
                return this.char;
            }

            public final Equal copy(char c) {
                return new Equal(c);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Equal) && this.char == ((Equal) other).char;
            }

            public int hashCode() {
                return Character.hashCode(this.char);
            }

            public String toString() {
                return "Equal(char=" + this.char + ")";
            }

            public Equal(char c) {
                super(c, null);
                this.char = c;
            }

            @Override // com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager.Operation
            public char getChar() {
                return this.char;
            }
        }

        /* compiled from: ColumnManager.kt */
        @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Edit;", "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation;", "char", "", NavTransition2.KEY_TRANSITION, "Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Transition;", "<init>", "(CLcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Transition;)V", "getChar", "()C", "getTransition", "()Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Transition;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Edit extends Operation {
            public static final int $stable = 0;
            private final char char;
            private final Transition transition;

            public static /* synthetic */ Edit copy$default(Edit edit, char c, Transition transition, int i, Object obj) {
                if ((i & 1) != 0) {
                    c = edit.char;
                }
                if ((i & 2) != 0) {
                    transition = edit.transition;
                }
                return edit.copy(c, transition);
            }

            /* renamed from: component1, reason: from getter */
            public final char getChar() {
                return this.char;
            }

            /* renamed from: component2, reason: from getter */
            public final Transition getTransition() {
                return this.transition;
            }

            public final Edit copy(char c, Transition transition) {
                Intrinsics.checkNotNullParameter(transition, "transition");
                return new Edit(c, transition);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Edit)) {
                    return false;
                }
                Edit edit = (Edit) other;
                return this.char == edit.char && this.transition == edit.transition;
            }

            public int hashCode() {
                return (Character.hashCode(this.char) * 31) + this.transition.hashCode();
            }

            public String toString() {
                return "Edit(char=" + this.char + ", transition=" + this.transition + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Edit(char c, Transition transition) {
                super(c, null);
                Intrinsics.checkNotNullParameter(transition, "transition");
                this.char = c;
                this.transition = transition;
            }

            @Override // com.robinhood.android.ui.transfers.ekiben.uk.ColumnManager.Operation
            public char getChar() {
                return this.char;
            }

            public final Transition getTransition() {
                return this.transition;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: ColumnManager.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Operation$Transition;", "", "<init>", "(Ljava/lang/String;I)V", "ENTER_BOTTOM", "ENTER_TOP", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Transition {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Transition[] $VALUES;
            public static final Transition ENTER_BOTTOM = new Transition("ENTER_BOTTOM", 0);
            public static final Transition ENTER_TOP = new Transition("ENTER_TOP", 1);

            private static final /* synthetic */ Transition[] $values() {
                return new Transition[]{ENTER_BOTTOM, ENTER_TOP};
            }

            public static EnumEntries<Transition> getEntries() {
                return $ENTRIES;
            }

            private Transition(String str, int i) {
            }

            static {
                Transition[] transitionArr$values = $values();
                $VALUES = transitionArr$values;
                $ENTRIES = EnumEntries2.enumEntries(transitionArr$values);
            }

            public static Transition valueOf(String str) {
                return (Transition) Enum.valueOf(Transition.class, str);
            }

            public static Transition[] values() {
                return (Transition[]) $VALUES.clone();
            }
        }
    }

    private final void invalidate() {
        update$default(this, 0.0f, null, 3, null);
        this.callback.onAnimationUpdate();
    }

    private final Snapshot takeSnapshot() {
        return new Snapshot(this.xOffset, this.textSize);
    }

    static /* synthetic */ void update$default(ColumnManager columnManager, float f, Snapshot snapshot, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 1.0f;
        }
        if ((i & 2) != 0) {
            snapshot = null;
        }
        columnManager.update(f, snapshot);
    }

    private final void update(float animatedValue, Snapshot startValues) {
        float fProgress;
        if (startValues != null) {
            fProgress = progress(animatedValue, startValues.getTextSize(), this.textSize);
        } else {
            fProgress = this.textSize;
        }
        updateTextSize(fProgress);
        float width = (this.canvasWidth / 2) - (getWidth() / 2);
        if (startValues != null) {
            width = progress(animatedValue, startValues.getXOffset(), width);
        }
        updateXOffset(width);
        updateX();
    }

    private final void updateXOffset(float newXOffset) {
        this.xOffset = newXOffset;
    }

    private final void recalculateTextSize() {
        List listListOf = this.useLegacyTextSizingAndLayout ? CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(this.maxTextSize * 0.6f), Float.valueOf(this.maxTextSize * 0.7f), Float.valueOf(this.maxTextSize * 0.8f), Float.valueOf(this.maxTextSize * 0.9f), Float.valueOf(this.maxTextSize)}) : CollectionsKt.listOf((Object[]) new Float[]{Float.valueOf(this.maxTextSize * 0.3f), Float.valueOf(this.maxTextSize * 0.4f), Float.valueOf(this.maxTextSize * 0.5f), Float.valueOf(this.maxTextSize * 0.6f), Float.valueOf(this.maxTextSize * 0.7f), Float.valueOf(this.maxTextSize * 0.8f), Float.valueOf(this.maxTextSize * 0.9f), Float.valueOf(this.maxTextSize)});
        Iterator it = listListOf.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            this.textPaint.setTextSize(((Number) it.next()).floatValue());
            List<Column> list = this.columns;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!((Column) obj).isHidden()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(Float.valueOf(((Column) it2.next()).maxWidth(this.textPaint)));
            }
            if (CollectionsKt.sumOfFloat(arrayList2) > this.canvasWidth) {
                break;
            } else {
                i++;
            }
        }
        float fFloatValue = i == -1 ? this.maxTextSize : ((Number) listListOf.get(Math.max(0, i - 1))).floatValue();
        this.textSize = fFloatValue;
        this.targetTextSizePaint.setTextSize(fFloatValue);
    }

    private final void updateTextSize(float textSize) {
        this.textPaintRegistry.updateTextSize(textSize);
    }

    private final void updateX() {
        int i = 0;
        for (Object obj : this.columns) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Column column = (Column) obj;
            if (i != 0) {
                Column column2 = this.columns.get(i - 1);
                column.setX(column2.getX() + column2.getWidth());
            }
            i = i2;
        }
    }

    private final float weightedWidth(List<Column> list) {
        List<Column> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (Column column : list2) {
            arrayList.add(Float.valueOf(column.getWidthWeight() * column.getWidth()));
        }
        return CollectionsKt.sumOfFloat(arrayList);
    }

    private final char[] charArray(List<Column> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((Column) obj).isHidden()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Character.valueOf(((Column) it.next()).getCharAtIndex()));
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : arrayList2) {
            Character ch = (Character) obj2;
            char cCharValue = ch.charValue();
            if (Character.isDigit(cCharValue) || cCharValue == '.' || cCharValue == ',' || this.currencySymbolSet.contains(ch)) {
                arrayList3.add(obj2);
            }
        }
        return CollectionsKt.toCharArray(arrayList3);
    }

    /* compiled from: ColumnManager.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/ui/transfers/ekiben/uk/ColumnManager$Snapshot;", "", "xOffset", "", "textSize", "<init>", "(FF)V", "getXOffset", "()F", "getTextSize", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-uk-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Snapshot {
        public static final int $stable = 0;
        private final float textSize;
        private final float xOffset;

        public static /* synthetic */ Snapshot copy$default(Snapshot snapshot, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                f = snapshot.xOffset;
            }
            if ((i & 2) != 0) {
                f2 = snapshot.textSize;
            }
            return snapshot.copy(f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final float getXOffset() {
            return this.xOffset;
        }

        /* renamed from: component2, reason: from getter */
        public final float getTextSize() {
            return this.textSize;
        }

        public final Snapshot copy(float xOffset, float textSize) {
            return new Snapshot(xOffset, textSize);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Snapshot)) {
                return false;
            }
            Snapshot snapshot = (Snapshot) other;
            return Float.compare(this.xOffset, snapshot.xOffset) == 0 && Float.compare(this.textSize, snapshot.textSize) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.xOffset) * 31) + Float.hashCode(this.textSize);
        }

        public String toString() {
            return "Snapshot(xOffset=" + this.xOffset + ", textSize=" + this.textSize + ")";
        }

        public Snapshot(float f, float f2) {
            this.xOffset = f;
            this.textSize = f2;
        }

        public final float getTextSize() {
            return this.textSize;
        }

        public final float getXOffset() {
            return this.xOffset;
        }
    }
}
