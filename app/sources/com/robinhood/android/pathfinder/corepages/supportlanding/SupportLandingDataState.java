package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.models.p355ui.SupportLandingAccount;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingContext;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SupportLandingDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u0015\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J\t\u0010\u001a\u001a\u00020\u000bHÆ\u0003JS\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001d\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0015¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState;", "", "context", "Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingContext;", "selectedAccountType", "", "accountTypeToTabStatus", "", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "accountTypeToSelectedAccountNumber", "isRefreshingInquiry", "", "<init>", "(Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingContext;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Z)V", "getContext", "()Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingContext;", "getSelectedAccountType", "()Ljava/lang/String;", "getAccountTypeToTabStatus", "()Ljava/util/Map;", "getAccountTypeToSelectedAccountNumber", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "TabContentStatus", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class SupportLandingDataState {
    public static final int $stable = 8;
    private final Map<String, String> accountTypeToSelectedAccountNumber;
    private final Map<String, TabContentStatus> accountTypeToTabStatus;
    private final SupportLandingContext context;
    private final boolean isRefreshingInquiry;
    private final String selectedAccountType;

    public static /* synthetic */ SupportLandingDataState copy$default(SupportLandingDataState supportLandingDataState, SupportLandingContext supportLandingContext, String str, Map map, Map map2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            supportLandingContext = supportLandingDataState.context;
        }
        if ((i & 2) != 0) {
            str = supportLandingDataState.selectedAccountType;
        }
        if ((i & 4) != 0) {
            map = supportLandingDataState.accountTypeToTabStatus;
        }
        if ((i & 8) != 0) {
            map2 = supportLandingDataState.accountTypeToSelectedAccountNumber;
        }
        if ((i & 16) != 0) {
            z = supportLandingDataState.isRefreshingInquiry;
        }
        boolean z2 = z;
        Map map3 = map;
        return supportLandingDataState.copy(supportLandingContext, str, map3, map2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final SupportLandingContext getContext() {
        return this.context;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final Map<String, TabContentStatus> component3() {
        return this.accountTypeToTabStatus;
    }

    public final Map<String, String> component4() {
        return this.accountTypeToSelectedAccountNumber;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsRefreshingInquiry() {
        return this.isRefreshingInquiry;
    }

    public final SupportLandingDataState copy(SupportLandingContext context, String selectedAccountType, Map<String, ? extends TabContentStatus> accountTypeToTabStatus, Map<String, String> accountTypeToSelectedAccountNumber, boolean isRefreshingInquiry) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(accountTypeToTabStatus, "accountTypeToTabStatus");
        Intrinsics.checkNotNullParameter(accountTypeToSelectedAccountNumber, "accountTypeToSelectedAccountNumber");
        return new SupportLandingDataState(context, selectedAccountType, accountTypeToTabStatus, accountTypeToSelectedAccountNumber, isRefreshingInquiry);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportLandingDataState)) {
            return false;
        }
        SupportLandingDataState supportLandingDataState = (SupportLandingDataState) other;
        return Intrinsics.areEqual(this.context, supportLandingDataState.context) && Intrinsics.areEqual(this.selectedAccountType, supportLandingDataState.selectedAccountType) && Intrinsics.areEqual(this.accountTypeToTabStatus, supportLandingDataState.accountTypeToTabStatus) && Intrinsics.areEqual(this.accountTypeToSelectedAccountNumber, supportLandingDataState.accountTypeToSelectedAccountNumber) && this.isRefreshingInquiry == supportLandingDataState.isRefreshingInquiry;
    }

    public int hashCode() {
        return (((((((this.context.hashCode() * 31) + this.selectedAccountType.hashCode()) * 31) + this.accountTypeToTabStatus.hashCode()) * 31) + this.accountTypeToSelectedAccountNumber.hashCode()) * 31) + Boolean.hashCode(this.isRefreshingInquiry);
    }

    public String toString() {
        return "SupportLandingDataState(context=" + this.context + ", selectedAccountType=" + this.selectedAccountType + ", accountTypeToTabStatus=" + this.accountTypeToTabStatus + ", accountTypeToSelectedAccountNumber=" + this.accountTypeToSelectedAccountNumber + ", isRefreshingInquiry=" + this.isRefreshingInquiry + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportLandingDataState(SupportLandingContext context, String selectedAccountType, Map<String, ? extends TabContentStatus> accountTypeToTabStatus, Map<String, String> accountTypeToSelectedAccountNumber, boolean z) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(accountTypeToTabStatus, "accountTypeToTabStatus");
        Intrinsics.checkNotNullParameter(accountTypeToSelectedAccountNumber, "accountTypeToSelectedAccountNumber");
        this.context = context;
        this.selectedAccountType = selectedAccountType;
        this.accountTypeToTabStatus = accountTypeToTabStatus;
        this.accountTypeToSelectedAccountNumber = accountTypeToSelectedAccountNumber;
        this.isRefreshingInquiry = z;
    }

    public final SupportLandingContext getContext() {
        return this.context;
    }

    public /* synthetic */ SupportLandingDataState(SupportLandingContext supportLandingContext, String str, Map map, Map map2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(supportLandingContext, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? MapsKt.emptyMap() : map, (i & 8) != 0 ? MapsKt.emptyMap() : map2, (i & 16) != 0 ? false : z);
    }

    public final String getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final Map<String, TabContentStatus> getAccountTypeToTabStatus() {
        return this.accountTypeToTabStatus;
    }

    public final Map<String, String> getAccountTypeToSelectedAccountNumber() {
        return this.accountTypeToSelectedAccountNumber;
    }

    public final boolean isRefreshingInquiry() {
        return this.isRefreshingInquiry;
    }

    /* compiled from: SupportLandingDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Error;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Loading;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Success;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TabContentStatus {
        public static final int $stable = 0;

        public /* synthetic */ TabContentStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TabContentStatus() {
        }

        /* compiled from: SupportLandingDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Loading;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends TabContentStatus {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: SupportLandingDataState.kt */
        @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Success;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "accounts", "", "Lcom/robinhood/models/ui/SupportLandingAccount;", "<init>", "(Ljava/util/List;)V", "getAccounts", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends TabContentStatus {
            public static final int $stable = 8;
            private final List<SupportLandingAccount> accounts;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, List list, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.accounts;
                }
                return success.copy(list);
            }

            public final List<SupportLandingAccount> component1() {
                return this.accounts;
            }

            public final Success copy(List<SupportLandingAccount> accounts2) {
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                return new Success(accounts2);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.accounts, ((Success) other).accounts);
            }

            public int hashCode() {
                return this.accounts.hashCode();
            }

            public String toString() {
                return "Success(accounts=" + this.accounts + ")";
            }

            public final List<SupportLandingAccount> getAccounts() {
                return this.accounts;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(List<SupportLandingAccount> accounts2) {
                super(null);
                Intrinsics.checkNotNullParameter(accounts2, "accounts");
                this.accounts = accounts2;
            }
        }

        /* compiled from: SupportLandingDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus$Error;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingDataState$TabContentStatus;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends TabContentStatus {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }
    }
}
