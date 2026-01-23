package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onContinue$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ShipmentOptionsDuxo$onContinue$1 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    ShipmentOptionsDuxo$onContinue$1(Continuation<? super ShipmentOptionsDuxo$onContinue$1> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShipmentOptionsDuxo$onContinue$1 shipmentOptionsDuxo$onContinue$1 = new ShipmentOptionsDuxo$onContinue$1(continuation);
        shipmentOptionsDuxo$onContinue$1.L$0 = obj;
        return shipmentOptionsDuxo$onContinue$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
        return ((ShipmentOptionsDuxo$onContinue$1) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ShipmentOptionsViewState.copy$default((ShipmentOptionsViewState) this.L$0, true, null, null, null, null, false, 62, null);
    }
}
