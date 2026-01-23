package com.robinhood.android.microgramsdui.control;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.control.UiController;
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
import com.robinhood.utils.moshi.LazyMoshi;
import com.squareup.moshi.JsonAdapter;
import dispatch.core.Suspend;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KType;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.serialization.json.Json;
import microgram.Message;
import microgram.Message3;
import microgram.android.HostMessageDispatcher;
import microgram.android.internal.HostCompatibilityFlags;
import microgram.p507ui.core.screen.ActionTriggeredMessage;
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;
import microgram.p507ui.core.screen.ScreenAppearedMessage;
import microgram.p507ui.core.screen.ScreenDisappearedMessage;
import microgram.p507ui.core.screen.ScreenEventMessage;
import microgram.p507ui.core.screen.ScreenStateUpdatedMessage;
import microgram.p507ui.core.screen.ScreenTeardownMessage;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;
import microgram.p507ui.routing.RouterApi4;

/* compiled from: LegacyUiController.kt */
@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010A\u001a\u0002062\u0006\u0010B\u001a\u000205H\u0016J\u0018\u0010C\u001a\u0002062\u0006\u0010B\u001a\u0002052\u0006\u0010D\u001a\u000205H\u0002J\u0010\u0010E\u001a\u0002082\u0006\u0010F\u001a\u000205H\u0016J\u0018\u0010G\u001a\u00020:2\u0006\u0010F\u001a\u0002052\u0006\u0010H\u001a\u00020IH\u0016J\u0010\u0010J\u001a\u00020<2\u0006\u0010F\u001a\u000205H\u0016J$\u0010K\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020M\u0018\u00010Lj\u0004\u0018\u0001`N2\u0006\u0010O\u001a\u000205H\u0016J$\u0010P\u001a\u0016\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020Q\u0018\u00010Lj\u0004\u0018\u0001`R2\u0006\u0010O\u001a\u000205H\u0016J$\u0010S\u001a\u0016\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020T\u0018\u00010Lj\u0004\u0018\u0001`U2\u0006\u0010O\u001a\u000205H\u0016J\u001e\u0010V\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010X\u001a\u00020YH\u0082@¢\u0006\u0002\u0010ZJ\u001e\u0010[\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010\\\u001a\u000205H\u0096@¢\u0006\u0002\u0010]J&\u0010^\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010_\u001a\u0002052\u0006\u0010\\\u001a\u000205H\u0096@¢\u0006\u0002\u0010`J\u001e\u0010a\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010_\u001a\u000205H\u0096@¢\u0006\u0002\u0010]J\u0016\u0010b\u001a\u00020W2\u0006\u0010F\u001a\u000205H\u0096@¢\u0006\u0002\u0010cJ\u001e\u0010d\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010X\u001a\u00020eH\u0082@¢\u0006\u0002\u0010fJ*\u0010g\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0012\u0010h\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020j0iH\u0096@¢\u0006\u0002\u0010kJ\u001e\u0010l\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010\\\u001a\u000205H\u0096@¢\u0006\u0002\u0010]J\u0016\u0010m\u001a\u00020W2\u0006\u0010F\u001a\u000205H\u0096@¢\u0006\u0002\u0010cJ\u0016\u0010n\u001a\u00020W2\u0006\u0010F\u001a\u000205H\u0096@¢\u0006\u0002\u0010cJ\u0016\u0010o\u001a\u00020W2\u0006\u0010F\u001a\u000205H\u0096@¢\u0006\u0002\u0010cJ\u001e\u0010p\u001a\u00020W2\u0006\u0010F\u001a\u0002052\u0006\u0010X\u001a\u00020qH\u0096@¢\u0006\u0002\u0010rJ&\u0010s\u001a\u00020W2\u0006\u0010t\u001a\u00020u2\u0006\u0010F\u001a\u0002052\u0006\u0010v\u001a\u00020wH\u0097@¢\u0006\u0002\u0010xR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0010R!\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b%\u0010\u0010R!\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b)\u0010\u0010R!\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b-\u0010\u0010R!\u0010/\u001a\b\u0012\u0004\u0012\u0002000\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0012\u001a\u0004\b1\u0010\u0010R\u001a\u00103\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020604X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00107\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020804X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020:04X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020<04X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010=\u001a\u0002068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\u0012\u001a\u0004\b>\u0010?¨\u0006y"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/LegacyUiController;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "json", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "hostCompatibilityFlags", "Lmicrogram/android/internal/HostCompatibilityFlags;", "<init>", "(Lkotlinx/serialization/json/Json;Lcom/robinhood/utils/moshi/LazyMoshi;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/android/internal/HostCompatibilityFlags;)V", "embeddedSectionContentAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "getEmbeddedSectionContentAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "embeddedSectionContentAdapter$delegate", "Lkotlin/Lazy;", "standardScreenAdapter", "Lcom/robinhood/microgram/sdui/StandardScreen;", "getStandardScreenAdapter", "standardScreenAdapter$delegate", "htmlCanvasScreenAdapter", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "getHtmlCanvasScreenAdapter", "htmlCanvasScreenAdapter$delegate", "routerMessageAdapter", "Lcom/robinhood/microgram/sdui/RouterMessage;", "getRouterMessageAdapter", "routerMessageAdapter$delegate", "scrollRequestAdapter", "Lcom/robinhood/microgram/sdui/ScreenScrollRequest;", "getScrollRequestAdapter", "scrollRequestAdapter$delegate", "scrollToBottomRequestAdapter", "Lcom/robinhood/microgram/sdui/ScreenScrollToBottomRequest;", "getScrollToBottomRequestAdapter", "scrollToBottomRequestAdapter$delegate", "bottomSheetMessageAdapter", "Lcom/robinhood/microgram/sdui/BottomSheetMessage;", "getBottomSheetMessageAdapter", "bottomSheetMessageAdapter$delegate", "shareScreenshotRequestAdapter", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "getShareScreenshotRequestAdapter", "shareScreenshotRequestAdapter$delegate", "invokeJavascriptRequestAdapter", "Lcom/robinhood/microgram/sdui/InvokeJavascriptRequest;", "getInvokeJavascriptRequestAdapter", "invokeJavascriptRequestAdapter$delegate", "embeddedSectionViews", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "routerViews", "Lcom/robinhood/android/microgramsdui/control/UiController$RouterView;", "screenViews", "Lcom/robinhood/android/microgramsdui/control/UiController$ScreenView;", "bottomSheetViews", "Lcom/robinhood/android/microgramsdui/control/UiController$BottomSheetView;", "singletonEmbeddedSectionView", "getSingletonEmbeddedSectionView", "()Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "singletonEmbeddedSectionView$delegate", "dynamicEmbeddedSectionView", "routerIdentifier", "embeddedSectionView", "screenIdentifier", "routerView", "identifier", "screenView", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "bottomSheetView", "decodeEmbeddedSectionContent", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "source", "decodeStandardScreenContent", "Lmicrogram/ui/v1/StandardScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyStandardScreen;", "decodeHtmlCanvasScreenContent", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyHtmlCanvasScreen;", "sendRouterMessage", "", "message", "Lmicrogram/ui/routing/RouterApi$Inbound;", "(Ljava/lang/String;Lmicrogram/ui/routing/RouterApi$Inbound;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterAlertActionTriggered", "action", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastActionTriggered", "toastId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastDismissed", "notifyRouterTornDown", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenEvent", "Lmicrogram/ui/core/screen/ScreenEventMessage;", "(Ljava/lang/String;Lmicrogram/ui/core/screen/ScreenEventMessage;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenStatesUpdated", "states", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenActionTriggered", "notifyScreenAppeared", "notifyScreenDisappeared", "notifyScreenTornDown", "notifyHtmlCanvasAvailableArea", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "(Ljava/lang/String;Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyCustomScreenEvent", "type", "Lkotlin/reflect/KType;", "event", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "(Lkotlin/reflect/KType;Ljava/lang/String;Lmicrogram/ui/core/screen/CustomScreenEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class LegacyUiController implements UiController {
    public static final int $stable = 8;

    /* renamed from: bottomSheetMessageAdapter$delegate, reason: from kotlin metadata */
    private final Lazy bottomSheetMessageAdapter;
    private final ConcurrentHashMap<String, UiController.BottomSheetView> bottomSheetViews;

    /* renamed from: embeddedSectionContentAdapter$delegate, reason: from kotlin metadata */
    private final Lazy embeddedSectionContentAdapter;
    private final ConcurrentHashMap<String, UiController.EmbeddedSectionView> embeddedSectionViews;
    private final HostCompatibilityFlags hostCompatibilityFlags;

    /* renamed from: htmlCanvasScreenAdapter$delegate, reason: from kotlin metadata */
    private final Lazy htmlCanvasScreenAdapter;

    /* renamed from: invokeJavascriptRequestAdapter$delegate, reason: from kotlin metadata */
    private final Lazy invokeJavascriptRequestAdapter;
    private final Json json;
    private final HostMessageDispatcher messageDispatcher;
    private final LazyMoshi moshi;

    /* renamed from: routerMessageAdapter$delegate, reason: from kotlin metadata */
    private final Lazy routerMessageAdapter;
    private final ConcurrentHashMap<String, UiController.RouterView> routerViews;
    private final ConcurrentHashMap<String, UiController.ScreenView> screenViews;

    /* renamed from: scrollRequestAdapter$delegate, reason: from kotlin metadata */
    private final Lazy scrollRequestAdapter;

    /* renamed from: scrollToBottomRequestAdapter$delegate, reason: from kotlin metadata */
    private final Lazy scrollToBottomRequestAdapter;

    /* renamed from: shareScreenshotRequestAdapter$delegate, reason: from kotlin metadata */
    private final Lazy shareScreenshotRequestAdapter;

    /* renamed from: singletonEmbeddedSectionView$delegate, reason: from kotlin metadata */
    private final Lazy singletonEmbeddedSectionView;

    /* renamed from: standardScreenAdapter$delegate, reason: from kotlin metadata */
    private final Lazy standardScreenAdapter;

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController", m3645f = "LegacyUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE}, m3647m = "notifyCustomScreenEvent")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyCustomScreenEvent$1 */
    static final class C219331 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219331(Continuation<? super C219331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController.this.notifyCustomScreenEvent(null, null, null, this);
        }
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController", m3645f = "LegacyUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE}, m3647m = "notifyHtmlCanvasAvailableArea")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyHtmlCanvasAvailableArea$1 */
    static final class C219351 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219351(Continuation<? super C219351> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController.this.notifyHtmlCanvasAvailableArea(null, null, this);
        }
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController", m3645f = "LegacyUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE}, m3647m = "notifyScreenEvent")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyScreenEvent$1 */
    static final class C219371 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219371(Continuation<? super C219371> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController.this.notifyScreenEvent(null, null, this);
        }
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController", m3645f = "LegacyUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "notifyScreenStatesUpdated")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyScreenStatesUpdated$1 */
    static final class C219391 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C219391(Continuation<? super C219391> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController.this.notifyScreenStatesUpdated(null, null, this);
        }
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController", m3645f = "LegacyUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE}, m3647m = "sendRouterMessage")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$sendRouterMessage$1 */
    static final class C219421 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219421(Continuation<? super C219421> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return LegacyUiController.this.sendRouterMessage(null, null, this);
        }
    }

    public LegacyUiController(Json json, LazyMoshi moshi, HostMessageDispatcher messageDispatcher, HostCompatibilityFlags hostCompatibilityFlags) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
        this.json = json;
        this.moshi = moshi;
        this.messageDispatcher = messageDispatcher;
        this.hostCompatibilityFlags = hostCompatibilityFlags;
        this.embeddedSectionContentAdapter = LazyKt.lazy(new LegacyUiController$embeddedSectionContentAdapter$2(moshi));
        this.standardScreenAdapter = LazyKt.lazy(new LegacyUiController$standardScreenAdapter$2(moshi));
        this.htmlCanvasScreenAdapter = LazyKt.lazy(new LegacyUiController$htmlCanvasScreenAdapter$2(moshi));
        this.routerMessageAdapter = LazyKt.lazy(new LegacyUiController$routerMessageAdapter$2(moshi));
        this.scrollRequestAdapter = LazyKt.lazy(new LegacyUiController$scrollRequestAdapter$2(moshi));
        this.scrollToBottomRequestAdapter = LazyKt.lazy(new LegacyUiController$scrollToBottomRequestAdapter$2(moshi));
        this.bottomSheetMessageAdapter = LazyKt.lazy(new LegacyUiController$bottomSheetMessageAdapter$2(moshi));
        this.shareScreenshotRequestAdapter = LazyKt.lazy(new LegacyUiController$shareScreenshotRequestAdapter$2(moshi));
        this.invokeJavascriptRequestAdapter = LazyKt.lazy(new LegacyUiController$invokeJavascriptRequestAdapter$2(moshi));
        this.embeddedSectionViews = new ConcurrentHashMap<>();
        this.routerViews = new ConcurrentHashMap<>();
        this.screenViews = new ConcurrentHashMap<>();
        this.bottomSheetViews = new ConcurrentHashMap<>();
        this.singletonEmbeddedSectionView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.microgramsdui.control.LegacyUiController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LegacyUiController.singletonEmbeddedSectionView_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<EmbeddedSectionContent> getEmbeddedSectionContentAdapter() {
        return (JsonAdapter) this.embeddedSectionContentAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<StandardScreen> getStandardScreenAdapter() {
        return (JsonAdapter) this.standardScreenAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<HtmlCanvasScreen> getHtmlCanvasScreenAdapter() {
        return (JsonAdapter) this.htmlCanvasScreenAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<RouterMessage> getRouterMessageAdapter() {
        return (JsonAdapter) this.routerMessageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ScreenScrollRequest> getScrollRequestAdapter() {
        return (JsonAdapter) this.scrollRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ScreenScrollToBottomRequest> getScrollToBottomRequestAdapter() {
        return (JsonAdapter) this.scrollToBottomRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<BottomSheetMessage> getBottomSheetMessageAdapter() {
        return (JsonAdapter) this.bottomSheetMessageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ShareScreenshotRequestDto> getShareScreenshotRequestAdapter() {
        return (JsonAdapter) this.shareScreenshotRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<InvokeJavascriptRequest> getInvokeJavascriptRequestAdapter() {
        return (JsonAdapter) this.invokeJavascriptRequestAdapter.getValue();
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.EmbeddedSectionView getSingletonEmbeddedSectionView() {
        return (UiController.EmbeddedSectionView) this.singletonEmbeddedSectionView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiController.EmbeddedSectionView singletonEmbeddedSectionView_delegate$lambda$0(LegacyUiController legacyUiController) {
        return legacyUiController.embeddedSectionView("embedded-section-router", "section");
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.EmbeddedSectionView dynamicEmbeddedSectionView(String routerIdentifier) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        return embeddedSectionView(routerIdentifier, routerIdentifier + "_section");
    }

    private final UiController.EmbeddedSectionView embeddedSectionView(final String routerIdentifier, final String screenIdentifier) {
        UiController.EmbeddedSectionView embeddedSectionViewComputeIfAbsent = this.embeddedSectionViews.computeIfAbsent(routerIdentifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.LegacyUiController.embeddedSectionView.1
            @Override // java.util.function.Function
            public final UiController.EmbeddedSectionView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default2 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                LegacyUiController.this.messageDispatcher.registerMessageHandler(screenIdentifier, new C21916x1e5bb5b5(sharedFlow2MutableSharedFlow$default, LegacyUiController.this.getEmbeddedSectionContentAdapter()));
                LegacyUiController.this.messageDispatcher.registerMessageHandler(routerIdentifier, new C21917x1e5bb5b6(sharedFlow2MutableSharedFlow$default2, LegacyUiController.this.getRouterMessageAdapter()));
                return new UiController.EmbeddedSectionView(sharedFlow2MutableSharedFlow$default, sharedFlow2MutableSharedFlow$default2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(embeddedSectionViewComputeIfAbsent, "computeIfAbsent(...)");
        return embeddedSectionViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.RouterView routerView(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        UiController.RouterView routerViewComputeIfAbsent = this.routerViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.LegacyUiController.routerView.1
            @Override // java.util.function.Function
            public final UiController.RouterView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier, new LegacyUiController$routerView$1$apply$$inlined$messageHandler$1(sharedFlow2MutableSharedFlow$default, LegacyUiController.this.getRouterMessageAdapter(), LegacyUiController.this));
                return new UiController.RouterView(sharedFlow2MutableSharedFlow$default);
            }
        });
        Intrinsics.checkNotNullExpressionValue(routerViewComputeIfAbsent, "computeIfAbsent(...)");
        return routerViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.ScreenView screenView(final String identifier, final RouterMessage5 screenType) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(screenType, "screenType");
        UiController.ScreenView screenViewComputeIfAbsent = this.screenViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.LegacyUiController.screenView.1

            /* compiled from: LegacyUiController.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$screenView$1$WhenMappings */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RouterMessage5.values().length];
                    try {
                        iArr[RouterMessage5.CENTERED_CONTENT.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RouterMessage5.LIST.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RouterMessage5.HTML_CANVAS_CONTENT.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            @Override // java.util.function.Function
            public final UiController.ScreenView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default2 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default3 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default4 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default5 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier, new LegacyUiController$screenView$1$apply$$inlined$messageHandler$1(sharedFlow2MutableSharedFlow$default, screenType, LegacyUiController.this));
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier + ".scrollRequest", new LegacyUiController$screenView$1$apply$$inlined$messageHandler$2(sharedFlow2MutableSharedFlow$default2, LegacyUiController.this.getScrollRequestAdapter()));
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier + ".scrollToBottomRequest", new LegacyUiController$screenView$1$apply$$inlined$messageHandler$3(sharedFlow2MutableSharedFlow$default3, LegacyUiController.this.getScrollToBottomRequestAdapter()));
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier + ".shareScreenshotRequest", new LegacyUiController$screenView$1$apply$$inlined$messageHandler$4(sharedFlow2MutableSharedFlow$default4, LegacyUiController.this.getShareScreenshotRequestAdapter()));
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier + ".invokeJavascriptRequest", new LegacyUiController$screenView$1$apply$$inlined$messageHandler$5(sharedFlow2MutableSharedFlow$default5, LegacyUiController.this.getInvokeJavascriptRequestAdapter()));
                return new UiController.ScreenView(sharedFlow2MutableSharedFlow$default, sharedFlow2MutableSharedFlow$default2, sharedFlow2MutableSharedFlow$default3, sharedFlow2MutableSharedFlow$default4, sharedFlow2MutableSharedFlow$default5);
            }
        });
        Intrinsics.checkNotNullExpressionValue(screenViewComputeIfAbsent, "computeIfAbsent(...)");
        return screenViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.BottomSheetView bottomSheetView(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        UiController.BottomSheetView bottomSheetViewComputeIfAbsent = this.bottomSheetViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.LegacyUiController.bottomSheetView.1
            @Override // java.util.function.Function
            public final UiController.BottomSheetView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
                LegacyUiController.this.messageDispatcher.registerMessageHandler(identifier, new C21914xe930be6e(sharedFlow2MutableSharedFlow$default, LegacyUiController.this.getBottomSheetMessageAdapter()));
                return new UiController.BottomSheetView(sharedFlow2MutableSharedFlow$default);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bottomSheetViewComputeIfAbsent, "computeIfAbsent(...)");
        return bottomSheetViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> decodeEmbeddedSectionContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        EmbeddedSectionContent embeddedSectionContentFromJson = getEmbeddedSectionContentAdapter().fromJson(source);
        if (embeddedSectionContentFromJson != null) {
            return new UiObject.Legacy(embeddedSectionContentFromJson);
        }
        return null;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<StandardScreen, StandardScreenContentDto> decodeStandardScreenContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        StandardScreen standardScreenFromJson = getStandardScreenAdapter().fromJson(source);
        if (standardScreenFromJson != null) {
            return new UiObject.Legacy(standardScreenFromJson);
        }
        return null;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> decodeHtmlCanvasScreenContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        HtmlCanvasScreen htmlCanvasScreenFromJson = getHtmlCanvasScreenAdapter().fromJson(source);
        if (htmlCanvasScreenFromJson != null) {
            return new UiObject.Legacy(htmlCanvasScreenFromJson);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9.sendMessage(r8, (microgram.Message) r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendRouterMessage(String str, RouterApi4 routerApi4, Continuation<? super Unit> continuation) {
        C219421 c219421;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219421) {
            c219421 = (C219421) continuation;
            int i = c219421.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219421.label = i - Integer.MIN_VALUE;
            } else {
                c219421 = new C219421(continuation);
            }
        }
        Object obj = c219421.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219421.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            C219432 c219432 = new C219432(routerApi4, null);
            c219421.L$0 = hostMessageDispatcher2;
            c219421.L$1 = str;
            c219421.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219432, c219421, 1, null);
            if (objWithDefault$default != coroutine_suspended) {
                obj = objWithDefault$default;
                hostMessageDispatcher = hostMessageDispatcher2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str = (String) c219421.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219421.L$0;
        ResultKt.throwOnFailure(obj);
        c219421.L$0 = null;
        c219421.L$1 = null;
        c219421.label = 2;
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$sendRouterMessage$2", m3645f = "LegacyUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$sendRouterMessage$2 */
    static final class C219432 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ RouterApi4 $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219432(RouterApi4 routerApi4, Continuation<? super C219432> continuation) {
            super(2, continuation);
            this.$message = routerApi4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyUiController.this.new C219432(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219432) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Message3.encodeToMessage(LegacyUiController.this.json, Reflection.typeOf(RouterApi4.class), this.$message);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterAlertActionTriggered(String str, String str2, Continuation<? super Unit> continuation) {
        Object objSendRouterMessage = sendRouterMessage(str, new RouterApi4.AlertActionTriggered(str2), continuation);
        return objSendRouterMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendRouterMessage : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterToastActionTriggered(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        Object objSendRouterMessage = sendRouterMessage(str, new RouterApi4.ToastActionTriggered(str2, str3), continuation);
        return objSendRouterMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendRouterMessage : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterToastDismissed(String str, String str2, Continuation<? super Unit> continuation) {
        Object objSendRouterMessage = sendRouterMessage(str, new RouterApi4.ToastDismissed(str2), continuation);
        return objSendRouterMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendRouterMessage : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterTornDown(String str, Continuation<? super Unit> continuation) {
        if (this.hostCompatibilityFlags.getNeverTearDownAndroidUi()) {
            return Unit.INSTANCE;
        }
        Object objSendRouterMessage = sendRouterMessage(str, RouterApi4.Teardown.INSTANCE, continuation);
        return objSendRouterMessage == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objSendRouterMessage : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9.sendMessage(r8, (microgram.Message) r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object notifyScreenEvent(String str, ScreenEventMessage screenEventMessage, Continuation<? super Unit> continuation) {
        C219371 c219371;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219371) {
            c219371 = (C219371) continuation;
            int i = c219371.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219371.label = i - Integer.MIN_VALUE;
            } else {
                c219371 = new C219371(continuation);
            }
        }
        Object obj = c219371.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219371.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            C219382 c219382 = new C219382(screenEventMessage, null);
            c219371.L$0 = hostMessageDispatcher2;
            c219371.L$1 = str;
            c219371.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219382, c219371, 1, null);
            if (objWithDefault$default != coroutine_suspended) {
                obj = objWithDefault$default;
                hostMessageDispatcher = hostMessageDispatcher2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str = (String) c219371.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219371.L$0;
        ResultKt.throwOnFailure(obj);
        c219371.L$0 = null;
        c219371.L$1 = null;
        c219371.label = 2;
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$notifyScreenEvent$2", m3645f = "LegacyUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyScreenEvent$2 */
    static final class C219382 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ ScreenEventMessage $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219382(ScreenEventMessage screenEventMessage, Continuation<? super C219382> continuation) {
            super(2, continuation);
            this.$message = screenEventMessage;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyUiController.this.new C219382(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219382) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Message3.encodeToMessage(LegacyUiController.this.json, Reflection.typeOf(ScreenEventMessage.class), this.$message);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005f, code lost:
    
        if (notifyScreenEvent(r7, r8, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.microgramsdui.control.UiController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notifyScreenStatesUpdated(String str, Map<String, ? extends ComponentState> map, Continuation<? super Unit> continuation) {
        C219391 c219391;
        if (continuation instanceof C219391) {
            c219391 = (C219391) continuation;
            int i = c219391.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219391.label = i - Integer.MIN_VALUE;
            } else {
                c219391 = new C219391(continuation);
            }
        }
        Object objWithDefault$default = c219391.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219391.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithDefault$default);
            LegacyUiController$notifyScreenStatesUpdated$mappedStates$1 legacyUiController$notifyScreenStatesUpdated$mappedStates$1 = new LegacyUiController$notifyScreenStatesUpdated$mappedStates$1(map, this, null);
            c219391.L$0 = str;
            c219391.label = 1;
            objWithDefault$default = Suspend.withDefault$default(null, legacyUiController$notifyScreenStatesUpdated$mappedStates$1, c219391, 1, null);
            if (objWithDefault$default != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objWithDefault$default);
            return Unit.INSTANCE;
        }
        str = (String) c219391.L$0;
        ResultKt.throwOnFailure(objWithDefault$default);
        ScreenEventMessage screenStateUpdatedMessage = new ScreenStateUpdatedMessage((Map) objWithDefault$default);
        c219391.L$0 = null;
        c219391.label = 2;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenActionTriggered(String str, String str2, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, new ActionTriggeredMessage(str2), continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenAppeared(String str, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, ScreenAppearedMessage.INSTANCE, continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenDisappeared(String str, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, ScreenDisappearedMessage.INSTANCE, continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenTornDown(String str, Continuation<? super Unit> continuation) {
        if (this.hostCompatibilityFlags.getNeverTearDownAndroidUi()) {
            return Unit.INSTANCE;
        }
        Object objNotifyScreenEvent = notifyScreenEvent(str, ScreenTeardownMessage.INSTANCE, continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
    
        if (r9.sendMessage(r8, (microgram.Message) r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.microgramsdui.control.UiController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notifyHtmlCanvasAvailableArea(String str, HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, Continuation<? super Unit> continuation) {
        C219351 c219351;
        String str2;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219351) {
            c219351 = (C219351) continuation;
            int i = c219351.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219351.label = i - Integer.MIN_VALUE;
            } else {
                c219351 = new C219351(continuation);
            }
        }
        Object obj = c219351.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219351.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            str2 = str + ".htmlCanvasAvailableAreaMessage";
            C219362 c219362 = new C219362(htmlCanvasAvailableAreaMessageDto, null);
            c219351.L$0 = hostMessageDispatcher2;
            c219351.L$1 = str2;
            c219351.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219362, c219351, 1, null);
            if (objWithDefault$default != coroutine_suspended) {
                obj = objWithDefault$default;
                hostMessageDispatcher = hostMessageDispatcher2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str2 = (String) c219351.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219351.L$0;
        ResultKt.throwOnFailure(obj);
        c219351.L$0 = null;
        c219351.L$1 = null;
        c219351.label = 2;
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$notifyHtmlCanvasAvailableArea$2", m3645f = "LegacyUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyHtmlCanvasAvailableArea$2 */
    static final class C219362 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ HtmlCanvasAvailableAreaMessageDto $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219362(HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, Continuation<? super C219362> continuation) {
            super(2, continuation);
            this.$message = htmlCanvasAvailableAreaMessageDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyUiController.this.new C219362(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219362) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Message3.encodeToMessage(LegacyUiController.this.json, Reflection.typeOf(HtmlCanvasAvailableAreaMessageDto.class), this.$message);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0080, code lost:
    
        if (r10.sendMessage(r9, (microgram.Message) r12, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.microgramsdui.control.UiController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notifyCustomScreenEvent(KType kType, String str, CustomScreenEventCoordinator customScreenEventCoordinator, Continuation<? super Unit> continuation) {
        C219331 c219331;
        String str2;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219331) {
            c219331 = (C219331) continuation;
            int i = c219331.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219331.label = i - Integer.MIN_VALUE;
            } else {
                c219331 = new C219331(continuation);
            }
        }
        Object obj = c219331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219331.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            String str3 = str + "." + customScreenEventCoordinator.getEventDestination();
            C219342 c219342 = new C219342(kType, customScreenEventCoordinator, null);
            c219331.L$0 = hostMessageDispatcher2;
            c219331.L$1 = str3;
            c219331.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219342, c219331, 1, null);
            if (objWithDefault$default != coroutine_suspended) {
                obj = objWithDefault$default;
                str2 = str3;
                hostMessageDispatcher = hostMessageDispatcher2;
            }
            return coroutine_suspended;
        }
        if (i2 != 1) {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        str2 = (String) c219331.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219331.L$0;
        ResultKt.throwOnFailure(obj);
        c219331.L$0 = null;
        c219331.L$1 = null;
        c219331.label = 2;
    }

    /* compiled from: LegacyUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.LegacyUiController$notifyCustomScreenEvent$2", m3645f = "LegacyUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.control.LegacyUiController$notifyCustomScreenEvent$2 */
    static final class C219342 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ CustomScreenEventCoordinator $event;
        final /* synthetic */ KType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219342(KType kType, CustomScreenEventCoordinator customScreenEventCoordinator, Continuation<? super C219342> continuation) {
            super(2, continuation);
            this.$type = kType;
            this.$event = customScreenEventCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LegacyUiController.this.new C219342(this.$type, this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Message3.encodeToMessage(LegacyUiController.this.json, this.$type, this.$event);
        }
    }
}
