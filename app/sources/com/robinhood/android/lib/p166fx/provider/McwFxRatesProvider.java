package com.robinhood.android.lib.p166fx.provider;

import com.robinhood.models.p325fx.api.ApiMcwFxQuotes;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.rosetta.common.Currency;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* compiled from: McwFxRatesProvider.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH¦@¢\u0006\u0002\u0010\u000bJ\"\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\r2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&J\u0018\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r2\u0006\u0010\u000f\u001a\u00020\u0010H&¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "", "getLocalFxRate", "Lcom/robinhood/models/fx/db/McwFxRate;", "symbol", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchFxRates", "Lcom/robinhood/models/fx/api/ApiMcwFxQuotes;", "symbols", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamFxRates", "Lkotlinx/coroutines/flow/Flow;", "streamFromUsdFxRate", "currency", "Lcom/robinhood/rosetta/common/Currency;", "lib-fx-provider_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface McwFxRatesProvider {
    Object fetchFxRates(List<String> list, Continuation<? super ApiMcwFxQuotes> continuation);

    Object getLocalFxRate(String str, Continuation<? super McwFxRate> continuation);

    Flow<McwFxRate> streamFromUsdFxRate(Currency currency);

    Flow<List<McwFxRate>> streamFxRates(List<String> symbols);
}
