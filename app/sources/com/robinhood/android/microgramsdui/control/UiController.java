package com.robinhood.android.microgramsdui.control;

import com.robinhood.android.microgramsdui.MicrogramManager2;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.microgram.sdui.BottomSheetMessage;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import com.robinhood.microgram.sdui.HtmlCanvasScreen;
import com.robinhood.microgram.sdui.InvokeJavascriptRequest;
import com.robinhood.microgram.sdui.RouterMessage;
import com.robinhood.microgram.sdui.RouterMessage5;
import com.robinhood.microgram.sdui.ScreenScrollRequest;
import com.robinhood.microgram.sdui.ScreenScrollToBottomRequest;
import com.robinhood.microgram.sdui.StandardScreen;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlinx.coroutines.Deferred;
import kotlinx.coroutines.flow.SharedFlow;
import microgram.android.inject.MicrogramComponent;
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;
import microgram.p507ui.p508v1.BottomSheetOutboundMessageDto;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.RouterOutboundDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import microgram.p507ui.p508v1.screen_events.InvokeJavascriptRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollToBottomRequestDto;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: UiController.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bf\u0018\u0000 B2\u00020\u0001:\u0006=>?@ABJ\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\bH&J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH&J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000b\u001a\u00020\bH&J$\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0013j\u0004\u0018\u0001`\u00162\u0006\u0010\u0017\u001a\u00020\bH&J$\u0010\u0018\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0013j\u0004\u0018\u0001`\u001b2\u0006\u0010\u0017\u001a\u00020\bH&J$\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u0013j\u0004\u0018\u0001`\u001f2\u0006\u0010\u0017\u001a\u00020\bH&J\u001e\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH¦@¢\u0006\u0002\u0010#J&\u0010$\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010%\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH¦@¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH¦@¢\u0006\u0002\u0010#J\u0016\u0010(\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0002\u0010)J*\u0010*\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020-0,H¦@¢\u0006\u0002\u0010.J\u001e\u0010/\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\bH¦@¢\u0006\u0002\u0010#J\u0016\u00100\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0002\u0010)J\u0016\u00101\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0002\u0010)J\u0016\u00102\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\bH¦@¢\u0006\u0002\u0010)J\u001e\u00103\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u00104\u001a\u000205H¦@¢\u0006\u0002\u00106J&\u00107\u001a\u00020!2\u0006\u00108\u001a\u0002092\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010:\u001a\u00020;H§@¢\u0006\u0002\u0010<R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController;", "", "singletonEmbeddedSectionView", "Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "getSingletonEmbeddedSectionView", "()Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "dynamicEmbeddedSectionView", "routerIdentifier", "", "routerView", "Lcom/robinhood/android/microgramsdui/control/UiController$RouterView;", "identifier", "screenView", "Lcom/robinhood/android/microgramsdui/control/UiController$ScreenView;", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "bottomSheetView", "Lcom/robinhood/android/microgramsdui/control/UiController$BottomSheetView;", "decodeEmbeddedSectionContent", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "source", "decodeStandardScreenContent", "Lcom/robinhood/microgram/sdui/StandardScreen;", "Lmicrogram/ui/v1/StandardScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyStandardScreen;", "decodeHtmlCanvasScreenContent", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyHtmlCanvasScreen;", "notifyRouterAlertActionTriggered", "", "action", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastActionTriggered", "toastId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastDismissed", "notifyRouterTornDown", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenStatesUpdated", "states", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenActionTriggered", "notifyScreenAppeared", "notifyScreenDisappeared", "notifyScreenTornDown", "notifyHtmlCanvasAvailableArea", "message", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "(Ljava/lang/String;Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyCustomScreenEvent", "type", "Lkotlin/reflect/KType;", "event", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "(Lkotlin/reflect/KType;Ljava/lang/String;Lmicrogram/ui/core/screen/CustomScreenEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "EmbeddedSectionView", "RouterView", "ScreenView", "BottomSheetView", "Component", "Companion", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface UiController {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final String EMBEDDED_SECTION_ROUTER_IDENTIFIER = "embedded-section-router";
    public static final String EMBEDDED_SECTION_SCREEN_IDENTIFIER = "section";

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$Component;", "", "uiControllerAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "getUiControllerAsync", "()Lkotlinx/coroutines/Deferred;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Component {
        Deferred<UiController> getUiControllerAsync();
    }

    BottomSheetView bottomSheetView(String identifier);

    UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> decodeEmbeddedSectionContent(String source);

    UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> decodeHtmlCanvasScreenContent(String source);

    UiObject<StandardScreen, StandardScreenContentDto> decodeStandardScreenContent(String source);

    EmbeddedSectionView dynamicEmbeddedSectionView(String routerIdentifier);

    EmbeddedSectionView getSingletonEmbeddedSectionView();

    Object notifyCustomScreenEvent(KType kType, String str, CustomScreenEventCoordinator customScreenEventCoordinator, Continuation<? super Unit> continuation);

    Object notifyHtmlCanvasAvailableArea(String str, HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, Continuation<? super Unit> continuation);

    Object notifyRouterAlertActionTriggered(String str, String str2, Continuation<? super Unit> continuation);

    Object notifyRouterToastActionTriggered(String str, String str2, String str3, Continuation<? super Unit> continuation);

    Object notifyRouterToastDismissed(String str, String str2, Continuation<? super Unit> continuation);

    Object notifyRouterTornDown(String str, Continuation<? super Unit> continuation);

    Object notifyScreenActionTriggered(String str, String str2, Continuation<? super Unit> continuation);

    Object notifyScreenAppeared(String str, Continuation<? super Unit> continuation);

    Object notifyScreenDisappeared(String str, Continuation<? super Unit> continuation);

    Object notifyScreenStatesUpdated(String str, Map<String, ? extends ComponentState> map, Continuation<? super Unit> continuation);

    Object notifyScreenTornDown(String str, Continuation<? super Unit> continuation);

    RouterView routerView(String identifier);

    ScreenView screenView(String identifier, RouterMessage5 screenType);

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001BC\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003\u0012\u001c\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b0\u0003¢\u0006\u0004\b\f\u0010\rR'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR'\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0004j\u0002`\u000b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "", "state", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "events", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lmicrogram/ui/v1/RouterOutboundDto;", "Lcom/robinhood/microgram/sdui/AnyRouterMessage;", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;)V", "getState", "()Lkotlinx/coroutines/flow/SharedFlow;", "getEvents", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EmbeddedSectionView {
        public static final int $stable = 8;
        private final SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> events;
        private final SharedFlow<UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto>> state;

        /* JADX WARN: Multi-variable type inference failed */
        public EmbeddedSectionView(SharedFlow<? extends UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto>> state, SharedFlow<? extends UiObject<? extends RouterMessage, RouterOutboundDto>> events) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(events, "events");
            this.state = state;
            this.events = events;
        }

        public final SharedFlow<UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto>> getState() {
            return this.state;
        }

        public final SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> getEvents() {
            return this.events;
        }
    }

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003¢\u0006\u0004\b\b\u0010\tR'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$RouterView;", "", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/RouterMessage;", "Lmicrogram/ui/v1/RouterOutboundDto;", "Lcom/robinhood/microgram/sdui/AnyRouterMessage;", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;)V", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RouterView {
        public static final int $stable = 8;
        private final SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> events;

        /* JADX WARN: Multi-variable type inference failed */
        public RouterView(SharedFlow<? extends UiObject<? extends RouterMessage, RouterOutboundDto>> events) {
            Intrinsics.checkNotNullParameter(events, "events");
            this.events = events;
        }

        public final SharedFlow<UiObject<RouterMessage, RouterOutboundDto>> getEvents() {
            return this.events;
        }
    }

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003\u0012\u001c\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b0\u0003\u0012\u001c\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\f0\u0003\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003\u0012\u001c\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0004j\u0002`\u00120\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0002\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R'\u0010\u0005\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004j\u0002`\b0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R'\u0010\t\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\u0004j\u0002`\f0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R'\u0010\u000f\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u0004j\u0002`\u00120\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$ScreenView;", "", "state", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "scrollRequestEvents", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest;", "Lmicrogram/ui/v1/screen_events/ScrollRequestDto;", "Lcom/robinhood/microgram/sdui/AnyScrollRequest;", "scrollToBottomRequestEvents", "Lcom/robinhood/microgram/sdui/ScreenScrollToBottomRequest;", "Lmicrogram/ui/v1/screen_events/ScrollToBottomRequestDto;", "Lcom/robinhood/microgram/sdui/AnyScrollToBottomRequest;", "shareScreenshotRequestEvents", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "invokeJavascriptRequestEvents", "Lcom/robinhood/microgram/sdui/InvokeJavascriptRequest;", "Lmicrogram/ui/v1/screen_events/InvokeJavascriptRequestDto;", "Lcom/robinhood/microgram/sdui/AnyInvokeJavascriptRequest;", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;Lkotlinx/coroutines/flow/SharedFlow;)V", "getState", "()Lkotlinx/coroutines/flow/SharedFlow;", "getScrollRequestEvents", "getScrollToBottomRequestEvents", "getShareScreenshotRequestEvents", "getInvokeJavascriptRequestEvents", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ScreenView {
        public static final int $stable = 8;
        private final SharedFlow<UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto>> invokeJavascriptRequestEvents;
        private final SharedFlow<UiObject<ScreenScrollRequest, ScrollRequestDto>> scrollRequestEvents;
        private final SharedFlow<UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto>> scrollToBottomRequestEvents;
        private final SharedFlow<ShareScreenshotRequestDto> shareScreenshotRequestEvents;
        private final SharedFlow<UiObject<?, ?>> state;

        /* JADX WARN: Multi-variable type inference failed */
        public ScreenView(SharedFlow<? extends UiObject<?, ?>> state, SharedFlow<? extends UiObject<ScreenScrollRequest, ScrollRequestDto>> scrollRequestEvents, SharedFlow<? extends UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto>> scrollToBottomRequestEvents, SharedFlow<ShareScreenshotRequestDto> shareScreenshotRequestEvents, SharedFlow<? extends UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto>> invokeJavascriptRequestEvents) {
            Intrinsics.checkNotNullParameter(state, "state");
            Intrinsics.checkNotNullParameter(scrollRequestEvents, "scrollRequestEvents");
            Intrinsics.checkNotNullParameter(scrollToBottomRequestEvents, "scrollToBottomRequestEvents");
            Intrinsics.checkNotNullParameter(shareScreenshotRequestEvents, "shareScreenshotRequestEvents");
            Intrinsics.checkNotNullParameter(invokeJavascriptRequestEvents, "invokeJavascriptRequestEvents");
            this.state = state;
            this.scrollRequestEvents = scrollRequestEvents;
            this.scrollToBottomRequestEvents = scrollToBottomRequestEvents;
            this.shareScreenshotRequestEvents = shareScreenshotRequestEvents;
            this.invokeJavascriptRequestEvents = invokeJavascriptRequestEvents;
        }

        public final SharedFlow<UiObject<?, ?>> getState() {
            return this.state;
        }

        public final SharedFlow<UiObject<ScreenScrollRequest, ScrollRequestDto>> getScrollRequestEvents() {
            return this.scrollRequestEvents;
        }

        public final SharedFlow<UiObject<ScreenScrollToBottomRequest, ScrollToBottomRequestDto>> getScrollToBottomRequestEvents() {
            return this.scrollToBottomRequestEvents;
        }

        public final SharedFlow<ShareScreenshotRequestDto> getShareScreenshotRequestEvents() {
            return this.shareScreenshotRequestEvents;
        }

        public final SharedFlow<UiObject<InvokeJavascriptRequest, InvokeJavascriptRequestDto>> getInvokeJavascriptRequestEvents() {
            return this.invokeJavascriptRequestEvents;
        }
    }

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u001c\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003¢\u0006\u0004\b\b\u0010\tR'\u0010\u0002\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u0002`\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$BottomSheetView;", "", "events", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/BottomSheetMessage;", "Lmicrogram/ui/v1/BottomSheetOutboundMessageDto;", "Lcom/robinhood/microgram/sdui/AnyBottomSheetMessage;", "<init>", "(Lkotlinx/coroutines/flow/SharedFlow;)V", "getEvents", "()Lkotlinx/coroutines/flow/SharedFlow;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class BottomSheetView {
        public static final int $stable = 8;
        private final SharedFlow<UiObject<BottomSheetMessage, BottomSheetOutboundMessageDto>> events;

        /* JADX WARN: Multi-variable type inference failed */
        public BottomSheetView(SharedFlow<? extends UiObject<? extends BottomSheetMessage, BottomSheetOutboundMessageDto>> events) {
            Intrinsics.checkNotNullParameter(events, "events");
            this.events = events;
        }

        public final SharedFlow<UiObject<BottomSheetMessage, BottomSheetOutboundMessageDto>> getEvents() {
            return this.events;
        }
    }

    /* compiled from: UiController.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\r\u001a\u00020\t*\u00020\u000eH\u0086@¢\u0006\u0002\u0010\u000fJ\u0018\u0010\r\u001a\u00020\t*\b\u0012\u0004\u0012\u00020\u000e0\bH\u0086@¢\u0006\u0002\u0010\u0010R\u000e\u0010\u0004\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0080T¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b*\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/UiController$Companion;", "", "<init>", "()V", "EMBEDDED_SECTION_ROUTER_IDENTIFIER", "", "EMBEDDED_SECTION_SCREEN_IDENTIFIER", "uiControllerAsync", "Lkotlinx/coroutines/Deferred;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "Lmicrogram/android/inject/MicrogramComponent;", "getUiControllerAsync", "(Lmicrogram/android/inject/MicrogramComponent;)Lkotlinx/coroutines/Deferred;", "uiController", "Lcom/robinhood/android/microgramsdui/MicrogramInstance;", "(Lcom/robinhood/android/microgramsdui/MicrogramInstance;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lkotlinx/coroutines/Deferred;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final String EMBEDDED_SECTION_ROUTER_IDENTIFIER = "embedded-section-router";
        public static final String EMBEDDED_SECTION_SCREEN_IDENTIFIER = "section";

        private Companion() {
        }

        public final Deferred<UiController> getUiControllerAsync(MicrogramComponent microgramComponent) {
            Intrinsics.checkNotNullParameter(microgramComponent, "<this>");
            return ((Component) microgramComponent).getUiControllerAsync();
        }

        public final Object uiController(MicrogramManager2 microgramManager2, Continuation<? super UiController> continuation) {
            return getUiControllerAsync(microgramManager2.getComponent()).await(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object uiController(Deferred<MicrogramManager2> deferred, Continuation<? super UiController> continuation) {
            UiController2 uiController2;
            Companion companion;
            if (continuation instanceof UiController2) {
                uiController2 = (UiController2) continuation;
                int i = uiController2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    uiController2.label = i - Integer.MIN_VALUE;
                } else {
                    uiController2 = new UiController2(this, continuation);
                }
            }
            Object objAwait = uiController2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = uiController2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(objAwait);
                uiController2.L$0 = this;
                uiController2.label = 1;
                objAwait = deferred.await(uiController2);
                if (objAwait != coroutine_suspended) {
                    companion = this;
                }
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objAwait);
                return objAwait;
            }
            companion = (Companion) uiController2.L$0;
            ResultKt.throwOnFailure(objAwait);
            uiController2.L$0 = null;
            uiController2.label = 2;
            Object objUiController = companion.uiController((MicrogramManager2) objAwait, uiController2);
            return objUiController == coroutine_suspended ? coroutine_suspended : objUiController;
        }
    }
}
