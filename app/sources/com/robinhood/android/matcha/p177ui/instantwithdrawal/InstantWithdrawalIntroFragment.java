package com.robinhood.android.matcha.p177ui.instantwithdrawal;

import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.matcha.p177ui.instantwithdrawal.InstantWithdrawalIntroViewState;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.social.contracts.matcha.MatchaInstantWithdrawalIntro;
import com.robinhood.android.social.contracts.matcha.MatchaTransaction;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.common.ShimmerLoaderType;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstantWithdrawalIntroFragment.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDuxo;", "getDuxo", "()Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "launchCreateTransaction", "direction", "Lcom/robinhood/android/social/contracts/matcha/MatchaTransaction$Direction;", "Companion", "feature-p2p_externalDebug", "viewState", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class InstantWithdrawalIntroFragment extends GenericComposeFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, InstantWithdrawalIntroDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$5(InstantWithdrawalIntroFragment instantWithdrawalIntroFragment, int i, Composer composer, int i2) {
        instantWithdrawalIntroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final InstantWithdrawalIntroDuxo getDuxo() {
        return (InstantWithdrawalIntroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1211013035);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1211013035, i2, -1, "com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroFragment.ComposeContent (InstantWithdrawalIntroFragment.kt:20)");
            }
            InstantWithdrawalIntroViewState instantWithdrawalIntroViewStateComposeContent$lambda$0 = ComposeContent$lambda$0(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (instantWithdrawalIntroViewStateComposeContent$lambda$0 instanceof InstantWithdrawalIntroViewState.Loaded) {
                composerStartRestartGroup.startReplaceGroup(436188753);
                InstantWithdrawalIntroViewState.Loaded loaded = (InstantWithdrawalIntroViewState.Loaded) instantWithdrawalIntroViewStateComposeContent$lambda$0;
                String title = loaded.getTitle();
                List<InstantWithdrawalIntroViewState.Loaded.Bullet> bullets = loaded.getBullets();
                CharSequence disclosureContent = loaded.getDisclosureContent();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroFragment$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InstantWithdrawalIntroFragment.ComposeContent$lambda$2$lambda$1(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function0 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroFragment$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InstantWithdrawalIntroFragment.ComposeContent$lambda$4$lambda$3(this.f$0);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                InstantWithdrawalIntroComposable.FreeInstantWithdrawalIntro(null, title, bullets, disclosureContent, function0, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 1);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endReplaceGroup();
            } else if (instantWithdrawalIntroViewStateComposeContent$lambda$0 instanceof InstantWithdrawalIntroViewState.Loading) {
                composerStartRestartGroup.startReplaceGroup(436742568);
                LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, new ShimmerLoaderType.Hero.Size.Fixed(200.0f), true, false, composerStartRestartGroup, (ShimmerLoaderType.Hero.Size.Fixed.$stable << 3) | 384, 9);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(instantWithdrawalIntroViewStateComposeContent$lambda$0 instanceof InstantWithdrawalIntroViewState.Error)) {
                    composerStartRestartGroup.startReplaceGroup(152615615);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(436991932);
                composerStartRestartGroup.endReplaceGroup();
                AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((InstantWithdrawalIntroViewState.Error) instantWithdrawalIntroViewStateComposeContent$lambda$0).getThrowable(), false, 2, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.instantwithdrawal.InstantWithdrawalIntroFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstantWithdrawalIntroFragment.ComposeContent$lambda$5(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2$lambda$1(InstantWithdrawalIntroFragment instantWithdrawalIntroFragment) {
        instantWithdrawalIntroFragment.launchCreateTransaction(MatchaTransaction.Direction.SEND);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4$lambda$3(InstantWithdrawalIntroFragment instantWithdrawalIntroFragment) {
        instantWithdrawalIntroFragment.launchCreateTransaction(MatchaTransaction.Direction.REQUEST);
        return Unit.INSTANCE;
    }

    private final void launchCreateTransaction(MatchaTransaction.Direction direction) {
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new MatchaTransaction.Create(direction, MatchaTransaction.EntryPoint.INSTANT_WITHDRAWAL_INTRO), null, false, null, null, 60, null);
        requireActivity().finish();
    }

    /* compiled from: InstantWithdrawalIntroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/matcha/ui/instantwithdrawal/InstantWithdrawalIntroFragment;", "Lcom/robinhood/android/social/contracts/matcha/MatchaInstantWithdrawalIntro;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<InstantWithdrawalIntroFragment, MatchaInstantWithdrawalIntro> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(MatchaInstantWithdrawalIntro matchaInstantWithdrawalIntro) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, matchaInstantWithdrawalIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MatchaInstantWithdrawalIntro getArgs(InstantWithdrawalIntroFragment instantWithdrawalIntroFragment) {
            return (MatchaInstantWithdrawalIntro) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, instantWithdrawalIntroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public InstantWithdrawalIntroFragment newInstance(MatchaInstantWithdrawalIntro matchaInstantWithdrawalIntro) {
            return (InstantWithdrawalIntroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, matchaInstantWithdrawalIntro);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(InstantWithdrawalIntroFragment instantWithdrawalIntroFragment, MatchaInstantWithdrawalIntro matchaInstantWithdrawalIntro) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, instantWithdrawalIntroFragment, matchaInstantWithdrawalIntro);
        }
    }

    private static final InstantWithdrawalIntroViewState ComposeContent$lambda$0(SnapshotState4<? extends InstantWithdrawalIntroViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
