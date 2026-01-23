package com.robinhood.android.equityscreener.crud.delete;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeleteScreenerViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState;", "", "Loading", "Ready", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState$Loading;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState$Ready;", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface DeleteScreenerViewState {

    /* compiled from: DeleteScreenerViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState$Loading;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState;", "<init>", "()V", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements DeleteScreenerViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: DeleteScreenerViewState.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState$Ready;", "Lcom/robinhood/android/equityscreener/crud/delete/DeleteScreenerViewState;", "displayName", "", "isDeleting", "", "isDeleted", "<init>", "(Ljava/lang/String;ZZ)V", "getDisplayName", "()Ljava/lang/String;", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-equity-screener_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements DeleteScreenerViewState {
        public static final int $stable = 0;
        private final String displayName;
        private final boolean isDeleted;
        private final boolean isDeleting;

        public static /* synthetic */ Ready copy$default(Ready ready, String str, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.displayName;
            }
            if ((i & 2) != 0) {
                z = ready.isDeleting;
            }
            if ((i & 4) != 0) {
                z2 = ready.isDeleted;
            }
            return ready.copy(str, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsDeleting() {
            return this.isDeleting;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsDeleted() {
            return this.isDeleted;
        }

        public final Ready copy(String displayName, boolean isDeleting, boolean isDeleted) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            return new Ready(displayName, isDeleting, isDeleted);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.displayName, ready.displayName) && this.isDeleting == ready.isDeleting && this.isDeleted == ready.isDeleted;
        }

        public int hashCode() {
            return (((this.displayName.hashCode() * 31) + Boolean.hashCode(this.isDeleting)) * 31) + Boolean.hashCode(this.isDeleted);
        }

        public String toString() {
            return "Ready(displayName=" + this.displayName + ", isDeleting=" + this.isDeleting + ", isDeleted=" + this.isDeleted + ")";
        }

        public Ready(String displayName, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            this.displayName = displayName;
            this.isDeleting = z;
            this.isDeleted = z2;
        }

        public final String getDisplayName() {
            return this.displayName;
        }

        public final boolean isDeleting() {
            return this.isDeleting;
        }

        public final boolean isDeleted() {
            return this.isDeleted;
        }
    }
}
