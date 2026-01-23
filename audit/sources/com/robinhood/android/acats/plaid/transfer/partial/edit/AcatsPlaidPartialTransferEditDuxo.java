package com.robinhood.android.acats.plaid.transfer.partial.edit;

import android.view.KeyEvent;
import androidx.compose.p011ui.text.AnnotatedString;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferAssetRowData;
import com.robinhood.android.acats.plaid.transfer.partial.AcatsPlaidPartialTransferDuxo3;
import com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo6;
import com.robinhood.android.acats.plaid.transfer.partial.edit.utils.AmountInputVisualTransformation;
import com.robinhood.android.acatsin.util.PositionAmountFormatting;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.models.serverdriven.experimental.api.Money;
import com.robinhood.models.serverdriven.experimental.extensions.Format2;
import com.robinhood.utils.extensions.KeyEvents2;
import java.io.IOException;
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
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
@Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ6\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bJ\u0012\u0010\u0012\u001a\u00020\r2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0018\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0006\u0010\u001d\u001a\u00020\rJ\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020 J\u000e\u0010!\u001a\u00020\r2\u0006\u0010\"\u001a\u00020#J\u0006\u0010$\u001a\u00020\rJ\u0010\u0010%\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u0011H\u0002J\u0018\u0010'\u001a\u00020\f2\u0006\u0010&\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u0017H\u0002J\u0006\u0010)\u001a\u00020\rJ\u0006\u0010*\u001a\u00020\rR\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006+"}, m3636d2 = {"Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditViewState;", "stateProvider", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "onEditComplete", "Lkotlin/Function1;", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowDataType;", "", "onRemove", "bind", "editAsset", "Lcom/robinhood/android/acats/plaid/transfer/partial/AcatsPlaidPartialTransferAssetRowData;", "handleKeyEvents", "it", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "ensureCorrectSignForAssetType", "", "amount", "formatString", "text", "amountFormatter", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/utils/AmountInputVisualTransformation;", "resetAdjustedAmount", "updateSelectedRow", "row", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditSelectedRow;", "updateUserEditingState", "state", "", "editComplete", "getOriginalAssetValue", "forEdit", "getAssetWithAdjustableValue", "adjustedAmount", "remove", "toggleTooltipDisplay", "lib-acats-plaid_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsPlaidPartialTransferEditDuxo extends BaseDuxo<AcatsPlaidPartialTransferEditDataState, AcatsPlaidPartialTransferEditDuxo6> {
    public static final int $stable = 8;
    private Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onEditComplete;
    private Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onRemove;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AcatsPlaidPartialTransferEditDuxo(AcatsPlaidPartialTransferEditDuxo5 stateProvider, DuxoBundle duxoBundle) {
        super(new AcatsPlaidPartialTransferEditDataState(null, null, null, false, false, 31, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
    }

    public final void bind(AcatsPlaidPartialTransferAssetRowData editAsset, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onEditComplete, Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> onRemove) {
        Intrinsics.checkNotNullParameter(editAsset, "editAsset");
        Intrinsics.checkNotNullParameter(onEditComplete, "onEditComplete");
        Intrinsics.checkNotNullParameter(onRemove, "onRemove");
        this.onEditComplete = onEditComplete;
        this.onRemove = onRemove;
        applyMutation(new C76111(editAsset, null));
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$bind$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$bind$1 */
    static final class C76111 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferAssetRowData $editAsset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76111(AcatsPlaidPartialTransferAssetRowData acatsPlaidPartialTransferAssetRowData, Continuation<? super C76111> continuation) {
            super(2, continuation);
            this.$editAsset = acatsPlaidPartialTransferAssetRowData;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C76111(this.$editAsset, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76111) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4;
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo42;
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo43;
            AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo44;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsPlaidPartialTransferDuxo3 type2 = this.$editAsset.getType();
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
                AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) type2;
                boolean zAreEqual = Intrinsics.areEqual(cashAssetWithAdjustment.getOriginalCashBalance().getAmount(), cashAssetWithAdjustment.getAdjustableCashBalance().getAmount());
                if (!zAreEqual) {
                    acatsPlaidPartialTransferEditDuxo44 = AcatsPlaidPartialTransferEditDuxo4.AMOUNT;
                } else {
                    acatsPlaidPartialTransferEditDuxo44 = AcatsPlaidPartialTransferEditDuxo4.ALL;
                }
                return new AcatsPlaidPartialTransferEditDataState(this.$editAsset, zAreEqual ? "0" : Format2.format(cashAssetWithAdjustment.getAdjustableCashBalance()), acatsPlaidPartialTransferEditDuxo44, false, false, 24, null);
            }
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
                AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2;
                boolean zAreEqual2 = Intrinsics.areEqual(equityAssetWithAdjustment.getEquityAsset().getQuantity(), equityAssetWithAdjustment.getAdjustableQuantity());
                if (!zAreEqual2) {
                    acatsPlaidPartialTransferEditDuxo43 = AcatsPlaidPartialTransferEditDuxo4.AMOUNT;
                } else {
                    acatsPlaidPartialTransferEditDuxo43 = AcatsPlaidPartialTransferEditDuxo4.ALL;
                }
                return new AcatsPlaidPartialTransferEditDataState(this.$editAsset, zAreEqual2 ? "0" : Formats.getShareQuantityFormat().format(equityAssetWithAdjustment.getAdjustableQuantity()), acatsPlaidPartialTransferEditDuxo43, false, false, 24, null);
            }
            if (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
                AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) type2;
                boolean zAreEqual3 = Intrinsics.areEqual(marginCashAssetWithAdjustment.getOriginalMarginCashBalance().getAmount(), marginCashAssetWithAdjustment.getAdjustableMarginCashBalance().getAmount());
                if (!zAreEqual3) {
                    acatsPlaidPartialTransferEditDuxo42 = AcatsPlaidPartialTransferEditDuxo4.AMOUNT;
                } else {
                    acatsPlaidPartialTransferEditDuxo42 = AcatsPlaidPartialTransferEditDuxo4.ALL;
                }
                return new AcatsPlaidPartialTransferEditDataState(this.$editAsset, zAreEqual3 ? "0" : Format2.format(marginCashAssetWithAdjustment.getAdjustableMarginCashBalance()), acatsPlaidPartialTransferEditDuxo42, false, false, 24, null);
            }
            if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                throw new NoWhenBranchMatchedException();
            }
            AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) type2;
            boolean zAreEqual4 = Intrinsics.areEqual(optionAssetWithAdjustment.getOptionsAsset().getQuantity(), optionAssetWithAdjustment.getAdjustableQuantity());
            if (!zAreEqual4) {
                acatsPlaidPartialTransferEditDuxo4 = AcatsPlaidPartialTransferEditDuxo4.AMOUNT;
            } else {
                acatsPlaidPartialTransferEditDuxo4 = AcatsPlaidPartialTransferEditDuxo4.ALL;
            }
            return new AcatsPlaidPartialTransferEditDataState(this.$editAsset, zAreEqual4 ? "0" : Formats.getShareQuantityFormat().format(optionAssetWithAdjustment.getAdjustableQuantity()), acatsPlaidPartialTransferEditDuxo4, false, false, 24, null);
        }
    }

    public final void handleKeyEvents(KeyEvent it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (getStateFlow().getValue() instanceof AcatsPlaidPartialTransferEditDuxo6.Ready) {
            AcatsPlaidPartialTransferEditDuxo6 value = getStateFlow().getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState.Ready");
            AcatsPlaidPartialTransferEditDuxo6.Ready ready = (AcatsPlaidPartialTransferEditDuxo6.Ready) value;
            if (KeyEvents2.isDigit(it)) {
                applyMutation(new C76121(ready.getAdjustedAmount() + it.getNumber(), ready, null));
            }
            if (KeyEvents2.isDelete(it)) {
                applyMutation(new C76132(StringsKt.dropLast(ready.getAdjustedAmount(), 1), ready, null));
            }
            if (!KeyEvents2.isDotOrPeriod(it) || StringsKt.contains$default((CharSequence) ready.getAdjustedAmount(), (CharSequence) ".", false, 2, (Object) null)) {
                return;
            }
            applyMutation(new C76143(ready.getAdjustedAmount() + ".", ready, null));
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$1 */
    static final class C76121 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ String $newAmount;
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6.Ready $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76121(String str, AcatsPlaidPartialTransferEditDuxo6.Ready ready, Continuation<? super C76121> continuation) {
            super(2, continuation);
            this.$newAmount = str;
            this.$state = ready;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76121 c76121 = AcatsPlaidPartialTransferEditDuxo.this.new C76121(this.$newAmount, this.$state, continuation);
            c76121.L$0 = obj;
            return c76121;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76121) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState = (AcatsPlaidPartialTransferEditDataState) this.L$0;
            AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = AcatsPlaidPartialTransferEditDuxo.this;
            return AcatsPlaidPartialTransferEditDataState.copy$default(acatsPlaidPartialTransferEditDataState, null, acatsPlaidPartialTransferEditDuxo.formatString(acatsPlaidPartialTransferEditDuxo.ensureCorrectSignForAssetType(this.$newAmount, this.$state.getEditAsset()), this.$state.getAmountFormatter()), null, false, false, 29, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$2", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$2 */
    static final class C76132 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ String $newAmount;
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6.Ready $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76132(String str, AcatsPlaidPartialTransferEditDuxo6.Ready ready, Continuation<? super C76132> continuation) {
            super(2, continuation);
            this.$newAmount = str;
            this.$state = ready;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76132 c76132 = AcatsPlaidPartialTransferEditDuxo.this.new C76132(this.$newAmount, this.$state, continuation);
            c76132.L$0 = obj;
            return c76132;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76132) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState = (AcatsPlaidPartialTransferEditDataState) this.L$0;
            AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = AcatsPlaidPartialTransferEditDuxo.this;
            return AcatsPlaidPartialTransferEditDataState.copy$default(acatsPlaidPartialTransferEditDataState, null, acatsPlaidPartialTransferEditDuxo.formatString(acatsPlaidPartialTransferEditDuxo.ensureCorrectSignForAssetType(this.$newAmount, this.$state.getEditAsset()), this.$state.getAmountFormatter()), null, false, false, 29, null);
        }
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$3", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$handleKeyEvents$3 */
    static final class C76143 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ String $newAmount;
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo6.Ready $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76143(String str, AcatsPlaidPartialTransferEditDuxo6.Ready ready, Continuation<? super C76143> continuation) {
            super(2, continuation);
            this.$newAmount = str;
            this.$state = ready;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76143 c76143 = AcatsPlaidPartialTransferEditDuxo.this.new C76143(this.$newAmount, this.$state, continuation);
            c76143.L$0 = obj;
            return c76143;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76143) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState = (AcatsPlaidPartialTransferEditDataState) this.L$0;
            AcatsPlaidPartialTransferEditDuxo acatsPlaidPartialTransferEditDuxo = AcatsPlaidPartialTransferEditDuxo.this;
            return AcatsPlaidPartialTransferEditDataState.copy$default(acatsPlaidPartialTransferEditDataState, null, acatsPlaidPartialTransferEditDuxo.formatString(acatsPlaidPartialTransferEditDuxo.ensureCorrectSignForAssetType(this.$newAmount, this.$state.getEditAsset()), this.$state.getAmountFormatter()), null, false, false, 29, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String ensureCorrectSignForAssetType(String amount, AcatsPlaidPartialTransferAssetRowData editAsset) {
        AcatsPlaidPartialTransferDuxo3 type2 = editAsset.getType();
        boolean z = true;
        if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) ? !(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) || ((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) type2).getOptionsAsset().getQuantity().compareTo(BigDecimal.ZERO) >= 0 : ((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2).getEquityAsset().getQuantity().compareTo(BigDecimal.ZERO) >= 0) {
            z = false;
        }
        return PositionAmountFormatting.formatAmountForPosition(amount, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String formatString(String text, AmountInputVisualTransformation amountFormatter) {
        return amountFormatter.filter(new AnnotatedString(text, null, 2, null)).getText().getText();
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$resetAdjustedAmount$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$resetAdjustedAmount$1 */
    static final class C76151 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C76151(Continuation<? super C76151> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76151 c76151 = new C76151(continuation);
            c76151.L$0 = obj;
            return c76151;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76151) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferEditDataState.copy$default((AcatsPlaidPartialTransferEditDataState) this.L$0, null, "0", null, false, false, 29, null);
        }
    }

    public final void resetAdjustedAmount() {
        applyMutation(new C76151(null));
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$updateSelectedRow$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$updateSelectedRow$1 */
    static final class C76171 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ AcatsPlaidPartialTransferEditDuxo4 $row;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76171(AcatsPlaidPartialTransferEditDuxo4 acatsPlaidPartialTransferEditDuxo4, Continuation<? super C76171> continuation) {
            super(2, continuation);
            this.$row = acatsPlaidPartialTransferEditDuxo4;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76171 c76171 = new C76171(this.$row, continuation);
            c76171.L$0 = obj;
            return c76171;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76171) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferEditDataState.copy$default((AcatsPlaidPartialTransferEditDataState) this.L$0, null, null, this.$row, false, false, 27, null);
        }
    }

    public final void updateSelectedRow(AcatsPlaidPartialTransferEditDuxo4 row) {
        Intrinsics.checkNotNullParameter(row, "row");
        applyMutation(new C76171(row, null));
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$updateUserEditingState$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$updateUserEditingState$1 */
    static final class C76181 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        final /* synthetic */ boolean $state;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C76181(boolean z, Continuation<? super C76181> continuation) {
            super(2, continuation);
            this.$state = z;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76181 c76181 = new C76181(this.$state, continuation);
            c76181.L$0 = obj;
            return c76181;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76181) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferEditDataState.copy$default((AcatsPlaidPartialTransferEditDataState) this.L$0, null, null, null, this.$state, false, 23, null);
        }
    }

    public final void updateUserEditingState(boolean state) {
        applyMutation(new C76181(state, null));
    }

    public final void editComplete() throws IOException {
        AcatsPlaidPartialTransferDuxo3 assetWithAdjustableValue;
        if (getStateFlow().getValue() instanceof AcatsPlaidPartialTransferEditDuxo6.Ready) {
            AcatsPlaidPartialTransferEditDuxo6 value = getStateFlow().getValue();
            Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState.Ready");
            AcatsPlaidPartialTransferEditDuxo6.Ready ready = (AcatsPlaidPartialTransferEditDuxo6.Ready) value;
            Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function1 = this.onEditComplete;
            if (function1 != null) {
                if (ready.getSelectedRow() == AcatsPlaidPartialTransferEditDuxo4.ALL) {
                    assetWithAdjustableValue = getOriginalAssetValue(ready.getEditAsset());
                } else {
                    assetWithAdjustableValue = getAssetWithAdjustableValue(ready.getEditAsset(), ready.getAdjustedAmount());
                }
                function1.invoke(assetWithAdjustableValue);
            }
        }
    }

    private final AcatsPlaidPartialTransferDuxo3 getOriginalAssetValue(AcatsPlaidPartialTransferAssetRowData forEdit) {
        AcatsPlaidPartialTransferDuxo3 type2 = forEdit.getType();
        if (type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) type2;
            return AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment.copy$default(cashAssetWithAdjustment, null, cashAssetWithAdjustment.getOriginalCashBalance(), 1, null);
        }
        if (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
            AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) type2;
            return AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment.copy$default(marginCashAssetWithAdjustment, null, marginCashAssetWithAdjustment.getOriginalMarginCashBalance(), 1, null);
        }
        if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment equityAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2;
            return AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment.copy$default(equityAssetWithAdjustment, null, equityAssetWithAdjustment.getEquityAsset().getQuantity(), 1, null);
        }
        if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
            throw new NoWhenBranchMatchedException();
        }
        AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment optionAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) type2;
        return AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment.copy$default(optionAssetWithAdjustment, null, optionAssetWithAdjustment.getOptionsAsset().getQuantity(), 1, null);
    }

    private final AcatsPlaidPartialTransferDuxo3 getAssetWithAdjustableValue(AcatsPlaidPartialTransferAssetRowData forEdit, String adjustedAmount) throws IOException {
        String strCleansedString = AcatsPlaidPartialTransferEditDuxo3.cleansedString(adjustedAmount);
        AcatsPlaidPartialTransferDuxo3 type2 = forEdit.getType();
        AcatsPlaidPartialTransferDuxo3 acatsPlaidPartialTransferDuxo3Copy$default = null;
        if (type2 instanceof AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) {
            BigDecimal bigDecimalOrNull = StringsKt.toBigDecimalOrNull(strCleansedString);
            if (bigDecimalOrNull != null) {
                AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment cashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment) type2;
                acatsPlaidPartialTransferDuxo3Copy$default = AcatsPlaidPartialTransferDuxo3.CashAssetWithAdjustment.copy$default(cashAssetWithAdjustment, null, Money.copy$default(cashAssetWithAdjustment.getAdjustableCashBalance(), null, null, bigDecimalOrNull, 3, null), 1, null);
            }
        } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) {
            BigDecimal bigDecimalOrNull2 = StringsKt.toBigDecimalOrNull(strCleansedString);
            if (bigDecimalOrNull2 != null) {
                AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment marginCashAssetWithAdjustment = (AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment) type2;
                acatsPlaidPartialTransferDuxo3Copy$default = AcatsPlaidPartialTransferDuxo3.MarginCashAssetWithAdjustment.copy$default(marginCashAssetWithAdjustment, null, Money.copy$default(marginCashAssetWithAdjustment.getAdjustableMarginCashBalance(), null, null, bigDecimalOrNull2, 3, null), 1, null);
            }
        } else if (type2 instanceof AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) {
            BigDecimal bigDecimalOrNull3 = StringsKt.toBigDecimalOrNull(strCleansedString);
            if (bigDecimalOrNull3 != null) {
                acatsPlaidPartialTransferDuxo3Copy$default = AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment.copy$default((AcatsPlaidPartialTransferDuxo3.EquityAssetWithAdjustment) type2, null, bigDecimalOrNull3, 1, null);
            }
        } else {
            if (!(type2 instanceof AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment)) {
                throw new NoWhenBranchMatchedException();
            }
            BigDecimal bigDecimalOrNull4 = StringsKt.toBigDecimalOrNull(strCleansedString);
            if (bigDecimalOrNull4 != null) {
                acatsPlaidPartialTransferDuxo3Copy$default = AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment.copy$default((AcatsPlaidPartialTransferDuxo3.OptionAssetWithAdjustment) type2, null, bigDecimalOrNull4, 1, null);
            }
        }
        return acatsPlaidPartialTransferDuxo3Copy$default == null ? forEdit.getType() : acatsPlaidPartialTransferDuxo3Copy$default;
    }

    public final void remove() {
        Function1<? super AcatsPlaidPartialTransferDuxo3, Unit> function1;
        if (!(getStateFlow().getValue() instanceof AcatsPlaidPartialTransferEditDuxo6.Ready) || (function1 = this.onRemove) == null) {
            return;
        }
        AcatsPlaidPartialTransferEditDuxo6 value = getStateFlow().getValue();
        Intrinsics.checkNotNull(value, "null cannot be cast to non-null type com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditViewState.Ready");
        function1.invoke(((AcatsPlaidPartialTransferEditDuxo6.Ready) value).getEditAsset().getType());
    }

    /* compiled from: AcatsPlaidPartialTransferEditDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acats/plaid/transfer/partial/edit/AcatsPlaidPartialTransferEditDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$toggleTooltipDisplay$1", m3645f = "AcatsPlaidPartialTransferEditDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acats.plaid.transfer.partial.edit.AcatsPlaidPartialTransferEditDuxo$toggleTooltipDisplay$1 */
    static final class C76161 extends ContinuationImpl7 implements Function2<AcatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C76161(Continuation<? super C76161> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C76161 c76161 = new C76161(continuation);
            c76161.L$0 = obj;
            return c76161;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsPlaidPartialTransferEditDataState acatsPlaidPartialTransferEditDataState, Continuation<? super AcatsPlaidPartialTransferEditDataState> continuation) {
            return ((C76161) create(acatsPlaidPartialTransferEditDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsPlaidPartialTransferEditDataState.copy$default((AcatsPlaidPartialTransferEditDataState) this.L$0, null, null, null, false, !r0.getShowBorrowingFeeTooltip(), 15, null);
        }
    }

    public final void toggleTooltipDisplay() {
        applyMutation(new C76161(null));
    }
}
