package com.robinhood.android.crypto.p094ui.detail.position;

import com.robinhood.android.crypto.p094ui.detail.position.bottomSheets.CryptoAverageCostReturnUnavailableOrPendingState;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoPositionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent;", "", "<init>", "()V", "ShowPositionReferenceManual", "ShowAverageCostReturnBottomSheet", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent$ShowAverageCostReturnBottomSheet;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent$ShowPositionReferenceManual;", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class CryptoPositionEvent {
    public static final int $stable = 0;

    public /* synthetic */ CryptoPositionEvent(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private CryptoPositionEvent() {
    }

    /* compiled from: CryptoPositionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent$ShowPositionReferenceManual;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent;", "intentKey", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Anonymous;", "<init>", "(Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Anonymous;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$ReferenceManual$Anonymous;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowPositionReferenceManual extends CryptoPositionEvent {
        public static final int $stable = 8;
        private final LegacyIntentKey.ReferenceManual.Anonymous intentKey;

        public static /* synthetic */ ShowPositionReferenceManual copy$default(ShowPositionReferenceManual showPositionReferenceManual, LegacyIntentKey.ReferenceManual.Anonymous anonymous, int i, Object obj) {
            if ((i & 1) != 0) {
                anonymous = showPositionReferenceManual.intentKey;
            }
            return showPositionReferenceManual.copy(anonymous);
        }

        /* renamed from: component1, reason: from getter */
        public final LegacyIntentKey.ReferenceManual.Anonymous getIntentKey() {
            return this.intentKey;
        }

        public final ShowPositionReferenceManual copy(LegacyIntentKey.ReferenceManual.Anonymous intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new ShowPositionReferenceManual(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowPositionReferenceManual) && Intrinsics.areEqual(this.intentKey, ((ShowPositionReferenceManual) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "ShowPositionReferenceManual(intentKey=" + this.intentKey + ")";
        }

        public final LegacyIntentKey.ReferenceManual.Anonymous getIntentKey() {
            return this.intentKey;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowPositionReferenceManual(LegacyIntentKey.ReferenceManual.Anonymous intentKey) {
            super(null);
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }
    }

    /* compiled from: CryptoPositionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent$ShowAverageCostReturnBottomSheet;", "Lcom/robinhood/android/crypto/ui/detail/position/CryptoPositionEvent;", "bottomSheetState", "Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;", "<init>", "(Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;)V", "getBottomSheetState", "()Lcom/robinhood/android/crypto/ui/detail/position/bottomSheets/CryptoAverageCostReturnUnavailableOrPendingState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ShowAverageCostReturnBottomSheet extends CryptoPositionEvent {
        public static final int $stable = 0;
        private final CryptoAverageCostReturnUnavailableOrPendingState bottomSheetState;

        public static /* synthetic */ ShowAverageCostReturnBottomSheet copy$default(ShowAverageCostReturnBottomSheet showAverageCostReturnBottomSheet, CryptoAverageCostReturnUnavailableOrPendingState cryptoAverageCostReturnUnavailableOrPendingState, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoAverageCostReturnUnavailableOrPendingState = showAverageCostReturnBottomSheet.bottomSheetState;
            }
            return showAverageCostReturnBottomSheet.copy(cryptoAverageCostReturnUnavailableOrPendingState);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoAverageCostReturnUnavailableOrPendingState getBottomSheetState() {
            return this.bottomSheetState;
        }

        public final ShowAverageCostReturnBottomSheet copy(CryptoAverageCostReturnUnavailableOrPendingState bottomSheetState) {
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            return new ShowAverageCostReturnBottomSheet(bottomSheetState);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ShowAverageCostReturnBottomSheet) && Intrinsics.areEqual(this.bottomSheetState, ((ShowAverageCostReturnBottomSheet) other).bottomSheetState);
        }

        public int hashCode() {
            return this.bottomSheetState.hashCode();
        }

        public String toString() {
            return "ShowAverageCostReturnBottomSheet(bottomSheetState=" + this.bottomSheetState + ")";
        }

        public final CryptoAverageCostReturnUnavailableOrPendingState getBottomSheetState() {
            return this.bottomSheetState;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShowAverageCostReturnBottomSheet(CryptoAverageCostReturnUnavailableOrPendingState bottomSheetState) {
            super(null);
            Intrinsics.checkNotNullParameter(bottomSheetState, "bottomSheetState");
            this.bottomSheetState = bottomSheetState;
        }
    }
}
