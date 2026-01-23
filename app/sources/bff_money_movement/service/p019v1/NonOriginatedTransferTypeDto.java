package bff_money_movement.service.p019v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.cash.flat.cashback.p071ui.TrialRequest3;
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
/* compiled from: NonOriginatedTransferTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/NonOriginatedTransferType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_TYPE_UNSPECIFIED", "FAST", "WIRE", TrialRequest3.DD_CONTEXT, "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class NonOriginatedTransferTypeDto implements Dto2<NonOriginatedTransferType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NonOriginatedTransferTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<NonOriginatedTransferTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<NonOriginatedTransferTypeDto, NonOriginatedTransferType>> binaryBase64Serializer$delegate;
    public static final NonOriginatedTransferTypeDto TRANSFER_TYPE_UNSPECIFIED = new NonOriginatedTransferTypeDto("TRANSFER_TYPE_UNSPECIFIED", 0) { // from class: bff_money_movement.service.v1.NonOriginatedTransferTypeDto.TRANSFER_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public NonOriginatedTransferType toProto() {
            return NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED;
        }
    };
    public static final NonOriginatedTransferTypeDto FAST = new NonOriginatedTransferTypeDto("FAST", 1) { // from class: bff_money_movement.service.v1.NonOriginatedTransferTypeDto.FAST
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public NonOriginatedTransferType toProto() {
            return NonOriginatedTransferType.FAST;
        }
    };
    public static final NonOriginatedTransferTypeDto WIRE = new NonOriginatedTransferTypeDto("WIRE", 2) { // from class: bff_money_movement.service.v1.NonOriginatedTransferTypeDto.WIRE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public NonOriginatedTransferType toProto() {
            return NonOriginatedTransferType.WIRE;
        }
    };

    /* renamed from: DD */
    public static final NonOriginatedTransferTypeDto f314DD = new NonOriginatedTransferTypeDto(TrialRequest3.DD_CONTEXT, 3) { // from class: bff_money_movement.service.v1.NonOriginatedTransferTypeDto.DD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public NonOriginatedTransferType toProto() {
            return NonOriginatedTransferType.f313DD;
        }
    };

    private static final /* synthetic */ NonOriginatedTransferTypeDto[] $values() {
        return new NonOriginatedTransferTypeDto[]{TRANSFER_TYPE_UNSPECIFIED, FAST, WIRE, f314DD};
    }

    public /* synthetic */ NonOriginatedTransferTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<NonOriginatedTransferTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private NonOriginatedTransferTypeDto(String str, int i) {
    }

    static {
        NonOriginatedTransferTypeDto[] nonOriginatedTransferTypeDtoArr$values = $values();
        $VALUES = nonOriginatedTransferTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(nonOriginatedTransferTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.NonOriginatedTransferTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return NonOriginatedTransferTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: NonOriginatedTransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "Lbff_money_movement/service/v1/NonOriginatedTransferType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<NonOriginatedTransferTypeDto, NonOriginatedTransferType> {

        /* compiled from: NonOriginatedTransferTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NonOriginatedTransferType.values().length];
                try {
                    iArr[NonOriginatedTransferType.TRANSFER_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NonOriginatedTransferType.FAST.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[NonOriginatedTransferType.WIRE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[NonOriginatedTransferType.f313DD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<NonOriginatedTransferTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NonOriginatedTransferTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<NonOriginatedTransferTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) NonOriginatedTransferTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<NonOriginatedTransferType> getProtoAdapter() {
            return NonOriginatedTransferType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NonOriginatedTransferTypeDto getZeroValue() {
            return NonOriginatedTransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public NonOriginatedTransferTypeDto fromProto(NonOriginatedTransferType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return NonOriginatedTransferTypeDto.TRANSFER_TYPE_UNSPECIFIED;
            }
            if (i == 2) {
                return NonOriginatedTransferTypeDto.FAST;
            }
            if (i == 3) {
                return NonOriginatedTransferTypeDto.WIRE;
            }
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return NonOriginatedTransferTypeDto.f314DD;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: NonOriginatedTransferTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/NonOriginatedTransferTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<NonOriginatedTransferTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<NonOriginatedTransferTypeDto, NonOriginatedTransferType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.NonOriginatedTransferType", NonOriginatedTransferTypeDto.getEntries(), NonOriginatedTransferTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public NonOriginatedTransferTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (NonOriginatedTransferTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, NonOriginatedTransferTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static NonOriginatedTransferTypeDto valueOf(String str) {
        return (NonOriginatedTransferTypeDto) Enum.valueOf(NonOriginatedTransferTypeDto.class, str);
    }

    public static NonOriginatedTransferTypeDto[] values() {
        return (NonOriginatedTransferTypeDto[]) $VALUES.clone();
    }
}
