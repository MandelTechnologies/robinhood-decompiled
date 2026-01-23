package com.robinhood.librobinhood.data.store;

import com.robinhood.android.api.options.retrofit.OptionsApi;
import com.robinhood.models.api.ApiOptionChainCollateral;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CollateralStore.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/ApiOptionChainCollateral;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.CollateralStore$refreshChainCollateral$network$1", m3645f = "CollateralStore.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.librobinhood.data.store.CollateralStore$refreshChainCollateral$network$1, reason: use source file name */
/* loaded from: classes13.dex */
final class CollateralStore2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiOptionChainCollateral>, Object> {
    final /* synthetic */ String $accountNumber;
    final /* synthetic */ UUID $optionChainId;
    int label;
    final /* synthetic */ CollateralStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CollateralStore2(CollateralStore collateralStore, UUID uuid, String str, Continuation<? super CollateralStore2> continuation) {
        super(2, continuation);
        this.this$0 = collateralStore;
        this.$optionChainId = uuid;
        this.$accountNumber = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CollateralStore2(this.this$0, this.$optionChainId, this.$accountNumber, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiOptionChainCollateral> continuation) {
        return ((CollateralStore2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        OptionsApi optionsApi = this.this$0.optionsApi;
        UUID uuid = this.$optionChainId;
        String str = this.$accountNumber;
        this.label = 1;
        Object optionChainCollateral = optionsApi.getOptionChainCollateral(uuid, str, this);
        return optionChainCollateral == coroutine_suspended ? coroutine_suspended : optionChainCollateral;
    }
}
