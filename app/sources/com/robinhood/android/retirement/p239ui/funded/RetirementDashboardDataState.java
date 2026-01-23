package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.models.portfolio.api.PositionInstrumentType;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.models.retirement.p194db.MatchRateBreakdown;
import com.robinhood.android.models.retirement.p194db.RetirementAccountSwitcher;
import com.robinhood.android.models.retirement.p194db.RetirementInvestmentAndTrade;
import com.robinhood.android.models.retirement.p194db.RetirementMatchRate;
import com.robinhood.android.models.retirement.shared.RetirementUninvestedViewModel;
import com.robinhood.android.retirement.contracts.RetirementLastKnownEntryPointManager;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.android.retirement.lib.UninvestedSectionState;
import com.robinhood.android.retirement.p239ui.funded.RetirementDashboardChartFooter;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.models.p320db.Account;
import com.robinhood.shared.settings.contracts.SettingsPage;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: RetirementDashboardDataState.kt */
@Metadata(m3635d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 _2\u00020\u0001:\u0001_B\u009b\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0018\u0010\u0019J\u000b\u0010L\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000f\u0010P\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\t\u0010Q\u001a\u00020\u000eHÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\t\u0010S\u001a\u00020\u000eHÆ\u0003J\t\u0010T\u001a\u00020\u000eHÆ\u0003J\u000b\u0010U\u001a\u0004\u0018\u00010\u0014HÆ\u0003J\t\u0010V\u001a\u00020\u000eHÆ\u0003J\t\u0010W\u001a\u00020\u000eHÆ\u0003J\t\u0010X\u001a\u00020\u000eHÆ\u0003J\u009d\u0001\u0010Y\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000e2\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u000e2\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000eHÆ\u0001J\u0013\u0010Z\u001a\u00020\u000e2\b\u0010[\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\\\u001a\u00020]HÖ\u0001J\t\u0010^\u001a\u00020\tHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0011\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010%R\u0011\u0010\u0012\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010%R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0014¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010\u0015\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b+\u0010%R\u0011\u0010\u0016\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b,\u0010%R\u0011\u0010\u0017\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010%R\u0011\u0010-\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b.\u0010!R\u0016\u0010/\u001a\u0004\u0018\u00010\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0013\u00102\u001a\u0004\u0018\u0001038F¢\u0006\u0006\u001a\u0004\b4\u00105R\u0011\u00106\u001a\u0002078F¢\u0006\u0006\u001a\u0004\b8\u00109R\u0013\u0010:\u001a\u0004\u0018\u00010;8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0017\u0010B\u001a\b\u0012\u0004\u0012\u00020D0C8F¢\u0006\u0006\u001a\u0004\bE\u0010FR\u000e\u0010G\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010H\u001a\u0004\u0018\u00010I¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010K¨\u0006`"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;", "", "chartDisplayValue", "Ljava/math/BigDecimal;", "investmentAndTrade", "Lcom/robinhood/android/models/retirement/db/RetirementInvestmentAndTrade;", "uninvestedViewModel", "Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "activeAccountNumber", "", "retirementAccounts", "", "Lcom/robinhood/models/db/Account;", "accountSwitcherLoading", "", "accountSwitcher", "Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "shouldShowInboxBadge", "isCriticalBadge", "retirementMatchRate", "Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "shouldShowRetirementOptionsAssetHomeTooltip", "retirementOptionsAssetHomeTooltipSeen", "isEmbedded", "<init>", "(Ljava/math/BigDecimal;Lcom/robinhood/android/models/retirement/db/RetirementInvestmentAndTrade;Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;Ljava/lang/String;Ljava/util/List;ZLcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;ZZLcom/robinhood/android/models/retirement/db/RetirementMatchRate;ZZZ)V", "getChartDisplayValue", "()Ljava/math/BigDecimal;", "getInvestmentAndTrade", "()Lcom/robinhood/android/models/retirement/db/RetirementInvestmentAndTrade;", "getUninvestedViewModel", "()Lcom/robinhood/android/models/retirement/shared/RetirementUninvestedViewModel;", "getActiveAccountNumber", "()Ljava/lang/String;", "getRetirementAccounts", "()Ljava/util/List;", "getAccountSwitcherLoading", "()Z", "getAccountSwitcher", "()Lcom/robinhood/android/models/retirement/db/RetirementAccountSwitcher;", "getShouldShowInboxBadge", "getRetirementMatchRate", "()Lcom/robinhood/android/models/retirement/db/RetirementMatchRate;", "getShouldShowRetirementOptionsAssetHomeTooltip", "getRetirementOptionsAssetHomeTooltipSeen", "loggingIdentifier", "getLoggingIdentifier", "activeAccount", "getActiveAccount", "()Lcom/robinhood/models/db/Account;", "activeBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "getActiveBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "headerState", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "getHeaderState", "()Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "chartFooter", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "getChartFooter", "()Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "footerButtonState", "Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "getFooterButtonState", "()Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "positionsSections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent$Positions;", "getPositionsSections", "()Lkotlinx/collections/immutable/ImmutableList;", "isActiveAccountManaged", "settingsRowKey", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "getSettingsRowKey", "()Lcom/robinhood/shared/settings/contracts/SettingsPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "copy", "equals", "other", "hashCode", "", "toString", "Provider", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
public final /* data */ class RetirementDashboardDataState {
    private final RetirementAccountSwitcher accountSwitcher;
    private final boolean accountSwitcherLoading;
    private final String activeAccountNumber;
    private final BigDecimal chartDisplayValue;
    private final RetirementInvestmentAndTrade investmentAndTrade;
    private final boolean isActiveAccountManaged;
    private final boolean isCriticalBadge;
    private final boolean isEmbedded;
    private final List<Account> retirementAccounts;
    private final RetirementMatchRate retirementMatchRate;
    private final boolean retirementOptionsAssetHomeTooltipSeen;
    private final SettingsPage settingsRowKey;
    private final boolean shouldShowInboxBadge;
    private final boolean shouldShowRetirementOptionsAssetHomeTooltip;
    private final RetirementUninvestedViewModel uninvestedViewModel;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private static final List<PositionInstrumentType> SUPPORTED_INSTRUMENT_TYPES = CollectionsKt.listOf((Object[]) new PositionInstrumentType[]{PositionInstrumentType.OPTIONS_PENDING, PositionInstrumentType.OPTIONS, PositionInstrumentType.EQUITY_LEGACY});

    /* compiled from: RetirementDashboardDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

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
        }
    }

    public RetirementDashboardDataState() {
        this(null, null, null, null, null, false, null, false, false, null, false, false, false, 8191, null);
    }

    public static /* synthetic */ RetirementDashboardDataState copy$default(RetirementDashboardDataState retirementDashboardDataState, BigDecimal bigDecimal, RetirementInvestmentAndTrade retirementInvestmentAndTrade, RetirementUninvestedViewModel retirementUninvestedViewModel, String str, List list, boolean z, RetirementAccountSwitcher retirementAccountSwitcher, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, boolean z4, boolean z5, boolean z6, int i, Object obj) {
        if ((i & 1) != 0) {
            bigDecimal = retirementDashboardDataState.chartDisplayValue;
        }
        return retirementDashboardDataState.copy(bigDecimal, (i & 2) != 0 ? retirementDashboardDataState.investmentAndTrade : retirementInvestmentAndTrade, (i & 4) != 0 ? retirementDashboardDataState.uninvestedViewModel : retirementUninvestedViewModel, (i & 8) != 0 ? retirementDashboardDataState.activeAccountNumber : str, (i & 16) != 0 ? retirementDashboardDataState.retirementAccounts : list, (i & 32) != 0 ? retirementDashboardDataState.accountSwitcherLoading : z, (i & 64) != 0 ? retirementDashboardDataState.accountSwitcher : retirementAccountSwitcher, (i & 128) != 0 ? retirementDashboardDataState.shouldShowInboxBadge : z2, (i & 256) != 0 ? retirementDashboardDataState.isCriticalBadge : z3, (i & 512) != 0 ? retirementDashboardDataState.retirementMatchRate : retirementMatchRate, (i & 1024) != 0 ? retirementDashboardDataState.shouldShowRetirementOptionsAssetHomeTooltip : z4, (i & 2048) != 0 ? retirementDashboardDataState.retirementOptionsAssetHomeTooltipSeen : z5, (i & 4096) != 0 ? retirementDashboardDataState.isEmbedded : z6);
    }

    /* renamed from: component1, reason: from getter */
    public final BigDecimal getChartDisplayValue() {
        return this.chartDisplayValue;
    }

    /* renamed from: component10, reason: from getter */
    public final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getShouldShowRetirementOptionsAssetHomeTooltip() {
        return this.shouldShowRetirementOptionsAssetHomeTooltip;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getRetirementOptionsAssetHomeTooltipSeen() {
        return this.retirementOptionsAssetHomeTooltipSeen;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* renamed from: component2, reason: from getter */
    public final RetirementInvestmentAndTrade getInvestmentAndTrade() {
        return this.investmentAndTrade;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementUninvestedViewModel getUninvestedViewModel() {
        return this.uninvestedViewModel;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final List<Account> component5() {
        return this.retirementAccounts;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getAccountSwitcherLoading() {
        return this.accountSwitcherLoading;
    }

    /* renamed from: component7, reason: from getter */
    public final RetirementAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsCriticalBadge() {
        return this.isCriticalBadge;
    }

    public final RetirementDashboardDataState copy(BigDecimal chartDisplayValue, RetirementInvestmentAndTrade investmentAndTrade, RetirementUninvestedViewModel uninvestedViewModel, String activeAccountNumber, List<Account> retirementAccounts, boolean accountSwitcherLoading, RetirementAccountSwitcher accountSwitcher, boolean shouldShowInboxBadge, boolean isCriticalBadge, RetirementMatchRate retirementMatchRate, boolean shouldShowRetirementOptionsAssetHomeTooltip, boolean retirementOptionsAssetHomeTooltipSeen, boolean isEmbedded) {
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        return new RetirementDashboardDataState(chartDisplayValue, investmentAndTrade, uninvestedViewModel, activeAccountNumber, retirementAccounts, accountSwitcherLoading, accountSwitcher, shouldShowInboxBadge, isCriticalBadge, retirementMatchRate, shouldShowRetirementOptionsAssetHomeTooltip, retirementOptionsAssetHomeTooltipSeen, isEmbedded);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementDashboardDataState)) {
            return false;
        }
        RetirementDashboardDataState retirementDashboardDataState = (RetirementDashboardDataState) other;
        return Intrinsics.areEqual(this.chartDisplayValue, retirementDashboardDataState.chartDisplayValue) && Intrinsics.areEqual(this.investmentAndTrade, retirementDashboardDataState.investmentAndTrade) && Intrinsics.areEqual(this.uninvestedViewModel, retirementDashboardDataState.uninvestedViewModel) && Intrinsics.areEqual(this.activeAccountNumber, retirementDashboardDataState.activeAccountNumber) && Intrinsics.areEqual(this.retirementAccounts, retirementDashboardDataState.retirementAccounts) && this.accountSwitcherLoading == retirementDashboardDataState.accountSwitcherLoading && Intrinsics.areEqual(this.accountSwitcher, retirementDashboardDataState.accountSwitcher) && this.shouldShowInboxBadge == retirementDashboardDataState.shouldShowInboxBadge && this.isCriticalBadge == retirementDashboardDataState.isCriticalBadge && Intrinsics.areEqual(this.retirementMatchRate, retirementDashboardDataState.retirementMatchRate) && this.shouldShowRetirementOptionsAssetHomeTooltip == retirementDashboardDataState.shouldShowRetirementOptionsAssetHomeTooltip && this.retirementOptionsAssetHomeTooltipSeen == retirementDashboardDataState.retirementOptionsAssetHomeTooltipSeen && this.isEmbedded == retirementDashboardDataState.isEmbedded;
    }

    public int hashCode() {
        BigDecimal bigDecimal = this.chartDisplayValue;
        int iHashCode = (bigDecimal == null ? 0 : bigDecimal.hashCode()) * 31;
        RetirementInvestmentAndTrade retirementInvestmentAndTrade = this.investmentAndTrade;
        int iHashCode2 = (iHashCode + (retirementInvestmentAndTrade == null ? 0 : retirementInvestmentAndTrade.hashCode())) * 31;
        RetirementUninvestedViewModel retirementUninvestedViewModel = this.uninvestedViewModel;
        int iHashCode3 = (iHashCode2 + (retirementUninvestedViewModel == null ? 0 : retirementUninvestedViewModel.hashCode())) * 31;
        String str = this.activeAccountNumber;
        int iHashCode4 = (((((iHashCode3 + (str == null ? 0 : str.hashCode())) * 31) + this.retirementAccounts.hashCode()) * 31) + Boolean.hashCode(this.accountSwitcherLoading)) * 31;
        RetirementAccountSwitcher retirementAccountSwitcher = this.accountSwitcher;
        int iHashCode5 = (((((iHashCode4 + (retirementAccountSwitcher == null ? 0 : retirementAccountSwitcher.hashCode())) * 31) + Boolean.hashCode(this.shouldShowInboxBadge)) * 31) + Boolean.hashCode(this.isCriticalBadge)) * 31;
        RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
        return ((((((iHashCode5 + (retirementMatchRate != null ? retirementMatchRate.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShowRetirementOptionsAssetHomeTooltip)) * 31) + Boolean.hashCode(this.retirementOptionsAssetHomeTooltipSeen)) * 31) + Boolean.hashCode(this.isEmbedded);
    }

    public String toString() {
        return "RetirementDashboardDataState(chartDisplayValue=" + this.chartDisplayValue + ", investmentAndTrade=" + this.investmentAndTrade + ", uninvestedViewModel=" + this.uninvestedViewModel + ", activeAccountNumber=" + this.activeAccountNumber + ", retirementAccounts=" + this.retirementAccounts + ", accountSwitcherLoading=" + this.accountSwitcherLoading + ", accountSwitcher=" + this.accountSwitcher + ", shouldShowInboxBadge=" + this.shouldShowInboxBadge + ", isCriticalBadge=" + this.isCriticalBadge + ", retirementMatchRate=" + this.retirementMatchRate + ", shouldShowRetirementOptionsAssetHomeTooltip=" + this.shouldShowRetirementOptionsAssetHomeTooltip + ", retirementOptionsAssetHomeTooltipSeen=" + this.retirementOptionsAssetHomeTooltipSeen + ", isEmbedded=" + this.isEmbedded + ")";
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public RetirementDashboardDataState(BigDecimal bigDecimal, RetirementInvestmentAndTrade retirementInvestmentAndTrade, RetirementUninvestedViewModel retirementUninvestedViewModel, String str, List<Account> retirementAccounts, boolean z, RetirementAccountSwitcher retirementAccountSwitcher, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, boolean z4, boolean z5, boolean z6) {
        boolean z7;
        Intrinsics.checkNotNullParameter(retirementAccounts, "retirementAccounts");
        this.chartDisplayValue = bigDecimal;
        this.investmentAndTrade = retirementInvestmentAndTrade;
        this.uninvestedViewModel = retirementUninvestedViewModel;
        this.activeAccountNumber = str;
        this.retirementAccounts = retirementAccounts;
        this.accountSwitcherLoading = z;
        this.accountSwitcher = retirementAccountSwitcher;
        this.shouldShowInboxBadge = z2;
        this.isCriticalBadge = z3;
        this.retirementMatchRate = retirementMatchRate;
        this.shouldShowRetirementOptionsAssetHomeTooltip = z4;
        this.retirementOptionsAssetHomeTooltipSeen = z5;
        this.isEmbedded = z6;
        if (str == null) {
            z7 = false;
        } else {
            Account activeAccount = getActiveAccount();
            if ((activeAccount != null ? activeAccount.getManagementType() : null) == ManagementType.MANAGED) {
                z7 = true;
            }
        }
        this.isActiveAccountManaged = z7;
        this.settingsRowKey = z6 ? new SettingsPage("retirement", HomeDashboardType.Nux.INSTANCE.getAccountNumber(), RetirementLastKnownEntryPointManager.INSTANCE.getLastKnownEntryPoint()) : null;
    }

    public final BigDecimal getChartDisplayValue() {
        return this.chartDisplayValue;
    }

    public final RetirementInvestmentAndTrade getInvestmentAndTrade() {
        return this.investmentAndTrade;
    }

    public final RetirementUninvestedViewModel getUninvestedViewModel() {
        return this.uninvestedViewModel;
    }

    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public /* synthetic */ RetirementDashboardDataState(BigDecimal bigDecimal, RetirementInvestmentAndTrade retirementInvestmentAndTrade, RetirementUninvestedViewModel retirementUninvestedViewModel, String str, List list, boolean z, RetirementAccountSwitcher retirementAccountSwitcher, boolean z2, boolean z3, RetirementMatchRate retirementMatchRate, boolean z4, boolean z5, boolean z6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : bigDecimal, (i & 2) != 0 ? null : retirementInvestmentAndTrade, (i & 4) != 0 ? null : retirementUninvestedViewModel, (i & 8) != 0 ? null : str, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? false : z, (i & 64) != 0 ? null : retirementAccountSwitcher, (i & 128) != 0 ? false : z2, (i & 256) != 0 ? false : z3, (i & 512) == 0 ? retirementMatchRate : null, (i & 1024) != 0 ? false : z4, (i & 2048) != 0 ? false : z5, (i & 4096) != 0 ? false : z6);
    }

    public final List<Account> getRetirementAccounts() {
        return this.retirementAccounts;
    }

    public final boolean getAccountSwitcherLoading() {
        return this.accountSwitcherLoading;
    }

    public final RetirementAccountSwitcher getAccountSwitcher() {
        return this.accountSwitcher;
    }

    public final boolean getShouldShowInboxBadge() {
        return this.shouldShowInboxBadge;
    }

    public final boolean isCriticalBadge() {
        return this.isCriticalBadge;
    }

    public final RetirementMatchRate getRetirementMatchRate() {
        return this.retirementMatchRate;
    }

    public final boolean getShouldShowRetirementOptionsAssetHomeTooltip() {
        return this.shouldShowRetirementOptionsAssetHomeTooltip;
    }

    public final boolean getRetirementOptionsAssetHomeTooltipSeen() {
        return this.retirementOptionsAssetHomeTooltipSeen;
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public final String getLoggingIdentifier() {
        String serverValue;
        BrokerageAccountType activeBrokerageAccountType = getActiveBrokerageAccountType();
        return (activeBrokerageAccountType == null || (serverValue = activeBrokerageAccountType.getServerValue()) == null) ? "" : serverValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Account getActiveAccount() {
        Object next;
        Iterator<T> it = this.retirementAccounts.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (Intrinsics.areEqual(((Account) next).getAccountNumber(), this.activeAccountNumber)) {
                break;
            }
        }
        return (Account) next;
    }

    public final BrokerageAccountType getActiveBrokerageAccountType() {
        Account activeAccount = getActiveAccount();
        if (activeAccount != null) {
            return activeAccount.getBrokerageAccountType();
        }
        return null;
    }

    public final RetirementDashboardHeader3 getHeaderState() {
        if (this.accountSwitcherLoading) {
            return RetirementDashboardHeader3.Loading.INSTANCE;
        }
        RetirementDashboardHeader3.Companion companion = RetirementDashboardHeader3.INSTANCE;
        String str = this.activeAccountNumber;
        List<Account> list = this.retirementAccounts;
        RetirementAccountSwitcher retirementAccountSwitcher = this.accountSwitcher;
        Account activeAccount = getActiveAccount();
        MatchRateBreakdown activeBreakdownForAch = null;
        ManagementType managementType = activeAccount != null ? activeAccount.getManagementType() : null;
        int i = managementType == null ? -1 : WhenMappings.$EnumSwitchMapping$0[managementType.ordinal()];
        if (i != -1) {
            if (i == 1) {
                RetirementMatchRate retirementMatchRate = this.retirementMatchRate;
                if (retirementMatchRate != null) {
                    activeBreakdownForAch = retirementMatchRate.getActiveBreakdownForAch();
                }
            } else if (i != 2 && i != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return companion.from(str, list, retirementAccountSwitcher, activeBreakdownForAch);
    }

    public final RetirementDashboardChartFooter getChartFooter() {
        BrokerageAccountType activeBrokerageAccountType = getActiveBrokerageAccountType();
        if (this.isActiveAccountManaged) {
            return null;
        }
        RetirementUninvestedViewModel retirementUninvestedViewModel = this.uninvestedViewModel;
        if (retirementUninvestedViewModel != null && Intrinsics.areEqual(retirementUninvestedViewModel.getAccountNumber(), this.activeAccountNumber) && !this.uninvestedViewModel.getShowBuyingPower() && activeBrokerageAccountType != null && this.uninvestedViewModel.getMobileContent() != null) {
            String accountNumber = this.uninvestedViewModel.getAccountNumber();
            RetirementUninvestedViewModel.MobileContent mobileContent = this.uninvestedViewModel.getMobileContent();
            if (mobileContent != null) {
                return new RetirementDashboardChartFooter.Uninvested(accountNumber, new UninvestedSectionState(mobileContent, this.uninvestedViewModel.getAccountState(), this.uninvestedViewModel.getRecsState(), activeBrokerageAccountType));
            }
            throw new IllegalArgumentException("Required value was null.");
        }
        RetirementInvestmentAndTrade retirementInvestmentAndTrade = this.investmentAndTrade;
        if (retirementInvestmentAndTrade != null && Intrinsics.areEqual(retirementInvestmentAndTrade.getAccountNumber(), this.activeAccountNumber) && activeBrokerageAccountType != null) {
            return new RetirementDashboardChartFooter.InvestmentAndTrade(this.investmentAndTrade.getAccountNumber(), activeBrokerageAccountType, extensions2.toPersistentList(this.investmentAndTrade.getComponents()));
        }
        return RetirementDashboardChartFooter.Loading.INSTANCE;
    }

    public final ContributeButtonState getFooterButtonState() {
        String str;
        BrokerageAccountType activeBrokerageAccountType;
        if (this.isActiveAccountManaged || !(getChartFooter() instanceof RetirementDashboardChartFooter.InvestmentAndTrade) || (str = this.activeAccountNumber) == null || (activeBrokerageAccountType = getActiveBrokerageAccountType()) == null) {
            return null;
        }
        return new ContributeButtonState(str, activeBrokerageAccountType);
    }

    public final ImmutableList<DashboardComponent.Positions> getPositionsSections() {
        Account activeAccount = getActiveAccount();
        if (activeAccount != null) {
            if (activeAccount.isManaged()) {
                activeAccount = null;
            }
            if (activeAccount != null) {
                List<PositionInstrumentType> list = SUPPORTED_INSTRUMENT_TYPES;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new DashboardComponent.Positions(activeAccount.getAccountNumber(), (PositionInstrumentType) it.next(), PositionsLocation.RETIREMENT_TAB));
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                if (persistentList != null) {
                    return persistentList;
                }
            }
        }
        return extensions2.persistentListOf();
    }

    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }

    /* compiled from: RetirementDashboardDataState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0016R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardDataState;", "Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;", "<init>", "()V", "SUPPORTED_INSTRUMENT_TYPES", "", "Lcom/robinhood/android/models/portfolio/api/PositionInstrumentType;", "getSUPPORTED_INSTRUMENT_TYPES", "()Ljava/util/List;", "reduce", "dataState", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.retirement.ui.funded.RetirementDashboardDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<RetirementDashboardDataState, RetirementDashboardViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final List<PositionInstrumentType> getSUPPORTED_INSTRUMENT_TYPES() {
            return RetirementDashboardDataState.SUPPORTED_INSTRUMENT_TYPES;
        }

        @Override // com.robinhood.android.udf.StateProvider
        public RetirementDashboardViewState reduce(RetirementDashboardDataState dataState) {
            String serverValue;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            BrokerageAccountType activeBrokerageAccountType = dataState.getActiveBrokerageAccountType();
            if (activeBrokerageAccountType == null || (serverValue = activeBrokerageAccountType.getServerValue()) == null) {
                serverValue = "";
            }
            String str = serverValue;
            String activeAccountNumber = dataState.getActiveAccountNumber();
            BrokerageAccountType activeBrokerageAccountType2 = dataState.getActiveBrokerageAccountType();
            RetirementDashboardHeader3 headerState = dataState.getHeaderState();
            RetirementDashboardChartFooter chartFooter = dataState.getChartFooter();
            ContributeButtonState footerButtonState = dataState.getFooterButtonState();
            Account activeAccount = dataState.getActiveAccount();
            return new RetirementDashboardViewState(str, activeAccountNumber, activeBrokerageAccountType2, activeAccount != null ? activeAccount.getManagementType() : null, headerState, chartFooter, dataState.getPositionsSections(), dataState.getShouldShowRetirementOptionsAssetHomeTooltip(), footerButtonState, dataState.isEmbedded(), dataState.getSettingsRowKey());
        }
    }
}
