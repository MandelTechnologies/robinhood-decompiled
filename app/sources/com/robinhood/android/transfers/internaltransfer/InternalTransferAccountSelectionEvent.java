package com.robinhood.android.transfers.internaltransfer;

import com.robinhood.android.navigation.keys.IntentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: InternalTransferAccountSelectionEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent;", "", "LaunchActivity", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent$LaunchActivity;", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface InternalTransferAccountSelectionEvent {

    /* compiled from: InternalTransferAccountSelectionEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent$LaunchActivity;", "Lcom/robinhood/android/transfers/internaltransfer/InternalTransferAccountSelectionEvent;", "intentKey", "Lcom/robinhood/android/navigation/keys/IntentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/IntentKey;)V", "getIntentKey", "()Lcom/robinhood/android/navigation/keys/IntentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-transfer-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchActivity implements InternalTransferAccountSelectionEvent {
        public static final int $stable = 8;
        private final IntentKey intentKey;

        public static /* synthetic */ LaunchActivity copy$default(LaunchActivity launchActivity, IntentKey intentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                intentKey = launchActivity.intentKey;
            }
            return launchActivity.copy(intentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final IntentKey getIntentKey() {
            return this.intentKey;
        }

        public final LaunchActivity copy(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            return new LaunchActivity(intentKey);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchActivity) && Intrinsics.areEqual(this.intentKey, ((LaunchActivity) other).intentKey);
        }

        public int hashCode() {
            return this.intentKey.hashCode();
        }

        public String toString() {
            return "LaunchActivity(intentKey=" + this.intentKey + ")";
        }

        public LaunchActivity(IntentKey intentKey) {
            Intrinsics.checkNotNullParameter(intentKey, "intentKey");
            this.intentKey = intentKey;
        }

        public final IntentKey getIntentKey() {
            return this.intentKey;
        }
    }
}
