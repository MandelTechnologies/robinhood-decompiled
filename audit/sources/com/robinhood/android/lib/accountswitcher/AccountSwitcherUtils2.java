package com.robinhood.android.lib.accountswitcher;

import com.robinhood.android.account.strings.BrokerageAccountTypes2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherUtils;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.converters.brokerage.ManagementTypes2;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.BrokerageAccountSwitcherContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRow;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: AccountSwitcherUtils.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0005H\u0000\u001a,\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\t0\b0\u0007\"\b\b\u0000\u0010\t*\u00020\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\t0\u0007H\u0000\"$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00050\fj\b\u0012\u0004\u0012\u00020\u0005`\rX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"toLoggingDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData;", "activeAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRow;", "generateAccountSections", "", "Lcom/robinhood/android/lib/accountswitcher/AccountSection;", "T", "allRows", "accountSwitcherRowComparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "getAccountSwitcherRowComparator", "()Ljava/util/Comparator;", "lib-account-switcher_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherUtilsKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class AccountSwitcherUtils2 {
    private static final Comparator<AccountSwitcherRow> accountSwitcherRowComparator;

    /* compiled from: AccountSwitcherUtils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.lib.accountswitcher.AccountSwitcherUtilsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[AccountSwitcherUtils3.values().length];
            try {
                iArr2[AccountSwitcherUtils3.INDIVIDUAL_ACCOUNTS.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[AccountSwitcherUtils3.JOINT_ACCOUNTS.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[AccountSwitcherUtils3.RETIREMENT_ACCOUNTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[AccountSwitcherUtils3.CUSTODIAL_ACCOUNTS.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr2[AccountSwitcherUtils3.ISA_ACCOUNTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr2[AccountSwitcherUtils3.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused14) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final UserInteractionEventDescriptor toLoggingDescriptor(AccountSwitcherRowData accountSwitcherRowData, BrokerageAccountContext activeAccountContext) {
        Context contextCopy$default;
        Intrinsics.checkNotNullParameter(accountSwitcherRowData, "<this>");
        Intrinsics.checkNotNullParameter(activeAccountContext, "activeAccountContext");
        if (accountSwitcherRowData instanceof AccountSwitcherRowData.Account) {
            UserInteractionEventDescriptor loggingDescriptor = toLoggingDescriptor(accountSwitcherRowData);
            Context context = loggingDescriptor.getContext();
            if (context != null) {
                AccountSwitcherRowData.Account account = (AccountSwitcherRowData.Account) accountSwitcherRowData;
                contextCopy$default = Context.copy$default(context, 0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountSwitcherContext(activeAccountContext.getAccount_type(), BrokerageAccountTypes3.toProtobuf(account.getBrokerageAccountType()), activeAccountContext.getManagement_type(), ManagementTypes2.toProtobuf(account.getManagementType()), null, 16, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -513, -1, -1, 16383, null);
            } else {
                contextCopy$default = null;
            }
            return UserInteractionEventDescriptor.copy$default(loggingDescriptor, null, null, null, contextCopy$default, null, null, 55, null);
        }
        if (!(accountSwitcherRowData instanceof AccountSwitcherRowData.PendingApplication)) {
            throw new NoWhenBranchMatchedException();
        }
        return new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, ((AccountSwitcherRowData.PendingApplication) accountSwitcherRowData).getLoggingIdentifier(), null, 4, null), null, 47, null);
    }

    public static final UserInteractionEventDescriptor toLoggingDescriptor(AccountSwitcherRow accountSwitcherRow) {
        Intrinsics.checkNotNullParameter(accountSwitcherRow, "<this>");
        Component.ComponentType componentType = Component.ComponentType.ROW;
        String loggingIdentifier = accountSwitcherRow.getLoggingIdentifier();
        if (loggingIdentifier == null) {
            loggingIdentifier = accountSwitcherRow.getBrokerageAccountType().getServerValue();
        }
        return new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(accountSwitcherRow.getBrokerageAccountType()), null, ManagementTypes2.toProtobuf(accountSwitcherRow.getManagementType()), null, false, false, null, null, null, null, 1018, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), new Component(componentType, loggingIdentifier, null, 4, null), null, 39, null);
    }

    public static final <T extends AccountSwitcherRow> List<AccountSwitcherUtils<T>> generateAccountSections(List<? extends T> allRows) {
        int i;
        AccountSwitcherUtils3 accountSwitcherUtils3;
        Intrinsics.checkNotNullParameter(allRows, "allRows");
        Sequence sequenceSortedWith = SequencesKt.sortedWith(CollectionsKt.asSequence(allRows), accountSwitcherRowComparator);
        TreeMap treeMap = new TreeMap();
        int i2 = 0;
        int i3 = 0;
        for (Object obj : sequenceSortedWith) {
            AccountSwitcherRow accountSwitcherRow = (AccountSwitcherRow) obj;
            switch (WhenMappings.$EnumSwitchMapping$0[accountSwitcherRow.getBrokerageAccountType().ordinal()]) {
                case 1:
                    if (accountSwitcherRow.getManagementType() == ManagementType.SELF_DIRECTED) {
                        i3++;
                    }
                    accountSwitcherUtils3 = AccountSwitcherUtils3.INDIVIDUAL_ACCOUNTS;
                    break;
                case 2:
                case 3:
                    accountSwitcherUtils3 = AccountSwitcherUtils3.RETIREMENT_ACCOUNTS;
                    break;
                case 4:
                case 5:
                    i2++;
                    accountSwitcherUtils3 = AccountSwitcherUtils3.CUSTODIAL_ACCOUNTS;
                    break;
                case 6:
                    accountSwitcherUtils3 = AccountSwitcherUtils3.JOINT_ACCOUNTS;
                    break;
                case 7:
                    accountSwitcherUtils3 = AccountSwitcherUtils3.ISA_ACCOUNTS;
                    break;
                case 8:
                    accountSwitcherUtils3 = AccountSwitcherUtils3.OTHER;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            Object arrayList = treeMap.get(accountSwitcherUtils3);
            if (arrayList == null) {
                arrayList = new ArrayList();
                treeMap.put(accountSwitcherUtils3, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        Set setKeySet = treeMap.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        if (setKeySet.size() > 1 && (i3 > 1 || i2 >= 1)) {
            ArrayList arrayList2 = new ArrayList(treeMap.size());
            for (Map.Entry entry : treeMap.entrySet()) {
                switch (WhenMappings.$EnumSwitchMapping$1[((AccountSwitcherUtils3) entry.getKey()).ordinal()]) {
                    case 1:
                        i = C20198R.string.account_switcher_individual_accounts_header;
                        break;
                    case 2:
                        i = C20198R.string.account_switcher_joint_accounts_header;
                        break;
                    case 3:
                        i = C20198R.string.account_switcher_retirement_accounts_header;
                        break;
                    case 4:
                        i = C20198R.string.account_switcher_custodial_accounts_header;
                        break;
                    case 5:
                        i = C20198R.string.account_switcher_isa_accounts_header;
                        break;
                    case 6:
                        i = C20198R.string.account_switcher_other_accounts_header;
                        break;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
                arrayList2.add(new AccountSwitcherUtils.WithHeader((List) entry.getValue(), StringResource.INSTANCE.invoke(i, new Object[0])));
            }
            return arrayList2;
        }
        return CollectionsKt.listOf(new AccountSwitcherUtils.WithoutHeader(SequencesKt.toList(sequenceSortedWith)));
    }

    public static final Comparator<AccountSwitcherRow> getAccountSwitcherRowComparator() {
        return accountSwitcherRowComparator;
    }

    static {
        final Comparator comparator = new Comparator() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherUtilsKt$special$$inlined$compareBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                return ComparisonsKt.compareValues(Integer.valueOf(BrokerageAccountTypes2.getSortValue(((AccountSwitcherRow) t).getBrokerageAccountType())), Integer.valueOf(BrokerageAccountTypes2.getSortValue(((AccountSwitcherRow) t2).getBrokerageAccountType())));
            }
        };
        final Comparator comparator2 = new Comparator() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherUtilsKt$special$$inlined$thenBy$1
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((AccountSwitcherRow) t).getManagementType(), ((AccountSwitcherRow) t2).getManagementType());
            }
        };
        accountSwitcherRowComparator = new Comparator() { // from class: com.robinhood.android.lib.accountswitcher.AccountSwitcherUtilsKt$special$$inlined$thenBy$2
            @Override // java.util.Comparator
            public final int compare(T t, T t2) {
                int iCompare = comparator2.compare(t, t2);
                return iCompare != 0 ? iCompare : ComparisonsKt.compareValues(((AccountSwitcherRow) t).getCreatedAt(), ((AccountSwitcherRow) t2).getCreatedAt());
            }
        };
    }
}
