package com.robinhood.android.notification.data;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductUpsellActionType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "", "actionType", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getActionType", "()Ljava/lang/String;", "REQUEST_NOTIFICATION_PERMISSION", "DISMISS", "DEEPLINK", "UNKNOWN", "Companion", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ProductUpsellActionType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductUpsellActionType[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String actionType;
    public static final ProductUpsellActionType REQUEST_NOTIFICATION_PERMISSION = new ProductUpsellActionType("REQUEST_NOTIFICATION_PERMISSION", 0, "requestNotifications");
    public static final ProductUpsellActionType DISMISS = new ProductUpsellActionType("DISMISS", 1, "dismiss");
    public static final ProductUpsellActionType DEEPLINK = new ProductUpsellActionType("DEEPLINK", 2, "deeplink");
    public static final ProductUpsellActionType UNKNOWN = new ProductUpsellActionType("UNKNOWN", 3, "unknown");

    private static final /* synthetic */ ProductUpsellActionType[] $values() {
        return new ProductUpsellActionType[]{REQUEST_NOTIFICATION_PERMISSION, DISMISS, DEEPLINK, UNKNOWN};
    }

    public static EnumEntries<ProductUpsellActionType> getEntries() {
        return $ENTRIES;
    }

    private ProductUpsellActionType(String str, int i, String str2) {
        this.actionType = str2;
    }

    public final String getActionType() {
        return this.actionType;
    }

    static {
        ProductUpsellActionType[] productUpsellActionTypeArr$values = $values();
        $VALUES = productUpsellActionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(productUpsellActionTypeArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: ProductUpsellActionType.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellActionType$Companion;", "", "<init>", "()V", "fromString", "Lcom/robinhood/android/notification/data/ProductUpsellActionType;", "actionType", "", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ProductUpsellActionType fromString(String actionType) {
            ProductUpsellActionType productUpsellActionType;
            if (actionType == null) {
                return ProductUpsellActionType.UNKNOWN;
            }
            ProductUpsellActionType[] productUpsellActionTypeArrValues = ProductUpsellActionType.values();
            int length = productUpsellActionTypeArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    productUpsellActionType = null;
                    break;
                }
                productUpsellActionType = productUpsellActionTypeArrValues[i];
                if (Intrinsics.areEqual(productUpsellActionType.getActionType(), actionType)) {
                    break;
                }
                i++;
            }
            return productUpsellActionType == null ? ProductUpsellActionType.UNKNOWN : productUpsellActionType;
        }
    }

    public static ProductUpsellActionType valueOf(String str) {
        return (ProductUpsellActionType) Enum.valueOf(ProductUpsellActionType.class, str);
    }

    public static ProductUpsellActionType[] values() {
        return (ProductUpsellActionType[]) $VALUES.clone();
    }
}
