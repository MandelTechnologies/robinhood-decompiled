package com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm;

import android.os.Parcelable;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
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
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.FragmentManager;
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
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.context.CryptoOrderContext;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.taxLots.orderForm.CryptoTaxLotOrderFormEvent;
import com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposable4;
import com.robinhood.shared.trade.crypto.views.orderForm.CryptoOrderReviewComposableState;
import com.robinhood.shared.trading.tradeflow.OrderForm2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
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

/* compiled from: CryptoTaxLotOrderFormComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a7\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n\"\u0016\u0010\u000b\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\r\u0010\u000e\"\u0016\u0010\u000f\u001a\u00020\f8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u000e¨\u0006\u0011²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u0084\u0002²\u0006\u0012\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0015X\u008a\u0084\u0002"}, m3636d2 = {"CryptoTaxLotOrderFormComposable", "", "onBackClick", "Lkotlin/Function0;", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/fragment/app/FragmentManager;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormDuxo;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG", "", "getCRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG$annotations", "()V", "CRYPTO_TAX_LOT_ORDER_FORM_STATIC_SHADER_TEST_TAG", "getCRYPTO_TAX_LOT_ORDER_FORM_STATIC_SHADER_TEST_TAG$annotations", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/taxLots/orderForm/CryptoTaxLotOrderFormEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoTaxLotOrderFormComposable5 {
    public static final String CRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG = "crypto_tax_lot_order_form_edit_cta_text_test_tag";
    public static final String CRYPTO_TAX_LOT_ORDER_FORM_STATIC_SHADER_TEST_TAG = "crypto_tax_lot_order_form_static_shader_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTaxLotOrderFormComposable$lambda$5(Function0 function0, FragmentManager fragmentManager, Modifier modifier, CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTaxLotOrderFormComposable(function0, fragmentManager, modifier, cryptoTaxLotOrderFormDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getCRYPTO_TAX_LOT_ORDER_FORM_STATIC_SHADER_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ee  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTaxLotOrderFormComposable(final Function0<Unit> onBackClick, final FragmentManager childFragmentManager, Modifier modifier, CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo2;
        Modifier modifier3;
        int i4;
        final CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo3;
        final Navigator navigator;
        final Event<CryptoTaxLotOrderFormEvent> eventCryptoTaxLotOrderFormComposable$lambda$1;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean zChangedInstance;
        Object objRememberedValue;
        final CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo4;
        final Modifier modifier4;
        EventConsumer<CryptoTaxLotOrderFormEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(2018773353);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    cryptoTaxLotOrderFormDuxo2 = cryptoTaxLotOrderFormDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderFormDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    cryptoTaxLotOrderFormDuxo2 = cryptoTaxLotOrderFormDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTaxLotOrderFormDuxo2 = cryptoTaxLotOrderFormDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTaxLotOrderFormDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$$inlined$duxo$1.1
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
                        CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo5 = (CryptoTaxLotOrderFormDuxo) baseDuxo;
                        i4 = i3 & (-7169);
                        cryptoTaxLotOrderFormDuxo3 = cryptoTaxLotOrderFormDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(2018773353, i4, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable (CryptoTaxLotOrderFormComposable.kt:35)");
                    }
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    eventCryptoTaxLotOrderFormComposable$lambda$1 = CryptoTaxLotOrderFormComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                    if (eventCryptoTaxLotOrderFormComposable$lambda$1 != null && (eventCryptoTaxLotOrderFormComposable$lambda$1.getData() instanceof CryptoTaxLotOrderFormEvent) && (eventConsumerInvoke = eventCryptoTaxLotOrderFormComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                        eventConsumerInvoke.consume(eventCryptoTaxLotOrderFormComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                m26014invoke(obj);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m26014invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                CryptoTaxLotOrderFormEvent cryptoTaxLotOrderFormEvent = (CryptoTaxLotOrderFormEvent) eventCryptoTaxLotOrderFormComposable$lambda$1.getData();
                                if (cryptoTaxLotOrderFormEvent instanceof CryptoTaxLotOrderFormEvent.ShowFeeDefinitionBottomSheet) {
                                    ((CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoTaxLotOrderFormEvent.ShowFeeDefinitionBottomSheet) cryptoTaxLotOrderFormEvent).getArgs())).show(childFragmentManager, "feeDefinitionBottomSheet");
                                } else {
                                    if (!(cryptoTaxLotOrderFormEvent instanceof CryptoTaxLotOrderFormEvent.ShowDialogFragment)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoTaxLotOrderFormEvent.ShowDialogFragment) cryptoTaxLotOrderFormEvent).getDialogFragmentKey(), null, 2, null).show(childFragmentManager, "microgramCryptoTaxLotInputDialogFragment");
                                }
                            }
                        });
                    }
                    Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    OrderForm6 orderForm6 = OrderForm6.REVIEWING;
                    CryptoOrderContext cryptoOrderContext = CryptoTaxLotOrderFormComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getCryptoOrderContext();
                    CryptoOrderContext.RequestData request = cryptoOrderContext != null ? cryptoOrderContext.getRequest() : null;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderFormDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoTaxLotOrderFormComposable6(cryptoTaxLotOrderFormDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(1811685503, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$2
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
                                ComposerKt.traceEventStart(1811685503, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:60)");
                            }
                            Function2<Composer, Integer, Unit> function2M26011getLambda$1912189396$feature_trade_crypto_externalDebug = CryptoTaxLotOrderFormComposable.INSTANCE.m26011getLambda$1912189396$feature_trade_crypto_externalDebug();
                            final Function0<Unit> function0 = onBackClick;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M26011getLambda$1912189396$feature_trade_crypto_externalDebug, null, ComposableLambda3.rememberComposableLambda(-527197056, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                    invoke(bentoAppBarScope, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                    if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-527197056, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:63)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotOrderFormComposable5.CRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i9 = BentoTheme.$stable;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                    composer3.startReplaceGroup(1849434622);
                                    Object objRememberedValue3 = composer3.rememberedValue();
                                    if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                                        composer3.updateRememberedValue(objRememberedValue3);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default, (InteractionSource3) objRememberedValue3, null, false, null, null, function0, 28, null);
                                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_reviewing_edit_cta_text, composer3, 0), modifierM4891clickableO2vRcR0$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 24576, 0, 8172);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-344441920, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$3
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
                                ComposerKt.traceEventStart(-344441920, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:80)");
                            }
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer2, 6, 1);
                            CryptoOrderReviewComposableState reviewComposableState = CryptoTaxLotOrderFormComposable5.CryptoTaxLotOrderFormComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getReviewComposableState();
                            CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo6 = cryptoTaxLotOrderFormDuxo3;
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance3 = composer2.changedInstance(cryptoTaxLotOrderFormDuxo6);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new CryptoTaxLotOrderFormComposable9(cryptoTaxLotOrderFormDuxo6);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            CryptoOrderReviewComposable4.CryptoOrderReviewComposable(reviewComposableState, (Function1) ((KFunction) objRememberedValue3), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer2, CryptoOrderHeaderState.$stable | CryptoOrderReviewRowState.$stable | CryptoOrderReviewMessageAndDisclosuresState.$stable, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    CryptoTaxLotOrderFormComposable cryptoTaxLotOrderFormComposable = CryptoTaxLotOrderFormComposable.INSTANCE;
                    Composer composer2 = composerStartRestartGroup;
                    OrderForm2.m26341OrderFormVzGUr2s(orderForm6, request, function1, composableLambdaRememberComposableLambda, composableLambdaRememberComposableLambda2, cryptoTaxLotOrderFormComposable.getLambda$1794397953$feature_trade_crypto_externalDebug(), null, null, null, false, cryptoTaxLotOrderFormComposable.m26012getLambda$227521150$feature_trade_crypto_externalDebug(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, null, null, null, composer2, 224262, 3078, 54208);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    cryptoTaxLotOrderFormDuxo4 = cryptoTaxLotOrderFormDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                cryptoTaxLotOrderFormDuxo3 = cryptoTaxLotOrderFormDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<CryptoTaxLotOrderFormViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCryptoTaxLotOrderFormComposable$lambda$1 = CryptoTaxLotOrderFormComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCryptoTaxLotOrderFormComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoTaxLotOrderFormComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m26014invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m26014invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoTaxLotOrderFormEvent cryptoTaxLotOrderFormEvent = (CryptoTaxLotOrderFormEvent) eventCryptoTaxLotOrderFormComposable$lambda$1.getData();
                            if (cryptoTaxLotOrderFormEvent instanceof CryptoTaxLotOrderFormEvent.ShowFeeDefinitionBottomSheet) {
                                ((CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoTaxLotOrderFormEvent.ShowFeeDefinitionBottomSheet) cryptoTaxLotOrderFormEvent).getArgs())).show(childFragmentManager, "feeDefinitionBottomSheet");
                            } else {
                                if (!(cryptoTaxLotOrderFormEvent instanceof CryptoTaxLotOrderFormEvent.ShowDialogFragment)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoTaxLotOrderFormEvent.ShowDialogFragment) cryptoTaxLotOrderFormEvent).getDialogFragmentKey(), null, 2, null).show(childFragmentManager, "microgramCryptoTaxLotInputDialogFragment");
                            }
                        }
                    });
                }
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                    OrderForm6 orderForm62 = OrderForm6.REVIEWING;
                    CryptoOrderContext cryptoOrderContext2 = CryptoTaxLotOrderFormComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getCryptoOrderContext();
                    if (cryptoOrderContext2 != null) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChangedInstance = composerStartRestartGroup.changedInstance(cryptoTaxLotOrderFormDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new CryptoTaxLotOrderFormComposable6(cryptoTaxLotOrderFormDuxo3);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        Function1 function12 = (Function1) ((KFunction) objRememberedValue);
                        ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(1811685503, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer22, Integer num) {
                                invoke(composer22, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer22, int i7) {
                                if ((i7 & 3) == 2 && composer22.getSkipping()) {
                                    composer22.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1811685503, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:60)");
                                }
                                Function2<Composer, Integer, Unit> function2M26011getLambda$1912189396$feature_trade_crypto_externalDebug = CryptoTaxLotOrderFormComposable.INSTANCE.m26011getLambda$1912189396$feature_trade_crypto_externalDebug();
                                final Function0<Unit> function0 = onBackClick;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M26011getLambda$1912189396$feature_trade_crypto_externalDebug, null, ComposableLambda3.rememberComposableLambda(-527197056, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$2.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-527197056, i8, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:63)");
                                        }
                                        Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoTaxLotOrderFormComposable5.CRYPTO_TAX_LOT_ORDER_FORM_EDIT_CTA_TEXT_TEST_TAG);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i9 = BentoTheme.$stable;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierTestTag, bentoTheme.getSpacing(composer3, i9).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                        composer3.startReplaceGroup(1849434622);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = InteractionSource2.MutableInteractionSource();
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierM5146paddingqDBjuR0$default, (InteractionSource3) objRememberedValue3, null, false, null, null, function0, 28, null);
                                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C40095R.string.crypto_tax_lot_reviewing_edit_cta_text, composer3, 0), modifierM4891clickableO2vRcR0$default, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i9).getTextM(), composer3, 24576, 0, 8172);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer22, 54), null, null, false, false, null, null, 0L, null, composer22, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(-344441920, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$CryptoTaxLotOrderFormComposable$2$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer22, Integer num) {
                                invoke(composer22, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer22, int i7) {
                                if ((i7 & 3) == 2 && composer22.getSkipping()) {
                                    composer22.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-344441920, i7, -1, "com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposable.<anonymous>.<anonymous> (CryptoTaxLotOrderFormComposable.kt:80)");
                                }
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composer22, 6, 1);
                                CryptoOrderReviewComposableState reviewComposableState = CryptoTaxLotOrderFormComposable5.CryptoTaxLotOrderFormComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getReviewComposableState();
                                CryptoTaxLotOrderFormDuxo cryptoTaxLotOrderFormDuxo6 = cryptoTaxLotOrderFormDuxo3;
                                composer22.startReplaceGroup(5004770);
                                boolean zChangedInstance3 = composer22.changedInstance(cryptoTaxLotOrderFormDuxo6);
                                Object objRememberedValue3 = composer22.rememberedValue();
                                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new CryptoTaxLotOrderFormComposable9(cryptoTaxLotOrderFormDuxo6);
                                    composer22.updateRememberedValue(objRememberedValue3);
                                }
                                composer22.endReplaceGroup();
                                CryptoOrderReviewComposable4.CryptoOrderReviewComposable(reviewComposableState, (Function1) ((KFunction) objRememberedValue3), modifierM21623defaultHorizontalPaddingrAjV9yQ, composer22, CryptoOrderHeaderState.$stable | CryptoOrderReviewRowState.$stable | CryptoOrderReviewMessageAndDisclosuresState.$stable, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54);
                        CryptoTaxLotOrderFormComposable cryptoTaxLotOrderFormComposable2 = CryptoTaxLotOrderFormComposable.INSTANCE;
                        Composer composer22 = composerStartRestartGroup;
                        OrderForm2.m26341OrderFormVzGUr2s(orderForm62, request, function12, composableLambdaRememberComposableLambda3, composableLambdaRememberComposableLambda22, cryptoTaxLotOrderFormComposable2.getLambda$1794397953$feature_trade_crypto_externalDebug(), null, null, null, false, cryptoTaxLotOrderFormComposable2.m26012getLambda$227521150$feature_trade_crypto_externalDebug(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21368getAccent0d7_KjU(), 0L, null, null, null, composer22, 224262, 3078, 54208);
                        composerStartRestartGroup = composer22;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Modifier modifier52 = modifier3;
                        cryptoTaxLotOrderFormDuxo4 = cryptoTaxLotOrderFormDuxo3;
                        modifier4 = modifier52;
                    }
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                cryptoTaxLotOrderFormDuxo4 = cryptoTaxLotOrderFormDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.taxLots.orderForm.CryptoTaxLotOrderFormComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTaxLotOrderFormComposable5.CryptoTaxLotOrderFormComposable$lambda$5(onBackClick, childFragmentManager, modifier4, cryptoTaxLotOrderFormDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                    i4 = i3;
                    cryptoTaxLotOrderFormDuxo3 = cryptoTaxLotOrderFormDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                final SnapshotState4<CryptoTaxLotOrderFormViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                eventCryptoTaxLotOrderFormComposable$lambda$1 = CryptoTaxLotOrderFormComposable$lambda$1(FlowExtKt.collectAsStateWithLifecycle(cryptoTaxLotOrderFormDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (eventCryptoTaxLotOrderFormComposable$lambda$1 != null) {
                }
                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default22);
                ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTaxLotOrderFormViewState CryptoTaxLotOrderFormComposable$lambda$0(SnapshotState4<CryptoTaxLotOrderFormViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTaxLotOrderFormEvent> CryptoTaxLotOrderFormComposable$lambda$1(SnapshotState4<Event<CryptoTaxLotOrderFormEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
