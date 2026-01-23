package com.plaid.internal;

import android.net.Uri;
import android.webkit.ValueCallback;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModel2;
import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.C5953R5;
import com.plaid.internal.C7159n3;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.event.LinkEventName;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.coroutines.flow.SharedFlow2;
import kotlinx.coroutines.flow.SharedFlow4;
import kotlinx.serialization.json.Json;

@SourceDebugExtension
/* renamed from: com.plaid.internal.A7 */
/* loaded from: classes16.dex */
public final class C5800A7 extends ViewModel implements InterfaceC5843F5, InterfaceC5852G5, C7159n3.a {

    /* renamed from: a */
    public final Json f1236a;

    /* renamed from: b */
    public final InterfaceC7203s2 f1237b;

    /* renamed from: c */
    public final InterfaceC7198r6 f1238c;

    /* renamed from: d */
    public final C6044b5 f1239d;

    /* renamed from: e */
    public final InterfaceC7189q6 f1240e;

    /* renamed from: f */
    public final InterfaceC7180p6 f1241f;

    /* renamed from: g */
    public final C7172o7 f1242g;

    /* renamed from: h */
    public final C5861H5 f1243h;

    /* renamed from: i */
    public final InterfaceC7136l6 f1244i;

    /* renamed from: j */
    public final C5837F f1245j;

    /* renamed from: k */
    public final C6026Z6 f1246k;

    /* renamed from: l */
    public final C7159n3 f1247l;

    /* renamed from: m */
    public final SharedFlow2<String> f1248m;

    /* renamed from: n */
    public ValueCallback<Uri[]> f1249n;

    /* renamed from: o */
    public final C7088g6 f1250o;

    /* renamed from: p */
    public final C7272z7 f1251p;

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$onCleared$1", m3645f = "WebviewViewModel.kt", m3646l = {136, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.plaid.internal.A7$a */
    public static final class a extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public C5800A7 f1252a;

        /* renamed from: b */
        public Iterator f1253b;

        /* renamed from: c */
        public int f1254c;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5800A7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C5800A7.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0039, code lost:
        
            if (r8 == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            C5800A7 c5800a7;
            Iterator it;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1254c;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                C6044b5 c6044b5 = C5800A7.this.f1239d;
                if (c6044b5 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                    c6044b5 = null;
                }
                this.f1254c = 1;
                obj = c6044b5.m1376a(this);
            } else {
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    it = this.f1253b;
                    c5800a7 = this.f1252a;
                    ResultKt.throwOnFailure(obj);
                    while (it.hasNext()) {
                        String str = (String) it.next();
                        C6044b5 c6044b52 = c5800a7.f1239d;
                        if (c6044b52 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("internalPictureStorage");
                            c6044b52 = null;
                        }
                        this.f1252a = c5800a7;
                        this.f1253b = it;
                        this.f1254c = 2;
                        if (c6044b52.m1375a(str, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                    return Unit.INSTANCE;
                }
                ResultKt.throwOnFailure(obj);
            }
            c5800a7 = C5800A7.this;
            it = ((Iterable) obj).iterator();
            while (it.hasNext()) {
            }
            return Unit.INSTANCE;
        }
    }

    @DebugMetadata(m3644c = "com.plaid.internal.workflow.webview.WebviewViewModel$onWebviewCancelled$1", m3645f = "WebviewViewModel.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.plaid.internal.A7$b */
    public static final class b extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: a */
        public int f1256a;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return C5800A7.this.new b(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return C5800A7.this.new b(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f1256a;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                InterfaceC7203s2 interfaceC7203s2M1143b = C5800A7.this.m1143b();
                this.f1256a = 1;
                if (interfaceC7203s2M1143b.mo1583a(this) == coroutine_suspended) {
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

    public C5800A7(InterfaceC5839F1 webviewComponent) {
        Intrinsics.checkNotNullParameter(webviewComponent, "webviewComponent");
        this.f1248m = SharedFlow4.MutableSharedFlow$default(1, 0, null, 6, null);
        this.f1251p = new C7272z7(this);
        C7147m0 c7147m0 = (C7147m0) webviewComponent;
        Json json = c7147m0.f2943a.f3041e.get();
        this.f1236a = json;
        this.f1237b = c7147m0.f2956n.get();
        this.f1238c = c7147m0.f2957o.get();
        this.f1239d = c7147m0.f2958p.get();
        this.f1240e = c7147m0.f2959q.get();
        this.f1241f = c7147m0.f2960r.get();
        this.f1242g = c7147m0.f2961s.get();
        this.f1243h = c7147m0.f2943a.f3051o.get();
        this.f1244i = c7147m0.f2962t.get();
        this.f1245j = c7147m0.f2963u.get();
        this.f1246k = c7147m0.f2965w.get();
        this.f1250o = c7147m0.f2966x.get();
        if (json == null) {
            Intrinsics.throwUninitializedPropertyAccessException("json");
            json = null;
        }
        this.f1247l = new C7159n3(this, json);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7244w7(this, null), 3, null);
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7254x7(this, null), 3, null);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1134a(C6020Z0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7263y7(this, null), 3, null);
        m1143b().mo1586a(C5876J2.m1228b(exception, null));
    }

    /* renamed from: b */
    public final InterfaceC7203s2 m1143b() {
        InterfaceC7203s2 interfaceC7203s2 = this.f1237b;
        if (interfaceC7203s2 != null) {
            return interfaceC7203s2;
        }
        Intrinsics.throwUninitializedPropertyAccessException("linkController");
        return null;
    }

    @Override // androidx.lifecycle.ViewModel
    public final void onCleared() {
        BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new a(null), 3, null);
        super.onCleared();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: b */
    public final void mo1144b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        m1143b().mo1587a(url);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1137a(LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7263y7(this, null), 3, null);
        m1143b().mo1586a(linkExit);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1138a(LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C7263y7(this, null), 3, null);
        m1143b().mo1586a(linkSuccess);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1140a(LinkedHashMap linkData) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C5809B7(this, linkData, null), 3, null);
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final boolean mo1142a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1247l.m1563a(url);
        return true;
    }

    @Override // com.plaid.internal.InterfaceC5843F5
    /* renamed from: a */
    public final void mo1133a() {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public final void m1141a(List uris) {
        Intrinsics.checkNotNullParameter(uris, "uris");
        ValueCallback<Uri[]> valueCallback = this.f1249n;
        if (valueCallback != 0) {
            valueCallback.onReceiveValue(uris.toArray(new Uri[0]));
        }
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final void mo1135a(AbstractC7134l4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
        m1143b().mo1585a(openInterstitialMessage);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1136a(LinkEvent linkEvent, AbstractC5849G2 queueOptions) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        Intrinsics.checkNotNullParameter(queueOptions, "queueOptions");
        C5953R5.a.m1299a(C5953R5.f1671a, "Event: " + linkEvent.getEventName());
        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, queueOptions);
        }
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1139a(String string2, LinkEventMetadata metadata) {
        Intrinsics.checkNotNullParameter(string2, "action");
        Intrinsics.checkNotNullParameter(metadata, "linkEventMetadata");
        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            Intrinsics.checkNotNullParameter(string2, "string");
            LinkEventName eventName = LinkEventName.INSTANCE.fromString$link_sdk_release(string2);
            Intrinsics.checkNotNullParameter(eventName, "eventName");
            Intrinsics.checkNotNullParameter(metadata, "metadata");
            linkEventListenerInternal$link_sdk_release.invoke(new LinkEvent(eventName, metadata), AbstractC5849G2.d.f1351a);
        }
    }
}
