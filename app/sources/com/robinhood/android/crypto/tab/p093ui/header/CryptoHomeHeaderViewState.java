package com.robinhood.android.crypto.tab.p093ui.header;

import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.compose.bento.theme.BentoTheme4;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: CryptoHomeHeaderViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderViewState;", "", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "marketValueType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "rewardButton", "Lrh_server_driven_ui/v1/ButtonDto;", "dashboardPillData", "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "<init>", "(Lcom/robinhood/compose/bento/theme/Direction;Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;Lrh_server_driven_ui/v1/ButtonDto;Lcom/robinhood/android/dashboardpill/DashboardPillData;)V", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "getMarketValueType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getRewardButton", "()Lrh_server_driven_ui/v1/ButtonDto;", "getDashboardPillData", "()Lcom/robinhood/android/dashboardpill/DashboardPillData;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeHeaderViewState {
    public static final int $stable = 8;
    private final DashboardPillData dashboardPillData;
    private final BentoTheme4 direction;
    private final AccountMarketValuesType marketValueType;
    private final ButtonDto rewardButton;

    public static /* synthetic */ CryptoHomeHeaderViewState copy$default(CryptoHomeHeaderViewState cryptoHomeHeaderViewState, BentoTheme4 bentoTheme4, AccountMarketValuesType accountMarketValuesType, ButtonDto buttonDto, DashboardPillData dashboardPillData, int i, Object obj) {
        if ((i & 1) != 0) {
            bentoTheme4 = cryptoHomeHeaderViewState.direction;
        }
        if ((i & 2) != 0) {
            accountMarketValuesType = cryptoHomeHeaderViewState.marketValueType;
        }
        if ((i & 4) != 0) {
            buttonDto = cryptoHomeHeaderViewState.rewardButton;
        }
        if ((i & 8) != 0) {
            dashboardPillData = cryptoHomeHeaderViewState.dashboardPillData;
        }
        return cryptoHomeHeaderViewState.copy(bentoTheme4, accountMarketValuesType, buttonDto, dashboardPillData);
    }

    /* renamed from: component1, reason: from getter */
    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    /* renamed from: component2, reason: from getter */
    public final AccountMarketValuesType getMarketValueType() {
        return this.marketValueType;
    }

    /* renamed from: component3, reason: from getter */
    public final ButtonDto getRewardButton() {
        return this.rewardButton;
    }

    /* renamed from: component4, reason: from getter */
    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }

    public final CryptoHomeHeaderViewState copy(BentoTheme4 direction, AccountMarketValuesType marketValueType, ButtonDto rewardButton, DashboardPillData dashboardPillData) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        return new CryptoHomeHeaderViewState(direction, marketValueType, rewardButton, dashboardPillData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeHeaderViewState)) {
            return false;
        }
        CryptoHomeHeaderViewState cryptoHomeHeaderViewState = (CryptoHomeHeaderViewState) other;
        return this.direction == cryptoHomeHeaderViewState.direction && this.marketValueType == cryptoHomeHeaderViewState.marketValueType && Intrinsics.areEqual(this.rewardButton, cryptoHomeHeaderViewState.rewardButton) && Intrinsics.areEqual(this.dashboardPillData, cryptoHomeHeaderViewState.dashboardPillData);
    }

    public int hashCode() {
        int iHashCode = this.direction.hashCode() * 31;
        AccountMarketValuesType accountMarketValuesType = this.marketValueType;
        int iHashCode2 = (iHashCode + (accountMarketValuesType == null ? 0 : accountMarketValuesType.hashCode())) * 31;
        ButtonDto buttonDto = this.rewardButton;
        int iHashCode3 = (iHashCode2 + (buttonDto == null ? 0 : buttonDto.hashCode())) * 31;
        DashboardPillData dashboardPillData = this.dashboardPillData;
        return iHashCode3 + (dashboardPillData != null ? dashboardPillData.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHomeHeaderViewState(direction=" + this.direction + ", marketValueType=" + this.marketValueType + ", rewardButton=" + this.rewardButton + ", dashboardPillData=" + this.dashboardPillData + ")";
    }

    public CryptoHomeHeaderViewState(BentoTheme4 direction, AccountMarketValuesType accountMarketValuesType, ButtonDto buttonDto, DashboardPillData dashboardPillData) {
        Intrinsics.checkNotNullParameter(direction, "direction");
        this.direction = direction;
        this.marketValueType = accountMarketValuesType;
        this.rewardButton = buttonDto;
        this.dashboardPillData = dashboardPillData;
    }

    public final BentoTheme4 getDirection() {
        return this.direction;
    }

    public final AccountMarketValuesType getMarketValueType() {
        return this.marketValueType;
    }

    public final ButtonDto getRewardButton() {
        return this.rewardButton;
    }

    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }
}
