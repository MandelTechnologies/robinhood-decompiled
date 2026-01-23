package com.robinhood.shared.portfolio.lists.p391ui;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Utils.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
/* synthetic */ class UtilsKt$streamAndRememberCuratedListState$state$6$1 extends FunctionReferenceImpl implements Function0<Unit> {
    UtilsKt$streamAndRememberCuratedListState$state$6$1(Object obj) {
        super(0, obj, CuratedListDuxo.class, "onSwipe", "onSwipe()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((CuratedListDuxo) this.receiver).onSwipe();
    }
}
