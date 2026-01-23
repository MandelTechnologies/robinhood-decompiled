package com.robinhood.librobinhood.data.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiDividend;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DividendStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.DividendStore$refresh$network$1$2, reason: use source file name */
/* loaded from: classes13.dex */
final class DividendStore4<T> implements Consumer {
    final /* synthetic */ DividendStore this$0;

    DividendStore4(DividendStore dividendStore) {
        this.this$0 = dividendStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UUID accept$lambda$0(ApiDividend it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getInstrumentId();
    }

    @Override // io.reactivex.functions.Consumer
    public final void accept(PaginatedResult<ApiDividend> paginatedResult) {
        InstrumentStore instrumentStore = this.this$0.instrumentStore;
        Intrinsics.checkNotNull(paginatedResult);
        instrumentStore.pingInstruments(paginatedResult, new Function1() { // from class: com.robinhood.librobinhood.data.store.DividendStore$refresh$network$1$2$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DividendStore4.accept$lambda$0((ApiDividend) obj);
            }
        });
    }
}
