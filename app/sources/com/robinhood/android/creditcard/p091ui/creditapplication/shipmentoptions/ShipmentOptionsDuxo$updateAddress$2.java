package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$updateAddress$2", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ShipmentOptionsDuxo$updateAddress$2 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
    final /* synthetic */ AddressType $address;
    final /* synthetic */ boolean $animate;
    final /* synthetic */ Ref.ObjectRef<Double> $lang;
    final /* synthetic */ Ref.ObjectRef<Double> $lat;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShipmentOptionsDuxo$updateAddress$2(AddressType addressType, Ref.ObjectRef<Double> objectRef, Ref.ObjectRef<Double> objectRef2, boolean z, Continuation<? super ShipmentOptionsDuxo$updateAddress$2> continuation) {
        super(2, continuation);
        this.$address = addressType;
        this.$lat = objectRef;
        this.$lang = objectRef2;
        this.$animate = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ShipmentOptionsDuxo$updateAddress$2 shipmentOptionsDuxo$updateAddress$2 = new ShipmentOptionsDuxo$updateAddress$2(this.$address, this.$lat, this.$lang, this.$animate, continuation);
        shipmentOptionsDuxo$updateAddress$2.L$0 = obj;
        return shipmentOptionsDuxo$updateAddress$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
        return ((ShipmentOptionsDuxo$updateAddress$2) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return ShipmentOptionsViewState.copy$default((ShipmentOptionsViewState) this.L$0, false, this.$address, this.$lat.element, this.$lang.element, null, this.$animate, 17, null);
    }
}
