package com.robinhood.android.feature.lib.sweep.interest;

import com.robinhood.android.feature.lib.sweep.interest.UiTimelineInfo;
import com.robinhood.models.api.ApiSweepsTimelineSummary;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.mcduckling.MinervaAccount;
import com.robinhood.models.p320db.mcduckling.SweepsTimelineSummary;
import com.robinhood.models.util.Money;
import com.robinhood.transfers.models.p406db.AchTransfer;
import com.robinhood.utils.datetime.Instants;
import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Instant;
import p479j$.time.LocalDate;
import p479j$.time.ZoneId;

/* compiled from: SweepInterestTimelineData.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÂ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÂ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u000bHÂ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\rHÂ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u000fHÂ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b$\u0010%J\\\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000fHÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010)\u001a\u00020(HÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b+\u0010,J\u001a\u0010.\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00104R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00105R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u00106R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00108R\u0017\u0010:\u001a\u0002098\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010\u001fR\u0014\u0010?\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b?\u0010\u001fR\u0011\u0010C\u001a\u00020@8F¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bD\u0010\u001dR\u0011\u0010G\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bF\u0010\u001dR\u0011\u0010J\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0011\u0010N\u001a\u00020K8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, m3636d2 = {"Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestTimelineData;", "", "Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "timelineSummary", "Ljava/math/BigDecimal;", "apyInterestRate", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "minervaAccount", "", "Lcom/robinhood/transfers/models/db/AchTransfer;", "achTransfers", "Lcom/robinhood/models/util/Money;", "accountBuyingPower", "", "isMarginLevered", "Lcom/robinhood/models/db/Account;", "account", "<init>", "(Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;Ljava/math/BigDecimal;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/util/List;Lcom/robinhood/models/util/Money;ZLcom/robinhood/models/db/Account;)V", "Lkotlin/Pair;", "", "j$/time/LocalDate", "getTopTitleIfFirstTime", "()Lkotlin/Pair;", "component3", "()Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "component4", "()Ljava/util/List;", "component5", "()Lcom/robinhood/models/util/Money;", "component6", "()Z", "component7", "()Lcom/robinhood/models/db/Account;", "component1", "()Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "component2", "()Ljava/math/BigDecimal;", "copy", "(Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;Ljava/math/BigDecimal;Lcom/robinhood/models/db/mcduckling/MinervaAccount;Ljava/util/List;Lcom/robinhood/models/util/Money;ZLcom/robinhood/models/db/Account;)Lcom/robinhood/android/feature/lib/sweep/interest/SweepInterestTimelineData;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/db/mcduckling/SweepsTimelineSummary;", "getTimelineSummary", "Ljava/math/BigDecimal;", "getApyInterestRate", "Lcom/robinhood/models/db/mcduckling/MinervaAccount;", "Ljava/util/List;", "Lcom/robinhood/models/util/Money;", "Z", "Lcom/robinhood/models/db/Account;", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary$InterestPaid;", "nextInterestPayment", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary$InterestPaid;", "getNextInterestPayment", "()Lcom/robinhood/models/api/ApiSweepsTimelineSummary$InterestPaid;", "isAchTransferActive", "isAccountBuyingPowerZero", "Lcom/robinhood/models/api/ApiSweepsTimelineSummary$Status;", "getStatus", "()Lcom/robinhood/models/api/ApiSweepsTimelineSummary$Status;", "status", "getSweptCash", "sweptCash", "getLifetimePaidInterest", "lifetimePaidInterest", "getSweptCashBalanceAsOfDate", "()Lj$/time/LocalDate;", "sweptCashBalanceAsOfDate", "Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo;", "getTimeline", "()Lcom/robinhood/android/feature/lib/sweep/interest/UiTimelineInfo;", "timeline", "feature-lib-sweep-interest_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SweepInterestTimelineData {
    private final Account account;
    private final Money accountBuyingPower;
    private final List<AchTransfer> achTransfers;
    private final BigDecimal apyInterestRate;
    private final boolean isMarginLevered;
    private final MinervaAccount minervaAccount;
    private final ApiSweepsTimelineSummary.InterestPaid nextInterestPayment;
    private final SweepsTimelineSummary timelineSummary;

    /* compiled from: SweepInterestTimelineData.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiSweepsTimelineSummary.Status.values().length];
            try {
                iArr[ApiSweepsTimelineSummary.Status.ACTIVATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiSweepsTimelineSummary.Status.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiSweepsTimelineSummary.Status.ONGOING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ApiSweepsTimelineSummary.Status.COMPLETED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component3, reason: from getter */
    private final MinervaAccount getMinervaAccount() {
        return this.minervaAccount;
    }

    private final List<AchTransfer> component4() {
        return this.achTransfers;
    }

    /* renamed from: component5, reason: from getter */
    private final Money getAccountBuyingPower() {
        return this.accountBuyingPower;
    }

    /* renamed from: component6, reason: from getter */
    private final boolean getIsMarginLevered() {
        return this.isMarginLevered;
    }

    /* renamed from: component7, reason: from getter */
    private final Account getAccount() {
        return this.account;
    }

    public static /* synthetic */ SweepInterestTimelineData copy$default(SweepInterestTimelineData sweepInterestTimelineData, SweepsTimelineSummary sweepsTimelineSummary, BigDecimal bigDecimal, MinervaAccount minervaAccount, List list, Money money, boolean z, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            sweepsTimelineSummary = sweepInterestTimelineData.timelineSummary;
        }
        if ((i & 2) != 0) {
            bigDecimal = sweepInterestTimelineData.apyInterestRate;
        }
        if ((i & 4) != 0) {
            minervaAccount = sweepInterestTimelineData.minervaAccount;
        }
        if ((i & 8) != 0) {
            list = sweepInterestTimelineData.achTransfers;
        }
        if ((i & 16) != 0) {
            money = sweepInterestTimelineData.accountBuyingPower;
        }
        if ((i & 32) != 0) {
            z = sweepInterestTimelineData.isMarginLevered;
        }
        if ((i & 64) != 0) {
            account = sweepInterestTimelineData.account;
        }
        boolean z2 = z;
        Account account2 = account;
        Money money2 = money;
        MinervaAccount minervaAccount2 = minervaAccount;
        return sweepInterestTimelineData.copy(sweepsTimelineSummary, bigDecimal, minervaAccount2, list, money2, z2, account2);
    }

    /* renamed from: component1, reason: from getter */
    public final SweepsTimelineSummary getTimelineSummary() {
        return this.timelineSummary;
    }

    /* renamed from: component2, reason: from getter */
    public final BigDecimal getApyInterestRate() {
        return this.apyInterestRate;
    }

    public final SweepInterestTimelineData copy(SweepsTimelineSummary timelineSummary, BigDecimal apyInterestRate, MinervaAccount minervaAccount, List<AchTransfer> achTransfers, Money accountBuyingPower, boolean isMarginLevered, Account account) {
        Intrinsics.checkNotNullParameter(timelineSummary, "timelineSummary");
        Intrinsics.checkNotNullParameter(apyInterestRate, "apyInterestRate");
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        Intrinsics.checkNotNullParameter(achTransfers, "achTransfers");
        Intrinsics.checkNotNullParameter(accountBuyingPower, "accountBuyingPower");
        Intrinsics.checkNotNullParameter(account, "account");
        return new SweepInterestTimelineData(timelineSummary, apyInterestRate, minervaAccount, achTransfers, accountBuyingPower, isMarginLevered, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SweepInterestTimelineData)) {
            return false;
        }
        SweepInterestTimelineData sweepInterestTimelineData = (SweepInterestTimelineData) other;
        return Intrinsics.areEqual(this.timelineSummary, sweepInterestTimelineData.timelineSummary) && Intrinsics.areEqual(this.apyInterestRate, sweepInterestTimelineData.apyInterestRate) && Intrinsics.areEqual(this.minervaAccount, sweepInterestTimelineData.minervaAccount) && Intrinsics.areEqual(this.achTransfers, sweepInterestTimelineData.achTransfers) && Intrinsics.areEqual(this.accountBuyingPower, sweepInterestTimelineData.accountBuyingPower) && this.isMarginLevered == sweepInterestTimelineData.isMarginLevered && Intrinsics.areEqual(this.account, sweepInterestTimelineData.account);
    }

    public int hashCode() {
        return (((((((((((this.timelineSummary.hashCode() * 31) + this.apyInterestRate.hashCode()) * 31) + this.minervaAccount.hashCode()) * 31) + this.achTransfers.hashCode()) * 31) + this.accountBuyingPower.hashCode()) * 31) + Boolean.hashCode(this.isMarginLevered)) * 31) + this.account.hashCode();
    }

    public String toString() {
        return "SweepInterestTimelineData(timelineSummary=" + this.timelineSummary + ", apyInterestRate=" + this.apyInterestRate + ", minervaAccount=" + this.minervaAccount + ", achTransfers=" + this.achTransfers + ", accountBuyingPower=" + this.accountBuyingPower + ", isMarginLevered=" + this.isMarginLevered + ", account=" + this.account + ")";
    }

    public SweepInterestTimelineData(SweepsTimelineSummary timelineSummary, BigDecimal apyInterestRate, MinervaAccount minervaAccount, List<AchTransfer> achTransfers, Money accountBuyingPower, boolean z, Account account) {
        Intrinsics.checkNotNullParameter(timelineSummary, "timelineSummary");
        Intrinsics.checkNotNullParameter(apyInterestRate, "apyInterestRate");
        Intrinsics.checkNotNullParameter(minervaAccount, "minervaAccount");
        Intrinsics.checkNotNullParameter(achTransfers, "achTransfers");
        Intrinsics.checkNotNullParameter(accountBuyingPower, "accountBuyingPower");
        Intrinsics.checkNotNullParameter(account, "account");
        this.timelineSummary = timelineSummary;
        this.apyInterestRate = apyInterestRate;
        this.minervaAccount = minervaAccount;
        this.achTransfers = achTransfers;
        this.accountBuyingPower = accountBuyingPower;
        this.isMarginLevered = z;
        this.account = account;
        this.nextInterestPayment = timelineSummary.getNextInterestPayment();
    }

    public final SweepsTimelineSummary getTimelineSummary() {
        return this.timelineSummary;
    }

    public final BigDecimal getApyInterestRate() {
        return this.apyInterestRate;
    }

    public final ApiSweepsTimelineSummary.Status getStatus() {
        if (this.isMarginLevered) {
            return ApiSweepsTimelineSummary.Status.PAUSED;
        }
        return this.timelineSummary.getStatus();
    }

    public final Money getSweptCash() {
        return this.timelineSummary.getSweepBalance();
    }

    public final Money getLifetimePaidInterest() {
        return this.timelineSummary.getTotalPaidInterest();
    }

    public final LocalDate getSweptCashBalanceAsOfDate() {
        LocalDate localDateNow = LocalDate.now();
        Intrinsics.checkNotNullExpressionValue(localDateNow, "now(...)");
        return localDateNow;
    }

    public final ApiSweepsTimelineSummary.InterestPaid getNextInterestPayment() {
        return this.nextInterestPayment;
    }

    private final boolean isAchTransferActive() {
        AchTransfer achTransfer = (AchTransfer) CollectionsKt.firstOrNull((List) this.achTransfers);
        if (achTransfer != null) {
            return achTransfer.getIsPending();
        }
        return false;
    }

    private final boolean isAccountBuyingPowerZero() {
        return this.accountBuyingPower.isZero();
    }

    public final UiTimelineInfo getTimeline() {
        Tuples2 tuples2;
        int i;
        UiTimelineInfo.Middle.Reason reason;
        int i2;
        int i3 = WhenMappings.$EnumSwitchMapping$0[getStatus().ordinal()];
        if (i3 == 1) {
            int i4 = C16703R.string.interest_earning_activated;
            Instant createdAt = this.minervaAccount.getCreatedAt();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            UiTimelineInfo.Top top = new UiTimelineInfo.Top(i4, Instants.toLocalDate(createdAt, zoneIdSystemDefault));
            if (isAccountBuyingPowerZero() && !isAchTransferActive()) {
                tuples2 = new Tuples2(null, UiTimelineInfo.Middle.Reason.DEPOSIT_TO_EARN);
            } else {
                tuples2 = new Tuples2(this.timelineSummary.getNextBankOpenDate(), UiTimelineInfo.Middle.Reason.INTEREST_ACCRUING_TO_START);
            }
            return new UiTimelineInfo(top, new UiTimelineInfo.Middle.Activated((UiTimelineInfo.Middle.Reason) tuples2.component2(), null, (LocalDate) tuples2.component1()), new UiTimelineInfo.Bottom(C16703R.string.interest_earning_payday, this.timelineSummary.getNextInterestPayment().getDate(), null, null, 8, null));
        }
        if (i3 == 2) {
            Tuples2<Integer, LocalDate> topTitleIfFirstTime = getTopTitleIfFirstTime();
            UiTimelineInfo.Top top2 = new UiTimelineInfo.Top(topTitleIfFirstTime.component1().intValue(), topTitleIfFirstTime.component2());
            UiTimelineInfo.Middle.Reason reason2 = UiTimelineInfo.Middle.Reason.INTEREST_PAUSED;
            String interestPausedDisplayMessage = this.timelineSummary.getInterestPausedDisplayMessage();
            UiTimelineInfo.Middle.Paused paused = new UiTimelineInfo.Middle.Paused(reason2, this.timelineSummary.getInterestAccrued(), this.apyInterestRate, this.timelineSummary.getInterestPausedReason(), interestPausedDisplayMessage, this.account);
            if (this.timelineSummary.getIsFirstTimePayment()) {
                i = C16703R.string.interest_earning_payday;
            } else {
                i = C16703R.string.interest_earning_next_payday;
            }
            return new UiTimelineInfo(top2, paused, new UiTimelineInfo.Bottom(i, this.timelineSummary.getNextInterestPayment().getDate(), null, null, 8, null));
        }
        if (i3 != 3) {
            if (i3 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            Tuples2<Integer, LocalDate> topTitleIfFirstTime2 = getTopTitleIfFirstTime();
            return new UiTimelineInfo(new UiTimelineInfo.Top(topTitleIfFirstTime2.component1().intValue(), topTitleIfFirstTime2.component2()), new UiTimelineInfo.Middle.Default(UiTimelineInfo.Middle.Reason.INTEREST_ACCRUED, null, null), new UiTimelineInfo.Bottom(C16703R.string.interest_earning_payday, this.timelineSummary.getNextInterestPayment().getDate(), this.timelineSummary.getNextInterestPayment().getAmount(), this.timelineSummary.getNextInterestPayment().getId()));
        }
        Tuples2<Integer, LocalDate> topTitleIfFirstTime3 = getTopTitleIfFirstTime();
        UiTimelineInfo.Top top3 = new UiTimelineInfo.Top(topTitleIfFirstTime3.component1().intValue(), topTitleIfFirstTime3.component2());
        if (isAccountBuyingPowerZero() && !isAchTransferActive()) {
            reason = UiTimelineInfo.Middle.Reason.DEPOSIT_TO_EARN;
        } else {
            reason = UiTimelineInfo.Middle.Reason.INTEREST_ACCRUING;
        }
        UiTimelineInfo.Middle.Default r4 = new UiTimelineInfo.Middle.Default(reason, this.timelineSummary.getInterestAccrued(), null);
        if (this.timelineSummary.getIsFirstTimePayment()) {
            i2 = C16703R.string.interest_earning_payday;
        } else {
            i2 = C16703R.string.interest_earning_next_payday;
        }
        return new UiTimelineInfo(top3, r4, new UiTimelineInfo.Bottom(i2, this.timelineSummary.getNextInterestPayment().getDate(), null, null, 8, null));
    }

    private final Tuples2<Integer, LocalDate> getTopTitleIfFirstTime() {
        if (this.timelineSummary.getIsFirstTimePayment()) {
            Integer numValueOf = Integer.valueOf(C16703R.string.interest_earning_activated);
            Instant createdAt = this.minervaAccount.getCreatedAt();
            ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
            Intrinsics.checkNotNullExpressionValue(zoneIdSystemDefault, "systemDefault(...)");
            return new Tuples2<>(numValueOf, Instants.toLocalDate(createdAt, zoneIdSystemDefault));
        }
        Integer numValueOf2 = Integer.valueOf(C16703R.string.interest_earning_previous_payday);
        ApiSweepsTimelineSummary.InterestPaid previousInterestPayment = this.timelineSummary.getPreviousInterestPayment();
        Intrinsics.checkNotNull(previousInterestPayment);
        return new Tuples2<>(numValueOf2, previousInterestPayment.getDate());
    }
}
