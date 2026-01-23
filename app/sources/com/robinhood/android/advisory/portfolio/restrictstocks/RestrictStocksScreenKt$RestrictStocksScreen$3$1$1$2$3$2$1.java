package com.robinhood.android.advisory.portfolio.restrictstocks;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RestrictStocksScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
/* synthetic */ class RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$2$1 extends FunctionReferenceImpl implements Function3<String, String, Boolean, Unit> {
    RestrictStocksScreenKt$RestrictStocksScreen$3$1$1$2$3$2$1(Object obj) {
        super(3, obj, RestrictStocksDuxo.class, "updateRestrictedAsset", "updateRestrictedAsset(Ljava/lang/String;Ljava/lang/String;Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
        invoke(str, str2, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(String p0, String p1, boolean z) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        Intrinsics.checkNotNullParameter(p1, "p1");
        ((RestrictStocksDuxo) this.receiver).updateRestrictedAsset(p0, p1, z);
    }
}
