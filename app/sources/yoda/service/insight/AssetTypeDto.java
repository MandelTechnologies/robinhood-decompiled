package yoda.service.insight;

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
/* compiled from: AssetTypeDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u001c\u001dB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u001e"}, m3636d2 = {"Lyoda/service/insight/AssetTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lyoda/service/insight/AssetType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ASSET_TYPE_UNSPECIFIED", "ASSET_TYPE_CONTENTFUL_VIDEO", "ASSET_TYPE_CONTENTFUL_IMAGE", "ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT", "ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT", "ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT", "ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT", "ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT", "ASSET_TYPE_TWO_BAR_CHART_COMPARISON", "ASSET_TYPE_NONE", "ASSET_TYPE_RETURNS_CHART_POSITIVE", "ASSET_TYPE_RETURNS_CHART_NEGATIVE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes28.dex */
public abstract class AssetTypeDto implements Dto2<AssetType>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetTypeDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<AssetTypeDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<AssetTypeDto, AssetType>> binaryBase64Serializer$delegate;
    public static final AssetTypeDto ASSET_TYPE_UNSPECIFIED = new AssetTypeDto("ASSET_TYPE_UNSPECIFIED", 0) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_UNSPECIFIED;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_CONTENTFUL_VIDEO = new AssetTypeDto("ASSET_TYPE_CONTENTFUL_VIDEO", 1) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_CONTENTFUL_VIDEO
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_CONTENTFUL_VIDEO;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_CONTENTFUL_IMAGE = new AssetTypeDto("ASSET_TYPE_CONTENTFUL_IMAGE", 2) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_CONTENTFUL_IMAGE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_CONTENTFUL_IMAGE;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT = new AssetTypeDto("ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT", 3) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT = new AssetTypeDto("ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT", 4) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT;
        }
    };

    /* renamed from: ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT */
    public static final AssetTypeDto f8525x6d0641ca = new AssetTypeDto("ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT", 5) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_SINGLE_CATEGORY_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.f8523x6d0641ca;
        }
    };

    /* renamed from: ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT */
    public static final AssetTypeDto f8524xb5108702 = new AssetTypeDto("ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT", 6) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_SINGLE_PORTFOLIO_BREAKDOWN_COMPARISON_MULTIPLE_CATEGORY_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.f8522xb5108702;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT = new AssetTypeDto("ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT", 7) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT = new AssetTypeDto("ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT", 8) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT = new AssetTypeDto("ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT", 9) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_TWO_BAR_CHART_COMPARISON = new AssetTypeDto("ASSET_TYPE_TWO_BAR_CHART_COMPARISON", 10) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_TWO_BAR_CHART_COMPARISON
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_TWO_BAR_CHART_COMPARISON;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_NONE = new AssetTypeDto("ASSET_TYPE_NONE", 11) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_NONE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_NONE;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_RETURNS_CHART_POSITIVE = new AssetTypeDto("ASSET_TYPE_RETURNS_CHART_POSITIVE", 12) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_RETURNS_CHART_POSITIVE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_RETURNS_CHART_POSITIVE;
        }
    };
    public static final AssetTypeDto ASSET_TYPE_RETURNS_CHART_NEGATIVE = new AssetTypeDto("ASSET_TYPE_RETURNS_CHART_NEGATIVE", 13) { // from class: yoda.service.insight.AssetTypeDto.ASSET_TYPE_RETURNS_CHART_NEGATIVE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public AssetType toProto() {
            return AssetType.ASSET_TYPE_RETURNS_CHART_NEGATIVE;
        }
    };

    private static final /* synthetic */ AssetTypeDto[] $values() {
        return new AssetTypeDto[]{ASSET_TYPE_UNSPECIFIED, ASSET_TYPE_CONTENTFUL_VIDEO, ASSET_TYPE_CONTENTFUL_IMAGE, ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT, ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT, f8525x6d0641ca, f8524xb5108702, ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT, ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT, ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT, ASSET_TYPE_TWO_BAR_CHART_COMPARISON, ASSET_TYPE_NONE, ASSET_TYPE_RETURNS_CHART_POSITIVE, ASSET_TYPE_RETURNS_CHART_NEGATIVE};
    }

    public /* synthetic */ AssetTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<AssetTypeDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private AssetTypeDto(String str, int i) {
    }

    static {
        AssetTypeDto[] assetTypeDtoArr$values = $values();
        $VALUES = assetTypeDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetTypeDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: yoda.service.insight.AssetTypeDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AssetTypeDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: AssetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lyoda/service/insight/AssetTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lyoda/service/insight/AssetTypeDto;", "Lyoda/service/insight/AssetType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lyoda/service/insight/AssetTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto2.Creator<AssetTypeDto, AssetType> {

        /* compiled from: AssetTypeDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[AssetType.values().length];
                try {
                    iArr[AssetType.ASSET_TYPE_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_CONTENTFUL_VIDEO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_CONTENTFUL_IMAGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[AssetType.f8523x6d0641ca.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[AssetType.f8522xb5108702.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_TWO_BAR_CHART_COMPARISON.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_NONE.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_RETURNS_CHART_POSITIVE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[AssetType.ASSET_TYPE_RETURNS_CHART_NEGATIVE.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<AssetTypeDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTypeDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<AssetTypeDto> getBinaryBase64Serializer() {
            return (KSerializer) AssetTypeDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<AssetType> getProtoAdapter() {
            return AssetType.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTypeDto getZeroValue() {
            return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public AssetTypeDto fromProto(AssetType proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return AssetTypeDto.ASSET_TYPE_UNSPECIFIED;
                case 2:
                    return AssetTypeDto.ASSET_TYPE_CONTENTFUL_VIDEO;
                case 3:
                    return AssetTypeDto.ASSET_TYPE_CONTENTFUL_IMAGE;
                case 4:
                    return AssetTypeDto.ASSET_TYPE_PORTFOLIO_BREAKDOWN_STOCKS_HIGHLIGHT;
                case 5:
                    return AssetTypeDto.ASSET_TYPE_PORTFOLIO_BREAKDOWN_ETFS_HIGHLIGHT;
                case 6:
                    return AssetTypeDto.f8525x6d0641ca;
                case 7:
                    return AssetTypeDto.f8524xb5108702;
                case 8:
                    return AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_NO_HIGHLIGHT;
                case 9:
                    return AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_SINGLE_DATE_HIGHLIGHT;
                case 10:
                    return AssetTypeDto.ASSET_TYPE_PERFORMANCE_CHART_DATE_RANGE_HIGHLIGHT;
                case 11:
                    return AssetTypeDto.ASSET_TYPE_TWO_BAR_CHART_COMPARISON;
                case 12:
                    return AssetTypeDto.ASSET_TYPE_NONE;
                case 13:
                    return AssetTypeDto.ASSET_TYPE_RETURNS_CHART_POSITIVE;
                case 14:
                    return AssetTypeDto.ASSET_TYPE_RETURNS_CHART_NEGATIVE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: AssetTypeDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lyoda/service/insight/AssetTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lyoda/service/insight/AssetTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "yoda.v1.insight_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Serializer implements KSerializer<AssetTypeDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<AssetTypeDto, AssetType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/yoda.service.insight.AssetType", AssetTypeDto.getEntries(), AssetTypeDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public AssetTypeDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (AssetTypeDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, AssetTypeDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static AssetTypeDto valueOf(String str) {
        return (AssetTypeDto) Enum.valueOf(AssetTypeDto.class, str);
    }

    public static AssetTypeDto[] values() {
        return (AssetTypeDto[]) $VALUES.clone();
    }
}
