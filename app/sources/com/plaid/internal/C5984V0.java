package com.plaid.internal;

import com.plaid.internal.C6045b6;
import com.plaid.internal.C7159n3;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.event.LinkEventMetadata;
import com.plaid.link.result.LinkExit;
import com.plaid.link.result.LinkSuccess;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.V0 */
/* loaded from: classes16.dex */
public final class C5984V0 implements C7159n3.a {

    /* renamed from: a */
    public final C6045b6.b f1757a;

    /* renamed from: b */
    public final C6045b6.c f1758b;

    public C5984V0(C6045b6.b eventHandler, C6045b6.c unexpectedActionHandler) {
        Intrinsics.checkNotNullParameter(eventHandler, "eventHandler");
        Intrinsics.checkNotNullParameter(unexpectedActionHandler, "unexpectedActionHandler");
        this.f1757a = eventHandler;
        this.f1758b = unexpectedActionHandler;
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1136a(LinkEvent linkEvent, AbstractC5849G2 queueOptions) {
        Intrinsics.checkNotNullParameter(linkEvent, "linkEvent");
        Intrinsics.checkNotNullParameter(queueOptions, "queueOptions");
        this.f1757a.invoke(linkEvent, queueOptions);
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: b */
    public final void mo1144b(String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.f1758b.invoke();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1140a(LinkedHashMap linkData) {
        Intrinsics.checkNotNullParameter(linkData, "linkData");
        this.f1758b.invoke();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1138a(LinkSuccess linkSuccess) {
        Intrinsics.checkNotNullParameter(linkSuccess, "linkSuccess");
        this.f1758b.invoke();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1134a(C6020Z0 exception) {
        Intrinsics.checkNotNullParameter(exception, "exception");
        this.f1758b.invoke();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1137a(LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "linkExit");
        this.f1758b.invoke();
    }

    @Override // com.plaid.internal.C7159n3.a
    /* renamed from: a */
    public final void mo1139a(String action, LinkEventMetadata linkEventMetadata) {
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(linkEventMetadata, "linkEventMetadata");
        this.f1758b.invoke();
    }
}
