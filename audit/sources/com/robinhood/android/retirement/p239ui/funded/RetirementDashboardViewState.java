package com.robinhood.android.retirement.p239ui.funded;

import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.api.ManagementType;
import com.robinhood.models.home.component.DashboardComponent;
import com.robinhood.shared.settings.contracts.SettingsPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RetirementDashboardViewState.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b$\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\bHÆ\u0003J\t\u00100\u001a\u00020\nHÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003J\t\u00103\u001a\u00020\u0011HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u00105\u001a\u00020\u0011HÆ\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0089\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001J\u0013\u00108\u001a\u00020\u00112\b\u00109\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010:\u001a\u00020;HÖ\u0001J\t\u0010<\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0014\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010'R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+¨\u0006="}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/funded/RetirementDashboardViewState;", "", "loggingIdentifier", "", "activeAccountNumber", "activeBrokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "activeManagementType", "Lcom/robinhood/models/api/ManagementType;", "headerState", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "chartFooter", "Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "positionsSections", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/home/component/DashboardComponent$Positions;", "shouldShowRetirementOptionsAssetHomeTooltip", "", "footerButtonState", "Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "isEmbedded", "settingsRowKey", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/models/api/ManagementType;Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;Lcom/robinhood/android/retirement/ui/funded/ChartFooter;Lkotlinx/collections/immutable/ImmutableList;ZLcom/robinhood/android/retirement/ui/funded/ContributeButtonState;ZLcom/robinhood/shared/settings/contracts/SettingsPage;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "getActiveAccountNumber", "getActiveBrokerageAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getActiveManagementType", "()Lcom/robinhood/models/api/ManagementType;", "getHeaderState", "()Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "getChartFooter", "()Lcom/robinhood/android/retirement/ui/funded/ChartFooter;", "getPositionsSections", "()Lkotlinx/collections/immutable/ImmutableList;", "getShouldShowRetirementOptionsAssetHomeTooltip", "()Z", "getFooterButtonState", "()Lcom/robinhood/android/retirement/ui/funded/ContributeButtonState;", "getSettingsRowKey", "()Lcom/robinhood/shared/settings/contracts/SettingsPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementDashboardViewState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final BrokerageAccountType activeBrokerageAccountType;
    private final ManagementType activeManagementType;
    private final RetirementDashboardChartFooter chartFooter;
    private final ContributeButtonState footerButtonState;
    private final RetirementDashboardHeader3 headerState;
    private final boolean isEmbedded;
    private final String loggingIdentifier;
    private final ImmutableList<DashboardComponent.Positions> positionsSections;
    private final SettingsPage settingsRowKey;
    private final boolean shouldShowRetirementOptionsAssetHomeTooltip;

    public static /* synthetic */ RetirementDashboardViewState copy$default(RetirementDashboardViewState retirementDashboardViewState, String str, String str2, BrokerageAccountType brokerageAccountType, ManagementType managementType, RetirementDashboardHeader3 retirementDashboardHeader3, RetirementDashboardChartFooter retirementDashboardChartFooter, ImmutableList immutableList, boolean z, ContributeButtonState contributeButtonState, boolean z2, SettingsPage settingsPage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementDashboardViewState.loggingIdentifier;
        }
        if ((i & 2) != 0) {
            str2 = retirementDashboardViewState.activeAccountNumber;
        }
        if ((i & 4) != 0) {
            brokerageAccountType = retirementDashboardViewState.activeBrokerageAccountType;
        }
        if ((i & 8) != 0) {
            managementType = retirementDashboardViewState.activeManagementType;
        }
        if ((i & 16) != 0) {
            retirementDashboardHeader3 = retirementDashboardViewState.headerState;
        }
        if ((i & 32) != 0) {
            retirementDashboardChartFooter = retirementDashboardViewState.chartFooter;
        }
        if ((i & 64) != 0) {
            immutableList = retirementDashboardViewState.positionsSections;
        }
        if ((i & 128) != 0) {
            z = retirementDashboardViewState.shouldShowRetirementOptionsAssetHomeTooltip;
        }
        if ((i & 256) != 0) {
            contributeButtonState = retirementDashboardViewState.footerButtonState;
        }
        if ((i & 512) != 0) {
            z2 = retirementDashboardViewState.isEmbedded;
        }
        if ((i & 1024) != 0) {
            settingsPage = retirementDashboardViewState.settingsRowKey;
        }
        boolean z3 = z2;
        SettingsPage settingsPage2 = settingsPage;
        boolean z4 = z;
        ContributeButtonState contributeButtonState2 = contributeButtonState;
        RetirementDashboardChartFooter retirementDashboardChartFooter2 = retirementDashboardChartFooter;
        ImmutableList immutableList2 = immutableList;
        RetirementDashboardHeader3 retirementDashboardHeader32 = retirementDashboardHeader3;
        BrokerageAccountType brokerageAccountType2 = brokerageAccountType;
        return retirementDashboardViewState.copy(str, str2, brokerageAccountType2, managementType, retirementDashboardHeader32, retirementDashboardChartFooter2, immutableList2, z4, contributeButtonState2, z3, settingsPage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsEmbedded() {
        return this.isEmbedded;
    }

    /* renamed from: component11, reason: from getter */
    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final BrokerageAccountType getActiveBrokerageAccountType() {
        return this.activeBrokerageAccountType;
    }

    /* renamed from: component4, reason: from getter */
    public final ManagementType getActiveManagementType() {
        return this.activeManagementType;
    }

    /* renamed from: component5, reason: from getter */
    public final RetirementDashboardHeader3 getHeaderState() {
        return this.headerState;
    }

    /* renamed from: component6, reason: from getter */
    public final RetirementDashboardChartFooter getChartFooter() {
        return this.chartFooter;
    }

    public final ImmutableList<DashboardComponent.Positions> component7() {
        return this.positionsSections;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShouldShowRetirementOptionsAssetHomeTooltip() {
        return this.shouldShowRetirementOptionsAssetHomeTooltip;
    }

    /* renamed from: component9, reason: from getter */
    public final ContributeButtonState getFooterButtonState() {
        return this.footerButtonState;
    }

    public final RetirementDashboardViewState copy(String loggingIdentifier, String activeAccountNumber, BrokerageAccountType activeBrokerageAccountType, ManagementType activeManagementType, RetirementDashboardHeader3 headerState, RetirementDashboardChartFooter chartFooter, ImmutableList<DashboardComponent.Positions> positionsSections, boolean shouldShowRetirementOptionsAssetHomeTooltip, ContributeButtonState footerButtonState, boolean isEmbedded, SettingsPage settingsRowKey) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(positionsSections, "positionsSections");
        return new RetirementDashboardViewState(loggingIdentifier, activeAccountNumber, activeBrokerageAccountType, activeManagementType, headerState, chartFooter, positionsSections, shouldShowRetirementOptionsAssetHomeTooltip, footerButtonState, isEmbedded, settingsRowKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementDashboardViewState)) {
            return false;
        }
        RetirementDashboardViewState retirementDashboardViewState = (RetirementDashboardViewState) other;
        return Intrinsics.areEqual(this.loggingIdentifier, retirementDashboardViewState.loggingIdentifier) && Intrinsics.areEqual(this.activeAccountNumber, retirementDashboardViewState.activeAccountNumber) && this.activeBrokerageAccountType == retirementDashboardViewState.activeBrokerageAccountType && this.activeManagementType == retirementDashboardViewState.activeManagementType && Intrinsics.areEqual(this.headerState, retirementDashboardViewState.headerState) && Intrinsics.areEqual(this.chartFooter, retirementDashboardViewState.chartFooter) && Intrinsics.areEqual(this.positionsSections, retirementDashboardViewState.positionsSections) && this.shouldShowRetirementOptionsAssetHomeTooltip == retirementDashboardViewState.shouldShowRetirementOptionsAssetHomeTooltip && Intrinsics.areEqual(this.footerButtonState, retirementDashboardViewState.footerButtonState) && this.isEmbedded == retirementDashboardViewState.isEmbedded && Intrinsics.areEqual(this.settingsRowKey, retirementDashboardViewState.settingsRowKey);
    }

    public int hashCode() {
        int iHashCode = this.loggingIdentifier.hashCode() * 31;
        String str = this.activeAccountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        BrokerageAccountType brokerageAccountType = this.activeBrokerageAccountType;
        int iHashCode3 = (iHashCode2 + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31;
        ManagementType managementType = this.activeManagementType;
        int iHashCode4 = (((iHashCode3 + (managementType == null ? 0 : managementType.hashCode())) * 31) + this.headerState.hashCode()) * 31;
        RetirementDashboardChartFooter retirementDashboardChartFooter = this.chartFooter;
        int iHashCode5 = (((((iHashCode4 + (retirementDashboardChartFooter == null ? 0 : retirementDashboardChartFooter.hashCode())) * 31) + this.positionsSections.hashCode()) * 31) + Boolean.hashCode(this.shouldShowRetirementOptionsAssetHomeTooltip)) * 31;
        ContributeButtonState contributeButtonState = this.footerButtonState;
        int iHashCode6 = (((iHashCode5 + (contributeButtonState == null ? 0 : contributeButtonState.hashCode())) * 31) + Boolean.hashCode(this.isEmbedded)) * 31;
        SettingsPage settingsPage = this.settingsRowKey;
        return iHashCode6 + (settingsPage != null ? settingsPage.hashCode() : 0);
    }

    public String toString() {
        return "RetirementDashboardViewState(loggingIdentifier=" + this.loggingIdentifier + ", activeAccountNumber=" + this.activeAccountNumber + ", activeBrokerageAccountType=" + this.activeBrokerageAccountType + ", activeManagementType=" + this.activeManagementType + ", headerState=" + this.headerState + ", chartFooter=" + this.chartFooter + ", positionsSections=" + this.positionsSections + ", shouldShowRetirementOptionsAssetHomeTooltip=" + this.shouldShowRetirementOptionsAssetHomeTooltip + ", footerButtonState=" + this.footerButtonState + ", isEmbedded=" + this.isEmbedded + ", settingsRowKey=" + this.settingsRowKey + ")";
    }

    public RetirementDashboardViewState(String loggingIdentifier, String str, BrokerageAccountType brokerageAccountType, ManagementType managementType, RetirementDashboardHeader3 headerState, RetirementDashboardChartFooter retirementDashboardChartFooter, ImmutableList<DashboardComponent.Positions> positionsSections, boolean z, ContributeButtonState contributeButtonState, boolean z2, SettingsPage settingsPage) {
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(positionsSections, "positionsSections");
        this.loggingIdentifier = loggingIdentifier;
        this.activeAccountNumber = str;
        this.activeBrokerageAccountType = brokerageAccountType;
        this.activeManagementType = managementType;
        this.headerState = headerState;
        this.chartFooter = retirementDashboardChartFooter;
        this.positionsSections = positionsSections;
        this.shouldShowRetirementOptionsAssetHomeTooltip = z;
        this.footerButtonState = contributeButtonState;
        this.isEmbedded = z2;
        this.settingsRowKey = settingsPage;
    }

    public /* synthetic */ RetirementDashboardViewState(String str, String str2, BrokerageAccountType brokerageAccountType, ManagementType managementType, RetirementDashboardHeader3 retirementDashboardHeader3, RetirementDashboardChartFooter retirementDashboardChartFooter, ImmutableList immutableList, boolean z, ContributeButtonState contributeButtonState, boolean z2, SettingsPage settingsPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, brokerageAccountType, managementType, retirementDashboardHeader3, retirementDashboardChartFooter, immutableList, z, contributeButtonState, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? null : settingsPage);
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final BrokerageAccountType getActiveBrokerageAccountType() {
        return this.activeBrokerageAccountType;
    }

    public final ManagementType getActiveManagementType() {
        return this.activeManagementType;
    }

    public final RetirementDashboardHeader3 getHeaderState() {
        return this.headerState;
    }

    public final RetirementDashboardChartFooter getChartFooter() {
        return this.chartFooter;
    }

    public final ImmutableList<DashboardComponent.Positions> getPositionsSections() {
        return this.positionsSections;
    }

    public final boolean getShouldShowRetirementOptionsAssetHomeTooltip() {
        return this.shouldShowRetirementOptionsAssetHomeTooltip;
    }

    public final ContributeButtonState getFooterButtonState() {
        return this.footerButtonState;
    }

    public final boolean isEmbedded() {
        return this.isEmbedded;
    }

    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }
}
