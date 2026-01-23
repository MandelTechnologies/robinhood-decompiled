package com.robinhood.shared.security.store.trusteddevice;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiTrustedDevice;
import com.robinhood.models.dao.TrustedDeviceDao;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;

/* compiled from: TrustedDeviceStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.security.store.trusteddevice.TrustedDeviceStore$getTrustedDevicesEndpoint$2, reason: use source file name */
/* loaded from: classes6.dex */
/* synthetic */ class TrustedDeviceStore3 extends AdaptedFunctionReference implements Function2<PaginatedResult<? extends ApiTrustedDevice>, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TrustedDeviceStore3(Object obj) {
        super(2, obj, TrustedDeviceDao.class, "insertPaginated", "insertPaginated(Lcom/robinhood/models/PaginatedResult;)V", 4);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(PaginatedResult<ApiTrustedDevice> paginatedResult, Continuation<? super Unit> continuation) {
        return TrustedDeviceStore.getTrustedDevicesEndpoint$insertPaginated((TrustedDeviceDao) this.receiver, paginatedResult, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(PaginatedResult<? extends ApiTrustedDevice> paginatedResult, Continuation<? super Unit> continuation) {
        return invoke2((PaginatedResult<ApiTrustedDevice>) paginatedResult, continuation);
    }
}
