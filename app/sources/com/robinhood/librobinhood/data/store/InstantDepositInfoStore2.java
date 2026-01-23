package com.robinhood.librobinhood.data.store;

import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.models.api.bonfire.ApiInstantDepositInfo;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.rx2.RxAwait3;

/* compiled from: InstantDepositInfoStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/bonfire/ApiInstantDepositInfo;", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.librobinhood.data.store.InstantDepositInfoStore$endpoint$1", m3645f = "InstantDepositInfoStore.kt", m3646l = {54, 32}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.librobinhood.data.store.InstantDepositInfoStore$endpoint$1, reason: use source file name */
/* loaded from: classes13.dex */
final class InstantDepositInfoStore2 extends ContinuationImpl7 implements Function2<Unit, Continuation<? super ApiInstantDepositInfo>, Object> {
    int label;
    final /* synthetic */ InstantDepositInfoStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InstantDepositInfoStore2(InstantDepositInfoStore instantDepositInfoStore, Continuation<? super InstantDepositInfoStore2> continuation) {
        super(2, continuation);
        this.this$0 = instantDepositInfoStore;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InstantDepositInfoStore2(this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, Continuation<? super ApiInstantDepositInfo> continuation) {
        return ((InstantDepositInfoStore2) create(unit, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Observable observableFilterIsPresent = ObservablesKt.filterIsPresent(this.this$0.accountProvider.mo22580getActiveAccountNumber());
            this.label = 1;
            obj = RxAwait3.awaitFirst(observableFilterIsPresent, this);
            if (obj != coroutine_suspended) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        String str = (String) obj;
        BonfireApi bonfireApi = this.this$0.bonfireApi;
        Intrinsics.checkNotNull(str);
        this.label = 2;
        Object instantDepositAdditionalInfo = bonfireApi.getInstantDepositAdditionalInfo(str, this);
        return instantDepositAdditionalInfo == coroutine_suspended ? coroutine_suspended : instantDepositAdditionalInfo;
    }
}
