package com.robinhood.android.dashboard.lib.buyingpower;

import java.util.Currency;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PortfolioBuyingPower.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/dashboard/lib/buyingpower/AnimationTargetState;", "", "buyingPowerText", "", "isPrivacyEnabled", "", "displayCurrency", "Ljava/util/Currency;", "<init>", "(Ljava/lang/String;ZLjava/util/Currency;)V", "getBuyingPowerText", "()Ljava/lang/String;", "()Z", "getDisplayCurrency", "()Ljava/util/Currency;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "lib-account-home_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AnimationTargetState {
    public static final int $stable = 8;
    private final String buyingPowerText;
    private final Currency displayCurrency;
    private final boolean isPrivacyEnabled;

    public static /* synthetic */ AnimationTargetState copy$default(AnimationTargetState animationTargetState, String str, boolean z, Currency currency, int i, Object obj) {
        if ((i & 1) != 0) {
            str = animationTargetState.buyingPowerText;
        }
        if ((i & 2) != 0) {
            z = animationTargetState.isPrivacyEnabled;
        }
        if ((i & 4) != 0) {
            currency = animationTargetState.displayCurrency;
        }
        return animationTargetState.copy(str, z, currency);
    }

    /* renamed from: component1, reason: from getter */
    public final String getBuyingPowerText() {
        return this.buyingPowerText;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsPrivacyEnabled() {
        return this.isPrivacyEnabled;
    }

    /* renamed from: component3, reason: from getter */
    public final Currency getDisplayCurrency() {
        return this.displayCurrency;
    }

    public final AnimationTargetState copy(String buyingPowerText, boolean isPrivacyEnabled, Currency displayCurrency) {
        Intrinsics.checkNotNullParameter(buyingPowerText, "buyingPowerText");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        return new AnimationTargetState(buyingPowerText, isPrivacyEnabled, displayCurrency);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnimationTargetState)) {
            return false;
        }
        AnimationTargetState animationTargetState = (AnimationTargetState) other;
        return Intrinsics.areEqual(this.buyingPowerText, animationTargetState.buyingPowerText) && this.isPrivacyEnabled == animationTargetState.isPrivacyEnabled && Intrinsics.areEqual(this.displayCurrency, animationTargetState.displayCurrency);
    }

    public int hashCode() {
        return (((this.buyingPowerText.hashCode() * 31) + Boolean.hashCode(this.isPrivacyEnabled)) * 31) + this.displayCurrency.hashCode();
    }

    public String toString() {
        return "AnimationTargetState(buyingPowerText=" + this.buyingPowerText + ", isPrivacyEnabled=" + this.isPrivacyEnabled + ", displayCurrency=" + this.displayCurrency + ")";
    }

    public AnimationTargetState(String buyingPowerText, boolean z, Currency displayCurrency) {
        Intrinsics.checkNotNullParameter(buyingPowerText, "buyingPowerText");
        Intrinsics.checkNotNullParameter(displayCurrency, "displayCurrency");
        this.buyingPowerText = buyingPowerText;
        this.isPrivacyEnabled = z;
        this.displayCurrency = displayCurrency;
    }

    public final String getBuyingPowerText() {
        return this.buyingPowerText;
    }

    public final boolean isPrivacyEnabled() {
        return this.isPrivacyEnabled;
    }

    public final Currency getDisplayCurrency() {
        return this.displayCurrency;
    }
}
