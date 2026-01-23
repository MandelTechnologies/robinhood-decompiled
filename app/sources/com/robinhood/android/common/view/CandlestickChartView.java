package com.robinhood.android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.view.ScrubGestureDetector;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.extensions.TypedArrays3;
import com.robinhood.utils.math.BigDecimals7;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;

/* compiled from: CandlestickChartView.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b&\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 \u0094\u00012\u00020\u00012\u00020\u0002:\u0006\u0092\u0001\u0093\u0001\u0094\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010o\u001a\u00020pH\u0014J\b\u0010q\u001a\u00020pH\u0014J(\u0010r\u001a\u00020p2\u0006\u0010s\u001a\u00020\n2\u0006\u0010t\u001a\u00020\n2\u0006\u0010u\u001a\u00020\n2\u0006\u0010v\u001a\u00020\nH\u0014J\u0010\u0010w\u001a\u00020p2\u0006\u0010x\u001a\u00020yH\u0014J\u0018\u0010z\u001a\u00020p2\u0006\u0010{\u001a\u0002012\u0006\u0010|\u001a\u000201H\u0016J\b\u0010}\u001a\u00020pH\u0016J\u000e\u0010~\u001a\u00020p2\u0006\u0010K\u001a\u00020LJ\u0006\u0010\u007f\u001a\u00020pJ\u0011\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0082\u0001\u001a\u00020\nJ\u0007\u0010\u0083\u0001\u001a\u00020\nJ\u0018\u0010\u0084\u0001\u001a\u0004\u0018\u0001012\u0007\u0010\u0082\u0001\u001a\u00020\n¢\u0006\u0003\u0010\u0085\u0001J\u001b\u0010\u0086\u0001\u001a\u00020p2\u0006\u0010x\u001a\u00020y2\b\u0010\u0087\u0001\u001a\u00030\u0081\u0001H\u0002J\u001b\u0010\u0088\u0001\u001a\u00020p2\u0006\u0010x\u001a\u00020y2\b\u0010\u0087\u0001\u001a\u00030\u0081\u0001H\u0002J\u001b\u0010\u0089\u0001\u001a\u00020p2\u0006\u0010x\u001a\u00020y2\b\u0010\u0087\u0001\u001a\u00030\u0081\u0001H\u0002J\u0011\u0010\u008a\u0001\u001a\u00020p2\u0006\u0010x\u001a\u00020yH\u0002J\u0011\u0010\u008b\u0001\u001a\u00020p2\u0006\u0010x\u001a\u00020yH\u0002J\t\u0010\u008c\u0001\u001a\u00020pH\u0002J\u0011\u0010\u008d\u0001\u001a\u00020\n2\u0006\u0010{\u001a\u000201H\u0002J\u0011\u0010\u008e\u0001\u001a\u00020p2\u0006\u0010{\u001a\u000201H\u0002J\u0012\u0010\u008f\u0001\u001a\u0002012\u0007\u0010\u0090\u0001\u001a\u00020OH\u0002J\t\u0010\u0091\u0001\u001a\u00020pH\u0002R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0010\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR$\u0010\u0013\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR$\u0010\u0016\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR$\u0010\u0019\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR$\u0010\u001c\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR$\u0010\u001f\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR$\u0010\"\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010\u000fR*\u0010%\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R$\u0010+\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b,\u0010\r\"\u0004\b-\u0010\u000fR$\u0010.\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b/\u0010\r\"\u0004\b0\u0010\u000fR$\u00102\u001a\u0002012\u0006\u0010\t\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u00107\u001a\u0002012\u0006\u0010\t\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00104\"\u0004\b9\u00106R$\u0010:\u001a\u0002012\u0006\u0010\t\u001a\u0002018F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b;\u00104\"\u0004\b<\u00106R$\u0010=\u001a\u0002012\u0006\u0010\t\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00104\"\u0004\b?\u00106R$\u0010@\u001a\u0002012\u0006\u0010\t\u001a\u000201@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001e\u0010C\u001a\u0002012\u0006\u0010\t\u001a\u000201@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\bD\u00104R\u0017\u0010E\u001a\b\u0012\u0004\u0012\u00020\n0F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0011\u0010I\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\bJ\u0010\rR\u0010\u0010K\u001a\u0004\u0018\u00010LX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020OX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020SX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010T\u001a\u0004\u0018\u00010UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u000201X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010X\u001a\u0004\u0018\u00010YX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010Z\u001a\u0004\u0018\u00010\u0002X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010_\u001a\u0004\u0018\u0001012\b\u0010\t\u001a\u0004\u0018\u000101@BX\u0082\u000e¢\u0006\n\n\u0002\u0010b\"\u0004\b`\u0010aR\u0012\u0010c\u001a\u0004\u0018\u000101X\u0082\u000e¢\u0006\u0004\n\u0002\u0010bR\u0014\u0010d\u001a\b\u0012\u0004\u0012\u00020\n0eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020YX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0095\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/view/CandlestickChartView;", "Landroid/view/View;", "Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "value", "", "positiveColor", "getPositiveColor", "()I", "setPositiveColor", "(I)V", "negativeColor", "getNegativeColor", "setNegativeColor", "neutralColor", "getNeutralColor", "setNeutralColor", "positiveVolumeColor", "getPositiveVolumeColor", "setPositiveVolumeColor", "negativeVolumeColor", "getNegativeVolumeColor", "setNegativeVolumeColor", "positiveVolumeAlpha", "getPositiveVolumeAlpha", "setPositiveVolumeAlpha", "negativeVolumeAlpha", "getNegativeVolumeAlpha", "setNegativeVolumeAlpha", "neutralVolumeColor", "getNeutralVolumeColor", "setNeutralVolumeColor", "wickColor", "getWickColor", "()Ljava/lang/Integer;", "setWickColor", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "scrublineColor", "getScrublineColor", "setScrublineColor", "baselineColor", "getBaselineColor", "setBaselineColor", "", "candleWidth", "getCandleWidth", "()F", "setCandleWidth", "(F)V", "wickWidth", "getWickWidth", "setWickWidth", "baselineWidth", "getBaselineWidth", "setBaselineWidth", "maxVolumeHeight", "getMaxVolumeHeight", "setMaxVolumeHeight", "scrublineWidth", "getScrublineWidth", "setScrublineWidth", "spacing", "getSpacing", "scrubbedObservable", "Lio/reactivex/Observable;", "getScrubbedObservable", "()Lio/reactivex/Observable;", "scrubbedIndex", "getScrubbedIndex", "chartData", "Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "actualCandleWidth", "lowPrice", "Ljava/math/BigDecimal;", "highPrice", "maxVolume", "baselinePath", "Landroid/graphics/Path;", "glowEffect", "Lcom/robinhood/android/common/view/GlowEffect;", "glowColor", "glowRadius", "glowPaint", "Landroid/graphics/Paint;", "scrubGestureDetectorListener", "getScrubGestureDetectorListener", "()Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "setScrubGestureDetectorListener", "(Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;)V", "scrubXValue", "setScrubXValue", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "rawScrubXValue", "scrubRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "positiveRectPaint", "negativeRectPaint", "neutralRectPaint", "positiveVolumePaint", "negativeVolumePaint", "neutralVolumePaint", "wickPaint", "scrublinePaint", "baselinePaint", "onAttachedToWindow", "", "onDetachedFromWindow", "onSizeChanged", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onScrubbed", "x", "y", "onScrubEnded", "setData", "clear", "getDataPoint", "Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getDataPointsSize", "getCenterXValueForIndex", "(I)Ljava/lang/Float;", "drawCandlestick", "dataPoint", "drawCandlestickGlow", "drawVolume", "drawScrubline", "drawBaseline", "updateMetadata", "getNearestIndex", "updateScrubXValue", "transformPriceToYValue", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "recreateGlowEffect", "ChartData", "DataPoint", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class CandlestickChartView extends View implements ScrubGestureDetector.ScrubListener {
    private static final float DEFAULT_BASELINE_WIDTH_PX = 1.0f;
    private static final float DEFAULT_CANDLE_WIDTH_DP = 3.0f;
    private static final float DEFAULT_SCRUBLINE_WIDTH_PX = 1.0f;
    private static final float DEFAULT_VOLUME_HEIGHT_DP = 40.0f;
    private static final float DEFAULT_WICK_WIDTH_PX = 1.0f;
    private static final float MINIMUM_GLOW_STROKE_WIDTH = 1.5f;
    private float actualCandleWidth;
    private final Paint baselinePaint;
    private final Path baselinePath;
    private float candleWidth;
    private ChartData chartData;
    private int glowColor;
    private GlowEffect glowEffect;
    private Paint glowPaint;
    private float glowRadius;
    private BigDecimal highPrice;
    private BigDecimal lowPrice;
    private BigDecimal maxVolume;
    private float maxVolumeHeight;
    private final Paint negativeRectPaint;
    private final Paint negativeVolumePaint;
    private final Paint neutralRectPaint;
    private final Paint neutralVolumePaint;
    private final Paint positiveRectPaint;
    private final Paint positiveVolumePaint;
    private Float rawScrubXValue;
    private ScrubGestureDetector.ScrubListener scrubGestureDetectorListener;
    private final BehaviorRelay<Integer> scrubRelay;
    private Float scrubXValue;
    private final Paint scrublinePaint;
    private float scrublineWidth;
    private float spacing;
    private Integer wickColor;
    private final Paint wickPaint;
    private float wickWidth;
    public static final int $stable = 8;

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubStarted() {
        ScrubGestureDetector.ScrubListener.DefaultImpls.onScrubStarted(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CandlestickChartView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.candleWidth = getResources().getDisplayMetrics().density * 3.0f;
        this.wickWidth = 1.0f;
        this.maxVolumeHeight = getResources().getDisplayMetrics().density * DEFAULT_VOLUME_HEIGHT_DP;
        this.scrublineWidth = 1.0f;
        BigDecimal ZERO = BigDecimal.ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.lowPrice = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.highPrice = ZERO;
        Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        this.maxVolume = ZERO;
        this.baselinePath = new Path();
        this.glowColor = -1;
        BehaviorRelay<Integer> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.scrubRelay = behaviorRelayCreate;
        this.positiveRectPaint = new Paint(1);
        this.negativeRectPaint = new Paint(1);
        this.neutralRectPaint = new Paint(1);
        this.positiveVolumePaint = new Paint(1);
        this.negativeVolumePaint = new Paint(1);
        this.neutralVolumePaint = new Paint(1);
        this.wickPaint = new Paint(1);
        this.scrublinePaint = new Paint(1);
        Paint paint = new Paint(1);
        paint.setColor(-16777216);
        paint.setStrokeWidth(1.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setPathEffect(new DashPathEffect(new float[]{2.0f, 6.0f}, 0.0f));
        this.baselinePaint = paint;
        setOnTouchListener(new ScrubGestureDetector(this, new Handler(Looper.getMainLooper()), ViewConfiguration.get(context).getScaledTouchSlop()));
        int[] CandlestickChartView = C11048R.styleable.CandlestickChartView;
        Intrinsics.checkNotNullExpressionValue(CandlestickChartView, "CandlestickChartView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, CandlestickChartView, 0, 0);
        setPositiveColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_positiveColor, -16711936));
        setNegativeColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_negativeColor, -65536));
        setNeutralColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_neutralColor, -7829368));
        setPositiveVolumeColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_positiveVolumeColor, -16711936));
        setNegativeVolumeColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_negativeVolumeColor, -65536));
        setPositiveVolumeAlpha(typedArrayObtainStyledAttributes.getInt(C11048R.styleable.CandlestickChartView_positiveVolumeAlpha, 255));
        setNegativeVolumeAlpha(typedArrayObtainStyledAttributes.getInt(C11048R.styleable.CandlestickChartView_negativeVolumeAlpha, 255));
        setNeutralVolumeColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_neutralVolumeColor, -7829368));
        setWickColor(TypedArrays3.getColorOrNull(typedArrayObtainStyledAttributes, C11048R.styleable.CandlestickChartView_wickColor));
        setScrublineColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_scrublineColor, -3355444));
        setBaselineColor(typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_baselineColor, -16777216));
        setCandleWidth(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_candleWidth, this.candleWidth));
        setWickWidth(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_wickWidth, this.wickWidth));
        setScrublineWidth(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_scrublineWidth, this.scrublineWidth));
        setBaselineWidth(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_baselineWidth, 1.0f));
        setMaxVolumeHeight(typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_maxVolumeHeight, this.maxVolumeHeight));
        this.glowRadius = typedArrayObtainStyledAttributes.getDimension(C11048R.styleable.CandlestickChartView_candleGlowRadius, 0.0f);
        this.glowColor = typedArrayObtainStyledAttributes.getColor(C11048R.styleable.CandlestickChartView_candleGlowColor, this.glowColor);
        typedArrayObtainStyledAttributes.recycle();
        if (this.glowRadius == 0.0f) {
            return;
        }
        Paint paint2 = new Paint(1);
        paint2.setStrokeWidth(getResources().getDisplayMetrics().density);
        paint2.setColor(this.glowColor);
        this.glowPaint = paint2;
    }

    public final int getPositiveColor() {
        return this.positiveRectPaint.getColor();
    }

    public final void setPositiveColor(int i) {
        this.positiveRectPaint.setColor(i);
        invalidate();
    }

    public final int getNegativeColor() {
        return this.negativeRectPaint.getColor();
    }

    public final void setNegativeColor(int i) {
        this.negativeRectPaint.setColor(i);
        invalidate();
    }

    public final int getNeutralColor() {
        return this.neutralRectPaint.getColor();
    }

    public final void setNeutralColor(int i) {
        this.neutralRectPaint.setColor(i);
        invalidate();
    }

    public final int getPositiveVolumeColor() {
        return this.positiveVolumePaint.getColor();
    }

    public final void setPositiveVolumeColor(int i) {
        Paint paint = this.positiveVolumePaint;
        paint.setColor((i & 16777215) | (((paint.getColor() >> 24) & 255) << 24));
        invalidate();
    }

    public final int getNegativeVolumeColor() {
        return this.negativeVolumePaint.getColor();
    }

    public final void setNegativeVolumeColor(int i) {
        Paint paint = this.negativeVolumePaint;
        paint.setColor((i & 16777215) | (((paint.getColor() >> 24) & 255) << 24));
        invalidate();
    }

    public final int getPositiveVolumeAlpha() {
        return this.positiveVolumePaint.getAlpha();
    }

    public final void setPositiveVolumeAlpha(int i) {
        this.positiveVolumePaint.setAlpha(i);
        invalidate();
    }

    public final int getNegativeVolumeAlpha() {
        return this.negativeVolumePaint.getAlpha();
    }

    public final void setNegativeVolumeAlpha(int i) {
        this.negativeVolumePaint.setAlpha(i);
        invalidate();
    }

    public final int getNeutralVolumeColor() {
        return this.neutralVolumePaint.getColor();
    }

    public final void setNeutralVolumeColor(int i) {
        this.neutralVolumePaint.setColor(i);
        invalidate();
    }

    public final Integer getWickColor() {
        return this.wickColor;
    }

    public final void setWickColor(Integer num) {
        this.wickColor = num;
        this.wickPaint.setColor(num != null ? num.intValue() : -3355444);
        invalidate();
    }

    public final int getScrublineColor() {
        return this.scrublinePaint.getColor();
    }

    public final void setScrublineColor(int i) {
        this.scrublinePaint.setColor(i);
        invalidate();
    }

    public final int getBaselineColor() {
        return this.baselinePaint.getColor();
    }

    public final void setBaselineColor(int i) {
        this.baselinePaint.setColor(i);
        invalidate();
    }

    public final float getCandleWidth() {
        return this.candleWidth;
    }

    public final void setCandleWidth(float f) {
        this.candleWidth = f;
        updateMetadata();
        invalidate();
    }

    public final float getWickWidth() {
        return this.wickWidth;
    }

    public final void setWickWidth(float f) {
        this.wickWidth = f;
        invalidate();
    }

    public final float getBaselineWidth() {
        return this.baselinePaint.getStrokeWidth();
    }

    public final void setBaselineWidth(float f) {
        this.baselinePaint.setStrokeWidth(f);
        invalidate();
    }

    public final float getMaxVolumeHeight() {
        return this.maxVolumeHeight;
    }

    public final void setMaxVolumeHeight(float f) {
        this.maxVolumeHeight = f;
        invalidate();
    }

    public final float getScrublineWidth() {
        return this.scrublineWidth;
    }

    public final void setScrublineWidth(float f) {
        this.scrublineWidth = f;
        invalidate();
    }

    public final float getSpacing() {
        return this.spacing;
    }

    public final Observable<Integer> getScrubbedObservable() {
        Observable<Integer> observableDistinctUntilChanged = this.scrubRelay.distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        return observableDistinctUntilChanged;
    }

    public final int getScrubbedIndex() {
        Float f = this.rawScrubXValue;
        if (f != null) {
            return getNearestIndex(f.floatValue());
        }
        return -1;
    }

    public final ScrubGestureDetector.ScrubListener getScrubGestureDetectorListener() {
        return this.scrubGestureDetectorListener;
    }

    public final void setScrubGestureDetectorListener(ScrubGestureDetector.ScrubListener scrubListener) {
        this.scrubGestureDetectorListener = scrubListener;
    }

    private final void setScrubXValue(Float f) {
        if (Intrinsics.areEqual(this.scrubXValue, f)) {
            return;
        }
        this.scrubXValue = f;
        invalidate();
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        recreateGlowEffect();
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        GlowEffect glowEffect = this.glowEffect;
        if (glowEffect != null) {
            glowEffect.close();
        }
        this.glowEffect = null;
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        updateMetadata();
        recreateGlowEffect();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        drawBaseline(canvas);
        GlowEffect glowEffect = this.glowEffect;
        if (glowEffect != null) {
            glowEffect.clear();
            Canvas sourceCanvas = glowEffect.getSourceCanvas();
            int iSave = sourceCanvas.save();
            try {
                Iterator<DataPoint> it = chartData.getDataPoints().iterator();
                while (it.hasNext()) {
                    drawCandlestickGlow(glowEffect.getSourceCanvas(), it.next());
                    glowEffect.getSourceCanvas().translate(this.actualCandleWidth + this.spacing, 0.0f);
                }
                sourceCanvas.restoreToCount(iSave);
                glowEffect.drawGlow(canvas);
            } catch (Throwable th) {
                sourceCanvas.restoreToCount(iSave);
                throw th;
            }
        }
        int iSave2 = canvas.save();
        try {
            for (DataPoint dataPoint : chartData.getDataPoints()) {
                drawCandlestick(canvas, dataPoint);
                drawVolume(canvas, dataPoint);
                canvas.translate(this.actualCandleWidth + this.spacing, 0.0f);
            }
            canvas.restoreToCount(iSave2);
            drawScrubline(canvas);
        } catch (Throwable th2) {
            canvas.restoreToCount(iSave2);
            throw th2;
        }
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubbed(float x, float y) {
        ScrubGestureDetector.ScrubListener scrubListener = this.scrubGestureDetectorListener;
        if (scrubListener != null) {
            scrubListener.onScrubbed(x, y);
        }
        ChartData chartData = this.chartData;
        if (chartData == null || chartData.getDataPoints().isEmpty()) {
            return;
        }
        getParent().requestDisallowInterceptTouchEvent(true);
        this.rawScrubXValue = Float.valueOf(x);
        updateScrubXValue(x);
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubEnded() {
        ScrubGestureDetector.ScrubListener scrubListener = this.scrubGestureDetectorListener;
        if (scrubListener != null) {
            scrubListener.onScrubEnded();
        }
        this.rawScrubXValue = null;
        setScrubXValue(null);
        this.scrubRelay.accept(-1);
    }

    public final void setData(ChartData chartData) {
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.chartData = chartData;
        updateMetadata();
        Float f = this.rawScrubXValue;
        if (f != null) {
            updateScrubXValue(f.floatValue());
        }
        invalidate();
    }

    public final void clear() {
        this.chartData = null;
        invalidate();
    }

    public final DataPoint getDataPoint(int index) {
        ChartData chartData = this.chartData;
        Intrinsics.checkNotNull(chartData);
        return chartData.getDataPoints().get(index);
    }

    public final int getDataPointsSize() {
        ChartData chartData = this.chartData;
        Intrinsics.checkNotNull(chartData);
        return chartData.getDataPoints().size();
    }

    public final Float getCenterXValueForIndex(int index) {
        ChartData chartData = this.chartData;
        Intrinsics.checkNotNull(chartData);
        if (index < 0 || index > chartData.getRange()) {
            return null;
        }
        float f = this.actualCandleWidth;
        float f2 = index;
        return Float.valueOf((f * f2) + (f / 2) + (this.spacing * f2));
    }

    private final void drawCandlestick(Canvas canvas, DataPoint dataPoint) {
        Paint paint;
        BigDecimal openPrice;
        BigDecimal closePrice;
        boolean zIsPositive = dataPoint.isPositive();
        if (Intrinsics.areEqual(dataPoint.getOpenPrice(), dataPoint.getClosePrice())) {
            paint = this.neutralRectPaint;
        } else if (zIsPositive) {
            paint = this.positiveRectPaint;
        } else {
            paint = this.negativeRectPaint;
        }
        Paint paint2 = paint;
        Paint paint3 = this.wickColor == null ? paint2 : this.wickPaint;
        if (zIsPositive) {
            openPrice = dataPoint.getClosePrice();
        } else {
            openPrice = dataPoint.getOpenPrice();
        }
        float fTransformPriceToYValue = transformPriceToYValue(openPrice);
        if (zIsPositive) {
            closePrice = dataPoint.getOpenPrice();
        } else {
            closePrice = dataPoint.getClosePrice();
        }
        float fTransformPriceToYValue2 = transformPriceToYValue(closePrice);
        BigDecimal highPrice = dataPoint.getHighPrice();
        Float fValueOf = highPrice != null ? Float.valueOf(transformPriceToYValue(highPrice)) : null;
        BigDecimal lowPrice = dataPoint.getLowPrice();
        Float fValueOf2 = lowPrice != null ? Float.valueOf(transformPriceToYValue(lowPrice)) : null;
        if (fTransformPriceToYValue2 - fTransformPriceToYValue < 1.0f) {
            float f = 1;
            fTransformPriceToYValue -= f;
            fTransformPriceToYValue2 += f;
        }
        float f2 = fTransformPriceToYValue2;
        float f3 = fTransformPriceToYValue;
        if (fValueOf != null && fValueOf2 != null) {
            canvas.drawRect((this.actualCandleWidth - this.wickWidth) / 2.0f, fValueOf.floatValue(), (this.actualCandleWidth + this.wickWidth) / 2.0f, fValueOf2.floatValue(), paint3);
        }
        canvas.drawRect(0.0f, f3, this.actualCandleWidth, f2, paint2);
    }

    private final void drawCandlestickGlow(Canvas canvas, DataPoint dataPoint) {
        BigDecimal openPrice;
        BigDecimal closePrice;
        float f;
        boolean zIsPositive = dataPoint.isPositive();
        if (zIsPositive) {
            openPrice = dataPoint.getClosePrice();
        } else {
            openPrice = dataPoint.getOpenPrice();
        }
        float fTransformPriceToYValue = transformPriceToYValue(openPrice);
        if (zIsPositive) {
            closePrice = dataPoint.getOpenPrice();
        } else {
            closePrice = dataPoint.getClosePrice();
        }
        float fTransformPriceToYValue2 = transformPriceToYValue(closePrice);
        BigDecimal highPrice = dataPoint.getHighPrice();
        Float fValueOf = highPrice != null ? Float.valueOf(transformPriceToYValue(highPrice)) : null;
        BigDecimal lowPrice = dataPoint.getLowPrice();
        Float fValueOf2 = lowPrice != null ? Float.valueOf(transformPriceToYValue(lowPrice)) : null;
        if (fTransformPriceToYValue2 - fTransformPriceToYValue < 1.0f) {
            float f2 = 1;
            fTransformPriceToYValue -= f2;
            fTransformPriceToYValue2 += f2;
        }
        float f3 = fTransformPriceToYValue2;
        float f4 = fTransformPriceToYValue;
        float f5 = 2;
        float f6 = this.actualCandleWidth / f5;
        Paint paint = this.glowPaint;
        Intrinsics.checkNotNull(paint);
        paint.setStrokeWidth(RangesKt.coerceAtLeast(this.wickWidth / f5, 1.5f));
        if (fValueOf != null) {
            canvas.drawLine(f6, fValueOf.floatValue(), f6, f4, paint);
            paint = paint;
        }
        if (fValueOf2 != null) {
            f = 1.5f;
            canvas.drawLine(f6, fValueOf2.floatValue(), f6, f3, paint);
        } else {
            f = 1.5f;
        }
        paint.setStrokeWidth(RangesKt.coerceAtLeast(this.candleWidth / f5, f));
        canvas.drawLine(f6, f4, f6, f3, paint);
    }

    private final void drawVolume(Canvas canvas, DataPoint dataPoint) {
        Paint paint;
        BigDecimal volume = dataPoint.getVolume();
        if (volume == null || this.maxVolume.compareTo(BigDecimal.ZERO) == 0) {
            return;
        }
        if (Intrinsics.areEqual(dataPoint.getOpenPrice(), dataPoint.getClosePrice())) {
            paint = this.neutralVolumePaint;
        } else {
            paint = dataPoint.isPositive() ? this.positiveVolumePaint : this.negativeVolumePaint;
        }
        canvas.drawRect(0.0f, (canvas.getHeight() - getPaddingBottom()) - (BigDecimals7.safeDivide(volume, this.maxVolume).floatValue() * this.maxVolumeHeight), this.actualCandleWidth, canvas.getHeight() - getPaddingBottom(), paint);
    }

    private final void drawScrubline(Canvas canvas) {
        Float f = this.scrubXValue;
        if (f != null) {
            float fFloatValue = f.floatValue();
            float f2 = this.scrublineWidth / 2;
            canvas.drawRect(fFloatValue - f2, getPaddingTop(), fFloatValue + f2, getHeight() - getPaddingBottom(), this.scrublinePaint);
        }
    }

    private final void drawBaseline(Canvas canvas) {
        canvas.drawPath(this.baselinePath, this.baselinePaint);
    }

    private final void updateMetadata() {
        Object next;
        BigDecimal ZERO;
        Object next2;
        BigDecimal ZERO2;
        Object next3;
        ChartData chartData = this.chartData;
        if (chartData == null) {
            return;
        }
        float width = getWidth();
        float range = chartData.getRange();
        float f = this.candleWidth;
        float f2 = width - (range * f);
        if (f2 < 0.0f) {
            float width2 = getWidth() / chartData.getRange();
            this.actualCandleWidth = 0.75f * width2;
            this.spacing = width2 * 0.25f;
        } else {
            this.actualCandleWidth = f;
            this.spacing = f2 / (chartData.getRange() - 1);
        }
        Iterator<T> it = chartData.getDataPoints().iterator();
        BigDecimal ZERO3 = null;
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                DataPoint dataPoint = (DataPoint) next;
                BigDecimal lowPrice = dataPoint.getLowPrice();
                if (lowPrice == null) {
                    lowPrice = dataPoint.getOpenPrice().min(dataPoint.getClosePrice());
                }
                do {
                    Object next4 = it.next();
                    DataPoint dataPoint2 = (DataPoint) next4;
                    BigDecimal lowPrice2 = dataPoint2.getLowPrice();
                    if (lowPrice2 == null) {
                        lowPrice2 = dataPoint2.getOpenPrice().min(dataPoint2.getClosePrice());
                    }
                    if (lowPrice.compareTo(lowPrice2) > 0) {
                        next = next4;
                        lowPrice = lowPrice2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        if (next != null) {
            DataPoint dataPoint3 = (DataPoint) next;
            ZERO = dataPoint3.getLowPrice();
            if (ZERO == null) {
                ZERO = dataPoint3.getOpenPrice().min(dataPoint3.getClosePrice());
            }
        } else {
            ZERO = null;
        }
        if (ZERO == null) {
            ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
        }
        this.lowPrice = ZERO;
        Iterator<T> it2 = chartData.getDataPoints().iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                DataPoint dataPoint4 = (DataPoint) next2;
                BigDecimal highPrice = dataPoint4.getHighPrice();
                if (highPrice == null) {
                    highPrice = dataPoint4.getOpenPrice().max(dataPoint4.getClosePrice());
                }
                do {
                    Object next5 = it2.next();
                    DataPoint dataPoint5 = (DataPoint) next5;
                    BigDecimal highPrice2 = dataPoint5.getHighPrice();
                    if (highPrice2 == null) {
                        highPrice2 = dataPoint5.getOpenPrice().max(dataPoint5.getClosePrice());
                    }
                    if (highPrice.compareTo(highPrice2) < 0) {
                        next2 = next5;
                        highPrice = highPrice2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        if (next2 != null) {
            DataPoint dataPoint6 = (DataPoint) next2;
            ZERO2 = dataPoint6.getHighPrice();
            if (ZERO2 == null) {
                ZERO2 = dataPoint6.getOpenPrice().max(dataPoint6.getClosePrice());
            }
        } else {
            ZERO2 = null;
        }
        if (ZERO2 == null) {
            ZERO2 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO2, "ZERO");
        }
        this.highPrice = ZERO2;
        BigDecimal baselinePrice = chartData.getBaselinePrice();
        if (baselinePrice != null) {
            this.highPrice = (BigDecimal) RangesKt.coerceAtLeast(this.highPrice, baselinePrice);
            this.lowPrice = (BigDecimal) RangesKt.coerceAtMost(this.lowPrice, baselinePrice);
        }
        Iterator<T> it3 = chartData.getDataPoints().iterator();
        if (it3.hasNext()) {
            next3 = it3.next();
            if (it3.hasNext()) {
                BigDecimal volume = ((DataPoint) next3).getVolume();
                if (volume == null) {
                    volume = BigDecimal.ZERO;
                }
                do {
                    Object next6 = it3.next();
                    BigDecimal volume2 = ((DataPoint) next6).getVolume();
                    if (volume2 == null) {
                        volume2 = BigDecimal.ZERO;
                    }
                    if (volume.compareTo(volume2) < 0) {
                        next3 = next6;
                        volume = volume2;
                    }
                } while (it3.hasNext());
            }
        } else {
            next3 = null;
        }
        if (next3 != null) {
            BigDecimal volume3 = ((DataPoint) next3).getVolume();
            if (volume3 == null) {
                volume3 = BigDecimal.ZERO;
            }
            ZERO3 = volume3;
        }
        if (ZERO3 == null) {
            ZERO3 = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO3, "ZERO");
        }
        this.maxVolume = ZERO3;
        if (baselinePrice != null) {
            Path path = this.baselinePath;
            float fTransformPriceToYValue = transformPriceToYValue(baselinePrice);
            path.reset();
            path.moveTo(0.0f, fTransformPriceToYValue);
            path.lineTo(getWidth(), fTransformPriceToYValue);
            return;
        }
        this.baselinePath.reset();
    }

    private final int getNearestIndex(float x) {
        ChartData chartData = this.chartData;
        if (chartData == null || chartData.getDataPoints().isEmpty()) {
            return -1;
        }
        float f = this.actualCandleWidth;
        float f2 = this.spacing;
        return RangesKt.coerceIn((int) ((x + (f2 / 2)) / (f + f2)), 0, chartData.getDataPoints().size() - 1);
    }

    private final void updateScrubXValue(float x) {
        int nearestIndex = getNearestIndex(x);
        setScrubXValue(getCenterXValueForIndex(nearestIndex));
        this.scrubRelay.accept(Integer.valueOf(nearestIndex));
    }

    private final float transformPriceToYValue(BigDecimal price) {
        float fFloatValue;
        if (Intrinsics.areEqual(this.highPrice, this.lowPrice)) {
            fFloatValue = 0.5f;
        } else {
            BigDecimal bigDecimalSubtract = price.subtract(this.lowPrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract, "subtract(...)");
            BigDecimal bigDecimalSubtract2 = this.highPrice.subtract(this.lowPrice);
            Intrinsics.checkNotNullExpressionValue(bigDecimalSubtract2, "subtract(...)");
            fFloatValue = BigDecimals7.safeDivide(bigDecimalSubtract, bigDecimalSubtract2).floatValue();
        }
        return ((1 - fFloatValue) * ((getHeight() - getPaddingTop()) - getPaddingBottom())) + getPaddingTop();
    }

    private final void recreateGlowEffect() {
        GlowEffect glowEffect = this.glowEffect;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        this.glowEffect = GlowEffect2.recreate(glowEffect, context, getWidth(), getHeight(), getResources().getDisplayMetrics().density, this.glowRadius);
    }

    /* compiled from: CandlestickChartView.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/common/view/CandlestickChartView$ChartData;", "", "dataPoints", "", "Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", "range", "", "baselinePrice", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/List;ILjava/math/BigDecimal;)V", "getDataPoints", "()Ljava/util/List;", "getRange", "()I", "getBaselinePrice", "()Ljava/math/BigDecimal;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class ChartData {
        public static final int $stable = 8;
        private final BigDecimal baselinePrice;
        private final List<DataPoint> dataPoints;
        private final int range;

        public ChartData(List<DataPoint> dataPoints, int i, BigDecimal bigDecimal) {
            Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
            this.dataPoints = dataPoints;
            this.range = i;
            this.baselinePrice = bigDecimal;
        }

        public /* synthetic */ ChartData(List list, int i, BigDecimal bigDecimal, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, i, (i2 & 4) != 0 ? null : bigDecimal);
        }

        public final List<DataPoint> getDataPoints() {
            return this.dataPoints;
        }

        public final int getRange() {
            return this.range;
        }

        public final BigDecimal getBaselinePrice() {
            return this.baselinePrice;
        }
    }

    /* compiled from: CandlestickChartView.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0011J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0011J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\\\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0011R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0011R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b(\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010$\u001a\u0004\b)\u0010\u0011R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0017R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b,\u0010\u0017¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", "", "Ljava/math/BigDecimal;", PnlTradeDetailComposable2.TEST_TAG_OPEN_PRICE, PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "highPrice", "lowPrice", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "j$/time/Instant", "beginAt", "endAt", "<init>", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/Instant;Lj$/time/Instant;)V", "", "isPositive", "()Z", "component1", "()Ljava/math/BigDecimal;", "component2", "component3", "component4", "component5", "component6", "()Lj$/time/Instant;", "component7", "copy", "(Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lj$/time/Instant;Lj$/time/Instant;)Lcom/robinhood/android/common/view/CandlestickChartView$DataPoint;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/math/BigDecimal;", "getOpenPrice", "getClosePrice", "getHighPrice", "getLowPrice", "getVolume", "Lj$/time/Instant;", "getBeginAt", "getEndAt", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final /* data */ class DataPoint {
        public static final int $stable = 8;
        private final Instant beginAt;
        private final BigDecimal closePrice;
        private final Instant endAt;
        private final BigDecimal highPrice;
        private final BigDecimal lowPrice;
        private final BigDecimal openPrice;
        private final BigDecimal volume;

        public static /* synthetic */ DataPoint copy$default(DataPoint dataPoint, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4, BigDecimal bigDecimal5, Instant instant, Instant instant2, int i, Object obj) {
            if ((i & 1) != 0) {
                bigDecimal = dataPoint.openPrice;
            }
            if ((i & 2) != 0) {
                bigDecimal2 = dataPoint.closePrice;
            }
            if ((i & 4) != 0) {
                bigDecimal3 = dataPoint.highPrice;
            }
            if ((i & 8) != 0) {
                bigDecimal4 = dataPoint.lowPrice;
            }
            if ((i & 16) != 0) {
                bigDecimal5 = dataPoint.volume;
            }
            if ((i & 32) != 0) {
                instant = dataPoint.beginAt;
            }
            if ((i & 64) != 0) {
                instant2 = dataPoint.endAt;
            }
            Instant instant3 = instant;
            Instant instant4 = instant2;
            BigDecimal bigDecimal6 = bigDecimal5;
            BigDecimal bigDecimal7 = bigDecimal3;
            return dataPoint.copy(bigDecimal, bigDecimal2, bigDecimal7, bigDecimal4, bigDecimal6, instant3, instant4);
        }

        /* renamed from: component1, reason: from getter */
        public final BigDecimal getOpenPrice() {
            return this.openPrice;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getClosePrice() {
            return this.closePrice;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getHighPrice() {
            return this.highPrice;
        }

        /* renamed from: component4, reason: from getter */
        public final BigDecimal getLowPrice() {
            return this.lowPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final BigDecimal getVolume() {
            return this.volume;
        }

        /* renamed from: component6, reason: from getter */
        public final Instant getBeginAt() {
            return this.beginAt;
        }

        /* renamed from: component7, reason: from getter */
        public final Instant getEndAt() {
            return this.endAt;
        }

        public final DataPoint copy(BigDecimal openPrice, BigDecimal closePrice, BigDecimal highPrice, BigDecimal lowPrice, BigDecimal volume, Instant beginAt, Instant endAt) {
            Intrinsics.checkNotNullParameter(openPrice, "openPrice");
            Intrinsics.checkNotNullParameter(closePrice, "closePrice");
            Intrinsics.checkNotNullParameter(beginAt, "beginAt");
            Intrinsics.checkNotNullParameter(endAt, "endAt");
            return new DataPoint(openPrice, closePrice, highPrice, lowPrice, volume, beginAt, endAt);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataPoint)) {
                return false;
            }
            DataPoint dataPoint = (DataPoint) other;
            return Intrinsics.areEqual(this.openPrice, dataPoint.openPrice) && Intrinsics.areEqual(this.closePrice, dataPoint.closePrice) && Intrinsics.areEqual(this.highPrice, dataPoint.highPrice) && Intrinsics.areEqual(this.lowPrice, dataPoint.lowPrice) && Intrinsics.areEqual(this.volume, dataPoint.volume) && Intrinsics.areEqual(this.beginAt, dataPoint.beginAt) && Intrinsics.areEqual(this.endAt, dataPoint.endAt);
        }

        public int hashCode() {
            int iHashCode = ((this.openPrice.hashCode() * 31) + this.closePrice.hashCode()) * 31;
            BigDecimal bigDecimal = this.highPrice;
            int iHashCode2 = (iHashCode + (bigDecimal == null ? 0 : bigDecimal.hashCode())) * 31;
            BigDecimal bigDecimal2 = this.lowPrice;
            int iHashCode3 = (iHashCode2 + (bigDecimal2 == null ? 0 : bigDecimal2.hashCode())) * 31;
            BigDecimal bigDecimal3 = this.volume;
            return ((((iHashCode3 + (bigDecimal3 != null ? bigDecimal3.hashCode() : 0)) * 31) + this.beginAt.hashCode()) * 31) + this.endAt.hashCode();
        }

        public String toString() {
            return "DataPoint(openPrice=" + this.openPrice + ", closePrice=" + this.closePrice + ", highPrice=" + this.highPrice + ", lowPrice=" + this.lowPrice + ", volume=" + this.volume + ", beginAt=" + this.beginAt + ", endAt=" + this.endAt + ")";
        }

        public DataPoint(BigDecimal openPrice, BigDecimal closePrice, BigDecimal bigDecimal, BigDecimal bigDecimal2, BigDecimal bigDecimal3, Instant beginAt, Instant endAt) {
            Intrinsics.checkNotNullParameter(openPrice, "openPrice");
            Intrinsics.checkNotNullParameter(closePrice, "closePrice");
            Intrinsics.checkNotNullParameter(beginAt, "beginAt");
            Intrinsics.checkNotNullParameter(endAt, "endAt");
            this.openPrice = openPrice;
            this.closePrice = closePrice;
            this.highPrice = bigDecimal;
            this.lowPrice = bigDecimal2;
            this.volume = bigDecimal3;
            this.beginAt = beginAt;
            this.endAt = endAt;
        }

        public final BigDecimal getOpenPrice() {
            return this.openPrice;
        }

        public final BigDecimal getClosePrice() {
            return this.closePrice;
        }

        public final BigDecimal getHighPrice() {
            return this.highPrice;
        }

        public final BigDecimal getLowPrice() {
            return this.lowPrice;
        }

        public final BigDecimal getVolume() {
            return this.volume;
        }

        public final Instant getBeginAt() {
            return this.beginAt;
        }

        public final Instant getEndAt() {
            return this.endAt;
        }

        public final boolean isPositive() {
            return this.openPrice.compareTo(this.closePrice) <= 0;
        }
    }
}
