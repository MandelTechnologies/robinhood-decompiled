package bonfire.proto.idl.copilot.p032v1;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
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
/* compiled from: StrategyTypeDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 !2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002!\"B\u001d\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019¨\u0006#"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/StrategyTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/copilot/v1/StrategyType;", "Landroid/os/Parcelable;", "", "json_value", "", AnalyticsStrings.BUTTON_LIST_DETAIL_DISPLAY_NAME, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "getDisplay_name", "STRATEGY_UNSPECIFIED", "LONG_CALL", "SHORT_CALL", "LONG_PUT", "SHORT_PUT", "LONG_CALL_SPREAD", "SHORT_CALL_SPREAD", "LONG_PUT_SPREAD", "SHORT_PUT_SPREAD", "LONG_IRON_BUTTERFLY", "SHORT_IRON_BUTTERFLY", "LONG_IRON_CONDOR", "SHORT_IRON_CONDOR", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class StrategyTypeDto implements Dto2<StrategyType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StrategyTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<StrategyTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<StrategyTypeDto, StrategyType>> binaryBase64Serializer$delegate;
    private final String display_name;
    private final String json_value;
    public static final StrategyTypeDto STRATEGY_UNSPECIFIED = new StrategyTypeDto("STRATEGY_UNSPECIFIED", 0) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.STRATEGY_UNSPECIFIED
        {
            String str = "Strategy Unspecified";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "strategy_unspecified";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.STRATEGY_UNSPECIFIED;
        }
    };
    public static final StrategyTypeDto LONG_CALL = new StrategyTypeDto("LONG_CALL", 1) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_CALL
        {
            String str = "Long Call";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_call";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_CALL;
        }
    };
    public static final StrategyTypeDto SHORT_CALL = new StrategyTypeDto("SHORT_CALL", 2) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_CALL
        {
            String str = "Short Call";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_call";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_CALL;
        }
    };
    public static final StrategyTypeDto LONG_PUT = new StrategyTypeDto("LONG_PUT", 3) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_PUT
        {
            String str = "Long Put";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_put";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_PUT;
        }
    };
    public static final StrategyTypeDto SHORT_PUT = new StrategyTypeDto("SHORT_PUT", 4) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_PUT
        {
            String str = "Short Put";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_put";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_PUT;
        }
    };
    public static final StrategyTypeDto LONG_CALL_SPREAD = new StrategyTypeDto("LONG_CALL_SPREAD", 5) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_CALL_SPREAD
        {
            String str = "Long Call Spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_call_spread";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_CALL_SPREAD;
        }
    };
    public static final StrategyTypeDto SHORT_CALL_SPREAD = new StrategyTypeDto("SHORT_CALL_SPREAD", 6) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_CALL_SPREAD
        {
            String str = "Short Call Spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_call_spread";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_CALL_SPREAD;
        }
    };
    public static final StrategyTypeDto LONG_PUT_SPREAD = new StrategyTypeDto("LONG_PUT_SPREAD", 7) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_PUT_SPREAD
        {
            String str = "Long Put Spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_put_spread";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_PUT_SPREAD;
        }
    };
    public static final StrategyTypeDto SHORT_PUT_SPREAD = new StrategyTypeDto("SHORT_PUT_SPREAD", 8) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_PUT_SPREAD
        {
            String str = "Short Put Spread";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_put_spread";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_PUT_SPREAD;
        }
    };
    public static final StrategyTypeDto LONG_IRON_BUTTERFLY = new StrategyTypeDto("LONG_IRON_BUTTERFLY", 9) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_IRON_BUTTERFLY
        {
            String str = "Long Iron Butterfly";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_iron_butterfly";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_IRON_BUTTERFLY;
        }
    };
    public static final StrategyTypeDto SHORT_IRON_BUTTERFLY = new StrategyTypeDto("SHORT_IRON_BUTTERFLY", 10) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_IRON_BUTTERFLY
        {
            String str = "Short Iron Butterfly";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_iron_butterfly";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_IRON_BUTTERFLY;
        }
    };
    public static final StrategyTypeDto LONG_IRON_CONDOR = new StrategyTypeDto("LONG_IRON_CONDOR", 11) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.LONG_IRON_CONDOR
        {
            String str = "Long Iron Condor";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "long_iron_condor";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.LONG_IRON_CONDOR;
        }
    };
    public static final StrategyTypeDto SHORT_IRON_CONDOR = new StrategyTypeDto("SHORT_IRON_CONDOR", 12) { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto.SHORT_IRON_CONDOR
        {
            String str = "Short Iron Condor";
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str2 = "short_iron_condor";
        }

        @Override // com.robinhood.idl.Dto
        public StrategyType toProto() {
            return StrategyType.SHORT_IRON_CONDOR;
        }
    };

    private static final /* synthetic */ StrategyTypeDto[] $values() {
        return new StrategyTypeDto[]{STRATEGY_UNSPECIFIED, LONG_CALL, SHORT_CALL, LONG_PUT, SHORT_PUT, LONG_CALL_SPREAD, SHORT_CALL_SPREAD, LONG_PUT_SPREAD, SHORT_PUT_SPREAD, LONG_IRON_BUTTERFLY, SHORT_IRON_BUTTERFLY, LONG_IRON_CONDOR, SHORT_IRON_CONDOR};
    }

    public /* synthetic */ StrategyTypeDto(String str, int i, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2, str3);
    }

    public static EnumEntries<StrategyTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private StrategyTypeDto(String str, int i, String str2, String str3) {
        this.json_value = str2;
        this.display_name = str3;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    public final String getDisplay_name() {
        return this.display_name;
    }

    static {
        StrategyTypeDto[] strategyTypeDtoArr$values = $values();
        $VALUES = strategyTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(strategyTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.copilot.v1.StrategyTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return StrategyTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: StrategyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/StrategyTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/copilot/v1/StrategyTypeDto;", "Lbonfire/proto/idl/copilot/v1/StrategyType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/copilot/v1/StrategyTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<StrategyTypeDto, StrategyType> {

        /* compiled from: StrategyTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[StrategyType.values().length];
                try {
                    iArr[StrategyType.STRATEGY_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[StrategyType.LONG_CALL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[StrategyType.SHORT_CALL.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[StrategyType.LONG_PUT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[StrategyType.SHORT_PUT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[StrategyType.LONG_CALL_SPREAD.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[StrategyType.SHORT_CALL_SPREAD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[StrategyType.LONG_PUT_SPREAD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[StrategyType.SHORT_PUT_SPREAD.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[StrategyType.LONG_IRON_BUTTERFLY.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[StrategyType.SHORT_IRON_BUTTERFLY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[StrategyType.LONG_IRON_CONDOR.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[StrategyType.SHORT_IRON_CONDOR.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<StrategyTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategyTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<StrategyTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) StrategyTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<StrategyType> getProtoAdapter() {
            return StrategyType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategyTypeDto getZeroValue() {
            return StrategyTypeDto.STRATEGY_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public StrategyTypeDto fromProto(StrategyType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return StrategyTypeDto.STRATEGY_UNSPECIFIED;
                case 2:
                    return StrategyTypeDto.LONG_CALL;
                case 3:
                    return StrategyTypeDto.SHORT_CALL;
                case 4:
                    return StrategyTypeDto.LONG_PUT;
                case 5:
                    return StrategyTypeDto.SHORT_PUT;
                case 6:
                    return StrategyTypeDto.LONG_CALL_SPREAD;
                case 7:
                    return StrategyTypeDto.SHORT_CALL_SPREAD;
                case 8:
                    return StrategyTypeDto.LONG_PUT_SPREAD;
                case 9:
                    return StrategyTypeDto.SHORT_PUT_SPREAD;
                case 10:
                    return StrategyTypeDto.LONG_IRON_BUTTERFLY;
                case 11:
                    return StrategyTypeDto.SHORT_IRON_BUTTERFLY;
                case 12:
                    return StrategyTypeDto.LONG_IRON_CONDOR;
                case 13:
                    return StrategyTypeDto.SHORT_IRON_CONDOR;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: StrategyTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/copilot/v1/StrategyTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/copilot/v1/StrategyTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "copilot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<StrategyTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<StrategyTypeDto, StrategyType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.copilot.v1.StrategyType", StrategyTypeDto.getEntries(), StrategyTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public StrategyTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (StrategyTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, StrategyTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static StrategyTypeDto valueOf(String str) {
        return (StrategyTypeDto) Enum.valueOf(StrategyTypeDto.class, str);
    }

    public static StrategyTypeDto[] values() {
        return (StrategyTypeDto[]) $VALUES.clone();
    }
}
