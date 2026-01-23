package com.robinhood.android.futures.assethome;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAssetHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAssetHomeFragment2 extends FunctionReferenceImpl implements Function1<Boolean, Unit> {
    FuturesAssetHomeFragment2(Object obj) {
        super(1, obj, FuturesAssetHomeDuxo.class, "onChartLoaded", "onChartLoaded(Z)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        ((FuturesAssetHomeDuxo) this.receiver).onChartLoaded(z);
    }
}
