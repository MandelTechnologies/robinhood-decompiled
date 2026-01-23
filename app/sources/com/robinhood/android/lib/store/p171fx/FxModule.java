package com.robinhood.android.lib.store.p171fx;

import com.robinhood.android.lib.p166fx.provider.FxOrderProvider;
import com.robinhood.android.lib.p166fx.provider.FxRatesProvider;
import com.robinhood.android.lib.p166fx.provider.McwDisplayCurrenciesProvider;
import com.robinhood.android.lib.p166fx.provider.McwFxRatesProvider;
import kotlin.Metadata;

/* compiled from: FxModule.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH'J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H'¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/lib/store/fx/FxModule;", "", "bindFxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/FxRatesProvider;", "fxRatesStore", "Lcom/robinhood/android/lib/store/fx/FxRatesStore;", "bindMcwFxRatesProvider", "Lcom/robinhood/android/lib/fx/provider/McwFxRatesProvider;", "mcwFxRatesStore", "Lcom/robinhood/android/lib/store/fx/McwFxRatesStore;", "bindMcwDisplayCurrenciesProvider", "Lcom/robinhood/android/lib/fx/provider/McwDisplayCurrenciesProvider;", "mcwDisplayCurrenciesStore", "Lcom/robinhood/android/lib/store/fx/McwDisplayCurrenciesStore;", "bindFxOrderProvider", "Lcom/robinhood/android/lib/fx/provider/FxOrderProvider;", "fxOrderStore", "Lcom/robinhood/android/lib/store/fx/FxOrderStore;", "lib-store-fx_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public interface FxModule {
    FxOrderProvider bindFxOrderProvider(FxOrderStore fxOrderStore);

    FxRatesProvider bindFxRatesProvider(FxRatesStore fxRatesStore);

    McwDisplayCurrenciesProvider bindMcwDisplayCurrenciesProvider(McwDisplayCurrenciesStore mcwDisplayCurrenciesStore);

    McwFxRatesProvider bindMcwFxRatesProvider(McwFxRatesStore mcwFxRatesStore);
}
