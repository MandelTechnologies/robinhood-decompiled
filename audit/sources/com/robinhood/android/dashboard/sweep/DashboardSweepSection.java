package com.robinhood.android.dashboard.sweep;

import android.content.Context;
import android.net.Uri;
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
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.dashboard.sweep.DashboardSweepSectionViewState;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.api.bonfire.ApiSweepSplash;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import io.reactivex.disposables.Disposable;
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

/* compiled from: DashboardSweepSection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002"}, m3636d2 = {"DashboardSweepSection", "", "accountNumber", "", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-dashboard-sweep_externalDebug", "viewState", "Lcom/robinhood/android/dashboard/sweep/DashboardSweepSectionViewState;", "activeDialog", "Lcom/robinhood/android/dashboard/sweep/SweepSectionDialogData;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DashboardSweepSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardSweepSection$lambda$17(String str, Modifier modifier, DashboardSweepSectionDuxo dashboardSweepSectionDuxo, int i, int i2, Composer composer, int i3) {
        DashboardSweepSection(str, modifier, dashboardSweepSectionDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0264  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DashboardSweepSection(final String str, Modifier modifier, DashboardSweepSectionDuxo dashboardSweepSectionDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        DashboardSweepSectionDuxo dashboardSweepSectionDuxo2;
        Modifier modifier3;
        Composer composer2;
        int i4;
        boolean z;
        int i5;
        final DashboardSweepSectionDuxo dashboardSweepSectionDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        Object objRememberedValue2;
        Composer.Companion companion;
        DashboardSweepSectionViewState dashboardSweepSectionViewStateDashboardSweepSection$lambda$0;
        Composer composer3;
        DashboardSweepSectionDuxo dashboardSweepSectionDuxo4;
        int i6;
        SweepSectionDialogData sweepSectionDialogDataDashboardSweepSection$lambda$5;
        final DashboardSweepSectionDuxo dashboardSweepSectionDuxo5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(117798965);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    dashboardSweepSectionDuxo2 = dashboardSweepSectionDuxo;
                    int i8 = composerStartRestartGroup.changedInstance(dashboardSweepSectionDuxo2) ? 256 : 128;
                    i3 |= i8;
                } else {
                    dashboardSweepSectionDuxo2 = dashboardSweepSectionDuxo;
                }
                i3 |= i8;
            } else {
                dashboardSweepSectionDuxo2 = dashboardSweepSectionDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        String str2 = str + "_sweep_section";
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        i4 = -1633490746;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(DashboardSweepSectionDuxo.class), current, str2, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composer2 = composerStartRestartGroup;
                        composer2.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composer2.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composer2.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composer2.changedInstance(baseDuxo) | composer2.changedInstance(lifecycle);
                        Object objRememberedValue3 = composer2.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$DashboardSweepSection$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$DashboardSweepSection$$inlined$duxo$1.1
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
                        dashboardSweepSectionDuxo2 = (DashboardSweepSectionDuxo) baseDuxo;
                        i3 &= -897;
                    } else {
                        composer2 = composerStartRestartGroup;
                        i4 = -1633490746;
                        z = false;
                    }
                    DashboardSweepSectionDuxo dashboardSweepSectionDuxo6 = dashboardSweepSectionDuxo2;
                    i5 = i3;
                    dashboardSweepSectionDuxo3 = dashboardSweepSectionDuxo6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    DashboardSweepSectionDuxo dashboardSweepSectionDuxo7 = dashboardSweepSectionDuxo2;
                    i5 = i3;
                    dashboardSweepSectionDuxo3 = dashboardSweepSectionDuxo7;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    i4 = -1633490746;
                    z = false;
                }
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(117798965, i5, -1, "com.robinhood.android.dashboard.sweep.DashboardSweepSection (DashboardSweepSection.kt:22)");
                }
                int i9 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(dashboardSweepSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                composer2.startReplaceGroup(i4);
                int i10 = i9 & 14;
                zChangedInstance = composer2.changedInstance(dashboardSweepSectionDuxo3) | (i10 != 4 ? true : z);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DashboardSweepSection.DashboardSweepSection$lambda$3$lambda$2(dashboardSweepSectionDuxo3, str, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(str, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, i10);
                composer2.startReplaceGroup(1849434622);
                objRememberedValue2 = composer2.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotState snapshotState = (SnapshotState) objRememberedValue2;
                composer2.endReplaceGroup();
                final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 = DashboardSweepSection$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                if (dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 instanceof DashboardSweepSectionViewState.V1) {
                    composer3 = composer2;
                    dashboardSweepSectionDuxo4 = dashboardSweepSectionDuxo3;
                    if (dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 instanceof DashboardSweepSectionViewState.V2) {
                        composer3.startReplaceGroup(362226743);
                        ApiSweepSplash.SweepSectionV2 section = ((DashboardSweepSectionViewState.V2) dashboardSweepSectionViewStateDashboardSweepSection$lambda$0).getSection();
                        composer3.startReplaceGroup(-1224400529);
                        boolean zChangedInstance3 = composer3.changedInstance(current2) | composer3.changedInstance(userInteractionEventDescriptor) | composer3.changedInstance(navigator) | composer3.changedInstance(context);
                        Object objRememberedValue4 = composer3.rememberedValue();
                        if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function3() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function3
                                public final Object invoke(Object obj, Object obj2, Object obj3) {
                                    return Boolean.valueOf(DashboardSweepSection.DashboardSweepSection$lambda$11$lambda$10(current2, userInteractionEventDescriptor, navigator, context, (DeeplinkAction) obj, (String) obj2, (Integer) obj3));
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue4);
                        }
                        Function3 function3 = (Function3) objRememberedValue4;
                        composer3.endReplaceGroup();
                        composer3.startReplaceGroup(-1633490746);
                        boolean z2 = i10 == 4;
                        Object objRememberedValue5 = composer3.rememberedValue();
                        if (z2 || objRememberedValue5 == companion.getEmpty()) {
                            objRememberedValue5 = new Function1() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DashboardSweepSection.DashboardSweepSection$lambda$13$lambda$12(str, snapshotState, (ApiSweepSplash.Dialog) obj);
                                }
                            };
                            composer3.updateRememberedValue(objRememberedValue5);
                        }
                        composer3.endReplaceGroup();
                        int i11 = (i9 << 6) & 7168;
                        Modifier modifier4 = modifier3;
                        i6 = 5004770;
                        SweepSectionV2RowComposable.SweepSectionV2RowComposable(section, function3, (Function1) objRememberedValue5, modifier4, composer3, i11, 0);
                        modifier2 = modifier4;
                        composer3 = composer3;
                        composer3.endReplaceGroup();
                    } else {
                        modifier2 = modifier3;
                        i6 = 5004770;
                        if (!(dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 instanceof DashboardSweepSectionViewState.Empty) && !(dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 instanceof DashboardSweepSectionViewState.Loading)) {
                            composer3.startReplaceGroup(1535680531);
                            composer3.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer3.startReplaceGroup(363190626);
                        composer3.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(361499080);
                    ApiSweepSplash.SweepSection section2 = ((DashboardSweepSectionViewState.V1) dashboardSweepSectionViewStateDashboardSweepSection$lambda$0).getSection();
                    composer2.startReplaceGroup(-1224400529);
                    boolean zChangedInstance4 = composer2.changedInstance(current2) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(navigator) | composer2.changedInstance(context);
                    Object objRememberedValue6 = composer2.rememberedValue();
                    if (zChangedInstance4 || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new SduiActionHandler() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$DashboardSweepSection$2$1
                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(DeeplinkAction action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                AnalyticsExtensions.logSweepSectionCtaTap$default(current2, userInteractionEventDescriptor.getScreen(), "cash_section_cta", null, 4, null);
                                return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(action.getUri()), null, null, false, null, 60, null);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue6);
                    }
                    SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue6;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function1() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return DashboardSweepSection.DashboardSweepSection$lambda$9$lambda$8(snapshotState, (SweepSectionDialogData) obj);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    composer2.endReplaceGroup();
                    int i12 = i9 << 9;
                    Modifier modifier5 = modifier3;
                    Composer composer4 = composer2;
                    dashboardSweepSectionDuxo4 = dashboardSweepSectionDuxo3;
                    SweepSectionV1Composable.SweepSectionV1Composable(section2, (Function1) objRememberedValue7, sduiActionHandler, str, modifier5, composer4, (i12 & 57344) | (i12 & 7168) | 48, 0);
                    composer3 = composer4;
                    composer3.endReplaceGroup();
                    modifier2 = modifier5;
                    i6 = 5004770;
                }
                sweepSectionDialogDataDashboardSweepSection$lambda$5 = DashboardSweepSection$lambda$5(snapshotState);
                if (sweepSectionDialogDataDashboardSweepSection$lambda$5 != null) {
                    composer3.startReplaceGroup(i6);
                    Object objRememberedValue8 = composer3.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return DashboardSweepSection.DashboardSweepSection$lambda$16$lambda$15$lambda$14(snapshotState);
                            }
                        };
                        composer3.updateRememberedValue(objRememberedValue8);
                    }
                    composer3.endReplaceGroup();
                    SweepSectionBottomSheet.SweepSectionDialog(sweepSectionDialogDataDashboardSweepSection$lambda$5, (Function0) objRememberedValue8, null, composer3, 48, 4);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                dashboardSweepSectionDuxo5 = dashboardSweepSectionDuxo4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
                dashboardSweepSectionDuxo5 = dashboardSweepSectionDuxo2;
            }
            final Modifier modifier6 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return DashboardSweepSection.DashboardSweepSection$lambda$17(str, modifier6, dashboardSweepSectionDuxo5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i7 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
                DashboardSweepSectionDuxo dashboardSweepSectionDuxo62 = dashboardSweepSectionDuxo2;
                i5 = i3;
                dashboardSweepSectionDuxo3 = dashboardSweepSectionDuxo62;
                composer2.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                int i92 = i5;
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(dashboardSweepSectionDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composer2, 0, 7);
                composer2.startReplaceGroup(i4);
                int i102 = i92 & 14;
                zChangedInstance = composer2.changedInstance(dashboardSweepSectionDuxo3) | (i102 != 4 ? true : z);
                objRememberedValue = composer2.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return DashboardSweepSection.DashboardSweepSection$lambda$3$lambda$2(dashboardSweepSectionDuxo3, str, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                    composer2.endReplaceGroup();
                    EffectsKt.DisposableEffect(str, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composer2, i102);
                    composer2.startReplaceGroup(1849434622);
                    objRememberedValue2 = composer2.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
                    composer2.endReplaceGroup();
                    final Navigator navigator2 = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                    final Context context2 = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    final EventLogger current22 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                    final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                    dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 = DashboardSweepSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                    if (dashboardSweepSectionViewStateDashboardSweepSection$lambda$0 instanceof DashboardSweepSectionViewState.V1) {
                    }
                    sweepSectionDialogDataDashboardSweepSection$lambda$5 = DashboardSweepSection$lambda$5(snapshotState2);
                    if (sweepSectionDialogDataDashboardSweepSection$lambda$5 != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    dashboardSweepSectionDuxo5 = dashboardSweepSectionDuxo4;
                }
            }
        }
        final Modifier modifier62 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult DashboardSweepSection$lambda$3$lambda$2(DashboardSweepSectionDuxo dashboardSweepSectionDuxo, String str, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        final Disposable disposableBind = dashboardSweepSectionDuxo.bind(str);
        return new DisposableEffectResult() { // from class: com.robinhood.android.dashboard.sweep.DashboardSweepSectionKt$DashboardSweepSection$lambda$3$lambda$2$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                disposableBind.dispose();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardSweepSection$lambda$9$lambda$8(SnapshotState snapshotState, SweepSectionDialogData dialog) {
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        snapshotState.setValue(dialog);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean DashboardSweepSection$lambda$11$lambda$10(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Navigator navigator, Context context, DeeplinkAction action, String str, Integer num) {
        Intrinsics.checkNotNullParameter(action, "action");
        AnalyticsExtensions.logSweepSectionCtaTap(eventLogger, userInteractionEventDescriptor.getScreen(), str, num);
        return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(action.getUri()), null, null, false, null, 60, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardSweepSection$lambda$13$lambda$12(String str, SnapshotState snapshotState, ApiSweepSplash.Dialog dialogContent) {
        Intrinsics.checkNotNullParameter(dialogContent, "dialogContent");
        snapshotState.setValue(new SweepSectionDialogData(dialogContent, str, null, false, 12, null));
        return Unit.INSTANCE;
    }

    private static final DashboardSweepSectionViewState DashboardSweepSection$lambda$0(SnapshotState4<? extends DashboardSweepSectionViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final SweepSectionDialogData DashboardSweepSection$lambda$5(SnapshotState<SweepSectionDialogData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DashboardSweepSection$lambda$16$lambda$15$lambda$14(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }
}
