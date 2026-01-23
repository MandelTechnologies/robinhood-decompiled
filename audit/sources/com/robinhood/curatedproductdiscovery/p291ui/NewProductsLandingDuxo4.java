package com.robinhood.curatedproductdiscovery.p291ui;

import com.robinhood.librobinhood.data.store.SlipEligibilityStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: NewProductsLandingDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$4$1", m3645f = "NewProductsLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$4$1, reason: use source file name */
/* loaded from: classes15.dex */
final class NewProductsLandingDuxo4 extends ContinuationImpl7 implements Function2<NewProductsLandingDataState, Continuation<? super NewProductsLandingDataState>, Object> {
    final /* synthetic */ SlipEligibilityStore.SlipHubEnrollmentStatus $status;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NewProductsLandingDuxo4(SlipEligibilityStore.SlipHubEnrollmentStatus slipHubEnrollmentStatus, Continuation<? super NewProductsLandingDuxo4> continuation) {
        super(2, continuation);
        this.$status = slipHubEnrollmentStatus;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewProductsLandingDuxo4 newProductsLandingDuxo4 = new NewProductsLandingDuxo4(this.$status, continuation);
        newProductsLandingDuxo4.L$0 = obj;
        return newProductsLandingDuxo4;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NewProductsLandingDataState newProductsLandingDataState, Continuation<? super NewProductsLandingDataState> continuation) {
        return ((NewProductsLandingDuxo4) create(newProductsLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return NewProductsLandingDataState.copy$default((NewProductsLandingDataState) this.L$0, null, false, false, null, false, this.$status == SlipEligibilityStore.SlipHubEnrollmentStatus.ENROLLED, false, 95, null);
    }
}
