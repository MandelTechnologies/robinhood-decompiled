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
/* compiled from: S3URLRequestReasonDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0017\u0018B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/S3URLRequestReasonDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/ceres/v1/S3URLRequestReason;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "S3_URL_REQUEST_REASON_UNSPECIFIED", "S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION", "S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER", "S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS", "S3_URL_REQUEST_REASON_FUTURES_ORDERS", "S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES", "S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS", "S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS", "S3_URL_REQUEST_REASON_MARGIN_CALLS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes15.dex */
public abstract class S3URLRequestReasonDto implements Dto2<S3URLRequestReason>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ S3URLRequestReasonDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<S3URLRequestReasonDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<S3URLRequestReasonDto, S3URLRequestReason>> binaryBase64Serializer$delegate;
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_UNSPECIFIED = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_UNSPECIFIED", 0) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_UNSPECIFIED;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION", 1) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER", 2) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS", 3) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_FUTURES_ORDERS = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_FUTURES_ORDERS", 4) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_FUTURES_ORDERS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ORDERS;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES", 5) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS", 6) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS", 7) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS;
        }
    };
    public static final S3URLRequestReasonDto S3_URL_REQUEST_REASON_MARGIN_CALLS = new S3URLRequestReasonDto("S3_URL_REQUEST_REASON_MARGIN_CALLS", 8) { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto.S3_URL_REQUEST_REASON_MARGIN_CALLS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public S3URLRequestReason toProto() {
            return S3URLRequestReason.S3_URL_REQUEST_REASON_MARGIN_CALLS;
        }
    };

    private static final /* synthetic */ S3URLRequestReasonDto[] $values() {
        return new S3URLRequestReasonDto[]{S3_URL_REQUEST_REASON_UNSPECIFIED, S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION, S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER, S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS, S3_URL_REQUEST_REASON_FUTURES_ORDERS, S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES, S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS, S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS, S3_URL_REQUEST_REASON_MARGIN_CALLS};
    }

    public /* synthetic */ S3URLRequestReasonDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<S3URLRequestReasonDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private S3URLRequestReasonDto(String str, int i) {
    }

    static {
        S3URLRequestReasonDto[] s3URLRequestReasonDtoArr$values = $values();
        $VALUES = s3URLRequestReasonDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(s3URLRequestReasonDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.ceres.v1.S3URLRequestReasonDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return S3URLRequestReasonDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: S3URLRequestReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/ceres/v1/S3URLRequestReasonDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/ceres/v1/S3URLRequestReasonDto;", "Lcom/robinhood/ceres/v1/S3URLRequestReason;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/ceres/v1/S3URLRequestReasonDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<S3URLRequestReasonDto, S3URLRequestReason> {

        /* compiled from: S3URLRequestReasonDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[S3URLRequestReason.values().length];
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ORDERS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[S3URLRequestReason.S3_URL_REQUEST_REASON_MARGIN_CALLS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<S3URLRequestReasonDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<S3URLRequestReasonDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<S3URLRequestReasonDto> getBinaryBase64Serializer() {
            return (KSerializer) S3URLRequestReasonDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<S3URLRequestReason> getProtoAdapter() {
            return S3URLRequestReason.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public S3URLRequestReasonDto getZeroValue() {
            return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public S3URLRequestReasonDto fromProto(S3URLRequestReason proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_UNSPECIFIED;
                case 2:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_BULK_MANUAL_CASH_CORRECTION;
                case 3:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_BULK_INTER_ENTITY_CASH_TRANSFER;
                case 4:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_AGGREGATED_POSITIONS;
                case 5:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_FUTURES_ORDERS;
                case 6:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_FUTURES_ACTIVITIES;
                case 7:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_CASH_SETTLEMENT_EXECUTIONS;
                case 8:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_CONTRACT_AGGREGATED_POSITIONS;
                case 9:
                    return S3URLRequestReasonDto.S3_URL_REQUEST_REASON_MARGIN_CALLS;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: S3URLRequestReasonDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/ceres/v1/S3URLRequestReasonDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/ceres/v1/S3URLRequestReasonDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<S3URLRequestReasonDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<S3URLRequestReasonDto, S3URLRequestReason> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/ceres.entity.S3URLRequestReason", S3URLRequestReasonDto.getEntries(), S3URLRequestReasonDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public S3URLRequestReasonDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (S3URLRequestReasonDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, S3URLRequestReasonDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static S3URLRequestReasonDto valueOf(String str) {
        return (S3URLRequestReasonDto) Enum.valueOf(S3URLRequestReasonDto.class, str);
    }

    public static S3URLRequestReasonDto[] values() {
        return (S3URLRequestReasonDto[]) $VALUES.clone();
    }
}
