package com.robinhood.android.crypto.p094ui.detail.p095v2;

import android.content.Context;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailDuxo;
import com.robinhood.android.crypto.p094ui.detail.p095v2.CryptoDetailFragment;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.ActionHandlingFragment2;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlingFragment;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.CryptoDetailRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.iac.crosssell.CrossSellLaunchManager;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.IacAlertSheetLocation;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey;
import com.robinhood.shared.lists.quickadd.C39088R;
import com.robinhood.shared.lists.quickadd.CuratedListQuickAddFragment;
import com.robinhood.shared.security.auth.AuthManager;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\b\u0010!\u001a\u00020\u001eH\u0016J\r\u0010\"\u001a\u00020\u001eH\u0017¢\u0006\u0002\u0010#J\b\u0010$\u001a\u00020\u001eH\u0002J\t\u0010%\u001a\u00020\u0012H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u0012X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u001a8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010&\u001a\b\u0012\u0004\u0012\u00020(0'X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010*¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailFragment;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/action/GenericActionHandlingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "authManager", "Lcom/robinhood/shared/security/auth/AuthManager;", "getAuthManager", "()Lcom/robinhood/shared/security/auth/AuthManager;", "setAuthManager", "(Lcom/robinhood/shared/security/auth/AuthManager;)V", "crossSellLaunchManager", "Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "getCrossSellLaunchManager", "()Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;", "setCrossSellLaunchManager", "(Lcom/robinhood/iac/crosssell/CrossSellLaunchManager;)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "hasBottomBar", "getHasBottomBar", "curatedListQuickAddFragment", "Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "getCuratedListQuickAddFragment", "()Lcom/robinhood/shared/lists/quickadd/CuratedListQuickAddFragment;", "onAttach", "", "context", "Landroid/content/Context;", "onStart", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "ensureCuratedListQuickAddFragment", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CryptoDetailFragment extends GenericActionHandlingFragment implements RegionGated {
    private static final String QUICK_ADD_TAG = "quickAddFragment";
    public AuthManager authManager;
    public CrossSellLaunchManager crossSellLaunchManager;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(CryptoDetailRegionGate.INSTANCE);
    private final boolean hasBottomBar = true;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$1(CryptoDetailFragment cryptoDetailFragment, int i, Composer composer, int i2) {
        cryptoDetailFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final AuthManager getAuthManager() {
        AuthManager authManager = this.authManager;
        if (authManager != null) {
            return authManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("authManager");
        return null;
    }

    public final void setAuthManager(AuthManager authManager) {
        Intrinsics.checkNotNullParameter(authManager, "<set-?>");
        this.authManager = authManager;
    }

    public final CrossSellLaunchManager getCrossSellLaunchManager() {
        CrossSellLaunchManager crossSellLaunchManager = this.crossSellLaunchManager;
        if (crossSellLaunchManager != null) {
            return crossSellLaunchManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("crossSellLaunchManager");
        return null;
    }

    public final void setCrossSellLaunchManager(CrossSellLaunchManager crossSellLaunchManager) {
        Intrinsics.checkNotNullParameter(crossSellLaunchManager, "<set-?>");
        this.crossSellLaunchManager = crossSellLaunchManager;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getHasBottomBar() {
        return this.hasBottomBar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CuratedListQuickAddFragment getCuratedListQuickAddFragment() {
        return (CuratedListQuickAddFragment) getChildFragmentManager().findFragmentByTag("quickAddFragment");
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = getScarletContextWrapper();
        if (scarletContextWrapper == null) {
            scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        }
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        IacAlertSheetLocation iacAlertSheetLocation;
        super.onStart();
        if (getAuthManager().isLoggedIn()) {
            ensureCuratedListQuickAddFragment();
            Companion companion = INSTANCE;
            if (Intrinsics.areEqual(((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this)).getSource(), CryptoDetailSource.BREAKING_NEWS)) {
                iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_CURRENCY_DETAIL_BREAKING_NEWS;
            } else {
                iacAlertSheetLocation = IacAlertSheetLocation.INVESTING_CURRENCY_DETAIL;
            }
            CrossSellLaunchManager.initIacBottomSheetPolling$default(getCrossSellLaunchManager(), this, iacAlertSheetLocation, null, null, ((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this)).getCurrencyPairId(), null, null, null, ((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this)).getSource(), EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, null);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1126562721);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1126562721, i2, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment.ComposeContent (CryptoDetailFragment.kt:79)");
            }
            ActionHandlingFragment2.ContentWithDialog(this, ComposableLambda3.rememberComposableLambda(-962007549, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment.ComposeContent.1
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
                        ComposerKt.traceEventStart(-962007549, i3, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment.ComposeContent.<anonymous> (CryptoDetailFragment.kt:81)");
                    }
                    Companion companion = CryptoDetailFragment.INSTANCE;
                    Screen.Name name = companion.getArgs((Fragment) CryptoDetailFragment.this) instanceof CryptoDetailV2FragmentKey.Tokenized ? Screen.Name.TOKENIZED_STOCK_DETAIL_PAGE : Screen.Name.CRYPTO_DETAIL_PAGE;
                    String string2 = ((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) CryptoDetailFragment.this)).getCurrencyPairId().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    Screen screen = new Screen(name, null, string2, null, 10, null);
                    String source = ((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) CryptoDetailFragment.this)).getSource();
                    if (source == null) {
                        source = "";
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, source, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1025, -1, -1, -1, -1, -1, 16383, null), null, null, 53, null), ComposableLambda3.rememberComposableLambda(-426962002, true, new AnonymousClass1(CryptoDetailFragment.this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoDetailFragment.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment$ComposeContent$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ CryptoDetailFragment this$0;

                    AnonymousClass1(CryptoDetailFragment cryptoDetailFragment) {
                        this.this$0 = cryptoDetailFragment;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        CryptoDetailDuxo.InitArgs tokenized;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-426962002, i, -1, "com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment.ComposeContent.<anonymous>.<anonymous> (CryptoDetailFragment.kt:96)");
                        }
                        Companion companion = CryptoDetailFragment.INSTANCE;
                        CryptoDetailV2FragmentKey cryptoDetailV2FragmentKey = (CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this.this$0);
                        if (cryptoDetailV2FragmentKey instanceof CryptoDetailV2FragmentKey.Crypto) {
                            tokenized = new CryptoDetailDuxo.InitArgs.Crypto(((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this.this$0)).getCurrencyPairId());
                        } else {
                            if (!(cryptoDetailV2FragmentKey instanceof CryptoDetailV2FragmentKey.Tokenized)) {
                                throw new NoWhenBranchMatchedException();
                            }
                            tokenized = new CryptoDetailDuxo.InitArgs.Tokenized(((CryptoDetailV2FragmentKey) companion.getArgs((Fragment) this.this$0)).getCurrencyPairId());
                        }
                        CryptoDetailDuxo.InitArgs initArgs = tokenized;
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null)), null, 1, null);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.this$0);
                        final CryptoDetailFragment cryptoDetailFragment = this.this$0;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoDetailFragment.C134941.AnonymousClass1.invoke$lambda$1$lambda$0(cryptoDetailFragment, (UiCurrencyPair) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composer.changedInstance(this.this$0);
                        final CryptoDetailFragment cryptoDetailFragment2 = this.this$0;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoDetailFragment.C134941.AnonymousClass1.invoke$lambda$3$lambda$2(cryptoDetailFragment2, (UiCurrencyPair) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        Function1 function12 = (Function1) objRememberedValue2;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(this.this$0);
                        final CryptoDetailFragment cryptoDetailFragment3 = this.this$0;
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment$ComposeContent$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoDetailFragment.C134941.AnonymousClass1.invoke$lambda$5$lambda$4(cryptoDetailFragment3);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        CryptoDetailComposableKt.CryptoDetailComposable(initArgs, function1, function12, modifierLogScreenTransitions$default, null, (Function0) objRememberedValue3, composer, 0, 16);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoDetailFragment cryptoDetailFragment, UiCurrencyPair currencyPair) {
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        CuratedListQuickAddFragment curatedListQuickAddFragment = cryptoDetailFragment.getCuratedListQuickAddFragment();
                        if (curatedListQuickAddFragment != null) {
                            curatedListQuickAddFragment.addToSingleUserList(currencyPair, cryptoDetailFragment.getString(C39088R.string.lists_item_adding_to_single_watchlist), cryptoDetailFragment.getString(C39088R.string.lists_item_added_to_single_watchlist), false);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$2(CryptoDetailFragment cryptoDetailFragment, UiCurrencyPair currencyPair) {
                        Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
                        CuratedListQuickAddFragment curatedListQuickAddFragment = cryptoDetailFragment.getCuratedListQuickAddFragment();
                        if (curatedListQuickAddFragment != null) {
                            curatedListQuickAddFragment.removeFromRecentList(currencyPair, cryptoDetailFragment.getString(C39088R.string.lists_item_removing_from_single_watchlist), cryptoDetailFragment.getString(C39088R.string.lists_item_removed_from_single_watchlist), false);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalArgumentException("Required value was null.");
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$5$lambda$4(CryptoDetailFragment cryptoDetailFragment) {
                        cryptoDetailFragment.requireActivity().onBackPressed();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i2 & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.detail.v2.CryptoDetailFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoDetailFragment.ComposeContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private final void ensureCuratedListQuickAddFragment() {
        if (getCuratedListQuickAddFragment() != null || isStateSaved()) {
            return;
        }
        CuratedListQuickAddFragment curatedListQuickAddFragmentNewInstance = CuratedListQuickAddFragment.INSTANCE.newInstance(false, new Screen(Screen.Name.CRYPTO_DETAIL_PAGE, null, null, null, 14, null));
        if (requireActivity().findViewById(C11048R.id.snackbar_container) != null) {
            curatedListQuickAddFragmentNewInstance.setAnchorView(Integer.valueOf(C11048R.id.snackbar_container));
        }
        getChildFragmentManager().beginTransaction().add(curatedListQuickAddFragmentNewInstance, "quickAddFragment").commit();
    }

    /* compiled from: CryptoDetailFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detail/v2/CryptoDetailFragment;", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailV2FragmentKey;", "<init>", "()V", "QUICK_ADD_TAG", "", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<CryptoDetailFragment, CryptoDetailV2FragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(CryptoDetailV2FragmentKey cryptoDetailV2FragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, cryptoDetailV2FragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public CryptoDetailV2FragmentKey getArgs(CryptoDetailFragment cryptoDetailFragment) {
            return (CryptoDetailV2FragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, cryptoDetailFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoDetailFragment newInstance(CryptoDetailV2FragmentKey cryptoDetailV2FragmentKey) {
            return (CryptoDetailFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, cryptoDetailV2FragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoDetailFragment cryptoDetailFragment, CryptoDetailV2FragmentKey cryptoDetailV2FragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, cryptoDetailFragment, cryptoDetailV2FragmentKey);
        }
    }
}
