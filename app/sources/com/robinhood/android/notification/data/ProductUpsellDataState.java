package com.robinhood.android.notification.data;

import com.robinhood.staticcontent.model.productupsell.ProductUpsellResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductUpsellDataState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/notification/data/ProductUpsellDataState;", "", "loading", "", ProductUpsellResource.CONTENT_TYPE_ID, "Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "upsellNotAllowed", "error", "<init>", "(ZLcom/robinhood/android/notification/data/ProductUpsellViewData;ZZ)V", "getLoading", "()Z", "getProductUpsell", "()Lcom/robinhood/android/notification/data/ProductUpsellViewData;", "getUpsellNotAllowed", "getError", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-product-upsell_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class ProductUpsellDataState {
    public static final int $stable = 0;
    private final boolean error;
    private final boolean loading;
    private final ProductUpsellViewData productUpsell;
    private final boolean upsellNotAllowed;

    public ProductUpsellDataState() {
        this(false, null, false, false, 15, null);
    }

    public static /* synthetic */ ProductUpsellDataState copy$default(ProductUpsellDataState productUpsellDataState, boolean z, ProductUpsellViewData productUpsellViewData, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = productUpsellDataState.loading;
        }
        if ((i & 2) != 0) {
            productUpsellViewData = productUpsellDataState.productUpsell;
        }
        if ((i & 4) != 0) {
            z2 = productUpsellDataState.upsellNotAllowed;
        }
        if ((i & 8) != 0) {
            z3 = productUpsellDataState.error;
        }
        return productUpsellDataState.copy(z, productUpsellViewData, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getLoading() {
        return this.loading;
    }

    /* renamed from: component2, reason: from getter */
    public final ProductUpsellViewData getProductUpsell() {
        return this.productUpsell;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getUpsellNotAllowed() {
        return this.upsellNotAllowed;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getError() {
        return this.error;
    }

    public final ProductUpsellDataState copy(boolean loading, ProductUpsellViewData productUpsell, boolean upsellNotAllowed, boolean error) {
        return new ProductUpsellDataState(loading, productUpsell, upsellNotAllowed, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ProductUpsellDataState)) {
            return false;
        }
        ProductUpsellDataState productUpsellDataState = (ProductUpsellDataState) other;
        return this.loading == productUpsellDataState.loading && Intrinsics.areEqual(this.productUpsell, productUpsellDataState.productUpsell) && this.upsellNotAllowed == productUpsellDataState.upsellNotAllowed && this.error == productUpsellDataState.error;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.loading) * 31;
        ProductUpsellViewData productUpsellViewData = this.productUpsell;
        return ((((iHashCode + (productUpsellViewData == null ? 0 : productUpsellViewData.hashCode())) * 31) + Boolean.hashCode(this.upsellNotAllowed)) * 31) + Boolean.hashCode(this.error);
    }

    public String toString() {
        return "ProductUpsellDataState(loading=" + this.loading + ", productUpsell=" + this.productUpsell + ", upsellNotAllowed=" + this.upsellNotAllowed + ", error=" + this.error + ")";
    }

    public ProductUpsellDataState(boolean z, ProductUpsellViewData productUpsellViewData, boolean z2, boolean z3) {
        this.loading = z;
        this.productUpsell = productUpsellViewData;
        this.upsellNotAllowed = z2;
        this.error = z3;
    }

    public /* synthetic */ ProductUpsellDataState(boolean z, ProductUpsellViewData productUpsellViewData, boolean z2, boolean z3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : productUpsellViewData, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3);
    }

    public final boolean getLoading() {
        return this.loading;
    }

    public final ProductUpsellViewData getProductUpsell() {
        return this.productUpsell;
    }

    public final boolean getUpsellNotAllowed() {
        return this.upsellNotAllowed;
    }

    public final boolean getError() {
        return this.error;
    }
}
