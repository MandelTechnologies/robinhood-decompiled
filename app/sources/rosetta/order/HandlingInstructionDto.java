package rosetta.order;

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
/* compiled from: HandlingInstructionDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002!\"B\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lrosetta/order/HandlingInstructionDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/HandlingInstruction;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "HANDLING_INSTRUCTION_UNSPECIFIED", "HANDLING_INSTRUCTION_NOT_HELD", "HANDLING_INSTRUCTION_COLLARED", "HANDLING_INSTRUCTION_HELD", "HANDLING_INSTRUCTION_VWAP", "HANDLING_INSTRUCTION_GF5", "HANDLING_INSTRUCTION_ROUTE_NOT_HELD", "HANDLING_INSTRUCTION_REGION_US", "HANDLING_INSTRUCTION_REGION_EU", "HANDLING_INSTRUCTION_NO_PFOF", "HANDLING_INSTRUCTION_INVENTORY_RHUK", "HANDLING_INSTRUCTION_FRACTIONAL", "HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP", "HANDLING_INSTRUCTION_INVENTORY_RHSG", "HANDLING_INSTRUCTION_MAKE_OR_CANCEL", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class HandlingInstructionDto implements Dto2<HandlingInstruction>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ HandlingInstructionDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<HandlingInstructionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<HandlingInstructionDto, HandlingInstruction>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_UNSPECIFIED = new HandlingInstructionDto("HANDLING_INSTRUCTION_UNSPECIFIED", 0) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_UNSPECIFIED;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_NOT_HELD = new HandlingInstructionDto("HANDLING_INSTRUCTION_NOT_HELD", 1) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_NOT_HELD
        {
            String str = "not_held";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_NOT_HELD;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_COLLARED = new HandlingInstructionDto("HANDLING_INSTRUCTION_COLLARED", 2) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_COLLARED
        {
            String str = "collared";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_COLLARED;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_HELD = new HandlingInstructionDto("HANDLING_INSTRUCTION_HELD", 3) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_HELD
        {
            String str = "held";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_HELD;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_VWAP = new HandlingInstructionDto("HANDLING_INSTRUCTION_VWAP", 4) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_VWAP
        {
            String str = "vwap";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_VWAP;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_GF5 = new HandlingInstructionDto("HANDLING_INSTRUCTION_GF5", 5) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_GF5
        {
            String str = "gf5";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_GF5;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_ROUTE_NOT_HELD = new HandlingInstructionDto("HANDLING_INSTRUCTION_ROUTE_NOT_HELD", 6) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_ROUTE_NOT_HELD
        {
            String str = "route_not_held";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_ROUTE_NOT_HELD;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_REGION_US = new HandlingInstructionDto("HANDLING_INSTRUCTION_REGION_US", 7) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_REGION_US
        {
            String str = "region_us";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_REGION_US;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_REGION_EU = new HandlingInstructionDto("HANDLING_INSTRUCTION_REGION_EU", 8) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_REGION_EU
        {
            String str = "region_eu";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_REGION_EU;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_NO_PFOF = new HandlingInstructionDto("HANDLING_INSTRUCTION_NO_PFOF", 9) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_NO_PFOF
        {
            String str = "no_pfof";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_NO_PFOF;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_INVENTORY_RHUK = new HandlingInstructionDto("HANDLING_INSTRUCTION_INVENTORY_RHUK", 10) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_INVENTORY_RHUK
        {
            String str = "inventory_rhuk";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHUK;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_FRACTIONAL = new HandlingInstructionDto("HANDLING_INSTRUCTION_FRACTIONAL", 11) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_FRACTIONAL
        {
            String str = "fractional";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP = new HandlingInstructionDto("HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP", 12) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP
        {
            String str = "fractional_roundup";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_INVENTORY_RHSG = new HandlingInstructionDto("HANDLING_INSTRUCTION_INVENTORY_RHSG", 13) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_INVENTORY_RHSG
        {
            String str = "inventory_rhsg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHSG;
        }
    };
    public static final HandlingInstructionDto HANDLING_INSTRUCTION_MAKE_OR_CANCEL = new HandlingInstructionDto("HANDLING_INSTRUCTION_MAKE_OR_CANCEL", 14) { // from class: rosetta.order.HandlingInstructionDto.HANDLING_INSTRUCTION_MAKE_OR_CANCEL
        {
            String str = "make_or_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public HandlingInstruction toProto() {
            return HandlingInstruction.HANDLING_INSTRUCTION_MAKE_OR_CANCEL;
        }
    };

    private static final /* synthetic */ HandlingInstructionDto[] $values() {
        return new HandlingInstructionDto[]{HANDLING_INSTRUCTION_UNSPECIFIED, HANDLING_INSTRUCTION_NOT_HELD, HANDLING_INSTRUCTION_COLLARED, HANDLING_INSTRUCTION_HELD, HANDLING_INSTRUCTION_VWAP, HANDLING_INSTRUCTION_GF5, HANDLING_INSTRUCTION_ROUTE_NOT_HELD, HANDLING_INSTRUCTION_REGION_US, HANDLING_INSTRUCTION_REGION_EU, HANDLING_INSTRUCTION_NO_PFOF, HANDLING_INSTRUCTION_INVENTORY_RHUK, HANDLING_INSTRUCTION_FRACTIONAL, HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP, HANDLING_INSTRUCTION_INVENTORY_RHSG, HANDLING_INSTRUCTION_MAKE_OR_CANCEL};
    }

    public /* synthetic */ HandlingInstructionDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<HandlingInstructionDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private HandlingInstructionDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        HandlingInstructionDto[] handlingInstructionDtoArr$values = $values();
        $VALUES = handlingInstructionDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(handlingInstructionDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.HandlingInstructionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return HandlingInstructionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: HandlingInstructionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/HandlingInstructionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/HandlingInstructionDto;", "Lrosetta/order/HandlingInstruction;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/HandlingInstructionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<HandlingInstructionDto, HandlingInstruction> {

        /* compiled from: HandlingInstructionDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HandlingInstruction.values().length];
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_NOT_HELD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_COLLARED.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_HELD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_VWAP.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_GF5.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_ROUTE_NOT_HELD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_REGION_US.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_REGION_EU.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_NO_PFOF.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHUK.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_INVENTORY_RHSG.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[HandlingInstruction.HANDLING_INSTRUCTION_MAKE_OR_CANCEL.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<HandlingInstructionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HandlingInstructionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<HandlingInstructionDto> getBinaryBase64Serializer() {
            return (KSerializer) HandlingInstructionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<HandlingInstruction> getProtoAdapter() {
            return HandlingInstruction.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HandlingInstructionDto getZeroValue() {
            return HandlingInstructionDto.HANDLING_INSTRUCTION_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public HandlingInstructionDto fromProto(HandlingInstruction proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_UNSPECIFIED;
                case 2:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_NOT_HELD;
                case 3:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_COLLARED;
                case 4:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_HELD;
                case 5:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_VWAP;
                case 6:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_GF5;
                case 7:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_ROUTE_NOT_HELD;
                case 8:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_REGION_US;
                case 9:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_REGION_EU;
                case 10:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_NO_PFOF;
                case 11:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_INVENTORY_RHUK;
                case 12:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_FRACTIONAL;
                case 13:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_FRACTIONAL_ROUNDUP;
                case 14:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_INVENTORY_RHSG;
                case 15:
                    return HandlingInstructionDto.HANDLING_INSTRUCTION_MAKE_OR_CANCEL;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: HandlingInstructionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/HandlingInstructionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/HandlingInstructionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<HandlingInstructionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<HandlingInstructionDto, HandlingInstruction> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.HandlingInstruction", HandlingInstructionDto.getEntries(), HandlingInstructionDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public HandlingInstructionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (HandlingInstructionDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, HandlingInstructionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static HandlingInstructionDto valueOf(String str) {
        return (HandlingInstructionDto) Enum.valueOf(HandlingInstructionDto.class, str);
    }

    public static HandlingInstructionDto[] values() {
        return (HandlingInstructionDto[]) $VALUES.clone();
    }
}
