package com.robinhood.android.options.lib.simulatedreturn.slider;

import com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderEvent;
import com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode;
import com.robinhood.utils.datetime.Instants;
import io.jsonwebtoken.Claims;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.LocalDateTime;
import p479j$.time.ZoneId;
import p479j$.time.temporal.ChronoUnit;

/* compiled from: OptionsSimulatedReturnTimeSliderDataState.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ-\u0010\u001e\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010$\u001a\u0004\u0018\u00010\u00152\u0006\u0010 \u001a\u00020\t2\u0006\u0010!\u001a\u00020\t2\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J'\u0010)\u001a\b\u0012\u0004\u0012\u00020(0\u000b2\b\u0010&\u001a\u0004\u0018\u00010\u00152\b\u0010'\u001a\u0004\u0018\u00010\u0015¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0005\u001a\u00020\u0015¢\u0006\u0004\b+\u0010,J\u0015\u0010-\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b1\u00102J\u0012\u00103\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b3\u00102J\u001c\u00104\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007HÆ\u0003¢\u0006\u0004\b4\u00105J\u0016\u00106\u001a\b\u0012\u0004\u0012\u00020\b0\u000bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0090\u0001\u0010@\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010C\u001a\u00020BHÖ\u0001¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bE\u0010FJ\u001a\u0010H\u001a\u00020\u00112\b\u0010G\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\bH\u0010IR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010J\u001a\u0004\bK\u00100R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010L\u001a\u0004\bM\u00102R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010L\u001a\u0004\bN\u00102R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\n\u0010O\u001a\u0004\bP\u00105R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010Q\u001a\u0004\bR\u00107R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010S\u001a\u0004\bT\u00109R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010U\u001a\u0004\bV\u0010;R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010W\u001a\u0004\bX\u0010=R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Y\u001a\u0004\bZ\u0010?R\u0016\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010[R\u0019\u0010\\\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010a\u001a\u0004\u0018\u00010`8\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u0016\u0010e\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010[R\u0016\u0010f\u001a\u0004\u0018\u00010\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010[R\u0019\u0010h\u001a\u0004\u0018\u00010g8\u0006¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010kR\u0019\u0010l\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bl\u0010[\u001a\u0004\bm\u0010\u001aR\u0019\u0010n\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bn\u0010[\u001a\u0004\bo\u0010\u001aR\u0019\u0010p\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bp\u0010[\u001a\u0004\bq\u0010\u001aR\u0016\u0010r\u001a\u0004\u0018\u00010\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010sR\u0019\u0010t\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\bt\u0010[\u001a\u0004\bu\u0010\u001a¨\u0006v"}, m3636d2 = {"Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;", "", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "dragState", "j$/time/Instant", "now", Claims.EXPIRATION, "", "", "", "expTimeSecToNumOfPositionsMap", "", "expTimeSecSorted", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "launchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "loggingState", "", "showEmptySlider", "j$/time/ZoneId", "zoneId", "", "pointerPosition", "<init>", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;Ljava/util/List;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;ZLj$/time/ZoneId;Ljava/lang/Double;)V", "component10", "()Ljava/lang/Double;", "", "draggedPercentage", "Lkotlin/Pair;", "getPointerPositionsBeforeAndAfterDrag", "(FLcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;)Lkotlin/Pair;", "frameIndex", "numOfFrames", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;", "anchor", "getPointerPositionAfterQuotePillAnimationProgress", "(IILcom/robinhood/android/options/lib/simulatedreturn/slider/QuotePillAnchor;)Ljava/lang/Double;", "oldPos", "newPos", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderEvent$SliderHapticFeedback;", "getHapticFeedbacks", "(Ljava/lang/Double;Ljava/lang/Double;)Ljava/util/List;", "updatePointerPositionWithUpdatedNow", "(D)Ljava/lang/Double;", "updatePointerPositionWithUpdatedExp", "(D)D", "component1", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "component2", "()Lj$/time/Instant;", "component3", "component4", "()Ljava/util/Map;", "component5", "()Ljava/util/List;", "component6", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "component7", "()Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "component8", "()Z", "component9", "()Lj$/time/ZoneId;", "copy", "(Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;Lj$/time/Instant;Lj$/time/Instant;Ljava/util/Map;Ljava/util/List;Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;ZLj$/time/ZoneId;Ljava/lang/Double;)Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnTimeSliderDataState;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderDragState;", "getDragState", "Lj$/time/Instant;", "getNow", "getExp", "Ljava/util/Map;", "getExpTimeSecToNumOfPositionsMap", "Ljava/util/List;", "getExpTimeSecSorted", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/OptionsSimulatedReturnSliderLaunchMode$Time;", "getLaunchMode", "Lcom/robinhood/android/options/lib/simulatedreturn/logging/OptionsSimulatedReturnLoggingState;", "getLoggingState", "Z", "getShowEmptySlider", "Lj$/time/ZoneId;", "getZoneId", "Ljava/lang/Double;", "dte", "Ljava/lang/Integer;", "getDte", "()Ljava/lang/Integer;", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;", "fineIncrementEnum", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;", "getFineIncrementEnum", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/FineIncrement;", "idealFineIncrement", "snapDistance", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/CoarseIncrement;", "coarseIncrementEnum", "Lcom/robinhood/android/options/lib/simulatedreturn/slider/CoarseIncrement;", "getCoarseIncrementEnum", "()Lcom/robinhood/android/options/lib/simulatedreturn/slider/CoarseIncrement;", "rangeLength", "getRangeLength", "minPointerPosition", "getMinPointerPosition", "maxPointerPosition", "getMaxPointerPosition", "isInQuoteSnapRange", "Ljava/lang/Boolean;", "snappedPointerPosition", "getSnappedPointerPosition", "lib-options-simulated-return_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionsSimulatedReturnTimeSliderDataState {
    public static final int $stable = 8;
    private final OptionsSimulatedReturnTimeSliderDataState2 coarseIncrementEnum;
    private final OptionsSimulatedReturnSliderViewState2 dragState;
    private final Integer dte;
    private final Instant exp;
    private final List<Long> expTimeSecSorted;
    private final Map<Long, Integer> expTimeSecToNumOfPositionsMap;
    private final OptionsSimulatedReturnTimeSliderDataState3 fineIncrementEnum;
    private final Double idealFineIncrement;
    private final Boolean isInQuoteSnapRange;
    private final OptionsSimulatedReturnSliderLaunchMode.Time launchMode;
    private final OptionsSimulatedReturnLoggingState loggingState;
    private final Double maxPointerPosition;
    private final Double minPointerPosition;
    private final Instant now;
    private final Double pointerPosition;
    private final Double rangeLength;
    private final boolean showEmptySlider;
    private final Double snapDistance;
    private final Double snappedPointerPosition;
    private final ZoneId zoneId;

    /* compiled from: OptionsSimulatedReturnTimeSliderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionsSimulatedReturnSliderViewState3.values().length];
            try {
                iArr[OptionsSimulatedReturnSliderViewState3.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionsSimulatedReturnSliderViewState3.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionsSimulatedReturnTimeSliderDataState() {
        this(null, null, null, null, null, null, null, false, null, null, 1023, null);
    }

    /* renamed from: component10, reason: from getter */
    private final Double getPointerPosition() {
        return this.pointerPosition;
    }

    public static /* synthetic */ OptionsSimulatedReturnTimeSliderDataState copy$default(OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState, OptionsSimulatedReturnSliderViewState2 optionsSimulatedReturnSliderViewState2, Instant instant, Instant instant2, Map map, List list, OptionsSimulatedReturnSliderLaunchMode.Time time, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, boolean z, ZoneId zoneId, Double d, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsSimulatedReturnSliderViewState2 = optionsSimulatedReturnTimeSliderDataState.dragState;
        }
        if ((i & 2) != 0) {
            instant = optionsSimulatedReturnTimeSliderDataState.now;
        }
        if ((i & 4) != 0) {
            instant2 = optionsSimulatedReturnTimeSliderDataState.exp;
        }
        if ((i & 8) != 0) {
            map = optionsSimulatedReturnTimeSliderDataState.expTimeSecToNumOfPositionsMap;
        }
        if ((i & 16) != 0) {
            list = optionsSimulatedReturnTimeSliderDataState.expTimeSecSorted;
        }
        if ((i & 32) != 0) {
            time = optionsSimulatedReturnTimeSliderDataState.launchMode;
        }
        if ((i & 64) != 0) {
            optionsSimulatedReturnLoggingState = optionsSimulatedReturnTimeSliderDataState.loggingState;
        }
        if ((i & 128) != 0) {
            z = optionsSimulatedReturnTimeSliderDataState.showEmptySlider;
        }
        if ((i & 256) != 0) {
            zoneId = optionsSimulatedReturnTimeSliderDataState.zoneId;
        }
        if ((i & 512) != 0) {
            d = optionsSimulatedReturnTimeSliderDataState.pointerPosition;
        }
        ZoneId zoneId2 = zoneId;
        Double d2 = d;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState2 = optionsSimulatedReturnLoggingState;
        boolean z2 = z;
        List list2 = list;
        OptionsSimulatedReturnSliderLaunchMode.Time time2 = time;
        return optionsSimulatedReturnTimeSliderDataState.copy(optionsSimulatedReturnSliderViewState2, instant, instant2, map, list2, time2, optionsSimulatedReturnLoggingState2, z2, zoneId2, d2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    /* renamed from: component2, reason: from getter */
    public final Instant getNow() {
        return this.now;
    }

    /* renamed from: component3, reason: from getter */
    public final Instant getExp() {
        return this.exp;
    }

    public final Map<Long, Integer> component4() {
        return this.expTimeSecToNumOfPositionsMap;
    }

    public final List<Long> component5() {
        return this.expTimeSecSorted;
    }

    /* renamed from: component6, reason: from getter */
    public final OptionsSimulatedReturnSliderLaunchMode.Time getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowEmptySlider() {
        return this.showEmptySlider;
    }

    /* renamed from: component9, reason: from getter */
    public final ZoneId getZoneId() {
        return this.zoneId;
    }

    public final OptionsSimulatedReturnTimeSliderDataState copy(OptionsSimulatedReturnSliderViewState2 dragState, Instant now, Instant exp, Map<Long, Integer> expTimeSecToNumOfPositionsMap, List<Long> expTimeSecSorted, OptionsSimulatedReturnSliderLaunchMode.Time launchMode, OptionsSimulatedReturnLoggingState loggingState, boolean showEmptySlider, ZoneId zoneId, Double pointerPosition) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(expTimeSecToNumOfPositionsMap, "expTimeSecToNumOfPositionsMap");
        Intrinsics.checkNotNullParameter(expTimeSecSorted, "expTimeSecSorted");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        return new OptionsSimulatedReturnTimeSliderDataState(dragState, now, exp, expTimeSecToNumOfPositionsMap, expTimeSecSorted, launchMode, loggingState, showEmptySlider, zoneId, pointerPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsSimulatedReturnTimeSliderDataState)) {
            return false;
        }
        OptionsSimulatedReturnTimeSliderDataState optionsSimulatedReturnTimeSliderDataState = (OptionsSimulatedReturnTimeSliderDataState) other;
        return this.dragState == optionsSimulatedReturnTimeSliderDataState.dragState && Intrinsics.areEqual(this.now, optionsSimulatedReturnTimeSliderDataState.now) && Intrinsics.areEqual(this.exp, optionsSimulatedReturnTimeSliderDataState.exp) && Intrinsics.areEqual(this.expTimeSecToNumOfPositionsMap, optionsSimulatedReturnTimeSliderDataState.expTimeSecToNumOfPositionsMap) && Intrinsics.areEqual(this.expTimeSecSorted, optionsSimulatedReturnTimeSliderDataState.expTimeSecSorted) && Intrinsics.areEqual(this.launchMode, optionsSimulatedReturnTimeSliderDataState.launchMode) && Intrinsics.areEqual(this.loggingState, optionsSimulatedReturnTimeSliderDataState.loggingState) && this.showEmptySlider == optionsSimulatedReturnTimeSliderDataState.showEmptySlider && Intrinsics.areEqual(this.zoneId, optionsSimulatedReturnTimeSliderDataState.zoneId) && Intrinsics.areEqual((Object) this.pointerPosition, (Object) optionsSimulatedReturnTimeSliderDataState.pointerPosition);
    }

    public int hashCode() {
        int iHashCode = this.dragState.hashCode() * 31;
        Instant instant = this.now;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Instant instant2 = this.exp;
        int iHashCode3 = (((((iHashCode2 + (instant2 == null ? 0 : instant2.hashCode())) * 31) + this.expTimeSecToNumOfPositionsMap.hashCode()) * 31) + this.expTimeSecSorted.hashCode()) * 31;
        OptionsSimulatedReturnSliderLaunchMode.Time time = this.launchMode;
        int iHashCode4 = (iHashCode3 + (time == null ? 0 : time.hashCode())) * 31;
        OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState = this.loggingState;
        int iHashCode5 = (((((iHashCode4 + (optionsSimulatedReturnLoggingState == null ? 0 : optionsSimulatedReturnLoggingState.hashCode())) * 31) + Boolean.hashCode(this.showEmptySlider)) * 31) + this.zoneId.hashCode()) * 31;
        Double d = this.pointerPosition;
        return iHashCode5 + (d != null ? d.hashCode() : 0);
    }

    public String toString() {
        return "OptionsSimulatedReturnTimeSliderDataState(dragState=" + this.dragState + ", now=" + this.now + ", exp=" + this.exp + ", expTimeSecToNumOfPositionsMap=" + this.expTimeSecToNumOfPositionsMap + ", expTimeSecSorted=" + this.expTimeSecSorted + ", launchMode=" + this.launchMode + ", loggingState=" + this.loggingState + ", showEmptySlider=" + this.showEmptySlider + ", zoneId=" + this.zoneId + ", pointerPosition=" + this.pointerPosition + ")";
    }

    public OptionsSimulatedReturnTimeSliderDataState(OptionsSimulatedReturnSliderViewState2 dragState, Instant instant, Instant instant2, Map<Long, Integer> expTimeSecToNumOfPositionsMap, List<Long> expTimeSecSorted, OptionsSimulatedReturnSliderLaunchMode.Time time, OptionsSimulatedReturnLoggingState optionsSimulatedReturnLoggingState, boolean z, ZoneId zoneId, Double d) {
        Integer numValueOf;
        OptionsSimulatedReturnTimeSliderDataState3 optionsSimulatedReturnTimeSliderDataState3;
        OptionsSimulatedReturnTimeSliderDataState2 optionsSimulatedReturnTimeSliderDataState2;
        Boolean boolValueOf;
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Intrinsics.checkNotNullParameter(expTimeSecToNumOfPositionsMap, "expTimeSecToNumOfPositionsMap");
        Intrinsics.checkNotNullParameter(expTimeSecSorted, "expTimeSecSorted");
        Intrinsics.checkNotNullParameter(zoneId, "zoneId");
        this.dragState = dragState;
        this.now = instant;
        this.exp = instant2;
        this.expTimeSecToNumOfPositionsMap = expTimeSecToNumOfPositionsMap;
        this.expTimeSecSorted = expTimeSecSorted;
        this.launchMode = time;
        this.loggingState = optionsSimulatedReturnLoggingState;
        this.showEmptySlider = z;
        this.zoneId = zoneId;
        this.pointerPosition = d;
        if (instant == null || instant2 == null) {
            numValueOf = null;
        } else {
            numValueOf = instant.compareTo(instant2) > 0 ? 0 : Integer.valueOf((int) Instants.toLocalDate(instant, zoneId).until(Instants.toLocalDate(instant2, zoneId), ChronoUnit.DAYS));
        }
        this.dte = numValueOf;
        if (numValueOf == null || numValueOf.intValue() < 0) {
            optionsSimulatedReturnTimeSliderDataState3 = null;
        } else if (numValueOf != null && numValueOf.intValue() == 0) {
            optionsSimulatedReturnTimeSliderDataState3 = OptionsSimulatedReturnTimeSliderDataState3.FIVE_MIN;
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS().contains(numValueOf.intValue())) {
            optionsSimulatedReturnTimeSliderDataState3 = OptionsSimulatedReturnTimeSliderDataState3.ONE_HOUR;
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getTWELVE_TO_THIRTY_FIVE_DAYS().contains(numValueOf.intValue())) {
            optionsSimulatedReturnTimeSliderDataState3 = OptionsSimulatedReturnTimeSliderDataState3.THREE_HOUR;
        } else {
            optionsSimulatedReturnTimeSliderDataState3 = OptionsSimulatedReturnTimeSliderDataState4.getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS().contains(numValueOf.intValue()) ? OptionsSimulatedReturnTimeSliderDataState3.ONE_DAY : OptionsSimulatedReturnTimeSliderDataState3.SEVEN_DAY;
        }
        this.fineIncrementEnum = optionsSimulatedReturnTimeSliderDataState3;
        Double dValueOf = optionsSimulatedReturnTimeSliderDataState3 != null ? Double.valueOf(optionsSimulatedReturnTimeSliderDataState3.getNumOfSec()) : null;
        this.idealFineIncrement = dValueOf;
        Double dValueOf2 = dValueOf != null ? Double.valueOf(dValueOf.doubleValue() * 0.2d) : null;
        this.snapDistance = dValueOf2;
        if (numValueOf == null || numValueOf.intValue() < 0) {
            optionsSimulatedReturnTimeSliderDataState2 = null;
        } else if (numValueOf != null && numValueOf.intValue() == 0) {
            optionsSimulatedReturnTimeSliderDataState2 = OptionsSimulatedReturnTimeSliderDataState2.ONE_HOUR;
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getONE_TO_ELEVEN_DAYS().contains(numValueOf.intValue())) {
            optionsSimulatedReturnTimeSliderDataState2 = OptionsSimulatedReturnTimeSliderDataState2.TWELVE_HOUR;
        } else if (OptionsSimulatedReturnTimeSliderDataState4.getTWELVE_TO_THIRTY_FIVE_DAYS().contains(numValueOf.intValue())) {
            optionsSimulatedReturnTimeSliderDataState2 = OptionsSimulatedReturnTimeSliderDataState2.ONE_DAY;
        } else {
            optionsSimulatedReturnTimeSliderDataState2 = OptionsSimulatedReturnTimeSliderDataState4.getTHIRTY_SIX_TO_TWO_HUNDRED_AND_SEVENTY_NINE_DAYS().contains(numValueOf.intValue()) ? OptionsSimulatedReturnTimeSliderDataState2.SEVEN_DAY : OptionsSimulatedReturnTimeSliderDataState2.EIGHTY_FOUR_DAY;
        }
        this.coarseIncrementEnum = optionsSimulatedReturnTimeSliderDataState2;
        this.rangeLength = dValueOf != null ? Double.valueOf(dValueOf.doubleValue() * 35) : null;
        Double dValueOf3 = instant != null ? Double.valueOf(instant.getEpochSecond()) : null;
        this.minPointerPosition = dValueOf3;
        this.maxPointerPosition = instant2 != null ? Double.valueOf(instant2.getEpochSecond()) : null;
        if (d == null || dValueOf3 == null || dValueOf2 == null) {
            boolValueOf = null;
        } else {
            boolValueOf = Boolean.valueOf(Math.abs(d.doubleValue() - dValueOf3.doubleValue()) < dValueOf2.doubleValue());
        }
        this.isInQuoteSnapRange = boolValueOf;
        if (boolValueOf == null) {
            d = null;
        } else if (Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
            d = dValueOf3;
        }
        this.snappedPointerPosition = d;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ OptionsSimulatedReturnTimeSliderDataState(com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState2 r2, p479j$.time.Instant r3, p479j$.time.Instant r4, java.util.Map r5, java.util.List r6, com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode.Time r7, com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState r8, boolean r9, p479j$.time.ZoneId r10, java.lang.Double r11, int r12, kotlin.jvm.internal.DefaultConstructorMarker r13) {
        /*
            r1 = this;
            r13 = r12 & 1
            if (r13 == 0) goto L6
            com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDragState r2 = com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderViewState2.FLINGING
        L6:
            r13 = r12 & 2
            r0 = 0
            if (r13 == 0) goto Lc
            r3 = r0
        Lc:
            r13 = r12 & 4
            if (r13 == 0) goto L11
            r4 = r0
        L11:
            r13 = r12 & 8
            if (r13 == 0) goto L19
            java.util.Map r5 = kotlin.collections.MapsKt.emptyMap()
        L19:
            r13 = r12 & 16
            if (r13 == 0) goto L21
            java.util.List r6 = kotlin.collections.CollectionsKt.emptyList()
        L21:
            r13 = r12 & 32
            if (r13 == 0) goto L26
            r7 = r0
        L26:
            r13 = r12 & 64
            if (r13 == 0) goto L2b
            r8 = r0
        L2b:
            r13 = r12 & 128(0x80, float:1.794E-43)
            if (r13 == 0) goto L30
            r9 = 0
        L30:
            r13 = r12 & 256(0x100, float:3.59E-43)
            if (r13 == 0) goto L38
            j$.time.ZoneId r10 = p479j$.time.ZoneId.systemDefault()
        L38:
            r12 = r12 & 512(0x200, float:7.175E-43)
            if (r12 == 0) goto L48
            r13 = r0
            r11 = r9
            r12 = r10
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L53
        L48:
            r13 = r11
            r12 = r10
            r10 = r8
            r11 = r9
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L53:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnTimeSliderDataState.<init>(com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderDragState, j$.time.Instant, j$.time.Instant, java.util.Map, java.util.List, com.robinhood.android.options.lib.simulatedreturn.slider.OptionsSimulatedReturnSliderLaunchMode$Time, com.robinhood.android.options.lib.simulatedreturn.logging.OptionsSimulatedReturnLoggingState, boolean, j$.time.ZoneId, java.lang.Double, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final OptionsSimulatedReturnSliderViewState2 getDragState() {
        return this.dragState;
    }

    public final Instant getNow() {
        return this.now;
    }

    public final Instant getExp() {
        return this.exp;
    }

    public final Map<Long, Integer> getExpTimeSecToNumOfPositionsMap() {
        return this.expTimeSecToNumOfPositionsMap;
    }

    public final List<Long> getExpTimeSecSorted() {
        return this.expTimeSecSorted;
    }

    public final OptionsSimulatedReturnSliderLaunchMode.Time getLaunchMode() {
        return this.launchMode;
    }

    public final OptionsSimulatedReturnLoggingState getLoggingState() {
        return this.loggingState;
    }

    public final boolean getShowEmptySlider() {
        return this.showEmptySlider;
    }

    public final ZoneId getZoneId() {
        return this.zoneId;
    }

    public final Integer getDte() {
        return this.dte;
    }

    public final OptionsSimulatedReturnTimeSliderDataState3 getFineIncrementEnum() {
        return this.fineIncrementEnum;
    }

    public final OptionsSimulatedReturnTimeSliderDataState2 getCoarseIncrementEnum() {
        return this.coarseIncrementEnum;
    }

    public final Double getRangeLength() {
        return this.rangeLength;
    }

    public final Double getMinPointerPosition() {
        return this.minPointerPosition;
    }

    public final Double getMaxPointerPosition() {
        return this.maxPointerPosition;
    }

    public final Double getSnappedPointerPosition() {
        return this.snappedPointerPosition;
    }

    public final Tuples2<Double, Double> getPointerPositionsBeforeAndAfterDrag(float draggedPercentage, OptionsSimulatedReturnSliderViewState2 dragState) {
        Intrinsics.checkNotNullParameter(dragState, "dragState");
        Double d = this.pointerPosition;
        Double d2 = this.rangeLength;
        Double d3 = this.maxPointerPosition;
        Double d4 = this.minPointerPosition;
        return OptionsSimulatedReturnSliderHelper.getPointerPositionPairBeforeAndAfterDrag(draggedPercentage, dragState, d, d2, d3, d4, this.snapDistance, d4);
    }

    public final Double getPointerPositionAfterQuotePillAnimationProgress(int frameIndex, int numOfFrames, OptionsSimulatedReturnSliderViewState3 anchor) {
        Double d;
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        Double d2 = this.pointerPosition;
        Double d3 = this.maxPointerPosition;
        Double d4 = this.minPointerPosition;
        int i = WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()];
        if (i == 1) {
            d = this.minPointerPosition;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            d = this.maxPointerPosition;
        }
        return OptionsSimulatedReturnSliderHelper.getPointerPositionInQuotePillAnimationProgress(frameIndex, numOfFrames, d2, d3, d4, d);
    }

    public final List<OptionsSimulatedReturnSliderEvent.SliderHapticFeedback> getHapticFeedbacks(Double oldPos, Double newPos) {
        if (this.minPointerPosition == null || this.maxPointerPosition == null || this.fineIncrementEnum == null || oldPos == null || newPos == null || Intrinsics.areEqual(oldPos, newPos)) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        double dMin = Math.min(oldPos.doubleValue(), newPos.doubleValue());
        double dMax = Math.max(oldPos.doubleValue(), newPos.doubleValue());
        Instant instantOfEpochSecond = Instant.ofEpochSecond(MathKt.roundToLong(dMin));
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        LocalDateTime localDateTime = Instants.toLocalDateTime(instantOfEpochSecond, this.zoneId);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(MathKt.roundToLong(this.minPointerPosition.doubleValue()));
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        LocalDate localDate = Instants.toLocalDate(instantOfEpochSecond2, this.zoneId);
        if (dMin <= this.minPointerPosition.doubleValue() && this.minPointerPosition.doubleValue() <= dMax && oldPos.doubleValue() > newPos.doubleValue()) {
            arrayList.add(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(true));
        }
        LocalDateTime timeSliderSmallTickDateTimeBeforeCurrentSliderStart = OptionsSimulatedReturnSliderHelper.getTimeSliderSmallTickDateTimeBeforeCurrentSliderStart(this.fineIncrementEnum, localDateTime, localDate);
        long epochSecond = timeSliderSmallTickDateTimeBeforeCurrentSliderStart.mo3396g(this.zoneId).toInstant().getEpochSecond();
        while (true) {
            double d = epochSecond;
            if (d > dMax) {
                break;
            }
            long timeSliderSecondsUntilNextTick = OptionsSimulatedReturnSliderHelper.getTimeSliderSecondsUntilNextTick(this.fineIncrementEnum, this.zoneId, timeSliderSmallTickDateTimeBeforeCurrentSliderStart, epochSecond);
            if (d >= dMin && d >= this.minPointerPosition.doubleValue() && d <= this.maxPointerPosition.doubleValue()) {
                arrayList.add(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(false));
            }
            epochSecond += timeSliderSecondsUntilNextTick;
            Instant instantOfEpochSecond3 = Instant.ofEpochSecond(epochSecond);
            Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond3, "ofEpochSecond(...)");
            timeSliderSmallTickDateTimeBeforeCurrentSliderStart = Instants.toLocalDateTime(instantOfEpochSecond3, this.zoneId);
        }
        if (dMin <= this.maxPointerPosition.doubleValue() && this.maxPointerPosition.doubleValue() <= dMax && oldPos.doubleValue() < newPos.doubleValue()) {
            arrayList.add(new OptionsSimulatedReturnSliderEvent.SliderHapticFeedback(true));
        }
        if (newPos.doubleValue() < oldPos.doubleValue()) {
            CollectionsKt.reverse(arrayList);
        }
        return arrayList;
    }

    public final Double updatePointerPositionWithUpdatedNow(double now) {
        Double dValueOf;
        if (Intrinsics.areEqual(this.isInQuoteSnapRange, Boolean.TRUE)) {
            dValueOf = Double.valueOf(now);
        } else {
            dValueOf = this.pointerPosition;
        }
        if (dValueOf == null) {
            return null;
        }
        double dCoerceAtLeast = RangesKt.coerceAtLeast(dValueOf.doubleValue(), now);
        Double d = this.maxPointerPosition;
        return Double.valueOf(RangesKt.coerceAtMost(dCoerceAtLeast, d != null ? d.doubleValue() : Double.MAX_VALUE));
    }

    public final double updatePointerPositionWithUpdatedExp(double exp) {
        Double d = this.pointerPosition;
        return RangesKt.coerceAtMost(d != null ? d.doubleValue() : exp, exp);
    }
}
