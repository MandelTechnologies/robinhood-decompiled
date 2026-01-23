package com.robinhood.android.futures.detail.p140ui.duxo;

import com.robinhood.android.futures.detail.p140ui.duxo.FuturesDetailViewState;
import com.robinhood.store.futures.FuturesLocaleStore2;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FuturesDetailViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "", "IacBanner", "Chart", "PendingHistory", "Position", "ContractSpec", "Stats", "About", "SettledHistory", "Disclosure", "Spacer", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$About;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Chart;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$ContractSpec;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Disclosure;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$IacBanner;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$PendingHistory;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Position;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$SettledHistory;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Spacer;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Stats;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData, reason: use source file name */
/* loaded from: classes3.dex */
public interface FuturesDetailViewState2 {

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$IacBanner;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$IacBanner */
    public static final /* data */ class IacBanner implements FuturesDetailViewState2 {
        public static final int $stable = 0;
        public static final IacBanner INSTANCE = new IacBanner();

        public boolean equals(Object other) {
            return this == other || (other instanceof IacBanner);
        }

        public int hashCode() {
            return 284389122;
        }

        public String toString() {
            return "IacBanner";
        }

        private IacBanner() {
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Chart;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$Chart */
    public static final /* data */ class Chart implements FuturesDetailViewState2 {
        public static final int $stable = 0;
        public static final Chart INSTANCE = new Chart();

        public boolean equals(Object other) {
            return this == other || (other instanceof Chart);
        }

        public int hashCode() {
            return 1254749961;
        }

        public String toString() {
            return "Chart";
        }

        private Chart() {
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$PendingHistory;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$PendingHistory, reason: from toString */
    public static final /* data */ class PendingHistory implements FuturesDetailViewState2 {
        public static final int $stable = 8;
        private final FuturesDetailViewState.HistorySectionData data;

        public static /* synthetic */ PendingHistory copy$default(PendingHistory pendingHistory, FuturesDetailViewState.HistorySectionData historySectionData, int i, Object obj) {
            if ((i & 1) != 0) {
                historySectionData = pendingHistory.data;
            }
            return pendingHistory.copy(historySectionData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.HistorySectionData getData() {
            return this.data;
        }

        public final PendingHistory copy(FuturesDetailViewState.HistorySectionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new PendingHistory(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PendingHistory) && Intrinsics.areEqual(this.data, ((PendingHistory) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "PendingHistory(data=" + this.data + ")";
        }

        public PendingHistory(FuturesDetailViewState.HistorySectionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.HistorySectionData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Position;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$PositionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$Position, reason: from toString */
    public static final /* data */ class Position implements FuturesDetailViewState2 {
        public static final int $stable = StringResource.$stable;
        private final FuturesDetailViewState.PositionData data;

        public static /* synthetic */ Position copy$default(Position position, FuturesDetailViewState.PositionData positionData, int i, Object obj) {
            if ((i & 1) != 0) {
                positionData = position.data;
            }
            return position.copy(positionData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.PositionData getData() {
            return this.data;
        }

        public final Position copy(FuturesDetailViewState.PositionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Position(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Position) && Intrinsics.areEqual(this.data, ((Position) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Position(data=" + this.data + ")";
        }

        public Position(FuturesDetailViewState.PositionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.PositionData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$ContractSpec;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$ContractSpecsData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$ContractSpec, reason: from toString */
    public static final /* data */ class ContractSpec implements FuturesDetailViewState2 {
        public static final int $stable = 8;
        private final FuturesDetailViewState.ContractSpecsData data;

        public static /* synthetic */ ContractSpec copy$default(ContractSpec contractSpec, FuturesDetailViewState.ContractSpecsData contractSpecsData, int i, Object obj) {
            if ((i & 1) != 0) {
                contractSpecsData = contractSpec.data;
            }
            return contractSpec.copy(contractSpecsData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.ContractSpecsData getData() {
            return this.data;
        }

        public final ContractSpec copy(FuturesDetailViewState.ContractSpecsData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new ContractSpec(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContractSpec) && Intrinsics.areEqual(this.data, ((ContractSpec) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "ContractSpec(data=" + this.data + ")";
        }

        public ContractSpec(FuturesDetailViewState.ContractSpecsData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.ContractSpecsData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Stats;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$StatsData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$Stats, reason: from toString */
    public static final /* data */ class Stats implements FuturesDetailViewState2 {
        public static final int $stable = StringResource.$stable;
        private final FuturesDetailViewState.StatsData data;

        public static /* synthetic */ Stats copy$default(Stats stats, FuturesDetailViewState.StatsData statsData, int i, Object obj) {
            if ((i & 1) != 0) {
                statsData = stats.data;
            }
            return stats.copy(statsData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.StatsData getData() {
            return this.data;
        }

        public final Stats copy(FuturesDetailViewState.StatsData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new Stats(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Stats) && Intrinsics.areEqual(this.data, ((Stats) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "Stats(data=" + this.data + ")";
        }

        public Stats(FuturesDetailViewState.StatsData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.StatsData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$About;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$AboutData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$About, reason: from toString */
    public static final /* data */ class About implements FuturesDetailViewState2 {
        public static final int $stable = StringResource.$stable;
        private final FuturesDetailViewState.AboutData data;

        public static /* synthetic */ About copy$default(About about, FuturesDetailViewState.AboutData aboutData, int i, Object obj) {
            if ((i & 1) != 0) {
                aboutData = about.data;
            }
            return about.copy(aboutData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.AboutData getData() {
            return this.data;
        }

        public final About copy(FuturesDetailViewState.AboutData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new About(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof About) && Intrinsics.areEqual(this.data, ((About) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "About(data=" + this.data + ")";
        }

        public About(FuturesDetailViewState.AboutData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.AboutData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$SettledHistory;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "<init>", "(Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;)V", "getData", "()Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewState$HistorySectionData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$SettledHistory, reason: from toString */
    public static final /* data */ class SettledHistory implements FuturesDetailViewState2 {
        public static final int $stable = 8;
        private final FuturesDetailViewState.HistorySectionData data;

        public static /* synthetic */ SettledHistory copy$default(SettledHistory settledHistory, FuturesDetailViewState.HistorySectionData historySectionData, int i, Object obj) {
            if ((i & 1) != 0) {
                historySectionData = settledHistory.data;
            }
            return settledHistory.copy(historySectionData);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesDetailViewState.HistorySectionData getData() {
            return this.data;
        }

        public final SettledHistory copy(FuturesDetailViewState.HistorySectionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            return new SettledHistory(data);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SettledHistory) && Intrinsics.areEqual(this.data, ((SettledHistory) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "SettledHistory(data=" + this.data + ")";
        }

        public SettledHistory(FuturesDetailViewState.HistorySectionData data) {
            Intrinsics.checkNotNullParameter(data, "data");
            this.data = data;
        }

        public final FuturesDetailViewState.HistorySectionData getData() {
            return this.data;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Disclosure;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "locale", "Lcom/robinhood/store/futures/FuturesLocale;", "<init>", "(Lcom/robinhood/store/futures/FuturesLocale;)V", "getLocale", "()Lcom/robinhood/store/futures/FuturesLocale;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$Disclosure, reason: from toString */
    public static final /* data */ class Disclosure implements FuturesDetailViewState2 {
        public static final int $stable = 0;
        private final FuturesLocaleStore2 locale;

        public static /* synthetic */ Disclosure copy$default(Disclosure disclosure, FuturesLocaleStore2 futuresLocaleStore2, int i, Object obj) {
            if ((i & 1) != 0) {
                futuresLocaleStore2 = disclosure.locale;
            }
            return disclosure.copy(futuresLocaleStore2);
        }

        /* renamed from: component1, reason: from getter */
        public final FuturesLocaleStore2 getLocale() {
            return this.locale;
        }

        public final Disclosure copy(FuturesLocaleStore2 locale) {
            return new Disclosure(locale);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Disclosure) && this.locale == ((Disclosure) other).locale;
        }

        public int hashCode() {
            FuturesLocaleStore2 futuresLocaleStore2 = this.locale;
            if (futuresLocaleStore2 == null) {
                return 0;
            }
            return futuresLocaleStore2.hashCode();
        }

        public String toString() {
            return "Disclosure(locale=" + this.locale + ")";
        }

        public Disclosure(FuturesLocaleStore2 futuresLocaleStore2) {
            this.locale = futuresLocaleStore2;
        }

        public final FuturesLocaleStore2 getLocale() {
            return this.locale;
        }
    }

    /* compiled from: FuturesDetailViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData$Spacer;", "Lcom/robinhood/android/futures/detail/ui/duxo/FuturesDetailViewData;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.futures.detail.ui.duxo.FuturesDetailViewData$Spacer */
    public static final /* data */ class Spacer implements FuturesDetailViewState2 {
        public static final int $stable = 0;
        public static final Spacer INSTANCE = new Spacer();

        public boolean equals(Object other) {
            return this == other || (other instanceof Spacer);
        }

        public int hashCode() {
            return 707982945;
        }

        public String toString() {
            return "Spacer";
        }

        private Spacer() {
        }
    }
}
