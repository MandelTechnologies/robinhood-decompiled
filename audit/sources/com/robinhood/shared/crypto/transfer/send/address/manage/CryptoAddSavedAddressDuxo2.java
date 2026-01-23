package com.robinhood.shared.crypto.transfer.send.address.manage;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoAddSavedAddressDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressEvent;", "", "Error", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressEvent$Error;", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressEvent, reason: use source file name */
/* loaded from: classes6.dex */
public interface CryptoAddSavedAddressDuxo2 {

    /* compiled from: CryptoAddSavedAddressDuxo.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressEvent$Error;", "Lcom/robinhood/shared/crypto/transfer/send/address/manage/CryptoAddSavedAddressEvent;", "t", "", "<init>", "(Ljava/lang/Throwable;)V", "getT", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.transfer.send.address.manage.CryptoAddSavedAddressEvent$Error, reason: from toString */
    public static final /* data */ class Error implements CryptoAddSavedAddressDuxo2 {
        public static final int $stable = 8;
        private final Throwable t;

        public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
            if ((i & 1) != 0) {
                th = error.t;
            }
            return error.copy(th);
        }

        /* renamed from: component1, reason: from getter */
        public final Throwable getT() {
            return this.t;
        }

        public final Error copy(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            return new Error(t);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.t, ((Error) other).t);
        }

        public int hashCode() {
            return this.t.hashCode();
        }

        public String toString() {
            return "Error(t=" + this.t + ")";
        }

        public Error(Throwable t) {
            Intrinsics.checkNotNullParameter(t, "t");
            this.t = t;
        }

        public final Throwable getT() {
            return this.t;
        }
    }
}
