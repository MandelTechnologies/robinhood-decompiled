package com.robinhood.android.futures.charts.sparkline;

import android.os.Parcelable;
import com.robinhood.models.serverdriven.experimental.api.Chart;
import com.robinhood.store.futures.ChartType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableSet;
import kotlinx.collections.immutable.extensions2;

/* compiled from: FuturesSparklineDuxo.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\u0012(\b\u0002\u0010\u0007\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003HÆ\u0003J)\u0010\u0012\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bHÆ\u0003JO\u0010\u0013\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u00032(\b\u0002\u0010\u0007\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\bHÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR1\u0010\u0007\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/futures/charts/sparkline/FuturesSparklineViewState;", "", "boundContracts", "Lkotlinx/collections/immutable/ImmutableSet;", "Lkotlin/Pair;", "Ljava/util/UUID;", "Lcom/robinhood/store/futures/ChartType;", "chartData", "Lkotlinx/collections/immutable/ImmutableMap;", "Lcom/robinhood/models/serverdriven/experimental/api/Chart;", "Landroid/os/Parcelable;", "<init>", "(Lkotlinx/collections/immutable/ImmutableSet;Lkotlinx/collections/immutable/ImmutableMap;)V", "getBoundContracts", "()Lkotlinx/collections/immutable/ImmutableSet;", "getChartData", "()Lkotlinx/collections/immutable/ImmutableMap;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-futures-charts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FuturesSparklineViewState {
    public static final int $stable = 8;
    private final ImmutableSet<Tuples2<UUID, ChartType>> boundContracts;
    private final ImmutableMap<Tuples2<UUID, ChartType>, Chart<Parcelable>> chartData;

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesSparklineViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FuturesSparklineViewState copy$default(FuturesSparklineViewState futuresSparklineViewState, ImmutableSet immutableSet, ImmutableMap immutableMap, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableSet = futuresSparklineViewState.boundContracts;
        }
        if ((i & 2) != 0) {
            immutableMap = futuresSparklineViewState.chartData;
        }
        return futuresSparklineViewState.copy(immutableSet, immutableMap);
    }

    public final ImmutableSet<Tuples2<UUID, ChartType>> component1() {
        return this.boundContracts;
    }

    public final ImmutableMap<Tuples2<UUID, ChartType>, Chart<Parcelable>> component2() {
        return this.chartData;
    }

    public final FuturesSparklineViewState copy(ImmutableSet<? extends Tuples2<UUID, ? extends ChartType>> boundContracts, ImmutableMap<Tuples2<UUID, ChartType>, ? extends Chart<? extends Parcelable>> chartData) {
        Intrinsics.checkNotNullParameter(boundContracts, "boundContracts");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        return new FuturesSparklineViewState(boundContracts, chartData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FuturesSparklineViewState)) {
            return false;
        }
        FuturesSparklineViewState futuresSparklineViewState = (FuturesSparklineViewState) other;
        return Intrinsics.areEqual(this.boundContracts, futuresSparklineViewState.boundContracts) && Intrinsics.areEqual(this.chartData, futuresSparklineViewState.chartData);
    }

    public int hashCode() {
        return (this.boundContracts.hashCode() * 31) + this.chartData.hashCode();
    }

    public String toString() {
        return "FuturesSparklineViewState(boundContracts=" + this.boundContracts + ", chartData=" + this.chartData + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FuturesSparklineViewState(ImmutableSet<? extends Tuples2<UUID, ? extends ChartType>> boundContracts, ImmutableMap<Tuples2<UUID, ChartType>, ? extends Chart<? extends Parcelable>> chartData) {
        Intrinsics.checkNotNullParameter(boundContracts, "boundContracts");
        Intrinsics.checkNotNullParameter(chartData, "chartData");
        this.boundContracts = boundContracts;
        this.chartData = chartData;
    }

    public /* synthetic */ FuturesSparklineViewState(ImmutableSet immutableSet, ImmutableMap immutableMap, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentSetOf() : immutableSet, (i & 2) != 0 ? extensions2.persistentMapOf() : immutableMap);
    }

    public final ImmutableSet<Tuples2<UUID, ChartType>> getBoundContracts() {
        return this.boundContracts;
    }

    public final ImmutableMap<Tuples2<UUID, ChartType>, Chart<Parcelable>> getChartData() {
        return this.chartData;
    }
}
