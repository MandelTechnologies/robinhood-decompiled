package com.robinhood.android.advisory.dashboard.portfolio.holdings;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.advisory.contracts.AdvisoryUpdatePortfolioFragmentKey;
import com.robinhood.android.advisory.contracts.HoldingsDrillDownFragmentKey;
import com.robinhood.android.advisory.contracts.RestrictStocksFragmentKey;
import com.robinhood.android.advisory.contracts.TaxLossHarvestingKey;
import com.robinhood.android.advisory.dashboard.C8626R;
import com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcher2;
import com.robinhood.android.advisory.dashboard.overview.AdvisoryChartSwitcher4;
import com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings;
import com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.models.p320db.IacInfoBannerLocation;
import com.robinhood.models.util.Money;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.iac.infobanner.InfoBannerComponent;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PortfolioHoldings.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a)\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u000e\u001a/\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0014\u001a=\u0010\u0015\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0016\u001a\u00020\u00012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0003¢\u0006\u0002\u0010\u0019\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u001a²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u008e\u0002²\u0006\n\u0010\u001f\u001a\u00020 X\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020 X\u008a\u008e\u0002"}, m3636d2 = {"TagPortfolioHoldingsLoadingSpinner", "", "TagPortfolioHoldingsAbout", "UpdateInvestorProfileLoggingId", "RestrictSecuritiesLoggingId", "OpenAdjustPortfolioBottomSheetId", "AdjustPortfolioBottomSheetId", "PortfolioHoldings", "", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "holdingsDuxo", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsDuxo;Landroidx/compose/runtime/Composer;II)V", "AccountConfigSection", "brokerageAccountType", "Lcom/robinhood/models/api/BrokerageAccountType;", ResourceTypes.STYLE, "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/AccountConfigStyle;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AdjustPortfolioBottomSheet", "title", "onDismissRequest", "Lkotlin/Function0;", "(Ljava/lang/String;Lcom/robinhood/models/api/BrokerageAccountType;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "viewState", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/PortfolioHoldingsViewState;", "viewMode", "Lcom/robinhood/android/advisory/dashboard/portfolio/holdings/ViewMode;", "aboutBottomSheetVisible", "", "showAdjustPortfolioBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class PortfolioHoldings {
    public static final String AdjustPortfolioBottomSheetId = "adjust_portfolio_sheet";
    public static final String OpenAdjustPortfolioBottomSheetId = "open_adjust_portfolio_sheet";
    public static final String RestrictSecuritiesLoggingId = "restrict_securities";
    public static final String TagPortfolioHoldingsAbout = "portfolio-holdings-about";
    public static final String TagPortfolioHoldingsLoadingSpinner = "portfolio-holdings-loading-spinner";
    public static final String UpdateInvestorProfileLoggingId = "update_investor_profile";

    /* compiled from: PortfolioHoldings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PortfolioHoldingsViewState2.values().length];
            try {
                iArr[PortfolioHoldingsViewState2.ADJUST_PORTFOLIO_CTA_ONLY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PortfolioHoldingsViewState2.FULL_ACCOUNT_SECTION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfigSection$lambda$21(String str, BrokerageAccountType brokerageAccountType, PortfolioHoldingsViewState2 portfolioHoldingsViewState2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountConfigSection(str, brokerageAccountType, portfolioHoldingsViewState2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdjustPortfolioBottomSheet$lambda$22(String str, BrokerageAccountType brokerageAccountType, String str2, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AdjustPortfolioBottomSheet(str, brokerageAccountType, str2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PortfolioHoldings$lambda$8(String str, Modifier modifier, PortfolioHoldingsDuxo portfolioHoldingsDuxo, int i, int i2, Composer composer, int i3) {
        PortfolioHoldings(str, modifier, portfolioHoldingsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x020f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PortfolioHoldings(String str, Modifier modifier, PortfolioHoldingsDuxo portfolioHoldingsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        PortfolioHoldingsDuxo portfolioHoldingsDuxo2;
        int i4;
        boolean z;
        int i5;
        Modifier modifier3;
        PortfolioHoldingsDuxo portfolioHoldingsDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Composer composer2;
        boolean zChangedInstance;
        Object objRememberedValue3;
        final Modifier modifier4;
        final PortfolioHoldingsDuxo portfolioHoldingsDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final String accountNumber = str;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(847105703);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    portfolioHoldingsDuxo2 = portfolioHoldingsDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(portfolioHoldingsDuxo2) ? 256 : 128;
                    i3 |= i7;
                } else {
                    portfolioHoldingsDuxo2 = portfolioHoldingsDuxo;
                }
                i3 |= i7;
            } else {
                portfolioHoldingsDuxo2 = portfolioHoldingsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        z = false;
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(PortfolioHoldingsDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        portfolioHoldingsDuxo2 = (PortfolioHoldingsDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        i4 = -1633490746;
                        z = false;
                    }
                    i5 = i3;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i5 = i3;
                    i4 = -1633490746;
                    modifier3 = modifier2;
                    z = false;
                }
                portfolioHoldingsDuxo3 = portfolioHoldingsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(847105703, i5, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings (PortfolioHoldings.kt:71)");
                }
                int i8 = i4;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(portfolioHoldingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(PortfolioHoldings$lambda$0(snapshotState4CollectAsStateWithLifecycle).getViewMode(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                PortfolioHoldingsViewState portfolioHoldingsViewStatePortfolioHoldings$lambda$0 = PortfolioHoldings$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                Modifier modifier6 = modifier3;
                composer2 = composerStartRestartGroup;
                C87321 c87321 = new C87321(modifier6, !(portfolioHoldingsViewStatePortfolioHoldings$lambda$0 instanceof PortfolioHoldingsViewState.Loaded) ? (PortfolioHoldingsViewState.Loaded) portfolioHoldingsViewStatePortfolioHoldings$lambda$0 : null, snapshotState4CollectAsStateWithLifecycle, accountNumber, snapshotState2, snapshotState, navigator, context);
                accountNumber = accountNumber;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-316421572, true, c87321, composer2, 54), composer2, 6);
                composer2.startReplaceGroup(i8);
                int i9 = i5 & 14;
                zChangedInstance = composer2.changedInstance(portfolioHoldingsDuxo3) | (i9 == 4);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new PortfolioHoldings2(portfolioHoldingsDuxo3, accountNumber, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i9);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
                portfolioHoldingsDuxo4 = portfolioHoldingsDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                portfolioHoldingsDuxo4 = portfolioHoldingsDuxo2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioHoldings.PortfolioHoldings$lambda$8(accountNumber, modifier4, portfolioHoldingsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i & 384) != 0) {
        }
        if ((i3 & 147) == 146) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                i5 = i3;
                modifier3 = modifier5;
                portfolioHoldingsDuxo3 = portfolioHoldingsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i82 = i4;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(portfolioHoldingsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                SnapshotState snapshotState22 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                PortfolioHoldingsViewState portfolioHoldingsViewStatePortfolioHoldings$lambda$02 = PortfolioHoldings$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                Modifier modifier62 = modifier3;
                composer2 = composerStartRestartGroup;
                C87321 c873212 = new C87321(modifier62, !(portfolioHoldingsViewStatePortfolioHoldings$lambda$02 instanceof PortfolioHoldingsViewState.Loaded) ? (PortfolioHoldingsViewState.Loaded) portfolioHoldingsViewStatePortfolioHoldings$lambda$02 : null, snapshotState4CollectAsStateWithLifecycle2, accountNumber, snapshotState22, snapshotState3, navigator2, context2);
                accountNumber = accountNumber;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-316421572, true, c873212, composer2, 54), composer2, 6);
                composer2.startReplaceGroup(i82);
                int i92 = i5 & 14;
                zChangedInstance = composer2.changedInstance(portfolioHoldingsDuxo3) | (i92 == 4);
                objRememberedValue3 = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue3 = new PortfolioHoldings2(portfolioHoldingsDuxo3, accountNumber, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer2, i92);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                    portfolioHoldingsDuxo4 = portfolioHoldingsDuxo3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioHoldings$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: PortfolioHoldings.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1 */
    static final class C87321 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<Boolean> $aboutBottomSheetVisible$delegate;
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ Context $context;
        final /* synthetic */ PortfolioHoldingsViewState.Loaded $loadedViewState;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ SnapshotState<PortfolioHoldings3> $viewMode$delegate;
        final /* synthetic */ SnapshotState4<PortfolioHoldingsViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C87321(Modifier modifier, PortfolioHoldingsViewState.Loaded loaded, SnapshotState4<? extends PortfolioHoldingsViewState> snapshotState4, String str, SnapshotState<Boolean> snapshotState, SnapshotState<PortfolioHoldings3> snapshotState2, Navigator navigator, Context context) {
            this.$modifier = modifier;
            this.$loadedViewState = loaded;
            this.$viewState$delegate = snapshotState4;
            this.$accountNumber = str;
            this.$aboutBottomSheetVisible$delegate = snapshotState;
            this.$viewMode$delegate = snapshotState2;
            this.$navigator = navigator;
            this.$context = context;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* compiled from: PortfolioHoldings.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ PortfolioHoldingsViewState.Loaded $loadedViewState;

            AnonymousClass3(PortfolioHoldingsViewState.Loaded loaded) {
                this.$loadedViewState = loaded;
            }

            /* JADX WARN: Removed duplicated region for block: B:52:0x01cc  */
            /* JADX WARN: Removed duplicated region for block: B:55:0x01f6  */
            /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                int i2;
                final RhModalBottomSheet5 rhModalBottomSheet5;
                Object objRememberedValue;
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 6) == 0) {
                    i2 = i | ((i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i2 & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(331821448, i2, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings.<anonymous>.<anonymous> (PortfolioHoldings.kt:211)");
                }
                PortfolioHoldingsViewState.Loaded loaded = this.$loadedViewState;
                Modifier.Companion companion = Modifier.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i3 = BentoTheme.$stable;
                Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM());
                TextAlign.Companion companion3 = TextAlign.INSTANCE;
                int i4 = i2;
                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_holdings_about_bottom_sheet_title, composer, 0), modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 1, null);
                String disclosure = loaded.getDisclosure();
                composer.startReplaceGroup(992423544);
                if (disclosure == null) {
                    disclosure = StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_holdings_about_bottom_sheet_body, composer, 0);
                }
                composer.endReplaceGroup();
                BentoText2.m20747BentoText38GnDrw(disclosure, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getTextM(), composer, 0, 0, 8124);
                Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2 = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 1, null);
                boolean z = false;
                String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                composer.startReplaceGroup(5004770);
                if ((i4 & 14) != 4) {
                    if ((i4 & 8) != 0) {
                        rhModalBottomSheet5 = RhModalBottomSheet;
                        if (composer.changedInstance(rhModalBottomSheet5)) {
                        }
                    } else {
                        rhModalBottomSheet5 = RhModalBottomSheet;
                    }
                    objRememberedValue = composer.rememberedValue();
                    if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioHoldings.C87321.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                    composer.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        return;
                    }
                    ComposerKt.traceEventEnd();
                    return;
                }
                rhModalBottomSheet5 = RhModalBottomSheet;
                z = true;
                objRememberedValue = composer.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioHoldings.C87321.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(rhModalBottomSheet5);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default2, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                composer.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-316421572, i, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings.<anonymous> (PortfolioHoldings.kt:80)");
            }
            boolean z = PortfolioHoldings.PortfolioHoldings$lambda$0(this.$viewState$delegate) instanceof PortfolioHoldingsViewState.Loading;
            Modifier modifierTestTag = TestTag3.testTag(this.$modifier, PortfolioHoldings.TagPortfolioHoldingsLoadingSpinner);
            final PortfolioHoldingsViewState.Loaded loaded = this.$loadedViewState;
            final String str = this.$accountNumber;
            final SnapshotState<Boolean> snapshotState = this.$aboutBottomSheetVisible$delegate;
            final SnapshotState4<PortfolioHoldingsViewState> snapshotState4 = this.$viewState$delegate;
            final SnapshotState<PortfolioHoldings3> snapshotState2 = this.$viewMode$delegate;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            LocalShowPlaceholder.Loadable(z, modifierTestTag, null, ComposableLambda3.rememberComposableLambda(43421356, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt.PortfolioHoldings.1.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    if ((i2 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(43421356, i2, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings.<anonymous>.<anonymous> (PortfolioHoldings.kt:84)");
                    }
                    PortfolioHoldingsViewState.Loaded loaded2 = loaded;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, loaded2 != null ? loaded2.getEventContext() : null, null, null, 55, null), ComposableLambda3.rememberComposableLambda(1799133217, true, new C495621(str, loaded, snapshotState, snapshotState4, snapshotState2, navigator, context), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: PortfolioHoldings.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C495621 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ SnapshotState<Boolean> $aboutBottomSheetVisible$delegate;
                    final /* synthetic */ String $accountNumber;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ PortfolioHoldingsViewState.Loaded $loadedViewState;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ SnapshotState<PortfolioHoldings3> $viewMode$delegate;
                    final /* synthetic */ SnapshotState4<PortfolioHoldingsViewState> $viewState$delegate;

                    /* compiled from: PortfolioHoldings.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$1$1$WhenMappings */
                    public /* synthetic */ class WhenMappings {
                        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                        static {
                            int[] iArr = new int[PortfolioHoldings3.values().length];
                            try {
                                iArr[PortfolioHoldings3.PERCENT.ordinal()] = 1;
                            } catch (NoSuchFieldError unused) {
                            }
                            try {
                                iArr[PortfolioHoldings3.DOLLAR.ordinal()] = 2;
                            } catch (NoSuchFieldError unused2) {
                            }
                            $EnumSwitchMapping$0 = iArr;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    C495621(String str, PortfolioHoldingsViewState.Loaded loaded, SnapshotState<Boolean> snapshotState, SnapshotState4<? extends PortfolioHoldingsViewState> snapshotState4, SnapshotState<PortfolioHoldings3> snapshotState2, Navigator navigator, Context context) {
                        this.$accountNumber = str;
                        this.$loadedViewState = loaded;
                        this.$aboutBottomSheetVisible$delegate = snapshotState;
                        this.$viewState$delegate = snapshotState4;
                        this.$viewMode$delegate = snapshotState2;
                        this.$navigator = navigator;
                        this.$context = context;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        final SnapshotState<PortfolioHoldings3> snapshotState;
                        int i2;
                        Composer composer2;
                        char c;
                        String percentageString;
                        final Navigator navigator;
                        final Context context;
                        Function0 function0;
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1799133217, i, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldings.<anonymous>.<anonymous>.<anonymous> (PortfolioHoldings.kt:89)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        final String str = this.$accountNumber;
                        PortfolioHoldingsViewState.Loaded loaded = this.$loadedViewState;
                        final SnapshotState<Boolean> snapshotState2 = this.$aboutBottomSheetVisible$delegate;
                        SnapshotState4<PortfolioHoldingsViewState> snapshotState4 = this.$viewState$delegate;
                        SnapshotState<PortfolioHoldings3> snapshotState3 = this.$viewMode$delegate;
                        Navigator navigator2 = this.$navigator;
                        Context context2 = this.$context;
                        Arrangement arrangement = Arrangement.INSTANCE;
                        Arrangement.Vertical top = arrangement.getTop();
                        Alignment.Companion companion2 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion, 0.0f, bentoTheme.getSpacing(composer, i3).m21593getSmallD9Ej5fM(), 1, null);
                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.Absolute.INSTANCE.getSpaceBetween(), companion2.getCenterVertically(), composer, 54);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor2);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        Row6 row6 = Row6.INSTANCE;
                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion2.getCenterVertically(), composer, 48);
                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer, companion);
                        Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor3);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                        Navigator navigator3 = navigator2;
                        Context context3 = context2;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_holdings, composer, 0), null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i3).getDisplayCapsuleMedium(), composer, 0, 0, 8190);
                        Composer composer3 = composer;
                        composer3.startReplaceGroup(1318393347);
                        if ((loaded != null ? loaded.getDisclosure() : null) != null) {
                            Modifier modifierTestTag = TestTag3.testTag(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null), PortfolioHoldings.TagPortfolioHoldingsAbout);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composer3, i3).m21426getFg20d7_KjU();
                            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_holdings, composer3, 0);
                            composer3.startReplaceGroup(5004770);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioHoldings.C87321.AnonymousClass1.C495621.invoke$lambda$9$lambda$5$lambda$2$lambda$1$lambda$0(snapshotState2);
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21426getFg20d7_KjU, modifierTestTag, (Function0) objRememberedValue, false, composer3, BentoIcon4.Size24.$stable | 24576, 32);
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        composer3.startReplaceGroup(1385479939);
                        if (PortfolioHoldings.PortfolioHoldings$lambda$0(snapshotState4).getShowTotalValueToggle()) {
                            i2 = 0;
                            ImmutableList3 immutableList3PersistentListOf = extensions2.persistentListOf(new AdvisoryChartSwitcher4.Value(StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_percentage_sign, composer3, 0), StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_allocation, composer3, 0)), new AdvisoryChartSwitcher4.Value(StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_dollar_sign, composer3, 0), StringResources_androidKt.stringResource(C8626R.string.advisory_dashboard_your_equity, composer3, 0)));
                            int iOrdinal = PortfolioHoldings.PortfolioHoldings$lambda$2(snapshotState3).ordinal();
                            composer3.startReplaceGroup(5004770);
                            Object objRememberedValue2 = composer3.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                snapshotState = snapshotState3;
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PortfolioHoldings.C87321.AnonymousClass1.C495621.invoke$lambda$9$lambda$5$lambda$4$lambda$3(snapshotState, ((Integer) obj).intValue());
                                    }
                                };
                                composer3.updateRememberedValue(objRememberedValue2);
                            } else {
                                snapshotState = snapshotState3;
                            }
                            composer3.endReplaceGroup();
                            AdvisoryChartSwitcher2.AdvisoryDashboardSwitcher(immutableList3PersistentListOf, iOrdinal, (Function1) objRememberedValue2, null, false, composer3, 384, 24);
                        } else {
                            snapshotState = snapshotState3;
                            i2 = 0;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        int i4 = i2;
                        SnapshotState<PortfolioHoldings3> snapshotState5 = snapshotState;
                        InfoBannerComponent.InfoBannerComponent(str, IacInfoBannerLocation.INFO_BANNER_MANAGED_DASHBOARD_BELOW_PORTFOLIO_SECTION_HEADER, null, null, null, null, null, null, null, null, null, androidx.compose.foundation.layout.PaddingKt.m5136PaddingValuesYgX7TsA(((C2002Dp) composer3.consume(Spacing2.getLocalHorizontalPadding())).getValue(), bentoTheme.getSpacing(composer3, i3).m21593getSmallD9Ej5fM()), null, composer3, 48, 0, 6140);
                        PortfolioHoldingsViewState portfolioHoldingsViewStatePortfolioHoldings$lambda$0 = PortfolioHoldings.PortfolioHoldings$lambda$0(snapshotState4);
                        if (portfolioHoldingsViewStatePortfolioHoldings$lambda$0 instanceof PortfolioHoldingsViewState.Loaded) {
                            composer3.startReplaceGroup(-381530903);
                            composer3.startReplaceGroup(1650261706);
                            PortfolioHoldingsViewState.Loaded loaded2 = (PortfolioHoldingsViewState.Loaded) portfolioHoldingsViewStatePortfolioHoldings$lambda$0;
                            Composer composer4 = composer3;
                            for (final HoldingRowData holdingRowData : loaded2.getHoldingRows()) {
                                String name = holdingRowData.getName();
                                String secondaryText = holdingRowData.getSecondaryText();
                                int i5 = WhenMappings.$EnumSwitchMapping$0[PortfolioHoldings.PortfolioHoldings$lambda$2(snapshotState5).ordinal()];
                                if (i5 != 1) {
                                    c = 2;
                                    if (i5 != 2) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    percentageString = Money.format$default(holdingRowData.getAmount(), null, false, null, false, 0, null, false, null, false, false, 1023, null);
                                } else {
                                    c = 2;
                                    percentageString = holdingRowData.getPercentageString();
                                }
                                BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(percentageString);
                                composer4.startReplaceGroup(1650283806);
                                if (loaded2.getCanNavigateToDrillDown()) {
                                    composer4.startReplaceGroup(-1224400529);
                                    navigator = navigator3;
                                    context = context3;
                                    boolean zChangedInstance = composer4.changedInstance(navigator) | composer4.changedInstance(context) | composer4.changed(str) | composer4.changedInstance(holdingRowData);
                                    Object objRememberedValue3 = composer4.rememberedValue();
                                    if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$1$1$$ExternalSyntheticLambda2
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return PortfolioHoldings.C87321.AnonymousClass1.C495621.invoke$lambda$9$lambda$8$lambda$7$lambda$6(navigator, context, str, holdingRowData);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer4.endReplaceGroup();
                                    function0 = (Function0) objRememberedValue3;
                                } else {
                                    navigator = navigator3;
                                    context = context3;
                                    function0 = null;
                                }
                                composer4.endReplaceGroup();
                                navigator3 = navigator;
                                context3 = context;
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, name, secondaryText, null, singleLine, null, true, false, false, 0L, function0, composer4, (BentoBaseRowState.Meta.SingleLine.$stable << 15) | 12582912, 0, 1875);
                                composer4 = composer;
                            }
                            composer.endReplaceGroup();
                            PortfolioHoldings.AccountConfigSection(str, loaded2.getBrokerageAccountType(), loaded2.getAccountConfigStyle(), null, composer, 0, 8);
                            Composer composer5 = composer;
                            composer5.endReplaceGroup();
                            composer2 = composer5;
                        } else {
                            if (!(portfolioHoldingsViewStatePortfolioHoldings$lambda$0 instanceof PortfolioHoldingsViewState.Loading)) {
                                composer3.startReplaceGroup(1650258053);
                                composer3.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer3.startReplaceGroup(-379636617);
                            for (int i6 = i4; i6 < 3; i6++) {
                                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, "---- -- ---- ------- ----", "---- -- --- ------- --------- ---- ---- ---- ----", null, null, null, false, false, false, 0L, null, composer3, 3456, 0, 4083);
                            }
                            composer3.endReplaceGroup();
                            composer2 = composer3;
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$5$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
                        PortfolioHoldings.PortfolioHoldings$lambda$6(snapshotState, true);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState, int i) {
                        PortfolioHoldings3 portfolioHoldings3;
                        if (i == 0) {
                            portfolioHoldings3 = PortfolioHoldings3.PERCENT;
                        } else {
                            portfolioHoldings3 = PortfolioHoldings3.DOLLAR;
                        }
                        PortfolioHoldings.PortfolioHoldings$lambda$3(snapshotState, portfolioHoldings3);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$9$lambda$8$lambda$7$lambda$6(Navigator navigator, Context context, String str, HoldingRowData holdingRowData) {
                        Navigator.DefaultImpls.showFragment$default(navigator, context, new HoldingsDrillDownFragmentKey(str, holdingRowData.getAssetClassRegion()), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, 3072, 4);
            if (PortfolioHoldings.PortfolioHoldings$lambda$5(this.$aboutBottomSheetVisible$delegate) && this.$loadedViewState != null) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState3 = this.$aboutBottomSheetVisible$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$PortfolioHoldings$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return PortfolioHoldings.C87321.invoke$lambda$1$lambda$0(snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(331821448, true, new AnonymousClass3(this.$loadedViewState), composer, 54), composer, 1572870, 62);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            PortfolioHoldings.PortfolioHoldings$lambda$6(snapshotState, false);
            return Unit.INSTANCE;
        }
    }

    private static final boolean AccountConfigSection$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioHoldingsViewState PortfolioHoldings$lambda$0(SnapshotState4<? extends PortfolioHoldingsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PortfolioHoldings3 PortfolioHoldings$lambda$2(SnapshotState<PortfolioHoldings3> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean PortfolioHoldings$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void PortfolioHoldings$lambda$3(SnapshotState<PortfolioHoldings3> snapshotState, PortfolioHoldings3 portfolioHoldings3) {
        snapshotState.setValue(portfolioHoldings3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:106:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x03b3  */
    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0357  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountConfigSection(final String str, final BrokerageAccountType brokerageAccountType, final PortfolioHoldingsViewState2 portfolioHoldingsViewState2, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        int i4;
        int i5;
        final SnapshotState snapshotState;
        Modifier modifier3;
        int i6;
        final Modifier modifier4;
        int i7;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1421573666);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(portfolioHoldingsViewState2.ordinal()) ? 256 : 128;
        }
        int i8 = i2 & 8;
        if (i8 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1421573666, i3, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AccountConfigSection (PortfolioHoldings.kt:255)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[portfolioHoldingsViewState2.ordinal()];
                if (i4 != 1) {
                    i5 = i3;
                    snapshotState = snapshotState2;
                    modifier3 = modifier5;
                    i6 = 5004770;
                    composerStartRestartGroup.startReplaceGroup(1723998964);
                    String strStringResource = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio, composerStartRestartGroup, 0);
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier3, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), composerStartRestartGroup, (i5 >> 9) & 14, 0), UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, OpenAdjustPortfolioBottomSheetId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioHoldings.AccountConfigSection$lambda$13$lambda$12(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, strStringResource, modifierAutoLogEvents$default, null, null, false, null, composerStartRestartGroup, 6, 120);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i4 != 2) {
                        composerStartRestartGroup.startReplaceGroup(332707215);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1725072897);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifier5, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21594getXlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    Modifier modifier6 = modifier5;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    String strStringResource2 = StringResources_androidKt.stringResource(C8626R.string.account_config_section_title, composerStartRestartGroup, 0);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    snapshotState = snapshotState2;
                    modifier3 = modifier6;
                    i5 = i3;
                    i6 = 5004770;
                    BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i9).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i9).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    String strStringResource3 = StringResources_androidKt.stringResource(C8626R.string.gated_options_adjust_portfolio_title_alt, composerStartRestartGroup, 0);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.ROW, OpenAdjustPortfolioBottomSheetId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioHoldings.AccountConfigSection$lambda$18$lambda$15$lambda$14(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, strStringResource3, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue3, composerStartRestartGroup, 0, 48, 2042);
                    String strStringResource4 = StringResources_androidKt.stringResource(C8626R.string.account_config_tax_loss_harvesting_cta, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioHoldings.AccountConfigSection$lambda$18$lambda$17$lambda$16(navigator, context);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, null, strStringResource4, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue4, composerStartRestartGroup, 0, 0, 2043);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endNode();
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                if (AccountConfigSection$lambda$10(snapshotState)) {
                    int i10 = iArr[portfolioHoldingsViewState2.ordinal()];
                    if (i10 == 1) {
                        i7 = C8626R.string.adjust_portfolio_bottom_sheet_title;
                    } else {
                        if (i10 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i7 = C8626R.string.gated_options_adjust_portfolio_title_alt;
                    }
                    String strStringResource5 = StringResources_androidKt.stringResource(i7, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(i6);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return PortfolioHoldings.AccountConfigSection$lambda$20$lambda$19(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    AdjustPortfolioBottomSheet(str, brokerageAccountType, strStringResource5, (Function0) objRememberedValue5, null, composer2, (i5 & 14) | 3072 | (i5 & 112), 16);
                    composerStartRestartGroup = composer2;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioHoldings.AccountConfigSection$lambda$21(str, brokerageAccountType, portfolioHoldingsViewState2, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            i4 = iArr2[portfolioHoldingsViewState2.ordinal()];
            if (i4 != 1) {
            }
            if (AccountConfigSection$lambda$10(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void AccountConfigSection$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfigSection$lambda$13$lambda$12(SnapshotState snapshotState) {
        AccountConfigSection$lambda$11(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfigSection$lambda$18$lambda$15$lambda$14(SnapshotState snapshotState) {
        AccountConfigSection$lambda$11(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfigSection$lambda$18$lambda$17$lambda$16(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new TaxLossHarvestingKey(null, null, 3, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountConfigSection$lambda$20$lambda$19(SnapshotState snapshotState) {
        AccountConfigSection$lambda$11(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void AdjustPortfolioBottomSheet(final String str, final BrokerageAccountType brokerageAccountType, final String str2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        final String str3;
        int i3;
        final String str4;
        Function0<Unit> function02;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1246638504);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str3) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(brokerageAccountType.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str4 = str2;
        } else {
            str4 = str2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str4) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
            }
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1246638504, i3, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AdjustPortfolioBottomSheet (PortfolioHoldings.kt:356)");
                }
                final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                int i5 = i3 >> 9;
                Modifier modifier5 = modifier4;
                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, modifier5, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1837815985, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt.AdjustPortfolioBottomSheet.1

                    /* compiled from: PortfolioHoldings.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ BrokerageAccountType $brokerageAccountType;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                        final /* synthetic */ String $title;

                        AnonymousClass1(String str, Navigator navigator, Context context, String str2, BrokerageAccountType brokerageAccountType, RhModalBottomSheet5 rhModalBottomSheet5) {
                            this.$title = str;
                            this.$navigator = navigator;
                            this.$context = context;
                            this.$accountNumber = str2;
                            this.$brokerageAccountType = brokerageAccountType;
                            this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                        }

                        public final void invoke(Composer composer, int i) {
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2138136348, i, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AdjustPortfolioBottomSheet.<anonymous>.<anonymous> (PortfolioHoldings.kt:373)");
                            }
                            String str = this.$title;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            final String str2 = this.$accountNumber;
                            final BrokerageAccountType brokerageAccountType = this.$brokerageAccountType;
                            final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer.startReusableNode();
                            if (composer.getInserting()) {
                                composer.createNode(constructor);
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                            BentoText2.m20747BentoText38GnDrw(str, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
                            String strStringResource = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_update_ip_title, composer, 0);
                            String strStringResource2 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_update_ip_subtitle, composer, 0);
                            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            Component.ComponentType componentType = Component.ComponentType.ROW;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, PortfolioHoldings.UpdateInvestorProfileLoggingId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str2) | composer.changed(brokerageAccountType.ordinal());
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$1$lambda$0(navigator, context, str2, brokerageAccountType);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, strStringResource2, null, null, null, true, false, false, 0L, (Function0) objRememberedValue, composer, 12582912, 0, 1906);
                            String strStringResource3 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_restrict_stocks_title, composer, 0);
                            String strStringResource4 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_restrict_stocks_subtitle, composer, 0);
                            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, PortfolioHoldings.RestrictSecuritiesLoggingId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                            composer.startReplaceGroup(-1746271574);
                            boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str2);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$3$lambda$2(navigator, context, str2);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, strStringResource3, strStringResource4, null, null, null, true, false, false, 0L, (Function0) objRememberedValue2, composer, 12582912, 0, 1906);
                            Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                            String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0);
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer.changedInstance(rhModalBottomSheet5);
                            Object objRememberedValue3 = composer.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(rhModalBottomSheet5);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            composer.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource5, modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                            composer.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$1$lambda$0(Navigator navigator, Context context, String str, BrokerageAccountType brokerageAccountType) {
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryUpdatePortfolioFragmentKey(str, null, brokerageAccountType), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$3$lambda$2(Navigator navigator, Context context, String str) {
                            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RestrictStocksFragmentKey(str), false, false, false, false, null, false, null, null, 1020, null);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$6$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
                            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                        invoke(rhModalBottomSheet5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                        if ((i6 & 6) == 0) {
                            i6 |= (i6 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1837815985, i6, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AdjustPortfolioBottomSheet.<anonymous> (PortfolioHoldings.kt:363)");
                        }
                        AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, PortfolioHoldings.AdjustPortfolioBottomSheetId, null, 4, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(2138136348, true, new AnonymousClass1(str4, navigator, context, str3, brokerageAccountType, RhModalBottomSheet), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, (i5 & 14) | 1572864 | (i5 & 112), 60);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PortfolioHoldings.AdjustPortfolioBottomSheet$lambda$22(str, brokerageAccountType, str2, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            int i52 = i3 >> 9;
            Modifier modifier52 = modifier4;
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function02, modifier52, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(1837815985, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt.AdjustPortfolioBottomSheet.1

                /* compiled from: PortfolioHoldings.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ String $accountNumber;
                    final /* synthetic */ BrokerageAccountType $brokerageAccountType;
                    final /* synthetic */ Context $context;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ RhModalBottomSheet5 $this_RhModalBottomSheet;
                    final /* synthetic */ String $title;

                    AnonymousClass1(String str, Navigator navigator, Context context, String str2, BrokerageAccountType brokerageAccountType, RhModalBottomSheet5 rhModalBottomSheet5) {
                        this.$title = str;
                        this.$navigator = navigator;
                        this.$context = context;
                        this.$accountNumber = str2;
                        this.$brokerageAccountType = brokerageAccountType;
                        this.$this_RhModalBottomSheet = rhModalBottomSheet5;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2138136348, i, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AdjustPortfolioBottomSheet.<anonymous>.<anonymous> (PortfolioHoldings.kt:373)");
                        }
                        String str = this.$title;
                        final Navigator navigator = this.$navigator;
                        final Context context = this.$context;
                        final String str2 = this.$accountNumber;
                        final BrokerageAccountType brokerageAccountType = this.$brokerageAccountType;
                        final RhModalBottomSheet5 rhModalBottomSheet5 = this.$this_RhModalBottomSheet;
                        Modifier.Companion companion = Modifier.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer.startReusableNode();
                        if (composer.getInserting()) {
                            composer.createNode(constructor);
                        } else {
                            composer.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                        int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                        BentoText2.m20747BentoText38GnDrw(str, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i2).getDisplayCapsuleMedium(), composer, 0, 0, 8124);
                        String strStringResource = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_update_ip_title, composer, 0);
                        String strStringResource2 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_update_ip_subtitle, composer, 0);
                        UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        Component.ComponentType componentType = Component.ComponentType.ROW;
                        Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, PortfolioHoldings.UpdateInvestorProfileLoggingId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        composer.startReplaceGroup(-1224400529);
                        boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str2) | composer.changed(brokerageAccountType.ordinal());
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$1$lambda$0(navigator, context, str2, brokerageAccountType);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, strStringResource, strStringResource2, null, null, null, true, false, false, 0L, (Function0) objRememberedValue, composer, 12582912, 0, 1906);
                        String strStringResource3 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_restrict_stocks_title, composer, 0);
                        String strStringResource4 = StringResources_androidKt.stringResource(C8626R.string.adjust_portfolio_bottom_sheet_restrict_stocks_subtitle, composer, 0);
                        Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, PortfolioHoldings.RestrictSecuritiesLoggingId, null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChangedInstance2 = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(str2);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$3$lambda$2(navigator, context, str2);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, strStringResource3, strStringResource4, null, null, null, true, false, false, 0L, (Function0) objRememberedValue2, composer, 12582912, 0, 1906);
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN42 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM());
                        String strStringResource5 = StringResources_androidKt.stringResource(C11048R.string.general_label_close, composer, 0);
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance3 = composer.changedInstance(rhModalBottomSheet5);
                        Object objRememberedValue3 = composer.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.dashboard.portfolio.holdings.PortfolioHoldingsKt$AdjustPortfolioBottomSheet$1$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PortfolioHoldings.C87311.AnonymousClass1.invoke$lambda$6$lambda$5$lambda$4(rhModalBottomSheet5);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue3);
                        }
                        composer.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, strStringResource5, modifierM21620defaultFillMaxWidthPaddingVpY3zN42, null, null, false, false, null, null, null, null, false, null, composer, 0, 0, 8184);
                        composer.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$1$lambda$0(Navigator navigator, Context context, String str, BrokerageAccountType brokerageAccountType) {
                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AdvisoryUpdatePortfolioFragmentKey(str, null, brokerageAccountType), false, false, false, false, null, false, null, null, 1020, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$3$lambda$2(Navigator navigator, Context context, String str) {
                        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new RestrictStocksFragmentKey(str), false, false, false, false, null, false, null, null, 1020, null);
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$6$lambda$5$lambda$4(RhModalBottomSheet5 rhModalBottomSheet5) {
                        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                    invoke(rhModalBottomSheet5, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i6) {
                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                    if ((i6 & 6) == 0) {
                        i6 |= (i6 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1837815985, i6, -1, "com.robinhood.android.advisory.dashboard.portfolio.holdings.AdjustPortfolioBottomSheet.<anonymous> (PortfolioHoldings.kt:363)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BOTTOM_SHEET, PortfolioHoldings.AdjustPortfolioBottomSheetId, null, 4, null), null, 47, null)), ComposableLambda3.rememberComposableLambda(2138136348, true, new AnonymousClass1(str4, navigator2, context2, str3, brokerageAccountType, RhModalBottomSheet), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i52 & 14) | 1572864 | (i52 & 112), 60);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
