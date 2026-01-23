package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import com.robinhood.models.p320db.bonfire.RhyAccount;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.Some;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RhyOverviewCarouselDataState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JI\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselDataState;", "", "carouselItems", "", "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;", "rhyAccount", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/db/bonfire/RhyAccount;", "minervaAccount", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "creditCardWaitlistFlowSimplified", "", "<init>", "(Ljava/util/List;Lcom/robinhood/utils/Optional;Lcom/robinhood/utils/Optional;Z)V", "getCarouselItems", "()Ljava/util/List;", "getRhyAccount", "()Lcom/robinhood/utils/Optional;", "getMinervaAccount", "getCreditCardWaitlistFlowSimplified", "()Z", "isActiveAccount", "()Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class RhyOverviewCarouselDataState {
    public static final int $stable = 8;
    private final List<RhyTabCarouselItem> carouselItems;
    private final boolean creditCardWaitlistFlowSimplified;
    private final Optional<MinervaAccount> minervaAccount;
    private final Optional<RhyAccount> rhyAccount;

    public RhyOverviewCarouselDataState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RhyOverviewCarouselDataState copy$default(RhyOverviewCarouselDataState rhyOverviewCarouselDataState, List list, Optional optional, Optional optional2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = rhyOverviewCarouselDataState.carouselItems;
        }
        if ((i & 2) != 0) {
            optional = rhyOverviewCarouselDataState.rhyAccount;
        }
        if ((i & 4) != 0) {
            optional2 = rhyOverviewCarouselDataState.minervaAccount;
        }
        if ((i & 8) != 0) {
            z = rhyOverviewCarouselDataState.creditCardWaitlistFlowSimplified;
        }
        return rhyOverviewCarouselDataState.copy(list, optional, optional2, z);
    }

    public final List<RhyTabCarouselItem> component1() {
        return this.carouselItems;
    }

    public final Optional<RhyAccount> component2() {
        return this.rhyAccount;
    }

    public final Optional<MinervaAccount> component3() {
        return this.minervaAccount;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getCreditCardWaitlistFlowSimplified() {
        return this.creditCardWaitlistFlowSimplified;
    }

    public final RhyOverviewCarouselDataState copy(List<RhyTabCarouselItem> carouselItems, Optional<RhyAccount> rhyAccount, Optional<MinervaAccount> minervaAccount, boolean creditCardWaitlistFlowSimplified) {
        return new RhyOverviewCarouselDataState(carouselItems, rhyAccount, minervaAccount, creditCardWaitlistFlowSimplified);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RhyOverviewCarouselDataState)) {
            return false;
        }
        RhyOverviewCarouselDataState rhyOverviewCarouselDataState = (RhyOverviewCarouselDataState) other;
        return Intrinsics.areEqual(this.carouselItems, rhyOverviewCarouselDataState.carouselItems) && Intrinsics.areEqual(this.rhyAccount, rhyOverviewCarouselDataState.rhyAccount) && Intrinsics.areEqual(this.minervaAccount, rhyOverviewCarouselDataState.minervaAccount) && this.creditCardWaitlistFlowSimplified == rhyOverviewCarouselDataState.creditCardWaitlistFlowSimplified;
    }

    public int hashCode() {
        List<RhyTabCarouselItem> list = this.carouselItems;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        Optional<RhyAccount> optional = this.rhyAccount;
        int iHashCode2 = (iHashCode + (optional == null ? 0 : optional.hashCode())) * 31;
        Optional<MinervaAccount> optional2 = this.minervaAccount;
        return ((iHashCode2 + (optional2 != null ? optional2.hashCode() : 0)) * 31) + Boolean.hashCode(this.creditCardWaitlistFlowSimplified);
    }

    public String toString() {
        return "RhyOverviewCarouselDataState(carouselItems=" + this.carouselItems + ", rhyAccount=" + this.rhyAccount + ", minervaAccount=" + this.minervaAccount + ", creditCardWaitlistFlowSimplified=" + this.creditCardWaitlistFlowSimplified + ")";
    }

    public RhyOverviewCarouselDataState(List<RhyTabCarouselItem> list, Optional<RhyAccount> optional, Optional<MinervaAccount> optional2, boolean z) {
        this.carouselItems = list;
        this.rhyAccount = optional;
        this.minervaAccount = optional2;
        this.creditCardWaitlistFlowSimplified = z;
    }

    public /* synthetic */ RhyOverviewCarouselDataState(List list, Optional optional, Optional optional2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : optional, (i & 4) != 0 ? null : optional2, (i & 8) != 0 ? false : z);
    }

    public final List<RhyTabCarouselItem> getCarouselItems() {
        return this.carouselItems;
    }

    public final Optional<RhyAccount> getRhyAccount() {
        return this.rhyAccount;
    }

    public final Optional<MinervaAccount> getMinervaAccount() {
        return this.minervaAccount;
    }

    public final boolean getCreditCardWaitlistFlowSimplified() {
        return this.creditCardWaitlistFlowSimplified;
    }

    public final Boolean isActiveAccount() {
        Optional<MinervaAccount> optional = this.minervaAccount;
        if (optional instanceof Some) {
            return Boolean.valueOf(((MinervaAccount) ((Some) optional).getValue()).isActive());
        }
        if (optional instanceof Optional2) {
            Optional<RhyAccount> optional2 = this.rhyAccount;
            return Boolean.valueOf((optional2 != null ? optional2.getOrNull() : null) != null);
        }
        if (optional == null) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }
}
