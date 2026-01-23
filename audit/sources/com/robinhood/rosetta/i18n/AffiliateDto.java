package com.robinhood.rosetta.i18n;

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
/* compiled from: AffiliateDto.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001e2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001e\u001fB\u0013\b\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/AffiliateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/i18n/Affiliate;", "Landroid/os/Parcelable;", "", "json_value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getJson_value", "()Ljava/lang/String;", "AFFILIATE_UNSPECIFIED", "RHS", "RHF", "RHI", "RHC", "RHUK", "RHCE", "RHD", "RHSG", "RAM", "RH_MONEY", "RCT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes21.dex */
public abstract class AffiliateDto implements Dto2<Affiliate>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AffiliateDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AffiliateDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AffiliateDto, Affiliate>> binaryBase64Serializer$delegate;
    private final String json_value;
    public static final AffiliateDto AFFILIATE_UNSPECIFIED = new AffiliateDto("AFFILIATE_UNSPECIFIED", 0) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.AFFILIATE_UNSPECIFIED
        {
            String str = "";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.AFFILIATE_UNSPECIFIED;
        }
    };
    public static final AffiliateDto RHS = new AffiliateDto("RHS", 1) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHS
        {
            String str = "rhs";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHS;
        }
    };
    public static final AffiliateDto RHF = new AffiliateDto("RHF", 2) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHF
        {
            String str = "rhf";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHF;
        }
    };
    public static final AffiliateDto RHI = new AffiliateDto("RHI", 3) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHI
        {
            String str = "rhi";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHI;
        }
    };
    public static final AffiliateDto RHC = new AffiliateDto("RHC", 4) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHC
        {
            String str = "rhc";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHC;
        }
    };
    public static final AffiliateDto RHUK = new AffiliateDto("RHUK", 5) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHUK
        {
            String str = "rhuk";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHUK;
        }
    };
    public static final AffiliateDto RHCE = new AffiliateDto("RHCE", 6) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHCE
        {
            String str = "rhce";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHCE;
        }
    };
    public static final AffiliateDto RHD = new AffiliateDto("RHD", 7) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHD
        {
            String str = "rhd";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHD;
        }
    };
    public static final AffiliateDto RHSG = new AffiliateDto("RHSG", 8) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RHSG
        {
            String str = "rhsg";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RHSG;
        }
    };
    public static final AffiliateDto RAM = new AffiliateDto("RAM", 9) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RAM
        {
            String str = "ram";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RAM;
        }
    };
    public static final AffiliateDto RH_MONEY = new AffiliateDto("RH_MONEY", 10) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RH_MONEY
        {
            String str = "rhy";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RH_MONEY;
        }
    };
    public static final AffiliateDto RCT = new AffiliateDto("RCT", 11) { // from class: com.robinhood.rosetta.i18n.AffiliateDto.RCT
        {
            String str = "rct";
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public Affiliate toProto() {
            return Affiliate.RCT;
        }
    };

    private static final /* synthetic */ AffiliateDto[] $values() {
        return new AffiliateDto[]{AFFILIATE_UNSPECIFIED, RHS, RHF, RHI, RHC, RHUK, RHCE, RHD, RHSG, RAM, RH_MONEY, RCT};
    }

    public /* synthetic */ AffiliateDto(String str, int i, String str2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i, str2);
    }

    public static EnumEntries<AffiliateDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AffiliateDto(String str, int i, String str2) {
        this.json_value = str2;
    }

    public final String getJson_value() {
        return this.json_value;
    }

    static {
        AffiliateDto[] affiliateDtoArr$values = $values();
        $VALUES = affiliateDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(affiliateDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.i18n.AffiliateDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AffiliateDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AffiliateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/AffiliateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "Lcom/robinhood/rosetta/i18n/Affiliate;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/i18n/AffiliateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AffiliateDto, Affiliate> {

        /* compiled from: AffiliateDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Affiliate.values().length];
                try {
                    iArr[Affiliate.AFFILIATE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Affiliate.RHS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Affiliate.RHF.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Affiliate.RHI.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Affiliate.RHC.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[Affiliate.RHUK.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[Affiliate.RHCE.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[Affiliate.RHD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[Affiliate.RHSG.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[Affiliate.RAM.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[Affiliate.RH_MONEY.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[Affiliate.RCT.ordinal()] = 12;
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

        public final KSerializer<AffiliateDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AffiliateDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AffiliateDto> getBinaryBase64Serializer() {
            return (KSerializer) AffiliateDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<Affiliate> getProtoAdapter() {
            return Affiliate.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AffiliateDto getZeroValue() {
            return AffiliateDto.AFFILIATE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AffiliateDto fromProto(Affiliate proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AffiliateDto.AFFILIATE_UNSPECIFIED;
                case 2:
                    return AffiliateDto.RHS;
                case 3:
                    return AffiliateDto.RHF;
                case 4:
                    return AffiliateDto.RHI;
                case 5:
                    return AffiliateDto.RHC;
                case 6:
                    return AffiliateDto.RHUK;
                case 7:
                    return AffiliateDto.RHCE;
                case 8:
                    return AffiliateDto.RHD;
                case 9:
                    return AffiliateDto.RHSG;
                case 10:
                    return AffiliateDto.RAM;
                case 11:
                    return AffiliateDto.RH_MONEY;
                case 12:
                    return AffiliateDto.RCT;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AffiliateDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/i18n/AffiliateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/i18n/AffiliateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "rosetta.i18n_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AffiliateDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AffiliateDto, Affiliate> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.i18n.Affiliate", AffiliateDto.getEntries(), AffiliateDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AffiliateDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AffiliateDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AffiliateDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AffiliateDto valueOf(String str) {
        return (AffiliateDto) Enum.valueOf(AffiliateDto.class, str);
    }

    public static AffiliateDto[] values() {
        return (AffiliateDto[]) $VALUES.clone();
    }
}
