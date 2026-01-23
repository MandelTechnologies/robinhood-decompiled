package com.robinhood.android.crypto.tab.p093ui.feeTiers;

import com.robinhood.shared.crypto.p375ui.feeTiers.CryptoFeeTierSummary;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeFeeTierStatusComposable.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/feeTiers/PreviewState;", "", "feeTierSummary", "Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "expirationBannerText", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;Lcom/robinhood/utils/resource/StringResource;)V", "getFeeTierSummary", "()Lcom/robinhood/shared/crypto/ui/feeTiers/CryptoFeeTierSummary;", "getExpirationBannerText", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PreviewState {
    public static final int $stable = StringResource.$stable | CryptoFeeTierSummary.$stable;
    private final StringResource expirationBannerText;
    private final CryptoFeeTierSummary feeTierSummary;

    public static /* synthetic */ PreviewState copy$default(PreviewState previewState, CryptoFeeTierSummary cryptoFeeTierSummary, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoFeeTierSummary = previewState.feeTierSummary;
        }
        if ((i & 2) != 0) {
            stringResource = previewState.expirationBannerText;
        }
        return previewState.copy(cryptoFeeTierSummary, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoFeeTierSummary getFeeTierSummary() {
        return this.feeTierSummary;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getExpirationBannerText() {
        return this.expirationBannerText;
    }

    public final PreviewState copy(CryptoFeeTierSummary feeTierSummary, StringResource expirationBannerText) {
        Intrinsics.checkNotNullParameter(feeTierSummary, "feeTierSummary");
        return new PreviewState(feeTierSummary, expirationBannerText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreviewState)) {
            return false;
        }
        PreviewState previewState = (PreviewState) other;
        return Intrinsics.areEqual(this.feeTierSummary, previewState.feeTierSummary) && Intrinsics.areEqual(this.expirationBannerText, previewState.expirationBannerText);
    }

    public int hashCode() {
        int iHashCode = this.feeTierSummary.hashCode() * 31;
        StringResource stringResource = this.expirationBannerText;
        return iHashCode + (stringResource == null ? 0 : stringResource.hashCode());
    }

    public String toString() {
        return "PreviewState(feeTierSummary=" + this.feeTierSummary + ", expirationBannerText=" + this.expirationBannerText + ")";
    }

    public PreviewState(CryptoFeeTierSummary feeTierSummary, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(feeTierSummary, "feeTierSummary");
        this.feeTierSummary = feeTierSummary;
        this.expirationBannerText = stringResource;
    }

    public final CryptoFeeTierSummary getFeeTierSummary() {
        return this.feeTierSummary;
    }

    public final StringResource getExpirationBannerText() {
        return this.expirationBannerText;
    }
}
