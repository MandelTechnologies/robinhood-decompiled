package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.shared.settings.contracts.SettingsPage;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RetirementDashboardUnfundedDataState.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 92\u00020\u0001:\u00019B{\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010-\u001a\u00020\fHÆ\u0003J\t\u0010.\u001a\u00020\fHÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J}\u00103\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0013\u001a\u00020\fHÆ\u0001J\u0013\u00104\u001a\u00020\f2\b\u00105\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00106\u001a\u000207HÖ\u0001J\t\u00108\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u001fR\u0013\u0010%\u001a\u0004\u0018\u00010&¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u0006:"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;", "", "activeAccountNumber", "", "retirementAccounts", "", "Lcom/robinhood/models/db/Account;", "accountSwitcher", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "viewModel", "Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel;", "accountSwitcherLoading", "", "shouldShowInboxBadge", "isCriticalBadge", "matchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "isEmbedded", "<init>", "(Ljava/lang/String;Ljava/util/List;Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel;ZZZLcom/robinhood/android/models/retirement/db/RetirementMatchRate;Lcom/robinhood/models/db/IacInfoBanner;Z)V", "getActiveAccountNumber", "()Ljava/lang/String;", "getRetirementAccounts", "()Ljava/util/List;", "getAccountSwitcher", "()Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "getViewModel", "()Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel;", "getAccountSwitcherLoading", "()Z", "getShouldShowInboxBadge", "getMatchRate", "()Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "getInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "settingsRowKey", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "getSettingsRowKey", "()Lcom/robinhood/shared/settings/contracts/SettingsPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "Provider", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementDashboardUnfundedDataState {
    private final RetirementAccountSwitcher accountSwitcher;
    private final boolean accountSwitcherLoading;
    private final String activeAccountNumber;
    private final IacInfoBanner infoBanner;
    private final boolean isCriticalBadge;
    private final boolean isEmbedded;
    private final RetirementMatchRate matchRate;
    private final List<Account> retirementAccounts;
    private final SettingsPage settingsRowKey;
    private final boolean shouldShowInboxBadge;
    private final RetirementUnfundedViewModel viewModel;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public RetirementDashboardUnfundedDataState() {
        this(null, null, null, null, false, false, false, null, null, false, 1023, null);
    }

    public static /* synthetic */ RetirementDashboardUnfundedDataState copy$default(RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState, String str, List list, RetirementAccountSwitcher retirementAccountSwitcher, RetirementUnfundedViewModel retirementUnfundedViewModel, boolean z, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, IacInfoBanner iacInfoBanner, boolean z4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementDashboardUnfundedDataState.activeAccountNumber;
        }
        if ((i & 2) != 0) {
            list = retirementDashboardUnfundedDataState.retirementAccounts;
        }
        if ((i & 4) != 0) {
            retirementAccountSwitcher = retirementDashboardUnfundedDataState.accountSwitcher;
        }
        if ((i & 8) != 0) {
            retirementUnfundedViewModel = retirementDashboardUnfundedDataState.viewModel;
        }
        if ((i & 16) != 0) {
            z = retirementDashboardUnfundedDataState.accountSwitcherLoading;
        }
        if ((i & 32) != 0) {
            z2 = retirementDashboardUnfundedDataState.shouldShowInboxBadge;
        }
        if ((i & 64) != 0) {
            z3 = retirementDashboardUnfundedDataState.isCriticalBadge;
        }
        if ((i & 128) != 0) {
            retirementMatchRate = retirementDashboardUnfundedDataState.matchRate;
        }
        if ((i & 256) != 0) {
            iacInfoBanner = retirementDashboardUnfundedDataState.infoBanner;
        }
        if ((i & 512) != 0) {
            z4 = retirementDashboardUnfundedDataState.isEmbedded;
        }
        IacInfoBanner iacInfoBanner2 = iacInfoBanner;
        boolean z5 = z4;
        boolean z6 = z3;
        RetirementMatchRate retirementMatchRate2 = retirementMatchRate;
        boolean z7 = z;
        boolean z8 = z2;
        return retirementDashboardUnfundedDataState.copy(str, list, retirementAccountSwitcher, retirementUnfundedViewModel, z7, z8, z6, retirementMatchRate2, iacInfoBanner2, z5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    public final List<Account> component2() {
        return this.retirementAccounts;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    /* renamed from: component4, reason: from getter */
    public final RetirementUnfundedViewModel getViewModel() {
        return this.viewModel;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getAccountSwitcherLoading() {
        return this.accountSwitcherLoading;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsCriticalBadge() {
        return this.isCriticalBadge;
    }

    /* renamed from: component8, reason: from getter */
    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    /* renamed from: component9, reason: from getter */
    public final IacInfoBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final RetirementDashboardUnfundedDataState copy(String activeAccountNumber, List<Account> retirementAccounts, RetirementAccountSwitcher accountSwitcher, RetirementUnfundedViewModel viewModel, boolean accountSwitcherLoading, boolean shouldShowInboxBadge, boolean isCriticalBadge, RetirementMatchRate matchRate, IacInfoBanner infoBanner, boolean isEmbedded) {
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        return new RetirementDashboardUnfundedDataState(activeAccountNumber, retirementAccounts, accountSwitcher, viewModel, accountSwitcherLoading, shouldShowInboxBadge, isCriticalBadge, matchRate, infoBanner, isEmbedded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementDashboardUnfundedDataState)) {
            return false;
        }
        RetirementDashboardUnfundedDataState retirementDashboardUnfundedDataState = (RetirementDashboardUnfundedDataState) other;
        return Intrinsics.areEqual(this.activeAccountNumber, retirementDashboardUnfundedDataState.activeAccountNumber) && Intrinsics.areEqual(this.retirementAccounts, retirementDashboardUnfundedDataState.retirementAccounts) && Intrinsics.areEqual(this.accountSwitcher, retirementDashboardUnfundedDataState.accountSwitcher) && Intrinsics.areEqual(this.viewModel, retirementDashboardUnfundedDataState.viewModel) && this.accountSwitcherLoading == retirementDashboardUnfundedDataState.accountSwitcherLoading && this.shouldShowInboxBadge == retirementDashboardUnfundedDataState.shouldShowInboxBadge && this.isCriticalBadge == retirementDashboardUnfundedDataState.isCriticalBadge && Intrinsics.areEqual(this.matchRate, retirementDashboardUnfundedDataState.matchRate) && Intrinsics.areEqual(this.infoBanner, retirementDashboardUnfundedDataState.infoBanner) && this.isEmbedded == retirementDashboardUnfundedDataState.isEmbedded;
    }

    public int hashCode() {
        String str = this.activeAccountNumber;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.retirementAccounts.hashCode()) * 31;
        RetirementAccountSwitcher retirementAccountSwitcher = this.accountSwitcher;
        int iHashCode2 = (iHashCode + (retirementAccountSwitcher == null ? 0 : retirementAccountSwitcher.hashCode())) * 31;
        RetirementUnfundedViewModel retirementUnfundedViewModel = this.viewModel;
        int iHashCode3 = (((((((iHashCode2 + (retirementUnfundedViewModel == null ? 0 : retirementUnfundedViewModel.hashCode())) * 31) + Boolean.hashCode(this.accountSwitcherLoading)) * 31) + Boolean.hashCode(this.shouldShowInboxBadge)) * 31) + Boolean.hashCode(this.isCriticalBadge)) * 31;
        RetirementMatchRate retirementMatchRate = this.matchRate;
        int iHashCode4 = (iHashCode3 + (retirementMatchRate == null ? 0 : retirementMatchRate.hashCode())) * 31;
        IacInfoBanner iacInfoBanner = this.infoBanner;
        return ((iHashCode4 + (iacInfoBanner != null ? iacInfoBanner.hashCode() : 0)) * 31) + Boolean.hashCode(this.isEmbedded);
    }

    public String toString() {
        return "RetirementDashboardUnfundedDataState(activeAccountNumber=" + this.activeAccountNumber + ", retirementAccounts=" + this.retirementAccounts + ", accountSwitcher=" + this.accountSwitcher + ", viewModel=" + this.viewModel + ", accountSwitcherLoading=" + this.accountSwitcherLoading + ", shouldShowInboxBadge=" + this.shouldShowInboxBadge + ", isCriticalBadge=" + this.isCriticalBadge + ", matchRate=" + this.matchRate + ", infoBanner=" + this.infoBanner + ", isEmbedded=" + this.isEmbedded + ")";
    }

    public RetirementDashboardUnfundedDataState(String str, List<Account> retirementAccounts, RetirementAccountSwitcher retirementAccountSwitcher, RetirementUnfundedViewModel retirementUnfundedViewModel, boolean z, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, IacInfoBanner iacInfoBanner, boolean z4) {
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        this.activeAccountNumber = str;
        this.retirementAccounts = retirementAccounts;
        this.accountSwitcher = retirementAccountSwitcher;
        this.viewModel = retirementUnfundedViewModel;
        this.accountSwitcherLoading = z;
        this.shouldShowInboxBadge = z2;
        this.isCriticalBadge = z3;
        this.matchRate = retirementMatchRate;
        this.infoBanner = iacInfoBanner;
        this.isEmbedded = z4;
        this.settingsRowKey = z4 ? new SettingsPage("retirement", str, RetirementLastKnownEntryPointManager.INSTANCE.getLastKnownEntryPoint()) : null;
    }

    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public /* synthetic */ RetirementDashboardUnfundedDataState(String str, List list, RetirementAccountSwitcher retirementAccountSwitcher, RetirementUnfundedViewModel retirementUnfundedViewModel, boolean z, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, IacInfoBanner iacInfoBanner, boolean z4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : retirementAccountSwitcher, (i & 8) != 0 ? null : retirementUnfundedViewModel, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? false : z3, (i & 128) != 0 ? null : retirementMatchRate, (i & 256) != 0 ? null : iacInfoBanner, (i & 512) != 0 ? false : z4);
    }

    public final List<Account> getRetirementAccounts() {
        return this.retirementAccounts;
    }

    public final RetirementAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final RetirementUnfundedViewModel getViewModel() {
        return this.viewModel;
    }

    public final boolean getAccountSwitcherLoading() {
        return this.accountSwitcherLoading;
    }

    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    public final boolean isCriticalBadge() {
        return this.isCriticalBadge;
    }

    public final RetirementMatchRate getMatchRate() {
        return this.matchRate;
    }

    public final IacInfoBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }

    /* compiled from: RetirementDashboardUnfundedDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedDataState;", "Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;", "<init>", "()V", "reduce", "dataState", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementDashboardUnfundedDataState, RetirementDashboardUnfundedViewState> {

        /* compiled from: RetirementDashboardUnfundedDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.retirement.ui.unfunded.RetirementDashboardUnfundedDataState$Provider$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ManagementType.values().length];
                try {
                    iArr[ManagementType.MANAGED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ManagementType.UNKNOWN.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ManagementType.SELF_DIRECTED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementDashboardUnfundedViewState reduce(RetirementDashboardUnfundedDataState dataState) {
            MatchRateBreakdown activeBreakdownForAch;
            Object next;
            RetirementUnfundedViewModel.MobileContent mobileContent;
            String serverValue;
            RetirementDashboardHeader3 retirementDashboardHeader3From;
            List<RetirementUnfundedViewModel.MobileContent> mobileContents;
            Object next2;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            Iterator<T> it = dataState.getRetirementAccounts().iterator();
            while (true) {
                activeBreakdownForAch = null;
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((Account) next).getAccountNumber(), dataState.getActiveAccountNumber())) {
                    break;
                }
            }
            Account account = (Account) next;
            BrokerageAccountType brokerageAccountType = account != null ? account.getBrokerageAccountType() : null;
            String activeAccountNumber = dataState.getActiveAccountNumber();
            RetirementUnfundedViewModel viewModel = dataState.getViewModel();
            if (viewModel == null || (mobileContents = viewModel.getMobileContents()) == null) {
                mobileContent = null;
            } else {
                Iterator<T> it2 = mobileContents.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    if (Intrinsics.areEqual(((RetirementUnfundedViewModel.MobileContent) next2).getAccountNumber(), dataState.getActiveAccountNumber())) {
                        break;
                    }
                }
                mobileContent = (RetirementUnfundedViewModel.MobileContent) next2;
            }
            if (brokerageAccountType == null || (serverValue = brokerageAccountType.getServerValue()) == null) {
                serverValue = "";
            }
            String str = serverValue;
            if (dataState.getAccountSwitcherLoading()) {
                retirementDashboardHeader3From = RetirementDashboardHeader3.Loading.INSTANCE;
            } else {
                RetirementDashboardHeader3.Companion companion = RetirementDashboardHeader3.INSTANCE;
                String activeAccountNumber2 = dataState.getActiveAccountNumber();
                List<Account> retirementAccounts = dataState.getRetirementAccounts();
                RetirementAccountSwitcher accountSwitcher = dataState.getAccountSwitcher();
                ManagementType managementType = account != null ? account.getManagementType() : null;
                int i = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
                if (i != -1 && i != 1 && i != 2) {
                    if (i != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    RetirementMatchRate matchRate = dataState.getMatchRate();
                    if (matchRate != null) {
                        activeBreakdownForAch = matchRate.getActiveBreakdownForAch();
                    }
                }
                retirementDashboardHeader3From = companion.from(activeAccountNumber2, retirementAccounts, accountSwitcher, activeBreakdownForAch);
            }
            return new RetirementDashboardUnfundedViewState(activeAccountNumber, brokerageAccountType, retirementDashboardHeader3From, mobileContent, str, dataState.getInfoBanner(), dataState.getSettingsRowKey());
        }
    }
}
