package com.robinhood.android.internalassettransfers.cashselection;

import android.view.KeyEvent;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionEvent;
import com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionFragment;
import com.robinhood.android.internalassettransfers.cashselection.models.CashBalanceQuantity;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.utils.extensions.KeyEvents2;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00182\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\u0018B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0013\u001a\u00020\u0011J\u0012\u0010\u0014\u001a\u00020\u00112\n\u0010\u0015\u001a\u00060\u0016j\u0002`\u0017R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionViewState;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "stateProvider", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onEntireBalanceQuantityClicked", "", "onSpecificAmountQuantityClicked", "onCashAmountConfirm", "onKeyEvent", "keyEvent", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "Companion", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class InternalAssetTransferCashSelectionDuxo extends BaseDuxo3<InternalAssetTransferCashSelectionDataState, InternalAssetTransferCashSelectionViewState, InternalAssetTransferCashSelectionEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public InternalAssetTransferCashSelectionDuxo(InternalAssetTransferCashSelectionStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Companion companion = INSTANCE;
        super(new InternalAssetTransferCashSelectionDataState(((InternalAssetTransferCashSelectionFragment.Args) companion.getArgs(savedStateHandle)).getSource(), ((InternalAssetTransferCashSelectionFragment.Args) companion.getArgs(savedStateHandle)).getEligibleAssets(), ((InternalAssetTransferCashSelectionFragment.Args) companion.getArgs(savedStateHandle)).getAssetSelection(), ((InternalAssetTransferCashSelectionFragment.Args) companion.getArgs(savedStateHandle)).getEligibleAssets().getAvailableCash().compareTo(BigDecimal.ZERO) < 0, null, null, null, 112, null), stateProvider, duxoBundle);
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onEntireBalanceQuantityClicked$1", m3645f = "InternalAssetTransferCashSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onEntireBalanceQuantityClicked$1 */
    static final class C190621 extends ContinuationImpl7 implements Function2<InternalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190621(Continuation<? super C190621> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190621 c190621 = new C190621(continuation);
            c190621.L$0 = obj;
            return c190621;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState> continuation) {
            return ((C190621) create(internalAssetTransferCashSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferCashSelectionDataState.copy$default((InternalAssetTransferCashSelectionDataState) this.L$0, null, null, null, false, null, CashBalanceQuantity.EntireBalance.INSTANCE, null, 95, null);
        }
    }

    public final void onEntireBalanceQuantityClicked() {
        applyMutation(new C190621(null));
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onSpecificAmountQuantityClicked$1", m3645f = "InternalAssetTransferCashSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onSpecificAmountQuantityClicked$1 */
    static final class C190661 extends ContinuationImpl7 implements Function2<InternalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190661(Continuation<? super C190661> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190661 c190661 = new C190661(continuation);
            c190661.L$0 = obj;
            return c190661;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState> continuation) {
            return ((C190661) create(internalAssetTransferCashSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return InternalAssetTransferCashSelectionDataState.copy$default((InternalAssetTransferCashSelectionDataState) this.L$0, null, null, null, false, null, CashBalanceQuantity.SpecificAmount.INSTANCE, null, 95, null);
        }
    }

    public final void onSpecificAmountQuantityClicked() {
        applyMutation(new C190661(null));
    }

    public final void onCashAmountConfirm() {
        withDataState(new Function1() { // from class: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InternalAssetTransferCashSelectionDuxo.onCashAmountConfirm$lambda$0(this.f$0, (InternalAssetTransferCashSelectionDataState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCashAmountConfirm$lambda$0(InternalAssetTransferCashSelectionDuxo internalAssetTransferCashSelectionDuxo, InternalAssetTransferCashSelectionDataState it) {
        BigDecimal bigDecimalOrNull;
        BigDecimal bigDecimalAbs;
        Intrinsics.checkNotNullParameter(it, "it");
        CashBalanceQuantity cashBalanceQuantity = it.getCashBalanceQuantity();
        if (Intrinsics.areEqual(cashBalanceQuantity, CashBalanceQuantity.EntireBalance.INSTANCE)) {
            internalAssetTransferCashSelectionDuxo.submit(new InternalAssetTransferCashSelectionEvent.CashAmountConfirmed(it.getEligibleAssets().getAvailableCash()));
        } else {
            if (!Intrinsics.areEqual(cashBalanceQuantity, CashBalanceQuantity.SpecificAmount.INSTANCE)) {
                throw new NoWhenBranchMatchedException();
            }
            if (it.isMarginBalance()) {
                BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(it.getCashInput());
                if (bigDecimalOrNull2 == null || (bigDecimalAbs = bigDecimalOrNull2.abs()) == null || (bigDecimalOrNull = bigDecimalAbs.negate()) == null) {
                    bigDecimalOrNull = BigDecimal.ZERO;
                }
            } else {
                bigDecimalOrNull = StringsKt.toBigDecimalOrNull(it.getCashInput());
                if (bigDecimalOrNull == null) {
                    bigDecimalOrNull = BigDecimal.ZERO;
                }
            }
            Intrinsics.checkNotNull(bigDecimalOrNull);
            internalAssetTransferCashSelectionDuxo.submit(new InternalAssetTransferCashSelectionEvent.CashAmountConfirmed(bigDecimalOrNull));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$1", m3645f = "InternalAssetTransferCashSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$1 */
    static final class C190631 extends ContinuationImpl7 implements Function2<InternalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190631(Continuation<? super C190631> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190631 c190631 = new C190631(continuation);
            c190631.L$0 = obj;
            return c190631;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState> continuation) {
            return ((C190631) create(internalAssetTransferCashSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState = (InternalAssetTransferCashSelectionDataState) this.L$0;
            if (internalAssetTransferCashSelectionDataState.getCashInput().length() == 0) {
                return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, "0.", 63, null);
            }
            if (!StringsKt.contains$default((CharSequence) internalAssetTransferCashSelectionDataState.getCashInput(), (CharSequence) ".", false, 2, (Object) null)) {
                return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, internalAssetTransferCashSelectionDataState.getCashInput() + ".", 63, null);
            }
            return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, internalAssetTransferCashSelectionDataState.getCashInput(), 63, null);
        }
    }

    public final void onKeyEvent(KeyEvent keyEvent) {
        Intrinsics.checkNotNullParameter(keyEvent, "keyEvent");
        if (KeyEvents2.isDotOrPeriod(keyEvent)) {
            applyMutation(new C190631(null));
        } else if (KeyEvents2.isDigit(keyEvent)) {
            applyMutation(new C190642(keyEvent, null));
        } else if (KeyEvents2.isDelete(keyEvent)) {
            applyMutation(new C190653(null));
        }
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$2", m3645f = "InternalAssetTransferCashSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$2 */
    static final class C190642 extends ContinuationImpl7 implements Function2<InternalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState>, Object> {
        final /* synthetic */ KeyEvent $keyEvent;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C190642(KeyEvent keyEvent, Continuation<? super C190642> continuation) {
            super(2, continuation);
            this.$keyEvent = keyEvent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190642 c190642 = new C190642(this.$keyEvent, continuation);
            c190642.L$0 = obj;
            return c190642;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState> continuation) {
            return ((C190642) create(internalAssetTransferCashSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState = (InternalAssetTransferCashSelectionDataState) this.L$0;
            if (Intrinsics.areEqual(internalAssetTransferCashSelectionDataState.getCashInput(), "0")) {
                if (this.$keyEvent.getNumber() == '0') {
                    return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, internalAssetTransferCashSelectionDataState.getCashInput(), 63, null);
                }
                return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, String.valueOf(this.$keyEvent.getNumber()), 63, null);
            }
            return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, internalAssetTransferCashSelectionDataState.getCashInput() + this.$keyEvent.getNumber(), 63, null);
        }
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$3", m3645f = "InternalAssetTransferCashSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.internalassettransfers.cashselection.InternalAssetTransferCashSelectionDuxo$onKeyEvent$3 */
    static final class C190653 extends ContinuationImpl7 implements Function2<InternalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C190653(Continuation<? super C190653> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C190653 c190653 = new C190653(continuation);
            c190653.L$0 = obj;
            return c190653;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState, Continuation<? super InternalAssetTransferCashSelectionDataState> continuation) {
            return ((C190653) create(internalAssetTransferCashSelectionDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            InternalAssetTransferCashSelectionDataState internalAssetTransferCashSelectionDataState = (InternalAssetTransferCashSelectionDataState) this.L$0;
            if (internalAssetTransferCashSelectionDataState.getCashInput().length() == 0 || internalAssetTransferCashSelectionDataState.getCashInput().length() == 1) {
                return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, "", 63, null);
            }
            return InternalAssetTransferCashSelectionDataState.copy$default(internalAssetTransferCashSelectionDataState, null, null, null, false, null, null, StringsKt.dropLast(internalAssetTransferCashSelectionDataState.getCashInput(), 1), 63, null);
        }
    }

    /* compiled from: InternalAssetTransferCashSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionDuxo;", "Lcom/robinhood/android/internalassettransfers/cashselection/InternalAssetTransferCashSelectionFragment$Args;", "<init>", "()V", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<InternalAssetTransferCashSelectionDuxo, InternalAssetTransferCashSelectionFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferCashSelectionFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (InternalAssetTransferCashSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public InternalAssetTransferCashSelectionFragment.Args getArgs(InternalAssetTransferCashSelectionDuxo internalAssetTransferCashSelectionDuxo) {
            return (InternalAssetTransferCashSelectionFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, internalAssetTransferCashSelectionDuxo);
        }
    }
}
