package com.robinhood.android.assethomes;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: AssetHomeFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.assethomes.AssetHomeFragment$ComposeContent$1$1$1$3$1, reason: use source file name */
/* loaded from: classes7.dex */
/* synthetic */ class AssetHomeFragment4 extends FunctionReferenceImpl implements Function0<Unit> {
    AssetHomeFragment4(Object obj) {
        super(0, obj, AssetHomeDuxo.class, "onChartLoaded", "onChartLoaded()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((AssetHomeDuxo) this.receiver).onChartLoaded();
    }
}
