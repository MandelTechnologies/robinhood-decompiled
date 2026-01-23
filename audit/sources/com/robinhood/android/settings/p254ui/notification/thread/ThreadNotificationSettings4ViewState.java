package com.robinhood.android.settings.p254ui.notification.thread;

import com.robinhood.udf.UiEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadNotificationSettings4ViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0011\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u001b\u0010\n\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/settings/ui/notification/thread/ThreadNotificationSettings4ViewState;", "", "error", "Lcom/robinhood/udf/UiEvent;", "", "<init>", "(Lcom/robinhood/udf/UiEvent;)V", "getError", "()Lcom/robinhood/udf/UiEvent;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-settings_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ThreadNotificationSettings4ViewState {
    public static final int $stable = 8;
    private final UiEvent<Throwable> error;

    /* JADX WARN: Multi-variable type inference failed */
    public ThreadNotificationSettings4ViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ThreadNotificationSettings4ViewState copy$default(ThreadNotificationSettings4ViewState threadNotificationSettings4ViewState, UiEvent uiEvent, int i, Object obj) {
        if ((i & 1) != 0) {
            uiEvent = threadNotificationSettings4ViewState.error;
        }
        return threadNotificationSettings4ViewState.copy(uiEvent);
    }

    public final UiEvent<Throwable> component1() {
        return this.error;
    }

    public final ThreadNotificationSettings4ViewState copy(UiEvent<Throwable> error) {
        return new ThreadNotificationSettings4ViewState(error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ThreadNotificationSettings4ViewState) && Intrinsics.areEqual(this.error, ((ThreadNotificationSettings4ViewState) other).error);
    }

    public int hashCode() {
        UiEvent<Throwable> uiEvent = this.error;
        if (uiEvent == null) {
            return 0;
        }
        return uiEvent.hashCode();
    }

    public String toString() {
        return "ThreadNotificationSettings4ViewState(error=" + this.error + ")";
    }

    public ThreadNotificationSettings4ViewState(UiEvent<Throwable> uiEvent) {
        this.error = uiEvent;
    }

    public /* synthetic */ ThreadNotificationSettings4ViewState(UiEvent uiEvent, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uiEvent);
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }
}
