package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import android.content.MutableContextWrapper;
import android.net.Uri;
import android.view.View;
import androidx.browser.customtabs.CustomTabsIntent;
import androidx.view.result.ActivityResultLauncher;
import com.plaid.internal.InterfaceC5843F5;
import com.plaid.link.Plaid;
import com.plaid.link.configuration.LinkTokenConfiguration;
import com.plaid.link.result.LinkExit;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.MainCoroutineDispatcher;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.P0 */
/* loaded from: classes16.dex */
public final class C5931P0 {

    /* renamed from: a */
    public final LinkTokenConfiguration f1606a;

    /* renamed from: b */
    public final ActivityResultLauncher<LinkTokenConfiguration> f1607b;

    /* renamed from: c */
    public final Function1<LinkTokenConfiguration, Unit> f1608c;

    /* renamed from: d */
    public final Function1<LinkExit, Unit> f1609d;

    /* renamed from: e */
    public final C5922O0 f1610e;

    /* renamed from: f */
    public final C7239w2 f1611f;

    @DebugMetadata(m3644c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1", m3645f = "EmbeddedViewHandler.kt", m3646l = {78, 79}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.P0$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f1614a;

        @DebugMetadata(m3644c = "com.plaid.internal.views.EmbeddedViewHandler$loadWebviewFromLinkToken$1$1", m3645f = "EmbeddedViewHandler.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.plaid.internal.P0$b$a */
        public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

            /* renamed from: a */
            public final /* synthetic */ Object f1616a;

            /* renamed from: b */
            public final /* synthetic */ C5931P0 f1617b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, C5931P0 c5931p0, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f1616a = obj;
                this.f1617b = c5931p0;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new a(this.f1616a, this.f1617b, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return new a(this.f1616a, this.f1617b, continuation).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                ResultKt.throwOnFailure(obj);
                Object obj2 = this.f1616a;
                C5931P0 c5931p0 = this.f1617b;
                if (Result.m28553exceptionOrNullimpl(obj2) != null) {
                    c5931p0.f1611f.getProgressBar$link_sdk_release().setVisibility(4);
                    c5931p0.f1611f.getWebView$link_sdk_release().setVisibility(4);
                    c5931p0.f1611f.getRetryContainer$link_sdk_release().setVisibility(0);
                    return Unit.INSTANCE;
                }
                C5931P0 c5931p02 = this.f1617b;
                C5927O5 webView$link_sdk_release = c5931p02.f1611f.getWebView$link_sdk_release();
                webView$link_sdk_release.loadUrl((String) obj2);
                webView$link_sdk_release.setVisibility(0);
                c5931p02.f1611f.getProgressBar$link_sdk_release().setVisibility(4);
                c5931p02.f1611f.getRetryContainer$link_sdk_release().setVisibility(4);
                return Unit.INSTANCE;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5931P0.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C5931P0.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (kotlinx.coroutines.BuildersKt.withContext(r1, r3, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objM1273a;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1614a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5931P0 c5931p0 = C5931P0.this;
                C5922O0 c5922o0 = c5931p0.f1610e;
                String token = c5931p0.f1606a.getToken();
                this.f1614a = 1;
                objM1273a = c5922o0.m1273a(token, this);
                if (objM1273a != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            objM1273a = ((Result) obj).getValue();
            MainCoroutineDispatcher main = Dispatchers.getMain();
            a aVar = new a(objM1273a, C5931P0.this, null);
            this.f1614a = 2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C5931P0(Context context, LinkTokenConfiguration linkTokenConfig, ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher, Function1<? super LinkTokenConfiguration, Unit> function1, Function1<? super LinkExit, Unit> failureCallback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(linkTokenConfig, "linkTokenConfig");
        Intrinsics.checkNotNullParameter(failureCallback, "failureCallback");
        this.f1606a = linkTokenConfig;
        this.f1607b = activityResultLauncher;
        this.f1608c = function1;
        this.f1609d = failureCallback;
        Plaid plaid = Plaid.INSTANCE;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
        C5922O0 c5922o0 = new C5922O0(plaid.provideLinkTokenComponent$link_sdk_release((Application) applicationContext));
        this.f1610e = c5922o0;
        a aVar = new a(context);
        Json json = c5922o0.f1579c;
        if (json == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            json = null;
        }
        C5948R0 c5948r0 = new C5948R0(aVar, json);
        C7239w2 c7239w2 = new C7239w2(context);
        C5927O5 webView$link_sdk_release = c7239w2.getWebView$link_sdk_release();
        C5940Q0 listener = new C5940Q0(c5948r0);
        webView$link_sdk_release.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(listener, "interceptor");
        Context context2 = webView$link_sdk_release.getContext();
        if (context2 instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context2).setBaseContext(context);
        }
        webView$link_sdk_release.f1593c = InterfaceC5843F5.a.f1345a;
        C5996W3 c5996w3 = webView$link_sdk_release.f1591a;
        c5996w3.getClass();
        Intrinsics.checkNotNullParameter(listener, "listener");
        c5996w3.f1800a = listener;
        c7239w2.getRetryButton$link_sdk_release().setOnClickListener(new View.OnClickListener() { // from class: com.plaid.internal.P0$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5931P0.m1288a(this.f$0, view);
            }
        });
        this.f1611f = c7239w2;
    }

    /* renamed from: a */
    public static final void m1288a(C5931P0 this$0, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m1289a();
    }

    /* renamed from: a */
    public final void m1289a() {
        this.f1611f.getProgressBar$link_sdk_release().setVisibility(0);
        this.f1611f.getWebView$link_sdk_release().setVisibility(4);
        this.f1611f.getRetryContainer$link_sdk_release().setVisibility(4);
        BuildersKt__Builders_commonKt.launch$default(C7079f7.m1507a(this.f1611f), null, null, new b(null), 3, null);
    }

    /* renamed from: com.plaid.internal.P0$a */
    public static final class a {

        /* renamed from: b */
        public final /* synthetic */ Context f1613b;

        public a(Context context) {
            this.f1613b = context;
        }

        /* renamed from: a */
        public final void m1290a(C5892L0 embeddedSessionInfo) {
            Intrinsics.checkNotNullParameter(embeddedSessionInfo, "embeddedSessionInfo");
            LinkTokenConfiguration linkTokenConfigurationBuild = new LinkTokenConfiguration.Builder().embeddedSessionInfo(embeddedSessionInfo).noLoadingState(C5931P0.this.f1606a.getNoLoadingState()).logLevel(C5931P0.this.f1606a.getLogLevel()).build();
            C5931P0 c5931p0 = C5931P0.this;
            ActivityResultLauncher<LinkTokenConfiguration> activityResultLauncher = c5931p0.f1607b;
            if (activityResultLauncher != null) {
                activityResultLauncher.launch(linkTokenConfigurationBuild);
                return;
            }
            Function1<LinkTokenConfiguration, Unit> function1 = c5931p0.f1608c;
            if (function1 != null) {
                function1.invoke(linkTokenConfigurationBuild);
            }
        }

        /* renamed from: a */
        public final void m1292a(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            CustomTabsIntent customTabsIntentBuild = new CustomTabsIntent.Builder().build();
            Intrinsics.checkNotNullExpressionValue(customTabsIntentBuild, "build(...)");
            customTabsIntentBuild.launchUrl(this.f1613b, Uri.parse(url));
        }

        /* renamed from: a */
        public final void m1291a(LinkExit linkExit) {
            Intrinsics.checkNotNullParameter(linkExit, "linkExit");
            C5931P0.this.f1609d.invoke(linkExit);
        }
    }
}
