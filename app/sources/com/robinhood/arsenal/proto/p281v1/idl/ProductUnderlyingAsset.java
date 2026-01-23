package com.robinhood.arsenal.proto.p281v1.idl;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductUnderlyingAsset.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001d2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001dB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001c¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRODUCT_UNDERLYING_ASSET_UNSPECIFIED", "PRODUCT_UNDERLYING_ASSET_BASKETS", "PRODUCT_UNDERLYING_ASSET_EQUITIES", "PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS", "PRODUCT_UNDERLYING_ASSET_CURRENCIES", "PRODUCT_UNDERLYING_ASSET_INDICES", "PRODUCT_UNDERLYING_ASSET_OPTIONS", "PRODUCT_UNDERLYING_ASSET_FUTURES", "PRODUCT_UNDERLYING_ASSET_SWAPS", "PRODUCT_UNDERLYING_ASSET_INTEREST_RATES", "PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS", "PRODUCT_UNDERLYING_ASSET_EXTRACTION", "PRODUCT_UNDERLYING_ASSET_AGRICULTURE", "PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS", "PRODUCT_UNDERLYING_ASSET_SERVICES", "PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL", "PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS", "PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES", "PRODUCT_UNDERLYING_ASSET_OTHERS", "PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ProductUnderlyingAsset implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductUnderlyingAsset[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ProductUnderlyingAsset> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_AGRICULTURE;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_BASKETS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_CURRENCIES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_EQUITIES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_EXTRACTION;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_FUTURES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_INDICES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_INTEREST_RATES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_OPTIONS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_OTHERS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_SERVICES;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_SWAPS;
    public static final ProductUnderlyingAsset PRODUCT_UNDERLYING_ASSET_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ProductUnderlyingAsset[] $values() {
        return new ProductUnderlyingAsset[]{PRODUCT_UNDERLYING_ASSET_UNSPECIFIED, PRODUCT_UNDERLYING_ASSET_BASKETS, PRODUCT_UNDERLYING_ASSET_EQUITIES, PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS, PRODUCT_UNDERLYING_ASSET_CURRENCIES, PRODUCT_UNDERLYING_ASSET_INDICES, PRODUCT_UNDERLYING_ASSET_OPTIONS, PRODUCT_UNDERLYING_ASSET_FUTURES, PRODUCT_UNDERLYING_ASSET_SWAPS, PRODUCT_UNDERLYING_ASSET_INTEREST_RATES, PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS, PRODUCT_UNDERLYING_ASSET_EXTRACTION, PRODUCT_UNDERLYING_ASSET_AGRICULTURE, PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS, PRODUCT_UNDERLYING_ASSET_SERVICES, PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL, PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS, PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES, PRODUCT_UNDERLYING_ASSET_OTHERS, PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE};
    }

    @JvmStatic
    public static final ProductUnderlyingAsset fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ProductUnderlyingAsset> getEntries() {
        return $ENTRIES;
    }

    private ProductUnderlyingAsset(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ProductUnderlyingAsset productUnderlyingAsset = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_UNSPECIFIED", 0, 0);
        PRODUCT_UNDERLYING_ASSET_UNSPECIFIED = productUnderlyingAsset;
        PRODUCT_UNDERLYING_ASSET_BASKETS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_BASKETS", 1, 1);
        PRODUCT_UNDERLYING_ASSET_EQUITIES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_EQUITIES", 2, 2);
        PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS", 3, 3);
        PRODUCT_UNDERLYING_ASSET_CURRENCIES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_CURRENCIES", 4, 4);
        PRODUCT_UNDERLYING_ASSET_INDICES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_INDICES", 5, 5);
        PRODUCT_UNDERLYING_ASSET_OPTIONS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_OPTIONS", 6, 6);
        PRODUCT_UNDERLYING_ASSET_FUTURES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_FUTURES", 7, 7);
        PRODUCT_UNDERLYING_ASSET_SWAPS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_SWAPS", 8, 8);
        PRODUCT_UNDERLYING_ASSET_INTEREST_RATES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_INTEREST_RATES", 9, 9);
        PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS", 10, 10);
        PRODUCT_UNDERLYING_ASSET_EXTRACTION = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_EXTRACTION", 11, 11);
        PRODUCT_UNDERLYING_ASSET_AGRICULTURE = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_AGRICULTURE", 12, 12);
        PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS", 13, 13);
        PRODUCT_UNDERLYING_ASSET_SERVICES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_SERVICES", 14, 14);
        PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL", 15, 15);
        PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS", 16, 16);
        PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES", 17, 17);
        PRODUCT_UNDERLYING_ASSET_OTHERS = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_OTHERS", 18, 18);
        PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE = new ProductUnderlyingAsset("PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE", 19, 19);
        ProductUnderlyingAsset[] productUnderlyingAssetArr$values = $values();
        $VALUES = productUnderlyingAssetArr$values;
        $ENTRIES = EnumEntries2.enumEntries(productUnderlyingAssetArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProductUnderlyingAsset.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ProductUnderlyingAsset>(orCreateKotlinClass, syntax, productUnderlyingAsset) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductUnderlyingAsset$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ProductUnderlyingAsset fromValue(int value) {
                return ProductUnderlyingAsset.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ProductUnderlyingAsset.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductUnderlyingAsset;", "fromValue", "value", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProductUnderlyingAsset fromValue(int value) {
            switch (value) {
                case 0:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_UNSPECIFIED;
                case 1:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_BASKETS;
                case 2:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EQUITIES;
                case 3:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_DEBT_INSTRUMENTS;
                case 4:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_CURRENCIES;
                case 5:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDICES;
                case 6:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OPTIONS;
                case 7:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_FUTURES;
                case 8:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SWAPS;
                case 9:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INTEREST_RATES;
                case 10:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_STOCK_DIVIDENDS;
                case 11:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_EXTRACTION;
                case 12:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_AGRICULTURE;
                case 13:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_INDUSTRIAL_PRODUCTS;
                case 14:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_SERVICES;
                case 15:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_ENVIRONMENTAL;
                case 16:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_POLYPROPYLENE_PRODUCTS;
                case 17:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_GENERATED_RESOURCES;
                case 18:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_OTHERS;
                case 19:
                    return ProductUnderlyingAsset.PRODUCT_UNDERLYING_ASSET_NOT_APPLICABLE;
                default:
                    return null;
            }
        }
    }

    public static ProductUnderlyingAsset valueOf(String str) {
        return (ProductUnderlyingAsset) Enum.valueOf(ProductUnderlyingAsset.class, str);
    }

    public static ProductUnderlyingAsset[] values() {
        return (ProductUnderlyingAsset[]) $VALUES.clone();
    }
}
