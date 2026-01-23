package com.robinhood.android.advisory.onboarding.retirement.recommendation.results;

import com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsViewState;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.advisory.api.ClientActionComponent;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationResults;
import com.robinhood.models.api.BrokerageAccountType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Year;

/* compiled from: AccountRecommendationResultsDataState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;", "", "results", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationResults;", "error", "", "<init>", "(Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationResults;Ljava/lang/Throwable;)V", "getResults", "()Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationResults;", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Provider", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRecommendationResultsDataState {
    private final Throwable error;
    private final ApiAccountTypeRecommendationResults results;

    /* renamed from: Provider, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public AccountRecommendationResultsDataState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ AccountRecommendationResultsDataState copy$default(AccountRecommendationResultsDataState accountRecommendationResultsDataState, ApiAccountTypeRecommendationResults apiAccountTypeRecommendationResults, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            apiAccountTypeRecommendationResults = accountRecommendationResultsDataState.results;
        }
        if ((i & 2) != 0) {
            th = accountRecommendationResultsDataState.error;
        }
        return accountRecommendationResultsDataState.copy(apiAccountTypeRecommendationResults, th);
    }

    /* renamed from: component1, reason: from getter */
    public final ApiAccountTypeRecommendationResults getResults() {
        return this.results;
    }

    /* renamed from: component2, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final AccountRecommendationResultsDataState copy(ApiAccountTypeRecommendationResults results, Throwable error) {
        return new AccountRecommendationResultsDataState(results, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRecommendationResultsDataState)) {
            return false;
        }
        AccountRecommendationResultsDataState accountRecommendationResultsDataState = (AccountRecommendationResultsDataState) other;
        return Intrinsics.areEqual(this.results, accountRecommendationResultsDataState.results) && Intrinsics.areEqual(this.error, accountRecommendationResultsDataState.error);
    }

    public int hashCode() {
        ApiAccountTypeRecommendationResults apiAccountTypeRecommendationResults = this.results;
        int iHashCode = (apiAccountTypeRecommendationResults == null ? 0 : apiAccountTypeRecommendationResults.hashCode()) * 31;
        Throwable th = this.error;
        return iHashCode + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "AccountRecommendationResultsDataState(results=" + this.results + ", error=" + this.error + ")";
    }

    public AccountRecommendationResultsDataState(ApiAccountTypeRecommendationResults apiAccountTypeRecommendationResults, Throwable th) {
        this.results = apiAccountTypeRecommendationResults;
        this.error = th;
    }

    public /* synthetic */ AccountRecommendationResultsDataState(ApiAccountTypeRecommendationResults apiAccountTypeRecommendationResults, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : apiAccountTypeRecommendationResults, (i & 2) != 0 ? null : th);
    }

    public final ApiAccountTypeRecommendationResults getResults() {
        return this.results;
    }

    public final Throwable getError() {
        return this.error;
    }

    /* compiled from: AccountRecommendationResultsDataState.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState$Provider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsDataState;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/results/AccountRecommendationResultsViewState;", "<init>", "()V", "reduce", "dataState", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.results.AccountRecommendationResultsDataState$Provider, reason: from kotlin metadata */
    public static final class Companion implements StateProvider<AccountRecommendationResultsDataState, AccountRecommendationResultsViewState> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.StateProvider
        public AccountRecommendationResultsViewState reduce(AccountRecommendationResultsDataState dataState) {
            Object next;
            Intrinsics.checkNotNullParameter(dataState, "dataState");
            ApiAccountTypeRecommendationResults results = dataState.getResults();
            Throwable error = dataState.getError();
            if (results instanceof ApiAccountTypeRecommendationResults.Eligible) {
                ApiAccountTypeRecommendationResults.EligibleViewModel view_model = ((ApiAccountTypeRecommendationResults.Eligible) results).getView_model();
                Iterator<T> it = view_model.getOptions().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((ApiAccountTypeRecommendationResults.AccountTypeOption) next).getRecommended()) {
                        break;
                    }
                }
                ApiAccountTypeRecommendationResults.AccountTypeOption accountTypeOption = (ApiAccountTypeRecommendationResults.AccountTypeOption) next;
                if (accountTypeOption == null) {
                    accountTypeOption = (ApiAccountTypeRecommendationResults.AccountTypeOption) CollectionsKt.first((List) view_model.getOptions());
                }
                String logging_identifier = view_model.getLogging_identifier();
                ImmutableList immutableList = extensions2.toImmutableList(view_model.getHeader());
                ImmutableList immutableList2 = extensions2.toImmutableList(view_model.getFooter());
                ClientActionComponent cta = view_model.getCta();
                BrokerageAccountType brokerage_account_type = accountTypeOption.getBrokerage_account_type();
                List<ApiAccountTypeRecommendationResults.AccountTypeOption> options = view_model.getOptions();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(options, 10));
                for (ApiAccountTypeRecommendationResults.AccountTypeOption accountTypeOption2 : options) {
                    BrokerageAccountType brokerage_account_type2 = accountTypeOption2.getBrokerage_account_type();
                    String title = accountTypeOption2.getTitle();
                    ImmutableList immutableList3 = extensions2.toImmutableList(accountTypeOption2.getValue_props());
                    String recommendation_label = accountTypeOption2.getRecommendation_label();
                    if (recommendation_label == null || !accountTypeOption2.getRecommended()) {
                        recommendation_label = null;
                    }
                    arrayList.add(new AccountRecommendationResultsViewState.AccountTypeOption(brokerage_account_type2, title, immutableList3, recommendation_label));
                }
                ImmutableList immutableList4 = extensions2.toImmutableList(arrayList);
                Year yearM3433of = Year.m3433of(view_model.getTax_year());
                Intrinsics.checkNotNullExpressionValue(yearM3433of, "of(...)");
                return new AccountRecommendationResultsViewState.Eligible(logging_identifier, immutableList, immutableList2, cta, immutableList4, brokerage_account_type, yearM3433of);
            }
            if (results instanceof ApiAccountTypeRecommendationResults.Ineligible) {
                ApiAccountTypeRecommendationResults.IneligibleViewModel view_model2 = ((ApiAccountTypeRecommendationResults.Ineligible) results).getView_model();
                return new AccountRecommendationResultsViewState.Ineligible(view_model2.getLogging_identifier(), extensions2.toImmutableList(view_model2.getContent()), view_model2.getCta());
            }
            if (results != null) {
                throw new NoWhenBranchMatchedException();
            }
            if (error != null) {
                return AccountRecommendationResultsViewState.Failure.INSTANCE;
            }
            return AccountRecommendationResultsViewState.Loading.INSTANCE;
        }
    }
}
