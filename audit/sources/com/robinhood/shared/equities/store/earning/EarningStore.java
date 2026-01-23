package com.robinhood.shared.equities.store.earning;

import com.robinhood.shared.equities.models.instrumentdetails.p381ui.UiEarnings;
import java.util.UUID;
import kotlin.Metadata;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EarningStore.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/shared/equities/store/earning/EarningStore;", "", "streamEarnings", "Lkotlinx/coroutines/flow/Flow;", "Lcom/robinhood/shared/equities/models/instrumentdetails/ui/UiEarnings;", "instrumentId", "Ljava/util/UUID;", "lib-store-earning_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public interface EarningStore {
    Flow<UiEarnings> streamEarnings(UUID instrumentId);
}
