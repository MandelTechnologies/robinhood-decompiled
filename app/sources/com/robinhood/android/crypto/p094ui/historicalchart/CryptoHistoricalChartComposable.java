package com.robinhood.android.crypto.p094ui.historicalchart;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
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
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.theme.BentoTheme4;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartComposable2;
import com.robinhood.shared.crypto.charts.p374ui.HistoricalChartState;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlin.reflect.KFunction;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoHistoricalChartComposable.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aW\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"CryptoHistoricalChartComposable", "", "currencyPairId", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "onPageDirection", "Lkotlin/Function1;", "Lcom/robinhood/compose/bento/theme/Direction;", "onPriceString", "", "duxo", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo;", "(Ljava/util/UUID;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-crypto_externalDebug", "viewState", "Lcom/robinhood/android/crypto/ui/historicalchart/CryptoHistoricalChartViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoHistoricalChartComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartComposable$lambda$12(UUID uuid, Modifier modifier, Function1 function1, Function1 function12, CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, int i, int i2, Composer composer, int i3) {
        CryptoHistoricalChartComposable(uuid, modifier, function1, function12, cryptoHistoricalChartDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartComposable$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0104  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoHistoricalChartComposable(final UUID currencyPairId, Modifier modifier, Function1<? super BentoTheme4, Unit> function1, Function1<? super String, Unit> function12, CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super BentoTheme4, Unit> function13;
        int i5;
        Function1<? super String, Unit> function14;
        CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo2;
        Modifier modifier3;
        Function1<? super BentoTheme4, Unit> function15;
        Function1<? super String, Unit> function16;
        int i6;
        int i7;
        final CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo3;
        final EventLogger current;
        final UserInteractionEventDescriptor userInteractionEventDescriptor;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChangedInstance;
        Object objRememberedValue;
        Continuation continuation;
        boolean zChanged;
        Object objRememberedValue2;
        boolean zChangedInstance2;
        Object objRememberedValue3;
        boolean zChangedInstance3;
        Object objRememberedValue4;
        boolean zChangedInstance4;
        Object objRememberedValue5;
        final Function1<? super BentoTheme4, Unit> function17;
        final Function1<? super String, Unit> function18;
        final CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
        Composer composerStartRestartGroup = composer.startRestartGroup(1331550478);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(currencyPairId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    function13 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        function14 = function12;
                        i3 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
                    }
                    if ((i & 24576) != 0) {
                        if ((i2 & 16) == 0) {
                            cryptoHistoricalChartDuxo2 = cryptoHistoricalChartDuxo;
                            int i9 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo2) ? 16384 : 8192;
                            i3 |= i9;
                        } else {
                            cryptoHistoricalChartDuxo2 = cryptoHistoricalChartDuxo;
                        }
                        i3 |= i9;
                    } else {
                        cryptoHistoricalChartDuxo2 = cryptoHistoricalChartDuxo;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            modifier3 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            function15 = i4 == 0 ? null : function13;
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$1$lambda$0((String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                }
                                function16 = (Function1) objRememberedValue6;
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                function16 = function14;
                            }
                            if ((i2 & 16) == 0) {
                                composerStartRestartGroup.startReplaceGroup(-747520797);
                                ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                                if (current2 == null) {
                                    throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                                }
                                ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current2, composerStartRestartGroup, 0);
                                composerStartRestartGroup.startReplaceableGroup(1729797275);
                                i6 = -1633490746;
                                ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoHistoricalChartDuxo.class), current2, (String) null, factoryCreateViewModelFactory, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                                composerStartRestartGroup.endReplaceableGroup();
                                final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                                final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                                composerStartRestartGroup.startReplaceGroup(-1633490746);
                                boolean zChangedInstance5 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (zChangedInstance5 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue7 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$CryptoHistoricalChartComposable$$inlined$duxo$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                            Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                            final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                            lifecycle.addObserver(duxoLifecycleObserver);
                                            final Lifecycle lifecycle2 = lifecycle;
                                            return new DisposableEffectResult() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$CryptoHistoricalChartComposable$$inlined$duxo$1.1
                                                @Override // androidx.compose.runtime.DisposableEffectResult
                                                public void dispose() {
                                                    lifecycle2.removeObserver(duxoLifecycleObserver);
                                                }
                                            };
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composerStartRestartGroup, 0);
                                composerStartRestartGroup.endReplaceGroup();
                                i7 = i3 & (-57345);
                                cryptoHistoricalChartDuxo3 = (CryptoHistoricalChartDuxo) baseDuxo;
                            }
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1331550478, i7, -1, "com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposable (CryptoHistoricalChartComposable.kt:23)");
                            }
                            current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                            userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                            snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistoricalChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            composerStartRestartGroup.startReplaceGroup(i6);
                            zChangedInstance = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                continuation = null;
                                objRememberedValue = new CryptoHistoricalChartComposable2(cryptoHistoricalChartDuxo3, currencyPairId, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            } else {
                                continuation = null;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7 & 14);
                            composerStartRestartGroup.startReplaceGroup(-280226425);
                            if (function15 != null) {
                                BentoTheme4 themeDirection = CryptoHistoricalChartComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getChartState().getThemeDirection();
                                composerStartRestartGroup.startReplaceGroup(i6);
                                boolean zChanged2 = composerStartRestartGroup.changed(function15) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                                Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                                if (zChanged2 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue8 = new CryptoHistoricalChartComposable3(function15, snapshotState4CollectAsStateWithLifecycle, continuation);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(themeDirection, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, 0);
                                Unit unit = Unit.INSTANCE;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            String headerString = CryptoHistoricalChartComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getHeaderString();
                            composerStartRestartGroup.startReplaceGroup(i6);
                            zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i7 & 7168) != 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new CryptoHistoricalChartComposable4(snapshotState4CollectAsStateWithLifecycle, function16, continuation);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(headerString, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                            HistoricalChartState chartState = CryptoHistoricalChartComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getChartState();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new CryptoHistoricalChartComposable5(cryptoHistoricalChartDuxo3);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            KFunction kFunction = (KFunction) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier3;
                            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier5, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.PRICE_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$9$lambda$8(current, userInteractionEventDescriptor, cryptoHistoricalChartDuxo3, (DisplaySpan) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            Function1 function19 = (Function1) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            Function1 function110 = (Function1) kFunction;
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance4 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance4 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$11$lambda$10(cryptoHistoricalChartDuxo3, snapshotState4CollectAsStateWithLifecycle);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup = composerStartRestartGroup;
                            HistoricalChartComposable2.HistoricalChartComposable(chartState, function19, function110, (Function0) objRememberedValue5, modifierAutoLogEvents$default, composerStartRestartGroup, HistoricalChartState.$stable, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function17 = function15;
                            function18 = function16;
                            cryptoHistoricalChartDuxo4 = cryptoHistoricalChartDuxo3;
                            modifier4 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            modifier3 = modifier2;
                            function15 = function13;
                            function16 = function14;
                        }
                        i6 = -1633490746;
                        i7 = i3;
                        cryptoHistoricalChartDuxo3 = cryptoHistoricalChartDuxo2;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistoricalChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(i6);
                        zChangedInstance = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                            continuation = null;
                            objRememberedValue = new CryptoHistoricalChartComposable2(cryptoHistoricalChartDuxo3, currencyPairId, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(currencyPairId, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7 & 14);
                            composerStartRestartGroup.startReplaceGroup(-280226425);
                            if (function15 != null) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            String headerString2 = CryptoHistoricalChartComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getHeaderString();
                            composerStartRestartGroup.startReplaceGroup(i6);
                            zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i7 & 7168) != 2048);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue2 = new CryptoHistoricalChartComposable4(snapshotState4CollectAsStateWithLifecycle, function16, continuation);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(headerString2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
                                HistoricalChartState chartState2 = CryptoHistoricalChartComposable$lambda$2(snapshotState4CollectAsStateWithLifecycle).getChartState();
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChangedInstance2 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (!zChangedInstance2) {
                                    objRememberedValue3 = new CryptoHistoricalChartComposable5(cryptoHistoricalChartDuxo3);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                    KFunction kFunction2 = (KFunction) objRememberedValue3;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Modifier modifier52 = modifier3;
                                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier52, UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, null, null, new Component(Component.ComponentType.PRICE_CHART, null, null, 6, null), null, 47, null), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                                    zChangedInstance3 = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3);
                                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                    if (!zChangedInstance3) {
                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$9$lambda$8(current, userInteractionEventDescriptor, cryptoHistoricalChartDuxo3, (DisplaySpan) obj);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                        Function1 function192 = (Function1) objRememberedValue4;
                                        composerStartRestartGroup.endReplaceGroup();
                                        Function1 function1102 = (Function1) kFunction2;
                                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                                        zChangedInstance4 = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3) | composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle);
                                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                        if (!zChangedInstance4) {
                                            objRememberedValue5 = new Function0() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda2
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$11$lambda$10(cryptoHistoricalChartDuxo3, snapshotState4CollectAsStateWithLifecycle);
                                                }
                                            };
                                            composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                            composerStartRestartGroup.endReplaceGroup();
                                            composerStartRestartGroup = composerStartRestartGroup;
                                            HistoricalChartComposable2.HistoricalChartComposable(chartState2, function192, function1102, (Function0) objRememberedValue5, modifierAutoLogEvents$default2, composerStartRestartGroup, HistoricalChartState.$stable, 0);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            function17 = function15;
                                            function18 = function16;
                                            cryptoHistoricalChartDuxo4 = cryptoHistoricalChartDuxo3;
                                            modifier4 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier4 = modifier2;
                        function17 = function13;
                        function18 = function14;
                        cryptoHistoricalChartDuxo4 = cryptoHistoricalChartDuxo2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.historicalchart.CryptoHistoricalChartComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoHistoricalChartComposable.CryptoHistoricalChartComposable$lambda$12(currencyPairId, modifier4, function17, function18, cryptoHistoricalChartDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                function14 = function12;
                if ((i & 24576) != 0) {
                }
                if ((i3 & 9363) == 9362) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if ((i2 & 16) == 0) {
                            i6 = -1633490746;
                            i7 = i3;
                            cryptoHistoricalChartDuxo3 = cryptoHistoricalChartDuxo2;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                        userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(cryptoHistoricalChartDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup.startReplaceGroup(i6);
                        zChangedInstance = composerStartRestartGroup.changedInstance(cryptoHistoricalChartDuxo3) | composerStartRestartGroup.changedInstance(currencyPairId);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance) {
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function13 = function1;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            function14 = function12;
            if ((i & 24576) != 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        function13 = function1;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        function14 = function12;
        if ((i & 24576) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartComposable$lambda$9$lambda$8(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, DisplaySpan it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, userInteractionEventDescriptor.getScreen(), new Component(Component.ComponentType.SPAN_SELECTOR, it.name(), null, 4, null), null, null, false, 57, null);
        cryptoHistoricalChartDuxo.onSpanSelected$feature_crypto_externalDebug(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoHistoricalChartComposable$lambda$11$lambda$10(CryptoHistoricalChartDuxo cryptoHistoricalChartDuxo, SnapshotState4 snapshotState4) {
        cryptoHistoricalChartDuxo.toggleChartMode(CryptoHistoricalChartComposable$lambda$2(snapshotState4).getChartState().getChartMode());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CryptoHistoricalChartViewState CryptoHistoricalChartComposable$lambda$2(SnapshotState4<CryptoHistoricalChartViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
