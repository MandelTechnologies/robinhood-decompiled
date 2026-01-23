package com.robinhood.android.account.naming.list;

import com.robinhood.android.account.naming.C8116R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData;
import com.robinhood.shared.account.contracts.switcher.AccountSelectorData2;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AccountNicknameListState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\n\u0010\b\u001a\u00020\t*\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/account/naming/list/AccountNicknameListStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/account/naming/list/AccountNicknameListDataState;", "Lcom/robinhood/android/account/naming/list/AccountNicknameListViewState;", "<init>", "()V", "reduce", "dataState", "isNicknameAllowed", "", "Lcom/robinhood/models/db/Account;", "feature-account-naming_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.account.naming.list.AccountNicknameListStateProvider, reason: use source file name */
/* loaded from: classes24.dex */
public final class AccountNicknameListState2 implements StateProvider<AccountNicknameListDataState, AccountNicknameListViewState> {
    public static final int $stable = 0;

    /* compiled from: AccountNicknameListState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.account.naming.list.AccountNicknameListStateProvider$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[ManagementType.values().length];
            try {
                iArr[ManagementType.SELF_DIRECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ManagementType.MANAGED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ManagementType.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BrokerageAccountType.values().length];
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 6;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 7;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    @Override // com.robinhood.android.udf.StateProvider
    public AccountNicknameListViewState reduce(AccountNicknameListDataState dataState) {
        String str;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        List<Account> listFilterDeactivatedForSwitcher = AccountSwitcherUtils4.filterDeactivatedForSwitcher(dataState.getAccounts());
        ArrayList<Account> arrayList = new ArrayList();
        for (Object obj : listFilterDeactivatedForSwitcher) {
            if (isNicknameAllowed((Account) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        for (Account account : arrayList) {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.EDIT_24;
            StringResource stringResourceInvoke = StringResource.INSTANCE.invoke(C8116R.string.account_nickname_list_icon_content_description, new Object[0]);
            if (account.isOriginal()) {
                str = "original_account";
            } else {
                str = "non_original_account";
            }
            arrayList2.add(AccountSelectorData2.toAccountSelectorRowData$default(account, null, serverToBentoAssetMapper2, stringResourceInvoke, false, str, 9, null));
        }
        return new AccountNicknameListViewState(new AccountSelectorData(extensions2.toImmutableList(arrayList2)));
    }

    public final boolean isNicknameAllowed(Account account) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(account, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[account.getManagementType().ordinal()];
        if (i == 1) {
            z = true;
        } else {
            if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            z = false;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[account.getBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
            case 3:
                z2 = true;
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
                z2 = false;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return z && z2;
    }
}
