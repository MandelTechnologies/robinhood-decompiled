package com.robinhood.shared.crypto.transfer.verification.wallet;

import com.robinhood.models.api.transfer.verification.ApiCryptoVerificationResponse;
import com.robinhood.shared.rhweb.contracts.RhWebIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WalletVerificationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "", "Load", "Error", "Success", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Load;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Success;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationEvent, reason: use source file name */
/* loaded from: classes6.dex */
public interface WalletVerificationDuxo2 {

    /* compiled from: WalletVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Load;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "key", "Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "<init>", "(Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;)V", "getKey", "()Lcom/robinhood/shared/rhweb/contracts/RhWebIntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationEvent$Load, reason: from toString */
    public static final /* data */ class Load implements WalletVerificationDuxo2 {
        public static final int $stable = 8;
        private final RhWebIntentKey key;

        public static /* synthetic */ Load copy$default(Load load, RhWebIntentKey rhWebIntentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                rhWebIntentKey = load.key;
            }
            return load.copy(rhWebIntentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final RhWebIntentKey getKey() {
            return this.key;
        }

        public final Load copy(RhWebIntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new Load(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Load) && Intrinsics.areEqual(this.key, ((Load) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "Load(key=" + this.key + ")";
        }

        public Load(RhWebIntentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final RhWebIntentKey getKey() {
            return this.key;
        }
    }

    /* compiled from: WalletVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationEvent$Error, reason: from toString */
    public static final /* data */ class Error implements WalletVerificationDuxo2 {
        public static final int $stable = 8;
        private final Throwable throwable;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.throwable;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getThrowable() {
            return this.throwable;
        }

        public final Error copy(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            return new Error(throwable);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.throwable, ((Error) other).throwable);
        }

        public int hashCode() {
            return this.throwable.hashCode();
        }

        public String toString() {
            return "Error(throwable=" + this.throwable + ")";
        }

        public Error(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: WalletVerificationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent$Success;", "Lcom/robinhood/shared/crypto/transfer/verification/wallet/WalletVerificationEvent;", "next", "Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "<init>", "(Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;)V", "getNext", "()Lcom/robinhood/models/api/transfer/verification/ApiCryptoVerificationResponse;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.verification.wallet.WalletVerificationEvent$Success, reason: from toString */
    public static final /* data */ class Success implements WalletVerificationDuxo2 {
        public static final int $stable = 8;
        private final ApiCryptoVerificationResponse next;

        public static /* synthetic */ Success copy$default(Success success, ApiCryptoVerificationResponse apiCryptoVerificationResponse, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCryptoVerificationResponse = success.next;
            }
            return success.copy(apiCryptoVerificationResponse);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCryptoVerificationResponse getNext() {
            return this.next;
        }

        public final Success copy(ApiCryptoVerificationResponse next) {
            Intrinsics.checkNotNullParameter(next, "next");
            return new Success(next);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Success) && Intrinsics.areEqual(this.next, ((Success) other).next);
        }

        public int hashCode() {
            return this.next.hashCode();
        }

        public String toString() {
            return "Success(next=" + this.next + ")";
        }

        public Success(ApiCryptoVerificationResponse next) {
            Intrinsics.checkNotNullParameter(next, "next");
            this.next = next;
        }

        public final ApiCryptoVerificationResponse getNext() {
            return this.next;
        }
    }
}
