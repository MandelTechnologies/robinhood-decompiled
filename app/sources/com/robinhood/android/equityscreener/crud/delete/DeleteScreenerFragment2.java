package com.robinhood.android.equityscreener.crud.delete;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: DeleteScreenerFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.equityscreener.crud.delete.DeleteScreenerFragment$ComposeContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
/* synthetic */ class DeleteScreenerFragment2 extends FunctionReferenceImpl implements Function0<Unit> {
    DeleteScreenerFragment2(Object obj) {
        super(0, obj, DeleteScreenerDuxo.class, "onDelete", "onDelete()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ((DeleteScreenerDuxo) this.receiver).onDelete();
    }
}
