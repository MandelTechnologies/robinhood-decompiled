package com.robinhood.ceres.p284v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ValidateOrderResultDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002$%B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\b\u0010#\u001a\u00020\"H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006&"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/ValidateOrderResult;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "VALIDATE_ORDER_RESULT_UNSPECIFIED", "VALIDATE_ORDER_RESULT_SUCCESS", "VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP", "VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE", "VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY", "VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK", "VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY", "VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY", "VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER", "VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY", "VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO", "VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO", "VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION", "VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY", "VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS", "VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD", "VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION", "VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS", "VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE", "VALIDATE_ORDER_RESULT_FAILURE_OTHER", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class ValidateOrderResultDto implements Dto2<ValidateOrderResult>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ValidateOrderResultDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ValidateOrderResultDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ValidateOrderResultDto, ValidateOrderResult>> binaryBase64Serializer$delegate;
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_UNSPECIFIED = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_SUCCESS = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_SUCCESS", 1) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_SUCCESS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_SUCCESS;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP", 2) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE", 3) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY", 4) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK", 5) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE", 6) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY", 7) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY", 8) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER", 9) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY", 10) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO", 11) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO", 12) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION", 13) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY", 14) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS", 15) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD", 16) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION", 17) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE", 18) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS", 19) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE", 20) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE;
        }
    };
    public static final ValidateOrderResultDto VALIDATE_ORDER_RESULT_FAILURE_OTHER = new ValidateOrderResultDto("VALIDATE_ORDER_RESULT_FAILURE_OTHER", 21) { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_OTHER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ValidateOrderResult toProto() {
            return ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_OTHER;
        }
    };

    private static final /* synthetic */ ValidateOrderResultDto[] $values() {
        return new ValidateOrderResultDto[]{VALIDATE_ORDER_RESULT_UNSPECIFIED, VALIDATE_ORDER_RESULT_SUCCESS, VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP, VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE, VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY, VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK, VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE, VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY, VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY, VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER, VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY, VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO, VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO, VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION, VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY, VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS, VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD, VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION, VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE, VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS, VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE, VALIDATE_ORDER_RESULT_FAILURE_OTHER};
    }

    public /* synthetic */ ValidateOrderResultDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ValidateOrderResultDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ValidateOrderResultDto(String str, int i) {
    }

    static {
        ValidateOrderResultDto[] validateOrderResultDtoArr$values = $values();
        $VALUES = validateOrderResultDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(validateOrderResultDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.ValidateOrderResultDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ValidateOrderResultDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ValidateOrderResultDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResultDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "Lcom/robinhood/ceres/v1/ValidateOrderResult;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<ValidateOrderResultDto, ValidateOrderResult> {

        /* compiled from: ValidateOrderResultDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ValidateOrderResult.values().length];
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_SUCCESS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE.ordinal()] = 21;
                } catch (NoSuchFieldError unused21) {
                }
                try {
                    iArr[ValidateOrderResult.VALIDATE_ORDER_RESULT_FAILURE_OTHER.ordinal()] = 22;
                } catch (NoSuchFieldError unused22) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ValidateOrderResultDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderResultDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ValidateOrderResultDto> getBinaryBase64Serializer() {
            return (KSerializer) ValidateOrderResultDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ValidateOrderResult> getProtoAdapter() {
            return ValidateOrderResult.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderResultDto getZeroValue() {
            return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ValidateOrderResultDto fromProto(ValidateOrderResult proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_UNSPECIFIED;
                case 2:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_SUCCESS;
                case 3:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_BP;
                case 4:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSUFFICIENT_ACCOUNT_VALUE;
                case 5:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_SUITABILITY;
                case 6:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INVALID_TICK;
                case 7:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MISSING_PRICE;
                case 8:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NONPOSITIVE_QUANTITY;
                case 9:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MAX_ORDER_QUANTITY;
                case 10:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_GTC_MARKET_ORDER;
                case 11:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_TRADABILITY;
                case 12:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_ACCOUNT_PCO;
                case 13:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSTRUMENT_PCO;
                case 14:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MAX_POSITION;
                case 15:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_MARGIN_MIN_EQUITY;
                case 16:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NO_SHORTS;
                case 17:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INSTANT_FRAUD;
                case 18:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_SENDER_LOCATION;
                case 19:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_UNECONOMICAL_PRICE;
                case 20:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_NO_REVERSALS;
                case 21:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_INVALID_PRICE;
                case 22:
                    return ValidateOrderResultDto.VALIDATE_ORDER_RESULT_FAILURE_OTHER;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ValidateOrderResultDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ValidateOrderResultDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/ValidateOrderResultDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<ValidateOrderResultDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ValidateOrderResultDto, ValidateOrderResult> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.ValidateOrderResult", ValidateOrderResultDto.getEntries(), ValidateOrderResultDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ValidateOrderResultDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ValidateOrderResultDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ValidateOrderResultDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ValidateOrderResultDto valueOf(String str) {
        return (ValidateOrderResultDto) Enum.valueOf(ValidateOrderResultDto.class, str);
    }

    public static ValidateOrderResultDto[] values() {
        return (ValidateOrderResultDto[]) $VALUES.clone();
    }
}
