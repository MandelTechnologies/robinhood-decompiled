package com.robinhood.android.event.gamedetail.p130ui.combo;

import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.event.gamedetail.components.ComboWheelPicker7;
import com.robinhood.android.models.event.p186db.predictionmarkets.ContractElement;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: GameDetailComboBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$1$1", m3645f = "GameDetailComboBottomSheet.kt", m3646l = {EnumC7081g.f2779x59907a3d}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$1$1, reason: use source file name */
/* loaded from: classes3.dex */
final class GameDetailComboBottomSheet5 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<ContractElement, Unit> $onWheelPickerSelectionChange;
    final /* synthetic */ StrikePickerState $pickerState;
    final /* synthetic */ ComboWheelPicker7 $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    GameDetailComboBottomSheet5(StrikePickerState strikePickerState, ComboWheelPicker7 comboWheelPicker7, Function1<? super ContractElement, Unit> function1, Continuation<? super GameDetailComboBottomSheet5> continuation) {
        super(2, continuation);
        this.$pickerState = strikePickerState;
        this.$state = comboWheelPicker7;
        this.$onWheelPickerSelectionChange = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GameDetailComboBottomSheet5(this.$pickerState, this.$state, this.$onWheelPickerSelectionChange, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((GameDetailComboBottomSheet5) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final StrikePickerState strikePickerState = this.$pickerState;
            final ComboWheelPicker7 comboWheelPicker7 = this.$state;
            Flow flowFilterNotNull = FlowKt.filterNotNull(SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return GameDetailComboBottomSheet5.invokeSuspend$lambda$0(strikePickerState, comboWheelPicker7);
                }
            }));
            C163822 c163822 = new C163822(this.$onWheelPickerSelectionChange, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowFilterNotNull, c163822, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContractElement invokeSuspend$lambda$0(StrikePickerState strikePickerState, ComboWheelPicker7 comboWheelPicker7) {
        return (ContractElement) CollectionsKt.getOrNull(strikePickerState.getElements(), comboWheelPicker7.getCurrentSelectedIndex());
    }

    /* compiled from: GameDetailComboBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", "Lcom/robinhood/android/models/event/db/predictionmarkets/ContractElement;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$1$1$2", m3645f = "GameDetailComboBottomSheet.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.event.gamedetail.ui.combo.GameDetailComboBottomSheetKt$comboPickerContent$1$1$1$2 */
    static final class C163822 extends ContinuationImpl7 implements Function2<ContractElement, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function1<ContractElement, Unit> $onWheelPickerSelectionChange;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C163822(Function1<? super ContractElement, Unit> function1, Continuation<? super C163822> continuation) {
            super(2, continuation);
            this.$onWheelPickerSelectionChange = function1;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C163822 c163822 = new C163822(this.$onWheelPickerSelectionChange, continuation);
            c163822.L$0 = obj;
            return c163822;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ContractElement contractElement, Continuation<? super Unit> continuation) {
            return ((C163822) create(contractElement, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.$onWheelPickerSelectionChange.invoke((ContractElement) this.L$0);
            return Unit.INSTANCE;
        }
    }
}
