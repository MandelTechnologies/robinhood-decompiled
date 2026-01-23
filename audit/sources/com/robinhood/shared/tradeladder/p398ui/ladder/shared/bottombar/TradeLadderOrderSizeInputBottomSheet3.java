package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.tooling.preview.PreviewParameterProvider;
import com.robinhood.android.apitestdata.models.ApiCreateUserRequest;
import com.robinhood.shared.tradeladder.api.models.LadderInputMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.OrderSizeInputBottomSheetState;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.collections.immutable.extensions2;

/* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetPreviewParameterProvider;", "Landroidx/compose/ui/tooling/preview/PreviewParameterProvider;", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetPreviewParameterProvider$Parameters;", "<init>", "()V", "values", "Lkotlin/sequences/Sequence;", "getValues", "()Lkotlin/sequences/Sequence;", "Parameters", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.OrderSizeInputBottomSheetPreviewParameterProvider, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderOrderSizeInputBottomSheet3 implements PreviewParameterProvider<Parameters> {
    public static final int $stable = 8;
    private final Sequence<Parameters> values;

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public /* bridge */ /* synthetic */ int getCount() {
        return super.getCount();
    }

    public TradeLadderOrderSizeInputBottomSheet3() {
        OrderSizeInputBottomSheetState.InputValue inputValue = new OrderSizeInputBottomSheetState.InputValue(new TextFieldValue("$123.45", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), null, new BigDecimal(String.valueOf(123.45d)), false);
        OrderSizeInputBottomSheetState.SubtitleContent.StandardText standardText = new OrderSizeInputBottomSheetState.SubtitleContent.StandardText("$10,000.00 available");
        LadderInputMode ladderInputMode = LadderInputMode.NOTIONAL;
        StringResource.Companion companion = StringResource.INSTANCE;
        OrderSizeInputBottomSheetState.InputModeSegment inputModeSegment = new OrderSizeInputBottomSheetState.InputModeSegment(companion.invoke("USD"), ladderInputMode);
        StringResource stringResourceInvoke = companion.invoke("QTY");
        LadderInputMode ladderInputMode2 = LadderInputMode.QUANTITY;
        Parameters parameters = new Parameters(new OrderSizeInputBottomSheetState(0, inputValue, "$0", standardText, ladderInputMode, extensions2.persistentListOf(inputModeSegment, new OrderSizeInputBottomSheetState.InputModeSegment(stringResourceInvoke, ladderInputMode2))));
        Parameters parameters2 = new Parameters(new OrderSizeInputBottomSheetState(0, new OrderSizeInputBottomSheetState.InputValue(new TextFieldValue("0.01148", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null), ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, new BigDecimal(String.valueOf(0.01148d)), false), "0", new OrderSizeInputBottomSheetState.SubtitleContent.StandardText("$10,000.00 available"), ladderInputMode2, extensions2.persistentListOf(new OrderSizeInputBottomSheetState.InputModeSegment(companion.invoke("USD"), ladderInputMode), new OrderSizeInputBottomSheetState.InputModeSegment(companion.invoke("QTY"), ladderInputMode2))));
        TextFieldValue textFieldValue = new TextFieldValue("", 0L, (TextRange) null, 6, (DefaultConstructorMarker) null);
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(0L);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        this.values = SequencesKt.sequenceOf(parameters, parameters2, new Parameters(new OrderSizeInputBottomSheetState(0, new OrderSizeInputBottomSheetState.InputValue(textFieldValue, ApiCreateUserRequest.SYMBOL_FOR_CRYPTO, bigDecimalValueOf, false), "0", new OrderSizeInputBottomSheetState.SubtitleContent.ErrorText("Invalid input"), ladderInputMode2, null)));
    }

    @Override // androidx.compose.p011ui.tooling.preview.PreviewParameterProvider
    public Sequence<Parameters> getValues() {
        return this.values;
    }

    /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetPreviewParameterProvider$Parameters;", "", "state", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;", "<init>", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;)V", "getState", "()Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-trade-ladder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.OrderSizeInputBottomSheetPreviewParameterProvider$Parameters, reason: from toString */
    public static final /* data */ class Parameters {
        public static final int $stable = 8;
        private final OrderSizeInputBottomSheetState state;

        public static /* synthetic */ Parameters copy$default(Parameters parameters, OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, int i, Object obj) {
            if ((i & 1) != 0) {
                orderSizeInputBottomSheetState = parameters.state;
            }
            return parameters.copy(orderSizeInputBottomSheetState);
        }

        /* renamed from: component1, reason: from getter */
        public final OrderSizeInputBottomSheetState getState() {
            return this.state;
        }

        public final Parameters copy(OrderSizeInputBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            return new Parameters(state);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Parameters) && Intrinsics.areEqual(this.state, ((Parameters) other).state);
        }

        public int hashCode() {
            return this.state.hashCode();
        }

        public String toString() {
            return "Parameters(state=" + this.state + ")";
        }

        public Parameters(OrderSizeInputBottomSheetState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.state = state;
        }

        public final OrderSizeInputBottomSheetState getState() {
            return this.state;
        }
    }
}
