package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsEvent;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShipmentOptionsDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {105}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AddressType $address;
    final /* synthetic */ ShipmentOption $option;
    final /* synthetic */ boolean $sigRequired;
    int label;
    final /* synthetic */ ShipmentOptionsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1(ShipmentOption shipmentOption, ShipmentOptionsDuxo shipmentOptionsDuxo, boolean z, AddressType addressType, Continuation<? super ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1> continuation) {
        super(2, continuation);
        this.$option = shipmentOption;
        this.this$0 = shipmentOptionsDuxo;
        this.$sigRequired = z;
        this.$address = addressType;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1(this.$option, this.this$0, this.$sigRequired, this.$address, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShipmentOptionsDuxo$continueIgnoreSkippableAddressError$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            ShipmentOption shipmentOption = this.$option;
            if (shipmentOption != null) {
                ShipmentOptionsDuxo shipmentOptionsDuxo = this.this$0;
                boolean z = this.$sigRequired;
                AddressType addressType = this.$address;
                this.label = 1;
                if (shipmentOptionsDuxo.createCreditAccountAndContinue(shipmentOption, z, addressType, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.submit(ShipmentOptionsEvent.Error.INSTANCE);
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
