package com.robinhood.android.retirement.p239ui.unfunded;

import com.robinhood.android.models.retirement.p194db.RetirementUnfundedViewModel;
import com.robinhood.android.retirement.dashboard.header.RetirementDashboardHeader3;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.shared.settings.contracts.SettingsPage;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RetirementDashboardUnfundedViewState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u000eHÆ\u0003JY\u0010%\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/unfunded/RetirementDashboardUnfundedViewState;", "", "activeAccountNumber", "", "activeAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", "headerState", "Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "activeContent", "Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel$MobileContent;", "loggingIdentifier", "infoBanner", "Lcom/robinhood/models/db/IacInfoBanner;", "settingsRowKey", "Lcom/robinhood/shared/settings/contracts/SettingsPage;", "<init>", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel$MobileContent;Ljava/lang/String;Lcom/robinhood/models/db/IacInfoBanner;Lcom/robinhood/shared/settings/contracts/SettingsPage;)V", "getActiveAccountNumber", "()Ljava/lang/String;", "getActiveAccountType", "()Lcom/robinhood/models/api/BrokerageAccountType;", "getHeaderState", "()Lcom/robinhood/android/retirement/dashboard/header/RetirementDashboardHeaderViewState;", "getActiveContent", "()Lcom/robinhood/android/models/retirement/db/RetirementUnfundedViewModel$MobileContent;", "getLoggingIdentifier", "getInfoBanner", "()Lcom/robinhood/models/db/IacInfoBanner;", "getSettingsRowKey", "()Lcom/robinhood/shared/settings/contracts/SettingsPage;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class RetirementDashboardUnfundedViewState {
    public static final int $stable = 8;
    private final String activeAccountNumber;
    private final BrokerageAccountType activeAccountType;
    private final RetirementUnfundedViewModel.MobileContent activeContent;
    private final RetirementDashboardHeader3 headerState;
    private final IacInfoBanner infoBanner;
    private final String loggingIdentifier;
    private final SettingsPage settingsRowKey;

    public static /* synthetic */ RetirementDashboardUnfundedViewState copy$default(RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState, String str, BrokerageAccountType brokerageAccountType, RetirementDashboardHeader3 retirementDashboardHeader3, RetirementUnfundedViewModel.MobileContent mobileContent, String str2, IacInfoBanner iacInfoBanner, SettingsPage settingsPage, int i, Object obj) {
        if ((i & 1) != 0) {
            str = retirementDashboardUnfundedViewState.activeAccountNumber;
        }
        if ((i & 2) != 0) {
            brokerageAccountType = retirementDashboardUnfundedViewState.activeAccountType;
        }
        if ((i & 4) != 0) {
            retirementDashboardHeader3 = retirementDashboardUnfundedViewState.headerState;
        }
        if ((i & 8) != 0) {
            mobileContent = retirementDashboardUnfundedViewState.activeContent;
        }
        if ((i & 16) != 0) {
            str2 = retirementDashboardUnfundedViewState.loggingIdentifier;
        }
        if ((i & 32) != 0) {
            iacInfoBanner = retirementDashboardUnfundedViewState.infoBanner;
        }
        if ((i & 64) != 0) {
            settingsPage = retirementDashboardUnfundedViewState.settingsRowKey;
        }
        IacInfoBanner iacInfoBanner2 = iacInfoBanner;
        SettingsPage settingsPage2 = settingsPage;
        String str3 = str2;
        RetirementDashboardHeader3 retirementDashboardHeader32 = retirementDashboardHeader3;
        return retirementDashboardUnfundedViewState.copy(str, brokerageAccountType, retirementDashboardHeader32, mobileContent, str3, iacInfoBanner2, settingsPage2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final BrokerageAccountType getActiveAccountType() {
        return this.activeAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final RetirementDashboardHeader3 getHeaderState() {
        return this.headerState;
    }

    /* renamed from: component4, reason: from getter */
    public final RetirementUnfundedViewModel.MobileContent getActiveContent() {
        return this.activeContent;
    }

    /* renamed from: component5, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    /* renamed from: component6, reason: from getter */
    public final IacInfoBanner getInfoBanner() {
        return this.infoBanner;
    }

    /* renamed from: component7, reason: from getter */
    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }

    public final RetirementDashboardUnfundedViewState copy(String activeAccountNumber, BrokerageAccountType activeAccountType, RetirementDashboardHeader3 headerState, RetirementUnfundedViewModel.MobileContent activeContent, String loggingIdentifier, IacInfoBanner infoBanner, SettingsPage settingsRowKey) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new RetirementDashboardUnfundedViewState(activeAccountNumber, activeAccountType, headerState, activeContent, loggingIdentifier, infoBanner, settingsRowKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RetirementDashboardUnfundedViewState)) {
            return false;
        }
        RetirementDashboardUnfundedViewState retirementDashboardUnfundedViewState = (RetirementDashboardUnfundedViewState) other;
        return Intrinsics.areEqual(this.activeAccountNumber, retirementDashboardUnfundedViewState.activeAccountNumber) && this.activeAccountType == retirementDashboardUnfundedViewState.activeAccountType && Intrinsics.areEqual(this.headerState, retirementDashboardUnfundedViewState.headerState) && Intrinsics.areEqual(this.activeContent, retirementDashboardUnfundedViewState.activeContent) && Intrinsics.areEqual(this.loggingIdentifier, retirementDashboardUnfundedViewState.loggingIdentifier) && Intrinsics.areEqual(this.infoBanner, retirementDashboardUnfundedViewState.infoBanner) && Intrinsics.areEqual(this.settingsRowKey, retirementDashboardUnfundedViewState.settingsRowKey);
    }

    public int hashCode() {
        String str = this.activeAccountNumber;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        BrokerageAccountType brokerageAccountType = this.activeAccountType;
        int iHashCode2 = (((iHashCode + (brokerageAccountType == null ? 0 : brokerageAccountType.hashCode())) * 31) + this.headerState.hashCode()) * 31;
        RetirementUnfundedViewModel.MobileContent mobileContent = this.activeContent;
        int iHashCode3 = (((iHashCode2 + (mobileContent == null ? 0 : mobileContent.hashCode())) * 31) + this.loggingIdentifier.hashCode()) * 31;
        IacInfoBanner iacInfoBanner = this.infoBanner;
        int iHashCode4 = (iHashCode3 + (iacInfoBanner == null ? 0 : iacInfoBanner.hashCode())) * 31;
        SettingsPage settingsPage = this.settingsRowKey;
        return iHashCode4 + (settingsPage != null ? settingsPage.hashCode() : 0);
    }

    public String toString() {
        return "RetirementDashboardUnfundedViewState(activeAccountNumber=" + this.activeAccountNumber + ", activeAccountType=" + this.activeAccountType + ", headerState=" + this.headerState + ", activeContent=" + this.activeContent + ", loggingIdentifier=" + this.loggingIdentifier + ", infoBanner=" + this.infoBanner + ", settingsRowKey=" + this.settingsRowKey + ")";
    }

    public RetirementDashboardUnfundedViewState(String str, BrokerageAccountType brokerageAccountType, RetirementDashboardHeader3 headerState, RetirementUnfundedViewModel.MobileContent mobileContent, String loggingIdentifier, IacInfoBanner iacInfoBanner, SettingsPage settingsPage) {
        Intrinsics.checkNotNullParameter(headerState, "headerState");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.activeAccountNumber = str;
        this.activeAccountType = brokerageAccountType;
        this.headerState = headerState;
        this.activeContent = mobileContent;
        this.loggingIdentifier = loggingIdentifier;
        this.infoBanner = iacInfoBanner;
        this.settingsRowKey = settingsPage;
    }

    public /* synthetic */ RetirementDashboardUnfundedViewState(String str, BrokerageAccountType brokerageAccountType, RetirementDashboardHeader3 retirementDashboardHeader3, RetirementUnfundedViewModel.MobileContent mobileContent, String str2, IacInfoBanner iacInfoBanner, SettingsPage settingsPage, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, brokerageAccountType, retirementDashboardHeader3, mobileContent, str2, iacInfoBanner, (i & 64) != 0 ? null : settingsPage);
    }

    public final String getActiveAccountNumber() {
        return this.activeAccountNumber;
    }

    public final BrokerageAccountType getActiveAccountType() {
        return this.activeAccountType;
    }

    public final RetirementDashboardHeader3 getHeaderState() {
        return this.headerState;
    }

    public final RetirementUnfundedViewModel.MobileContent getActiveContent() {
        return this.activeContent;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final IacInfoBanner getInfoBanner() {
        return this.infoBanner;
    }

    public final SettingsPage getSettingsRowKey() {
        return this.settingsRowKey;
    }
}
