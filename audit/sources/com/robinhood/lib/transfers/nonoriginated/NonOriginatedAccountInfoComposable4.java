package com.robinhood.lib.transfers.nonoriginated;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: NonOriginatedAccountInfoComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.lib.transfers.nonoriginated.NonOriginatedAccountInfoComposableKt$NonOriginatedAccountInfoComposable$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class NonOriginatedAccountInfoComposable4 extends FunctionReferenceImpl implements Function1<Integer, Unit> {
    NonOriginatedAccountInfoComposable4(Object obj) {
        super(1, obj, NonOriginatedAccountInfoDuxo.class, "expandOrCollapseSection", "expandOrCollapseSection(I)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        ((NonOriginatedAccountInfoDuxo) this.receiver).expandOrCollapseSection(i);
    }
}
