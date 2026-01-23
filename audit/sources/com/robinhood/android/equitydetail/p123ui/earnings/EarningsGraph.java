package com.robinhood.android.equitydetail.p123ui.earnings;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.res.ResourcesCompat;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.equitydetail.C15314R;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: EarningsGraph.kt */
@Metadata(m3635d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 ?2\u00020\u00012\u00020\u0002:\u0004<=>?B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ(\u00101\u001a\u0002022\u0006\u00103\u001a\u00020'2\u0006\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020'2\u0006\u00106\u001a\u00020'H\u0014J\b\u00107\u001a\u000202H\u0002J\u0010\u00108\u001a\u0002022\u0006\u00109\u001a\u00020:H\u0014J\b\u0010;\u001a\u000202H\u0016R$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\b\u0012\u0004\u0012\u00020\f0\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R0\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\n@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0018X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R$\u0010)\u001a\u00020'2\u0006\u0010\u0011\u001a\u00020'@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-R\u000e\u0010.\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006@"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph;", "Landroid/view/View;", "Lcom/robinhood/android/common/util/UiCallbacks$Clearable;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "allValues", "", "", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Item;", "getAllValues", "(Ljava/util/List;)Ljava/util/List;", "decimalFormat", "Ljava/text/DecimalFormat;", "value", "items", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "graphContentArea", "Landroid/graphics/RectF;", "xAxisArea", "yAxisArea", "graphMatrix", "Landroid/graphics/Matrix;", "axisLabels", "", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$AxisLabel;", "dots", "Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Dot;", "textPaint", "Landroid/text/TextPaint;", "dotPaint", "Landroid/graphics/Paint;", "graphTextSize", "", "textColor", "dotColor", "getDotColor", "()I", "setDotColor", "(I)V", "dotAlpha", "dotRadius", "axisPadding", "onSizeChanged", "", "w", "h", "oldw", "oldh", "refreshUi", "onDraw", "canvas", "Landroid/graphics/Canvas;", "clear", "Item", "AxisLabel", "Dot", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class EarningsGraph extends View implements UiCallbacks.Clearable {
    private static final String FINANCIAL_YEAR_WIDEST_LABEL = "FY66";
    private static final int NUM_Y_AXIS_LABELS = 4;
    private final List<AxisLabel> axisLabels;
    private float axisPadding;
    private final DecimalFormat decimalFormat;
    private float dotAlpha;
    private int dotColor;
    private Paint dotPaint;
    private float dotRadius;
    private final List<Dot> dots;
    private final RectF graphContentArea;
    private final Matrix graphMatrix;
    private int graphTextSize;
    private List<Item> items;
    private int textColor;
    private final TextPaint textPaint;
    private final RectF xAxisArea;
    private final RectF yAxisArea;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EarningsGraph(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.decimalFormat = new DecimalFormat("'$'0.00");
        this.items = CollectionsKt.emptyList();
        this.graphContentArea = new RectF();
        this.xAxisArea = new RectF();
        this.yAxisArea = new RectF();
        this.graphMatrix = new Matrix();
        this.axisLabels = new ArrayList(9);
        this.dots = new ArrayList(10);
        this.dotColor = -1;
        int[] EarningsGraph = C15314R.styleable.EarningsGraph;
        Intrinsics.checkNotNullExpressionValue(EarningsGraph, "EarningsGraph");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, EarningsGraph, 0, 0);
        this.graphTextSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C15314R.styleable.EarningsGraph_eg_axisTextSize, 0);
        this.textColor = typedArrayObtainStyledAttributes.getColor(C15314R.styleable.EarningsGraph_eg_axisTextColor, 0);
        setDotColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.EarningsGraph_eg_dotColor, 0));
        this.dotAlpha = typedArrayObtainStyledAttributes.getFloat(C15314R.styleable.EarningsGraph_eg_dotEstimatedAlpha, 0.0f);
        this.dotRadius = typedArrayObtainStyledAttributes.getDimension(C15314R.styleable.EarningsGraph_eg_dotRadius, 0.0f);
        this.axisPadding = typedArrayObtainStyledAttributes.getDimension(C15314R.styleable.EarningsGraph_eg_axisPadding, 0.0f);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C15314R.styleable.EarningsGraph_eg_axisFont, 0);
        typedArrayObtainStyledAttributes.recycle();
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(this.graphTextSize);
        textPaint.setColor(this.textColor);
        this.textPaint = textPaint;
        if (resourceId != 0) {
            textPaint.setTypeface(ResourcesCompat.getFont(context, resourceId));
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.dotColor);
        this.dotPaint = paint;
    }

    /* compiled from: EarningsGraph.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J0\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Item;", "", "estimate", "", "actual", AnnotatedPrivateKey.LABEL, "", "<init>", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)V", "getEstimate", "()Ljava/lang/Float;", "Ljava/lang/Float;", "getActual", "getLabel", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "(Ljava/lang/Float;Ljava/lang/Float;Ljava/lang/String;)Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Item;", "equals", "", "other", "hashCode", "", "toString", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Item {
        public static final int $stable = 0;
        private final Float actual;
        private final Float estimate;
        private final String label;

        public static /* synthetic */ Item copy$default(Item item, Float f, Float f2, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                f = item.estimate;
            }
            if ((i & 2) != 0) {
                f2 = item.actual;
            }
            if ((i & 4) != 0) {
                str = item.label;
            }
            return item.copy(f, f2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Float getEstimate() {
            return this.estimate;
        }

        /* renamed from: component2, reason: from getter */
        public final Float getActual() {
            return this.actual;
        }

        /* renamed from: component3, reason: from getter */
        public final String getLabel() {
            return this.label;
        }

        public final Item copy(Float estimate, Float actual, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            return new Item(estimate, actual, label);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Item)) {
                return false;
            }
            Item item = (Item) other;
            return Intrinsics.areEqual((Object) this.estimate, (Object) item.estimate) && Intrinsics.areEqual((Object) this.actual, (Object) item.actual) && Intrinsics.areEqual(this.label, item.label);
        }

        public int hashCode() {
            Float f = this.estimate;
            int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
            Float f2 = this.actual;
            return ((iHashCode + (f2 != null ? f2.hashCode() : 0)) * 31) + this.label.hashCode();
        }

        public String toString() {
            return "Item(estimate=" + this.estimate + ", actual=" + this.actual + ", label=" + this.label + ")";
        }

        public Item(Float f, Float f2, String label) {
            Intrinsics.checkNotNullParameter(label, "label");
            this.estimate = f;
            this.actual = f2;
            this.label = label;
        }

        public final Float getEstimate() {
            return this.estimate;
        }

        public final Float getActual() {
            return this.actual;
        }

        public final String getLabel() {
            return this.label;
        }
    }

    private final List<Float> getAllValues(List<Item> list) {
        ArrayList arrayList = new ArrayList();
        for (Item item : list) {
            CollectionsKt.addAll(arrayList, CollectionsKt.listOfNotNull((Object[]) new Float[]{item.getEstimate(), item.getActual()}));
        }
        return arrayList;
    }

    public final List<Item> getItems() {
        return this.items;
    }

    public final void setItems(List<Item> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.items = value;
        refreshUi();
    }

    public final int getDotColor() {
        return this.dotColor;
    }

    public final void setDotColor(int i) {
        this.dotColor = i;
        Paint paint = this.dotPaint;
        if (paint != null) {
            paint.setColor(i);
        }
        invalidate();
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        refreshUi();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r17v2 */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    private final void refreshUi() {
        Float fMinOrNull;
        char c;
        boolean z;
        List<Item> list = this.items;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null || (fMinOrNull = CollectionsKt.minOrNull((Iterable<? extends Float>) getAllValues(list))) == null) {
            return;
        }
        float fFloatValue = fMinOrNull.floatValue();
        Float fMaxOrNull = CollectionsKt.maxOrNull((Iterable<? extends Float>) getAllValues(list));
        if (fMaxOrNull != null) {
            float fFloatValue2 = fMaxOrNull.floatValue();
            List<Item> list2 = list;
            ArrayList<AxisLabel> arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                String label = ((Item) it.next()).getLabel();
                TextPaint textPaint = this.textPaint;
                arrayList.add(new AxisLabel(label, textPaint, INSTANCE.getTextWidth(textPaint, FINANCIAL_YEAR_WIDEST_LABEL)));
            }
            RectF rectF = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            RectF rectF2 = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
            for (AxisLabel axisLabel : arrayList) {
                rectF.union(axisLabel.getLayout().getWidth(), axisLabel.getLayout().getHeight());
            }
            if (fFloatValue == fFloatValue2) {
                fFloatValue2 += 0.03f;
            }
            float fWidth = rectF.width();
            float fHeight = rectF.height();
            float f = fFloatValue2 - fFloatValue;
            String str = this.decimalFormat.format(fFloatValue2);
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            AxisLabel axisLabel2 = new AxisLabel(str, this.textPaint, 0, 4, null);
            String str2 = this.decimalFormat.format((f * 0.66f) + fFloatValue);
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            AxisLabel axisLabel3 = new AxisLabel(str2, this.textPaint, 0, 4, null);
            String str3 = this.decimalFormat.format((0.33f * f) + fFloatValue);
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            int i = 4;
            DefaultConstructorMarker defaultConstructorMarker = null;
            int i2 = 0;
            AxisLabel axisLabel4 = new AxisLabel(str3, this.textPaint, i2, i, defaultConstructorMarker);
            String str4 = this.decimalFormat.format(fFloatValue);
            Intrinsics.checkNotNullExpressionValue(str4, "format(...)");
            ArrayList arrayListArrayListOf = CollectionsKt.arrayListOf(axisLabel2, axisLabel3, axisLabel4, new AxisLabel(str4, this.textPaint, i2, i, defaultConstructorMarker));
            Iterator it2 = arrayListArrayListOf.iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
            while (it2.hasNext()) {
                Object next = it2.next();
                Intrinsics.checkNotNullExpressionValue(next, "next(...)");
                AxisLabel axisLabel5 = (AxisLabel) next;
                rectF2.union(axisLabel5.getLayout().getWidth(), axisLabel5.getLayout().getHeight());
            }
            float fWidth2 = rectF2.width();
            float fHeight2 = rectF2.height();
            this.graphContentArea.set(getPaddingStart() + fWidth2 + this.axisPadding, getPaddingTop(), getWidth() - getPaddingEnd(), ((getHeight() - getPaddingBottom()) - fHeight) - this.axisPadding);
            RectF rectF3 = this.yAxisArea;
            float paddingStart = getPaddingStart();
            RectF rectF4 = this.graphContentArea;
            rectF3.set(paddingStart, rectF4.top, rectF4.left - this.axisPadding, rectF4.bottom);
            RectF rectF5 = this.xAxisArea;
            RectF rectF6 = this.graphContentArea;
            rectF5.set(rectF6.left, rectF6.bottom + this.axisPadding, rectF6.right, getHeight() - getPaddingBottom());
            float fHeight3 = this.yAxisArea.height() - fHeight2;
            int i3 = 0;
            for (Object obj : arrayListArrayListOf) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((AxisLabel) obj).setXY(this.yAxisArea.right - r12.getLayout().getWidth(), this.yAxisArea.top + ((i3 / (arrayListArrayListOf.size() - 1)) * fHeight3));
                i3 = i4;
            }
            ?? r17 = 1;
            char c2 = 0;
            float fWidth3 = this.xAxisArea.width() - fWidth;
            int i5 = 0;
            for (Object obj2 : arrayList) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((AxisLabel) obj2).setXY(this.xAxisArea.left + ((i5 / (arrayList.size() - 1)) * fWidth3), this.xAxisArea.top);
                i5 = i6;
            }
            List<AxisLabel> list3 = this.axisLabels;
            list3.clear();
            list3.addAll(arrayListArrayListOf);
            list3.addAll(arrayList);
            this.dots.clear();
            this.graphMatrix.reset();
            RectF rectF7 = new RectF(0.0f, fFloatValue, list.size() - 1, fFloatValue2);
            RectF rectF8 = new RectF(this.graphContentArea);
            float f2 = 2;
            rectF8.inset(fWidth / f2, fHeight2 / f2);
            this.graphMatrix.setRectToRect(rectF7, rectF8, Matrix.ScaleToFit.FILL);
            float[] fArr = new float[2];
            int i7 = 0;
            for (Object obj3 : list2) {
                int i8 = i7 + 1;
                if (i7 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Item item = (Item) obj3;
                Float estimate = item.getEstimate();
                if (estimate != null) {
                    float fFloatValue3 = estimate.floatValue();
                    fArr[c2] = i7;
                    fArr[r17] = fFloatValue3;
                    this.graphMatrix.mapPoints(fArr);
                    ?? r11 = c2;
                    this.dots.add(new Dot(r11, this.dotRadius, fArr[c2], this.graphContentArea.height() - fArr[r17]));
                    c = r11;
                } else {
                    c = c2;
                }
                Float actual = item.getActual();
                if (actual != null) {
                    float fFloatValue4 = actual.floatValue();
                    fArr[c] = i7;
                    fArr[r17] = fFloatValue4;
                    this.graphMatrix.mapPoints(fArr);
                    z = r17;
                    this.dots.add(new Dot(z, this.dotRadius, fArr[c], this.graphContentArea.height() - fArr[r17]));
                } else {
                    z = r17;
                }
                i7 = i8;
                r17 = z;
                c2 = c;
            }
            invalidate();
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        for (AxisLabel axisLabel : this.axisLabels) {
            int iSave = canvas.save();
            try {
                canvas.translate(axisLabel.getX(), axisLabel.getY());
                axisLabel.getLayout().draw(canvas);
            } finally {
                canvas.restoreToCount(iSave);
            }
        }
        for (Dot dot : this.dots) {
            Paint paint = this.dotPaint;
            if (paint != null) {
                paint.setAlpha(dot.getIsActual() ? 255 : MathKt.roundToInt(255 * this.dotAlpha));
                canvas.drawCircle(dot.getX(), dot.getY(), dot.getRadius(), paint);
            }
        }
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.Clearable
    public void clear() {
        setItems(CollectionsKt.emptyList());
        this.axisLabels.clear();
        this.dots.clear();
        invalidate();
    }

    /* compiled from: EarningsGraph.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$AxisLabel;", "", AnnotatedPrivateKey.LABEL, "", "textPaint", "Landroid/text/TextPaint;", "width", "", "<init>", "(Ljava/lang/String;Landroid/text/TextPaint;I)V", "layout", "Landroid/text/Layout;", "getLayout", "()Landroid/text/Layout;", "x", "", "getX", "()F", "setX", "(F)V", "y", "getY", "setY", "setXY", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    private static final class AxisLabel {
        private final Layout layout;
        private float x;
        private float y;

        public AxisLabel(String label, TextPaint textPaint, int i) {
            Intrinsics.checkNotNullParameter(label, "label");
            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
            StaticLayout staticLayoutBuild = StaticLayout.Builder.obtain(label, 0, label.length(), textPaint, i).setAlignment(Layout.Alignment.ALIGN_NORMAL).setLineSpacing(0.0f, 1.0f).setIncludePad(true).build();
            Intrinsics.checkNotNullExpressionValue(staticLayoutBuild, "build(...)");
            this.layout = staticLayoutBuild;
        }

        public /* synthetic */ AxisLabel(String str, TextPaint textPaint, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textPaint, (i2 & 4) != 0 ? EarningsGraph.INSTANCE.getTextWidth(textPaint, str) : i);
        }

        public final Layout getLayout() {
            return this.layout;
        }

        public final float getX() {
            return this.x;
        }

        public final void setX(float f) {
            this.x = f;
        }

        public final float getY() {
            return this.y;
        }

        public final void setY(float f) {
            this.y = f;
        }

        public final void setXY(float x, float y) {
            this.x = x;
            this.y = y;
        }
    }

    /* compiled from: EarningsGraph.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Dot;", "", "isActual", "", "radius", "", "x", "y", "<init>", "(ZFFF)V", "()Z", "getRadius", "()F", "getX", "getY", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    private static final class Dot {
        private final boolean isActual;
        private final float radius;
        private final float x;
        private final float y;

        public Dot(boolean z, float f, float f2, float f3) {
            this.isActual = z;
            this.radius = f;
            this.x = f2;
            this.y = f3;
        }

        /* renamed from: isActual, reason: from getter */
        public final boolean getIsActual() {
            return this.isActual;
        }

        public final float getRadius() {
            return this.radius;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }
    }

    /* compiled from: EarningsGraph.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\b\u001a\u00020\u0005*\u00020\t2\u0006\u0010\n\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/earnings/EarningsGraph$Companion;", "", "<init>", "()V", "NUM_Y_AXIS_LABELS", "", "FINANCIAL_YEAR_WIDEST_LABEL", "", "getTextWidth", "Landroid/text/TextPaint;", "text", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getTextWidth(TextPaint textPaint, String str) {
            return (int) Math.ceil(Layout.getDesiredWidth(str, textPaint));
        }
    }
}
