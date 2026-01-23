package com.plaid.internal;

import android.webkit.JavascriptInterface;
import com.plaid.internal.AbstractC7134l4;
import com.plaid.internal.C5835E6;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C6028a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import kotlinx.serialization.json.Json;
import kotlinx.serialization.json.Json4;
import kotlinx.serialization.json.Json6;

/* renamed from: com.plaid.internal.e6 */
/* loaded from: classes16.dex */
public final class C7068e6 {

    /* renamed from: a */
    public final C5996W3 f2753a;

    /* renamed from: b */
    public final Json f2754b;

    /* renamed from: c */
    public final StateFlow2<Boolean> f2755c;

    /* renamed from: d */
    public final StateFlow<Boolean> f2756d;

    /* renamed from: com.plaid.internal.e6$a */
    public static final class a extends Lambda implements Function1<Json4, Unit> {

        /* renamed from: a */
        public static final a f2757a = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(Json4 json4) {
            Json4 Json = json4;
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.setIgnoreUnknownKeys(true);
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.core.webview.PreloadWebViewJSInterface$postMessage$1", m3645f = "PreloadWebViewJSInterface.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.e6$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C7068e6.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C7068e6.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            ResultKt.throwOnFailure(obj);
            C7068e6.this.f2755c.setValue(boxing.boxBoolean(true));
            return Unit.INSTANCE;
        }
    }

    public C7068e6(C5996W3 mutablePlaidWebViewMessageInterceptor) {
        Intrinsics.checkNotNullParameter(mutablePlaidWebViewMessageInterceptor, "mutablePlaidWebViewMessageInterceptor");
        this.f2753a = mutablePlaidWebViewMessageInterceptor;
        this.f2754b = Json6.Json$default(null, a.f2757a, 1, null);
        StateFlow2<Boolean> stateFlow2MutableStateFlow = StateFlow4.MutableStateFlow(Boolean.FALSE);
        this.f2755c = stateFlow2MutableStateFlow;
        this.f2756d = FlowKt.asStateFlow(stateFlow2MutableStateFlow);
    }

    @JavascriptInterface
    public final void postMessage(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        try {
            Json json = this.f2754b;
            C6028a.b.m1362a();
            C6028a c6028a = (C6028a) json.decodeFromString(C6028a.a.f1885a, message);
            String strM1361a = c6028a.m1361a();
            if (Intrinsics.areEqual(strM1361a, "ready")) {
                C5953R5.a.m1299a(C5953R5.f1671a, "JS received Link is ready");
                BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new b(null), 3, null);
                return;
            }
            if (!Intrinsics.areEqual(strM1361a, "open-webview")) {
                C5835E6.a.m1187a("JS sent unknown action: " + c6028a.m1361a());
                return;
            }
            AbstractC7134l4 abstractC7134l4M1549a = AbstractC7134l4.a.m1549a(message);
            C5953R5.a.m1299a(C5953R5.f1671a, "JS received open webview message : " + abstractC7134l4M1549a);
            this.f2753a.mo1135a(abstractC7134l4M1549a);
        } catch (Exception e) {
            C5835E6.a.m1186a(e, "Error parsing message: " + message);
        }
    }
}
