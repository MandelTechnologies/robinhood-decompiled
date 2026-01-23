package com.robinhood.android.equitydetail.p123ui.leveltwo;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import androidx.core.content.res.TypedArray2;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.common.view.ScrubGestureDetector;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.models.p355ui.Pricebook;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.p409ui.drawing.TileDrawable;
import com.robinhood.utils.p409ui.view.Drawables;
import io.reactivex.Observable;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: Level2Graph.kt */
@Metadata(m3635d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\u0004\b\u0007\u0018\u0000 T2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002STB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u00100\u001a\u0002012\u0006\u00102\u001a\u000203H\u0017J(\u00104\u001a\u0002052\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0014J\u0010\u0010A\u001a\u0002052\u0006\u0010B\u001a\u00020CH\u0014J\u0010\u0010D\u001a\u0002052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018J\u0010\u0010E\u001a\u0002052\u0006\u0010<\u001a\u00020\"H\u0002J\b\u0010F\u001a\u000205H\u0002J\u0010\u0010G\u001a\u0002012\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u0002012\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u0002052\u0006\u0010H\u001a\u00020IH\u0016J\u0018\u0010L\u001a\u0002052\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"H\u0016J\b\u0010O\u001a\u000205H\u0016J\u0018\u0010R\u001a\u0002052\u0006\u0010M\u001a\u00020\"2\u0006\u0010N\u001a\u00020\"H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001cR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b \u0010\u001cR\u0012\u0010!\u001a\u0004\u0018\u00010\"X\u0082\u000e¢\u0006\u0004\n\u0002\u0010#R(\u0010$\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020' (*\n\u0012\u0004\u0012\u00020'\u0018\u00010&0&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001d\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0*¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u001c\u0010-\u001a\u0010\u0012\f\u0012\n (*\u0004\u0018\u00010\"0\"0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020\"0*¢\u0006\b\n\u0000\u001a\u0004\b/\u0010,R$\u0010<\u001a\u00020\"2\u0006\u0010;\u001a\u00020\"@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006U"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Graph;", "Landroid/view/View;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", "Lcom/robinhood/android/common/view/ScrubGestureDetector$ScrubListener;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "bidPathHelper", "Lcom/robinhood/android/equitydetail/ui/leveltwo/PathHelper;", "askPathHelper", "graphMatrix", "Landroid/graphics/Matrix;", "inverseGraphMatrix", "sourceRect", "Landroid/graphics/RectF;", "destRect", "bidRect", "askRect", "gestureDetector", "Lcom/robinhood/android/equitydetail/ui/leveltwo/ScrubScaleDetector;", "pricebook", "Lcom/robinhood/models/ui/Pricebook;", "boundsCenter", "Lcom/robinhood/models/util/Money;", "getBoundsCenter", "()Lcom/robinhood/models/util/Money;", "boundsLeft", "getBoundsLeft", "boundsRight", "getBoundsRight", "scrubbedX", "", "Ljava/lang/Float;", "scrubbedEntryRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Graph$ScrubEvent;", "kotlin.jvm.PlatformType", "scrubEvents", "Lio/reactivex/Observable;", "getScrubEvents", "()Lio/reactivex/Observable;", "zoomFractionRelay", "zoomFractionEvents", "getZoomFractionEvents", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "onSizeChanged", "", "w", "", "h", "oldw", "oldh", "value", "zoomFraction", "getZoomFraction", "()F", "setZoomFraction", "(F)V", "onDraw", "canvas", "Landroid/graphics/Canvas;", "bind", "onZoomFractionUpdated", "updateMatrix", "onScaleBegin", "detector", "Landroid/view/ScaleGestureDetector;", "onScale", "onScaleEnd", "onScrubbed", "x", "y", "onScrubEnded", "pointsArray", "", "updateScrubRelay", "ScrubEvent", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class Level2Graph extends View implements ScaleGestureDetector.OnScaleGestureListener, ScrubGestureDetector.ScrubListener {
    public static final float DEFAULT_ZOOM_FRACTION = 0.1f;
    private final PathHelper askPathHelper;
    private final RectF askRect;
    private final PathHelper bidPathHelper;
    private final RectF bidRect;
    private final RectF destRect;
    private final ScrubScaleDetector gestureDetector;
    private final Matrix graphMatrix;
    private final Matrix inverseGraphMatrix;
    private final float[] pointsArray;
    private Pricebook pricebook;
    private final Observable<Optional<ScrubEvent>> scrubEvents;
    private final BehaviorRelay<Optional<ScrubEvent>> scrubbedEntryRelay;
    private Float scrubbedX;
    private final RectF sourceRect;
    private float zoomFraction;
    private final Observable<Float> zoomFractionEvents;
    private final BehaviorRelay<Float> zoomFractionRelay;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public void onScaleEnd(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubStarted() {
        ScrubGestureDetector.ScrubListener.DefaultImpls.onScrubStarted(this);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Level2Graph(Context context, AttributeSet attrs) {
        super(context, attrs);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        PathHelper pathHelper = new PathHelper(true);
        this.bidPathHelper = pathHelper;
        PathHelper pathHelper2 = new PathHelper(false);
        this.askPathHelper = pathHelper2;
        this.graphMatrix = new Matrix();
        this.inverseGraphMatrix = new Matrix();
        this.sourceRect = new RectF();
        this.destRect = new RectF();
        this.bidRect = new RectF();
        this.askRect = new RectF();
        this.gestureDetector = new ScrubScaleDetector(context, this, this);
        BehaviorRelay<Optional<ScrubEvent>> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.scrubbedEntryRelay = behaviorRelayCreate;
        Observable<Optional<ScrubEvent>> observableHide = behaviorRelayCreate.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide, "hide(...)");
        this.scrubEvents = observableHide;
        BehaviorRelay<Float> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Float.valueOf(0.1f));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.zoomFractionRelay = behaviorRelayCreateDefault;
        Observable<Float> observableHide2 = behaviorRelayCreateDefault.hide();
        Intrinsics.checkNotNullExpressionValue(observableHide2, "hide(...)");
        this.zoomFractionEvents = observableHide2;
        int[] Level2Graph = C15314R.styleable.Level2Graph;
        Intrinsics.checkNotNullExpressionValue(Level2Graph, "Level2Graph");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, Level2Graph, 0, 0);
        pathHelper.setColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.Level2Graph_l2g_bidColor, 0));
        pathHelper2.setColor(typedArrayObtainStyledAttributes.getColor(C15314R.styleable.Level2Graph_l2g_askColor, 0));
        pathHelper.setStrokeWidth(typedArrayObtainStyledAttributes.getDimension(C15314R.styleable.Level2Graph_l2g_strokeWidth, 0.0f));
        pathHelper2.setStrokeWidth(pathHelper.getStrokeWidth());
        Integer numValueOf = Integer.valueOf(TypedArray2.getResourceIdOrThrow(typedArrayObtainStyledAttributes, C15314R.styleable.Level2Graph_l2g_bidFillDrawable));
        typedArrayObtainStyledAttributes.recycle();
        Drawable drawable = context.getDrawable(numValueOf.intValue());
        Intrinsics.checkNotNull(drawable);
        pathHelper.setFillTile(Drawables.toBitmap$default(drawable, 0, 0, Bitmap.Config.ALPHA_8, 3, null));
        pathHelper2.setFillTile(pathHelper.getFillTile());
        Drawable drawable2 = context.getDrawable(C15314R.drawable.level_2_graph_background_dot);
        Intrinsics.checkNotNull(drawable2);
        setBackground(new TileDrawable(drawable2, null, 2, null));
        setLayerType(2, null);
        this.zoomFraction = 0.1f;
        this.pointsArray = new float[]{0.0f, 0.0f};
    }

    public final Money getBoundsCenter() {
        Pricebook pricebook = this.pricebook;
        if (pricebook != null) {
            return pricebook.getMidpoint();
        }
        return null;
    }

    public final Money getBoundsLeft() {
        Money boundsCenter = getBoundsCenter();
        if (boundsCenter != null) {
            return boundsCenter.minus(boundsCenter.times(new BigDecimal(String.valueOf(this.zoomFraction))));
        }
        return null;
    }

    public final Money getBoundsRight() {
        Money boundsCenter = getBoundsCenter();
        if (boundsCenter != null) {
            return boundsCenter.plus(boundsCenter.times(new BigDecimal(String.valueOf(this.zoomFraction))));
        }
        return null;
    }

    public final Observable<Optional<ScrubEvent>> getScrubEvents() {
        return this.scrubEvents;
    }

    public final Observable<Float> getZoomFractionEvents() {
        return this.zoomFractionEvents;
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        getParent().requestDisallowInterceptTouchEvent(true);
        return this.gestureDetector.onTouchEvent(event);
    }

    @Override // android.view.View
    protected synchronized void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        float strokeWidth = this.bidPathHelper.getStrokeWidth() / 2.0f;
        float f = 0.0f - strokeWidth;
        float f2 = h;
        this.destRect.set(f, f, w + strokeWidth, f2 - strokeWidth);
        this.bidPathHelper.setViewHeight(f2);
        this.askPathHelper.setViewHeight(f2);
        updateMatrix();
    }

    public final float getZoomFraction() {
        return this.zoomFraction;
    }

    public final void setZoomFraction(float f) {
        float fCoerceIn = RangesKt.coerceIn(f, 0.01f, 0.75f);
        this.zoomFraction = fCoerceIn;
        onZoomFractionUpdated(fCoerceIn);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        this.bidPathHelper.draw(canvas);
        this.askPathHelper.draw(canvas);
        Float f = this.scrubbedX;
        if (f != null) {
            float fFloatValue = f.floatValue();
            if (fFloatValue <= getWidth() / 2.0f) {
                this.bidPathHelper.drawScrubLine(canvas, fFloatValue);
            } else {
                this.askPathHelper.drawScrubLine(canvas, fFloatValue);
            }
        }
    }

    public final synchronized void bind(Pricebook pricebook) {
        this.pricebook = pricebook;
        if (pricebook == null || !pricebook.hasEntries()) {
            this.bidPathHelper.clear();
            this.askPathHelper.clear();
            invalidate();
        } else {
            Companion companion = INSTANCE;
            List<Pricebook.Entry> bidsForDisplay = companion.getBidsForDisplay(pricebook);
            List<Pricebook.Entry> asksForDisplay = companion.getAsksForDisplay(pricebook);
            this.bidPathHelper.updateEntries(bidsForDisplay);
            this.askPathHelper.updateEntries(asksForDisplay);
            onZoomFractionUpdated(this.zoomFraction);
        }
    }

    private final void onZoomFractionUpdated(float zoomFraction) {
        Money midpoint;
        BigDecimal decimalValue;
        this.zoomFractionRelay.accept(Float.valueOf(zoomFraction));
        Pricebook pricebook = this.pricebook;
        if (pricebook == null || (midpoint = pricebook.getMidpoint()) == null || (decimalValue = midpoint.getDecimalValue()) == null) {
            return;
        }
        float fFloatValue = decimalValue.floatValue();
        Companion companion = INSTANCE;
        float fMax = (zoomFraction * fFloatValue) / Math.max(companion.delta(pricebook.getBids()).getDecimalValue().floatValue(), companion.delta(pricebook.getAsks()).getDecimalValue().floatValue());
        this.bidPathHelper.updateZoom(fMax, this.bidRect);
        this.askPathHelper.updateZoom(fMax, this.askRect);
        this.sourceRect.set(this.bidRect);
        this.sourceRect.union(this.askRect);
        updateMatrix();
    }

    private final void updateMatrix() {
        this.graphMatrix.setRectToRect(this.sourceRect, this.destRect, Matrix.ScaleToFit.FILL);
        this.graphMatrix.postScale(1.0f, -1.0f, this.destRect.width() / 2.0f, this.destRect.height() / 2.0f);
        this.graphMatrix.invert(this.inverseGraphMatrix);
        this.bidPathHelper.onMatrixUpdated(this.graphMatrix);
        this.askPathHelper.onMatrixUpdated(this.graphMatrix);
        invalidate();
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScaleBegin(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        getParent().requestDisallowInterceptTouchEvent(true);
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public boolean onScale(ScaleGestureDetector detector) {
        Intrinsics.checkNotNullParameter(detector, "detector");
        setZoomFraction(this.zoomFraction * (2.0f - detector.getScaleFactor()));
        return true;
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubbed(float x, float y) {
        getParent().requestDisallowInterceptTouchEvent(true);
        this.scrubbedX = Float.valueOf(x);
        invalidate();
        updateScrubRelay(x, y);
    }

    @Override // com.robinhood.android.common.view.ScrubGestureDetector.ScrubListener
    public void onScrubEnded() {
        this.scrubbedX = null;
        invalidate();
        this.scrubbedEntryRelay.accept(Optional2.INSTANCE);
    }

    /* compiled from: Level2Graph.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\bHÆ\u0003J1\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\b2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Graph$ScrubEvent;", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "Lcom/robinhood/models/util/Money;", "cumulativeShares", "Ljava/math/BigDecimal;", "cumulativeValue", "isBid", "", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/math/BigDecimal;Lcom/robinhood/models/util/Money;Z)V", "getPrice", "()Lcom/robinhood/models/util/Money;", "getCumulativeShares", "()Ljava/math/BigDecimal;", "getCumulativeValue", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ScrubEvent {
        public static final int $stable = 8;
        private final BigDecimal cumulativeShares;
        private final Money cumulativeValue;
        private final boolean isBid;
        private final Money price;

        public static /* synthetic */ ScrubEvent copy$default(ScrubEvent scrubEvent, Money money, BigDecimal bigDecimal, Money money2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                money = scrubEvent.price;
            }
            if ((i & 2) != 0) {
                bigDecimal = scrubEvent.cumulativeShares;
            }
            if ((i & 4) != 0) {
                money2 = scrubEvent.cumulativeValue;
            }
            if ((i & 8) != 0) {
                z = scrubEvent.isBid;
            }
            return scrubEvent.copy(money, bigDecimal, money2, z);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getPrice() {
            return this.price;
        }

        /* renamed from: component2, reason: from getter */
        public final BigDecimal getCumulativeShares() {
            return this.cumulativeShares;
        }

        /* renamed from: component3, reason: from getter */
        public final Money getCumulativeValue() {
            return this.cumulativeValue;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsBid() {
            return this.isBid;
        }

        public final ScrubEvent copy(Money price, BigDecimal cumulativeShares, Money cumulativeValue, boolean isBid) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(cumulativeShares, "cumulativeShares");
            Intrinsics.checkNotNullParameter(cumulativeValue, "cumulativeValue");
            return new ScrubEvent(price, cumulativeShares, cumulativeValue, isBid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScrubEvent)) {
                return false;
            }
            ScrubEvent scrubEvent = (ScrubEvent) other;
            return Intrinsics.areEqual(this.price, scrubEvent.price) && Intrinsics.areEqual(this.cumulativeShares, scrubEvent.cumulativeShares) && Intrinsics.areEqual(this.cumulativeValue, scrubEvent.cumulativeValue) && this.isBid == scrubEvent.isBid;
        }

        public int hashCode() {
            return (((((this.price.hashCode() * 31) + this.cumulativeShares.hashCode()) * 31) + this.cumulativeValue.hashCode()) * 31) + Boolean.hashCode(this.isBid);
        }

        public String toString() {
            return "ScrubEvent(price=" + this.price + ", cumulativeShares=" + this.cumulativeShares + ", cumulativeValue=" + this.cumulativeValue + ", isBid=" + this.isBid + ")";
        }

        public ScrubEvent(Money price, BigDecimal cumulativeShares, Money cumulativeValue, boolean z) {
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(cumulativeShares, "cumulativeShares");
            Intrinsics.checkNotNullParameter(cumulativeValue, "cumulativeValue");
            this.price = price;
            this.cumulativeShares = cumulativeShares;
            this.cumulativeValue = cumulativeValue;
            this.isBid = z;
        }

        public final Money getPrice() {
            return this.price;
        }

        public final BigDecimal getCumulativeShares() {
            return this.cumulativeShares;
        }

        public final Money getCumulativeValue() {
            return this.cumulativeValue;
        }

        public final boolean isBid() {
            return this.isBid;
        }
    }

    private final void updateScrubRelay(float x, float y) {
        Object next;
        Money moneyTimes;
        Pricebook pricebook = this.pricebook;
        if (pricebook == null) {
            return;
        }
        boolean z = x <= ((float) getWidth()) / 2.0f;
        float[] fArr = this.pointsArray;
        fArr[0] = x;
        fArr[1] = y;
        this.inverseGraphMatrix.mapPoints(fArr);
        float f = this.pointsArray[0];
        List<Pricebook.Entry> bids = z ? pricebook.getBids() : pricebook.getAsks();
        Iterator<T> it = bids.iterator();
        if (it.hasNext()) {
            next = it.next();
            if (it.hasNext()) {
                float fAbs = Math.abs(((Pricebook.Entry) next).getPriceFloat() - f);
                do {
                    Object next2 = it.next();
                    float fAbs2 = Math.abs(((Pricebook.Entry) next2).getPriceFloat() - f);
                    if (Float.compare(fAbs, fAbs2) > 0) {
                        next = next2;
                        fAbs = fAbs2;
                    }
                } while (it.hasNext());
            }
        } else {
            next = null;
        }
        Intrinsics.checkNotNull(next);
        Pricebook.Entry entry = (Pricebook.Entry) next;
        List<Pricebook.Entry> listSubList = bids.subList(0, bids.indexOf(entry) + 1);
        Iterator<T> it2 = listSubList.iterator();
        if (it2.hasNext()) {
            Pricebook.Entry entry2 = (Pricebook.Entry) it2.next();
            moneyTimes = entry2.getPrice().times(entry2.getQuantity());
            while (it2.hasNext()) {
                Pricebook.Entry entry3 = (Pricebook.Entry) it2.next();
                moneyTimes = moneyTimes.plus(entry3.getPrice().times(entry3.getQuantity()));
            }
        } else {
            moneyTimes = null;
        }
        if (moneyTimes == null) {
            BigDecimal ZERO = BigDecimal.ZERO;
            Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
            moneyTimes = Money3.toMoney$default(ZERO, null, 1, null);
        }
        Money price = entry.getPrice();
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            bigDecimalValueOf = bigDecimalValueOf.add(((Pricebook.Entry) it3.next()).getQuantity());
            Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        this.scrubbedEntryRelay.accept(Optional3.asOptional(new ScrubEvent(price, bigDecimalValueOf, moneyTimes, z)));
    }

    /* compiled from: Level2Graph.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\t0\bJ\u0012\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u000bH\u0002J\u0012\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/leveltwo/Level2Graph$Companion;", "", "<init>", "()V", "DEFAULT_ZOOM_FRACTION", "", "delta", "Lcom/robinhood/models/util/Money;", "", "Lcom/robinhood/models/ui/Pricebook$Entry;", "getBidsForDisplay", "Lcom/robinhood/models/ui/Pricebook;", "getAsksForDisplay", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Money delta(List<Pricebook.Entry> list) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            return ((Pricebook.Entry) CollectionsKt.first((List) list)).getPrice().minus(((Pricebook.Entry) CollectionsKt.last((List) list)).getPrice()).abs();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Pricebook.Entry> getBidsForDisplay(Pricebook pricebook) {
            Money moneyDelta = delta(pricebook.getBids());
            Money moneyDelta2 = delta(pricebook.getAsks());
            if (moneyDelta2.compareTo(moneyDelta) > 0) {
                List<Pricebook.Entry> bids = pricebook.getBids();
                Money moneyMinus = ((Pricebook.Entry) CollectionsKt.first((List) pricebook.getBids())).getPrice().minus(moneyDelta2);
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return CollectionsKt.plus((Collection<? extends Pricebook.Entry>) bids, new Pricebook.Entry(moneyMinus, ZERO));
            }
            return pricebook.getBids();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<Pricebook.Entry> getAsksForDisplay(Pricebook pricebook) {
            Money moneyDelta = delta(pricebook.getBids());
            if (moneyDelta.compareTo(delta(pricebook.getAsks())) > 0) {
                List<Pricebook.Entry> asks = pricebook.getAsks();
                Money moneyPlus = ((Pricebook.Entry) CollectionsKt.first((List) pricebook.getAsks())).getPrice().plus(moneyDelta);
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return CollectionsKt.plus((Collection<? extends Pricebook.Entry>) asks, new Pricebook.Entry(moneyPlus, ZERO));
            }
            return pricebook.getAsks();
        }
    }
}
