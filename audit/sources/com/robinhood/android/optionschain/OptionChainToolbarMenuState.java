package com.robinhood.android.optionschain;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionChainToolbarState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionChainToolbarMenuState;", "", "showClearButton", "", "chainSettingsIcon", "Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "nuxDotOnSettingsIcon", "blinkNuxDotOnSettingsIcon", "<init>", "(ZLcom/robinhood/android/optionschain/OptionChainSettingsIcon;ZZ)V", "getShowClearButton", "()Z", "getChainSettingsIcon", "()Lcom/robinhood/android/optionschain/OptionChainSettingsIcon;", "getNuxDotOnSettingsIcon", "getBlinkNuxDotOnSettingsIcon", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionChainToolbarMenuState {
    public static final int $stable = 0;
    private final boolean blinkNuxDotOnSettingsIcon;
    private final OptionChainViewState3 chainSettingsIcon;
    private final boolean nuxDotOnSettingsIcon;
    private final boolean showClearButton;

    public static /* synthetic */ OptionChainToolbarMenuState copy$default(OptionChainToolbarMenuState optionChainToolbarMenuState, boolean z, OptionChainViewState3 optionChainViewState3, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = optionChainToolbarMenuState.showClearButton;
        }
        if ((i & 2) != 0) {
            optionChainViewState3 = optionChainToolbarMenuState.chainSettingsIcon;
        }
        if ((i & 4) != 0) {
            z2 = optionChainToolbarMenuState.nuxDotOnSettingsIcon;
        }
        if ((i & 8) != 0) {
            z3 = optionChainToolbarMenuState.blinkNuxDotOnSettingsIcon;
        }
        return optionChainToolbarMenuState.copy(z, optionChainViewState3, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getShowClearButton() {
        return this.showClearButton;
    }

    /* renamed from: component2, reason: from getter */
    public final OptionChainViewState3 getChainSettingsIcon() {
        return this.chainSettingsIcon;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getNuxDotOnSettingsIcon() {
        return this.nuxDotOnSettingsIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getBlinkNuxDotOnSettingsIcon() {
        return this.blinkNuxDotOnSettingsIcon;
    }

    public final OptionChainToolbarMenuState copy(boolean showClearButton, OptionChainViewState3 chainSettingsIcon, boolean nuxDotOnSettingsIcon, boolean blinkNuxDotOnSettingsIcon) {
        Intrinsics.checkNotNullParameter(chainSettingsIcon, "chainSettingsIcon");
        return new OptionChainToolbarMenuState(showClearButton, chainSettingsIcon, nuxDotOnSettingsIcon, blinkNuxDotOnSettingsIcon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionChainToolbarMenuState)) {
            return false;
        }
        OptionChainToolbarMenuState optionChainToolbarMenuState = (OptionChainToolbarMenuState) other;
        return this.showClearButton == optionChainToolbarMenuState.showClearButton && this.chainSettingsIcon == optionChainToolbarMenuState.chainSettingsIcon && this.nuxDotOnSettingsIcon == optionChainToolbarMenuState.nuxDotOnSettingsIcon && this.blinkNuxDotOnSettingsIcon == optionChainToolbarMenuState.blinkNuxDotOnSettingsIcon;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.showClearButton) * 31) + this.chainSettingsIcon.hashCode()) * 31) + Boolean.hashCode(this.nuxDotOnSettingsIcon)) * 31) + Boolean.hashCode(this.blinkNuxDotOnSettingsIcon);
    }

    public String toString() {
        return "OptionChainToolbarMenuState(showClearButton=" + this.showClearButton + ", chainSettingsIcon=" + this.chainSettingsIcon + ", nuxDotOnSettingsIcon=" + this.nuxDotOnSettingsIcon + ", blinkNuxDotOnSettingsIcon=" + this.blinkNuxDotOnSettingsIcon + ")";
    }

    public OptionChainToolbarMenuState(boolean z, OptionChainViewState3 chainSettingsIcon, boolean z2, boolean z3) {
        Intrinsics.checkNotNullParameter(chainSettingsIcon, "chainSettingsIcon");
        this.showClearButton = z;
        this.chainSettingsIcon = chainSettingsIcon;
        this.nuxDotOnSettingsIcon = z2;
        this.blinkNuxDotOnSettingsIcon = z3;
    }

    public final boolean getShowClearButton() {
        return this.showClearButton;
    }

    public final OptionChainViewState3 getChainSettingsIcon() {
        return this.chainSettingsIcon;
    }

    public final boolean getNuxDotOnSettingsIcon() {
        return this.nuxDotOnSettingsIcon;
    }

    public final boolean getBlinkNuxDotOnSettingsIcon() {
        return this.blinkNuxDotOnSettingsIcon;
    }
}
