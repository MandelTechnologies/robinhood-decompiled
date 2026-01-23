package com.robinhood.arsenal.proto.p281v1.idl;

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
/* compiled from: ProductUnderlyingAssetDto.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \"2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\"#B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020 H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001a¨\u0006$"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "PRODUCT_UNDERLYING_ASSET_UNSPECIFIED", "PRODUCT_UNDERLYING_ASSET_BASKETS", "PRODUCT_UNDERLYING_ASSET_EQUITIES", "PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS", "PRODUCT_UNDERLYING_ASSET_CURRENCIES", "PRODUCT_UNDERLYING_ASSET_INDICES", "PRODUCT_UNDERLYING_ASSET_OPTIONS", "PRODUCT_UNDERLYING_ASSET_FUTURES", "PRODUCT_UNDERLYING_ASSET_SWAPS", "PRODUCT_UNDERLYING_ASSET_INTEREST_RATES", "PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS", "PRODUCT_UNDERLYING_ASSET_EXTRACTION", "PRODUCT_UNDERLYING_ASSET_AGRICULTURE", "PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS", "PRODUCT_UNDERLYING_ASSET_SERVICES", "PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL", "PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS", "PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES", "PRODUCT_UNDERLYING_ASSET_OTHERS", "PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes20.dex */
public abstract class ProductUnderlyingAssetDto implements Dto2<ProductUnderlyingAsset>, Parcelable {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductUnderlyingAssetDto[] $VALUES;

    @JvmField
    public static final Parcelable.Creator<ProductUnderlyingAssetDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ProductUnderlyingAssetDto, ProductUnderlyingAsset>> binaryBase64Serializer$delegate;
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_UNSPECIFIED = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_UNSPECIFIED", 0) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_BASKETS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_BASKETS", 1) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_BASKETS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_BASKETS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_EQUITIES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_EQUITIES", 2) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_EQUITIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EQUITIES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS", 3) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_CURRENCIES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_CURRENCIES", 4) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_CURRENCIES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_CURRENCIES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_INDICES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_INDICES", 5) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INDICES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDICES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_OPTIONS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_OPTIONS", 6) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_OPTIONS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OPTIONS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_FUTURES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_FUTURES", 7) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_FUTURES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_FUTURES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_SWAPS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_SWAPS", 8) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_SWAPS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SWAPS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_INTEREST_RATES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_INTEREST_RATES", 9) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INTEREST_RATES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INTEREST_RATES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS", 10) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_EXTRACTION = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_EXTRACTION", 11) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_EXTRACTION
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EXTRACTION;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_AGRICULTURE = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_AGRICULTURE", 12) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_AGRICULTURE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_AGRICULTURE;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS", 13) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_SERVICES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_SERVICES", 14) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_SERVICES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SERVICES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL", 15) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS", 16) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES", 17) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_OTHERS = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_OTHERS", 18) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_OTHERS
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OTHERS;
        }
    };
    public static final ProductUnderlyingAssetDto PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE = new ProductUnderlyingAssetDto("PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE", 19) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE
        {
            DefaultConstructorMarker defaultConstructorMarker = null;
        }

        @Override // com.robinhood.idl.Dto
        public ProductUnderlyingAsset toProto() {
            return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE;
        }
    };

    private static final /* synthetic */ ProductUnderlyingAssetDto[] $values() {
        return new ProductUnderlyingAssetDto[]{PRODUCT_UNDERLYING_ASSET_UNSPECIFIED, PRODUCT_UNDERLYING_ASSET_BASKETS, PRODUCT_UNDERLYING_ASSET_EQUITIES, PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS, PRODUCT_UNDERLYING_ASSET_CURRENCIES, PRODUCT_UNDERLYING_ASSET_INDICES, PRODUCT_UNDERLYING_ASSET_OPTIONS, PRODUCT_UNDERLYING_ASSET_FUTURES, PRODUCT_UNDERLYING_ASSET_SWAPS, PRODUCT_UNDERLYING_ASSET_INTEREST_RATES, PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS, PRODUCT_UNDERLYING_ASSET_EXTRACTION, PRODUCT_UNDERLYING_ASSET_AGRICULTURE, PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS, PRODUCT_UNDERLYING_ASSET_SERVICES, PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL, PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS, PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES, PRODUCT_UNDERLYING_ASSET_OTHERS, PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE};
    }

    public /* synthetic */ ProductUnderlyingAssetDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    public static EnumEntries<ProductUnderlyingAssetDto> getEntries() {
        return $ENTRIES;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ProductUnderlyingAssetDto(String str, int i) {
    }

    static {
        ProductUnderlyingAssetDto[] productUnderlyingAssetDtoArr$values = $values();
        $VALUES = productUnderlyingAssetDtoArr$values;
        $ENTRIES = EnumEntries2.enumEntries(productUnderlyingAssetDtoArr$values);
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAssetDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ProductUnderlyingAssetDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        CREATOR = new DtoParcelableCreator(companion);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* compiled from: ProductUnderlyingAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Companion implements Dto2.Creator<ProductUnderlyingAssetDto, ProductUnderlyingAsset> {

        /* compiled from: ProductUnderlyingAssetDto.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[ProductUnderlyingAsset.values().length];
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_BASKETS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EQUITIES.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_CURRENCIES.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDICES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OPTIONS.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_FUTURES.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SWAPS.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INTEREST_RATES.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EXTRACTION.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_AGRICULTURE.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SERVICES.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES.ordinal()] = 18;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OTHERS.ordinal()] = 19;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr[ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE.ordinal()] = 20;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ProductUnderlyingAssetDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProductUnderlyingAssetDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ProductUnderlyingAssetDto> getBinaryBase64Serializer() {
            return (KSerializer) ProductUnderlyingAssetDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ProductUnderlyingAsset> getProtoAdapter() {
            return ProductUnderlyingAsset.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProductUnderlyingAssetDto getZeroValue() {
            return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProductUnderlyingAssetDto fromProto(ProductUnderlyingAsset proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                case 1:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED;
                case 2:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_BASKETS;
                case 3:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_EQUITIES;
                case 4:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS;
                case 5:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_CURRENCIES;
                case 6:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INDICES;
                case 7:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_OPTIONS;
                case 8:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_FUTURES;
                case 9:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_SWAPS;
                case 10:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INTEREST_RATES;
                case 11:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS;
                case 12:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_EXTRACTION;
                case 13:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_AGRICULTURE;
                case 14:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS;
                case 15:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_SERVICES;
                case 16:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL;
                case 17:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS;
                case 18:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES;
                case 19:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_OTHERS;
                case 20:
                    return ProductUnderlyingAssetDto.PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* compiled from: ProductUnderlyingAssetDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAssetDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Serializer implements KSerializer<ProductUnderlyingAssetDto> {
        public static final Serializer INSTANCE = new Serializer();
        private final /* synthetic */ EnumDtoSerializer<ProductUnderlyingAssetDto, ProductUnderlyingAsset> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/arsenal.public.ProductUnderlyingAsset", ProductUnderlyingAssetDto.getEntries(), ProductUnderlyingAssetDto.INSTANCE.getZeroValue());

        @Override // kotlinx.serialization.KSerializer2
        public ProductUnderlyingAssetDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return (ProductUnderlyingAssetDto) this.$$delegate_0.deserialize(decoder);
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return this.$$delegate_0.getDescriptor();
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ProductUnderlyingAssetDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            this.$$delegate_0.serialize(encoder, (Enum) value);
        }

        private Serializer() {
        }
    }

    public static ProductUnderlyingAssetDto valueOf(String str) {
        return (ProductUnderlyingAssetDto) Enum.valueOf(ProductUnderlyingAssetDto.class, str);
    }

    public static ProductUnderlyingAssetDto[] values() {
        return (ProductUnderlyingAssetDto[]) $VALUES.clone();
    }
}
