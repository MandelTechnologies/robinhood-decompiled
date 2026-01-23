package com.robinhood.android.crypto.p094ui.detail.banner;

import com.robinhood.android.crypto.p094ui.detail.banner.CryptoBannerDataState;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoBannerDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerViewState;", "", "bannerState", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "iacBannerState", "Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "<init>", "(Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;)V", "getBannerState", "()Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerState;", "getIacBannerState", "()Lcom/robinhood/android/crypto/ui/detail/banner/CryptoBannerDataState$IacBannerState;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoBannerViewState {
    public static final int $stable = 8;
    private final CryptoBannerState bannerState;
    private final CryptoBannerDataState.IacBannerState iacBannerState;

    public static /* synthetic */ CryptoBannerViewState copy$default(CryptoBannerViewState cryptoBannerViewState, CryptoBannerState cryptoBannerState, CryptoBannerDataState.IacBannerState iacBannerState, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoBannerState = cryptoBannerViewState.bannerState;
        }
        if ((i & 2) != 0) {
            iacBannerState = cryptoBannerViewState.iacBannerState;
        }
        return cryptoBannerViewState.copy(cryptoBannerState, iacBannerState);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoBannerState getBannerState() {
        return this.bannerState;
    }

    /* renamed from: component2, reason: from getter */
    public final CryptoBannerDataState.IacBannerState getIacBannerState() {
        return this.iacBannerState;
    }

    public final CryptoBannerViewState copy(CryptoBannerState bannerState, CryptoBannerDataState.IacBannerState iacBannerState) {
        return new CryptoBannerViewState(bannerState, iacBannerState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoBannerViewState)) {
            return false;
        }
        CryptoBannerViewState cryptoBannerViewState = (CryptoBannerViewState) other;
        return Intrinsics.areEqual(this.bannerState, cryptoBannerViewState.bannerState) && Intrinsics.areEqual(this.iacBannerState, cryptoBannerViewState.iacBannerState);
    }

    public int hashCode() {
        CryptoBannerState cryptoBannerState = this.bannerState;
        int iHashCode = (cryptoBannerState == null ? 0 : cryptoBannerState.hashCode()) * 31;
        CryptoBannerDataState.IacBannerState iacBannerState = this.iacBannerState;
        return iHashCode + (iacBannerState != null ? iacBannerState.hashCode() : 0);
    }

    public String toString() {
        return "CryptoBannerViewState(bannerState=" + this.bannerState + ", iacBannerState=" + this.iacBannerState + ")";
    }

    public CryptoBannerViewState(CryptoBannerState cryptoBannerState, CryptoBannerDataState.IacBannerState iacBannerState) {
        this.bannerState = cryptoBannerState;
        this.iacBannerState = iacBannerState;
    }

    public final CryptoBannerState getBannerState() {
        return this.bannerState;
    }

    public final CryptoBannerDataState.IacBannerState getIacBannerState() {
        return this.iacBannerState;
    }
}
