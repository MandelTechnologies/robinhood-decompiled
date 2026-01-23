package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.directipo.models.p292db.DirectIpoIndicationOfInterest;
import com.robinhood.models.dao.bonfire.DirectIpoIndicationOfInterestDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: DirectIpoIndicationOfInterestStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore$query$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class DirectIpoIndicationOfInterestStore6 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends DirectIpoIndicationOfInterest>> {
    DirectIpoIndicationOfInterestStore6(Object obj) {
        super(1, obj, DirectIpoIndicationOfInterestDao.class, "getIndicationOfInterest", "getIndicationOfInterest(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<DirectIpoIndicationOfInterest> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((DirectIpoIndicationOfInterestDao) this.receiver).getIndicationOfInterest(p0);
    }
}
