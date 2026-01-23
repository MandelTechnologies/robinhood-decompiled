package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.directipo.models.p292db.IpoAccessItem;
import com.robinhood.models.dao.bonfire.IpoAccessItemDao;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: IpoAccessItemStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.IpoAccessItemStore$query$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class IpoAccessItemStore4 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends IpoAccessItem>> {
    IpoAccessItemStore4(Object obj) {
        super(1, obj, IpoAccessItemDao.class, "getIpoAccessItem", "getIpoAccessItem(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<IpoAccessItem> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((IpoAccessItemDao) this.receiver).getIpoAccessItem(p0);
    }
}
