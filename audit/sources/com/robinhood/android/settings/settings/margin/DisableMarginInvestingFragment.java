package com.robinhood.android.settings.settings.margin;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.core.os.Bundle2;
import androidx.fragment.app.Fragment;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import io.reactivex.Completable;
import io.reactivex.CompletableSource;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DisableMarginInvestingFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0014\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0016J\b\u0010\u0017\u001a\u00020\u0015H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u0011X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/margin/DisableMarginInvestingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "getAccountProvider", "()Lcom/robinhood/android/lib/account/AccountProvider;", "setAccountProvider", "(Lcom/robinhood/android/lib/account/AccountProvider;)V", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getLeveredMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setLeveredMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "onStart", "Companion", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class DisableMarginInvestingFragment extends GenericComposeFragment {
    public AccountProvider accountProvider;
    public LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final boolean useDesignSystemToolbar = true;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DisableMarginInvestingFragment disableMarginInvestingFragment, int i, Composer composer, int i2) {
        disableMarginInvestingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final AccountProvider getAccountProvider() {
        AccountProvider accountProvider = this.accountProvider;
        if (accountProvider != null) {
            return accountProvider;
        }
        Intrinsics.throwUninitializedPropertyAccessException("accountProvider");
        return null;
    }

    public final void setAccountProvider(AccountProvider accountProvider) {
        Intrinsics.checkNotNullParameter(accountProvider, "<set-?>");
        this.accountProvider = accountProvider;
    }

    public final LeveredMarginSettingsStore getLeveredMarginSettingsStore() {
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore;
        if (leveredMarginSettingsStore != null) {
            return leveredMarginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leveredMarginSettingsStore");
        return null;
    }

    public final void setLeveredMarginSettingsStore(LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "<set-?>");
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-780956691);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-780956691, i, -1, "com.robinhood.android.settings.settings.margin.DisableMarginInvestingFragment.ComposeContent (DisableMarginInvestingFragment.kt:26)");
            }
            LoadingScreenComposablesKt.GenericBoxesLoadingScreenComposable(null, composerStartRestartGroup, 0, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.settings.settings.margin.DisableMarginInvestingFragment$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DisableMarginInvestingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        Single singleRxSingle$default;
        super.onStart();
        String accountNumber = ((LegacyFragmentKey.MarginInvesting.DisableMarginInvesting) INSTANCE.getArgs((Fragment) this)).getAccountNumber();
        if (accountNumber != null) {
            singleRxSingle$default = Single.just(accountNumber);
            Intrinsics.checkNotNull(singleRxSingle$default);
        } else {
            singleRxSingle$default = RxFactory.DefaultImpls.rxSingle$default(this, null, new DisableMarginInvestingFragment2(this, null), 1, null);
        }
        Completable completableFlatMapCompletable = singleRxSingle$default.flatMapCompletable(new Function() { // from class: com.robinhood.android.settings.settings.margin.DisableMarginInvestingFragment.onStart.1
            @Override // io.reactivex.functions.Function
            public final CompletableSource apply(String accountNumber2) {
                Intrinsics.checkNotNullParameter(accountNumber2, "accountNumber");
                return DisableMarginInvestingFragment.this.getLeveredMarginSettingsStore().disableMarginInvesting(accountNumber2);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableFlatMapCompletable, "flatMapCompletable(...)");
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(completableFlatMapCompletable, 1000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.settings.settings.margin.DisableMarginInvestingFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DisableMarginInvestingFragment.onStart$lambda$1(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.settings.settings.margin.DisableMarginInvestingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DisableMarginInvestingFragment.onStart$lambda$2(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(DisableMarginInvestingFragment disableMarginInvestingFragment) {
        disableMarginInvestingFragment.requireBaseActivity().getSupportFragmentManager().setFragmentResult(LegacyFragmentKey.MarginInvesting.DisableMarginInvesting.RESULT_KEY, Bundle2.bundleOf());
        disableMarginInvestingFragment.popNearestParentBackStack();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$2(DisableMarginInvestingFragment disableMarginInvestingFragment, Throwable e) throws Throwable {
        Intrinsics.checkNotNullParameter(e, "e");
        disableMarginInvestingFragment.getActivityErrorHandler().accept(e);
        disableMarginInvestingFragment.popNearestParentBackStack();
        return Unit.INSTANCE;
    }

    /* compiled from: DisableMarginInvestingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/settings/settings/margin/DisableMarginInvestingFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/settings/settings/margin/DisableMarginInvestingFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$MarginInvesting$DisableMarginInvesting;", "<init>", "()V", "feature-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<DisableMarginInvestingFragment, LegacyFragmentKey.MarginInvesting.DisableMarginInvesting> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(LegacyFragmentKey.MarginInvesting.DisableMarginInvesting disableMarginInvesting) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, disableMarginInvesting);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.MarginInvesting.DisableMarginInvesting getArgs(DisableMarginInvestingFragment disableMarginInvestingFragment) {
            return (LegacyFragmentKey.MarginInvesting.DisableMarginInvesting) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, disableMarginInvestingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DisableMarginInvestingFragment newInstance(LegacyFragmentKey.MarginInvesting.DisableMarginInvesting disableMarginInvesting) {
            return (DisableMarginInvestingFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, disableMarginInvesting);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DisableMarginInvestingFragment disableMarginInvestingFragment, LegacyFragmentKey.MarginInvesting.DisableMarginInvesting disableMarginInvesting) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, disableMarginInvestingFragment, disableMarginInvesting);
        }
    }
}
