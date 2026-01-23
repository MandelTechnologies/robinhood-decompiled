package microgram.android.internal.guest.webview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.webkit.WebView;
import androidx.webkit.WebMessageCompat;
import androidx.webkit.WebMessagePortCompat;
import androidx.webkit.WebViewCompat;
import androidx.webkit.WebViewFeature;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.tracing.RhTrace3;
import com.robinhood.android.tracing.RhTrace6;
import com.robinhood.shared.settings.contracts.NotificationSettings4FragmentKey;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import dispatch.core.Suspend;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.Job6;
import kotlinx.coroutines.android.HandlerDispatcher4;
import kotlinx.coroutines.channels.Channel;
import kotlinx.coroutines.channels.Channel4;
import kotlinx.coroutines.channels.Channel9;
import microgram.android.internal.guest.GuestRuntime;
import microgram.android.internal.guest.GuestRuntime2;
import microgram.android.internal.guest.GuestRuntime3;
import microgram.android.internal.guest.GuestRuntimeUnavailableException;
import microgram.android.internal.guest.RuntimeMessage;
import microgram.android.internal.guest.webview.WebViewGuestRuntime;

/* compiled from: WebViewGuestRuntime.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \"2\u00020\u0001:\u0005\u001e\u001f !\"B)\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012H\u0096@¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\f\u0010\u0019\u001a\u00020\u001a*\u00020\u001bH\u0002J\f\u0010\u001c\u001a\u00020\u001d*\u00020\u0014H\u0002R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u0010\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;", "Lmicrogram/android/internal/guest/GuestRuntime;", "view", "Landroid/webkit/WebView;", "callbackHandler", "Landroid/os/Handler;", "viewHandler", "trackTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Landroid/webkit/WebView;Landroid/os/Handler;Landroid/os/Handler;Lcom/robinhood/android/tracing/TrackTrace;)V", "getView", "()Landroid/webkit/WebView;", "localTrace", "viewScope", "Lkotlinx/coroutines/CoroutineScope;", "channelBuffer", "Lkotlinx/coroutines/channels/Channel;", "Lkotlin/Pair;", "Lmicrogram/android/internal/guest/HostPort;", "Lmicrogram/android/internal/guest/GuestPort;", "createMessageChannel", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "close", "", "toRuntimeMessage", "Lmicrogram/android/internal/guest/RuntimeMessage;", "Landroidx/webkit/WebMessageCompat;", "toWebMessagePort", "Landroidx/webkit/WebMessagePortCompat;", "PortAdapter", "HostPortAdapter", "GuestPortAdapter", "Factory", "Companion", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"RequiresFeature"})
@SourceDebugExtension
/* loaded from: classes14.dex */
public final class WebViewGuestRuntime implements GuestRuntime {
    private static final Set<String> REQUIRED_FEATURES = SetsKt.setOf((Object[]) new String[]{"CREATE_WEB_MESSAGE_CHANNEL", "WEB_MESSAGE_LISTENER", "WEB_MESSAGE_PORT_SET_MESSAGE_CALLBACK", "WEB_RESOURCE_ERROR_GET_CODE", "WEB_RESOURCE_ERROR_GET_DESCRIPTION"});
    private final Handler callbackHandler;
    private final Channel<Tuples2<GuestRuntime3, GuestRuntime2>> channelBuffer;
    private final RhTrace6 localTrace;
    private final WebView view;
    private final Handler viewHandler;
    private final CoroutineScope viewScope;

    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.webview.WebViewGuestRuntime", m3645f = "WebViewGuestRuntime.kt", m3646l = {75}, m3647m = "createMessageChannel")
    /* renamed from: microgram.android.internal.guest.webview.WebViewGuestRuntime$createMessageChannel$1 */
    static final class C462791 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C462791(Continuation<? super C462791> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewGuestRuntime.this.createMessageChannel(this);
        }
    }

    public /* synthetic */ WebViewGuestRuntime(WebView webView, Handler handler, Handler handler2, RhTrace6 rhTrace6, DefaultConstructorMarker defaultConstructorMarker) {
        this(webView, handler, handler2, rhTrace6);
    }

    private WebViewGuestRuntime(WebView webView, Handler handler, Handler handler2, RhTrace6 rhTrace6) {
        this.view = webView;
        this.callbackHandler = handler;
        this.viewHandler = handler2;
        this.localTrace = rhTrace6.withMethodNamePrefix("WebViewGuestRuntime.");
        CoroutineScope CoroutineScope = CoroutineScope2.CoroutineScope(Job6.Job$default(null, 1, null).plus(HandlerDispatcher4.from$default(handler2, null, 1, null)));
        CoroutineContext.Element element = CoroutineScope.getCoroutineContext().get(Job.INSTANCE);
        Intrinsics.checkNotNull(element);
        ((Job) element).invokeOnCompletion(new Function1() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WebViewGuestRuntime.viewScope$lambda$1$lambda$0(this.f$0, (Throwable) obj);
            }
        });
        this.viewScope = CoroutineScope;
        this.channelBuffer = Channel4.Channel$default(32, null, null, 6, null);
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope, null, null, new C462761(rhTrace6, this, null), 3, null);
    }

    public final WebView getView() {
        return this.view;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit viewScope$lambda$1$lambda$0(final WebViewGuestRuntime webViewGuestRuntime, Throwable th) {
        webViewGuestRuntime.callbackHandler.getLooper().quitSafely();
        webViewGuestRuntime.viewHandler.post(new Runnable() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$viewScope$1$1$1
            @Override // java.lang.Runnable
            public final void run() {
                this.this$0.getView().destroy();
            }
        });
        return Unit.INSTANCE;
    }

    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "microgram.android.internal.guest.webview.WebViewGuestRuntime$1", m3645f = "WebViewGuestRuntime.kt", m3646l = {69}, m3647m = "invokeSuspend")
    /* renamed from: microgram.android.internal.guest.webview.WebViewGuestRuntime$1 */
    static final class C462761 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ RhTrace6 $trackTrace;
        int label;
        final /* synthetic */ WebViewGuestRuntime this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C462761(RhTrace6 rhTrace6, WebViewGuestRuntime webViewGuestRuntime, Continuation<? super C462761> continuation) {
            super(2, continuation);
            this.$trackTrace = rhTrace6;
            this.this$0 = webViewGuestRuntime;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C462761(this.$trackTrace, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C462761) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Channel channel;
            Tuples2 tuples2M3642to;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0 && i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            do {
                this.$trackTrace.instant("<job> createWebMessageChannel");
                WebMessagePortCompat[] webMessagePortCompatArrCreateWebMessageChannel = WebViewCompat.createWebMessageChannel(this.this$0.getView());
                Intrinsics.checkNotNullExpressionValue(webMessagePortCompatArrCreateWebMessageChannel, "createWebMessageChannel(...)");
                WebMessagePortCompat webMessagePortCompat = webMessagePortCompatArrCreateWebMessageChannel[0];
                WebMessagePortCompat webMessagePortCompat2 = webMessagePortCompatArrCreateWebMessageChannel[1];
                channel = this.this$0.channelBuffer;
                WebViewGuestRuntime webViewGuestRuntime = this.this$0;
                Intrinsics.checkNotNull(webMessagePortCompat);
                HostPortAdapter hostPortAdapter = new HostPortAdapter(webViewGuestRuntime, webMessagePortCompat);
                WebViewGuestRuntime webViewGuestRuntime2 = this.this$0;
                Intrinsics.checkNotNull(webMessagePortCompat2);
                tuples2M3642to = Tuples4.m3642to(hostPortAdapter, new GuestPortAdapter(webViewGuestRuntime2, webMessagePortCompat2));
                this.label = 1;
            } while (channel.send(tuples2M3642to, this) != coroutine_suspended);
            return coroutine_suspended;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // microgram.android.internal.guest.GuestRuntime
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object createMessageChannel(Continuation<? super Tuples2<? extends GuestRuntime3, ? extends GuestRuntime2>> continuation) throws Throwable {
        C462791 c462791;
        RhTrace3 rhTrace3;
        Throwable th;
        if (continuation instanceof C462791) {
            c462791 = (C462791) continuation;
            int i = c462791.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c462791.label = i - Integer.MIN_VALUE;
            } else {
                c462791 = new C462791(continuation);
            }
        }
        Object obj = c462791.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c462791.label;
        if (i2 != 0) {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            rhTrace3 = (RhTrace3) c462791.L$0;
            try {
                ResultKt.throwOnFailure(obj);
                if (rhTrace3 != null) {
                    rhTrace3.end();
                }
                return obj;
            } catch (Throwable th2) {
                th = th2;
                if (rhTrace3 != null) {
                }
                throw th;
            }
        }
        ResultKt.throwOnFailure(obj);
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("createMessageChannel");
        try {
            Channel<Tuples2<GuestRuntime3, GuestRuntime2>> channel = this.channelBuffer;
            c462791.L$0 = rhTrace3BeginSpan;
            c462791.label = 1;
            Object objReceive = channel.receive(c462791);
            if (objReceive == coroutine_suspended) {
                return coroutine_suspended;
            }
            rhTrace3 = rhTrace3BeginSpan;
            obj = objReceive;
            if (rhTrace3 != null) {
            }
            return obj;
        } catch (Throwable th3) {
            rhTrace3 = rhTrace3BeginSpan;
            th = th3;
            if (rhTrace3 != null) {
                rhTrace3.end();
            }
            throw th;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        RhTrace6 rhTrace6 = this.localTrace;
        RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("close");
        try {
            CoroutineScope2.cancel$default(this.viewScope, null, 1, null);
            Unit unit = Unit.INSTANCE;
        } finally {
            if (rhTrace3BeginSpan != null) {
                rhTrace3BeginSpan.end();
            }
        }
    }

    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b¡\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0006\u0010\t\u001a\u00020\nJ\b\u0010\u000b\u001a\u00020\nH\u0014R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\f"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$PortAdapter;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "(Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;)V", "delegate", "Landroidx/webkit/WebMessagePortCompat;", "getDelegate", "()Landroidx/webkit/WebMessagePortCompat;", "close", "", "onClose", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public abstract class PortAdapter implements AutoCloseable {
        public abstract WebMessagePortCompat getDelegate();

        public PortAdapter() {
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            Handler handler = WebViewGuestRuntime.this.callbackHandler;
            final WebViewGuestRuntime webViewGuestRuntime = WebViewGuestRuntime.this;
            handler.post(new Runnable() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$PortAdapter$close$1
                @Override // java.lang.Runnable
                public final void run() {
                    Handler handler2 = webViewGuestRuntime.viewHandler;
                    final WebViewGuestRuntime.PortAdapter portAdapter = this;
                    handler2.post(new Runnable() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$PortAdapter$close$1.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            portAdapter.onClose();
                        }
                    });
                }
            });
        }

        protected void onClose() {
            getDelegate().close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150\u0014\"\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0014R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$HostPortAdapter;", "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$PortAdapter;", "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;", "Lmicrogram/android/internal/guest/HostPort;", "delegate", "Landroidx/webkit/WebMessagePortCompat;", "<init>", "(Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;Landroidx/webkit/WebMessagePortCompat;)V", "getDelegate", "()Landroidx/webkit/WebMessagePortCompat;", NotificationSettings4FragmentKey.SETTINGS_MESSAGES, "Lkotlinx/coroutines/channels/Channel;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "getMessages", "()Lkotlinx/coroutines/channels/Channel;", "postMessage", "", WebsocketGatewayConstants.DATA_KEY, "", "ports", "", "Lmicrogram/android/internal/guest/GuestPort;", "(Ljava/lang/String;[Lmicrogram/android/internal/guest/GuestPort;)V", "onClose", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    final class HostPortAdapter extends PortAdapter implements GuestRuntime3 {
        private final WebMessagePortCompat delegate;
        private final Channel<RuntimeMessage> messages;
        final /* synthetic */ WebViewGuestRuntime this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public HostPortAdapter(final WebViewGuestRuntime webViewGuestRuntime, WebMessagePortCompat delegate) {
            super();
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = webViewGuestRuntime;
            this.delegate = delegate;
            this.messages = Channel4.Channel$default(Integer.MAX_VALUE, null, null, 6, null);
            webViewGuestRuntime.callbackHandler.post(new Runnable() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime.HostPortAdapter.1
                @Override // java.lang.Runnable
                public final void run() {
                    WebMessagePortCompat delegate2 = HostPortAdapter.this.getDelegate();
                    Handler handler = webViewGuestRuntime.callbackHandler;
                    final HostPortAdapter hostPortAdapter = HostPortAdapter.this;
                    final WebViewGuestRuntime webViewGuestRuntime2 = webViewGuestRuntime;
                    delegate2.setWebMessageCallback(handler, new WebMessagePortCompat.WebMessageCallbackCompat() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime.HostPortAdapter.1.1
                        @Override // androidx.webkit.WebMessagePortCompat.WebMessageCallbackCompat
                        public void onMessage(WebMessagePortCompat port, WebMessageCompat message) {
                            Intrinsics.checkNotNullParameter(port, "port");
                            Channel<RuntimeMessage> messages = hostPortAdapter.getMessages();
                            WebViewGuestRuntime webViewGuestRuntime3 = webViewGuestRuntime2;
                            Intrinsics.checkNotNull(message);
                            messages.mo8337trySendJP2dKIU(webViewGuestRuntime3.toRuntimeMessage(message));
                        }
                    });
                }
            });
        }

        @Override // microgram.android.internal.guest.webview.WebViewGuestRuntime.PortAdapter
        public WebMessagePortCompat getDelegate() {
            return this.delegate;
        }

        @Override // microgram.android.internal.guest.GuestRuntime3
        public Channel<RuntimeMessage> getMessages() {
            return this.messages;
        }

        @Override // microgram.android.internal.guest.GuestRuntime3
        public void postMessage(final String data, final GuestRuntime2... ports) {
            Intrinsics.checkNotNullParameter(data, "data");
            Intrinsics.checkNotNullParameter(ports, "ports");
            Handler handler = this.this$0.callbackHandler;
            final WebViewGuestRuntime webViewGuestRuntime = this.this$0;
            handler.post(new Runnable() { // from class: microgram.android.internal.guest.webview.WebViewGuestRuntime$HostPortAdapter$postMessage$1
                @Override // java.lang.Runnable
                public final void run() {
                    GuestRuntime2[] guestRuntime2Arr = ports;
                    WebViewGuestRuntime webViewGuestRuntime2 = webViewGuestRuntime;
                    int length = guestRuntime2Arr.length;
                    WebMessagePortCompat[] webMessagePortCompatArr = new WebMessagePortCompat[length];
                    for (int i = 0; i < length; i++) {
                        webMessagePortCompatArr[i] = webViewGuestRuntime2.toWebMessagePort(guestRuntime2Arr[i]);
                    }
                    this.getDelegate().postMessage(new WebMessageCompat(data, webMessagePortCompatArr));
                }
            });
        }

        @Override // microgram.android.internal.guest.webview.WebViewGuestRuntime.PortAdapter
        protected void onClose() {
            super.onClose();
            Channel9.DefaultImpls.close$default(getMessages(), null, 1, null);
        }
    }

    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$GuestPortAdapter;", "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$PortAdapter;", "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;", "Lmicrogram/android/internal/guest/GuestPort;", "delegate", "Landroidx/webkit/WebMessagePortCompat;", "<init>", "(Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;Landroidx/webkit/WebMessagePortCompat;)V", "getDelegate", "()Landroidx/webkit/WebMessagePortCompat;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private final class GuestPortAdapter extends PortAdapter implements GuestRuntime2 {
        private final WebMessagePortCompat delegate;
        final /* synthetic */ WebViewGuestRuntime this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GuestPortAdapter(WebViewGuestRuntime webViewGuestRuntime, WebMessagePortCompat delegate) {
            super();
            Intrinsics.checkNotNullParameter(delegate, "delegate");
            this.this$0 = webViewGuestRuntime;
            this.delegate = delegate;
        }

        @Override // microgram.android.internal.guest.webview.WebViewGuestRuntime.PortAdapter
        public WebMessagePortCompat getDelegate() {
            return this.delegate;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RuntimeMessage toRuntimeMessage(WebMessageCompat webMessageCompat) {
        List listEmptyList;
        String data = webMessageCompat.getData();
        Intrinsics.checkNotNull(data);
        WebMessagePortCompat[] ports = webMessageCompat.getPorts();
        if (ports != null) {
            listEmptyList = new ArrayList(ports.length);
            for (WebMessagePortCompat webMessagePortCompat : ports) {
                listEmptyList.add(new HostPortAdapter(this, webMessagePortCompat));
            }
        } else {
            listEmptyList = null;
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new RuntimeMessage(data, listEmptyList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebMessagePortCompat toWebMessagePort(GuestRuntime2 guestRuntime2) {
        if (!(guestRuntime2 instanceof GuestPortAdapter)) {
            throw new IllegalStateException(("The supplied port must originate from the same guest type, was: " + Reflection.getOrCreateKotlinClass(guestRuntime2.getClass())).toString());
        }
        return ((GuestPortAdapter) guestRuntime2).getDelegate();
    }

    /* compiled from: WebViewGuestRuntime.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\fH\u0002J\"\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\f0\u0010H\u0097@¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime$Factory;", "Lmicrogram/android/internal/guest/GuestRuntime$Factory;", "context", "Landroid/content/Context;", "client", "Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;", "instanceTrace", "Lcom/robinhood/android/tracing/TrackTrace;", "<init>", "(Landroid/content/Context;Lmicrogram/android/internal/guest/webview/MicrogramWebViewClient;Lcom/robinhood/android/tracing/TrackTrace;)V", "localTrace", "checkFeatures", "", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "Lmicrogram/android/internal/guest/webview/WebViewGuestRuntime;", "onGuestEvent", "Lkotlin/Function1;", "Lmicrogram/android/internal/guest/RuntimeMessage;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-microgram_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Factory implements GuestRuntime.Factory {
        private final MicrogramWebViewClient client;
        private final Context context;
        private final RhTrace6 instanceTrace;
        private final RhTrace6 localTrace;

        public Factory(Context context, MicrogramWebViewClient client, RhTrace6 instanceTrace) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(client, "client");
            Intrinsics.checkNotNullParameter(instanceTrace, "instanceTrace");
            this.context = context;
            this.client = client;
            this.instanceTrace = instanceTrace;
            this.localTrace = instanceTrace.withMethodNamePrefix("WebViewGuestRuntime.Factory.");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void checkFeatures() {
            RhTrace6 rhTrace6 = this.localTrace;
            RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan("checkFeatures");
            try {
                try {
                    Set set = WebViewGuestRuntime.REQUIRED_FEATURES;
                    LinkedHashSet linkedHashSet = new LinkedHashSet();
                    for (Object obj : set) {
                        if (!WebViewFeature.isFeatureSupported((String) obj)) {
                            linkedHashSet.add(obj);
                        }
                    }
                    if (!linkedHashSet.isEmpty()) {
                        throw new GuestRuntimeUnavailableException("Some WebView features were not available: " + linkedHashSet, null, 2, null);
                    }
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e) {
                    Iterator<Throwable> itIterator2 = Throwables.causes(e).iterator2();
                    while (itIterator2.hasNext()) {
                        if (Intrinsics.areEqual(itIterator2.next().getClass().getSimpleName(), "MissingWebViewPackageException")) {
                            throw new GuestRuntimeUnavailableException(null, e, 1, null);
                        }
                    }
                }
            } finally {
                if (rhTrace3BeginSpan != null) {
                    rhTrace3BeginSpan.end();
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // microgram.android.internal.guest.GuestRuntime.Factory
        @SuppressLint({"SetJavaScriptEnabled", "WrongConstant"})
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object create(Function1<? super RuntimeMessage, Unit> function1, Continuation<? super WebViewGuestRuntime> continuation) throws Throwable {
            WebViewGuestRuntime2 webViewGuestRuntime2;
            Throwable th;
            RhTrace3 rhTrace3;
            if (continuation instanceof WebViewGuestRuntime2) {
                webViewGuestRuntime2 = (WebViewGuestRuntime2) continuation;
                int i = webViewGuestRuntime2.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    webViewGuestRuntime2.label = i - Integer.MIN_VALUE;
                } else {
                    webViewGuestRuntime2 = new WebViewGuestRuntime2(this, continuation);
                }
            }
            Object obj = webViewGuestRuntime2.result;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = webViewGuestRuntime2.label;
            if (i2 == 0) {
                ResultKt.throwOnFailure(obj);
                RhTrace6 rhTrace6 = this.localTrace;
                RhTrace3 rhTrace3BeginSpan = !rhTrace6.isEnabled() ? null : rhTrace6.beginSpan(AnalyticsStrings.BUTTON_NEW_LIST_CREATE);
                try {
                    WebViewGuestRuntime3 webViewGuestRuntime3 = new WebViewGuestRuntime3(this, function1, null);
                    webViewGuestRuntime2.L$0 = rhTrace3BeginSpan;
                    webViewGuestRuntime2.label = 1;
                    Object objWithMainImmediate$default = Suspend.withMainImmediate$default(null, webViewGuestRuntime3, webViewGuestRuntime2, 1, null);
                    if (objWithMainImmediate$default == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    RhTrace3 rhTrace32 = rhTrace3BeginSpan;
                    obj = objWithMainImmediate$default;
                    rhTrace3 = rhTrace32;
                } catch (Throwable th2) {
                    RhTrace3 rhTrace33 = rhTrace3BeginSpan;
                    th = th2;
                    rhTrace3 = rhTrace33;
                    if (rhTrace3 != null) {
                        rhTrace3.end();
                    }
                    throw th;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                rhTrace3 = (RhTrace3) webViewGuestRuntime2.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Throwable th3) {
                    th = th3;
                    if (rhTrace3 != null) {
                    }
                    throw th;
                }
            }
            WebViewGuestRuntime webViewGuestRuntime = (WebViewGuestRuntime) obj;
            if (rhTrace3 != null) {
                rhTrace3.end();
            }
            return webViewGuestRuntime;
        }
    }
}
