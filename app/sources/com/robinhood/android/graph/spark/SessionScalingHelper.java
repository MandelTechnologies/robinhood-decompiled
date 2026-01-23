package com.robinhood.android.graph.spark;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.graph.spark.SessionScalingHelper;
import com.robinhood.android.linking.MobileLinkingDeeplinkConstants;
import com.robinhood.android.portfolio.pnl.composable.PnlTradeDetailComposable2;
import com.robinhood.android.sdui.chartgroup.SduiChartZoomTransformer;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.utils.math.BigDecimals7;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Stack;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;

/* compiled from: SessionScalingHelper.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\bÇ\u0002\u0018\u00002\u00020\u0001:\u0006\u0018\u0019\u001a\u001b\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u000e¢\u0006\u0002\b\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011JP\u0010\u0012\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u000e¢\u0006\u0002\b\r2\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011H\u0000¢\u0006\u0002\b\u0013J0\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u0007*\b\u0012\u0004\u0012\u00020\u000b0\u00072\u0016\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\nj\u0002`\u0011H\u0002J5\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00160\u0007*\b\u0012\u0004\u0012\u00020\u00150\u00072\u001b\u0010\t\u001a\u0017\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nj\u0002`\u000e¢\u0006\u0002\b\rH\u0002J\u0012\u0010\u0017\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00160\u0007H\u0002¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper;", "", "<init>", "()V", "scaleCoordinatesValues", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "dataPoints", "", "Lcom/robinhood/models/ui/DataPoint$Asset;", "filter", "Lkotlin/Function1;", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", "", "Lkotlin/ExtensionFunctionType;", "Lcom/robinhood/android/graph/spark/FilteringLogic;", "grouping", "Lcom/robinhood/android/graph/spark/Grouping;", "Lcom/robinhood/android/graph/spark/GroupingLogic;", "scaleCoordinatesImpl", "scaleCoordinatesImpl$lib_graph_externalDebug", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/graph/spark/SessionScalingHelper$GroupedDataPoints;", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$FilteredDataPoints;", "scale", "Coordinates", "Coordinate", "ScaledDataPoints", "FilteredDataPoints", "GroupedDataPoints", "DataPointMetadata", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SessionScalingHelper {
    public static final int $stable = 0;
    public static final SessionScalingHelper INSTANCE = new SessionScalingHelper();

    private SessionScalingHelper() {
    }

    public final Coordinates scaleCoordinatesValues(List<? extends DataPoint.Asset> dataPoints, Function1<? super DataPointMetadata, Boolean> filter, Function1<? super DataPointMetadata, Grouping> grouping) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(grouping, "grouping");
        List<? extends DataPoint.Asset> list = dataPoints;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new DataPointMetadata((DataPoint.Asset) obj, i == 0));
            i = i2;
        }
        return scaleCoordinatesImpl$lib_graph_externalDebug(arrayList, filter, grouping);
    }

    public final Coordinates scaleCoordinatesImpl$lib_graph_externalDebug(List<DataPointMetadata> dataPoints, Function1<? super DataPointMetadata, Boolean> filter, Function1<? super DataPointMetadata, Grouping> grouping) {
        Intrinsics.checkNotNullParameter(dataPoints, "dataPoints");
        Intrinsics.checkNotNullParameter(filter, "filter");
        Intrinsics.checkNotNullParameter(grouping, "grouping");
        return scale(filter(group(dataPoints, grouping), filter));
    }

    private final List<GroupedDataPoints> group(List<DataPointMetadata> list, Function1<? super DataPointMetadata, Grouping> function1) {
        Stack stack = new Stack();
        for (DataPointMetadata dataPointMetadata : list) {
            GroupedDataPoints groupedDataPoints = stack.size() > 0 ? (GroupedDataPoints) stack.peek() : null;
            Grouping sessionScalingHelper2Invoke = function1.invoke(dataPointMetadata);
            if (Intrinsics.areEqual(groupedDataPoints != null ? groupedDataPoints.getGroup() : null, sessionScalingHelper2Invoke)) {
                groupedDataPoints.getUnfilteredDataPoints().add(dataPointMetadata);
            } else {
                stack.add(new GroupedDataPoints(dataPointMetadata, sessionScalingHelper2Invoke));
                CollectionsKt.joinToString$default(stack, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.graph.spark.SessionScalingHelper$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SessionScalingHelper.group$lambda$3$lambda$2$lambda$1((SessionScalingHelper.GroupedDataPoints) obj);
                    }
                }, 31, null);
            }
        }
        return stack;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence group$lambda$3$lambda$2$lambda$1(GroupedDataPoints groupedDataPoints) {
        return groupedDataPoints.getGroup() + ", " + groupedDataPoints.getUnfilteredDataPoints().size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<FilteredDataPoints> filter(List<GroupedDataPoints> list, Function1<? super DataPointMetadata, Boolean> function1) {
        List<GroupedDataPoints> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        for (GroupedDataPoints groupedDataPoints : list2) {
            Grouping group = groupedDataPoints.getGroup();
            List<DataPointMetadata> unfilteredDataPoints = groupedDataPoints.getUnfilteredDataPoints();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : unfilteredDataPoints) {
                if (function1.invoke(obj).booleanValue()) {
                    arrayList2.add(obj);
                }
            }
            float openPrice = groupedDataPoints.getOpenPrice();
            DataPointMetadata dataPointMetadata = (DataPointMetadata) CollectionsKt.lastOrNull((List) groupedDataPoints.getUnfilteredDataPoints());
            arrayList.add(new FilteredDataPoints(group, groupedDataPoints.getUnfilteredDataPoints().size(), arrayList2, openPrice, dataPointMetadata != null ? dataPointMetadata.getPrice() : groupedDataPoints.getOpenPrice()));
        }
        return arrayList;
    }

    private final Coordinates scale(List<FilteredDataPoints> list) {
        List<FilteredDataPoints> list2 = list;
        Iterator<T> it = list2.iterator();
        int originalCount = 0;
        while (it.hasNext()) {
            originalCount += ((FilteredDataPoints) it.next()).getOriginalCount();
        }
        float f = originalCount;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        float originalCount2 = 0.0f;
        for (FilteredDataPoints filteredDataPoints : list2) {
            float f2 = originalCount2 * f;
            originalCount2 += filteredDataPoints.getOriginalCount() / f;
            arrayList.add(new ScaledDataPoints(filteredDataPoints.getGroup(), filteredDataPoints.getPricePoints(), f2, originalCount2 * f));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            CollectionsKt.addAll(arrayList2, ((ScaledDataPoints) it2.next()).getCoordinates());
        }
        return new Coordinates(arrayList2);
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "", "coordinates", "", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinate;", "<init>", "(Ljava/util/List;)V", "getCoordinates", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Coordinates {
        private final List<Coordinate> coordinates;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;
        private static final Coordinates Empty = new Coordinates(CollectionsKt.emptyList());

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Coordinates copy$default(Coordinates coordinates, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                list = coordinates.coordinates;
            }
            return coordinates.copy(list);
        }

        public final List<Coordinate> component1() {
            return this.coordinates;
        }

        public final Coordinates copy(List<Coordinate> coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            return new Coordinates(coordinates);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Coordinates) && Intrinsics.areEqual(this.coordinates, ((Coordinates) other).coordinates);
        }

        public int hashCode() {
            return this.coordinates.hashCode();
        }

        public String toString() {
            return "Coordinates(coordinates=" + this.coordinates + ")";
        }

        /* compiled from: SessionScalingHelper.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates$Companion;", "", "<init>", "()V", "Empty", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "getEmpty", "()Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinates;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Coordinates getEmpty() {
                return Coordinates.Empty;
            }
        }

        public Coordinates(List<Coordinate> coordinates) {
            Intrinsics.checkNotNullParameter(coordinates, "coordinates");
            this.coordinates = coordinates;
        }

        public final List<Coordinate> getCoordinates() {
            return this.coordinates;
        }
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinate;", "", "x", "", "y", "hidden", "", "session", "Lcom/robinhood/models/ui/DataPoint$Session;", "<init>", "(FFZLcom/robinhood/models/ui/DataPoint$Session;)V", "getX", "()F", "getY", "getHidden", "()Z", "getSession", "()Lcom/robinhood/models/ui/DataPoint$Session;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Coordinate {
        public static final int $stable = 0;
        private final boolean hidden;
        private final DataPoint.Session session;
        private final float x;
        private final float y;

        public static /* synthetic */ Coordinate copy$default(Coordinate coordinate, float f, float f2, boolean z, DataPoint.Session session, int i, Object obj) {
            if ((i & 1) != 0) {
                f = coordinate.x;
            }
            if ((i & 2) != 0) {
                f2 = coordinate.y;
            }
            if ((i & 4) != 0) {
                z = coordinate.hidden;
            }
            if ((i & 8) != 0) {
                session = coordinate.session;
            }
            return coordinate.copy(f, f2, z, session);
        }

        /* renamed from: component1, reason: from getter */
        public final float getX() {
            return this.x;
        }

        /* renamed from: component2, reason: from getter */
        public final float getY() {
            return this.y;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getHidden() {
            return this.hidden;
        }

        /* renamed from: component4, reason: from getter */
        public final DataPoint.Session getSession() {
            return this.session;
        }

        public final Coordinate copy(float x, float y, boolean hidden, DataPoint.Session session) {
            return new Coordinate(x, y, hidden, session);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Coordinate)) {
                return false;
            }
            Coordinate coordinate = (Coordinate) other;
            return Float.compare(this.x, coordinate.x) == 0 && Float.compare(this.y, coordinate.y) == 0 && this.hidden == coordinate.hidden && this.session == coordinate.session;
        }

        public int hashCode() {
            int iHashCode = ((((Float.hashCode(this.x) * 31) + Float.hashCode(this.y)) * 31) + Boolean.hashCode(this.hidden)) * 31;
            DataPoint.Session session = this.session;
            return iHashCode + (session == null ? 0 : session.hashCode());
        }

        public String toString() {
            return "Coordinate(x=" + this.x + ", y=" + this.y + ", hidden=" + this.hidden + ", session=" + this.session + ")";
        }

        public Coordinate(float f, float f2, boolean z, DataPoint.Session session) {
            this.x = f;
            this.y = f2;
            this.hidden = z;
            this.session = session;
        }

        public final float getX() {
            return this.x;
        }

        public final float getY() {
            return this.y;
        }

        public final boolean getHidden() {
            return this.hidden;
        }

        public final DataPoint.Session getSession() {
            return this.session;
        }
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\bHÆ\u0003J\t\u0010\u0019\u001a\u00020\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$ScaledDataPoints;", "", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/graph/spark/Grouping;", "pricePoints", "", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$FilteredDataPoints$PricePoint;", "startX", "", "endX", "<init>", "(Lcom/robinhood/android/graph/spark/Grouping;Ljava/util/List;FF)V", "getGroup", "()Lcom/robinhood/android/graph/spark/Grouping;", "getPricePoints", "()Ljava/util/List;", "getStartX", "()F", "getEndX", "coordinates", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$Coordinate;", "getCoordinates", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final /* data */ class ScaledDataPoints {
        private final List<Coordinate> coordinates;
        private final float endX;
        private final Grouping group;
        private final List<FilteredDataPoints.PricePoint> pricePoints;
        private final float startX;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ScaledDataPoints copy$default(ScaledDataPoints scaledDataPoints, Grouping sessionScalingHelper2, List list, float f, float f2, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionScalingHelper2 = scaledDataPoints.group;
            }
            if ((i & 2) != 0) {
                list = scaledDataPoints.pricePoints;
            }
            if ((i & 4) != 0) {
                f = scaledDataPoints.startX;
            }
            if ((i & 8) != 0) {
                f2 = scaledDataPoints.endX;
            }
            return scaledDataPoints.copy(sessionScalingHelper2, list, f, f2);
        }

        /* renamed from: component1, reason: from getter */
        public final Grouping getGroup() {
            return this.group;
        }

        public final List<FilteredDataPoints.PricePoint> component2() {
            return this.pricePoints;
        }

        /* renamed from: component3, reason: from getter */
        public final float getStartX() {
            return this.startX;
        }

        /* renamed from: component4, reason: from getter */
        public final float getEndX() {
            return this.endX;
        }

        public final ScaledDataPoints copy(Grouping group, List<FilteredDataPoints.PricePoint> pricePoints, float startX, float endX) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(pricePoints, "pricePoints");
            return new ScaledDataPoints(group, pricePoints, startX, endX);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ScaledDataPoints)) {
                return false;
            }
            ScaledDataPoints scaledDataPoints = (ScaledDataPoints) other;
            return Intrinsics.areEqual(this.group, scaledDataPoints.group) && Intrinsics.areEqual(this.pricePoints, scaledDataPoints.pricePoints) && Float.compare(this.startX, scaledDataPoints.startX) == 0 && Float.compare(this.endX, scaledDataPoints.endX) == 0;
        }

        public int hashCode() {
            return (((((this.group.hashCode() * 31) + this.pricePoints.hashCode()) * 31) + Float.hashCode(this.startX)) * 31) + Float.hashCode(this.endX);
        }

        public String toString() {
            return "ScaledDataPoints(group=" + this.group + ", pricePoints=" + this.pricePoints + ", startX=" + this.startX + ", endX=" + this.endX + ")";
        }

        public ScaledDataPoints(Grouping group, List<FilteredDataPoints.PricePoint> pricePoints, float f, float f2) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(pricePoints, "pricePoints");
            this.group = group;
            this.pricePoints = pricePoints;
            this.startX = f;
            this.endX = f2;
            float fCoerceAtLeast = (f2 - f) / RangesKt.coerceAtLeast(pricePoints.size() - 1, 1);
            List<FilteredDataPoints.PricePoint> list = pricePoints;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            int i = 0;
            for (Object obj : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                FilteredDataPoints.PricePoint pricePoint = (FilteredDataPoints.PricePoint) obj;
                arrayList.add(new Coordinate(this.startX + (i * fCoerceAtLeast), pricePoint.getPrice(), this.group.isHidden(), pricePoint.getSession()));
                i = i2;
            }
            this.coordinates = arrayList;
        }

        public final Grouping getGroup() {
            return this.group;
        }

        public final List<FilteredDataPoints.PricePoint> getPricePoints() {
            return this.pricePoints;
        }

        public final float getStartX() {
            return this.startX;
        }

        public final float getEndX() {
            return this.endX;
        }

        public final List<Coordinate> getCoordinates() {
            return this.coordinates;
        }
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001:\u0001&B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\t\u0010\u001d\u001a\u00020\nHÆ\u0003J\t\u0010\u001e\u001a\u00020\nHÆ\u0003JA\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020%HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0013¨\u0006'"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$FilteredDataPoints;", "", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/graph/spark/Grouping;", "originalCount", "", "filteredDataPoints", "", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", PnlTradeDetailComposable2.TEST_TAG_OPEN_PRICE, "", PnlTradeDetailComposable2.TEST_TAG_CLOSE_PRICE, "<init>", "(Lcom/robinhood/android/graph/spark/Grouping;ILjava/util/List;FF)V", "getGroup", "()Lcom/robinhood/android/graph/spark/Grouping;", "getOriginalCount", "()I", "getFilteredDataPoints", "()Ljava/util/List;", "getOpenPrice", "()F", "getClosePrice", "pricePoints", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$FilteredDataPoints$PricePoint;", "getPricePoints", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "", "PricePoint", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    private static final /* data */ class FilteredDataPoints {
        private final float closePrice;
        private final List<DataPointMetadata> filteredDataPoints;
        private final Grouping group;
        private final float openPrice;
        private final int originalCount;
        private final List<PricePoint> pricePoints;

        public static /* synthetic */ FilteredDataPoints copy$default(FilteredDataPoints filteredDataPoints, Grouping sessionScalingHelper2, int i, List list, float f, float f2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                sessionScalingHelper2 = filteredDataPoints.group;
            }
            if ((i2 & 2) != 0) {
                i = filteredDataPoints.originalCount;
            }
            if ((i2 & 4) != 0) {
                list = filteredDataPoints.filteredDataPoints;
            }
            if ((i2 & 8) != 0) {
                f = filteredDataPoints.openPrice;
            }
            if ((i2 & 16) != 0) {
                f2 = filteredDataPoints.closePrice;
            }
            float f3 = f2;
            List list2 = list;
            return filteredDataPoints.copy(sessionScalingHelper2, i, list2, f, f3);
        }

        /* renamed from: component1, reason: from getter */
        public final Grouping getGroup() {
            return this.group;
        }

        /* renamed from: component2, reason: from getter */
        public final int getOriginalCount() {
            return this.originalCount;
        }

        public final List<DataPointMetadata> component3() {
            return this.filteredDataPoints;
        }

        /* renamed from: component4, reason: from getter */
        public final float getOpenPrice() {
            return this.openPrice;
        }

        /* renamed from: component5, reason: from getter */
        public final float getClosePrice() {
            return this.closePrice;
        }

        public final FilteredDataPoints copy(Grouping group, int originalCount, List<DataPointMetadata> filteredDataPoints, float openPrice, float closePrice) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(filteredDataPoints, "filteredDataPoints");
            return new FilteredDataPoints(group, originalCount, filteredDataPoints, openPrice, closePrice);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FilteredDataPoints)) {
                return false;
            }
            FilteredDataPoints filteredDataPoints = (FilteredDataPoints) other;
            return Intrinsics.areEqual(this.group, filteredDataPoints.group) && this.originalCount == filteredDataPoints.originalCount && Intrinsics.areEqual(this.filteredDataPoints, filteredDataPoints.filteredDataPoints) && Float.compare(this.openPrice, filteredDataPoints.openPrice) == 0 && Float.compare(this.closePrice, filteredDataPoints.closePrice) == 0;
        }

        public int hashCode() {
            return (((((((this.group.hashCode() * 31) + Integer.hashCode(this.originalCount)) * 31) + this.filteredDataPoints.hashCode()) * 31) + Float.hashCode(this.openPrice)) * 31) + Float.hashCode(this.closePrice);
        }

        public String toString() {
            return "FilteredDataPoints(group=" + this.group + ", originalCount=" + this.originalCount + ", filteredDataPoints=" + this.filteredDataPoints + ", openPrice=" + this.openPrice + ", closePrice=" + this.closePrice + ")";
        }

        public FilteredDataPoints(Grouping group, int i, List<DataPointMetadata> filteredDataPoints, float f, float f2) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(filteredDataPoints, "filteredDataPoints");
            this.group = group;
            this.originalCount = i;
            this.filteredDataPoints = filteredDataPoints;
            this.openPrice = f;
            this.closePrice = f2;
            List<DataPointMetadata> list = filteredDataPoints;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            for (DataPointMetadata dataPointMetadata : list) {
                arrayList.add(new PricePoint(dataPointMetadata.getPrice(), dataPointMetadata.getSession()));
            }
            List<PricePoint> mutableList = CollectionsKt.toMutableList((Collection) arrayList);
            float f3 = this.openPrice;
            PricePoint pricePoint = (PricePoint) CollectionsKt.firstOrNull((List) mutableList);
            mutableList.add(0, new PricePoint(f3, pricePoint != null ? pricePoint.getSession() : null));
            float f4 = this.closePrice;
            PricePoint pricePoint2 = (PricePoint) CollectionsKt.lastOrNull((List) mutableList);
            mutableList.add(new PricePoint(f4, pricePoint2 != null ? pricePoint2.getSession() : null));
            this.pricePoints = mutableList;
        }

        public final Grouping getGroup() {
            return this.group;
        }

        public final int getOriginalCount() {
            return this.originalCount;
        }

        public final List<DataPointMetadata> getFilteredDataPoints() {
            return this.filteredDataPoints;
        }

        public final float getOpenPrice() {
            return this.openPrice;
        }

        public final float getClosePrice() {
            return this.closePrice;
        }

        public final List<PricePoint> getPricePoints() {
            return this.pricePoints;
        }

        /* compiled from: SessionScalingHelper.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$FilteredDataPoints$PricePoint;", "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "", "session", "Lcom/robinhood/models/ui/DataPoint$Session;", "<init>", "(FLcom/robinhood/models/ui/DataPoint$Session;)V", "getPrice", "()F", "getSession", "()Lcom/robinhood/models/ui/DataPoint$Session;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class PricePoint {
            public static final int $stable = 0;
            private final float price;
            private final DataPoint.Session session;

            public static /* synthetic */ PricePoint copy$default(PricePoint pricePoint, float f, DataPoint.Session session, int i, Object obj) {
                if ((i & 1) != 0) {
                    f = pricePoint.price;
                }
                if ((i & 2) != 0) {
                    session = pricePoint.session;
                }
                return pricePoint.copy(f, session);
            }

            /* renamed from: component1, reason: from getter */
            public final float getPrice() {
                return this.price;
            }

            /* renamed from: component2, reason: from getter */
            public final DataPoint.Session getSession() {
                return this.session;
            }

            public final PricePoint copy(float price, DataPoint.Session session) {
                return new PricePoint(price, session);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof PricePoint)) {
                    return false;
                }
                PricePoint pricePoint = (PricePoint) other;
                return Float.compare(this.price, pricePoint.price) == 0 && this.session == pricePoint.session;
            }

            public int hashCode() {
                int iHashCode = Float.hashCode(this.price) * 31;
                DataPoint.Session session = this.session;
                return iHashCode + (session == null ? 0 : session.hashCode());
            }

            public String toString() {
                return "PricePoint(price=" + this.price + ", session=" + this.session + ")";
            }

            public PricePoint(float f, DataPoint.Session session) {
                this.price = f;
                this.session = session;
            }

            public final float getPrice() {
                return this.price;
            }

            public final DataPoint.Session getSession() {
                return this.session;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0007HÂ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$GroupedDataPoints;", "", MobileLinkingDeeplinkConstants.group_id_param, "Lcom/robinhood/android/graph/spark/Grouping;", PnlTradeDetailComposable2.TEST_TAG_OPEN_PRICE, "", "initialDataPoint", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", "<init>", "(Lcom/robinhood/android/graph/spark/Grouping;FLcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;)V", "(Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;Lcom/robinhood/android/graph/spark/Grouping;)V", "getGroup", "()Lcom/robinhood/android/graph/spark/Grouping;", "getOpenPrice", "()F", "unfilteredDataPoints", "", "getUnfilteredDataPoints", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    static final /* data */ class GroupedDataPoints {
        private final Grouping group;
        private final DataPointMetadata initialDataPoint;
        private final float openPrice;
        private final List<DataPointMetadata> unfilteredDataPoints;

        /* renamed from: component3, reason: from getter */
        private final DataPointMetadata getInitialDataPoint() {
            return this.initialDataPoint;
        }

        public static /* synthetic */ GroupedDataPoints copy$default(GroupedDataPoints groupedDataPoints, Grouping sessionScalingHelper2, float f, DataPointMetadata dataPointMetadata, int i, Object obj) {
            if ((i & 1) != 0) {
                sessionScalingHelper2 = groupedDataPoints.group;
            }
            if ((i & 2) != 0) {
                f = groupedDataPoints.openPrice;
            }
            if ((i & 4) != 0) {
                dataPointMetadata = groupedDataPoints.initialDataPoint;
            }
            return groupedDataPoints.copy(sessionScalingHelper2, f, dataPointMetadata);
        }

        /* renamed from: component1, reason: from getter */
        public final Grouping getGroup() {
            return this.group;
        }

        /* renamed from: component2, reason: from getter */
        public final float getOpenPrice() {
            return this.openPrice;
        }

        public final GroupedDataPoints copy(Grouping group, float openPrice, DataPointMetadata initialDataPoint) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(initialDataPoint, "initialDataPoint");
            return new GroupedDataPoints(group, openPrice, initialDataPoint);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GroupedDataPoints)) {
                return false;
            }
            GroupedDataPoints groupedDataPoints = (GroupedDataPoints) other;
            return Intrinsics.areEqual(this.group, groupedDataPoints.group) && Float.compare(this.openPrice, groupedDataPoints.openPrice) == 0 && Intrinsics.areEqual(this.initialDataPoint, groupedDataPoints.initialDataPoint);
        }

        public int hashCode() {
            return (((this.group.hashCode() * 31) + Float.hashCode(this.openPrice)) * 31) + this.initialDataPoint.hashCode();
        }

        public String toString() {
            return "GroupedDataPoints(group=" + this.group + ", openPrice=" + this.openPrice + ", initialDataPoint=" + this.initialDataPoint + ")";
        }

        public GroupedDataPoints(Grouping group, float f, DataPointMetadata initialDataPoint) {
            Intrinsics.checkNotNullParameter(group, "group");
            Intrinsics.checkNotNullParameter(initialDataPoint, "initialDataPoint");
            this.group = group;
            this.openPrice = f;
            this.initialDataPoint = initialDataPoint;
            this.unfilteredDataPoints = CollectionsKt.mutableListOf(initialDataPoint);
        }

        public final Grouping getGroup() {
            return this.group;
        }

        public final float getOpenPrice() {
            return this.openPrice;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public GroupedDataPoints(DataPointMetadata initialDataPoint, Grouping group) {
            this(group, initialDataPoint.getPrice(), initialDataPoint);
            Intrinsics.checkNotNullParameter(initialDataPoint, "initialDataPoint");
            Intrinsics.checkNotNullParameter(group, "group");
        }

        public final List<DataPointMetadata> getUnfilteredDataPoints() {
            return this.unfilteredDataPoints;
        }
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\n\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J:\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0016R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0018¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", "", "j$/time/Instant", "beginsAt", "Lcom/robinhood/models/ui/DataPoint$Session;", "session", "Ljava/math/BigDecimal;", SduiChartZoomTransformer.VOLUME_IDENTIFIER, "", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "<init>", "(Lj$/time/Instant;Lcom/robinhood/models/ui/DataPoint$Session;Ljava/math/BigDecimal;F)V", "Lcom/robinhood/models/ui/DataPoint$Asset;", "dataPoint", "", "isFirst", "(Lcom/robinhood/models/ui/DataPoint$Asset;Z)V", "component1", "()Lj$/time/Instant;", "component2", "()Lcom/robinhood/models/ui/DataPoint$Session;", "component3", "()Ljava/math/BigDecimal;", "component4", "()F", "copy", "(Lj$/time/Instant;Lcom/robinhood/models/ui/DataPoint$Session;Ljava/math/BigDecimal;F)Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Instant;", "getBeginsAt", "Lcom/robinhood/models/ui/DataPoint$Session;", "getSession", "Ljava/math/BigDecimal;", "getVolume", "F", "getPrice", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DataPointMetadata {
        public static final int $stable = 8;
        private final Instant beginsAt;
        private final float price;
        private final DataPoint.Session session;
        private final BigDecimal volume;

        public static /* synthetic */ DataPointMetadata copy$default(DataPointMetadata dataPointMetadata, Instant instant, DataPoint.Session session, BigDecimal bigDecimal, float f, int i, Object obj) {
            if ((i & 1) != 0) {
                instant = dataPointMetadata.beginsAt;
            }
            if ((i & 2) != 0) {
                session = dataPointMetadata.session;
            }
            if ((i & 4) != 0) {
                bigDecimal = dataPointMetadata.volume;
            }
            if ((i & 8) != 0) {
                f = dataPointMetadata.price;
            }
            return dataPointMetadata.copy(instant, session, bigDecimal, f);
        }

        /* renamed from: component1, reason: from getter */
        public final Instant getBeginsAt() {
            return this.beginsAt;
        }

        /* renamed from: component2, reason: from getter */
        public final DataPoint.Session getSession() {
            return this.session;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getVolume() {
            return this.volume;
        }

        /* renamed from: component4, reason: from getter */
        public final float getPrice() {
            return this.price;
        }

        public final DataPointMetadata copy(Instant beginsAt, DataPoint.Session session, BigDecimal volume, float price) {
            Intrinsics.checkNotNullParameter(beginsAt, "beginsAt");
            Intrinsics.checkNotNullParameter(volume, "volume");
            return new DataPointMetadata(beginsAt, session, volume, price);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DataPointMetadata)) {
                return false;
            }
            DataPointMetadata dataPointMetadata = (DataPointMetadata) other;
            return Intrinsics.areEqual(this.beginsAt, dataPointMetadata.beginsAt) && this.session == dataPointMetadata.session && Intrinsics.areEqual(this.volume, dataPointMetadata.volume) && Float.compare(this.price, dataPointMetadata.price) == 0;
        }

        public int hashCode() {
            int iHashCode = this.beginsAt.hashCode() * 31;
            DataPoint.Session session = this.session;
            return ((((iHashCode + (session == null ? 0 : session.hashCode())) * 31) + this.volume.hashCode()) * 31) + Float.hashCode(this.price);
        }

        public String toString() {
            return "DataPointMetadata(beginsAt=" + this.beginsAt + ", session=" + this.session + ", volume=" + this.volume + ", price=" + this.price + ")";
        }

        public DataPointMetadata(Instant beginsAt, DataPoint.Session session, BigDecimal volume, float f) {
            Intrinsics.checkNotNullParameter(beginsAt, "beginsAt");
            Intrinsics.checkNotNullParameter(volume, "volume");
            this.beginsAt = beginsAt;
            this.session = session;
            this.volume = volume;
            this.price = f;
        }

        public final Instant getBeginsAt() {
            return this.beginsAt;
        }

        public final DataPoint.Session getSession() {
            return this.session;
        }

        public final BigDecimal getVolume() {
            return this.volume;
        }

        public final float getPrice() {
            return this.price;
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public DataPointMetadata(DataPoint.Asset dataPoint, boolean z) {
            this(dataPoint.getBeginsAt(), dataPoint.getSession(), BigDecimals7.orZero(dataPoint.getVolume()), dataPoint.getGraphDisplayValue(z).getDecimalValue().floatValue());
            Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
        }
    }
}
