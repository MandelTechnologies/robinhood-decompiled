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
/* compiled from: ProductDelivery.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PRODUCT_DELIVERY_UNSPECIFIED", "PRODUCT_DELIVERY_PHYSICAL", "PRODUCT_DELIVERY_CASH", "PRODUCT_DELIVERY_NON_DELIVERABLE", "PRODUCT_DELIVERY_NOT_APPLICABLE", "Companion", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class ProductDelivery implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductDelivery[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ProductDelivery> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ProductDelivery PRODUCT_DELIVERY_CASH;
    public static final ProductDelivery PRODUCT_DELIVERY_NON_DELIVERABLE;
    public static final ProductDelivery PRODUCT_DELIVERY_NOT_APPLICABLE;
    public static final ProductDelivery PRODUCT_DELIVERY_PHYSICAL;
    public static final ProductDelivery PRODUCT_DELIVERY_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ ProductDelivery[] $values() {
        return new ProductDelivery[]{PRODUCT_DELIVERY_UNSPECIFIED, PRODUCT_DELIVERY_PHYSICAL, PRODUCT_DELIVERY_CASH, PRODUCT_DELIVERY_NON_DELIVERABLE, PRODUCT_DELIVERY_NOT_APPLICABLE};
    }

    @JvmStatic
    public static final ProductDelivery fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ProductDelivery> getEntries() {
        return $ENTRIES;
    }

    private ProductDelivery(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ProductDelivery productDelivery = new ProductDelivery("PRODUCT_DELIVERY_UNSPECIFIED", 0, 0);
        PRODUCT_DELIVERY_UNSPECIFIED = productDelivery;
        PRODUCT_DELIVERY_PHYSICAL = new ProductDelivery("PRODUCT_DELIVERY_PHYSICAL", 1, 1);
        PRODUCT_DELIVERY_CASH = new ProductDelivery("PRODUCT_DELIVERY_CASH", 2, 2);
        PRODUCT_DELIVERY_NON_DELIVERABLE = new ProductDelivery("PRODUCT_DELIVERY_NON_DELIVERABLE", 3, 3);
        PRODUCT_DELIVERY_NOT_APPLICABLE = new ProductDelivery("PRODUCT_DELIVERY_NOT_APPLICABLE", 4, 4);
        ProductDelivery[] productDeliveryArr$values = $values();
        $VALUES = productDeliveryArr$values;
        $ENTRIES = EnumEntries2.enumEntries(productDeliveryArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ProductDelivery.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ProductDelivery>(orCreateKotlinClass, syntax, productDelivery) { // from class: com.robinhood.arsenal.proto.v1.idl.ProductDelivery$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ProductDelivery fromValue(int value) {
                return ProductDelivery.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ProductDelivery.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/arsenal/proto/v1/idl/ProductDelivery;", "fromValue", "value", "", "arsenal.v1.public_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ProductDelivery fromValue(int value) {
            if (value == 0) {
                return ProductDelivery.PRODUCT_DELIVERY_UNSPECIFIED;
            }
            if (value == 1) {
                return ProductDelivery.PRODUCT_DELIVERY_PHYSICAL;
            }
            if (value == 2) {
                return ProductDelivery.PRODUCT_DELIVERY_CASH;
            }
            if (value == 3) {
                return ProductDelivery.PRODUCT_DELIVERY_NON_DELIVERABLE;
            }
            if (value != 4) {
                return null;
            }
            return ProductDelivery.PRODUCT_DELIVERY_NOT_APPLICABLE;
        }
    }

    public static ProductDelivery valueOf(String str) {
        return (ProductDelivery) Enum.valueOf(ProductDelivery.class, str);
    }

    public static ProductDelivery[] values() {
        return (ProductDelivery[]) $VALUES.clone();
    }
}
