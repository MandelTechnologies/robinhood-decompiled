package com.robinhood.android.individualaccounts.onboarding.outro;

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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.individualaccounts.onboarding.IndividualAccountNavigationUtils;
import com.robinhood.android.isa.isatransferdetail.IsaTransferDetailComposable3;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: IndividualAccountOutroFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0011\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0013J\u0016\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0012H\u0016J\u0012\u0010\u0019\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u000e\u0010\u001a\u001a\u00020\u0012H\u0096@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroScreenCallbacks;", "<init>", "()V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDuxo;", "getDuxo", "()Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onContinueClicked", "accountNumber", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onRefreshClicked", "onCloseClicked", "onContactSupportClicked", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "buildFundingDeeplink", "Landroid/net/Uri;", "Companion", "feature-individual-account-onboarding_externalDebug", "viewState", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class IndividualAccountOutroFragment extends GenericComposeFragment implements IndividualAccountOutroScreen {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final boolean toolbarVisible;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, IndividualAccountOutroDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(IndividualAccountOutroFragment individualAccountOutroFragment, int i, Composer composer, int i2) {
        individualAccountOutroFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final IndividualAccountOutroDuxo getDuxo() {
        return (IndividualAccountOutroDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(271835930);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(271835930, i2, -1, "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment.ComposeContent (IndividualAccountOutroFragment.kt:27)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1165788753, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1165788753, i3, -1, "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment.ComposeContent.<anonymous> (IndividualAccountOutroFragment.kt:31)");
                    }
                    Screen screen = new Screen(Screen.Name.SELF_DIRECTED_ACCOUNT_CONFIRMATION, null, null, null, 14, null);
                    String source = ((IndividualAccountOutroFragmentKey) IndividualAccountOutroFragment.INSTANCE.getArgs((Fragment) IndividualAccountOutroFragment.this)).getSource();
                    if (source == null) {
                        source = "";
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null);
                    final IndividualAccountOutroFragment individualAccountOutroFragment = IndividualAccountOutroFragment.this;
                    final SnapshotState4<IndividualAccountOutroState3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(1550282852, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment.ComposeContent.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1550282852, i4, -1, "com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment.ComposeContent.<anonymous>.<anonymous> (IndividualAccountOutroFragment.kt:41)");
                            }
                            IndividualAccountOutroScreen2.IndividualAccountOutroScreen(IndividualAccountOutroFragment.ComposeContent$lambda$0(snapshotState4), individualAccountOutroFragment, null, composer3, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 48);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return IndividualAccountOutroFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen
    public Object onContinueClicked(String str, Continuation<? super Unit> continuation) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Object objHandleDeepLinkDirect$default = Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, buildFundingDeeplink(str), false, false, null, continuation, 24, null);
        return objHandleDeepLinkDirect$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleDeepLinkDirect$default : Unit.INSTANCE;
    }

    @Override // com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen
    public void onRefreshClicked() {
        getDuxo().onRefresh();
    }

    @Override // com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen
    public void onCloseClicked(String accountNumber) {
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, IndividualAccountNavigationUtils.mibTabLinkIntentKey(accountNumber), null, true, null, null, 52, null);
    }

    @Override // com.robinhood.android.individualaccounts.onboarding.outro.IndividualAccountOutroScreen
    public Object onContactSupportClicked(Continuation<? super Unit> continuation) {
        Navigator navigator = getNavigator();
        android.content.Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Object objHandleDeepLinkDirect$default = Navigator.DefaultImpls.handleDeepLinkDirect$default(navigator, contextRequireContext, Uri.parse(IsaTransferDetailComposable3.CONTACT_SUPPORT_DEEPLINK), false, false, null, continuation, 28, null);
        return objHandleDeepLinkDirect$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objHandleDeepLinkDirect$default : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IndividualAccountOutroState3 ComposeContent$lambda$0(SnapshotState4<? extends IndividualAccountOutroState3> snapshotState4) {
        return snapshotState4.getValue();
    }

    private final Uri buildFundingDeeplink(String accountNumber) {
        String source = ((IndividualAccountOutroFragmentKey) INSTANCE.getArgs((Fragment) this)).getSource();
        if (source == null) {
            source = "";
        }
        return Uri.parse("robinhood://account_funding_options?account_number=" + accountNumber + "&transfer_funds_entry_point=individual_account_onboarding_flow&location=location_onboarding&source=" + source);
    }

    /* compiled from: IndividualAccountOutroFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragment;", "Lcom/robinhood/android/individualaccounts/onboarding/outro/IndividualAccountOutroFragmentKey;", "<init>", "()V", "feature-individual-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<IndividualAccountOutroFragment, IndividualAccountOutroFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(IndividualAccountOutroFragmentKey individualAccountOutroFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, individualAccountOutroFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public IndividualAccountOutroFragmentKey getArgs(IndividualAccountOutroFragment individualAccountOutroFragment) {
            return (IndividualAccountOutroFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, individualAccountOutroFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public IndividualAccountOutroFragment newInstance(IndividualAccountOutroFragmentKey individualAccountOutroFragmentKey) {
            return (IndividualAccountOutroFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, individualAccountOutroFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(IndividualAccountOutroFragment individualAccountOutroFragment, IndividualAccountOutroFragmentKey individualAccountOutroFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, individualAccountOutroFragment, individualAccountOutroFragmentKey);
        }
    }
}
