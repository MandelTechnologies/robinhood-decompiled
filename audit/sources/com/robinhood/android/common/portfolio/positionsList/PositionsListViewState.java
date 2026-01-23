package com.robinhood.android.common.portfolio.positionsList;

import com.robinhood.android.models.portfolio.PositionsV2;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: PositionsListViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "", "<init>", "()V", "Unbound", "Loading", "Ready", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Loading;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Ready;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Unbound;", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class PositionsListViewState {
    public static final int $stable = 0;

    public /* synthetic */ PositionsListViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private PositionsListViewState() {
    }

    /* compiled from: PositionsListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Unbound;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Unbound extends PositionsListViewState {
        public static final int $stable = 0;
        public static final Unbound INSTANCE = new Unbound();

        public boolean equals(Object other) {
            return this == other || (other instanceof Unbound);
        }

        public int hashCode() {
            return -2040524490;
        }

        public String toString() {
            return "Unbound";
        }

        private Unbound() {
            super(null);
        }
    }

    /* compiled from: PositionsListViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Loading;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends PositionsListViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return -1410756627;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    /* compiled from: PositionsListViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u001d\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\u0011\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003J\t\u0010!\u001a\u00020\rHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003J\t\u0010#\u001a\u00020\rHÆ\u0003Ji\u0010$\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\rHÆ\u0001J\u0013\u0010%\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001a¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState$Ready;", "Lcom/robinhood/android/common/portfolio/positionsList/PositionsListViewState;", "activeDisplayType", "", "Lcom/robinhood/android/models/portfolio/PositionDisplayType;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", Footer.f10637type, "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/models/portfolio/PositionsV2$PositionListItemV2;", "reorderPending", "", "animateItemPlacement", "shouldHeaderShimmer", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lkotlinx/collections/immutable/ImmutableList;ZZZ)V", "getActiveDisplayType", "()Ljava/lang/String;", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getFooter", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getReorderPending", "()Z", "getAnimateItemPlacement", "getShouldHeaderShimmer", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready extends PositionsListViewState {
        public static final int $stable = 8;
        private final String activeDisplayType;
        private final boolean animateItemPlacement;
        private final UIComponent<AccountPositionAction> footer;
        private final UIComponent<AccountPositionAction> header;
        private final ImmutableList<PositionsV2.PositionListItemV2> items;
        private final boolean reorderPending;
        private final boolean shouldHeaderShimmer;

        public static /* synthetic */ Ready copy$default(Ready ready, String str, UIComponent uIComponent, UIComponent uIComponent2, ImmutableList immutableList, boolean z, boolean z2, boolean z3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.activeDisplayType;
            }
            if ((i & 2) != 0) {
                uIComponent = ready.header;
            }
            if ((i & 4) != 0) {
                uIComponent2 = ready.footer;
            }
            if ((i & 8) != 0) {
                immutableList = ready.items;
            }
            if ((i & 16) != 0) {
                z = ready.reorderPending;
            }
            if ((i & 32) != 0) {
                z2 = ready.animateItemPlacement;
            }
            if ((i & 64) != 0) {
                z3 = ready.shouldHeaderShimmer;
            }
            boolean z4 = z2;
            boolean z5 = z3;
            boolean z6 = z;
            UIComponent uIComponent3 = uIComponent2;
            return ready.copy(str, uIComponent, uIComponent3, immutableList, z6, z4, z5);
        }

        /* renamed from: component1, reason: from getter */
        public final String getActiveDisplayType() {
            return this.activeDisplayType;
        }

        public final UIComponent<AccountPositionAction> component2() {
            return this.header;
        }

        public final UIComponent<AccountPositionAction> component3() {
            return this.footer;
        }

        public final ImmutableList<PositionsV2.PositionListItemV2> component4() {
            return this.items;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getReorderPending() {
            return this.reorderPending;
        }

        /* renamed from: component6, reason: from getter */
        public final boolean getAnimateItemPlacement() {
            return this.animateItemPlacement;
        }

        /* renamed from: component7, reason: from getter */
        public final boolean getShouldHeaderShimmer() {
            return this.shouldHeaderShimmer;
        }

        public final Ready copy(String activeDisplayType, UIComponent<? extends AccountPositionAction> header, UIComponent<? extends AccountPositionAction> footer, ImmutableList<PositionsV2.PositionListItemV2> items, boolean reorderPending, boolean animateItemPlacement, boolean shouldHeaderShimmer) {
            Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
            Intrinsics.checkNotNullParameter(items, "items");
            return new Ready(activeDisplayType, header, footer, items, reorderPending, animateItemPlacement, shouldHeaderShimmer);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.activeDisplayType, ready.activeDisplayType) && Intrinsics.areEqual(this.header, ready.header) && Intrinsics.areEqual(this.footer, ready.footer) && Intrinsics.areEqual(this.items, ready.items) && this.reorderPending == ready.reorderPending && this.animateItemPlacement == ready.animateItemPlacement && this.shouldHeaderShimmer == ready.shouldHeaderShimmer;
        }

        public int hashCode() {
            int iHashCode = this.activeDisplayType.hashCode() * 31;
            UIComponent<AccountPositionAction> uIComponent = this.header;
            int iHashCode2 = (iHashCode + (uIComponent == null ? 0 : uIComponent.hashCode())) * 31;
            UIComponent<AccountPositionAction> uIComponent2 = this.footer;
            return ((((((((iHashCode2 + (uIComponent2 != null ? uIComponent2.hashCode() : 0)) * 31) + this.items.hashCode()) * 31) + Boolean.hashCode(this.reorderPending)) * 31) + Boolean.hashCode(this.animateItemPlacement)) * 31) + Boolean.hashCode(this.shouldHeaderShimmer);
        }

        public String toString() {
            return "Ready(activeDisplayType=" + this.activeDisplayType + ", header=" + this.header + ", footer=" + this.footer + ", items=" + this.items + ", reorderPending=" + this.reorderPending + ", animateItemPlacement=" + this.animateItemPlacement + ", shouldHeaderShimmer=" + this.shouldHeaderShimmer + ")";
        }

        public final String getActiveDisplayType() {
            return this.activeDisplayType;
        }

        public final UIComponent<AccountPositionAction> getHeader() {
            return this.header;
        }

        public final UIComponent<AccountPositionAction> getFooter() {
            return this.footer;
        }

        public final ImmutableList<PositionsV2.PositionListItemV2> getItems() {
            return this.items;
        }

        public final boolean getReorderPending() {
            return this.reorderPending;
        }

        public final boolean getAnimateItemPlacement() {
            return this.animateItemPlacement;
        }

        public final boolean getShouldHeaderShimmer() {
            return this.shouldHeaderShimmer;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(String activeDisplayType, UIComponent<? extends AccountPositionAction> uIComponent, UIComponent<? extends AccountPositionAction> uIComponent2, ImmutableList<PositionsV2.PositionListItemV2> items, boolean z, boolean z2, boolean z3) {
            super(null);
            Intrinsics.checkNotNullParameter(activeDisplayType, "activeDisplayType");
            Intrinsics.checkNotNullParameter(items, "items");
            this.activeDisplayType = activeDisplayType;
            this.header = uIComponent;
            this.footer = uIComponent2;
            this.items = items;
            this.reorderPending = z;
            this.animateItemPlacement = z2;
            this.shouldHeaderShimmer = z3;
        }
    }
}
