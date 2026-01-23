package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.ceres.p284v1.ValidateOrderAccountPCODetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderGTCMarketOrderDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderGenericDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInstantFraudDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInstrumentPCODetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInsufficientAccountValueDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInsufficientBPDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInvalidPriceDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderInvalidTickDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderMarginMinEquityDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderMaxOrderQuantityDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderMaxPositionDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderMissingPriceDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderNoReversalsDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderNoShortsDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderNonpositiveQuantityDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderResultDto;
import com.robinhood.ceres.p284v1.ValidateOrderSenderLocationDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderSuccessDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderSuitabilityDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderTradabilityDetailsDto;
import com.robinhood.ceres.p284v1.ValidateOrderUneconomicalPriceDetailsDto;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.Dto4;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;
import org.bouncycastle.i18n.ErrorBundle;

/* compiled from: ValidateOrderResponseDto.kt */
@Metadata(m3635d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 v2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005uvwxyB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007B\u001f\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\u001c\u0010e\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bJ\b\u0010f\u001a\u00020\u0002H\u0016J\b\u0010g\u001a\u00020hH\u0016J\u0013\u0010i\u001a\u00020j2\b\u0010k\u001a\u0004\u0018\u00010lH\u0096\u0002J\b\u0010m\u001a\u00020nH\u0016J\u0018\u0010o\u001a\u00020p2\u0006\u0010q\u001a\u00020r2\u0006\u0010s\u001a\u00020nH\u0016J\b\u0010t\u001a\u00020nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u00168F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a8F¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\"8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0013\u0010%\u001a\u0004\u0018\u00010&8F¢\u0006\u0006\u001a\u0004\b'\u0010(R\u0013\u0010)\u001a\u0004\u0018\u00010*8F¢\u0006\u0006\u001a\u0004\b+\u0010,R\u0013\u0010-\u001a\u0004\u0018\u00010.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0013\u00101\u001a\u0004\u0018\u0001028F¢\u0006\u0006\u001a\u0004\b3\u00104R\u0013\u00105\u001a\u0004\u0018\u0001068F¢\u0006\u0006\u001a\u0004\b7\u00108R\u0013\u00109\u001a\u0004\u0018\u00010:8F¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0013\u0010=\u001a\u0004\u0018\u00010>8F¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0013\u0010A\u001a\u0004\u0018\u00010B8F¢\u0006\u0006\u001a\u0004\bC\u0010DR\u0013\u0010E\u001a\u0004\u0018\u00010F8F¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0013\u0010I\u001a\u0004\u0018\u00010J8F¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0013\u0010M\u001a\u0004\u0018\u00010N8F¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0013\u0010Q\u001a\u0004\u0018\u00010R8F¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0013\u0010U\u001a\u0004\u0018\u00010V8F¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0013\u0010Y\u001a\u0004\u0018\u00010Z8F¢\u0006\u0006\u001a\u0004\b[\u0010\\R\u0013\u0010]\u001a\u0004\u0018\u00010^8F¢\u0006\u0006\u001a\u0004\b_\u0010`R\u0013\u0010a\u001a\u0004\u0018\u00010b8F¢\u0006\u0006\u001a\u0004\bc\u0010d¨\u0006z"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate;)V", "result", "Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", ErrorBundle.DETAIL_ENTRY, "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "(Lcom/robinhood/ceres/v1/ValidateOrderResultDto;Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;)V", "getResult", "()Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "getDetails", "()Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "success", "Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "getSuccess", "()Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "insufficient_bp", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "getInsufficient_bp", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "insufficient_account_value", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "getInsufficient_account_value", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", QuestionnaireContexts.SUITABILITY, "Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "getSuitability", "()Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "invalid_tick", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "getInvalid_tick", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "missing_price", "Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "getMissing_price", "()Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "nonpositive_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "getNonpositive_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "max_order_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "getMax_order_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "gtc_market_order", "Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "getGtc_market_order", "()Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "tradability", "Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "getTradability", "()Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "account_pco", "Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "getAccount_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "instrument_pco", "Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "getInstrument_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "max_position", "Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "getMax_position", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "margin_min_equity", "Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "getMargin_min_equity", "()Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "no_shorts", "Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "getNo_shorts", "()Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "instant_fraud", "Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "getInstant_fraud", "()Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "sender_location", "Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "getSender_location", "()Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "uneconomical_price", "Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "getUneconomical_price", "()Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "no_reversals", "Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "getNo_reversals", "()Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "invalid_price", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "getInvalid_price", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "generic", "Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "getGeneric", "()Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "copy", "toProto", "toString", "", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "DetailsDto", "Serializer", "MultibindingModule", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public final class ValidateOrderResponseDto implements Dto3<ValidateOrderResponse>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ValidateOrderResponseDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateOrderResponseDto, ValidateOrderResponse>> binaryBase64Serializer$delegate;
    private static final ValidateOrderResponseDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ValidateOrderResponseDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateOrderResponseDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final ValidateOrderResultDto getResult() {
        return this.surrogate.getResult();
    }

    public final DetailsDto getDetails() {
        if (this.surrogate.getSuccess() != null) {
            return new DetailsDto.Success(this.surrogate.getSuccess());
        }
        if (this.surrogate.getInsufficient_bp() != null) {
            return new DetailsDto.InsufficientBp(this.surrogate.getInsufficient_bp());
        }
        if (this.surrogate.getInsufficient_account_value() != null) {
            return new DetailsDto.InsufficientAccountValue(this.surrogate.getInsufficient_account_value());
        }
        if (this.surrogate.getSuitability() != null) {
            return new DetailsDto.Suitability(this.surrogate.getSuitability());
        }
        if (this.surrogate.getInvalid_tick() != null) {
            return new DetailsDto.InvalidTick(this.surrogate.getInvalid_tick());
        }
        if (this.surrogate.getMissing_price() != null) {
            return new DetailsDto.MissingPrice(this.surrogate.getMissing_price());
        }
        if (this.surrogate.getNonpositive_quantity() != null) {
            return new DetailsDto.NonpositiveQuantity(this.surrogate.getNonpositive_quantity());
        }
        if (this.surrogate.getMax_order_quantity() != null) {
            return new DetailsDto.MaxOrderQuantity(this.surrogate.getMax_order_quantity());
        }
        if (this.surrogate.getGtc_market_order() != null) {
            return new DetailsDto.GtcMarketOrder(this.surrogate.getGtc_market_order());
        }
        if (this.surrogate.getTradability() != null) {
            return new DetailsDto.Tradability(this.surrogate.getTradability());
        }
        if (this.surrogate.getAccount_pco() != null) {
            return new DetailsDto.AccountPco(this.surrogate.getAccount_pco());
        }
        if (this.surrogate.getInstrument_pco() != null) {
            return new DetailsDto.InstrumentPco(this.surrogate.getInstrument_pco());
        }
        if (this.surrogate.getMax_position() != null) {
            return new DetailsDto.MaxPosition(this.surrogate.getMax_position());
        }
        if (this.surrogate.getMargin_min_equity() != null) {
            return new DetailsDto.MarginMinEquity(this.surrogate.getMargin_min_equity());
        }
        if (this.surrogate.getNo_shorts() != null) {
            return new DetailsDto.NoShorts(this.surrogate.getNo_shorts());
        }
        if (this.surrogate.getInstant_fraud() != null) {
            return new DetailsDto.InstantFraud(this.surrogate.getInstant_fraud());
        }
        if (this.surrogate.getSender_location() != null) {
            return new DetailsDto.SenderLocation(this.surrogate.getSender_location());
        }
        if (this.surrogate.getUneconomical_price() != null) {
            return new DetailsDto.UneconomicalPrice(this.surrogate.getUneconomical_price());
        }
        if (this.surrogate.getNo_reversals() != null) {
            return new DetailsDto.NoReversals(this.surrogate.getNo_reversals());
        }
        if (this.surrogate.getInvalid_price() != null) {
            return new DetailsDto.InvalidPrice(this.surrogate.getInvalid_price());
        }
        if (this.surrogate.getGeneric() != null) {
            return new DetailsDto.Generic(this.surrogate.getGeneric());
        }
        return null;
    }

    public final ValidateOrderSuccessDetailsDto getSuccess() {
        return this.surrogate.getSuccess();
    }

    public final ValidateOrderInsufficientBPDetailsDto getInsufficient_bp() {
        return this.surrogate.getInsufficient_bp();
    }

    public final ValidateOrderInsufficientAccountValueDetailsDto getInsufficient_account_value() {
        return this.surrogate.getInsufficient_account_value();
    }

    public final ValidateOrderSuitabilityDetailsDto getSuitability() {
        return this.surrogate.getSuitability();
    }

    public final ValidateOrderInvalidTickDetailsDto getInvalid_tick() {
        return this.surrogate.getInvalid_tick();
    }

    public final ValidateOrderMissingPriceDetailsDto getMissing_price() {
        return this.surrogate.getMissing_price();
    }

    public final ValidateOrderNonpositiveQuantityDetailsDto getNonpositive_quantity() {
        return this.surrogate.getNonpositive_quantity();
    }

    public final ValidateOrderMaxOrderQuantityDetailsDto getMax_order_quantity() {
        return this.surrogate.getMax_order_quantity();
    }

    public final ValidateOrderGTCMarketOrderDetailsDto getGtc_market_order() {
        return this.surrogate.getGtc_market_order();
    }

    public final ValidateOrderTradabilityDetailsDto getTradability() {
        return this.surrogate.getTradability();
    }

    public final ValidateOrderAccountPCODetailsDto getAccount_pco() {
        return this.surrogate.getAccount_pco();
    }

    public final ValidateOrderInstrumentPCODetailsDto getInstrument_pco() {
        return this.surrogate.getInstrument_pco();
    }

    public final ValidateOrderMaxPositionDetailsDto getMax_position() {
        return this.surrogate.getMax_position();
    }

    public final ValidateOrderMarginMinEquityDetailsDto getMargin_min_equity() {
        return this.surrogate.getMargin_min_equity();
    }

    public final ValidateOrderNoShortsDetailsDto getNo_shorts() {
        return this.surrogate.getNo_shorts();
    }

    public final ValidateOrderInstantFraudDetailsDto getInstant_fraud() {
        return this.surrogate.getInstant_fraud();
    }

    public final ValidateOrderSenderLocationDetailsDto getSender_location() {
        return this.surrogate.getSender_location();
    }

    public final ValidateOrderUneconomicalPriceDetailsDto getUneconomical_price() {
        return this.surrogate.getUneconomical_price();
    }

    public final ValidateOrderNoReversalsDetailsDto getNo_reversals() {
        return this.surrogate.getNo_reversals();
    }

    public final ValidateOrderInvalidPriceDetailsDto getInvalid_price() {
        return this.surrogate.getInvalid_price();
    }

    public final ValidateOrderGenericDetailsDto getGeneric() {
        return this.surrogate.getGeneric();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ValidateOrderResponseDto(ValidateOrderResultDto result, DetailsDto detailsDto) {
        ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto;
        ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto;
        ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto;
        ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto;
        ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto;
        ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto;
        ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto;
        ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto;
        ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto;
        ValidateOrderGenericDetailsDto value;
        Intrinsics.checkNotNullParameter(result, "result");
        DetailsDto.Success success = detailsDto instanceof DetailsDto.Success ? (DetailsDto.Success) detailsDto : null;
        ValidateOrderSuccessDetailsDto value2 = success != null ? success.getValue() : null;
        DetailsDto.InsufficientBp insufficientBp = detailsDto instanceof DetailsDto.InsufficientBp ? (DetailsDto.InsufficientBp) detailsDto : null;
        ValidateOrderInsufficientBPDetailsDto value3 = insufficientBp != null ? insufficientBp.getValue() : null;
        DetailsDto.InsufficientAccountValue insufficientAccountValue = detailsDto instanceof DetailsDto.InsufficientAccountValue ? (DetailsDto.InsufficientAccountValue) detailsDto : null;
        ValidateOrderInsufficientAccountValueDetailsDto value4 = insufficientAccountValue != null ? insufficientAccountValue.getValue() : null;
        DetailsDto.Suitability suitability = detailsDto instanceof DetailsDto.Suitability ? (DetailsDto.Suitability) detailsDto : null;
        ValidateOrderSuitabilityDetailsDto value5 = suitability != null ? suitability.getValue() : null;
        DetailsDto.InvalidTick invalidTick = detailsDto instanceof DetailsDto.InvalidTick ? (DetailsDto.InvalidTick) detailsDto : null;
        ValidateOrderInvalidTickDetailsDto value6 = invalidTick != null ? invalidTick.getValue() : null;
        DetailsDto.MissingPrice missingPrice = detailsDto instanceof DetailsDto.MissingPrice ? (DetailsDto.MissingPrice) detailsDto : null;
        ValidateOrderMissingPriceDetailsDto value7 = missingPrice != null ? missingPrice.getValue() : null;
        DetailsDto.NonpositiveQuantity nonpositiveQuantity = detailsDto instanceof DetailsDto.NonpositiveQuantity ? (DetailsDto.NonpositiveQuantity) detailsDto : null;
        ValidateOrderNonpositiveQuantityDetailsDto value8 = nonpositiveQuantity != null ? nonpositiveQuantity.getValue() : null;
        DetailsDto.MaxOrderQuantity maxOrderQuantity = detailsDto instanceof DetailsDto.MaxOrderQuantity ? (DetailsDto.MaxOrderQuantity) detailsDto : null;
        ValidateOrderMaxOrderQuantityDetailsDto value9 = maxOrderQuantity != null ? maxOrderQuantity.getValue() : null;
        DetailsDto.GtcMarketOrder gtcMarketOrder = detailsDto instanceof DetailsDto.GtcMarketOrder ? (DetailsDto.GtcMarketOrder) detailsDto : null;
        ValidateOrderGTCMarketOrderDetailsDto value10 = gtcMarketOrder != null ? gtcMarketOrder.getValue() : null;
        DetailsDto.Tradability tradability = detailsDto instanceof DetailsDto.Tradability ? (DetailsDto.Tradability) detailsDto : null;
        ValidateOrderTradabilityDetailsDto value11 = tradability != null ? tradability.getValue() : null;
        DetailsDto.AccountPco accountPco = detailsDto instanceof DetailsDto.AccountPco ? (DetailsDto.AccountPco) detailsDto : null;
        ValidateOrderAccountPCODetailsDto value12 = accountPco != null ? accountPco.getValue() : null;
        DetailsDto.InstrumentPco instrumentPco = detailsDto instanceof DetailsDto.InstrumentPco ? (DetailsDto.InstrumentPco) detailsDto : null;
        ValidateOrderInstrumentPCODetailsDto value13 = instrumentPco != null ? instrumentPco.getValue() : null;
        DetailsDto.MaxPosition maxPosition = detailsDto instanceof DetailsDto.MaxPosition ? (DetailsDto.MaxPosition) detailsDto : null;
        ValidateOrderMaxPositionDetailsDto value14 = maxPosition != null ? maxPosition.getValue() : null;
        ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto2 = value2;
        DetailsDto.MarginMinEquity marginMinEquity = detailsDto instanceof DetailsDto.MarginMinEquity ? (DetailsDto.MarginMinEquity) detailsDto : null;
        ValidateOrderMarginMinEquityDetailsDto value15 = marginMinEquity != null ? marginMinEquity.getValue() : null;
        DetailsDto.NoShorts noShorts = detailsDto instanceof DetailsDto.NoShorts ? (DetailsDto.NoShorts) detailsDto : null;
        ValidateOrderNoShortsDetailsDto value16 = noShorts != null ? noShorts.getValue() : null;
        DetailsDto.InstantFraud instantFraud = detailsDto instanceof DetailsDto.InstantFraud ? (DetailsDto.InstantFraud) detailsDto : null;
        ValidateOrderInstantFraudDetailsDto value17 = instantFraud != null ? instantFraud.getValue() : null;
        DetailsDto.SenderLocation senderLocation = detailsDto instanceof DetailsDto.SenderLocation ? (DetailsDto.SenderLocation) detailsDto : null;
        ValidateOrderSenderLocationDetailsDto value18 = senderLocation != null ? senderLocation.getValue() : null;
        DetailsDto.UneconomicalPrice uneconomicalPrice = detailsDto instanceof DetailsDto.UneconomicalPrice ? (DetailsDto.UneconomicalPrice) detailsDto : null;
        ValidateOrderUneconomicalPriceDetailsDto value19 = uneconomicalPrice != null ? uneconomicalPrice.getValue() : null;
        DetailsDto.NoReversals noReversals = detailsDto instanceof DetailsDto.NoReversals ? (DetailsDto.NoReversals) detailsDto : null;
        ValidateOrderNoReversalsDetailsDto value20 = noReversals != null ? noReversals.getValue() : null;
        DetailsDto.InvalidPrice invalidPrice = detailsDto instanceof DetailsDto.InvalidPrice ? (DetailsDto.InvalidPrice) detailsDto : null;
        ValidateOrderInvalidPriceDetailsDto value21 = invalidPrice != null ? invalidPrice.getValue() : null;
        DetailsDto.Generic generic = detailsDto instanceof DetailsDto.Generic ? (DetailsDto.Generic) detailsDto : null;
        if (generic != null) {
            validateOrderMaxPositionDetailsDto = value14;
            validateOrderSuccessDetailsDto = validateOrderSuccessDetailsDto2;
            validateOrderMarginMinEquityDetailsDto = value15;
            validateOrderNoShortsDetailsDto = value16;
            validateOrderInstantFraudDetailsDto = value17;
            validateOrderSenderLocationDetailsDto = value18;
            validateOrderUneconomicalPriceDetailsDto = value19;
            validateOrderNoReversalsDetailsDto = value20;
            validateOrderInvalidPriceDetailsDto = value21;
            value = generic.getValue();
        } else {
            validateOrderMaxPositionDetailsDto = value14;
            validateOrderSuccessDetailsDto = validateOrderSuccessDetailsDto2;
            validateOrderMarginMinEquityDetailsDto = value15;
            validateOrderNoShortsDetailsDto = value16;
            validateOrderInstantFraudDetailsDto = value17;
            validateOrderSenderLocationDetailsDto = value18;
            validateOrderUneconomicalPriceDetailsDto = value19;
            validateOrderNoReversalsDetailsDto = value20;
            validateOrderInvalidPriceDetailsDto = value21;
            value = null;
        }
        this(new Surrogate(result, validateOrderSuccessDetailsDto, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, validateOrderMaxPositionDetailsDto, validateOrderMarginMinEquityDetailsDto, validateOrderNoShortsDetailsDto, validateOrderInstantFraudDetailsDto, validateOrderSenderLocationDetailsDto, validateOrderUneconomicalPriceDetailsDto, validateOrderNoReversalsDetailsDto, validateOrderInvalidPriceDetailsDto, value));
    }

    public /* synthetic */ ValidateOrderResponseDto(ValidateOrderResultDto validateOrderResultDto, DetailsDto detailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ValidateOrderResultDto.INSTANCE.getZeroValue() : validateOrderResultDto, (i & 2) != 0 ? null : detailsDto);
    }

    public static /* synthetic */ ValidateOrderResponseDto copy$default(ValidateOrderResponseDto validateOrderResponseDto, ValidateOrderResultDto validateOrderResultDto, DetailsDto detailsDto, int i, Object obj) {
        if ((i & 1) != 0) {
            validateOrderResultDto = validateOrderResponseDto.surrogate.getResult();
        }
        if ((i & 2) != 0) {
            detailsDto = validateOrderResponseDto.getDetails();
        }
        return validateOrderResponseDto.copy(validateOrderResultDto, detailsDto);
    }

    public final ValidateOrderResponseDto copy(ValidateOrderResultDto result, DetailsDto details) {
        ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto;
        ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto;
        ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto;
        ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto;
        ValidateOrderGenericDetailsDto value;
        Intrinsics.checkNotNullParameter(result, "result");
        DetailsDto.Success success = details instanceof DetailsDto.Success ? (DetailsDto.Success) details : null;
        ValidateOrderSuccessDetailsDto value2 = success != null ? success.getValue() : null;
        DetailsDto.InsufficientBp insufficientBp = details instanceof DetailsDto.InsufficientBp ? (DetailsDto.InsufficientBp) details : null;
        ValidateOrderInsufficientBPDetailsDto value3 = insufficientBp != null ? insufficientBp.getValue() : null;
        DetailsDto.InsufficientAccountValue insufficientAccountValue = details instanceof DetailsDto.InsufficientAccountValue ? (DetailsDto.InsufficientAccountValue) details : null;
        ValidateOrderInsufficientAccountValueDetailsDto value4 = insufficientAccountValue != null ? insufficientAccountValue.getValue() : null;
        DetailsDto.Suitability suitability = details instanceof DetailsDto.Suitability ? (DetailsDto.Suitability) details : null;
        ValidateOrderSuitabilityDetailsDto value5 = suitability != null ? suitability.getValue() : null;
        DetailsDto.InvalidTick invalidTick = details instanceof DetailsDto.InvalidTick ? (DetailsDto.InvalidTick) details : null;
        ValidateOrderInvalidTickDetailsDto value6 = invalidTick != null ? invalidTick.getValue() : null;
        DetailsDto.MissingPrice missingPrice = details instanceof DetailsDto.MissingPrice ? (DetailsDto.MissingPrice) details : null;
        ValidateOrderMissingPriceDetailsDto value7 = missingPrice != null ? missingPrice.getValue() : null;
        DetailsDto.NonpositiveQuantity nonpositiveQuantity = details instanceof DetailsDto.NonpositiveQuantity ? (DetailsDto.NonpositiveQuantity) details : null;
        ValidateOrderNonpositiveQuantityDetailsDto value8 = nonpositiveQuantity != null ? nonpositiveQuantity.getValue() : null;
        DetailsDto.MaxOrderQuantity maxOrderQuantity = details instanceof DetailsDto.MaxOrderQuantity ? (DetailsDto.MaxOrderQuantity) details : null;
        ValidateOrderMaxOrderQuantityDetailsDto value9 = maxOrderQuantity != null ? maxOrderQuantity.getValue() : null;
        DetailsDto.GtcMarketOrder gtcMarketOrder = details instanceof DetailsDto.GtcMarketOrder ? (DetailsDto.GtcMarketOrder) details : null;
        ValidateOrderGTCMarketOrderDetailsDto value10 = gtcMarketOrder != null ? gtcMarketOrder.getValue() : null;
        DetailsDto.Tradability tradability = details instanceof DetailsDto.Tradability ? (DetailsDto.Tradability) details : null;
        ValidateOrderTradabilityDetailsDto value11 = tradability != null ? tradability.getValue() : null;
        DetailsDto.AccountPco accountPco = details instanceof DetailsDto.AccountPco ? (DetailsDto.AccountPco) details : null;
        ValidateOrderAccountPCODetailsDto value12 = accountPco != null ? accountPco.getValue() : null;
        DetailsDto.InstrumentPco instrumentPco = details instanceof DetailsDto.InstrumentPco ? (DetailsDto.InstrumentPco) details : null;
        ValidateOrderInstrumentPCODetailsDto value13 = instrumentPco != null ? instrumentPco.getValue() : null;
        DetailsDto.MaxPosition maxPosition = details instanceof DetailsDto.MaxPosition ? (DetailsDto.MaxPosition) details : null;
        ValidateOrderMaxPositionDetailsDto value14 = maxPosition != null ? maxPosition.getValue() : null;
        DetailsDto.MarginMinEquity marginMinEquity = details instanceof DetailsDto.MarginMinEquity ? (DetailsDto.MarginMinEquity) details : null;
        ValidateOrderMarginMinEquityDetailsDto value15 = marginMinEquity != null ? marginMinEquity.getValue() : null;
        DetailsDto.NoShorts noShorts = details instanceof DetailsDto.NoShorts ? (DetailsDto.NoShorts) details : null;
        ValidateOrderNoShortsDetailsDto value16 = noShorts != null ? noShorts.getValue() : null;
        DetailsDto.InstantFraud instantFraud = details instanceof DetailsDto.InstantFraud ? (DetailsDto.InstantFraud) details : null;
        ValidateOrderInstantFraudDetailsDto value17 = instantFraud != null ? instantFraud.getValue() : null;
        DetailsDto.SenderLocation senderLocation = details instanceof DetailsDto.SenderLocation ? (DetailsDto.SenderLocation) details : null;
        ValidateOrderSenderLocationDetailsDto value18 = senderLocation != null ? senderLocation.getValue() : null;
        DetailsDto.UneconomicalPrice uneconomicalPrice = details instanceof DetailsDto.UneconomicalPrice ? (DetailsDto.UneconomicalPrice) details : null;
        ValidateOrderUneconomicalPriceDetailsDto value19 = uneconomicalPrice != null ? uneconomicalPrice.getValue() : null;
        DetailsDto.NoReversals noReversals = details instanceof DetailsDto.NoReversals ? (DetailsDto.NoReversals) details : null;
        ValidateOrderNoReversalsDetailsDto value20 = noReversals != null ? noReversals.getValue() : null;
        DetailsDto.InvalidPrice invalidPrice = details instanceof DetailsDto.InvalidPrice ? (DetailsDto.InvalidPrice) details : null;
        ValidateOrderInvalidPriceDetailsDto value21 = invalidPrice != null ? invalidPrice.getValue() : null;
        DetailsDto.Generic generic = details instanceof DetailsDto.Generic ? (DetailsDto.Generic) details : null;
        if (generic != null) {
            validateOrderMaxPositionDetailsDto = value14;
            validateOrderNoShortsDetailsDto = value16;
            validateOrderSenderLocationDetailsDto = value18;
            validateOrderNoReversalsDetailsDto = value20;
            value = generic.getValue();
        } else {
            validateOrderMaxPositionDetailsDto = value14;
            validateOrderNoShortsDetailsDto = value16;
            validateOrderSenderLocationDetailsDto = value18;
            validateOrderNoReversalsDetailsDto = value20;
            value = null;
        }
        return new ValidateOrderResponseDto(new Surrogate(result, value2, value3, value4, value5, value6, value7, value8, value9, value10, value11, value12, value13, validateOrderMaxPositionDetailsDto, value15, validateOrderNoShortsDetailsDto, value17, validateOrderSenderLocationDetailsDto, value19, validateOrderNoReversalsDetailsDto, value21, value));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ValidateOrderResponse toProto() {
        ValidateOrderResult validateOrderResult = (ValidateOrderResult) this.surrogate.getResult().toProto();
        ValidateOrderSuccessDetailsDto success = this.surrogate.getSuccess();
        ValidateOrderSuccessDetails proto = success != null ? success.toProto() : null;
        ValidateOrderInsufficientBPDetailsDto insufficient_bp = this.surrogate.getInsufficient_bp();
        ValidateOrderInsufficientBPDetails proto2 = insufficient_bp != null ? insufficient_bp.toProto() : null;
        ValidateOrderInsufficientAccountValueDetailsDto insufficient_account_value = this.surrogate.getInsufficient_account_value();
        ValidateOrderInsufficientAccountValueDetails proto3 = insufficient_account_value != null ? insufficient_account_value.toProto() : null;
        ValidateOrderSuitabilityDetailsDto suitability = this.surrogate.getSuitability();
        ValidateOrderSuitabilityDetails proto4 = suitability != null ? suitability.toProto() : null;
        ValidateOrderInvalidTickDetailsDto invalid_tick = this.surrogate.getInvalid_tick();
        ValidateOrderInvalidTickDetails proto5 = invalid_tick != null ? invalid_tick.toProto() : null;
        ValidateOrderMissingPriceDetailsDto missing_price = this.surrogate.getMissing_price();
        ValidateOrderMissingPriceDetails proto6 = missing_price != null ? missing_price.toProto() : null;
        ValidateOrderNonpositiveQuantityDetailsDto nonpositive_quantity = this.surrogate.getNonpositive_quantity();
        ValidateOrderNonpositiveQuantityDetails proto7 = nonpositive_quantity != null ? nonpositive_quantity.toProto() : null;
        ValidateOrderMaxOrderQuantityDetailsDto max_order_quantity = this.surrogate.getMax_order_quantity();
        ValidateOrderMaxOrderQuantityDetails proto8 = max_order_quantity != null ? max_order_quantity.toProto() : null;
        ValidateOrderGTCMarketOrderDetailsDto gtc_market_order = this.surrogate.getGtc_market_order();
        ValidateOrderGTCMarketOrderDetails proto9 = gtc_market_order != null ? gtc_market_order.toProto() : null;
        ValidateOrderTradabilityDetailsDto tradability = this.surrogate.getTradability();
        ValidateOrderTradabilityDetails proto10 = tradability != null ? tradability.toProto() : null;
        ValidateOrderAccountPCODetailsDto account_pco = this.surrogate.getAccount_pco();
        ValidateOrderAccountPCODetails proto11 = account_pco != null ? account_pco.toProto() : null;
        ValidateOrderInstrumentPCODetailsDto instrument_pco = this.surrogate.getInstrument_pco();
        ValidateOrderInstrumentPCODetails proto12 = instrument_pco != null ? instrument_pco.toProto() : null;
        ValidateOrderMaxPositionDetailsDto max_position = this.surrogate.getMax_position();
        ValidateOrderMaxPositionDetails proto13 = max_position != null ? max_position.toProto() : null;
        ValidateOrderMarginMinEquityDetailsDto margin_min_equity = this.surrogate.getMargin_min_equity();
        ValidateOrderMarginMinEquityDetails proto14 = margin_min_equity != null ? margin_min_equity.toProto() : null;
        ValidateOrderNoShortsDetailsDto no_shorts = this.surrogate.getNo_shorts();
        ValidateOrderNoShortsDetails proto15 = no_shorts != null ? no_shorts.toProto() : null;
        ValidateOrderInstantFraudDetailsDto instant_fraud = this.surrogate.getInstant_fraud();
        ValidateOrderInstantFraudDetails proto16 = instant_fraud != null ? instant_fraud.toProto() : null;
        ValidateOrderSenderLocationDetailsDto sender_location = this.surrogate.getSender_location();
        ValidateOrderSenderLocationDetails proto17 = sender_location != null ? sender_location.toProto() : null;
        ValidateOrderUneconomicalPriceDetailsDto uneconomical_price = this.surrogate.getUneconomical_price();
        ValidateOrderUneconomicalPriceDetails proto18 = uneconomical_price != null ? uneconomical_price.toProto() : null;
        ValidateOrderNoReversalsDetailsDto no_reversals = this.surrogate.getNo_reversals();
        ValidateOrderNoReversalsDetails proto19 = no_reversals != null ? no_reversals.toProto() : null;
        ValidateOrderInvalidPriceDetailsDto invalid_price = this.surrogate.getInvalid_price();
        ValidateOrderInvalidPriceDetails proto20 = invalid_price != null ? invalid_price.toProto() : null;
        ValidateOrderGenericDetailsDto generic = this.surrogate.getGeneric();
        return new ValidateOrderResponse(validateOrderResult, proto, proto2, proto3, proto4, proto5, proto6, proto7, proto8, proto9, proto10, proto11, proto12, proto13, proto14, proto15, proto16, proto17, proto18, proto19, proto20, generic != null ? generic.toProto() : null, null, 4194304, null);
    }

    public String toString() {
        return "[ValidateOrderResponseDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ValidateOrderResponseDto) && Intrinsics.areEqual(((ValidateOrderResponseDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ValidateOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\\\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 \u009e\u00012\u00020\u0001:\u0004\u009d\u0001\u009e\u0001B\u008d\u0002\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-¢\u0006\u0004\b.\u0010/B÷\u0001\b\u0010\u0012\u0006\u00100\u001a\u000201\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\u0010\"\u001a\u0004\u0018\u00010#\u0012\b\u0010$\u001a\u0004\u0018\u00010%\u0012\b\u0010&\u001a\u0004\u0018\u00010'\u0012\b\u0010(\u001a\u0004\u0018\u00010)\u0012\b\u0010*\u001a\u0004\u0018\u00010+\u0012\b\u0010,\u001a\u0004\u0018\u00010-\u0012\b\u00102\u001a\u0004\u0018\u000103¢\u0006\u0004\b.\u00104J\t\u0010x\u001a\u00020\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010\u007f\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\f\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\f\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u0015HÆ\u0003J\f\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0017HÆ\u0003J\f\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0019HÆ\u0003J\f\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u001bHÆ\u0003J\f\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u001dHÆ\u0003J\f\u0010\u0086\u0001\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\f\u0010\u0087\u0001\u001a\u0004\u0018\u00010!HÆ\u0003J\f\u0010\u0088\u0001\u001a\u0004\u0018\u00010#HÆ\u0003J\f\u0010\u0089\u0001\u001a\u0004\u0018\u00010%HÆ\u0003J\f\u0010\u008a\u0001\u001a\u0004\u0018\u00010'HÆ\u0003J\f\u0010\u008b\u0001\u001a\u0004\u0018\u00010)HÆ\u0003J\f\u0010\u008c\u0001\u001a\u0004\u0018\u00010+HÆ\u0003J\f\u0010\u008d\u0001\u001a\u0004\u0018\u00010-HÆ\u0003J\u0090\u0002\u0010\u008e\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010-HÆ\u0001J\u0016\u0010\u008f\u0001\u001a\u00030\u0090\u00012\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0092\u0001\u001a\u000201HÖ\u0001J\u000b\u0010\u0093\u0001\u001a\u00030\u0094\u0001HÖ\u0001J-\u0010\u0095\u0001\u001a\u00030\u0096\u00012\u0007\u0010\u0097\u0001\u001a\u00020\u00002\b\u0010\u0098\u0001\u001a\u00030\u0099\u00012\b\u0010\u009a\u0001\u001a\u00030\u009b\u0001H\u0001¢\u0006\u0003\b\u009c\u0001R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u00106\u001a\u0004\b7\u00108R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u00106\u001a\u0004\b:\u0010;R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b<\u00106\u001a\u0004\b=\u0010>R\u001e\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u00106\u001a\u0004\b@\u0010AR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bB\u00106\u001a\u0004\bC\u0010DR\u001e\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u00106\u001a\u0004\bF\u0010GR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bH\u00106\u001a\u0004\bI\u0010JR\u001e\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bK\u00106\u001a\u0004\bL\u0010MR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bN\u00106\u001a\u0004\bO\u0010PR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bQ\u00106\u001a\u0004\bR\u0010SR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bT\u00106\u001a\u0004\bU\u0010VR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bW\u00106\u001a\u0004\bX\u0010YR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bZ\u00106\u001a\u0004\b[\u0010\\R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b]\u00106\u001a\u0004\b^\u0010_R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b`\u00106\u001a\u0004\ba\u0010bR\u001e\u0010 \u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bc\u00106\u001a\u0004\bd\u0010eR\u001e\u0010\"\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bf\u00106\u001a\u0004\bg\u0010hR\u001e\u0010$\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bi\u00106\u001a\u0004\bj\u0010kR\u001e\u0010&\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bl\u00106\u001a\u0004\bm\u0010nR\u001e\u0010(\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bo\u00106\u001a\u0004\bp\u0010qR\u001e\u0010*\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\br\u00106\u001a\u0004\bs\u0010tR\u001e\u0010,\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bu\u00106\u001a\u0004\bv\u0010w¨\u0006\u009f\u0001"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate;", "", "result", "Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "success", "Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "insufficient_bp", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "insufficient_account_value", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", QuestionnaireContexts.SUITABILITY, "Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "invalid_tick", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "missing_price", "Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "nonpositive_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "max_order_quantity", "Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "gtc_market_order", "Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "tradability", "Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "account_pco", "Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "instrument_pco", "Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "max_position", "Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "margin_min_equity", "Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "no_shorts", "Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "instant_fraud", "Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "sender_location", "Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "uneconomical_price", "Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "no_reversals", "Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "invalid_price", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "generic", "Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderResultDto;Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/ceres/v1/ValidateOrderResultDto;Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getResult$annotations", "()V", "getResult", "()Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "getSuccess$annotations", "getSuccess", "()Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "getInsufficient_bp$annotations", "getInsufficient_bp", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "getInsufficient_account_value$annotations", "getInsufficient_account_value", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "getSuitability$annotations", "getSuitability", "()Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "getInvalid_tick$annotations", "getInvalid_tick", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "getMissing_price$annotations", "getMissing_price", "()Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "getNonpositive_quantity$annotations", "getNonpositive_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "getMax_order_quantity$annotations", "getMax_order_quantity", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "getGtc_market_order$annotations", "getGtc_market_order", "()Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "getTradability$annotations", "getTradability", "()Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "getAccount_pco$annotations", "getAccount_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "getInstrument_pco$annotations", "getInstrument_pco", "()Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "getMax_position$annotations", "getMax_position", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "getMargin_min_equity$annotations", "getMargin_min_equity", "()Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "getNo_shorts$annotations", "getNo_shorts", "()Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "getInstant_fraud$annotations", "getInstant_fraud", "()Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "getSender_location$annotations", "getSender_location", "()Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "getUneconomical_price$annotations", "getUneconomical_price", "()Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "getNo_reversals$annotations", "getNo_reversals", "()Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "getInvalid_price$annotations", "getInvalid_price", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "getGeneric$annotations", "getGeneric", "()Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "copy", "equals", "", "other", "hashCode", "toString", "", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$ceres_v1_externalRelease", "$serializer", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final ValidateOrderAccountPCODetailsDto account_pco;
        private final ValidateOrderGenericDetailsDto generic;
        private final ValidateOrderGTCMarketOrderDetailsDto gtc_market_order;
        private final ValidateOrderInstantFraudDetailsDto instant_fraud;
        private final ValidateOrderInstrumentPCODetailsDto instrument_pco;
        private final ValidateOrderInsufficientAccountValueDetailsDto insufficient_account_value;
        private final ValidateOrderInsufficientBPDetailsDto insufficient_bp;
        private final ValidateOrderInvalidPriceDetailsDto invalid_price;
        private final ValidateOrderInvalidTickDetailsDto invalid_tick;
        private final ValidateOrderMarginMinEquityDetailsDto margin_min_equity;
        private final ValidateOrderMaxOrderQuantityDetailsDto max_order_quantity;
        private final ValidateOrderMaxPositionDetailsDto max_position;
        private final ValidateOrderMissingPriceDetailsDto missing_price;
        private final ValidateOrderNoReversalsDetailsDto no_reversals;
        private final ValidateOrderNoShortsDetailsDto no_shorts;
        private final ValidateOrderNonpositiveQuantityDetailsDto nonpositive_quantity;
        private final ValidateOrderResultDto result;
        private final ValidateOrderSenderLocationDetailsDto sender_location;
        private final ValidateOrderSuccessDetailsDto success;
        private final ValidateOrderSuitabilityDetailsDto suitability;
        private final ValidateOrderTradabilityDetailsDto tradability;
        private final ValidateOrderUneconomicalPriceDetailsDto uneconomical_price;

        public Surrogate() {
            this((ValidateOrderResultDto) null, (ValidateOrderSuccessDetailsDto) null, (ValidateOrderInsufficientBPDetailsDto) null, (ValidateOrderInsufficientAccountValueDetailsDto) null, (ValidateOrderSuitabilityDetailsDto) null, (ValidateOrderInvalidTickDetailsDto) null, (ValidateOrderMissingPriceDetailsDto) null, (ValidateOrderNonpositiveQuantityDetailsDto) null, (ValidateOrderMaxOrderQuantityDetailsDto) null, (ValidateOrderGTCMarketOrderDetailsDto) null, (ValidateOrderTradabilityDetailsDto) null, (ValidateOrderAccountPCODetailsDto) null, (ValidateOrderInstrumentPCODetailsDto) null, (ValidateOrderMaxPositionDetailsDto) null, (ValidateOrderMarginMinEquityDetailsDto) null, (ValidateOrderNoShortsDetailsDto) null, (ValidateOrderInstantFraudDetailsDto) null, (ValidateOrderSenderLocationDetailsDto) null, (ValidateOrderUneconomicalPriceDetailsDto) null, (ValidateOrderNoReversalsDetailsDto) null, (ValidateOrderInvalidPriceDetailsDto) null, (ValidateOrderGenericDetailsDto) null, 4194303, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, ValidateOrderResultDto validateOrderResultDto, ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto, ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto, ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto, ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto, ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto, ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto, ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto, ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto, ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto, ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto, ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto, ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto, ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto, ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto, ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto, ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto, ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto, ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto, ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto, int i, Object obj) {
            ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto2;
            ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto2;
            ValidateOrderResultDto validateOrderResultDto2 = (i & 1) != 0 ? surrogate.result : validateOrderResultDto;
            ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto2 = (i & 2) != 0 ? surrogate.success : validateOrderSuccessDetailsDto;
            ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto2 = (i & 4) != 0 ? surrogate.insufficient_bp : validateOrderInsufficientBPDetailsDto;
            ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto2 = (i & 8) != 0 ? surrogate.insufficient_account_value : validateOrderInsufficientAccountValueDetailsDto;
            ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto2 = (i & 16) != 0 ? surrogate.suitability : validateOrderSuitabilityDetailsDto;
            ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto2 = (i & 32) != 0 ? surrogate.invalid_tick : validateOrderInvalidTickDetailsDto;
            ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto2 = (i & 64) != 0 ? surrogate.missing_price : validateOrderMissingPriceDetailsDto;
            ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto2 = (i & 128) != 0 ? surrogate.nonpositive_quantity : validateOrderNonpositiveQuantityDetailsDto;
            ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto2 = (i & 256) != 0 ? surrogate.max_order_quantity : validateOrderMaxOrderQuantityDetailsDto;
            ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto2 = (i & 512) != 0 ? surrogate.gtc_market_order : validateOrderGTCMarketOrderDetailsDto;
            ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto2 = (i & 1024) != 0 ? surrogate.tradability : validateOrderTradabilityDetailsDto;
            ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto2 = (i & 2048) != 0 ? surrogate.account_pco : validateOrderAccountPCODetailsDto;
            ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto2 = (i & 4096) != 0 ? surrogate.instrument_pco : validateOrderInstrumentPCODetailsDto;
            ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto2 = (i & 8192) != 0 ? surrogate.max_position : validateOrderMaxPositionDetailsDto;
            ValidateOrderResultDto validateOrderResultDto3 = validateOrderResultDto2;
            ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto2 = (i & 16384) != 0 ? surrogate.margin_min_equity : validateOrderMarginMinEquityDetailsDto;
            ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto2 = (i & 32768) != 0 ? surrogate.no_shorts : validateOrderNoShortsDetailsDto;
            ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto2 = (i & 65536) != 0 ? surrogate.instant_fraud : validateOrderInstantFraudDetailsDto;
            ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto2 = (i & 131072) != 0 ? surrogate.sender_location : validateOrderSenderLocationDetailsDto;
            ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto2 = (i & 262144) != 0 ? surrogate.uneconomical_price : validateOrderUneconomicalPriceDetailsDto;
            ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto2 = (i & 524288) != 0 ? surrogate.no_reversals : validateOrderNoReversalsDetailsDto;
            ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto3 = (i & 1048576) != 0 ? surrogate.invalid_price : validateOrderInvalidPriceDetailsDto;
            if ((i & 2097152) != 0) {
                validateOrderInvalidPriceDetailsDto2 = validateOrderInvalidPriceDetailsDto3;
                validateOrderGenericDetailsDto2 = surrogate.generic;
            } else {
                validateOrderGenericDetailsDto2 = validateOrderGenericDetailsDto;
                validateOrderInvalidPriceDetailsDto2 = validateOrderInvalidPriceDetailsDto3;
            }
            return surrogate.copy(validateOrderResultDto3, validateOrderSuccessDetailsDto2, validateOrderInsufficientBPDetailsDto2, validateOrderInsufficientAccountValueDetailsDto2, validateOrderSuitabilityDetailsDto2, validateOrderInvalidTickDetailsDto2, validateOrderMissingPriceDetailsDto2, validateOrderNonpositiveQuantityDetailsDto2, validateOrderMaxOrderQuantityDetailsDto2, validateOrderGTCMarketOrderDetailsDto2, validateOrderTradabilityDetailsDto2, validateOrderAccountPCODetailsDto2, validateOrderInstrumentPCODetailsDto2, validateOrderMaxPositionDetailsDto2, validateOrderMarginMinEquityDetailsDto2, validateOrderNoShortsDetailsDto2, validateOrderInstantFraudDetailsDto2, validateOrderSenderLocationDetailsDto2, validateOrderUneconomicalPriceDetailsDto2, validateOrderNoReversalsDetailsDto2, validateOrderInvalidPriceDetailsDto2, validateOrderGenericDetailsDto2);
        }

        @SerialName("accountPco")
        @JsonAnnotations2(names = {"account_pco"})
        public static /* synthetic */ void getAccount_pco$annotations() {
        }

        @SerialName("generic")
        @JsonAnnotations2(names = {"generic"})
        public static /* synthetic */ void getGeneric$annotations() {
        }

        @SerialName("gtcMarketOrder")
        @JsonAnnotations2(names = {"gtc_market_order"})
        public static /* synthetic */ void getGtc_market_order$annotations() {
        }

        @SerialName("instantFraud")
        @JsonAnnotations2(names = {"instant_fraud"})
        public static /* synthetic */ void getInstant_fraud$annotations() {
        }

        @SerialName("instrumentPco")
        @JsonAnnotations2(names = {"instrument_pco"})
        public static /* synthetic */ void getInstrument_pco$annotations() {
        }

        @SerialName("insufficientAccountValue")
        @JsonAnnotations2(names = {"insufficient_account_value"})
        public static /* synthetic */ void getInsufficient_account_value$annotations() {
        }

        @SerialName("insufficientBp")
        @JsonAnnotations2(names = {"insufficient_bp"})
        public static /* synthetic */ void getInsufficient_bp$annotations() {
        }

        @SerialName("invalidPrice")
        @JsonAnnotations2(names = {"invalid_price"})
        public static /* synthetic */ void getInvalid_price$annotations() {
        }

        @SerialName("invalidTick")
        @JsonAnnotations2(names = {"invalid_tick"})
        public static /* synthetic */ void getInvalid_tick$annotations() {
        }

        @SerialName("marginMinEquity")
        @JsonAnnotations2(names = {"margin_min_equity"})
        public static /* synthetic */ void getMargin_min_equity$annotations() {
        }

        @SerialName("maxOrderQuantity")
        @JsonAnnotations2(names = {"max_order_quantity"})
        public static /* synthetic */ void getMax_order_quantity$annotations() {
        }

        @SerialName("maxPosition")
        @JsonAnnotations2(names = {"max_position"})
        public static /* synthetic */ void getMax_position$annotations() {
        }

        @SerialName("missingPrice")
        @JsonAnnotations2(names = {"missing_price"})
        public static /* synthetic */ void getMissing_price$annotations() {
        }

        @SerialName("noReversals")
        @JsonAnnotations2(names = {"no_reversals"})
        public static /* synthetic */ void getNo_reversals$annotations() {
        }

        @SerialName("noShorts")
        @JsonAnnotations2(names = {"no_shorts"})
        public static /* synthetic */ void getNo_shorts$annotations() {
        }

        @SerialName("nonpositiveQuantity")
        @JsonAnnotations2(names = {"nonpositive_quantity"})
        public static /* synthetic */ void getNonpositive_quantity$annotations() {
        }

        @SerialName("result")
        @JsonAnnotations2(names = {"result"})
        public static /* synthetic */ void getResult$annotations() {
        }

        @SerialName("senderLocation")
        @JsonAnnotations2(names = {"sender_location"})
        public static /* synthetic */ void getSender_location$annotations() {
        }

        @SerialName("success")
        @JsonAnnotations2(names = {"success"})
        public static /* synthetic */ void getSuccess$annotations() {
        }

        @SerialName(QuestionnaireContexts.SUITABILITY)
        @JsonAnnotations2(names = {QuestionnaireContexts.SUITABILITY})
        public static /* synthetic */ void getSuitability$annotations() {
        }

        @SerialName("tradability")
        @JsonAnnotations2(names = {"tradability"})
        public static /* synthetic */ void getTradability$annotations() {
        }

        @SerialName("uneconomicalPrice")
        @JsonAnnotations2(names = {"uneconomical_price"})
        public static /* synthetic */ void getUneconomical_price$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final ValidateOrderResultDto getResult() {
            return this.result;
        }

        /* renamed from: component10, reason: from getter */
        public final ValidateOrderGTCMarketOrderDetailsDto getGtc_market_order() {
            return this.gtc_market_order;
        }

        /* renamed from: component11, reason: from getter */
        public final ValidateOrderTradabilityDetailsDto getTradability() {
            return this.tradability;
        }

        /* renamed from: component12, reason: from getter */
        public final ValidateOrderAccountPCODetailsDto getAccount_pco() {
            return this.account_pco;
        }

        /* renamed from: component13, reason: from getter */
        public final ValidateOrderInstrumentPCODetailsDto getInstrument_pco() {
            return this.instrument_pco;
        }

        /* renamed from: component14, reason: from getter */
        public final ValidateOrderMaxPositionDetailsDto getMax_position() {
            return this.max_position;
        }

        /* renamed from: component15, reason: from getter */
        public final ValidateOrderMarginMinEquityDetailsDto getMargin_min_equity() {
            return this.margin_min_equity;
        }

        /* renamed from: component16, reason: from getter */
        public final ValidateOrderNoShortsDetailsDto getNo_shorts() {
            return this.no_shorts;
        }

        /* renamed from: component17, reason: from getter */
        public final ValidateOrderInstantFraudDetailsDto getInstant_fraud() {
            return this.instant_fraud;
        }

        /* renamed from: component18, reason: from getter */
        public final ValidateOrderSenderLocationDetailsDto getSender_location() {
            return this.sender_location;
        }

        /* renamed from: component19, reason: from getter */
        public final ValidateOrderUneconomicalPriceDetailsDto getUneconomical_price() {
            return this.uneconomical_price;
        }

        /* renamed from: component2, reason: from getter */
        public final ValidateOrderSuccessDetailsDto getSuccess() {
            return this.success;
        }

        /* renamed from: component20, reason: from getter */
        public final ValidateOrderNoReversalsDetailsDto getNo_reversals() {
            return this.no_reversals;
        }

        /* renamed from: component21, reason: from getter */
        public final ValidateOrderInvalidPriceDetailsDto getInvalid_price() {
            return this.invalid_price;
        }

        /* renamed from: component22, reason: from getter */
        public final ValidateOrderGenericDetailsDto getGeneric() {
            return this.generic;
        }

        /* renamed from: component3, reason: from getter */
        public final ValidateOrderInsufficientBPDetailsDto getInsufficient_bp() {
            return this.insufficient_bp;
        }

        /* renamed from: component4, reason: from getter */
        public final ValidateOrderInsufficientAccountValueDetailsDto getInsufficient_account_value() {
            return this.insufficient_account_value;
        }

        /* renamed from: component5, reason: from getter */
        public final ValidateOrderSuitabilityDetailsDto getSuitability() {
            return this.suitability;
        }

        /* renamed from: component6, reason: from getter */
        public final ValidateOrderInvalidTickDetailsDto getInvalid_tick() {
            return this.invalid_tick;
        }

        /* renamed from: component7, reason: from getter */
        public final ValidateOrderMissingPriceDetailsDto getMissing_price() {
            return this.missing_price;
        }

        /* renamed from: component8, reason: from getter */
        public final ValidateOrderNonpositiveQuantityDetailsDto getNonpositive_quantity() {
            return this.nonpositive_quantity;
        }

        /* renamed from: component9, reason: from getter */
        public final ValidateOrderMaxOrderQuantityDetailsDto getMax_order_quantity() {
            return this.max_order_quantity;
        }

        public final Surrogate copy(ValidateOrderResultDto result, ValidateOrderSuccessDetailsDto success, ValidateOrderInsufficientBPDetailsDto insufficient_bp, ValidateOrderInsufficientAccountValueDetailsDto insufficient_account_value, ValidateOrderSuitabilityDetailsDto suitability, ValidateOrderInvalidTickDetailsDto invalid_tick, ValidateOrderMissingPriceDetailsDto missing_price, ValidateOrderNonpositiveQuantityDetailsDto nonpositive_quantity, ValidateOrderMaxOrderQuantityDetailsDto max_order_quantity, ValidateOrderGTCMarketOrderDetailsDto gtc_market_order, ValidateOrderTradabilityDetailsDto tradability, ValidateOrderAccountPCODetailsDto account_pco, ValidateOrderInstrumentPCODetailsDto instrument_pco, ValidateOrderMaxPositionDetailsDto max_position, ValidateOrderMarginMinEquityDetailsDto margin_min_equity, ValidateOrderNoShortsDetailsDto no_shorts, ValidateOrderInstantFraudDetailsDto instant_fraud, ValidateOrderSenderLocationDetailsDto sender_location, ValidateOrderUneconomicalPriceDetailsDto uneconomical_price, ValidateOrderNoReversalsDetailsDto no_reversals, ValidateOrderInvalidPriceDetailsDto invalid_price, ValidateOrderGenericDetailsDto generic) {
            Intrinsics.checkNotNullParameter(result, "result");
            return new Surrogate(result, success, insufficient_bp, insufficient_account_value, suitability, invalid_tick, missing_price, nonpositive_quantity, max_order_quantity, gtc_market_order, tradability, account_pco, instrument_pco, max_position, margin_min_equity, no_shorts, instant_fraud, sender_location, uneconomical_price, no_reversals, invalid_price, generic);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.result == surrogate.result && Intrinsics.areEqual(this.success, surrogate.success) && Intrinsics.areEqual(this.insufficient_bp, surrogate.insufficient_bp) && Intrinsics.areEqual(this.insufficient_account_value, surrogate.insufficient_account_value) && Intrinsics.areEqual(this.suitability, surrogate.suitability) && Intrinsics.areEqual(this.invalid_tick, surrogate.invalid_tick) && Intrinsics.areEqual(this.missing_price, surrogate.missing_price) && Intrinsics.areEqual(this.nonpositive_quantity, surrogate.nonpositive_quantity) && Intrinsics.areEqual(this.max_order_quantity, surrogate.max_order_quantity) && Intrinsics.areEqual(this.gtc_market_order, surrogate.gtc_market_order) && Intrinsics.areEqual(this.tradability, surrogate.tradability) && Intrinsics.areEqual(this.account_pco, surrogate.account_pco) && Intrinsics.areEqual(this.instrument_pco, surrogate.instrument_pco) && Intrinsics.areEqual(this.max_position, surrogate.max_position) && Intrinsics.areEqual(this.margin_min_equity, surrogate.margin_min_equity) && Intrinsics.areEqual(this.no_shorts, surrogate.no_shorts) && Intrinsics.areEqual(this.instant_fraud, surrogate.instant_fraud) && Intrinsics.areEqual(this.sender_location, surrogate.sender_location) && Intrinsics.areEqual(this.uneconomical_price, surrogate.uneconomical_price) && Intrinsics.areEqual(this.no_reversals, surrogate.no_reversals) && Intrinsics.areEqual(this.invalid_price, surrogate.invalid_price) && Intrinsics.areEqual(this.generic, surrogate.generic);
        }

        public int hashCode() {
            int iHashCode = this.result.hashCode() * 31;
            ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto = this.success;
            int iHashCode2 = (iHashCode + (validateOrderSuccessDetailsDto == null ? 0 : validateOrderSuccessDetailsDto.hashCode())) * 31;
            ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto = this.insufficient_bp;
            int iHashCode3 = (iHashCode2 + (validateOrderInsufficientBPDetailsDto == null ? 0 : validateOrderInsufficientBPDetailsDto.hashCode())) * 31;
            ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto = this.insufficient_account_value;
            int iHashCode4 = (iHashCode3 + (validateOrderInsufficientAccountValueDetailsDto == null ? 0 : validateOrderInsufficientAccountValueDetailsDto.hashCode())) * 31;
            ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto = this.suitability;
            int iHashCode5 = (iHashCode4 + (validateOrderSuitabilityDetailsDto == null ? 0 : validateOrderSuitabilityDetailsDto.hashCode())) * 31;
            ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto = this.invalid_tick;
            int iHashCode6 = (iHashCode5 + (validateOrderInvalidTickDetailsDto == null ? 0 : validateOrderInvalidTickDetailsDto.hashCode())) * 31;
            ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto = this.missing_price;
            int iHashCode7 = (iHashCode6 + (validateOrderMissingPriceDetailsDto == null ? 0 : validateOrderMissingPriceDetailsDto.hashCode())) * 31;
            ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto = this.nonpositive_quantity;
            int iHashCode8 = (iHashCode7 + (validateOrderNonpositiveQuantityDetailsDto == null ? 0 : validateOrderNonpositiveQuantityDetailsDto.hashCode())) * 31;
            ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto = this.max_order_quantity;
            int iHashCode9 = (iHashCode8 + (validateOrderMaxOrderQuantityDetailsDto == null ? 0 : validateOrderMaxOrderQuantityDetailsDto.hashCode())) * 31;
            ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto = this.gtc_market_order;
            int iHashCode10 = (iHashCode9 + (validateOrderGTCMarketOrderDetailsDto == null ? 0 : validateOrderGTCMarketOrderDetailsDto.hashCode())) * 31;
            ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto = this.tradability;
            int iHashCode11 = (iHashCode10 + (validateOrderTradabilityDetailsDto == null ? 0 : validateOrderTradabilityDetailsDto.hashCode())) * 31;
            ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto = this.account_pco;
            int iHashCode12 = (iHashCode11 + (validateOrderAccountPCODetailsDto == null ? 0 : validateOrderAccountPCODetailsDto.hashCode())) * 31;
            ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto = this.instrument_pco;
            int iHashCode13 = (iHashCode12 + (validateOrderInstrumentPCODetailsDto == null ? 0 : validateOrderInstrumentPCODetailsDto.hashCode())) * 31;
            ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto = this.max_position;
            int iHashCode14 = (iHashCode13 + (validateOrderMaxPositionDetailsDto == null ? 0 : validateOrderMaxPositionDetailsDto.hashCode())) * 31;
            ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto = this.margin_min_equity;
            int iHashCode15 = (iHashCode14 + (validateOrderMarginMinEquityDetailsDto == null ? 0 : validateOrderMarginMinEquityDetailsDto.hashCode())) * 31;
            ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto = this.no_shorts;
            int iHashCode16 = (iHashCode15 + (validateOrderNoShortsDetailsDto == null ? 0 : validateOrderNoShortsDetailsDto.hashCode())) * 31;
            ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto = this.instant_fraud;
            int iHashCode17 = (iHashCode16 + (validateOrderInstantFraudDetailsDto == null ? 0 : validateOrderInstantFraudDetailsDto.hashCode())) * 31;
            ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto = this.sender_location;
            int iHashCode18 = (iHashCode17 + (validateOrderSenderLocationDetailsDto == null ? 0 : validateOrderSenderLocationDetailsDto.hashCode())) * 31;
            ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto = this.uneconomical_price;
            int iHashCode19 = (iHashCode18 + (validateOrderUneconomicalPriceDetailsDto == null ? 0 : validateOrderUneconomicalPriceDetailsDto.hashCode())) * 31;
            ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto = this.no_reversals;
            int iHashCode20 = (iHashCode19 + (validateOrderNoReversalsDetailsDto == null ? 0 : validateOrderNoReversalsDetailsDto.hashCode())) * 31;
            ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto = this.invalid_price;
            int iHashCode21 = (iHashCode20 + (validateOrderInvalidPriceDetailsDto == null ? 0 : validateOrderInvalidPriceDetailsDto.hashCode())) * 31;
            ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto = this.generic;
            return iHashCode21 + (validateOrderGenericDetailsDto != null ? validateOrderGenericDetailsDto.hashCode() : 0);
        }

        public String toString() {
            return "Surrogate(result=" + this.result + ", success=" + this.success + ", insufficient_bp=" + this.insufficient_bp + ", insufficient_account_value=" + this.insufficient_account_value + ", suitability=" + this.suitability + ", invalid_tick=" + this.invalid_tick + ", missing_price=" + this.missing_price + ", nonpositive_quantity=" + this.nonpositive_quantity + ", max_order_quantity=" + this.max_order_quantity + ", gtc_market_order=" + this.gtc_market_order + ", tradability=" + this.tradability + ", account_pco=" + this.account_pco + ", instrument_pco=" + this.instrument_pco + ", max_position=" + this.max_position + ", margin_min_equity=" + this.margin_min_equity + ", no_shorts=" + this.no_shorts + ", instant_fraud=" + this.instant_fraud + ", sender_location=" + this.sender_location + ", uneconomical_price=" + this.uneconomical_price + ", no_reversals=" + this.no_reversals + ", invalid_price=" + this.invalid_price + ", generic=" + this.generic + ")";
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ValidateOrderResponseDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, ValidateOrderResultDto validateOrderResultDto, ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto, ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto, ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto, ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto, ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto, ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto, ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto, ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto, ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto, ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto, ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto, ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto, ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto, ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto, ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto, ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto, ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto, ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto, ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.result = (i & 1) == 0 ? ValidateOrderResultDto.INSTANCE.getZeroValue() : validateOrderResultDto;
            if ((i & 2) == 0) {
                this.success = null;
            } else {
                this.success = validateOrderSuccessDetailsDto;
            }
            if ((i & 4) == 0) {
                this.insufficient_bp = null;
            } else {
                this.insufficient_bp = validateOrderInsufficientBPDetailsDto;
            }
            if ((i & 8) == 0) {
                this.insufficient_account_value = null;
            } else {
                this.insufficient_account_value = validateOrderInsufficientAccountValueDetailsDto;
            }
            if ((i & 16) == 0) {
                this.suitability = null;
            } else {
                this.suitability = validateOrderSuitabilityDetailsDto;
            }
            if ((i & 32) == 0) {
                this.invalid_tick = null;
            } else {
                this.invalid_tick = validateOrderInvalidTickDetailsDto;
            }
            if ((i & 64) == 0) {
                this.missing_price = null;
            } else {
                this.missing_price = validateOrderMissingPriceDetailsDto;
            }
            if ((i & 128) == 0) {
                this.nonpositive_quantity = null;
            } else {
                this.nonpositive_quantity = validateOrderNonpositiveQuantityDetailsDto;
            }
            if ((i & 256) == 0) {
                this.max_order_quantity = null;
            } else {
                this.max_order_quantity = validateOrderMaxOrderQuantityDetailsDto;
            }
            if ((i & 512) == 0) {
                this.gtc_market_order = null;
            } else {
                this.gtc_market_order = validateOrderGTCMarketOrderDetailsDto;
            }
            if ((i & 1024) == 0) {
                this.tradability = null;
            } else {
                this.tradability = validateOrderTradabilityDetailsDto;
            }
            if ((i & 2048) == 0) {
                this.account_pco = null;
            } else {
                this.account_pco = validateOrderAccountPCODetailsDto;
            }
            if ((i & 4096) == 0) {
                this.instrument_pco = null;
            } else {
                this.instrument_pco = validateOrderInstrumentPCODetailsDto;
            }
            if ((i & 8192) == 0) {
                this.max_position = null;
            } else {
                this.max_position = validateOrderMaxPositionDetailsDto;
            }
            if ((i & 16384) == 0) {
                this.margin_min_equity = null;
            } else {
                this.margin_min_equity = validateOrderMarginMinEquityDetailsDto;
            }
            if ((32768 & i) == 0) {
                this.no_shorts = null;
            } else {
                this.no_shorts = validateOrderNoShortsDetailsDto;
            }
            if ((65536 & i) == 0) {
                this.instant_fraud = null;
            } else {
                this.instant_fraud = validateOrderInstantFraudDetailsDto;
            }
            if ((131072 & i) == 0) {
                this.sender_location = null;
            } else {
                this.sender_location = validateOrderSenderLocationDetailsDto;
            }
            if ((262144 & i) == 0) {
                this.uneconomical_price = null;
            } else {
                this.uneconomical_price = validateOrderUneconomicalPriceDetailsDto;
            }
            if ((524288 & i) == 0) {
                this.no_reversals = null;
            } else {
                this.no_reversals = validateOrderNoReversalsDetailsDto;
            }
            if ((1048576 & i) == 0) {
                this.invalid_price = null;
            } else {
                this.invalid_price = validateOrderInvalidPriceDetailsDto;
            }
            if ((i & 2097152) == 0) {
                this.generic = null;
            } else {
                this.generic = validateOrderGenericDetailsDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$ceres_v1_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.result != ValidateOrderResultDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, ValidateOrderResultDto.Serializer.INSTANCE, self.result);
            }
            ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto = self.success;
            if (validateOrderSuccessDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 1, ValidateOrderSuccessDetailsDto.Serializer.INSTANCE, validateOrderSuccessDetailsDto);
            }
            ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto = self.insufficient_bp;
            if (validateOrderInsufficientBPDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 2, ValidateOrderInsufficientBPDetailsDto.Serializer.INSTANCE, validateOrderInsufficientBPDetailsDto);
            }
            ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto = self.insufficient_account_value;
            if (validateOrderInsufficientAccountValueDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 3, ValidateOrderInsufficientAccountValueDetailsDto.Serializer.INSTANCE, validateOrderInsufficientAccountValueDetailsDto);
            }
            ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto = self.suitability;
            if (validateOrderSuitabilityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 4, ValidateOrderSuitabilityDetailsDto.Serializer.INSTANCE, validateOrderSuitabilityDetailsDto);
            }
            ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto = self.invalid_tick;
            if (validateOrderInvalidTickDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 5, ValidateOrderInvalidTickDetailsDto.Serializer.INSTANCE, validateOrderInvalidTickDetailsDto);
            }
            ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto = self.missing_price;
            if (validateOrderMissingPriceDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 6, ValidateOrderMissingPriceDetailsDto.Serializer.INSTANCE, validateOrderMissingPriceDetailsDto);
            }
            ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto = self.nonpositive_quantity;
            if (validateOrderNonpositiveQuantityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 7, ValidateOrderNonpositiveQuantityDetailsDto.Serializer.INSTANCE, validateOrderNonpositiveQuantityDetailsDto);
            }
            ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto = self.max_order_quantity;
            if (validateOrderMaxOrderQuantityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 8, ValidateOrderMaxOrderQuantityDetailsDto.Serializer.INSTANCE, validateOrderMaxOrderQuantityDetailsDto);
            }
            ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto = self.gtc_market_order;
            if (validateOrderGTCMarketOrderDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 9, ValidateOrderGTCMarketOrderDetailsDto.Serializer.INSTANCE, validateOrderGTCMarketOrderDetailsDto);
            }
            ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto = self.tradability;
            if (validateOrderTradabilityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 10, ValidateOrderTradabilityDetailsDto.Serializer.INSTANCE, validateOrderTradabilityDetailsDto);
            }
            ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto = self.account_pco;
            if (validateOrderAccountPCODetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 11, ValidateOrderAccountPCODetailsDto.Serializer.INSTANCE, validateOrderAccountPCODetailsDto);
            }
            ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto = self.instrument_pco;
            if (validateOrderInstrumentPCODetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 12, ValidateOrderInstrumentPCODetailsDto.Serializer.INSTANCE, validateOrderInstrumentPCODetailsDto);
            }
            ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto = self.max_position;
            if (validateOrderMaxPositionDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 13, ValidateOrderMaxPositionDetailsDto.Serializer.INSTANCE, validateOrderMaxPositionDetailsDto);
            }
            ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto = self.margin_min_equity;
            if (validateOrderMarginMinEquityDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 14, ValidateOrderMarginMinEquityDetailsDto.Serializer.INSTANCE, validateOrderMarginMinEquityDetailsDto);
            }
            ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto = self.no_shorts;
            if (validateOrderNoShortsDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 15, ValidateOrderNoShortsDetailsDto.Serializer.INSTANCE, validateOrderNoShortsDetailsDto);
            }
            ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto = self.instant_fraud;
            if (validateOrderInstantFraudDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 16, ValidateOrderInstantFraudDetailsDto.Serializer.INSTANCE, validateOrderInstantFraudDetailsDto);
            }
            ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto = self.sender_location;
            if (validateOrderSenderLocationDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 17, ValidateOrderSenderLocationDetailsDto.Serializer.INSTANCE, validateOrderSenderLocationDetailsDto);
            }
            ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto = self.uneconomical_price;
            if (validateOrderUneconomicalPriceDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 18, ValidateOrderUneconomicalPriceDetailsDto.Serializer.INSTANCE, validateOrderUneconomicalPriceDetailsDto);
            }
            ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto = self.no_reversals;
            if (validateOrderNoReversalsDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 19, ValidateOrderNoReversalsDetailsDto.Serializer.INSTANCE, validateOrderNoReversalsDetailsDto);
            }
            ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto = self.invalid_price;
            if (validateOrderInvalidPriceDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 20, ValidateOrderInvalidPriceDetailsDto.Serializer.INSTANCE, validateOrderInvalidPriceDetailsDto);
            }
            ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto = self.generic;
            if (validateOrderGenericDetailsDto != null) {
                output.encodeNullableSerializableElement(serialDesc, 21, ValidateOrderGenericDetailsDto.Serializer.INSTANCE, validateOrderGenericDetailsDto);
            }
        }

        public Surrogate(ValidateOrderResultDto result, ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto, ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto, ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto, ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto, ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto, ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto, ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto, ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto, ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto, ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto, ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto, ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto, ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto, ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto, ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto, ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto, ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto, ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto, ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto) {
            Intrinsics.checkNotNullParameter(result, "result");
            this.result = result;
            this.success = validateOrderSuccessDetailsDto;
            this.insufficient_bp = validateOrderInsufficientBPDetailsDto;
            this.insufficient_account_value = validateOrderInsufficientAccountValueDetailsDto;
            this.suitability = validateOrderSuitabilityDetailsDto;
            this.invalid_tick = validateOrderInvalidTickDetailsDto;
            this.missing_price = validateOrderMissingPriceDetailsDto;
            this.nonpositive_quantity = validateOrderNonpositiveQuantityDetailsDto;
            this.max_order_quantity = validateOrderMaxOrderQuantityDetailsDto;
            this.gtc_market_order = validateOrderGTCMarketOrderDetailsDto;
            this.tradability = validateOrderTradabilityDetailsDto;
            this.account_pco = validateOrderAccountPCODetailsDto;
            this.instrument_pco = validateOrderInstrumentPCODetailsDto;
            this.max_position = validateOrderMaxPositionDetailsDto;
            this.margin_min_equity = validateOrderMarginMinEquityDetailsDto;
            this.no_shorts = validateOrderNoShortsDetailsDto;
            this.instant_fraud = validateOrderInstantFraudDetailsDto;
            this.sender_location = validateOrderSenderLocationDetailsDto;
            this.uneconomical_price = validateOrderUneconomicalPriceDetailsDto;
            this.no_reversals = validateOrderNoReversalsDetailsDto;
            this.invalid_price = validateOrderInvalidPriceDetailsDto;
            this.generic = validateOrderGenericDetailsDto;
        }

        public final ValidateOrderResultDto getResult() {
            return this.result;
        }

        public /* synthetic */ Surrogate(ValidateOrderResultDto validateOrderResultDto, ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto, ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto, ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto, ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto, ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto, ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto, ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto, ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto, ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto, ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto, ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto, ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto, ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto, ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto, ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto, ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto, ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto, ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto, ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ValidateOrderResultDto.INSTANCE.getZeroValue() : validateOrderResultDto, (i & 2) != 0 ? null : validateOrderSuccessDetailsDto, (i & 4) != 0 ? null : validateOrderInsufficientBPDetailsDto, (i & 8) != 0 ? null : validateOrderInsufficientAccountValueDetailsDto, (i & 16) != 0 ? null : validateOrderSuitabilityDetailsDto, (i & 32) != 0 ? null : validateOrderInvalidTickDetailsDto, (i & 64) != 0 ? null : validateOrderMissingPriceDetailsDto, (i & 128) != 0 ? null : validateOrderNonpositiveQuantityDetailsDto, (i & 256) != 0 ? null : validateOrderMaxOrderQuantityDetailsDto, (i & 512) != 0 ? null : validateOrderGTCMarketOrderDetailsDto, (i & 1024) != 0 ? null : validateOrderTradabilityDetailsDto, (i & 2048) != 0 ? null : validateOrderAccountPCODetailsDto, (i & 4096) != 0 ? null : validateOrderInstrumentPCODetailsDto, (i & 8192) != 0 ? null : validateOrderMaxPositionDetailsDto, (i & 16384) != 0 ? null : validateOrderMarginMinEquityDetailsDto, (i & 32768) != 0 ? null : validateOrderNoShortsDetailsDto, (i & 65536) != 0 ? null : validateOrderInstantFraudDetailsDto, (i & 131072) != 0 ? null : validateOrderSenderLocationDetailsDto, (i & 262144) != 0 ? null : validateOrderUneconomicalPriceDetailsDto, (i & 524288) != 0 ? null : validateOrderNoReversalsDetailsDto, (i & 1048576) != 0 ? null : validateOrderInvalidPriceDetailsDto, (i & 2097152) != 0 ? null : validateOrderGenericDetailsDto);
        }

        public final ValidateOrderSuccessDetailsDto getSuccess() {
            return this.success;
        }

        public final ValidateOrderInsufficientBPDetailsDto getInsufficient_bp() {
            return this.insufficient_bp;
        }

        public final ValidateOrderInsufficientAccountValueDetailsDto getInsufficient_account_value() {
            return this.insufficient_account_value;
        }

        public final ValidateOrderSuitabilityDetailsDto getSuitability() {
            return this.suitability;
        }

        public final ValidateOrderInvalidTickDetailsDto getInvalid_tick() {
            return this.invalid_tick;
        }

        public final ValidateOrderMissingPriceDetailsDto getMissing_price() {
            return this.missing_price;
        }

        public final ValidateOrderNonpositiveQuantityDetailsDto getNonpositive_quantity() {
            return this.nonpositive_quantity;
        }

        public final ValidateOrderMaxOrderQuantityDetailsDto getMax_order_quantity() {
            return this.max_order_quantity;
        }

        public final ValidateOrderGTCMarketOrderDetailsDto getGtc_market_order() {
            return this.gtc_market_order;
        }

        public final ValidateOrderTradabilityDetailsDto getTradability() {
            return this.tradability;
        }

        public final ValidateOrderAccountPCODetailsDto getAccount_pco() {
            return this.account_pco;
        }

        public final ValidateOrderInstrumentPCODetailsDto getInstrument_pco() {
            return this.instrument_pco;
        }

        public final ValidateOrderMaxPositionDetailsDto getMax_position() {
            return this.max_position;
        }

        public final ValidateOrderMarginMinEquityDetailsDto getMargin_min_equity() {
            return this.margin_min_equity;
        }

        public final ValidateOrderNoShortsDetailsDto getNo_shorts() {
            return this.no_shorts;
        }

        public final ValidateOrderInstantFraudDetailsDto getInstant_fraud() {
            return this.instant_fraud;
        }

        public final ValidateOrderSenderLocationDetailsDto getSender_location() {
            return this.sender_location;
        }

        public final ValidateOrderUneconomicalPriceDetailsDto getUneconomical_price() {
            return this.uneconomical_price;
        }

        public final ValidateOrderNoReversalsDetailsDto getNo_reversals() {
            return this.no_reversals;
        }

        public final ValidateOrderInvalidPriceDetailsDto getInvalid_price() {
            return this.invalid_price;
        }

        public final ValidateOrderGenericDetailsDto getGeneric() {
            return this.generic;
        }
    }

    /* compiled from: ValidateOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion implements Dto3.Creator<ValidateOrderResponseDto, ValidateOrderResponse> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateOrderResponseDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderResponseDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderResponseDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateOrderResponseDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateOrderResponse> getProtoAdapter() {
            return ValidateOrderResponse.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderResponseDto getZeroValue() {
            return ValidateOrderResponseDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderResponseDto fromProto(ValidateOrderResponse proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            ValidateOrderResultDto validateOrderResultDtoFromProto = ValidateOrderResultDto.INSTANCE.fromProto(proto.getResult());
            ValidateOrderSuccessDetails success = proto.getSuccess();
            DefaultConstructorMarker defaultConstructorMarker = null;
            ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDtoFromProto = success != null ? ValidateOrderSuccessDetailsDto.INSTANCE.fromProto(success) : null;
            ValidateOrderInsufficientBPDetails insufficient_bp = proto.getInsufficient_bp();
            ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDtoFromProto = insufficient_bp != null ? ValidateOrderInsufficientBPDetailsDto.INSTANCE.fromProto(insufficient_bp) : null;
            ValidateOrderInsufficientAccountValueDetails insufficient_account_value = proto.getInsufficient_account_value();
            ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDtoFromProto = insufficient_account_value != null ? ValidateOrderInsufficientAccountValueDetailsDto.INSTANCE.fromProto(insufficient_account_value) : null;
            ValidateOrderSuitabilityDetails suitability = proto.getSuitability();
            ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDtoFromProto = suitability != null ? ValidateOrderSuitabilityDetailsDto.INSTANCE.fromProto(suitability) : null;
            ValidateOrderInvalidTickDetails invalid_tick = proto.getInvalid_tick();
            ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDtoFromProto = invalid_tick != null ? ValidateOrderInvalidTickDetailsDto.INSTANCE.fromProto(invalid_tick) : null;
            ValidateOrderMissingPriceDetails missing_price = proto.getMissing_price();
            ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDtoFromProto = missing_price != null ? ValidateOrderMissingPriceDetailsDto.INSTANCE.fromProto(missing_price) : null;
            ValidateOrderNonpositiveQuantityDetails nonpositive_quantity = proto.getNonpositive_quantity();
            ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDtoFromProto = nonpositive_quantity != null ? ValidateOrderNonpositiveQuantityDetailsDto.INSTANCE.fromProto(nonpositive_quantity) : null;
            ValidateOrderMaxOrderQuantityDetails max_order_quantity = proto.getMax_order_quantity();
            ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDtoFromProto = max_order_quantity != null ? ValidateOrderMaxOrderQuantityDetailsDto.INSTANCE.fromProto(max_order_quantity) : null;
            ValidateOrderGTCMarketOrderDetails gtc_market_order = proto.getGtc_market_order();
            ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDtoFromProto = gtc_market_order != null ? ValidateOrderGTCMarketOrderDetailsDto.INSTANCE.fromProto(gtc_market_order) : null;
            ValidateOrderTradabilityDetails tradability = proto.getTradability();
            ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDtoFromProto = tradability != null ? ValidateOrderTradabilityDetailsDto.INSTANCE.fromProto(tradability) : null;
            ValidateOrderAccountPCODetails account_pco = proto.getAccount_pco();
            ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDtoFromProto = account_pco != null ? ValidateOrderAccountPCODetailsDto.INSTANCE.fromProto(account_pco) : null;
            ValidateOrderInstrumentPCODetails instrument_pco = proto.getInstrument_pco();
            ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDtoFromProto = instrument_pco != null ? ValidateOrderInstrumentPCODetailsDto.INSTANCE.fromProto(instrument_pco) : null;
            ValidateOrderMaxPositionDetails max_position = proto.getMax_position();
            ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDtoFromProto = max_position != null ? ValidateOrderMaxPositionDetailsDto.INSTANCE.fromProto(max_position) : null;
            ValidateOrderMarginMinEquityDetails margin_min_equity = proto.getMargin_min_equity();
            ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDtoFromProto = margin_min_equity != null ? ValidateOrderMarginMinEquityDetailsDto.INSTANCE.fromProto(margin_min_equity) : null;
            ValidateOrderNoShortsDetails no_shorts = proto.getNo_shorts();
            ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDtoFromProto = no_shorts != null ? ValidateOrderNoShortsDetailsDto.INSTANCE.fromProto(no_shorts) : null;
            ValidateOrderInstantFraudDetails instant_fraud = proto.getInstant_fraud();
            ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDtoFromProto = instant_fraud != null ? ValidateOrderInstantFraudDetailsDto.INSTANCE.fromProto(instant_fraud) : null;
            ValidateOrderSenderLocationDetails sender_location = proto.getSender_location();
            ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDtoFromProto = sender_location != null ? ValidateOrderSenderLocationDetailsDto.INSTANCE.fromProto(sender_location) : null;
            ValidateOrderUneconomicalPriceDetails uneconomical_price = proto.getUneconomical_price();
            ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDtoFromProto = uneconomical_price != null ? ValidateOrderUneconomicalPriceDetailsDto.INSTANCE.fromProto(uneconomical_price) : null;
            ValidateOrderNoReversalsDetails no_reversals = proto.getNo_reversals();
            ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDtoFromProto = no_reversals != null ? ValidateOrderNoReversalsDetailsDto.INSTANCE.fromProto(no_reversals) : null;
            ValidateOrderInvalidPriceDetails invalid_price = proto.getInvalid_price();
            ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDtoFromProto = invalid_price != null ? ValidateOrderInvalidPriceDetailsDto.INSTANCE.fromProto(invalid_price) : null;
            ValidateOrderGenericDetails generic = proto.getGeneric();
            return new ValidateOrderResponseDto(new Surrogate(validateOrderResultDtoFromProto, validateOrderSuccessDetailsDtoFromProto, validateOrderInsufficientBPDetailsDtoFromProto, validateOrderInsufficientAccountValueDetailsDtoFromProto, validateOrderSuitabilityDetailsDtoFromProto, validateOrderInvalidTickDetailsDtoFromProto, validateOrderMissingPriceDetailsDtoFromProto, validateOrderNonpositiveQuantityDetailsDtoFromProto, validateOrderMaxOrderQuantityDetailsDtoFromProto, validateOrderGTCMarketOrderDetailsDtoFromProto, validateOrderTradabilityDetailsDtoFromProto, validateOrderAccountPCODetailsDtoFromProto, validateOrderInstrumentPCODetailsDtoFromProto, validateOrderMaxPositionDetailsDtoFromProto, validateOrderMarginMinEquityDetailsDtoFromProto, validateOrderNoShortsDetailsDtoFromProto, validateOrderInstantFraudDetailsDtoFromProto, validateOrderSenderLocationDetailsDtoFromProto, validateOrderUneconomicalPriceDetailsDtoFromProto, validateOrderNoReversalsDetailsDtoFromProto, validateOrderInvalidPriceDetailsDtoFromProto, generic != null ? ValidateOrderGenericDetailsDto.INSTANCE.fromProto(generic) : null), defaultConstructorMarker);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ValidateOrderResponseDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateOrderResponseDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ValidateOrderResponseDto(0 == true ? 1 : 0, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00192\u00020\u0001:\u0016\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0015\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-.¨\u0006/"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "Lcom/robinhood/idl/OneOfDto;", "<init>", "()V", "Success", "InsufficientBp", "InsufficientAccountValue", "Suitability", "InvalidTick", "MissingPrice", "NonpositiveQuantity", "MaxOrderQuantity", "GtcMarketOrder", "Tradability", "AccountPco", "InstrumentPco", "MaxPosition", "MarginMinEquity", "NoShorts", "InstantFraud", "SenderLocation", "UneconomicalPrice", "NoReversals", "InvalidPrice", "Generic", "Companion", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$AccountPco;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Generic;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$GtcMarketOrder;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InstantFraud;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InstrumentPco;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InsufficientAccountValue;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InsufficientBp;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InvalidPrice;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InvalidTick;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MarginMinEquity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MaxOrderQuantity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MaxPosition;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MissingPrice;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NoReversals;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NoShorts;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NonpositiveQuantity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$SenderLocation;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Success;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Suitability;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Tradability;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$UneconomicalPrice;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @RhGenerated
    public static abstract class DetailsDto implements Dto4 {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        public /* synthetic */ DetailsDto(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private DetailsDto() {
        }

        @Override // com.robinhood.idl.Dto
        public Void toProto() {
            return Dto4.DefaultImpls.toProto(this);
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Success;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderSuccessDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Success extends DetailsDto {
            private final ValidateOrderSuccessDetailsDto value;

            public static /* synthetic */ Success copy$default(Success success, ValidateOrderSuccessDetailsDto validateOrderSuccessDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderSuccessDetailsDto = success.value;
                }
                return success.copy(validateOrderSuccessDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderSuccessDetailsDto getValue() {
                return this.value;
            }

            public final Success copy(ValidateOrderSuccessDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Success(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Success) && Intrinsics.areEqual(this.value, ((Success) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Success(value=" + this.value + ")";
            }

            public final ValidateOrderSuccessDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Success(ValidateOrderSuccessDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InsufficientBp;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientBPDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InsufficientBp extends DetailsDto {
            private final ValidateOrderInsufficientBPDetailsDto value;

            public static /* synthetic */ InsufficientBp copy$default(InsufficientBp insufficientBp, ValidateOrderInsufficientBPDetailsDto validateOrderInsufficientBPDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInsufficientBPDetailsDto = insufficientBp.value;
                }
                return insufficientBp.copy(validateOrderInsufficientBPDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInsufficientBPDetailsDto getValue() {
                return this.value;
            }

            public final InsufficientBp copy(ValidateOrderInsufficientBPDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InsufficientBp(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InsufficientBp) && Intrinsics.areEqual(this.value, ((InsufficientBp) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InsufficientBp(value=" + this.value + ")";
            }

            public final ValidateOrderInsufficientBPDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InsufficientBp(ValidateOrderInsufficientBPDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InsufficientAccountValue;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInsufficientAccountValueDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InsufficientAccountValue extends DetailsDto {
            private final ValidateOrderInsufficientAccountValueDetailsDto value;

            public static /* synthetic */ InsufficientAccountValue copy$default(InsufficientAccountValue insufficientAccountValue, ValidateOrderInsufficientAccountValueDetailsDto validateOrderInsufficientAccountValueDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInsufficientAccountValueDetailsDto = insufficientAccountValue.value;
                }
                return insufficientAccountValue.copy(validateOrderInsufficientAccountValueDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInsufficientAccountValueDetailsDto getValue() {
                return this.value;
            }

            public final InsufficientAccountValue copy(ValidateOrderInsufficientAccountValueDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InsufficientAccountValue(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InsufficientAccountValue) && Intrinsics.areEqual(this.value, ((InsufficientAccountValue) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InsufficientAccountValue(value=" + this.value + ")";
            }

            public final ValidateOrderInsufficientAccountValueDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InsufficientAccountValue(ValidateOrderInsufficientAccountValueDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Suitability;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderSuitabilityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Suitability extends DetailsDto {
            private final ValidateOrderSuitabilityDetailsDto value;

            public static /* synthetic */ Suitability copy$default(Suitability suitability, ValidateOrderSuitabilityDetailsDto validateOrderSuitabilityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderSuitabilityDetailsDto = suitability.value;
                }
                return suitability.copy(validateOrderSuitabilityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderSuitabilityDetailsDto getValue() {
                return this.value;
            }

            public final Suitability copy(ValidateOrderSuitabilityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Suitability(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Suitability) && Intrinsics.areEqual(this.value, ((Suitability) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Suitability(value=" + this.value + ")";
            }

            public final ValidateOrderSuitabilityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Suitability(ValidateOrderSuitabilityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InvalidTick;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidTickDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvalidTick extends DetailsDto {
            private final ValidateOrderInvalidTickDetailsDto value;

            public static /* synthetic */ InvalidTick copy$default(InvalidTick invalidTick, ValidateOrderInvalidTickDetailsDto validateOrderInvalidTickDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInvalidTickDetailsDto = invalidTick.value;
                }
                return invalidTick.copy(validateOrderInvalidTickDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInvalidTickDetailsDto getValue() {
                return this.value;
            }

            public final InvalidTick copy(ValidateOrderInvalidTickDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InvalidTick(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvalidTick) && Intrinsics.areEqual(this.value, ((InvalidTick) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvalidTick(value=" + this.value + ")";
            }

            public final ValidateOrderInvalidTickDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidTick(ValidateOrderInvalidTickDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MissingPrice;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderMissingPriceDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MissingPrice extends DetailsDto {
            private final ValidateOrderMissingPriceDetailsDto value;

            public static /* synthetic */ MissingPrice copy$default(MissingPrice missingPrice, ValidateOrderMissingPriceDetailsDto validateOrderMissingPriceDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderMissingPriceDetailsDto = missingPrice.value;
                }
                return missingPrice.copy(validateOrderMissingPriceDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderMissingPriceDetailsDto getValue() {
                return this.value;
            }

            public final MissingPrice copy(ValidateOrderMissingPriceDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MissingPrice(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MissingPrice) && Intrinsics.areEqual(this.value, ((MissingPrice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MissingPrice(value=" + this.value + ")";
            }

            public final ValidateOrderMissingPriceDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingPrice(ValidateOrderMissingPriceDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NonpositiveQuantity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderNonpositiveQuantityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NonpositiveQuantity extends DetailsDto {
            private final ValidateOrderNonpositiveQuantityDetailsDto value;

            public static /* synthetic */ NonpositiveQuantity copy$default(NonpositiveQuantity nonpositiveQuantity, ValidateOrderNonpositiveQuantityDetailsDto validateOrderNonpositiveQuantityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderNonpositiveQuantityDetailsDto = nonpositiveQuantity.value;
                }
                return nonpositiveQuantity.copy(validateOrderNonpositiveQuantityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderNonpositiveQuantityDetailsDto getValue() {
                return this.value;
            }

            public final NonpositiveQuantity copy(ValidateOrderNonpositiveQuantityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NonpositiveQuantity(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NonpositiveQuantity) && Intrinsics.areEqual(this.value, ((NonpositiveQuantity) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NonpositiveQuantity(value=" + this.value + ")";
            }

            public final ValidateOrderNonpositiveQuantityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NonpositiveQuantity(ValidateOrderNonpositiveQuantityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MaxOrderQuantity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxOrderQuantityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MaxOrderQuantity extends DetailsDto {
            private final ValidateOrderMaxOrderQuantityDetailsDto value;

            public static /* synthetic */ MaxOrderQuantity copy$default(MaxOrderQuantity maxOrderQuantity, ValidateOrderMaxOrderQuantityDetailsDto validateOrderMaxOrderQuantityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderMaxOrderQuantityDetailsDto = maxOrderQuantity.value;
                }
                return maxOrderQuantity.copy(validateOrderMaxOrderQuantityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderMaxOrderQuantityDetailsDto getValue() {
                return this.value;
            }

            public final MaxOrderQuantity copy(ValidateOrderMaxOrderQuantityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MaxOrderQuantity(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MaxOrderQuantity) && Intrinsics.areEqual(this.value, ((MaxOrderQuantity) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MaxOrderQuantity(value=" + this.value + ")";
            }

            public final ValidateOrderMaxOrderQuantityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MaxOrderQuantity(ValidateOrderMaxOrderQuantityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$GtcMarketOrder;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderGTCMarketOrderDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class GtcMarketOrder extends DetailsDto {
            private final ValidateOrderGTCMarketOrderDetailsDto value;

            public static /* synthetic */ GtcMarketOrder copy$default(GtcMarketOrder gtcMarketOrder, ValidateOrderGTCMarketOrderDetailsDto validateOrderGTCMarketOrderDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderGTCMarketOrderDetailsDto = gtcMarketOrder.value;
                }
                return gtcMarketOrder.copy(validateOrderGTCMarketOrderDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderGTCMarketOrderDetailsDto getValue() {
                return this.value;
            }

            public final GtcMarketOrder copy(ValidateOrderGTCMarketOrderDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new GtcMarketOrder(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof GtcMarketOrder) && Intrinsics.areEqual(this.value, ((GtcMarketOrder) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "GtcMarketOrder(value=" + this.value + ")";
            }

            public final ValidateOrderGTCMarketOrderDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public GtcMarketOrder(ValidateOrderGTCMarketOrderDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Tradability;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderTradabilityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Tradability extends DetailsDto {
            private final ValidateOrderTradabilityDetailsDto value;

            public static /* synthetic */ Tradability copy$default(Tradability tradability, ValidateOrderTradabilityDetailsDto validateOrderTradabilityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderTradabilityDetailsDto = tradability.value;
                }
                return tradability.copy(validateOrderTradabilityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderTradabilityDetailsDto getValue() {
                return this.value;
            }

            public final Tradability copy(ValidateOrderTradabilityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Tradability(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Tradability) && Intrinsics.areEqual(this.value, ((Tradability) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Tradability(value=" + this.value + ")";
            }

            public final ValidateOrderTradabilityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Tradability(ValidateOrderTradabilityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$AccountPco;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderAccountPCODetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class AccountPco extends DetailsDto {
            private final ValidateOrderAccountPCODetailsDto value;

            public static /* synthetic */ AccountPco copy$default(AccountPco accountPco, ValidateOrderAccountPCODetailsDto validateOrderAccountPCODetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderAccountPCODetailsDto = accountPco.value;
                }
                return accountPco.copy(validateOrderAccountPCODetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderAccountPCODetailsDto getValue() {
                return this.value;
            }

            public final AccountPco copy(ValidateOrderAccountPCODetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new AccountPco(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof AccountPco) && Intrinsics.areEqual(this.value, ((AccountPco) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "AccountPco(value=" + this.value + ")";
            }

            public final ValidateOrderAccountPCODetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountPco(ValidateOrderAccountPCODetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InstrumentPco;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInstrumentPCODetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InstrumentPco extends DetailsDto {
            private final ValidateOrderInstrumentPCODetailsDto value;

            public static /* synthetic */ InstrumentPco copy$default(InstrumentPco instrumentPco, ValidateOrderInstrumentPCODetailsDto validateOrderInstrumentPCODetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInstrumentPCODetailsDto = instrumentPco.value;
                }
                return instrumentPco.copy(validateOrderInstrumentPCODetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInstrumentPCODetailsDto getValue() {
                return this.value;
            }

            public final InstrumentPco copy(ValidateOrderInstrumentPCODetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InstrumentPco(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InstrumentPco) && Intrinsics.areEqual(this.value, ((InstrumentPco) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InstrumentPco(value=" + this.value + ")";
            }

            public final ValidateOrderInstrumentPCODetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstrumentPco(ValidateOrderInstrumentPCODetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MaxPosition;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderMaxPositionDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MaxPosition extends DetailsDto {
            private final ValidateOrderMaxPositionDetailsDto value;

            public static /* synthetic */ MaxPosition copy$default(MaxPosition maxPosition, ValidateOrderMaxPositionDetailsDto validateOrderMaxPositionDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderMaxPositionDetailsDto = maxPosition.value;
                }
                return maxPosition.copy(validateOrderMaxPositionDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderMaxPositionDetailsDto getValue() {
                return this.value;
            }

            public final MaxPosition copy(ValidateOrderMaxPositionDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MaxPosition(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MaxPosition) && Intrinsics.areEqual(this.value, ((MaxPosition) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MaxPosition(value=" + this.value + ")";
            }

            public final ValidateOrderMaxPositionDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MaxPosition(ValidateOrderMaxPositionDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$MarginMinEquity;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderMarginMinEquityDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class MarginMinEquity extends DetailsDto {
            private final ValidateOrderMarginMinEquityDetailsDto value;

            public static /* synthetic */ MarginMinEquity copy$default(MarginMinEquity marginMinEquity, ValidateOrderMarginMinEquityDetailsDto validateOrderMarginMinEquityDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderMarginMinEquityDetailsDto = marginMinEquity.value;
                }
                return marginMinEquity.copy(validateOrderMarginMinEquityDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderMarginMinEquityDetailsDto getValue() {
                return this.value;
            }

            public final MarginMinEquity copy(ValidateOrderMarginMinEquityDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new MarginMinEquity(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof MarginMinEquity) && Intrinsics.areEqual(this.value, ((MarginMinEquity) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "MarginMinEquity(value=" + this.value + ")";
            }

            public final ValidateOrderMarginMinEquityDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MarginMinEquity(ValidateOrderMarginMinEquityDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NoShorts;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderNoShortsDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoShorts extends DetailsDto {
            private final ValidateOrderNoShortsDetailsDto value;

            public static /* synthetic */ NoShorts copy$default(NoShorts noShorts, ValidateOrderNoShortsDetailsDto validateOrderNoShortsDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderNoShortsDetailsDto = noShorts.value;
                }
                return noShorts.copy(validateOrderNoShortsDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderNoShortsDetailsDto getValue() {
                return this.value;
            }

            public final NoShorts copy(ValidateOrderNoShortsDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NoShorts(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoShorts) && Intrinsics.areEqual(this.value, ((NoShorts) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NoShorts(value=" + this.value + ")";
            }

            public final ValidateOrderNoShortsDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoShorts(ValidateOrderNoShortsDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InstantFraud;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInstantFraudDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InstantFraud extends DetailsDto {
            private final ValidateOrderInstantFraudDetailsDto value;

            public static /* synthetic */ InstantFraud copy$default(InstantFraud instantFraud, ValidateOrderInstantFraudDetailsDto validateOrderInstantFraudDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInstantFraudDetailsDto = instantFraud.value;
                }
                return instantFraud.copy(validateOrderInstantFraudDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInstantFraudDetailsDto getValue() {
                return this.value;
            }

            public final InstantFraud copy(ValidateOrderInstantFraudDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InstantFraud(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InstantFraud) && Intrinsics.areEqual(this.value, ((InstantFraud) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InstantFraud(value=" + this.value + ")";
            }

            public final ValidateOrderInstantFraudDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InstantFraud(ValidateOrderInstantFraudDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$SenderLocation;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderSenderLocationDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class SenderLocation extends DetailsDto {
            private final ValidateOrderSenderLocationDetailsDto value;

            public static /* synthetic */ SenderLocation copy$default(SenderLocation senderLocation, ValidateOrderSenderLocationDetailsDto validateOrderSenderLocationDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderSenderLocationDetailsDto = senderLocation.value;
                }
                return senderLocation.copy(validateOrderSenderLocationDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderSenderLocationDetailsDto getValue() {
                return this.value;
            }

            public final SenderLocation copy(ValidateOrderSenderLocationDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new SenderLocation(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SenderLocation) && Intrinsics.areEqual(this.value, ((SenderLocation) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "SenderLocation(value=" + this.value + ")";
            }

            public final ValidateOrderSenderLocationDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public SenderLocation(ValidateOrderSenderLocationDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$UneconomicalPrice;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderUneconomicalPriceDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UneconomicalPrice extends DetailsDto {
            private final ValidateOrderUneconomicalPriceDetailsDto value;

            public static /* synthetic */ UneconomicalPrice copy$default(UneconomicalPrice uneconomicalPrice, ValidateOrderUneconomicalPriceDetailsDto validateOrderUneconomicalPriceDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderUneconomicalPriceDetailsDto = uneconomicalPrice.value;
                }
                return uneconomicalPrice.copy(validateOrderUneconomicalPriceDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderUneconomicalPriceDetailsDto getValue() {
                return this.value;
            }

            public final UneconomicalPrice copy(ValidateOrderUneconomicalPriceDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new UneconomicalPrice(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof UneconomicalPrice) && Intrinsics.areEqual(this.value, ((UneconomicalPrice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "UneconomicalPrice(value=" + this.value + ")";
            }

            public final ValidateOrderUneconomicalPriceDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public UneconomicalPrice(ValidateOrderUneconomicalPriceDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$NoReversals;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderNoReversalsDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class NoReversals extends DetailsDto {
            private final ValidateOrderNoReversalsDetailsDto value;

            public static /* synthetic */ NoReversals copy$default(NoReversals noReversals, ValidateOrderNoReversalsDetailsDto validateOrderNoReversalsDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderNoReversalsDetailsDto = noReversals.value;
                }
                return noReversals.copy(validateOrderNoReversalsDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderNoReversalsDetailsDto getValue() {
                return this.value;
            }

            public final NoReversals copy(ValidateOrderNoReversalsDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new NoReversals(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof NoReversals) && Intrinsics.areEqual(this.value, ((NoReversals) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "NoReversals(value=" + this.value + ")";
            }

            public final ValidateOrderNoReversalsDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public NoReversals(ValidateOrderNoReversalsDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$InvalidPrice;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderInvalidPriceDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class InvalidPrice extends DetailsDto {
            private final ValidateOrderInvalidPriceDetailsDto value;

            public static /* synthetic */ InvalidPrice copy$default(InvalidPrice invalidPrice, ValidateOrderInvalidPriceDetailsDto validateOrderInvalidPriceDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderInvalidPriceDetailsDto = invalidPrice.value;
                }
                return invalidPrice.copy(validateOrderInvalidPriceDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderInvalidPriceDetailsDto getValue() {
                return this.value;
            }

            public final InvalidPrice copy(ValidateOrderInvalidPriceDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new InvalidPrice(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof InvalidPrice) && Intrinsics.areEqual(this.value, ((InvalidPrice) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "InvalidPrice(value=" + this.value + ")";
            }

            public final ValidateOrderInvalidPriceDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public InvalidPrice(ValidateOrderInvalidPriceDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Generic;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "value", "Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "<init>", "(Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;)V", "getValue", "()Lcom/robinhood/ceres/v1/ValidateOrderGenericDetailsDto;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class Generic extends DetailsDto {
            private final ValidateOrderGenericDetailsDto value;

            public static /* synthetic */ Generic copy$default(Generic generic, ValidateOrderGenericDetailsDto validateOrderGenericDetailsDto, int i, Object obj) {
                if ((i & 1) != 0) {
                    validateOrderGenericDetailsDto = generic.value;
                }
                return generic.copy(validateOrderGenericDetailsDto);
            }

            /* renamed from: component1, reason: from getter */
            public final ValidateOrderGenericDetailsDto getValue() {
                return this.value;
            }

            public final Generic copy(ValidateOrderGenericDetailsDto value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return new Generic(value);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Generic) && Intrinsics.areEqual(this.value, ((Generic) other).value);
            }

            public int hashCode() {
                return this.value.hashCode();
            }

            public String toString() {
                return "Generic(value=" + this.value + ")";
            }

            public final ValidateOrderGenericDetailsDto getValue() {
                return this.value;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Generic(ValidateOrderGenericDetailsDto value) {
                super(null);
                Intrinsics.checkNotNullParameter(value, "value");
                this.value = value;
            }
        }

        /* compiled from: ValidateOrderResponseDto.kt */
        @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0003H\u0016R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto$Companion;", "Lcom/robinhood/idl/OneOfDto$Creator;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$DetailsDto;", "Lcom/robinhood/ceres/v1/ValidateOrderResponse;", "<init>", "()V", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "fromProto", "proto", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto4.Creator<DetailsDto, ValidateOrderResponse> {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @Override // com.robinhood.idl.Dto.Creator
            public Void getZeroValue() {
                return Dto4.Creator.DefaultImpls.getZeroValue(this);
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ValidateOrderResponse> getProtoAdapter() {
                return ValidateOrderResponse.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public DetailsDto fromProto(ValidateOrderResponse proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                if (proto.getSuccess() != null) {
                    return new Success(ValidateOrderSuccessDetailsDto.INSTANCE.fromProto(proto.getSuccess()));
                }
                if (proto.getInsufficient_bp() != null) {
                    return new InsufficientBp(ValidateOrderInsufficientBPDetailsDto.INSTANCE.fromProto(proto.getInsufficient_bp()));
                }
                if (proto.getInsufficient_account_value() != null) {
                    return new InsufficientAccountValue(ValidateOrderInsufficientAccountValueDetailsDto.INSTANCE.fromProto(proto.getInsufficient_account_value()));
                }
                if (proto.getSuitability() != null) {
                    return new Suitability(ValidateOrderSuitabilityDetailsDto.INSTANCE.fromProto(proto.getSuitability()));
                }
                if (proto.getInvalid_tick() != null) {
                    return new InvalidTick(ValidateOrderInvalidTickDetailsDto.INSTANCE.fromProto(proto.getInvalid_tick()));
                }
                if (proto.getMissing_price() != null) {
                    return new MissingPrice(ValidateOrderMissingPriceDetailsDto.INSTANCE.fromProto(proto.getMissing_price()));
                }
                if (proto.getNonpositive_quantity() != null) {
                    return new NonpositiveQuantity(ValidateOrderNonpositiveQuantityDetailsDto.INSTANCE.fromProto(proto.getNonpositive_quantity()));
                }
                if (proto.getMax_order_quantity() != null) {
                    return new MaxOrderQuantity(ValidateOrderMaxOrderQuantityDetailsDto.INSTANCE.fromProto(proto.getMax_order_quantity()));
                }
                if (proto.getGtc_market_order() != null) {
                    return new GtcMarketOrder(ValidateOrderGTCMarketOrderDetailsDto.INSTANCE.fromProto(proto.getGtc_market_order()));
                }
                if (proto.getTradability() != null) {
                    return new Tradability(ValidateOrderTradabilityDetailsDto.INSTANCE.fromProto(proto.getTradability()));
                }
                if (proto.getAccount_pco() != null) {
                    return new AccountPco(ValidateOrderAccountPCODetailsDto.INSTANCE.fromProto(proto.getAccount_pco()));
                }
                if (proto.getInstrument_pco() != null) {
                    return new InstrumentPco(ValidateOrderInstrumentPCODetailsDto.INSTANCE.fromProto(proto.getInstrument_pco()));
                }
                if (proto.getMax_position() != null) {
                    return new MaxPosition(ValidateOrderMaxPositionDetailsDto.INSTANCE.fromProto(proto.getMax_position()));
                }
                if (proto.getMargin_min_equity() != null) {
                    return new MarginMinEquity(ValidateOrderMarginMinEquityDetailsDto.INSTANCE.fromProto(proto.getMargin_min_equity()));
                }
                if (proto.getNo_shorts() != null) {
                    return new NoShorts(ValidateOrderNoShortsDetailsDto.INSTANCE.fromProto(proto.getNo_shorts()));
                }
                if (proto.getInstant_fraud() != null) {
                    return new InstantFraud(ValidateOrderInstantFraudDetailsDto.INSTANCE.fromProto(proto.getInstant_fraud()));
                }
                if (proto.getSender_location() != null) {
                    return new SenderLocation(ValidateOrderSenderLocationDetailsDto.INSTANCE.fromProto(proto.getSender_location()));
                }
                if (proto.getUneconomical_price() != null) {
                    return new UneconomicalPrice(ValidateOrderUneconomicalPriceDetailsDto.INSTANCE.fromProto(proto.getUneconomical_price()));
                }
                if (proto.getNo_reversals() != null) {
                    return new NoReversals(ValidateOrderNoReversalsDetailsDto.INSTANCE.fromProto(proto.getNo_reversals()));
                }
                if (proto.getInvalid_price() != null) {
                    return new InvalidPrice(ValidateOrderInvalidPriceDetailsDto.INSTANCE.fromProto(proto.getInvalid_price()));
                }
                if (proto.getGeneric() != null) {
                    return new Generic(ValidateOrderGenericDetailsDto.INSTANCE.fromProto(proto.getGeneric()));
                }
                return null;
            }
        }
    }

    /* compiled from: ValidateOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateOrderResponseDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/ceres.service.ValidateOrderResponse", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateOrderResponseDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ValidateOrderResponseDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ValidateOrderResponseDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), (DefaultConstructorMarker) null);
        }
    }

    /* compiled from: ValidateOrderResponseDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResponseDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4189_5)
        public final String provideIntoMap() {
            return "com.robinhood.ceres.v1.ValidateOrderResponseDto";
        }
    }
}
