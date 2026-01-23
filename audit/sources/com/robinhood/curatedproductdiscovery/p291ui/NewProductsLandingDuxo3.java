package com.robinhood.curatedproductdiscovery.p291ui;

import com.plaid.internal.EnumC7081g;
import com.robinhood.curatedproductdiscovery.p291ui.NewProductsLandingDataState;
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
@DebugMetadata(m3644c = "com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$3$1", m3645f = "NewProductsLandingDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.curatedproductdiscovery.ui.NewProductsLandingDuxo$refresh$3$1, reason: use source file name */
/* loaded from: classes15.dex */
final class NewProductsLandingDuxo3 extends ContinuationImpl7 implements Function2<NewProductsLandingDataState, Continuation<? super NewProductsLandingDataState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    NewProductsLandingDuxo3(Continuation<? super NewProductsLandingDuxo3> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        NewProductsLandingDuxo3 newProductsLandingDuxo3 = new NewProductsLandingDuxo3(continuation);
        newProductsLandingDuxo3.L$0 = obj;
        return newProductsLandingDuxo3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(NewProductsLandingDataState newProductsLandingDataState, Continuation<? super NewProductsLandingDataState> continuation) {
        return ((NewProductsLandingDuxo3) create(newProductsLandingDataState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return NewProductsLandingDataState.copy$default((NewProductsLandingDataState) this.L$0, NewProductsLandingDataState.Status.FAILURE, false, false, null, false, false, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
    }
}
