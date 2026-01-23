package com.robinhood.android.transfers.international.p266ui.amountinput;

import androidx.compose.p011ui.text.AnnotatedString;
import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.transfers.international.C30310R;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputDataState;
import com.robinhood.android.transfers.international.p266ui.amountinput.AmountInputViewState3;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.util.AnnotatedString3;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.android.transfers.international.p266ui.util.McwFxRateExtensions;
import com.robinhood.android.transfers.international.p266ui.util.MoneyDtos;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.MoneyDto;
import com.robinhood.utils.math.BigDecimals7;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AmountInputStateProvider.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0006*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0007\"\u0018\u0010\b\u001a\u00020\t*\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f\"&\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e*\u00020\u00028@X\u0081\u0004¢\u0006\f\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"inputViewState", "Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", "getInputViewState", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;)Lcom/robinhood/android/transfers/international/ui/amountinput/InputViewState;", "isContinueButtonEnabled", "", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;)Z", "displayText", "Landroidx/compose/ui/text/AnnotatedString;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;", "getDisplayText", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;)Landroidx/compose/ui/text/AnnotatedString;", "feeViewStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/transfers/international/ui/amountinput/FeeViewState;", "getFeeViewStates$annotations", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;)V", "getFeeViewStates", "(Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;)Lkotlinx/collections/immutable/ImmutableList;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AmountInputStateProvider2 {

    /* compiled from: AmountInputStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputStateProviderKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TransferType.values().length];
            try {
                iArr[TransferType.FAST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TransferType.WIRE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static /* synthetic */ void getFeeViewStates$annotations(AmountInputDataState amountInputDataState) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AmountInputViewState3 getInputViewState(AmountInputDataState amountInputDataState) {
        List<UIComponent<GenericAction>> content;
        List<UIComponent<GenericAction>> content2;
        if (amountInputDataState.isFxEnabled()) {
            AnnotatedString displayText = getDisplayText(amountInputDataState.getSourceInputState());
            String currencyCode = amountInputDataState.getSourceAccount().getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode, "getCurrencyCode(...)");
            String countryCode = Currency2.getCountryCode(amountInputDataState.getSourceAccount().getCurrency());
            ApiTransferSummaryResponse transferSummaryResponse = amountInputDataState.getTransferSummaryResponse();
            ImmutableList immutableList = (transferSummaryResponse == null || (content2 = transferSummaryResponse.getContent()) == null) ? null : extensions2.toImmutableList(content2);
            McwFxRate fxRate = amountInputDataState.getFxRate();
            String exchangeRateText = fxRate != null ? McwFxRateExtensions.getExchangeRateText(fxRate, amountInputDataState.getSourceAccount().getCurrency(), amountInputDataState.getSinkAccount().getCurrency()) : null;
            AmountInputDataState.InputState sinkInputState = amountInputDataState.getSinkInputState();
            if (sinkInputState == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            AnnotatedString displayText2 = getDisplayText(sinkInputState);
            String currencyCode2 = amountInputDataState.getSinkAccount().getCurrency().getCurrencyCode();
            Intrinsics.checkNotNullExpressionValue(currencyCode2, "getCurrencyCode(...)");
            return new AmountInputViewState3.WithFx(displayText, currencyCode, countryCode, immutableList, exchangeRateText, displayText2, currencyCode2, Currency2.getCountryCode(amountInputDataState.getSinkAccount().getCurrency()), getFeeViewStates(amountInputDataState), amountInputDataState.getSelectedInputType());
        }
        ImmutableList immutableList2 = null;
        AnnotatedString displayText3 = getDisplayText(amountInputDataState.getSourceInputState());
        String currencyCode3 = amountInputDataState.getSourceAccount().getCurrency().getCurrencyCode();
        Intrinsics.checkNotNullExpressionValue(currencyCode3, "getCurrencyCode(...)");
        String countryCode2 = Currency2.getCountryCode(amountInputDataState.getSourceAccount().getCurrency());
        ApiTransferSummaryResponse transferSummaryResponse2 = amountInputDataState.getTransferSummaryResponse();
        if (transferSummaryResponse2 != null && (content = transferSummaryResponse2.getContent()) != null) {
            immutableList2 = extensions2.toImmutableList(content);
        }
        return new AmountInputViewState3.WithoutFx(displayText3, currencyCode3, countryCode2, immutableList2, getFeeViewStates(amountInputDataState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isContinueButtonEnabled(AmountInputDataState amountInputDataState) {
        Money amount;
        if (!amountInputDataState.getSourceInputState().getAmount().isPositive()) {
            return false;
        }
        AmountInputDataState.InputState sinkInputState = amountInputDataState.getSinkInputState();
        return (sinkInputState == null || (amount = sinkInputState.getAmount()) == null) ? true : amount.isPositive();
    }

    private static final AnnotatedString getDisplayText(AmountInputDataState.InputState inputState) {
        return AnnotatedString3.annotatedStringWithSuperscriptPrefix(inputState.getFormattedDecimalValue(), Currency2.getSymbolPrefix(inputState.getAmount().getCurrency()));
    }

    public static final ImmutableList<FeeViewState> getFeeViewStates(AmountInputDataState amountInputDataState) {
        Intrinsics.checkNotNullParameter(amountInputDataState, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$0[amountInputDataState.getTransferType().ordinal()];
        if (i == 1) {
            return null;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        GetServiceFeeResponseDto wireServiceFeeResponse = amountInputDataState.getWireServiceFeeResponse();
        if (wireServiceFeeResponse == null) {
            return extensions2.persistentListOf(new FeeViewState(C30310R.string.wire_fee_label, null));
        }
        ArrayList arrayList = new ArrayList();
        MoneyDto transfer_fee = wireServiceFeeResponse.getTransfer_fee();
        if (transfer_fee != null) {
            if (!BigDecimals7.isPositive(transfer_fee.getAmount().toBigDecimalOrThrow())) {
                transfer_fee = null;
            }
            if (transfer_fee != null) {
                arrayList.add(new FeeViewState(C30310R.string.wire_fee_label, MoneyDtos.format(transfer_fee)));
            }
        }
        MoneyDto tax_amount = wireServiceFeeResponse.getTax_amount();
        if (tax_amount != null) {
            if (!BigDecimals7.isPositive(tax_amount.getAmount().toBigDecimalOrThrow())) {
                tax_amount = null;
            }
            if (tax_amount != null) {
                arrayList.add(new FeeViewState(C30310R.string.gst_label, MoneyDtos.format(tax_amount)));
            }
        }
        ImmutableList<FeeViewState> immutableList = extensions2.toImmutableList(arrayList);
        if (immutableList.isEmpty()) {
            return null;
        }
        return immutableList;
    }
}
