package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: BentoNumpadTextInput.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$BentoNumpadTextInput$1$1", m3645f = "BentoNumpadTextInput.kt", m3646l = {99}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$BentoNumpadTextInput$1$1, reason: use source file name */
/* loaded from: classes15.dex */
final class BentoNumpadTextInput2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $allowNegative;
    final /* synthetic */ SnapshotState4<Boolean> $focused$delegate;
    final /* synthetic */ boolean $forceCursorEnd;
    final /* synthetic */ SnapshotState<Boolean> $internalForceCursorEnd$delegate;
    final /* synthetic */ SnapshotState<TextRange> $internalSelection$delegate;
    final /* synthetic */ SnapshotState<String> $internalValue$delegate;
    final /* synthetic */ BentoNumpadTextInputFormatter $numberDisplayFormatter;
    final /* synthetic */ Function1<BigDecimal, Unit> $onNumberChange;
    final /* synthetic */ BentoNumpadScopeV2 $this_BentoNumpadTextInput;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    BentoNumpadTextInput2(BentoNumpadScopeV2 bentoNumpadScopeV2, boolean z, SnapshotState4<Boolean> snapshotState4, SnapshotState<Boolean> snapshotState, SnapshotState<String> snapshotState2, SnapshotState<TextRange> snapshotState3, BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter, boolean z2, Function1<? super BigDecimal, Unit> function1, Continuation<? super BentoNumpadTextInput2> continuation) {
        super(2, continuation);
        this.$this_BentoNumpadTextInput = bentoNumpadScopeV2;
        this.$forceCursorEnd = z;
        this.$focused$delegate = snapshotState4;
        this.$internalForceCursorEnd$delegate = snapshotState;
        this.$internalValue$delegate = snapshotState2;
        this.$internalSelection$delegate = snapshotState3;
        this.$numberDisplayFormatter = bentoNumpadTextInputFormatter;
        this.$allowNegative = z2;
        this.$onNumberChange = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BentoNumpadTextInput2(this.$this_BentoNumpadTextInput, this.$forceCursorEnd, this.$focused$delegate, this.$internalForceCursorEnd$delegate, this.$internalValue$delegate, this.$internalSelection$delegate, this.$numberDisplayFormatter, this.$allowNegative, this.$onNumberChange, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((BentoNumpadTextInput2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (BentoNumpadTextInput.BentoNumpadTextInput$lambda$13(this.$focused$delegate)) {
                if (BentoNumpadTextInput.BentoNumpadTextInput$lambda$3(this.$internalForceCursorEnd$delegate)) {
                    BentoNumpadTextInput.BentoNumpadTextInput$lambda$4(this.$internalForceCursorEnd$delegate, false);
                    BentoNumpadTextInput.BentoNumpadTextInput$lambda$11(this.$internalSelection$delegate, TextRange2.TextRange(BentoNumpadTextInput.BentoNumpadTextInput$lambda$7(this.$internalValue$delegate).length()));
                }
                Flow<KeyEvent> keyPressEventFlow = this.$this_BentoNumpadTextInput.getKeyPressEventFlow();
                final BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter = this.$numberDisplayFormatter;
                final boolean z = this.$allowNegative;
                final Function1<BigDecimal, Unit> function1 = this.$onNumberChange;
                final SnapshotState<String> snapshotState = this.$internalValue$delegate;
                final SnapshotState<TextRange> snapshotState2 = this.$internalSelection$delegate;
                FlowCollector<? super KeyEvent> flowCollector = new FlowCollector() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$BentoNumpadTextInput$1$1.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((KeyEvent) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(KeyEvent keyEvent, Continuation<? super Unit> continuation) {
                        TextFieldValue textFieldValueHandleIncomingKeyEvent = BentoNumpadTextInput.handleIncomingKeyEvent(keyEvent, new TextFieldValue(BentoNumpadTextInput.BentoNumpadTextInput$lambda$7(snapshotState), BentoNumpadTextInput.BentoNumpadTextInput$lambda$10(snapshotState2), (TextRange) null, 4, (DefaultConstructorMarker) null), bentoNumpadTextInputFormatter, z);
                        snapshotState.setValue(textFieldValueHandleIncomingKeyEvent.getText());
                        BentoNumpadTextInput.BentoNumpadTextInput$lambda$11(snapshotState2, textFieldValueHandleIncomingKeyEvent.getSelection());
                        function1.invoke(bentoNumpadTextInputFormatter.parse(textFieldValueHandleIncomingKeyEvent.getText()));
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (keyPressEventFlow.collect(flowCollector, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else if (this.$forceCursorEnd) {
                BentoNumpadTextInput.BentoNumpadTextInput$lambda$4(this.$internalForceCursorEnd$delegate, true);
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
