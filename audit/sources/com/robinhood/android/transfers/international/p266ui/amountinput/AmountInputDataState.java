package com.robinhood.android.transfers.international.p266ui.amountinput;

import bff_money_movement.service.p019v1.GetServiceFeeResponseDto;
import com.robinhood.android.transfers.international.p266ui.model.MultiCurrencyAccount;
import com.robinhood.android.transfers.international.p266ui.model.TransferType;
import com.robinhood.android.transfers.p271ui.max.CreateTransferDuxo;
import com.robinhood.models.api.bonfire.transfer.ApiTransferSummaryResponse;
import com.robinhood.models.p325fx.p326db.McwFxRate;
import com.robinhood.models.util.Money;
import java.math.BigDecimal;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AmountInputDataState.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0087\b\u0018\u0000 ;2\u00020\u0001:\u00039:;Bg\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\nHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\t\u00101\u001a\u00020\u0013HÆ\u0003Ju\u00102\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013HÆ\u0001J\u0013\u00103\u001a\u00020\u00132\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001eR\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010&R\u0011\u0010'\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b'\u0010&¨\u0006<"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", "", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "selectedInputType", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "sourceInputState", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;", "sinkInputState", "wireServiceFeeResponse", "Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "transferSummaryResponse", "Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;", "fxRate", "Lcom/robinhood/models/fx/db/McwFxRate;", "isValidating", "", "<init>", "(Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;Lcom/robinhood/android/transfers/international/ui/model/TransferType;Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;Lbff_money_movement/service/v1/GetServiceFeeResponseDto;Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;Lcom/robinhood/models/fx/db/McwFxRate;Z)V", "getSourceAccount", "()Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", "getSinkAccount", "getTransferType", "()Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "getSelectedInputType", "()Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "getSourceInputState", "()Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;", "getSinkInputState", "getWireServiceFeeResponse", "()Lbff_money_movement/service/v1/GetServiceFeeResponseDto;", "getTransferSummaryResponse", "()Lcom/robinhood/models/api/bonfire/transfer/ApiTransferSummaryResponse;", "getFxRate", "()Lcom/robinhood/models/fx/db/McwFxRate;", "()Z", "isFxEnabled", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "copy", "equals", "other", "hashCode", "", "toString", "", "InputType", "InputState", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class AmountInputDataState {
    private final McwFxRate fxRate;
    private final boolean isValidating;
    private final InputType selectedInputType;
    private final MultiCurrencyAccount sinkAccount;
    private final InputState sinkInputState;
    private final MultiCurrencyAccount sourceAccount;
    private final InputState sourceInputState;
    private final ApiTransferSummaryResponse transferSummaryResponse;
    private final TransferType transferType;
    private final GetServiceFeeResponseDto wireServiceFeeResponse;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public static /* synthetic */ AmountInputDataState copy$default(AmountInputDataState amountInputDataState, MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, TransferType transferType, InputType inputType, InputState inputState, InputState inputState2, GetServiceFeeResponseDto getServiceFeeResponseDto, ApiTransferSummaryResponse apiTransferSummaryResponse, McwFxRate mcwFxRate, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            multiCurrencyAccount = amountInputDataState.sourceAccount;
        }
        if ((i & 2) != 0) {
            multiCurrencyAccount2 = amountInputDataState.sinkAccount;
        }
        if ((i & 4) != 0) {
            transferType = amountInputDataState.transferType;
        }
        if ((i & 8) != 0) {
            inputType = amountInputDataState.selectedInputType;
        }
        if ((i & 16) != 0) {
            inputState = amountInputDataState.sourceInputState;
        }
        if ((i & 32) != 0) {
            inputState2 = amountInputDataState.sinkInputState;
        }
        if ((i & 64) != 0) {
            getServiceFeeResponseDto = amountInputDataState.wireServiceFeeResponse;
        }
        if ((i & 128) != 0) {
            apiTransferSummaryResponse = amountInputDataState.transferSummaryResponse;
        }
        if ((i & 256) != 0) {
            mcwFxRate = amountInputDataState.fxRate;
        }
        if ((i & 512) != 0) {
            z = amountInputDataState.isValidating;
        }
        McwFxRate mcwFxRate2 = mcwFxRate;
        boolean z2 = z;
        GetServiceFeeResponseDto getServiceFeeResponseDto2 = getServiceFeeResponseDto;
        ApiTransferSummaryResponse apiTransferSummaryResponse2 = apiTransferSummaryResponse;
        InputState inputState3 = inputState;
        InputState inputState4 = inputState2;
        return amountInputDataState.copy(multiCurrencyAccount, multiCurrencyAccount2, transferType, inputType, inputState3, inputState4, getServiceFeeResponseDto2, apiTransferSummaryResponse2, mcwFxRate2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getIsValidating() {
        return this.isValidating;
    }

    /* renamed from: component2, reason: from getter */
    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    /* renamed from: component3, reason: from getter */
    public final TransferType getTransferType() {
        return this.transferType;
    }

    /* renamed from: component4, reason: from getter */
    public final InputType getSelectedInputType() {
        return this.selectedInputType;
    }

    /* renamed from: component5, reason: from getter */
    public final InputState getSourceInputState() {
        return this.sourceInputState;
    }

    /* renamed from: component6, reason: from getter */
    public final InputState getSinkInputState() {
        return this.sinkInputState;
    }

    /* renamed from: component7, reason: from getter */
    public final GetServiceFeeResponseDto getWireServiceFeeResponse() {
        return this.wireServiceFeeResponse;
    }

    /* renamed from: component8, reason: from getter */
    public final ApiTransferSummaryResponse getTransferSummaryResponse() {
        return this.transferSummaryResponse;
    }

    /* renamed from: component9, reason: from getter */
    public final McwFxRate getFxRate() {
        return this.fxRate;
    }

    public final AmountInputDataState copy(MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, TransferType transferType, InputType selectedInputType, InputState sourceInputState, InputState sinkInputState, GetServiceFeeResponseDto wireServiceFeeResponse, ApiTransferSummaryResponse transferSummaryResponse, McwFxRate fxRate, boolean isValidating) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(selectedInputType, "selectedInputType");
        Intrinsics.checkNotNullParameter(sourceInputState, "sourceInputState");
        return new AmountInputDataState(sourceAccount, sinkAccount, transferType, selectedInputType, sourceInputState, sinkInputState, wireServiceFeeResponse, transferSummaryResponse, fxRate, isValidating);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountInputDataState)) {
            return false;
        }
        AmountInputDataState amountInputDataState = (AmountInputDataState) other;
        return Intrinsics.areEqual(this.sourceAccount, amountInputDataState.sourceAccount) && Intrinsics.areEqual(this.sinkAccount, amountInputDataState.sinkAccount) && this.transferType == amountInputDataState.transferType && this.selectedInputType == amountInputDataState.selectedInputType && Intrinsics.areEqual(this.sourceInputState, amountInputDataState.sourceInputState) && Intrinsics.areEqual(this.sinkInputState, amountInputDataState.sinkInputState) && Intrinsics.areEqual(this.wireServiceFeeResponse, amountInputDataState.wireServiceFeeResponse) && Intrinsics.areEqual(this.transferSummaryResponse, amountInputDataState.transferSummaryResponse) && Intrinsics.areEqual(this.fxRate, amountInputDataState.fxRate) && this.isValidating == amountInputDataState.isValidating;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.sourceAccount.hashCode() * 31) + this.sinkAccount.hashCode()) * 31) + this.transferType.hashCode()) * 31) + this.selectedInputType.hashCode()) * 31) + this.sourceInputState.hashCode()) * 31;
        InputState inputState = this.sinkInputState;
        int iHashCode2 = (iHashCode + (inputState == null ? 0 : inputState.hashCode())) * 31;
        GetServiceFeeResponseDto getServiceFeeResponseDto = this.wireServiceFeeResponse;
        int iHashCode3 = (iHashCode2 + (getServiceFeeResponseDto == null ? 0 : getServiceFeeResponseDto.hashCode())) * 31;
        ApiTransferSummaryResponse apiTransferSummaryResponse = this.transferSummaryResponse;
        int iHashCode4 = (iHashCode3 + (apiTransferSummaryResponse == null ? 0 : apiTransferSummaryResponse.hashCode())) * 31;
        McwFxRate mcwFxRate = this.fxRate;
        return ((iHashCode4 + (mcwFxRate != null ? mcwFxRate.hashCode() : 0)) * 31) + Boolean.hashCode(this.isValidating);
    }

    public String toString() {
        return "AmountInputDataState(sourceAccount=" + this.sourceAccount + ", sinkAccount=" + this.sinkAccount + ", transferType=" + this.transferType + ", selectedInputType=" + this.selectedInputType + ", sourceInputState=" + this.sourceInputState + ", sinkInputState=" + this.sinkInputState + ", wireServiceFeeResponse=" + this.wireServiceFeeResponse + ", transferSummaryResponse=" + this.transferSummaryResponse + ", fxRate=" + this.fxRate + ", isValidating=" + this.isValidating + ")";
    }

    public AmountInputDataState(MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, TransferType transferType, InputType selectedInputType, InputState sourceInputState, InputState inputState, GetServiceFeeResponseDto getServiceFeeResponseDto, ApiTransferSummaryResponse apiTransferSummaryResponse, McwFxRate mcwFxRate, boolean z) {
        Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
        Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
        Intrinsics.checkNotNullParameter(transferType, "transferType");
        Intrinsics.checkNotNullParameter(selectedInputType, "selectedInputType");
        Intrinsics.checkNotNullParameter(sourceInputState, "sourceInputState");
        this.sourceAccount = sourceAccount;
        this.sinkAccount = sinkAccount;
        this.transferType = transferType;
        this.selectedInputType = selectedInputType;
        this.sourceInputState = sourceInputState;
        this.sinkInputState = inputState;
        this.wireServiceFeeResponse = getServiceFeeResponseDto;
        this.transferSummaryResponse = apiTransferSummaryResponse;
        this.fxRate = mcwFxRate;
        this.isValidating = z;
    }

    public /* synthetic */ AmountInputDataState(MultiCurrencyAccount multiCurrencyAccount, MultiCurrencyAccount multiCurrencyAccount2, TransferType transferType, InputType inputType, InputState inputState, InputState inputState2, GetServiceFeeResponseDto getServiceFeeResponseDto, ApiTransferSummaryResponse apiTransferSummaryResponse, McwFxRate mcwFxRate, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(multiCurrencyAccount, multiCurrencyAccount2, transferType, inputType, inputState, inputState2, (i & 64) != 0 ? null : getServiceFeeResponseDto, (i & 128) != 0 ? null : apiTransferSummaryResponse, (i & 256) != 0 ? null : mcwFxRate, (i & 512) != 0 ? false : z);
    }

    public final MultiCurrencyAccount getSourceAccount() {
        return this.sourceAccount;
    }

    public final MultiCurrencyAccount getSinkAccount() {
        return this.sinkAccount;
    }

    public final TransferType getTransferType() {
        return this.transferType;
    }

    public final InputType getSelectedInputType() {
        return this.selectedInputType;
    }

    public final InputState getSourceInputState() {
        return this.sourceInputState;
    }

    public final InputState getSinkInputState() {
        return this.sinkInputState;
    }

    public final GetServiceFeeResponseDto getWireServiceFeeResponse() {
        return this.wireServiceFeeResponse;
    }

    public final ApiTransferSummaryResponse getTransferSummaryResponse() {
        return this.transferSummaryResponse;
    }

    public final McwFxRate getFxRate() {
        return this.fxRate;
    }

    public final boolean isValidating() {
        return this.isValidating;
    }

    public final boolean isFxEnabled() {
        return !Intrinsics.areEqual(this.sourceAccount.getCurrency(), this.sinkAccount.getCurrency());
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AmountInputDataState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputType;", "", "<init>", "(Ljava/lang/String;I)V", "SOURCE", "SINK", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InputType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InputType[] $VALUES;
        public static final InputType SOURCE = new InputType("SOURCE", 0);
        public static final InputType SINK = new InputType("SINK", 1);

        private static final /* synthetic */ InputType[] $values() {
            return new InputType[]{SOURCE, SINK};
        }

        public static EnumEntries<InputType> getEntries() {
            return $ENTRIES;
        }

        private InputType(String str, int i) {
        }

        static {
            InputType[] inputTypeArr$values = $values();
            $VALUES = inputTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(inputTypeArr$values);
        }

        public static InputType valueOf(String str) {
            return (InputType) Enum.valueOf(InputType.class, str);
        }

        public static InputType[] values() {
            return (InputType[]) $VALUES.clone();
        }
    }

    /* compiled from: AmountInputDataState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;", "", "amount", "Lcom/robinhood/models/util/Money;", "formattedDecimalValue", "", "<init>", "(Lcom/robinhood/models/util/Money;Ljava/lang/String;)V", "getAmount", "()Lcom/robinhood/models/util/Money;", "getFormattedDecimalValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InputState {
        private final Money amount;
        private final String formattedDecimalValue;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        public static final int $stable = 8;

        public static /* synthetic */ InputState copy$default(InputState inputState, Money money, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                money = inputState.amount;
            }
            if ((i & 2) != 0) {
                str = inputState.formattedDecimalValue;
            }
            return inputState.copy(money, str);
        }

        /* renamed from: component1, reason: from getter */
        public final Money getAmount() {
            return this.amount;
        }

        /* renamed from: component2, reason: from getter */
        public final String getFormattedDecimalValue() {
            return this.formattedDecimalValue;
        }

        public final InputState copy(Money amount, String formattedDecimalValue) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(formattedDecimalValue, "formattedDecimalValue");
            return new InputState(amount, formattedDecimalValue);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InputState)) {
                return false;
            }
            InputState inputState = (InputState) other;
            return Intrinsics.areEqual(this.amount, inputState.amount) && Intrinsics.areEqual(this.formattedDecimalValue, inputState.formattedDecimalValue);
        }

        public int hashCode() {
            return (this.amount.hashCode() * 31) + this.formattedDecimalValue.hashCode();
        }

        public String toString() {
            return "InputState(amount=" + this.amount + ", formattedDecimalValue=" + this.formattedDecimalValue + ")";
        }

        public InputState(Money amount, String formattedDecimalValue) {
            Intrinsics.checkNotNullParameter(amount, "amount");
            Intrinsics.checkNotNullParameter(formattedDecimalValue, "formattedDecimalValue");
            this.amount = amount;
            this.formattedDecimalValue = formattedDecimalValue;
        }

        public final Money getAmount() {
            return this.amount;
        }

        public final String getFormattedDecimalValue() {
            return this.formattedDecimalValue;
        }

        /* compiled from: AmountInputDataState.kt */
        @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState$Companion;", "", "<init>", "()V", "initial", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$InputState;", "currency", "Ljava/util/Currency;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final InputState initial(Currency currency) {
                Intrinsics.checkNotNullParameter(currency, "currency");
                BigDecimal ZERO = BigDecimal.ZERO;
                Intrinsics.checkNotNullExpressionValue(ZERO, "ZERO");
                return new InputState(new Money(currency, ZERO), "0");
            }
        }
    }

    /* compiled from: AmountInputDataState.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState$Companion;", "", "<init>", "()V", "initial", "Lcom/robinhood/android/transfers/international/ui/amountinput/AmountInputDataState;", CreateTransferDuxo.SAVED_STATE_SOURCE_ACCOUNT, "Lcom/robinhood/android/transfers/international/ui/model/MultiCurrencyAccount;", CreateTransferDuxo.SAVED_STATE_SINK_ACCOUNT, "transferType", "Lcom/robinhood/android/transfers/international/ui/model/TransferType;", "feature-international-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AmountInputDataState initial(MultiCurrencyAccount sourceAccount, MultiCurrencyAccount sinkAccount, TransferType transferType) {
            Intrinsics.checkNotNullParameter(sourceAccount, "sourceAccount");
            Intrinsics.checkNotNullParameter(sinkAccount, "sinkAccount");
            Intrinsics.checkNotNullParameter(transferType, "transferType");
            InputType inputType = InputType.SOURCE;
            InputState.Companion companion = InputState.INSTANCE;
            InputState inputStateInitial = companion.initial(sourceAccount.getCurrency());
            InputState inputStateInitial2 = companion.initial(sinkAccount.getCurrency());
            if (Intrinsics.areEqual(sourceAccount.getCurrency(), sinkAccount.getCurrency())) {
                inputStateInitial2 = null;
            }
            return new AmountInputDataState(sourceAccount, sinkAccount, transferType, inputType, inputStateInitial, inputStateInitial2, null, null, null, false, 960, null);
        }
    }
}
