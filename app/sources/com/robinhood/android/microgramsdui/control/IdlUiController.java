package com.robinhood.android.microgramsdui.control;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.microgramsdui.control.UiController;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.microgram.sdui.EmbeddedSectionContent;
import com.robinhood.microgram.sdui.HtmlCanvasScreen;
import com.robinhood.microgram.sdui.RouterMessage5;
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
import microgram.p507ui.core.screen.CustomScreenEventCoordinator;
import microgram.p507ui.p508v1.BottomSheetOutboundMessageDto;
import microgram.p507ui.p508v1.EmbeddedSectionContentDto;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.RouterInboundDto;
import microgram.p507ui.p508v1.RouterOutboundDto;
import microgram.p507ui.p508v1.ScreenEventMessageDto;
import microgram.p507ui.p508v1.StandardScreenContentDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import microgram.p507ui.p508v1.screen_events.InvokeJavascriptRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollRequestDto;
import microgram.p507ui.p508v1.screen_events.ScrollToBottomRequestDto;
import microgram.p507ui.p508v1.screen_events.ShareScreenshotRequestDto;

/* compiled from: IdlUiController.kt */
@Metadata(m3635d1 = {"\u0000\u0088\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B+\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010I\u001a\u00020>2\u0006\u0010J\u001a\u00020=H\u0016J\u0018\u0010K\u001a\u00020>2\u0006\u0010J\u001a\u00020=2\u0006\u0010L\u001a\u00020=H\u0002J\u0010\u0010M\u001a\u00020@2\u0006\u0010N\u001a\u00020=H\u0016J\u0018\u0010O\u001a\u00020B2\u0006\u0010N\u001a\u00020=2\u0006\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020D2\u0006\u0010N\u001a\u00020=H\u0016J$\u0010S\u001a\u0016\u0012\u0004\u0012\u00020U\u0012\u0004\u0012\u00020\u0018\u0018\u00010Tj\u0004\u0018\u0001`V2\u0006\u0010W\u001a\u00020=H\u0016J$\u0010X\u001a\u0016\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\u001c\u0018\u00010Tj\u0004\u0018\u0001`Z2\u0006\u0010W\u001a\u00020=H\u0016J$\u0010[\u001a\u0016\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020 \u0018\u00010Tj\u0004\u0018\u0001`]2\u0006\u0010W\u001a\u00020=H\u0016J\u001e\u0010^\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010`\u001a\u00020=H\u0096@¢\u0006\u0002\u0010aJ&\u0010b\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010c\u001a\u00020=2\u0006\u0010`\u001a\u00020=H\u0096@¢\u0006\u0002\u0010dJ\u001e\u0010e\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010c\u001a\u00020=H\u0096@¢\u0006\u0002\u0010aJ\u0016\u0010f\u001a\u00020_2\u0006\u0010N\u001a\u00020=H\u0096@¢\u0006\u0002\u0010gJ\u001e\u0010h\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010i\u001a\u00020jH\u0082@¢\u0006\u0002\u0010kJ*\u0010l\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0012\u0010m\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020o0nH\u0096@¢\u0006\u0002\u0010pJ\u001e\u0010q\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010`\u001a\u00020=H\u0096@¢\u0006\u0002\u0010aJ\u0016\u0010r\u001a\u00020_2\u0006\u0010N\u001a\u00020=H\u0096@¢\u0006\u0002\u0010gJ\u0016\u0010s\u001a\u00020_2\u0006\u0010N\u001a\u00020=H\u0096@¢\u0006\u0002\u0010gJ\u0016\u0010t\u001a\u00020_2\u0006\u0010N\u001a\u00020=H\u0096@¢\u0006\u0002\u0010gJ\u001e\u0010u\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010i\u001a\u00020vH\u0082@¢\u0006\u0002\u0010wJ\u001e\u0010x\u001a\u00020_2\u0006\u0010N\u001a\u00020=2\u0006\u0010i\u001a\u00020yH\u0096@¢\u0006\u0002\u0010zJ'\u0010{\u001a\u00020_2\u0006\u0010|\u001a\u00020}2\u0006\u0010N\u001a\u00020=2\u0006\u0010~\u001a\u00020\u007fH\u0097@¢\u0006\u0003\u0010\u0080\u0001R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R!\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0012\u001a\u0004\b\u0015\u0010\u0010R!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0019\u0010\u0010R!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0012\u001a\u0004\b\u001d\u0010\u0010R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020 0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0012\u001a\u0004\b!\u0010\u0010R!\u0010#\u001a\b\u0012\u0004\u0012\u00020$0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010\u0012\u001a\u0004\b%\u0010\u0010R!\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010\u0012\u001a\u0004\b)\u0010\u0010R!\u0010+\u001a\b\u0012\u0004\u0012\u00020,0\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0012\u001a\u0004\b-\u0010\u0010R!\u0010/\u001a\b\u0012\u0004\u0012\u0002000\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010\u0012\u001a\u0004\b1\u0010\u0010R!\u00103\u001a\b\u0012\u0004\u0012\u0002040\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0012\u001a\u0004\b5\u0010\u0010R!\u00107\u001a\b\u0012\u0004\u0012\u0002080\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010\u0012\u001a\u0004\b9\u0010\u0010R\u001a\u0010;\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010?\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020@0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010A\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020B0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010C\u001a\u000e\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020D0<X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010E\u001a\u00020>8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\bH\u0010\u0012\u001a\u0004\bF\u0010G¨\u0006\u0081\u0001"}, m3636d2 = {"Lcom/robinhood/android/microgramsdui/control/IdlUiController;", "Lcom/robinhood/android/microgramsdui/control/UiController;", "json", "Lkotlinx/serialization/json/Json;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "messageDispatcher", "Lmicrogram/android/HostMessageDispatcher;", "hostCompatibilityFlags", "Lmicrogram/android/internal/HostCompatibilityFlags;", "<init>", "(Lkotlinx/serialization/json/Json;Lcom/robinhood/utils/moshi/LazyMoshi;Lmicrogram/android/HostMessageDispatcher;Lmicrogram/android/internal/HostCompatibilityFlags;)V", "routerInboundDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lmicrogram/ui/v1/RouterInboundDto;", "getRouterInboundDtoAdapter", "()Lcom/squareup/moshi/JsonAdapter;", "routerInboundDtoAdapter$delegate", "Lkotlin/Lazy;", "screenEventMessageAdapter", "Lmicrogram/ui/v1/ScreenEventMessageDto;", "getScreenEventMessageAdapter", "screenEventMessageAdapter$delegate", "embeddedSectionContentAdapter", "Lmicrogram/ui/v1/EmbeddedSectionContentDto;", "getEmbeddedSectionContentAdapter", "embeddedSectionContentAdapter$delegate", "standardScreenAdapter", "Lmicrogram/ui/v1/StandardScreenContentDto;", "getStandardScreenAdapter", "standardScreenAdapter$delegate", "htmlCanvasScreenAdapter", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "getHtmlCanvasScreenAdapter", "htmlCanvasScreenAdapter$delegate", "routerMessageAdapter", "Lmicrogram/ui/v1/RouterOutboundDto;", "getRouterMessageAdapter", "routerMessageAdapter$delegate", "bottomSheetMessageAdapter", "Lmicrogram/ui/v1/BottomSheetOutboundMessageDto;", "getBottomSheetMessageAdapter", "bottomSheetMessageAdapter$delegate", "scrollRequestAdapter", "Lmicrogram/ui/v1/screen_events/ScrollRequestDto;", "getScrollRequestAdapter", "scrollRequestAdapter$delegate", "scrollToBottomRequestAdapter", "Lmicrogram/ui/v1/screen_events/ScrollToBottomRequestDto;", "getScrollToBottomRequestAdapter", "scrollToBottomRequestAdapter$delegate", "shareScreenshotRequestAdapter", "Lmicrogram/ui/v1/screen_events/ShareScreenshotRequestDto;", "getShareScreenshotRequestAdapter", "shareScreenshotRequestAdapter$delegate", "invokeJavascriptRequestAdapter", "Lmicrogram/ui/v1/screen_events/InvokeJavascriptRequestDto;", "getInvokeJavascriptRequestAdapter", "invokeJavascriptRequestAdapter$delegate", "embeddedSectionViews", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "routerViews", "Lcom/robinhood/android/microgramsdui/control/UiController$RouterView;", "screenViews", "Lcom/robinhood/android/microgramsdui/control/UiController$ScreenView;", "bottomSheetViews", "Lcom/robinhood/android/microgramsdui/control/UiController$BottomSheetView;", "singletonEmbeddedSectionView", "getSingletonEmbeddedSectionView", "()Lcom/robinhood/android/microgramsdui/control/UiController$EmbeddedSectionView;", "singletonEmbeddedSectionView$delegate", "dynamicEmbeddedSectionView", "routerIdentifier", "embeddedSectionView", "screenIdentifier", "routerView", "identifier", "screenView", "screenType", "Lcom/robinhood/microgram/sdui/ScreenType;", "bottomSheetView", "decodeEmbeddedSectionContent", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/EmbeddedSectionContent;", "Lcom/robinhood/microgram/sdui/AnyEmbeddedSectionContent;", "source", "decodeStandardScreenContent", "Lcom/robinhood/microgram/sdui/StandardScreen;", "Lcom/robinhood/microgram/sdui/AnyStandardScreen;", "decodeHtmlCanvasScreenContent", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Lcom/robinhood/microgram/sdui/AnyHtmlCanvasScreen;", "notifyRouterAlertActionTriggered", "", "action", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastActionTriggered", "toastId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterToastDismissed", "notifyRouterTornDown", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyRouterEvent", "message", "Lmicrogram/ui/v1/RouterInboundDto$ConcreteDto;", "(Ljava/lang/String;Lmicrogram/ui/v1/RouterInboundDto$ConcreteDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenStatesUpdated", "states", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "(Ljava/lang/String;Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyScreenActionTriggered", "notifyScreenAppeared", "notifyScreenDisappeared", "notifyScreenTornDown", "notifyScreenEvent", "Lmicrogram/ui/v1/ScreenEventMessageDto$ConcreteDto;", "(Ljava/lang/String;Lmicrogram/ui/v1/ScreenEventMessageDto$ConcreteDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyHtmlCanvasAvailableArea", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "(Ljava/lang/String;Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "notifyCustomScreenEvent", "type", "Lkotlin/reflect/KType;", "event", "Lmicrogram/ui/core/screen/CustomScreenEvent;", "(Lkotlin/reflect/KType;Ljava/lang/String;Lmicrogram/ui/core/screen/CustomScreenEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram-sdui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class IdlUiController implements UiController {
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

    /* renamed from: routerInboundDtoAdapter$delegate, reason: from kotlin metadata */
    private final Lazy routerInboundDtoAdapter;

    /* renamed from: routerMessageAdapter$delegate, reason: from kotlin metadata */
    private final Lazy routerMessageAdapter;
    private final ConcurrentHashMap<String, UiController.RouterView> routerViews;

    /* renamed from: screenEventMessageAdapter$delegate, reason: from kotlin metadata */
    private final Lazy screenEventMessageAdapter;
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

    /* compiled from: IdlUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController", m3645f = "IdlUiController.kt", m3646l = {WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, 334}, m3647m = "notifyCustomScreenEvent")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyCustomScreenEvent$1 */
    static final class C219021 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219021(Continuation<? super C219021> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController.this.notifyCustomScreenEvent(null, null, null, this);
        }
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController", m3645f = "IdlUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE}, m3647m = "notifyHtmlCanvasAvailableArea")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyHtmlCanvasAvailableArea$1 */
    static final class C219041 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219041(Continuation<? super C219041> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController.this.notifyHtmlCanvasAvailableArea(null, null, this);
        }
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController", m3645f = "IdlUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE}, m3647m = "notifyRouterEvent")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyRouterEvent$1 */
    static final class C219061 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219061(Continuation<? super C219061> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController.this.notifyRouterEvent(null, null, this);
        }
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController", m3645f = "IdlUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 316}, m3647m = "notifyScreenEvent")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyScreenEvent$1 */
    static final class C219081 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C219081(Continuation<? super C219081> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController.this.notifyScreenEvent(null, null, this);
        }
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController", m3645f = "IdlUiController.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE}, m3647m = "notifyScreenStatesUpdated")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyScreenStatesUpdated$1 */
    static final class C219101 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C219101(Continuation<? super C219101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdlUiController.this.notifyScreenStatesUpdated(null, null, this);
        }
    }

    public IdlUiController(Json json, LazyMoshi moshi, HostMessageDispatcher messageDispatcher, HostCompatibilityFlags hostCompatibilityFlags) {
        Intrinsics.checkNotNullParameter(json, "json");
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        Intrinsics.checkNotNullParameter(messageDispatcher, "messageDispatcher");
        Intrinsics.checkNotNullParameter(hostCompatibilityFlags, "hostCompatibilityFlags");
        this.json = json;
        this.moshi = moshi;
        this.messageDispatcher = messageDispatcher;
        this.hostCompatibilityFlags = hostCompatibilityFlags;
        this.routerInboundDtoAdapter = LazyKt.lazy(new IdlUiController$routerInboundDtoAdapter$2(moshi));
        this.screenEventMessageAdapter = LazyKt.lazy(new IdlUiController$screenEventMessageAdapter$2(moshi));
        this.embeddedSectionContentAdapter = LazyKt.lazy(new IdlUiController$embeddedSectionContentAdapter$2(moshi));
        this.standardScreenAdapter = LazyKt.lazy(new IdlUiController$standardScreenAdapter$2(moshi));
        this.htmlCanvasScreenAdapter = LazyKt.lazy(new IdlUiController$htmlCanvasScreenAdapter$2(moshi));
        this.routerMessageAdapter = LazyKt.lazy(new IdlUiController$routerMessageAdapter$2(moshi));
        this.bottomSheetMessageAdapter = LazyKt.lazy(new IdlUiController$bottomSheetMessageAdapter$2(moshi));
        this.scrollRequestAdapter = LazyKt.lazy(new IdlUiController$scrollRequestAdapter$2(moshi));
        this.scrollToBottomRequestAdapter = LazyKt.lazy(new IdlUiController$scrollToBottomRequestAdapter$2(moshi));
        this.shareScreenshotRequestAdapter = LazyKt.lazy(new IdlUiController$shareScreenshotRequestAdapter$2(moshi));
        this.invokeJavascriptRequestAdapter = LazyKt.lazy(new IdlUiController$invokeJavascriptRequestAdapter$2(moshi));
        this.embeddedSectionViews = new ConcurrentHashMap<>();
        this.routerViews = new ConcurrentHashMap<>();
        this.screenViews = new ConcurrentHashMap<>();
        this.bottomSheetViews = new ConcurrentHashMap<>();
        this.singletonEmbeddedSectionView = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return IdlUiController.singletonEmbeddedSectionView_delegate$lambda$0(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<RouterInboundDto> getRouterInboundDtoAdapter() {
        return (JsonAdapter) this.routerInboundDtoAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ScreenEventMessageDto> getScreenEventMessageAdapter() {
        return (JsonAdapter) this.screenEventMessageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<EmbeddedSectionContentDto> getEmbeddedSectionContentAdapter() {
        return (JsonAdapter) this.embeddedSectionContentAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<StandardScreenContentDto> getStandardScreenAdapter() {
        return (JsonAdapter) this.standardScreenAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<HtmlCanvasScreenContentDto> getHtmlCanvasScreenAdapter() {
        return (JsonAdapter) this.htmlCanvasScreenAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<RouterOutboundDto> getRouterMessageAdapter() {
        return (JsonAdapter) this.routerMessageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<BottomSheetOutboundMessageDto> getBottomSheetMessageAdapter() {
        return (JsonAdapter) this.bottomSheetMessageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ScrollRequestDto> getScrollRequestAdapter() {
        return (JsonAdapter) this.scrollRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ScrollToBottomRequestDto> getScrollToBottomRequestAdapter() {
        return (JsonAdapter) this.scrollToBottomRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<ShareScreenshotRequestDto> getShareScreenshotRequestAdapter() {
        return (JsonAdapter) this.shareScreenshotRequestAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final JsonAdapter<InvokeJavascriptRequestDto> getInvokeJavascriptRequestAdapter() {
        return (JsonAdapter) this.invokeJavascriptRequestAdapter.getValue();
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.EmbeddedSectionView getSingletonEmbeddedSectionView() {
        return (UiController.EmbeddedSectionView) this.singletonEmbeddedSectionView.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiController.EmbeddedSectionView singletonEmbeddedSectionView_delegate$lambda$0(IdlUiController idlUiController) {
        return idlUiController.embeddedSectionView("embedded-section-router", "section");
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.EmbeddedSectionView dynamicEmbeddedSectionView(String routerIdentifier) {
        Intrinsics.checkNotNullParameter(routerIdentifier, "routerIdentifier");
        return embeddedSectionView(routerIdentifier, routerIdentifier + "_section");
    }

    private final UiController.EmbeddedSectionView embeddedSectionView(final String routerIdentifier, final String screenIdentifier) {
        UiController.EmbeddedSectionView embeddedSectionViewComputeIfAbsent = this.embeddedSectionViews.computeIfAbsent(routerIdentifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController.embeddedSectionView.1
            @Override // java.util.function.Function
            public final UiController.EmbeddedSectionView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
                SharedFlow2 sharedFlow2MutableSharedFlow$default2 = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                IdlUiController.this.messageDispatcher.registerMessageHandler(screenIdentifier, new C21883xc19eaa5d(sharedFlow2MutableSharedFlow$default, IdlUiController.this.getEmbeddedSectionContentAdapter()));
                IdlUiController.this.messageDispatcher.registerMessageHandler(routerIdentifier, new C21884xc19eaa5e(sharedFlow2MutableSharedFlow$default2, IdlUiController.this.getRouterMessageAdapter()));
                return new UiController.EmbeddedSectionView(sharedFlow2MutableSharedFlow$default, sharedFlow2MutableSharedFlow$default2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(embeddedSectionViewComputeIfAbsent, "computeIfAbsent(...)");
        return embeddedSectionViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.RouterView routerView(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        UiController.RouterView routerViewComputeIfAbsent = this.routerViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController.routerView.1
            @Override // java.util.function.Function
            public final UiController.RouterView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(0, 0, null, 7, null);
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier, new IdlUiController$routerView$1$apply$$inlined$messageHandler$1(sharedFlow2MutableSharedFlow$default, IdlUiController.this.getRouterMessageAdapter(), IdlUiController.this));
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
        UiController.ScreenView screenViewComputeIfAbsent = this.screenViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController.screenView.1

            /* compiled from: IdlUiController.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$screenView$1$WhenMappings */
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
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier, new IdlUiController$screenView$1$apply$$inlined$messageHandler$1(sharedFlow2MutableSharedFlow$default, screenType, IdlUiController.this));
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier + ".scrollRequest", new IdlUiController$screenView$1$apply$$inlined$messageHandler$2(sharedFlow2MutableSharedFlow$default2, IdlUiController.this.getScrollRequestAdapter()));
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier + ".scrollToBottomRequest", new IdlUiController$screenView$1$apply$$inlined$messageHandler$3(sharedFlow2MutableSharedFlow$default3, IdlUiController.this.getScrollToBottomRequestAdapter()));
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier + ".shareScreenshotRequest", new IdlUiController$screenView$1$apply$$inlined$messageHandler$4(sharedFlow2MutableSharedFlow$default4, IdlUiController.this.getShareScreenshotRequestAdapter()));
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier + ".invokeJavascriptRequest", new IdlUiController$screenView$1$apply$$inlined$messageHandler$5(sharedFlow2MutableSharedFlow$default5, IdlUiController.this.getInvokeJavascriptRequestAdapter()));
                return new UiController.ScreenView(sharedFlow2MutableSharedFlow$default, sharedFlow2MutableSharedFlow$default2, sharedFlow2MutableSharedFlow$default3, sharedFlow2MutableSharedFlow$default4, sharedFlow2MutableSharedFlow$default5);
            }
        });
        Intrinsics.checkNotNullExpressionValue(screenViewComputeIfAbsent, "computeIfAbsent(...)");
        return screenViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiController.BottomSheetView bottomSheetView(final String identifier) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        UiController.BottomSheetView bottomSheetViewComputeIfAbsent = this.bottomSheetViews.computeIfAbsent(identifier, new Function() { // from class: com.robinhood.android.microgramsdui.control.IdlUiController.bottomSheetView.1
            @Override // java.util.function.Function
            public final UiController.BottomSheetView apply(String it) {
                Intrinsics.checkNotNullParameter(it, "it");
                SharedFlow2 sharedFlow2MutableSharedFlow$default = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
                IdlUiController.this.messageDispatcher.registerMessageHandler(identifier, new C21881xe2384716(sharedFlow2MutableSharedFlow$default, IdlUiController.this.getBottomSheetMessageAdapter()));
                return new UiController.BottomSheetView(sharedFlow2MutableSharedFlow$default);
            }
        });
        Intrinsics.checkNotNullExpressionValue(bottomSheetViewComputeIfAbsent, "computeIfAbsent(...)");
        return bottomSheetViewComputeIfAbsent;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<EmbeddedSectionContent, EmbeddedSectionContentDto> decodeEmbeddedSectionContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        EmbeddedSectionContentDto embeddedSectionContentDtoFromJson = getEmbeddedSectionContentAdapter().fromJson(source);
        if (embeddedSectionContentDtoFromJson != null) {
            return new UiObject.Idl(embeddedSectionContentDtoFromJson);
        }
        return null;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<StandardScreen, StandardScreenContentDto> decodeStandardScreenContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        StandardScreenContentDto standardScreenContentDtoFromJson = getStandardScreenAdapter().fromJson(source);
        if (standardScreenContentDtoFromJson != null) {
            return new UiObject.Idl(standardScreenContentDtoFromJson);
        }
        return null;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> decodeHtmlCanvasScreenContent(String source) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        HtmlCanvasScreenContentDto htmlCanvasScreenContentDtoFromJson = getHtmlCanvasScreenAdapter().fromJson(source);
        if (htmlCanvasScreenContentDtoFromJson != null) {
            return new UiObject.Idl(htmlCanvasScreenContentDtoFromJson);
        }
        return null;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterAlertActionTriggered(String str, String str2, Continuation<? super Unit> continuation) {
        Object objNotifyRouterEvent = notifyRouterEvent(str, new RouterInboundDto.ConcreteDto.AlertActionTriggered(new RouterInboundDto.AlertActionTriggeredDto(str2)), continuation);
        return objNotifyRouterEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyRouterEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterToastActionTriggered(String str, String str2, String str3, Continuation<? super Unit> continuation) {
        Object objNotifyRouterEvent = notifyRouterEvent(str, new RouterInboundDto.ConcreteDto.ToastActionTriggered(new RouterInboundDto.ToastActionTriggeredDto(str2, str3)), continuation);
        return objNotifyRouterEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyRouterEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterToastDismissed(String str, String str2, Continuation<? super Unit> continuation) {
        Object objNotifyRouterEvent = notifyRouterEvent(str, new RouterInboundDto.ConcreteDto.ToastDismissed(new RouterInboundDto.ToastDismissedDto(str2)), continuation);
        return objNotifyRouterEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyRouterEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyRouterTornDown(String str, Continuation<? super Unit> continuation) {
        if (this.hostCompatibilityFlags.getNeverTearDownAndroidUi()) {
            return Unit.INSTANCE;
        }
        Object objNotifyRouterEvent = notifyRouterEvent(str, new RouterInboundDto.ConcreteDto.Teardown(new RouterInboundDto.TeardownDto()), continuation);
        return objNotifyRouterEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyRouterEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9.sendMessage(r8, (microgram.Message) r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object notifyRouterEvent(String str, RouterInboundDto.ConcreteDto concreteDto, Continuation<? super Unit> continuation) {
        C219061 c219061;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219061) {
            c219061 = (C219061) continuation;
            int i = c219061.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219061.label = i - Integer.MIN_VALUE;
            } else {
                c219061 = new C219061(continuation);
            }
        }
        Object obj = c219061.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219061.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            C219072 c219072 = new C219072(concreteDto, null);
            c219061.L$0 = hostMessageDispatcher2;
            c219061.L$1 = str;
            c219061.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219072, c219061, 1, null);
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
        str = (String) c219061.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219061.L$0;
        ResultKt.throwOnFailure(obj);
        c219061.L$0 = null;
        c219061.L$1 = null;
        c219061.label = 2;
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$notifyRouterEvent$2", m3645f = "IdlUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyRouterEvent$2 */
    static final class C219072 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ RouterInboundDto.ConcreteDto $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219072(RouterInboundDto.ConcreteDto concreteDto, Continuation<? super C219072> continuation) {
            super(2, continuation);
            this.$message = concreteDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdlUiController.this.new C219072(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219072) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdlUiControllerKt.toMessage(IdlUiController.this.getRouterInboundDtoAdapter(), new RouterInboundDto(this.$message));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (notifyScreenEvent(r7, (microgram.ui.v1.ScreenEventMessageDto.ConcreteDto.StateUpdated) r9, r0) == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.robinhood.android.microgramsdui.control.UiController
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object notifyScreenStatesUpdated(String str, Map<String, ? extends ComponentState> map, Continuation<? super Unit> continuation) {
        C219101 c219101;
        if (continuation instanceof C219101) {
            c219101 = (C219101) continuation;
            int i = c219101.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219101.label = i - Integer.MIN_VALUE;
            } else {
                c219101 = new C219101(continuation);
            }
        }
        Object objWithDefault$default = c219101.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219101.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(objWithDefault$default);
            IdlUiController$notifyScreenStatesUpdated$event$1 idlUiController$notifyScreenStatesUpdated$event$1 = new IdlUiController$notifyScreenStatesUpdated$event$1(map, null);
            c219101.L$0 = str;
            c219101.label = 1;
            objWithDefault$default = Suspend.withDefault$default(null, idlUiController$notifyScreenStatesUpdated$event$1, c219101, 1, null);
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
        str = (String) c219101.L$0;
        ResultKt.throwOnFailure(objWithDefault$default);
        c219101.L$0 = null;
        c219101.label = 2;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenActionTriggered(String str, String str2, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, new ScreenEventMessageDto.ConcreteDto.ActionTriggered(new ScreenEventMessageDto.ActionTriggeredMessageDto(str2)), continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenAppeared(String str, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, new ScreenEventMessageDto.ConcreteDto.Appeared(new ScreenEventMessageDto.ScreenAppearedMessageDto()), continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenDisappeared(String str, Continuation<? super Unit> continuation) {
        Object objNotifyScreenEvent = notifyScreenEvent(str, new ScreenEventMessageDto.ConcreteDto.Disappeared(new ScreenEventMessageDto.ScreenDisappearedMessageDto()), continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.microgramsdui.control.UiController
    public Object notifyScreenTornDown(String str, Continuation<? super Unit> continuation) {
        if (this.hostCompatibilityFlags.getNeverTearDownAndroidUi()) {
            return Unit.INSTANCE;
        }
        Object objNotifyScreenEvent = notifyScreenEvent(str, new ScreenEventMessageDto.ConcreteDto.Teardown(new ScreenEventMessageDto.ScreenTeardownMessageDto()), continuation);
        return objNotifyScreenEvent == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objNotifyScreenEvent : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (r9.sendMessage(r8, (microgram.Message) r10, r0) == r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object notifyScreenEvent(String str, ScreenEventMessageDto.ConcreteDto concreteDto, Continuation<? super Unit> continuation) {
        C219081 c219081;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219081) {
            c219081 = (C219081) continuation;
            int i = c219081.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219081.label = i - Integer.MIN_VALUE;
            } else {
                c219081 = new C219081(continuation);
            }
        }
        Object obj = c219081.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219081.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            C219092 c219092 = new C219092(concreteDto, null);
            c219081.L$0 = hostMessageDispatcher2;
            c219081.L$1 = str;
            c219081.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219092, c219081, 1, null);
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
        str = (String) c219081.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219081.L$0;
        ResultKt.throwOnFailure(obj);
        c219081.L$0 = null;
        c219081.L$1 = null;
        c219081.label = 2;
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$notifyScreenEvent$2", m3645f = "IdlUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyScreenEvent$2 */
    static final class C219092 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ ScreenEventMessageDto.ConcreteDto $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219092(ScreenEventMessageDto.ConcreteDto concreteDto, Continuation<? super C219092> continuation) {
            super(2, continuation);
            this.$message = concreteDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdlUiController.this.new C219092(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219092) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdlUiControllerKt.toMessage(IdlUiController.this.getScreenEventMessageAdapter(), new ScreenEventMessageDto(this.$message));
        }
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
        C219041 c219041;
        String str2;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219041) {
            c219041 = (C219041) continuation;
            int i = c219041.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219041.label = i - Integer.MIN_VALUE;
            } else {
                c219041 = new C219041(continuation);
            }
        }
        Object obj = c219041.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219041.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            str2 = str + ".htmlCanvasAvailableAreaMessage";
            C219052 c219052 = new C219052(htmlCanvasAvailableAreaMessageDto, null);
            c219041.L$0 = hostMessageDispatcher2;
            c219041.L$1 = str2;
            c219041.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219052, c219041, 1, null);
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
        str2 = (String) c219041.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219041.L$0;
        ResultKt.throwOnFailure(obj);
        c219041.L$0 = null;
        c219041.L$1 = null;
        c219041.label = 2;
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$notifyHtmlCanvasAvailableArea$2", m3645f = "IdlUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyHtmlCanvasAvailableArea$2 */
    static final class C219052 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ HtmlCanvasAvailableAreaMessageDto $message;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219052(HtmlCanvasAvailableAreaMessageDto htmlCanvasAvailableAreaMessageDto, Continuation<? super C219052> continuation) {
            super(2, continuation);
            this.$message = htmlCanvasAvailableAreaMessageDto;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdlUiController.this.new C219052(this.$message, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219052) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                return Message3.encodeToMessage(IdlUiController.this.json, Reflection.typeOf(HtmlCanvasAvailableAreaMessageDto.class), this.$message);
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
        C219021 c219021;
        String str2;
        HostMessageDispatcher hostMessageDispatcher;
        if (continuation instanceof C219021) {
            c219021 = (C219021) continuation;
            int i = c219021.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c219021.label = i - Integer.MIN_VALUE;
            } else {
                c219021 = new C219021(continuation);
            }
        }
        Object obj = c219021.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c219021.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            HostMessageDispatcher hostMessageDispatcher2 = this.messageDispatcher;
            String str3 = str + "." + customScreenEventCoordinator.getEventDestination();
            C219032 c219032 = new C219032(kType, customScreenEventCoordinator, null);
            c219021.L$0 = hostMessageDispatcher2;
            c219021.L$1 = str3;
            c219021.label = 1;
            Object objWithDefault$default = Suspend.withDefault$default(null, c219032, c219021, 1, null);
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
        str2 = (String) c219021.L$1;
        hostMessageDispatcher = (HostMessageDispatcher) c219021.L$0;
        ResultKt.throwOnFailure(obj);
        c219021.L$0 = null;
        c219021.L$1 = null;
        c219021.label = 2;
    }

    /* compiled from: IdlUiController.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lmicrogram/Message;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microgramsdui.control.IdlUiController$notifyCustomScreenEvent$2", m3645f = "IdlUiController.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.microgramsdui.control.IdlUiController$notifyCustomScreenEvent$2 */
    static final class C219032 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Message>, Object> {
        final /* synthetic */ CustomScreenEventCoordinator $event;
        final /* synthetic */ KType $type;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C219032(KType kType, CustomScreenEventCoordinator customScreenEventCoordinator, Continuation<? super C219032> continuation) {
            super(2, continuation);
            this.$type = kType;
            this.$event = customScreenEventCoordinator;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdlUiController.this.new C219032(this.$type, this.$event, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Message> continuation) {
            return ((C219032) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Message3.encodeToMessage(IdlUiController.this.json, this.$type, this.$event);
        }
    }
}
