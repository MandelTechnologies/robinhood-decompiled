package com.robinhood.shared.trade.crypto.p397ui.orderDetail.views;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcelable;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.DialogFragment;
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
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.DialogFragments;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.crypto.p315ui.UiCryptoOrder;
import com.robinhood.models.p320db.OrderSide;
import com.robinhood.shared.crypto.contracts.CryptoDetailSource;
import com.robinhood.shared.crypto.contracts.CryptoTradeBonusBottomSheetFragmentKey;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.shared.crypto.history.details.OrderDetailViewState;
import com.robinhood.shared.crypto.history.details.OrderDetailsComposableKt;
import com.robinhood.shared.crypto.history.details.actions.ViewInstrumentActionComposable;
import com.robinhood.shared.trade.crypto.C40095R;
import com.robinhood.shared.trade.crypto.p397ui.fee.definitionBottomSheet.CryptoFeeDefinitionBottomSheetFragment;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailDuxo;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailTapAction;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.CryptoOrderDetailUiEvent;
import com.robinhood.shared.trade.crypto.p397ui.orderDetail.views.CryptoOrderDetailComposable3;
import com.robinhood.shared.trade.crypto.p397ui.tradeBonus.extensions.UiCryptoOrders2;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.p409ui.context.BaseContexts;
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
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoOrderDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0001¢\u0006\u0002\u0010\u000b\"\u0016\u0010\f\u001a\u00020\r8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000e\u0010\u000f\"\u0016\u0010\u0010\u001a\u00020\r8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u000f¨\u0006\u0012²\u0006\u0010\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u008a\u0084\u0002²\u0006\u0012\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u008a\u0084\u0002²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u008e\u0002²\u0006\f\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001aX\u008a\u008e\u0002"}, m3636d2 = {"CryptoOrderDetailComposable", "", "onBackClick", "Lkotlin/Function0;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "childFragmentManager", "Landroidx/fragment/app/FragmentManager;", "duxo", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;Landroidx/fragment/app/FragmentManager;Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "BACK_BUTTON_TEST_TAG", "", "getBACK_BUTTON_TEST_TAG$annotations", "()V", "LOADED_CONTENT_TEST_TAG", "getLOADED_CONTENT_TEST_TAG$annotations", "feature-trade-crypto_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/history/details/OrderDetailViewState;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailTapAction;", "eventState", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/trade/crypto/ui/orderDetail/CryptoOrderDetailUiEvent;", "showCancelOrderSentDialog", "", "collarExplanationDialogContent", "Lcom/robinhood/models/crypto/ui/UiCryptoOrder;", "showRecurringCollarExplanationDialog"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoOrderDetailComposable3 {
    public static final String BACK_BUTTON_TEST_TAG = "top_bar_back_button_test_tag";
    public static final String LOADED_CONTENT_TEST_TAG = "loaded_content_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderDetailComposable$lambda$20(Function0 function0, ActivityErrorHandler activityErrorHandler, FragmentManager fragmentManager, CryptoOrderDetailDuxo cryptoOrderDetailDuxo, int i, int i2, Composer composer, int i3) {
        CryptoOrderDetailComposable(function0, activityErrorHandler, fragmentManager, cryptoOrderDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getBACK_BUTTON_TEST_TAG$annotations() {
    }

    public static /* synthetic */ void getLOADED_CONTENT_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderDetailComposable(final Function0<Unit> onBackClick, final ActivityErrorHandler activityErrorHandler, final FragmentManager childFragmentManager, CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        final CryptoOrderDetailDuxo cryptoOrderDetailDuxo2;
        CryptoOrderDetailDuxo cryptoOrderDetailDuxo3;
        final Context context;
        final Navigator navigator;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        final SnapshotState snapshotState3;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$1;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$12;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$13;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$14;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$15;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$16;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$17;
        final Event<CryptoOrderDetailUiEvent> eventCryptoOrderDetailComposable$lambda$18;
        long jM21426getFg20d7_KjU;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Composer composer2;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke2;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke3;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke4;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke5;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke6;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke7;
        EventConsumer<CryptoOrderDetailUiEvent> eventConsumerInvoke8;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(activityErrorHandler, "activityErrorHandler");
        Intrinsics.checkNotNullParameter(childFragmentManager, "childFragmentManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(-403402368);
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
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(activityErrorHandler) : composerStartRestartGroup.changedInstance(activityErrorHandler) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(childFragmentManager) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                cryptoOrderDetailDuxo2 = cryptoOrderDetailDuxo;
                int i4 = composerStartRestartGroup.changedInstance(cryptoOrderDetailDuxo2) ? 2048 : 1024;
                i3 |= i4;
            } else {
                cryptoOrderDetailDuxo2 = cryptoOrderDetailDuxo;
            }
            i3 |= i4;
        } else {
            cryptoOrderDetailDuxo2 = cryptoOrderDetailDuxo;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                if ((i2 & 8) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoOrderDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                    composerStartRestartGroup.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue5, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    cryptoOrderDetailDuxo2 = (CryptoOrderDetailDuxo) baseDuxo;
                    i3 &= -7169;
                }
                cryptoOrderDetailDuxo3 = cryptoOrderDetailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-403402368, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable (CryptoOrderDetailComposable.kt:43)");
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoOrderDetailComposable$lambda$1 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$1 != null && (eventCryptoOrderDetailComposable$lambda$1.getData() instanceof CryptoOrderDetailUiEvent.ShowNotionalPriceBottomSheet) && (eventConsumerInvoke8 = eventCryptoOrderDetailComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke8.consume(eventCryptoOrderDetailComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25916invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25916invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$7(snapshotState2, ((CryptoOrderDetailUiEvent.ShowNotionalPriceBottomSheet) eventCryptoOrderDetailComposable$lambda$1.getData()).getUiCryptoOrder());
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$12 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$12 != null && (eventCryptoOrderDetailComposable$lambda$12.getData() instanceof CryptoOrderDetailUiEvent.ShowRecurringCollarExplanationDialog) && (eventConsumerInvoke7 = eventCryptoOrderDetailComposable$lambda$12.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke7.consume(eventCryptoOrderDetailComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25917invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25917invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$10(snapshotState3, true);
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$13 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$13 != null && (eventCryptoOrderDetailComposable$lambda$13.getData() instanceof CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet) && (eventConsumerInvoke6 = eventCryptoOrderDetailComposable$lambda$13.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke6.consume(eventCryptoOrderDetailComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25918invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25918invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet) eventCryptoOrderDetailComposable$lambda$13.getData();
                            Navigator.DefaultImpls.createDialogFragment$default(navigator, new CryptoTradeBonusBottomSheetFragmentKey(CryptoTradeBonusBottomSheetFragmentKey.EntryPoint.OrderDetails.INSTANCE, UiCryptoOrders2.tradeBonusBottomSheetOrderExecutionState(showTradeBonusBottomSheet.getUiCryptoOrder(), showTradeBonusBottomSheet.isEstimate())), null, 2, null).show(childFragmentManager, "tradeBonusBottomSheet");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$14 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$14 != null && (eventCryptoOrderDetailComposable$lambda$14.getData() instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult) && (eventConsumerInvoke5 = eventCryptoOrderDetailComposable$lambda$14.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke5.consume(eventCryptoOrderDetailComposable$lambda$14, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m25919invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25919invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailUiEvent.CancelCryptoOrderResult cancelCryptoOrderResult = (CryptoOrderDetailUiEvent.CancelCryptoOrderResult) eventCryptoOrderDetailComposable$lambda$14.getData();
                            if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Canceled) {
                                ContextsUiExtensions.showShortToast(context, C40095R.string.crypto_order_detail_order_canceled);
                            } else if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Failed) {
                                AbsErrorHandler.handleError$default(activityErrorHandler, ((CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Failed) cancelCryptoOrderResult).getThrowable(), false, 2, null);
                            } else {
                                if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Sent) {
                                    CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$4(snapshotState, true);
                                    return;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$15 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$15 != null && (eventCryptoOrderDetailComposable$lambda$15.getData() instanceof CryptoOrderDetailUiEvent.ShowFeeDefinitionBottomSheet) && (eventConsumerInvoke4 = eventCryptoOrderDetailComposable$lambda$15.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke4.consume(eventCryptoOrderDetailComposable$lambda$15, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25920invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25920invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ((CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoOrderDetailUiEvent.ShowFeeDefinitionBottomSheet) eventCryptoOrderDetailComposable$lambda$15.getData()).getArgs())).show(childFragmentManager, "cryptoFeeDefinitionBottomSheet");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$16 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$16 != null && (eventCryptoOrderDetailComposable$lambda$16.getData() instanceof CryptoOrderDetailUiEvent.ShowCryptoOrderDetailTaxLots) && (eventConsumerInvoke3 = eventCryptoOrderDetailComposable$lambda$16.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke3.consume(eventCryptoOrderDetailComposable$lambda$16, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25921invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25921invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.showFragment$default(navigator, context, ((CryptoOrderDetailUiEvent.ShowCryptoOrderDetailTaxLots) eventCryptoOrderDetailComposable$lambda$16.getData()).getFragmentKey(), false, false, false, null, false, null, true, false, null, null, 3836, null);
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$17 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$17 != null && (eventCryptoOrderDetailComposable$lambda$17.getData() instanceof CryptoOrderDetailUiEvent.ShowTradingBottomSheet) && (eventConsumerInvoke2 = eventCryptoOrderDetailComposable$lambda$17.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke2.consume(eventCryptoOrderDetailComposable$lambda$17, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$7
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25922invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25922invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoOrderDetailUiEvent.ShowTradingBottomSheet) eventCryptoOrderDetailComposable$lambda$17.getData()).getFragmentKey(), null, 2, null).show(BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager(), "microgramCryptoQuoteOrderDialogFragment");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$18 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoOrderDetailComposable$lambda$18 != null && (eventCryptoOrderDetailComposable$lambda$18.getData() instanceof CryptoOrderDetailUiEvent.ShowPnlTradeDetailsBottomSheet) && (eventConsumerInvoke = eventCryptoOrderDetailComposable$lambda$18.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoOrderDetailComposable$lambda$18, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$8
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25923invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25923invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoOrderDetailUiEvent.ShowPnlTradeDetailsBottomSheet) eventCryptoOrderDetailComposable$lambda$18.getData()).getFragmentKey(), null, 2, null);
                            FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            DialogFragments.showIfNotFound(dialogFragmentCreateDialogFragment$default, supportFragmentManager, "pnlTradeDetailsBottomSheet");
                        }
                    });
                }
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoOrderDetailDuxo3) | composerStartRestartGroup.changed(jM21426getFg20d7_KjU);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new CryptoOrderDetailComposable6(cryptoOrderDetailDuxo3, jM21426getFg20d7_KjU, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(colorM6701boximpl, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                composer2 = composerStartRestartGroup;
                BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-311193515, true, new C4046510(onBackClick, snapshotState4CollectAsStateWithLifecycle, cryptoOrderDetailDuxo3, navigator, context, snapshotState, snapshotState3, snapshotState2), composer2, 54), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                cryptoOrderDetailDuxo2 = cryptoOrderDetailDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                cryptoOrderDetailDuxo3 = cryptoOrderDetailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoOrderDetailDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                eventCryptoOrderDetailComposable$lambda$1 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$1 != null) {
                    eventConsumerInvoke8.consume(eventCryptoOrderDetailComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25916invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25916invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$7(snapshotState2, ((CryptoOrderDetailUiEvent.ShowNotionalPriceBottomSheet) eventCryptoOrderDetailComposable$lambda$1.getData()).getUiCryptoOrder());
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$12 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$12 != null) {
                    eventConsumerInvoke7.consume(eventCryptoOrderDetailComposable$lambda$12, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$2
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25917invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25917invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$10(snapshotState3, true);
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$13 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$13 != null) {
                    eventConsumerInvoke6.consume(eventCryptoOrderDetailComposable$lambda$13, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$3
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25918invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25918invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet showTradeBonusBottomSheet = (CryptoOrderDetailUiEvent.ShowTradeBonusBottomSheet) eventCryptoOrderDetailComposable$lambda$13.getData();
                            Navigator.DefaultImpls.createDialogFragment$default(navigator, new CryptoTradeBonusBottomSheetFragmentKey(CryptoTradeBonusBottomSheetFragmentKey.EntryPoint.OrderDetails.INSTANCE, UiCryptoOrders2.tradeBonusBottomSheetOrderExecutionState(showTradeBonusBottomSheet.getUiCryptoOrder(), showTradeBonusBottomSheet.isEstimate())), null, 2, null).show(childFragmentManager, "tradeBonusBottomSheet");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$14 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$14 != null) {
                    eventConsumerInvoke5.consume(eventCryptoOrderDetailComposable$lambda$14, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$4
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Resources.NotFoundException {
                            m25919invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25919invoke(Object it) throws Resources.NotFoundException {
                            Intrinsics.checkNotNullParameter(it, "it");
                            CryptoOrderDetailUiEvent.CancelCryptoOrderResult cancelCryptoOrderResult = (CryptoOrderDetailUiEvent.CancelCryptoOrderResult) eventCryptoOrderDetailComposable$lambda$14.getData();
                            if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Canceled) {
                                ContextsUiExtensions.showShortToast(context, C40095R.string.crypto_order_detail_order_canceled);
                            } else if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Failed) {
                                AbsErrorHandler.handleError$default(activityErrorHandler, ((CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Failed) cancelCryptoOrderResult).getThrowable(), false, 2, null);
                            } else {
                                if (cancelCryptoOrderResult instanceof CryptoOrderDetailUiEvent.CancelCryptoOrderResult.Sent) {
                                    CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$4(snapshotState, true);
                                    return;
                                }
                                throw new NoWhenBranchMatchedException();
                            }
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$15 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$15 != null) {
                    eventConsumerInvoke4.consume(eventCryptoOrderDetailComposable$lambda$15, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$5
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25920invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25920invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ((CryptoFeeDefinitionBottomSheetFragment) CryptoFeeDefinitionBottomSheetFragment.INSTANCE.newInstance((Parcelable) ((CryptoOrderDetailUiEvent.ShowFeeDefinitionBottomSheet) eventCryptoOrderDetailComposable$lambda$15.getData()).getArgs())).show(childFragmentManager, "cryptoFeeDefinitionBottomSheet");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$16 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$16 != null) {
                    eventConsumerInvoke3.consume(eventCryptoOrderDetailComposable$lambda$16, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$6
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25921invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25921invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.showFragment$default(navigator, context, ((CryptoOrderDetailUiEvent.ShowCryptoOrderDetailTaxLots) eventCryptoOrderDetailComposable$lambda$16.getData()).getFragmentKey(), false, false, false, null, false, null, true, false, null, null, 3836, null);
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$17 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$17 != null) {
                    eventConsumerInvoke2.consume(eventCryptoOrderDetailComposable$lambda$17, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$7
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25922invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25922invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoOrderDetailUiEvent.ShowTradingBottomSheet) eventCryptoOrderDetailComposable$lambda$17.getData()).getFragmentKey(), null, 2, null).show(BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager(), "microgramCryptoQuoteOrderDialogFragment");
                        }
                    });
                }
                eventCryptoOrderDetailComposable$lambda$18 = CryptoOrderDetailComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoOrderDetailComposable$lambda$18 != null) {
                    eventConsumerInvoke.consume(eventCryptoOrderDetailComposable$lambda$18, new Function1() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$$inlined$consumeIfType$8
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m25923invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25923invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            DialogFragment dialogFragmentCreateDialogFragment$default = Navigator.DefaultImpls.createDialogFragment$default(navigator, ((CryptoOrderDetailUiEvent.ShowPnlTradeDetailsBottomSheet) eventCryptoOrderDetailComposable$lambda$18.getData()).getFragmentKey(), null, 2, null);
                            FragmentManager supportFragmentManager = BaseContexts.requireActivityBaseContext(context).getSupportFragmentManager();
                            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                            DialogFragments.showIfNotFound(dialogFragmentCreateDialogFragment$default, supportFragmentManager, "pnlTradeDetailsBottomSheet");
                        }
                    });
                }
                jM21426getFg20d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21426getFg20d7_KjU();
                Color colorM6701boximpl2 = Color.m6701boximpl(jM21426getFg20d7_KjU);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChangedInstance = composerStartRestartGroup.changedInstance(cryptoOrderDetailDuxo3) | composerStartRestartGroup.changed(jM21426getFg20d7_KjU);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue4 = new CryptoOrderDetailComposable6(cryptoOrderDetailDuxo3, jM21426getFg20d7_KjU, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(colorM6701boximpl2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, 0);
                    composer2 = composerStartRestartGroup;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-311193515, true, new C4046510(onBackClick, snapshotState4CollectAsStateWithLifecycle3, cryptoOrderDetailDuxo3, navigator, context, snapshotState, snapshotState3, snapshotState2), composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    cryptoOrderDetailDuxo2 = cryptoOrderDetailDuxo3;
                }
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$20(onBackClick, activityErrorHandler, childFragmentManager, cryptoOrderDetailDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoOrderDetailComposable$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoOrderDetailComposable$lambda$10(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OrderDetailViewState<CryptoOrderDetailTapAction> CryptoOrderDetailComposable$lambda$0(SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoOrderDetailUiEvent> CryptoOrderDetailComposable$lambda$1(SnapshotState4<Event<CryptoOrderDetailUiEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoOrderDetailComposable$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UiCryptoOrder CryptoOrderDetailComposable$lambda$6(SnapshotState<UiCryptoOrder> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoOrderDetailComposable$lambda$9(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* compiled from: CryptoOrderDetailComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10 */
    static final class C4046510 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<UiCryptoOrder> $collarExplanationDialogContent$delegate;
        final /* synthetic */ Context $context;
        final /* synthetic */ CryptoOrderDetailDuxo $duxo;
        final /* synthetic */ Navigator $navigator;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ SnapshotState<Boolean> $showCancelOrderSentDialog$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showRecurringCollarExplanationDialog$delegate;
        final /* synthetic */ SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> $viewState$delegate;

        C4046510(Function0<Unit> function0, SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> snapshotState4, CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Navigator navigator, Context context, SnapshotState<Boolean> snapshotState, SnapshotState<Boolean> snapshotState2, SnapshotState<UiCryptoOrder> snapshotState3) {
            this.$onBackClick = function0;
            this.$viewState$delegate = snapshotState4;
            this.$duxo = cryptoOrderDetailDuxo;
            this.$navigator = navigator;
            this.$context = context;
            this.$showCancelOrderSentDialog$delegate = snapshotState;
            this.$showRecurringCollarExplanationDialog$delegate = snapshotState2;
            this.$collarExplanationDialogContent$delegate = snapshotState3;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$4(snapshotState, false);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState) {
            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$10(snapshotState, false);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-311193515, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable.<anonymous> (CryptoOrderDetailComposable.kt:112)");
            }
            final Function0<Unit> function0 = this.$onBackClick;
            final SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> snapshotState4 = this.$viewState$delegate;
            final CryptoOrderDetailDuxo cryptoOrderDetailDuxo = this.$duxo;
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1088302319, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt.CryptoOrderDetailComposable.10.1
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
                        ComposerKt.traceEventStart(-1088302319, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable.<anonymous>.<anonymous> (CryptoOrderDetailComposable.kt:114)");
                    }
                    Function2<Composer, Integer, Unit> lambda$1188804612$feature_trade_crypto_externalDebug = CryptoOrderDetailComposable.INSTANCE.getLambda$1188804612$feature_trade_crypto_externalDebug();
                    final Function0<Unit> function02 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1188804612$feature_trade_crypto_externalDebug, null, ComposableLambda3.rememberComposableLambda(192890928, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt.CryptoOrderDetailComposable.10.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                            invoke(bentoAppBarScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i3) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i3 & 6) == 0) {
                                i3 |= (i3 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i3 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(192890928, i3, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoOrderDetailComposable.kt:117)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "top_bar_back_button_test_tag"), false, null, function02, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i3 << 12) & 57344), 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), ComposableLambda3.rememberComposableLambda(948980015, true, new AnonymousClass2(snapshotState4, cryptoOrderDetailDuxo, navigator, context), composer2, 54), null, false, false, null, null, 0L, null, composer2, 3462, 0, 2034);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: CryptoOrderDetailComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ Context $context;
                    final /* synthetic */ CryptoOrderDetailDuxo $duxo;
                    final /* synthetic */ Navigator $navigator;
                    final /* synthetic */ SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> $viewState$delegate;

                    AnonymousClass2(SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> snapshotState4, CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Navigator navigator, Context context) {
                        this.$viewState$delegate = snapshotState4;
                        this.$duxo = cryptoOrderDetailDuxo;
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
                            ComposerKt.traceEventStart(948980015, i, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable.<anonymous>.<anonymous>.<anonymous> (CryptoOrderDetailComposable.kt:123)");
                        }
                        final OrderDetailViewState.ViewInstrumentActionState viewInstrumentActionState = CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$0(this.$viewState$delegate).getViewInstrumentActionState();
                        if (viewInstrumentActionState != null) {
                            final CryptoOrderDetailDuxo cryptoOrderDetailDuxo = this.$duxo;
                            final Navigator navigator = this.$navigator;
                            final Context context = this.$context;
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance = composer.changedInstance(cryptoOrderDetailDuxo) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(viewInstrumentActionState);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$1$2$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoOrderDetailComposable3.C4046510.AnonymousClass1.AnonymousClass2.invoke$lambda$2$lambda$1$lambda$0(cryptoOrderDetailDuxo, navigator, context, viewInstrumentActionState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            ViewInstrumentActionComposable.ViewInstrumentActionComposable(viewInstrumentActionState, (Function0) objRememberedValue, null, composer, OrderDetailViewState.ViewInstrumentActionState.$stable, 4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(CryptoOrderDetailDuxo cryptoOrderDetailDuxo, Navigator navigator, Context context, OrderDetailViewState.ViewInstrumentActionState viewInstrumentActionState) {
                        cryptoOrderDetailDuxo.logViewCdpEvent();
                        Navigator.DefaultImpls.showFragment$default(navigator, context, new CryptoDetailFragmentKey(viewInstrumentActionState.getInstrumentId(), null, true, null, CryptoDetailSource.ORDER_DETAIL, null, 42, null), false, false, false, null, false, null, false, false, null, null, 4092, null);
                        return Unit.INSTANCE;
                    }
                }
            }, composer, 54);
            final CryptoOrderDetailDuxo cryptoOrderDetailDuxo2 = this.$duxo;
            final SnapshotState4<OrderDetailViewState<CryptoOrderDetailTapAction>> snapshotState42 = this.$viewState$delegate;
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, composableLambdaRememberComposableLambda, null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(-455598362, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt.CryptoOrderDetailComposable.10.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                    invoke(paddingValues, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer2, int i2) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i2 & 6) == 0) {
                        i2 |= composer2.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i2 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-455598362, i2, -1, "com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposable.<anonymous>.<anonymous> (CryptoOrderDetailComposable.kt:143)");
                    }
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, paddingValues), CryptoOrderDetailComposable3.LOADED_CONTENT_TEST_TAG);
                    OrderDetailViewState orderDetailViewStateCryptoOrderDetailComposable$lambda$0 = CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$0(snapshotState42);
                    CryptoOrderDetailDuxo cryptoOrderDetailDuxo3 = cryptoOrderDetailDuxo2;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance = composer2.changedInstance(cryptoOrderDetailDuxo3);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new CryptoOrderDetailComposable4(cryptoOrderDetailDuxo3);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    KFunction kFunction = (KFunction) objRememberedValue;
                    composer2.endReplaceGroup();
                    CryptoOrderDetailDuxo cryptoOrderDetailDuxo4 = cryptoOrderDetailDuxo2;
                    composer2.startReplaceGroup(5004770);
                    boolean zChangedInstance2 = composer2.changedInstance(cryptoOrderDetailDuxo4);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new CryptoOrderDetailComposable5(cryptoOrderDetailDuxo4);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    OrderDetailsComposableKt.OrderDetailsComposable(orderDetailViewStateCryptoOrderDetailComposable$lambda$0, (Function1) kFunction, (Function0) ((KFunction) objRememberedValue2), modifierTestTag, null, composer2, OrderDetailViewState.$stable, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 805306416, 509);
            composer.startReplaceGroup(1590799546);
            if (CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$3(this.$showCancelOrderSentDialog$delegate)) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState = this.$showCancelOrderSentDialog$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderDetailComposable3.C4046510.invoke$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                CryptoCancelOrderSentDialog.CryptoCancelOrderSentDialog((Function0) objRememberedValue, composer, 6);
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1590804186);
            if (CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$9(this.$showRecurringCollarExplanationDialog$delegate)) {
                composer.startReplaceGroup(5004770);
                final SnapshotState<Boolean> snapshotState2 = this.$showRecurringCollarExplanationDialog$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderDetailComposable3.C4046510.invoke$lambda$3$lambda$2(snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                CryptoRecurringCollarExplanationDialog.CryptoRecurringCollarExplanationDialog((Function0) objRememberedValue2, composer, 6);
            }
            composer.endReplaceGroup();
            UiCryptoOrder uiCryptoOrderCryptoOrderDetailComposable$lambda$6 = CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$6(this.$collarExplanationDialogContent$delegate);
            if (uiCryptoOrderCryptoOrderDetailComposable$lambda$6 != null) {
                final SnapshotState<UiCryptoOrder> snapshotState3 = this.$collarExplanationDialogContent$delegate;
                OrderSide side = uiCryptoOrderCryptoOrderDetailComposable$lambda$6.getCryptoOrder().getSide();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.trade.crypto.ui.orderDetail.views.CryptoOrderDetailComposableKt$CryptoOrderDetailComposable$10$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoOrderDetailComposable3.C4046510.invoke$lambda$6$lambda$5$lambda$4(snapshotState3);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                CryptoCollarExplanationDialog.CryptoCollarExplanationDialog(side, (Function0) objRememberedValue3, composer, 48);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
            CryptoOrderDetailComposable3.CryptoOrderDetailComposable$lambda$7(snapshotState, null);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoOrderDetailComposable$lambda$7(SnapshotState<UiCryptoOrder> snapshotState, UiCryptoOrder uiCryptoOrder) {
        snapshotState.setValue(uiCryptoOrder);
    }
}
