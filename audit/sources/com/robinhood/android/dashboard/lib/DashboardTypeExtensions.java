package com.robinhood.android.dashboard.lib;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.librobinhood.data.store.identi.SortingHatQueryArgs;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.Account;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DashboardTypeExtensions.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00078@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0015\u0010\n\u001a\u00020\u000b*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u0015\u0010\u000f\u001a\u00020\u0010*\u00020\f8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, m3636d2 = {"sortingHatQuery", "Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getSortingHatQuery", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;)Lcom/robinhood/librobinhood/data/store/identi/SortingHatQueryArgs;", "screenName", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/robinhood/models/api/BrokerageAccountType;", "getScreenName", "(Lcom/robinhood/models/api/BrokerageAccountType;)Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/robinhood/models/db/Account;", "getScreen", "(Lcom/robinhood/models/db/Account;)Lcom/robinhood/rosetta/eventlogging/Screen;", "brokerageAccountContext", "Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "getBrokerageAccountContext", "(Lcom/robinhood/models/db/Account;)Lcom/robinhood/rosetta/eventlogging/BrokerageAccountContext;", "lib-account-home_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.dashboard.lib.DashboardTypeExtensionsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardTypeExtensions {

    /* compiled from: DashboardTypeExtensions.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.dashboard.lib.DashboardTypeExtensionsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BrokerageAccountType.values().length];
            try {
                iArr[BrokerageAccountType.INDIVIDUAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
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
                iArr[BrokerageAccountType.ISA_STOCKS_AND_SHARES.ordinal()] = 5;
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
                iArr[BrokerageAccountType.UNKNOWN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SortingHatQueryArgs getSortingHatQuery(HomeDashboardType homeDashboardType) {
        Intrinsics.checkNotNullParameter(homeDashboardType, "<this>");
        if (homeDashboardType instanceof HomeDashboardType.Account) {
            return new SortingHatQueryArgs(null, ((HomeDashboardType.Account) homeDashboardType).getAccountNumber(), false, 5, null);
        }
        if (Intrinsics.areEqual(homeDashboardType, HomeDashboardType.Nux.INSTANCE)) {
            return new SortingHatQueryArgs(null, null, false, 7, null);
        }
        if (!(homeDashboardType instanceof HomeDashboardType.PendingApplication)) {
            throw new NoWhenBranchMatchedException();
        }
        return new SortingHatQueryArgs(((HomeDashboardType.PendingApplication) homeDashboardType).getApplicationId(), null, false, 6, null);
    }

    public static final Screen.Name getScreenName(BrokerageAccountType brokerageAccountType) {
        Intrinsics.checkNotNullParameter(brokerageAccountType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()]) {
            case 1:
                return Screen.Name.HOME;
            case 2:
                return Screen.Name.JOINT_ACCOUNT_HOME;
            case 3:
            case 4:
                return Screen.Name.RETIREMENT_DASHBOARD;
            case 5:
            case 6:
            case 7:
            case 8:
                return Screen.Name.NAME_UNSPECIFIED;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final Screen getScreen(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return new Screen(getScreenName(account.getBrokerageAccountType()), null, account.getBrokerageAccountType().getServerValue() + "_" + account.getManagementType().getServerValue(), null, 10, null);
    }

    public static final BrokerageAccountContext getBrokerageAccountContext(Account account) {
        Intrinsics.checkNotNullParameter(account, "<this>");
        return new BrokerageAccountContext(null, null, null, null, false, false, Boolean.valueOf(account.isOriginal()), Boolean.valueOf(account.isDefault()), null, null, 831, null);
    }
}
