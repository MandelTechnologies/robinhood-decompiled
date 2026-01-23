package com.robinhood.android.pathfinder.corepages.supportlanding;

import com.robinhood.models.p355ui.SupportLandingAccount;
import com.robinhood.models.p355ui.pathfinder.contexts.SupportLandingAccountTab;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: SupportLandingViewState.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\t\u0010#\u001a\u00020\fHÆ\u0003JM\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010%\u001a\u00020\f2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0019HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState;", "", "heading", "", "tabs", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/ui/pathfinder/contexts/SupportLandingAccountTab;", "selectedAccountType", "accountTypeToTabStatus", "", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "showInputUploadLoading", "", "<init>", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/util/Map;Z)V", "getHeading", "()Ljava/lang/String;", "getTabs", "()Lkotlinx/collections/immutable/ImmutableList;", "getSelectedAccountType", "getAccountTypeToTabStatus", "()Ljava/util/Map;", "getShowInputUploadLoading", "()Z", "selectedTabIndex", "", "getSelectedTabIndex", "()I", "selectedTabStatus", "getSelectedTabStatus", "()Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "TabContentStatus", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class SupportLandingViewState {
    public static final int $stable = 8;
    private final Map<String, TabContentStatus> accountTypeToTabStatus;
    private final String heading;
    private final String selectedAccountType;
    private final int selectedTabIndex;
    private final TabContentStatus selectedTabStatus;
    private final boolean showInputUploadLoading;
    private final ImmutableList<SupportLandingAccountTab> tabs;

    public static /* synthetic */ SupportLandingViewState copy$default(SupportLandingViewState supportLandingViewState, String str, ImmutableList immutableList, String str2, Map map, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = supportLandingViewState.heading;
        }
        if ((i & 2) != 0) {
            immutableList = supportLandingViewState.tabs;
        }
        if ((i & 4) != 0) {
            str2 = supportLandingViewState.selectedAccountType;
        }
        if ((i & 8) != 0) {
            map = supportLandingViewState.accountTypeToTabStatus;
        }
        if ((i & 16) != 0) {
            z = supportLandingViewState.showInputUploadLoading;
        }
        boolean z2 = z;
        String str3 = str2;
        return supportLandingViewState.copy(str, immutableList, str3, map, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getHeading() {
        return this.heading;
    }

    public final ImmutableList<SupportLandingAccountTab> component2() {
        return this.tabs;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final Map<String, TabContentStatus> component4() {
        return this.accountTypeToTabStatus;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getShowInputUploadLoading() {
        return this.showInputUploadLoading;
    }

    public final SupportLandingViewState copy(String heading, ImmutableList<SupportLandingAccountTab> tabs, String selectedAccountType, Map<String, ? extends TabContentStatus> accountTypeToTabStatus, boolean showInputUploadLoading) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(accountTypeToTabStatus, "accountTypeToTabStatus");
        return new SupportLandingViewState(heading, tabs, selectedAccountType, accountTypeToTabStatus, showInputUploadLoading);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportLandingViewState)) {
            return false;
        }
        SupportLandingViewState supportLandingViewState = (SupportLandingViewState) other;
        return Intrinsics.areEqual(this.heading, supportLandingViewState.heading) && Intrinsics.areEqual(this.tabs, supportLandingViewState.tabs) && Intrinsics.areEqual(this.selectedAccountType, supportLandingViewState.selectedAccountType) && Intrinsics.areEqual(this.accountTypeToTabStatus, supportLandingViewState.accountTypeToTabStatus) && this.showInputUploadLoading == supportLandingViewState.showInputUploadLoading;
    }

    public int hashCode() {
        return (((((((this.heading.hashCode() * 31) + this.tabs.hashCode()) * 31) + this.selectedAccountType.hashCode()) * 31) + this.accountTypeToTabStatus.hashCode()) * 31) + Boolean.hashCode(this.showInputUploadLoading);
    }

    public String toString() {
        return "SupportLandingViewState(heading=" + this.heading + ", tabs=" + this.tabs + ", selectedAccountType=" + this.selectedAccountType + ", accountTypeToTabStatus=" + this.accountTypeToTabStatus + ", showInputUploadLoading=" + this.showInputUploadLoading + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SupportLandingViewState(String heading, ImmutableList<SupportLandingAccountTab> tabs, String selectedAccountType, Map<String, ? extends TabContentStatus> accountTypeToTabStatus, boolean z) {
        Intrinsics.checkNotNullParameter(heading, "heading");
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        Intrinsics.checkNotNullParameter(selectedAccountType, "selectedAccountType");
        Intrinsics.checkNotNullParameter(accountTypeToTabStatus, "accountTypeToTabStatus");
        this.heading = heading;
        this.tabs = tabs;
        this.selectedAccountType = selectedAccountType;
        this.accountTypeToTabStatus = accountTypeToTabStatus;
        this.showInputUploadLoading = z;
        Iterator<SupportLandingAccountTab> it = tabs.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getAccountType(), this.selectedAccountType)) {
                break;
            } else {
                i++;
            }
        }
        this.selectedTabIndex = i;
        this.selectedTabStatus = this.accountTypeToTabStatus.get(this.selectedAccountType);
    }

    public final String getHeading() {
        return this.heading;
    }

    public final ImmutableList<SupportLandingAccountTab> getTabs() {
        return this.tabs;
    }

    public final String getSelectedAccountType() {
        return this.selectedAccountType;
    }

    public final Map<String, TabContentStatus> getAccountTypeToTabStatus() {
        return this.accountTypeToTabStatus;
    }

    public final boolean getShowInputUploadLoading() {
        return this.showInputUploadLoading;
    }

    public final int getSelectedTabIndex() {
        return this.selectedTabIndex;
    }

    public final TabContentStatus getSelectedTabStatus() {
        return this.selectedTabStatus;
    }

    /* compiled from: SupportLandingViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "", "<init>", "()V", "Loading", "Success", "Error", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Error;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Loading;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Success;", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static abstract class TabContentStatus {
        public static final int $stable = 0;

        public /* synthetic */ TabContentStatus(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TabContentStatus() {
        }

        /* compiled from: SupportLandingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Loading;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Loading extends TabContentStatus {
            public static final int $stable = 0;
            public static final Loading INSTANCE = new Loading();

            private Loading() {
                super(null);
            }
        }

        /* compiled from: SupportLandingViewState.kt */
        @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\tHÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Success;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "selectableAccountNameToNumber", "", "Lkotlin/Pair;", "", "showAccountDropdownChip", "", "displayedAccount", "Lcom/robinhood/models/ui/SupportLandingAccount;", "<init>", "(Ljava/util/List;ZLcom/robinhood/models/ui/SupportLandingAccount;)V", "getSelectableAccountNameToNumber", "()Ljava/util/List;", "getShowAccountDropdownChip", "()Z", "getDisplayedAccount", "()Lcom/robinhood/models/ui/SupportLandingAccount;", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends TabContentStatus {
            public static final int $stable = 8;
            private final SupportLandingAccount displayedAccount;
            private final List<Tuples2<String, String>> selectableAccountNameToNumber;
            private final boolean showAccountDropdownChip;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Success copy$default(Success success, List list, boolean z, SupportLandingAccount supportLandingAccount, int i, Object obj) {
                if ((i & 1) != 0) {
                    list = success.selectableAccountNameToNumber;
                }
                if ((i & 2) != 0) {
                    z = success.showAccountDropdownChip;
                }
                if ((i & 4) != 0) {
                    supportLandingAccount = success.displayedAccount;
                }
                return success.copy(list, z, supportLandingAccount);
            }

            public final List<Tuples2<String, String>> component1() {
                return this.selectableAccountNameToNumber;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getShowAccountDropdownChip() {
                return this.showAccountDropdownChip;
            }

            /* renamed from: component3, reason: from getter */
            public final SupportLandingAccount getDisplayedAccount() {
                return this.displayedAccount;
            }

            public final Success copy(List<Tuples2<String, String>> selectableAccountNameToNumber, boolean showAccountDropdownChip, SupportLandingAccount displayedAccount) {
                Intrinsics.checkNotNullParameter(selectableAccountNameToNumber, "selectableAccountNameToNumber");
                return new Success(selectableAccountNameToNumber, showAccountDropdownChip, displayedAccount);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.areEqual(this.selectableAccountNameToNumber, success.selectableAccountNameToNumber) && this.showAccountDropdownChip == success.showAccountDropdownChip && Intrinsics.areEqual(this.displayedAccount, success.displayedAccount);
            }

            public int hashCode() {
                int iHashCode = ((this.selectableAccountNameToNumber.hashCode() * 31) + Boolean.hashCode(this.showAccountDropdownChip)) * 31;
                SupportLandingAccount supportLandingAccount = this.displayedAccount;
                return iHashCode + (supportLandingAccount == null ? 0 : supportLandingAccount.hashCode());
            }

            public String toString() {
                return "Success(selectableAccountNameToNumber=" + this.selectableAccountNameToNumber + ", showAccountDropdownChip=" + this.showAccountDropdownChip + ", displayedAccount=" + this.displayedAccount + ")";
            }

            public final List<Tuples2<String, String>> getSelectableAccountNameToNumber() {
                return this.selectableAccountNameToNumber;
            }

            public final boolean getShowAccountDropdownChip() {
                return this.showAccountDropdownChip;
            }

            public final SupportLandingAccount getDisplayedAccount() {
                return this.displayedAccount;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(List<Tuples2<String, String>> selectableAccountNameToNumber, boolean z, SupportLandingAccount supportLandingAccount) {
                super(null);
                Intrinsics.checkNotNullParameter(selectableAccountNameToNumber, "selectableAccountNameToNumber");
                this.selectableAccountNameToNumber = selectableAccountNameToNumber;
                this.showAccountDropdownChip = z;
                this.displayedAccount = supportLandingAccount;
            }
        }

        /* compiled from: SupportLandingViewState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus$Error;", "Lcom/robinhood/android/pathfinder/corepages/supportlanding/SupportLandingViewState$TabContentStatus;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Error extends TabContentStatus {
            public static final int $stable = 0;
            public static final Error INSTANCE = new Error();

            private Error() {
                super(null);
            }
        }
    }
}
