package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowViewState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\r\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowViewState;", "", "tabItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;)V", "getTabItems", "()Lkotlinx/collections/immutable/ImmutableList;", "showSearchIcon", "", "getShowSearchIcon", "()Z", "showNavRow", "getShowNavRow", "component1", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerTopNavRowViewState {
    public static final int $stable = 8;
    private final ImmutableList<NavRowItemViewState> tabItems;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsPortfolioRiskAnalyzerTopNavRowViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsPortfolioRiskAnalyzerTopNavRowViewState copy$default(OptionsPortfolioRiskAnalyzerTopNavRowViewState optionsPortfolioRiskAnalyzerTopNavRowViewState, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = optionsPortfolioRiskAnalyzerTopNavRowViewState.tabItems;
        }
        return optionsPortfolioRiskAnalyzerTopNavRowViewState.copy(immutableList);
    }

    public final ImmutableList<NavRowItemViewState> component1() {
        return this.tabItems;
    }

    public final OptionsPortfolioRiskAnalyzerTopNavRowViewState copy(ImmutableList<NavRowItemViewState> tabItems) {
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        return new OptionsPortfolioRiskAnalyzerTopNavRowViewState(tabItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionsPortfolioRiskAnalyzerTopNavRowViewState) && Intrinsics.areEqual(this.tabItems, ((OptionsPortfolioRiskAnalyzerTopNavRowViewState) other).tabItems);
    }

    public int hashCode() {
        return this.tabItems.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerTopNavRowViewState(tabItems=" + this.tabItems + ")";
    }

    public OptionsPortfolioRiskAnalyzerTopNavRowViewState(ImmutableList<NavRowItemViewState> tabItems) {
        Intrinsics.checkNotNullParameter(tabItems, "tabItems");
        this.tabItems = tabItems;
    }

    public /* synthetic */ OptionsPortfolioRiskAnalyzerTopNavRowViewState(ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? extensions2.persistentListOf() : immutableList);
    }

    public final ImmutableList<NavRowItemViewState> getTabItems() {
        return this.tabItems;
    }

    public final boolean getShowSearchIcon() {
        return this.tabItems.size() > 20;
    }

    public final boolean getShowNavRow() {
        return this.tabItems.size() > 1;
    }
}
