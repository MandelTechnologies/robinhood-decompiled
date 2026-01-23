package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore;
import com.robinhood.models.api.ApiSessionAlert;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;

/* compiled from: CryptoBuyingPowerStore.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n"}, m3636d2 = {"<anonymous>", "", "<unused var>", "Lcom/robinhood/librobinhood/data/store/CryptoBuyingPowerStore$BuyingPowerAlertArgs;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/api/ApiSessionAlert;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$buyingPowerAlertEndpoint$2", m3645f = "CryptoBuyingPowerStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CryptoBuyingPowerStore$buyingPowerAlertEndpoint$2, reason: use source file name */
/* loaded from: classes13.dex */
final class CryptoBuyingPowerStore3 extends ContinuationImpl7 implements Function3<CryptoBuyingPowerStore.BuyingPowerAlertArgs, Optional<? extends ApiSessionAlert>, Continuation<? super Unit>, Object> {
    int label;

    CryptoBuyingPowerStore3(Continuation<? super CryptoBuyingPowerStore3> continuation) {
        super(3, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs, Optional<ApiSessionAlert> optional, Continuation<? super Unit> continuation) {
        return new CryptoBuyingPowerStore3(continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CryptoBuyingPowerStore.BuyingPowerAlertArgs buyingPowerAlertArgs, Optional<? extends ApiSessionAlert> optional, Continuation<? super Unit> continuation) {
        return invoke2(buyingPowerAlertArgs, (Optional<ApiSessionAlert>) optional, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return Unit.INSTANCE;
    }
}
