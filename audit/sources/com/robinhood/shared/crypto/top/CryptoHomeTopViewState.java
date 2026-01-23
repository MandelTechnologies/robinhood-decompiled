package com.robinhood.shared.crypto.top;

import com.robinhood.models.crypto.p314db.home.CryptoTopCrypto;
import com.robinhood.models.serverdriven.experimental.api.InstrumentDisplayType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeTopViewState.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\r2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/shared/crypto/top/CryptoHomeTopViewState;", "", "topCrypto", "Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "activeInstrumentDisplayType", "Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "<init>", "(Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;)V", "getTopCrypto", "()Lcom/robinhood/models/crypto/db/home/CryptoTopCrypto;", "getActiveInstrumentDisplayType", "()Lcom/robinhood/models/serverdriven/experimental/api/InstrumentDisplayType;", "isLoading", "", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-top-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoHomeTopViewState {
    public static final int $stable = 8;
    private final InstrumentDisplayType activeInstrumentDisplayType;
    private final CryptoTopCrypto topCrypto;

    public static /* synthetic */ CryptoHomeTopViewState copy$default(CryptoHomeTopViewState cryptoHomeTopViewState, CryptoTopCrypto cryptoTopCrypto, InstrumentDisplayType instrumentDisplayType, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoTopCrypto = cryptoHomeTopViewState.topCrypto;
        }
        if ((i & 2) != 0) {
            instrumentDisplayType = cryptoHomeTopViewState.activeInstrumentDisplayType;
        }
        return cryptoHomeTopViewState.copy(cryptoTopCrypto, instrumentDisplayType);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoTopCrypto getTopCrypto() {
        return this.topCrypto;
    }

    /* renamed from: component2, reason: from getter */
    public final InstrumentDisplayType getActiveInstrumentDisplayType() {
        return this.activeInstrumentDisplayType;
    }

    public final CryptoHomeTopViewState copy(CryptoTopCrypto topCrypto, InstrumentDisplayType activeInstrumentDisplayType) {
        Intrinsics.checkNotNullParameter(activeInstrumentDisplayType, "activeInstrumentDisplayType");
        return new CryptoHomeTopViewState(topCrypto, activeInstrumentDisplayType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeTopViewState)) {
            return false;
        }
        CryptoHomeTopViewState cryptoHomeTopViewState = (CryptoHomeTopViewState) other;
        return Intrinsics.areEqual(this.topCrypto, cryptoHomeTopViewState.topCrypto) && this.activeInstrumentDisplayType == cryptoHomeTopViewState.activeInstrumentDisplayType;
    }

    public int hashCode() {
        CryptoTopCrypto cryptoTopCrypto = this.topCrypto;
        return ((cryptoTopCrypto == null ? 0 : cryptoTopCrypto.hashCode()) * 31) + this.activeInstrumentDisplayType.hashCode();
    }

    public String toString() {
        return "CryptoHomeTopViewState(topCrypto=" + this.topCrypto + ", activeInstrumentDisplayType=" + this.activeInstrumentDisplayType + ")";
    }

    public CryptoHomeTopViewState(CryptoTopCrypto cryptoTopCrypto, InstrumentDisplayType activeInstrumentDisplayType) {
        Intrinsics.checkNotNullParameter(activeInstrumentDisplayType, "activeInstrumentDisplayType");
        this.topCrypto = cryptoTopCrypto;
        this.activeInstrumentDisplayType = activeInstrumentDisplayType;
    }

    public /* synthetic */ CryptoHomeTopViewState(CryptoTopCrypto cryptoTopCrypto, InstrumentDisplayType instrumentDisplayType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoTopCrypto, instrumentDisplayType);
    }

    public final CryptoTopCrypto getTopCrypto() {
        return this.topCrypto;
    }

    public final InstrumentDisplayType getActiveInstrumentDisplayType() {
        return this.activeInstrumentDisplayType;
    }

    public final boolean isLoading() {
        return this.topCrypto == null;
    }
}
