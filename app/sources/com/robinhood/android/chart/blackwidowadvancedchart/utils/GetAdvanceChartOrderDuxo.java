package com.robinhood.android.chart.blackwidowadvancedchart.utils;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.chart.blackwidowadvancedchart.duxo.AdvanceChartOrderDuxo;
import com.robinhood.android.chart.cryptoadvancedchart.CryptoAdvanceChartOrderDuxo;
import com.robinhood.android.chart.equityadvancedchart.EquityAdvanceChartOrderDuxo;
import com.robinhood.android.chart.futuresadvancedchart.FuturesAdvanceChartOrderDuxo;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: GetAdvanceChartOrderDuxo.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"getAdvanceChartOrderDuxo", "Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderDuxo;", "accountNumber", "", "instrumentId", "Ljava/util/UUID;", "instrumentType", "Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/shared/chart/contracts/advancedChart/BwAdvanceChartInstrumentType;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/chart/blackwidowadvancedchart/duxo/AdvanceChartOrderDuxo;", "feature-black-widow-advanced-chart_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GetAdvanceChartOrderDuxo {

    /* compiled from: GetAdvanceChartOrderDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BlackWidowAdvancedChartFragmentKey2.values().length];
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.FUTURES_CONTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.FUTURES_PRODUCT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BlackWidowAdvancedChartFragmentKey2.CRYPTO.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final AdvanceChartOrderDuxo<?, ?> getAdvanceChartOrderDuxo(final String str, final UUID instrumentId, BlackWidowAdvancedChartFragmentKey2 instrumentType, Composer composer, int i) {
        AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(instrumentType, "instrumentType");
        composer.startReplaceGroup(1601389330);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1601389330, i, -1, "com.robinhood.android.chart.blackwidowadvancedchart.utils.getAdvanceChartOrderDuxo (GetAdvanceChartOrderDuxo.kt:17)");
        }
        int i2 = WhenMappings.$EnumSwitchMapping$0[instrumentType.ordinal()];
        boolean z = true;
        if (i2 == 1) {
            composer.startReplaceGroup(1336862686);
            String str2 = "EquityAdvanceChartOrderDuxo: " + instrumentId;
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(EquityAdvanceChartOrderDuxo.class), current, str2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
            final Lifecycle lifecycle = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(baseDuxo) | composer.changedInstance(lifecycle);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$1
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                        lifecycle.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle2 = lifecycle;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$1.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle2.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer, 0);
            composer.endReplaceGroup();
            advanceChartOrderDuxo = (EquityAdvanceChartOrderDuxo) baseDuxo;
            composer.endReplaceGroup();
        } else if (i2 == 2) {
            composer.startReplaceGroup(1336868032);
            String str3 = "FuturesAdvanceChartOrderDuxo: " + instrumentId;
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current2 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current2 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory2 = DuxosKt.createViewModelFactory(current2, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel2 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FuturesAdvanceChartOrderDuxo.class), current2, str3, factoryCreateViewModelFactory2, current2 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current2).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo2 = (BaseDuxo) viewModel2;
            final Lifecycle lifecycle2 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance2 = composer.changedInstance(baseDuxo2) | composer.changedInstance(lifecycle2);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$2
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo2);
                        lifecycle2.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle3 = lifecycle2;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$2.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle3.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composer, 0);
            composer.endReplaceGroup();
            advanceChartOrderDuxo = (FuturesAdvanceChartOrderDuxo) baseDuxo2;
            composer.endReplaceGroup();
        } else if (i2 == 3) {
            composer.startReplaceGroup(1336875488);
            String str4 = "FuturesAdvanceChartOrderDuxo: " + instrumentId;
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current3 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current3 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory3 = DuxosKt.createViewModelFactory(current3, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel3 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(FuturesAdvanceChartOrderDuxo.class), current3, str4, factoryCreateViewModelFactory3, current3 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current3).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo3 = (BaseDuxo) viewModel3;
            final Lifecycle lifecycle3 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(baseDuxo3) | composer.changedInstance(lifecycle3);
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$3
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo3);
                        lifecycle3.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle4 = lifecycle3;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$3.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle4.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle3, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composer, 0);
            composer.endReplaceGroup();
            advanceChartOrderDuxo = (FuturesAdvanceChartOrderDuxo) baseDuxo3;
            composer.endReplaceGroup();
        } else {
            if (i2 != 4) {
                composer.startReplaceGroup(1336861050);
                composer.endReplaceGroup();
                throw new NoWhenBranchMatchedException();
            }
            composer.startReplaceGroup(1336880574);
            String str5 = "CryptoAdvanceChartOrderDuxo: " + instrumentId;
            composer.startReplaceGroup(-747520797);
            ViewModelStoreOwner current4 = LocalViewModelStoreOwner.INSTANCE.getCurrent(composer, LocalViewModelStoreOwner.$stable);
            if (current4 == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            ViewModelProvider.Factory factoryCreateViewModelFactory4 = DuxosKt.createViewModelFactory(current4, composer, 0);
            composer.startReplaceableGroup(1729797275);
            ViewModel viewModel4 = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(CryptoAdvanceChartOrderDuxo.class), current4, str5, factoryCreateViewModelFactory4, current4 instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current4).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composer, 0, 0);
            composer.endReplaceableGroup();
            final BaseDuxo baseDuxo4 = (BaseDuxo) viewModel4;
            final Lifecycle lifecycle4 = ((LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance4 = composer.changedInstance(baseDuxo4) | composer.changedInstance(lifecycle4);
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$4
                    @Override // kotlin.jvm.functions.Function1
                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo4);
                        lifecycle4.addObserver(duxoLifecycleObserver);
                        final Lifecycle lifecycle5 = lifecycle4;
                        return new DisposableEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$$inlined$duxo$4.1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                lifecycle5.removeObserver(duxoLifecycleObserver);
                            }
                        };
                    }
                };
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.DisposableEffect(lifecycle4, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer, 0);
            composer.endReplaceGroup();
            advanceChartOrderDuxo = (CryptoAdvanceChartOrderDuxo) baseDuxo4;
            composer.endReplaceGroup();
        }
        final AdvanceChartOrderDuxo<?, ?> advanceChartOrderDuxo2 = advanceChartOrderDuxo;
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance5 = composer.changedInstance(advanceChartOrderDuxo2);
        if ((((i & 14) ^ 6) <= 4 || !composer.changed(str)) && (i & 6) != 4) {
            z = false;
        }
        boolean zChangedInstance6 = zChangedInstance5 | z | composer.changedInstance(instrumentId);
        Object objRememberedValue5 = composer.rememberedValue();
        if (zChangedInstance6 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return GetAdvanceChartOrderDuxo.getAdvanceChartOrderDuxo$lambda$2$lambda$1(advanceChartOrderDuxo2, str, instrumentId, (LifecycleResumePauseEffectScope) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        composer.endReplaceGroup();
        LifecycleEffectKt.LifecycleResumeEffect(str, instrumentId, null, (Function1) objRememberedValue5, composer, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return advanceChartOrderDuxo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult getAdvanceChartOrderDuxo$lambda$2$lambda$1(AdvanceChartOrderDuxo advanceChartOrderDuxo, String str, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = advanceChartOrderDuxo.bind(str, uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.chart.blackwidowadvancedchart.utils.GetAdvanceChartOrderDuxoKt$getAdvanceChartOrderDuxo$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }
}
