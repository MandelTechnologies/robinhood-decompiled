package com.robinhood.android.advanced.alert;

import kotlin.Metadata;

/* compiled from: AdvancedAlertCreateBottomSheetEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "", "DismissEvent", "LoadingEvent", "ErrorEvent", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$DismissEvent;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$ErrorEvent;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$LoadingEvent;", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AdvancedAlertCreateBottomSheetEvent {

    /* compiled from: AdvancedAlertCreateBottomSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$DismissEvent;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class DismissEvent implements AdvancedAlertCreateBottomSheetEvent {
        public static final int $stable = 0;
        public static final DismissEvent INSTANCE = new DismissEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof DismissEvent);
        }

        public int hashCode() {
            return 1455928524;
        }

        public String toString() {
            return "DismissEvent";
        }

        private DismissEvent() {
        }
    }

    /* compiled from: AdvancedAlertCreateBottomSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\u00032\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$LoadingEvent;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "isLoading", "", "<init>", "(Z)V", "()Z", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LoadingEvent implements AdvancedAlertCreateBottomSheetEvent {
        public static final int $stable = 0;
        private final boolean isLoading;

        public static /* synthetic */ LoadingEvent copy$default(LoadingEvent loadingEvent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loadingEvent.isLoading;
            }
            return loadingEvent.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsLoading() {
            return this.isLoading;
        }

        public final LoadingEvent copy(boolean isLoading) {
            return new LoadingEvent(isLoading);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LoadingEvent) && this.isLoading == ((LoadingEvent) other).isLoading;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isLoading);
        }

        public String toString() {
            return "LoadingEvent(isLoading=" + this.isLoading + ")";
        }

        public LoadingEvent(boolean z) {
            this.isLoading = z;
        }

        public final boolean isLoading() {
            return this.isLoading;
        }
    }

    /* compiled from: AdvancedAlertCreateBottomSheetEvent.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent$ErrorEvent;", "Lcom/robinhood/android/advanced/alert/AdvancedAlertCreateBottomSheetEvent;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-lib-advanced-alert_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ErrorEvent implements AdvancedAlertCreateBottomSheetEvent {
        public static final int $stable = 0;
        public static final ErrorEvent INSTANCE = new ErrorEvent();

        public boolean equals(Object other) {
            return this == other || (other instanceof ErrorEvent);
        }

        public int hashCode() {
            return -438072562;
        }

        public String toString() {
            return "ErrorEvent";
        }

        private ErrorEvent() {
        }
    }
}
