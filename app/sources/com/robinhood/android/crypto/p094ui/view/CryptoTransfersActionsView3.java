package com.robinhood.android.crypto.p094ui.view;

import com.robinhood.models.serverdriven.p347db.GenericAction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CryptoTransfersActionsView.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.crypto.ui.view.CryptoTransfersActionsView$Content$1$1$1$2$1, reason: use source file name */
/* loaded from: classes2.dex */
/* synthetic */ class CryptoTransfersActionsView3 extends FunctionReferenceImpl implements Function1<GenericAction, Unit> {
    CryptoTransfersActionsView3(Object obj) {
        super(1, obj, CryptoTransfersActionsView.class, "handleAction", "handleAction(Lcom/robinhood/models/serverdriven/db/GenericAction;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GenericAction genericAction) {
        invoke2(genericAction);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(GenericAction genericAction) {
        ((CryptoTransfersActionsView) this.receiver).handleAction(genericAction);
    }
}
