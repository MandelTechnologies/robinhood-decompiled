package com.robinhood.android.crypto.tab.p093ui.header;

import android.content.res.Resources;
import com.robinhood.android.dashboardpill.DashboardPillData;
import com.robinhood.android.models.portfolio.api.AccountMarketValuesType;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.models.crypto.p314db.CryptoAccount;
import com.robinhood.models.serverdriven.experimental.api.Direction;
import contracts.crypto.rewards.proto.p430v1.GetHomeRewardsButtonResponseDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.ButtonDto;

/* compiled from: CryptoHomeHeaderDataState.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010%\u001a\u00020\u0003HÂ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0002\b'J\u0010\u0010(\u001a\u0004\u0018\u00010\u0007HÀ\u0003¢\u0006\u0002\b)J\t\u0010*\u001a\u00020\tHÂ\u0003J\u000e\u0010+\u001a\u00020\tHÀ\u0003¢\u0006\u0002\b,J\u000b\u0010-\u001a\u0004\u0018\u00010\fHÂ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000eHÆ\u0003JW\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u00100\u001a\u00020\t2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u000205HÖ\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\tX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/header/CryptoHomeHeaderDataState;", "", "resources", "Landroid/content/res/Resources;", "cryptoAccount", "Lcom/robinhood/models/crypto/db/CryptoAccount;", "pageDirection", "Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "isRhcApp", "", "isCryptoPortfolioSduiChartEnabled", "rewardButtonDto", "Lcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;", "dashboardPillData", "Lcom/robinhood/android/dashboardpill/DashboardPillData;", "<init>", "(Landroid/content/res/Resources;Lcom/robinhood/models/crypto/db/CryptoAccount;Lcom/robinhood/models/serverdriven/experimental/api/Direction;ZZLcontracts/crypto/rewards/proto/v1/GetHomeRewardsButtonResponseDto;Lcom/robinhood/android/dashboardpill/DashboardPillData;)V", "getCryptoAccount$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/crypto/db/CryptoAccount;", "getPageDirection$feature_crypto_tab_externalDebug", "()Lcom/robinhood/models/serverdriven/experimental/api/Direction;", "isCryptoPortfolioSduiChartEnabled$feature_crypto_tab_externalDebug", "()Z", "getDashboardPillData", "()Lcom/robinhood/android/dashboardpill/DashboardPillData;", "direction", "Lcom/robinhood/compose/bento/theme/Direction;", "getDirection", "()Lcom/robinhood/compose/bento/theme/Direction;", "rewardButton", "Lrh_server_driven_ui/v1/ButtonDto;", "getRewardButton", "()Lrh_server_driven_ui/v1/ButtonDto;", "marketValueType", "Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "getMarketValueType", "()Lcom/robinhood/android/models/portfolio/api/AccountMarketValuesType;", "component1", "component2", "component2$feature_crypto_tab_externalDebug", "component3", "component3$feature_crypto_tab_externalDebug", "component4", "component5", "component5$feature_crypto_tab_externalDebug", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeHeaderDataState {
    public static final int $stable = 8;
    private final CryptoAccount cryptoAccount;
    private final DashboardPillData dashboardPillData;
    private final boolean isCryptoPortfolioSduiChartEnabled;
    private final boolean isRhcApp;
    private final Direction pageDirection;
    private final Resources resources;
    private final GetHomeRewardsButtonResponseDto rewardButtonDto;

    /* compiled from: CryptoHomeHeaderDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Direction.values().length];
            try {
                iArr[Direction.DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Direction.f5855UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: component1, reason: from getter */
    private final Resources getResources() {
        return this.resources;
    }

    /* renamed from: component4, reason: from getter */
    private final boolean getIsRhcApp() {
        return this.isRhcApp;
    }

    /* renamed from: component6, reason: from getter */
    private final GetHomeRewardsButtonResponseDto getRewardButtonDto() {
        return this.rewardButtonDto;
    }

    public static /* synthetic */ CryptoHomeHeaderDataState copy$default(CryptoHomeHeaderDataState cryptoHomeHeaderDataState, Resources resources, CryptoAccount cryptoAccount, Direction direction, boolean z, boolean z2, GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, DashboardPillData dashboardPillData, int i, Object obj) {
        if ((i & 1) != 0) {
            resources = cryptoHomeHeaderDataState.resources;
        }
        if ((i & 2) != 0) {
            cryptoAccount = cryptoHomeHeaderDataState.cryptoAccount;
        }
        if ((i & 4) != 0) {
            direction = cryptoHomeHeaderDataState.pageDirection;
        }
        if ((i & 8) != 0) {
            z = cryptoHomeHeaderDataState.isRhcApp;
        }
        if ((i & 16) != 0) {
            z2 = cryptoHomeHeaderDataState.isCryptoPortfolioSduiChartEnabled;
        }
        if ((i & 32) != 0) {
            getHomeRewardsButtonResponseDto = cryptoHomeHeaderDataState.rewardButtonDto;
        }
        if ((i & 64) != 0) {
            dashboardPillData = cryptoHomeHeaderDataState.dashboardPillData;
        }
        GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto2 = getHomeRewardsButtonResponseDto;
        DashboardPillData dashboardPillData2 = dashboardPillData;
        boolean z3 = z2;
        Direction direction2 = direction;
        return cryptoHomeHeaderDataState.copy(resources, cryptoAccount, direction2, z, z3, getHomeRewardsButtonResponseDto2, dashboardPillData2);
    }

    /* renamed from: component2$feature_crypto_tab_externalDebug, reason: from getter */
    public final CryptoAccount getCryptoAccount() {
        return this.cryptoAccount;
    }

    /* renamed from: component3$feature_crypto_tab_externalDebug, reason: from getter */
    public final Direction getPageDirection() {
        return this.pageDirection;
    }

    /* renamed from: component5$feature_crypto_tab_externalDebug, reason: from getter */
    public final boolean getIsCryptoPortfolioSduiChartEnabled() {
        return this.isCryptoPortfolioSduiChartEnabled;
    }

    /* renamed from: component7, reason: from getter */
    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }

    public final CryptoHomeHeaderDataState copy(Resources resources, CryptoAccount cryptoAccount, Direction pageDirection, boolean isRhcApp, boolean isCryptoPortfolioSduiChartEnabled, GetHomeRewardsButtonResponseDto rewardButtonDto, DashboardPillData dashboardPillData) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        return new CryptoHomeHeaderDataState(resources, cryptoAccount, pageDirection, isRhcApp, isCryptoPortfolioSduiChartEnabled, rewardButtonDto, dashboardPillData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeHeaderDataState)) {
            return false;
        }
        CryptoHomeHeaderDataState cryptoHomeHeaderDataState = (CryptoHomeHeaderDataState) other;
        return Intrinsics.areEqual(this.resources, cryptoHomeHeaderDataState.resources) && Intrinsics.areEqual(this.cryptoAccount, cryptoHomeHeaderDataState.cryptoAccount) && this.pageDirection == cryptoHomeHeaderDataState.pageDirection && this.isRhcApp == cryptoHomeHeaderDataState.isRhcApp && this.isCryptoPortfolioSduiChartEnabled == cryptoHomeHeaderDataState.isCryptoPortfolioSduiChartEnabled && Intrinsics.areEqual(this.rewardButtonDto, cryptoHomeHeaderDataState.rewardButtonDto) && Intrinsics.areEqual(this.dashboardPillData, cryptoHomeHeaderDataState.dashboardPillData);
    }

    public int hashCode() {
        int iHashCode = this.resources.hashCode() * 31;
        CryptoAccount cryptoAccount = this.cryptoAccount;
        int iHashCode2 = (iHashCode + (cryptoAccount == null ? 0 : cryptoAccount.hashCode())) * 31;
        Direction direction = this.pageDirection;
        int iHashCode3 = (((((iHashCode2 + (direction == null ? 0 : direction.hashCode())) * 31) + Boolean.hashCode(this.isRhcApp)) * 31) + Boolean.hashCode(this.isCryptoPortfolioSduiChartEnabled)) * 31;
        GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto = this.rewardButtonDto;
        int iHashCode4 = (iHashCode3 + (getHomeRewardsButtonResponseDto == null ? 0 : getHomeRewardsButtonResponseDto.hashCode())) * 31;
        DashboardPillData dashboardPillData = this.dashboardPillData;
        return iHashCode4 + (dashboardPillData != null ? dashboardPillData.hashCode() : 0);
    }

    public String toString() {
        return "CryptoHomeHeaderDataState(resources=" + this.resources + ", cryptoAccount=" + this.cryptoAccount + ", pageDirection=" + this.pageDirection + ", isRhcApp=" + this.isRhcApp + ", isCryptoPortfolioSduiChartEnabled=" + this.isCryptoPortfolioSduiChartEnabled + ", rewardButtonDto=" + this.rewardButtonDto + ", dashboardPillData=" + this.dashboardPillData + ")";
    }

    public CryptoHomeHeaderDataState(Resources resources, CryptoAccount cryptoAccount, Direction direction, boolean z, boolean z2, GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, DashboardPillData dashboardPillData) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
        this.cryptoAccount = cryptoAccount;
        this.pageDirection = direction;
        this.isRhcApp = z;
        this.isCryptoPortfolioSduiChartEnabled = z2;
        this.rewardButtonDto = getHomeRewardsButtonResponseDto;
        this.dashboardPillData = dashboardPillData;
    }

    public /* synthetic */ CryptoHomeHeaderDataState(Resources resources, CryptoAccount cryptoAccount, Direction direction, boolean z, boolean z2, GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto, DashboardPillData dashboardPillData, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(resources, (i & 2) != 0 ? null : cryptoAccount, (i & 4) != 0 ? null : direction, z, (i & 16) != 0 ? false : z2, (i & 32) != 0 ? null : getHomeRewardsButtonResponseDto, (i & 64) != 0 ? null : dashboardPillData);
    }

    public final CryptoAccount getCryptoAccount$feature_crypto_tab_externalDebug() {
        return this.cryptoAccount;
    }

    public final Direction getPageDirection$feature_crypto_tab_externalDebug() {
        return this.pageDirection;
    }

    /* renamed from: isCryptoPortfolioSduiChartEnabled$feature_crypto_tab_externalDebug */
    public final boolean m1901x9d815828() {
        return this.isCryptoPortfolioSduiChartEnabled;
    }

    public final DashboardPillData getDashboardPillData() {
        return this.dashboardPillData;
    }

    public final BentoTheme4 getDirection() {
        Direction direction = this.pageDirection;
        int i = direction == null ? -1 : WhenMappings.$EnumSwitchMapping$0[direction.ordinal()];
        if (i != -1) {
            if (i == 1) {
                return BentoTheme4.NEGATIVE;
            }
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return BentoTheme4.POSITIVE;
    }

    public final ButtonDto getRewardButton() {
        if (this.isRhcApp) {
            GetHomeRewardsButtonResponseDto getHomeRewardsButtonResponseDto = this.rewardButtonDto;
            if ((getHomeRewardsButtonResponseDto != null ? getHomeRewardsButtonResponseDto.getButton() : null) != null) {
                return this.rewardButtonDto.getButton();
            }
        }
        return null;
    }

    public final AccountMarketValuesType getMarketValueType() {
        if (this.isRhcApp) {
            return null;
        }
        return AccountMarketValuesType.CRYPTO;
    }
}
