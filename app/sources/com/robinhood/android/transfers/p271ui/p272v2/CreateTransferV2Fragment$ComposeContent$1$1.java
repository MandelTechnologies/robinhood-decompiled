package com.robinhood.android.transfers.p271ui.p272v2;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CreateTransferV2Fragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CreateTransferV2Fragment$ComposeContent$1$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CreateTransferV2Fragment$ComposeContent$1$1(Object obj) {
        super(0, obj, CreateTransferV2Duxo.class, "switchToEditMode", "switchToEditMode()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CreateTransferV2Duxo) this.receiver).switchToEditMode();
    }
}
