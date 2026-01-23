package com.robinhood.shared.trade.crypto.p397ui.coinlist;

import android.content.Context;
import android.net.Uri;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material.ModalBottomSheetKt;
import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.material.ModalBottomSheetValue;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.options.comboorders.detail.TestTags;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.theme.Spacing2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.crypto.p314db.trading.CryptoTradingOptions;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.coinlist.CryptoTradingCoinListComposable3;
import com.robinhood.shared.trade.crypto.p397ui.coinlist.CryptoTradingCoinListViewState;
import com.robinhood.utils.compose.HideBottomSheetOnBackPress;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoTradingCoinListComposable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\u001aI\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0013\u001a)\u0010\u0014\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u0015\u001a'\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H\u0003¢\u0006\u0002\u0010\u0019\u001a\u0015\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u001d\u001a\u001e\u0010\u001e\u001a\u00020\u0001*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!2\u0006\u0010\"\u001a\u00020\u000bH\u0002\u001a\u0016\u0010#\u001a\u00020\u0001*\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0002\"\u0016\u0010$\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b%\u0010&\"\u0016\u0010'\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b(\u0010&\"\u0016\u0010)\u001a\u00020\u000b8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b*\u0010&¨\u0006+²\u0006\n\u0010,\u001a\u00020-X\u008a\u0084\u0002²\u0006\n\u0010.\u001a\u00020/X\u008a\u008e\u0002²\u0006\n\u00100\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\n\u00101\u001a\u00020/X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTradingCoinListComposable", "", "onCloseClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListDuxo;Landroidx/compose/runtime/Composer;II)V", "LoadedContent", "query", "", "displayItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;", "onQueryChanged", "Lkotlin/Function1;", "scaffoldPadding", "Landroidx/compose/foundation/layout/PaddingValues;", "(Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "SearchTextField", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "CoinRow", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "onClick", "(Lcom/robinhood/models/crypto/db/trading/CryptoTradingOptions$TradingOptionItem;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "percentChangeColor", "Landroidx/compose/ui/graphics/Color;", "percentChange", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)J", "logSearchQueryType", "Lcom/robinhood/analytics/EventLogger;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "text", "logInfoSheetAppear", "LOADING_TAG", "getLOADING_TAG$annotations", "()V", "LOADED_TAG", "getLOADED_TAG$annotations", "SEARCH_TEXT_FIELD_TAG", "getSEARCH_TEXT_FIELD_TAG$annotations", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/coinlist/CryptoTradingCoinListViewState;", "showInfoSheet", "", "queryText", "showClearIcon"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTradingCoinListComposable3 {
    public static final String LOADED_TAG = "crypto_trading_coin_list_loaded";
    public static final String LOADING_TAG = "crypto_trading_coin_list_loading";
    public static final String SEARCH_TEXT_FIELD_TAG = "crypto_trading_coin_list_search_text_field";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRow$lambda$32(CryptoTradingOptions.TradingOptionItem tradingOptionItem, Function0 function0, int i, int i2, Composer composer, int i3) {
        CoinRow(tradingOptionItem, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradingCoinListComposable$lambda$10(Function0 function0, Modifier modifier, CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTradingCoinListComposable(function0, modifier, cryptoTradingCoinListDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$17(String str, ImmutableList immutableList, Function1 function1, PaddingValues paddingValues, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LoadedContent(str, immutableList, function1, paddingValues, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$28(String str, Function1 function1, int i, Composer composer, int i2) {
        SearchTextField(str, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLOADED_TAG$annotations() {
    }

    public static /* synthetic */ void getLOADING_TAG$annotations() {
    }

    public static /* synthetic */ void getSEARCH_TEXT_FIELD_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:98:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTradingCoinListComposable(final Function0<Unit> onCloseClick, Modifier modifier, CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo2;
        Modifier modifier3;
        CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(2078131556);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onCloseClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoTradingCoinListDuxo2 = cryptoTradingCoinListDuxo;
                    int i5 = composerStartRestartGroup.changedInstance(cryptoTradingCoinListDuxo2) ? 256 : 128;
                    i3 |= i5;
                } else {
                    cryptoTradingCoinListDuxo2 = cryptoTradingCoinListDuxo;
                }
                i3 |= i5;
            } else {
                cryptoTradingCoinListDuxo2 = cryptoTradingCoinListDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTradingCoinListDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        i3 &= -897;
                        modifier3 = modifier5;
                        cryptoTradingCoinListDuxo3 = (CryptoTradingCoinListDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2078131556, i3, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable (CryptoTradingCoinListComposable.kt:78)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTradingCoinListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        final Screen screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6);
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$2$lambda$1();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        HideBottomSheetOnBackPress.HideBottomSheetOnBackPress(modalBottomSheetStateRememberModalBottomSheetState, null, composerStartRestartGroup, ModalBottomSheetState.$stable, 2);
                        Composer composer2 = composerStartRestartGroup;
                        CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo5 = cryptoTradingCoinListDuxo3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.statusBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(-2019925208, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CryptoTradingCoinListComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i6) {
                                if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2019925208, i6, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous> (CryptoTradingCoinListComposable.kt:96)");
                                }
                                Function2<Composer, Integer, Unit> lambda$693859797$feature_trade_crypto_externalDebug = CryptoTradingCoinListComposable.INSTANCE.getLambda$693859797$feature_trade_crypto_externalDebug();
                                final Function0<Unit> function0 = onCloseClick;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$693859797$feature_trade_crypto_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1615661015, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CryptoTradingCoinListComposable.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                        invoke(bentoAppBarScope, composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i7 & 6) == 0) {
                                            i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1615661015, i7, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:98)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), ComposableLambda3.rememberComposableLambda(-376683190, true, new AnonymousClass2(screen, current2, softwareKeyboardController, snapshotState), composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: CryptoTradingCoinListComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$1$2, reason: invalid class name */
                            static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                                final /* synthetic */ EventLogger $eventLogger;
                                final /* synthetic */ SoftwareKeyboardController $keyboardController;
                                final /* synthetic */ Screen $screen;
                                final /* synthetic */ SnapshotState<Boolean> $showInfoSheet$delegate;

                                AnonymousClass2(Screen screen, EventLogger eventLogger, SoftwareKeyboardController softwareKeyboardController, SnapshotState<Boolean> snapshotState) {
                                    this.$screen = screen;
                                    this.$eventLogger = eventLogger;
                                    this.$keyboardController = softwareKeyboardController;
                                    this.$showInfoSheet$delegate = snapshotState;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                                    invoke(row5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i & 17) == 16 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-376683190, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:100)");
                                    }
                                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 11, null), new UserInteractionEventDescriptor(null, this.$screen, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                    String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_coin_list_selection_info_content_description, composer, 0);
                                    long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changed(this.$keyboardController) | composer.changed(this.$showInfoSheet$delegate);
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final Screen screen = this.$screen;
                                    final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                                    final SnapshotState<Boolean> snapshotState = this.$showInfoSheet$delegate;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$1$2$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CryptoTradingCoinListComposable3.C401611.AnonymousClass2.invoke$lambda$1$lambda$0(eventLogger, screen, softwareKeyboardController, snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable, 32);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, SoftwareKeyboardController softwareKeyboardController, SnapshotState snapshotState) {
                                    CryptoTradingCoinListComposable3.logInfoSheetAppear(eventLogger, screen);
                                    if (softwareKeyboardController != null) {
                                        softwareKeyboardController.hide();
                                    }
                                    CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$4(snapshotState, true);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1068308147, true, new C401622(snapshotState4CollectAsStateWithLifecycle, cryptoTradingCoinListDuxo3), composerStartRestartGroup, 54), composer2, 805306416, 508);
                        composerStartRestartGroup = composer2;
                        if (CryptoTradingCoinListComposable$lambda$3(snapshotState)) {
                            CryptoTradingCoinListViewState.InfoSheetContent infoSheetContent = CryptoTradingCoinListComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getInfoSheetContent();
                            StringResource title = infoSheetContent.getTitle();
                            int i6 = StringResource.$stable;
                            String string2 = StringResource2.getString(title, composerStartRestartGroup, i6);
                            String string3 = StringResource2.getString(infoSheetContent.getBody(), composerStartRestartGroup, i6);
                            String string4 = StringResource2.getString(infoSheetContent.getCtaText(), composerStartRestartGroup, i6);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged = composerStartRestartGroup.changed(snapshotState);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda7
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$7$lambda$6(snapshotState, (RhModalBottomSheet5) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            Function1 function1 = (Function1) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean zChanged2 = composerStartRestartGroup.changed(snapshotState);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda8
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$9$lambda$8(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            RhContentBottomSheet2.RhContentBottomSheet(string2, string3, string4, function1, (Function0) objRememberedValue4, null, null, null, null, false, null, null, composerStartRestartGroup, 0, 0, 4064);
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        cryptoTradingCoinListDuxo4 = cryptoTradingCoinListDuxo5;
                        modifier4 = modifier3;
                    } else {
                        modifier3 = modifier5;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                cryptoTradingCoinListDuxo3 = cryptoTradingCoinListDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTradingCoinListDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final Screen screen2 = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                final SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                ModalBottomSheetState modalBottomSheetStateRememberModalBottomSheetState2 = ModalBottomSheetKt.rememberModalBottomSheetState(ModalBottomSheetValue.Hidden, null, null, true, composerStartRestartGroup, 3078, 6);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                HideBottomSheetOnBackPress.HideBottomSheetOnBackPress(modalBottomSheetStateRememberModalBottomSheetState2, null, composerStartRestartGroup, ModalBottomSheetState.$stable, 2);
                Composer composer22 = composerStartRestartGroup;
                CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo52 = cryptoTradingCoinListDuxo3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(WindowInsetsPadding_androidKt.statusBarsPadding(modifier3), ComposableLambda3.rememberComposableLambda(-2019925208, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CryptoTradingCoinListComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i62) {
                        if ((i62 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2019925208, i62, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous> (CryptoTradingCoinListComposable.kt:96)");
                        }
                        Function2<Composer, Integer, Unit> lambda$693859797$feature_trade_crypto_externalDebug = CryptoTradingCoinListComposable.INSTANCE.getLambda$693859797$feature_trade_crypto_externalDebug();
                        final Function0<Unit> function0 = onCloseClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$693859797$feature_trade_crypto_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1615661015, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CryptoTradingCoinListComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1615661015, i7, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:98)");
                                }
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), ComposableLambda3.rememberComposableLambda(-376683190, true, new AnonymousClass2(screen2, current22, softwareKeyboardController2, snapshotState), composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTradingCoinListComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ SoftwareKeyboardController $keyboardController;
                        final /* synthetic */ Screen $screen;
                        final /* synthetic */ SnapshotState<Boolean> $showInfoSheet$delegate;

                        AnonymousClass2(Screen screen, EventLogger eventLogger, SoftwareKeyboardController softwareKeyboardController, SnapshotState<Boolean> snapshotState) {
                            this.$screen = screen;
                            this.$eventLogger = eventLogger;
                            this.$keyboardController = softwareKeyboardController;
                            this.$showInfoSheet$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                            invoke(row5, composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i & 17) == 16 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-376683190, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:100)");
                            }
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, ((C2002Dp) composer.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 11, null), new UserInteractionEventDescriptor(null, this.$screen, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_coin_list_selection_info_content_description, composer, 0);
                            long jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(this.$eventLogger) | composer.changedInstance(this.$screen) | composer.changed(this.$keyboardController) | composer.changed(this.$showInfoSheet$delegate);
                            final EventLogger eventLogger = this.$eventLogger;
                            final Screen screen = this.$screen;
                            final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                            final SnapshotState snapshotState = this.$showInfoSheet$delegate;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTradingCoinListComposable3.C401611.AnonymousClass2.invoke$lambda$1$lambda$0(eventLogger, screen, softwareKeyboardController, snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, strStringResource, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, SoftwareKeyboardController softwareKeyboardController, SnapshotState snapshotState) {
                            CryptoTradingCoinListComposable3.logInfoSheetAppear(eventLogger, screen);
                            if (softwareKeyboardController != null) {
                                softwareKeyboardController.hide();
                            }
                            CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$4(snapshotState, true);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1068308147, true, new C401622(snapshotState4CollectAsStateWithLifecycle2, cryptoTradingCoinListDuxo3), composerStartRestartGroup, 54), composer22, 805306416, 508);
                composerStartRestartGroup = composer22;
                if (CryptoTradingCoinListComposable$lambda$3(snapshotState)) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoTradingCoinListDuxo4 = cryptoTradingCoinListDuxo52;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTradingCoinListDuxo4 = cryptoTradingCoinListDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$10(onCloseClick, modifier4, cryptoTradingCoinListDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i4 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTradingCoinListViewState CryptoTradingCoinListComposable$lambda$0(SnapshotState4<? extends CryptoTradingCoinListViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final boolean CryptoTradingCoinListComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final String SearchTextField$lambda$19(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SearchTextField$lambda$22(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoTradingCoinListComposable$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTradingCoinListComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoTradingCoinListComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$2 */
    static final class C401622 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CryptoTradingCoinListDuxo $duxo;
        final /* synthetic */ SnapshotState4<CryptoTradingCoinListViewState> $viewState$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C401622(SnapshotState4<? extends CryptoTradingCoinListViewState> snapshotState4, CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo) {
            this.$viewState$delegate = snapshotState4;
            this.$duxo = cryptoTradingCoinListDuxo;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(final PaddingValues scaffoldPadding, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(scaffoldPadding, "scaffoldPadding");
            if ((i & 6) == 0) {
                i |= composer.changed(scaffoldPadding) ? 4 : 2;
            }
            if ((i & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1068308147, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous> (CryptoTradingCoinListComposable.kt:129)");
            }
            CryptoTradingCoinListViewState cryptoTradingCoinListViewStateCryptoTradingCoinListComposable$lambda$0 = CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$0(this.$viewState$delegate);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTradingCoinListComposable3.C401622.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoTradingCoinListComposable3.C401622.invoke$lambda$3$lambda$2((CryptoTradingCoinListViewState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            final CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo = this.$duxo;
            AnimatedContentKt.AnimatedContent(cryptoTradingCoinListViewStateCryptoTradingCoinListComposable$lambda$0, null, function1, null, "content", (Function1) objRememberedValue2, ComposableLambda3.rememberComposableLambda(-421039171, true, new Function4<AnimatedContentScope, CryptoTradingCoinListViewState, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CryptoTradingCoinListComposable.2.3
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, CryptoTradingCoinListViewState cryptoTradingCoinListViewState, Composer composer2, Integer num) {
                    invoke(animatedContentScope, cryptoTradingCoinListViewState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, CryptoTradingCoinListViewState state, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(state, "state");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-421039171, i2, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:142)");
                    }
                    if (state instanceof CryptoTradingCoinListViewState.Loading) {
                        composer2.startReplaceGroup(-1873301578);
                        LocalShowPlaceholder.Loadable(true, TestTag3.testTag(Modifier.INSTANCE, CryptoTradingCoinListComposable3.LOADING_TAG), null, ComposableLambda3.rememberComposableLambda(-1705944139, true, new AnonymousClass1(scaffoldPadding), composer2, 54), composer2, 3126, 4);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(state instanceof CryptoTradingCoinListViewState.Loaded)) {
                            composer2.startReplaceGroup(-891714995);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-1872015140);
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        CryptoTradingCoinListViewState.Loaded loaded = (CryptoTradingCoinListViewState.Loaded) state;
                        String query = loaded.getQuery();
                        ImmutableList<CryptoTradingOptions.TradingOptionItem> displayItems = loaded.getDisplayItems();
                        CryptoTradingCoinListDuxo cryptoTradingCoinListDuxo2 = cryptoTradingCoinListDuxo;
                        composer2.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer2.changedInstance(cryptoTradingCoinListDuxo2);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new CryptoTradingCoinListComposable4(cryptoTradingCoinListDuxo2);
                            composer2.updateRememberedValue(objRememberedValue3);
                        }
                        composer2.endReplaceGroup();
                        CryptoTradingCoinListComposable3.LoadedContent(query, displayItems, (Function1) ((KFunction) objRememberedValue3), scaffoldPadding, modifierFillMaxSize$default, composer2, 24576, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoTradingCoinListComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$2$3$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ PaddingValues $scaffoldPadding;

                    AnonymousClass1(PaddingValues paddingValues) {
                        this.$scaffoldPadding = paddingValues;
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
                            ComposerKt.traceEventStart(-1705944139, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:148)");
                        }
                        Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                        ArrayList arrayList = new ArrayList(10);
                        for (int i2 = 0; i2 < 10; i2++) {
                            arrayList.add(new CryptoTradingOptions.TradingOptionItem("---- --- ---", "----", "", "$00,000.00", "0.00%", null, null, null, null, null));
                        }
                        ImmutableList immutableList = extensions2.toImmutableList(arrayList);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$CryptoTradingCoinListComposable$2$3$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoTradingCoinListComposable3.C401622.AnonymousClass3.AnonymousClass1.invoke$lambda$2$lambda$1((String) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        CryptoTradingCoinListComposable3.LoadedContent("", immutableList, (Function1) objRememberedValue, this.$scaffoldPadding, modifierFillMaxSize$default, composer, 24966, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(String it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54), composer, 1794432, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object invoke$lambda$3$lambda$2(CryptoTradingCoinListViewState state) {
            Intrinsics.checkNotNullParameter(state, "state");
            if (state instanceof CryptoTradingCoinListViewState.Loading) {
                return "loading";
            }
            if (state instanceof CryptoTradingCoinListViewState.Loaded) {
                return TestTags.LOADED;
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradingCoinListComposable$lambda$9$lambda$8(SnapshotState snapshotState) {
        CryptoTradingCoinListComposable$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradingCoinListComposable$lambda$7$lambda$6(final SnapshotState snapshotState, RhModalBottomSheet5 RhContentBottomSheet) {
        Intrinsics.checkNotNullParameter(RhContentBottomSheet, "$this$RhContentBottomSheet");
        RhContentBottomSheet.hideBottomSheet(new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CryptoTradingCoinListComposable3.CryptoTradingCoinListComposable$lambda$7$lambda$6$lambda$5(snapshotState);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTradingCoinListComposable$lambda$7$lambda$6$lambda$5(SnapshotState snapshotState) {
        CryptoTradingCoinListComposable$lambda$4(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void LoadedContent(final String str, final ImmutableList<CryptoTradingOptions.TradingOptionItem> immutableList, final Function1<? super String, Unit> function1, final PaddingValues paddingValues, Modifier modifier, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        Function1<? super String, Unit> function12;
        int i4;
        Modifier modifier2;
        int i5;
        final Navigator navigator;
        final Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        boolean zChangedInstance;
        Object objRememberedValue2;
        final Modifier modifier3;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(131575980);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else if ((i & 6) == 0) {
            str2 = str;
            i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(paddingValues) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    i5 = i3;
                    if ((i5 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(131575980, i5, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.LoadedContent (CryptoTradingCoinListComposable.kt:208)");
                        }
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new NestedScrollModifier() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$nestedScrollConnection$1$1
                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPostFling-RZ2iAVY */
                                public /* bridge */ /* synthetic */ Object mo5023onPostFlingRZ2iAVY(long j, long j2, Continuation continuation) {
                                    return super.mo5023onPostFlingRZ2iAVY(j, j2, continuation);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPostScroll-DzOQY0M */
                                public /* bridge */ /* synthetic */ long mo5024onPostScrollDzOQY0M(long j, long j2, int i6) {
                                    return super.mo5024onPostScrollDzOQY0M(j, j2, i6);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPreFling-QWom1Mo */
                                public /* bridge */ /* synthetic */ Object mo5609onPreFlingQWom1Mo(long j, Continuation continuation) {
                                    return super.mo5609onPreFlingQWom1Mo(j, continuation);
                                }

                                @Override // androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier
                                /* renamed from: onPreScroll-OzD1aCk */
                                public long mo5298onPreScrollOzD1aCk(long available, int source) {
                                    SoftwareKeyboardController softwareKeyboardController2 = softwareKeyboardController;
                                    if (softwareKeyboardController2 != null) {
                                        softwareKeyboardController2.hide();
                                    }
                                    return Offset.INSTANCE.m6553getZeroF1C5BW0();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierTestTag = TestTag3.testTag(NestedScrollModifier7.nestedScroll$default(modifier4, (CryptoTradingCoinListComposable7) objRememberedValue, null, 2, null), LOADED_TAG);
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((i5 & 14) != 4) | ((i5 & 896) != 256) | composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                            final Function1<? super String, Unit> function13 = function12;
                            Function1 function14 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoTradingCoinListComposable3.LoadedContent$lambda$16$lambda$15(immutableList, str2, function13, navigator, context, (LazyListScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function14);
                            objRememberedValue2 = function14;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifierTestTag, null, paddingValues, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i5 >> 3) & 896, 506);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda11
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoTradingCoinListComposable3.LoadedContent$lambda$17(str, immutableList, function1, paddingValues, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                modifier2 = modifier;
                i5 = i3;
                if ((i5 & 9363) == 9362) {
                    if (i4 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final SoftwareKeyboardController softwareKeyboardController2 = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierTestTag2 = TestTag3.testTag(NestedScrollModifier7.nestedScroll$default(modifier4, (CryptoTradingCoinListComposable7) objRememberedValue, null, 2, null), LOADED_TAG);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((i5 & 14) != 4) | ((i5 & 896) != 256) | composerStartRestartGroup.changedInstance(immutableList) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        final Function1 function132 = function12;
                        Function1 function142 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoTradingCoinListComposable3.LoadedContent$lambda$16$lambda$15(immutableList, str2, function132, navigator, context, (LazyListScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(function142);
                        objRememberedValue2 = function142;
                        composerStartRestartGroup.endReplaceGroup();
                        modifier3 = modifier4;
                        composer2 = composerStartRestartGroup;
                        LazyDslKt.LazyColumn(modifierTestTag2, null, paddingValues, false, null, null, null, false, null, (Function1) objRememberedValue2, composer2, (i5 >> 3) & 896, 506);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            i5 = i3;
            if ((i5 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function12 = function1;
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i3;
        if ((i5 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LoadedContent$lambda$16$lambda$15(final ImmutableList immutableList, final String str, final Function1 function1, final Navigator navigator, final Context context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.stickyHeader$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1538150635, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$1$1$1
            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope stickyHeader, int i, Composer composer, int i2) {
                Intrinsics.checkNotNullParameter(stickyHeader, "$this$stickyHeader");
                if ((i2 & EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE) == 128 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1538150635, i2, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.LoadedContent.<anonymous>.<anonymous>.<anonymous> (CryptoTradingCoinListComposable.kt:229)");
                }
                CryptoTradingCoinListComposable3.SearchTextField(str, function1, composer, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final C40154x1ae90861 c40154x1ae90861 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$lambda$16$lambda$15$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CryptoTradingOptions.TradingOptionItem tradingOptionItem) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CryptoTradingOptions.TradingOptionItem) obj);
            }
        };
        LazyColumn.items(immutableList.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$lambda$16$lambda$15$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c40154x1ae90861.invoke(immutableList.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$lambda$16$lambda$15$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = (composer.changed(lazyItemScope) ? 4 : 2) | i2;
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                CryptoTradingOptions.TradingOptionItem tradingOptionItem = (CryptoTradingOptions.TradingOptionItem) immutableList.get(i);
                composer.startReplaceGroup(1686162963);
                composer.startReplaceGroup(-1608173229);
                final String deeplink = tradingOptionItem.getDeeplink();
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changed(deeplink);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final Navigator navigator2 = navigator;
                    final Context context2 = context;
                    objRememberedValue = new Function0<Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$LoadedContent$1$1$2$1$1$1
                        @Override // kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Navigator.DefaultImpls.handleDeepLink$default(navigator2, context2, Uri.parse(deeplink), null, null, false, null, 60, null);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                CryptoTradingCoinListComposable3.CoinRow(tradingOptionItem, (Function0) objRememberedValue, composer, 0, 0);
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SearchTextField(final String str, Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        int i3;
        final EventLogger eventLogger;
        Object obj;
        Object obj2;
        Composer composer2;
        final Function1<? super String, Unit> function12 = function1;
        Composer composerStartRestartGroup = composer.startRestartGroup(-210815803);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-210815803, i2, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.SearchTextField (CryptoTradingCoinListComposable.kt:254)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(str, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(!StringsKt.isBlank(SearchTextField$lambda$19(snapshotState))), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Modifier.Companion companion2 = Modifier.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme.getColors(composerStartRestartGroup, i4).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 7, null), SEARCH_TEXT_FIELD_TAG);
            String strSearchTextField$lambda$19 = SearchTextField$lambda$19(snapshotState);
            String strStringResource = StringResources_androidKt.stringResource(C40095R.string.crypto_coin_list_selection_search_hint, composerStartRestartGroup, 0);
            BentoTextInput8.Icon.Size24 size24 = new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.SEARCH_24, null, null, 6, null);
            BentoTextInput8.Icon.Size24 size242 = SearchTextField$lambda$22(snapshotState2) ? new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLOSE_24, null, null, 6, null) : null;
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i5 = i2 & 112;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i5 == 32);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                i3 = i5;
                eventLogger = current;
                obj = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CryptoTradingCoinListComposable3.SearchTextField$lambda$25$lambda$24(eventLogger, userInteractionEventDescriptor, function12, snapshotState, snapshotState2, (String) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj);
            } else {
                eventLogger = current;
                obj = objRememberedValue3;
                i3 = i5;
            }
            Function1 function13 = (Function1) obj;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | (i3 == 32);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                function12 = function1;
                obj2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTradingCoinListComposable3.SearchTextField$lambda$27$lambda$26(eventLogger, userInteractionEventDescriptor, function12, snapshotState, snapshotState2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(obj2);
            } else {
                obj2 = objRememberedValue4;
                function12 = function1;
            }
            Function0 function0 = (Function0) obj2;
            composerStartRestartGroup.endReplaceGroup();
            int i6 = BentoTextInput8.Icon.Size24.$stable;
            composer2 = composerStartRestartGroup;
            BentoTextInput4.BentoTextInput(strSearchTextField$lambda$19, function13, modifierTestTag, null, strStringResource, null, null, size24, size242, function0, null, null, null, false, false, composer2, (i6 << 21) | (i6 << 24), 0, 31848);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return CryptoTradingCoinListComposable3.SearchTextField$lambda$28(str, function12, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    private static final void SearchTextField$lambda$23(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$25$lambda$24(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, String text) {
        Intrinsics.checkNotNullParameter(text, "text");
        snapshotState.setValue(text);
        if (!SearchTextField$lambda$22(snapshotState2)) {
            SearchTextField$lambda$23(snapshotState2, !StringsKt.isBlank(text));
        }
        logSearchQueryType(eventLogger, userInteractionEventDescriptor.getScreen(), text);
        function1.invoke(text);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SearchTextField$lambda$27$lambda$26(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2) {
        snapshotState.setValue("");
        SearchTextField$lambda$23(snapshotState2, false);
        logSearchQueryType(eventLogger, userInteractionEventDescriptor.getScreen(), "");
        function1.invoke("");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v11, types: [androidx.compose.ui.Modifier] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CoinRow(final CryptoTradingOptions.TradingOptionItem tradingOptionItem, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(416740812);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(tradingOptionItem) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                function03 = i4 == 0 ? null : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(416740812, i3, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CoinRow (CryptoTradingCoinListComposable.kt:296)");
                }
                composerStartRestartGroup.startReplaceGroup(1055968282);
                Modifier.Companion companion = Modifier.INSTANCE;
                Intrinsics.checkNotNull(companion, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
                if (function03 == null) {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    boolean zChanged = composerStartRestartGroup.changed(function03);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTradingCoinListComposable3.CoinRow$lambda$31$lambda$30$lambda$29(function03);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    ?? M4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, (Function0) objRememberedValue, 7, null);
                    Modifier.Companion companion2 = M4893clickableXHw0xAI$default == 0 ? companion : M4893clickableXHw0xAI$default;
                    composerStartRestartGroup.endReplaceGroup();
                    function04 = function03;
                    BentoBaseRowLayout.BentoBaseRowLayout(ModifiersKt.autoLogEvents$default(companion2, new UserInteractionEventDescriptor(null, ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen(), null, null, new Component(Component.ComponentType.ROW, tradingOptionItem.getSubtitle(), null, 4, null), null, 45, null), true, false, false, true, false, null, 108, null), null, null, ComposableLambda3.rememberComposableLambda(1374802031, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CoinRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1374802031, i5, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CoinRow.<anonymous> (CryptoTradingCoinListComposable.kt:312)");
                            }
                            BentoText2.m20747BentoText38GnDrw(tradingOptionItem.getTitle(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(981803086, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CoinRow.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(981803086, i5, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CoinRow.<anonymous> (CryptoTradingCoinListComposable.kt:315)");
                            }
                            String subtitle = tradingOptionItem.getSubtitle();
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i6 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextS(), composer2, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(588804141, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt.CoinRow.4
                        public final void invoke(Composer composer2, int i5) {
                            if ((i5 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(588804141, i5, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.CoinRow.<anonymous> (CryptoTradingCoinListComposable.kt:322)");
                            }
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            CryptoTradingOptions.TradingOptionItem tradingOptionItem2 = tradingOptionItem;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion3);
                            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion4.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(tradingOptionItem2.getLastPrice(), null, null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 0, 0, 16382);
                            BentoText2.m20747BentoText38GnDrw(tradingOptionItem2.getPercentChange(), null, Color.m6701boximpl(CryptoTradingCoinListComposable3.percentChangeColor(tradingOptionItem2.getPercentChange(), composer2, 0)), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextS(), composer2, 0, 0, 8186);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composerStartRestartGroup, 54), null, false, false, false, null, composerStartRestartGroup, 224256, 0, 1990);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function04 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.coinlist.CryptoTradingCoinListComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTradingCoinListComposable3.CoinRow$lambda$32(tradingOptionItem, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function02 = function0;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1055968282);
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Intrinsics.checkNotNull(companion3, "null cannot be cast to non-null type androidx.compose.ui.Modifier");
            if (function03 == null) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CoinRow$lambda$31$lambda$30$lambda$29(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    public static final long percentChangeColor(String percentChange, Composer composer, int i) {
        long jM21426getFg20d7_KjU;
        Intrinsics.checkNotNullParameter(percentChange, "percentChange");
        composer.startReplaceGroup(-744083074);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-744083074, i, -1, "com.robinhood.shared.trade.crypto.ui.coinlist.percentChangeColor (CryptoTradingCoinListComposable.kt:336)");
        }
        if (Intrinsics.areEqual(percentChange, "+0.00%")) {
            composer.startReplaceGroup(-2099258079);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        } else if (StringsKt.startsWith$default(percentChange, "+", false, 2, (Object) null)) {
            composer.startReplaceGroup(-2099256186);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21456getPositive0d7_KjU();
            composer.endReplaceGroup();
        } else if (StringsKt.startsWith$default(percentChange, "-", false, 2, (Object) null)) {
            composer.startReplaceGroup(-2099254138);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21452getNegative0d7_KjU();
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-2099252895);
            jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21426getFg20d7_KjU();
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return jM21426getFg20d7_KjU;
    }

    private static final void logSearchQueryType(EventLogger eventLogger, Screen screen, String str) {
        EventLogger.DefaultImpls.logType$default(eventLogger, UserInteractionEventData.Action.TYPE_SEARCH_QUERY, screen, new Component(Component.ComponentType.SEARCH_BAR, "search", null, 4, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, str, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33, -1, -1, -1, -1, -1, 16383, null), 8, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logInfoSheetAppear(EventLogger eventLogger, Screen screen) {
        EventLogger.DefaultImpls.logAppear$default(eventLogger, null, screen, new Component(Component.ComponentType.BOTTOM_SHEET, "info-sheet", null, 4, null), null, null, 25, null);
    }
}
