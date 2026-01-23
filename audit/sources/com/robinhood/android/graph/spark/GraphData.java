package com.robinhood.android.graph.spark;

import com.robinhood.android.graph.spark.SessionScalingHelper;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p320db.MarketHours;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.p355ui.Historical;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.utils.datetime.Instants;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Duration;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;

/* compiled from: GraphData.kt */
@Metadata(m3635d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0017\u0018\u0000 ~2\u00020\u0001:\u0001~B½\u0001\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000f2\b\u0010$\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\u00020\u00152\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b(\u0010)J\u0015\u0010*\u001a\u00020\u00152\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b*\u0010)J\u0015\u0010+\u001a\u00020\u000f2\u0006\u0010'\u001a\u00020!¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u000f¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020!¢\u0006\u0004\b/\u0010#J\u0015\u00103\u001a\b\u0012\u0004\u0012\u0002000\u0006H\u0000¢\u0006\u0004\b1\u00102R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u00109R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010:\u001a\u0004\b;\u00102R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\b@\u0010AR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u0011\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0011\u0010E\u001a\u0004\bF\u0010.R\u0017\u0010\u0012\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bG\u0010.R\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0013\u0010E\u001a\u0004\bH\u0010.R\u0017\u0010\u0014\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0014\u0010E\u001a\u0004\bI\u0010.R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010ER\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010M\u001a\u0004\bN\u0010OR\u0017\u0010\u001a\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001a\u0010E\u001a\u0004\bP\u0010.R\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010Q\u001a\u0004\bR\u0010SR\u0017\u0010\u001d\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010E\u001a\u0004\b\u001d\u0010.R\u0017\u0010\u001e\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u001e\u0010E\u001a\u0004\bT\u0010.R\u001a\u0010U\u001a\b\u0012\u0004\u0012\u0002000\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010:R\u0017\u0010V\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bV\u0010E\u001a\u0004\bW\u0010.R\u0017\u0010X\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010#R\u001d\u0010\\\u001a\b\u0012\u0004\u0012\u00020[0\u00068\u0006¢\u0006\f\n\u0004\b\\\u0010:\u001a\u0004\b]\u00102R\u0017\u0010^\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b^\u0010E\u001a\u0004\b_\u0010.R\u0017\u0010`\u001a\u00020!8\u0006¢\u0006\f\n\u0004\b`\u0010Y\u001a\u0004\ba\u0010#R\u0017\u0010b\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bb\u0010Y\u001a\u0004\bc\u0010#R\u0017\u0010d\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bd\u0010Y\u001a\u0004\be\u0010#R\u0017\u0010g\u001a\u00020f8\u0006¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u001d\u0010p\u001a\u0004\u0018\u00010k8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010oR\u0017\u0010q\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bq\u0010Y\u001a\u0004\br\u0010#R\u0017\u0010s\u001a\u00020!8\u0006¢\u0006\f\n\u0004\bs\u0010Y\u001a\u0004\bt\u0010#R\u0011\u0010v\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\bu\u0010#R\u0013\u0010x\u001a\u0004\u0018\u00010\t8F¢\u0006\u0006\u001a\u0004\bw\u0010>R\u0013\u0010{\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\by\u0010zR\u0013\u0010}\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b|\u0010z¨\u0006\u007f"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphData;", "", "Ljava/util/UUID;", "equityInstrumentId", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "Lcom/robinhood/models/ui/DataPoint;", "dataPoints", "Ljava/math/BigDecimal;", "prevClosePrice", "Lcom/robinhood/models/ui/GraphSelection;", "selection", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "", "isLateClosingOptionChain", "stale", "showAfterHours", "showBaseLine", "showMaintenanceLine", "", "maintenanceRequirement", "livePulseEnabled", "j$/time/LocalDate", "listDate", "alwaysShowPrePublic", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "coordinateOverrides", "isFullExtended", "hideExtendedHours", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZZZZZLjava/lang/Float;ZLj$/time/LocalDate;ZLcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;ZZ)V", "", "getRange", "()I", "currentPrice", "isUp", "(Ljava/math/BigDecimal;)Z", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getY", "(I)F", "getX", "isHidden", "(I)Z", "hasBaseLine", "()Z", "getFirstPublicIndex", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinate;", "getDefaultCoordinates$lib_graph_externalDebug", "()Ljava/util/List;", "getDefaultCoordinates", "Ljava/util/UUID;", "getEquityInstrumentId", "()Ljava/util/UUID;", "Lcom/robinhood/models/db/MarketHours;", "getMarketHours", "()Lcom/robinhood/models/db/MarketHours;", "Ljava/util/List;", "getDataPoints", "Ljava/math/BigDecimal;", "getPrevClosePrice", "()Ljava/math/BigDecimal;", "Lcom/robinhood/models/ui/GraphSelection;", "getSelection", "()Lcom/robinhood/models/ui/GraphSelection;", "Lcom/robinhood/models/ui/Historical$Interval;", "getInterval", "()Lcom/robinhood/models/ui/Historical$Interval;", "Z", "getStale", "getShowAfterHours", "getShowBaseLine", "getShowMaintenanceLine", "Ljava/lang/Float;", "getMaintenanceRequirement", "()Ljava/lang/Float;", "Lj$/time/LocalDate;", "getListDate", "()Lj$/time/LocalDate;", "getAlwaysShowPrePublic", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "getCoordinateOverrides", "()Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "getHideExtendedHours", "coordinates", "shouldUseLateCloseTimeForAfterHours", "getShouldUseLateCloseTimeForAfterHours", "fullChartNumberOfPoints", "I", "getFullChartNumberOfPoints", "Lcom/robinhood/models/ui/DataPoint$Asset;", "assetDataPoints", "getAssetDataPoints", "showLivePulse", "getShowLivePulse", "preStartIndex", "getPreStartIndex", "regStartIndex", "getRegStartIndex", "postStartIndex", "getPostStartIndex", "Lcom/robinhood/android/graph/spark/Rectangle;", "dataBounds", "Lcom/robinhood/android/graph/spark/Rectangle;", "getDataBounds", "()Lcom/robinhood/android/graph/spark/Rectangle;", "Lcom/robinhood/models/ui/DataPoint$Session;", "activeSession$delegate", "Lkotlin/Lazy;", "getActiveSession", "()Lcom/robinhood/models/ui/DataPoint$Session;", "activeSession", "lastIndex", "getLastIndex", "livePulseX", "getLivePulseX", "getCount", "count", "getFromPrice", "fromPrice", "getFirstHistorical", "()Lcom/robinhood/models/ui/DataPoint;", "firstHistorical", "getLastHistorical", "lastHistorical", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public class GraphData {

    /* renamed from: activeSession$delegate, reason: from kotlin metadata */
    private final Lazy activeSession;
    private final boolean alwaysShowPrePublic;
    private final List<DataPoint.Asset> assetDataPoints;
    private final SessionScalingHelper.Coordinates coordinateOverrides;
    private final List<SessionScalingHelper.Coordinate> coordinates;
    private final Rectangle dataBounds;
    private final List<DataPoint> dataPoints;
    private final UUID equityInstrumentId;
    private final int fullChartNumberOfPoints;
    private final boolean hideExtendedHours;
    private final Historical.Interval interval;
    private final boolean isFullExtended;
    private final int lastIndex;
    private final LocalDate listDate;
    private final boolean livePulseEnabled;
    private final int livePulseX;
    private final Float maintenanceRequirement;
    private final MarketHours marketHours;
    private final int postStartIndex;
    private final int preStartIndex;
    private final BigDecimal prevClosePrice;
    private final int regStartIndex;
    private final GraphSelection selection;
    private final boolean shouldUseLateCloseTimeForAfterHours;
    private final boolean showAfterHours;
    private final boolean showBaseLine;
    private final boolean showLivePulse;
    private final boolean showMaintenanceLine;
    private final boolean stale;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GraphData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GraphSelection.values().length];
            try {
                iArr[GraphSelection.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GraphSelection.ALL_DAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GraphSelection.TWENTY_FOUR_HOURS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[GraphSelection.HOUR.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[GraphSelection.WEEK.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[GraphSelection.WEEK_CRYPTO.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[GraphSelection.MONTH_HOURLY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO_HOURLY.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[GraphSelection.MONTH.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[GraphSelection.MONTH_CRYPTO.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[GraphSelection.THREE_MONTHS_CRYPTO.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[GraphSelection.YEAR_TO_DATE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[GraphSelection.YEAR.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[GraphSelection.YEAR_CRYPTO.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[GraphSelection.FIVE_YEARS_CRYPTO.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[GraphSelection.MAX.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[GraphSelection.MAX_CRYPTO.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[GraphSelection.ALL.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[GraphSelection.ALL_CRYPTO.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private GraphData(UUID uuid, MarketHours marketHours, List<? extends DataPoint> list, BigDecimal bigDecimal, GraphSelection graphSelection, Historical.Interval interval, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Float f, boolean z6, LocalDate localDate, boolean z7, SessionScalingHelper.Coordinates coordinates, boolean z8, boolean z9) {
        float fMin;
        float fMax;
        List<SessionScalingHelper.Coordinate> coordinates2;
        this.equityInstrumentId = uuid;
        this.marketHours = marketHours;
        this.dataPoints = list;
        this.prevClosePrice = bigDecimal;
        this.selection = graphSelection;
        this.interval = interval;
        this.stale = z2;
        this.showAfterHours = z3;
        this.showBaseLine = z4;
        this.showMaintenanceLine = z5;
        this.maintenanceRequirement = f;
        this.livePulseEnabled = z6;
        this.listDate = localDate;
        this.alwaysShowPrePublic = z7;
        this.coordinateOverrides = coordinates;
        this.isFullExtended = z8;
        this.hideExtendedHours = z9;
        this.coordinates = (coordinates == null || (coordinates2 = coordinates.getCoordinates()) == null) ? getDefaultCoordinates$lib_graph_externalDebug() : coordinates2;
        this.shouldUseLateCloseTimeForAfterHours = z;
        this.fullChartNumberOfPoints = INSTANCE.fullChartNumberOfPoints(z);
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (obj instanceof DataPoint.Asset) {
                arrayList.add(obj);
            }
        }
        this.assetDataPoints = arrayList;
        this.showLivePulse = this.livePulseEnabled && this.selection.isIntraday() && !(this.selection.isOneDay() && (this.dataPoints.size() >= getRange()));
        Iterator<SessionScalingHelper.Coordinate> it = this.coordinates.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (it.next().getSession() == DataPoint.Session.PRE_MARKET) {
                break;
            } else {
                i++;
            }
        }
        this.preStartIndex = i;
        Iterator<SessionScalingHelper.Coordinate> it2 = this.coordinates.iterator();
        int i2 = 0;
        while (true) {
            if (!it2.hasNext()) {
                i2 = -1;
                break;
            } else if (it2.next().getSession() == DataPoint.Session.REGULAR_HOURS) {
                break;
            } else {
                i2++;
            }
        }
        this.regStartIndex = i2;
        Iterator<SessionScalingHelper.Coordinate> it3 = this.coordinates.iterator();
        int i3 = 0;
        while (true) {
            if (!it3.hasNext()) {
                i3 = -1;
                break;
            } else if (it3.next().getSession() == DataPoint.Session.AFTER_HOURS) {
                break;
            } else {
                i3++;
            }
        }
        this.postStartIndex = i3;
        Rectangle rectangle = new Rectangle(0.0f, 0.0f, 0.0f, 0.0f, 15, null);
        boolean zHasBaseLine = hasBaseLine();
        if (zHasBaseLine) {
            BigDecimal fromPrice = getFromPrice();
            Intrinsics.checkNotNull(fromPrice);
            fMin = fromPrice.floatValue();
        } else {
            fMin = Float.MAX_VALUE;
        }
        if (zHasBaseLine) {
            BigDecimal fromPrice2 = getFromPrice();
            Intrinsics.checkNotNull(fromPrice2);
            fMax = fromPrice2.floatValue();
        } else {
            fMax = -3.4028235E38f;
        }
        int count = getCount();
        for (int i4 = 0; i4 < count; i4++) {
            float y = getY(i4);
            fMin = Math.min(fMin, y);
            fMax = Math.max(fMax, y);
        }
        rectangle.set(0.0f, fMin, getRange() - 1.0f, fMax);
        if (this.showMaintenanceLine && this.maintenanceRequirement != null) {
            Rectangle.union$default(rectangle, rectangle.getLeft(), this.maintenanceRequirement.floatValue(), 0.0f, 0.0f, 12, null);
        }
        this.dataBounds = rectangle;
        this.activeSession = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.graph.spark.GraphData$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GraphData.activeSession_delegate$lambda$4(this.f$0);
            }
        });
        int count2 = getCount() - 1;
        this.lastIndex = count2;
        this.livePulseX = count2 >= 0 ? (int) getX(count2) : -1;
    }

    /* synthetic */ GraphData(UUID uuid, MarketHours marketHours, List list, BigDecimal bigDecimal, GraphSelection graphSelection, Historical.Interval interval, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, Float f, boolean z6, LocalDate localDate, boolean z7, SessionScalingHelper.Coordinates coordinates, boolean z8, boolean z9, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(uuid, marketHours, list, bigDecimal, graphSelection, interval, z, z2, (i & 256) != 0 ? true : z3, (i & 512) != 0 ? true : z4, (i & 1024) != 0 ? false : z5, (i & 2048) != 0 ? null : f, (i & 4096) != 0 ? false : z6, (i & 8192) != 0 ? null : localDate, (i & 16384) != 0 ? false : z7, (32768 & i) != 0 ? null : coordinates, (65536 & i) != 0 ? false : z8, (i & 131072) != 0 ? false : z9);
    }

    public final UUID getEquityInstrumentId() {
        return this.equityInstrumentId;
    }

    public final MarketHours getMarketHours() {
        return this.marketHours;
    }

    public final List<DataPoint> getDataPoints() {
        return this.dataPoints;
    }

    public final BigDecimal getPrevClosePrice() {
        return this.prevClosePrice;
    }

    public final GraphSelection getSelection() {
        return this.selection;
    }

    public final Historical.Interval getInterval() {
        return this.interval;
    }

    public final boolean getStale() {
        return this.stale;
    }

    public final boolean getShowAfterHours() {
        return this.showAfterHours;
    }

    public final boolean getShowBaseLine() {
        return this.showBaseLine;
    }

    public final boolean getShowMaintenanceLine() {
        return this.showMaintenanceLine;
    }

    public final Float getMaintenanceRequirement() {
        return this.maintenanceRequirement;
    }

    public final LocalDate getListDate() {
        return this.listDate;
    }

    public final boolean getAlwaysShowPrePublic() {
        return this.alwaysShowPrePublic;
    }

    public final SessionScalingHelper.Coordinates getCoordinateOverrides() {
        return this.coordinateOverrides;
    }

    /* renamed from: isFullExtended, reason: from getter */
    public final boolean getIsFullExtended() {
        return this.isFullExtended;
    }

    public final boolean getHideExtendedHours() {
        return this.hideExtendedHours;
    }

    public final boolean getShouldUseLateCloseTimeForAfterHours() {
        return this.shouldUseLateCloseTimeForAfterHours;
    }

    public final int getFullChartNumberOfPoints() {
        return this.fullChartNumberOfPoints;
    }

    public final List<DataPoint.Asset> getAssetDataPoints() {
        return this.assetDataPoints;
    }

    public final boolean getShowLivePulse() {
        return this.showLivePulse;
    }

    public int getRange() {
        int i;
        switch (WhenMappings.$EnumSwitchMapping$0[this.selection.ordinal()]) {
            case 1:
                if (this.isFullExtended) {
                    i = 192;
                } else {
                    i = this.hideExtendedHours ? 78 : 156;
                }
                return Math.max(i, this.dataPoints.size());
            case 2:
            case 3:
                return 288;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
                return this.dataPoints.size();
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final int getPreStartIndex() {
        return this.preStartIndex;
    }

    public final int getRegStartIndex() {
        return this.regStartIndex;
    }

    public final int getPostStartIndex() {
        return this.postStartIndex;
    }

    public final Rectangle getDataBounds() {
        return this.dataBounds;
    }

    public final int getCount() {
        return this.coordinates.size();
    }

    public final BigDecimal getFromPrice() {
        Money openPrice;
        if (this.assetDataPoints.isEmpty()) {
            return BigDecimal.ZERO;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[this.selection.ordinal()];
        if (i == 1 || i == 2) {
            return this.prevClosePrice;
        }
        DataPoint.Asset asset = (DataPoint.Asset) CollectionsKt.firstOrNull((List) this.assetDataPoints);
        if (asset == null || (openPrice = asset.getOpenPrice()) == null) {
            return null;
        }
        return Money3.getBigDecimalCompat(openPrice);
    }

    public final DataPoint.Session getActiveSession() {
        return (DataPoint.Session) this.activeSession.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DataPoint.Session activeSession_delegate$lambda$4(GraphData graphData) {
        DataPoint lastHistorical;
        if (!graphData.selection.getHasBaseline() || graphData.dataPoints.size() >= graphData.getRange() || (lastHistorical = graphData.getLastHistorical()) == null) {
            return null;
        }
        return lastHistorical.getSession();
    }

    public final DataPoint getFirstHistorical() {
        return (DataPoint) CollectionsKt.firstOrNull((List) this.dataPoints);
    }

    public final DataPoint getLastHistorical() {
        return (DataPoint) CollectionsKt.lastOrNull((List) this.dataPoints);
    }

    public final boolean isUp(BigDecimal currentPrice) {
        Money openPrice;
        Money openPrice2;
        BigDecimal bigDecimalCompat = null;
        if (currentPrice == null) {
            DataPoint.Asset asset = (DataPoint.Asset) CollectionsKt.lastOrNull((List) this.assetDataPoints);
            currentPrice = (asset == null || (openPrice2 = asset.getOpenPrice()) == null) ? null : Money3.getBigDecimalCompat(openPrice2);
        }
        if (currentPrice == null) {
            return true;
        }
        DataPoint.Asset asset2 = (DataPoint.Asset) CollectionsKt.firstOrNull((List) this.assetDataPoints);
        if (asset2 != null && (openPrice = asset2.getOpenPrice()) != null) {
            bigDecimalCompat = Money3.getBigDecimalCompat(openPrice);
        }
        return currentPrice.compareTo(BigDecimals7.orZero(bigDecimalCompat)) >= 0;
    }

    public final float getY(int index) {
        return this.coordinates.get(index).getY();
    }

    public final float getX(int index) {
        return this.coordinates.get(index).getX();
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final int getLivePulseX() {
        return this.livePulseX;
    }

    public final boolean isHidden(int index) {
        return index >= 0 && index <= CollectionsKt.getLastIndex(this.coordinates) && this.coordinates.get(index).getHidden();
    }

    public final boolean hasBaseLine() {
        return this.selection.getHasBaseline() && getFromPrice() != null && !this.showMaintenanceLine && this.showBaseLine;
    }

    public final int getFirstPublicIndex() {
        if (this.listDate == null) {
            return 0;
        }
        DataPoint dataPoint = (DataPoint) CollectionsKt.first((List) this.dataPoints);
        if (Instants.toLocalDate$default(dataPoint.getTime(this.interval), null, 1, null).compareTo((ChronoLocalDate) this.listDate.plusDays(1L)) > 0) {
            return 0;
        }
        Iterator<DataPoint> it = this.dataPoints.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            DataPoint next = it.next();
            if (!Intrinsics.areEqual(next.getGraphDisplayValue(true), dataPoint.getGraphDisplayValue(true)) && Instants.toLocalDate$default(next.getTime(this.interval), null, 1, null).compareTo((ChronoLocalDate) this.listDate) >= 0) {
                break;
            }
            i++;
        }
        return RangesKt.coerceAtLeast(i - 1, 0);
    }

    public final List<SessionScalingHelper.Coordinate> getDefaultCoordinates$lib_graph_externalDebug() {
        List<DataPoint> list = this.dataPoints;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            DataPoint dataPoint = (DataPoint) obj;
            arrayList.add(new SessionScalingHelper.Coordinate(i, Money3.getBigDecimalCompat(dataPoint.getGraphDisplayValue(i == 0)).floatValue(), false, dataPoint.getSession()));
            i = i2;
        }
        return arrayList;
    }

    /* compiled from: GraphData.kt */
    @Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0099\u0001\u0010\u001d\u001a\u00020\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u0011¢\u0006\u0004\b\u001d\u0010\u001eJ¹\u0001\u0010&\u001a\u00020\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0\u001f2\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00112\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001b\u001a\u00020\u00112\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"2\b\b\u0002\u0010$\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u0011¢\u0006\u0004\b&\u0010'J\u008b\u0001\u0010*\u001a\u00020\u001c2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00112\b\b\u0002\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020,2\u0006\u0010(\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/GraphData$Companion;", "", "<init>", "()V", "Ljava/util/UUID;", "equityInstrumentId", "Lcom/robinhood/models/db/MarketHours;", "marketHours", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "assetDataPoints", "Ljava/math/BigDecimal;", "prevClosePrice", "Lcom/robinhood/models/ui/GraphSelection;", "selection", "Lcom/robinhood/models/ui/Historical$Interval;", "interval", "", "stale", "showAfterHours", "showBaseLine", "showMaintenanceLine", "", "maintenanceRequirement", "livePulseEnabled", "j$/time/LocalDate", "listDate", "alwaysShowPrePublic", "Lcom/robinhood/android/graph/spark/GraphData;", "fromAssetDataPoints", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZZZZLjava/lang/Float;ZLj$/time/LocalDate;Z)Lcom/robinhood/android/graph/spark/GraphData;", "Lkotlin/Pair;", "j$/time/Instant", "marketBoundaries", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "coordinateOverrides", "isFullExtendedHours", "hideExtendedHours", "forAssetDetailHistorical", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZLkotlin/Pair;ZLjava/lang/Float;ZLj$/time/LocalDate;ZLcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;ZZ)Lcom/robinhood/android/graph/spark/GraphData;", "isLateClosingOptionChain", "fillChartWidth", "forOptionHistorical", "(Ljava/util/UUID;Lcom/robinhood/models/db/MarketHours;Ljava/util/List;Ljava/math/BigDecimal;Lcom/robinhood/models/ui/GraphSelection;Lcom/robinhood/models/ui/Historical$Interval;ZZZZLjava/lang/Float;ZZ)Lcom/robinhood/android/graph/spark/GraphData;", "", "fullChartNumberOfPoints", "(Z)I", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int fullChartNumberOfPoints(boolean isLateClosingOptionChain) {
            return isLateClosingOptionChain ? 81 : 78;
        }

        private Companion() {
        }

        public final GraphData fromAssetDataPoints(UUID equityInstrumentId, MarketHours marketHours, List<? extends DataPoint.Asset> assetDataPoints, BigDecimal prevClosePrice, GraphSelection selection, Historical.Interval interval, boolean stale, boolean showAfterHours, boolean showBaseLine, boolean showMaintenanceLine, Float maintenanceRequirement, boolean livePulseEnabled, LocalDate listDate, boolean alwaysShowPrePublic) {
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(assetDataPoints, "assetDataPoints");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(interval, "interval");
            return new GraphData(equityInstrumentId, marketHours, assetDataPoints, prevClosePrice, selection, interval, false, stale, showAfterHours, showBaseLine, showMaintenanceLine, maintenanceRequirement, livePulseEnabled, listDate, alwaysShowPrePublic, null, false, false, 229376, null);
        }

        public final GraphData forAssetDetailHistorical(final UUID equityInstrumentId, final MarketHours marketHours, final List<? extends DataPoint.Asset> assetDataPoints, final BigDecimal prevClosePrice, final GraphSelection selection, final Historical.Interval interval, final boolean stale, final Tuples2<Instant, Instant> marketBoundaries, final boolean showMaintenanceLine, final Float maintenanceRequirement, final boolean livePulseEnabled, final LocalDate listDate, final boolean alwaysShowPrePublic, final SessionScalingHelper.Coordinates coordinateOverrides, final boolean isFullExtendedHours, final boolean hideExtendedHours) {
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(assetDataPoints, "assetDataPoints");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(interval, "interval");
            Intrinsics.checkNotNullParameter(marketBoundaries, "marketBoundaries");
            return new GraphData(equityInstrumentId, marketHours, assetDataPoints, prevClosePrice, selection, interval, stale, showMaintenanceLine, maintenanceRequirement, livePulseEnabled, listDate, alwaysShowPrePublic, coordinateOverrides, isFullExtendedHours, hideExtendedHours, marketBoundaries) { // from class: com.robinhood.android.graph.spark.GraphData$Companion$forAssetDetailHistorical$1
                final /* synthetic */ Historical.Interval $interval;
                final /* synthetic */ Tuples2<Instant, Instant> $marketBoundaries;

                {
                    this.$interval = interval;
                    this.$marketBoundaries = marketBoundaries;
                    int i = 768;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    boolean z = false;
                    boolean z2 = false;
                    boolean z3 = false;
                }

                @Override // com.robinhood.android.graph.spark.GraphData
                public int getRange() {
                    int size = getDataPoints().size();
                    Duration duration = this.$interval.getDuration();
                    Long lValueOf = duration != null ? Long.valueOf(duration.toMinutes()) : null;
                    if (lValueOf == null) {
                        return size;
                    }
                    Tuples2<Instant, Instant> tuples2 = this.$marketBoundaries;
                    Long lValueOf2 = Long.valueOf(Math.abs(Duration.between(tuples2.getFirst(), tuples2.getSecond()).toMinutes()) / lValueOf.longValue());
                    long jLongValue = lValueOf2.longValue();
                    if (size > jLongValue || jLongValue > 2147483647L) {
                        lValueOf2 = null;
                    }
                    Integer numValueOf = lValueOf2 != null ? Integer.valueOf((int) lValueOf2.longValue()) : null;
                    return numValueOf != null ? numValueOf.intValue() : size;
                }
            };
        }

        public static /* synthetic */ GraphData forOptionHistorical$default(Companion companion, UUID uuid, MarketHours marketHours, List list, BigDecimal bigDecimal, GraphSelection graphSelection, Historical.Interval interval, boolean z, boolean z2, boolean z3, boolean z4, Float f, boolean z5, boolean z6, int i, Object obj) {
            boolean z7;
            Companion companion2;
            UUID uuid2;
            MarketHours marketHours2;
            List list2;
            BigDecimal bigDecimal2;
            GraphSelection graphSelection2;
            Historical.Interval interval2;
            boolean z8;
            boolean z9;
            boolean z10 = (i & 256) != 0 ? true : z3;
            boolean z11 = (i & 512) != 0 ? false : z4;
            Float f2 = (i & 1024) != 0 ? null : f;
            boolean z12 = (i & 2048) != 0 ? false : z5;
            if ((i & 4096) != 0) {
                z7 = false;
                uuid2 = uuid;
                marketHours2 = marketHours;
                list2 = list;
                bigDecimal2 = bigDecimal;
                graphSelection2 = graphSelection;
                interval2 = interval;
                z8 = z;
                z9 = z2;
                companion2 = companion;
            } else {
                z7 = z6;
                companion2 = companion;
                uuid2 = uuid;
                marketHours2 = marketHours;
                list2 = list;
                bigDecimal2 = bigDecimal;
                graphSelection2 = graphSelection;
                interval2 = interval;
                z8 = z;
                z9 = z2;
            }
            return companion2.forOptionHistorical(uuid2, marketHours2, list2, bigDecimal2, graphSelection2, interval2, z8, z9, z10, z11, f2, z12, z7);
        }

        public final GraphData forOptionHistorical(final UUID equityInstrumentId, final MarketHours marketHours, final List<? extends DataPoint.Asset> assetDataPoints, final BigDecimal prevClosePrice, final GraphSelection selection, final Historical.Interval interval, final boolean isLateClosingOptionChain, final boolean stale, final boolean showBaseLine, final boolean showMaintenanceLine, final Float maintenanceRequirement, final boolean livePulseEnabled, final boolean fillChartWidth) {
            Intrinsics.checkNotNullParameter(marketHours, "marketHours");
            Intrinsics.checkNotNullParameter(assetDataPoints, "assetDataPoints");
            Intrinsics.checkNotNullParameter(selection, "selection");
            Intrinsics.checkNotNullParameter(interval, "interval");
            return new GraphData(equityInstrumentId, marketHours, assetDataPoints, prevClosePrice, selection, interval, isLateClosingOptionChain, stale, showBaseLine, showMaintenanceLine, maintenanceRequirement, livePulseEnabled, fillChartWidth) { // from class: com.robinhood.android.graph.spark.GraphData$Companion$forOptionHistorical$1
                final /* synthetic */ boolean $fillChartWidth;
                final /* synthetic */ GraphSelection $selection;

                {
                    this.$selection = selection;
                    this.$fillChartWidth = fillChartWidth;
                    int i = 254208;
                    DefaultConstructorMarker defaultConstructorMarker = null;
                    boolean z = false;
                    LocalDate localDate = null;
                    boolean z2 = false;
                    SessionScalingHelper.Coordinates coordinates = null;
                    boolean z3 = false;
                    boolean z4 = false;
                }

                @Override // com.robinhood.android.graph.spark.GraphData
                public int getRange() {
                    return this.$fillChartWidth ? getDataPoints().size() : this.$selection == GraphSelection.DAY ? Math.max(getFullChartNumberOfPoints(), getDataPoints().size()) : super.getRange();
                }
            };
        }
    }
}
