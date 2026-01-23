package com.robinhood.android.crypto.p094ui.historicalchart.compat;

import android.content.Context;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.core.os.Bundle2;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.CreationExtras2;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.robinhood.android.crypto.p094ui.historicalchart.compat.CryptoHistoricalChartCompatDuxo;
import com.robinhood.android.crypto.p094ui.view.CryptoHistoricalGraphLayout;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.graph.GraphLayout;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.hammer.android.viewmodel.HammerViewModelFactory3;
import com.robinhood.models.crypto.p314db.CryptoQuote;
import com.robinhood.models.crypto.p315ui.UiCryptoHistorical;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p355ui.DataPoint;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.utils.extensions.ObservablesKt;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHistoricalChartCompatComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aA\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"CryptoHistoricalChartCompatComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "onPageDirection", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/theme/Direction;", "duxo", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/historicalchart/compat/CryptoHistoricalChartCompatViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHistoricalChartCompatComposable {

    /* compiled from: CryptoHistoricalChartCompatComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DirectionOverlay.values().length];
            try {
                iArr[DirectionOverlay.POSITIVE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DirectionOverlay.NEGATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartCompatComposable$lambda$8(UUID uuid, Modifier modifier, Function1 function1, CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHistoricalChartCompatComposable(uuid, modifier, function1, cryptoHistoricalChartCompatDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHistoricalChartCompatComposable(final UUID currencyPairId, Modifier modifier, Function1<? super BentoTheme4, Unit> function1, CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super BentoTheme4, Unit> function12;
        CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo2;
        Modifier modifier3;
        final Function1<? super BentoTheme4, Unit> function13;
        Composer composer2;
        int i5;
        final CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo3;
        CreationExtras defaultViewModelCreationExtras;
        Composer composer3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        final View view;
        boolean zChangedInstance;
        Object objRememberedValue;
        boolean zChanged;
        Object objRememberedValue2;
        Composer composer4;
        final Function1<? super BentoTheme4, Unit> function14;
        final CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1852994377);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        cryptoHistoricalChartCompatDuxo2 = cryptoHistoricalChartCompatDuxo;
                        int i7 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartCompatDuxo2) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        cryptoHistoricalChartCompatDuxo2 = cryptoHistoricalChartCompatDuxo;
                    }
                    i3 |= i7;
                } else {
                    cryptoHistoricalChartCompatDuxo2 = cryptoHistoricalChartCompatDuxo;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        function13 = i4 == 0 ? null : function12;
                        if ((i2 & 8) == 0) {
                            CryptoHistoricalChartCompatDuxo.InitArgs initArgs = new CryptoHistoricalChartCompatDuxo.InitArgs(currencyPairId);
                            composerStartRestartGroup.startReplaceGroup(2050738472);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            if (current instanceof HasDefaultViewModelProviderFactory) {
                                defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                            } else {
                                defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                            }
                            CreationExtras2 creationExtras2 = new CreationExtras2(defaultViewModelCreationExtras);
                            creationExtras2.set(HammerViewModelFactory3.getDUXO_INIT_ARG_KEY(), Bundle2.bundleOf(Tuples4.m3642to(HammerViewModelFactory3.CREATION_INIT_ARG_KEY, initArgs)));
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            composer2 = composerStartRestartGroup;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHistoricalChartCompatDuxo.class), current, (String) null, factoryCreateViewModelFactory, creationExtras2, composer2, 0, 0);
                            composer2.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composer2.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                            Object objRememberedValue3 = composer2.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$CryptoHistoricalChartCompatComposable$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$CryptoHistoricalChartCompatComposable$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer2, 0);
                            composer2.endReplaceGroup();
                            i5 = i3 & (-7169);
                            cryptoHistoricalChartCompatDuxo3 = (CryptoHistoricalChartCompatDuxo) baseDuxo;
                        } else {
                            composer2 = composerStartRestartGroup;
                            i5 = i3;
                            cryptoHistoricalChartCompatDuxo3 = cryptoHistoricalChartCompatDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i5 = i3;
                        modifier3 = modifier2;
                        function13 = function12;
                        cryptoHistoricalChartCompatDuxo3 = cryptoHistoricalChartCompatDuxo2;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1852994377, i5, -1, "com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposable (CryptoHistoricalChartCompatComposable.kt:32)");
                    }
                    composer3 = composer2;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistoricalChartCompatDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    view = (View) composer3.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    composer3.startReplaceGroup(-1746271574);
                    zChangedInstance = composer3.changedInstance(view) | ((i5 & 896) == 256) | composer3.changedInstance(cryptoHistoricalChartCompatDuxo3);
                    objRememberedValue = composer3.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable$lambda$4$lambda$3(view, cryptoHistoricalChartCompatDuxo3, function13, (Context) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                    }
                    Function1 function15 = (Function1) objRememberedValue;
                    composer3.endReplaceGroup();
                    composer3.startReplaceGroup(5004770);
                    zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable$lambda$7$lambda$6(snapshotState4CollectAsStateWithLifecycle, (CryptoHistoricalGraphLayout) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                    }
                    composer3.endReplaceGroup();
                    Modifier modifier5 = modifier3;
                    AndroidView_androidKt.AndroidView(function15, modifier5, (Function1) objRememberedValue2, composer3, i5 & 112, 0);
                    composer4 = composer3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function13;
                    cryptoHistoricalChartCompatDuxo4 = cryptoHistoricalChartCompatDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    function14 = function12;
                    cryptoHistoricalChartCompatDuxo4 = cryptoHistoricalChartCompatDuxo2;
                    composer4 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable$lambda$8(currencyPairId, modifier4, function14, cryptoHistoricalChartCompatDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function12 = function1;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) != 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    composer2.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composer3 = composer2;
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistoricalChartCompatDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                    view = (View) composer3.consume(AndroidCompositionLocals_androidKt.getLocalView());
                    composer3.startReplaceGroup(-1746271574);
                    zChangedInstance = composer3.changedInstance(view) | ((i5 & 896) == 256) | composer3.changedInstance(cryptoHistoricalChartCompatDuxo3);
                    objRememberedValue = composer3.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable$lambda$4$lambda$3(view, cryptoHistoricalChartCompatDuxo3, function13, (Context) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue);
                        Function1 function152 = (Function1) objRememberedValue;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(5004770);
                        zChanged = composer3.changed(snapshotState4CollectAsStateWithLifecycle);
                        objRememberedValue2 = composer3.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoHistoricalChartCompatComposable.CryptoHistoricalChartCompatComposable$lambda$7$lambda$6(snapshotState4CollectAsStateWithLifecycle, (CryptoHistoricalGraphLayout) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue2);
                            composer3.endReplaceGroup();
                            Modifier modifier52 = modifier3;
                            AndroidView_androidKt.AndroidView(function152, modifier52, (Function1) objRememberedValue2, composer3, i5 & 112, 0);
                            composer4 = composer3;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            function14 = function13;
                            cryptoHistoricalChartCompatDuxo4 = cryptoHistoricalChartCompatDuxo3;
                            modifier4 = modifier52;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHistoricalGraphLayout CryptoHistoricalChartCompatComposable$lambda$4$lambda$3(View view, CryptoHistoricalChartCompatDuxo cryptoHistoricalChartCompatDuxo, final Function1 function1, Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        final CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout = new CryptoHistoricalGraphLayout(new ScarletContextWrapper(context, null, null, 6, null));
        GraphLayout.setCandlestickChartEnabled$default(cryptoHistoricalGraphLayout, true, false, 2, null);
        ViewDisposerKt.bindTo$default(ObservablesKt.filterIsPresent(cryptoHistoricalGraphLayout.getOptionalDirectionStyleObservable()), view, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.compat.CryptoHistoricalChartCompatComposableKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoHistoricalChartCompatComposable.m1912x5f560220(cryptoHistoricalGraphLayout, function1, (DirectionOverlay) obj);
            }
        });
        ViewDisposerKt.bindTo$default(cryptoHistoricalGraphLayout.getGraphSelectionChangedObservable(), view, false, 2, null).subscribeKotlin(new CryptoHistoricalChartCompatComposable2(cryptoHistoricalChartCompatDuxo));
        return cryptoHistoricalGraphLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoHistoricalChartCompatComposable$lambda$4$lambda$3$lambda$2$lambda$1 */
    public static final Unit m1912x5f560220(CryptoHistoricalGraphLayout cryptoHistoricalGraphLayout, Function1 function1, DirectionOverlay overlay) {
        BentoTheme4 bentoTheme4;
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(cryptoHistoricalGraphLayout), overlay, null, 2, null);
        if (function1 != null) {
            int i = WhenMappings.$EnumSwitchMapping$0[overlay.ordinal()];
            if (i == 1) {
                bentoTheme4 = BentoTheme4.POSITIVE;
            } else {
                if (i != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                bentoTheme4 = BentoTheme4.NEGATIVE;
            }
            function1.invoke(bentoTheme4);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartCompatComposable$lambda$7$lambda$6(SnapshotState4 snapshotState4, CryptoHistoricalGraphLayout view) {
        Intrinsics.checkNotNullParameter(view, "view");
        UiCurrencyPair uiCurrencyPair = CryptoHistoricalChartCompatComposable$lambda$0(snapshotState4).getUiCurrencyPair();
        UiCryptoHistorical cryptoHistorical = CryptoHistoricalChartCompatComposable$lambda$0(snapshotState4).getCryptoHistorical();
        ImmutableList<DataPoint.Asset> dataPoints = CryptoHistoricalChartCompatComposable$lambda$0(snapshotState4).getDataPoints();
        CryptoQuote cryptoQuote = CryptoHistoricalChartCompatComposable$lambda$0(snapshotState4).getCryptoQuote();
        if (uiCurrencyPair != null) {
            view.updatePriceFormatter(uiCurrencyPair);
        }
        if (uiCurrencyPair != null && cryptoHistorical != null && dataPoints != null) {
            view.updateData(uiCurrencyPair, cryptoHistorical, dataPoints, cryptoQuote);
        }
        return Unit.INSTANCE;
    }

    private static final CryptoHistoricalChartCompatViewState CryptoHistoricalChartCompatComposable$lambda$0(SnapshotState4<CryptoHistoricalChartCompatViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
