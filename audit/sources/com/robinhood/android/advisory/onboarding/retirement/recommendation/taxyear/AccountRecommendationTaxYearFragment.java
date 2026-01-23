package com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.AccountRecommendationCallbacks;
import com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.regiongate.AdvisoryRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RetirementRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.advisory.api.onboarding.recommendation.ApiAccountTypeRecommendationIntroViewModel;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: AccountRecommendationTaxYearFragment.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u000b\u001a\u00020\fH\u0017¢\u0006\u0002\u0010\rJ\t\u0010\u000e\u001a\u00020\u000fH\u0096\u0001R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/taxyear/AccountRecommendationTaxYearFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "getCallbacks", "()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AccountRecommendationTaxYearFragment extends GenericComposeFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(RetirementRegionGate.INSTANCE, AdvisoryRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AccountRecommendationCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AccountRecommendationTaxYearFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/AccountRecommendationCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment, int i, Composer composer, int i2) {
        accountRecommendationTaxYearFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AccountRecommendationCallbacks getCallbacks() {
        return (AccountRecommendationCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1756550881);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1756550881, i2, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment.ComposeContent (AccountRecommendationTaxYearFragment.kt:23)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-275481930, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment.ComposeContent.1

                /* compiled from: AccountRecommendationTaxYearFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ AccountRecommendationTaxYearFragment this$0;

                    AnonymousClass1(AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment) {
                        this.this$0 = accountRecommendationTaxYearFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1492190648, i, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment.ComposeContent.<anonymous>.<anonymous> (AccountRecommendationTaxYearFragment.kt:26)");
                        }
                        TaxYearSelectionViewState viewState = AccountRecommendationTaxYearScreen.toViewState((ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel) AccountRecommendationTaxYearFragment.INSTANCE.getArgs((Fragment) this.this$0));
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountRecommendationTaxYearFragment.C91151.AnonymousClass1.invoke$lambda$1$lambda$0(accountRecommendationTaxYearFragment, (String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        AccountRecommendationTaxYearScreen.TaxYearSelectionScreen(viewState, (Function1) objRememberedValue, null, composer, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment, String context) {
                        Intrinsics.checkNotNullParameter(context, "context");
                        accountRecommendationTaxYearFragment.getCallbacks().onTaxYearSelected(context);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-275481930, i3, -1, "com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment.ComposeContent.<anonymous> (AccountRecommendationTaxYearFragment.kt:25)");
                    }
                    GenericActionHandlerKt.GenericActionHandler(null, false, null, AccountRecommendationTaxYearFragment.this.getNavigator(), ComposableLambda3.rememberComposableLambda(-1492190648, true, new AnonymousClass1(AccountRecommendationTaxYearFragment.this), composer2, 54), composer2, 24576, 7);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.onboarding.retirement.recommendation.taxyear.AccountRecommendationTaxYearFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountRecommendationTaxYearFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountRecommendationTaxYearFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/taxyear/AccountRecommendationTaxYearFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/advisory/onboarding/retirement/recommendation/taxyear/AccountRecommendationTaxYearFragment;", "Lcom/robinhood/models/advisory/api/onboarding/recommendation/ApiAccountTypeRecommendationIntroViewModel$MultiYearViewModel;", "<init>", "()V", "feature-advisory-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<AccountRecommendationTaxYearFragment, ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel getArgs(AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment) {
            return (ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, accountRecommendationTaxYearFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountRecommendationTaxYearFragment newInstance(ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel multiYearViewModel) {
            return (AccountRecommendationTaxYearFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, multiYearViewModel);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountRecommendationTaxYearFragment accountRecommendationTaxYearFragment, ApiAccountTypeRecommendationIntroViewModel.MultiYearViewModel multiYearViewModel) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, accountRecommendationTaxYearFragment, multiYearViewModel);
        }
    }
}
