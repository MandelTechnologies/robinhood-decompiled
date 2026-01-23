package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.CheckPaymentDao;
import com.robinhood.models.p320db.mcduckling.p321ui.UiCheckPaymentDetails;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* compiled from: CheckPaymentStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.CheckPaymentStore$streamCheckDetails$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class CheckPaymentStore2 extends FunctionReferenceImpl implements Function1<UUID, Flow<? extends UiCheckPaymentDetails>> {
    CheckPaymentStore2(Object obj) {
        super(1, obj, CheckPaymentDao.class, "getCheckPaymentDetails", "getCheckPaymentDetails(Ljava/util/UUID;)Lkotlinx/coroutines/flow/Flow;", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Flow<UiCheckPaymentDetails> invoke(UUID p0) {
        Intrinsics.checkNotNullParameter(p0, "p0");
        return ((CheckPaymentDao) this.receiver).getCheckPaymentDetails(p0);
    }
}
