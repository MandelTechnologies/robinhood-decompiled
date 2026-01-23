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
/* compiled from: WaitingCategoryDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lrosetta/order/WaitingCategoryDto;", "Lcom/robinhood/idl/EnumDto;", "Lrosetta/order/WaitingCategory;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "WAITING_CATEGORY_UNSPECIFIED", "VENUE_REJECTION", "INSTRUMENT_IPO", "INSTRUMENT_OTC", "INTERNAL_ERROR", "INSTRUMENT_INTERNAL_HALT", "ALL_DAY_TRADING_SESSION_KILL_SWITCH", "MANUAL_BULK_ACTION", "REJECTION_CIRCUIT_BREAKER", "UNSOLICITED_CANCEL", "ADV_MAC_VIOLATION", "RULES_ENGINE_DROP_TO_REVIEW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class WaitingCategoryDto implements Dto2<WaitingCategory>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WaitingCategoryDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<WaitingCategoryDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<WaitingCategoryDto, WaitingCategory>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final WaitingCategoryDto WAITING_CATEGORY_UNSPECIFIED = new WaitingCategoryDto("WAITING_CATEGORY_UNSPECIFIED", 0) { // from class: rosetta.order.WaitingCategoryDto.WAITING_CATEGORY_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.WAITING_CATEGORY_UNSPECIFIED;
        }
    };
    public static final WaitingCategoryDto VENUE_REJECTION = new WaitingCategoryDto("VENUE_REJECTION", 1) { // from class: rosetta.order.WaitingCategoryDto.VENUE_REJECTION
        {
            String str = "venue_rejection";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.VENUE_REJECTION;
        }
    };
    public static final WaitingCategoryDto INSTRUMENT_IPO = new WaitingCategoryDto("INSTRUMENT_IPO", 2) { // from class: rosetta.order.WaitingCategoryDto.INSTRUMENT_IPO
        {
            String str = "instrument_ipo";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.INSTRUMENT_IPO;
        }
    };
    public static final WaitingCategoryDto INSTRUMENT_OTC = new WaitingCategoryDto("INSTRUMENT_OTC", 3) { // from class: rosetta.order.WaitingCategoryDto.INSTRUMENT_OTC
        {
            String str = "instrument_otc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.INSTRUMENT_OTC;
        }
    };
    public static final WaitingCategoryDto INTERNAL_ERROR = new WaitingCategoryDto("INTERNAL_ERROR", 4) { // from class: rosetta.order.WaitingCategoryDto.INTERNAL_ERROR
        {
            String str = "internal_error";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.INTERNAL_ERROR;
        }
    };
    public static final WaitingCategoryDto INSTRUMENT_INTERNAL_HALT = new WaitingCategoryDto("INSTRUMENT_INTERNAL_HALT", 5) { // from class: rosetta.order.WaitingCategoryDto.INSTRUMENT_INTERNAL_HALT
        {
            String str = "instrument_internal_halt";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.INSTRUMENT_INTERNAL_HALT;
        }
    };
    public static final WaitingCategoryDto ALL_DAY_TRADING_SESSION_KILL_SWITCH = new WaitingCategoryDto("ALL_DAY_TRADING_SESSION_KILL_SWITCH", 6) { // from class: rosetta.order.WaitingCategoryDto.ALL_DAY_TRADING_SESSION_KILL_SWITCH
        {
            String str = "all_day_trading_session_kill_switch";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.ALL_DAY_TRADING_SESSION_KILL_SWITCH;
        }
    };
    public static final WaitingCategoryDto MANUAL_BULK_ACTION = new WaitingCategoryDto("MANUAL_BULK_ACTION", 7) { // from class: rosetta.order.WaitingCategoryDto.MANUAL_BULK_ACTION
        {
            String str = "manual_bulk_action";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.MANUAL_BULK_ACTION;
        }
    };
    public static final WaitingCategoryDto REJECTION_CIRCUIT_BREAKER = new WaitingCategoryDto("REJECTION_CIRCUIT_BREAKER", 8) { // from class: rosetta.order.WaitingCategoryDto.REJECTION_CIRCUIT_BREAKER
        {
            String str = "rejection_circuit_breaker";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.REJECTION_CIRCUIT_BREAKER;
        }
    };
    public static final WaitingCategoryDto UNSOLICITED_CANCEL = new WaitingCategoryDto("UNSOLICITED_CANCEL", 9) { // from class: rosetta.order.WaitingCategoryDto.UNSOLICITED_CANCEL
        {
            String str = "unsolicited_cancel";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.UNSOLICITED_CANCEL;
        }
    };
    public static final WaitingCategoryDto ADV_MAC_VIOLATION = new WaitingCategoryDto("ADV_MAC_VIOLATION", 10) { // from class: rosetta.order.WaitingCategoryDto.ADV_MAC_VIOLATION
        {
            String str = "adv_mac_violation";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.ADV_MAC_VIOLATION;
        }
    };
    public static final WaitingCategoryDto RULES_ENGINE_DROP_TO_REVIEW = new WaitingCategoryDto("RULES_ENGINE_DROP_TO_REVIEW", 11) { // from class: rosetta.order.WaitingCategoryDto.RULES_ENGINE_DROP_TO_REVIEW
        {
            String str = "rules_engine_drop_to_review";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public WaitingCategory toProto() {
            return WaitingCategory.RULES_ENGINE_DROP_TO_REVIEW;
        }
    };

    private static final /* synthetic */ WaitingCategoryDto[] $values() {
        return new WaitingCategoryDto[]{WAITING_CATEGORY_UNSPECIFIED, VENUE_REJECTION, INSTRUMENT_IPO, INSTRUMENT_OTC, INTERNAL_ERROR, INSTRUMENT_INTERNAL_HALT, ALL_DAY_TRADING_SESSION_KILL_SWITCH, MANUAL_BULK_ACTION, REJECTION_CIRCUIT_BREAKER, UNSOLICITED_CANCEL, ADV_MAC_VIOLATION, RULES_ENGINE_DROP_TO_REVIEW};
    }

    public /* synthetic */ WaitingCategoryDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<WaitingCategoryDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private WaitingCategoryDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        WaitingCategoryDto[] waitingCategoryDtoArr$values = $values();
        $VALUES = waitingCategoryDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(waitingCategoryDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: rosetta.order.WaitingCategoryDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return WaitingCategoryDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: WaitingCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lrosetta/order/WaitingCategoryDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lrosetta/order/WaitingCategoryDto;", "Lrosetta/order/WaitingCategory;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lrosetta/order/WaitingCategoryDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<WaitingCategoryDto, WaitingCategory> {

        /* compiled from: WaitingCategoryDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes25.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[WaitingCategory.values().length];
                try {
                    iArr[WaitingCategory.WAITING_CATEGORY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[WaitingCategory.VENUE_REJECTION.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[WaitingCategory.INSTRUMENT_IPO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[WaitingCategory.INSTRUMENT_OTC.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[WaitingCategory.INTERNAL_ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[WaitingCategory.INSTRUMENT_INTERNAL_HALT.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[WaitingCategory.ALL_DAY_TRADING_SESSION_KILL_SWITCH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[WaitingCategory.MANUAL_BULK_ACTION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[WaitingCategory.REJECTION_CIRCUIT_BREAKER.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[WaitingCategory.UNSOLICITED_CANCEL.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[WaitingCategory.ADV_MAC_VIOLATION.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[WaitingCategory.RULES_ENGINE_DROP_TO_REVIEW.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<WaitingCategoryDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WaitingCategoryDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<WaitingCategoryDto> getBinaryBase64Serializer() {
            return (KSerializer) WaitingCategoryDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<WaitingCategory> getProtoAdapter() {
            return WaitingCategory.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WaitingCategoryDto getZeroValue() {
            return WaitingCategoryDto.WAITING_CATEGORY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public WaitingCategoryDto fromProto(WaitingCategory proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return WaitingCategoryDto.WAITING_CATEGORY_UNSPECIFIED;
                case 2:
                    return WaitingCategoryDto.VENUE_REJECTION;
                case 3:
                    return WaitingCategoryDto.INSTRUMENT_IPO;
                case 4:
                    return WaitingCategoryDto.INSTRUMENT_OTC;
                case 5:
                    return WaitingCategoryDto.INTERNAL_ERROR;
                case 6:
                    return WaitingCategoryDto.INSTRUMENT_INTERNAL_HALT;
                case 7:
                    return WaitingCategoryDto.ALL_DAY_TRADING_SESSION_KILL_SWITCH;
                case 8:
                    return WaitingCategoryDto.MANUAL_BULK_ACTION;
                case 9:
                    return WaitingCategoryDto.REJECTION_CIRCUIT_BREAKER;
                case 10:
                    return WaitingCategoryDto.UNSOLICITED_CANCEL;
                case 11:
                    return WaitingCategoryDto.ADV_MAC_VIOLATION;
                case 12:
                    return WaitingCategoryDto.RULES_ENGINE_DROP_TO_REVIEW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: WaitingCategoryDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lrosetta/order/WaitingCategoryDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lrosetta/order/WaitingCategoryDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.order_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes25.dex */
    public static final class Serializer implements KSerializer<WaitingCategoryDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<WaitingCategoryDto, WaitingCategory> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.order.WaitingCategory", WaitingCategoryDto.getEntries(), WaitingCategoryDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public WaitingCategoryDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (WaitingCategoryDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, WaitingCategoryDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static WaitingCategoryDto valueOf(String str) {
        return (WaitingCategoryDto) Enum.valueOf(WaitingCategoryDto.class, str);
    }

    public static WaitingCategoryDto[] values() {
        return (WaitingCategoryDto[]) $VALUES.clone();
    }
}
