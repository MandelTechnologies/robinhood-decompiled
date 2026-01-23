package com.robinhood.android.common.portfolio.assetHomes;

import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.rosetta.eventlogging.PortfolioAccountType;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AssetHomeHeaderState.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001.BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\t\u0010'\u001a\u00020\u0010HÆ\u0003JY\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010HÆ\u0001J\u0013\u0010)\u001a\u00020\u00102\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020,HÖ\u0001J\t\u0010-\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006/"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState;", "", "accountNumber", "", "portfolioAccountType", "Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "assetType", "Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", "sourceScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "tooltipType", "Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;", "shouldShimmer", "", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;Z)V", "getAccountNumber", "()Ljava/lang/String;", "getPortfolioAccountType", "()Lcom/robinhood/rosetta/eventlogging/PortfolioAccountType;", "getAssetType", "()Lcom/robinhood/android/common/portfolio/assetHomes/ExtendedAssetType;", "getHeader", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getSourceScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getTooltipType", "()Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;", "getShouldShimmer", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "TooltipType", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AssetHomeHeaderState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final ExtendedAssetType assetType;
    private final UIComponent<AccountPositionAction> header;
    private final PortfolioAccountType portfolioAccountType;
    private final boolean shouldShimmer;
    private final Screen sourceScreen;
    private final TooltipType tooltipType;

    public static /* synthetic */ AssetHomeHeaderState copy$default(AssetHomeHeaderState assetHomeHeaderState, String str, PortfolioAccountType portfolioAccountType, ExtendedAssetType extendedAssetType, UIComponent uIComponent, Screen screen, TooltipType tooltipType, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = assetHomeHeaderState.accountNumber;
        }
        if ((i & 2) != 0) {
            portfolioAccountType = assetHomeHeaderState.portfolioAccountType;
        }
        if ((i & 4) != 0) {
            extendedAssetType = assetHomeHeaderState.assetType;
        }
        if ((i & 8) != 0) {
            uIComponent = assetHomeHeaderState.header;
        }
        if ((i & 16) != 0) {
            screen = assetHomeHeaderState.sourceScreen;
        }
        if ((i & 32) != 0) {
            tooltipType = assetHomeHeaderState.tooltipType;
        }
        if ((i & 64) != 0) {
            z = assetHomeHeaderState.shouldShimmer;
        }
        TooltipType tooltipType2 = tooltipType;
        boolean z2 = z;
        Screen screen2 = screen;
        ExtendedAssetType extendedAssetType2 = extendedAssetType;
        return assetHomeHeaderState.copy(str, portfolioAccountType, extendedAssetType2, uIComponent, screen2, tooltipType2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final PortfolioAccountType getPortfolioAccountType() {
        return this.portfolioAccountType;
    }

    /* renamed from: component3, reason: from getter */
    public final ExtendedAssetType getAssetType() {
        return this.assetType;
    }

    public final UIComponent<AccountPositionAction> component4() {
        return this.header;
    }

    /* renamed from: component5, reason: from getter */
    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    /* renamed from: component6, reason: from getter */
    public final TooltipType getTooltipType() {
        return this.tooltipType;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getShouldShimmer() {
        return this.shouldShimmer;
    }

    public final AssetHomeHeaderState copy(String accountNumber, PortfolioAccountType portfolioAccountType, ExtendedAssetType assetType, UIComponent<? extends AccountPositionAction> header, Screen sourceScreen, TooltipType tooltipType, boolean shouldShimmer) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        return new AssetHomeHeaderState(accountNumber, portfolioAccountType, assetType, header, sourceScreen, tooltipType, shouldShimmer);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AssetHomeHeaderState)) {
            return false;
        }
        AssetHomeHeaderState assetHomeHeaderState = (AssetHomeHeaderState) other;
        return Intrinsics.areEqual(this.accountNumber, assetHomeHeaderState.accountNumber) && this.portfolioAccountType == assetHomeHeaderState.portfolioAccountType && this.assetType == assetHomeHeaderState.assetType && Intrinsics.areEqual(this.header, assetHomeHeaderState.header) && Intrinsics.areEqual(this.sourceScreen, assetHomeHeaderState.sourceScreen) && this.tooltipType == assetHomeHeaderState.tooltipType && this.shouldShimmer == assetHomeHeaderState.shouldShimmer;
    }

    public int hashCode() {
        int iHashCode = ((((this.accountNumber.hashCode() * 31) + this.portfolioAccountType.hashCode()) * 31) + this.assetType.hashCode()) * 31;
        UIComponent<AccountPositionAction> uIComponent = this.header;
        int iHashCode2 = (((iHashCode + (uIComponent == null ? 0 : uIComponent.hashCode())) * 31) + this.sourceScreen.hashCode()) * 31;
        TooltipType tooltipType = this.tooltipType;
        return ((iHashCode2 + (tooltipType != null ? tooltipType.hashCode() : 0)) * 31) + Boolean.hashCode(this.shouldShimmer);
    }

    public String toString() {
        return "AssetHomeHeaderState(accountNumber=" + this.accountNumber + ", portfolioAccountType=" + this.portfolioAccountType + ", assetType=" + this.assetType + ", header=" + this.header + ", sourceScreen=" + this.sourceScreen + ", tooltipType=" + this.tooltipType + ", shouldShimmer=" + this.shouldShimmer + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AssetHomeHeaderState(String accountNumber, PortfolioAccountType portfolioAccountType, ExtendedAssetType assetType, UIComponent<? extends AccountPositionAction> uIComponent, Screen sourceScreen, TooltipType tooltipType, boolean z) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(portfolioAccountType, "portfolioAccountType");
        Intrinsics.checkNotNullParameter(assetType, "assetType");
        Intrinsics.checkNotNullParameter(sourceScreen, "sourceScreen");
        this.accountNumber = accountNumber;
        this.portfolioAccountType = portfolioAccountType;
        this.assetType = assetType;
        this.header = uIComponent;
        this.sourceScreen = sourceScreen;
        this.tooltipType = tooltipType;
        this.shouldShimmer = z;
    }

    public /* synthetic */ AssetHomeHeaderState(String str, PortfolioAccountType portfolioAccountType, ExtendedAssetType extendedAssetType, UIComponent uIComponent, Screen screen, TooltipType tooltipType, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, portfolioAccountType, extendedAssetType, (i & 8) != 0 ? null : uIComponent, screen, tooltipType, (i & 64) != 0 ? false : z);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final PortfolioAccountType getPortfolioAccountType() {
        return this.portfolioAccountType;
    }

    public final ExtendedAssetType getAssetType() {
        return this.assetType;
    }

    public final UIComponent<AccountPositionAction> getHeader() {
        return this.header;
    }

    public final Screen getSourceScreen() {
        return this.sourceScreen;
    }

    public final TooltipType getTooltipType() {
        return this.tooltipType;
    }

    public final boolean getShouldShimmer() {
        return this.shouldShimmer;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssetHomeHeaderState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/portfolio/assetHomes/AssetHomeHeaderState$TooltipType;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_HOME_ENTRY", "OPTIONS_MARKET", "feature-lib-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TooltipType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TooltipType[] $VALUES;
        public static final TooltipType ASSET_HOME_ENTRY = new TooltipType("ASSET_HOME_ENTRY", 0);
        public static final TooltipType OPTIONS_MARKET = new TooltipType("OPTIONS_MARKET", 1);

        private static final /* synthetic */ TooltipType[] $values() {
            return new TooltipType[]{ASSET_HOME_ENTRY, OPTIONS_MARKET};
        }

        public static EnumEntries<TooltipType> getEntries() {
            return $ENTRIES;
        }

        private TooltipType(String str, int i) {
        }

        static {
            TooltipType[] tooltipTypeArr$values = $values();
            $VALUES = tooltipTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tooltipTypeArr$values);
        }

        public static TooltipType valueOf(String str) {
            return (TooltipType) Enum.valueOf(TooltipType.class, str);
        }

        public static TooltipType[] values() {
            return (TooltipType[]) $VALUES.clone();
        }
    }
}
