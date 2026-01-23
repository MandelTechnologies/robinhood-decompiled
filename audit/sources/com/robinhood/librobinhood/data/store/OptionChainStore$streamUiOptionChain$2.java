package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionChainDao;
import com.robinhood.models.p355ui.UiOptionChain;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionChainStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
/* synthetic */ class OptionChainStore$streamUiOptionChain$2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiOptionChain>> {
    OptionChainStore$streamUiOptionChain$2(Object obj) {
        super(1, obj, OptionChainDao.class, "getUiOptionChain", "getUiOptionChain(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiOptionChain> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionChainDao) this.receiver).getUiOptionChain(p0);
    }
}
