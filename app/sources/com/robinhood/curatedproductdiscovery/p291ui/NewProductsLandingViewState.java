package com.robinhood.curatedproductdiscovery.p291ui;

import com.robinhood.curatedproductdiscovery.p291ui.NewProductsLandingDataState;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: NewProductsLandingViewState.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingViewState;", "", "status", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;", "newProductCards", "", "Lcom/robinhood/curatedproductdiscovery/ui/NewProductCardData;", "<init>", "(Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;Ljava/util/List;)V", "getStatus", "()Lcom/robinhood/curatedproductdiscovery/ui/NewProductsLandingDataState$Status;", "getNewProductCards", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-curated-product-discovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NewProductsLandingViewState {
    public static final int $stable = 8;
    private final List<NewProductCardData> newProductCards;
    private final NewProductsLandingDataState.Status status;

    /* JADX WARN: Multi-variable type inference failed */
    public NewProductsLandingViewState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NewProductsLandingViewState copy$default(NewProductsLandingViewState newProductsLandingViewState, NewProductsLandingDataState.Status status, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            status = newProductsLandingViewState.status;
        }
        if ((i & 2) != 0) {
            list = newProductsLandingViewState.newProductCards;
        }
        return newProductsLandingViewState.copy(status, list);
    }

    /* renamed from: component1, reason: from getter */
    public final NewProductsLandingDataState.Status getStatus() {
        return this.status;
    }

    public final List<NewProductCardData> component2() {
        return this.newProductCards;
    }

    public final NewProductsLandingViewState copy(NewProductsLandingDataState.Status status, List<NewProductCardData> newProductCards) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(newProductCards, "newProductCards");
        return new NewProductsLandingViewState(status, newProductCards);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NewProductsLandingViewState)) {
            return false;
        }
        NewProductsLandingViewState newProductsLandingViewState = (NewProductsLandingViewState) other;
        return this.status == newProductsLandingViewState.status && Intrinsics.areEqual(this.newProductCards, newProductsLandingViewState.newProductCards);
    }

    public int hashCode() {
        return (this.status.hashCode() * 31) + this.newProductCards.hashCode();
    }

    public String toString() {
        return "NewProductsLandingViewState(status=" + this.status + ", newProductCards=" + this.newProductCards + ")";
    }

    public NewProductsLandingViewState(NewProductsLandingDataState.Status status, List<NewProductCardData> newProductCards) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(newProductCards, "newProductCards");
        this.status = status;
        this.newProductCards = newProductCards;
    }

    public /* synthetic */ NewProductsLandingViewState(NewProductsLandingDataState.Status status, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? NewProductsLandingDataState.Status.LOADING : status, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final NewProductsLandingDataState.Status getStatus() {
        return this.status;
    }

    public final List<NewProductCardData> getNewProductCards() {
        return this.newProductCards;
    }
}
