package com.robinhood.android.lib.pathfinder;

import com.robinhood.models.p355ui.pathfinder.UserViewState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderDataState.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001 B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tHÆ\u0003J7\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;", "", "inquiryId", "Ljava/util/UUID;", "inquiryState", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "webViewState", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "page", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;)V", "getInquiryId", "()Ljava/util/UUID;", "getInquiryState", "()Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "getWebViewState", "()Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "getPage", "()Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "InquiryState", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PathfinderDataState {
    public static final int $stable = 8;
    private final UUID inquiryId;
    private final InquiryState inquiryState;
    private final UserViewState.Page<?> page;
    private final PathfinderWebViewState webViewState;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PathfinderDataState copy$default(PathfinderDataState pathfinderDataState, UUID uuid, InquiryState inquiryState, PathfinderWebViewState pathfinderWebViewState, UserViewState.Page page, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = pathfinderDataState.inquiryId;
        }
        if ((i & 2) != 0) {
            inquiryState = pathfinderDataState.inquiryState;
        }
        if ((i & 4) != 0) {
            pathfinderWebViewState = pathfinderDataState.webViewState;
        }
        if ((i & 8) != 0) {
            page = pathfinderDataState.page;
        }
        return pathfinderDataState.copy(uuid, inquiryState, pathfinderWebViewState, page);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final InquiryState getInquiryState() {
        return this.inquiryState;
    }

    /* renamed from: component3, reason: from getter */
    public final PathfinderWebViewState getWebViewState() {
        return this.webViewState;
    }

    public final UserViewState.Page<?> component4() {
        return this.page;
    }

    public final PathfinderDataState copy(UUID inquiryId, InquiryState inquiryState, PathfinderWebViewState webViewState, UserViewState.Page<?> page) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryState, "inquiryState");
        Intrinsics.checkNotNullParameter(webViewState, "webViewState");
        return new PathfinderDataState(inquiryId, inquiryState, webViewState, page);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderDataState)) {
            return false;
        }
        PathfinderDataState pathfinderDataState = (PathfinderDataState) other;
        return Intrinsics.areEqual(this.inquiryId, pathfinderDataState.inquiryId) && Intrinsics.areEqual(this.inquiryState, pathfinderDataState.inquiryState) && Intrinsics.areEqual(this.webViewState, pathfinderDataState.webViewState) && Intrinsics.areEqual(this.page, pathfinderDataState.page);
    }

    public int hashCode() {
        int iHashCode = ((((this.inquiryId.hashCode() * 31) + this.inquiryState.hashCode()) * 31) + this.webViewState.hashCode()) * 31;
        UserViewState.Page<?> page = this.page;
        return iHashCode + (page == null ? 0 : page.hashCode());
    }

    public String toString() {
        return "PathfinderDataState(inquiryId=" + this.inquiryId + ", inquiryState=" + this.inquiryState + ", webViewState=" + this.webViewState + ", page=" + this.page + ")";
    }

    public PathfinderDataState(UUID inquiryId, InquiryState inquiryState, PathfinderWebViewState webViewState, UserViewState.Page<?> page) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(inquiryState, "inquiryState");
        Intrinsics.checkNotNullParameter(webViewState, "webViewState");
        this.inquiryId = inquiryId;
        this.inquiryState = inquiryState;
        this.webViewState = webViewState;
        this.page = page;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final InquiryState getInquiryState() {
        return this.inquiryState;
    }

    public final PathfinderWebViewState getWebViewState() {
        return this.webViewState;
    }

    public final UserViewState.Page<?> getPage() {
        return this.page;
    }

    /* compiled from: PathfinderDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "", "Idle", "Updating", "Error", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Error;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Idle;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Updating;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface InquiryState {

        /* compiled from: PathfinderDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Idle;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Idle implements InquiryState {
            public static final int $stable = 0;
            public static final Idle INSTANCE = new Idle();

            private Idle() {
            }
        }

        /* compiled from: PathfinderDataState.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Updating;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "<init>", "()V", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Updating implements InquiryState {
            public static final int $stable = 0;
            public static final Updating INSTANCE = new Updating();

            private Updating() {
            }
        }

        /* compiled from: PathfinderDataState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState$Error;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState$InquiryState;", "exception", "", "<init>", "(Ljava/lang/Throwable;)V", "getException", "()Ljava/lang/Throwable;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Error implements InquiryState {
            public static final int $stable = 8;
            private final Throwable exception;

            public static /* synthetic */ Error copy$default(Error error, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = error.exception;
                }
                return error.copy(th);
            }

            /* renamed from: component1, reason: from getter */
            public final Throwable getException() {
                return this.exception;
            }

            public final Error copy(Throwable exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                return new Error(exception);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && Intrinsics.areEqual(this.exception, ((Error) other).exception);
            }

            public int hashCode() {
                return this.exception.hashCode();
            }

            public String toString() {
                return "Error(exception=" + this.exception + ")";
            }

            public Error(Throwable exception) {
                Intrinsics.checkNotNullParameter(exception, "exception");
                this.exception = exception;
            }

            public final Throwable getException() {
                return this.exception;
            }
        }
    }
}
