package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.view.WebErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.Duration;

/* compiled from: PathfinderWebViewState.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "", "Uninitialized", "Initializing", "Loaded", "Timeout", "Error", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Error;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Initializing;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Loaded;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Timeout;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Uninitialized;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface PathfinderWebViewState {

    /* compiled from: PathfinderWebViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Uninitialized;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Uninitialized implements PathfinderWebViewState {
        public static final int $stable = 0;
        public static final Uninitialized INSTANCE = new Uninitialized();

        private Uninitialized() {
        }
    }

    /* compiled from: PathfinderWebViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Initializing;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "j$/time/Duration", "timeoutDuration", "<init>", "(Lj$/time/Duration;)V", "component1", "()Lj$/time/Duration;", "copy", "(Lj$/time/Duration;)Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Initializing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lj$/time/Duration;", "getTimeoutDuration", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Initializing implements PathfinderWebViewState {
        public static final int $stable = 8;
        private final Duration timeoutDuration;

        public static /* synthetic */ Initializing copy$default(Initializing initializing, Duration duration, int i, Object obj) {
            if ((i & 1) != 0) {
                duration = initializing.timeoutDuration;
            }
            return initializing.copy(duration);
        }

        /* renamed from: component1, reason: from getter */
        public final Duration getTimeoutDuration() {
            return this.timeoutDuration;
        }

        public final Initializing copy(Duration timeoutDuration) {
            Intrinsics.checkNotNullParameter(timeoutDuration, "timeoutDuration");
            return new Initializing(timeoutDuration);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initializing) && Intrinsics.areEqual(this.timeoutDuration, ((Initializing) other).timeoutDuration);
        }

        public int hashCode() {
            return this.timeoutDuration.hashCode();
        }

        public String toString() {
            return "Initializing(timeoutDuration=" + this.timeoutDuration + ")";
        }

        public Initializing(Duration timeoutDuration) {
            Intrinsics.checkNotNullParameter(timeoutDuration, "timeoutDuration");
            this.timeoutDuration = timeoutDuration;
        }

        public final Duration getTimeoutDuration() {
            return this.timeoutDuration;
        }
    }

    /* compiled from: PathfinderWebViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Loaded;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loaded implements PathfinderWebViewState {
        public static final int $stable = 0;
        public static final Loaded INSTANCE = new Loaded();

        private Loaded() {
        }
    }

    /* compiled from: PathfinderWebViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Timeout;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Timeout implements PathfinderWebViewState {
        public static final int $stable = 0;
        public static final Timeout INSTANCE = new Timeout();

        private Timeout() {
        }
    }

    /* compiled from: PathfinderWebViewState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState$Error;", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "error", "Lcom/robinhood/android/lib/webview/WebError;", "errorViewType", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "<init>", "(Lcom/robinhood/android/lib/webview/WebError;Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;)V", "getError", "()Lcom/robinhood/android/lib/webview/WebError;", "getErrorViewType", "()Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error implements PathfinderWebViewState {
        public static final int $stable = 8;
        private final WebError error;
        private final WebErrorView.ErrorViewType errorViewType;

        public static /* synthetic */ Error copy$default(Error error, WebError webError, WebErrorView.ErrorViewType errorViewType, int i, Object obj) {
            if ((i & 1) != 0) {
                webError = error.error;
            }
            if ((i & 2) != 0) {
                errorViewType = error.errorViewType;
            }
            return error.copy(webError, errorViewType);
        }

        /* renamed from: component1, reason: from getter */
        public final WebError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final WebErrorView.ErrorViewType getErrorViewType() {
            return this.errorViewType;
        }

        public final Error copy(WebError error, WebErrorView.ErrorViewType errorViewType) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(errorViewType, "errorViewType");
            return new Error(error, errorViewType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Error)) {
                return false;
            }
            Error error = (Error) other;
            return Intrinsics.areEqual(this.error, error.error) && this.errorViewType == error.errorViewType;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.errorViewType.hashCode();
        }

        public String toString() {
            return "Error(error=" + this.error + ", errorViewType=" + this.errorViewType + ")";
        }

        public Error(WebError error, WebErrorView.ErrorViewType errorViewType) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(errorViewType, "errorViewType");
            this.error = error;
            this.errorViewType = errorViewType;
        }

        public final WebError getError() {
            return this.error;
        }

        public final WebErrorView.ErrorViewType getErrorViewType() {
            return this.errorViewType;
        }
    }
}
