package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.p011ui.text.input.TextFieldValue;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemoInputFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputFragment$ComposeContent$1$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class MemoInputFragment2 extends FunctionReferenceImpl implements Function1<TextFieldValue, Unit> {
    MemoInputFragment2(Object obj) {
        super(1, obj, MemoInputDuxo.class, "updateMemo", "updateMemo(Landroidx/compose/ui/text/input/TextFieldValue;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue) {
        invoke2(textFieldValue);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(TextFieldValue p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((MemoInputDuxo) this.receiver).updateMemo(p0);
    }
}
