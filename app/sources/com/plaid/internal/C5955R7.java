package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$AndroidPlatformIdentifierConfiguration;
import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$PlatformIdentifierConfiguration;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.R7 */
/* loaded from: classes16.dex */
public final class C5955R7 extends Lambda implements Function0<Configuration$PlatformIdentifierConfiguration> {

    /* renamed from: a */
    public final /* synthetic */ String f1675a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5955R7(String str) {
        super(0);
        this.f1675a = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$PlatformIdentifierConfiguration invoke() {
        Configuration$PlatformIdentifierConfiguration.C6982a c6982aNewBuilder = Configuration$PlatformIdentifierConfiguration.newBuilder();
        Configuration$AndroidPlatformIdentifierConfiguration.C6956a c6956aNewBuilder = Configuration$AndroidPlatformIdentifierConfiguration.newBuilder();
        String str = this.f1675a;
        if (str == null) {
            str = "";
        }
        return c6982aNewBuilder.m1478a(c6956aNewBuilder.m1447a(str).build()).build();
    }
}
