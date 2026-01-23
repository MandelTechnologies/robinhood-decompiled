package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$SDKMetadata;
import com.plaid.internal.core.protos.link.workflow.primitives.EnumC7027g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.S7 */
/* loaded from: classes16.dex */
public final class C5964S7 extends Lambda implements Function0<Configuration$SDKMetadata> {

    /* renamed from: a */
    public final /* synthetic */ C5973T7 f1696a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5964S7(C5973T7 c5973t7) {
        super(0);
        this.f1696a = c5973t7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$SDKMetadata invoke() {
        Configuration$SDKMetadata.C6985a c6985aNewBuilder = Configuration$SDKMetadata.newBuilder();
        C5973T7 c5973t7 = this.f1696a;
        c6985aNewBuilder.m1483a(EnumC7027g.CLIENT_TYPE_ANDROID);
        c6985aNewBuilder.m1486c(c5973t7.f1721a);
        c6985aNewBuilder.m1481a();
        c6985aNewBuilder.m1485b(c5973t7.f1725e);
        c6985aNewBuilder.m1484a(c5973t7.f1727g);
        if (c5973t7.f1722b != null) {
            c6985aNewBuilder.m1482a(Configuration$SDKMetadata.WrappingSDK.newBuilder().m1479a(EnumC7027g.CLIENT_TYPE_REACTNATIVEANDROID).m1480a(c5973t7.f1722b).build());
        }
        if (c5973t7.f1723c != null) {
            Configuration$SDKMetadata.WrappingSDK.newBuilder().m1479a(EnumC7027g.CLIENT_TYPE_FLUTTERANDROID).m1480a(c5973t7.f1723c).build();
        }
        return c6985aNewBuilder.build();
    }
}
