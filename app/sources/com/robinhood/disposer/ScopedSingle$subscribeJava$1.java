package com.robinhood.disposer;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* compiled from: Disposer.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
/* synthetic */ class ScopedSingle$subscribeJava$1 extends FunctionReferenceImpl implements Function1<Object, Unit> {
    ScopedSingle$subscribeJava$1(Object obj) {
        super(1, obj, Consumer.class, "accept", "accept(Ljava/lang/Object;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Object obj) throws Exception {
        invoke2(obj);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Object obj) throws Exception {
        ((Consumer) this.receiver).accept(obj);
    }
}
