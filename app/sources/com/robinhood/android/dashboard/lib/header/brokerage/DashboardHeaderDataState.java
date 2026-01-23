package com.robinhood.android.dashboard.lib.header.brokerage;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.account.strings.AccountDisplayNames;
import com.robinhood.android.account.strings.DisplayName;
import com.robinhood.android.dashboard.lib.AccountUtils;
import com.robinhood.android.dashboard.lib.header.brokerage.pill.NuxPillVisibilityExperiment;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.home.HomeAccountSwitcher;
import com.robinhood.models.home.api.HomeAccountSwitcherAccountIdentifier;
import com.robinhood.models.p320db.Account;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatExperienceV2;
import com.robinhood.models.p320db.identi.sortinghat.SortingHatRecord;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherDeeplinkCta;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData;
import com.robinhood.shared.account.contracts.switcher.AccountSwitcherUtils4;
import com.robinhood.store.AsyncResult;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: DashboardHeaderDataState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 .2\u00020\u0001:\u0001.Ba\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0011\u0010\"\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010$\u001a\u00020\rHÆ\u0003J\t\u0010%\u001a\u00020\rHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0010HÆ\u0003Jc\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÆ\u0001J\u0013\u0010(\u001a\u00020\r2\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020+HÖ\u0001J\t\u0010,\u001a\u00020-HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001cR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;", "", "activeDashboardType", "Lcom/robinhood/android/home/contracts/HomeDashboardType;", "homeAccounts", "", "Lcom/robinhood/models/db/Account;", "sortingHatState", "Lcom/robinhood/store/AsyncResult;", "Lcom/robinhood/models/db/identi/sortinghat/SortingHatRecord;", "homeAccountSwitcher", "Lcom/robinhood/models/home/HomeAccountSwitcher;", "tooltipEligibleToBeShown", "", "badgeEligibleToBeShown", "showPillInNuxVariant", "Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "<init>", "(Lcom/robinhood/android/home/contracts/HomeDashboardType;Ljava/util/List;Lcom/robinhood/store/AsyncResult;Lcom/robinhood/models/home/HomeAccountSwitcher;ZZLcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;)V", "getActiveDashboardType", "()Lcom/robinhood/android/home/contracts/HomeDashboardType;", "getHomeAccounts", "()Ljava/util/List;", "getSortingHatState", "()Lcom/robinhood/store/AsyncResult;", "getHomeAccountSwitcher", "()Lcom/robinhood/models/home/HomeAccountSwitcher;", "getTooltipEligibleToBeShown", "()Z", "getBadgeEligibleToBeShown", "getShowPillInNuxVariant", "()Lcom/robinhood/android/dashboard/lib/header/brokerage/pill/NuxPillVisibilityExperiment$Variant;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "Companion", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DashboardHeaderDataState {
    private final HomeDashboardType activeDashboardType;
    private final boolean badgeEligibleToBeShown;
    private final HomeAccountSwitcher homeAccountSwitcher;
    private final List<Account> homeAccounts;
    private final NuxPillVisibilityExperiment.Variant showPillInNuxVariant;
    private final AsyncResult<SortingHatRecord> sortingHatState;
    private final boolean tooltipEligibleToBeShown;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DashboardHeaderDataState() {
        this(null, null, null, null, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public static /* synthetic */ DashboardHeaderDataState copy$default(DashboardHeaderDataState dashboardHeaderDataState, HomeDashboardType homeDashboardType, List list, AsyncResult asyncResult, HomeAccountSwitcher homeAccountSwitcher, boolean z, boolean z2, NuxPillVisibilityExperiment.Variant variant, int i, Object obj) {
        if ((i & 1) != 0) {
            homeDashboardType = dashboardHeaderDataState.activeDashboardType;
        }
        if ((i & 2) != 0) {
            list = dashboardHeaderDataState.homeAccounts;
        }
        if ((i & 4) != 0) {
            asyncResult = dashboardHeaderDataState.sortingHatState;
        }
        if ((i & 8) != 0) {
            homeAccountSwitcher = dashboardHeaderDataState.homeAccountSwitcher;
        }
        if ((i & 16) != 0) {
            z = dashboardHeaderDataState.tooltipEligibleToBeShown;
        }
        if ((i & 32) != 0) {
            z2 = dashboardHeaderDataState.badgeEligibleToBeShown;
        }
        if ((i & 64) != 0) {
            variant = dashboardHeaderDataState.showPillInNuxVariant;
        }
        boolean z3 = z2;
        NuxPillVisibilityExperiment.Variant variant2 = variant;
        boolean z4 = z;
        AsyncResult asyncResult2 = asyncResult;
        return dashboardHeaderDataState.copy(homeDashboardType, list, asyncResult2, homeAccountSwitcher, z4, z3, variant2);
    }

    /* renamed from: component1, reason: from getter */
    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    public final List<Account> component2() {
        return this.homeAccounts;
    }

    public final AsyncResult<SortingHatRecord> component3() {
        return this.sortingHatState;
    }

    /* renamed from: component4, reason: from getter */
    public final HomeAccountSwitcher getHomeAccountSwitcher() {
        return this.homeAccountSwitcher;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getTooltipEligibleToBeShown() {
        return this.tooltipEligibleToBeShown;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getBadgeEligibleToBeShown() {
        return this.badgeEligibleToBeShown;
    }

    /* renamed from: component7, reason: from getter */
    public final NuxPillVisibilityExperiment.Variant getShowPillInNuxVariant() {
        return this.showPillInNuxVariant;
    }

    public final DashboardHeaderDataState copy(HomeDashboardType activeDashboardType, List<Account> homeAccounts, AsyncResult<SortingHatRecord> sortingHatState, HomeAccountSwitcher homeAccountSwitcher, boolean tooltipEligibleToBeShown, boolean badgeEligibleToBeShown, NuxPillVisibilityExperiment.Variant showPillInNuxVariant) {
        Intrinsics.checkNotNullParameter(homeAccounts, "homeAccounts");
        return new DashboardHeaderDataState(activeDashboardType, homeAccounts, sortingHatState, homeAccountSwitcher, tooltipEligibleToBeShown, badgeEligibleToBeShown, showPillInNuxVariant);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DashboardHeaderDataState)) {
            return false;
        }
        DashboardHeaderDataState dashboardHeaderDataState = (DashboardHeaderDataState) other;
        return Intrinsics.areEqual(this.activeDashboardType, dashboardHeaderDataState.activeDashboardType) && Intrinsics.areEqual(this.homeAccounts, dashboardHeaderDataState.homeAccounts) && Intrinsics.areEqual(this.sortingHatState, dashboardHeaderDataState.sortingHatState) && Intrinsics.areEqual(this.homeAccountSwitcher, dashboardHeaderDataState.homeAccountSwitcher) && this.tooltipEligibleToBeShown == dashboardHeaderDataState.tooltipEligibleToBeShown && this.badgeEligibleToBeShown == dashboardHeaderDataState.badgeEligibleToBeShown && this.showPillInNuxVariant == dashboardHeaderDataState.showPillInNuxVariant;
    }

    public int hashCode() {
        HomeDashboardType homeDashboardType = this.activeDashboardType;
        int iHashCode = (((homeDashboardType == null ? 0 : homeDashboardType.hashCode()) * 31) + this.homeAccounts.hashCode()) * 31;
        AsyncResult<SortingHatRecord> asyncResult = this.sortingHatState;
        int iHashCode2 = (iHashCode + (asyncResult == null ? 0 : asyncResult.hashCode())) * 31;
        HomeAccountSwitcher homeAccountSwitcher = this.homeAccountSwitcher;
        int iHashCode3 = (((((iHashCode2 + (homeAccountSwitcher == null ? 0 : homeAccountSwitcher.hashCode())) * 31) + Boolean.hashCode(this.tooltipEligibleToBeShown)) * 31) + Boolean.hashCode(this.badgeEligibleToBeShown)) * 31;
        NuxPillVisibilityExperiment.Variant variant = this.showPillInNuxVariant;
        return iHashCode3 + (variant != null ? variant.hashCode() : 0);
    }

    public String toString() {
        return "DashboardHeaderDataState(activeDashboardType=" + this.activeDashboardType + ", homeAccounts=" + this.homeAccounts + ", sortingHatState=" + this.sortingHatState + ", homeAccountSwitcher=" + this.homeAccountSwitcher + ", tooltipEligibleToBeShown=" + this.tooltipEligibleToBeShown + ", badgeEligibleToBeShown=" + this.badgeEligibleToBeShown + ", showPillInNuxVariant=" + this.showPillInNuxVariant + ")";
    }

    public DashboardHeaderDataState(HomeDashboardType homeDashboardType, List<Account> homeAccounts, AsyncResult<SortingHatRecord> asyncResult, HomeAccountSwitcher homeAccountSwitcher, boolean z, boolean z2, NuxPillVisibilityExperiment.Variant variant) {
        Intrinsics.checkNotNullParameter(homeAccounts, "homeAccounts");
        this.activeDashboardType = homeDashboardType;
        this.homeAccounts = homeAccounts;
        this.sortingHatState = asyncResult;
        this.homeAccountSwitcher = homeAccountSwitcher;
        this.tooltipEligibleToBeShown = z;
        this.badgeEligibleToBeShown = z2;
        this.showPillInNuxVariant = variant;
    }

    public final HomeDashboardType getActiveDashboardType() {
        return this.activeDashboardType;
    }

    public /* synthetic */ DashboardHeaderDataState(HomeDashboardType homeDashboardType, List list, AsyncResult asyncResult, HomeAccountSwitcher homeAccountSwitcher, boolean z, boolean z2, NuxPillVisibilityExperiment.Variant variant, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : homeDashboardType, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : asyncResult, (i & 8) != 0 ? null : homeAccountSwitcher, (i & 16) != 0 ? false : z, (i & 32) != 0 ? false : z2, (i & 64) != 0 ? null : variant);
    }

    public final List<Account> getHomeAccounts() {
        return this.homeAccounts;
    }

    public final AsyncResult<SortingHatRecord> getSortingHatState() {
        return this.sortingHatState;
    }

    public final HomeAccountSwitcher getHomeAccountSwitcher() {
        return this.homeAccountSwitcher;
    }

    public final boolean getTooltipEligibleToBeShown() {
        return this.tooltipEligibleToBeShown;
    }

    public final boolean getBadgeEligibleToBeShown() {
        return this.badgeEligibleToBeShown;
    }

    public final NuxPillVisibilityExperiment.Variant getShowPillInNuxVariant() {
        return this.showPillInNuxVariant;
    }

    /* compiled from: DashboardHeaderDataState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0014\u0010\u0006\u001a\u00020\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState$Companion;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderDataState;", "Lcom/robinhood/android/dashboard/lib/header/brokerage/DashboardHeaderViewState;", "<init>", "()V", "toAccountSwitcherData", "Lcom/robinhood/shared/account/contracts/switcher/AccountSwitcherData;", "Lcom/robinhood/models/home/HomeAccountSwitcher;", "identifier", "", "reduce", "dataState", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements StateProvider<DashboardHeaderDataState, DashboardHeaderViewState> {

        /* compiled from: DashboardHeaderDataState.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HomeAccountSwitcherAccountIdentifier.values().length];
                try {
                    iArr[HomeAccountSwitcherAccountIdentifier.ACCOUNT_NUMBER.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HomeAccountSwitcherAccountIdentifier.APPLICATION_ID.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HomeAccountSwitcherAccountIdentifier.UNKNOWN.ordinal()] = 3;
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

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r8v1, types: [com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData$PendingApplication] */
        /* JADX WARN: Type inference failed for: r9v1, types: [com.robinhood.shared.account.contracts.switcher.AccountSwitcherRowData$Account] */
        private final AccountSwitcherData toAccountSwitcherData(HomeAccountSwitcher homeAccountSwitcher, String str) {
            String bottomSheetTitle = homeAccountSwitcher.getBottomSheetTitle();
            String positiveButtonText = homeAccountSwitcher.getPositiveButtonText();
            List<HomeAccountSwitcher.Account> accounts2 = homeAccountSwitcher.getAccounts();
            ArrayList arrayList = new ArrayList();
            Iterator it = accounts2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    HomeAccountSwitcher.AccountSwitcherActionRow accountSwitcherActionRow = (HomeAccountSwitcher.AccountSwitcherActionRow) CollectionsKt.firstOrNull((List) homeAccountSwitcher.getActionRows());
                    return new AccountSwitcherData(arrayList, str, false, null, positiveButtonText, accountSwitcherActionRow != null ? new AccountSwitcherDeeplinkCta(accountSwitcherActionRow.getDeeplink(), accountSwitcherActionRow.getPrimaryText(), accountSwitcherActionRow.getLoggingIdentifier()) : null, bottomSheetTitle, 12, null);
                }
                HomeAccountSwitcher.Account account = (HomeAccountSwitcher.Account) it.next();
                int i = WhenMappings.$EnumSwitchMapping$0[account.getIdentifierType().ordinal()];
                if (i == 1) {
                    String identifier = account.getIdentifier();
                    BrokerageAccountType brokerageAccountType = account.getBrokerageAccountType();
                    ServerToBentoAssetMapper2 iconAsset = UtilKt.getIconAsset(account.getIcon());
                    if (iconAsset == null) {
                        iconAsset = ServerToBentoAssetMapper2.UNKNOWN;
                    }
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = iconAsset;
                    StringResource.Companion companion = StringResource.INSTANCE;
                    account = new AccountSwitcherRowData.Account(identifier, brokerageAccountType, account.getManagementType(), account.getCreatedAt(), account.getLoggingIdentifier(), companion.invoke(account.getExpandedPrimaryText()), companion.invoke(account.getSecondaryText()), null, null, serverToBentoAssetMapper2, false, 1408, null);
                } else if (i == 2) {
                    String identifier2 = account.getIdentifier();
                    BrokerageAccountType brokerageAccountType2 = account.getBrokerageAccountType();
                    ServerToBentoAssetMapper2 iconAsset2 = UtilKt.getIconAsset(account.getIcon());
                    if (iconAsset2 == null) {
                        iconAsset2 = ServerToBentoAssetMapper2.UNKNOWN;
                    }
                    String primaryText = account.getPrimaryText();
                    String secondaryText = account.getSecondaryText();
                    account = new AccountSwitcherRowData.PendingApplication(identifier2, brokerageAccountType2, account.getManagementType(), account.getCreatedAt(), account.getLoggingIdentifier(), primaryText, secondaryText, iconAsset2, false, 256, null);
                } else if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                if (account != null) {
                    arrayList.add(account);
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
        /* JADX WARN: Removed duplicated region for block: B:84:0x0169  */
        @Override // com.robinhood.android.udf.StateProvider
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public DashboardHeaderViewState reduce(DashboardHeaderDataState dataState) {
            Boolean boolValueOf;
            boolean z;
            Object next;
            BrokerageAccountType brokerageAccountType;
            AccountSwitcherData accountSwitcherDataFrom$default;
            StringResource stringResourceInvoke;
            DisplayName displayName;
            HomeAccountSwitcher.AccountSwitcherBadgeInfo badgeInfo;
            HomeAccountSwitcher.AccountSwitcherTooltipInfo tooltipInfo;
            String applicationId;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            boolean z2 = dataState.getHomeAccounts().size() > 1;
            HomeAccountSwitcher homeAccountSwitcher = dataState.getHomeAccountSwitcher();
            if (homeAccountSwitcher != null) {
                boolValueOf = Boolean.valueOf(homeAccountSwitcher.getAccounts().size() + homeAccountSwitcher.getActionRows().size() > 1);
            } else {
                boolValueOf = null;
            }
            AsyncResult<SortingHatRecord> sortingHatState = dataState.getSortingHatState();
            AsyncResult.Success success = sortingHatState instanceof AsyncResult.Success ? (AsyncResult.Success) sortingHatState : null;
            Boolean boolValueOf2 = success != null ? Boolean.valueOf(((SortingHatRecord) success.getValue()).getExperience() instanceof SortingHatExperienceV2.Invested) : null;
            boolean z3 = boolValueOf == null && boolValueOf2 == null;
            boolean z4 = Intrinsics.areEqual(boolValueOf2, Boolean.FALSE) && dataState.getShowPillInNuxVariant() == NuxPillVisibilityExperiment.Variant.NUX_HAS_PILL;
            if (!z2) {
                Boolean bool = Boolean.TRUE;
                z = Intrinsics.areEqual(boolValueOf, bool) || Intrinsics.areEqual(boolValueOf2, bool);
            }
            HomeDashboardType activeDashboardType = dataState.getActiveDashboardType();
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
            if (dataState.getActiveDashboardType() == null) {
                accountSwitcherDataFrom$default = null;
            } else if (dataState.getHomeAccountSwitcher() != null && Intrinsics.areEqual(boolValueOf, Boolean.TRUE)) {
                Companion companion = DashboardHeaderDataState.INSTANCE;
                HomeAccountSwitcher homeAccountSwitcher2 = dataState.getHomeAccountSwitcher();
                HomeDashboardType activeDashboardType3 = dataState.getActiveDashboardType();
                if (activeDashboardType3 instanceof HomeDashboardType.Account) {
                    applicationId = ((HomeDashboardType.Account) dataState.getActiveDashboardType()).getAccountNumber();
                } else if (activeDashboardType3 instanceof HomeDashboardType.PendingApplication) {
                    applicationId = ((HomeDashboardType.PendingApplication) dataState.getActiveDashboardType()).getApplicationId();
                } else {
                    if (!(activeDashboardType3 instanceof HomeDashboardType.Nux)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("Attempting to build an account switcher when no account exists"), true, null, 4, null);
                    applicationId = "";
                }
                accountSwitcherDataFrom$default = companion.toAccountSwitcherData(homeAccountSwitcher2, applicationId);
            } else if (accountNumber != null && z2) {
                accountSwitcherDataFrom$default = AccountSwitcherData.Companion.from$default(AccountSwitcherData.INSTANCE, accountNumber, AccountSwitcherUtils4.filterDeactivatedForSwitcher(dataState.getHomeAccounts()), false, false, null, 28, null);
            }
            HomeAccountSwitcher homeAccountSwitcher3 = dataState.getHomeAccountSwitcher();
            HomeAccountSwitcher.AccountSwitcherTooltipInfo accountSwitcherTooltipInfo = (homeAccountSwitcher3 == null || (tooltipInfo = homeAccountSwitcher3.getTooltipInfo()) == null || !z || !dataState.getTooltipEligibleToBeShown()) ? null : tooltipInfo;
            HomeAccountSwitcher homeAccountSwitcher4 = dataState.getHomeAccountSwitcher();
            HomeAccountSwitcher.AccountSwitcherBadgeInfo accountSwitcherBadgeInfo = (homeAccountSwitcher4 == null || (badgeInfo = homeAccountSwitcher4.getBadgeInfo()) == null || !z || !dataState.getBadgeEligibleToBeShown()) ? null : badgeInfo;
            if (account == null || (displayName = AccountDisplayNames.getDisplayName(account)) == null || (stringResourceInvoke = displayName.getHeadline()) == null) {
                if (z4) {
                    stringResourceInvoke = StringResource.INSTANCE.invoke("");
                } else {
                    stringResourceInvoke = StringResource.INSTANCE.invoke(AccountUtils.getDashboardTitle(brokerageAccountType), new Object[0]);
                }
            }
            return new DashboardHeaderViewState(brokerageAccountType, dataState.getActiveDashboardType(), accountSwitcherDataFrom$default, stringResourceInvoke, z || z4, accountSwitcherBadgeInfo, accountSwitcherTooltipInfo, z3, dataState.getShowPillInNuxVariant());
        }
    }
}
