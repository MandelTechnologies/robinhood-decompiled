package com.robinhood.shared.posttransfer;

import com.robinhood.android.navigation.keys.DialogFragmentKey;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TransferConfirmationEvent.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationEvent;", "", "LaunchNgGoldEarningsBottomSheet", "Lcom/robinhood/shared/posttransfer/TransferConfirmationEvent$LaunchNgGoldEarningsBottomSheet;", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface TransferConfirmationEvent {

    /* compiled from: TransferConfirmationEvent.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/shared/posttransfer/TransferConfirmationEvent$LaunchNgGoldEarningsBottomSheet;", "Lcom/robinhood/shared/posttransfer/TransferConfirmationEvent;", "key", "Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/DialogFragmentKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/DialogFragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-post-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LaunchNgGoldEarningsBottomSheet implements TransferConfirmationEvent {
        public static final int $stable = 8;
        private final DialogFragmentKey key;

        public static /* synthetic */ LaunchNgGoldEarningsBottomSheet copy$default(LaunchNgGoldEarningsBottomSheet launchNgGoldEarningsBottomSheet, DialogFragmentKey dialogFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                dialogFragmentKey = launchNgGoldEarningsBottomSheet.key;
            }
            return launchNgGoldEarningsBottomSheet.copy(dialogFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final DialogFragmentKey getKey() {
            return this.key;
        }

        public final LaunchNgGoldEarningsBottomSheet copy(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new LaunchNgGoldEarningsBottomSheet(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LaunchNgGoldEarningsBottomSheet) && Intrinsics.areEqual(this.key, ((LaunchNgGoldEarningsBottomSheet) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "LaunchNgGoldEarningsBottomSheet(key=" + this.key + ")";
        }

        public LaunchNgGoldEarningsBottomSheet(DialogFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final DialogFragmentKey getKey() {
            return this.key;
        }
    }
}
