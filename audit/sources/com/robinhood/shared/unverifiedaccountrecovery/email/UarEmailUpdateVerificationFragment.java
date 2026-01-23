package com.robinhood.shared.unverifiedaccountrecovery.email;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.UarEmailUpdateVerificationContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment;
import com.robinhood.shared.user.contracts.auth.Login;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UarEmailUpdateVerificationFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UarEmailUpdateVerificationFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, UarEmailUpdateVerificationDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment, int i, Composer composer, int i2) throws Throwable {
        uarEmailUpdateVerificationFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UarEmailUpdateVerificationDuxo getDuxo() {
        return (UarEmailUpdateVerificationDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Throwable thConsume;
        CtaAction ctaActionConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(1141618164);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1141618164, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment.ComposeContent (UarEmailUpdateVerificationFragment.kt:19)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new UarEmailUpdateVerificationViewState(false, null, null, 7, null), composerStartRestartGroup, ComposeUiEvent.$stable << 3);
            UarEmailUpdateVerificationContext context = ((UserViewStatePageContext.UarEmailUpdateVerification) ((LegacyFragmentKey.UarEmailUpdateVerification) INSTANCE.getArgs((Fragment) this)).getUserViewState().getTypeContext()).getContext();
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-2016404673, true, new C411681(context, this, snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            ComposeUiEvent<CtaAction> sendInputSuccessEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSendInputSuccessEvent();
            if (sendInputSuccessEvent != null && (ctaActionConsume = sendInputSuccessEvent.consume()) != null && Intrinsics.areEqual(context.getPrimaryCta().getAction(), ctaActionConsume)) {
                Navigator navigator = getNavigator();
                Context contextRequireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new Login(null, null, false, 7, null), null, true, null, null, 52, null);
            }
            ComposeUiEvent<Throwable> sendInputErrorEvent = ComposeContent$lambda$0(snapshotState4SubscribeAsState).getSendInputErrorEvent();
            if (sendInputErrorEvent == null || (thConsume = sendInputErrorEvent.consume()) == null || AbsErrorHandler.handleError$default(getActivityErrorHandler(), thConsume, false, 2, null)) {
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateVerificationFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UarEmailUpdateVerificationFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment$ComposeContent$1 */
    static final class C411681 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UarEmailUpdateVerificationViewState> $viewState$delegate;
        final /* synthetic */ UarEmailUpdateVerificationContext $viewStateContext;
        final /* synthetic */ UarEmailUpdateVerificationFragment this$0;

        C411681(UarEmailUpdateVerificationContext uarEmailUpdateVerificationContext, UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment, SnapshotState4<UarEmailUpdateVerificationViewState> snapshotState4) {
            this.$viewStateContext = uarEmailUpdateVerificationContext;
            this.this$0 = uarEmailUpdateVerificationFragment;
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
                ComposerKt.traceEventStart(-2016404673, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment.ComposeContent.<anonymous> (UarEmailUpdateVerificationFragment.kt:24)");
            }
            UarEmailUpdateVerificationContext uarEmailUpdateVerificationContext = this.$viewStateContext;
            boolean sendingInput = UarEmailUpdateVerificationFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSendingInput();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateVerificationFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return UarEmailUpdateVerificationFragment.C411681.invoke$lambda$1$lambda$0(uarEmailUpdateVerificationFragment, (CtaAction) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UarEmailUpdateVerificationComposable.UarEmailUpdateVerificationComposable(uarEmailUpdateVerificationContext, sendingInput, (Function1) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment, CtaAction action) {
            Intrinsics.checkNotNullParameter(action, "action");
            uarEmailUpdateVerificationFragment.getDuxo().sendInput(action);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UarEmailUpdateVerificationFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateVerificationFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateVerification;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarEmailUpdateVerificationFragment, LegacyFragmentKey.UarEmailUpdateVerification> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.UarEmailUpdateVerification uarEmailUpdateVerification) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, uarEmailUpdateVerification);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.UarEmailUpdateVerification getArgs(UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment) {
            return (LegacyFragmentKey.UarEmailUpdateVerification) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarEmailUpdateVerificationFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarEmailUpdateVerificationFragment newInstance(LegacyFragmentKey.UarEmailUpdateVerification uarEmailUpdateVerification) {
            return (UarEmailUpdateVerificationFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, uarEmailUpdateVerification);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarEmailUpdateVerificationFragment uarEmailUpdateVerificationFragment, LegacyFragmentKey.UarEmailUpdateVerification uarEmailUpdateVerification) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarEmailUpdateVerificationFragment, uarEmailUpdateVerification);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarEmailUpdateVerificationViewState ComposeContent$lambda$0(SnapshotState4<UarEmailUpdateVerificationViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
