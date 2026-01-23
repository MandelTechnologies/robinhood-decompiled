package com.robinhood.android.advisory.onboarding.retirement.recommendation.selection;

import com.robinhood.android.models.retirement.api.onboarding.RetirementOnboardingIntro;
import com.robinhood.models.advisory.api.ClientActionComponent;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountRecommendationSelectionViewState.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\u0012\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\u0015\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J\t\u0010\u001d\u001a\u00020\bHÆ\u0003J\t\u0010\u001e\u001a\u00020\u000bHÆ\u0003J\t\u0010\u001f\u001a\u00020\rHÆ\u0003J]\u0010 \u001a\u00020\u00002\u0014\b\u0002\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020'HÖ\u0001R\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/selection/AccountRecommendationSelectionViewState;", "", "header", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "recommendedComponent", "Lcom/robinhood/models/advisory/api/ClientActionComponent;", "selfDirectedComponent", "introViewModel", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "accountSelectionIntro", "Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/models/advisory/api/ClientActionComponent;Lcom/robinhood/models/advisory/api/ClientActionComponent;Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;)V", "getHeader", "()Lkotlinx/collections/immutable/ImmutableList;", "getFooter", "getRecommendedComponent", "()Lcom/robinhood/models/advisory/api/ClientActionComponent;", "getSelfDirectedComponent", "getIntroViewModel", "()Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$IntroViewModel;", "getAccountSelectionIntro", "()Lcom/robinhood/android/models/retirement/api/onboarding/RetirementOnboardingIntro$AccountSelection;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class AccountRecommendationSelectionViewState {
    public static final int $stable = 8;
    private final RetirementOnboardingIntro.AccountSelection accountSelectionIntro;
    private final ImmutableList<UIComponent<GenericAction>> footer;
    private final ImmutableList<UIComponent<GenericAction>> header;
    private final ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel;
    private final ClientActionComponent recommendedComponent;
    private final ClientActionComponent selfDirectedComponent;

    public static /* synthetic */ AccountRecommendationSelectionViewState copy$default(AccountRecommendationSelectionViewState accountRecommendationSelectionViewState, ImmutableList immutableList, ImmutableList immutableList2, ClientActionComponent clientActionComponent, ClientActionComponent clientActionComponent2, ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel, RetirementOnboardingIntro.AccountSelection accountSelection, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = accountRecommendationSelectionViewState.header;
        }
        if ((i & 2) != 0) {
            immutableList2 = accountRecommendationSelectionViewState.footer;
        }
        if ((i & 4) != 0) {
            clientActionComponent = accountRecommendationSelectionViewState.recommendedComponent;
        }
        if ((i & 8) != 0) {
            clientActionComponent2 = accountRecommendationSelectionViewState.selfDirectedComponent;
        }
        if ((i & 16) != 0) {
            introViewModel = accountRecommendationSelectionViewState.introViewModel;
        }
        if ((i & 32) != 0) {
            accountSelection = accountRecommendationSelectionViewState.accountSelectionIntro;
        }
        ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel2 = introViewModel;
        RetirementOnboardingIntro.AccountSelection accountSelection2 = accountSelection;
        return accountRecommendationSelectionViewState.copy(immutableList, immutableList2, clientActionComponent, clientActionComponent2, introViewModel2, accountSelection2);
    }

    public final ImmutableList<UIComponent<GenericAction>> component1() {
        return this.header;
    }

    public final ImmutableList<UIComponent<GenericAction>> component2() {
        return this.footer;
    }

    /* renamed from: component3, reason: from getter */
    public final ClientActionComponent getRecommendedComponent() {
        return this.recommendedComponent;
    }

    /* renamed from: component4, reason: from getter */
    public final ClientActionComponent getSelfDirectedComponent() {
        return this.selfDirectedComponent;
    }

    /* renamed from: component5, reason: from getter */
    public final ApiAccountTypeRecommendationIntroViewModel.IntroViewModel getIntroViewModel() {
        return this.introViewModel;
    }

    /* renamed from: component6, reason: from getter */
    public final RetirementOnboardingIntro.AccountSelection getAccountSelectionIntro() {
        return this.accountSelectionIntro;
    }

    public final AccountRecommendationSelectionViewState copy(ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent recommendedComponent, ClientActionComponent selfDirectedComponent, ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel, RetirementOnboardingIntro.AccountSelection accountSelectionIntro) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(recommendedComponent, "recommendedComponent");
        Intrinsics.checkNotNullParameter(selfDirectedComponent, "selfDirectedComponent");
        Intrinsics.checkNotNullParameter(introViewModel, "introViewModel");
        Intrinsics.checkNotNullParameter(accountSelectionIntro, "accountSelectionIntro");
        return new AccountRecommendationSelectionViewState(header, footer, recommendedComponent, selfDirectedComponent, introViewModel, accountSelectionIntro);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccountRecommendationSelectionViewState)) {
            return false;
        }
        AccountRecommendationSelectionViewState accountRecommendationSelectionViewState = (AccountRecommendationSelectionViewState) other;
        return Intrinsics.areEqual(this.header, accountRecommendationSelectionViewState.header) && Intrinsics.areEqual(this.footer, accountRecommendationSelectionViewState.footer) && Intrinsics.areEqual(this.recommendedComponent, accountRecommendationSelectionViewState.recommendedComponent) && Intrinsics.areEqual(this.selfDirectedComponent, accountRecommendationSelectionViewState.selfDirectedComponent) && Intrinsics.areEqual(this.introViewModel, accountRecommendationSelectionViewState.introViewModel) && Intrinsics.areEqual(this.accountSelectionIntro, accountRecommendationSelectionViewState.accountSelectionIntro);
    }

    public int hashCode() {
        return (((((((((this.header.hashCode() * 31) + this.footer.hashCode()) * 31) + this.recommendedComponent.hashCode()) * 31) + this.selfDirectedComponent.hashCode()) * 31) + this.introViewModel.hashCode()) * 31) + this.accountSelectionIntro.hashCode();
    }

    public String toString() {
        return "AccountRecommendationSelectionViewState(header=" + this.header + ", footer=" + this.footer + ", recommendedComponent=" + this.recommendedComponent + ", selfDirectedComponent=" + this.selfDirectedComponent + ", introViewModel=" + this.introViewModel + ", accountSelectionIntro=" + this.accountSelectionIntro + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AccountRecommendationSelectionViewState(ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ClientActionComponent recommendedComponent, ClientActionComponent selfDirectedComponent, ApiAccountTypeRecommendationIntroViewModel.IntroViewModel introViewModel, RetirementOnboardingIntro.AccountSelection accountSelectionIntro) {
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(footer, "footer");
        Intrinsics.checkNotNullParameter(recommendedComponent, "recommendedComponent");
        Intrinsics.checkNotNullParameter(selfDirectedComponent, "selfDirectedComponent");
        Intrinsics.checkNotNullParameter(introViewModel, "introViewModel");
        Intrinsics.checkNotNullParameter(accountSelectionIntro, "accountSelectionIntro");
        this.header = header;
        this.footer = footer;
        this.recommendedComponent = recommendedComponent;
        this.selfDirectedComponent = selfDirectedComponent;
        this.introViewModel = introViewModel;
        this.accountSelectionIntro = accountSelectionIntro;
    }

    public final ImmutableList<UIComponent<GenericAction>> getHeader() {
        return this.header;
    }

    public final ImmutableList<UIComponent<GenericAction>> getFooter() {
        return this.footer;
    }

    public final ClientActionComponent getRecommendedComponent() {
        return this.recommendedComponent;
    }

    public final ClientActionComponent getSelfDirectedComponent() {
        return this.selfDirectedComponent;
    }

    public final ApiAccountTypeRecommendationIntroViewModel.IntroViewModel getIntroViewModel() {
        return this.introViewModel;
    }

    public final RetirementOnboardingIntro.AccountSelection getAccountSelectionIntro() {
        return this.accountSelectionIntro;
    }
}
