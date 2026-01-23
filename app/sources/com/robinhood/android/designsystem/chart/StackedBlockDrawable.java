package com.robinhood.android.designsystem.chart;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.ColorUtils;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.utils.p409ui.color.GammaEvaluator;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;
import kotlin.ranges.RangesKt;

/* compiled from: StackedBlockDrawable.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 \u0083\u00012\u00020\u0001:\u000b}~\u007f\u0080\u0001\u0081\u0001\u0082\u0001\u0083\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010=\u001a\u00020>J\u001d\u0010?\u001a\u0004\u0018\u00010\u001d2\u0006\u0010@\u001a\u00020)2\u0006\u0010A\u001a\u00020)¢\u0006\u0002\u0010BJ\u0010\u0010C\u001a\u00020>2\u0006\u0010D\u001a\u00020EH\u0016J\u0017\u0010F\u001a\u0004\u0018\u00010)2\u0006\u0010G\u001a\u00020\u0016H\u0002¢\u0006\u0002\u0010HJ1\u0010I\u001a\u00020\u001d2\u0006\u0010J\u001a\u00020\u001d2\b\u0010K\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010L\u001a\u00020)H\u0003¢\u0006\u0002\u0010MJ?\u0010N\u001a\u00020)2\u0006\u0010J\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010\u001d2\u0006\u0010P\u001a\u00020)2\u0006\u0010Q\u001a\u00020)2\u0006\u0010R\u001a\u00020S2\u0006\u0010L\u001a\u00020)H\u0002¢\u0006\u0002\u0010TJ[\u0010U\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010V\u001a\u00020)2\u0006\u0010W\u001a\u00020)2\u0006\u0010J\u001a\u00020\u001d2\b\u0010O\u001a\u0004\u0018\u00010\u001d2\b\u0010X\u001a\u0004\u0018\u00010\u001d2\u0006\u0010Y\u001a\u00020\u001d2\b\u0010Z\u001a\u0004\u0018\u00010[2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0002\u0010\\J\u0018\u0010]\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010P\u001a\u00020)H\u0002J \u0010^\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010_\u001a\u00020)H\u0002J0\u0010`\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010_\u001a\u00020)2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u000204H\u0002J?\u0010d\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010_\u001a\u00020)2\u0006\u0010J\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0006\u0010L\u001a\u00020)H\u0002¢\u0006\u0002\u0010eJ0\u0010h\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010i\u001a\u00020)2\u0006\u0010_\u001a\u00020)2\u0006\u0010j\u001a\u00020bH\u0002J8\u0010k\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010i\u001a\u00020)2\u0006\u0010_\u001a\u00020)2\u0006\u0010a\u001a\u00020b2\u0006\u0010c\u001a\u000204H\u0002J\u0018\u0010l\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)H\u0002J \u0010m\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010a\u001a\u00020bH\u0002J(\u0010n\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010o\u001a\u00020)2\u0006\u0010p\u001a\u00020)2\u0006\u0010a\u001a\u00020bH\u0002J8\u0010q\u001a\u00020>2\u0006\u0010D\u001a\u00020E2\u0006\u0010W\u001a\u00020)2\u0006\u0010_\u001a\u00020)2\u0006\u0010r\u001a\u00020)2\u0006\u0010s\u001a\u00020[2\u0006\u0010L\u001a\u00020)H\u0002J\u0010\u0010t\u001a\u00020>2\u0006\u0010u\u001a\u00020vH\u0014J\u0010\u0010w\u001a\u00020>2\u0006\u0010x\u001a\u00020\u001dH\u0016J\u0012\u0010y\u001a\u00020>2\b\u0010z\u001a\u0004\u0018\u00010{H\u0016J\b\u0010|\u001a\u00020\u001dH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00060\u000bR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\f\u001a\u00060\rR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00060\u000fR\u00020\u0000X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0005@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R0\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$*\u0004\b\u001f\u0010 R/\u0010%\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$*\u0004\b&\u0010 R-\u0010*\u001a\u00020)2\b\b\u0001\u0010\u001c\u001a\u00020)8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/*\u0004\b+\u0010 R-\u00100\u001a\u00020)2\b\b\u0001\u0010\u001c\u001a\u00020)8G@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b2\u0010-\"\u0004\b3\u0010/*\u0004\b1\u0010 R+\u00105\u001a\u0002042\u0006\u0010\u001c\u001a\u0002048F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b5\u00107\"\u0004\b8\u00109*\u0004\b6\u0010 R\u001a\u0010:\u001a\u000204X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00107\"\u0004\b<\u00109R\u000e\u0010f\u001a\u00020gX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0084\u0001"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;", "Landroid/graphics/drawable/Drawable;", "callback", "Landroid/graphics/drawable/Drawable$Callback;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;", "<init>", "(Landroid/graphics/drawable/Drawable$Callback;Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;)V", "model", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Model;", "dimensions", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Dimensions;", "indices", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Indices;", "animationState", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$AnimationState;", "value", "getConfiguration", "()Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;", "setConfiguration", "(Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;)V", "", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "regions", "getRegions", "()Ljava/util/List;", "setRegions", "(Ljava/util/List;)V", "<set-?>", "", "selectedIndex", "getSelectedIndex$delegate", "(Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;)Ljava/lang/Object;", "getSelectedIndex", "()Ljava/lang/Integer;", "setSelectedIndex", "(Ljava/lang/Integer;)V", "scrubbingIndex", "getScrubbingIndex$delegate", "getScrubbingIndex", "setScrubbingIndex", "", "scrubbingAnimationProgress", "getScrubbingAnimationProgress$delegate", "getScrubbingAnimationProgress", "()F", "setScrubbingAnimationProgress", "(F)V", "segmentsAnimationProgress", "getSegmentsAnimationProgress$delegate", "getSegmentsAnimationProgress", "setSegmentsAnimationProgress", "", "isAnimatingSegments", "isAnimatingSegments$delegate", "()Z", "setAnimatingSegments", "(Z)V", "showSegments", "getShowSegments", "setShowSegments", "resetIndices", "", "calculateIndex", "x", "y", "(FF)Ljava/lang/Integer;", "draw", "canvas", "Landroid/graphics/Canvas;", "calculateWeight", "region", "(Lcom/robinhood/android/designsystem/chart/BlockRegion;)Ljava/lang/Float;", "calculateColor", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "scrubIndex", "animationProgress", "(ILjava/lang/Integer;Ljava/lang/Integer;F)I", "calculateStartingLocation", "indexSelected", "percentageStartX", "sidePadding", "regionState", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$RegionState;", "(ILjava/lang/Integer;FFLcom/robinhood/android/designsystem/chart/StackedBlockDrawable$RegionState;F)F", "drawBlock", "weight", "startRectX", "previousIndex", "firstVisibleIndex", "sectorLabel", "", "(Landroid/graphics/Canvas;FFILjava/lang/Integer;Ljava/lang/Integer;ILjava/lang/String;F)V", "drawBlockOutline", "drawRectangle", "rectWidth", "drawRectOutline", "linePaint", "Landroid/graphics/Paint;", "hideSideBorders", "drawShadow", "(Landroid/graphics/Canvas;FFILjava/lang/Integer;F)V", "workPath", "Landroid/graphics/Path;", "drawVerticalRhombus", "startRectY", "fillPaint", "drawTopRhombusOutline", "drawSideRhombus", "drawSideRhombusOutline", "drawSegmentOutline", "endRectX", "endRectY", "drawText", "topY", "text", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "getOpacity", "Configuration", "Model", "Indices", "AnimationState", "Dimensions", "RegionState", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class StackedBlockDrawable extends Drawable {
    public static final float DEFAULT_TOTAL_WIDTH_PROPORTION = 0.8f;
    public static final double MINIMUM_OUTLINE_WEIGHT = 0.01d;
    public static final int SHADOW_SPEED_MULTIPLIER = 6;
    public static final int TEXT_SPEED_MULTIPLIER = 6;
    private final AnimationState animationState;
    private Configuration configuration;
    private final Dimensions dimensions;
    private final Indices indices;
    private Model model;
    private boolean showSegments;
    private final Path workPath;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public StackedBlockDrawable(Drawable.Callback callback, Configuration configuration) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.model = new Model(CollectionsKt.emptyList());
        this.dimensions = new Dimensions();
        this.indices = new Indices();
        this.animationState = new AnimationState();
        this.configuration = configuration;
        this.workPath = new Path();
        setCallback(callback);
    }

    public final Configuration getConfiguration() {
        return this.configuration;
    }

    public final void setConfiguration(Configuration value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(this.configuration, value)) {
            return;
        }
        this.configuration = value;
        invalidateSelf();
    }

    public final List<BlockRegion> getRegions() {
        return this.model.getRegions();
    }

    public final void setRegions(List<BlockRegion> value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (Intrinsics.areEqual(value, this.model.getRegions())) {
            return;
        }
        this.model = new Model(value);
        invalidateSelf();
    }

    public final Integer getSelectedIndex() {
        return this.indices.getSelectedIndex();
    }

    public final void setSelectedIndex(Integer num) {
        this.indices.setSelectedIndex(num);
    }

    public final Integer getScrubbingIndex() {
        return this.indices.getScrubbingIndex();
    }

    public final void setScrubbingIndex(Integer num) {
        this.indices.setScrubbingIndex(num);
    }

    public final float getScrubbingAnimationProgress() {
        return this.animationState.getScrubbingAnimationProgress();
    }

    public final void setScrubbingAnimationProgress(float f) {
        this.animationState.setScrubbingAnimationProgress(f);
    }

    public final float getSegmentsAnimationProgress() {
        return this.animationState.getHoldingsAnimationProgress();
    }

    public final void setSegmentsAnimationProgress(float f) {
        this.animationState.setHoldingsAnimationProgress(f);
    }

    public final boolean isAnimatingSegments() {
        return this.animationState.getIsAnimatingHoldings();
    }

    public final void setAnimatingSegments(boolean z) {
        this.animationState.setAnimatingHoldings(z);
    }

    public final boolean getShowSegments() {
        return this.showSegments;
    }

    public final void setShowSegments(boolean z) {
        this.showSegments = z;
    }

    public final void resetIndices() {
        this.indices.reset();
    }

    public final Integer calculateIndex(float x, float y) {
        int i;
        int iNextIndex;
        Dimensions dimensions = this.dimensions;
        if (y < dimensions.getStartRectY() - dimensions.getYDelta()) {
            return null;
        }
        List<RegionState> states = this.model.getStates();
        Iterator<RegionState> it = states.iterator();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = -1;
            if (!it.hasNext()) {
                i3 = -1;
                break;
            }
            if (!(it.next().getBounds().getStart().floatValue() == Float.NEGATIVE_INFINITY)) {
                break;
            }
            i3++;
        }
        ListIterator<RegionState> listIterator = states.listIterator(states.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (!(listIterator.previous().getBounds().getEndInclusive().floatValue() == Float.NEGATIVE_INFINITY)) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (i3 != -1 && x <= states.get(i3).getBounds().getStart().floatValue()) {
            return Integer.valueOf(i3);
        }
        if (iNextIndex != -1 && x >= states.get(iNextIndex).getBounds().getEndInclusive().floatValue()) {
            return Integer.valueOf(iNextIndex);
        }
        for (RegionState regionState : states) {
            int index = regionState.getIndex();
            Ranges3<Float> bounds = regionState.getBounds();
            RegionState regionState2 = (RegionState) CollectionsKt.getOrNull(states, index - 1);
            Ranges3<Float> bounds2 = regionState2 != null ? regionState2.getBounds() : null;
            RegionState regionState3 = (RegionState) CollectionsKt.getOrNull(states, index + 1);
            Ranges3<Float> bounds3 = regionState3 != null ? regionState3.getBounds() : null;
            if ((x >= bounds.getStart().floatValue() && x <= bounds.getEndInclusive().floatValue()) || ((bounds2 != null && x > bounds2.getEndInclusive().floatValue() && x < bounds.getStart().floatValue()) || (bounds3 != null && x > bounds.getEndInclusive().floatValue() && x < bounds3.getStart().floatValue()))) {
                i = i2;
                break;
            }
            i2++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (numValueOf.intValue() >= 0) {
            return numValueOf;
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        int i;
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Configuration configuration = this.configuration;
        Model model = this.model;
        float f = 1.0f;
        if (isAnimatingSegments() || this.showSegments) {
            float fMax = Math.max(getSegmentsAnimationProgress() * 1.0f, model.getTotalSegmentsWeight());
            if (fMax != 1.0f) {
                drawBlockOutline(canvas, fMax);
            }
            f = fMax;
        }
        List<RegionState> states = model.getStates();
        Iterator<RegionState> it = states.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (!(it.next().getBounds().getStart().floatValue() == Float.NEGATIVE_INFINITY)) {
                i = i2;
                break;
            }
            i2++;
        }
        int lastIndex = CollectionsKt.getLastIndex(states);
        while (-1 < lastIndex) {
            RegionState regionState = states.get(lastIndex);
            BlockRegion region = regionState.getRegion();
            Float fCalculateWeight = calculateWeight(region);
            if (fCalculateWeight == null) {
                regionState.setBounds(RangesKt.rangeTo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY));
            } else {
                int iCalculateColor = calculateColor(lastIndex, getScrubbingIndex(), getSelectedIndex(), getScrubbingAnimationProgress());
                configuration.getRectPaint().setColor(iCalculateColor);
                configuration.getTopRhombusPaint().setColor(iCalculateColor);
                configuration.getSideRhombusPaint().setColor(ColorUtils.blendARGB(iCalculateColor, -16777216, 0.1f));
                float fMax2 = lastIndex != 0 ? Math.max(f - fCalculateWeight.floatValue(), 0.0f) : 0.0f;
                int i3 = lastIndex;
                drawBlock(canvas, fCalculateWeight.floatValue(), calculateStartingLocation(lastIndex, getSelectedIndex(), fMax2, this.dimensions.getSideSpace(), states.get(lastIndex), getScrubbingAnimationProgress()), i3, getScrubbingIndex(), this.indices.getPreviousIndex(), i, this.showSegments ? region.getSegmentLabel() : region.getLabel(), getScrubbingAnimationProgress());
                lastIndex = i3;
                f = fMax2;
            }
            lastIndex--;
        }
    }

    private final Float calculateWeight(BlockRegion region) {
        float segmentsAnimationProgress = getSegmentsAnimationProgress();
        float segmentTotal = region.getSegmentTotal();
        if (region.getWeight() == 0.0f) {
            if (segmentsAnimationProgress >= 1.0f) {
                return null;
            }
            segmentTotal *= 1 - segmentsAnimationProgress;
        }
        float fMax = Math.max(region.getWeight() * segmentsAnimationProgress, segmentTotal);
        if (fMax <= 0.0f) {
            return null;
        }
        return Float.valueOf(fMax);
    }

    private final int calculateColor(int index, Integer scrubIndex, Integer selectedIndex, float animationProgress) {
        Configuration configuration = this.configuration;
        RegionState regionState = this.model.getStates().get(index);
        Integer defaultColor = regionState.getRegion().getDefaultColor();
        int iIntValue = defaultColor != null ? defaultColor.intValue() : configuration.getDefaultRegionColor();
        int currentColor = regionState.getCurrentColor() != 0 ? regionState.getCurrentColor() : iIntValue;
        if (scrubIndex == null || index != scrubIndex.intValue()) {
            if (scrubIndex == null && selectedIndex == null) {
                iIntValue = GammaEvaluator.INSTANCE.evaluate(animationProgress, currentColor, iIntValue).intValue();
            } else if (selectedIndex != null && index != selectedIndex.intValue()) {
                iIntValue = GammaEvaluator.INSTANCE.evaluate(animationProgress, currentColor, configuration.getUnselectedColor()).intValue();
            } else {
                iIntValue = configuration.getUnselectedColor();
            }
        }
        regionState.setCurrentColor(iIntValue);
        return iIntValue;
    }

    private final float calculateStartingLocation(int index, Integer indexSelected, float percentageStartX, float sidePadding, RegionState regionState, float animationProgress) {
        Dimensions dimensions = this.dimensions;
        float width = ((dimensions.getWidth() * percentageStartX) + sidePadding) - dimensions.getXDelta();
        float fFloatValue = regionState.getBounds().getStart().floatValue();
        if (fFloatValue != Float.NEGATIVE_INFINITY && !isAnimatingSegments()) {
            if (!this.showSegments && indexSelected != null && index >= 0 && index < indexSelected.intValue()) {
                float f = fFloatValue + ((-1) * animationProgress * sidePadding);
                float f2 = width - sidePadding;
                return f >= f2 ? f : f2;
            }
            if (!this.showSegments && indexSelected != null && indexSelected.intValue() < index) {
                float f3 = fFloatValue + (animationProgress * sidePadding);
                float f4 = width + sidePadding;
                return f3 <= f4 ? f3 : f4;
            }
            float f5 = sidePadding * animationProgress;
            float f6 = fFloatValue - f5;
            if (f6 > width) {
                return f6;
            }
            float f7 = fFloatValue + f5;
            if (f7 < width) {
                return f7;
            }
        }
        return width;
    }

    private final void drawBlock(Canvas canvas, float weight, float startRectX, int index, Integer indexSelected, Integer previousIndex, int firstVisibleIndex, String sectorLabel, float scrubbingAnimationProgress) {
        int lineColor;
        StackedBlockDrawable stackedBlockDrawable;
        Canvas canvas2;
        float segmentTotal;
        Configuration configuration = this.configuration;
        Paint linePaint = configuration.getLinePaint();
        Paint topRhombusPaint = configuration.getTopRhombusPaint();
        Dimensions dimensions = this.dimensions;
        float width = dimensions.getWidth();
        float startRectY = dimensions.getStartRectY();
        float f = width * weight;
        if (indexSelected == null || index == indexSelected.intValue()) {
            lineColor = configuration.getLineColor();
        } else {
            lineColor = configuration.getUnselectedStrokeColor();
        }
        linePaint.setColor(lineColor);
        drawShadow(canvas, startRectX, f, index, indexSelected, scrubbingAnimationProgress);
        boolean z = false;
        boolean z2 = firstVisibleIndex == -1 || isAnimatingSegments() || index == firstVisibleIndex || (indexSelected != null && indexSelected.intValue() <= index && index <= indexSelected.intValue() + 1) || (previousIndex != null && previousIndex.intValue() <= index && index <= previousIndex.intValue() + 1);
        if (z2) {
            drawSideRhombus(canvas, startRectX);
        }
        drawRectangle(canvas, startRectX, f);
        drawVerticalRhombus(canvas, startRectX, startRectY, f, topRhombusPaint);
        List<RegionState> states = this.model.getStates();
        boolean z3 = ((double) weight) < 0.01d && index != CollectionsKt.getLastIndex(states) && (indexSelected == null || index != indexSelected.intValue()) && this.showSegments;
        if (z3 && index != firstVisibleIndex) {
            z = true;
        }
        if (z2 && !z) {
            drawSideRhombusOutline(canvas, startRectX, linePaint);
        }
        drawRectOutline(canvas, startRectX, f, linePaint, z3);
        drawTopRhombusOutline(canvas, startRectX, startRectY, f, linePaint, z3);
        if (indexSelected == null || indexSelected.intValue() != index || sectorLabel == null || isAnimatingSegments()) {
            stackedBlockDrawable = this;
            canvas2 = canvas;
            segmentTotal = startRectX;
        } else {
            stackedBlockDrawable = this;
            canvas2 = canvas;
            segmentTotal = startRectX;
            stackedBlockDrawable.drawText(canvas2, segmentTotal, f, startRectY - (dimensions.getRectHeight() / 1.75f), sectorLabel, scrubbingAnimationProgress);
        }
        RegionState regionState = states.get(index);
        regionState.setBounds(RangesKt.rangeTo(segmentTotal, segmentTotal + f));
        if (stackedBlockDrawable.showSegments) {
            Iterator<T> it = regionState.getRegion().getSegmentWeights().iterator();
            while (it.hasNext()) {
                float fFloatValue = ((Number) it.next()).floatValue();
                if (fFloatValue >= 0.01d) {
                    stackedBlockDrawable.drawSegmentOutline(canvas2, segmentTotal, startRectY, linePaint);
                }
                segmentTotal += (fFloatValue / regionState.getRegion().getSegmentTotal()) * f;
            }
        }
    }

    private final void drawBlockOutline(Canvas canvas, float percentageStartX) {
        Configuration configuration = this.configuration;
        Paint innerOutlinePaint = configuration.getInnerOutlinePaint();
        Paint outerOutlinePaint = configuration.getOuterOutlinePaint();
        Dimensions dimensions = this.dimensions;
        float sideSpace = dimensions.getSideSpace();
        float xDelta = dimensions.getXDelta();
        float width = dimensions.getWidth();
        float startRectY = dimensions.getStartRectY();
        float rectHeight = dimensions.getRectHeight();
        float f = sideSpace - xDelta;
        float f2 = width * percentageStartX;
        drawSideRhombusOutline(canvas, width + f, innerOutlinePaint);
        drawTopRhombusOutline(canvas, f2 + f, rectHeight + startRectY, width - f2, innerOutlinePaint, false);
        drawSideRhombusOutline(canvas, f, outerOutlinePaint);
        drawRectOutline(canvas, f, width, outerOutlinePaint, false);
        drawTopRhombusOutline(canvas, f, startRectY, width, outerOutlinePaint, false);
    }

    private final void drawRectangle(Canvas canvas, float startRectX, float rectWidth) {
        Dimensions dimensions = this.dimensions;
        float startRectY = dimensions.getStartRectY();
        canvas.drawRect(startRectX, startRectY, startRectX + rectWidth, startRectY + dimensions.getRectHeight(), this.configuration.getRectPaint());
    }

    private final void drawRectOutline(Canvas canvas, float startRectX, float rectWidth, Paint linePaint, boolean hideSideBorders) {
        Dimensions dimensions = this.dimensions;
        float startRectY = dimensions.getStartRectY();
        float rectHeight = dimensions.getRectHeight();
        if (!hideSideBorders) {
            float f = startRectY + rectHeight;
            canvas.drawLine(startRectX, startRectY, startRectX, f, linePaint);
            float f2 = startRectX + rectWidth;
            canvas.drawLine(f2, startRectY, f2, f, linePaint);
        }
        float f3 = startRectX + rectWidth;
        canvas.drawLine(startRectX, startRectY, f3, startRectY, linePaint);
        float f4 = startRectY + rectHeight;
        canvas.drawLine(f3, f4, startRectX, f4, linePaint);
    }

    private final void drawShadow(Canvas canvas, float startRectX, float rectWidth, int index, Integer selectedIndex, float animationProgress) {
        Integer previousIndex;
        Configuration configuration = this.configuration;
        Paint shadowPaint = configuration.getShadowPaint();
        int shadowColor = configuration.getShadowColor();
        int transparentShadowColor = configuration.getTransparentShadowColor();
        boolean z = (selectedIndex != null && index == selectedIndex.intValue()) || (selectedIndex == null && (previousIndex = this.indices.getPreviousIndex()) != null && previousIndex.intValue() == index);
        boolean z2 = (selectedIndex == null || selectedIndex.intValue() == index) ? false : true;
        if (!z) {
            shadowColor = z2 ? transparentShadowColor : GammaEvaluator.INSTANCE.evaluate(Math.min(6 * animationProgress, 1.0f), transparentShadowColor, shadowColor).intValue();
        }
        shadowPaint.setColor(shadowColor);
        Dimensions dimensions = this.dimensions;
        drawVerticalRhombus(canvas, startRectX, dimensions.getShadowDepth() + dimensions.getStartRectY() + dimensions.getRectHeight(), rectWidth, shadowPaint);
    }

    private final void drawVerticalRhombus(Canvas canvas, float startRectX, float startRectY, float rectWidth, Paint fillPaint) {
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float yDelta = dimensions.getYDelta();
        Path path = this.workPath;
        path.reset();
        path.moveTo(startRectX, startRectY);
        float f = xDelta + startRectX;
        float f2 = startRectY - yDelta;
        path.lineTo(f, f2);
        path.lineTo(f + rectWidth, f2);
        path.lineTo(rectWidth + startRectX, startRectY);
        path.lineTo(startRectX, startRectY);
        path.close();
        canvas.drawPath(path, fillPaint);
    }

    private final void drawTopRhombusOutline(Canvas canvas, float startRectX, float startRectY, float rectWidth, Paint linePaint, boolean hideSideBorders) {
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float yDelta = dimensions.getYDelta();
        if (!hideSideBorders) {
            float f = startRectX + xDelta;
            float f2 = startRectY - yDelta;
            canvas.drawLine(startRectX, startRectY, f, f2, linePaint);
            canvas.drawLine(f + rectWidth, f2, startRectX + rectWidth, startRectY, linePaint);
        }
        float f3 = startRectX + xDelta;
        float f4 = startRectY - yDelta;
        canvas.drawLine(f3, f4, f3 + rectWidth, f4, linePaint);
        canvas.drawLine(startRectX + rectWidth, startRectY, startRectX, startRectY, linePaint);
    }

    private final void drawSideRhombus(Canvas canvas, float startRectX) {
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float yDelta = dimensions.getYDelta();
        float startRectY = dimensions.getStartRectY();
        float rectHeight = dimensions.getRectHeight();
        Path path = this.workPath;
        path.reset();
        float f = startRectY + rectHeight;
        path.moveTo(startRectX, f);
        path.lineTo(startRectX, startRectY);
        float f2 = xDelta + startRectX;
        float f3 = startRectY - yDelta;
        path.lineTo(f2, f3);
        path.lineTo(f2, f3 + rectHeight);
        path.lineTo(startRectX, f);
        path.close();
        canvas.drawPath(path, this.configuration.getSideRhombusPaint());
    }

    private final void drawSideRhombusOutline(Canvas canvas, float startRectX, Paint linePaint) {
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float yDelta = dimensions.getYDelta();
        float startRectY = dimensions.getStartRectY();
        float rectHeight = dimensions.getRectHeight();
        float f = startRectX + xDelta;
        float f2 = startRectY - yDelta;
        canvas.drawLine(startRectX, startRectY, f, f2, linePaint);
        float f3 = f2 + rectHeight;
        canvas.drawLine(f, f2, f, f3, linePaint);
        float f4 = startRectY + rectHeight;
        canvas.drawLine(f, f3, startRectX, f4, linePaint);
        canvas.drawLine(startRectX, f4, startRectX, startRectY, linePaint);
    }

    private final void drawSegmentOutline(Canvas canvas, float endRectX, float endRectY, Paint linePaint) {
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float yDelta = dimensions.getYDelta();
        float startRectY = dimensions.getStartRectY();
        canvas.drawLine(endRectX, startRectY + dimensions.getRectHeight(), endRectX, startRectY, linePaint);
        canvas.drawLine(endRectX + xDelta, endRectY - yDelta, endRectX, endRectY, linePaint);
    }

    private final void drawText(Canvas canvas, float startRectX, float rectWidth, float topY, String text, float animationProgress) {
        Configuration configuration = this.configuration;
        Paint selectedTextPaint = configuration.getSelectedTextPaint();
        int selectedTextColor = configuration.getSelectedTextColor();
        Dimensions dimensions = this.dimensions;
        float xDelta = dimensions.getXDelta();
        float screenWidth = dimensions.getScreenWidth();
        float f = startRectX + xDelta;
        float f2 = 2;
        float f3 = f + (rectWidth / f2);
        float fMeasureText = selectedTextPaint.measureText(text) / f2;
        float f4 = f3 + fMeasureText;
        if (f4 > screenWidth) {
            f3 -= f4 - screenWidth;
        } else if (f3 - fMeasureText < 0.0f) {
            f3 += fMeasureText - f3;
        }
        if (getSelectedIndex() != null) {
            selectedTextPaint.setColor(GammaEvaluator.INSTANCE.evaluate(Math.min(animationProgress * 6, 1.0f), 0, selectedTextColor).intValue());
        }
        canvas.drawText(text, f3, topY, selectedTextPaint);
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        invalidateSelf();
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B}\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\b\u0001\u0010\f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\r\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0010\u001a\u00020\t¢\u0006\u0004\b\u0011\u0010\u0012J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\t\u00108\u001a\u00020\u0003HÆ\u0003J\t\u00109\u001a\u00020\u0003HÆ\u0003J\t\u0010:\u001a\u00020\u0003HÆ\u0003J\t\u0010;\u001a\u00020\tHÆ\u0003J\t\u0010<\u001a\u00020\u000bHÆ\u0003J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\tHÆ\u0003J\t\u0010?\u001a\u00020\u0003HÆ\u0003J\t\u0010@\u001a\u00020\u0003HÆ\u0003J\t\u0010A\u001a\u00020\tHÆ\u0003J\u0081\u0001\u0010B\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u00032\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0003\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0003\u0010\f\u001a\u00020\u00032\b\b\u0003\u0010\r\u001a\u00020\t2\b\b\u0003\u0010\u000e\u001a\u00020\u00032\b\b\u0003\u0010\u000f\u001a\u00020\u00032\b\b\u0003\u0010\u0010\u001a\u00020\tHÆ\u0001J\u0013\u0010C\u001a\u00020D2\b\u0010E\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010F\u001a\u00020\u0003HÖ\u0001J\t\u0010G\u001a\u00020HHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0011\u0010\r\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0014R\u0011\u0010\u000f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0014R\u0011\u0010\u0010\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\"\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b#\u0010\u0014R\u0011\u0010$\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010(\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b)\u0010'R\u0011\u0010*\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b+\u0010'R\u0011\u0010,\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b-\u0010'R\u0011\u0010.\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b/\u0010'R\u0011\u00100\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b1\u0010'R\u0011\u00102\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b3\u0010'R\u0011\u00104\u001a\u00020%¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'¨\u0006I"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Configuration;", "", "defaultRegionColor", "", "unselectedColor", "shadowColor", "unselectedStrokeColor", "selectedTextColor", "selectedTextSize", "", "font", "Landroid/graphics/Typeface;", "lineColor", "lineStrokeWidth", "outerOutlineColor", "innerOutlineColor", "totalWidthProportion", "<init>", "(IIIIIFLandroid/graphics/Typeface;IFIIF)V", "getDefaultRegionColor", "()I", "getUnselectedColor", "getShadowColor", "getUnselectedStrokeColor", "getSelectedTextColor", "getSelectedTextSize", "()F", "getFont", "()Landroid/graphics/Typeface;", "getLineColor", "getLineStrokeWidth", "getOuterOutlineColor", "getInnerOutlineColor", "getTotalWidthProportion", "transparentShadowColor", "getTransparentShadowColor", "linePaint", "Landroid/graphics/Paint;", "getLinePaint", "()Landroid/graphics/Paint;", "outerOutlinePaint", "getOuterOutlinePaint", "innerOutlinePaint", "getInnerOutlinePaint", "shadowPaint", "getShadowPaint", "selectedTextPaint", "getSelectedTextPaint", "rectPaint", "getRectPaint", "topRhombusPaint", "getTopRhombusPaint", "sideRhombusPaint", "getSideRhombusPaint", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "", "other", "hashCode", "toString", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final /* data */ class Configuration {
        private final int defaultRegionColor;
        private final Typeface font;
        private final int innerOutlineColor;
        private final Paint innerOutlinePaint;
        private final int lineColor;
        private final Paint linePaint;
        private final float lineStrokeWidth;
        private final int outerOutlineColor;
        private final Paint outerOutlinePaint;
        private final Paint rectPaint;
        private final int selectedTextColor;
        private final Paint selectedTextPaint;
        private final float selectedTextSize;
        private final int shadowColor;
        private final Paint shadowPaint;
        private final Paint sideRhombusPaint;
        private final Paint topRhombusPaint;
        private final float totalWidthProportion;
        private final int unselectedColor;
        private final int unselectedStrokeColor;

        public static /* synthetic */ Configuration copy$default(Configuration configuration, int i, int i2, int i3, int i4, int i5, float f, Typeface typeface, int i6, float f2, int i7, int i8, float f3, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                i = configuration.defaultRegionColor;
            }
            if ((i9 & 2) != 0) {
                i2 = configuration.unselectedColor;
            }
            if ((i9 & 4) != 0) {
                i3 = configuration.shadowColor;
            }
            if ((i9 & 8) != 0) {
                i4 = configuration.unselectedStrokeColor;
            }
            if ((i9 & 16) != 0) {
                i5 = configuration.selectedTextColor;
            }
            if ((i9 & 32) != 0) {
                f = configuration.selectedTextSize;
            }
            if ((i9 & 64) != 0) {
                typeface = configuration.font;
            }
            if ((i9 & 128) != 0) {
                i6 = configuration.lineColor;
            }
            if ((i9 & 256) != 0) {
                f2 = configuration.lineStrokeWidth;
            }
            if ((i9 & 512) != 0) {
                i7 = configuration.outerOutlineColor;
            }
            if ((i9 & 1024) != 0) {
                i8 = configuration.innerOutlineColor;
            }
            if ((i9 & 2048) != 0) {
                f3 = configuration.totalWidthProportion;
            }
            int i10 = i8;
            float f4 = f3;
            float f5 = f2;
            int i11 = i7;
            Typeface typeface2 = typeface;
            int i12 = i6;
            int i13 = i5;
            float f6 = f;
            return configuration.copy(i, i2, i3, i4, i13, f6, typeface2, i12, f5, i11, i10, f4);
        }

        /* renamed from: component1, reason: from getter */
        public final int getDefaultRegionColor() {
            return this.defaultRegionColor;
        }

        /* renamed from: component10, reason: from getter */
        public final int getOuterOutlineColor() {
            return this.outerOutlineColor;
        }

        /* renamed from: component11, reason: from getter */
        public final int getInnerOutlineColor() {
            return this.innerOutlineColor;
        }

        /* renamed from: component12, reason: from getter */
        public final float getTotalWidthProportion() {
            return this.totalWidthProportion;
        }

        /* renamed from: component2, reason: from getter */
        public final int getUnselectedColor() {
            return this.unselectedColor;
        }

        /* renamed from: component3, reason: from getter */
        public final int getShadowColor() {
            return this.shadowColor;
        }

        /* renamed from: component4, reason: from getter */
        public final int getUnselectedStrokeColor() {
            return this.unselectedStrokeColor;
        }

        /* renamed from: component5, reason: from getter */
        public final int getSelectedTextColor() {
            return this.selectedTextColor;
        }

        /* renamed from: component6, reason: from getter */
        public final float getSelectedTextSize() {
            return this.selectedTextSize;
        }

        /* renamed from: component7, reason: from getter */
        public final Typeface getFont() {
            return this.font;
        }

        /* renamed from: component8, reason: from getter */
        public final int getLineColor() {
            return this.lineColor;
        }

        /* renamed from: component9, reason: from getter */
        public final float getLineStrokeWidth() {
            return this.lineStrokeWidth;
        }

        public final Configuration copy(int defaultRegionColor, int unselectedColor, int shadowColor, int unselectedStrokeColor, int selectedTextColor, float selectedTextSize, Typeface font, int lineColor, float lineStrokeWidth, int outerOutlineColor, int innerOutlineColor, float totalWidthProportion) {
            Intrinsics.checkNotNullParameter(font, "font");
            return new Configuration(defaultRegionColor, unselectedColor, shadowColor, unselectedStrokeColor, selectedTextColor, selectedTextSize, font, lineColor, lineStrokeWidth, outerOutlineColor, innerOutlineColor, totalWidthProportion);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) other;
            return this.defaultRegionColor == configuration.defaultRegionColor && this.unselectedColor == configuration.unselectedColor && this.shadowColor == configuration.shadowColor && this.unselectedStrokeColor == configuration.unselectedStrokeColor && this.selectedTextColor == configuration.selectedTextColor && Float.compare(this.selectedTextSize, configuration.selectedTextSize) == 0 && Intrinsics.areEqual(this.font, configuration.font) && this.lineColor == configuration.lineColor && Float.compare(this.lineStrokeWidth, configuration.lineStrokeWidth) == 0 && this.outerOutlineColor == configuration.outerOutlineColor && this.innerOutlineColor == configuration.innerOutlineColor && Float.compare(this.totalWidthProportion, configuration.totalWidthProportion) == 0;
        }

        public int hashCode() {
            return (((((((((((((((((((((Integer.hashCode(this.defaultRegionColor) * 31) + Integer.hashCode(this.unselectedColor)) * 31) + Integer.hashCode(this.shadowColor)) * 31) + Integer.hashCode(this.unselectedStrokeColor)) * 31) + Integer.hashCode(this.selectedTextColor)) * 31) + Float.hashCode(this.selectedTextSize)) * 31) + this.font.hashCode()) * 31) + Integer.hashCode(this.lineColor)) * 31) + Float.hashCode(this.lineStrokeWidth)) * 31) + Integer.hashCode(this.outerOutlineColor)) * 31) + Integer.hashCode(this.innerOutlineColor)) * 31) + Float.hashCode(this.totalWidthProportion);
        }

        public String toString() {
            return "Configuration(defaultRegionColor=" + this.defaultRegionColor + ", unselectedColor=" + this.unselectedColor + ", shadowColor=" + this.shadowColor + ", unselectedStrokeColor=" + this.unselectedStrokeColor + ", selectedTextColor=" + this.selectedTextColor + ", selectedTextSize=" + this.selectedTextSize + ", font=" + this.font + ", lineColor=" + this.lineColor + ", lineStrokeWidth=" + this.lineStrokeWidth + ", outerOutlineColor=" + this.outerOutlineColor + ", innerOutlineColor=" + this.innerOutlineColor + ", totalWidthProportion=" + this.totalWidthProportion + ")";
        }

        public Configuration(int i, int i2, int i3, int i4, int i5, float f, Typeface font, int i6, float f2, int i7, int i8, float f3) {
            Intrinsics.checkNotNullParameter(font, "font");
            this.defaultRegionColor = i;
            this.unselectedColor = i2;
            this.shadowColor = i3;
            this.unselectedStrokeColor = i4;
            this.selectedTextColor = i5;
            this.selectedTextSize = f;
            this.font = font;
            this.lineColor = i6;
            this.lineStrokeWidth = f2;
            this.outerOutlineColor = i7;
            this.innerOutlineColor = i8;
            this.totalWidthProportion = f3;
            Paint paint = new Paint(1);
            paint.setColor(i6);
            paint.setStrokeWidth(f2);
            this.linePaint = paint;
            Paint paint2 = new Paint();
            paint2.setColor(i7);
            paint2.setStrokeWidth(f2);
            this.outerOutlinePaint = paint2;
            Paint paint3 = new Paint();
            paint3.setColor(i8);
            paint3.setStrokeWidth(f2);
            this.innerOutlinePaint = paint3;
            Paint paint4 = new Paint();
            paint4.setColor(i3);
            this.shadowPaint = paint4;
            Paint paint5 = new Paint(1);
            paint5.setColor(i5);
            paint5.setStyle(Paint.Style.FILL);
            paint5.setTypeface(font);
            paint5.setTextSize(f);
            paint5.setTextAlign(Paint.Align.CENTER);
            this.selectedTextPaint = paint5;
            this.rectPaint = new Paint();
            this.topRhombusPaint = new Paint(1);
            this.sideRhombusPaint = new Paint();
        }

        public final int getDefaultRegionColor() {
            return this.defaultRegionColor;
        }

        public final int getUnselectedColor() {
            return this.unselectedColor;
        }

        public final int getShadowColor() {
            return this.shadowColor;
        }

        public final int getUnselectedStrokeColor() {
            return this.unselectedStrokeColor;
        }

        public final int getSelectedTextColor() {
            return this.selectedTextColor;
        }

        public final float getSelectedTextSize() {
            return this.selectedTextSize;
        }

        public final Typeface getFont() {
            return this.font;
        }

        public final int getLineColor() {
            return this.lineColor;
        }

        public final float getLineStrokeWidth() {
            return this.lineStrokeWidth;
        }

        public final int getOuterOutlineColor() {
            return this.outerOutlineColor;
        }

        public final int getInnerOutlineColor() {
            return this.innerOutlineColor;
        }

        public final float getTotalWidthProportion() {
            return this.totalWidthProportion;
        }

        public final int getTransparentShadowColor() {
            return this.shadowColor & 16777215;
        }

        public final Paint getLinePaint() {
            return this.linePaint;
        }

        public final Paint getOuterOutlinePaint() {
            return this.outerOutlinePaint;
        }

        public final Paint getInnerOutlinePaint() {
            return this.innerOutlinePaint;
        }

        public final Paint getShadowPaint() {
            return this.shadowPaint;
        }

        public final Paint getSelectedTextPaint() {
            return this.selectedTextPaint;
        }

        public final Paint getRectPaint() {
            return this.rectPaint;
        }

        public final Paint getTopRhombusPaint() {
            return this.topRhombusPaint;
        }

        public final Paint getSideRhombusPaint() {
            return this.sideRhombusPaint;
        }
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Model;", "", "regions", "", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "<init>", "(Ljava/util/List;)V", "getRegions", "()Ljava/util/List;", "states", "Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$RegionState;", "getStates", "totalSegmentsWeight", "", "getTotalSegmentsWeight", "()F", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final class Model {
        private final List<BlockRegion> regions;
        private final List<RegionState> states;
        private final float totalSegmentsWeight;

        public Model(List<BlockRegion> regions) {
            Intrinsics.checkNotNullParameter(regions, "regions");
            this.regions = regions;
            List<BlockRegion> list = regions;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                arrayList.add(new RegionState(i, (BlockRegion) obj));
                i = i2;
            }
            this.states = arrayList;
            Iterator<T> it = this.regions.iterator();
            float fSumOfFloat = 0.0f;
            while (it.hasNext()) {
                fSumOfFloat += CollectionsKt.sumOfFloat(((BlockRegion) it.next()).getSegmentWeights());
            }
            this.totalSegmentsWeight = fSumOfFloat;
        }

        public final List<BlockRegion> getRegions() {
            return this.regions;
        }

        public final List<RegionState> getStates() {
            return this.states;
        }

        public final float getTotalSegmentsWeight() {
            return this.totalSegmentsWeight;
        }
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013R*\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@BX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR*\u0010\f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR*\u0010\u000f\u001a\u0004\u0018\u00010\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005@FX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Indices;", "", "<init>", "(Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;)V", "value", "", "previousIndex", "getPreviousIndex", "()Ljava/lang/Integer;", "setPreviousIndex", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "selectedIndex", "getSelectedIndex", "setSelectedIndex", "scrubbingIndex", "getScrubbingIndex", "setScrubbingIndex", "reset", "", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class Indices {
        private Integer previousIndex;
        private Integer scrubbingIndex;
        private Integer selectedIndex;

        public Indices() {
        }

        public final Integer getPreviousIndex() {
            return this.previousIndex;
        }

        private final void setPreviousIndex(Integer num) {
            if (num == null) {
                num = this.previousIndex;
            }
            this.previousIndex = num;
        }

        public final Integer getSelectedIndex() {
            return this.selectedIndex;
        }

        public final void setSelectedIndex(Integer num) {
            setPreviousIndex(num);
            this.selectedIndex = num;
            StackedBlockDrawable.this.invalidateSelf();
        }

        public final Integer getScrubbingIndex() {
            return this.scrubbingIndex;
        }

        public final void setScrubbingIndex(Integer num) {
            setPreviousIndex(num);
            this.scrubbingIndex = num;
            StackedBlockDrawable.this.invalidateSelf();
        }

        public final void reset() {
            setPreviousIndex(null);
            setSelectedIndex(null);
            setScrubbingIndex(null);
        }
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR&\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058\u0006@FX\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\b\"\u0004\b\r\u0010\nR\u001a\u0010\u000e\u001a\u00020\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$AnimationState;", "", "<init>", "(Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;)V", "value", "", "scrubbingAnimationProgress", "getScrubbingAnimationProgress", "()F", "setScrubbingAnimationProgress", "(F)V", "holdingsAnimationProgress", "getHoldingsAnimationProgress", "setHoldingsAnimationProgress", "isAnimatingHoldings", "", "()Z", "setAnimatingHoldings", "(Z)V", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class AnimationState {
        private boolean isAnimatingHoldings;
        private float scrubbingAnimationProgress = 1.0f;
        private float holdingsAnimationProgress = 1.0f;

        public AnimationState() {
        }

        public final float getScrubbingAnimationProgress() {
            return this.scrubbingAnimationProgress;
        }

        public final void setScrubbingAnimationProgress(float f) {
            if (this.scrubbingAnimationProgress == f) {
                return;
            }
            this.scrubbingAnimationProgress = f;
            StackedBlockDrawable.this.invalidateSelf();
        }

        public final float getHoldingsAnimationProgress() {
            return this.holdingsAnimationProgress;
        }

        public final void setHoldingsAnimationProgress(float f) {
            if (this.holdingsAnimationProgress == f) {
                return;
            }
            this.holdingsAnimationProgress = f;
            StackedBlockDrawable.this.invalidateSelf();
        }

        /* renamed from: isAnimatingHoldings, reason: from getter */
        public final boolean getIsAnimatingHoldings() {
            return this.isAnimatingHoldings;
        }

        public final void setAnimatingHoldings(boolean z) {
            this.isAnimatingHoldings = z;
        }
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0013\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0007R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0007R\u0011\u0010\u0010\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0007R\u0011\u0010\u0012\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0007R\u0011\u0010\u0014\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0007R\u0011\u0010\u0016\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$Dimensions;", "", "<init>", "(Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable;)V", "rhombusAngleRadians", "", "getRhombusAngleRadians", "()F", "xDelta", "getXDelta", "yDelta", "getYDelta", "rectHeight", "getRectHeight", "startRectY", "getStartRectY", "shadowDepth", "getShadowDepth", "screenWidth", "getScreenWidth", "width", "getWidth", "sideSpace", "getSideSpace", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class Dimensions {
        private final float rhombusAngleRadians = (float) Math.toRadians(120.0d);

        public Dimensions() {
        }

        public final float getRhombusAngleRadians() {
            return this.rhombusAngleRadians;
        }

        public final float getXDelta() {
            return (((float) Math.cos(this.rhombusAngleRadians)) * getRectHeight()) / 1.5f;
        }

        public final float getYDelta() {
            return (((float) Math.sin(this.rhombusAngleRadians)) * getRectHeight()) / 3.0f;
        }

        public final float getRectHeight() {
            return StackedBlockDrawable.this.getBounds().height() / 2.5f;
        }

        public final float getStartRectY() {
            return getRectHeight();
        }

        public final float getShadowDepth() {
            return getYDelta() / 2.0f;
        }

        public final float getScreenWidth() {
            return StackedBlockDrawable.this.getBounds().width();
        }

        public final float getWidth() {
            Configuration configuration = StackedBlockDrawable.this.getConfiguration();
            return ((getScreenWidth() + getXDelta()) - (2 * configuration.getLineStrokeWidth())) * configuration.getTotalWidthProportion();
        }

        public final float getSideSpace() {
            Configuration configuration = StackedBlockDrawable.this.getConfiguration();
            float totalWidthProportion = configuration.getTotalWidthProportion();
            return (getWidth() * ((1 - totalWidthProportion) / (2 * totalWidthProportion))) + (configuration.getLineStrokeWidth() / 2.0f);
        }
    }

    /* compiled from: StackedBlockDrawable.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\t\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/designsystem/chart/StackedBlockDrawable$RegionState;", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "region", "Lcom/robinhood/android/designsystem/chart/BlockRegion;", "<init>", "(ILcom/robinhood/android/designsystem/chart/BlockRegion;)V", "getIndex", "()I", "getRegion", "()Lcom/robinhood/android/designsystem/chart/BlockRegion;", "currentColor", "getCurrentColor", "setCurrentColor", "(I)V", "bounds", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "getBounds", "()Lkotlin/ranges/ClosedFloatingPointRange;", "setBounds", "(Lkotlin/ranges/ClosedFloatingPointRange;)V", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class RegionState {
        private Ranges3<Float> bounds;
        private int currentColor;
        private final int index;
        private final BlockRegion region;

        public RegionState(int i, BlockRegion region) {
            Intrinsics.checkNotNullParameter(region, "region");
            this.index = i;
            this.region = region;
            this.bounds = RangesKt.rangeTo(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
        }

        public final int getIndex() {
            return this.index;
        }

        public final BlockRegion getRegion() {
            return this.region;
        }

        public final int getCurrentColor() {
            return this.currentColor;
        }

        public final void setCurrentColor(int i) {
            this.currentColor = i;
        }

        public final Ranges3<Float> getBounds() {
            return this.bounds;
        }

        public final void setBounds(Ranges3<Float> ranges3) {
            Intrinsics.checkNotNullParameter(ranges3, "<set-?>");
            this.bounds = ranges3;
        }
    }
}
