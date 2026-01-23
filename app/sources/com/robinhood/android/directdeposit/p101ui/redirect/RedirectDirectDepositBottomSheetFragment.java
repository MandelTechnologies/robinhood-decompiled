package com.robinhood.android.directdeposit.p101ui.redirect;

import android.content.res.Resources;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.rxjava2.RxJava2Adapter;
import androidx.fragment.app.Fragment;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.directdeposit.p101ui.redirect.RedirectDirectDepositBottomSheetFragment;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.RHYContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: RedirectDirectDepositBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\r\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0002\u0010\u001dR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001f\u0010\n\u001a\u00060\u000bj\u0002`\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0010\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001f²\u0006\n\u0010 \u001a\u00020!X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetFragment;", "Lcom/robinhood/compose/app/GenericComposeBottomSheetDialogFragment;", "<init>", "()V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "eventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "eventContext$delegate", "Lkotlin/Lazy;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "duxo", "Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetDuxo;", "getDuxo", "()Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetDuxo;", "duxo$delegate", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "Companion", "feature-direct-deposit_externalDebug", "viewState", "Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class RedirectDirectDepositBottomSheetFragment extends GenericComposeBottomSheetDialogFragment {
    public EventLogger eventLogger;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: eventContext$delegate, reason: from kotlin metadata */
    private final Lazy eventContext = LazyKt.lazy(new Function0() { // from class: com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return RedirectDirectDepositBottomSheetFragment.eventContext_delegate$lambda$0(this.f$0);
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, RedirectDirectDepositBottomSheetDuxo.class);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment, int i, Composer composer, int i2) {
        redirectDirectDepositBottomSheetFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Context getEventContext() {
        return (Context) this.eventContext.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Context eventContext_delegate$lambda$0(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment) {
        return new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new RHYContext(RHYContext.ProductArea.CASH_ACCOUNTS, "noa_redirect_urgent", ((LegacyDialogFragmentKey.RedirectDirectDeposit) INSTANCE.getArgs((Fragment) redirectDirectDepositBottomSheetFragment)).getEntryPoint(), RHYContext.AccountType.ACCOUNT_TYPE_UNSPECIFIED, null, null, 48, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -2049, -1, -1, -1, 16383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Screen getEventScreen() {
        return ((LegacyDialogFragmentKey.RedirectDirectDeposit) INSTANCE.getArgs((Fragment) this)).getScreen();
    }

    private final RedirectDirectDepositBottomSheetDuxo getDuxo() {
        return (RedirectDirectDepositBottomSheetDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        EventLogger.DefaultImpls.logAppear$default(getEventLogger(), null, getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, getEventContext(), 9, null);
    }

    @Override // com.robinhood.compose.app.GenericComposeBottomSheetDialogFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(951146556);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(951146556, i2, -1, "com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment.ComposeContent (RedirectDirectDepositBottomSheetFragment.kt:53)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(907638929, true, new C141301(RxJava2Adapter.subscribeAsState(getDuxo().getStates(), new RedirectDirectDepositBottomSheetViewState(((LegacyDialogFragmentKey.RedirectDirectDeposit) INSTANCE.getArgs((Fragment) this)).getStatus()), composerStartRestartGroup, 0)), composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RedirectDirectDepositBottomSheetFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: RedirectDirectDepositBottomSheetFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment$ComposeContent$1 */
    static final class C141301 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState4<RedirectDirectDepositBottomSheetViewState> $viewState$delegate;

        C141301(SnapshotState4<RedirectDirectDepositBottomSheetViewState> snapshotState4) {
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(907638929, i, -1, "com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment.ComposeContent.<anonymous> (RedirectDirectDepositBottomSheetFragment.kt:56)");
            }
            String expireAtMediumText = RedirectDirectDepositBottomSheetFragment.ComposeContent$lambda$1(this.$viewState$delegate).getExpireAtMediumText();
            String expireAtMediumNoYearText = RedirectDirectDepositBottomSheetFragment.ComposeContent$lambda$1(this.$viewState$delegate).getExpireAtMediumNoYearText();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(RedirectDirectDepositBottomSheetFragment.this);
            final RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment = RedirectDirectDepositBottomSheetFragment.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return RedirectDirectDepositBottomSheetFragment.C141301.invoke$lambda$1$lambda$0(redirectDirectDepositBottomSheetFragment, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composer.changedInstance(RedirectDirectDepositBottomSheetFragment.this);
            final RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment2 = RedirectDirectDepositBottomSheetFragment.this;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.directdeposit.ui.redirect.RedirectDirectDepositBottomSheetFragment$ComposeContent$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return RedirectDirectDepositBottomSheetFragment.C141301.invoke$lambda$3$lambda$2(redirectDirectDepositBottomSheetFragment2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            RedirectDirectDepositBottomSheetComposable4.RedirectDirectDepositBottomSheetComposable(null, expireAtMediumText, expireAtMediumNoYearText, function1, (Function0) objRememberedValue2, composer, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment) {
            EventLogger.DefaultImpls.logTap$default(redirectDirectDepositBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.SET_UP_DIRECT_DEPOSIT, redirectDirectDepositBottomSheetFragment.getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, redirectDirectDepositBottomSheetFragment.getEventContext(), false, 40, null);
            Navigator navigator = redirectDirectDepositBottomSheetFragment.getNavigator();
            android.content.Context contextRequireContext = redirectDirectDepositBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment, String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            EventLogger.DefaultImpls.logTap$default(redirectDirectDepositBottomSheetFragment.getEventLogger(), UserInteractionEventData.Action.LEARN_MORE, redirectDirectDepositBottomSheetFragment.getEventScreen(), new Component(Component.ComponentType.BOTTOM_SHEET, null, null, 6, null), null, redirectDirectDepositBottomSheetFragment.getEventContext(), false, 40, null);
            Navigator navigator = redirectDirectDepositBottomSheetFragment.getNavigator();
            android.content.Context contextRequireContext = redirectDirectDepositBottomSheetFragment.requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            Navigators3.showHelpCenterWebViewFragment(navigator, contextRequireContext, url);
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RedirectDirectDepositBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/directdeposit/ui/redirect/RedirectDirectDepositBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$RedirectDirectDeposit;", "<init>", "()V", "feature-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<RedirectDirectDepositBottomSheetFragment, LegacyDialogFragmentKey.RedirectDirectDeposit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public RedirectDirectDepositBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.RedirectDirectDeposit redirectDirectDeposit) {
            return (RedirectDirectDepositBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, redirectDirectDeposit);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.RedirectDirectDeposit getArgs(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment) {
            return (LegacyDialogFragmentKey.RedirectDirectDeposit) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, redirectDirectDepositBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public RedirectDirectDepositBottomSheetFragment newInstance(LegacyDialogFragmentKey.RedirectDirectDeposit redirectDirectDeposit) {
            return (RedirectDirectDepositBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, redirectDirectDeposit);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(RedirectDirectDepositBottomSheetFragment redirectDirectDepositBottomSheetFragment, LegacyDialogFragmentKey.RedirectDirectDeposit redirectDirectDeposit) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, redirectDirectDepositBottomSheetFragment, redirectDirectDeposit);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final RedirectDirectDepositBottomSheetViewState ComposeContent$lambda$1(SnapshotState4<RedirectDirectDepositBottomSheetViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
