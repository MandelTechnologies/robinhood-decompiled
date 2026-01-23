package com.robinhood.android.portfolio.pnlhub;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.paging.CombinedLoadStates;
import androidx.paging.LoadState;
import androidx.paging.PagingData;
import androidx.paging.compose.LazyPagingItems;
import androidx.paging.compose.LazyPagingItems5;
import com.robinhood.android.models.portfolio.api.AssetClass;
import com.robinhood.android.portfolio.pnl.p214db.ProfitAndLossTradeItem;
import com.robinhood.android.portfolio.pnl.p215ui.UiProfitAndLossTradeGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.flow.Flow;
import p479j$.time.Instant;

/* compiled from: ProfitAndLossTradeListState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b7\u0018\u0000 \u001e2\u00020\u0001:\u0003\u001f \u001eB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\u0082\u0001\u0002!\"¨\u0006$²\u0006\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "", "j$/time/Instant", "tradeItemsLastUpdatedTimestamp", "", "showDebouncedLoadingSpinner", "<init>", "(Lj$/time/Instant;Z)V", "Landroidx/paging/compose/LazyPagingItems;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "collectAsLazyPagingItems$feature_profit_and_loss_hub_externalDebug", "(Landroidx/compose/runtime/Composer;I)Landroidx/paging/compose/LazyPagingItems;", "collectAsLazyPagingItems", "now", "shouldRefresh$feature_profit_and_loss_hub_externalDebug", "(Lj$/time/Instant;)Z", "shouldRefresh", "timestamp", "updateTradeItemsLastUpdatedTimestamp$feature_profit_and_loss_hub_externalDebug", "(Lj$/time/Instant;)Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "updateTradeItemsLastUpdatedTimestamp", "updateShowDebouncedLoadingSpinner$feature_profit_and_loss_hub_externalDebug", "(Z)Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "updateShowDebouncedLoadingSpinner", "Lj$/time/Instant;", "getTradeItemsLastUpdatedTimestamp", "()Lj$/time/Instant;", "Z", "getShowDebouncedLoadingSpinner", "()Z", "Companion", "Grouped", "Flattened", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Flattened;", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Grouped;", "bufferedTradeItems", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public abstract class ProfitAndLossTradeListState {
    public static final int PNL_HUB_TRADE_LIST_REFRESH_INTERVAL = 60000;
    private final boolean showDebouncedLoadingSpinner;
    private final Instant tradeItemsLastUpdatedTimestamp;
    public static final int $stable = 8;

    public /* synthetic */ ProfitAndLossTradeListState(Instant instant, boolean z, DefaultConstructorMarker defaultConstructorMarker) {
        this(instant, z);
    }

    private ProfitAndLossTradeListState(Instant instant, boolean z) {
        this.tradeItemsLastUpdatedTimestamp = instant;
        this.showDebouncedLoadingSpinner = z;
    }

    public Instant getTradeItemsLastUpdatedTimestamp() {
        return this.tradeItemsLastUpdatedTimestamp;
    }

    public boolean getShowDebouncedLoadingSpinner() {
        return this.showDebouncedLoadingSpinner;
    }

    /* compiled from: ProfitAndLossTradeListState.kt */
    @Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u001e\u0010\u0015\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJh\u0010\u001e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00022\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\tHÖ\u0001¢\u0006\u0004\b \u0010\u0018J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020\u000f2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b&\u0010'R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b)\u0010\u0014R%\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010,\u001a\u0004\b-\u0010\u0018R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b.\u0010\u0014R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010/\u001a\u0004\b0\u0010\u001bR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00101\u001a\u0004\b2\u0010\u001d¨\u00063"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Grouped;", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "", "Lcom/robinhood/android/portfolio/pnl/ui/UiProfitAndLossTradeGroup;", "tradeGroups", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "expandedTradeItems", "", "expandedGroupId", "Lcom/robinhood/android/models/portfolio/api/AssetClass;", "expandedGroupAssetClasses", "j$/time/Instant", "tradeItemsLastUpdatedTimestamp", "", "showDebouncedLoadingSpinner", "<init>", "(Ljava/util/List;Lkotlinx/coroutines/flow/Flow;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Z)V", "component1", "()Ljava/util/List;", "component2", "()Lkotlinx/coroutines/flow/Flow;", "component3", "()Ljava/lang/String;", "component4", "component5", "()Lj$/time/Instant;", "component6", "()Z", "copy", "(Ljava/util/List;Lkotlinx/coroutines/flow/Flow;Ljava/lang/String;Ljava/util/List;Lj$/time/Instant;Z)Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Grouped;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getTradeGroups", "Lkotlinx/coroutines/flow/Flow;", "getExpandedTradeItems", "Ljava/lang/String;", "getExpandedGroupId", "getExpandedGroupAssetClasses", "Lj$/time/Instant;", "getTradeItemsLastUpdatedTimestamp", "Z", "getShowDebouncedLoadingSpinner", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Grouped extends ProfitAndLossTradeListState {
        public static final int $stable = 8;
        private final List<AssetClass> expandedGroupAssetClasses;
        private final String expandedGroupId;
        private final Flow<PagingData<ProfitAndLossTradeItem>> expandedTradeItems;
        private final boolean showDebouncedLoadingSpinner;
        private final List<UiProfitAndLossTradeGroup> tradeGroups;
        private final Instant tradeItemsLastUpdatedTimestamp;

        public static /* synthetic */ Grouped copy$default(Grouped grouped, List list, Flow flow, String str, List list2, Instant instant, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                list = grouped.tradeGroups;
            }
            if ((i & 2) != 0) {
                flow = grouped.expandedTradeItems;
            }
            if ((i & 4) != 0) {
                str = grouped.expandedGroupId;
            }
            if ((i & 8) != 0) {
                list2 = grouped.expandedGroupAssetClasses;
            }
            if ((i & 16) != 0) {
                instant = grouped.tradeItemsLastUpdatedTimestamp;
            }
            if ((i & 32) != 0) {
                z = grouped.showDebouncedLoadingSpinner;
            }
            Instant instant2 = instant;
            boolean z2 = z;
            return grouped.copy(list, flow, str, list2, instant2, z2);
        }

        public final List<UiProfitAndLossTradeGroup> component1() {
            return this.tradeGroups;
        }

        public final Flow<PagingData<ProfitAndLossTradeItem>> component2() {
            return this.expandedTradeItems;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExpandedGroupId() {
            return this.expandedGroupId;
        }

        public final List<AssetClass> component4() {
            return this.expandedGroupAssetClasses;
        }

        /* renamed from: component5, reason: from getter */
        public final Instant getTradeItemsLastUpdatedTimestamp() {
            return this.tradeItemsLastUpdatedTimestamp;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getShowDebouncedLoadingSpinner() {
            return this.showDebouncedLoadingSpinner;
        }

        public final Grouped copy(List<UiProfitAndLossTradeGroup> tradeGroups, Flow<PagingData<ProfitAndLossTradeItem>> expandedTradeItems, String expandedGroupId, List<? extends AssetClass> expandedGroupAssetClasses, Instant tradeItemsLastUpdatedTimestamp, boolean showDebouncedLoadingSpinner) {
            Intrinsics.checkNotNullParameter(tradeGroups, "tradeGroups");
            Intrinsics.checkNotNullParameter(expandedGroupAssetClasses, "expandedGroupAssetClasses");
            Intrinsics.checkNotNullParameter(tradeItemsLastUpdatedTimestamp, "tradeItemsLastUpdatedTimestamp");
            return new Grouped(tradeGroups, expandedTradeItems, expandedGroupId, expandedGroupAssetClasses, tradeItemsLastUpdatedTimestamp, showDebouncedLoadingSpinner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Grouped)) {
                return false;
            }
            Grouped grouped = (Grouped) other;
            return Intrinsics.areEqual(this.tradeGroups, grouped.tradeGroups) && Intrinsics.areEqual(this.expandedTradeItems, grouped.expandedTradeItems) && Intrinsics.areEqual(this.expandedGroupId, grouped.expandedGroupId) && Intrinsics.areEqual(this.expandedGroupAssetClasses, grouped.expandedGroupAssetClasses) && Intrinsics.areEqual(this.tradeItemsLastUpdatedTimestamp, grouped.tradeItemsLastUpdatedTimestamp) && this.showDebouncedLoadingSpinner == grouped.showDebouncedLoadingSpinner;
        }

        public int hashCode() {
            int iHashCode = this.tradeGroups.hashCode() * 31;
            Flow<PagingData<ProfitAndLossTradeItem>> flow = this.expandedTradeItems;
            int iHashCode2 = (iHashCode + (flow == null ? 0 : flow.hashCode())) * 31;
            String str = this.expandedGroupId;
            return ((((((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.expandedGroupAssetClasses.hashCode()) * 31) + this.tradeItemsLastUpdatedTimestamp.hashCode()) * 31) + Boolean.hashCode(this.showDebouncedLoadingSpinner);
        }

        public String toString() {
            return "Grouped(tradeGroups=" + this.tradeGroups + ", expandedTradeItems=" + this.expandedTradeItems + ", expandedGroupId=" + this.expandedGroupId + ", expandedGroupAssetClasses=" + this.expandedGroupAssetClasses + ", tradeItemsLastUpdatedTimestamp=" + this.tradeItemsLastUpdatedTimestamp + ", showDebouncedLoadingSpinner=" + this.showDebouncedLoadingSpinner + ")";
        }

        public final List<UiProfitAndLossTradeGroup> getTradeGroups() {
            return this.tradeGroups;
        }

        public final Flow<PagingData<ProfitAndLossTradeItem>> getExpandedTradeItems() {
            return this.expandedTradeItems;
        }

        public final String getExpandedGroupId() {
            return this.expandedGroupId;
        }

        public /* synthetic */ Grouped(List list, Flow flow, String str, List list2, Instant instant, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? null : flow, (i & 4) != 0 ? null : str, (i & 8) != 0 ? CollectionsKt.emptyList() : list2, instant, (i & 32) != 0 ? false : z);
        }

        public final List<AssetClass> getExpandedGroupAssetClasses() {
            return this.expandedGroupAssetClasses;
        }

        @Override // com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState
        public Instant getTradeItemsLastUpdatedTimestamp() {
            return this.tradeItemsLastUpdatedTimestamp;
        }

        @Override // com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState
        public boolean getShowDebouncedLoadingSpinner() {
            return this.showDebouncedLoadingSpinner;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Grouped(List<UiProfitAndLossTradeGroup> tradeGroups, Flow<PagingData<ProfitAndLossTradeItem>> flow, String str, List<? extends AssetClass> expandedGroupAssetClasses, Instant tradeItemsLastUpdatedTimestamp, boolean z) {
            super(tradeItemsLastUpdatedTimestamp, z, null);
            Intrinsics.checkNotNullParameter(tradeGroups, "tradeGroups");
            Intrinsics.checkNotNullParameter(expandedGroupAssetClasses, "expandedGroupAssetClasses");
            Intrinsics.checkNotNullParameter(tradeItemsLastUpdatedTimestamp, "tradeItemsLastUpdatedTimestamp");
            this.tradeGroups = tradeGroups;
            this.expandedTradeItems = flow;
            this.expandedGroupId = str;
            this.expandedGroupAssetClasses = expandedGroupAssetClasses;
            this.tradeItemsLastUpdatedTimestamp = tradeItemsLastUpdatedTimestamp;
            this.showDebouncedLoadingSpinner = z;
        }
    }

    /* compiled from: ProfitAndLossTradeListState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\f\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR%\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000fR\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0011¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Flattened;", "Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState;", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/android/portfolio/pnl/db/ProfitAndLossTradeItem;", "tradeItems", "j$/time/Instant", "tradeItemsLastUpdatedTimestamp", "", "showDebouncedLoadingSpinner", "<init>", "(Lkotlinx/coroutines/flow/Flow;Lj$/time/Instant;Z)V", "component1", "()Lkotlinx/coroutines/flow/Flow;", "component2", "()Lj$/time/Instant;", "component3", "()Z", "copy", "(Lkotlinx/coroutines/flow/Flow;Lj$/time/Instant;Z)Lcom/robinhood/android/portfolio/pnlhub/ProfitAndLossTradeListState$Flattened;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/Flow;", "getTradeItems", "Lj$/time/Instant;", "getTradeItemsLastUpdatedTimestamp", "Z", "getShowDebouncedLoadingSpinner", "feature-profit-and-loss-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Flattened extends ProfitAndLossTradeListState {
        public static final int $stable = 8;
        private final boolean showDebouncedLoadingSpinner;
        private final Flow<PagingData<ProfitAndLossTradeItem>> tradeItems;
        private final Instant tradeItemsLastUpdatedTimestamp;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Flattened copy$default(Flattened flattened, Flow flow, Instant instant, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                flow = flattened.tradeItems;
            }
            if ((i & 2) != 0) {
                instant = flattened.tradeItemsLastUpdatedTimestamp;
            }
            if ((i & 4) != 0) {
                z = flattened.showDebouncedLoadingSpinner;
            }
            return flattened.copy(flow, instant, z);
        }

        public final Flow<PagingData<ProfitAndLossTradeItem>> component1() {
            return this.tradeItems;
        }

        /* renamed from: component2, reason: from getter */
        public final Instant getTradeItemsLastUpdatedTimestamp() {
            return this.tradeItemsLastUpdatedTimestamp;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getShowDebouncedLoadingSpinner() {
            return this.showDebouncedLoadingSpinner;
        }

        public final Flattened copy(Flow<PagingData<ProfitAndLossTradeItem>> tradeItems, Instant tradeItemsLastUpdatedTimestamp, boolean showDebouncedLoadingSpinner) {
            Intrinsics.checkNotNullParameter(tradeItemsLastUpdatedTimestamp, "tradeItemsLastUpdatedTimestamp");
            return new Flattened(tradeItems, tradeItemsLastUpdatedTimestamp, showDebouncedLoadingSpinner);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flattened)) {
                return false;
            }
            Flattened flattened = (Flattened) other;
            return Intrinsics.areEqual(this.tradeItems, flattened.tradeItems) && Intrinsics.areEqual(this.tradeItemsLastUpdatedTimestamp, flattened.tradeItemsLastUpdatedTimestamp) && this.showDebouncedLoadingSpinner == flattened.showDebouncedLoadingSpinner;
        }

        public int hashCode() {
            Flow<PagingData<ProfitAndLossTradeItem>> flow = this.tradeItems;
            return ((((flow == null ? 0 : flow.hashCode()) * 31) + this.tradeItemsLastUpdatedTimestamp.hashCode()) * 31) + Boolean.hashCode(this.showDebouncedLoadingSpinner);
        }

        public String toString() {
            return "Flattened(tradeItems=" + this.tradeItems + ", tradeItemsLastUpdatedTimestamp=" + this.tradeItemsLastUpdatedTimestamp + ", showDebouncedLoadingSpinner=" + this.showDebouncedLoadingSpinner + ")";
        }

        public /* synthetic */ Flattened(Flow flow, Instant instant, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : flow, instant, (i & 4) != 0 ? false : z);
        }

        public final Flow<PagingData<ProfitAndLossTradeItem>> getTradeItems() {
            return this.tradeItems;
        }

        @Override // com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState
        public Instant getTradeItemsLastUpdatedTimestamp() {
            return this.tradeItemsLastUpdatedTimestamp;
        }

        @Override // com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState
        public boolean getShowDebouncedLoadingSpinner() {
            return this.showDebouncedLoadingSpinner;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Flattened(Flow<PagingData<ProfitAndLossTradeItem>> flow, Instant tradeItemsLastUpdatedTimestamp, boolean z) {
            super(tradeItemsLastUpdatedTimestamp, z, null);
            Intrinsics.checkNotNullParameter(tradeItemsLastUpdatedTimestamp, "tradeItemsLastUpdatedTimestamp");
            this.tradeItems = flow;
            this.tradeItemsLastUpdatedTimestamp = tradeItemsLastUpdatedTimestamp;
            this.showDebouncedLoadingSpinner = z;
        }
    }

    public final boolean shouldRefresh$feature_profit_and_loss_hub_externalDebug(Instant now) {
        Intrinsics.checkNotNullParameter(now, "now");
        return now.toEpochMilli() - getTradeItemsLastUpdatedTimestamp().toEpochMilli() > 60000;
    }

    /* renamed from: updateTradeItemsLastUpdatedTimestamp$feature_profit_and_loss_hub_externalDebug */
    public final ProfitAndLossTradeListState m2379x61ad68ce(Instant timestamp) {
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        if (this instanceof Grouped) {
            return Grouped.copy$default((Grouped) this, null, null, null, null, timestamp, false, 47, null);
        }
        if (this instanceof Flattened) {
            return Flattened.copy$default((Flattened) this, null, timestamp, false, 5, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* renamed from: updateShowDebouncedLoadingSpinner$feature_profit_and_loss_hub_externalDebug */
    public final ProfitAndLossTradeListState m2378xc335718a(boolean showDebouncedLoadingSpinner) {
        if (this instanceof Grouped) {
            return Grouped.copy$default((Grouped) this, null, null, null, null, null, showDebouncedLoadingSpinner, 31, null);
        }
        if (this instanceof Flattened) {
            return Flattened.copy$default((Flattened) this, null, null, showDebouncedLoadingSpinner, 3, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    private static final LazyPagingItems<ProfitAndLossTradeItem> collectAsLazyPagingItems$lambda$1(SnapshotState<LazyPagingItems<ProfitAndLossTradeItem>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0088  */
    /* renamed from: collectAsLazyPagingItems$feature_profit_and_loss_hub_externalDebug */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final LazyPagingItems<ProfitAndLossTradeItem> m2377xf8a654dc(Composer composer, int i) {
        CombinedLoadStates loadState;
        composer.startReplaceGroup(-1117052489);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1117052489, i, -1, "com.robinhood.android.portfolio.pnlhub.ProfitAndLossTradeListState.collectAsLazyPagingItems (ProfitAndLossTradeListState.kt:44)");
        }
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        LoadState refresh = null;
        refresh = null;
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composer.endReplaceGroup();
        if (this instanceof Grouped) {
            composer.startReplaceGroup(-703811544);
            Flow<PagingData<ProfitAndLossTradeItem>> expandedTradeItems = ((Grouped) this).getExpandedTradeItems();
            snapshotState.setValue(expandedTradeItems != null ? LazyPagingItems5.collectAsLazyPagingItems(expandedTradeItems, null, composer, 0, 1) : null);
            composer.endReplaceGroup();
        } else {
            if (!(this instanceof Flattened)) {
                composer.startReplaceGroup(254390384);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(-703670587);
            Flow<PagingData<ProfitAndLossTradeItem>> tradeItems = ((Flattened) this).getTradeItems();
            LazyPagingItems lazyPagingItemsCollectAsLazyPagingItems = tradeItems == null ? null : LazyPagingItems5.collectAsLazyPagingItems(tradeItems, null, composer, 0, 1);
            if (collectAsLazyPagingItems$lambda$1(snapshotState) != null) {
                if (lazyPagingItemsCollectAsLazyPagingItems != null && (loadState = lazyPagingItemsCollectAsLazyPagingItems.getLoadState()) != null) {
                    refresh = loadState.getRefresh();
                }
                if (!(refresh instanceof LoadState.Loading) || lazyPagingItemsCollectAsLazyPagingItems.getItemCount() != 0) {
                }
                composer.endReplaceGroup();
            } else {
                snapshotState.setValue(lazyPagingItemsCollectAsLazyPagingItems);
                composer.endReplaceGroup();
            }
        }
        LazyPagingItems<ProfitAndLossTradeItem> lazyPagingItemsCollectAsLazyPagingItems$lambda$1 = collectAsLazyPagingItems$lambda$1(snapshotState);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return lazyPagingItemsCollectAsLazyPagingItems$lambda$1;
    }
}
