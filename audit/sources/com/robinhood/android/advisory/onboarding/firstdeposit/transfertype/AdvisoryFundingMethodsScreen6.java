package com.robinhood.android.advisory.onboarding.firstdeposit.transfertype;

import com.robinhood.models.advisory.api.contribution.ApiAdvisoryFirstTimeContributionViewModel;
import com.robinhood.models.advisory.api.contribution.PromoViewModel;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFundingMethodsScreen.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage;", "", "Promo", "Selection", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage$Promo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage$Selection;", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.FundingMethodsPage, reason: use source file name */
/* loaded from: classes7.dex */
public interface AdvisoryFundingMethodsScreen6 {

    /* compiled from: AdvisoryFundingMethodsScreen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage$Promo;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/PromoViewModel;", "<init>", "(Lcom/robinhood/models/advisory/api/contribution/PromoViewModel;)V", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/PromoViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.FundingMethodsPage$Promo, reason: from toString */
    public static final /* data */ class Promo implements AdvisoryFundingMethodsScreen6 {
        public static final int $stable = 8;
        private final PromoViewModel viewModel;

        public static /* synthetic */ Promo copy$default(Promo promo, PromoViewModel promoViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                promoViewModel = promo.viewModel;
            }
            return promo.copy(promoViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final PromoViewModel getViewModel() {
            return this.viewModel;
        }

        public final Promo copy(PromoViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new Promo(viewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Promo) && Intrinsics.areEqual(this.viewModel, ((Promo) other).viewModel);
        }

        public int hashCode() {
            return this.viewModel.hashCode();
        }

        public String toString() {
            return "Promo(viewModel=" + this.viewModel + ")";
        }

        public Promo(PromoViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        public final PromoViewModel getViewModel() {
            return this.viewModel;
        }
    }

    /* compiled from: AdvisoryFundingMethodsScreen.kt */
    @Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage$Selection;", "Lcom/robinhood/android/advisory/onboarding/firstdeposit/transfertype/FundingMethodsPage;", "viewModel", "Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "<init>", "(Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;)V", "getViewModel", "()Lcom/robinhood/models/advisory/api/contribution/ApiAdvisoryFirstTimeContributionViewModel;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.onboarding.firstdeposit.transfertype.FundingMethodsPage$Selection, reason: from toString */
    public static final /* data */ class Selection implements AdvisoryFundingMethodsScreen6 {
        public static final int $stable = 8;
        private final ApiAdvisoryFirstTimeContributionViewModel viewModel;

        public static /* synthetic */ Selection copy$default(Selection selection, ApiAdvisoryFirstTimeContributionViewModel apiAdvisoryFirstTimeContributionViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                apiAdvisoryFirstTimeContributionViewModel = selection.viewModel;
            }
            return selection.copy(apiAdvisoryFirstTimeContributionViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiAdvisoryFirstTimeContributionViewModel getViewModel() {
            return this.viewModel;
        }

        public final Selection copy(ApiAdvisoryFirstTimeContributionViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            return new Selection(viewModel);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Selection) && Intrinsics.areEqual(this.viewModel, ((Selection) other).viewModel);
        }

        public int hashCode() {
            return this.viewModel.hashCode();
        }

        public String toString() {
            return "Selection(viewModel=" + this.viewModel + ")";
        }

        public Selection(ApiAdvisoryFirstTimeContributionViewModel viewModel) {
            Intrinsics.checkNotNullParameter(viewModel, "viewModel");
            this.viewModel = viewModel;
        }

        public final ApiAdvisoryFirstTimeContributionViewModel getViewModel() {
            return this.viewModel;
        }
    }
}
