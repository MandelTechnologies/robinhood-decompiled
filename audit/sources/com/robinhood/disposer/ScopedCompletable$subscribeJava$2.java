package com.robinhood.disposer;

import io.reactivex.functions.Action;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Disposer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
/* synthetic */ class ScopedCompletable$subscribeJava$2 extends FunctionReferenceImpl implements Function0<Unit> {
    ScopedCompletable$subscribeJava$2(Object obj) {
        super(0, obj, Action.class, "run", "run()V", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() throws Exception {
        invoke2();
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() throws Exception {
        ((Action) this.receiver).run();
    }
}
