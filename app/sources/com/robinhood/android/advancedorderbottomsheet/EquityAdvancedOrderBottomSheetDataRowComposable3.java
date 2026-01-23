package com.robinhood.android.advancedorderbottomsheet;

import androidx.compose.material3.SheetState;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: EquityAdvancedOrderBottomSheetDataRowComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt$EquityAdvancedOrderBottomSheetDataRowComposable$1$1$1$2", m3645f = "EquityAdvancedOrderBottomSheetDataRowComposable.kt", m3646l = {65}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetDataRowComposableKt$EquityAdvancedOrderBottomSheetDataRowComposable$1$1$1$2, reason: use source file name */
/* loaded from: classes24.dex */
final class EquityAdvancedOrderBottomSheetDataRowComposable3 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ EquityAdvancedOrderDropdownEditCallbacks $callbacks;
    final /* synthetic */ SheetState $sheetState;
    final /* synthetic */ EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    EquityAdvancedOrderBottomSheetDataRowComposable3(EquityAdvancedOrderBottomSheetState.BottomSheetRowState.BaseDataRow baseDataRow, SheetState sheetState, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, Continuation<? super EquityAdvancedOrderBottomSheetDataRowComposable3> continuation) {
        super(2, continuation);
        this.$state = baseDataRow;
        this.$sheetState = sheetState;
        this.$callbacks = equityAdvancedOrderDropdownEditCallbacks;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new EquityAdvancedOrderBottomSheetDataRowComposable3(this.$state, this.$sheetState, this.$callbacks, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((EquityAdvancedOrderBottomSheetDataRowComposable3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow) this.$state).getHideOnSelect()) {
                SheetState sheetState = this.$sheetState;
                this.label = 1;
                if (sheetState.hide(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        this.$callbacks.orderTimeInForceSelected(((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow) this.$state).getTimeInForce(), ((EquityAdvancedOrderBottomSheetState.BottomSheetRowState.TimeInForceRow) this.$state).getHideOnSelect());
        return Unit.INSTANCE;
    }
}
