package com.robinhood.android.dashboard.lib.header.brokerage.pill;

import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DashboardHeaderPillDataState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000  2\u00020\u0001:\u0001 B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u0010\u0018\u001a\u00020\nHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;", "", "activeDashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "homeAccounts", "", "Lcom/robinhood/models/db/Account;", "dashboardPillData", "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "eligibleForFirstTradeUpsellBanner", "", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Ljava/util/List;Lcom/robinhood/android/dashboardpill/DashboardPillData;Z)V", "getActiveDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getHomeAccounts", "()Ljava/util/List;", "getDashboardPillData", "()Lcom/robinhood/android/dashboardpill/DashboardPillData;", "getEligibleForFirstTradeUpsellBanner", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardHeaderPillDataState {
    private final HomeDashboardType activeDashboardType;
    private final DashboardPillData dashboardPillData;
    private final boolean eligibleForFirstTradeUpsellBanner;
    private final List<Account> homeAccounts;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DashboardHeaderPillDataState() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DashboardHeaderPillDataState copy$default(DashboardHeaderPillDataState dashboardHeaderPillDataState, HomeDashboardType homeDashboardType, List list, DashboardPillData dashboardPillData, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDashboardType = dashboardHeaderPillDataState.activeDashboardType;
        }
        if ((i & 2) != 0) {
            list = dashboardHeaderPillDataState.homeAccounts;
        }
        if ((i & 4) != 0) {
            dashboardPillData = dashboardHeaderPillDataState.dashboardPillData;
        }
        if ((i & 8) != 0) {
            z = dashboardHeaderPillDataState.eligibleForFirstTradeUpsellBanner;
        }
        return dashboardHeaderPillDataState.copy(homeDashboardType, list, dashboardPillData, z);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    public final List<Account> component2() {
        return this.homeAccounts;
    }

    /* renamed from: component3, reason: from getter */
    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getEligibleForFirstTradeUpsellBanner() {
        return this.eligibleForFirstTradeUpsellBanner;
    }

    public final DashboardHeaderPillDataState copy(HomeDashboardType activeDashboardType, List<Account> homeAccounts, DashboardPillData dashboardPillData, boolean eligibleForFirstTradeUpsellBanner) {
        Intrinsics.checkNotNullParameter(homeAccounts, "homeAccounts");
        return new DashboardHeaderPillDataState(activeDashboardType, homeAccounts, dashboardPillData, eligibleForFirstTradeUpsellBanner);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardHeaderPillDataState)) {
            return false;
        }
        DashboardHeaderPillDataState dashboardHeaderPillDataState = (DashboardHeaderPillDataState) other;
        return Intrinsics.areEqual(this.activeDashboardType, dashboardHeaderPillDataState.activeDashboardType) && Intrinsics.areEqual(this.homeAccounts, dashboardHeaderPillDataState.homeAccounts) && Intrinsics.areEqual(this.dashboardPillData, dashboardHeaderPillDataState.dashboardPillData) && this.eligibleForFirstTradeUpsellBanner == dashboardHeaderPillDataState.eligibleForFirstTradeUpsellBanner;
    }

    public int hashCode() {
        HomeDashboardType homeDashboardType = this.activeDashboardType;
        int iHashCode = (((homeDashboardType == null ? 0 : homeDashboardType.hashCode()) * 31) + this.homeAccounts.hashCode()) * 31;
        DashboardPillData dashboardPillData = this.dashboardPillData;
        return ((iHashCode + (dashboardPillData != null ? dashboardPillData.hashCode() : 0)) * 31) + Boolean.hashCode(this.eligibleForFirstTradeUpsellBanner);
    }

    public String toString() {
        return "DashboardHeaderPillDataState(activeDashboardType=" + this.activeDashboardType + ", homeAccounts=" + this.homeAccounts + ", dashboardPillData=" + this.dashboardPillData + ", eligibleForFirstTradeUpsellBanner=" + this.eligibleForFirstTradeUpsellBanner + ")";
    }

    public DashboardHeaderPillDataState(HomeDashboardType homeDashboardType, List<Account> homeAccounts, DashboardPillData dashboardPillData, boolean z) {
        Intrinsics.checkNotNullParameter(homeAccounts, "homeAccounts");
        this.activeDashboardType = homeDashboardType;
        this.homeAccounts = homeAccounts;
        this.dashboardPillData = dashboardPillData;
        this.eligibleForFirstTradeUpsellBanner = z;
    }

    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    public /* synthetic */ DashboardHeaderPillDataState(HomeDashboardType homeDashboardType, List list, DashboardPillData dashboardPillData, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : homeDashboardType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : dashboardPillData, (i & 8) != 0 ? false : z);
    }

    public final List<Account> getHomeAccounts() {
        return this.homeAccounts;
    }

    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }

    public final boolean getEligibleForFirstTradeUpsellBanner() {
        return this.eligibleForFirstTradeUpsellBanner;
    }

    /* compiled from: DashboardHeaderPillDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillDataState;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/DashboardHeaderPillViewState;", "<init>", "()V", "reduce", "dataState", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<DashboardHeaderPillDataState, DashboardHeaderPillViewState> {

        /* compiled from: DashboardHeaderPillDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
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
                    iArr[BrokerageAccountType.JOINT_TENANCY_WITH_ROS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ManagementType.values().length];
                try {
                    iArr2[ManagementType.MANAGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr2[ManagementType.SELF_DIRECTED.ordinal()] = 2;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr2[ManagementType.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX WARN: Removed duplicated region for block: B:44:0x0091  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DashboardHeaderPillViewState reduce(DashboardHeaderPillDataState dataState) {
            Object next;
            BrokerageAccountType brokerageAccountType;
            int i;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            HomeDashboardType activeDashboardType = dataState.getActiveDashboardType();
            DashboardPillData dashboardPillData = null;
            String accountNumber = activeDashboardType != null ? activeDashboardType.getAccountNumber() : null;
            Iterator<T> it = dataState.getHomeAccounts().iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Account) next).getAccountNumber(), accountNumber)) {
                    break;
                }
            }
            Account account = (Account) next;
            HomeDashboardType activeDashboardType2 = dataState.getActiveDashboardType();
            if (activeDashboardType2 instanceof HomeDashboardType.Account) {
                brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
            } else if (Intrinsics.areEqual(activeDashboardType2, HomeDashboardType.Nux.INSTANCE)) {
                brokerageAccountType = BrokerageAccountType.INDIVIDUAL;
            } else if (activeDashboardType2 instanceof HomeDashboardType.PendingApplication) {
                brokerageAccountType = ((HomeDashboardType.PendingApplication) dataState.getActiveDashboardType()).getBrokerageAccountType();
            } else {
                if (activeDashboardType2 != null) {
                    throw new NoWhenBranchMatchedException();
                }
            }
            ManagementType managementType = account != null ? account.getManagementType() : null;
            int i2 = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$1[managementType.ordinal()];
            if (i2 == -1) {
                i = brokerageAccountType != null ? WhenMappings.$EnumSwitchMapping$0[brokerageAccountType.ordinal()] : -1;
                if (i == 1 || i == 2) {
                    dashboardPillData = dataState.getDashboardPillData();
                }
            } else if (i2 != 1) {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (brokerageAccountType != null) {
                }
                if (i == 1) {
                    dashboardPillData = dataState.getDashboardPillData();
                } else {
                    dashboardPillData = dataState.getDashboardPillData();
                }
            }
            return new DashboardHeaderPillViewState(dashboardPillData);
        }
    }
}
