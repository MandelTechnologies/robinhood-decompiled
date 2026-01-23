package com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.OrderKind;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorOrderRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderTypeSelectorRow2;
import com.robinhood.shared.trade.crypto.p397ui.fee.preference.CryptoMonetizationModelPreferenceParentComposable;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.CryptoOrderTypeSelectorViewState2;
import com.robinhood.shared.trade.crypto.p397ui.orderTypeSelector.views.CryptoOrderTypeSelectorLoadingComposable4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoOrderTypeSelectorComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\u001aA\u0010\f\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\u00118\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0012\u0010\u0013\"\u0016\u0010\u0014\u001a\u00020\u00118\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0015\u0010\u0013¨\u0006\u0016²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"CryptoOrderTypeSelectorComposable", "", "onShowFeeTierScreen", "Lkotlin/Function0;", "onOrderTypeRowClicked", "Lkotlin/Function1;", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorRowViewState$TapAction;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorDuxo;Landroidx/compose/runtime/Composer;II)V", "Loaded", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorViewState;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lcom/robinhood/shared/trade/crypto/ui/orderTypeSelector/CryptoOrderTypeSelectorViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_ORDER_TYPE_SELECTOR_MONETIZATION_MODEL_TOGGLE_TEST_TAG", "", "getCRYPTO_ORDER_TYPE_SELECTOR_MONETIZATION_MODEL_TOGGLE_TEST_TAG$annotations", "()V", "CRYPTO_ORDER_TYPE_SELECTOR_LOADING_COMPOSABLE_TEST_TAG", "getCRYPTO_ORDER_TYPE_SELECTOR_LOADING_COMPOSABLE_TEST_TAG$annotations", "feature-trade-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderTypeSelectorComposable {
    public static final String CRYPTO_ORDER_TYPE_SELECTOR_LOADING_COMPOSABLE_TEST_TAG = "crypto_order_type_selector_loading_composable_test_tag";
    public static final String CRYPTO_ORDER_TYPE_SELECTOR_MONETIZATION_MODEL_TOGGLE_TEST_TAG = "crypto_order_type_selector_monetization_model_toggle_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeSelectorComposable$lambda$1(Function0 function0, Function1 function1, Modifier modifier, CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderTypeSelectorComposable(function0, function1, modifier, cryptoOrderTypeSelectorDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$9(Function0 function0, Function1 function1, CryptoOrderTypeSelectorViewState cryptoOrderTypeSelectorViewState, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Loaded(function0, function1, cryptoOrderTypeSelectorViewState, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* renamed from: getCRYPTO_ORDER_TYPE_SELECTOR_LOADING_COMPOSABLE_TEST_TAG$annotations */
    public static /* synthetic */ void m2868xc10b8328() {
    }

    /* renamed from: getCRYPTO_ORDER_TYPE_SELECTOR_MONETIZATION_MODEL_TOGGLE_TEST_TAG$annotations */
    public static /* synthetic */ void m2869xcc459f20() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:96:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderTypeSelectorComposable(final Function0<Unit> onShowFeeTierScreen, final Function1<? super CryptoOrderTypeSelectorViewState2.TapAction, Unit> onOrderTypeRowClicked, Modifier modifier, CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo2;
        int i4;
        int i5;
        final Modifier modifier3;
        CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final CryptoOrderTypeSelectorDuxo cryptoOrderTypeSelectorDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onShowFeeTierScreen, "onShowFeeTierScreen");
        Intrinsics.checkNotNullParameter(onOrderTypeRowClicked, "onOrderTypeRowClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1400039720);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onShowFeeTierScreen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderTypeRowClicked) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoOrderTypeSelectorDuxo2 = cryptoOrderTypeSelectorDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(cryptoOrderTypeSelectorDuxo2) ? 2048 : 1024;
                    i3 |= i7;
                } else {
                    cryptoOrderTypeSelectorDuxo2 = cryptoOrderTypeSelectorDuxo;
                }
                i3 |= i7;
            } else {
                cryptoOrderTypeSelectorDuxo2 = cryptoOrderTypeSelectorDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        CreationExtras defaultViewModelCreationExtras = current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE;
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderTypeSelectorDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$CryptoOrderTypeSelectorComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$CryptoOrderTypeSelectorComposable$$inlined$duxo$1.1
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
                        cryptoOrderTypeSelectorDuxo2 = (CryptoOrderTypeSelectorDuxo) baseDuxo;
                        i3 &= -7169;
                    } else {
                        i4 = 0;
                    }
                    Modifier modifier5 = modifier4;
                    i5 = i3;
                    modifier3 = modifier5;
                    cryptoOrderTypeSelectorDuxo3 = cryptoOrderTypeSelectorDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i5 = i3;
                    modifier3 = modifier2;
                    cryptoOrderTypeSelectorDuxo3 = cryptoOrderTypeSelectorDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1400039720, i5, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposable (CryptoOrderTypeSelectorComposable.kt:43)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTypeSelectorDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (CryptoOrderTypeSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRowViewStates().isEmpty()) {
                    composerStartRestartGroup.startReplaceGroup(1113428611);
                    Loaded(onShowFeeTierScreen, onOrderTypeRowClicked, CryptoOrderTypeSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), modifier3, composerStartRestartGroup, (i5 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i5 << 3) & 7168), 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1113420364);
                    CryptoOrderTypeSelectorLoadingComposable4.CryptoOrderTypeSelectorLoadingComposable(TestTag3.testTag(WindowInsetsPadding_androidKt.navigationBarsPadding(modifier3), CRYPTO_ORDER_TYPE_SELECTOR_LOADING_COMPOSABLE_TEST_TAG), composerStartRestartGroup, i4, i4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoOrderTypeSelectorDuxo4 = cryptoOrderTypeSelectorDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                cryptoOrderTypeSelectorDuxo4 = cryptoOrderTypeSelectorDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderTypeSelectorComposable.CryptoOrderTypeSelectorComposable$lambda$1(onShowFeeTierScreen, onOrderTypeRowClicked, modifier3, cryptoOrderTypeSelectorDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i6 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                Modifier modifier52 = modifier4;
                i5 = i3;
                modifier3 = modifier52;
                cryptoOrderTypeSelectorDuxo3 = cryptoOrderTypeSelectorDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderTypeSelectorDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                if (CryptoOrderTypeSelectorComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getRowViewStates().isEmpty()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                cryptoOrderTypeSelectorDuxo4 = cryptoOrderTypeSelectorDuxo3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void Loaded(final Function0<Unit> function0, final Function1<? super CryptoOrderTypeSelectorViewState2.TapAction, Unit> function1, final CryptoOrderTypeSelectorViewState cryptoOrderTypeSelectorViewState, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(348543942);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(cryptoOrderTypeSelectorViewState) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(348543942, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderTypeSelector.Loaded (CryptoOrderTypeSelectorComposable.kt:69)");
                }
                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
                PaddingValues paddingValuesAsPaddingValues = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z = ((i3 & 14) != 4) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoOrderTypeSelectorComposable.Loaded$lambda$8$lambda$7(cryptoOrderTypeSelectorViewState, function0, function1, (LazyListScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM21623defaultHorizontalPaddingrAjV9yQ, null, paddingValuesAsPaddingValues, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 506);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoOrderTypeSelectorComposable.Loaded$lambda$9(function0, function1, cryptoOrderTypeSelectorViewState, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), 0.0f, composerStartRestartGroup, 0, 1);
            PaddingValues paddingValuesAsPaddingValues2 = WindowInsetsKt.asPaddingValues(WindowInsetsKt.m5186onlybOOhFvg(WindowInsets_androidKt.getSafeContent(WindowInsets.INSTANCE, composerStartRestartGroup, 6), WindowInsetsSides.INSTANCE.m5198getBottomJoeWqyM()), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            if ((i3 & 896) != 256) {
            }
            z = ((i3 & 14) != 4) | ((i3 & 896) != 256) | ((i3 & 112) == 32);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (!z) {
                objRememberedValue = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoOrderTypeSelectorComposable.Loaded$lambda$8$lambda$7(cryptoOrderTypeSelectorViewState, function0, function1, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                composer2 = composerStartRestartGroup;
                LazyDslKt.LazyColumn(modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, paddingValuesAsPaddingValues2, false, null, null, null, false, null, (Function1) objRememberedValue, composer2, 0, 506);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Loaded$lambda$8$lambda$7(CryptoOrderTypeSelectorViewState cryptoOrderTypeSelectorViewState, final Function0 function0, final Function1 function1, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final ImmutableList<CryptoOrderTypeSelectorViewState2> rowViewStates = cryptoOrderTypeSelectorViewState.getRowViewStates();
        final C40471xd18891c5 c40471xd18891c5 = new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$Loaded$lambda$8$lambda$7$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(CryptoOrderTypeSelectorViewState2 cryptoOrderTypeSelectorViewState2) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((CryptoOrderTypeSelectorViewState2) obj);
            }
        };
        LazyColumn.items(rowViewStates.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$Loaded$lambda$8$lambda$7$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c40471xd18891c5.invoke(rowViewStates.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$Loaded$lambda$8$lambda$7$$inlined$items$default$4
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
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
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
                final CryptoOrderTypeSelectorViewState2 cryptoOrderTypeSelectorViewState2 = (CryptoOrderTypeSelectorViewState2) rowViewStates.get(i);
                composer.startReplaceGroup(495470019);
                if (cryptoOrderTypeSelectorViewState2 instanceof CryptoOrderTypeSelectorViewState2.MonetizationModelPreference) {
                    composer.startReplaceGroup(495475784);
                    CryptoOrderTypeSelectorViewState2.MonetizationModelPreference monetizationModelPreference = (CryptoOrderTypeSelectorViewState2.MonetizationModelPreference) cryptoOrderTypeSelectorViewState2;
                    CryptoMonetizationModelPreferenceParentComposable.CryptoMonetizationModelPreferenceParentComposable(new Screen(Screen.Name.CRYPTO_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), function0, monetizationModelPreference.getUiCurrencyPair(), monetizationModelPreference.isMonetizationModelPreferenceFee(), TestTag3.testTag(Modifier.INSTANCE, CryptoOrderTypeSelectorComposable.CRYPTO_ORDER_TYPE_SELECTOR_MONETIZATION_MODEL_TOGGLE_TEST_TAG), composer, 24576, 0);
                    composer.endReplaceGroup();
                } else if (cryptoOrderTypeSelectorViewState2 instanceof CryptoOrderTypeSelectorViewState2.Header) {
                    composer.startReplaceGroup(496087693);
                    Modifier.Companion companion = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(((CryptoOrderTypeSelectorViewState2.Header) cryptoOrderTypeSelectorViewState2).getText(), composer, StringResource.$stable), androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, bentoTheme.getSpacing(composer, i4).m21591getLargeD9Ej5fM(), 0.0f, 0.0f, 13, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getDisplayCapsuleSmall(), composer, 0, 0, 8188);
                    composer.endReplaceGroup();
                } else if (cryptoOrderTypeSelectorViewState2 instanceof CryptoOrderTypeSelectorViewState2.BaseRowWithViewState) {
                    composer.startReplaceGroup(496469520);
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer.rememberedValue();
                    Composer.Companion companion2 = Composer.INSTANCE;
                    if (objRememberedValue == companion2.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1746271574);
                    boolean zChanged = composer.changed(cryptoOrderTypeSelectorViewState2) | composer.changed(function1) | composer.changed(cryptoOrderTypeSelectorViewState2);
                    Object objRememberedValue2 = composer.rememberedValue();
                    if (zChanged || objRememberedValue2 == companion2.getEmpty()) {
                        final Function1 function12 = function1;
                        objRememberedValue2 = new Function0<Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$Loaded$1$1$1$2$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                if (((CryptoOrderTypeSelectorViewState2.BaseRowWithViewState) cryptoOrderTypeSelectorViewState2).getRowViewState().getIsEnabled()) {
                                    function12.invoke(((CryptoOrderTypeSelectorViewState2.BaseRowWithViewState) cryptoOrderTypeSelectorViewState2).getTapAction());
                                }
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    CryptoOrderTypeSelectorViewState2.BaseRowWithViewState baseRowWithViewState = (CryptoOrderTypeSelectorViewState2.BaseRowWithViewState) cryptoOrderTypeSelectorViewState2;
                    CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(new CryptoOrderTypeSelectorOrderRowState(baseRowWithViewState.getRowViewState().getIconRes(), baseRowWithViewState.getRowViewState().getTitleString(), baseRowWithViewState.getRowViewState().getSubTitleString(), false, baseRowWithViewState.getRowViewState().getIsDividerVisible(), baseRowWithViewState.getRowViewState().getIsEnabled(), null, 72, null), ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default, interactionSource3, null, false, null, null, (Function0) objRememberedValue2, 28, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OrderKind(CryptoOrderTypeSelectorViewState3.toLogType(baseRowWithViewState.getRowViewState()), false, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, CryptoOrderTypeSelectorViewState3.toLogComponentIdentifier(baseRowWithViewState.getRowViewState()), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), composer, CryptoOrderTypeSelectorOrderRowState.$stable, 0);
                    composer.endReplaceGroup();
                } else {
                    if (!(cryptoOrderTypeSelectorViewState2 instanceof CryptoOrderTypeSelectorViewState2.OrderTypeRow)) {
                        composer.startReplaceGroup(293077568);
                        composer.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composer.startReplaceGroup(498625508);
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                    CryptoOrderTypeSelectorViewState2.OrderTypeRow orderTypeRow = (CryptoOrderTypeSelectorViewState2.OrderTypeRow) cryptoOrderTypeSelectorViewState2;
                    boolean z = orderTypeRow.getTapAction() != null;
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue3 = composer.rememberedValue();
                    Composer.Companion companion3 = Composer.INSTANCE;
                    if (objRememberedValue3 == companion3.getEmpty()) {
                        objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue3;
                    composer.endReplaceGroup();
                    composer.startReplaceGroup(-1633490746);
                    boolean zChanged2 = composer.changed(cryptoOrderTypeSelectorViewState2) | composer.changed(function1);
                    Object objRememberedValue4 = composer.rememberedValue();
                    if (zChanged2 || objRememberedValue4 == companion3.getEmpty()) {
                        final Function1 function13 = function1;
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderTypeSelector.CryptoOrderTypeSelectorComposableKt$Loaded$1$1$1$4$1
                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                CryptoOrderTypeSelectorViewState2.TapAction tapAction = ((CryptoOrderTypeSelectorViewState2.OrderTypeRow) cryptoOrderTypeSelectorViewState2).getTapAction();
                                if (tapAction != null) {
                                    function13.invoke(tapAction);
                                }
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue4);
                    }
                    composer.endReplaceGroup();
                    CryptoOrderTypeSelectorRow2.CryptoOrderTypeSelectorRow(orderTypeRow.getState(), ModifiersKt.autoLogEvents$default(ClickableKt.m4891clickableO2vRcR0$default(modifierFillMaxWidth$default2, interactionSource32, null, z, null, null, (Function0) objRememberedValue4, 24, null), new UserInteractionEventDescriptor(null, new Screen(Screen.Name.CRYPTO_SELECT_ORDER_KIND_PAGE, null, null, null, 14, null), null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new OrderKind(orderTypeRow.getAnalyticsOrderKindType(), false, null, 6, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -16777217, -1, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, orderTypeRow.getAnalyticsComponentIdentifier(), null, 4, null), null, 37, null), true, false, false, true, false, null, 108, null), composer, CryptoOrderTypeSelectorOrderRowState.$stable, 0);
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    private static final CryptoOrderTypeSelectorViewState CryptoOrderTypeSelectorComposable$lambda$0(SnapshotState4<CryptoOrderTypeSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
