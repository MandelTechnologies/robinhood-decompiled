package com.robinhood.librobinhood.data.store;

import com.robinhood.models.dao.EtpDetailsDao;
import com.robinhood.models.p320db.EtpDetails;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: EtpDetailsStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.EtpDetailsStore$etpDetailsEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class EtpDetailsStore3 extends AdaptedFunctionReference implements Function2<EtpDetails, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    EtpDetailsStore3(Object obj) {
        super(2, obj, EtpDetailsDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(EtpDetails etpDetails, Continuation<? super Unit> continuation) {
        return EtpDetailsStore.etpDetailsEndpoint$insert((EtpDetailsDao) this.receiver, etpDetails, continuation);
    }
}
