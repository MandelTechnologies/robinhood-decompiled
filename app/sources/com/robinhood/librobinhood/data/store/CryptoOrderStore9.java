package com.robinhood.librobinhood.data.store;

import io.reactivex.functions.Consumer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoOrderStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CryptoOrderStore$sam$io_reactivex_functions_Consumer$0, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoOrderStore9 implements Consumer {
    private final /* synthetic */ Function1 function;

    CryptoOrderStore9(Function1 function) {
        Intrinsics.checkNotNullParameter(function, "function");
        this.function = function;
    }

    @Override // io.reactivex.functions.Consumer
    public final /* synthetic */ void accept(Object obj) {
        this.function.invoke(obj);
    }
}
