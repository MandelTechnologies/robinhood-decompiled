package com.robinhood.android.notification.data;

import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "", "<init>", "()V", "Exit", "Loading", "ContentReady", "Error", "Lcom/robinhood/android/notification/data/ProductUpsellViewState$ContentReady;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState$Error;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState$Exit;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState$Loading;", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public abstract class ProductUpsellViewState {
    public static final int $stable = 0;

    public /* synthetic */ ProductUpsellViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProductUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewState$Exit;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "<init>", "()V", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Exit extends ProductUpsellViewState {
        public static final int $stable = 0;
        public static final Exit INSTANCE = new Exit();

        private Exit() {
            super(null);
        }
    }

    private ProductUpsellViewState() {
    }

    /* compiled from: ProductUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewState$Loading;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "<init>", "()V", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ProductUpsellViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    /* compiled from: ProductUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewState$ContentReady;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", ProductUpsellResource.CONTENT_TYPE_ID, "Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "<init>", "(Lcom/robinhood/android/notification/data/ProductUpsellViewData;)V", "getProductUpsell", "()Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class ContentReady extends ProductUpsellViewState {
        public static final int $stable = 0;
        private final ProductUpsellViewData productUpsell;

        public static /* synthetic */ ContentReady copy$default(ContentReady contentReady, ProductUpsellViewData productUpsellViewData, int i, Object obj) {
            if ((i & 1) != 0) {
                productUpsellViewData = contentReady.productUpsell;
            }
            return contentReady.copy(productUpsellViewData);
        }

        /* renamed from: component1, reason: from getter */
        public final ProductUpsellViewData getProductUpsell() {
            return this.productUpsell;
        }

        public final ContentReady copy(ProductUpsellViewData productUpsell) {
            Intrinsics.checkNotNullParameter(productUpsell, "productUpsell");
            return new ContentReady(productUpsell);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContentReady) && Intrinsics.areEqual(this.productUpsell, ((ContentReady) other).productUpsell);
        }

        public int hashCode() {
            return this.productUpsell.hashCode();
        }

        public String toString() {
            return "ContentReady(productUpsell=" + this.productUpsell + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ContentReady(ProductUpsellViewData productUpsell) {
            super(null);
            Intrinsics.checkNotNullParameter(productUpsell, "productUpsell");
            this.productUpsell = productUpsell;
        }

        public final ProductUpsellViewData getProductUpsell() {
            return this.productUpsell;
        }
    }

    /* compiled from: ProductUpsellViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellViewState$Error;", "Lcom/robinhood/android/notification/data/ProductUpsellViewState;", "<init>", "()V", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error extends ProductUpsellViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
            super(null);
        }
    }
}
