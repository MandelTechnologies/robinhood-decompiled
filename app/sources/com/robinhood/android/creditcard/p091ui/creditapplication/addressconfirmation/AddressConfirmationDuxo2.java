package com.robinhood.android.creditcard.p091ui.creditapplication.addressconfirmation;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* compiled from: AddressConfirmationDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/creditcard/ui/creditapplication/addressconfirmation/AddressConfirmationViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationDuxo$doneLoading$1", m3645f = "AddressConfirmationDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.addressconfirmation.AddressConfirmationDuxo$doneLoading$1, reason: use source file name */
/* loaded from: classes2.dex */
final class AddressConfirmationDuxo2 extends ContinuationImpl7 implements Function2<AddressConfirmationViewState, Continuation<? super AddressConfirmationViewState>, Object> {
    private /* synthetic */ Object L$0;
    int label;

    AddressConfirmationDuxo2(Continuation<? super AddressConfirmationDuxo2> continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AddressConfirmationDuxo2 addressConfirmationDuxo2 = new AddressConfirmationDuxo2(continuation);
        addressConfirmationDuxo2.L$0 = obj;
        return addressConfirmationDuxo2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AddressConfirmationViewState addressConfirmationViewState, Continuation<? super AddressConfirmationViewState> continuation) {
        return ((AddressConfirmationDuxo2) create(addressConfirmationViewState, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return AddressConfirmationViewState.copy$default((AddressConfirmationViewState) this.L$0, false, null, 2, null);
    }
}
