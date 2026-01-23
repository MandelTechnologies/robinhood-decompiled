package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.dao.bonfire.ShareholderEventsPageDao;
import com.robinhood.shareholderx.models.p401db.ShareholderEventsPage;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: ShareholderEventsPageStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.ShareholderEventsPageStore$streamEventsPage$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class ShareholderEventsPageStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends ShareholderEventsPage>> {
    ShareholderEventsPageStore4(Object obj) {
        super(1, obj, ShareholderEventsPageDao.class, "getShareholderEventsPage", "getShareholderEventsPage(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<ShareholderEventsPage> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((ShareholderEventsPageDao) this.receiver).getShareholderEventsPage(p0);
    }
}
