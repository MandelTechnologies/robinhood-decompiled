package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.acats.p299db.bonfire.AcatsTransfer;
import com.robinhood.models.dao.AcatsTransferDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: AcatsTransferStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class AcatsTransferStore$streamAcatsTransferById$1 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends AcatsTransfer>> {
    AcatsTransferStore$streamAcatsTransferById$1(Object obj) {
        super(1, obj, AcatsTransferDao.class, "getAcatsTransfer", "getAcatsTransfer(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<AcatsTransfer> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((AcatsTransferDao) this.receiver).getAcatsTransfer(p0);
    }
}
