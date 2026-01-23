package com.plaid.internal;

import com.plaid.internal.AbstractC5849G2;
import com.plaid.internal.core.protos.link.channel.Channel$Message;
import com.plaid.link.event.LinkEvent;
import com.plaid.link.result.LinkResult;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.plaid.internal.G */
/* loaded from: classes16.dex */
public abstract class AbstractC5846G {
    /* renamed from: a */
    public void mo1195a() {
    }

    /* renamed from: a */
    public void mo1198a(LinkEvent event, AbstractC5849G2.d options) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(options, "options");
    }

    /* renamed from: a */
    public void mo1199a(LinkResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    /* renamed from: a */
    public void mo1197a(Channel$Message.SDKResult result) {
        Intrinsics.checkNotNullParameter(result, "result");
    }

    /* renamed from: a */
    public void mo1196a(AbstractC5919N6 requestInfo) {
        Intrinsics.checkNotNullParameter(requestInfo, "requestInfo");
    }
}
