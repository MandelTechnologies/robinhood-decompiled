package com.robinhood.librobinhood.data.store.bonfire;

import com.robinhood.models.api.bonfire.transfer.banner.ApiTransferBanners;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl6;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlinx.coroutines.flow.SharedFlow2;

/* compiled from: TransferAccountBannerStore.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.data.store.bonfire.TransferAccountBannerStore$endpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
/* synthetic */ class TransferAccountBannerStore3 extends AdaptedFunctionReference implements Function2<ApiTransferBanners, Continuation<? super Unit>, Object>, ContinuationImpl6 {
    TransferAccountBannerStore3(Object obj) {
        super(2, obj, SharedFlow2.class, "tryEmit", "tryEmit(Ljava/lang/Object;)Z", 12);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ApiTransferBanners apiTransferBanners, Continuation<? super Unit> continuation) {
        return TransferAccountBannerStore.endpoint$tryEmit((SharedFlow2) this.receiver, apiTransferBanners, continuation);
    }
}
