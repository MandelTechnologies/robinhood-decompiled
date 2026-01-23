package com.robinhood.android.transfers.international.p266ui.amountinput;

import bff_money_movement.service.p019v1.TransferFrequencyDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount2;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.international.p266ui.util.Currency2;
import com.robinhood.idl.IdlDecimal2;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.common.MoneyDto;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.TransferDto;
import microgram.contracts.money_movement.transfer_validation.proto.p501v1.ValidateRequestDto;
import rosetta.payment_hub.p540v1.service.TransferTypeDto;

/* compiled from: AmountInputDuxo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, m3636d2 = {"toValidateRequestDto", "Lmicrogram/contracts/money_movement/transfer_validation/proto/v1/ValidateRequestDto;", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", "feature-international-transfers_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxoKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class AmountInputDuxo7 {

    /* compiled from: AmountInputDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.transfers.international.ui.amountinput.AmountInputDuxoKt$WhenMappings */
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

    /* JADX INFO: Access modifiers changed from: private */
    public static final ValidateRequestDto toValidateRequestDto(AmountInputDataState amountInputDataState) {
        TransferTypeDto transferTypeDto;
        Money amount = amountInputDataState.getSourceInputState().getAmount();
        MoneyDto moneyDto = new MoneyDto(IdlDecimal2.toIdlDecimal(amount.getDecimalValue()), Currency2.toCurrencyDto(amount.getCurrency()));
        TransferDto.AccountDto transferAccountDto = MultiCurrencyAccount2.toTransferAccountDto(amountInputDataState.getSourceAccount());
        TransferDto.AccountDto transferAccountDto2 = MultiCurrencyAccount2.toTransferAccountDto(amountInputDataState.getSinkAccount());
        TransferDto.StateDto stateDto = TransferDto.StateDto.STATE_CREATE;
        TransferFrequencyDto transferFrequencyDto = TransferFrequencyDto.TRANSFER_FREQUENCY_ONCE;
        int i = WhenMappings.$EnumSwitchMapping$0[amountInputDataState.getTransferType().ordinal()];
        if (i == 1) {
            transferTypeDto = TransferTypeDto.TRANSFER_TYPE_SG_BANK_WITHDRAWAL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            transferTypeDto = TransferTypeDto.TRANSFER_TYPE_OUTGOING_WIRE;
        }
        return new ValidateRequestDto(new TransferDto(null, stateDto, moneyDto, transferAccountDto, transferAccountDto2, transferFrequencyDto, transferTypeDto, null, amountInputDataState.getWireServiceFeeResponse(), EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, null), null, 2, null);
    }
}
