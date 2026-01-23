package com.robinhood.android.creditcard.p091ui.creditapplication.shipmentoptions;

import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.models.creditcard.api.graphql.ShipmentOption;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ShipmentOptionsComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.creditcard.ui.creditapplication.shipmentoptions.ShipmentOptionsComposableKt$ShipmentOptions$1$1", m3645f = "ShipmentOptionsComposable.kt", m3646l = {}, m3647m = "invokeSuspend")
/* loaded from: classes2.dex */
final class ShipmentOptionsComposableKt$ShipmentOptions$1$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotState<Boolean> $checked;
    final /* synthetic */ ShipmentOption $defaultSelectedOption;
    final /* synthetic */ ImmutableList<ShipmentOption> $options;
    final /* synthetic */ SnapshotState<ShipmentOption> $selectedOption;
    final /* synthetic */ boolean $sigRequired;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ShipmentOptionsComposableKt$ShipmentOptions$1$1(ImmutableList<ShipmentOption> immutableList, SnapshotState<ShipmentOption> snapshotState, ShipmentOption shipmentOption, SnapshotState<Boolean> snapshotState2, boolean z, Continuation<? super ShipmentOptionsComposableKt$ShipmentOptions$1$1> continuation) {
        super(2, continuation);
        this.$options = immutableList;
        this.$selectedOption = snapshotState;
        this.$defaultSelectedOption = shipmentOption;
        this.$checked = snapshotState2;
        this.$sigRequired = z;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ShipmentOptionsComposableKt$ShipmentOptions$1$1(this.$options, this.$selectedOption, this.$defaultSelectedOption, this.$checked, this.$sigRequired, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ShipmentOptionsComposableKt$ShipmentOptions$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (this.$options != null && this.$selectedOption.getValue() == null) {
            SnapshotState<ShipmentOption> snapshotState = this.$selectedOption;
            ShipmentOption shipmentOption = this.$defaultSelectedOption;
            if (shipmentOption == null) {
                shipmentOption = this.$options.get(0);
            }
            snapshotState.setValue(shipmentOption);
        }
        this.$checked.setValue(boxing.boxBoolean(this.$sigRequired));
        return Unit.INSTANCE;
    }
}
