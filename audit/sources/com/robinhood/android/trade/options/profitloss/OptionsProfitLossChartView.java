package com.robinhood.android.trade.options.profitloss;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.view.ScrubGestureDetector;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.font.RhTypeface;
import com.robinhood.android.optionsplchart.C24771R;
import com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartData;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.models.api.ApiOptionsProfitLossChartRequestParams;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import io.reactivex.Observable;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Function;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: OptionsProfitLossChartView.kt */
@Metadata(m3635d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010T\u001a\u00020JH\u0014J\u0018\u0010U\u001a\u00020J2\u0006\u0010V\u001a\u00020\u00122\u0006\u0010W\u001a\u00020\u0012H\u0014J\u0010\u0010X\u001a\u00020J2\u0006\u0010Y\u001a\u00020ZH\u0014J\b\u0010[\u001a\u00020JH\u0016J\u0018\u0010\\\u001a\u00020J2\u0006\u0010]\u001a\u00020?2\u0006\u0010^\u001a\u00020?H\u0016J\b\u0010_\u001a\u00020JH\u0016J\u000e\u0010`\u001a\u00020J2\u0006\u0010a\u001a\u00020?J\u000e\u0010b\u001a\u00020J2\u0006\u0010c\u001a\u00020dJ\u000e\u0010e\u001a\u00020J2\u0006\u0010f\u001a\u00020gR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R&\u0010\u0013\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R&\u0010\u0018\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R&\u0010\u001b\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u0015\"\u0004\b\u001d\u0010\u0017R&\u0010\u001e\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010\u0015\"\u0004\b \u0010\u0017R&\u0010!\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\"\u0010\u0015\"\u0004\b#\u0010\u0017R&\u0010$\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010\u0015\"\u0004\b&\u0010\u0017R&\u0010'\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010\u0015\"\u0004\b)\u0010\u0017R&\u0010*\u001a\u00020\u00122\b\b\u0001\u0010\u0011\u001a\u00020\u00128G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b+\u0010\u0015\"\u0004\b,\u0010\u0017R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010>\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bC\u0010AR\u0014\u0010D\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bE\u0010AR\u0014\u0010F\u001a\u00020?8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bG\u0010AR\u0014\u0010H\u001a\b\u0012\u0004\u0012\u00020J0IX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00020M0L8F¢\u0006\u0006\u001a\u0004\bN\u0010OR\"\u0010Q\u001a\u0004\u0018\u00010P2\b\u0010\u0011\u001a\u0004\u0018\u00010P@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\bR\u0010S¨\u0006h"}, m3636d2 = {"Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartView;", "Landroid/view/View;", "Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "duxo", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartDuxo;", "getDuxo", "()Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartDuxo;", "setDuxo", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartDuxo;)V", "styledAttributes", "Landroid/content/res/TypedArray;", "value", "", "primaryTextColor", "getPrimaryTextColor", "()I", "setPrimaryTextColor", "(I)V", "secondaryTextColor", "getSecondaryTextColor", "setSecondaryTextColor", "lineColor", "getLineColor", "setLineColor", "underlyingLineColor", "getUnderlyingLineColor", "setUnderlyingLineColor", "negativeLineColor", "getNegativeLineColor", "setNegativeLineColor", "positiveLineColor", "getPositiveLineColor", "setPositiveLineColor", "negativeAreaColor", "getNegativeAreaColor", "setNegativeAreaColor", "positiveAreaColor", "getPositiveAreaColor", "setPositiveAreaColor", "paintCache", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossPaintCache;", "shadedRegionProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/ShadedRegionProfitLossChartObject;", "underlyingLineProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/UnderlyingLineProfitLossChartObject;", "axisBackgroundProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/AxisBackgroundProfitLossChartObject;", "sparklineProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/SparklineProfitLossChartObject;", "significantPointsProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/SignificantPointsProfitLossChartObject;", "scrublineProfitLossChartObject", "Lcom/robinhood/android/trade/options/profitloss/ScrublineProfitLossChartObject;", "chartObjects", "", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartObject;", "leftChartPadding", "", "getLeftChartPadding", "()F", "rightChartPadding", "getRightChartPadding", "topChartPadding", "getTopChartPadding", "bottomChartPadding", "getBottomChartPadding", "colorsUpdatedRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "profitLossAdditionalInfoObs", "Lio/reactivex/Observable;", "Lcom/robinhood/android/trade/options/profitloss/ProfitLossAdditionalInfo;", "getProfitLossAdditionalInfoObs", "()Lio/reactivex/Observable;", "Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;", "state", "setState", "(Lcom/robinhood/android/trade/options/profitloss/OptionsProfitLossChartViewState;)V", "onAttachedToWindow", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onScrubStarted", "onScrubbed", "x", "y", "onScrubEnded", "setCondensedPercentage", "condensedPercentage", "updateRequestParams", "requestParams", "Lcom/robinhood/models/api/ApiOptionsProfitLossChartRequestParams;", "setPnlRequestThrottleTimeout", "timeoutMillisecond", "", "feature-options-pl-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class OptionsProfitLossChartView extends Hammer_OptionsProfitLossChartView implements ScrubGestureDetector.ScrubListener {
    public static final int $stable = 8;
    private final AxisBackgroundProfitLossChartObject axisBackgroundProfitLossChartObject;
    private final List<OptionsProfitLossChartObject> chartObjects;
    private final BehaviorRelay<Unit> colorsUpdatedRelay;
    public OptionsProfitLossChartDuxo duxo;
    private final OptionsProfitLossPaintCache paintCache;
    private final ScrublineProfitLossChartObject scrublineProfitLossChartObject;
    private final ShadedRegionProfitLossChartObject shadedRegionProfitLossChartObject;
    private final SignificantPointsProfitLossChartObject significantPointsProfitLossChartObject;
    private final SparklineProfitLossChartObject sparklineProfitLossChartObject;
    private OptionsProfitLossChartViewState state;
    private final TypedArray styledAttributes;
    private final UnderlyingLineProfitLossChartObject underlyingLineProfitLossChartObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionsProfitLossChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, (DefaultConstructorMarker) null);
        Intrinsics.checkNotNullParameter(context, "context");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C24771R.styleable.OptionsProfitLossChartView);
        Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        this.styledAttributes = typedArrayObtainStyledAttributes;
        OptionsProfitLossPaintCache optionsProfitLossPaintCache = new OptionsProfitLossPaintCache(typedArrayObtainStyledAttributes.getDimension(C24771R.styleable.OptionsProfitLossChartView_fontSize, ViewsKt.getDimension(this, C13997R.dimen.text_size_mobius_regular_medium)), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_primaryTextColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_secondaryTextColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_lineColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_underlyingLineColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_negativeColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_positiveColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_negativeGhostColor, 0), typedArrayObtainStyledAttributes.getColor(C24771R.styleable.OptionsProfitLossChartView_positiveGhostColor, 0), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_line_stroke_width), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_point_radius), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_selected_point_radius), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_sparkline_stroke_width), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_sign_left_padding), ViewsKt.getDimension(this, C24771R.dimen.options_profit_loss_chart_sign_right_padding), RhTypeface.REGULAR.load(context), RhTypeface.BOLD.load(context));
        this.paintCache = optionsProfitLossPaintCache;
        ShadedRegionProfitLossChartObject shadedRegionProfitLossChartObject = new ShadedRegionProfitLossChartObject(optionsProfitLossPaintCache);
        this.shadedRegionProfitLossChartObject = shadedRegionProfitLossChartObject;
        UnderlyingLineProfitLossChartObject underlyingLineProfitLossChartObject = new UnderlyingLineProfitLossChartObject(optionsProfitLossPaintCache);
        this.underlyingLineProfitLossChartObject = underlyingLineProfitLossChartObject;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        AxisBackgroundProfitLossChartObject axisBackgroundProfitLossChartObject = new AxisBackgroundProfitLossChartObject(optionsProfitLossPaintCache, resources);
        this.axisBackgroundProfitLossChartObject = axisBackgroundProfitLossChartObject;
        SparklineProfitLossChartObject sparklineProfitLossChartObject = new SparklineProfitLossChartObject(optionsProfitLossPaintCache);
        this.sparklineProfitLossChartObject = sparklineProfitLossChartObject;
        SignificantPointsProfitLossChartObject significantPointsProfitLossChartObject = new SignificantPointsProfitLossChartObject(optionsProfitLossPaintCache);
        this.significantPointsProfitLossChartObject = significantPointsProfitLossChartObject;
        Resources resources2 = getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        ScrublineProfitLossChartObject scrublineProfitLossChartObject = new ScrublineProfitLossChartObject(optionsProfitLossPaintCache, resources2);
        this.scrublineProfitLossChartObject = scrublineProfitLossChartObject;
        this.chartObjects = CollectionsKt.listOf((Object[]) new OptionsProfitLossChartObject[]{shadedRegionProfitLossChartObject, underlyingLineProfitLossChartObject, axisBackgroundProfitLossChartObject, sparklineProfitLossChartObject, scrublineProfitLossChartObject, significantPointsProfitLossChartObject});
        typedArrayObtainStyledAttributes.recycle();
        ScrubGestureDetector scrubGestureDetector = new ScrubGestureDetector(this, new Handler(), ViewConfiguration.get(context).getScaledTouchSlop());
        scrubGestureDetector.setEnabled(true);
        setOnTouchListener(scrubGestureDetector);
        BehaviorRelay<Unit> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Unit.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.colorsUpdatedRelay = behaviorRelayCreateDefault;
    }

    public final OptionsProfitLossChartDuxo getDuxo() {
        OptionsProfitLossChartDuxo optionsProfitLossChartDuxo = this.duxo;
        if (optionsProfitLossChartDuxo != null) {
            return optionsProfitLossChartDuxo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("duxo");
        return null;
    }

    public final void setDuxo(OptionsProfitLossChartDuxo optionsProfitLossChartDuxo) {
        Intrinsics.checkNotNullParameter(optionsProfitLossChartDuxo, "<set-?>");
        this.duxo = optionsProfitLossChartDuxo;
    }

    public final int getPrimaryTextColor() {
        return this.paintCache.getCenteredPrimaryTextPaint().getColor();
    }

    public final void setPrimaryTextColor(int i) {
        this.paintCache.getCenteredPrimaryTextPaint().setColor(i);
        this.paintCache.getCenteredBoldTextPaint().setColor(i);
        invalidate();
    }

    public final int getSecondaryTextColor() {
        return this.paintCache.getCenteredSecondaryTextPaint().getColor();
    }

    public final void setSecondaryTextColor(int i) {
        this.paintCache.getCenteredSecondaryTextPaint().setColor(i);
        invalidate();
    }

    public final int getLineColor() {
        return this.paintCache.getDottedBorderPaint().getColor();
    }

    public final void setLineColor(int i) {
        this.paintCache.getDottedBorderPaint().setColor(i);
        this.paintCache.getSolidLinePaint().setColor(i);
        this.paintCache.getNeutralFillPaint().setColor(i);
        this.colorsUpdatedRelay.accept(Unit.INSTANCE);
        invalidate();
    }

    public final int getUnderlyingLineColor() {
        return this.paintCache.getUnderlyingLinePaint().getColor();
    }

    public final void setUnderlyingLineColor(int i) {
        this.paintCache.getUnderlyingLinePaint().setColor(i);
        invalidate();
    }

    public final int getNegativeLineColor() {
        return this.paintCache.getNegativeLinePaint().getColor();
    }

    public final void setNegativeLineColor(int i) {
        this.paintCache.getNegativeLinePaint().setColor(i);
        this.paintCache.getNegativeFillPaint().setColor(i);
        this.colorsUpdatedRelay.accept(Unit.INSTANCE);
        invalidate();
    }

    public final int getPositiveLineColor() {
        return this.paintCache.getPositiveLinePaint().getColor();
    }

    public final void setPositiveLineColor(int i) {
        this.paintCache.getPositiveLinePaint().setColor(i);
        this.paintCache.getPositiveFillPaint().setColor(i);
        this.colorsUpdatedRelay.accept(Unit.INSTANCE);
        invalidate();
    }

    public final int getNegativeAreaColor() {
        return this.paintCache.getNegativeAreaPaint().getColor();
    }

    public final void setNegativeAreaColor(int i) {
        this.paintCache.getNegativeAreaPaint().setColor(i);
        invalidate();
    }

    public final int getPositiveAreaColor() {
        return this.paintCache.getPositiveAreaPaint().getColor();
    }

    public final void setPositiveAreaColor(int i) {
        this.paintCache.getPositiveAreaPaint().setColor(i);
        invalidate();
    }

    private final float getLeftChartPadding() {
        Iterator<T> it = this.chartObjects.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float requestedLeftPadding = ((OptionsProfitLossChartObject) it.next()).getRequestedLeftPadding();
        while (it.hasNext()) {
            requestedLeftPadding = Math.max(requestedLeftPadding, ((OptionsProfitLossChartObject) it.next()).getRequestedLeftPadding());
        }
        return requestedLeftPadding;
    }

    private final float getRightChartPadding() {
        Iterator<T> it = this.chartObjects.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float requestedRightPadding = ((OptionsProfitLossChartObject) it.next()).getRequestedRightPadding();
        while (it.hasNext()) {
            requestedRightPadding = Math.max(requestedRightPadding, ((OptionsProfitLossChartObject) it.next()).getRequestedRightPadding());
        }
        return requestedRightPadding;
    }

    private final float getTopChartPadding() {
        Iterator<T> it = this.chartObjects.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float requestedTopPadding = ((OptionsProfitLossChartObject) it.next()).getRequestedTopPadding();
        while (it.hasNext()) {
            requestedTopPadding = Math.max(requestedTopPadding, ((OptionsProfitLossChartObject) it.next()).getRequestedTopPadding());
        }
        return requestedTopPadding;
    }

    private final float getBottomChartPadding() {
        Iterator<T> it = this.chartObjects.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float requestedBottomPadding = ((OptionsProfitLossChartObject) it.next()).getRequestedBottomPadding();
        while (it.hasNext()) {
            requestedBottomPadding = Math.max(requestedBottomPadding, ((OptionsProfitLossChartObject) it.next()).getRequestedBottomPadding());
        }
        return requestedBottomPadding;
    }

    public final Observable<ProfitLossAdditionalInfo> getProfitLossAdditionalInfoObs() {
        Observable observableCombineLatest = Observable.combineLatest(getDuxo().getStates(), this.colorsUpdatedRelay, new BiFunction() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView$profitLossAdditionalInfoObs$1
            @Override // io.reactivex.functions.BiFunction
            public final Optional<ProfitLossAdditionalInfo> apply(OptionsProfitLossChartViewState state, Unit unit) {
                Intrinsics.checkNotNullParameter(state, "state");
                Intrinsics.checkNotNullParameter(unit, "<unused var>");
                float pointRadius = this.this$0.paintCache.getPointRadius();
                Resources resources = this.this$0.getResources();
                Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                return Optional3.asOptional(state.getProfitLossAdditionalInfo(pointRadius, resources, this.this$0.getPositiveLineColor(), this.this$0.getNegativeLineColor(), this.this$0.getLineColor()));
            }
        });
        Intrinsics.checkNotNullExpressionValue(observableCombineLatest, "combineLatest(...)");
        Observable<ProfitLossAdditionalInfo> observableDistinctUntilChanged = ObservablesKt.filterIsPresent(observableCombineLatest).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    private final void setState(OptionsProfitLossChartViewState optionsProfitLossChartViewState) {
        if (Intrinsics.areEqual(this.state, optionsProfitLossChartViewState)) {
            return;
        }
        this.state = optionsProfitLossChartViewState;
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(getDuxo().getStates()), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartView.onAttachedToWindow$lambda$4(this.f$0, (OptionsProfitLossChartViewState) obj);
            }
        });
        Observable observableDistinctUntilChanged = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView.onAttachedToWindow.2
            @Override // io.reactivex.functions.Function
            public final Optional<OptionsProfitLossChartData.Point> apply(OptionsProfitLossChartViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getClosestPointOrNull(OptionsProfitLossChartView.this.paintCache.getPointRadius()));
            }
        }).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.trade.options.profitloss.OptionsProfitLossChartView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return OptionsProfitLossChartView.onAttachedToWindow$lambda$5(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$4(OptionsProfitLossChartView optionsProfitLossChartView, OptionsProfitLossChartViewState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        optionsProfitLossChartView.setState(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$5(OptionsProfitLossChartView optionsProfitLossChartView, Optional optional) {
        if (((OptionsProfitLossChartData.Point) optional.component1()) != null) {
            optionsProfitLossChartView.performHapticFeedback(1);
        }
        return Unit.INSTANCE;
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        setMeasuredDimension(size, size2);
        getDuxo().submitChartCanvasBounds(getLeftChartPadding(), size - getRightChartPadding(), getTopChartPadding(), size2 - getBottomChartPadding());
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        OptionsProfitLossChartViewState optionsProfitLossChartViewState = this.state;
        if (optionsProfitLossChartViewState != null && optionsProfitLossChartViewState.getShouldDraw()) {
            Iterator<T> it = this.chartObjects.iterator();
            while (it.hasNext()) {
                ((OptionsProfitLossChartObject) it.next()).onDraw(canvas, optionsProfitLossChartViewState);
            }
        }
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubStarted() {
        performHapticFeedback(1);
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public synchronized void onScrubbed(float x, float y) {
        OptionsProfitLossChartData chartData;
        ChartBounds chartBounds;
        OptionsProfitLossChartViewState optionsProfitLossChartViewState = this.state;
        if (optionsProfitLossChartViewState != null && (chartData = optionsProfitLossChartViewState.getChartData()) != null && (chartBounds = chartData.getChartBounds()) != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
            getDuxo().submitScrubbedPosition(Float.valueOf(RangesKt.coerceIn(x, chartBounds.getCanvasLeftX(), chartBounds.getCanvasRightX())));
        }
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubEnded() {
        getDuxo().submitScrubbedPosition(null);
    }

    public final void setCondensedPercentage(float condensedPercentage) {
        this.scrublineProfitLossChartObject.setCondensedPercentage(condensedPercentage);
        requestLayout();
    }

    public final void updateRequestParams(ApiOptionsProfitLossChartRequestParams requestParams) {
        Intrinsics.checkNotNullParameter(requestParams, "requestParams");
        getDuxo().submitNewRequestParams(requestParams);
    }

    public final void setPnlRequestThrottleTimeout(long timeoutMillisecond) {
        getDuxo().setPnlRequestThrottleTimeout(timeoutMillisecond);
    }
}
