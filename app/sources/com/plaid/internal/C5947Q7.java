package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.primitives.Configuration$DeviceMetadata;
import java.util.Locale;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* renamed from: com.plaid.internal.Q7 */
/* loaded from: classes16.dex */
public final class C5947Q7 extends Lambda implements Function0<Configuration$DeviceMetadata> {

    /* renamed from: a */
    public final /* synthetic */ C5973T7 f1657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5947Q7(C5973T7 c5973t7) {
        super(0);
        C5860H4 c5860h4 = C5860H4.f1365a;
        this.f1657a = c5973t7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Configuration$DeviceMetadata invoke() {
        Configuration$DeviceMetadata.C6960a c6960aNewBuilder = Configuration$DeviceMetadata.newBuilder();
        C5860H4 c5860h4 = C5860H4.f1365a;
        C5973T7 c5973t7 = this.f1657a;
        c6960aNewBuilder.m1455d(C5860H4.f1367c);
        c6960aNewBuilder.m1456e(C5860H4.f1368d);
        c6960aNewBuilder.m1457f(C5860H4.f1372h);
        c6960aNewBuilder.m1458g(C5860H4.f1371g);
        c6960aNewBuilder.m1454c(((Locale) c5973t7.f1729i.getValue()).toLanguageTag());
        c6960aNewBuilder.m1451a(((Locale) c5973t7.f1729i.getValue()).getCountry());
        c6960aNewBuilder.m1453b(((Locale) c5973t7.f1729i.getValue()).getLanguage());
        c6960aNewBuilder.m1452b(C5860H4.f1375k);
        c6960aNewBuilder.m1450a(C5860H4.f1374j);
        return c6960aNewBuilder.build();
    }
}
