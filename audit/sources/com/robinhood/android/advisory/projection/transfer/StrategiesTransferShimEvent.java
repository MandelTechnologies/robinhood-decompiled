package com.robinhood.android.advisory.projection.transfer;

import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StrategiesTransferShimEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;", "", "Navigate", "Error", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent$Error;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent$Navigate;", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface StrategiesTransferShimEvent {

    /* compiled from: StrategiesTransferShimEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent$Navigate;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;", "destination", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getDestination", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Navigate implements StrategiesTransferShimEvent {
        public static final int $stable = 8;
        private final IntentKey destination;

        public static /* synthetic */ Navigate copy$default(Navigate navigate, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = navigate.destination;
            }
            return navigate.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getDestination() {
            return this.destination;
        }

        public final Navigate copy(IntentKey destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            return new Navigate(destination);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Navigate) && Intrinsics.areEqual(this.destination, ((Navigate) other).destination);
        }

        public int hashCode() {
            return this.destination.hashCode();
        }

        public String toString() {
            return "Navigate(destination=" + this.destination + ")";
        }

        public Navigate(IntentKey destination) {
            Intrinsics.checkNotNullParameter(destination, "destination");
            this.destination = destination;
        }

        public final IntentKey getDestination() {
            return this.destination;
        }
    }

    /* compiled from: StrategiesTransferShimEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent$Error;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-projected-returns_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements StrategiesTransferShimEvent {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return -398822118;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
        }
    }
}
