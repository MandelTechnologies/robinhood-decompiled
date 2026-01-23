package com.robinhood.android.inbox.p156ui.thread;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ThreadDetailEvent.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "", "UploadMediaError", "NotificationSettingError", "ClearInputEvent", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$ClearInputEvent;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$NotificationSettingError;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$UploadMediaError;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface ThreadDetailEvent {

    /* compiled from: ThreadDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$UploadMediaError;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UploadMediaError implements ThreadDetailEvent {
        private final Throwable throwable;

        public UploadMediaError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: ThreadDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$NotificationSettingError;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "throwable", "", "<init>", "(Ljava/lang/Throwable;)V", "getThrowable", "()Ljava/lang/Throwable;", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NotificationSettingError implements ThreadDetailEvent {
        private final Throwable throwable;

        public NotificationSettingError(Throwable throwable) {
            Intrinsics.checkNotNullParameter(throwable, "throwable");
            this.throwable = throwable;
        }

        public final Throwable getThrowable() {
            return this.throwable;
        }
    }

    /* compiled from: ThreadDetailEvent.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent$ClearInputEvent;", "Lcom/robinhood/android/inbox/ui/thread/ThreadDetailEvent;", "<init>", "()V", "feature-inbox_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ClearInputEvent implements ThreadDetailEvent {
        public static final ClearInputEvent INSTANCE = new ClearInputEvent();

        private ClearInputEvent() {
        }
    }
}
