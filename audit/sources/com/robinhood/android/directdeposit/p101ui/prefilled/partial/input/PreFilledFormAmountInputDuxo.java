package com.robinhood.android.directdeposit.p101ui.prefilled.partial.input;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.directdeposit.p101ui.prefilled.partial.input.PreFilledFormAmountInputFragment;
import com.robinhood.android.investFlow.InvestFlowConstants;
import com.robinhood.android.tickerinputview.keyevent.DollarInputConsumer;
import com.robinhood.android.tickerinputview.keyevent.InputKeyEventConsumer;
import com.robinhood.android.tickerinputview.keyevent.PercentInputConsumer;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.models.p355ui.DirectDepositAmount;
import com.robinhood.udf.UiEvent;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PreFilledFormAmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "consumeKeyEvent", "", "keyEvent", "Landroid/view/KeyEvent;", "onContinueClick", "Companion", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class PreFilledFormAmountInputDuxo extends OldBaseDuxo<PreFilledFormAmountInputState> implements HasSavedState {
    public static final int $stable = 8;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final DollarInputConsumer dollarInputConsumer;
    private final SavedStateHandle savedStateHandle;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public PreFilledFormAmountInputDuxo(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        DirectDepositAmount.PartialPaycheck depositAmount = ((PreFilledFormAmountInputFragment.Args) companion.getArgs(savedStateHandle)).getDepositAmount();
        super(new PreFilledFormAmountInputState(depositAmount == null ? ((PreFilledFormAmountInputFragment.Args) companion.getArgs(savedStateHandle)).getInputType().getInitialValue() : depositAmount), null, 2, 0 == true ? 1 : 0);
        this.savedStateHandle = savedStateHandle;
    }

    public final void consumeKeyEvent(final KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormAmountInputDuxo.consumeKeyEvent$lambda$0(keyEvent, (PreFilledFormAmountInputState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormAmountInputState consumeKeyEvent$lambda$0(KeyEvent keyEvent, PreFilledFormAmountInputState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        DirectDepositAmount.PartialPaycheck depositAmount = applyMutation.getDepositAmount();
        if (depositAmount instanceof DirectDepositAmount.PartialPaycheck.Dollars) {
            InputKeyEventConsumer.InputState<BigDecimal> inputStateConsume = dollarInputConsumer.consume(new InputKeyEventConsumer.InputState(((DirectDepositAmount.PartialPaycheck.Dollars) applyMutation.getDepositAmount()).getAmount(), applyMutation.getInputCharArray()), keyEvent);
            BigDecimal bigDecimalComponent1 = inputStateConsume.component1();
            return PreFilledFormAmountInputState.copy$default(applyMutation, new DirectDepositAmount.PartialPaycheck.Dollars(bigDecimalComponent1), inputStateConsume.getInput(), null, 4, null);
        }
        if (!(depositAmount instanceof DirectDepositAmount.PartialPaycheck.Percent)) {
            throw new NoWhenBranchMatchedException();
        }
        InputKeyEventConsumer.InputState<Integer> inputStateConsume2 = PercentInputConsumer.INSTANCE.consume(new InputKeyEventConsumer.InputState(Integer.valueOf(((DirectDepositAmount.PartialPaycheck.Percent) applyMutation.getDepositAmount()).getPercent()), applyMutation.getInputCharArray()), keyEvent);
        int iIntValue = inputStateConsume2.component1().intValue();
        return PreFilledFormAmountInputState.copy$default(applyMutation, new DirectDepositAmount.PartialPaycheck.Percent(iIntValue), inputStateConsume2.getInput(), null, 4, null);
    }

    public final void onContinueClick() {
        applyMutation(new Function1() { // from class: com.robinhood.android.directdeposit.ui.prefilled.partial.input.PreFilledFormAmountInputDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PreFilledFormAmountInputDuxo.onContinueClick$lambda$1((PreFilledFormAmountInputState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PreFilledFormAmountInputState onContinueClick$lambda$1(PreFilledFormAmountInputState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return PreFilledFormAmountInputState.copy$default(applyMutation, null, null, new UiEvent(applyMutation.getDepositAmount()), 3, null);
    }

    /* compiled from: PreFilledFormAmountInputDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputDuxo;", "Lcom/robinhood/android/directdeposit/ui/prefilled/partial/input/PreFilledFormAmountInputFragment$Args;", "<init>", "()V", "dollarInputConsumer", "Lcom/robinhood/android/tickerinputview/keyevent/DollarInputConsumer;", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<PreFilledFormAmountInputDuxo, PreFilledFormAmountInputFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PreFilledFormAmountInputFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (PreFilledFormAmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public PreFilledFormAmountInputFragment.Args getArgs(PreFilledFormAmountInputDuxo preFilledFormAmountInputDuxo) {
            return (PreFilledFormAmountInputFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, preFilledFormAmountInputDuxo);
        }
    }

    static {
        DefaultConstructorMarker defaultConstructorMarker = null;
        INSTANCE = new Companion(defaultConstructorMarker);
        dollarInputConsumer = new DollarInputConsumer(new BigDecimal(InvestFlowConstants.MAX_ONE_TIME_AMOUNT), false, 2, defaultConstructorMarker);
    }
}
