package bff_money_movement.service.p019v1;

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
/* compiled from: TransferActionTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferActionTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbff_money_movement/service/v1/TransferActionType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "TRANSFER_ACTION_TYPE_UNSPECIFIED", "TRANSFER_ACTION_TYPE_DISMISS", "TRANSFER_ACTION_TYPE_CONTINUE", "TRANSFER_ACTION_TYPE_EDIT_AMOUNT", "TRANSFER_ACTION_TYPE_DEEPLINK", "TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE", "TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB", "TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class TransferActionTypeDto implements Dto2<TransferActionType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TransferActionTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<TransferActionTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<TransferActionTypeDto, TransferActionType>> binaryBase64Serializer$delegate;
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_UNSPECIFIED = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_UNSPECIFIED", 0) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_DISMISS = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_DISMISS", 1) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_DISMISS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_DISMISS;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_CONTINUE = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_CONTINUE", 2) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_CONTINUE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_CONTINUE;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_EDIT_AMOUNT = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_EDIT_AMOUNT", 3) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_EDIT_AMOUNT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_EDIT_AMOUNT;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_DEEPLINK = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_DEEPLINK", 4) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_DEEPLINK
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_DEEPLINK;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE", 5) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB", 6) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB;
        }
    };
    public static final TransferActionTypeDto TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE = new TransferActionTypeDto("TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE", 7) { // from class: bff_money_movement.service.v1.TransferActionTypeDto.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public TransferActionType toProto() {
            return TransferActionType.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE;
        }
    };

    private static final /* synthetic */ TransferActionTypeDto[] $values() {
        return new TransferActionTypeDto[]{TRANSFER_ACTION_TYPE_UNSPECIFIED, TRANSFER_ACTION_TYPE_DISMISS, TRANSFER_ACTION_TYPE_CONTINUE, TRANSFER_ACTION_TYPE_EDIT_AMOUNT, TRANSFER_ACTION_TYPE_DEEPLINK, TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE, TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB, TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE};
    }

    public /* synthetic */ TransferActionTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<TransferActionTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private TransferActionTypeDto(String str, int i) {
    }

    static {
        TransferActionTypeDto[] transferActionTypeDtoArr$values = $values();
        $VALUES = transferActionTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(transferActionTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bff_money_movement.service.v1.TransferActionTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return TransferActionTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: TransferActionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferActionTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbff_money_movement/service/v1/TransferActionTypeDto;", "Lbff_money_movement/service/v1/TransferActionType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbff_money_movement/service/v1/TransferActionTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<TransferActionTypeDto, TransferActionType> {

        /* compiled from: TransferActionTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TransferActionType.values().length];
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_DISMISS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_CONTINUE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_EDIT_AMOUNT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_DEEPLINK.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[TransferActionType.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TransferActionTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferActionTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<TransferActionTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) TransferActionTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<TransferActionType> getProtoAdapter() {
            return TransferActionType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferActionTypeDto getZeroValue() {
            return TransferActionTypeDto.TRANSFER_ACTION_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public TransferActionTypeDto fromProto(TransferActionType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_UNSPECIFIED;
                case 2:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_DISMISS;
                case 3:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_CONTINUE;
                case 4:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_EDIT_AMOUNT;
                case 5:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_DEEPLINK;
                case 6:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_SEND_INCOMING_WIRE;
                case 7:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_SHOW_LIMIT_HUB;
                case 8:
                    return TransferActionTypeDto.TRANSFER_ACTION_TYPE_WITHDRAW_FULL_BALANCE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: TransferActionTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbff_money_movement/service/v1/TransferActionTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbff_money_movement/service/v1/TransferActionTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<TransferActionTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<TransferActionTypeDto, TransferActionType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bff_money_movement.service.v1.TransferActionType", TransferActionTypeDto.getEntries(), TransferActionTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public TransferActionTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (TransferActionTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, TransferActionTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static TransferActionTypeDto valueOf(String str) {
        return (TransferActionTypeDto) Enum.valueOf(TransferActionTypeDto.class, str);
    }

    public static TransferActionTypeDto[] values() {
        return (TransferActionTypeDto[]) $VALUES.clone();
    }
}
