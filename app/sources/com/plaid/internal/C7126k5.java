package com.plaid.internal;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.json.Json4;

/* renamed from: com.plaid.internal.k5 */
/* loaded from: classes16.dex */
public final class C7126k5 extends Lambda implements Function1<Json4, Unit> {

    /* renamed from: a */
    public static final C7126k5 f2904a = new C7126k5();

    public C7126k5() {
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
