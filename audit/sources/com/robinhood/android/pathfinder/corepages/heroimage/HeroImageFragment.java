package com.robinhood.android.pathfinder.corepages.heroimage;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment;
import com.robinhood.android.pathfinder.corepages.heroimage.HeroImageViewState;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.models.api.pathfinder.contexts.CtaActionType;
import com.robinhood.models.api.pathfinder.contexts.LegacyCtaAction;
import com.robinhood.models.api.pathfinder.contexts.LegacyCtaValue;
import com.robinhood.shared.support.contracts.pathfinder.HeroImageFragmentKey;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: HeroImageFragment.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageDuxo;", "getDuxo", "()Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onClickCta", "ctaAction", "Lcom/robinhood/models/api/pathfinder/contexts/LegacyCtaAction;", "inputUpdateSource", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState$Loaded$InputUpdateSource;", "Companion", "feature-pathfinder-core-pages_externalDebug", "state", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class HeroImageFragment extends GenericComposeFragment {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(HeroImageFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, HeroImageDuxo.class);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: HeroImageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CtaActionType.values().length];
            try {
                iArr[CtaActionType.END_INQUIRY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CtaActionType.UPDATE_INQUIRY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CtaActionType.LINK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CtaActionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(HeroImageFragment heroImageFragment, int i, Composer composer, int i2) {
        heroImageFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final HeroImageDuxo getDuxo() {
        return (HeroImageDuxo) this.duxo.getValue();
    }

    private final PathfinderFragmentCallbacks getCallbacks() {
        return (PathfinderFragmentCallbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1227936742);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1227936742, i2, -1, "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment.ComposeContent (HeroImageFragment.kt:26)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1328720859, true, new C253181(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return HeroImageFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: HeroImageFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$ComposeContent$1 */
    static final class C253181 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<HeroImageViewState> $state$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C253181(SnapshotState4<? extends HeroImageViewState> snapshotState4) {
            this.$state$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-1328720859, i, -1, "com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment.ComposeContent.<anonymous> (HeroImageFragment.kt:30)");
            }
            HeroImageViewState heroImageViewStateComposeContent$lambda$0 = HeroImageFragment.ComposeContent$lambda$0(this.$state$delegate);
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(HeroImageFragment.this);
            final HeroImageFragment heroImageFragment = HeroImageFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HeroImageFragment.C253181.invoke$lambda$1$lambda$0(heroImageFragment, (LegacyCtaAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(HeroImageFragment.this);
            final HeroImageFragment heroImageFragment2 = HeroImageFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return HeroImageFragment.C253181.invoke$lambda$3$lambda$2(heroImageFragment2, (LegacyCtaAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function12 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance3 = composer.changedInstance(HeroImageFragment.this);
            final HeroImageFragment heroImageFragment3 = HeroImageFragment.this;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.pathfinder.corepages.heroimage.HeroImageFragment$ComposeContent$1$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return HeroImageFragment.C253181.invoke$lambda$5$lambda$4(heroImageFragment3);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            HeroImageComposable.HeroImageComposable(heroImageViewStateComposeContent$lambda$0, function1, function12, (Function0) objRememberedValue3, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(HeroImageFragment heroImageFragment, LegacyCtaAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            heroImageFragment.onClickCta(action, HeroImageViewState.Loaded.InputUpdateSource.PRIMARY);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(HeroImageFragment heroImageFragment, LegacyCtaAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            heroImageFragment.onClickCta(action, HeroImageViewState.Loaded.InputUpdateSource.SECONDARY);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(HeroImageFragment heroImageFragment) {
            heroImageFragment.getDuxo().dismissError$feature_pathfinder_core_pages_externalDebug();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClickCta(LegacyCtaAction ctaAction, HeroImageViewState.Loaded.InputUpdateSource inputUpdateSource) {
        String id;
        int i = WhenMappings.$EnumSwitchMapping$0[ctaAction.getType().ordinal()];
        if (i == 1) {
            try {
                getCallbacks().dismissFlow();
                return;
            } catch (Throwable unused) {
                requireActivity().finish();
                return;
            }
        }
        if (i == 2) {
            LegacyCtaValue value = ctaAction.getValue();
            id = value != null ? value.getId() : null;
            if (id == null) {
                CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("CTA Action type UPDATE_INQUIRY was found but value id is null"), true, null, 4, null);
                return;
            } else {
                getDuxo().updateInquiry(id, inputUpdateSource);
                return;
            }
        }
        if (i != 3) {
            if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return;
        }
        LegacyCtaValue value2 = ctaAction.getValue();
        id = value2 != null ? value2.getLink() : null;
        if (id == null) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalStateException("CTA Action type LINK was found but value link is null"), true, null, 4, null);
            return;
        }
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(id), null, null, false, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HeroImageViewState ComposeContent$lambda$0(SnapshotState4<? extends HeroImageViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* compiled from: HeroImageFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/pathfinder/corepages/heroimage/HeroImageFragment;", "Lcom/robinhood/shared/support/contracts/pathfinder/HeroImageFragmentKey;", "<init>", "()V", "feature-pathfinder-core-pages_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<HeroImageFragment, HeroImageFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(HeroImageFragmentKey heroImageFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, heroImageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public HeroImageFragmentKey getArgs(HeroImageFragment heroImageFragment) {
            return (HeroImageFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, heroImageFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public HeroImageFragment newInstance(HeroImageFragmentKey heroImageFragmentKey) {
            return (HeroImageFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, heroImageFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(HeroImageFragment heroImageFragment, HeroImageFragmentKey heroImageFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, heroImageFragment, heroImageFragmentKey);
        }
    }
}
