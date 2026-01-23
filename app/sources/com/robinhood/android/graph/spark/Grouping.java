package com.robinhood.android.graph.spark;

import com.robinhood.android.graph.spark.Grouping;
import com.robinhood.android.graph.spark.SessionScalingHelper;
import com.robinhood.models.api.pathfinder.userview.ApiRenderablePlatforms;
import com.robinhood.models.p355ui.DataPoint;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import p479j$.time.Instant;

/* compiled from: SessionScalingHelper.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/Grouping;", "", "id", "", "isHidden", "", "<init>", "(IZ)V", "getId", "()I", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "toString", "", "Companion", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Grouping {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Function1<SessionScalingHelper.DataPointMetadata, Grouping> none = new Function1() { // from class: com.robinhood.android.graph.spark.Grouping$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Grouping.none$lambda$0((SessionScalingHelper.DataPointMetadata) obj);
        }
    };
    private final int id;
    private final boolean isHidden;

    public static /* synthetic */ Grouping copy$default(Grouping grouping, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = grouping.id;
        }
        if ((i2 & 2) != 0) {
            z = grouping.isHidden;
        }
        return grouping.copy(i, z);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    public final Grouping copy(int id, boolean isHidden) {
        return new Grouping(id, isHidden);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Grouping)) {
            return false;
        }
        Grouping grouping = (Grouping) other;
        return this.id == grouping.id && this.isHidden == grouping.isHidden;
    }

    public int hashCode() {
        return (Integer.hashCode(this.id) * 31) + Boolean.hashCode(this.isHidden);
    }

    public String toString() {
        return "Grouping(id=" + this.id + ", isHidden=" + this.isHidden + ")";
    }

    /* compiled from: SessionScalingHelper.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010R'\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006j\u0002`\t8\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/graph/spark/Grouping$Companion;", "", "<init>", "()V", "", "hideOvernight", "Lkotlin/Function1;", "Lcom/robinhood/android/graph/spark/SessionScalingHelper$DataPointMetadata;", "Lcom/robinhood/android/graph/spark/Grouping;", "Lcom/robinhood/android/graph/spark/GroupingLogic;", "byOvernight", "(Z)Lkotlin/jvm/functions/Function1;", "j$/time/Instant", "fullExtendedOpen", "extendedOpen", "byOvernightAndFullExtended", "(ZLj$/time/Instant;Lj$/time/Instant;)Lkotlin/jvm/functions/Function1;", ApiRenderablePlatforms.VERSIONS_NONE, "Lkotlin/jvm/functions/Function1;", "getNone", "()Lkotlin/jvm/functions/Function1;", "lib-graph_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {

        /* compiled from: SessionScalingHelper.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[DataPoint.Session.values().length];
                try {
                    iArr[DataPoint.Session.OVERNIGHT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Function1<SessionScalingHelper.DataPointMetadata, Grouping> getNone() {
            return Grouping.none;
        }

        public final Function1<SessionScalingHelper.DataPointMetadata, Grouping> byOvernight(final boolean hideOvernight) {
            return new Function1() { // from class: com.robinhood.android.graph.spark.Grouping$Companion$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Grouping.Companion.byOvernight$lambda$0(hideOvernight, (SessionScalingHelper.DataPointMetadata) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Grouping byOvernight$lambda$0(boolean z, SessionScalingHelper.DataPointMetadata dataPoint) {
            Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
            DataPoint.Session session = dataPoint.getSession();
            if ((session == null ? -1 : WhenMappings.$EnumSwitchMapping$0[session.ordinal()]) == 1) {
                return new Grouping(1, z);
            }
            return new Grouping(2, false);
        }

        public final Function1<SessionScalingHelper.DataPointMetadata, Grouping> byOvernightAndFullExtended(final boolean hideOvernight, final Instant fullExtendedOpen, final Instant extendedOpen) {
            Intrinsics.checkNotNullParameter(fullExtendedOpen, "fullExtendedOpen");
            Intrinsics.checkNotNullParameter(extendedOpen, "extendedOpen");
            return new Function1() { // from class: com.robinhood.android.graph.spark.Grouping$Companion$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Grouping.Companion.byOvernightAndFullExtended$lambda$1(fullExtendedOpen, extendedOpen, hideOvernight, (SessionScalingHelper.DataPointMetadata) obj);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Grouping byOvernightAndFullExtended$lambda$1(Instant instant, Instant instant2, boolean z, SessionScalingHelper.DataPointMetadata dataPoint) {
            Intrinsics.checkNotNullParameter(dataPoint, "dataPoint");
            if (RangesKt.rangeUntil(instant, instant2).contains(dataPoint.getBeginsAt()) || dataPoint.getSession() == DataPoint.Session.OVERNIGHT) {
                return new Grouping(1, z);
            }
            return new Grouping(2, false);
        }
    }

    public Grouping(int i, boolean z) {
        this.id = i;
        this.isHidden = z;
    }

    public final int getId() {
        return this.id;
    }

    public final boolean isHidden() {
        return this.isHidden;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Grouping none$lambda$0(SessionScalingHelper.DataPointMetadata it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new Grouping(0, false);
    }
}
