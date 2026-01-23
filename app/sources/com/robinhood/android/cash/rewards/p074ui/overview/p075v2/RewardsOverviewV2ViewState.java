package com.robinhood.android.cash.rewards.p074ui.overview.p075v2;

import androidx.paging.PagedList;
import com.robinhood.android.cash.rewards.C10176R;
import com.robinhood.models.api.pluto.ApiRoundupEnrollment;
import com.robinhood.models.util.Money;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.datetime.format.InstantFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: RewardsOverviewV2ViewState.kt */
@Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001JB\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n\u0012\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f\u0012\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÂ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u001c\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\"\u0010\u001f\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u008c\u0001\u0010!\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f2\u0010\b\u0002\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000fHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010'\u001a\u00020&HÖ\u0001¢\u0006\u0004\b'\u0010(J\u001a\u0010+\u001a\u00020*2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b+\u0010,R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010-\u001a\u0004\b.\u0010\u001eR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010/R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00100R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0016\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00100R)\u0010\u000e\u001a\u0014\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u0010 R\u001c\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00103R\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u00103R\u0013\u00105\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b4\u0010%R\u0013\u00107\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b6\u0010%R\u0013\u00109\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b8\u0010%R\u0013\u0010;\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b:\u0010%R\u0011\u0010>\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010B\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010F\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0017\u0010H\u001a\b\u0012\u0004\u0012\u00020\f0\u000f8F¢\u0006\u0006\u001a\u0004\bG\u0010\u001bR\u0011\u0010I\u001a\u00020*8F¢\u0006\u0006\u001a\u0004\bI\u0010=¨\u0006K"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState;", "", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "roundupEnrollmentState", "j$/time/Instant", "roundupEnrollmentCreatedAt", "Lcom/robinhood/models/util/Money;", "roundupInvestedAmount", "bonusInvestedAmount", "pendingRoundupAmount", "Landroidx/paging/PagedList;", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "roundupHistoryItems", "", "pendingTransactions", "settledTransactions", "<init>", "(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Landroidx/paging/PagedList;Ljava/util/List;Ljava/util/List;)V", "component2", "()Lj$/time/Instant;", "component3", "()Lcom/robinhood/models/util/Money;", "component4", "component5", "component7", "()Ljava/util/List;", "component8", "component1", "()Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "component6", "()Landroidx/paging/PagedList;", "copy", "(Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;Lj$/time/Instant;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Lcom/robinhood/models/util/Money;Landroidx/paging/PagedList;Ljava/util/List;Ljava/util/List;)Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/pluto/ApiRoundupEnrollment$State;", "getRoundupEnrollmentState", "Lj$/time/Instant;", "Lcom/robinhood/models/util/Money;", "Landroidx/paging/PagedList;", "getRoundupHistoryItems", "Ljava/util/List;", "getLifetimeAmountText", "lifetimeAmountText", "getRoundupInvestedAmountText", "roundupInvestedAmountText", "getBonusInvestedAmountText", "bonusInvestedAmountText", "getPendingRoundupAmountText", "pendingRoundupAmountText", "getShouldShowCoinAnimation", "()Z", "shouldShowCoinAnimation", "Lcom/robinhood/utils/resource/StringResource;", "getRoundupCreatedAtText", "()Lcom/robinhood/utils/resource/StringResource;", "roundupCreatedAtText", "Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState$EligibleTransactionMessageState;", "getEligibleTransactionMessageState", "()Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState$EligibleTransactionMessageState;", "eligibleTransactionMessageState", "getSortedEligibleTransactions", "sortedEligibleTransactions", "isRoundupHistorySectionVisible", "EligibleTransactionMessageState", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RewardsOverviewV2ViewState {
    public static final int $stable = 8;
    private final Money bonusInvestedAmount;
    private final Money pendingRoundupAmount;
    private final List<HistoryEvent> pendingTransactions;
    private final Instant roundupEnrollmentCreatedAt;
    private final ApiRoundupEnrollment.State roundupEnrollmentState;
    private final PagedList<StatefulHistoryEvent<HistoryEvent>> roundupHistoryItems;
    private final Money roundupInvestedAmount;
    private final List<HistoryEvent> settledTransactions;

    /* compiled from: RewardsOverviewV2ViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiRoundupEnrollment.State.values().length];
            try {
                iArr[ApiRoundupEnrollment.State.INACTIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiRoundupEnrollment.State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public RewardsOverviewV2ViewState() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    /* renamed from: component2, reason: from getter */
    private final Instant getRoundupEnrollmentCreatedAt() {
        return this.roundupEnrollmentCreatedAt;
    }

    /* renamed from: component3, reason: from getter */
    private final Money getRoundupInvestedAmount() {
        return this.roundupInvestedAmount;
    }

    /* renamed from: component4, reason: from getter */
    private final Money getBonusInvestedAmount() {
        return this.bonusInvestedAmount;
    }

    /* renamed from: component5, reason: from getter */
    private final Money getPendingRoundupAmount() {
        return this.pendingRoundupAmount;
    }

    private final List<HistoryEvent> component7() {
        return this.pendingTransactions;
    }

    private final List<HistoryEvent> component8() {
        return this.settledTransactions;
    }

    public static /* synthetic */ RewardsOverviewV2ViewState copy$default(RewardsOverviewV2ViewState rewardsOverviewV2ViewState, ApiRoundupEnrollment.State state, Instant instant, Money money, Money money2, Money money3, PagedList pagedList, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            state = rewardsOverviewV2ViewState.roundupEnrollmentState;
        }
        if ((i & 2) != 0) {
            instant = rewardsOverviewV2ViewState.roundupEnrollmentCreatedAt;
        }
        if ((i & 4) != 0) {
            money = rewardsOverviewV2ViewState.roundupInvestedAmount;
        }
        if ((i & 8) != 0) {
            money2 = rewardsOverviewV2ViewState.bonusInvestedAmount;
        }
        if ((i & 16) != 0) {
            money3 = rewardsOverviewV2ViewState.pendingRoundupAmount;
        }
        if ((i & 32) != 0) {
            pagedList = rewardsOverviewV2ViewState.roundupHistoryItems;
        }
        if ((i & 64) != 0) {
            list = rewardsOverviewV2ViewState.pendingTransactions;
        }
        if ((i & 128) != 0) {
            list2 = rewardsOverviewV2ViewState.settledTransactions;
        }
        List list3 = list;
        List list4 = list2;
        Money money4 = money3;
        PagedList pagedList2 = pagedList;
        return rewardsOverviewV2ViewState.copy(state, instant, money, money2, money4, pagedList2, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> component6() {
        return this.roundupHistoryItems;
    }

    public final RewardsOverviewV2ViewState copy(ApiRoundupEnrollment.State roundupEnrollmentState, Instant roundupEnrollmentCreatedAt, Money roundupInvestedAmount, Money bonusInvestedAmount, Money pendingRoundupAmount, PagedList<StatefulHistoryEvent<HistoryEvent>> roundupHistoryItems, List<? extends HistoryEvent> pendingTransactions, List<? extends HistoryEvent> settledTransactions) {
        return new RewardsOverviewV2ViewState(roundupEnrollmentState, roundupEnrollmentCreatedAt, roundupInvestedAmount, bonusInvestedAmount, pendingRoundupAmount, roundupHistoryItems, pendingTransactions, settledTransactions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RewardsOverviewV2ViewState)) {
            return false;
        }
        RewardsOverviewV2ViewState rewardsOverviewV2ViewState = (RewardsOverviewV2ViewState) other;
        return this.roundupEnrollmentState == rewardsOverviewV2ViewState.roundupEnrollmentState && Intrinsics.areEqual(this.roundupEnrollmentCreatedAt, rewardsOverviewV2ViewState.roundupEnrollmentCreatedAt) && Intrinsics.areEqual(this.roundupInvestedAmount, rewardsOverviewV2ViewState.roundupInvestedAmount) && Intrinsics.areEqual(this.bonusInvestedAmount, rewardsOverviewV2ViewState.bonusInvestedAmount) && Intrinsics.areEqual(this.pendingRoundupAmount, rewardsOverviewV2ViewState.pendingRoundupAmount) && Intrinsics.areEqual(this.roundupHistoryItems, rewardsOverviewV2ViewState.roundupHistoryItems) && Intrinsics.areEqual(this.pendingTransactions, rewardsOverviewV2ViewState.pendingTransactions) && Intrinsics.areEqual(this.settledTransactions, rewardsOverviewV2ViewState.settledTransactions);
    }

    public int hashCode() {
        ApiRoundupEnrollment.State state = this.roundupEnrollmentState;
        int iHashCode = (state == null ? 0 : state.hashCode()) * 31;
        Instant instant = this.roundupEnrollmentCreatedAt;
        int iHashCode2 = (iHashCode + (instant == null ? 0 : instant.hashCode())) * 31;
        Money money = this.roundupInvestedAmount;
        int iHashCode3 = (iHashCode2 + (money == null ? 0 : money.hashCode())) * 31;
        Money money2 = this.bonusInvestedAmount;
        int iHashCode4 = (iHashCode3 + (money2 == null ? 0 : money2.hashCode())) * 31;
        Money money3 = this.pendingRoundupAmount;
        int iHashCode5 = (iHashCode4 + (money3 == null ? 0 : money3.hashCode())) * 31;
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.roundupHistoryItems;
        int iHashCode6 = (iHashCode5 + (pagedList == null ? 0 : pagedList.hashCode())) * 31;
        List<HistoryEvent> list = this.pendingTransactions;
        int iHashCode7 = (iHashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        List<HistoryEvent> list2 = this.settledTransactions;
        return iHashCode7 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "RewardsOverviewV2ViewState(roundupEnrollmentState=" + this.roundupEnrollmentState + ", roundupEnrollmentCreatedAt=" + this.roundupEnrollmentCreatedAt + ", roundupInvestedAmount=" + this.roundupInvestedAmount + ", bonusInvestedAmount=" + this.bonusInvestedAmount + ", pendingRoundupAmount=" + this.pendingRoundupAmount + ", roundupHistoryItems=" + this.roundupHistoryItems + ", pendingTransactions=" + this.pendingTransactions + ", settledTransactions=" + this.settledTransactions + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOverviewV2ViewState(ApiRoundupEnrollment.State state, Instant instant, Money money, Money money2, Money money3, PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList, List<? extends HistoryEvent> list, List<? extends HistoryEvent> list2) {
        this.roundupEnrollmentState = state;
        this.roundupEnrollmentCreatedAt = instant;
        this.roundupInvestedAmount = money;
        this.bonusInvestedAmount = money2;
        this.pendingRoundupAmount = money3;
        this.roundupHistoryItems = pagedList;
        this.pendingTransactions = list;
        this.settledTransactions = list2;
    }

    public /* synthetic */ RewardsOverviewV2ViewState(ApiRoundupEnrollment.State state, Instant instant, Money money, Money money2, Money money3, PagedList pagedList, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : state, (i & 2) != 0 ? null : instant, (i & 4) != 0 ? null : money, (i & 8) != 0 ? null : money2, (i & 16) != 0 ? null : money3, (i & 32) != 0 ? null : pagedList, (i & 64) != 0 ? null : list, (i & 128) != 0 ? null : list2);
    }

    public final ApiRoundupEnrollment.State getRoundupEnrollmentState() {
        return this.roundupEnrollmentState;
    }

    public final PagedList<StatefulHistoryEvent<HistoryEvent>> getRoundupHistoryItems() {
        return this.roundupHistoryItems;
    }

    public final String getLifetimeAmountText() {
        Money moneyPlus;
        Money money = this.roundupInvestedAmount;
        if (money == null) {
            Money money2 = this.bonusInvestedAmount;
            if (money2 != null) {
                return Money.format$default(money2, null, false, null, false, 0, null, false, null, false, false, 1023, null);
            }
            return null;
        }
        Money money3 = this.bonusInvestedAmount;
        if (money3 == null || (moneyPlus = money3.plus(money)) == null) {
            return null;
        }
        return Money.format$default(moneyPlus, null, false, null, false, 0, null, false, null, false, false, 1023, null);
    }

    public final String getRoundupInvestedAmountText() {
        Money money = this.roundupInvestedAmount;
        if (money != null) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return null;
    }

    public final String getBonusInvestedAmountText() {
        Money money = this.bonusInvestedAmount;
        if (money != null) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return null;
    }

    public final String getPendingRoundupAmountText() {
        Money money = this.pendingRoundupAmount;
        if (money != null) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return null;
    }

    public final boolean getShouldShowCoinAnimation() {
        if (this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE) {
            return (this.roundupInvestedAmount == null && this.pendingRoundupAmount == null) ? false : true;
        }
        return false;
    }

    public final StringResource getRoundupCreatedAtText() {
        Instant instant = this.roundupEnrollmentCreatedAt;
        if (instant != null) {
            return StringResource.INSTANCE.invoke(C10176R.string.rewards_overview_created_time, InstantFormatter.MEDIUM_DATE_IN_SYSTEM_ZONE.format(instant));
        }
        return null;
    }

    public final EligibleTransactionMessageState getEligibleTransactionMessageState() {
        ApiRoundupEnrollment.State state = this.roundupEnrollmentState;
        int i = state == null ? -1 : WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
        if (i == 1) {
            return EligibleTransactionMessageState.ROUNDUP_PAUSED;
        }
        if (i == 2) {
            Money money = this.pendingRoundupAmount;
            if (money != null && money.isZero() && getSortedEligibleTransactions().isEmpty()) {
                Money money2 = this.roundupInvestedAmount;
                if (money2 != null && money2.isZero()) {
                    return EligibleTransactionMessageState.NO_TRANSACTION_NO_ROUNDUP;
                }
                return EligibleTransactionMessageState.NO_TRANSACTION;
            }
            return EligibleTransactionMessageState.NO_MESSAGE;
        }
        return EligibleTransactionMessageState.NO_MESSAGE;
    }

    public final List<HistoryEvent> getSortedEligibleTransactions() {
        if (this.roundupEnrollmentState == ApiRoundupEnrollment.State.ACTIVE) {
            List<HistoryEvent> listEmptyList = this.pendingTransactions;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            List listSortedWith = CollectionsKt.sortedWith(listEmptyList, new Comparator() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2ViewState$special$$inlined$sortedByDescending$1
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((HistoryEvent) t2).getSortKey(), ((HistoryEvent) t).getSortKey());
                }
            });
            List<HistoryEvent> listEmptyList2 = this.settledTransactions;
            if (listEmptyList2 == null) {
                listEmptyList2 = CollectionsKt.emptyList();
            }
            return CollectionsKt.plus((Collection) listSortedWith, (Iterable) CollectionsKt.sortedWith(listEmptyList2, new Comparator() { // from class: com.robinhood.android.cash.rewards.ui.overview.v2.RewardsOverviewV2ViewState$special$$inlined$sortedByDescending$2
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((HistoryEvent) t2).getSortKey(), ((HistoryEvent) t).getSortKey());
                }
            }));
        }
        return CollectionsKt.emptyList();
    }

    public final boolean isRoundupHistorySectionVisible() {
        PagedList<StatefulHistoryEvent<HistoryEvent>> pagedList = this.roundupHistoryItems;
        return pagedList != null && (pagedList.isEmpty() ^ true);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RewardsOverviewV2ViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/overview/v2/RewardsOverviewV2ViewState$EligibleTransactionMessageState;", "", "<init>", "(Ljava/lang/String;I)V", "NO_MESSAGE", "NO_TRANSACTION_NO_ROUNDUP", "NO_TRANSACTION", "ROUNDUP_PAUSED", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EligibleTransactionMessageState {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EligibleTransactionMessageState[] $VALUES;
        public static final EligibleTransactionMessageState NO_MESSAGE = new EligibleTransactionMessageState("NO_MESSAGE", 0);
        public static final EligibleTransactionMessageState NO_TRANSACTION_NO_ROUNDUP = new EligibleTransactionMessageState("NO_TRANSACTION_NO_ROUNDUP", 1);
        public static final EligibleTransactionMessageState NO_TRANSACTION = new EligibleTransactionMessageState("NO_TRANSACTION", 2);
        public static final EligibleTransactionMessageState ROUNDUP_PAUSED = new EligibleTransactionMessageState("ROUNDUP_PAUSED", 3);

        private static final /* synthetic */ EligibleTransactionMessageState[] $values() {
            return new EligibleTransactionMessageState[]{NO_MESSAGE, NO_TRANSACTION_NO_ROUNDUP, NO_TRANSACTION, ROUNDUP_PAUSED};
        }

        public static EnumEntries<EligibleTransactionMessageState> getEntries() {
            return $ENTRIES;
        }

        private EligibleTransactionMessageState(String str, int i) {
        }

        static {
            EligibleTransactionMessageState[] eligibleTransactionMessageStateArr$values = $values();
            $VALUES = eligibleTransactionMessageStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eligibleTransactionMessageStateArr$values);
        }

        public static EligibleTransactionMessageState valueOf(String str) {
            return (EligibleTransactionMessageState) Enum.valueOf(EligibleTransactionMessageState.class, str);
        }

        public static EligibleTransactionMessageState[] values() {
            return (EligibleTransactionMessageState[]) $VALUES.clone();
        }
    }
}
