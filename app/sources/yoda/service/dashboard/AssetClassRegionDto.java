package yoda.service.dashboard;

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
/* compiled from: AssetClassRegionDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0018\u0019B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/AssetClassRegionDto;", "Lcom/robinhood/idl/EnumDto;", "Lyoda/service/dashboard/AssetClassRegion;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_CLASS_REGION_UNSPECIFIED", "ASSET_CLASS_REGION_US_EQUITY", "ASSET_CLASS_REGION_INTERNATIONAL_EQUITY", "ASSET_CLASS_REGION_US_BONDS", "ASSET_CLASS_REGION_INTERNATIONAL_BONDS", "ASSET_CLASS_REGION_OTHER", "ASSET_CLASS_REGION_CASH", "ASSET_CLASS_REGION_GOLD", "ASSET_CLASS_REGION_COMMODITIES", "ASSET_CLASS_REGION_CRYPTO", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes23.dex */
public abstract class AssetClassRegionDto implements Dto2<AssetClassRegion>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetClassRegionDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetClassRegionDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetClassRegionDto, AssetClassRegion>> binaryBase64Serializer$delegate;
    public static final AssetClassRegionDto ASSET_CLASS_REGION_UNSPECIFIED = new AssetClassRegionDto("ASSET_CLASS_REGION_UNSPECIFIED", 0) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_US_EQUITY = new AssetClassRegionDto("ASSET_CLASS_REGION_US_EQUITY", 1) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_US_EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_US_EQUITY;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_INTERNATIONAL_EQUITY = new AssetClassRegionDto("ASSET_CLASS_REGION_INTERNATIONAL_EQUITY", 2) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_INTERNATIONAL_EQUITY
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_EQUITY;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_US_BONDS = new AssetClassRegionDto("ASSET_CLASS_REGION_US_BONDS", 3) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_US_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_US_BONDS;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_INTERNATIONAL_BONDS = new AssetClassRegionDto("ASSET_CLASS_REGION_INTERNATIONAL_BONDS", 4) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_INTERNATIONAL_BONDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_BONDS;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_OTHER = new AssetClassRegionDto("ASSET_CLASS_REGION_OTHER", 5) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_OTHER
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_OTHER;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_CASH = new AssetClassRegionDto("ASSET_CLASS_REGION_CASH", 6) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_CASH
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_CASH;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_GOLD = new AssetClassRegionDto("ASSET_CLASS_REGION_GOLD", 7) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_GOLD
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_GOLD;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_COMMODITIES = new AssetClassRegionDto("ASSET_CLASS_REGION_COMMODITIES", 8) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_COMMODITIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_COMMODITIES;
        }
    };
    public static final AssetClassRegionDto ASSET_CLASS_REGION_CRYPTO = new AssetClassRegionDto("ASSET_CLASS_REGION_CRYPTO", 9) { // from class: yoda.service.dashboard.AssetClassRegionDto.ASSET_CLASS_REGION_CRYPTO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetClassRegion toProto() {
            return AssetClassRegion.ASSET_CLASS_REGION_CRYPTO;
        }
    };

    private static final /* synthetic */ AssetClassRegionDto[] $values() {
        return new AssetClassRegionDto[]{ASSET_CLASS_REGION_UNSPECIFIED, ASSET_CLASS_REGION_US_EQUITY, ASSET_CLASS_REGION_INTERNATIONAL_EQUITY, ASSET_CLASS_REGION_US_BONDS, ASSET_CLASS_REGION_INTERNATIONAL_BONDS, ASSET_CLASS_REGION_OTHER, ASSET_CLASS_REGION_CASH, ASSET_CLASS_REGION_GOLD, ASSET_CLASS_REGION_COMMODITIES, ASSET_CLASS_REGION_CRYPTO};
    }

    public /* synthetic */ AssetClassRegionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AssetClassRegionDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetClassRegionDto(String str, int i) {
    }

    static {
        AssetClassRegionDto[] assetClassRegionDtoArr$values = $values();
        $VALUES = assetClassRegionDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetClassRegionDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.dashboard.AssetClassRegionDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetClassRegionDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetClassRegionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/dashboard/AssetClassRegionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lyoda/service/dashboard/AssetClassRegionDto;", "Lyoda/service/dashboard/AssetClassRegion;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/dashboard/AssetClassRegionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetClassRegionDto, AssetClassRegion> {

        /* compiled from: AssetClassRegionDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes28.dex */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetClassRegion.values().length];
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_US_EQUITY.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_EQUITY.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_US_BONDS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_INTERNATIONAL_BONDS.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_OTHER.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_CASH.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_GOLD.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_COMMODITIES.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AssetClassRegion.ASSET_CLASS_REGION_CRYPTO.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetClassRegionDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetClassRegionDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetClassRegionDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetClassRegionDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetClassRegion> getProtoAdapter() {
            return AssetClassRegion.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetClassRegionDto getZeroValue() {
            return AssetClassRegionDto.ASSET_CLASS_REGION_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetClassRegionDto fromProto(AssetClassRegion proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_UNSPECIFIED;
                case 2:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_US_EQUITY;
                case 3:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_INTERNATIONAL_EQUITY;
                case 4:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_US_BONDS;
                case 5:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_INTERNATIONAL_BONDS;
                case 6:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_OTHER;
                case 7:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_CASH;
                case 8:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_GOLD;
                case 9:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_COMMODITIES;
                case 10:
                    return AssetClassRegionDto.ASSET_CLASS_REGION_CRYPTO;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetClassRegionDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lyoda/service/dashboard/AssetClassRegionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/dashboard/AssetClassRegionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "yoda.v1.dashboard_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssetClassRegionDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetClassRegionDto, AssetClassRegion> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/yoda.service.dashboard.AssetClassRegion", AssetClassRegionDto.getEntries(), AssetClassRegionDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetClassRegionDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetClassRegionDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetClassRegionDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetClassRegionDto valueOf(String str) {
        return (AssetClassRegionDto) Enum.valueOf(AssetClassRegionDto.class, str);
    }

    public static AssetClassRegionDto[] values() {
        return (AssetClassRegionDto[]) $VALUES.clone();
    }
}
