package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions.ShipmentOptionsEvent;
import com.robinhood.android.lib.store.creditcard.CreditCardStore;
import com.robinhood.android.models.creditcard.api.graphql.AddressType;
import com.robinhood.android.models.creditcard.api.graphql.AddressType2;
import com.robinhood.android.models.creditcard.api.graphql.AddressValidityResponse;
import com.robinhood.android.models.creditcard.api.graphql.ResidencyPurposeType;
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
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onContinue$2", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {62, 87}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ShipmentOptionsDuxo$onContinue$2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ AddressType $address;
    final /* synthetic */ ShipmentOption $option;
    final /* synthetic */ boolean $sigRequired;
    int label;
    final /* synthetic */ ShipmentOptionsDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShipmentOptionsDuxo$onContinue$2(ShipmentOptionsDuxo shipmentOptionsDuxo, AddressType addressType, ShipmentOption shipmentOption, boolean z, Continuation<? super ShipmentOptionsDuxo$onContinue$2> continuation) {
        super(2, continuation);
        this.this$0 = shipmentOptionsDuxo;
        this.$address = addressType;
        this.$option = shipmentOption;
        this.$sigRequired = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShipmentOptionsDuxo$onContinue$2(this.this$0, this.$address, this.$option, this.$sigRequired, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShipmentOptionsDuxo$onContinue$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
    
        if (r11.createCreditAccountAndContinue(r1, r3, r4, r10) == r0) goto L26;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CreditCardStore creditCardStore = this.this$0.creditCardStore;
            AddressType addressType = this.$address;
            ResidencyPurposeType residencyPurposeType = ResidencyPurposeType.SHIPPING;
            this.label = 1;
            obj = creditCardStore.getAddressValidity(addressType, residencyPurposeType, this);
            if (obj != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Unit.INSTANCE;
        }
        ResultKt.throwOnFailure(obj);
        AddressValidityResponse addressValidityResponse = (AddressValidityResponse) obj;
        AddressValidityResponse.Response addressValidity = addressValidityResponse != null ? addressValidityResponse.getAddressValidity() : null;
        AddressType2 error = addressValidity != null ? addressValidity.getError() : null;
        if (addressValidity == null) {
            this.this$0.submit(ShipmentOptionsEvent.Error.INSTANCE);
        } else if (error != null) {
            this.this$0.submit(new ShipmentOptionsEvent.AddressValidationError(addressValidity.getAddress(), error, addressValidity.getErrorSkippable(), this.$option, this.$sigRequired));
            this.this$0.applyMutation(new C125591(null));
        } else {
            ShipmentOptionsDuxo shipmentOptionsDuxo = this.this$0;
            ShipmentOption shipmentOption = this.$option;
            boolean z = this.$sigRequired;
            AddressType addressType2 = this.$address;
            this.label = 2;
        }
        return Unit.INSTANCE;
    }

    /* compiled from: ShipmentOptionsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/shipmentoptions/ShipmentOptionsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onContinue$2$1", m3645f = "ShipmentOptionsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsDuxo$onContinue$2$1 */
    static final class C125591 extends ContinuationImpl7 implements Function2<ShipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C125591(Continuation<? super C125591> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C125591 c125591 = new C125591(continuation);
            c125591.L$0 = obj;
            return c125591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ShipmentOptionsViewState shipmentOptionsViewState, Continuation<? super ShipmentOptionsViewState> continuation) {
            return ((C125591) create(shipmentOptionsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return ShipmentOptionsViewState.copy$default((ShipmentOptionsViewState) this.L$0, false, null, null, null, null, false, 62, null);
        }
    }
}
