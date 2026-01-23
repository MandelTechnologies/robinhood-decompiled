package com.robinhood.android.optionsexercise;

import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseFragment.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseFragment$onResume$1$2, reason: use source file name */
/* loaded from: classes11.dex */
/* synthetic */ class OptionExerciseFragment4 extends FunctionReferenceImpl implements Function1<BigDecimal, Unit> {
    OptionExerciseFragment4(Object obj) {
        super(1, obj, OptionExerciseDuxo.class, "setQuantity", "setQuantity(Ljava/math/BigDecimal;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(BigDecimal bigDecimal) {
        invoke2(bigDecimal);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(BigDecimal p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        ((OptionExerciseDuxo) this.receiver).setQuantity(p0);
    }
}
