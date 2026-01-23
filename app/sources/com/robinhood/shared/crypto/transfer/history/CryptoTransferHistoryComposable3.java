package com.robinhood.shared.crypto.transfer.history;

import android.content.Context;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda;
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
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAppBarAction;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.HistoryDetailAction;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable3;
import com.robinhood.utils.compose.ClipboardUtil;
import com.robinhood.utils.compose.ClipboardUtil2;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferHistoryComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a!\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006¨\u0006\u0007²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"CryptoTransferHistoryComposable", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/shared/crypto/transfer/history/CryptoTransferHistoryDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/crypto/transfer/history/CryptoTransferHistoryDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "viewState", "Lcom/robinhood/shared/crypto/transfer/history/CryptoTransferHistoryViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferHistoryComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferHistoryComposable$lambda$12$lambda$8$lambda$7(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferHistoryComposable$lambda$13(Modifier modifier, CryptoTransferHistoryDuxo cryptoTransferHistoryDuxo, int i, int i2, Composer composer, int i3) {
        CryptoTransferHistoryComposable(modifier, cryptoTransferHistoryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void CryptoTransferHistoryComposable(Modifier modifier, CryptoTransferHistoryDuxo cryptoTransferHistoryDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        final CryptoTransferHistoryDuxo cryptoTransferHistoryDuxo2;
        Modifier modifier3;
        Composer composer2;
        CryptoTransferHistoryDuxo cryptoTransferHistoryDuxo3;
        final Modifier modifier4;
        Composer composer3;
        final CryptoTransferHistoryComposable6 cryptoTransferHistoryComposable6;
        Composer composerStartRestartGroup = composer.startRestartGroup(1370933741);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = i | (composerStartRestartGroup.changed(modifier2) ? 4 : 2);
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                cryptoTransferHistoryDuxo2 = cryptoTransferHistoryDuxo;
                int i5 = composerStartRestartGroup.changedInstance(cryptoTransferHistoryDuxo2) ? 32 : 16;
                i3 |= i5;
            } else {
                cryptoTransferHistoryDuxo2 = cryptoTransferHistoryDuxo;
            }
            i3 |= i5;
        } else {
            cryptoTransferHistoryDuxo2 = cryptoTransferHistoryDuxo;
        }
        int i6 = i3;
        if ((i6 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier4 = modifier2;
            composer3 = composerStartRestartGroup;
        } else {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier2;
                if ((i2 & 2) != 0) {
                    composerStartRestartGroup.startReplaceGroup(-747520797);
                    ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                    if (current == null) {
                        throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    }
                    ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceableGroup(1729797275);
                    composer2 = composerStartRestartGroup;
                    ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoTransferHistoryDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer2, 0, 0);
                    composer2.endReplaceableGroup();
                    final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                    final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                    Object objRememberedValue = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$$inlined$duxo$1
                            @Override // kotlin.jvm.functions.Function1
                            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                lifecycle.addObserver(duxoLifecycleObserver);
                                final Lifecycle lifecycle2 = lifecycle;
                                return new DisposableEffectResult() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$$inlined$duxo$1.1
                                    @Override // androidx.compose.runtime.DisposableEffectResult
                                    public void dispose() {
                                        lifecycle2.removeObserver(duxoLifecycleObserver);
                                    }
                                };
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, 0);
                    composer2.endReplaceGroup();
                    i6 &= -113;
                    cryptoTransferHistoryDuxo3 = (CryptoTransferHistoryDuxo) baseDuxo;
                } else {
                    composer2 = composerStartRestartGroup;
                    cryptoTransferHistoryDuxo3 = cryptoTransferHistoryDuxo2;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i6 &= -113;
                }
                modifier3 = modifier2;
                cryptoTransferHistoryDuxo3 = cryptoTransferHistoryDuxo2;
                composer2 = composerStartRestartGroup;
            }
            composer2.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1370933741, i6, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable (CryptoTransferHistoryComposable.kt:47)");
            }
            Composer composer4 = composer2;
            final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoTransferHistoryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer4, 0, 7);
            OnBackPressedDispatcherOwner current2 = BackHandler5.INSTANCE.getCurrent(composer4, BackHandler5.$stable);
            final OnBackPressedDispatcher onBackPressedDispatcher = current2 != null ? current2.getOnBackPressedDispatcher() : null;
            Navigator navigator = (Navigator) composer4.consume(LocalNavigator.getLocalNavigator());
            Context context = (Context) composer4.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Object objRememberedValue2 = composer4.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer4);
                composer4.updateRememberedValue(objRememberedValue2);
            }
            CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
            ClipboardUtil clipboardUtil = ClipboardUtil2.clipboardUtil(composer4, 0);
            composer4.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composer4.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer4.updateRememberedValue(objRememberedValue3);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composer4.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer4.updateRememberedValue(objRememberedValue4);
            }
            final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue4;
            composer4.endReplaceGroup();
            composer4.startReplaceGroup(1849434622);
            Object objRememberedValue5 = composer4.rememberedValue();
            if (objRememberedValue5 == companion.getEmpty()) {
                objRememberedValue5 = new CryptoTransferHistoryComposable6(navigator, clipboardUtil, context, snapshotState, snapshotState2, coroutineScope);
                composer4.updateRememberedValue(objRememberedValue5);
            }
            final CryptoTransferHistoryComposable6 cryptoTransferHistoryComposable62 = (CryptoTransferHistoryComposable6) objRememberedValue5;
            composer4.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i7 = BentoTheme.$stable;
            Modifier modifier5 = modifier3;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier5, ComposableLambda3.rememberComposableLambda(-248308055, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt.CryptoTransferHistoryComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                    invoke(composer5, num.intValue());
                    return Unit.INSTANCE;
                }

                /* compiled from: CryptoTransferHistoryComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function3<BentoAppBarScope, Composer, Integer, Unit> {
                    final /* synthetic */ OnBackPressedDispatcher $backPressedDispatcher;

                    AnonymousClass1(OnBackPressedDispatcher onBackPressedDispatcher) {
                        this.$backPressedDispatcher = onBackPressedDispatcher;
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
                            ComposerKt.traceEventStart(-1652187064, i, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable.<anonymous>.<anonymous> (CryptoTransferHistoryComposable.kt:77)");
                        }
                        composer.startReplaceGroup(5004770);
                        boolean zChangedInstance = composer.changedInstance(this.$backPressedDispatcher);
                        final OnBackPressedDispatcher onBackPressedDispatcher = this.$backPressedDispatcher;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferHistoryComposable3.C380271.AnonymousClass1.invoke$lambda$1$lambda$0(onBackPressedDispatcher);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) objRememberedValue, composer, (BentoAppBarScope.$stable << 12) | ((i << 12) & 57344), 7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                public final void invoke(Composer composer5, int i8) {
                    if ((i8 & 3) == 2 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-248308055, i8, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable.<anonymous> (CryptoTransferHistoryComposable.kt:75)");
                    }
                    Function2<Composer, Integer, Unit> lambda$918746652$feature_crypto_transfer_externalDebug = CryptoTransferHistoryComposable.INSTANCE.getLambda$918746652$feature_crypto_transfer_externalDebug();
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1652187064, true, new AnonymousClass1(onBackPressedDispatcher), composer5, 54);
                    final SduiActionHandler<HistoryDetailAction> sduiActionHandler = cryptoTransferHistoryComposable62;
                    final SnapshotState4<CryptoTransferHistoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$918746652$feature_crypto_transfer_externalDebug, null, composableLambdaRememberComposableLambda, ComposableLambda3.rememberComposableLambda(89734599, true, new Function3<Row5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt.CryptoTransferHistoryComposable.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer6, Integer num) {
                            invoke(row5, composer6, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Row5 BentoAppBar, Composer composer6, int i9) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i9 & 17) == 16 && composer6.getSkipping()) {
                                composer6.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(89734599, i9, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable.<anonymous>.<anonymous> (CryptoTransferHistoryComposable.kt:80)");
                            }
                            SduiAppBarAction.SduiAppBarAction(CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$0(snapshotState4).getMobileMenuItem(), sduiActionHandler, null, composer6, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer5, 54), null, false, false, null, null, 0L, null, composer5, 3462, 0, 2034);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer4, 54), null, null, null, 0, bentoTheme.getColors(composer4, i7).m21371getBg0d7_KjU(), bentoTheme.getColors(composer4, i7).m21425getFg0d7_KjU(), null, ComposableLambda3.rememberComposableLambda(-781372418, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt.CryptoTransferHistoryComposable.2
                public final void invoke(PaddingValues paddingValues, Composer composer5, int i8) {
                    int i9;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i8 & 6) == 0) {
                        i9 = i8 | (composer5.changed(paddingValues) ? 4 : 2);
                    } else {
                        i9 = i8;
                    }
                    if ((i9 & 19) == 18 && composer5.getSkipping()) {
                        composer5.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-781372418, i9, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable.<anonymous> (CryptoTransferHistoryComposable.kt:84)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null), paddingValues);
                    Alignment center = CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle).isLoading() ? Alignment.INSTANCE.getCenter() : Alignment.INSTANCE.getTopStart();
                    SduiActionHandler<HistoryDetailAction> sduiActionHandler = cryptoTransferHistoryComposable62;
                    SnapshotState4<CryptoTransferHistoryViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, modifierPadding);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                    if (composer5.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer5.startReusableNode();
                    if (composer5.getInserting()) {
                        composer5.createNode(constructor);
                    } else {
                        composer5.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$0(snapshotState4).isLoading()) {
                        composer5.startReplaceGroup(2060790009);
                        LoadingScreenComposablesKt.ListLoadingScreenComposable(null, false, false, 0, composer5, 0, 15);
                        composer5.endReplaceGroup();
                    } else {
                        composer5.startReplaceGroup(2060872562);
                        ImmutableList<UIComponent<HistoryDetailAction>> components = CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$0(snapshotState4).getComponents();
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer5, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 7, null);
                        composer5.startReplaceGroup(767440808);
                        SduiColumns.SduiLazyColumn(components, HistoryDetailAction.class, modifierM5146paddingqDBjuR0$default, LazyListStateKt.rememberLazyListState(0, 0, composer5, 0, 3), null, sduiActionHandler, HorizontalPadding.Default, false, composer5, 12582912, 0);
                        composer5.endReplaceGroup();
                        composer5.endReplaceGroup();
                    }
                    composer5.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer5, Integer num) {
                    invoke(paddingValues, composer5, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer4, 54), composer4, (i6 & 14) | 805306416, 316);
            modifier4 = modifier5;
            composer3 = composer4;
            GenericAlertContent genericAlertContent = (GenericAlertContent) snapshotState.getValue();
            composer3.startReplaceGroup(-1087560431);
            if (genericAlertContent == null) {
                cryptoTransferHistoryComposable6 = cryptoTransferHistoryComposable62;
            } else {
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer3.startReplaceGroup(5004770);
                Object objRememberedValue6 = composer3.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$6$lambda$5$lambda$4(snapshotState);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue6);
                }
                composer3.endReplaceGroup();
                cryptoTransferHistoryComposable6 = cryptoTransferHistoryComposable62;
                sduiAlert.Dialog(genericAlertContent, cryptoTransferHistoryComposable6, null, (Function0) objRememberedValue6, composer3, (SduiAlert.$stable << 12) | 3072, 4);
                Unit unit = Unit.INSTANCE;
            }
            composer3.endReplaceGroup();
            final GenericAlertContent genericAlertContent2 = (GenericAlertContent) snapshotState2.getValue();
            if (genericAlertContent2 != null) {
                Object objRememberedValue7 = composer3.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composer3);
                    composer3.updateRememberedValue(objRememberedValue7);
                }
                final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue7;
                composer3.startReplaceGroup(1849434622);
                Object objRememberedValue8 = composer3.rememberedValue();
                if (objRememberedValue8 == companion.getEmpty()) {
                    objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Boolean.valueOf(CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$12$lambda$8$lambda$7((SheetValue) obj));
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue8);
                }
                composer3.endReplaceGroup();
                final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue8, composer3, 54, 0);
                composer3.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composer3.changedInstance(coroutineScope2) | composer3.changed(sheetStateRememberModalBottomSheetState);
                Object objRememberedValue9 = composer3.rememberedValue();
                if (zChangedInstance2 || objRememberedValue9 == companion.getEmpty()) {
                    objRememberedValue9 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$12$lambda$11$lambda$10(coroutineScope2, sheetStateRememberModalBottomSheetState, snapshotState2);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue9);
                }
                composer3.endReplaceGroup();
                GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue9, sheetStateRememberModalBottomSheetState, null, ComposableLambda3.rememberComposableLambda(1356834235, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$4$2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer5, Integer num) {
                        invoke(column5, composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer5, int i8) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i8 & 17) == 16 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1356834235, i8, -1, "com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposable.<anonymous>.<anonymous> (CryptoTransferHistoryComposable.kt:125)");
                        }
                        SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                        final GenericAlertContent<HistoryDetailAction> genericAlertContent3 = genericAlertContent2;
                        SduiActionHandler<HistoryDetailAction> sduiActionHandler = cryptoTransferHistoryComposable6;
                        int i9 = SduiAlert.$stable << 6;
                        composer5.startReplaceGroup(1847729312);
                        final Button button = (Button) genericAlertContent3.getAction_buttons().get(0);
                        final Button button2 = (Button) CollectionsKt.getOrNull(genericAlertContent3.getAction_buttons(), 1);
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$4$2$invoke$$inlined$AlertSheet$1
                            public final void invoke(Composer composer6, int i10) {
                                long jM21372getBg20d7_KjU;
                                String serverValue;
                                if ((i10 & 3) == 2 && composer6.getSkipping()) {
                                    composer6.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(925557249, i10, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                }
                                Pictogram pog = genericAlertContent3.getPog();
                                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                String title = genericAlertContent3.getTitle();
                                final String body_markdown = genericAlertContent3.getBody_markdown();
                                final List body_components = genericAlertContent3.getBody_components();
                                SduiAlert sduiAlert3 = SduiAlert.INSTANCE;
                                BentoAlertButton alertButton = sduiAlert3.toAlertButton(button, null, composer6, 0, 1);
                                Button button3 = button2;
                                composer6.startReplaceGroup(402298512);
                                BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert3.toAlertButton(button3, null, composer6, 0, 1);
                                composer6.endReplaceGroup();
                                int i11 = BentoAlertButton.$stable;
                                int i12 = (i11 << 9) | (i11 << 12);
                                composer6.startReplaceGroup(221388998);
                                final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$CryptoTransferHistoryComposable$4$2$invoke$$inlined$AlertSheet$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer7, Integer num) {
                                        invoke(composer7, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer7, int i13) {
                                        if ((i13 & 3) == 2 && composer7.getSkipping()) {
                                            composer7.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1694075195, i13, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                        }
                                        Alignment.Companion companion2 = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
                                        String str = body_markdown;
                                        int i14 = iM7919getCentere0LSkKk;
                                        List list = body_components;
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer7, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer7, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer7.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer7, companion3);
                                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                        if (composer7.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer7.startReusableNode();
                                        if (composer7.getInserting()) {
                                            composer7.createNode(constructor);
                                        } else {
                                            composer7.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer7);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer7.startReplaceGroup(1390346787);
                                        if (str.length() > 0) {
                                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i14, composer7, 0, 0);
                                        }
                                        composer7.endReplaceGroup();
                                        composer7.startReplaceGroup(1390351170);
                                        if (list != null) {
                                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                            composer7.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(persistentList, HistoryDetailAction.class, companion3, null, null, horizontalPadding, arrangement.getTop(), companion2.getStart(), true, composer7, 100859904, 0);
                                            composer7.endReplaceGroup();
                                        }
                                        composer7.endReplaceGroup();
                                        composer7.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer6, 54);
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                int i13 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion2, bentoTheme2.getColors(composer6, i13).m21371getBg0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer6, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer6.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer6, modifierM4872backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer6.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer6.startReusableNode();
                                if (composer6.getInserting()) {
                                    composer6.createNode(constructor);
                                } else {
                                    composer6.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer6);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion2, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                                if (bentoTheme2.getColors(composer6, i13).getIsDay()) {
                                    composer6.startReplaceGroup(-2071673393);
                                    jM21372getBg20d7_KjU = bentoTheme2.getColors(composer6, i13).getJet();
                                } else {
                                    composer6.startReplaceGroup(-2071672529);
                                    jM21372getBg20d7_KjU = bentoTheme2.getColors(composer6, i13).m21372getBg20d7_KjU();
                                }
                                composer6.endReplaceGroup();
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer6, 0);
                                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer6, ((i12 >> 12) & 112) | 1572864 | ((i12 << 6) & 896) | (i11 << 12), 41);
                                composer6.endNode();
                                composer6.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer6, Integer num) {
                                invoke(composer6, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer5, 54), composer5, ((i9 >> 3) & 14) | 48);
                        composer5.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer3, 54), composer3, 3072, 4);
                composer3 = composer3;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            cryptoTransferHistoryDuxo2 = cryptoTransferHistoryDuxo3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferHistoryComposable3.CryptoTransferHistoryComposable$lambda$13(modifier4, cryptoTransferHistoryDuxo2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoTransferHistoryViewState CryptoTransferHistoryComposable$lambda$0(SnapshotState4<CryptoTransferHistoryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferHistoryComposable$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferHistoryComposable$lambda$12$lambda$11$lambda$10(CoroutineScope coroutineScope, SheetState sheetState, final SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoTransferHistoryComposable4(sheetState, null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.shared.crypto.transfer.history.CryptoTransferHistoryComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoTransferHistoryComposable3.m2780xfc2e1a20(snapshotState, (Throwable) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoTransferHistoryComposable$lambda$12$lambda$11$lambda$10$lambda$9 */
    public static final Unit m2780xfc2e1a20(SnapshotState snapshotState, Throwable th) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
