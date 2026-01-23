package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.models.dao.TrustedDeviceDao;
import com.robinhood.models.p320db.TrustedDevice;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$reportTrustedDeviceEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TrustedDeviceStore9 extends AdaptedFunctionReference implements Function2<TrustedDevice, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TrustedDeviceStore9(Object obj) {
        super(2, obj, TrustedDeviceDao.class, "insert", "insert(Ljava/lang/Object;)V", 4);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TrustedDevice trustedDevice, Continuation<? super Unit> continuation) {
        return TrustedDeviceStore.reportTrustedDeviceEndpoint$insert((TrustedDeviceDao) this.receiver, trustedDevice, continuation);
    }
}
