package com.robinhood.android.common.recurring.schedule;

import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringOrderScheduleDuxo.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.recurring.schedule.RecurringOrderScheduleDuxo$sam$io_reactivex_functions_Function$0, reason: use source file name */
/* loaded from: classes2.dex */
final class RecurringOrderScheduleDuxo3 implements Function {
    private final /* synthetic */ Function1 function;

    RecurringOrderScheduleDuxo3(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // io.reactivex.functions.Function
    public final /* synthetic */ Object apply(Object obj) {
        return this.function.invoke(obj);
    }
}
