package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.view.WebErrorView;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderErrorState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState;", "", "<init>", "()V", "NoErrorState", "WebErrorState", "Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$NoErrorState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$WebErrorState;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class PathfinderErrorState {
    public static final int $stable = 0;

    public /* synthetic */ PathfinderErrorState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PathfinderErrorState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$NoErrorState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NoErrorState extends PathfinderErrorState {
        public static final int $stable = 0;
        public static final NoErrorState INSTANCE = new NoErrorState();

        private NoErrorState() {
            super(null);
        }
    }

    private PathfinderErrorState() {
    }

    /* compiled from: PathfinderErrorState.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$WebErrorState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState;", "error", "Lcom/robinhood/android/lib/webview/WebError;", "errorViewType", "Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "<init>", "(Lcom/robinhood/android/lib/webview/WebError;Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;)V", "getError", "()Lcom/robinhood/android/lib/webview/WebError;", "getErrorViewType", "()Lcom/robinhood/android/lib/webview/view/WebErrorView$ErrorViewType;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class WebErrorState extends PathfinderErrorState {
        public static final int $stable = 8;
        private final WebError error;
        private final WebErrorView.ErrorViewType errorViewType;

        public static /* synthetic */ WebErrorState copy$default(WebErrorState webErrorState, WebError webError, WebErrorView.ErrorViewType errorViewType, int i, Object obj) {
            if ((i & 1) != 0) {
                webError = webErrorState.error;
            }
            if ((i & 2) != 0) {
                errorViewType = webErrorState.errorViewType;
            }
            return webErrorState.copy(webError, errorViewType);
        }

        /* renamed from: component1, reason: from getter */
        public final WebError getError() {
            return this.error;
        }

        /* renamed from: component2, reason: from getter */
        public final WebErrorView.ErrorViewType getErrorViewType() {
            return this.errorViewType;
        }

        public final WebErrorState copy(WebError error, WebErrorView.ErrorViewType errorViewType) {
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(errorViewType, "errorViewType");
            return new WebErrorState(error, errorViewType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof WebErrorState)) {
                return false;
            }
            WebErrorState webErrorState = (WebErrorState) other;
            return Intrinsics.areEqual(this.error, webErrorState.error) && this.errorViewType == webErrorState.errorViewType;
        }

        public int hashCode() {
            return (this.error.hashCode() * 31) + this.errorViewType.hashCode();
        }

        public String toString() {
            return "WebErrorState(error=" + this.error + ", errorViewType=" + this.errorViewType + ")";
        }

        public final WebError getError() {
            return this.error;
        }

        public final WebErrorView.ErrorViewType getErrorViewType() {
            return this.errorViewType;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public WebErrorState(WebError error, WebErrorView.ErrorViewType errorViewType) {
            super(null);
            Intrinsics.checkNotNullParameter(error, "error");
            Intrinsics.checkNotNullParameter(errorViewType, "errorViewType");
            this.error = error;
            this.errorViewType = errorViewType;
        }
    }
}
