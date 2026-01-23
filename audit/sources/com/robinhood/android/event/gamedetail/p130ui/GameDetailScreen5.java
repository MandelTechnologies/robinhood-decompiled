package com.robinhood.android.event.gamedetail.p130ui;

import com.robinhood.android.event.gamedetail.GameDetailDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: GameDetailScreen.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.gamedetail.ui.GameDetailScreenKt$GameDetailScreen$3$2$7$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class GameDetailScreen5 extends FunctionReferenceImpl implements Function0<Unit> {
    GameDetailScreen5(Object obj) {
        super(0, obj, GameDetailDuxo.class, "onShowDisabledTradeButtonMessage", "onShowDisabledTradeButtonMessage()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((GameDetailDuxo) this.receiver).onShowDisabledTradeButtonMessage();
    }
}
