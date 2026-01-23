package com.robinhood.android.account.accountfunding;

import android.content.Context;
import android.content.Intent;
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
import androidx.view.compose.BackHandler;
import androidx.view.result.ActivityResult;
import androidx.view.result.ActivityResultCallback;
import androidx.view.result.ActivityResultLauncher;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsDuxo2;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.home.contracts.HomeDashboardType;
import com.robinhood.android.navigation.DeepLink;
import com.robinhood.android.navigation.DeepLinkOrigin;
import com.robinhood.android.navigation.DeepLinkResolver;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.home.contracts.TabLinkIntentKey;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import rosetta.account.BrokerageAccountType;
import rosetta.account.ManagementType;

/* compiled from: AccountFundingOptionsFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u0001:\u0001%B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002J\u0012\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002J\b\u0010\"\u001a\u00020\u001bH\u0002J\r\u0010#\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010$R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000bX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0016\u001a\u0010\u0012\f\u0012\n \u0019*\u0004\u0018\u00010\u00180\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002²\u0006\u0012\u0010)\u001a\n\u0012\u0004\u0012\u00020+\u0018\u00010*X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "deepLinkResolver", "Lcom/robinhood/android/navigation/DeepLinkResolver;", "getDeepLinkResolver", "()Lcom/robinhood/android/navigation/DeepLinkResolver;", "setDeepLinkResolver", "(Lcom/robinhood/android/navigation/DeepLinkResolver;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "toolbarVisible", "getToolbarVisible", "duxo", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "deeplinkLauncher", "Landroidx/activity/result/ActivityResultLauncher;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "resolveDeeplinkForActivityResult", "", "uri", "Landroid/net/Uri;", "dashboardIntentKey", "Lcom/robinhood/shared/home/contracts/TabLinkIntentKey;", "accountNumber", "", "onClose", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-account-funding_externalDebug", "viewState", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsEvent;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountFundingOptionsFragment extends GenericComposeFragment {
    public DeepLinkResolver deepLinkResolver;
    private final ActivityResultLauncher<Intent> deeplinkLauncher;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountFundingOptionsDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$4(AccountFundingOptionsFragment accountFundingOptionsFragment, int i, Composer composer, int i2) {
        accountFundingOptionsFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public AccountFundingOptionsFragment() {
        ActivityResultLauncher<Intent> activityResultLauncherRegisterForActivityResult = registerForActivityResult(new ActivityResultContracts$StartActivityForResult(), new ActivityResultCallback() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment$deeplinkLauncher$1
            @Override // androidx.view.result.ActivityResultCallback
            public final void onActivityResult(ActivityResult result) {
                Intrinsics.checkNotNullParameter(result, "result");
                if (result.getResultCode() == -1) {
                    this.this$0.requireBaseActivity().setResult(-1);
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.Account(((AccountFundingOptionsFragmentKeys.FullScreen) AccountFundingOptionsFragment.INSTANCE.getArgs((Fragment) this.this$0)).getAccountNumber())), null, true, null, null, 52, null);
                }
            }
        });
        Intrinsics.checkNotNullExpressionValue(activityResultLauncherRegisterForActivityResult, "registerForActivityResult(...)");
        this.deeplinkLauncher = activityResultLauncherRegisterForActivityResult;
    }

    public final DeepLinkResolver getDeepLinkResolver() {
        DeepLinkResolver deepLinkResolver = this.deepLinkResolver;
        if (deepLinkResolver != null) {
            return deepLinkResolver;
        }
        Intrinsics.throwUninitializedPropertyAccessException("deepLinkResolver");
        return null;
    }

    public final void setDeepLinkResolver(DeepLinkResolver deepLinkResolver) {
        Intrinsics.checkNotNullParameter(deepLinkResolver, "<set-?>");
        this.deepLinkResolver = deepLinkResolver;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final AccountFundingOptionsDuxo getDuxo() {
        return (AccountFundingOptionsDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void resolveDeeplinkForActivityResult(Uri uri) {
        DeepLink deepLinkResolve$default = DeepLinkResolver.DefaultImpls.resolve$default(getDeepLinkResolver(), uri, DeepLinkOrigin.Internal.INSTANCE, false, 4, null);
        if (deepLinkResolve$default == null) {
            return;
        }
        Function2<Context, Uri, Intent[]> getIntents = deepLinkResolve$default.getGetIntents();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        this.deeplinkLauncher.launch(ArraysKt.first(getIntents.invoke(contextRequireContext, uri)));
    }

    private final TabLinkIntentKey dashboardIntentKey(String accountNumber) {
        if (accountNumber != null) {
            return new TabLinkIntentKey.Home.Dashboard(new HomeDashboardType.Account(accountNumber));
        }
        return TabLinkIntentKey.Home.Legacy.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClose() {
        requireBaseActivity().finish();
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, dashboardIntentKey(((AccountFundingOptionsFragmentKeys.FullScreen) INSTANCE.getArgs((Fragment) this)).getAccountNumber()), null, true, null, null, 52, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountFundingOptionsViewState ComposeContent$lambda$0(SnapshotState4<AccountFundingOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<AccountFundingOptionsDuxo2> ComposeContent$lambda$1(SnapshotState4<Event<AccountFundingOptionsDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        EventConsumer<AccountFundingOptionsDuxo2> eventConsumerInvoke;
        Composer composerStartRestartGroup = composer.startRestartGroup(2054821628);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2054821628, i2, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment.ComposeContent (AccountFundingOptionsFragment.kt:84)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            final Event<AccountFundingOptionsDuxo2> eventComposeContent$lambda$1 = ComposeContent$lambda$1(FlowExtKt.collectAsStateWithLifecycle(getDuxo().getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (eventComposeContent$lambda$1 != null && (eventComposeContent$lambda$1.getData() instanceof AccountFundingOptionsDuxo2.Error) && (eventConsumerInvoke = eventComposeContent$lambda$1.getGetEventConsumer().invoke()) != null) {
                eventConsumerInvoke.consume(eventComposeContent$lambda$1, new Function1() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment$ComposeContent$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m10784invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m10784invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        AbsErrorHandler.handleError$default(this.getActivityErrorHandler(), ((AccountFundingOptionsDuxo2.Error) eventComposeContent$lambda$1.getData()).getThrowable(), false, 2, null);
                    }
                });
            }
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new AccountFundingOptionsFragment2(this);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BackHandler.BackHandler(false, (Function0) ((KFunction) objRememberedValue), composerStartRestartGroup, 0, 1);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1166751481, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment.ComposeContent.3
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
                        ComposerKt.traceEventStart(-1166751481, i3, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment.ComposeContent.<anonymous> (AccountFundingOptionsFragment.kt:95)");
                    }
                    Screen screen = new Screen(Screen.Name.ACCOUNT_FUNDING_OPTIONS, null, null, null, 14, null);
                    String source = ((AccountFundingOptionsFragmentKeys.FullScreen) AccountFundingOptionsFragment.INSTANCE.getArgs((Fragment) AccountFundingOptionsFragment.this)).getSource();
                    if (source == null) {
                        source = "";
                    }
                    UserInteractionEventDescriptor userInteractionEventDescriptor = new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new BrokerageAccountContext(BrokerageAccountType.INDIVIDUAL, null, ManagementType.SELF_DIRECTED, null, false, false, null, null, null, null, 1018, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -257, -1, -1, 16383, null), null, null, 53, null);
                    final AccountFundingOptionsFragment accountFundingOptionsFragment = AccountFundingOptionsFragment.this;
                    final SnapshotState4<AccountFundingOptionsViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    AutoLoggingCompositionLocals.EventLoggable(userInteractionEventDescriptor, ComposableLambda3.rememberComposableLambda(99278578, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment.ComposeContent.3.1
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
                                ComposerKt.traceEventStart(99278578, i4, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment.ComposeContent.<anonymous>.<anonymous> (AccountFundingOptionsFragment.kt:107)");
                            }
                            FundingOptionsViewModel viewModel = AccountFundingOptionsFragment.ComposeContent$lambda$0(snapshotState4).getViewModel();
                            AccountFundingOptionsFragment accountFundingOptionsFragment2 = accountFundingOptionsFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer3.changedInstance(accountFundingOptionsFragment2);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new AccountFundingOptionsFragment3(accountFundingOptionsFragment2);
                                composer3.updateRememberedValue(objRememberedValue2);
                            }
                            composer3.endReplaceGroup();
                            Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                            AccountFundingOptionsFragment accountFundingOptionsFragment3 = accountFundingOptionsFragment;
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer3.changedInstance(accountFundingOptionsFragment3);
                            Object objRememberedValue3 = composer3.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new AccountFundingOptionsFragment4(accountFundingOptionsFragment3);
                                composer3.updateRememberedValue(objRememberedValue3);
                            }
                            composer3.endReplaceGroup();
                            AccountFundingOptionsComposable.AccountFundingOptionsScreen(viewModel, function1, null, (Function0) ((KFunction) objRememberedValue3), composer3, 0, 4);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountFundingOptionsFragment.ComposeContent$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountFundingOptionsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsFragment;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$FullScreen;", "<init>", "()V", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AccountFundingOptionsFragment, AccountFundingOptionsFragmentKeys.FullScreen> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountFundingOptionsFragmentKeys.FullScreen fullScreen) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, fullScreen);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountFundingOptionsFragmentKeys.FullScreen getArgs(AccountFundingOptionsFragment accountFundingOptionsFragment) {
            return (AccountFundingOptionsFragmentKeys.FullScreen) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountFundingOptionsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountFundingOptionsFragment newInstance(AccountFundingOptionsFragmentKeys.FullScreen fullScreen) {
            return (AccountFundingOptionsFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, fullScreen);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountFundingOptionsFragment accountFundingOptionsFragment, AccountFundingOptionsFragmentKeys.FullScreen fullScreen) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountFundingOptionsFragment, fullScreen);
        }
    }
}
