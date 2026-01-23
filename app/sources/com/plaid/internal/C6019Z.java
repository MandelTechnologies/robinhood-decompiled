package com.plaid.internal;

import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import p479j$.util.DesugarTimeZone;

/* renamed from: com.plaid.internal.Z */
/* loaded from: classes16.dex */
public final class C6019Z extends Lambda implements Function0<SimpleDateFormat> {

    /* renamed from: a */
    public final /* synthetic */ C6029a0 f1860a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6019Z(C6029a0 c6029a0) {
        super(0);
        this.f1860a = c6029a0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SimpleDateFormat invoke() {
        this.f1860a.getClass();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSSSSZ", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("gmt"));
        return simpleDateFormat;
    }
}
