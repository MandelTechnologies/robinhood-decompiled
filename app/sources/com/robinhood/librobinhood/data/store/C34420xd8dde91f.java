package com.robinhood.librobinhood.data.store;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderInvestmentScheduleStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.TraderInvestmentScheduleStore$sam$io_reactivex_functions_Consumer$0 */
/* loaded from: classes13.dex */
final class C34420xd8dde91f implements Consumer {
    private final /* synthetic */ Function1 function;

    C34420xd8dde91f(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.function.invoke(obj);
    }
}
