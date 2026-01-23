package com.robinhood.android.recurring.hub;

import android.content.res.Resources;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.recurring.hub.p225ui.UiInvestmentSchedules;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.recurring.models.api.ApiInvestmentSchedule;
import com.robinhood.recurring.models.p365db.InvestmentSchedule;
import com.robinhood.recurring.models.p366ui.InvestmentScheduleWithAccountType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.shared.models.history.shared.HistoryEvent;
import com.robinhood.shared.models.history.shared.StatefulHistoryEvent;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RecurringHubViewState.kt */
@Metadata(m3635d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u0000 F2\u00020\u0001:\u0002EFBi\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020 J\u0010\u00104\u001a\u00020'2\u0006\u00105\u001a\u00020\u000eH\u0002J\u0014\u00106\u001a\u00020\u00002\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\rJ\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u00109\u001a\u00020\u0007HÆ\u0003J\t\u0010:\u001a\u00020\u0007HÆ\u0003J\u000f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÂ\u0003J\u000f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u000e0\rHÂ\u0003J\u000f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100\rHÂ\u0003J\t\u0010>\u001a\u00020\u0007HÂ\u0003Jm\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\r2\b\b\u0002\u0010\u0011\u001a\u00020\u0007HÆ\u0001J\u0013\u0010@\u001a\u00020\u00072\b\u0010A\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010B\u001a\u00020CHÖ\u0001J\t\u0010D\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0018R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0018R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\rX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010%\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020'0&j\u0002`(0\r8F¢\u0006\u0006\u001a\u0004\b)\u0010\u001dR!\u0010*\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020'0&j\u0002`(0\r8F¢\u0006\u0006\u001a\u0004\b+\u0010\u001dR\u0011\u0010,\u001a\u00020-8F¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0011\u00100\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b1\u0010\u0018R\u0011\u00102\u001a\u00020\u00078F¢\u0006\u0006\u001a\u0004\b3\u0010\u0018¨\u0006G"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubViewState;", "", "state", "Lcom/robinhood/android/recurring/hub/RecurringHubViewState$State;", "selectedAccountNumber", "", "isCryptoFeatureEnabled", "", "isEtfEnabled", "accounts", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/recurring/hub/RecurringHubAccountUiModel;", "investmentSchedules", "", "Lcom/robinhood/recurring/models/db/InvestmentSchedule;", "targetedEtps", "Lcom/robinhood/models/db/Instrument;", "isInvestFlowFeatureEnabled", "<init>", "(Lcom/robinhood/android/recurring/hub/RecurringHubViewState$State;Ljava/lang/String;ZZLkotlinx/collections/immutable/ImmutableList;Ljava/util/List;Ljava/util/List;Z)V", "getState", "()Lcom/robinhood/android/recurring/hub/RecurringHubViewState$State;", "getSelectedAccountNumber", "()Ljava/lang/String;", "()Z", "showAllAccounts", "getShowAllAccounts", "accountInvestmentSchedules", "getAccountInvestmentSchedules", "()Ljava/util/List;", "getSelectedAccountSelectionOption", "res", "Landroid/content/res/Resources;", "getAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "targetedEtpIds", "Ljava/util/UUID;", "stocksAndEtfHistoryEvents", "Lcom/robinhood/shared/models/history/shared/StatefulHistoryEvent;", "Lcom/robinhood/shared/models/history/shared/HistoryEvent;", "Lcom/robinhood/shared/models/history/shared/GenericStatefulHistoryEvent;", "getStocksAndEtfHistoryEvents", "cryptoHistoryEvents", "getCryptoHistoryEvents", "uiInvestmentSchedules", "Lcom/robinhood/android/recurring/hub/ui/UiInvestmentSchedules;", "getUiInvestmentSchedules", "()Lcom/robinhood/android/recurring/hub/ui/UiInvestmentSchedules;", "showAccountSelector", "getShowAccountSelector", "showInvestFlowCta", "getShowInvestFlowCta", "mapToHistoryEvent", "investmentSchedule", "mutateAccounts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "State", "Companion", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class RecurringHubViewState {
    public static final int $stable = 0;
    private static final Comparator<InvestmentSchedule> INVESTMENT_SCHEDULE_COMPARATOR = ComparisonsKt.compareBy(new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubViewState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RecurringHubViewState.INVESTMENT_SCHEDULE_COMPARATOR$lambda$17((InvestmentSchedule) obj);
        }
    }, new Function1() { // from class: com.robinhood.android.recurring.hub.RecurringHubViewState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return RecurringHubViewState.INVESTMENT_SCHEDULE_COMPARATOR$lambda$18((InvestmentSchedule) obj);
        }
    });
    private final ImmutableList<RecurringHubAccountUiModel> accounts;
    private final List<InvestmentSchedule> investmentSchedules;
    private final boolean isCryptoFeatureEnabled;
    private final boolean isEtfEnabled;
    private final boolean isInvestFlowFeatureEnabled;
    private final String selectedAccountNumber;
    private final State state;
    private final List<UUID> targetedEtpIds;
    private final List<Instrument> targetedEtps;

    private final ImmutableList<RecurringHubAccountUiModel> component5() {
        return this.accounts;
    }

    private final List<InvestmentSchedule> component6() {
        return this.investmentSchedules;
    }

    private final List<Instrument> component7() {
        return this.targetedEtps;
    }

    /* renamed from: component8, reason: from getter */
    private final boolean getIsInvestFlowFeatureEnabled() {
        return this.isInvestFlowFeatureEnabled;
    }

    public static /* synthetic */ RecurringHubViewState copy$default(RecurringHubViewState recurringHubViewState, State state, String str, boolean z, boolean z2, ImmutableList immutableList, List list, List list2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            state = recurringHubViewState.state;
        }
        if ((i & 2) != 0) {
            str = recurringHubViewState.selectedAccountNumber;
        }
        if ((i & 4) != 0) {
            z = recurringHubViewState.isCryptoFeatureEnabled;
        }
        if ((i & 8) != 0) {
            z2 = recurringHubViewState.isEtfEnabled;
        }
        if ((i & 16) != 0) {
            immutableList = recurringHubViewState.accounts;
        }
        if ((i & 32) != 0) {
            list = recurringHubViewState.investmentSchedules;
        }
        if ((i & 64) != 0) {
            list2 = recurringHubViewState.targetedEtps;
        }
        if ((i & 128) != 0) {
            z3 = recurringHubViewState.isInvestFlowFeatureEnabled;
        }
        List list3 = list2;
        boolean z4 = z3;
        ImmutableList immutableList2 = immutableList;
        List list4 = list;
        return recurringHubViewState.copy(state, str, z, z2, immutableList2, list4, list3, z4);
    }

    /* renamed from: component1, reason: from getter */
    public final State getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedAccountNumber() {
        return this.selectedAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsCryptoFeatureEnabled() {
        return this.isCryptoFeatureEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsEtfEnabled() {
        return this.isEtfEnabled;
    }

    public final RecurringHubViewState copy(State state, String selectedAccountNumber, boolean isCryptoFeatureEnabled, boolean isEtfEnabled, ImmutableList<RecurringHubAccountUiModel> accounts2, List<InvestmentSchedule> investmentSchedules, List<Instrument> targetedEtps, boolean isInvestFlowFeatureEnabled) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(targetedEtps, "targetedEtps");
        return new RecurringHubViewState(state, selectedAccountNumber, isCryptoFeatureEnabled, isEtfEnabled, accounts2, investmentSchedules, targetedEtps, isInvestFlowFeatureEnabled);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RecurringHubViewState)) {
            return false;
        }
        RecurringHubViewState recurringHubViewState = (RecurringHubViewState) other;
        return this.state == recurringHubViewState.state && Intrinsics.areEqual(this.selectedAccountNumber, recurringHubViewState.selectedAccountNumber) && this.isCryptoFeatureEnabled == recurringHubViewState.isCryptoFeatureEnabled && this.isEtfEnabled == recurringHubViewState.isEtfEnabled && Intrinsics.areEqual(this.accounts, recurringHubViewState.accounts) && Intrinsics.areEqual(this.investmentSchedules, recurringHubViewState.investmentSchedules) && Intrinsics.areEqual(this.targetedEtps, recurringHubViewState.targetedEtps) && this.isInvestFlowFeatureEnabled == recurringHubViewState.isInvestFlowFeatureEnabled;
    }

    public int hashCode() {
        int iHashCode = this.state.hashCode() * 31;
        String str = this.selectedAccountNumber;
        return ((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + Boolean.hashCode(this.isCryptoFeatureEnabled)) * 31) + Boolean.hashCode(this.isEtfEnabled)) * 31) + this.accounts.hashCode()) * 31) + this.investmentSchedules.hashCode()) * 31) + this.targetedEtps.hashCode()) * 31) + Boolean.hashCode(this.isInvestFlowFeatureEnabled);
    }

    public String toString() {
        return "RecurringHubViewState(state=" + this.state + ", selectedAccountNumber=" + this.selectedAccountNumber + ", isCryptoFeatureEnabled=" + this.isCryptoFeatureEnabled + ", isEtfEnabled=" + this.isEtfEnabled + ", accounts=" + this.accounts + ", investmentSchedules=" + this.investmentSchedules + ", targetedEtps=" + this.targetedEtps + ", isInvestFlowFeatureEnabled=" + this.isInvestFlowFeatureEnabled + ")";
    }

    public RecurringHubViewState(State state, String str, boolean z, boolean z2, ImmutableList<RecurringHubAccountUiModel> accounts2, List<InvestmentSchedule> investmentSchedules, List<Instrument> targetedEtps, boolean z3) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(investmentSchedules, "investmentSchedules");
        Intrinsics.checkNotNullParameter(targetedEtps, "targetedEtps");
        this.state = state;
        this.selectedAccountNumber = str;
        this.isCryptoFeatureEnabled = z;
        this.isEtfEnabled = z2;
        this.accounts = accounts2;
        this.investmentSchedules = investmentSchedules;
        this.targetedEtps = targetedEtps;
        this.isInvestFlowFeatureEnabled = z3;
        List<Instrument> list = targetedEtps;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Instrument) it.next()).getId());
        }
        this.targetedEtpIds = arrayList;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RecurringHubViewState(com.robinhood.android.recurring.hub.RecurringHubViewState.State r2, java.lang.String r3, boolean r4, boolean r5, kotlinx.collections.immutable.ImmutableList r6, java.util.List r7, java.util.List r8, boolean r9, int r10, kotlin.jvm.internal.DefaultConstructorMarker r11) {
        /*
            r1 = this;
            r11 = r10 & 1
            if (r11 == 0) goto L6
            com.robinhood.android.recurring.hub.RecurringHubViewState$State r2 = com.robinhood.android.recurring.hub.RecurringHubViewState.State.LOADING
        L6:
            r11 = r10 & 4
            r0 = 0
            if (r11 == 0) goto Lc
            r4 = r0
        Lc:
            r11 = r10 & 8
            if (r11 == 0) goto L11
            r5 = r0
        L11:
            r11 = r10 & 16
            if (r11 == 0) goto L19
            kotlinx.collections.immutable.PersistentList r6 = kotlinx.collections.immutable.extensions2.persistentListOf()
        L19:
            r11 = r10 & 32
            if (r11 == 0) goto L21
            java.util.List r7 = kotlin.collections.CollectionsKt.emptyList()
        L21:
            r11 = r10 & 64
            if (r11 == 0) goto L29
            java.util.List r8 = kotlin.collections.CollectionsKt.emptyList()
        L29:
            r10 = r10 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L37
            r11 = r0
            r9 = r7
            r10 = r8
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L40
        L37:
            r11 = r9
            r10 = r8
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L40:
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.android.recurring.hub.RecurringHubViewState.<init>(com.robinhood.android.recurring.hub.RecurringHubViewState$State, java.lang.String, boolean, boolean, kotlinx.collections.immutable.ImmutableList, java.util.List, java.util.List, boolean, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final State getState() {
        return this.state;
    }

    public final String getSelectedAccountNumber() {
        return this.selectedAccountNumber;
    }

    public final boolean isCryptoFeatureEnabled() {
        return this.isCryptoFeatureEnabled;
    }

    public final boolean isEtfEnabled() {
        return this.isEtfEnabled;
    }

    private final boolean getShowAllAccounts() {
        return this.selectedAccountNumber == null;
    }

    private final List<InvestmentSchedule> getAccountInvestmentSchedules() {
        List<InvestmentSchedule> list = this.investmentSchedules;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!getShowAllAccounts() ? Intrinsics.areEqual(((InvestmentSchedule) obj).getAccountNumber(), this.selectedAccountNumber) : true) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!((InvestmentSchedule) obj2).isBrokerageCashTransfer()) {
                arrayList2.add(obj2);
            }
        }
        return arrayList2;
    }

    public final String getSelectedAccountSelectionOption(Resources res) throws Resources.NotFoundException {
        RecurringHubAccountUiModel next;
        Account account;
        DisplayName displayName;
        DisplayName.Variants withInvesting;
        StringResource title;
        CharSequence text;
        String string2;
        Intrinsics.checkNotNullParameter(res, "res");
        Iterator<RecurringHubAccountUiModel> it = this.accounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getAccount().getAccountNumber(), this.selectedAccountNumber)) {
                break;
            }
        }
        RecurringHubAccountUiModel recurringHubAccountUiModel = next;
        if (recurringHubAccountUiModel != null && (account = recurringHubAccountUiModel.getAccount()) != null && (displayName = AccountDisplayNames.getDisplayName(account)) != null && (withInvesting = displayName.getWithInvesting()) != null && (title = withInvesting.getTitle()) != null && (text = title.getText(res)) != null && (string2 = text.toString()) != null) {
            return string2;
        }
        String string3 = res.getString(C26221R.string.recurring_account_type_all);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        return string3;
    }

    public final AccountSwitcherData getAccountSwitcherData(Resources res) {
        AccountSwitcherData.ActiveSelection accountRow;
        Intrinsics.checkNotNullParameter(res, "res");
        ImmutableList<RecurringHubAccountUiModel> immutableList = this.accounts;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(immutableList, 10));
        for (RecurringHubAccountUiModel recurringHubAccountUiModel : immutableList) {
            Account account = recurringHubAccountUiModel.getAccount();
            String accountNumber = account.getAccountNumber();
            BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
            ManagementType managementType = account.getManagementType();
            StringResource title = AccountDisplayNames.getDisplayName(account).getWithInvesting().getTitle();
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C26221R.string.recurring_account_type_joint_description, new Object[0]);
            if (recurringHubAccountUiModel.isRecurringEnabled()) {
                stringResourceInvoke = null;
            }
            StringResource stringResource = stringResourceInvoke;
            arrayList.add(new AccountSwitcherRowData.Account(accountNumber, brokerageAccountType, managementType, account.getCreatedAt(), null, title, stringResource, null, null, AccountDisplayIcons.getDisplayIcon(account), recurringHubAccountUiModel.isRecurringEnabled(), 400, null));
        }
        if (this.selectedAccountNumber != null) {
            accountRow = new AccountSwitcherData.ActiveSelection.AccountRow(this.selectedAccountNumber);
        } else {
            accountRow = AccountSwitcherData.ActiveSelection.AllAccounts.INSTANCE;
        }
        return new AccountSwitcherData(arrayList, accountRow, true, false, null, null, null, res.getString(C26221R.string.recurring_account_type_joint_title), 120, null);
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> getStocksAndEtfHistoryEvents() {
        List<InvestmentSchedule> accountInvestmentSchedules = getAccountInvestmentSchedules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accountInvestmentSchedules) {
            if (!((InvestmentSchedule) obj).isCrypto()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((InvestmentSchedule) obj2).getState() == ApiInvestmentSchedule.State.PAUSED) {
                arrayList2.add(obj2);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, INVESTMENT_SCHEDULE_COMPARATOR);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((InvestmentSchedule) obj3).isActive()) {
                arrayList3.add(obj3);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList3, INVESTMENT_SCHEDULE_COMPARATOR), (Iterable) listSortedWith);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList4.add(mapToHistoryEvent((InvestmentSchedule) it.next()));
        }
        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
        Iterator it2 = arrayList4.iterator();
        while (it2.hasNext()) {
            arrayList5.add(((HistoryEvent) it2.next()).toStatefulHistoryEvent());
        }
        return arrayList5;
    }

    public final List<StatefulHistoryEvent<HistoryEvent>> getCryptoHistoryEvents() {
        List<InvestmentSchedule> accountInvestmentSchedules = getAccountInvestmentSchedules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accountInvestmentSchedules) {
            if (((InvestmentSchedule) obj).isCrypto()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (((InvestmentSchedule) obj2).getState() == ApiInvestmentSchedule.State.PAUSED) {
                arrayList2.add(obj2);
            }
        }
        List listSortedWith = CollectionsKt.sortedWith(arrayList2, INVESTMENT_SCHEDULE_COMPARATOR);
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : arrayList) {
            if (((InvestmentSchedule) obj3).isActive()) {
                arrayList3.add(obj3);
            }
        }
        List listPlus = CollectionsKt.plus((Collection) CollectionsKt.sortedWith(arrayList3, INVESTMENT_SCHEDULE_COMPARATOR), (Iterable) listSortedWith);
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listPlus, 10));
        Iterator it = listPlus.iterator();
        while (it.hasNext()) {
            arrayList4.add(((InvestmentSchedule) it.next()).toStatefulHistoryEvent());
        }
        return arrayList4;
    }

    public final UiInvestmentSchedules getUiInvestmentSchedules() {
        List<InvestmentSchedule> accountInvestmentSchedules = getAccountInvestmentSchedules();
        ArrayList arrayList = new ArrayList();
        for (Object obj : accountInvestmentSchedules) {
            if (((InvestmentSchedule) obj).getState() != ApiInvestmentSchedule.State.DELETED) {
                arrayList.add(obj);
            }
        }
        return new UiInvestmentSchedules(arrayList);
    }

    public final boolean getShowAccountSelector() {
        return this.accounts.size() > 1;
    }

    public final boolean getShowInvestFlowCta() {
        return this.isInvestFlowFeatureEnabled;
    }

    private final HistoryEvent mapToHistoryEvent(InvestmentSchedule investmentSchedule) {
        StringResource title;
        RecurringHubAccountUiModel next;
        Account account;
        DisplayName displayName;
        DisplayName.Variants variants;
        Iterator<RecurringHubAccountUiModel> it = this.accounts.iterator();
        while (true) {
            title = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(next.getAccount().getAccountNumber(), investmentSchedule.getAccountNumber())) {
                break;
            }
        }
        RecurringHubAccountUiModel recurringHubAccountUiModel = next;
        if (recurringHubAccountUiModel != null && (account = recurringHubAccountUiModel.getAccount()) != null && (displayName = AccountDisplayNames.getDisplayName(account)) != null && (variants = displayName.getShort()) != null) {
            title = variants.getTitle();
        }
        return (!getShowAllAccounts() || title == null) ? investmentSchedule : new InvestmentScheduleWithAccountType(title, investmentSchedule);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecurringHubViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/recurring/hub/RecurringHubViewState$State;", "", "<init>", "(Ljava/lang/String;I)V", "NON_EMPTY", "EMPTY", "LOADING", "ERROR", "feature-recurring-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class State {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State NON_EMPTY = new State("NON_EMPTY", 0);
        public static final State EMPTY = new State("EMPTY", 1);
        public static final State LOADING = new State("LOADING", 2);
        public static final State ERROR = new State("ERROR", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{NON_EMPTY, EMPTY, LOADING, ERROR};
        }

        public static EnumEntries<State> getEntries() {
            return $ENTRIES;
        }

        private State(String str, int i) {
        }

        static {
            State[] stateArr$values = $values();
            $VALUES = stateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(stateArr$values);
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    public final RecurringHubViewState mutateAccounts(List<RecurringHubAccountUiModel> accounts2) {
        String str;
        Account account;
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        String accountNumber = null;
        RecurringHubAccountUiModel recurringHubAccountUiModel = accounts2.size() == 1 ? (RecurringHubAccountUiModel) CollectionsKt.first((List) accounts2) : null;
        ImmutableList immutableList = extensions2.toImmutableList(accounts2);
        String str2 = this.selectedAccountNumber;
        if (str2 == null) {
            if (recurringHubAccountUiModel != null && (account = recurringHubAccountUiModel.getAccount()) != null) {
                accountNumber = account.getAccountNumber();
            }
            str = accountNumber;
        } else {
            str = str2;
        }
        return copy$default(this, null, str, false, false, immutableList, null, null, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable INVESTMENT_SCHEDULE_COMPARATOR$lambda$17(InvestmentSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getNextInvestmentDate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable INVESTMENT_SCHEDULE_COMPARATOR$lambda$18(InvestmentSchedule it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInvestmentTarget().getInstrumentSymbol();
    }
}
