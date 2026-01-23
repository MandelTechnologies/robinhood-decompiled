package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.InstrumentBuyingPowerDao;
import com.robinhood.models.p320db.InstrumentBuyingPower;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentBuyingPowerStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.InstrumentBuyingPowerStore$streamIndividualAccountBuyingPowerForInstrument$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentBuyingPowerStore8 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends InstrumentBuyingPower>> {
    InstrumentBuyingPowerStore8(Object obj) {
        super(1, obj, InstrumentBuyingPowerDao.class, "getInstrumentBuyingPowerById", "getInstrumentBuyingPowerById(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<InstrumentBuyingPower> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((InstrumentBuyingPowerDao) this.receiver).getInstrumentBuyingPowerById(p0);
    }
}
