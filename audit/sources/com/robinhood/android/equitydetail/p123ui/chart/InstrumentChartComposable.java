package com.robinhood.android.equitydetail.p123ui.chart;

import android.content.Context;
import android.content.Intent;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.compose.FlowExtKt;
import androidx.lifecycle.compose.LifecycleEffectKt;
import androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult;
import androidx.lifecycle.compose.LifecycleResumePauseEffectScope;
import androidx.lifecycle.compose.LocalLifecycleOwnerKt;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner;
import androidx.lifecycle.viewmodel.compose.ViewModelKt;
import androidx.view.compose.ActivityResultRegistry3;
import androidx.view.compose.ActivityResultRegistry8;
import androidx.view.result.ActivityResult;
import androidx.view.result.contract.ActivityResultContracts$StartActivityForResult;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.charts.util.GraphSelection2;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFlowType;
import com.robinhood.android.cortex.contracts.AssetDigestOnboardingFragmentKey;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.compose.LocalEducationTourScreen;
import com.robinhood.android.engagement.l2improvements.experiments.GoldL2SdpEntrypointExperiment;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartComposable;
import com.robinhood.android.gold.contracts.GoldFeature;
import com.robinhood.android.gold.contracts.GoldUpgradeIntentKey;
import com.robinhood.android.gold.contracts.Level2MarketDataFragmentKey;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.regiongate.compose.LocalityProvider;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.p320db.bonfire.instrument.SduiInstrumentChart;
import com.robinhood.models.p355ui.GraphSelection;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.models.subscription.p352db.MarginSubscription;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.chart.contracts.advancedChart.AdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartFragmentKey2;
import com.robinhood.shared.chart.contracts.advancedChart.BlackWidowAdvancedChartNuxFragmentKey;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.Job;

/* compiled from: InstrumentChartComposable.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u00072\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00010\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u001a\u0010\u0010\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001aD\u0010\u0013\u001a\u00020\u00142\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dH\u0002\u001aD\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\"H\u0002¨\u0006#²\u0006\n\u0010$\u001a\u00020\u0018X\u008a\u008e\u0002"}, m3636d2 = {"InstrumentChartComposable", "", "instrumentId", "Ljava/util/UUID;", "accountNumber", "", "onSpanChanged", "Lkotlin/Function1;", "onLaunchEducationTour", "Lkotlin/Function2;", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo;", "(Ljava/util/UUID;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equitydetail/ui/chart/InstrumentChartDuxo;Landroidx/compose/runtime/Composer;II)V", "logAdvancedChartButtonTapped", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "onAdvancedChartExpandButtonTapped", "Landroid/content/Intent;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "isInBlackWidowAdvancedChartExperiment", "", "graphSelection", "Lcom/robinhood/models/ui/GraphSelection;", "hasVisitedBwChart", "context", "Landroid/content/Context;", "onPriceBookClicked", "subscription", "Lcom/robinhood/models/subscription/db/MarginSubscription;", "goldL2SdpEntrypointVariant", "Lcom/robinhood/android/engagement/l2improvements/experiments/GoldL2SdpEntrypointExperiment$Variant;", "feature-equity-detail_externalDebug", "showChartSettings"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class InstrumentChartComposable {

    /* compiled from: InstrumentChartComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GoldL2SdpEntrypointExperiment.Variant.values().length];
            try {
                iArr[GoldL2SdpEntrypointExperiment.Variant.MEMBER2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GoldL2SdpEntrypointExperiment.Variant.MEMBER3.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChartComposable$lambda$9(UUID uuid, String str, Function1 function1, Function2 function2, Modifier modifier, InstrumentChartDuxo instrumentChartDuxo, int i, int i2, Composer composer, int i3) {
        InstrumentChartComposable(uuid, str, function1, function2, modifier, instrumentChartDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00ff  */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v4 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InstrumentChartComposable(final UUID instrumentId, final String str, final Function1<? super String, Unit> onSpanChanged, final Function2<? super String, ? super Function0<Unit>, Unit> onLaunchEducationTour, Modifier modifier, InstrumentChartDuxo instrumentChartDuxo, Composer composer, final int i, final int i2) {
        int i3;
        String str2;
        final Modifier modifier2;
        final InstrumentChartDuxo instrumentChartDuxo2;
        Composer composer2;
        int i4;
        ?? r11;
        int i5;
        Modifier modifier3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Composer composer3;
        boolean zChangedInstance2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Composer composer4;
        final InstrumentChartDuxo instrumentChartDuxo3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(onSpanChanged, "onSpanChanged");
        Intrinsics.checkNotNullParameter(onLaunchEducationTour, "onLaunchEducationTour");
        Composer composerStartRestartGroup = composer.startRestartGroup(88942127);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(instrumentId) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSpanChanged) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onLaunchEducationTour) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((196608 & i) != 0) {
                if ((i2 & 32) == 0) {
                    instrumentChartDuxo2 = instrumentChartDuxo;
                    int i7 = composerStartRestartGroup.changedInstance(instrumentChartDuxo2) ? 131072 : 65536;
                    i3 |= i7;
                } else {
                    instrumentChartDuxo2 = instrumentChartDuxo;
                }
                i3 |= i7;
            } else {
                instrumentChartDuxo2 = instrumentChartDuxo;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 32) == 0) {
                        String str3 = instrumentId + "_InstrumentChartView";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        i4 = -1633490746;
                        r11 = 0;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(InstrumentChartDuxo.class), current, str3, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue4 = composer2.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue4);
                        }
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue4, composer2, 0);
                        composer2.endReplaceGroup();
                        i5 = i3 & (-458753);
                        modifier3 = modifier4;
                        instrumentChartDuxo2 = (InstrumentChartDuxo) baseDuxo;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = -1633490746;
                        r11 = 0;
                        i5 = i3;
                        modifier3 = modifier4;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 32) != 0) {
                        i3 &= -458753;
                    }
                    composer2 = composerStartRestartGroup;
                    i4 = -1633490746;
                    modifier3 = modifier2;
                    r11 = 0;
                    i5 = i3;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(88942127, i5, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable (InstrumentChartComposable.kt:62)");
                }
                final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                LifecycleOwner lifecycleOwner = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(i4);
                zChangedInstance = composer2.changedInstance(instrumentChartDuxo2) | composer2.changedInstance(instrumentId);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentChartComposable.InstrumentChartComposable$lambda$2$lambda$1(instrumentChartDuxo2, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                composer3 = composer2;
                LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, i5 & 14, 0);
                ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult = new ActivityResultContracts$StartActivityForResult();
                composer3.startReplaceGroup(i4);
                zChangedInstance2 = composer3.changedInstance(instrumentChartDuxo2) | ((i5 & 896) != 256 ? true : r11);
                objRememberedValue2 = composer3.rememberedValue();
                if (!zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentChartComposable.InstrumentChartComposable$lambda$5$lambda$4(onSpanChanged, instrumentChartDuxo2, (ActivityResult) obj);
                        }
                    };
                    composer3.updateRememberedValue(objRememberedValue2);
                }
                composer3.endReplaceGroup();
                final ActivityResultRegistry8 activityResultRegistry8RememberLauncherForActivityResult = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult, (Function1) objRememberedValue2, composer3, r11);
                composer3.startReplaceGroup(1849434622);
                objRememberedValue3 = composer3.rememberedValue();
                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composer3.updateRememberedValue(objRememberedValue3);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue3;
                composer3.endReplaceGroup();
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(instrumentChartDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                final InstrumentChartDuxo instrumentChartDuxo4 = instrumentChartDuxo2;
                composer4 = composer3;
                final Modifier modifier5 = modifier3;
                final String str4 = str2;
                LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(2085486321, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt.InstrumentChartComposable.2
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                        invoke(composer5, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer5, int i8) {
                        if ((i8 & 3) == 2 && composer5.getSkipping()) {
                            composer5.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(2085486321, i8, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable.<anonymous> (InstrumentChartComposable.kt:83)");
                        }
                        LocalEducationTourScreen.ProvideEducationTourScreens(new ComposeEducationTourScreen[]{new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, null, 2, null), new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_CHART_SETTINGS_PAGE_SCREEN, null, 2, null), new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_CHART_SETTINGS_CANDLESTICK_PAGE_SCREEN, null, 2, null)}, ComposableLambda3.rememberComposableLambda(1685327725, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle, modifier5, onSpanChanged, instrumentChartDuxo4, instrumentId, context, str4, current2, navigator, activityResultRegistry8RememberLauncherForActivityResult, snapshotState, onLaunchEducationTour), composer5, 54), composer5, ComposeEducationTourScreen.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: InstrumentChartComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ String $accountNumber;
                        final /* synthetic */ ActivityResultRegistry8<Intent, ActivityResult> $advancedChartLauncher;
                        final /* synthetic */ Context $context;
                        final /* synthetic */ InstrumentChartDuxo $duxo;
                        final /* synthetic */ EventLogger $eventLogger;
                        final /* synthetic */ UUID $instrumentId;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Navigator $navigator;
                        final /* synthetic */ Function2<String, Function0<Unit>, Unit> $onLaunchEducationTour;
                        final /* synthetic */ Function1<String, Unit> $onSpanChanged;
                        final /* synthetic */ SnapshotState<Boolean> $showChartSettings$delegate;
                        final /* synthetic */ SnapshotState4<InstrumentChartViewState> $viewState;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(SnapshotState4<InstrumentChartViewState> snapshotState4, Modifier modifier, Function1<? super String, Unit> function1, InstrumentChartDuxo instrumentChartDuxo, UUID uuid, Context context, String str, EventLogger eventLogger, Navigator navigator, ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8, SnapshotState<Boolean> snapshotState, Function2<? super String, ? super Function0<Unit>, Unit> function2) {
                            this.$viewState = snapshotState4;
                            this.$modifier = modifier;
                            this.$onSpanChanged = function1;
                            this.$duxo = instrumentChartDuxo;
                            this.$instrumentId = uuid;
                            this.$context = context;
                            this.$accountNumber = str;
                            this.$eventLogger = eventLogger;
                            this.$navigator = navigator;
                            this.$advancedChartLauncher = activityResultRegistry8;
                            this.$showChartSettings$delegate = snapshotState;
                            this.$onLaunchEducationTour = function2;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
                        /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
                        /* JADX WARN: Removed duplicated region for block: B:48:0x01eb  */
                        /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final void invoke(Composer composer, int i) {
                            Function1 function1;
                            int i2;
                            boolean zChangedInstance;
                            Object objRememberedValue;
                            InstrumentChartDuxo instrumentChartDuxo;
                            if ((i & 3) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1685327725, i, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable.<anonymous>.<anonymous> (InstrumentChartComposable.kt:94)");
                            }
                            InstrumentChartViewState value = this.$viewState.getValue();
                            Modifier modifier = this.$modifier;
                            final Function1<String, Unit> function12 = this.$onSpanChanged;
                            final InstrumentChartDuxo instrumentChartDuxo2 = this.$duxo;
                            final UUID uuid = this.$instrumentId;
                            final Context context = this.$context;
                            final String str = this.$accountNumber;
                            final EventLogger eventLogger = this.$eventLogger;
                            final Navigator navigator = this.$navigator;
                            final ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8 = this.$advancedChartLauncher;
                            final SnapshotState<Boolean> snapshotState = this.$showChartSettings$delegate;
                            Function2<String, Function0<Unit>, Unit> function2 = this.$onLaunchEducationTour;
                            final InstrumentChartViewState instrumentChartViewState = value;
                            SduiInstrumentChart chart = instrumentChartViewState.getChart();
                            InstrumentChartSpans chartSpans = instrumentChartViewState.getChartSpans();
                            DisplaySpan activeDisplaySpan = instrumentChartViewState.getActiveDisplaySpan();
                            String serverValue = activeDisplaySpan != null ? activeDisplaySpan.getServerValue() : null;
                            boolean showAdtChip = instrumentChartViewState.getShowAdtChip();
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
                            boolean zIsInBlackWidowAdvancedChartExperiment = instrumentChartViewState.isInBlackWidowAdvancedChartExperiment();
                            boolean hasVisitedBwChart = instrumentChartViewState.getHasVisitedBwChart();
                            boolean zInstrumentCaretGoldDarkModeColor = instrumentChartViewState.getGoldL2DataUpsellImprovements().instrumentCaretGoldDarkModeColor();
                            boolean showDisplayCurrencyLabel = instrumentChartViewState.getShowDisplayCurrencyLabel();
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged = composer.changed(function12) | composer.changedInstance(instrumentChartDuxo2);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(function12, instrumentChartDuxo2, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            Function1 function13 = (Function1) objRememberedValue2;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            Object objRememberedValue3 = composer.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$3$lambda$2(snapshotState);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue3);
                            }
                            Function0 function0 = (Function0) objRememberedValue3;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(instrumentChartViewState) | composer.changedInstance(uuid) | composer.changedInstance(context) | composer.changed(str) | composer.changedInstance(eventLogger) | composer.changedInstance(navigator);
                            Object objRememberedValue4 = composer.rememberedValue();
                            if (!zChangedInstance2) {
                                function1 = function13;
                                if (objRememberedValue4 != companion.getEmpty()) {
                                    i2 = -1224400529;
                                }
                                Function0 function02 = (Function0) objRememberedValue4;
                                composer.endReplaceGroup();
                                composer.startReplaceGroup(i2);
                                zChangedInstance = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(activityResultRegistry8) | composer.changedInstance(instrumentChartViewState) | composer.changed(str) | composer.changedInstance(uuid) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(eventLogger);
                                objRememberedValue = composer.rememberedValue();
                                if (!zChangedInstance || objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(instrumentChartDuxo2, activityResultRegistry8, instrumentChartViewState, str, uuid, navigator, context, eventLogger);
                                        }
                                    };
                                    instrumentChartDuxo = instrumentChartDuxo2;
                                    instrumentChartViewState = instrumentChartViewState;
                                    composer.updateRememberedValue(objRememberedValue);
                                } else {
                                    instrumentChartDuxo = instrumentChartDuxo2;
                                }
                                composer.endReplaceGroup();
                                InstrumentChartViewState instrumentChartViewState2 = instrumentChartViewState;
                                InstrumentChartDuxo instrumentChartDuxo3 = instrumentChartDuxo;
                                InstrumentChartKt.InstrumentChart(modifier, chart, chartSpans, serverValue, showAdtChip, sduiActionHandlerCurrentActionHandler, function1, function0, function02, (Function0) objRememberedValue, zIsInBlackWidowAdvancedChartExperiment, hasVisitedBwChart, zInstrumentCaretGoldDarkModeColor, showDisplayCurrencyLabel, composer, 12582912, 0, 0);
                                composer.startReplaceGroup(397358848);
                                if (InstrumentChartComposable.InstrumentChartComposable$lambda$7(snapshotState)) {
                                    composer.startReplaceGroup(5004770);
                                    Object objRememberedValue5 = composer.rememberedValue();
                                    if (objRememberedValue5 == companion.getEmpty()) {
                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue5);
                                    }
                                    composer.endReplaceGroup();
                                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue5, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(196208842, true, new InstrumentChartComposable2(instrumentChartViewState2, instrumentChartDuxo3, function2), composer, 54), composer, 1572870, 62);
                                }
                                composer.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    return;
                                }
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            function1 = function13;
                            i2 = -1224400529;
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$5$lambda$4(instrumentChartDuxo2, instrumentChartViewState, uuid, context, str, eventLogger, navigator);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue4);
                            Function0 function022 = (Function0) objRememberedValue4;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(i2);
                            zChangedInstance = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(activityResultRegistry8) | composer.changedInstance(instrumentChartViewState) | composer.changed(str) | composer.changedInstance(uuid) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(eventLogger);
                            objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(instrumentChartDuxo2, activityResultRegistry8, instrumentChartViewState, str, uuid, navigator, context, eventLogger);
                                    }
                                };
                                instrumentChartDuxo = instrumentChartDuxo2;
                                instrumentChartViewState = instrumentChartViewState;
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            InstrumentChartViewState instrumentChartViewState22 = instrumentChartViewState;
                            InstrumentChartDuxo instrumentChartDuxo32 = instrumentChartDuxo;
                            InstrumentChartKt.InstrumentChart(modifier, chart, chartSpans, serverValue, showAdtChip, sduiActionHandlerCurrentActionHandler, function1, function0, function022, (Function0) objRememberedValue, zIsInBlackWidowAdvancedChartExperiment, hasVisitedBwChart, zInstrumentCaretGoldDarkModeColor, showDisplayCurrencyLabel, composer, 12582912, 0, 0);
                            composer.startReplaceGroup(397358848);
                            if (InstrumentChartComposable.InstrumentChartComposable$lambda$7(snapshotState)) {
                            }
                            composer.endReplaceGroup();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$1$lambda$0(Function1 function1, InstrumentChartDuxo instrumentChartDuxo, String span) {
                            Intrinsics.checkNotNullParameter(span, "span");
                            function1.invoke(span);
                            instrumentChartDuxo.onSpanChanged(span);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$3$lambda$2(SnapshotState snapshotState) {
                            InstrumentChartComposable.InstrumentChartComposable$lambda$8(snapshotState, true);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$5$lambda$4(InstrumentChartDuxo instrumentChartDuxo, InstrumentChartViewState instrumentChartViewState, UUID uuid, Context context, String str, EventLogger eventLogger, Navigator navigator) {
                            instrumentChartDuxo.exposeGoldL2ExperimentWhenClickingSdpArrow();
                            InstrumentChartComposable.onPriceBookClicked(uuid, instrumentChartViewState.getMarginSubscription(), context, str, eventLogger, navigator, instrumentChartViewState.getGoldL2SdpEntrypointVariant());
                            instrumentChartDuxo.logPriceBookClicked(uuid);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$7$lambda$6(InstrumentChartDuxo instrumentChartDuxo, ActivityResultRegistry8 activityResultRegistry8, InstrumentChartViewState instrumentChartViewState, String str, UUID uuid, Navigator navigator, Context context, EventLogger eventLogger) {
                            instrumentChartDuxo.onLaunchAdvancedChart();
                            boolean zIsInBlackWidowAdvancedChartExperiment = instrumentChartViewState.isInBlackWidowAdvancedChartExperiment();
                            boolean hasVisitedBwChart = instrumentChartViewState.getHasVisitedBwChart();
                            DisplaySpan activeDisplaySpan = instrumentChartViewState.getActiveDisplaySpan();
                            activityResultRegistry8.launch(InstrumentChartComposable.onAdvancedChartExpandButtonTapped(str, uuid, navigator, zIsInBlackWidowAdvancedChartExperiment, activeDisplaySpan != null ? GraphSelection2.getEquityGraphSelection(activeDisplaySpan) : null, hasVisitedBwChart, context));
                            InstrumentChartComposable.logAdvancedChartButtonTapped(uuid, eventLogger);
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
                            InstrumentChartComposable.InstrumentChartComposable$lambda$8(snapshotState, false);
                            return Unit.INSTANCE;
                        }
                    }
                }, composer4, 54), composer4, 48, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier5;
                instrumentChartDuxo3 = instrumentChartDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer4 = composerStartRestartGroup;
                instrumentChartDuxo3 = instrumentChartDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentChartComposable.InstrumentChartComposable$lambda$9(instrumentId, str, onSpanChanged, onLaunchEducationTour, modifier2, instrumentChartDuxo3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i6 == 0) {
                }
                if ((i2 & 32) == 0) {
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                LifecycleOwner lifecycleOwner2 = (LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
                composer2.startReplaceGroup(i4);
                zChangedInstance = composer2.changedInstance(instrumentChartDuxo2) | composer2.changedInstance(instrumentId);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return InstrumentChartComposable.InstrumentChartComposable$lambda$2$lambda$1(instrumentChartDuxo2, instrumentId, (LifecycleResumePauseEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    composer3 = composer2;
                    LifecycleEffectKt.LifecycleResumeEffect(instrumentId, lifecycleOwner2, (Function1<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult>) objRememberedValue, composer3, i5 & 14, 0);
                    ActivityResultContracts$StartActivityForResult activityResultContracts$StartActivityForResult2 = new ActivityResultContracts$StartActivityForResult();
                    composer3.startReplaceGroup(i4);
                    zChangedInstance2 = composer3.changedInstance(instrumentChartDuxo2) | ((i5 & 896) != 256 ? true : r11);
                    objRememberedValue2 = composer3.rememberedValue();
                    if (!zChangedInstance2) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return InstrumentChartComposable.InstrumentChartComposable$lambda$5$lambda$4(onSpanChanged, instrumentChartDuxo2, (ActivityResult) obj);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue2);
                        composer3.endReplaceGroup();
                        final ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8RememberLauncherForActivityResult2 = ActivityResultRegistry3.rememberLauncherForActivityResult(activityResultContracts$StartActivityForResult2, (Function1) objRememberedValue2, composer3, r11);
                        composer3.startReplaceGroup(1849434622);
                        objRememberedValue3 = composer3.rememberedValue();
                        if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                        }
                        final SnapshotState<Boolean> snapshotState2 = (SnapshotState) objRememberedValue3;
                        composer3.endReplaceGroup();
                        final SnapshotState4<InstrumentChartViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(instrumentChartDuxo2.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer3, 0, 7);
                        final InstrumentChartDuxo instrumentChartDuxo42 = instrumentChartDuxo2;
                        composer4 = composer3;
                        final Modifier modifier52 = modifier3;
                        final String str42 = str2;
                        LocalityProvider.LocalityProvider(null, ComposableLambda3.rememberComposableLambda(2085486321, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt.InstrumentChartComposable.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                invoke(composer5, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer5, int i8) {
                                if ((i8 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2085486321, i8, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable.<anonymous> (InstrumentChartComposable.kt:83)");
                                }
                                LocalEducationTourScreen.ProvideEducationTourScreens(new ComposeEducationTourScreen[]{new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, null, 2, null), new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_CHART_SETTINGS_PAGE_SCREEN, null, 2, null), new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_CHART_SETTINGS_CANDLESTICK_PAGE_SCREEN, null, 2, null)}, ComposableLambda3.rememberComposableLambda(1685327725, true, new AnonymousClass1(snapshotState4CollectAsStateWithLifecycle2, modifier52, onSpanChanged, instrumentChartDuxo42, instrumentId, context2, str42, current22, navigator2, activityResultRegistry8RememberLauncherForActivityResult2, snapshotState2, onLaunchEducationTour), composer5, 54), composer5, ComposeEducationTourScreen.$stable | 48);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: InstrumentChartComposable.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ String $accountNumber;
                                final /* synthetic */ ActivityResultRegistry8<Intent, ActivityResult> $advancedChartLauncher;
                                final /* synthetic */ Context $context;
                                final /* synthetic */ InstrumentChartDuxo $duxo;
                                final /* synthetic */ EventLogger $eventLogger;
                                final /* synthetic */ UUID $instrumentId;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Navigator $navigator;
                                final /* synthetic */ Function2<String, Function0<Unit>, Unit> $onLaunchEducationTour;
                                final /* synthetic */ Function1<String, Unit> $onSpanChanged;
                                final /* synthetic */ SnapshotState<Boolean> $showChartSettings$delegate;
                                final /* synthetic */ SnapshotState4<InstrumentChartViewState> $viewState;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(SnapshotState4<InstrumentChartViewState> snapshotState4, Modifier modifier, Function1<? super String, Unit> function1, InstrumentChartDuxo instrumentChartDuxo, UUID uuid, Context context, String str, EventLogger eventLogger, Navigator navigator, ActivityResultRegistry8<Intent, ActivityResult> activityResultRegistry8, SnapshotState<Boolean> snapshotState, Function2<? super String, ? super Function0<Unit>, Unit> function2) {
                                    this.$viewState = snapshotState4;
                                    this.$modifier = modifier;
                                    this.$onSpanChanged = function1;
                                    this.$duxo = instrumentChartDuxo;
                                    this.$instrumentId = uuid;
                                    this.$context = context;
                                    this.$accountNumber = str;
                                    this.$eventLogger = eventLogger;
                                    this.$navigator = navigator;
                                    this.$advancedChartLauncher = activityResultRegistry8;
                                    this.$showChartSettings$delegate = snapshotState;
                                    this.$onLaunchEducationTour = function2;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:39:0x0154  */
                                /* JADX WARN: Removed duplicated region for block: B:42:0x01a1  */
                                /* JADX WARN: Removed duplicated region for block: B:48:0x01eb  */
                                /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                */
                                public final void invoke(Composer composer, int i) {
                                    Function1 function1;
                                    int i2;
                                    boolean zChangedInstance;
                                    Object objRememberedValue;
                                    InstrumentChartDuxo instrumentChartDuxo;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1685327725, i, -1, "com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposable.<anonymous>.<anonymous> (InstrumentChartComposable.kt:94)");
                                    }
                                    InstrumentChartViewState value = this.$viewState.getValue();
                                    Modifier modifier = this.$modifier;
                                    final Function1 function12 = this.$onSpanChanged;
                                    final InstrumentChartDuxo instrumentChartDuxo2 = this.$duxo;
                                    final UUID uuid = this.$instrumentId;
                                    final Context context = this.$context;
                                    final String str = this.$accountNumber;
                                    final EventLogger eventLogger = this.$eventLogger;
                                    final Navigator navigator = this.$navigator;
                                    final ActivityResultRegistry8 activityResultRegistry8 = this.$advancedChartLauncher;
                                    final SnapshotState snapshotState = this.$showChartSettings$delegate;
                                    Function2<String, Function0<Unit>, Unit> function2 = this.$onLaunchEducationTour;
                                    final InstrumentChartViewState instrumentChartViewState = value;
                                    SduiInstrumentChart chart = instrumentChartViewState.getChart();
                                    InstrumentChartSpans chartSpans = instrumentChartViewState.getChartSpans();
                                    DisplaySpan activeDisplaySpan = instrumentChartViewState.getActiveDisplaySpan();
                                    String serverValue = activeDisplaySpan != null ? activeDisplaySpan.getServerValue() : null;
                                    boolean showAdtChip = instrumentChartViewState.getShowAdtChip();
                                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer, 0);
                                    boolean zIsInBlackWidowAdvancedChartExperiment = instrumentChartViewState.isInBlackWidowAdvancedChartExperiment();
                                    boolean hasVisitedBwChart = instrumentChartViewState.getHasVisitedBwChart();
                                    boolean zInstrumentCaretGoldDarkModeColor = instrumentChartViewState.getGoldL2DataUpsellImprovements().instrumentCaretGoldDarkModeColor();
                                    boolean showDisplayCurrencyLabel = instrumentChartViewState.getShowDisplayCurrencyLabel();
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(function12) | composer.changedInstance(instrumentChartDuxo2);
                                    Object objRememberedValue2 = composer.rememberedValue();
                                    if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$1$lambda$0(function12, instrumentChartDuxo2, (String) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue2);
                                    }
                                    Function1 function13 = (Function1) objRememberedValue2;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(5004770);
                                    Object objRememberedValue3 = composer.rememberedValue();
                                    Composer.Companion companion = Composer.INSTANCE;
                                    if (objRememberedValue3 == companion.getEmpty()) {
                                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda1
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$3$lambda$2(snapshotState);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue3);
                                    }
                                    Function0 function0 = (Function0) objRememberedValue3;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance2 = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(instrumentChartViewState) | composer.changedInstance(uuid) | composer.changedInstance(context) | composer.changed(str) | composer.changedInstance(eventLogger) | composer.changedInstance(navigator);
                                    Object objRememberedValue4 = composer.rememberedValue();
                                    if (!zChangedInstance2) {
                                        function1 = function13;
                                        if (objRememberedValue4 != companion.getEmpty()) {
                                            i2 = -1224400529;
                                        }
                                        Function0 function022 = (Function0) objRememberedValue4;
                                        composer.endReplaceGroup();
                                        composer.startReplaceGroup(i2);
                                        zChangedInstance = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(activityResultRegistry8) | composer.changedInstance(instrumentChartViewState) | composer.changed(str) | composer.changedInstance(uuid) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(eventLogger);
                                        objRememberedValue = composer.rememberedValue();
                                        if (!zChangedInstance || objRememberedValue == companion.getEmpty()) {
                                            objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda3
                                                @Override // kotlin.jvm.functions.Function0
                                                public final Object invoke() {
                                                    return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(instrumentChartDuxo2, activityResultRegistry8, instrumentChartViewState, str, uuid, navigator, context, eventLogger);
                                                }
                                            };
                                            instrumentChartDuxo = instrumentChartDuxo2;
                                            instrumentChartViewState = instrumentChartViewState;
                                            composer.updateRememberedValue(objRememberedValue);
                                        } else {
                                            instrumentChartDuxo = instrumentChartDuxo2;
                                        }
                                        composer.endReplaceGroup();
                                        InstrumentChartViewState instrumentChartViewState22 = instrumentChartViewState;
                                        InstrumentChartDuxo instrumentChartDuxo32 = instrumentChartDuxo;
                                        InstrumentChartKt.InstrumentChart(modifier, chart, chartSpans, serverValue, showAdtChip, sduiActionHandlerCurrentActionHandler, function1, function0, function022, (Function0) objRememberedValue, zIsInBlackWidowAdvancedChartExperiment, hasVisitedBwChart, zInstrumentCaretGoldDarkModeColor, showDisplayCurrencyLabel, composer, 12582912, 0, 0);
                                        composer.startReplaceGroup(397358848);
                                        if (InstrumentChartComposable.InstrumentChartComposable$lambda$7(snapshotState)) {
                                            composer.startReplaceGroup(5004770);
                                            Object objRememberedValue5 = composer.rememberedValue();
                                            if (objRememberedValue5 == companion.getEmpty()) {
                                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda4
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$9$lambda$8(snapshotState);
                                                    }
                                                };
                                                composer.updateRememberedValue(objRememberedValue5);
                                            }
                                            composer.endReplaceGroup();
                                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue5, null, false, null, null, 0L, ComposableLambda3.rememberComposableLambda(196208842, true, new InstrumentChartComposable2(instrumentChartViewState22, instrumentChartDuxo32, function2), composer, 54), composer, 1572870, 62);
                                        }
                                        composer.endReplaceGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            return;
                                        }
                                        ComposerKt.traceEventEnd();
                                        return;
                                    }
                                    function1 = function13;
                                    i2 = -1224400529;
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$5$lambda$4(instrumentChartDuxo2, instrumentChartViewState, uuid, context, str, eventLogger, navigator);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue4);
                                    Function0 function0222 = (Function0) objRememberedValue4;
                                    composer.endReplaceGroup();
                                    composer.startReplaceGroup(i2);
                                    zChangedInstance = composer.changedInstance(instrumentChartDuxo2) | composer.changedInstance(activityResultRegistry8) | composer.changedInstance(instrumentChartViewState) | composer.changed(str) | composer.changedInstance(uuid) | composer.changedInstance(navigator) | composer.changedInstance(context) | composer.changedInstance(eventLogger);
                                    objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$2$1$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return InstrumentChartComposable.C154412.AnonymousClass1.invoke$lambda$10$lambda$7$lambda$6(instrumentChartDuxo2, activityResultRegistry8, instrumentChartViewState, str, uuid, navigator, context, eventLogger);
                                            }
                                        };
                                        instrumentChartDuxo = instrumentChartDuxo2;
                                        instrumentChartViewState = instrumentChartViewState;
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    InstrumentChartViewState instrumentChartViewState222 = instrumentChartViewState;
                                    InstrumentChartDuxo instrumentChartDuxo322 = instrumentChartDuxo;
                                    InstrumentChartKt.InstrumentChart(modifier, chart, chartSpans, serverValue, showAdtChip, sduiActionHandlerCurrentActionHandler, function1, function0, function0222, (Function0) objRememberedValue, zIsInBlackWidowAdvancedChartExperiment, hasVisitedBwChart, zInstrumentCaretGoldDarkModeColor, showDisplayCurrencyLabel, composer, 12582912, 0, 0);
                                    composer.startReplaceGroup(397358848);
                                    if (InstrumentChartComposable.InstrumentChartComposable$lambda$7(snapshotState)) {
                                    }
                                    composer.endReplaceGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$1$lambda$0(Function1 function1, InstrumentChartDuxo instrumentChartDuxo, String span) {
                                    Intrinsics.checkNotNullParameter(span, "span");
                                    function1.invoke(span);
                                    instrumentChartDuxo.onSpanChanged(span);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$3$lambda$2(SnapshotState snapshotState) {
                                    InstrumentChartComposable.InstrumentChartComposable$lambda$8(snapshotState, true);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$5$lambda$4(InstrumentChartDuxo instrumentChartDuxo, InstrumentChartViewState instrumentChartViewState, UUID uuid, Context context, String str, EventLogger eventLogger, Navigator navigator) {
                                    instrumentChartDuxo.exposeGoldL2ExperimentWhenClickingSdpArrow();
                                    InstrumentChartComposable.onPriceBookClicked(uuid, instrumentChartViewState.getMarginSubscription(), context, str, eventLogger, navigator, instrumentChartViewState.getGoldL2SdpEntrypointVariant());
                                    instrumentChartDuxo.logPriceBookClicked(uuid);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$7$lambda$6(InstrumentChartDuxo instrumentChartDuxo, ActivityResultRegistry8 activityResultRegistry8, InstrumentChartViewState instrumentChartViewState, String str, UUID uuid, Navigator navigator, Context context, EventLogger eventLogger) {
                                    instrumentChartDuxo.onLaunchAdvancedChart();
                                    boolean zIsInBlackWidowAdvancedChartExperiment = instrumentChartViewState.isInBlackWidowAdvancedChartExperiment();
                                    boolean hasVisitedBwChart = instrumentChartViewState.getHasVisitedBwChart();
                                    DisplaySpan activeDisplaySpan = instrumentChartViewState.getActiveDisplaySpan();
                                    activityResultRegistry8.launch(InstrumentChartComposable.onAdvancedChartExpandButtonTapped(str, uuid, navigator, zIsInBlackWidowAdvancedChartExperiment, activeDisplaySpan != null ? GraphSelection2.getEquityGraphSelection(activeDisplaySpan) : null, hasVisitedBwChart, context));
                                    InstrumentChartComposable.logAdvancedChartButtonTapped(uuid, eventLogger);
                                    return Unit.INSTANCE;
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$10$lambda$9$lambda$8(SnapshotState snapshotState) {
                                    InstrumentChartComposable.InstrumentChartComposable$lambda$8(snapshotState, false);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composer4, 54), composer4, 48, 1);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier52;
                        instrumentChartDuxo3 = instrumentChartDuxo42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecyclePauseOrDisposeEffectResult InstrumentChartComposable$lambda$2$lambda$1(InstrumentChartDuxo instrumentChartDuxo, UUID uuid, final LifecycleResumePauseEffectScope LifecycleResumeEffect) {
        Intrinsics.checkNotNullParameter(LifecycleResumeEffect, "$this$LifecycleResumeEffect");
        final Job jobBind = instrumentChartDuxo.bind(uuid);
        return new LifecyclePauseOrDisposeEffectResult() { // from class: com.robinhood.android.equitydetail.ui.chart.InstrumentChartComposableKt$InstrumentChartComposable$lambda$2$lambda$1$$inlined$onPauseOrDispose$1
            @Override // androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult
            public void runPauseOrOnDisposeEffect() {
                Job.DefaultImpls.cancel$default(jobBind, null, 1, null);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InstrumentChartComposable$lambda$5$lambda$4(Function1 function1, InstrumentChartDuxo instrumentChartDuxo, ActivityResult result) {
        Intent data;
        String stringExtra;
        Intrinsics.checkNotNullParameter(result, "result");
        if (result.getResultCode() == -1 && (data = result.getData()) != null && (stringExtra = data.getStringExtra(InstrumentChartView.ADVANCED_CHART_SELECTED_SPAN_EXTRA)) != null) {
            function1.invoke(stringExtra);
            instrumentChartDuxo.onSpanChanged(stringExtra);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void InstrumentChartComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean InstrumentChartComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void logAdvancedChartButtonTapped(UUID uuid, EventLogger eventLogger) {
        String string2;
        Screen.Name name = Screen.Name.STOCK_DETAIL_PAGE;
        if (uuid == null || (string2 = uuid.toString()) == null) {
            return;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.VIEW_ADVANCED_CHARTS, new Screen(name, null, string2, null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Intent onAdvancedChartExpandButtonTapped(String str, UUID uuid, Navigator navigator, boolean z, GraphSelection graphSelection, boolean z2, Context context) {
        FragmentKey blackWidowAdvancedChartNuxFragmentKey;
        if (z) {
            if (z2) {
                blackWidowAdvancedChartNuxFragmentKey = new BlackWidowAdvancedChartFragmentKey(uuid, BlackWidowAdvancedChartFragmentKey2.EQUITY, "sdp", false, 8, null);
            } else {
                blackWidowAdvancedChartNuxFragmentKey = new BlackWidowAdvancedChartNuxFragmentKey(uuid, "sdp");
            }
            return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, blackWidowAdvancedChartNuxFragmentKey, false, false, false, null, false, true, false, false, false, null, false, 7796, null);
        }
        return Navigator.DefaultImpls.createIntentForFragment$default(navigator, context, new AdvancedChartFragmentKey(uuid, null, graphSelection, false, str, null, 40, null), false, false, false, null, false, false, false, false, false, null, false, 7924, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onPriceBookClicked(UUID uuid, MarginSubscription marginSubscription, Context context, String str, EventLogger eventLogger, Navigator navigator, GoldL2SdpEntrypointExperiment.Variant variant) {
        if (marginSubscription != null && marginSubscription.is24Karat()) {
            Navigator.DefaultImpls.showFragment$default(navigator, context, new Level2MarketDataFragmentKey(uuid, str), false, false, false, null, false, null, false, false, null, null, 4092, null);
            return;
        }
        EventLogger.DefaultImpls.logTap$default(eventLogger, UserInteractionEventData.Action.CONTINUE, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, "stock_detail_page_arrow_sdp_l2_enhancement_" + variant.getServerValue(), null, 10, null), new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, null, false, 56, null);
        GoldL2SdpEntrypointExperiment.Variant variant2 = GoldL2SdpEntrypointExperiment.Variant.MEMBER1;
        String str2 = GoldFeature.LEVEL2_ARROW;
        if (variant == variant2) {
            Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new AssetDigestOnboardingFragmentKey(true, GoldFeature.LEVEL2_ARROW, AssetDigestOnboardingFlowType.SDP_ARROW_UPSELL), false, false, false, false, null, false, null, null, 1020, null);
            return;
        }
        int i = WhenMappings.$EnumSwitchMapping$0[variant.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str2 = GoldFeature.LEVEL2_ARROW_SWEEP;
            } else {
                str2 = GoldFeature.LEVEL2;
            }
        }
        Navigator.DefaultImpls.startActivity$default(navigator, context, new GoldUpgradeIntentKey("stock_detail_l2_button", str2, null, null, null, false, 60, null), null, false, null, null, 60, null);
    }
}
