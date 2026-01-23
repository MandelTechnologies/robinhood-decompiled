package com.robinhood.android.optionsexercise;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionExerciseDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionsexercise.OptionExerciseDuxo$sam$io_reactivex_functions_Function$0, reason: use source file name */
/* loaded from: classes11.dex */
final class OptionExerciseDuxo6 implements Function {
    private final /* synthetic */ Function1 function;

    OptionExerciseDuxo6(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // io.reactivex.functions.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.function.invoke(obj);
    }
}
