package gold_flow.proto.p466v1;

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
/* compiled from: GoldFlowScreenDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0012\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001d2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001d\u001eB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u001f"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowScreenDto;", "Lcom/robinhood/idl/EnumDto;", "Lgold_flow/proto/v1/GoldFlowScreen;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "SCREEN_UNSPECIFIED", "LOADING", "ERROR", "VALUE_PROPS", "VALUE_PROPS_SDUI", "MULTI_AGREEMENTS", "SINGLE_AGREEMENT", "CONFIRMATION", "SUGGESTED_ACTION", "PLAN_SELECTION", "UPDATE_APP", "AGREEMENT_DISPLAY", "VALUE_PROPS_PROMO", "SAGE_START_APPLICATION", "SAGE_APPLICATION", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class GoldFlowScreenDto implements Dto2<GoldFlowScreen>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GoldFlowScreenDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<GoldFlowScreenDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<GoldFlowScreenDto, GoldFlowScreen>> binaryBase64Serializer$delegate;
    public static final GoldFlowScreenDto SCREEN_UNSPECIFIED = new GoldFlowScreenDto("SCREEN_UNSPECIFIED", 0) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.SCREEN_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.SCREEN_UNSPECIFIED;
        }
    };
    public static final GoldFlowScreenDto LOADING = new GoldFlowScreenDto("LOADING", 1) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.LOADING
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.LOADING;
        }
    };
    public static final GoldFlowScreenDto ERROR = new GoldFlowScreenDto("ERROR", 2) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.ERROR
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.ERROR;
        }
    };
    public static final GoldFlowScreenDto VALUE_PROPS = new GoldFlowScreenDto("VALUE_PROPS", 3) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.VALUE_PROPS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.VALUE_PROPS;
        }
    };
    public static final GoldFlowScreenDto VALUE_PROPS_SDUI = new GoldFlowScreenDto("VALUE_PROPS_SDUI", 4) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.VALUE_PROPS_SDUI
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.VALUE_PROPS_SDUI;
        }
    };
    public static final GoldFlowScreenDto MULTI_AGREEMENTS = new GoldFlowScreenDto("MULTI_AGREEMENTS", 5) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.MULTI_AGREEMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.MULTI_AGREEMENTS;
        }
    };
    public static final GoldFlowScreenDto SINGLE_AGREEMENT = new GoldFlowScreenDto("SINGLE_AGREEMENT", 6) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.SINGLE_AGREEMENT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.SINGLE_AGREEMENT;
        }
    };
    public static final GoldFlowScreenDto CONFIRMATION = new GoldFlowScreenDto("CONFIRMATION", 7) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.CONFIRMATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.CONFIRMATION;
        }
    };
    public static final GoldFlowScreenDto SUGGESTED_ACTION = new GoldFlowScreenDto("SUGGESTED_ACTION", 8) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.SUGGESTED_ACTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.SUGGESTED_ACTION;
        }
    };
    public static final GoldFlowScreenDto PLAN_SELECTION = new GoldFlowScreenDto("PLAN_SELECTION", 9) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.PLAN_SELECTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.PLAN_SELECTION;
        }
    };
    public static final GoldFlowScreenDto UPDATE_APP = new GoldFlowScreenDto("UPDATE_APP", 10) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.UPDATE_APP
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.UPDATE_APP;
        }
    };
    public static final GoldFlowScreenDto AGREEMENT_DISPLAY = new GoldFlowScreenDto("AGREEMENT_DISPLAY", 11) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.AGREEMENT_DISPLAY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.AGREEMENT_DISPLAY;
        }
    };
    public static final GoldFlowScreenDto VALUE_PROPS_PROMO = new GoldFlowScreenDto("VALUE_PROPS_PROMO", 12) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.VALUE_PROPS_PROMO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.VALUE_PROPS_PROMO;
        }
    };
    public static final GoldFlowScreenDto SAGE_START_APPLICATION = new GoldFlowScreenDto("SAGE_START_APPLICATION", 13) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.SAGE_START_APPLICATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.SAGE_START_APPLICATION;
        }
    };
    public static final GoldFlowScreenDto SAGE_APPLICATION = new GoldFlowScreenDto("SAGE_APPLICATION", 14) { // from class: gold_flow.proto.v1.GoldFlowScreenDto.SAGE_APPLICATION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public GoldFlowScreen toProto() {
            return GoldFlowScreen.SAGE_APPLICATION;
        }
    };

    private static final /* synthetic */ GoldFlowScreenDto[] $values() {
        return new GoldFlowScreenDto[]{SCREEN_UNSPECIFIED, LOADING, ERROR, VALUE_PROPS, VALUE_PROPS_SDUI, MULTI_AGREEMENTS, SINGLE_AGREEMENT, CONFIRMATION, SUGGESTED_ACTION, PLAN_SELECTION, UPDATE_APP, AGREEMENT_DISPLAY, VALUE_PROPS_PROMO, SAGE_START_APPLICATION, SAGE_APPLICATION};
    }

    public /* synthetic */ GoldFlowScreenDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<GoldFlowScreenDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private GoldFlowScreenDto(String str, int i) {
    }

    static {
        GoldFlowScreenDto[] goldFlowScreenDtoArr$values = $values();
        $VALUES = goldFlowScreenDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(goldFlowScreenDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: gold_flow.proto.v1.GoldFlowScreenDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return GoldFlowScreenDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: GoldFlowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowScreenDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lgold_flow/proto/v1/GoldFlowScreenDto;", "Lgold_flow/proto/v1/GoldFlowScreen;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lgold_flow/proto/v1/GoldFlowScreenDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<GoldFlowScreenDto, GoldFlowScreen> {

        /* compiled from: GoldFlowScreenDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes18.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[GoldFlowScreen.values().length];
                try {
                    iArr[GoldFlowScreen.SCREEN_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[GoldFlowScreen.LOADING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[GoldFlowScreen.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[GoldFlowScreen.VALUE_PROPS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[GoldFlowScreen.VALUE_PROPS_SDUI.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[GoldFlowScreen.MULTI_AGREEMENTS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[GoldFlowScreen.SINGLE_AGREEMENT.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[GoldFlowScreen.CONFIRMATION.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[GoldFlowScreen.SUGGESTED_ACTION.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[GoldFlowScreen.PLAN_SELECTION.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[GoldFlowScreen.UPDATE_APP.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[GoldFlowScreen.AGREEMENT_DISPLAY.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[GoldFlowScreen.VALUE_PROPS_PROMO.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[GoldFlowScreen.SAGE_START_APPLICATION.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[GoldFlowScreen.SAGE_APPLICATION.ordinal()] = 15;
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

        public final KSerializer<GoldFlowScreenDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldFlowScreenDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<GoldFlowScreenDto> getBinaryBase64Serializer() {
            return (KSerializer) GoldFlowScreenDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<GoldFlowScreen> getProtoAdapter() {
            return GoldFlowScreen.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldFlowScreenDto getZeroValue() {
            return GoldFlowScreenDto.SCREEN_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public GoldFlowScreenDto fromProto(GoldFlowScreen proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return GoldFlowScreenDto.SCREEN_UNSPECIFIED;
                case 2:
                    return GoldFlowScreenDto.LOADING;
                case 3:
                    return GoldFlowScreenDto.ERROR;
                case 4:
                    return GoldFlowScreenDto.VALUE_PROPS;
                case 5:
                    return GoldFlowScreenDto.VALUE_PROPS_SDUI;
                case 6:
                    return GoldFlowScreenDto.MULTI_AGREEMENTS;
                case 7:
                    return GoldFlowScreenDto.SINGLE_AGREEMENT;
                case 8:
                    return GoldFlowScreenDto.CONFIRMATION;
                case 9:
                    return GoldFlowScreenDto.SUGGESTED_ACTION;
                case 10:
                    return GoldFlowScreenDto.PLAN_SELECTION;
                case 11:
                    return GoldFlowScreenDto.UPDATE_APP;
                case 12:
                    return GoldFlowScreenDto.AGREEMENT_DISPLAY;
                case 13:
                    return GoldFlowScreenDto.VALUE_PROPS_PROMO;
                case 14:
                    return GoldFlowScreenDto.SAGE_START_APPLICATION;
                case 15:
                    return GoldFlowScreenDto.SAGE_APPLICATION;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: GoldFlowScreenDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lgold_flow/proto/v1/GoldFlowScreenDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lgold_flow/proto/v1/GoldFlowScreenDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes18.dex */
    public static final class Serializer implements KSerializer<GoldFlowScreenDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<GoldFlowScreenDto, GoldFlowScreen> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/gold_flow.proto.v1.GoldFlowScreen", GoldFlowScreenDto.getEntries(), GoldFlowScreenDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public GoldFlowScreenDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (GoldFlowScreenDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, GoldFlowScreenDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static GoldFlowScreenDto valueOf(String str) {
        return (GoldFlowScreenDto) Enum.valueOf(GoldFlowScreenDto.class, str);
    }

    public static GoldFlowScreenDto[] values() {
        return (GoldFlowScreenDto[]) $VALUES.clone();
    }
}
