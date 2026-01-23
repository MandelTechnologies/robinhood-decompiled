package com.robinhood.shared.unverifiedaccountrecovery;

import android.content.Context;
import android.net.Uri;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.lib.pathfinder.PathfinderFragmentCallbacks;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.api.pathfinder.contexts.CtaActionType;
import com.robinhood.models.api.pathfinder.contexts.CtaType;
import com.robinhood.models.p355ui.pathfinder.contexts.UarVerificationSuccessContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: UarVerificationSuccessFragment.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\r¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "pathfinderCallbacks", "Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "getPathfinderCallbacks", "()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", "pathfinderCallbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UarVerificationSuccessFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, UarVerificationSuccessDuxo.class);

    /* renamed from: pathfinderCallbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 pathfinderCallbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(PathfinderFragmentCallbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(UarVerificationSuccessFragment.class, "pathfinderCallbacks", "getPathfinderCallbacks()Lcom/robinhood/android/lib/pathfinder/PathfinderFragmentCallbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(UarVerificationSuccessFragment uarVerificationSuccessFragment, int i, Composer composer, int i2) throws Throwable {
        uarVerificationSuccessFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UarVerificationSuccessDuxo getDuxo() {
        return (UarVerificationSuccessDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PathfinderFragmentCallbacks getPathfinderCallbacks() {
        return (PathfinderFragmentCallbacks) this.pathfinderCallbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Throwable thConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(1358088354);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1358088354, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment.ComposeContent (UarVerificationSuccessFragment.kt:24)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new UarVerificationSuccessViewState(false, null, 3, null), composerStartRestartGroup, ComposeUiEvent.$stable << 3);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-790659795, true, new C411421(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            ComposeUiEvent<Throwable> sendInputError = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSendInputError();
            if (sendInputError == null || (thConsume = sendInputError.consume()) == null || AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                throw thConsume;
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarVerificationSuccessFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UarVerificationSuccessFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment$ComposeContent$1 */
    static final class C411421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UarVerificationSuccessViewState> $viewState$delegate;

        /* compiled from: UarVerificationSuccessFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment$ComposeContent$1$WhenMappings */
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

        C411421(SnapshotState4<UarVerificationSuccessViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
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
                ComposerKt.traceEventStart(-790659795, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment.ComposeContent.<anonymous> (UarVerificationSuccessFragment.kt:28)");
            }
            UarVerificationSuccessContext context = ((UserViewStatePageContext.UarVerificationSuccess) ((LegacyFragmentKey.UarVerificationSuccess) UarVerificationSuccessFragment.INSTANCE.getArgs((Fragment) UarVerificationSuccessFragment.this)).getUserViewState().getTypeContext()).getContext();
            boolean sendingInput = UarVerificationSuccessFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSendingInput();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UarVerificationSuccessFragment.this);
            final UarVerificationSuccessFragment uarVerificationSuccessFragment = UarVerificationSuccessFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.UarVerificationSuccessFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarVerificationSuccessFragment.C411421.invoke$lambda$1$lambda$0(uarVerificationSuccessFragment, (CtaType) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UarVerificationSuccessComposable.UarVerificationSuccessComposable(context, sendingInput, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UarVerificationSuccessFragment uarVerificationSuccessFragment, CtaType cta) {
            Intrinsics.checkNotNullParameter(cta, "cta");
            int i = WhenMappings.$EnumSwitchMapping$0[cta.getAction().getType().ordinal()];
            if (i == 1) {
                uarVerificationSuccessFragment.getPathfinderCallbacks().dismissFlow();
            } else if (i == 2) {
                uarVerificationSuccessFragment.getDuxo().sendInput(cta.getAction());
            } else if (i == 3) {
                Navigator navigator = uarVerificationSuccessFragment.getNavigator();
                Context contextRequireContext = uarVerificationSuccessFragment.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, Uri.parse(cta.getAction().getTarget()), null, null, false, null, 60, null);
            } else if (i != 4) {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UarVerificationSuccessFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/UarVerificationSuccessFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarVerificationSuccess;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarVerificationSuccessFragment, LegacyFragmentKey.UarVerificationSuccess> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.UarVerificationSuccess uarVerificationSuccess) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, uarVerificationSuccess);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.UarVerificationSuccess getArgs(UarVerificationSuccessFragment uarVerificationSuccessFragment) {
            return (LegacyFragmentKey.UarVerificationSuccess) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarVerificationSuccessFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarVerificationSuccessFragment newInstance(LegacyFragmentKey.UarVerificationSuccess uarVerificationSuccess) {
            return (UarVerificationSuccessFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, uarVerificationSuccess);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarVerificationSuccessFragment uarVerificationSuccessFragment, LegacyFragmentKey.UarVerificationSuccess uarVerificationSuccess) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarVerificationSuccessFragment, uarVerificationSuccess);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarVerificationSuccessViewState ComposeContent$lambda$0(SnapshotState4<UarVerificationSuccessViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
