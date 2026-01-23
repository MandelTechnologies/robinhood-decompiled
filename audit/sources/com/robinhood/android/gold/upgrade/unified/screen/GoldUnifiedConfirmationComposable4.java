package com.robinhood.android.gold.upgrade.unified.screen;

import gold_flow.proto.p466v1.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: GoldUnifiedConfirmationComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.upgrade.unified.screen.GoldUnifiedConfirmationComposableKt$GoldUnifiedConfirmationComposable$1$1, reason: use source file name */
/* loaded from: classes10.dex */
/* synthetic */ class GoldUnifiedConfirmationComposable4 extends AdaptedFunctionReference implements Function1<Action, Unit> {
    GoldUnifiedConfirmationComposable4(Object obj) {
        super(1, obj, GoldUnifiedConfirmationDuxo.class, "sendAction", "sendAction(Lgold_flow/proto/v1/Action;)Lkotlinx/coroutines/Job;", 8);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Action action) {
        invoke2(action);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Action action) {
        ((GoldUnifiedConfirmationDuxo) this.receiver).sendAction(action);
    }
}
