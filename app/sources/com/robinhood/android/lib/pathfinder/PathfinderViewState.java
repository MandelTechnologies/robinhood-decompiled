package com.robinhood.android.lib.pathfinder;

import com.robinhood.android.lib.pathfinder.PathfinderErrorState;
import com.robinhood.android.lib.pathfinder.PathfinderStateRegistry;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.udf.UiEvent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0014J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JJ\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\nHÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0012R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState;", "", "content", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "error", "Lcom/robinhood/udf/UiEvent;", "", "isUpdatingInquiry", "", "latestPageSequence", "", "renderedPageSequence", "<init>", "(Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;Lcom/robinhood/udf/UiEvent;ZLjava/lang/Integer;I)V", "getContent", "()Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "getError", "()Lcom/robinhood/udf/UiEvent;", "()Z", "getLatestPageSequence", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRenderedPageSequence", "()I", "component1", "component2", "component3", "component4", "component5", "copy", "(Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;Lcom/robinhood/udf/UiEvent;ZLjava/lang/Integer;I)Lcom/robinhood/android/lib/pathfinder/PathfinderViewState;", "equals", "other", "hashCode", "toString", "", "Content", "Companion", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class PathfinderViewState {
    public static final int UNDEFINED_SEQUENCE = -1;
    private final Content content;
    private final UiEvent<Throwable> error;
    private final boolean isUpdatingInquiry;
    private final Integer latestPageSequence;
    private final int renderedPageSequence;
    public static final int $stable = 8;

    public PathfinderViewState() {
        this(null, null, false, null, 0, 31, null);
    }

    public static /* synthetic */ PathfinderViewState copy$default(PathfinderViewState pathfinderViewState, Content content, UiEvent uiEvent, boolean z, Integer num, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            content = pathfinderViewState.content;
        }
        if ((i2 & 2) != 0) {
            uiEvent = pathfinderViewState.error;
        }
        if ((i2 & 4) != 0) {
            z = pathfinderViewState.isUpdatingInquiry;
        }
        if ((i2 & 8) != 0) {
            num = pathfinderViewState.latestPageSequence;
        }
        if ((i2 & 16) != 0) {
            i = pathfinderViewState.renderedPageSequence;
        }
        int i3 = i;
        boolean z2 = z;
        return pathfinderViewState.copy(content, uiEvent, z2, num, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final Content getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> component2() {
        return this.error;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUpdatingInquiry() {
        return this.isUpdatingInquiry;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getLatestPageSequence() {
        return this.latestPageSequence;
    }

    /* renamed from: component5, reason: from getter */
    public final int getRenderedPageSequence() {
        return this.renderedPageSequence;
    }

    public final PathfinderViewState copy(Content content, UiEvent<Throwable> error, boolean isUpdatingInquiry, Integer latestPageSequence, int renderedPageSequence) {
        Intrinsics.checkNotNullParameter(content, "content");
        return new PathfinderViewState(content, error, isUpdatingInquiry, latestPageSequence, renderedPageSequence);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PathfinderViewState)) {
            return false;
        }
        PathfinderViewState pathfinderViewState = (PathfinderViewState) other;
        return Intrinsics.areEqual(this.content, pathfinderViewState.content) && Intrinsics.areEqual(this.error, pathfinderViewState.error) && this.isUpdatingInquiry == pathfinderViewState.isUpdatingInquiry && Intrinsics.areEqual(this.latestPageSequence, pathfinderViewState.latestPageSequence) && this.renderedPageSequence == pathfinderViewState.renderedPageSequence;
    }

    public int hashCode() {
        int iHashCode = this.content.hashCode() * 31;
        UiEvent<Throwable> uiEvent = this.error;
        int iHashCode2 = (((iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31) + Boolean.hashCode(this.isUpdatingInquiry)) * 31;
        Integer num = this.latestPageSequence;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.renderedPageSequence);
    }

    public String toString() {
        return "PathfinderViewState(content=" + this.content + ", error=" + this.error + ", isUpdatingInquiry=" + this.isUpdatingInquiry + ", latestPageSequence=" + this.latestPageSequence + ", renderedPageSequence=" + this.renderedPageSequence + ")";
    }

    public PathfinderViewState(Content content, UiEvent<Throwable> uiEvent, boolean z, Integer num, int i) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.content = content;
        this.error = uiEvent;
        this.isUpdatingInquiry = z;
        this.latestPageSequence = num;
        this.renderedPageSequence = i;
    }

    public /* synthetic */ PathfinderViewState(Content content, UiEvent uiEvent, boolean z, Integer num, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? Content.None.INSTANCE : content, (i2 & 2) != 0 ? null : uiEvent, (i2 & 4) != 0 ? false : z, (i2 & 8) != 0 ? null : num, (i2 & 16) != 0 ? -1 : i);
    }

    public final Content getContent() {
        return this.content;
    }

    public final UiEvent<Throwable> getError() {
        return this.error;
    }

    public final boolean isUpdatingInquiry() {
        return this.isUpdatingInquiry;
    }

    public final Integer getLatestPageSequence() {
        return this.latestPageSequence;
    }

    public final int getRenderedPageSequence() {
        return this.renderedPageSequence;
    }

    /* compiled from: PathfinderViewState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "", "None", "WebLoading", "WebError", "Page", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$None;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebError;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebLoading;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Content {

        /* compiled from: PathfinderViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$None;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class None implements Content {
            public static final int $stable = 0;
            public static final None INSTANCE = new None();

            public boolean equals(Object other) {
                return this == other || (other instanceof None);
            }

            public int hashCode() {
                return 1713681504;
            }

            public String toString() {
                return "None";
            }

            private None() {
            }
        }

        /* compiled from: PathfinderViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebLoading;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WebLoading implements Content {
            public static final int $stable = 0;
            public static final WebLoading INSTANCE = new WebLoading();

            public boolean equals(Object other) {
                return this == other || (other instanceof WebLoading);
            }

            public int hashCode() {
                return 2029162096;
            }

            public String toString() {
                return "WebLoading";
            }

            private WebLoading() {
            }
        }

        /* compiled from: PathfinderViewState.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$WebError;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "error", "Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$WebErrorState;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$WebErrorState;)V", "getError", "()Lcom/robinhood/android/lib/pathfinder/PathfinderErrorState$WebErrorState;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class WebError implements Content {
            public static final int $stable = 8;
            private final PathfinderErrorState.WebErrorState error;

            public static /* synthetic */ WebError copy$default(WebError webError, PathfinderErrorState.WebErrorState webErrorState, int i, Object obj) {
                if ((i & 1) != 0) {
                    webErrorState = webError.error;
                }
                return webError.copy(webErrorState);
            }

            /* renamed from: component1, reason: from getter */
            public final PathfinderErrorState.WebErrorState getError() {
                return this.error;
            }

            public final WebError copy(PathfinderErrorState.WebErrorState error) {
                Intrinsics.checkNotNullParameter(error, "error");
                return new WebError(error);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WebError) && Intrinsics.areEqual(this.error, ((WebError) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "WebError(error=" + this.error + ")";
            }

            public WebError(PathfinderErrorState.WebErrorState error) {
                Intrinsics.checkNotNullParameter(error, "error");
                this.error = error;
            }

            public final PathfinderErrorState.WebErrorState getError() {
                return this.error;
            }
        }

        /* compiled from: PathfinderViewState.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "Web", "Native", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page$Native;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page$Web;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public interface Page extends Content {

            /* compiled from: PathfinderViewState.kt */
            @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page$Web;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page;", "inquiryId", "Ljava/util/UUID;", "rawUserView", "", "unrenderableReason", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;)V", "getInquiryId", "()Ljava/util/UUID;", "getRawUserView", "()Ljava/lang/String;", "getUnrenderableReason", "()Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Web implements Page {
                public static final int $stable = 8;
                private final UUID inquiryId;
                private final String rawUserView;
                private final PathfinderStateRegistry.UnrenderableReason unrenderableReason;

                public static /* synthetic */ Web copy$default(Web web, UUID uuid, String str, PathfinderStateRegistry.UnrenderableReason unrenderableReason, int i, Object obj) {
                    if ((i & 1) != 0) {
                        uuid = web.inquiryId;
                    }
                    if ((i & 2) != 0) {
                        str = web.rawUserView;
                    }
                    if ((i & 4) != 0) {
                        unrenderableReason = web.unrenderableReason;
                    }
                    return web.copy(uuid, str, unrenderableReason);
                }

                /* renamed from: component1, reason: from getter */
                public final UUID getInquiryId() {
                    return this.inquiryId;
                }

                /* renamed from: component2, reason: from getter */
                public final String getRawUserView() {
                    return this.rawUserView;
                }

                /* renamed from: component3, reason: from getter */
                public final PathfinderStateRegistry.UnrenderableReason getUnrenderableReason() {
                    return this.unrenderableReason;
                }

                public final Web copy(UUID inquiryId, String rawUserView, PathfinderStateRegistry.UnrenderableReason unrenderableReason) {
                    Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                    Intrinsics.checkNotNullParameter(rawUserView, "rawUserView");
                    Intrinsics.checkNotNullParameter(unrenderableReason, "unrenderableReason");
                    return new Web(inquiryId, rawUserView, unrenderableReason);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Web)) {
                        return false;
                    }
                    Web web = (Web) other;
                    return Intrinsics.areEqual(this.inquiryId, web.inquiryId) && Intrinsics.areEqual(this.rawUserView, web.rawUserView) && this.unrenderableReason == web.unrenderableReason;
                }

                public int hashCode() {
                    return (((this.inquiryId.hashCode() * 31) + this.rawUserView.hashCode()) * 31) + this.unrenderableReason.hashCode();
                }

                public String toString() {
                    return "Web(inquiryId=" + this.inquiryId + ", rawUserView=" + this.rawUserView + ", unrenderableReason=" + this.unrenderableReason + ")";
                }

                public Web(UUID inquiryId, String rawUserView, PathfinderStateRegistry.UnrenderableReason unrenderableReason) {
                    Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
                    Intrinsics.checkNotNullParameter(rawUserView, "rawUserView");
                    Intrinsics.checkNotNullParameter(unrenderableReason, "unrenderableReason");
                    this.inquiryId = inquiryId;
                    this.rawUserView = rawUserView;
                    this.unrenderableReason = unrenderableReason;
                }

                public final UUID getInquiryId() {
                    return this.inquiryId;
                }

                public final String getRawUserView() {
                    return this.rawUserView;
                }

                public final PathfinderStateRegistry.UnrenderableReason getUnrenderableReason() {
                    return this.unrenderableReason;
                }
            }

            /* compiled from: PathfinderViewState.kt */
            @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page$Native;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content$Page;", "fragmentKey", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "<init>", "(Lcom/robinhood/android/navigation/keys/FragmentKey;)V", "getFragmentKey", "()Lcom/robinhood/android/navigation/keys/FragmentKey;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final /* data */ class Native implements Page {
                public static final int $stable = 8;
                private final FragmentKey fragmentKey;

                public static /* synthetic */ Native copy$default(Native r0, FragmentKey fragmentKey, int i, Object obj) {
                    if ((i & 1) != 0) {
                        fragmentKey = r0.fragmentKey;
                    }
                    return r0.copy(fragmentKey);
                }

                /* renamed from: component1, reason: from getter */
                public final FragmentKey getFragmentKey() {
                    return this.fragmentKey;
                }

                public final Native copy(FragmentKey fragmentKey) {
                    Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                    return new Native(fragmentKey);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Native) && Intrinsics.areEqual(this.fragmentKey, ((Native) other).fragmentKey);
                }

                public int hashCode() {
                    return this.fragmentKey.hashCode();
                }

                public String toString() {
                    return "Native(fragmentKey=" + this.fragmentKey + ")";
                }

                public Native(FragmentKey fragmentKey) {
                    Intrinsics.checkNotNullParameter(fragmentKey, "fragmentKey");
                    this.fragmentKey = fragmentKey;
                }

                public final FragmentKey getFragmentKey() {
                    return this.fragmentKey;
                }
            }
        }
    }
}
