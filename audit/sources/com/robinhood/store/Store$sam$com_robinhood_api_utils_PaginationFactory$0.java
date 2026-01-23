package com.robinhood.store;

import com.robinhood.api.utils.PaginationFactory;
import io.reactivex.Single;
import kotlin.Function;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Store.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
final class Store$sam$com_robinhood_api_utils_PaginationFactory$0 implements PaginationFactory, FunctionAdapter {
    private final /* synthetic */ Function1 function;

    Store$sam$com_robinhood_api_utils_PaginationFactory$0(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof PaginationFactory) && (obj instanceof FunctionAdapter)) {
            return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // com.robinhood.api.utils.PaginationFactory
    public final /* synthetic */ Single generate(String str) {
        return (Single) this.function.invoke(str);
    }

    @Override // kotlin.jvm.internal.FunctionAdapter
    public final Function<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
