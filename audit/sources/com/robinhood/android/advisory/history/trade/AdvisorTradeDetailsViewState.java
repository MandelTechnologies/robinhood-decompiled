package com.robinhood.android.advisory.history.trade;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisorTradeDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState$Loading;", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisorTradeDetailsViewState {

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState$Loading;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisorTradeDetailsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 522332193;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisorTradeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/history/trade/AdvisorTradeDetailsViewState;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "lineItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/history/trade/LineItem;", "orderGroupsItems", "Lcom/robinhood/android/advisory/history/trade/OrderGroupItem;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getLineItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getOrderGroupsItems", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisorTradeDetailsViewState {
        public static final int $stable = StringResource.$stable;
        private final ImmutableList<LineItem> lineItems;
        private final ImmutableList<AdvisorTradeDetailsViewState3> orderGroupsItems;
        private final StringResource subtitle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.subtitle;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.lineItems;
            }
            if ((i & 4) != 0) {
                immutableList2 = loaded.orderGroupsItems;
            }
            return loaded.copy(stringResource, immutableList, immutableList2);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<LineItem> component2() {
            return this.lineItems;
        }

        public final ImmutableList<AdvisorTradeDetailsViewState3> component3() {
            return this.orderGroupsItems;
        }

        public final Loaded copy(StringResource subtitle, ImmutableList<LineItem> lineItems, ImmutableList<? extends AdvisorTradeDetailsViewState3> orderGroupsItems) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            Intrinsics.checkNotNullParameter(orderGroupsItems, "orderGroupsItems");
            return new Loaded(subtitle, lineItems, orderGroupsItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.lineItems, loaded.lineItems) && Intrinsics.areEqual(this.orderGroupsItems, loaded.orderGroupsItems);
        }

        public int hashCode() {
            return (((this.subtitle.hashCode() * 31) + this.lineItems.hashCode()) * 31) + this.orderGroupsItems.hashCode();
        }

        public String toString() {
            return "Loaded(subtitle=" + this.subtitle + ", lineItems=" + this.lineItems + ", orderGroupsItems=" + this.orderGroupsItems + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(StringResource subtitle, ImmutableList<LineItem> lineItems, ImmutableList<? extends AdvisorTradeDetailsViewState3> orderGroupsItems) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            Intrinsics.checkNotNullParameter(orderGroupsItems, "orderGroupsItems");
            this.subtitle = subtitle;
            this.lineItems = lineItems;
            this.orderGroupsItems = orderGroupsItems;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<LineItem> getLineItems() {
            return this.lineItems;
        }

        public final ImmutableList<AdvisorTradeDetailsViewState3> getOrderGroupsItems() {
            return this.orderGroupsItems;
        }
    }
}
