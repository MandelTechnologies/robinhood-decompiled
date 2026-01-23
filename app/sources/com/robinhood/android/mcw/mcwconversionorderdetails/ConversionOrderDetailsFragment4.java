package com.robinhood.android.mcw.mcwconversionorderdetails;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ConversionOrderDetailsFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.mcw.mcwconversionorderdetails.ConversionOrderDetailsFragment$ComposeContent$1$3$1, reason: use source file name */
/* loaded from: classes8.dex */
/* synthetic */ class ConversionOrderDetailsFragment4 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
    ConversionOrderDetailsFragment4(Object obj) {
        super(1, obj, ConversionOrderDetailsFragment.class, "handleNetworkError", "handleNetworkError(Ljava/lang/Throwable;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((ConversionOrderDetailsFragment) this.receiver).handleNetworkError(p0);
    }
}
