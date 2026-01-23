package com.robinhood.android.optionschain;

import androidx.core.graphics.Insets;
import com.robinhood.android.options.contracts.OptionChainLaunchMode;
import com.robinhood.android.options.tradability.expiration.OptionChainExpirationDateState;
import com.robinhood.android.search.contracts.SearchSelectorLaunchMode;
import com.robinhood.models.p355ui.OptionChainDisplayMode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainActivityViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010)\u001a\u00020\u0005HÆ\u0003J\t\u0010*\u001a\u00020\u0005HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0005HÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003Ju\u00100\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u00101\u001a\u00020\u00052\b\u00102\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00103\u001a\u000204HÖ\u0001J\t\u00105\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0017R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0017R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0015R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0017R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0010\u0010!\u001a\u0004\u0018\u00010\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\"\u001a\u0004\u0018\u00010#8F¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainActivityViewState;", "", "chainDisplayModeBeforeSbsNuxDeeplink", "Lcom/robinhood/models/ui/OptionChainDisplayMode;", "hasForcedSideBySideChainOnce", "", "selectedExpirationPage", "Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "isSideBySideChainSettingsTapped", "isNuxSearchDismissed", "initialAccountNumber", "", "launchMode", "Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "currentChainDisplayMode", "isOnboardingSearchSelectorVisible", "windowInsets", "Landroidx/core/graphics/Insets;", "<init>", "(Lcom/robinhood/models/ui/OptionChainDisplayMode;ZLcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;ZZLjava/lang/String;Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;Lcom/robinhood/models/ui/OptionChainDisplayMode;ZLandroidx/core/graphics/Insets;)V", "getChainDisplayModeBeforeSbsNuxDeeplink", "()Lcom/robinhood/models/ui/OptionChainDisplayMode;", "getHasForcedSideBySideChainOnce", "()Z", "getSelectedExpirationPage", "()Lcom/robinhood/android/options/tradability/expiration/OptionChainExpirationDateState;", "getInitialAccountNumber", "()Ljava/lang/String;", "getLaunchMode", "()Lcom/robinhood/android/options/contracts/OptionChainLaunchMode;", "getCurrentChainDisplayMode", "getWindowInsets", "()Landroidx/core/graphics/Insets;", "optionChainLaunchModeAfterSearch", "searchSelectorLaunchMode", "Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "getSearchSelectorLaunchMode", "()Lcom/robinhood/android/search/contracts/SearchSelectorLaunchMode$Options;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainActivityViewState {
    public static final int $stable = 8;
    private final OptionChainDisplayMode chainDisplayModeBeforeSbsNuxDeeplink;
    private final OptionChainDisplayMode currentChainDisplayMode;
    private final boolean hasForcedSideBySideChainOnce;
    private final String initialAccountNumber;
    private final boolean isNuxSearchDismissed;
    private final boolean isOnboardingSearchSelectorVisible;
    private final boolean isSideBySideChainSettingsTapped;
    private final OptionChainLaunchMode launchMode;
    private final OptionChainLaunchMode optionChainLaunchModeAfterSearch;
    private final OptionChainExpirationDateState selectedExpirationPage;
    private final Insets windowInsets;

    public static /* synthetic */ OptionChainActivityViewState copy$default(OptionChainActivityViewState optionChainActivityViewState, OptionChainDisplayMode optionChainDisplayMode, boolean z, OptionChainExpirationDateState optionChainExpirationDateState, boolean z2, boolean z3, String str, OptionChainLaunchMode optionChainLaunchMode, OptionChainDisplayMode optionChainDisplayMode2, boolean z4, Insets insets, int i, Object obj) {
        if ((i & 1) != 0) {
            optionChainDisplayMode = optionChainActivityViewState.chainDisplayModeBeforeSbsNuxDeeplink;
        }
        if ((i & 2) != 0) {
            z = optionChainActivityViewState.hasForcedSideBySideChainOnce;
        }
        if ((i & 4) != 0) {
            optionChainExpirationDateState = optionChainActivityViewState.selectedExpirationPage;
        }
        if ((i & 8) != 0) {
            z2 = optionChainActivityViewState.isSideBySideChainSettingsTapped;
        }
        if ((i & 16) != 0) {
            z3 = optionChainActivityViewState.isNuxSearchDismissed;
        }
        if ((i & 32) != 0) {
            str = optionChainActivityViewState.initialAccountNumber;
        }
        if ((i & 64) != 0) {
            optionChainLaunchMode = optionChainActivityViewState.launchMode;
        }
        if ((i & 128) != 0) {
            optionChainDisplayMode2 = optionChainActivityViewState.currentChainDisplayMode;
        }
        if ((i & 256) != 0) {
            z4 = optionChainActivityViewState.isOnboardingSearchSelectorVisible;
        }
        if ((i & 512) != 0) {
            insets = optionChainActivityViewState.windowInsets;
        }
        boolean z5 = z4;
        Insets insets2 = insets;
        OptionChainLaunchMode optionChainLaunchMode2 = optionChainLaunchMode;
        OptionChainDisplayMode optionChainDisplayMode3 = optionChainDisplayMode2;
        boolean z6 = z3;
        String str2 = str;
        return optionChainActivityViewState.copy(optionChainDisplayMode, z, optionChainExpirationDateState, z2, z6, str2, optionChainLaunchMode2, optionChainDisplayMode3, z5, insets2);
    }

    /* renamed from: component1, reason: from getter */
    public final OptionChainDisplayMode getChainDisplayModeBeforeSbsNuxDeeplink() {
        return this.chainDisplayModeBeforeSbsNuxDeeplink;
    }

    /* renamed from: component10, reason: from getter */
    public final Insets getWindowInsets() {
        return this.windowInsets;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getHasForcedSideBySideChainOnce() {
        return this.hasForcedSideBySideChainOnce;
    }

    /* renamed from: component3, reason: from getter */
    public final OptionChainExpirationDateState getSelectedExpirationPage() {
        return this.selectedExpirationPage;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsSideBySideChainSettingsTapped() {
        return this.isSideBySideChainSettingsTapped;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    /* renamed from: component6, reason: from getter */
    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    /* renamed from: component7, reason: from getter */
    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    /* renamed from: component8, reason: from getter */
    public final OptionChainDisplayMode getCurrentChainDisplayMode() {
        return this.currentChainDisplayMode;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsOnboardingSearchSelectorVisible() {
        return this.isOnboardingSearchSelectorVisible;
    }

    public final OptionChainActivityViewState copy(OptionChainDisplayMode chainDisplayModeBeforeSbsNuxDeeplink, boolean hasForcedSideBySideChainOnce, OptionChainExpirationDateState selectedExpirationPage, boolean isSideBySideChainSettingsTapped, boolean isNuxSearchDismissed, String initialAccountNumber, OptionChainLaunchMode launchMode, OptionChainDisplayMode currentChainDisplayMode, boolean isOnboardingSearchSelectorVisible, Insets windowInsets) {
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        return new OptionChainActivityViewState(chainDisplayModeBeforeSbsNuxDeeplink, hasForcedSideBySideChainOnce, selectedExpirationPage, isSideBySideChainSettingsTapped, isNuxSearchDismissed, initialAccountNumber, launchMode, currentChainDisplayMode, isOnboardingSearchSelectorVisible, windowInsets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainActivityViewState)) {
            return false;
        }
        OptionChainActivityViewState optionChainActivityViewState = (OptionChainActivityViewState) other;
        return this.chainDisplayModeBeforeSbsNuxDeeplink == optionChainActivityViewState.chainDisplayModeBeforeSbsNuxDeeplink && this.hasForcedSideBySideChainOnce == optionChainActivityViewState.hasForcedSideBySideChainOnce && Intrinsics.areEqual(this.selectedExpirationPage, optionChainActivityViewState.selectedExpirationPage) && this.isSideBySideChainSettingsTapped == optionChainActivityViewState.isSideBySideChainSettingsTapped && this.isNuxSearchDismissed == optionChainActivityViewState.isNuxSearchDismissed && Intrinsics.areEqual(this.initialAccountNumber, optionChainActivityViewState.initialAccountNumber) && Intrinsics.areEqual(this.launchMode, optionChainActivityViewState.launchMode) && this.currentChainDisplayMode == optionChainActivityViewState.currentChainDisplayMode && this.isOnboardingSearchSelectorVisible == optionChainActivityViewState.isOnboardingSearchSelectorVisible && Intrinsics.areEqual(this.windowInsets, optionChainActivityViewState.windowInsets);
    }

    public int hashCode() {
        OptionChainDisplayMode optionChainDisplayMode = this.chainDisplayModeBeforeSbsNuxDeeplink;
        int iHashCode = (((optionChainDisplayMode == null ? 0 : optionChainDisplayMode.hashCode()) * 31) + Boolean.hashCode(this.hasForcedSideBySideChainOnce)) * 31;
        OptionChainExpirationDateState optionChainExpirationDateState = this.selectedExpirationPage;
        int iHashCode2 = (((((iHashCode + (optionChainExpirationDateState == null ? 0 : optionChainExpirationDateState.hashCode())) * 31) + Boolean.hashCode(this.isSideBySideChainSettingsTapped)) * 31) + Boolean.hashCode(this.isNuxSearchDismissed)) * 31;
        String str = this.initialAccountNumber;
        int iHashCode3 = (((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31) + this.launchMode.hashCode()) * 31;
        OptionChainDisplayMode optionChainDisplayMode2 = this.currentChainDisplayMode;
        return ((((iHashCode3 + (optionChainDisplayMode2 != null ? optionChainDisplayMode2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isOnboardingSearchSelectorVisible)) * 31) + this.windowInsets.hashCode();
    }

    public String toString() {
        return "OptionChainActivityViewState(chainDisplayModeBeforeSbsNuxDeeplink=" + this.chainDisplayModeBeforeSbsNuxDeeplink + ", hasForcedSideBySideChainOnce=" + this.hasForcedSideBySideChainOnce + ", selectedExpirationPage=" + this.selectedExpirationPage + ", isSideBySideChainSettingsTapped=" + this.isSideBySideChainSettingsTapped + ", isNuxSearchDismissed=" + this.isNuxSearchDismissed + ", initialAccountNumber=" + this.initialAccountNumber + ", launchMode=" + this.launchMode + ", currentChainDisplayMode=" + this.currentChainDisplayMode + ", isOnboardingSearchSelectorVisible=" + this.isOnboardingSearchSelectorVisible + ", windowInsets=" + this.windowInsets + ")";
    }

    public OptionChainActivityViewState(OptionChainDisplayMode optionChainDisplayMode, boolean z, OptionChainExpirationDateState optionChainExpirationDateState, boolean z2, boolean z3, String str, OptionChainLaunchMode launchMode, OptionChainDisplayMode optionChainDisplayMode2, boolean z4, Insets windowInsets) {
        OptionChainLaunchMode optionChainLaunchMode;
        Intrinsics.checkNotNullParameter(launchMode, "launchMode");
        Intrinsics.checkNotNullParameter(windowInsets, "windowInsets");
        this.chainDisplayModeBeforeSbsNuxDeeplink = optionChainDisplayMode;
        this.hasForcedSideBySideChainOnce = z;
        this.selectedExpirationPage = optionChainExpirationDateState;
        this.isSideBySideChainSettingsTapped = z2;
        this.isNuxSearchDismissed = z3;
        this.initialAccountNumber = str;
        this.launchMode = launchMode;
        this.currentChainDisplayMode = optionChainDisplayMode2;
        this.isOnboardingSearchSelectorVisible = z4;
        this.windowInsets = windowInsets;
        if (launchMode instanceof OptionChainLaunchMode.SideBySideChainOnboardingFirstStep) {
            optionChainLaunchMode = OptionChainLaunchMode.SideBySideChainOnboardingSecondStep.INSTANCE;
        } else {
            optionChainLaunchMode = launchMode instanceof OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingFirstStep ? OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingSecondStep.INSTANCE : null;
        }
        this.optionChainLaunchModeAfterSearch = optionChainLaunchMode;
    }

    public final OptionChainDisplayMode getChainDisplayModeBeforeSbsNuxDeeplink() {
        return this.chainDisplayModeBeforeSbsNuxDeeplink;
    }

    public final boolean getHasForcedSideBySideChainOnce() {
        return this.hasForcedSideBySideChainOnce;
    }

    public final OptionChainExpirationDateState getSelectedExpirationPage() {
        return this.selectedExpirationPage;
    }

    public final boolean isSideBySideChainSettingsTapped() {
        return this.isSideBySideChainSettingsTapped;
    }

    public final boolean isNuxSearchDismissed() {
        return this.isNuxSearchDismissed;
    }

    public final String getInitialAccountNumber() {
        return this.initialAccountNumber;
    }

    public final OptionChainLaunchMode getLaunchMode() {
        return this.launchMode;
    }

    public final OptionChainDisplayMode getCurrentChainDisplayMode() {
        return this.currentChainDisplayMode;
    }

    public final boolean isOnboardingSearchSelectorVisible() {
        return this.isOnboardingSearchSelectorVisible;
    }

    public /* synthetic */ OptionChainActivityViewState(OptionChainDisplayMode optionChainDisplayMode, boolean z, OptionChainExpirationDateState optionChainExpirationDateState, boolean z2, boolean z3, String str, OptionChainLaunchMode optionChainLaunchMode, OptionChainDisplayMode optionChainDisplayMode2, boolean z4, Insets insets, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : optionChainDisplayMode, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : optionChainExpirationDateState, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? false : z3, str, optionChainLaunchMode, (i & 128) != 0 ? null : optionChainDisplayMode2, (i & 256) != 0 ? false : z4, (i & 512) != 0 ? Insets.NONE : insets);
    }

    public final Insets getWindowInsets() {
        return this.windowInsets;
    }

    public final SearchSelectorLaunchMode.Options getSearchSelectorLaunchMode() {
        if (this.launchMode.hasFeature(OptionChainLaunchMode.Feature.ONBOARDING_SEARCH_POPUP) && this.initialAccountNumber != null && this.optionChainLaunchModeAfterSearch != null) {
            OptionChainLaunchMode optionChainLaunchMode = this.launchMode;
            if (optionChainLaunchMode instanceof OptionChainLaunchMode.SideBySideChainOnboardingFirstStep) {
                return new SearchSelectorLaunchMode.Options.SideBySideChainOnboarding(this.initialAccountNumber, this.optionChainLaunchModeAfterSearch);
            }
            if (optionChainLaunchMode instanceof OptionChainLaunchMode.SimulatedReturnPreTradeOnboardingFirstStep) {
                return new SearchSelectorLaunchMode.Options.SimulatedReturnPreTradeOnboarding(this.initialAccountNumber, this.optionChainLaunchModeAfterSearch);
            }
        }
        return null;
    }
}
