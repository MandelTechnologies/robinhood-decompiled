package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.bonfire.ShareholderEntryPointDao;
import com.robinhood.shareholderx.models.p401db.ShareholderEntryPointResponse;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ShareholderEventStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventStore$streamEntryPointInfo$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderEventStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends ShareholderEntryPointResponse>> {
    ShareholderEventStore4(Object obj) {
        super(1, obj, ShareholderEntryPointDao.class, "getShareholderEntryPointResponse", "getShareholderEntryPointResponse(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<ShareholderEntryPointResponse> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((ShareholderEntryPointDao) this.receiver).getShareholderEntryPointResponse(p0);
    }
}
