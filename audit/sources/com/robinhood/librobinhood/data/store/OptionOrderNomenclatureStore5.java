package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.OptionOrderDetailScreenDao;
import com.robinhood.models.p320db.OptionOrderDetailScreen;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: OptionOrderNomenclatureStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.OptionOrderNomenclatureStore$streamOptionOrderDetailScreen$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class OptionOrderNomenclatureStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends OptionOrderDetailScreen>> {
    OptionOrderNomenclatureStore5(Object obj) {
        super(1, obj, OptionOrderDetailScreenDao.class, "getOptionOrderDetailScreen", "getOptionOrderDetailScreen(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<OptionOrderDetailScreen> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((OptionOrderDetailScreenDao) this.receiver).getOptionOrderDetailScreen(p0);
    }
}
