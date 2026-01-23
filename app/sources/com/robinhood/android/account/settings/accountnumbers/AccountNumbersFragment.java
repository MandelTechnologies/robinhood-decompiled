package com.robinhood.android.account.settings.accountnumbers;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.common.mcduckling.p084ui.detail.card.SecondaryAuthenticationFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: AccountNumbersFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\b\u0007\u0018\u0000 %2\u00020\u00012\u00020\u0002:\u0001%B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J&\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0017H\u0016J\b\u0010\u001f\u001a\u00020\u0015H\u0016J\r\u0010 \u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020$H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006&²\u0006\n\u0010'\u001a\u00020(X\u008a\u0084\u0002"}, m3636d2 = {"Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "Lcom/robinhood/android/common/mcduckling/ui/detail/card/SecondaryAuthenticationFragment$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDuxo;", "getDuxo", "()Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "hasShownSecondaryAuthentication", "", "popNearestParentBackStackOnBackPressed", "getPopNearestParentBackStackOnBackPressed", "()Z", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "toolbarVisible", "getToolbarVisible", "onSaveInstanceState", "", "outState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "onResume", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onSecondaryAuthenticationSuccess", "requestCode", "", "Companion", "feature-account-number-settings_externalDebug", "viewState", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersViewState;"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AccountNumbersFragment extends GenericComposeFragment implements SecondaryAuthenticationFragment.Callbacks {
    private static final int REQUEST_ACCOUNT_NUMBERS_AUTH = 1;
    private static final String SHOWN_SECONDARY_AUTH = "shownSecondaryAuth";
    private boolean hasShownSecondaryAuthentication;
    private final boolean toolbarVisible;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = DuxosKt.duxo(this, AccountNumbersDuxo.class);
    private final boolean popNearestParentBackStackOnBackPressed = true;
    private final boolean useDesignSystemToolbar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(AccountNumbersFragment accountNumbersFragment, int i, Composer composer, int i2) {
        accountNumbersFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    private final AccountNumbersDuxo getDuxo() {
        return (AccountNumbersDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public boolean getPopNearestParentBackStackOnBackPressed() {
        return this.popNearestParentBackStackOnBackPressed;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        outState.putBoolean(SHOWN_SECONDARY_AUTH, this.hasShownSecondaryAuthentication);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        if (savedInstanceState != null) {
            this.hasShownSecondaryAuthentication = savedInstanceState.getBoolean(SHOWN_SECONDARY_AUTH);
        }
        return super.onCreateView(inflater, container, savedInstanceState);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (this.hasShownSecondaryAuthentication && !getDuxo().getIsSecondaryAuthenticated()) {
            requireActivity().finish();
            return;
        }
        if (this.hasShownSecondaryAuthentication || getDuxo().getIsSecondaryAuthenticated()) {
            return;
        }
        this.hasShownSecondaryAuthentication = true;
        SecondaryAuthenticationFragment.Companion companion = SecondaryAuthenticationFragment.INSTANCE;
        String string2 = getString(C8172R.string.account_numbers_authentication_title);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        SecondaryAuthenticationFragment secondaryAuthenticationFragmentNewInstance = companion.newInstance(this, string2, 1);
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Intrinsics.checkNotNullExpressionValue(parentFragmentManager, "getParentFragmentManager(...)");
        secondaryAuthenticationFragmentNewInstance.show(parentFragmentManager, "accountNumbersAuthentication");
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(510649902);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(510649902, i2, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersFragment.ComposeContent (AccountNumbersFragment.kt:70)");
            }
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(getDuxo().getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1339369149, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-1339369149, i3, -1, "com.robinhood.android.account.settings.accountnumbers.AccountNumbersFragment.ComposeContent.<anonymous> (AccountNumbersFragment.kt:74)");
                    }
                    AccountNumbersComposable.AccountNumbersScreen(AccountNumbersFragment.ComposeContent$lambda$0(snapshotState4CollectAsStateWithLifecycle), null, composer2, 0, 2);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.account.settings.accountnumbers.AccountNumbersFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountNumbersFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.mcduckling.ui.detail.card.SecondaryAuthenticationFragment.Callbacks
    public void onSecondaryAuthenticationSuccess(int requestCode) {
        if (requestCode == 1) {
            getDuxo().setSecondaryAuthenticated(true);
        }
    }

    /* compiled from: AccountNumbersFragment.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolver;", "Lcom/robinhood/android/account/settings/accountnumbers/AccountNumbersFragmentKey;", "<init>", "()V", "REQUEST_ACCOUNT_NUMBERS_AUTH", "", "SHOWN_SECONDARY_AUTH", "", "createFragment", "Landroidx/fragment/app/Fragment;", "key", "feature-account-number-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolver<AccountNumbersFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AccountNumbersFragmentKey key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return new AccountNumbersFragment();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AccountNumbersViewState ComposeContent$lambda$0(SnapshotState4<? extends AccountNumbersViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
