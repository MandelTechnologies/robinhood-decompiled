package com.robinhood.android.cash.rewards.p074ui.onboarding;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.CryptoAccountStore;
import com.robinhood.librobinhood.data.store.identi.InvestmentProfileStore;
import com.robinhood.recurring.models.p365db.InvestmentTarget;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RewardsOnboardingAssetSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\nJ\u0006\u0010\u000f\u001a\u00020\nJ\u0006\u0010\u0010\u001a\u00020\nJ\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/rewards/ui/onboarding/RewardsOnboardingAssetSelectionViewState;", "cryptoAccountStore", "Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;", "investmentProfileStore", "Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;", "<init>", "(Lcom/robinhood/librobinhood/data/store/CryptoAccountStore;Lcom/robinhood/librobinhood/data/store/identi/InvestmentProfileStore;)V", "onCreate", "", "onAssetSelected", "investmentTarget", "Lcom/robinhood/recurring/models/db/InvestmentTarget;", "onReviewCryptoAgreement", "onVerifySuitability", "onContinueSuitabilitySuccess", "onContinueCryptoAgreementSuccess", "feature-cash-rewards_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class RewardsOnboardingAssetSelectionDuxo extends OldBaseDuxo<RewardsOnboardingAssetSelectionViewState> {
    public static final int $stable = 8;
    private final CryptoAccountStore cryptoAccountStore;
    private final InvestmentProfileStore investmentProfileStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RewardsOnboardingAssetSelectionDuxo(CryptoAccountStore cryptoAccountStore, InvestmentProfileStore investmentProfileStore) {
        super(new RewardsOnboardingAssetSelectionViewState(null, null, null, null, null, null, null, null, 255, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(cryptoAccountStore, "cryptoAccountStore");
        Intrinsics.checkNotNullParameter(investmentProfileStore, "investmentProfileStore");
        this.cryptoAccountStore = cryptoAccountStore;
        this.investmentProfileStore = investmentProfileStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        this.cryptoAccountStore.refresh(true);
        this.investmentProfileStore.refreshQuestionnaireCompleted(QuestionnaireContexts.SUITABILITY, null, true);
        Observable<Boolean> observableDistinctUntilChanged = this.investmentProfileStore.getQuestionnaireCompleted(QuestionnaireContexts.SUITABILITY, null).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onCreate$lambda$1(this.f$0, (Boolean) obj);
            }
        });
        Observable observableDistinctUntilChanged2 = asObservable(this.cryptoAccountStore.streamAccountOptional()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged2, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableDistinctUntilChanged2, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onCreate$lambda$3(this.f$0, (Optional) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(RewardsOnboardingAssetSelectionDuxo rewardsOnboardingAssetSelectionDuxo, final Boolean bool) {
        rewardsOnboardingAssetSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onCreate$lambda$1$lambda$0(bool, (RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onCreate$lambda$1$lambda$0(Boolean bool, RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, null, bool, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$3(RewardsOnboardingAssetSelectionDuxo rewardsOnboardingAssetSelectionDuxo, final Optional optional) {
        rewardsOnboardingAssetSelectionDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onCreate$lambda$3$lambda$2(optional, (RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onCreate$lambda$3$lambda$2(Optional optional, RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, optional, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, null);
    }

    public final void onAssetSelected(final InvestmentTarget investmentTarget) {
        Intrinsics.checkNotNullParameter(investmentTarget, "investmentTarget");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onAssetSelected$lambda$4(investmentTarget, (RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onAssetSelected$lambda$4(InvestmentTarget investmentTarget, RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, investmentTarget, new UiEvent(Unit.INSTANCE), null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, null);
    }

    public final void onReviewCryptoAgreement() {
        this.cryptoAccountStore.refreshIfNull();
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onReviewCryptoAgreement$lambda$5((RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onReviewCryptoAgreement$lambda$5(RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, null);
    }

    public final void onVerifySuitability() {
        this.investmentProfileStore.refreshQuestionnaireCompleted(QuestionnaireContexts.SUITABILITY, "", true);
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onVerifySuitability$lambda$6((RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onVerifySuitability$lambda$6(RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, null, null, new UiEvent(Unit.INSTANCE), null, null, null, 239, null);
    }

    public final void onContinueSuitabilitySuccess() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onContinueSuitabilitySuccess$lambda$7((RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onContinueSuitabilitySuccess$lambda$7(RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), null, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, null);
    }

    public final void onContinueCryptoAgreementSuccess() {
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.rewards.ui.onboarding.RewardsOnboardingAssetSelectionDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RewardsOnboardingAssetSelectionDuxo.onContinueCryptoAgreementSuccess$lambda$8((RewardsOnboardingAssetSelectionViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RewardsOnboardingAssetSelectionViewState onContinueCryptoAgreementSuccess$lambda$8(RewardsOnboardingAssetSelectionViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return RewardsOnboardingAssetSelectionViewState.copy$default(applyMutation, null, null, null, null, null, null, null, new UiEvent(Unit.INSTANCE), EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }
}
