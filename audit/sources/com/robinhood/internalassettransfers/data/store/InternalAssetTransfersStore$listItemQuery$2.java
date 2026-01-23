package com.robinhood.internalassettransfers.data.store;

import com.robinhood.models.internalassettransfer.p328db.bonfire.DbAssetTransferRecord;
import com.robinhood.models.internalassettransfer.p328db.dao.InternalAssetTransferDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InternalAssetTransfersStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
/* synthetic */ class InternalAssetTransfersStore$listItemQuery$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends DbAssetTransferRecord>> {
    InternalAssetTransfersStore$listItemQuery$2(Object obj) {
        super(1, obj, InternalAssetTransferDao.class, "getInternalAssetTransferItem", "getInternalAssetTransferItem(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<DbAssetTransferRecord> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((InternalAssetTransferDao) this.receiver).getInternalAssetTransferItem(p0);
    }
}
