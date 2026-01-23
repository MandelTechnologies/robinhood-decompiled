package com.robinhood.android.futures.assethome;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAssetHomeTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt$FuturesAssetHomeTopBar$1$2$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAssetHomeTopBar2 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesAssetHomeTopBar2(Object obj) {
        super(0, obj, FuturesAssetHomeScreen3.class, "onBackFromAssetHome", "onBackFromAssetHome()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesAssetHomeScreen3) this.receiver).onBackFromAssetHome();
    }
}
