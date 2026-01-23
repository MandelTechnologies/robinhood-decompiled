package cashier_protos.payment_hub.p046v1;

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
/* compiled from: FXTransferStateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001b2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001b\u001cB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u001d"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcashier_protos/payment_hub/v1/FXTransferState;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "FX_TRANSFER_STATE_UNSPECIFIED", "FX_TRANSFER_STATE_NEW", "FX_TRANSFER_STATE_READY", "FX_TRANSFER_STATE_PENDING", "FX_TRANSFER_STATE_CONFIRMED", "FX_TRANSFER_STATE_SETTLED", "FX_TRANSFER_STATE_FAILED", "FX_TRANSFER_STATE_PAUSED", "FX_TRANSFER_STATE_PENDING_FX_REQ", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes.dex */
public abstract class FXTransferStateDto implements Dto2<FXTransferState>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FXTransferStateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<FXTransferStateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<FXTransferStateDto, FXTransferState>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final FXTransferStateDto FX_TRANSFER_STATE_UNSPECIFIED = new FXTransferStateDto("FX_TRANSFER_STATE_UNSPECIFIED", 0) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_NEW = new FXTransferStateDto("FX_TRANSFER_STATE_NEW", 1) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_NEW
        {
            String str = "new";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_NEW;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_READY = new FXTransferStateDto("FX_TRANSFER_STATE_READY", 2) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_READY
        {
            String str = "ready";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_READY;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_PENDING = new FXTransferStateDto("FX_TRANSFER_STATE_PENDING", 3) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_PENDING
        {
            String str = "pending";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_PENDING;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_CONFIRMED = new FXTransferStateDto("FX_TRANSFER_STATE_CONFIRMED", 4) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_CONFIRMED
        {
            String str = "confirmed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_CONFIRMED;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_SETTLED = new FXTransferStateDto("FX_TRANSFER_STATE_SETTLED", 5) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_SETTLED
        {
            String str = "settled";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_SETTLED;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_FAILED = new FXTransferStateDto("FX_TRANSFER_STATE_FAILED", 6) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_FAILED
        {
            String str = "failed";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_FAILED;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_PAUSED = new FXTransferStateDto("FX_TRANSFER_STATE_PAUSED", 7) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_PAUSED
        {
            String str = "paused";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_PAUSED;
        }
    };
    public static final FXTransferStateDto FX_TRANSFER_STATE_PENDING_FX_REQ = new FXTransferStateDto("FX_TRANSFER_STATE_PENDING_FX_REQ", 8) { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto.FX_TRANSFER_STATE_PENDING_FX_REQ
        {
            String str = "pending_fx_req";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public FXTransferState toProto() {
            return FXTransferState.FX_TRANSFER_STATE_PENDING_FX_REQ;
        }
    };

    private static final /* synthetic */ FXTransferStateDto[] $values() {
        return new FXTransferStateDto[]{FX_TRANSFER_STATE_UNSPECIFIED, FX_TRANSFER_STATE_NEW, FX_TRANSFER_STATE_READY, FX_TRANSFER_STATE_PENDING, FX_TRANSFER_STATE_CONFIRMED, FX_TRANSFER_STATE_SETTLED, FX_TRANSFER_STATE_FAILED, FX_TRANSFER_STATE_PAUSED, FX_TRANSFER_STATE_PENDING_FX_REQ};
    }

    public /* synthetic */ FXTransferStateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<FXTransferStateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private FXTransferStateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        FXTransferStateDto[] fXTransferStateDtoArr$values = $values();
        $VALUES = fXTransferStateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fXTransferStateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: cashier_protos.payment_hub.v1.FXTransferStateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return FXTransferStateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: FXTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "Lcashier_protos/payment_hub/v1/FXTransferState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<FXTransferStateDto, FXTransferState> {

        /* compiled from: FXTransferStateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes16.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[FXTransferState.values().length];
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_NEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_READY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_PENDING.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_CONFIRMED.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_SETTLED.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_FAILED.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_PAUSED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[FXTransferState.FX_TRANSFER_STATE_PENDING_FX_REQ.ordinal()] = 9;
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

        public final KSerializer<FXTransferStateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferStateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<FXTransferStateDto> getBinaryBase64Serializer() {
            return (KSerializer) FXTransferStateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<FXTransferState> getProtoAdapter() {
            return FXTransferState.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferStateDto getZeroValue() {
            return FXTransferStateDto.FX_TRANSFER_STATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public FXTransferStateDto fromProto(FXTransferState proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return FXTransferStateDto.FX_TRANSFER_STATE_UNSPECIFIED;
                case 2:
                    return FXTransferStateDto.FX_TRANSFER_STATE_NEW;
                case 3:
                    return FXTransferStateDto.FX_TRANSFER_STATE_READY;
                case 4:
                    return FXTransferStateDto.FX_TRANSFER_STATE_PENDING;
                case 5:
                    return FXTransferStateDto.FX_TRANSFER_STATE_CONFIRMED;
                case 6:
                    return FXTransferStateDto.FX_TRANSFER_STATE_SETTLED;
                case 7:
                    return FXTransferStateDto.FX_TRANSFER_STATE_FAILED;
                case 8:
                    return FXTransferStateDto.FX_TRANSFER_STATE_PAUSED;
                case 9:
                    return FXTransferStateDto.FX_TRANSFER_STATE_PENDING_FX_REQ;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: FXTransferStateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcashier_protos/payment_hub/v1/FXTransferStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcashier_protos/payment_hub/v1/FXTransferStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "cashier_protos.payment_hub.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes16.dex */
    public static final class Serializer implements KSerializer<FXTransferStateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<FXTransferStateDto, FXTransferState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/cashier_protos.payment_hub.v1.FXTransferState", FXTransferStateDto.getEntries(), FXTransferStateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public FXTransferStateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (FXTransferStateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, FXTransferStateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static FXTransferStateDto valueOf(String str) {
        return (FXTransferStateDto) Enum.valueOf(FXTransferStateDto.class, str);
    }

    public static FXTransferStateDto[] values() {
        return (FXTransferStateDto[]) $VALUES.clone();
    }
}
