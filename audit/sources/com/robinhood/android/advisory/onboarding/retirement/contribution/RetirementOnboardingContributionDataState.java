package com.robinhood.android.advisory.onboarding.retirement.contribution;

import com.robinhood.android.common.C11048R;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.models.retirement.api.ApiRetirementMatchResponse3;
import com.robinhood.android.models.retirement.api.contributions.ContributionYear;
import com.robinhood.android.models.retirement.api.contributions.KeypadChip;
import com.robinhood.android.retirement.contributions.AccountSelectionData;
import com.robinhood.android.retirement.contributions.C26981R;
import com.robinhood.android.retirement.contributions.ContributionEditModeState;
import com.robinhood.android.retirement.contributions.ContributionFooterState;
import com.robinhood.android.retirement.contributions.ContributionProgressRingState;
import com.robinhood.android.retirement.contributions.ContributionReviewModeState;
import com.robinhood.android.retirement.contributions.ContributionSink;
import com.robinhood.android.retirement.contributions.ContributionTypeRowState;
import com.robinhood.android.retirement.contributions.ExtensionsKt;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.api.bonfire.ApiCreateTransferRequest2;
import com.robinhood.models.p320db.bonfire.TransferAccount;
import com.robinhood.models.util.Money;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Year;

/* compiled from: RetirementOnboardingContributionDataState.kt */
@Metadata(m3635d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 X2\u00020\u0001:\u0001XB}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\n\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b&\u0010'J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004HÆ\u0003¢\u0006\u0004\b(\u0010\u001bJ\u0010\u0010)\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b)\u0010!J\u0010\u0010*\u001a\u00020\u0014HÆ\u0003¢\u0006\u0004\b*\u0010+J\u008c\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0002\u0010\u0013\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u0014HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010/\u001a\u00020.HÖ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00107\u001a\u0004\b8\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00109\u001a\u0004\b:\u0010\u001bR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010;\u001a\u0004\b<\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010=\u001a\u0004\b>\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b\u000b\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010@\u001a\u0004\bA\u0010#R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010%R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\bE\u0010'R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u00109\u001a\u0004\bF\u0010\u001bR\u0017\u0010\u0013\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010?\u001a\u0004\bG\u0010!R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010H\u001a\u0004\bI\u0010+R\u0011\u0010K\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\bJ\u00100R\u0011\u0010O\u001a\u00020L8F¢\u0006\u0006\u001a\u0004\bM\u0010NR\u0011\u0010S\u001a\u00020P8F¢\u0006\u0006\u001a\u0004\bQ\u0010RR\u0011\u0010W\u001a\u00020T8F¢\u0006\u0006\u001a\u0004\bU\u0010V¨\u0006Y"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;", "", "Lcom/robinhood/models/api/BrokerageAccountType;", "accountType", "", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "contributionYears", "Lcom/robinhood/models/util/Money;", "minimumContribution", "activeContributionYear", "", "isInEditMode", "Ljava/math/BigDecimal;", "userInputAmount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "frequency", "accounts", "loading", "Ljava/util/UUID;", "sessionId", "<init>", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/util/List;ZLjava/util/UUID;)V", "component1", "()Lcom/robinhood/models/api/BrokerageAccountType;", "component2", "()Ljava/util/List;", "component3", "()Lcom/robinhood/models/util/Money;", "component4", "()Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "component5", "()Z", "component6", "()Ljava/math/BigDecimal;", "component7", "()Lcom/robinhood/models/db/bonfire/TransferAccount;", "component8", "()Lcom/robinhood/models/api/bonfire/TransferFrequency;", "component9", "component10", "component11", "()Ljava/util/UUID;", "copy", "(Lcom/robinhood/models/api/BrokerageAccountType;Ljava/util/List;Lcom/robinhood/models/util/Money;Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;ZLjava/math/BigDecimal;Lcom/robinhood/models/db/bonfire/TransferAccount;Lcom/robinhood/models/api/bonfire/TransferFrequency;Ljava/util/List;ZLjava/util/UUID;)Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/robinhood/models/api/BrokerageAccountType;", "getAccountType", "Ljava/util/List;", "getContributionYears", "Lcom/robinhood/models/util/Money;", "getMinimumContribution", "Lcom/robinhood/android/models/retirement/api/contributions/ContributionYear;", "getActiveContributionYear", "Z", "Ljava/math/BigDecimal;", "getUserInputAmount", "Lcom/robinhood/models/db/bonfire/TransferAccount;", "getSourceAccount", "Lcom/robinhood/models/api/bonfire/TransferFrequency;", "getFrequency", "getAccounts", "getLoading", "Ljava/util/UUID;", "getSessionId", "getUserInputString", "userInputString", "", "getCurrentPercentage", "()F", "currentPercentage", "j$/time/Year", "getTaxYear", "()Lj$/time/Year;", "taxYear", "Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "getProgressRingState", "()Lcom/robinhood/android/retirement/contributions/ContributionProgressRingState;", "progressRingState", "Provider", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class RetirementOnboardingContributionDataState {
    private final BrokerageAccountType accountType;
    private final List<TransferAccount> accounts;
    private final ContributionYear activeContributionYear;
    private final List<ContributionYear> contributionYears;
    private final ApiCreateTransferRequest2 frequency;
    private final boolean isInEditMode;
    private final boolean loading;
    private final Money minimumContribution;
    private final UUID sessionId;
    private final TransferAccount sourceAccount;
    private final BigDecimal userInputAmount;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ RetirementOnboardingContributionDataState copy$default(RetirementOnboardingContributionDataState retirementOnboardingContributionDataState, BrokerageAccountType brokerageAccountType, List list, Money money, ContributionYear contributionYear, boolean z, BigDecimal bigDecimal, TransferAccount transferAccount, ApiCreateTransferRequest2 apiCreateTransferRequest2, List list2, boolean z2, UUID uuid, int i, Object obj) {
        if ((i & 1) != 0) {
            brokerageAccountType = retirementOnboardingContributionDataState.accountType;
        }
        if ((i & 2) != 0) {
            list = retirementOnboardingContributionDataState.contributionYears;
        }
        if ((i & 4) != 0) {
            money = retirementOnboardingContributionDataState.minimumContribution;
        }
        if ((i & 8) != 0) {
            contributionYear = retirementOnboardingContributionDataState.activeContributionYear;
        }
        if ((i & 16) != 0) {
            z = retirementOnboardingContributionDataState.isInEditMode;
        }
        if ((i & 32) != 0) {
            bigDecimal = retirementOnboardingContributionDataState.userInputAmount;
        }
        if ((i & 64) != 0) {
            transferAccount = retirementOnboardingContributionDataState.sourceAccount;
        }
        if ((i & 128) != 0) {
            apiCreateTransferRequest2 = retirementOnboardingContributionDataState.frequency;
        }
        if ((i & 256) != 0) {
            list2 = retirementOnboardingContributionDataState.accounts;
        }
        if ((i & 512) != 0) {
            z2 = retirementOnboardingContributionDataState.loading;
        }
        if ((i & 1024) != 0) {
            uuid = retirementOnboardingContributionDataState.sessionId;
        }
        boolean z3 = z2;
        UUID uuid2 = uuid;
        ApiCreateTransferRequest2 apiCreateTransferRequest22 = apiCreateTransferRequest2;
        List list3 = list2;
        BigDecimal bigDecimal2 = bigDecimal;
        TransferAccount transferAccount2 = transferAccount;
        boolean z4 = z;
        Money money2 = money;
        return retirementOnboardingContributionDataState.copy(brokerageAccountType, list, money2, contributionYear, z4, bigDecimal2, transferAccount2, apiCreateTransferRequest22, list3, z3, uuid2);
    }

    /* renamed from: component1, reason: from getter */
    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component11, reason: from getter */
    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final List<ContributionYear> component2() {
        return this.contributionYears;
    }

    /* renamed from: component3, reason: from getter */
    public final Money getMinimumContribution() {
        return this.minimumContribution;
    }

    /* renamed from: component4, reason: from getter */
    public final ContributionYear getActiveContributionYear() {
        return this.activeContributionYear;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsInEditMode() {
        return this.isInEditMode;
    }

    /* renamed from: component6, reason: from getter */
    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final List<TransferAccount> component9() {
        return this.accounts;
    }

    public final RetirementOnboardingContributionDataState copy(BrokerageAccountType accountType, List<ContributionYear> contributionYears, Money minimumContribution, ContributionYear activeContributionYear, boolean isInEditMode, BigDecimal userInputAmount, TransferAccount sourceAccount, ApiCreateTransferRequest2 frequency, List<TransferAccount> accounts2, boolean loading, UUID sessionId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
        Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
        Intrinsics.checkNotNullParameter(activeContributionYear, "activeContributionYear");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        return new RetirementOnboardingContributionDataState(accountType, contributionYears, minimumContribution, activeContributionYear, isInEditMode, userInputAmount, sourceAccount, frequency, accounts2, loading, sessionId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementOnboardingContributionDataState)) {
            return false;
        }
        RetirementOnboardingContributionDataState retirementOnboardingContributionDataState = (RetirementOnboardingContributionDataState) other;
        return this.accountType == retirementOnboardingContributionDataState.accountType && Intrinsics.areEqual(this.contributionYears, retirementOnboardingContributionDataState.contributionYears) && Intrinsics.areEqual(this.minimumContribution, retirementOnboardingContributionDataState.minimumContribution) && Intrinsics.areEqual(this.activeContributionYear, retirementOnboardingContributionDataState.activeContributionYear) && this.isInEditMode == retirementOnboardingContributionDataState.isInEditMode && Intrinsics.areEqual(this.userInputAmount, retirementOnboardingContributionDataState.userInputAmount) && Intrinsics.areEqual(this.sourceAccount, retirementOnboardingContributionDataState.sourceAccount) && this.frequency == retirementOnboardingContributionDataState.frequency && Intrinsics.areEqual(this.accounts, retirementOnboardingContributionDataState.accounts) && this.loading == retirementOnboardingContributionDataState.loading && Intrinsics.areEqual(this.sessionId, retirementOnboardingContributionDataState.sessionId);
    }

    public int hashCode() {
        int iHashCode = ((((((((((this.accountType.hashCode() * 31) + this.contributionYears.hashCode()) * 31) + this.minimumContribution.hashCode()) * 31) + this.activeContributionYear.hashCode()) * 31) + Boolean.hashCode(this.isInEditMode)) * 31) + this.userInputAmount.hashCode()) * 31;
        TransferAccount transferAccount = this.sourceAccount;
        return ((((((((iHashCode + (transferAccount == null ? 0 : transferAccount.hashCode())) * 31) + this.frequency.hashCode()) * 31) + this.accounts.hashCode()) * 31) + Boolean.hashCode(this.loading)) * 31) + this.sessionId.hashCode();
    }

    public String toString() {
        return "RetirementOnboardingContributionDataState(accountType=" + this.accountType + ", contributionYears=" + this.contributionYears + ", minimumContribution=" + this.minimumContribution + ", activeContributionYear=" + this.activeContributionYear + ", isInEditMode=" + this.isInEditMode + ", userInputAmount=" + this.userInputAmount + ", sourceAccount=" + this.sourceAccount + ", frequency=" + this.frequency + ", accounts=" + this.accounts + ", loading=" + this.loading + ", sessionId=" + this.sessionId + ")";
    }

    public RetirementOnboardingContributionDataState(BrokerageAccountType accountType, List<ContributionYear> contributionYears, Money minimumContribution, ContributionYear activeContributionYear, boolean z, BigDecimal userInputAmount, TransferAccount transferAccount, ApiCreateTransferRequest2 frequency, List<TransferAccount> accounts2, boolean z2, UUID sessionId) {
        Intrinsics.checkNotNullParameter(accountType, "accountType");
        Intrinsics.checkNotNullParameter(contributionYears, "contributionYears");
        Intrinsics.checkNotNullParameter(minimumContribution, "minimumContribution");
        Intrinsics.checkNotNullParameter(activeContributionYear, "activeContributionYear");
        Intrinsics.checkNotNullParameter(userInputAmount, "userInputAmount");
        Intrinsics.checkNotNullParameter(frequency, "frequency");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.accountType = accountType;
        this.contributionYears = contributionYears;
        this.minimumContribution = minimumContribution;
        this.activeContributionYear = activeContributionYear;
        this.isInEditMode = z;
        this.userInputAmount = userInputAmount;
        this.sourceAccount = transferAccount;
        this.frequency = frequency;
        this.accounts = accounts2;
        this.loading = z2;
        this.sessionId = sessionId;
    }

    public final BrokerageAccountType getAccountType() {
        return this.accountType;
    }

    public final List<ContributionYear> getContributionYears() {
        return this.contributionYears;
    }

    public final Money getMinimumContribution() {
        return this.minimumContribution;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RetirementOnboardingContributionDataState(com.robinhood.models.api.BrokerageAccountType r13, java.util.List r14, com.robinhood.models.util.Money r15, com.robinhood.android.models.retirement.api.contributions.ContributionYear r16, boolean r17, java.math.BigDecimal r18, com.robinhood.models.p320db.bonfire.TransferAccount r19, com.robinhood.models.api.bonfire.ApiCreateTransferRequest2 r20, java.util.List r21, boolean r22, java.util.UUID r23, int r24, kotlin.jvm.internal.DefaultConstructorMarker r25) {
        /*
            r12 = this;
            r0 = r24
            r1 = r0 & 8
            if (r1 == 0) goto L45
            r1 = r14
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r1 = r1.iterator()
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r1.next()
            boolean r3 = r1.hasNext()
            if (r3 != 0) goto L1e
            goto L3a
        L1e:
            r3 = r2
            com.robinhood.android.models.retirement.api.contributions.ContributionYear r3 = (com.robinhood.android.models.retirement.api.contributions.ContributionYear) r3
            int r3 = r3.getTaxYear()
        L25:
            java.lang.Object r4 = r1.next()
            r5 = r4
            com.robinhood.android.models.retirement.api.contributions.ContributionYear r5 = (com.robinhood.android.models.retirement.api.contributions.ContributionYear) r5
            int r5 = r5.getTaxYear()
            if (r3 >= r5) goto L34
            r2 = r4
            r3 = r5
        L34:
            boolean r4 = r1.hasNext()
            if (r4 != 0) goto L25
        L3a:
            r1 = r2
            com.robinhood.android.models.retirement.api.contributions.ContributionYear r1 = (com.robinhood.android.models.retirement.api.contributions.ContributionYear) r1
            r4 = r1
            goto L47
        L3f:
            java.util.NoSuchElementException r13 = new java.util.NoSuchElementException
            r13.<init>()
            throw r13
        L45:
            r4 = r16
        L47:
            r1 = r0 & 16
            r2 = 1
            if (r1 == 0) goto L4e
            r5 = r2
            goto L50
        L4e:
            r5 = r17
        L50:
            r1 = r0 & 32
            if (r1 == 0) goto L58
            java.math.BigDecimal r1 = java.math.BigDecimal.ZERO
            r6 = r1
            goto L5a
        L58:
            r6 = r18
        L5a:
            r1 = r0 & 64
            if (r1 == 0) goto L61
            r1 = 0
            r7 = r1
            goto L63
        L61:
            r7 = r19
        L63:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L6b
            com.robinhood.models.api.bonfire.TransferFrequency r1 = com.robinhood.models.api.bonfire.ApiCreateTransferRequest2.ONCE
            r8 = r1
            goto L6d
        L6b:
            r8 = r20
        L6d:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L77
            java.util.List r1 = kotlin.collections.CollectionsKt.emptyList()
            r9 = r1
            goto L79
        L77:
            r9 = r21
        L79:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L7f
            r10 = r2
            goto L81
        L7f:
            r10 = r22
        L81:
            r0 = r0 & 1024(0x400, float:1.435E-42)
            if (r0 == 0) goto L8f
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r11 = r0
            r1 = r13
            r2 = r14
            r3 = r15
            r0 = r12
            goto L95
        L8f:
            r11 = r23
            r0 = r12
            r1 = r13
            r2 = r14
            r3 = r15
        L95:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDataState.<init>(com.robinhood.models.api.BrokerageAccountType, java.util.List, com.robinhood.models.util.Money, com.robinhood.android.models.retirement.api.contributions.ContributionYear, boolean, java.math.BigDecimal, com.robinhood.models.db.bonfire.TransferAccount, com.robinhood.models.api.bonfire.TransferFrequency, java.util.List, boolean, java.util.UUID, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final ContributionYear getActiveContributionYear() {
        return this.activeContributionYear;
    }

    public final boolean isInEditMode() {
        return this.isInEditMode;
    }

    public final BigDecimal getUserInputAmount() {
        return this.userInputAmount;
    }

    public final TransferAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final ApiCreateTransferRequest2 getFrequency() {
        return this.frequency;
    }

    public final List<TransferAccount> getAccounts() {
        return this.accounts;
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final UUID getSessionId() {
        return this.sessionId;
    }

    public final String getUserInputString() {
        return ExtensionsKt.formatForContributionRing(this.userInputAmount);
    }

    public final float getCurrentPercentage() {
        return ExtensionsKt.getContributionPercent(this.activeContributionYear, this.userInputAmount);
    }

    public final Year getTaxYear() {
        Year yearM3433of = Year.m3433of(this.activeContributionYear.getTaxYear());
        Intrinsics.checkNotNullExpressionValue(yearM3433of, "of(...)");
        return yearM3433of;
    }

    public final ContributionProgressRingState getProgressRingState() {
        return new ContributionProgressRingState(getCurrentPercentage(), getUserInputString(), ApiRetirementMatchResponse3.UNSPECIFIED, null);
    }

    /* compiled from: RetirementOnboardingContributionDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionDataState;", "Lcom/robinhood/android/advisory/onboarding/retirement/contribution/RetirementOnboardingContributionViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.contribution.RetirementOnboardingContributionDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementOnboardingContributionDataState, RetirementOnboardingContributionViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementOnboardingContributionViewState reduce(RetirementOnboardingContributionDataState dataState) {
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            List<KeypadChip> chips = dataState.getActiveContributionYear().getChips();
            String title = dataState.getActiveContributionYear().getTitle();
            ContributionFooterState contributionFooterState = new ContributionFooterState(StringResource.INSTANCE.invoke(C11048R.string.general_label_continue, new Object[0]), false, null, dataState.getSourceAccount() != null && dataState.getUserInputAmount().compareTo(dataState.getMinimumContribution().getDecimalValue()) >= 0);
            boolean zIsInEditMode = dataState.isInEditMode();
            return new RetirementOnboardingContributionViewState(title, contributionFooterState, dataState.getProgressRingState(), new ContributionReviewModeState(Formats.getCurrencyFormat().format(dataState.getUserInputAmount()), dataState.getFrequency(), true, new AccountSelectionData(dataState.getSourceAccount(), new ContributionSink.PendingAccount(dataState.getAccountType(), ManagementType.MANAGED), dataState.getAccounts(), null), dataState.getTaxYear(), dataState.getLoading(), dataState.getContributionYears().size() == 1, new ContributionTypeRowState(true, C26981R.string.transfer_ira_contribution_type_one_time), null), new ContributionEditModeState(ExtensionsKt.getDeltaUntilMaxText(dataState.getActiveContributionYear(), dataState.getUserInputAmount()), chips, Intrinsics.areEqual(dataState.getUserInputAmount(), BigDecimal.ZERO) && !chips.isEmpty(), dataState.getUserInputAmount(), dataState.getTaxYear()), zIsInEditMode);
        }
    }
}
