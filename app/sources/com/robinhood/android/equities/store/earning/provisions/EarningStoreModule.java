package com.robinhood.android.equities.store.earning.provisions;

import com.robinhood.shared.equities.models.store.TraderEarningStore;
import com.robinhood.shared.equities.store.earning.EarningStore;
import kotlin.Metadata;

/* compiled from: EarningStoreModule.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equities/store/earning/provisions/EarningStoreModule;", "", "provideEarningStore", "Lcom/robinhood/shared/equities/store/earning/EarningStore;", "traderEarningStore", "Lcom/robinhood/shared/equities/models/store/TraderEarningStore;", "lib-store-earning-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public interface EarningStoreModule {
    EarningStore provideEarningStore(TraderEarningStore traderEarningStore);
}
