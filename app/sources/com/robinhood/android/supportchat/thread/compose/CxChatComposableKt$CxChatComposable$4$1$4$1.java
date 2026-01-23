package com.robinhood.android.supportchat.thread.compose;

import com.robinhood.android.supportchat.thread.CxChatDuxo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CxChatComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
/* synthetic */ class CxChatComposableKt$CxChatComposable$4$1$4$1 extends FunctionReferenceImpl implements Function1<String, Unit> {
    CxChatComposableKt$CxChatComposable$4$1$4$1(Object obj) {
        super(1, obj, CxChatDuxo.class, "onInputChanged", "onInputChanged(Ljava/lang/String;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((CxChatDuxo) this.receiver).onInputChanged(p0);
    }
}
