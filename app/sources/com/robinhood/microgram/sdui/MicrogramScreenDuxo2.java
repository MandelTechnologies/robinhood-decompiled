package com.robinhood.microgram.sdui;

import com.robinhood.android.shared.serverui.utils.UiObject;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import microgram.p507ui.p508v1.screen_events.InvokeJavascriptRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollToBottomRequestDto;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: MicrogramScreenDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent;", "", "<init>", "()V", "ScrollRequest", "ShareScreenshotRequest", "InvokeJavascript", "Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.ScreenEvent, reason: use source file name */
/* loaded from: classes13.dex */
public abstract class MicrogramScreenDuxo2 {
    public static final int $stable = 0;

    public /* synthetic */ MicrogramScreenDuxo2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private MicrogramScreenDuxo2() {
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "Lcom/robinhood/microgram/sdui/ScreenEvent;", "<init>", "()V", "ToItem", "ToBottom", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest$ToBottom;", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest$ToItem;", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenEvent$ScrollRequest */
    public static abstract class ScrollRequest extends MicrogramScreenDuxo2 {
        public static final int $stable = 0;

        public /* synthetic */ ScrollRequest(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* compiled from: MicrogramScreenDuxo.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest$ToItem;", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "scrollRequest", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest;", "Lmicrogram/ui/v1/screen_events/ScrollRequestDto;", "Lcom/robinhood/microgram/sdui/AnyScrollRequest;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getScrollRequest", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.ScreenEvent$ScrollRequest$ToItem, reason: from toString */
        public static final /* data */ class ToItem extends ScrollRequest {
            public static final int $stable = 8;
            private final UiObject<ScreenScrollRequest, ScrollRequestDto> scrollRequest;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ToItem copy$default(ToItem toItem, UiObject uiObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiObject = toItem.scrollRequest;
                }
                return toItem.copy(uiObject);
            }

            public final UiObject<ScreenScrollRequest, ScrollRequestDto> component1() {
                return this.scrollRequest;
            }

            public final ToItem copy(UiObject<ScreenScrollRequest, ScrollRequestDto> scrollRequest) {
                Intrinsics.checkNotNullParameter(scrollRequest, "scrollRequest");
                return new ToItem(scrollRequest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ToItem) && Intrinsics.areEqual(this.scrollRequest, ((ToItem) other).scrollRequest);
            }

            public int hashCode() {
                return this.scrollRequest.hashCode();
            }

            public String toString() {
                return "ToItem(scrollRequest=" + this.scrollRequest + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ToItem(UiObject<ScreenScrollRequest, ScrollRequestDto> scrollRequest) {
                super(null);
                Intrinsics.checkNotNullParameter(scrollRequest, "scrollRequest");
                this.scrollRequest = scrollRequest;
            }

            public final UiObject<ScreenScrollRequest, ScrollRequestDto> getScrollRequest() {
                return this.scrollRequest;
            }
        }

        private ScrollRequest() {
            super(null);
        }

        /* compiled from: MicrogramScreenDuxo.kt */
        @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J#\u0010\f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest$ToBottom;", "Lcom/robinhood/microgram/sdui/ScreenEvent$ScrollRequest;", "scrollToBottomRequest", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/ScreenScrollToBottomRequest;", "Lmicrogram/ui/v1/screen_events/ScrollToBottomRequestDto;", "Lcom/robinhood/microgram/sdui/AnyScrollToBottomRequest;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;)V", "getScrollToBottomRequest", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.ScreenEvent$ScrollRequest$ToBottom, reason: from toString */
        public static final /* data */ class ToBottom extends ScrollRequest {
            public static final int $stable = 8;
            private final UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto> scrollToBottomRequest;

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ToBottom copy$default(ToBottom toBottom, UiObject uiObject, int i, Object obj) {
                if ((i & 1) != 0) {
                    uiObject = toBottom.scrollToBottomRequest;
                }
                return toBottom.copy(uiObject);
            }

            public final UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto> component1() {
                return this.scrollToBottomRequest;
            }

            public final ToBottom copy(UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto> scrollToBottomRequest) {
                Intrinsics.checkNotNullParameter(scrollToBottomRequest, "scrollToBottomRequest");
                return new ToBottom(scrollToBottomRequest);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ToBottom) && Intrinsics.areEqual(this.scrollToBottomRequest, ((ToBottom) other).scrollToBottomRequest);
            }

            public int hashCode() {
                return this.scrollToBottomRequest.hashCode();
            }

            public String toString() {
                return "ToBottom(scrollToBottomRequest=" + this.scrollToBottomRequest + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public ToBottom(UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto> scrollToBottomRequest) {
                super(null);
                Intrinsics.checkNotNullParameter(scrollToBottomRequest, "scrollToBottomRequest");
                this.scrollToBottomRequest = scrollToBottomRequest;
            }

            public final UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto> getScrollToBottomRequest() {
                return this.scrollToBottomRequest;
            }
        }
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "Lcom/robinhood/microgram/sdui/ScreenEvent;", "request", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "id", "Ljava/util/UUID;", "<init>", "(Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;Ljava/util/UUID;)V", "getRequest", "()Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "getId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenEvent$ShareScreenshotRequest, reason: from toString */
    public static final /* data */ class ShareScreenshotRequest extends MicrogramScreenDuxo2 {
        public static final int $stable = 8;
        private final UUID id;
        private final ShareScreenshotRequestDto request;

        public static /* synthetic */ ShareScreenshotRequest copy$default(ShareScreenshotRequest shareScreenshotRequest, ShareScreenshotRequestDto shareScreenshotRequestDto, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                shareScreenshotRequestDto = shareScreenshotRequest.request;
            }
            if ((i & 2) != 0) {
                uuid = shareScreenshotRequest.id;
            }
            return shareScreenshotRequest.copy(shareScreenshotRequestDto, uuid);
        }

        /* renamed from: component1, reason: from getter */
        public final ShareScreenshotRequestDto getRequest() {
            return this.request;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final ShareScreenshotRequest copy(ShareScreenshotRequestDto request, UUID id) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(id, "id");
            return new ShareScreenshotRequest(request, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ShareScreenshotRequest)) {
                return false;
            }
            ShareScreenshotRequest shareScreenshotRequest = (ShareScreenshotRequest) other;
            return Intrinsics.areEqual(this.request, shareScreenshotRequest.request) && Intrinsics.areEqual(this.id, shareScreenshotRequest.id);
        }

        public int hashCode() {
            return (this.request.hashCode() * 31) + this.id.hashCode();
        }

        public String toString() {
            return "ShareScreenshotRequest(request=" + this.request + ", id=" + this.id + ")";
        }

        public final ShareScreenshotRequestDto getRequest() {
            return this.request;
        }

        public final UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ShareScreenshotRequest(ShareScreenshotRequestDto request, UUID id) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(id, "id");
            this.request = request;
            this.id = id;
        }
    }

    /* compiled from: MicrogramScreenDuxo.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006HÆ\u0003J\t\u0010\u0010\u001a\u00020\bHÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R!\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;", "Lcom/robinhood/microgram/sdui/ScreenEvent;", "request", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/InvokeJavascriptRequest;", "Lmicrogram/ui/v1/screen_events/InvokeJavascriptRequestDto;", "Lcom/robinhood/microgram/sdui/AnyInvokeJavascriptRequest;", "id", "Ljava/util/UUID;", "<init>", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Ljava/util/UUID;)V", "getRequest", "()Lcom/robinhood/android/shared/serverui/utils/UiObject;", "getId", "()Ljava/util/UUID;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.microgram.sdui.ScreenEvent$InvokeJavascript, reason: from toString */
    public static final /* data */ class InvokeJavascript extends MicrogramScreenDuxo2 {
        public static final int $stable = 8;
        private final UUID id;
        private final UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> request;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ InvokeJavascript copy$default(InvokeJavascript invokeJavascript, UiObject uiObject, UUID uuid, int i, Object obj) {
            if ((i & 1) != 0) {
                uiObject = invokeJavascript.request;
            }
            if ((i & 2) != 0) {
                uuid = invokeJavascript.id;
            }
            return invokeJavascript.copy(uiObject, uuid);
        }

        public final UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> component1() {
            return this.request;
        }

        /* renamed from: component2, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        public final InvokeJavascript copy(UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> request, UUID id) {
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(id, "id");
            return new InvokeJavascript(request, id);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InvokeJavascript)) {
                return false;
            }
            InvokeJavascript invokeJavascript = (InvokeJavascript) other;
            return Intrinsics.areEqual(this.request, invokeJavascript.request) && Intrinsics.areEqual(this.id, invokeJavascript.id);
        }

        public int hashCode() {
            return (this.request.hashCode() * 31) + this.id.hashCode();
        }

        public String toString() {
            return "InvokeJavascript(request=" + this.request + ", id=" + this.id + ")";
        }

        public final UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> getRequest() {
            return this.request;
        }

        public final UUID getId() {
            return this.id;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvokeJavascript(UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto> request, UUID id) {
            super(null);
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(id, "id");
            this.request = request;
            this.id = id;
        }
    }
}
