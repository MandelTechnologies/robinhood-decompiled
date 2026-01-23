package com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear;

import com.robinhood.models.advisory.api.ClientActionComponent;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountRecommendationTaxYearScreen.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/taxyear/TaxYearSelectionViewState;", "", "header", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "options", "Lcom/robinhood/models/advisory/api/ClientActionComponent;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getHeader", "()Lkotlinx/collections/immutable/ImmutableList;", "getOptions", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TaxYearSelectionViewState {
    public static final int $stable = 8;
    private final ImmutableList<UIComponent<GenericAction>> header;
    private final ImmutableList<ClientActionComponent> options;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxYearSelectionViewState copy$default(TaxYearSelectionViewState taxYearSelectionViewState, ImmutableList immutableList, ImmutableList immutableList2, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = taxYearSelectionViewState.header;
        }
        if ((i & 2) != 0) {
            immutableList2 = taxYearSelectionViewState.options;
        }
        return taxYearSelectionViewState.copy(immutableList, immutableList2);
    }

    public final ImmutableList<UIComponent<GenericAction>> component1() {
        return this.header;
    }

    public final ImmutableList<ClientActionComponent> component2() {
        return this.options;
    }

    public final TaxYearSelectionViewState copy(ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<ClientActionComponent> options) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(options, "options");
        return new TaxYearSelectionViewState(header, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TaxYearSelectionViewState)) {
            return false;
        }
        TaxYearSelectionViewState taxYearSelectionViewState = (TaxYearSelectionViewState) other;
        return Intrinsics.areEqual(this.header, taxYearSelectionViewState.header) && Intrinsics.areEqual(this.options, taxYearSelectionViewState.options);
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.options.hashCode();
    }

    public String toString() {
        return "TaxYearSelectionViewState(header=" + this.header + ", options=" + this.options + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public TaxYearSelectionViewState(ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<ClientActionComponent> options) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(options, "options");
        this.header = header;
        this.options = options;
    }

    public final ImmutableList<UIComponent<GenericAction>> getHeader() {
        return this.header;
    }

    public final ImmutableList<ClientActionComponent> getOptions() {
        return this.options;
    }
}
