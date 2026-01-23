package com.robinhood.android.lib.p166fx.provider;

import com.robinhood.models.p325fx.p326db.McwDisplayCurrencies;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwDisplayCurrenciesProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "", "fetchMcwDisplayCurrencies", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/models/fx/db/McwDisplayCurrencies;", "accountNumber", "", "lib-fx-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface McwDisplayCurrenciesProvider {
    Flow<McwDisplayCurrencies> fetchMcwDisplayCurrencies(String accountNumber);
}
