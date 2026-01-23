package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionPositionDao;
import com.robinhood.models.p355ui.UiOptionInstrumentPosition;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionPositionStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionPositionStore$streamUiOptionInstrumentPosition$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiOptionInstrumentPosition>> {
    OptionPositionStore$streamUiOptionInstrumentPosition$2(Object obj) {
        super(1, obj, OptionPositionDao.class, "getUiOptionPosition", "getUiOptionPosition(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiOptionInstrumentPosition> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionPositionDao) this.receiver).getUiOptionPosition(p0);
    }
}
