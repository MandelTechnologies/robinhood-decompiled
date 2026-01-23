package com.robinhood.android.transfers.p271ui.p272v2;

import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CreateTransferV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferV2Fragment$ComposeContent$8$1 extends FunctionReferenceImpl implements Function1<KeyEvent, Unit> {
    CreateTransferV2Fragment$ComposeContent$8$1(Object obj) {
        super(1, obj, CreateTransferV2Duxo.class, "onKeyPress", "onKeyPress(Landroid/view/KeyEvent;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(KeyEvent keyEvent) {
        invoke2(keyEvent);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(KeyEvent p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CreateTransferV2Duxo) this.receiver).onKeyPress(p0);
    }
}
