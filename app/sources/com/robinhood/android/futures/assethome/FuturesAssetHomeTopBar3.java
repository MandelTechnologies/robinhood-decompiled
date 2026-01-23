package com.robinhood.android.futures.assethome;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: FuturesAssetHomeTopBar.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.assethome.FuturesAssetHomeTopBarKt$FuturesAssetHomeTopBar$1$3$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class FuturesAssetHomeTopBar3 extends FunctionReferenceImpl implements Function0<Unit> {
    FuturesAssetHomeTopBar3(Object obj) {
        super(0, obj, FuturesAssetHomeScreen3.class, "onSearchPressed", "onSearchPressed()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((FuturesAssetHomeScreen3) this.receiver).onSearchPressed();
    }
}
