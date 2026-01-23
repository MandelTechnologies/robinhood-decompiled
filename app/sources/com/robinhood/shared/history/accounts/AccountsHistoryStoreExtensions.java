package com.robinhood.shared.history.accounts;

import com.robinhood.android.account.icons.AccountDisplayIcons;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.librobinhood.data.store.AccountsHistoryStore;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.shared.history.contracts.account.AccountsHistoryAccountTypeFilter;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Instant;

/* compiled from: AccountsHistoryStoreExtensions.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002H\u0000\u001a\f\u0010\u0003\u001a\u00020\u0004*\u00020\u0002H\u0000\u001a\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0002*\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¨\u0006\t"}, m3636d2 = {"getAccountTypeForSelectedAccount", "Lcom/robinhood/shared/history/contracts/account/AccountsHistoryAccountTypeFilter;", "Lcom/robinhood/librobinhood/data/store/AccountsHistoryStore$HistoryAccountFilterViewInfo;", "toAccountSwitcherRow", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherRowData$Account;", "findFromAccountNumber", "", "accountNumber", "", "feature-accounts-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryStoreExtensionsKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class AccountsHistoryStoreExtensions {

    /* compiled from: AccountsHistoryStoreExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.history.accounts.AccountsHistoryStoreExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AccountsHistoryAccountTypeFilter getAccountTypeForSelectedAccount(AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo) {
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) {
            return AccountsHistoryAccountTypeFilter.RHY;
        }
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) {
            return AccountsHistoryAccountTypeFilter.CRYPTO;
        }
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
            switch (WhenMappings.$EnumSwitchMapping$0[((AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) historyAccountFilterViewInfo).getBrokerageAccountType().ordinal()]) {
                case 1:
                case 2:
                    return AccountsHistoryAccountTypeFilter.RHS;
                case 3:
                    return AccountsHistoryAccountTypeFilter.RHS_IRA_ROTH;
                case 4:
                    return AccountsHistoryAccountTypeFilter.RHS_IRA_TRADITIONAL;
                case 5:
                    return AccountsHistoryAccountTypeFilter.RHS_JOINT_TENANCY_WITH_ROS;
                case 6:
                case 7:
                    return AccountsHistoryAccountTypeFilter.RHS_CUSTODIAL;
                case 8:
                    return AccountsHistoryAccountTypeFilter.RHS_ISA_STOCKS_AND_SHARES;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return AccountsHistoryAccountTypeFilter.ALL;
    }

    public static final AccountSwitcherRowData.Account toAccountSwitcherRow(AccountsHistoryStore.HistoryAccountFilterViewInfo historyAccountFilterViewInfo) {
        Intrinsics.checkNotNullParameter(historyAccountFilterViewInfo, "<this>");
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) {
            AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount brokerageAccount = (AccountsHistoryStore.HistoryAccountFilterViewInfo.BrokerageAccount) historyAccountFilterViewInfo;
            return new AccountSwitcherRowData.Account(brokerageAccount.getAccountIdentifier(), brokerageAccount.getBrokerageAccountType(), brokerageAccount.getManagementType(), brokerageAccount.getCreatedAt(), null, brokerageAccount.getDisplayName(), null, null, null, AccountDisplayIcons.getDisplayIcon24(brokerageAccount.getBrokerageAccountType(), brokerageAccount.getManagementType()), false, 1488, null);
        }
        if (historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) {
            AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto crypto2 = (AccountsHistoryStore.HistoryAccountFilterViewInfo.Crypto) historyAccountFilterViewInfo;
            String accountIdentifier = crypto2.getAccountIdentifier();
            BrokerageAccountType brokerageAccountType = BrokerageAccountType.UNKNOWN;
            ManagementType managementType = ManagementType.UNKNOWN;
            StringResource displayName = crypto2.getDisplayName();
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CRYPTO_C_24;
            Instant EPOCH = Instant.EPOCH;
            Intrinsics.checkNotNullExpressionValue(EPOCH, "EPOCH");
            return new AccountSwitcherRowData.Account(accountIdentifier, brokerageAccountType, managementType, EPOCH, null, displayName, null, null, null, serverToBentoAssetMapper2, false, 1488, null);
        }
        if (!(historyAccountFilterViewInfo instanceof AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy)) {
            throw new NoWhenBranchMatchedException();
        }
        AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy rhy = (AccountsHistoryStore.HistoryAccountFilterViewInfo.Rhy) historyAccountFilterViewInfo;
        String accountIdentifier2 = rhy.getAccountIdentifier();
        BrokerageAccountType brokerageAccountType2 = BrokerageAccountType.UNKNOWN;
        ManagementType managementType2 = ManagementType.UNKNOWN;
        StringResource displayName2 = rhy.getDisplayName();
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.CASH_24;
        Instant EPOCH2 = Instant.EPOCH;
        Intrinsics.checkNotNullExpressionValue(EPOCH2, "EPOCH");
        return new AccountSwitcherRowData.Account(accountIdentifier2, brokerageAccountType2, managementType2, EPOCH2, null, displayName2, null, null, null, serverToBentoAssetMapper22, false, 1488, null);
    }

    public static final AccountsHistoryStore.HistoryAccountFilterViewInfo findFromAccountNumber(List<? extends AccountsHistoryStore.HistoryAccountFilterViewInfo> list, String accountNumber) {
        Object next;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((AccountsHistoryStore.HistoryAccountFilterViewInfo) next).getAccountIdentifier(), accountNumber)) {
                break;
            }
        }
        return (AccountsHistoryStore.HistoryAccountFilterViewInfo) next;
    }
}
