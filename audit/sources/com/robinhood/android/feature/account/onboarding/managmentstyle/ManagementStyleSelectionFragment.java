package com.robinhood.android.feature.account.onboarding.managmentstyle;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionCallbacks;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionFragmentKey;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KFunction;
import kotlin.reflect.KProperty;

/* compiled from: ManagementStyleSelectionFragment.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "callbacks", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "getCallbacks", "()Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ManagementStyleSelectionFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(ManagementStyleSelectionCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ManagementStyleSelectionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(ManagementStyleSelectionFragment managementStyleSelectionFragment, int i, Composer composer, int i2) {
        managementStyleSelectionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ManagementStyleSelectionCallbacks getCallbacks() {
        return (ManagementStyleSelectionCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    /* compiled from: ManagementStyleSelectionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment$ComposeContent$1 */
    static final class C166861 implements Function2<Composer, Integer, Unit> {
        C166861() {
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
                ComposerKt.traceEventStart(1101032782, i, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment.ComposeContent.<anonymous> (ManagementStyleSelectionFragment.kt:25)");
            }
            ManagementStyleSelectionCallbacks callbacks = ManagementStyleSelectionFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(callbacks);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new ManagementStyleSelectionFragment2(callbacks);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function1 function1 = (Function1) ((KFunction) objRememberedValue);
            ManagementStyleSelectionCallbacks callbacks2 = ManagementStyleSelectionFragment.this.getCallbacks();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(callbacks2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new ManagementStyleSelectionFragment3(callbacks2);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            Function1 function12 = (Function1) ((KFunction) objRememberedValue2);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(ManagementStyleSelectionFragment.this);
            final ManagementStyleSelectionFragment managementStyleSelectionFragment = ManagementStyleSelectionFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ManagementStyleSelectionFragment.C166861.invoke$lambda$3$lambda$2(managementStyleSelectionFragment);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            ManagementStyleSelectionComposable4.ManagementStyleSelectionComposable(function1, function12, (Function0) objRememberedValue3, null, null, composer, 0, 24);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(ManagementStyleSelectionFragment managementStyleSelectionFragment) {
            managementStyleSelectionFragment.requireBaseActivity().onBackPressed();
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1862196218);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1862196218, i2, -1, "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment.ComposeContent (ManagementStyleSelectionFragment.kt:23)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1101032782, true, new C166861(), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ManagementStyleSelectionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: ManagementStyleSelectionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionFragment;", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionFragmentKey;", "<init>", "()V", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<ManagementStyleSelectionFragment, ManagementStyleSelectionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(ManagementStyleSelectionFragmentKey managementStyleSelectionFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, managementStyleSelectionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public ManagementStyleSelectionFragmentKey getArgs(ManagementStyleSelectionFragment managementStyleSelectionFragment) {
            return (ManagementStyleSelectionFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, managementStyleSelectionFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ManagementStyleSelectionFragment newInstance(ManagementStyleSelectionFragmentKey managementStyleSelectionFragmentKey) {
            return (ManagementStyleSelectionFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, managementStyleSelectionFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ManagementStyleSelectionFragment managementStyleSelectionFragment, ManagementStyleSelectionFragmentKey managementStyleSelectionFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, managementStyleSelectionFragment, managementStyleSelectionFragmentKey);
        }
    }
}
