package com.plaid.internal;

import com.plaid.internal.C5953R5;
import com.plaid.link.Plaid;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventName;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope3;
import kotlinx.serialization.json.Json;

/* renamed from: com.plaid.internal.b6 */
/* loaded from: classes16.dex */
public final class C6045b6 implements InterfaceC5852G5 {

    /* renamed from: a */
    public final C5861H5 f1926a;

    /* renamed from: b */
    public final C5988V4 f1927b;

    /* renamed from: c */
    public final Lazy f1928c;

    /* renamed from: d */
    public final C7159n3 f1929d;

    /* renamed from: com.plaid.internal.b6$a */
    public static final class a extends Lambda implements Function0<List<? extends LinkEventName>> {

        /* renamed from: a */
        public static final a f1930a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final List<? extends LinkEventName> invoke() {
            return CollectionsKt.listOf((Object[]) new LinkEventName[]{LinkEventName.PROFILE_ELIGIBILITY_CHECK_READY.INSTANCE, LinkEventName.LAYER_AUTOFILL_NOT_AVAILABLE.INSTANCE, LinkEventName.LAYER_READY.INSTANCE, LinkEventName.LAYER_NOT_AVAILABLE.INSTANCE});
        }
    }

    /* renamed from: com.plaid.internal.b6$b */
    public /* synthetic */ class b extends FunctionReferenceImpl implements Function2<LinkEvent, AbstractC5849G2, Unit> {
        public b(C6045b6 c6045b6) {
            super(2, c6045b6, C6045b6.class, "onEvent", "onEvent(Lcom/plaid/link/event/LinkEvent;Lcom/plaid/internal/event/LinkQueueOptions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2) {
            LinkEvent p0 = linkEvent;
            AbstractC5849G2 p1 = abstractC5849G2;
            Intrinsics.checkNotNullParameter(p0, "p0");
            Intrinsics.checkNotNullParameter(p1, "p1");
            ((C6045b6) this.receiver).m1377a(p0, p1);
            return Unit.INSTANCE;
        }
    }

    /* renamed from: com.plaid.internal.b6$c */
    public /* synthetic */ class c extends FunctionReferenceImpl implements Function0<Unit> {
        public c(C6045b6 c6045b6) {
            super(0, c6045b6, C6045b6.class, "preLoadFailed", "preLoadFailed()V", 0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            C6045b6 c6045b6 = (C6045b6) this.receiver;
            C5988V4 c5988v4 = c6045b6.f1927b;
            c5988v4.getClass();
            Intrinsics.checkNotNullParameter("Preload received unexpected action", "message");
            BuildersKt__Builders_commonKt.launch$default(CoroutineScope3.INSTANCE, null, null, new C5970T4(c5988v4, "Preload received unexpected action", null), 3, null);
            c6045b6.f1926a.m1209a();
            return Unit.INSTANCE;
        }
    }

    public C6045b6(C5861H5 webViewRegistry, C5988V4 crashReporter, Json json) {
        Intrinsics.checkNotNullParameter(webViewRegistry, "webViewRegistry");
        Intrinsics.checkNotNullParameter(crashReporter, "crashReporter");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f1926a = webViewRegistry;
        this.f1927b = crashReporter;
        this.f1928c = LazyKt.lazy(a.f1930a);
        this.f1929d = new C7159n3(new C5984V0(new b(this), new c(this)), json);
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final void mo1135a(AbstractC7134l4 openInterstitialMessage) {
        Intrinsics.checkNotNullParameter(openInterstitialMessage, "openInterstitialMessage");
    }

    /* renamed from: a */
    public final void m1377a(LinkEvent linkEvent, AbstractC5849G2 abstractC5849G2) {
        if (((List) this.f1928c.getValue()).contains(linkEvent.getEventName())) {
            C5953R5.a.m1299a(C5953R5.f1671a, "Preload delivered event: " + linkEvent.getEventName());
            Plaid.INSTANCE.getCustomerFacingLinkEventListenerInternal$link_sdk_release().invoke(linkEvent);
            return;
        }
        C5953R5.a.m1299a(C5953R5.f1671a, "Preload enqueued event: " + linkEvent.getEventName());
        Function2<LinkEvent, AbstractC5849G2, Unit> linkEventListenerInternal$link_sdk_release = Plaid.INSTANCE.getLinkEventListenerInternal$link_sdk_release();
        if (linkEventListenerInternal$link_sdk_release != null) {
            linkEventListenerInternal$link_sdk_release.invoke(linkEvent, abstractC5849G2);
            Unit unit = Unit.INSTANCE;
        }
    }

    @Override // com.plaid.internal.InterfaceC5852G5
    /* renamed from: a */
    public final boolean mo1142a(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1929d.m1563a(url);
        return true;
    }
}
