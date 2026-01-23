package bonfire.proto.idl.margin.p036v1;

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
/* compiled from: MultiAccountEligibilityContextDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "Lcom/robinhood/idl/EnumDto;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes16.dex */
public abstract class MultiAccountEligibilityContextDto implements Dto2<MultiAccountEligibilityContext>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MultiAccountEligibilityContextDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<MultiAccountEligibilityContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<MultiAccountEligibilityContextDto, MultiAccountEligibilityContext>> binaryBase64Serializer$delegate;
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED", 0) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS", 1) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS", 2) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD", 3) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT", 4) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS", 5) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY", 6) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY;
        }
    };
    public static final MultiAccountEligibilityContextDto MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW = new MultiAccountEligibilityContextDto("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW", 7) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public MultiAccountEligibilityContext toProto() {
            return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW;
        }
    };

    private static final /* synthetic */ MultiAccountEligibilityContextDto[] $values() {
        return new MultiAccountEligibilityContextDto[]{MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW};
    }

    public /* synthetic */ MultiAccountEligibilityContextDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<MultiAccountEligibilityContextDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private MultiAccountEligibilityContextDto(String str, int i) {
    }

    static {
        MultiAccountEligibilityContextDto[] multiAccountEligibilityContextDtoArr$values = $values();
        $VALUES = multiAccountEligibilityContextDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(multiAccountEligibilityContextDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MultiAccountEligibilityContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: MultiAccountEligibilityContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<MultiAccountEligibilityContextDto, MultiAccountEligibilityContext> {

        /* compiled from: MultiAccountEligibilityContextDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[MultiAccountEligibilityContext.values().length];
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW.ordinal()] = 8;
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

        public final KSerializer<MultiAccountEligibilityContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MultiAccountEligibilityContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<MultiAccountEligibilityContextDto> getBinaryBase64Serializer() {
            return (KSerializer) MultiAccountEligibilityContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<MultiAccountEligibilityContext> getProtoAdapter() {
            return MultiAccountEligibilityContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MultiAccountEligibilityContextDto getZeroValue() {
            return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public MultiAccountEligibilityContextDto fromProto(MultiAccountEligibilityContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
                case 2:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS;
                case 3:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS;
                case 4:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD;
                case 5:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
                case 6:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS;
                case 7:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY;
                case 8:
                    return MultiAccountEligibilityContextDto.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: MultiAccountEligibilityContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContextDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<MultiAccountEligibilityContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<MultiAccountEligibilityContextDto, MultiAccountEligibilityContext> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/bonfire.proto.idl.margin.v1.MultiAccountEligibilityContext", MultiAccountEligibilityContextDto.getEntries(), MultiAccountEligibilityContextDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public MultiAccountEligibilityContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (MultiAccountEligibilityContextDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, MultiAccountEligibilityContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static MultiAccountEligibilityContextDto valueOf(String str) {
        return (MultiAccountEligibilityContextDto) Enum.valueOf(MultiAccountEligibilityContextDto.class, str);
    }

    public static MultiAccountEligibilityContextDto[] values() {
        return (MultiAccountEligibilityContextDto[]) $VALUES.clone();
    }
}
