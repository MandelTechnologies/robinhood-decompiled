package com.plaid.internal;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.os.Build;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.plaid.internal.C5953R5;
import com.plaid.internal.InterfaceC5843F5;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

@SourceDebugExtension
/* renamed from: com.plaid.internal.O5 */
/* loaded from: classes16.dex */
public final class C5927O5 extends WebView {

    /* renamed from: a */
    public final C5996W3 f1591a;

    /* renamed from: b */
    public final C7068e6 f1592b;

    /* renamed from: c */
    public InterfaceC5843F5 f1593c;

    /* renamed from: d */
    public Job f1594d;

    /* renamed from: e */
    public final AtomicBoolean f1595e;

    @DebugMetadata(m3644c = "com.plaid.core.webview.PlaidWebview$submit$1", m3645f = "PlaidWebview.kt", m3646l = {116}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.plaid.internal.O5$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f1596a;

        /* renamed from: c */
        public final /* synthetic */ String f1598c;

        /* renamed from: d */
        public final /* synthetic */ String f1599d;

        /* renamed from: com.plaid.internal.O5$a$a, reason: collision with other inner class name */
        public static final class C49489a<T> implements FlowCollector {

            /* renamed from: a */
            public final /* synthetic */ C5927O5 f1600a;

            /* renamed from: b */
            public final /* synthetic */ String f1601b;

            /* renamed from: c */
            public final /* synthetic */ String f1602c;

            public C49489a(C5927O5 c5927o5, String str, String str2) {
                this.f1600a = c5927o5;
                this.f1601b = str;
                this.f1602c = str2;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                Object objWithContext = BuildersKt.withContext(Dispatchers.getMain(), new C5918N5(this.f1600a, this.f1601b, this.f1602c, null), continuation);
                return objWithContext == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objWithContext : Unit.INSTANCE;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f1598c = str;
            this.f1599d = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5927O5.this.new a(this.f1598c, this.f1599d, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1596a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C5927O5 c5927o5 = C5927O5.this;
                StateFlow<Boolean> stateFlow = c5927o5.f1592b.f2756d;
                C49489a c49489a = new C49489a(c5927o5, this.f1598c, this.f1599d);
                this.f1596a = 1;
                Object objCollect = stateFlow.collect(new C5936P5(c49489a), this);
                if (objCollect != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objCollect = Unit.INSTANCE;
                }
                if (objCollect == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5927O5(Context context) {
        super(new MutableContextWrapper(context), null, 0);
        Intrinsics.checkNotNullParameter(context, "context");
        C5996W3 c5996w3 = new C5996W3();
        this.f1591a = c5996w3;
        C7068e6 c7068e6 = new C7068e6(c5996w3);
        this.f1592b = c7068e6;
        this.f1595e = new AtomicBoolean(false);
        if (Build.VERSION.SDK_INT >= 26) {
            setRendererPriorityPolicy(2, false);
        }
        getSettings().setJavaScriptEnabled(true);
        getSettings().setDomStorageEnabled(true);
        getSettings().setCacheMode(2);
        getSettings().setMediaPlaybackRequiresUserGesture(false);
        setFocusable(true);
        setFocusableInTouchMode(true);
        setBackgroundColor(0);
        addJavascriptInterface(c7068e6, "PlaidAndroid");
        setWebViewClient(new C5834E5(c5996w3));
    }

    /* renamed from: a */
    public final AtomicBoolean m1277a() {
        return this.f1595e;
    }

    @Override // android.webkit.WebView
    public final void destroy() {
        this.f1591a.f1800a = null;
        Job job = this.f1594d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        super.destroy();
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event.getAction() != 0 || i != 4) {
            return super.onKeyDown(i, event);
        }
        if (canGoBack()) {
            goBack();
            return true;
        }
        InterfaceC5843F5 interfaceC5843F5 = this.f1593c;
        InterfaceC5843F5 interfaceC5843F52 = null;
        if (interfaceC5843F5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
            interfaceC5843F5 = null;
        }
        interfaceC5843F5.mo1133a();
        InterfaceC5843F5 interfaceC5843F53 = this.f1593c;
        if (interfaceC5843F53 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("listener");
        } else {
            interfaceC5843F52 = interfaceC5843F53;
        }
        if (Intrinsics.areEqual(interfaceC5843F52, InterfaceC5843F5.a.f1345a)) {
            return super.onKeyDown(i, event);
        }
        return true;
    }

    /* renamed from: a */
    public final void m1278a(String str, String str2) {
        if (str == null && str2 == null) {
            C5953R5.a.m1304b(C5953R5.f1671a, "null phone number && null DOB passed to submit -- noop");
            return;
        }
        if (str == null) {
            str = "null";
        }
        if (str2 == null) {
            str2 = "null";
        }
        Job job = this.f1594d;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, null, 1, null);
        }
        this.f1594d = BuildersKt__Builders_commonKt.launch$default(CoroutineScope2.CoroutineScope(Dispatchers.getIO()), null, null, new a(str, str2, null), 3, null);
    }
}
