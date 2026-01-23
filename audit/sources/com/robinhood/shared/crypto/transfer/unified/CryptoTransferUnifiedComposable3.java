package com.robinhood.shared.crypto.transfer.unified;

import android.app.Activity;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.foundation.pager.PagerStateKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
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
import androidx.view.OnBackPressedDispatcher;
import androidx.view.OnBackPressedDispatcherOwner;
import androidx.view.compose.BackHandler5;
import androidx.view.compose.LocalActivity;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoProgressBar2;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.transfer.CryptoTransferAction;
import com.robinhood.models.crypto.p314db.transfer.CryptoTransferConfig;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.shared.crypto.transfer.receive.CryptoTransferReceiveComposable;
import com.robinhood.shared.crypto.transfer.send.landing.CryptoTransferSendLandingComposable;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable3;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedDuxo2;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedFragment;
import com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedViewState;
import com.robinhood.shared.crypto.transfer.util.NavigationType;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferUnifiedComposable.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\u0012\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013X\u008a\u0084\u0002²\u0006\n\u0010\u0015\u001a\u00020\u0016X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferUnifiedComposable", "", "currencyPairId", "Ljava/util/UUID;", "initialAction", "Lcom/robinhood/models/api/transfer/CryptoTransferAction;", "callbacks", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedFragment$Callbacks;", "navigationType", "Lcom/robinhood/shared/crypto/transfer/util/NavigationType;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedDuxo;", "(Ljava/util/UUID;Lcom/robinhood/models/api/transfer/CryptoTransferAction;Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedFragment$Callbacks;Lcom/robinhood/shared/crypto/transfer/util/NavigationType;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/shared/crypto/transfer/unified/CryptoTransferUnifiedEvent;", "showTipsSheet", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferUnifiedComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int CryptoTransferUnifiedComposable$lambda$3$lambda$2() {
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferUnifiedComposable$lambda$9(UUID uuid, CryptoTransferAction cryptoTransferAction, CryptoTransferUnifiedFragment.Callbacks callbacks, NavigationType navigationType, Modifier modifier, CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferUnifiedComposable(uuid, cryptoTransferAction, callbacks, navigationType, modifier, cryptoTransferUnifiedDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferUnifiedComposable(final UUID currencyPairId, final CryptoTransferAction initialAction, final CryptoTransferUnifiedFragment.Callbacks callbacks, final NavigationType navigationType, Modifier modifier, CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo2;
        int i4;
        Modifier modifier3;
        CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo3;
        CryptoTransferUnifiedViewState.Screen activeScreen;
        Object objRememberedValue;
        Composer.Companion companion;
        final PagerState pagerStateRememberPagerState;
        Object objRememberedValue2;
        CoroutineScope coroutineScope;
        final Activity activity;
        Object objRememberedValue3;
        final Event<CryptoTransferUnifiedDuxo2> eventCryptoTransferUnifiedComposable$lambda$1;
        boolean zChangedInstance;
        Object objRememberedValue4;
        final Modifier modifier4;
        EventConsumer<CryptoTransferUnifiedDuxo2> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Intrinsics.checkNotNullParameter(initialAction, "initialAction");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(navigationType, "navigationType");
        Composer composerStartRestartGroup = composer.startRestartGroup(525694542);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(initialAction.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(navigationType.ordinal()) ? 2048 : 1024;
        }
        int i5 = i2 & 16;
        if (i5 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    cryptoTransferUnifiedDuxo2 = cryptoTransferUnifiedDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(cryptoTransferUnifiedDuxo2) ? 131072 : 65536;
                    i3 |= i6;
                } else {
                    cryptoTransferUnifiedDuxo2 = cryptoTransferUnifiedDuxo;
                }
                i3 |= i6;
            } else {
                cryptoTransferUnifiedDuxo2 = cryptoTransferUnifiedDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferUnifiedDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue5 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$$inlined$duxo$1.1
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
                        cryptoTransferUnifiedDuxo2 = (CryptoTransferUnifiedDuxo) baseDuxo;
                        i3 &= -458753;
                    } else {
                        i4 = 0;
                    }
                    modifier3 = modifier5;
                    cryptoTransferUnifiedDuxo3 = cryptoTransferUnifiedDuxo2;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    modifier3 = modifier2;
                    cryptoTransferUnifiedDuxo3 = cryptoTransferUnifiedDuxo2;
                    i4 = 0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(525694542, i3, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable (CryptoTransferUnifiedComposable.kt:44)");
                }
                Composer composer2 = composerStartRestartGroup;
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferUnifiedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferUnifiedDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                activeScreen = CryptoTransferUnifiedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).getActiveScreen();
                int index = activeScreen.getIndex();
                composer2.startReplaceGroup(1849434622);
                objRememberedValue = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Integer.valueOf(CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$3$lambda$2());
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(index, 0.0f, (Function0) objRememberedValue, composer2, 384, 2);
                objRememberedValue2 = composer2.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer2);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                Object objConsume = composer2.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume;
                composer2.startReplaceGroup(1849434622);
                objRememberedValue3 = composer2.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composer2.endReplaceGroup();
                WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                int i7 = i3;
                int i8 = i4;
                C384181 c384181 = new C384181(snapshotState4CollectAsStateWithLifecycle, cryptoTransferUnifiedDuxo3, activeScreen, navigationType, activity, callbacks, snapshotState);
                cryptoTransferUnifiedDuxo2 = cryptoTransferUnifiedDuxo3;
                Modifier modifier6 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier6, ComposableLambda3.rememberComposableLambda(-1542324206, true, c384181, composer2, 54), null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1154675555, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt.CryptoTransferUnifiedComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer3, int i9) {
                        int i10;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i9 & 6) == 0) {
                            i10 = i9 | (composer3.changed(it) ? 4 : 2);
                        } else {
                            i10 = i9;
                        }
                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1154675555, i10, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous> (CryptoTransferUnifiedComposable.kt:105)");
                        }
                        PagerKt.m5301HorizontalPager8jOkeI(pagerStateRememberPagerState, PaddingKt.padding(Modifier.INSTANCE, it), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1060950204, true, new AnonymousClass1(callbacks, currencyPairId, initialAction, snapshotState4CollectAsStateWithLifecycle, snapshotState), composer3, 54), composer3, 100663296, 24576, 16124);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferUnifiedComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
                        final /* synthetic */ CryptoTransferUnifiedFragment.Callbacks $callbacks;
                        final /* synthetic */ UUID $currencyPairId;
                        final /* synthetic */ CryptoTransferAction $initialAction;
                        final /* synthetic */ SnapshotState<Boolean> $showTipsSheet$delegate;
                        final /* synthetic */ SnapshotState4<CryptoTransferUnifiedViewState> $viewState$delegate;

                        AnonymousClass1(CryptoTransferUnifiedFragment.Callbacks callbacks, UUID uuid, CryptoTransferAction cryptoTransferAction, SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
                            this.$callbacks = callbacks;
                            this.$currencyPairId = uuid;
                            this.$initialAction = cryptoTransferAction;
                            this.$viewState$delegate = snapshotState4;
                            this.$showTipsSheet$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
                            invoke(pagerScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1060950204, i2, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedComposable.kt:110)");
                            }
                            if (i == 0) {
                                composer.startReplaceGroup(103250042);
                                UUID uuidRandomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                                boolean zCryptoTransferUnifiedComposable$lambda$5 = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$5(this.$showTipsSheet$delegate);
                                CryptoTransferUnifiedFragment.Callbacks callbacks = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(callbacks);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new CryptoTransferUnifiedComposable5(callbacks);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue;
                                composer.endReplaceGroup();
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                UUID uuid = this.$currencyPairId;
                                CryptoTransferAction cryptoTransferAction = this.$initialAction;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<Boolean> snapshotState = this.$showTipsSheet$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$2$lambda$1(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                CryptoTransferReceiveComposable.CryptoTransferReceiveComposable(uuid, uuidRandomUUID, cryptoTransferAction, zCryptoTransferUnifiedComposable$lambda$5, (Function0) objRememberedValue2, (Function2) kFunction, modifierFillMaxSize$default, null, composer, 1597440, 128);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(103765293);
                                UUID uuidRandomUUID2 = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
                                boolean zCryptoTransferUnifiedComposable$lambda$52 = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$5(this.$showTipsSheet$delegate);
                                CryptoTransferUnifiedFragment.Callbacks callbacks2 = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(callbacks2);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new CryptoTransferUnifiedComposable6(callbacks2);
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                KFunction kFunction2 = (KFunction) objRememberedValue3;
                                composer.endReplaceGroup();
                                boolean useSavedAddressesFlow = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(this.$viewState$delegate).getUseSavedAddressesFlow();
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                UUID uuid2 = this.$currencyPairId;
                                CryptoTransferAction cryptoTransferAction2 = this.$initialAction;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState<Boolean> snapshotState2 = this.$showTipsSheet$delegate;
                                Object objRememberedValue4 = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$5$lambda$4(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                Function0 function0 = (Function0) objRememberedValue4;
                                composer.endReplaceGroup();
                                Function2 function2 = (Function2) kFunction2;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$callbacks);
                                final CryptoTransferUnifiedFragment.Callbacks callbacks3 = this.$callbacks;
                                final SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function4() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$7$lambda$6(callbacks3, snapshotState4, (String) obj, ((Integer) obj2).intValue(), (CryptoTransferConfig.TransferWarnings.Stage.Warning) obj3, (CryptoTransferConfig.TransferAddressTag) obj4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue5);
                                }
                                composer.endReplaceGroup();
                                CryptoTransferSendLandingComposable.CryptoTransferSendLandingComposable(uuid2, uuidRandomUUID2, cryptoTransferAction2, useSavedAddressesFlow, zCryptoTransferUnifiedComposable$lambda$52, function0, function2, (Function4) objRememberedValue5, modifierFillMaxSize$default2, null, composer, 100859904, 512);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState) {
                            CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$6(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                            CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$6(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(CryptoTransferUnifiedFragment.Callbacks callbacks, SnapshotState4 snapshotState4, String address, int i, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferAddressTag transferAddressTag) {
                            Intrinsics.checkNotNullParameter(address, "address");
                            UiCurrencyPair uiCurrencyPair = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(snapshotState4).getUiCurrencyPair();
                            if (uiCurrencyPair != null) {
                                callbacks.navigateToAddressEntry(address, uiCurrencyPair, null, warning, transferAddressTag, i);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }, composer2, 54), composer2, ((i7 >> 12) & 14) | 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup = composer2;
                eventCryptoTransferUnifiedComposable$lambda$1 = CryptoTransferUnifiedComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle2);
                if (eventCryptoTransferUnifiedComposable$lambda$1 != null && (eventCryptoTransferUnifiedComposable$lambda$1.getData() instanceof CryptoTransferUnifiedDuxo2.Error) && (eventConsumerInvoke = eventCryptoTransferUnifiedComposable$lambda$1.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(eventCryptoTransferUnifiedComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m25158invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25158invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((CryptoTransferUnifiedDuxo2.Error) eventCryptoTransferUnifiedComposable$lambda$1.getData()).getError(), true, false, 0, null, 56, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changed(activeScreen.ordinal());
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new CryptoTransferUnifiedComposable7(coroutineScope, pagerStateRememberPagerState, activeScreen, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(activeScreen, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier6;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            final CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo4 = cryptoTransferUnifiedDuxo2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$9(currencyPairId, initialAction, callbacks, navigationType, modifier4, cryptoTransferUnifiedDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((196608 & i) != 0) {
        }
        if ((74899 & i3) == 74898) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                modifier3 = modifier5;
                cryptoTransferUnifiedDuxo3 = cryptoTransferUnifiedDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                Composer composer22 = composerStartRestartGroup;
                final SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferUnifiedDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferUnifiedDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer22, 0, 7);
                activeScreen = CryptoTransferUnifiedComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle3).getActiveScreen();
                int index2 = activeScreen.getIndex();
                composer22.startReplaceGroup(1849434622);
                objRememberedValue = composer22.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composer22.endReplaceGroup();
                pagerStateRememberPagerState = PagerStateKt.rememberPagerState(index2, 0.0f, (Function0) objRememberedValue, composer22, 384, 2);
                objRememberedValue2 = composer22.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                coroutineScope = (CoroutineScope) objRememberedValue2;
                Object objConsume2 = composer22.consume(LocalActivity.getLocalActivity());
                Intrinsics.checkNotNull(objConsume2, "null cannot be cast to non-null type android.app.Activity");
                activity = (Activity) objConsume2;
                composer22.startReplaceGroup(1849434622);
                objRememberedValue3 = composer22.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue3;
                composer22.endReplaceGroup();
                WindowInsets windowInsetsWindowInsets$default2 = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                int i72 = i3;
                int i82 = i4;
                C384181 c3841812 = new C384181(snapshotState4CollectAsStateWithLifecycle3, cryptoTransferUnifiedDuxo3, activeScreen, navigationType, activity, callbacks, snapshotState2);
                cryptoTransferUnifiedDuxo2 = cryptoTransferUnifiedDuxo3;
                Modifier modifier62 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier62, ComposableLambda3.rememberComposableLambda(-1542324206, true, c3841812, composer22, 54), null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default2, ComposableLambda3.rememberComposableLambda(-1154675555, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt.CryptoTransferUnifiedComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues it, Composer composer3, int i9) {
                        int i10;
                        Intrinsics.checkNotNullParameter(it, "it");
                        if ((i9 & 6) == 0) {
                            i10 = i9 | (composer3.changed(it) ? 4 : 2);
                        } else {
                            i10 = i9;
                        }
                        if ((i10 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1154675555, i10, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous> (CryptoTransferUnifiedComposable.kt:105)");
                        }
                        PagerKt.m5301HorizontalPager8jOkeI(pagerStateRememberPagerState, PaddingKt.padding(Modifier.INSTANCE, it), null, null, 0, 0.0f, null, null, false, false, null, null, null, null, ComposableLambda3.rememberComposableLambda(1060950204, true, new AnonymousClass1(callbacks, currencyPairId, initialAction, snapshotState4CollectAsStateWithLifecycle3, snapshotState2), composer3, 54), composer3, 100663296, 24576, 16124);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: CryptoTransferUnifiedComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
                        final /* synthetic */ CryptoTransferUnifiedFragment.Callbacks $callbacks;
                        final /* synthetic */ UUID $currencyPairId;
                        final /* synthetic */ CryptoTransferAction $initialAction;
                        final /* synthetic */ SnapshotState<Boolean> $showTipsSheet$delegate;
                        final /* synthetic */ SnapshotState4<CryptoTransferUnifiedViewState> $viewState$delegate;

                        AnonymousClass1(CryptoTransferUnifiedFragment.Callbacks callbacks, UUID uuid, CryptoTransferAction cryptoTransferAction, SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4, SnapshotState<Boolean> snapshotState) {
                            this.$callbacks = callbacks;
                            this.$currencyPairId = uuid;
                            this.$initialAction = cryptoTransferAction;
                            this.$viewState$delegate = snapshotState4;
                            this.$showTipsSheet$delegate = snapshotState;
                        }

                        @Override // kotlin.jvm.functions.Function4
                        public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
                            invoke(pagerScope, num.intValue(), composer, num2.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
                            Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1060950204, i2, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedComposable.kt:110)");
                            }
                            if (i == 0) {
                                composer.startReplaceGroup(103250042);
                                UUID uuidRandomUUID = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
                                boolean zCryptoTransferUnifiedComposable$lambda$5 = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$5(this.$showTipsSheet$delegate);
                                CryptoTransferUnifiedFragment.Callbacks callbacks = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer.changedInstance(callbacks);
                                Object objRememberedValue = composer.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new CryptoTransferUnifiedComposable5(callbacks);
                                    composer.updateRememberedValue(objRememberedValue);
                                }
                                KFunction kFunction = (KFunction) objRememberedValue;
                                composer.endReplaceGroup();
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                UUID uuid = this.$currencyPairId;
                                CryptoTransferAction cryptoTransferAction = this.$initialAction;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState snapshotState = this.$showTipsSheet$delegate;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$2$lambda$1(snapshotState);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                CryptoTransferReceiveComposable.CryptoTransferReceiveComposable(uuid, uuidRandomUUID, cryptoTransferAction, zCryptoTransferUnifiedComposable$lambda$5, (Function0) objRememberedValue2, (Function2) kFunction, modifierFillMaxSize$default, null, composer, 1597440, 128);
                                composer.endReplaceGroup();
                            } else {
                                composer.startReplaceGroup(103765293);
                                UUID uuidRandomUUID2 = UUID.randomUUID();
                                Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
                                boolean zCryptoTransferUnifiedComposable$lambda$52 = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$5(this.$showTipsSheet$delegate);
                                CryptoTransferUnifiedFragment.Callbacks callbacks2 = this.$callbacks;
                                composer.startReplaceGroup(5004770);
                                boolean zChangedInstance2 = composer.changedInstance(callbacks2);
                                Object objRememberedValue3 = composer.rememberedValue();
                                if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new CryptoTransferUnifiedComposable6(callbacks2);
                                    composer.updateRememberedValue(objRememberedValue3);
                                }
                                KFunction kFunction2 = (KFunction) objRememberedValue3;
                                composer.endReplaceGroup();
                                boolean useSavedAddressesFlow = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(this.$viewState$delegate).getUseSavedAddressesFlow();
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
                                UUID uuid2 = this.$currencyPairId;
                                CryptoTransferAction cryptoTransferAction2 = this.$initialAction;
                                composer.startReplaceGroup(5004770);
                                final SnapshotState snapshotState2 = this.$showTipsSheet$delegate;
                                Object objRememberedValue4 = composer.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$5$lambda$4(snapshotState2);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                }
                                Function0 function0 = (Function0) objRememberedValue4;
                                composer.endReplaceGroup();
                                Function2 function2 = (Function2) kFunction2;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged = composer.changed(this.$viewState$delegate) | composer.changedInstance(this.$callbacks);
                                final CryptoTransferUnifiedFragment.Callbacks callbacks3 = this.$callbacks;
                                final SnapshotState4 snapshotState4 = this.$viewState$delegate;
                                Object objRememberedValue5 = composer.rememberedValue();
                                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new Function4() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$2$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function4
                                        public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                                            return CryptoTransferUnifiedComposable3.C384202.AnonymousClass1.invoke$lambda$7$lambda$6(callbacks3, snapshotState4, (String) obj, ((Integer) obj2).intValue(), (CryptoTransferConfig.TransferWarnings.Stage.Warning) obj3, (CryptoTransferConfig.TransferAddressTag) obj4);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue5);
                                }
                                composer.endReplaceGroup();
                                CryptoTransferSendLandingComposable.CryptoTransferSendLandingComposable(uuid2, uuidRandomUUID2, cryptoTransferAction2, useSavedAddressesFlow, zCryptoTransferUnifiedComposable$lambda$52, function0, function2, (Function4) objRememberedValue5, modifierFillMaxSize$default2, null, composer, 100859904, 512);
                                composer.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(SnapshotState snapshotState) {
                            CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$6(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState) {
                            CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$6(snapshotState, false);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$7$lambda$6(CryptoTransferUnifiedFragment.Callbacks callbacks, SnapshotState4 snapshotState4, String address, int i, CryptoTransferConfig.TransferWarnings.Stage.Warning warning, CryptoTransferConfig.TransferAddressTag transferAddressTag) {
                            Intrinsics.checkNotNullParameter(address, "address");
                            UiCurrencyPair uiCurrencyPair = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(snapshotState4).getUiCurrencyPair();
                            if (uiCurrencyPair != null) {
                                callbacks.navigateToAddressEntry(address, uiCurrencyPair, null, warning, transferAddressTag, i);
                                return Unit.INSTANCE;
                            }
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    }
                }, composer22, 54), composer22, ((i72 >> 12) & 14) | 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                composerStartRestartGroup = composer22;
                eventCryptoTransferUnifiedComposable$lambda$1 = CryptoTransferUnifiedComposable$lambda$1(snapshotState4CollectAsStateWithLifecycle22);
                if (eventCryptoTransferUnifiedComposable$lambda$1 != null) {
                    eventConsumerInvoke.consume(eventCryptoTransferUnifiedComposable$lambda$1, new Function1() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws Throwable {
                            m25158invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m25158invoke(Object it) throws Throwable {
                            Intrinsics.checkNotNullParameter(it, "it");
                            ActivityErrorHandler.Companion.handle$default(ActivityErrorHandler.INSTANCE, activity, ((CryptoTransferUnifiedDuxo2.Error) eventCryptoTransferUnifiedComposable$lambda$1.getData()).getError(), true, false, 0, null, 56, null);
                        }
                    });
                }
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(pagerStateRememberPagerState) | composerStartRestartGroup.changed(activeScreen.ordinal());
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue4 = new CryptoTransferUnifiedComposable7(coroutineScope, pagerStateRememberPagerState, activeScreen, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(activeScreen, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i82);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier62;
                }
            }
        }
        final CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo42 = cryptoTransferUnifiedDuxo2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferUnifiedComposable$lambda$6(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* compiled from: CryptoTransferUnifiedComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1 */
    static final class C384181 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CryptoTransferUnifiedViewState.Screen $activeScreen;
        final /* synthetic */ Activity $activity;
        final /* synthetic */ CryptoTransferUnifiedFragment.Callbacks $callbacks;
        final /* synthetic */ CryptoTransferUnifiedDuxo $duxo;
        final /* synthetic */ NavigationType $navigationType;
        final /* synthetic */ SnapshotState<Boolean> $showTipsSheet$delegate;
        final /* synthetic */ SnapshotState4<CryptoTransferUnifiedViewState> $viewState$delegate;

        C384181(SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4, CryptoTransferUnifiedDuxo cryptoTransferUnifiedDuxo, CryptoTransferUnifiedViewState.Screen screen, NavigationType navigationType, Activity activity, CryptoTransferUnifiedFragment.Callbacks callbacks, SnapshotState<Boolean> snapshotState) {
            this.$viewState$delegate = snapshotState4;
            this.$duxo = cryptoTransferUnifiedDuxo;
            this.$activeScreen = screen;
            this.$navigationType = navigationType;
            this.$activity = activity;
            this.$callbacks = callbacks;
            this.$showTipsSheet$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$2$lambda$1(Activity activity) {
            activity.onBackPressed();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$4$lambda$3(SnapshotState snapshotState) {
            CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$6(snapshotState, true);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6$lambda$5(CryptoTransferUnifiedViewState.TopBarState topBarState, CryptoTransferUnifiedFragment.Callbacks callbacks) {
            callbacks.navigateToAddressEntry("", topBarState.getUiCurrencyPair(), null, topBarState.getSubmitWarningSheet(), topBarState.getAddressTagConfig(), topBarState.getMaxAddressLength());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1542324206, i, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous> (CryptoTransferUnifiedComposable.kt:61)");
            }
            final CryptoTransferUnifiedViewState.TopBarState topBarState = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(this.$viewState$delegate).getTopBarState();
            if (topBarState != null) {
                composer.startReplaceGroup(179851505);
                Object obj = this.$duxo;
                CryptoTransferUnifiedViewState.Screen screen = this.$activeScreen;
                NavigationType navigationType = this.$navigationType;
                final Activity activity = this.$activity;
                final CryptoTransferUnifiedFragment.Callbacks callbacks = this.$callbacks;
                SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4 = this.$viewState$delegate;
                final SnapshotState<Boolean> snapshotState = this.$showTipsSheet$delegate;
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
                boolean showActionToggle = CryptoTransferUnifiedComposable3.CryptoTransferUnifiedComposable$lambda$0(snapshotState4).getShowActionToggle();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(obj);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new CryptoTransferUnifiedComposable4(obj);
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                Function1 function1 = (Function1) ((KFunction) objRememberedValue);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(activity);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferUnifiedComposable3.C384181.invoke$lambda$7$lambda$2$lambda$1(activity);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function0 function0 = (Function0) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                Object objRememberedValue3 = composer.rememberedValue();
                Composer.Companion companion3 = Composer.INSTANCE;
                if (objRememberedValue3 == companion3.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferUnifiedComposable3.C384181.invoke$lambda$7$lambda$4$lambda$3(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function0 function02 = (Function0) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = composer.changedInstance(topBarState) | composer.changedInstance(callbacks);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue4 == companion3.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferUnifiedComposable3.C384181.invoke$lambda$7$lambda$6$lambda$5(topBarState, callbacks);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                TopBarWithSegmentedControl.TopAppBarWithSegmentedControl(topBarState, screen, navigationType, function1, function0, function02, null, showActionToggle, (Function0) objRememberedValue4, composer, 196608, 64);
                composer.startReplaceGroup(94703441);
                if (topBarState.getShouldShowProgressBar()) {
                    BentoProgressBar2.m20698BentoProgressBarjB83MbM(0.33f, com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composer, 6, 1), 1, 0L, 0L, false, composer, 390, 56);
                }
                composer.endReplaceGroup();
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(181404016);
                OnBackPressedDispatcherOwner current = BackHandler5.INSTANCE.getCurrent(composer, BackHandler5.$stable);
                BentoAppBarKt.m20573BentoAppBarSGdaT3c(CryptoTransferUnifiedComposable.INSTANCE.getLambda$705954659$feature_crypto_transfer_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-1345974857, true, new AnonymousClass2(current != null ? current.getOnBackPressedDispatcher() : null), composer, 54), null, null, false, false, null, null, 0L, null, composer, 390, 0, 2042);
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* compiled from: CryptoTransferUnifiedComposable.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
            final /* synthetic */ OnBackPressedDispatcher $onBack;

            AnonymousClass2(OnBackPressedDispatcher onBackPressedDispatcher) {
                this.$onBack = onBackPressedDispatcher;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer, Integer num) {
                invoke(bentoAppBarScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(OnBackPressedDispatcher onBackPressedDispatcher) {
                if (onBackPressedDispatcher != null) {
                    onBackPressedDispatcher.onBackPressed();
                }
                return Unit.INSTANCE;
            }

            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(BentoAppBar) : composer.changedInstance(BentoAppBar) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1345974857, i, -1, "com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposable.<anonymous>.<anonymous> (CryptoTransferUnifiedComposable.kt:99)");
                }
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(this.$onBack);
                final OnBackPressedDispatcher onBackPressedDispatcher = this.$onBack;
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.CryptoTransferUnifiedComposableKt$CryptoTransferUnifiedComposable$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferUnifiedComposable3.C384181.AnonymousClass2.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferUnifiedViewState CryptoTransferUnifiedComposable$lambda$0(SnapshotState4<CryptoTransferUnifiedViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<CryptoTransferUnifiedDuxo2> CryptoTransferUnifiedComposable$lambda$1(SnapshotState4<Event<CryptoTransferUnifiedDuxo2>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferUnifiedComposable$lambda$5(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
