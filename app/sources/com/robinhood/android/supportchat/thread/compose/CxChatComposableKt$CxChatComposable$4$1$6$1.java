package com.robinhood.android.supportchat.thread.compose;

import com.robinhood.android.supportchat.thread.CxChatDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: CxChatComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CxChatComposableKt$CxChatComposable$4$1$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    CxChatComposableKt$CxChatComposable$4$1$6$1(Object obj) {
        super(0, obj, CxChatDuxo.class, "dismissDialog", "dismissDialog()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CxChatDuxo) this.receiver).dismissDialog();
    }
}
