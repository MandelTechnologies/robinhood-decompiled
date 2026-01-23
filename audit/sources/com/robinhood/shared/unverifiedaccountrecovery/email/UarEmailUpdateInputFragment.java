package com.robinhood.shared.unverifiedaccountrecovery.email;

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
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.api.pathfinder.contexts.CtaAction;
import com.robinhood.models.p355ui.pathfinder.contexts.UarEmailUpdateInputContext;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UarEmailUpdateInputFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputDuxo;", "getDuxo", "()Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-unverified-account-recovery_externalDebug", "viewState", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class UarEmailUpdateInputFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, UarEmailUpdateInputDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(UarEmailUpdateInputFragment uarEmailUpdateInputFragment, int i, Composer composer, int i2) throws Throwable {
        uarEmailUpdateInputFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UarEmailUpdateInputDuxo getDuxo() {
        return (UarEmailUpdateInputDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) throws Throwable {
        int i2;
        Throwable thConsume;
        Composer composerStartRestartGroup = composer.startRestartGroup(518788920);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(518788920, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment.ComposeContent (UarEmailUpdateInputFragment.kt:18)");
            }
            SnapshotState4 snapshotState4SubscribeAsState = RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new UarEmailUpdateInputViewState(false, null, 3, null), composerStartRestartGroup, ComposeUiEvent.$stable << 3);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1629959229, true, new C411591(snapshotState4SubscribeAsState), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return UarEmailUpdateInputFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: UarEmailUpdateInputFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment$ComposeContent$1 */
    static final class C411591 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<UarEmailUpdateInputViewState> $viewState$delegate;

        C411591(SnapshotState4<UarEmailUpdateInputViewState> snapshotState4) {
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
                ComposerKt.traceEventStart(-1629959229, i, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment.ComposeContent.<anonymous> (UarEmailUpdateInputFragment.kt:21)");
            }
            UarEmailUpdateInputContext context = ((UserViewStatePageContext.UarEmailUpdateInput) ((LegacyFragmentKey.UarEmailUpdateInput) UarEmailUpdateInputFragment.INSTANCE.getArgs((Fragment) UarEmailUpdateInputFragment.this)).getUserViewState().getTypeContext()).getContext();
            boolean sendingInput = UarEmailUpdateInputFragment.ComposeContent$lambda$0(this.$viewState$delegate).getSendingInput();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(UarEmailUpdateInputFragment.this);
            final UarEmailUpdateInputFragment uarEmailUpdateInputFragment = UarEmailUpdateInputFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.UarEmailUpdateInputFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return UarEmailUpdateInputFragment.C411591.invoke$lambda$1$lambda$0(uarEmailUpdateInputFragment, (String) obj, (CtaAction) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            UarEmailUpdateInputComposable.UarEmailUpdateInputComposable(context, sendingInput, (Function2) objRememberedValue, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UarEmailUpdateInputFragment uarEmailUpdateInputFragment, String emailAddress, CtaAction action) {
            Intrinsics.checkNotNullParameter(emailAddress, "emailAddress");
            Intrinsics.checkNotNullParameter(action, "action");
            uarEmailUpdateInputFragment.getDuxo().sendInput(emailAddress, action);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: UarEmailUpdateInputFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/UarEmailUpdateInputFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$UarEmailUpdateInput;", "<init>", "()V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<UarEmailUpdateInputFragment, LegacyFragmentKey.UarEmailUpdateInput> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.UarEmailUpdateInput uarEmailUpdateInput) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, uarEmailUpdateInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.UarEmailUpdateInput getArgs(UarEmailUpdateInputFragment uarEmailUpdateInputFragment) {
            return (LegacyFragmentKey.UarEmailUpdateInput) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, uarEmailUpdateInputFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public UarEmailUpdateInputFragment newInstance(LegacyFragmentKey.UarEmailUpdateInput uarEmailUpdateInput) {
            return (UarEmailUpdateInputFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, uarEmailUpdateInput);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(UarEmailUpdateInputFragment uarEmailUpdateInputFragment, LegacyFragmentKey.UarEmailUpdateInput uarEmailUpdateInput) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, uarEmailUpdateInputFragment, uarEmailUpdateInput);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UarEmailUpdateInputViewState ComposeContent$lambda$0(SnapshotState4<UarEmailUpdateInputViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
