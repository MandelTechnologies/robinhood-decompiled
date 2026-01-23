package com.robinhood.android.redesign.accounttab.utils;

import com.robinhood.android.redesign.accounttab.C26320R;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AccountTabTitleProvider.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/redesign/accounttab/utils/AccountTabTitleProvider;", "", "<init>", "()V", "determineManagedAccountTitle", "Lcom/robinhood/utils/resource/StringResource;", "account", "Lcom/robinhood/models/db/Account;", "lib-account-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class AccountTabTitleProvider {
    public static final int $stable = 0;
    public static final AccountTabTitleProvider INSTANCE = new AccountTabTitleProvider();

    /* compiled from: AccountTabTitleProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UGMA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.CUSTODIAL_UTMA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BrokerageAccountType.IRA_ROTH.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BrokerageAccountType.IRA_TRADITIONAL.ordinal()] = 5;
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
        }
    }

    private AccountTabTitleProvider() {
    }

    public final StringResource determineManagedAccountTitle(Account account) {
        Intrinsics.checkNotNullParameter(account, "account");
        switch (WhenMappings.$EnumSwitchMapping$0[account.getBrokerageAccountType().ordinal()]) {
            case 1:
            case 2:
                return StringResource.INSTANCE.invoke(C26320R.string.account_managed_custodial, new Object[0]);
            case 3:
                return StringResource.INSTANCE.invoke(C26320R.string.account_managed_investing, new Object[0]);
            case 4:
                return StringResource.INSTANCE.invoke(C26320R.string.account_managed_trad_roth, new Object[0]);
            case 5:
                return StringResource.INSTANCE.invoke(C26320R.string.account_managed_trad_ira, new Object[0]);
            case 6:
                return StringResource.INSTANCE.invoke(C26320R.string.account_managed_joint, new Object[0]);
            case 7:
            case 8:
                return StringResource.INSTANCE.invoke("");
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
