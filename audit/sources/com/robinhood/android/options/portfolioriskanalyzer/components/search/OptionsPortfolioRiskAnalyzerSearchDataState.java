package com.robinhood.android.options.portfolioriskanalyzer.components.search;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionsPortfolioRiskAnalyzerSearchDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/OptionsPortfolioRiskAnalyzerSearchDataState;", "", "accountNumber", "", "query", "rowItems", "", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/search/SearchRowItemDataState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAccountNumber", "()Ljava/lang/String;", "getQuery", "getRowItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-options-portfolio-risk-analyzer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class OptionsPortfolioRiskAnalyzerSearchDataState {
    public static final int $stable = 8;
    private final String accountNumber;
    private final String query;
    private final List<OptionsPortfolioRiskAnalyzerSearchDataState4> rowItems;

    public OptionsPortfolioRiskAnalyzerSearchDataState() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDataState copy$default(OptionsPortfolioRiskAnalyzerSearchDataState optionsPortfolioRiskAnalyzerSearchDataState, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = optionsPortfolioRiskAnalyzerSearchDataState.accountNumber;
        }
        if ((i & 2) != 0) {
            str2 = optionsPortfolioRiskAnalyzerSearchDataState.query;
        }
        if ((i & 4) != 0) {
            list = optionsPortfolioRiskAnalyzerSearchDataState.rowItems;
        }
        return optionsPortfolioRiskAnalyzerSearchDataState.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccountNumber() {
        return this.accountNumber;
    }

    /* renamed from: component2, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    public final List<OptionsPortfolioRiskAnalyzerSearchDataState4> component3() {
        return this.rowItems;
    }

    public final OptionsPortfolioRiskAnalyzerSearchDataState copy(String accountNumber, String query, List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4> rowItems) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        return new OptionsPortfolioRiskAnalyzerSearchDataState(accountNumber, query, rowItems);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptionsPortfolioRiskAnalyzerSearchDataState)) {
            return false;
        }
        OptionsPortfolioRiskAnalyzerSearchDataState optionsPortfolioRiskAnalyzerSearchDataState = (OptionsPortfolioRiskAnalyzerSearchDataState) other;
        return Intrinsics.areEqual(this.accountNumber, optionsPortfolioRiskAnalyzerSearchDataState.accountNumber) && Intrinsics.areEqual(this.query, optionsPortfolioRiskAnalyzerSearchDataState.query) && Intrinsics.areEqual(this.rowItems, optionsPortfolioRiskAnalyzerSearchDataState.rowItems);
    }

    public int hashCode() {
        return (((this.accountNumber.hashCode() * 31) + this.query.hashCode()) * 31) + this.rowItems.hashCode();
    }

    public String toString() {
        return "OptionsPortfolioRiskAnalyzerSearchDataState(accountNumber=" + this.accountNumber + ", query=" + this.query + ", rowItems=" + this.rowItems + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public OptionsPortfolioRiskAnalyzerSearchDataState(String accountNumber, String query, List<? extends OptionsPortfolioRiskAnalyzerSearchDataState4> rowItems) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(query, "query");
        Intrinsics.checkNotNullParameter(rowItems, "rowItems");
        this.accountNumber = accountNumber;
        this.query = query;
        this.rowItems = rowItems;
    }

    public /* synthetic */ OptionsPortfolioRiskAnalyzerSearchDataState(String str, String str2, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getAccountNumber() {
        return this.accountNumber;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<OptionsPortfolioRiskAnalyzerSearchDataState4> getRowItems() {
        return this.rowItems;
    }
}
