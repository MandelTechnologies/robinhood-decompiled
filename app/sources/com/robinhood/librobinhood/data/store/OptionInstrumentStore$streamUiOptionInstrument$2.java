package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionInstrumentDao;
import com.robinhood.models.p355ui.UiOptionInstrument;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionInstrumentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionInstrumentStore$streamUiOptionInstrument$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiOptionInstrument>> {
    OptionInstrumentStore$streamUiOptionInstrument$2(Object obj) {
        super(1, obj, OptionInstrumentDao.class, "getUiOptionInstrument", "getUiOptionInstrument(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiOptionInstrument> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionInstrumentDao) this.receiver).getUiOptionInstrument(p0);
    }
}
