package com.robinhood.shared.crypto.staking.staking.onboarding;

import com.robinhood.models.crypto.CurrencyDefinition;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.staking.staking.C37760R;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoStakingOnboardingDataState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J+\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u00072\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000eR\u0011\u0010\u0012\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/shared/crypto/staking/staking/onboarding/CryptoStakingOnboardingDataState;", "", "uiCurrencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "networkError", "", "isUpdatingAgreement", "", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;Ljava/lang/Throwable;Z)V", "getUiCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "getNetworkError", "()Ljava/lang/Throwable;", "()Z", "getPrimaryButtonText", "Lcom/robinhood/utils/resource/StringResource;", "currencyPair", "secondaryButtonText", "getSecondaryButtonText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-staking_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoStakingOnboardingDataState {
    public static final int $stable = 8;
    private final boolean isUpdatingAgreement;
    private final Throwable networkError;
    private final UiCurrencyPair uiCurrencyPair;

    public CryptoStakingOnboardingDataState() {
        this(null, null, false, 7, null);
    }

    public static /* synthetic */ CryptoStakingOnboardingDataState copy$default(CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState, UiCurrencyPair uiCurrencyPair, Throwable th, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            uiCurrencyPair = cryptoStakingOnboardingDataState.uiCurrencyPair;
        }
        if ((i & 2) != 0) {
            th = cryptoStakingOnboardingDataState.networkError;
        }
        if ((i & 4) != 0) {
            z = cryptoStakingOnboardingDataState.isUpdatingAgreement;
        }
        return cryptoStakingOnboardingDataState.copy(uiCurrencyPair, th, z);
    }

    /* renamed from: component1, reason: from getter */
    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getNetworkError() {
        return this.networkError;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUpdatingAgreement() {
        return this.isUpdatingAgreement;
    }

    public final CryptoStakingOnboardingDataState copy(UiCurrencyPair uiCurrencyPair, Throwable networkError, boolean isUpdatingAgreement) {
        return new CryptoStakingOnboardingDataState(uiCurrencyPair, networkError, isUpdatingAgreement);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoStakingOnboardingDataState)) {
            return false;
        }
        CryptoStakingOnboardingDataState cryptoStakingOnboardingDataState = (CryptoStakingOnboardingDataState) other;
        return Intrinsics.areEqual(this.uiCurrencyPair, cryptoStakingOnboardingDataState.uiCurrencyPair) && Intrinsics.areEqual(this.networkError, cryptoStakingOnboardingDataState.networkError) && this.isUpdatingAgreement == cryptoStakingOnboardingDataState.isUpdatingAgreement;
    }

    public int hashCode() {
        UiCurrencyPair uiCurrencyPair = this.uiCurrencyPair;
        int iHashCode = (uiCurrencyPair == null ? 0 : uiCurrencyPair.hashCode()) * 31;
        Throwable th = this.networkError;
        return ((iHashCode + (th != null ? th.hashCode() : 0)) * 31) + Boolean.hashCode(this.isUpdatingAgreement);
    }

    public String toString() {
        return "CryptoStakingOnboardingDataState(uiCurrencyPair=" + this.uiCurrencyPair + ", networkError=" + this.networkError + ", isUpdatingAgreement=" + this.isUpdatingAgreement + ")";
    }

    public CryptoStakingOnboardingDataState(UiCurrencyPair uiCurrencyPair, Throwable th, boolean z) {
        this.uiCurrencyPair = uiCurrencyPair;
        this.networkError = th;
        this.isUpdatingAgreement = z;
    }

    public /* synthetic */ CryptoStakingOnboardingDataState(UiCurrencyPair uiCurrencyPair, Throwable th, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiCurrencyPair, (i & 2) != 0 ? null : th, (i & 4) != 0 ? false : z);
    }

    public final UiCurrencyPair getUiCurrencyPair() {
        return this.uiCurrencyPair;
    }

    public final Throwable getNetworkError() {
        return this.networkError;
    }

    public final boolean isUpdatingAgreement() {
        return this.isUpdatingAgreement;
    }

    public final StringResource getPrimaryButtonText(UiCurrencyPair currencyPair) {
        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
        return StringResource.INSTANCE.invoke(C37760R.string.staking_toolbar_deposit_title, CurrencyDefinition.getCurrencySymbol$default(currencyPair.getAssetCurrency(), null, 1, null));
    }

    public final StringResource getSecondaryButtonText() {
        return StringResource.INSTANCE.invoke(C37760R.string.staking_learn_more_label, new Object[0]);
    }
}
