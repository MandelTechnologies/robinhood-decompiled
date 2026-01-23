package com.robinhood.librobinhood.data.store.bonfire.instrument;

import com.robinhood.models.dao.bonfire.instrument.InstrumentAccountSwitcherDao;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentAccountSwitcher;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: InstrumentAccountSwitcherStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.instrument.InstrumentAccountSwitcherStore$instrumentAccountSwitcherQuery$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class InstrumentAccountSwitcherStore5 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends InstrumentAccountSwitcher>> {
    InstrumentAccountSwitcherStore5(Object obj) {
        super(1, obj, InstrumentAccountSwitcherDao.class, "getAccountSwitcher", "getAccountSwitcher(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<InstrumentAccountSwitcher> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((InstrumentAccountSwitcherDao) this.receiver).getAccountSwitcher(p0);
    }
}
