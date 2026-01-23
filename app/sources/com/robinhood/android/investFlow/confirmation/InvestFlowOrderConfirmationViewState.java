package com.robinhood.android.investFlow.confirmation;

import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.investFlow.C19349R;
import com.robinhood.android.investFlow.frequency.Frequency;
import com.robinhood.android.investFlow.frequency.InvestFlowFrequencyDataState3;
import com.robinhood.android.navigation.keys.TabFragmentKey;
import com.robinhood.investflow.models.api.ApiInvestFlowBulkOrderStatus;
import com.robinhood.investflow.models.api.ApiInvestFlowBulkOrderStatus2;
import com.robinhood.investflow.models.api.ApiInvestFlowReceiptRow3;
import com.robinhood.investflow.models.api.InvestFlowReceiptResponse;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.AchRelationship;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.models.util.Money;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.rosetta.eventlogging.InvestFlowContext;
import com.robinhood.shared.history.contracts.account.AccountsHistoryContract;
import com.robinhood.shared.history.contracts.account.AccountsHistoryTransactionTypeFilter;
import com.robinhood.shared.recurring.contracts.InvestmentScheduleSettingsFragmentKey;
import com.robinhood.shared.recurring.contracts.RecurringHubFragmentKey;
import com.robinhood.utils.datetime.format.LocalDateFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InvestFlowOrderConfirmationViewState.kt */
@Metadata(m3635d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ]2\u00020\u0001:\u0002\\]B[\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010R\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J\u000b\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010T\u001a\u0004\u0018\u00010\u000bHÂ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\rHÆ\u0003J]\u0010V\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rHÆ\u0001J\u0013\u0010W\u001a\u00020;2\b\u0010X\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010Y\u001a\u00020ZHÖ\u0001J\t\u0010[\u001a\u00020\"HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00038F¢\u0006\u0006\u001a\u0004\b \u0010\u0011R\u0014\u0010!\u001a\u00020\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0016\u0010%\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010\u001bR\u0016\u0010)\u001a\u0004\u0018\u00010\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b*\u0010\u001bR\u0016\u0010+\u001a\u0004\u0018\u00010\"8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010$R\u0013\u0010-\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b.\u0010\u001bR\u0013\u0010/\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\b0\u0010\u001bR\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u001f0\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0011R\u0014\u00103\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b4\u0010\u001bR\u0014\u00105\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u0010\u001bR\u0016\u00107\u001a\u0004\u0018\u00010\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b:\u0010<R\u0011\u0010=\u001a\u00020;8F¢\u0006\u0006\u001a\u0004\b=\u0010<R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\bC\u0010\u001bR\u0011\u0010D\u001a\u00020E8F¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u0013\u0010L\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bM\u0010\u001bR\u0013\u0010N\u001a\u0004\u0018\u00010\u00198F¢\u0006\u0006\u001a\u0004\bO\u0010\u001b¨\u0006^"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState;", "", "orderIds", "", "Ljava/util/UUID;", "scheduleIds", "schedules", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "achRelationship", "Lcom/robinhood/models/db/AchRelationship;", "receiptResponse", "Lcom/robinhood/investflow/models/api/InvestFlowReceiptResponse;", "account", "Lcom/robinhood/models/db/Account;", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/robinhood/models/db/AchRelationship;Lcom/robinhood/investflow/models/api/InvestFlowReceiptResponse;Lcom/robinhood/models/db/Account;)V", "getOrderIds", "()Ljava/util/List;", "getScheduleIds", "getSchedules", "getAchRelationship", "()Lcom/robinhood/models/db/AchRelationship;", "getAccount", "()Lcom/robinhood/models/db/Account;", "orderConfirmationTitle", "Lcom/robinhood/utils/resource/StringResource;", "getOrderConfirmationTitle", "()Lcom/robinhood/utils/resource/StringResource;", "orderConfirmationMessage", "getOrderConfirmationMessage", "orderConfirmationRows", "Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState$UiInvestFlowReceiptRow;", "getOrderConfirmationRows", "scheduleTargetSymbols", "", "getScheduleTargetSymbols", "()Ljava/lang/String;", "scheduleTotal", "getScheduleTotal", "scheduleFrequencyLower", "getScheduleFrequencyLower", "scheduleFrequency", "getScheduleFrequency", "scheduleStartDate", "getScheduleStartDate", "paymentMethodMetadataPrimaryText", "getPaymentMethodMetadataPrimaryText", "backupPaymentMethodMetadataPrimaryText", "getBackupPaymentMethodMetadataPrimaryText", "buildRecurringRows", "getBuildRecurringRows", "buyingPowerPaymentMethodStringResource", "getBuyingPowerPaymentMethodStringResource", "selectedAchRelationshipNickname", "getSelectedAchRelationshipNickname", "firstSchedule", "getFirstSchedule", "()Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "isCrypto", "", "()Z", "isRecurring", "loggingAllocation", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "getLoggingAllocation", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$Allocation;", "secondaryButtonText", "getSecondaryButtonText", "loggingStatus", "Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "getLoggingStatus", "()Lcom/robinhood/rosetta/eventlogging/InvestFlowContext$OrderStatus;", "secondaryNavigationKey", "Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "getSecondaryNavigationKey", "()Lcom/robinhood/android/navigation/keys/TabFragmentKey;", "accountNameTitle", "getAccountNameTitle", "accountNameSubtitle", "getAccountNameSubtitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "UiInvestFlowReceiptRow", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final /* data */ class InvestFlowOrderConfirmationViewState {
    public static final long RECEIPT_POLL_INTERVAL = 3;
    private final Account account;
    private final AchRelationship achRelationship;
    private final List<UUID> orderIds;
    private final InvestFlowReceiptResponse receiptResponse;
    private final List<UUID> scheduleIds;
    private final List<InvestmentSchedule> schedules;
    private final TabFragmentKey secondaryNavigationKey;
    public static final int $stable = 8;

    /* compiled from: InvestFlowOrderConfirmationViewState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ApiInvestmentSchedule.SourceOfFunds.values().length];
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.ACH_RELATIONSHIP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.BUYING_POWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ApiInvestmentSchedule.SourceOfFunds.DIRECT_DEPOSIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public InvestFlowOrderConfirmationViewState() {
        this(null, null, null, null, null, null, 63, null);
    }

    /* renamed from: component5, reason: from getter */
    private final InvestFlowReceiptResponse getReceiptResponse() {
        return this.receiptResponse;
    }

    public static /* synthetic */ InvestFlowOrderConfirmationViewState copy$default(InvestFlowOrderConfirmationViewState investFlowOrderConfirmationViewState, List list, List list2, List list3, AchRelationship achRelationship, InvestFlowReceiptResponse investFlowReceiptResponse, Account account, int i, Object obj) {
        if ((i & 1) != 0) {
            list = investFlowOrderConfirmationViewState.orderIds;
        }
        if ((i & 2) != 0) {
            list2 = investFlowOrderConfirmationViewState.scheduleIds;
        }
        if ((i & 4) != 0) {
            list3 = investFlowOrderConfirmationViewState.schedules;
        }
        if ((i & 8) != 0) {
            achRelationship = investFlowOrderConfirmationViewState.achRelationship;
        }
        if ((i & 16) != 0) {
            investFlowReceiptResponse = investFlowOrderConfirmationViewState.receiptResponse;
        }
        if ((i & 32) != 0) {
            account = investFlowOrderConfirmationViewState.account;
        }
        InvestFlowReceiptResponse investFlowReceiptResponse2 = investFlowReceiptResponse;
        Account account2 = account;
        return investFlowOrderConfirmationViewState.copy(list, list2, list3, achRelationship, investFlowReceiptResponse2, account2);
    }

    public final List<UUID> component1() {
        return this.orderIds;
    }

    public final List<UUID> component2() {
        return this.scheduleIds;
    }

    public final List<InvestmentSchedule> component3() {
        return this.schedules;
    }

    /* renamed from: component4, reason: from getter */
    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    /* renamed from: component6, reason: from getter */
    public final Account getAccount() {
        return this.account;
    }

    public final InvestFlowOrderConfirmationViewState copy(List<UUID> orderIds, List<UUID> scheduleIds, List<InvestmentSchedule> schedules, AchRelationship achRelationship, InvestFlowReceiptResponse receiptResponse, Account account) {
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        Intrinsics.checkNotNullParameter(scheduleIds, "scheduleIds");
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        return new InvestFlowOrderConfirmationViewState(orderIds, scheduleIds, schedules, achRelationship, receiptResponse, account);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InvestFlowOrderConfirmationViewState)) {
            return false;
        }
        InvestFlowOrderConfirmationViewState investFlowOrderConfirmationViewState = (InvestFlowOrderConfirmationViewState) other;
        return Intrinsics.areEqual(this.orderIds, investFlowOrderConfirmationViewState.orderIds) && Intrinsics.areEqual(this.scheduleIds, investFlowOrderConfirmationViewState.scheduleIds) && Intrinsics.areEqual(this.schedules, investFlowOrderConfirmationViewState.schedules) && Intrinsics.areEqual(this.achRelationship, investFlowOrderConfirmationViewState.achRelationship) && Intrinsics.areEqual(this.receiptResponse, investFlowOrderConfirmationViewState.receiptResponse) && Intrinsics.areEqual(this.account, investFlowOrderConfirmationViewState.account);
    }

    public int hashCode() {
        int iHashCode = ((((this.orderIds.hashCode() * 31) + this.scheduleIds.hashCode()) * 31) + this.schedules.hashCode()) * 31;
        AchRelationship achRelationship = this.achRelationship;
        int iHashCode2 = (iHashCode + (achRelationship == null ? 0 : achRelationship.hashCode())) * 31;
        InvestFlowReceiptResponse investFlowReceiptResponse = this.receiptResponse;
        int iHashCode3 = (iHashCode2 + (investFlowReceiptResponse == null ? 0 : investFlowReceiptResponse.hashCode())) * 31;
        Account account = this.account;
        return iHashCode3 + (account != null ? account.hashCode() : 0);
    }

    public String toString() {
        return "InvestFlowOrderConfirmationViewState(orderIds=" + this.orderIds + ", scheduleIds=" + this.scheduleIds + ", schedules=" + this.schedules + ", achRelationship=" + this.achRelationship + ", receiptResponse=" + this.receiptResponse + ", account=" + this.account + ")";
    }

    public InvestFlowOrderConfirmationViewState(List<UUID> orderIds, List<UUID> scheduleIds, List<InvestmentSchedule> schedules, AchRelationship achRelationship, InvestFlowReceiptResponse investFlowReceiptResponse, Account account) {
        TabFragmentKey key;
        Intrinsics.checkNotNullParameter(orderIds, "orderIds");
        Intrinsics.checkNotNullParameter(scheduleIds, "scheduleIds");
        Intrinsics.checkNotNullParameter(schedules, "schedules");
        this.orderIds = orderIds;
        this.scheduleIds = scheduleIds;
        this.schedules = schedules;
        this.achRelationship = achRelationship;
        this.receiptResponse = investFlowReceiptResponse;
        this.account = account;
        if (isRecurring()) {
            if (schedules.size() == 1) {
                InvestmentSchedule firstSchedule = getFirstSchedule();
                Intrinsics.checkNotNull(firstSchedule);
                key = new InvestmentScheduleSettingsFragmentKey(firstSchedule.getId(), false, 2, null);
            } else {
                InvestmentSchedule firstSchedule2 = getFirstSchedule();
                key = new RecurringHubFragmentKey(firstSchedule2 != null ? firstSchedule2.getAccountNumber() : null);
            }
        } else {
            key = new AccountsHistoryContract.Key(null, AccountsHistoryTransactionTypeFilter.ORDERS, null, null, false, null, 61, null);
        }
        this.secondaryNavigationKey = key;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ InvestFlowOrderConfirmationViewState(java.util.List r2, java.util.List r3, java.util.List r4, com.robinhood.models.p320db.AchRelationship r5, com.robinhood.investflow.models.api.InvestFlowReceiptResponse r6, com.robinhood.models.p320db.Account r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto L8
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L8:
            r9 = r8 & 2
            if (r9 == 0) goto L10
            java.util.List r3 = kotlin.collections.CollectionsKt.emptyList()
        L10:
            r9 = r8 & 4
            if (r9 == 0) goto L18
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
        L18:
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L1e
            r5 = r0
        L1e:
            r9 = r8 & 16
            if (r9 == 0) goto L23
            r6 = r0
        L23:
            r8 = r8 & 32
            if (r8 == 0) goto L2f
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L36
        L2f:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L36:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.investFlow.confirmation.InvestFlowOrderConfirmationViewState.<init>(java.util.List, java.util.List, java.util.List, com.robinhood.models.db.AchRelationship, com.robinhood.investflow.models.api.InvestFlowReceiptResponse, com.robinhood.models.db.Account, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final List<UUID> getOrderIds() {
        return this.orderIds;
    }

    public final List<UUID> getScheduleIds() {
        return this.scheduleIds;
    }

    public final List<InvestmentSchedule> getSchedules() {
        return this.schedules;
    }

    public final AchRelationship getAchRelationship() {
        return this.achRelationship;
    }

    public final Account getAccount() {
        return this.account;
    }

    public final StringResource getOrderConfirmationTitle() {
        String title;
        if (isRecurring()) {
            return StringResource.INSTANCE.invoke(C19349R.string.invest_flow_receipt_investments_scheduled, new Object[0]);
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        InvestFlowReceiptResponse investFlowReceiptResponse = this.receiptResponse;
        if (investFlowReceiptResponse == null || (title = investFlowReceiptResponse.getTitle()) == null) {
            title = "";
        }
        return companion.invoke(title);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.String] */
    public final StringResource getOrderConfirmationMessage() {
        ?? r1 = "";
        if (isRecurring()) {
            StringResource.Companion companion = StringResource.INSTANCE;
            int i = C19349R.string.invest_flow_receipt_recurring_subtitle;
            String scheduleTotal = getScheduleTotal();
            if (scheduleTotal == null) {
                scheduleTotal = "";
            }
            String scheduleTargetSymbols = getScheduleTargetSymbols();
            StringResource scheduleFrequencyLower = getScheduleFrequencyLower();
            StringResource stringResource = r1;
            if (scheduleFrequencyLower != null) {
                stringResource = scheduleFrequencyLower;
            }
            return companion.invoke(i, scheduleTotal, scheduleTargetSymbols, stringResource);
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        InvestFlowReceiptResponse investFlowReceiptResponse = this.receiptResponse;
        String str = r1;
        if (investFlowReceiptResponse != null) {
            String subtitle = investFlowReceiptResponse.getSubtitle();
            str = r1;
            if (subtitle != null) {
                str = subtitle;
            }
        }
        return companion2.invoke(str);
    }

    public final List<UiInvestFlowReceiptRow> getOrderConfirmationRows() {
        List<ApiInvestFlowReceiptRow3> rows;
        StringResource stringResourceInvoke;
        InvestFlowReceiptResponse investFlowReceiptResponse = this.receiptResponse;
        if (investFlowReceiptResponse == null || (rows = investFlowReceiptResponse.getRows()) == null) {
            return getBuildRecurringRows();
        }
        List<ApiInvestFlowReceiptRow3> list = rows;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ApiInvestFlowReceiptRow3 apiInvestFlowReceiptRow3 : list) {
            StringResource.Companion companion = StringResource.INSTANCE;
            StringResource stringResourceInvoke2 = companion.invoke(apiInvestFlowReceiptRow3.getSymbol());
            String price = apiInvestFlowReceiptRow3.getPrice();
            StringResource stringResourceInvoke3 = null;
            if (price != null) {
                String str = String.format(price, Arrays.copyOf(new Object[0], 0));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                stringResourceInvoke = companion.invoke(str);
            } else {
                stringResourceInvoke = null;
            }
            String quantity = apiInvestFlowReceiptRow3.getQuantity();
            if (quantity != null) {
                stringResourceInvoke3 = companion.invoke(quantity);
            }
            arrayList.add(new UiInvestFlowReceiptRow(stringResourceInvoke2, stringResourceInvoke, stringResourceInvoke3, apiInvestFlowReceiptRow3.getStatus()));
        }
        return arrayList;
    }

    private final String getScheduleTargetSymbols() {
        int size = this.schedules.size();
        if (size == 1) {
            String instrumentSymbol = this.schedules.get(0).getInvestmentTarget().getInstrumentSymbol();
            Intrinsics.checkNotNull(instrumentSymbol);
            return instrumentSymbol;
        }
        if (size == 2) {
            return this.schedules.get(0).getInvestmentTarget().getInstrumentSymbol() + " and " + this.schedules.get(1).getInvestmentTarget().getInstrumentSymbol();
        }
        if (size == 3) {
            return this.schedules.get(0).getInvestmentTarget().getInstrumentSymbol() + ", " + this.schedules.get(1).getInvestmentTarget().getInstrumentSymbol() + ", and " + this.schedules.get(2).getInvestmentTarget().getInstrumentSymbol();
        }
        return this.schedules.size() + " items";
    }

    private final String getScheduleTotal() {
        Money money;
        Iterator<T> it = this.schedules.iterator();
        if (it.hasNext()) {
            Money dollarAmount = ((InvestmentSchedule) it.next()).getInvestmentScheduleAmount().getDollarAmount();
            while (it.hasNext()) {
                dollarAmount = dollarAmount.plus(((InvestmentSchedule) it.next()).getInvestmentScheduleAmount().getDollarAmount());
            }
            money = dollarAmount;
        } else {
            money = null;
        }
        if (money != null) {
            return Money.format$default(money, null, false, null, false, 0, null, false, null, false, false, 1023, null);
        }
        return null;
    }

    private final StringResource getScheduleFrequencyLower() {
        ApiInvestmentSchedule.Frequency frequency;
        Frequency frequencyRow;
        InvestmentSchedule firstSchedule = getFirstSchedule();
        if (firstSchedule == null || (frequency = firstSchedule.getFrequency()) == null || (frequencyRow = InvestFlowFrequencyDataState3.toFrequencyRow(frequency, isCrypto())) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(frequencyRow.getTitleLowercase(), new Object[0]);
    }

    private final StringResource getScheduleFrequency() {
        ApiInvestmentSchedule.Frequency frequency;
        Frequency frequencyRow;
        InvestmentSchedule firstSchedule = getFirstSchedule();
        if (firstSchedule == null || (frequency = firstSchedule.getFrequency()) == null || (frequencyRow = InvestFlowFrequencyDataState3.toFrequencyRow(frequency, isCrypto())) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(frequencyRow.getTitle(), new Object[0]);
    }

    private final String getScheduleStartDate() {
        InvestmentSchedule firstSchedule = getFirstSchedule();
        if ((firstSchedule != null ? firstSchedule.getStartDate() : null) == null) {
            return null;
        }
        LocalDateFormatter localDateFormatter = LocalDateFormatter.LONG;
        InvestmentSchedule firstSchedule2 = getFirstSchedule();
        Intrinsics.checkNotNull(firstSchedule2);
        return localDateFormatter.format(firstSchedule2.getStartDate());
    }

    public final StringResource getPaymentMethodMetadataPrimaryText() {
        InvestmentSchedule firstSchedule = getFirstSchedule();
        ApiInvestmentSchedule.SourceOfFunds sourceOfFunds = firstSchedule != null ? firstSchedule.getSourceOfFunds() : null;
        int i = sourceOfFunds == null ? -1 : WhenMappings.$EnumSwitchMapping$0[sourceOfFunds.ordinal()];
        if (i == 1) {
            return getSelectedAchRelationshipNickname();
        }
        if (i == 2) {
            return getBuyingPowerPaymentMethodStringResource();
        }
        if (i != 3) {
            return null;
        }
        throw new IllegalStateException("todo");
    }

    public final StringResource getBackupPaymentMethodMetadataPrimaryText() {
        AchRelationship achRelationship;
        String bankAccountNickname;
        InvestmentSchedule firstSchedule = getFirstSchedule();
        if (firstSchedule == null || !firstSchedule.isBackupAchEnabled() || (achRelationship = this.achRelationship) == null || (bankAccountNickname = achRelationship.getBankAccountNickname()) == null) {
            return null;
        }
        return StringResource.INSTANCE.invoke(bankAccountNickname);
    }

    private final List<UiInvestFlowReceiptRow> getBuildRecurringRows() {
        ArrayList arrayList = new ArrayList();
        String scheduleTotal = getScheduleTotal();
        if (scheduleTotal != null) {
            StringResource.Companion companion = StringResource.INSTANCE;
            arrayList.add(new UiInvestFlowReceiptRow(companion.invoke(C19349R.string.invest_flow_receipt_order_total, new Object[0]), companion.invoke(scheduleTotal), null, null, 12, null));
        }
        StringResource.Companion companion2 = StringResource.INSTANCE;
        arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.invest_flow_receipt_items, new Object[0]), companion2.invoke(getScheduleTargetSymbols()), null, null, 12, null));
        StringResource scheduleFrequency = getScheduleFrequency();
        if (scheduleFrequency != null) {
            arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.invest_flow_receipt_frequency, new Object[0]), scheduleFrequency, null, null, 12, null));
        }
        StringResource paymentMethodMetadataPrimaryText = getPaymentMethodMetadataPrimaryText();
        if (paymentMethodMetadataPrimaryText != null) {
            arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.invest_flow_receipt_payment, new Object[0]), paymentMethodMetadataPrimaryText, null, null, 12, null));
        }
        if (getBackupPaymentMethodMetadataPrimaryText() != null) {
            arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.invest_flow_receipt_backup_payment, new Object[0]), getBackupPaymentMethodMetadataPrimaryText(), null, null, 12, null));
        }
        String scheduleStartDate = getScheduleStartDate();
        if (scheduleStartDate != null) {
            arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.invest_flow_receipt_start_date, new Object[0]), companion2.invoke(scheduleStartDate), null, null, 12, null));
        }
        StringResource accountNameTitle = getAccountNameTitle();
        if (accountNameTitle != null) {
            arrayList.add(new UiInvestFlowReceiptRow(companion2.invoke(C19349R.string.account, new Object[0]), accountNameTitle, getAccountNameSubtitle(), null, 8, null));
        }
        return arrayList;
    }

    private final StringResource getBuyingPowerPaymentMethodStringResource() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (isCrypto()) {
            i = C19349R.string.gated_crypto_invest_flow_crypto_buying_power;
        } else {
            i = C19349R.string.invest_flow_buying_power;
        }
        return companion.invoke(i, new Object[0]);
    }

    private final StringResource getSelectedAchRelationshipNickname() {
        AchRelationship achRelationship = this.achRelationship;
        String bankAccountNickname = achRelationship != null ? achRelationship.getBankAccountNickname() : null;
        if (bankAccountNickname != null) {
            return StringResource.INSTANCE.invoke(bankAccountNickname);
        }
        return StringResource.INSTANCE.invoke(C11048R.string.general_label_emdash, new Object[0]);
    }

    private final InvestmentSchedule getFirstSchedule() {
        return (InvestmentSchedule) CollectionsKt.firstOrNull((List) this.schedules);
    }

    private final boolean isCrypto() {
        InvestmentSchedule firstSchedule = getFirstSchedule();
        if (firstSchedule != null) {
            return firstSchedule.isCrypto();
        }
        return false;
    }

    public final boolean isRecurring() {
        return !this.schedules.isEmpty();
    }

    public final InvestFlowContext.Allocation getLoggingAllocation() {
        List<InvestmentSchedule> list = this.schedules;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((InvestmentSchedule) it.next()).getInvestmentScheduleAmount().getDollarAmount().getDecimalValue());
        }
        if (CollectionsKt.distinct(arrayList).size() > 1) {
            return InvestFlowContext.Allocation.CUSTOM;
        }
        return InvestFlowContext.Allocation.DEFAULT;
    }

    public final StringResource getSecondaryButtonText() {
        int i;
        StringResource.Companion companion = StringResource.INSTANCE;
        if (isRecurring()) {
            i = C19349R.string.invest_flow_view_recurring;
        } else {
            i = C19349R.string.invest_flow_view_order_detail;
        }
        return companion.invoke(i, new Object[0]);
    }

    public final InvestFlowContext.OrderStatus getLoggingStatus() {
        ApiInvestFlowBulkOrderStatus bulk_order_status;
        InvestFlowContext.OrderStatus loggingStatus;
        InvestFlowReceiptResponse investFlowReceiptResponse = this.receiptResponse;
        return (investFlowReceiptResponse == null || (bulk_order_status = investFlowReceiptResponse.getBulk_order_status()) == null || (loggingStatus = ApiInvestFlowBulkOrderStatus2.toLoggingStatus(bulk_order_status)) == null) ? InvestFlowContext.OrderStatus.FAILED : loggingStatus;
    }

    public final TabFragmentKey getSecondaryNavigationKey() {
        return this.secondaryNavigationKey;
    }

    public final StringResource getAccountNameTitle() {
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        Account account = this.account;
        if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (withInvesting = displayName.getWithInvesting()) == null) {
            return null;
        }
        return withInvesting.getTitle();
    }

    public final StringResource getAccountNameSubtitle() {
        Account account = this.account;
        if (account == null || !account.getHasNickname()) {
            return null;
        }
        return AccountDisplayNames.getDisplayNameWithoutNickname(this.account).getShort().getTitle();
    }

    /* compiled from: InvestFlowOrderConfirmationViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/investFlow/confirmation/InvestFlowOrderConfirmationViewState$UiInvestFlowReceiptRow;", "", "primaryText", "Lcom/robinhood/utils/resource/StringResource;", "secondaryPrimaryText", "secondaryMetadataString", "secondaryMetadataRichText", "Lcom/robinhood/models/serverdriven/db/RichText;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/models/serverdriven/db/RichText;)V", "getPrimaryText", "()Lcom/robinhood/utils/resource/StringResource;", "getSecondaryPrimaryText", "getSecondaryMetadataString", "getSecondaryMetadataRichText", "()Lcom/robinhood/models/serverdriven/db/RichText;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UiInvestFlowReceiptRow {
        public static final int $stable = 8;
        private final StringResource primaryText;
        private final RichText secondaryMetadataRichText;
        private final StringResource secondaryMetadataString;
        private final StringResource secondaryPrimaryText;

        public UiInvestFlowReceiptRow(StringResource primaryText, StringResource stringResource, StringResource stringResource2, RichText richText) {
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            this.primaryText = primaryText;
            this.secondaryPrimaryText = stringResource;
            this.secondaryMetadataString = stringResource2;
            this.secondaryMetadataRichText = richText;
        }

        public /* synthetic */ UiInvestFlowReceiptRow(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, RichText richText, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(stringResource, (i & 2) != 0 ? null : stringResource2, (i & 4) != 0 ? null : stringResource3, (i & 8) != 0 ? null : richText);
        }

        public final StringResource getPrimaryText() {
            return this.primaryText;
        }

        public final StringResource getSecondaryPrimaryText() {
            return this.secondaryPrimaryText;
        }

        public final StringResource getSecondaryMetadataString() {
            return this.secondaryMetadataString;
        }

        public final RichText getSecondaryMetadataRichText() {
            return this.secondaryMetadataRichText;
        }
    }
}
