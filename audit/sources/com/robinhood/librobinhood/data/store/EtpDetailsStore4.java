package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.EtpDetailsDao;
import com.robinhood.models.p320db.EtpDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: EtpDetailsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.EtpDetailsStore$streamEtpDetails$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EtpDetailsStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends EtpDetails>> {
    EtpDetailsStore4(Object obj) {
        super(1, obj, EtpDetailsDao.class, "getEtpDetails", "getEtpDetails(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<EtpDetails> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((EtpDetailsDao) this.receiver).getEtpDetails(p0);
    }
}
