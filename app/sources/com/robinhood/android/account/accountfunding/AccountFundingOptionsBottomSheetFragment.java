package com.robinhood.android.account.accountfunding;

import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment;
import com.robinhood.android.account.accountfunding.AccountFundingOptionsFragmentKeys;
import com.robinhood.android.account.models.onboarding.FundingOptionsViewModel;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountFundingOptionsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fR\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "duxo", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "getDuxo", "()Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-account-funding_externalDebug", "viewState", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountFundingOptionsBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountFundingOptionsDuxo.class);

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment, int i, Composer composer, int i2) {
        accountFundingOptionsBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final AccountFundingOptionsDuxo getDuxo() {
        return (AccountFundingOptionsDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(517162666);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(517162666, i2, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment.ComposeContent (AccountFundingOptionsBottomSheetFragment.kt:27)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1946029685, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(1946029685, i3, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment.ComposeContent.<anonymous> (AccountFundingOptionsBottomSheetFragment.kt:31)");
                    }
                    Screen screen = new Screen(null, null, "account_funding_options_sheet", null, 11, null);
                    String source = ((AccountFundingOptionsFragmentKeys.BottomSheet) AccountFundingOptionsBottomSheetFragment.INSTANCE.getArgs((Fragment) AccountFundingOptionsBottomSheetFragment.this)).getSource();
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, source != null ? new Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null) : null, null, null, 53, null), ComposableLambda3.rememberComposableLambda(1343099424, true, new AnonymousClass2(AccountFundingOptionsBottomSheetFragment.this, snapshotState4CollectAsStateWithLifecycle), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: AccountFundingOptionsBottomSheetFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment$ComposeContent$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState4<AccountFundingOptionsViewState> $viewState$delegate;
                    final /* synthetic */ AccountFundingOptionsBottomSheetFragment this$0;

                    AnonymousClass2(AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment, SnapshotState4<AccountFundingOptionsViewState> snapshotState4) {
                        this.this$0 = accountFundingOptionsBottomSheetFragment;
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
                            ComposerKt.traceEventStart(1343099424, i, -1, "com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment.ComposeContent.<anonymous>.<anonymous> (AccountFundingOptionsBottomSheetFragment.kt:43)");
                        }
                        final Navigator navigator = (Navigator) composer.consume(LocalNavigator.getLocalNavigator());
                        final android.content.Context context = (android.content.Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        FundingOptionsViewModel viewModel = AccountFundingOptionsBottomSheetFragment.ComposeContent$lambda$0(this.$viewState$delegate).getViewModel();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(WindowInsetsPadding_androidKt.navigationBarsPadding(Modifier.INSTANCE), 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context);
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment$ComposeContent$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return AccountFundingOptionsBottomSheetFragment.C80701.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context, (Uri) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment$ComposeContent$1$2$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return AccountFundingOptionsBottomSheetFragment.C80701.AnonymousClass2.invoke$lambda$3$lambda$2(accountFundingOptionsBottomSheetFragment);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        AccountFundingOptionsComposable.AccountFundingOptionsContent(viewModel, function1, modifierM5146paddingqDBjuR0$default, true, (Function0) objRememberedValue2, composer, 3072, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, android.content.Context context, Uri uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, null, null, false, null, 60, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment) {
                        accountFundingOptionsBottomSheetFragment.dismiss();
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.accountfunding.AccountFundingOptionsBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountFundingOptionsBottomSheetFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: AccountFundingOptionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsBottomSheetFragment;", "Lcom/robinhood/android/account/accountfunding/AccountFundingOptionsKey$BottomSheet;", "<init>", "()V", "feature-account-funding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<AccountFundingOptionsBottomSheetFragment, AccountFundingOptionsFragmentKeys.BottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public AccountFundingOptionsBottomSheetFragment createDialogFragment(AccountFundingOptionsFragmentKeys.BottomSheet bottomSheet) {
            return (AccountFundingOptionsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, bottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AccountFundingOptionsFragmentKeys.BottomSheet getArgs(AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment) {
            return (AccountFundingOptionsFragmentKeys.BottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, accountFundingOptionsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AccountFundingOptionsBottomSheetFragment newInstance(AccountFundingOptionsFragmentKeys.BottomSheet bottomSheet) {
            return (AccountFundingOptionsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, bottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AccountFundingOptionsBottomSheetFragment accountFundingOptionsBottomSheetFragment, AccountFundingOptionsFragmentKeys.BottomSheet bottomSheet) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, accountFundingOptionsBottomSheetFragment, bottomSheet);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountFundingOptionsViewState ComposeContent$lambda$0(SnapshotState4<AccountFundingOptionsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
