package com.robinhood.android.home.iac.events.store;

import com.robinhood.android.navigation.keys.NavigationKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Alert.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/Alert;", "", "BottomSheet", "PspEligibilityProgram", "UpdatedSlipAgreement", "Lcom/robinhood/android/home/iac/events/store/Alert$BottomSheet;", "Lcom/robinhood/android/home/iac/events/store/Alert$PspEligibilityProgram;", "Lcom/robinhood/android/home/iac/events/store/Alert$UpdatedSlipAgreement;", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface Alert {

    /* compiled from: Alert.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/Alert$BottomSheet;", "Lcom/robinhood/android/home/iac/events/store/Alert;", "key", "Lcom/robinhood/android/navigation/keys/NavigationKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/NavigationKey;)V", "getKey", "()Lcom/robinhood/android/navigation/keys/NavigationKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BottomSheet implements Alert {
        private final NavigationKey key;

        public static /* synthetic */ BottomSheet copy$default(BottomSheet bottomSheet, NavigationKey navigationKey, int i, Object obj) {
            if ((i & 1) != 0) {
                navigationKey = bottomSheet.key;
            }
            return bottomSheet.copy(navigationKey);
        }

        /* renamed from: component1, reason: from getter */
        public final NavigationKey getKey() {
            return this.key;
        }

        public final BottomSheet copy(NavigationKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new BottomSheet(key);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BottomSheet) && Intrinsics.areEqual(this.key, ((BottomSheet) other).key);
        }

        public int hashCode() {
            return this.key.hashCode();
        }

        public String toString() {
            return "BottomSheet(key=" + this.key + ")";
        }

        public BottomSheet(NavigationKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            this.key = key;
        }

        public final NavigationKey getKey() {
            return this.key;
        }
    }

    /* compiled from: Alert.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/Alert$PspEligibilityProgram;", "Lcom/robinhood/android/home/iac/events/store/Alert;", "uuid", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getUuid", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class PspEligibilityProgram implements Alert {
        private final UUID uuid;

        public static /* synthetic */ PspEligibilityProgram copy$default(PspEligibilityProgram pspEligibilityProgram, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = pspEligibilityProgram.uuid;
            }
            return pspEligibilityProgram.copy(uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getUuid() {
            return this.uuid;
        }

        public final PspEligibilityProgram copy(UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            return new PspEligibilityProgram(uuid);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof PspEligibilityProgram) && Intrinsics.areEqual(this.uuid, ((PspEligibilityProgram) other).uuid);
        }

        public int hashCode() {
            return this.uuid.hashCode();
        }

        public String toString() {
            return "PspEligibilityProgram(uuid=" + this.uuid + ")";
        }

        public PspEligibilityProgram(UUID uuid) {
            Intrinsics.checkNotNullParameter(uuid, "uuid");
            this.uuid = uuid;
        }

        public final UUID getUuid() {
            return this.uuid;
        }
    }

    /* compiled from: Alert.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/home/iac/events/store/Alert$UpdatedSlipAgreement;", "Lcom/robinhood/android/home/iac/events/store/Alert;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-store-home-iac-events_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class UpdatedSlipAgreement implements Alert {
        public static final UpdatedSlipAgreement INSTANCE = new UpdatedSlipAgreement();

        public boolean equals(Object other) {
            return this == other || (other instanceof UpdatedSlipAgreement);
        }

        public int hashCode() {
            return 175097285;
        }

        public String toString() {
            return "UpdatedSlipAgreement";
        }

        private UpdatedSlipAgreement() {
        }
    }
}
