package com.robinhood.android.crypto.costbasis.details.entry;

import com.robinhood.android.crypto.costbasis.utils.CostBasisErrorDetails;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoCostBasisEntryEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent;", "", "Submitted", "Error", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent$Error;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent$Submitted;", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public interface CryptoCostBasisEntryEvent {

    /* compiled from: CryptoCostBasisEntryEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent$Submitted;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Submitted implements CryptoCostBasisEntryEvent {
        public static final int $stable = 0;
        public static final Submitted INSTANCE = new Submitted();

        public boolean equals(Object other) {
            return this == other || (other instanceof Submitted);
        }

        public int hashCode() {
            return -1421923385;
        }

        public String toString() {
            return "Submitted";
        }

        private Submitted() {
        }
    }

    /* compiled from: CryptoCostBasisEntryEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent$Error;", "Lcom/robinhood/android/crypto/costbasis/details/entry/CryptoCostBasisEntryEvent;", "response", "Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "<init>", "(Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;)V", "getResponse", "()Lcom/robinhood/android/crypto/costbasis/utils/CostBasisErrorDetails;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto-cost-basis_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements CryptoCostBasisEntryEvent {
        public static final int $stable = StringResource.$stable;
        private final CostBasisErrorDetails response;

        public static /* synthetic */ Error copy$default(Error error, CostBasisErrorDetails costBasisErrorDetails, int i, Object obj) {
            if ((i & 1) != 0) {
                costBasisErrorDetails = error.response;
            }
            return error.copy(costBasisErrorDetails);
        }

        /* renamed from: component1, reason: from getter */
        public final CostBasisErrorDetails getResponse() {
            return this.response;
        }

        public final Error copy(CostBasisErrorDetails response) {
            Intrinsics.checkNotNullParameter(response, "response");
            return new Error(response);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Error) && Intrinsics.areEqual(this.response, ((Error) other).response);
        }

        public int hashCode() {
            return this.response.hashCode();
        }

        public String toString() {
            return "Error(response=" + this.response + ")";
        }

        public Error(CostBasisErrorDetails response) {
            Intrinsics.checkNotNullParameter(response, "response");
            this.response = response;
        }

        public final CostBasisErrorDetails getResponse() {
            return this.response;
        }
    }
}
