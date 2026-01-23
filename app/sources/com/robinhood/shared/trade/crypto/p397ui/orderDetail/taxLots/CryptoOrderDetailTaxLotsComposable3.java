package com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
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
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.discovery.sdui.SduiFeatureDiscovery3;
import com.robinhood.shared.taxLots.TaxLotTableState;
import com.robinhood.shared.taxLots.TaxLotsTableKt;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable3;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsViewState;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.info.CryptoTaxLotMicrogramInfoActivity;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;

/* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b\"\u0016\u0010\t\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000b\u0010\f\"\u0016\u0010\r\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\f\"\u0016\u0010\u000f\u001a\u00020\n8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\f¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002"}, m3636d2 = {"CryptoOrderDetailTaxLotsComposable", "", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsDuxo;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG", "", "getCRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG$annotations", "()V", "CRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG", "getCRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG$annotations", "CRYPTO_ORDER_DETAIL_TAX_LOTS_TABLE_TEST_TAG", "getCRYPTO_ORDER_DETAIL_TAX_LOTS_TABLE_TEST_TAG$annotations", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/taxLots/CryptoOrderDetailTaxLotsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderDetailTaxLotsComposable3 {
    public static final String CRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG = "crypto_order_detail_tax_lots_back_button_test_tag";
    public static final String CRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG = "crypto_order_detail_tax_lots_info_icon_test_tag";
    public static final String CRYPTO_ORDER_DETAIL_TAX_LOTS_TABLE_TEST_TAG = "crypto_order_detail_tax_lots_table_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderDetailTaxLotsComposable$lambda$1(Function0 function0, Modifier modifier, CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderDetailTaxLotsComposable(function0, modifier, cryptoOrderDetailTaxLotsDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_ORDER_DETAIL_TAX_LOTS_TABLE_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderDetailTaxLotsComposable(final Function0<Unit> onBackClick, Modifier modifier, CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo2;
        Modifier modifier3;
        int i4;
        CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo3;
        final CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-341983255);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    cryptoOrderDetailTaxLotsDuxo2 = cryptoOrderDetailTaxLotsDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoOrderDetailTaxLotsDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    cryptoOrderDetailTaxLotsDuxo2 = cryptoOrderDetailTaxLotsDuxo;
                }
                i3 |= i6;
            } else {
                cryptoOrderDetailTaxLotsDuxo2 = cryptoOrderDetailTaxLotsDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderDetailTaxLotsDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo5 = (CryptoOrderDetailTaxLotsDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        cryptoOrderDetailTaxLotsDuxo3 = cryptoOrderDetailTaxLotsDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-341983255, i4, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable (CryptoOrderDetailTaxLotsComposable.kt:42)");
                    }
                    final Navigator navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(889574317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(889574317, i7, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:49)");
                            }
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                            Function2<Composer, Integer, Unit> function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug = CryptoOrderDetailTaxLotsComposable.INSTANCE.m25909getLambda$1326985766$feature_trade_crypto_externalDebug();
                            final Function0<Unit> function0 = onBackClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1687871022, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                    invoke(bentoAppBarScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 6) == 0) {
                                        i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1687871022, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:53)");
                                    }
                                    BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), ComposableLambda3.rememberComposableLambda(-377270065, true, new AnonymousClass2(navigator, context), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3510, 0, 2032);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2, reason: invalid class name */
                        static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                            final /* synthetic */ Context $context;
                            final /* synthetic */ Navigator $navigator;

                            AnonymousClass2(Navigator navigator, Context context) {
                                this.$navigator = navigator;
                                this.$context = context;
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
                                    ComposerKt.traceEventStart(-377270065, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:59)");
                                }
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i2 = BentoTheme.$stable;
                                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null), CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                                BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                                long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                composer.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                                final Navigator navigator = this.$navigator;
                                final Context context = this.$context;
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoOrderDetailTaxLotsComposable3.C404381.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                composer.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                                Navigator.DefaultImpls.startActivity$default(navigator, context, CryptoTaxLotMicrogramInfoActivity.CryptoTaxLotMicrogramInfoIntentKey.INSTANCE, null, false, null, null, 60, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-87141448, true, new C404392(cryptoOrderDetailTaxLotsDuxo3, FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailTaxLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoOrderDetailTaxLotsDuxo4 = cryptoOrderDetailTaxLotsDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoOrderDetailTaxLotsDuxo3 = cryptoOrderDetailTaxLotsDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(889574317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(889574317, i7, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:49)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug = CryptoOrderDetailTaxLotsComposable.INSTANCE.m25909getLambda$1326985766$feature_trade_crypto_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1687871022, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1687871022, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:53)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-377270065, true, new AnonymousClass2(navigator2, context2), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3510, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;

                        AnonymousClass2(Navigator navigator, Context context) {
                            this.$navigator = navigator;
                            this.$context = context;
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
                                ComposerKt.traceEventStart(-377270065, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:59)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null), CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoOrderDetailTaxLotsComposable3.C404381.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                            Navigator.DefaultImpls.startActivity$default(navigator, context, CryptoTaxLotMicrogramInfoActivity.CryptoTaxLotMicrogramInfoIntentKey.INSTANCE, null, false, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-87141448, true, new C404392(cryptoOrderDetailTaxLotsDuxo3, FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailTaxLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                cryptoOrderDetailTaxLotsDuxo4 = cryptoOrderDetailTaxLotsDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoOrderDetailTaxLotsDuxo4 = cryptoOrderDetailTaxLotsDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$1(onBackClick, modifier4, cryptoOrderDetailTaxLotsDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                    i4 = i3;
                    cryptoOrderDetailTaxLotsDuxo3 = cryptoOrderDetailTaxLotsDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Navigator navigator22 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final Context context22 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                ScaffoldKt.m5939ScaffoldTvnljyQ(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(889574317, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(889574317, i7, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:49)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                        Function2<Composer, Integer, Unit> function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug = CryptoOrderDetailTaxLotsComposable.INSTANCE.m25909getLambda$1326985766$feature_trade_crypto_externalDebug();
                        final Function0<Unit> function0 = onBackClick;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M25909getLambda$1326985766$feature_trade_crypto_externalDebug, modifierFillMaxWidth$default, ComposableLambda3.rememberComposableLambda(1687871022, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt.CryptoOrderDetailTaxLotsComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1687871022, i8, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:53)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_BACK_BUTTON_TEST_TAG), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i8 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), ComposableLambda3.rememberComposableLambda(-377270065, true, new AnonymousClass2(navigator22, context22), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3510, 0, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2, reason: invalid class name */
                    static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                        final /* synthetic */ Context $context;
                        final /* synthetic */ Navigator $navigator;

                        AnonymousClass2(Navigator navigator, Context context) {
                            this.$navigator = navigator;
                            this.$context = context;
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
                                ComposerKt.traceEventStart(-377270065, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:59)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 11, null), CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_INFO_ICON_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, SduiFeatureDiscovery3.INFO_TAG, null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
                            BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.INFO_24);
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoOrderDetailTaxLotsComposable3.C404381.AnonymousClass2.invoke$lambda$1$lambda$0(navigator, context);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size24, null, jM21425getFg0d7_KjU, modifierAutoLogEvents$default, (Function0) objRememberedValue, false, composer, BentoIcon4.Size24.$stable | 48, 32);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$1$lambda$0(Navigator navigator, Context context) {
                            Navigator.DefaultImpls.startActivity$default(navigator, context, CryptoTaxLotMicrogramInfoActivity.CryptoTaxLotMicrogramInfoIntentKey.INSTANCE, null, false, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-87141448, true, new C404392(cryptoOrderDetailTaxLotsDuxo3, FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailTaxLotsDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)), composerStartRestartGroup, 54), composerStartRestartGroup, 805306416, 508);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                cryptoOrderDetailTaxLotsDuxo4 = cryptoOrderDetailTaxLotsDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2 */
    static final class C404392 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ CryptoOrderDetailTaxLotsDuxo $duxo;
        final /* synthetic */ SnapshotState4<CryptoOrderDetailTaxLotsViewState> $viewState$delegate;

        C404392(CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo, SnapshotState4<CryptoOrderDetailTaxLotsViewState> snapshotState4) {
            this.$duxo = cryptoOrderDetailTaxLotsDuxo;
            this.$viewState$delegate = snapshotState4;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues contentPadding, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(contentPadding, "contentPadding");
            if ((i & 6) == 0) {
                i2 = i | (composer.changed(contentPadding) ? 4 : 2);
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-87141448, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:86)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(companion, contentPadding);
            CryptoOrderDetailTaxLotsDuxo cryptoOrderDetailTaxLotsDuxo = this.$duxo;
            final SnapshotState4<CryptoOrderDetailTaxLotsViewState> snapshotState4 = this.$viewState$delegate;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierPadding);
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
            LocalShowPlaceholder.Loadable(CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState4).getTitle() == null, null, null, ComposableLambda3.rememberComposableLambda(2126048626, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$1$1
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
                        ComposerKt.traceEventStart(2126048626, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:88)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                    TextStyle displayCapsuleMedium = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getDisplayCapsuleMedium();
                    StringResource title = CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState4).getTitle();
                    composer2.startReplaceGroup(-1271695971);
                    String string2 = title == null ? null : StringResource2.getString(title, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    if (string2 == null) {
                        string2 = "----------";
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composer2, 0, 0, 8188);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            LocalShowPlaceholder.Loadable(CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState4).getSubtitle() == null, null, null, ComposableLambda3.rememberComposableLambda(-910946021, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$1$2

                /* compiled from: CryptoOrderDetailTaxLotsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$1$2$WhenMappings */
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                    static {
                        int[] iArr = new int[CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride.values().length];
                        try {
                            iArr[CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride.POSITIVE.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride.NEGATIVE.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                    }
                }

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
                        ComposerKt.traceEventStart(-910946021, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposable.<anonymous>.<anonymous>.<anonymous> (CryptoOrderDetailTaxLotsComposable.kt:95)");
                    }
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                    Alignment.Vertical centerVertically = Alignment.INSTANCE.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composer2, i4).m21597getXxsmallD9Ej5fM());
                    SnapshotState4<CryptoOrderDetailTaxLotsViewState> snapshotState42 = snapshotState4;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composer2, 48);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor2);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    TextStyle textM = bentoTheme.getTypography(composer2, i4).getTextM();
                    CryptoOrderDetailTaxLotsViewState.SubtitleContent subtitle = CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState42).getSubtitle();
                    Color colorM6701boximpl = null;
                    StringResource prefix = subtitle != null ? subtitle.getPrefix() : null;
                    composer2.startReplaceGroup(-2125514718);
                    String string2 = prefix == null ? null : StringResource2.getString(prefix, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    if (string2 == null) {
                        string2 = "---------";
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, null, null, null, null, null, null, 0, false, 0, 0, null, 0, textM, composer2, 0, 0, 8190);
                    TextStyle textM2 = bentoTheme.getTypography(composer2, i4).getTextM();
                    CryptoOrderDetailTaxLotsViewState.SubtitleContent subtitle2 = CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState42).getSubtitle();
                    StringResource suffix = subtitle2 != null ? subtitle2.getSuffix() : null;
                    composer2.startReplaceGroup(-2125507774);
                    String string3 = suffix == null ? null : StringResource2.getString(suffix, composer2, StringResource.$stable);
                    composer2.endReplaceGroup();
                    if (string3 == null) {
                        string3 = "-----";
                    }
                    CryptoOrderDetailTaxLotsViewState.SubtitleContent subtitle3 = CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState42).getSubtitle();
                    CryptoOrderDetailTaxLotsViewState.SubtitleContent.ColorOverride suffixColorOverride = subtitle3 != null ? subtitle3.getSuffixColorOverride() : null;
                    int i5 = suffixColorOverride == null ? -1 : WhenMappings.$EnumSwitchMapping$0[suffixColorOverride.ordinal()];
                    if (i5 == -1) {
                        composer2.startReplaceGroup(-1465915322);
                        composer2.endReplaceGroup();
                    } else if (i5 == 1) {
                        composer2.startReplaceGroup(-2125501857);
                        long jM21456getPositive0d7_KjU = bentoTheme.getColors(composer2, i4).m21456getPositive0d7_KjU();
                        composer2.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(jM21456getPositive0d7_KjU);
                    } else {
                        if (i5 != 2) {
                            composer2.startReplaceGroup(-2125505572);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(-2125499137);
                        long jM21452getNegative0d7_KjU = bentoTheme.getColors(composer2, i4).m21452getNegative0d7_KjU();
                        composer2.endReplaceGroup();
                        colorM6701boximpl = Color.m6701boximpl(jM21452getNegative0d7_KjU);
                    }
                    BentoText2.m20747BentoText38GnDrw(string3, null, colorM6701boximpl, null, null, null, null, 0, false, 0, 0, null, 0, textM2, composer2, 0, 0, 8186);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 3072, 6);
            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer, 0);
            Modifier modifierTestTag = TestTag3.testTag(companion, CryptoOrderDetailTaxLotsComposable3.CRYPTO_ORDER_DETAIL_TAX_LOTS_TABLE_TEST_TAG);
            TaxLotTableState<Unit> taxLotTableState = CryptoOrderDetailTaxLotsComposable3.CryptoOrderDetailTaxLotsComposable$lambda$0(snapshotState4).getTaxLotTableState();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(cryptoOrderDetailTaxLotsDuxo);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new CryptoOrderDetailTaxLotsComposable6(cryptoOrderDetailTaxLotsDuxo);
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Function0 function0 = (Function0) ((KFunction) objRememberedValue);
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            Composer.Companion companion3 = Composer.INSTANCE;
            if (objRememberedValue2 == companion3.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderDetailTaxLotsComposable3.C404392.invoke$lambda$9$lambda$2$lambda$1((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function1 function1 = (Function1) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer.rememberedValue();
            if (objRememberedValue3 == companion3.getEmpty()) {
                objRememberedValue3 = new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderDetailTaxLotsComposable3.C404392.invoke$lambda$9$lambda$4$lambda$3((String) obj, ((Boolean) obj2).booleanValue());
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            Function2 function2 = (Function2) objRememberedValue3;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer.rememberedValue();
            if (objRememberedValue4 == companion3.getEmpty()) {
                objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderDetailTaxLotsComposable3.C404392.invoke$lambda$9$lambda$6$lambda$5((String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            Function1 function12 = (Function1) objRememberedValue4;
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer.rememberedValue();
            if (objRememberedValue5 == companion3.getEmpty()) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.taxLots.CryptoOrderDetailTaxLotsComposableKt$CryptoOrderDetailTaxLotsComposable$2$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderDetailTaxLotsComposable3.C404392.invoke$lambda$9$lambda$8$lambda$7((Unit) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue5);
            }
            composer.endReplaceGroup();
            TaxLotsTableKt.TaxLotTable(taxLotTableState, function0, function1, function2, function12, (Function1) objRememberedValue5, modifierTestTag, null, composer, TaxLotTableState.$stable | 1797504, 128);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$2$lambda$1(String it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$4$lambda$3(String str, boolean z) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$6$lambda$5(String str) {
            Intrinsics.checkNotNullParameter(str, "<unused var>");
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8$lambda$7(Unit it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoOrderDetailTaxLotsViewState CryptoOrderDetailTaxLotsComposable$lambda$0(SnapshotState4<CryptoOrderDetailTaxLotsViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
