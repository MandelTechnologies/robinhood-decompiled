package com.robinhood.android.creditcard.p091ui.creditapplication.address.search;

import com.google.android.libraries.places.api.model.AutocompletePrediction;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchAddressViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J-\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/address/search/SearchAddressViewState;", "", "isLoading", "", "predictions", "", "Lcom/google/android/libraries/places/api/model/AutocompletePrediction;", "showError", "<init>", "(ZLjava/util/List;Z)V", "()Z", "getPredictions", "()Ljava/util/List;", "getShowError", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class SearchAddressViewState {
    public static final int $stable = 8;
    private final boolean isLoading;
    private final List<AutocompletePrediction> predictions;
    private final boolean showError;

    public SearchAddressViewState() {
        this(false, null, false, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SearchAddressViewState copy$default(SearchAddressViewState searchAddressViewState, boolean z, List list, boolean z2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = searchAddressViewState.isLoading;
        }
        if ((i & 2) != 0) {
            list = searchAddressViewState.predictions;
        }
        if ((i & 4) != 0) {
            z2 = searchAddressViewState.showError;
        }
        return searchAddressViewState.copy(z, list, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final List<AutocompletePrediction> component2() {
        return this.predictions;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getShowError() {
        return this.showError;
    }

    public final SearchAddressViewState copy(boolean isLoading, List<? extends AutocompletePrediction> predictions, boolean showError) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        return new SearchAddressViewState(isLoading, predictions, showError);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchAddressViewState)) {
            return false;
        }
        SearchAddressViewState searchAddressViewState = (SearchAddressViewState) other;
        return this.isLoading == searchAddressViewState.isLoading && Intrinsics.areEqual(this.predictions, searchAddressViewState.predictions) && this.showError == searchAddressViewState.showError;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.isLoading) * 31) + this.predictions.hashCode()) * 31) + Boolean.hashCode(this.showError);
    }

    public String toString() {
        return "SearchAddressViewState(isLoading=" + this.isLoading + ", predictions=" + this.predictions + ", showError=" + this.showError + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SearchAddressViewState(boolean z, List<? extends AutocompletePrediction> predictions, boolean z2) {
        Intrinsics.checkNotNullParameter(predictions, "predictions");
        this.isLoading = z;
        this.predictions = predictions;
        this.showError = z2;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public /* synthetic */ SearchAddressViewState(boolean z, List list, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? false : z2);
    }

    public final List<AutocompletePrediction> getPredictions() {
        return this.predictions;
    }

    public final boolean getShowError() {
        return this.showError;
    }
}
