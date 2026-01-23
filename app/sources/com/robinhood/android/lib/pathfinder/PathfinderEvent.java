package com.robinhood.android.lib.pathfinder;

import kotlin.Metadata;

/* compiled from: PathfinderEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "", "DismissEvent", "BackNavChangeEvent", "DisableBackNavigationEvent", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$BackNavChangeEvent;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$DisableBackNavigationEvent;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$DismissEvent;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PathfinderEvent {

    /* compiled from: PathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$DismissEvent;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DismissEvent implements PathfinderEvent {
        public static final int $stable = 0;
        public static final DismissEvent INSTANCE = new DismissEvent();

        private DismissEvent() {
        }
    }

    /* compiled from: PathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$BackNavChangeEvent;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "canGoBack", "", "<init>", "(Z)V", "getCanGoBack", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BackNavChangeEvent implements PathfinderEvent {
        public static final int $stable = 0;
        private final boolean canGoBack;

        public static /* synthetic */ BackNavChangeEvent copy$default(BackNavChangeEvent backNavChangeEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = backNavChangeEvent.canGoBack;
            }
            return backNavChangeEvent.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getCanGoBack() {
            return this.canGoBack;
        }

        public final BackNavChangeEvent copy(boolean canGoBack) {
            return new BackNavChangeEvent(canGoBack);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof BackNavChangeEvent) && this.canGoBack == ((BackNavChangeEvent) other).canGoBack;
        }

        public int hashCode() {
            return Boolean.hashCode(this.canGoBack);
        }

        public String toString() {
            return "BackNavChangeEvent(canGoBack=" + this.canGoBack + ")";
        }

        public BackNavChangeEvent(boolean z) {
            this.canGoBack = z;
        }

        public final boolean getCanGoBack() {
            return this.canGoBack;
        }
    }

    /* compiled from: PathfinderEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderEvent$DisableBackNavigationEvent;", "Lcom/robinhood/android/lib/pathfinder/PathfinderEvent;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisableBackNavigationEvent implements PathfinderEvent {
        public static final int $stable = 0;
        public static final DisableBackNavigationEvent INSTANCE = new DisableBackNavigationEvent();

        private DisableBackNavigationEvent() {
        }
    }
}
