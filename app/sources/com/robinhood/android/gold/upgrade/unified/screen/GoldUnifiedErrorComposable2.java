package com.robinhood.android.gold.upgrade.unified.screen;

import androidx.navigation.NavHostController;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GoldUnifiedErrorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedErrorComposableKt$GoldUnifiedErrorComposable$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldUnifiedErrorComposable2 extends FunctionReferenceImpl implements Function0<Unit> {
    GoldUnifiedErrorComposable2(Object obj) {
        super(0, obj, GoldUnifiedNavController.class, "finishWithCancel", "finishWithCancel(Landroidx/navigation/NavHostController;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoldUnifiedNavController.finishWithCancel((NavHostController) this.receiver);
    }
}
