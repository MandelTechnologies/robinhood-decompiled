package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.bonfire.ShareholderEventsSectionDao;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsSection;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ShareholderEventsSectionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsSectionStore$streamEventsSection$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderEventsSectionStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends ShareholderEventsSection>> {
    ShareholderEventsSectionStore4(Object obj) {
        super(1, obj, ShareholderEventsSectionDao.class, "getShareholderEvents", "getShareholderEvents(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<ShareholderEventsSection> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((ShareholderEventsSectionDao) this.receiver).getShareholderEvents(p0);
    }
}
