package com.robinhood.shared.crypto.acats.history;

import bonfire_crypto.proto.p042v1.crypto_migrations.p043v1.CryptoMigrationsDetailResponseDto;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAcatsHistoryViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/crypto/acats/history/CryptoAcatsHistoryViewState;", "", "response", "Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "<init>", "(Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;)V", "getResponse", "()Lbonfire_crypto/proto/v1/crypto_migrations/v1/CryptoMigrationsDetailResponseDto;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class CryptoAcatsHistoryViewState {
    public static final int $stable = 8;
    private final CryptoMigrationsDetailResponseDto response;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoAcatsHistoryViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ CryptoAcatsHistoryViewState copy$default(CryptoAcatsHistoryViewState cryptoAcatsHistoryViewState, CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, int i, Object obj) {
        if ((i & 1) != 0) {
            cryptoMigrationsDetailResponseDto = cryptoAcatsHistoryViewState.response;
        }
        return cryptoAcatsHistoryViewState.copy(cryptoMigrationsDetailResponseDto);
    }

    /* renamed from: component1, reason: from getter */
    public final CryptoMigrationsDetailResponseDto getResponse() {
        return this.response;
    }

    public final CryptoAcatsHistoryViewState copy(CryptoMigrationsDetailResponseDto response) {
        return new CryptoAcatsHistoryViewState(response);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoAcatsHistoryViewState) && Intrinsics.areEqual(this.response, ((CryptoAcatsHistoryViewState) other).response);
    }

    public int hashCode() {
        CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto = this.response;
        if (cryptoMigrationsDetailResponseDto == null) {
            return 0;
        }
        return cryptoMigrationsDetailResponseDto.hashCode();
    }

    public String toString() {
        return "CryptoAcatsHistoryViewState(response=" + this.response + ")";
    }

    public CryptoAcatsHistoryViewState(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto) {
        this.response = cryptoMigrationsDetailResponseDto;
    }

    public /* synthetic */ CryptoAcatsHistoryViewState(CryptoMigrationsDetailResponseDto cryptoMigrationsDetailResponseDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : cryptoMigrationsDetailResponseDto);
    }

    public final CryptoMigrationsDetailResponseDto getResponse() {
        return this.response;
    }
}
