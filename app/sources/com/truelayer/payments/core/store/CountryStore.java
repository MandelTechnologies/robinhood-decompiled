package com.truelayer.payments.core.store;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* compiled from: CountryStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H¦@¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/truelayer/payments/core/store/CountryStore;", "", "getLastUsedCountryCode", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveLastUsed", "", "countryCode", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "payments-core_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface CountryStore {
    Object getLastUsedCountryCode(Continuation<? super String> continuation);

    Object saveLastUsed(String str, Continuation<? super Unit> continuation);
}
