package com.robinhood.android.gold.upgrade.unified.screen.sage;

import androidx.navigation.NavHostController;
import com.robinhood.android.gold.upgrade.unified.GoldUnifiedNavController;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldSageStartApplicationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.sage.GoldSageStartApplicationComposableKt$GoldSageStartApplicationComposable$1$1$1$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldSageStartApplicationComposable5 extends AdaptedFunctionReference implements Function0<Unit> {
    GoldSageStartApplicationComposable5(Object obj) {
        super(0, obj, GoldUnifiedNavController.class, "navigateBackOrExit", "navigateBackOrExit(Landroidx/navigation/NavHostController;Lkotlin/jvm/functions/Function1;)V", 1);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        GoldUnifiedNavController.navigateBackOrExit$default((NavHostController) this.receiver, null, 1, null);
    }
}
