package com.robinhood.equities.eventupdates.store;

import androidx.paging.Pager;
import androidx.paging.PagingConfig;
import androidx.paging.PagingData;
import androidx.paging.PagingSource;
import com.robinhood.arsenal.proto.p281v1.idl.EquityEventUpdateDto;
import com.robinhood.arsenal.proto.p281v1.idl.EquityService;
import com.robinhood.store.Store;
import com.robinhood.store.StoreBundle;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EquityEventUpdatesStore.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J8\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/equities/eventupdates/store/EquityEventUpdatesStore;", "Lcom/robinhood/store/Store;", "arsenalEquityService", "Lcom/robinhood/arsenal/proto/v1/idl/EquityService;", "storeBundle", "Lcom/robinhood/store/StoreBundle;", "<init>", "(Lcom/robinhood/arsenal/proto/v1/idl/EquityService;Lcom/robinhood/store/StoreBundle;)V", "getPagingData", "Lkotlinx/coroutines/flow/Flow;", "Landroidx/paging/PagingData;", "Lcom/robinhood/arsenal/proto/v1/idl/EquityEventUpdateDto;", "instrumentId", "Ljava/util/UUID;", "pageSize", "", "initialLoadSize", "enablePlaceholders", "", "Companion", "lib-equity-event-updates_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class EquityEventUpdatesStore extends Store {
    private static final int DEFAULT_PAGE_SIZE = 10;
    private final EquityService arsenalEquityService;
    public static final int $stable = 8;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EquityEventUpdatesStore(EquityService arsenalEquityService, StoreBundle storeBundle) {
        super(storeBundle);
        Intrinsics.checkNotNullParameter(arsenalEquityService, "arsenalEquityService");
        Intrinsics.checkNotNullParameter(storeBundle, "storeBundle");
        this.arsenalEquityService = arsenalEquityService;
    }

    public static /* synthetic */ Flow getPagingData$default(EquityEventUpdatesStore equityEventUpdatesStore, UUID uuid, int i, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            i = 10;
        }
        if ((i3 & 4) != 0) {
            i2 = i;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        return equityEventUpdatesStore.getPagingData(uuid, i, i2, z);
    }

    public final Flow<PagingData<EquityEventUpdateDto>> getPagingData(final UUID instrumentId, final int pageSize, int initialLoadSize, boolean enablePlaceholders) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        return new Pager(new PagingConfig(pageSize, Math.max(1, pageSize / 2), enablePlaceholders, initialLoadSize, 0, 0, 48, null), null, new Function0() { // from class: com.robinhood.equities.eventupdates.store.EquityEventUpdatesStore$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return EquityEventUpdatesStore.getPagingData$lambda$0(this.f$0, instrumentId, pageSize);
            }
        }, 2, null).getFlow();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PagingSource getPagingData$lambda$0(EquityEventUpdatesStore equityEventUpdatesStore, UUID uuid, int i) {
        return new EquityEventUpdatesPagingSource(equityEventUpdatesStore.arsenalEquityService, uuid, i);
    }
}
