package com.robinhood.android.matcha.p177ui.incentives;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.incentives.MatchaIncentivesLearnMoreFragment;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.social.contracts.matcha.MatchaIncentiveLearnMoreFragmentKey;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MatchaIncentivesLearnMoreFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\r\u0010\u000e\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "launchCreateTransaction", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "Companion", "feature-p2p_externalDebug", "viewState", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MatchaIncentivesLearnMoreFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, MatchaIncentivesLearnMoreDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment, int i, Composer composer, int i2) {
        matchaIncentivesLearnMoreFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final MatchaIncentivesLearnMoreDuxo getDuxo() {
        return (MatchaIncentivesLearnMoreDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        requireBaseActivity().hideToolbar();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2144748845);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2144748845, i2, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment.ComposeContent (MatchaIncentivesLearnMoreFragment.kt:33)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1217920264, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1217920264, i3, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment.ComposeContent.<anonymous> (MatchaIncentivesLearnMoreFragment.kt:36)");
                    }
                    ScaffoldKt.m5625Scaffold27mzLpw(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), null, null, null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), 0L, ComposableLambda3.rememberComposableLambda(-897750090, true, new AnonymousClass1(MatchaIncentivesLearnMoreFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 6, 12582912, 98302);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MatchaIncentivesLearnMoreFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<PaddingValues, Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<MatchaIncentivesLearnMoreViewState> $viewState$delegate;
                    final /* synthetic */ MatchaIncentivesLearnMoreFragment this$0;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment, SnapshotState4<? extends MatchaIncentivesLearnMoreViewState> snapshotState4) {
                        this.this$0 = matchaIncentivesLearnMoreFragment;
                        this.$viewState$delegate = snapshotState4;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
                        invoke(paddingValues, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer, int i) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i & 6) == 0) {
                            i |= composer.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-897750090, i, -1, "com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment.ComposeContent.<anonymous>.<anonymous> (MatchaIncentivesLearnMoreFragment.kt:40)");
                        }
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, paddingValues);
                        MatchaIncentivesLearnMoreViewState matchaIncentivesLearnMoreViewStateComposeContent$lambda$0 = MatchaIncentivesLearnMoreFragment.ComposeContent$lambda$0(this.$viewState$delegate);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MatchaIncentivesLearnMoreFragment.C213901.AnonymousClass1.invoke$lambda$1$lambda$0(matchaIncentivesLearnMoreFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function0 function0 = (Function0) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MatchaIncentivesLearnMoreFragment.C213901.AnonymousClass1.invoke$lambda$3$lambda$2(matchaIncentivesLearnMoreFragment2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function0 function02 = (Function0) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MatchaIncentivesLearnMoreFragment.C213901.AnonymousClass1.invoke$lambda$5$lambda$4(matchaIncentivesLearnMoreFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        Function0 function03 = (Function0) objRememberedValue3;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance4 = composer.changedInstance(this.this$0);
                        final MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment4 = this.this$0;
                        Object objRememberedValue4 = composer.rememberedValue();
                        if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$ComposeContent$1$1$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MatchaIncentivesLearnMoreFragment.C213901.AnonymousClass1.invoke$lambda$7$lambda$6(matchaIncentivesLearnMoreFragment4);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                        }
                        composer.endReplaceGroup();
                        MatchaIncentivesLearnMoreComposable.MatchaIncentivesLearnMoreComposable(modifierPadding, matchaIncentivesLearnMoreViewStateComposeContent$lambda$0, function0, function02, function03, (Function0) objRememberedValue4, composer, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment) throws Resources.NotFoundException {
                        Navigator navigator = matchaIncentivesLearnMoreFragment.getNavigator();
                        Context contextRequireContext = matchaIncentivesLearnMoreFragment.requireContext();
                        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                        String string2 = matchaIncentivesLearnMoreFragment.getResources().getString(C21284R.string.matcha_incentives_terms_link);
                        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                        Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, string2);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment) {
                        matchaIncentivesLearnMoreFragment.requireActivity().finish();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment) {
                        matchaIncentivesLearnMoreFragment.launchCreateTransaction(MatchaTransaction.Direction.SEND);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$7$lambda$6(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment) {
                        matchaIncentivesLearnMoreFragment.launchCreateTransaction(MatchaTransaction.Direction.REQUEST);
                        return Unit.INSTANCE;
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.incentives.MatchaIncentivesLearnMoreFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MatchaIncentivesLearnMoreFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void launchCreateTransaction(MatchaTransaction.Direction direction) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new MatchaTransaction.Create(direction, MatchaTransaction.EntryPoint.INCENTIVE_INTRO), null, false, null, null, 60, null);
        requireActivity().finish();
    }

    /* compiled from: MatchaIncentivesLearnMoreFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/incentives/MatchaIncentivesLearnMoreFragment;", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "key", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<MatchaIncentivesLearnMoreFragment, MatchaIncentiveLearnMoreFragmentKey>, FragmentResolver<MatchaIncentiveLearnMoreFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MatchaIncentiveLearnMoreFragmentKey getArgs(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment) {
            return (MatchaIncentiveLearnMoreFragmentKey) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, matchaIncentivesLearnMoreFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MatchaIncentivesLearnMoreFragment newInstance(MatchaIncentiveLearnMoreFragmentKey matchaIncentiveLearnMoreFragmentKey) {
            return (MatchaIncentivesLearnMoreFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, matchaIncentiveLearnMoreFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MatchaIncentivesLearnMoreFragment matchaIncentivesLearnMoreFragment, MatchaIncentiveLearnMoreFragmentKey matchaIncentiveLearnMoreFragmentKey) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, matchaIncentivesLearnMoreFragment, matchaIncentiveLearnMoreFragmentKey);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public MatchaIncentivesLearnMoreFragment createFragment(MatchaIncentiveLearnMoreFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (MatchaIncentivesLearnMoreFragment) newInstance((Parcelable) key);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MatchaIncentivesLearnMoreViewState ComposeContent$lambda$0(SnapshotState4<? extends MatchaIncentivesLearnMoreViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
