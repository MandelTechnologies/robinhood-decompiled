package com.robinhood.android.advisory.dashboard.overview;

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
import com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewViewState;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
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

/* compiled from: ManagedDashboardOverview.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a)\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00012\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\"\u0016\u0010\u0000\u001a\u00020\u00018\u0006X\u0087T¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"ManagedDashboardPlaceholderTestTag", "", "getManagedDashboardPlaceholderTestTag$annotations", "()V", "ManagedInvestedTestTag", "getManagedInvestedTestTag$annotations", "ManagedDashboardOverview", "", "accountNumber", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDuxo;", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewDuxo;Landroidx/compose/runtime/Composer;II)V", "lib-advisory-dashboard_externalDebug", "viewState", "Lcom/robinhood/android/advisory/dashboard/overview/ManagedDashboardOverviewViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class ManagedDashboardOverview {
    public static final String ManagedDashboardPlaceholderTestTag = "managed_dashboard_overview_placeholder";
    public static final String ManagedInvestedTestTag = "managed_dashboard_invested";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ManagedDashboardOverview$lambda$2(String str, Modifier modifier, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, int i, int i2, Composer composer, int i3) {
        ManagedDashboardOverview(str, modifier, managedDashboardOverviewDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getManagedDashboardPlaceholderTestTag$annotations() {
    }

    public static /* synthetic */ void getManagedInvestedTestTag$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ManagedDashboardOverview(final String accountNumber, Modifier modifier, ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo2;
        final Modifier modifier3;
        int i4;
        final ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo3;
        final ManagedDashboardOverviewViewState managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0;
        boolean zChangedInstance;
        Object objRememberedValue;
        final ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(-54170062);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(accountNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                if ((i2 & 4) == 0) {
                    managedDashboardOverviewDuxo2 = managedDashboardOverviewDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(managedDashboardOverviewDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    managedDashboardOverviewDuxo2 = managedDashboardOverviewDuxo;
                }
                i3 |= i6;
            } else {
                managedDashboardOverviewDuxo2 = managedDashboardOverviewDuxo;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 4) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(ManagedDashboardOverviewDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt$ManagedDashboardOverview$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt$ManagedDashboardOverview$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        managedDashboardOverviewDuxo3 = (ManagedDashboardOverviewDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-54170062, i4, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverview (ManagedDashboardOverview.kt:27)");
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(managedDashboardOverviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        composerStartRestartGroup = composerStartRestartGroup;
                        managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0 = ManagedDashboardOverview$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                        if (!(managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0 instanceof ManagedDashboardOverviewViewState.Loading)) {
                            composerStartRestartGroup.startReplaceGroup(1127703479);
                            ManagedAccountOverviewPlaceholder.ManagedAccountOverviewPlaceholder(TestTag3.testTag(modifier3, ManagedDashboardPlaceholderTestTag), composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            if (!(managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0 instanceof ManagedDashboardOverviewViewState.Loaded)) {
                                composerStartRestartGroup.startReplaceGroup(-517813605);
                                composerStartRestartGroup.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composerStartRestartGroup.startReplaceGroup(1127932662);
                            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, null, null, ((ManagedDashboardOverviewViewState.Loaded) managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0).getEventContext(), null, null, 55, null), ComposableLambda3.rememberComposableLambda(13771134, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt.ManagedDashboardOverview.1
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
                                        ComposerKt.traceEventStart(13771134, i7, -1, "com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverview.<anonymous> (ManagedDashboardOverview.kt:43)");
                                    }
                                    ManagedDashboardOverviewViewState.Loaded loaded = (ManagedDashboardOverviewViewState.Loaded) managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0;
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo5 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance3 = composer2.changedInstance(managedDashboardOverviewDuxo5);
                                    Object objRememberedValue3 = composer2.rememberedValue();
                                    if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue3 = new ManagedDashboardOverview2(managedDashboardOverviewDuxo5);
                                        composer2.updateRememberedValue(objRememberedValue3);
                                    }
                                    KFunction kFunction = (KFunction) objRememberedValue3;
                                    composer2.endReplaceGroup();
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo6 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance4 = composer2.changedInstance(managedDashboardOverviewDuxo6);
                                    Object objRememberedValue4 = composer2.rememberedValue();
                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue4 = new ManagedDashboardOverview3(managedDashboardOverviewDuxo6);
                                        composer2.updateRememberedValue(objRememberedValue4);
                                    }
                                    KFunction kFunction2 = (KFunction) objRememberedValue4;
                                    composer2.endReplaceGroup();
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo7 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance5 = composer2.changedInstance(managedDashboardOverviewDuxo7);
                                    Object objRememberedValue5 = composer2.rememberedValue();
                                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue5 = new ManagedDashboardOverview4(managedDashboardOverviewDuxo7);
                                        composer2.updateRememberedValue(objRememberedValue5);
                                    }
                                    KFunction kFunction3 = (KFunction) objRememberedValue5;
                                    composer2.endReplaceGroup();
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo8 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance6 = composer2.changedInstance(managedDashboardOverviewDuxo8);
                                    Object objRememberedValue6 = composer2.rememberedValue();
                                    if (zChangedInstance6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue6 = new ManagedDashboardOverview5(managedDashboardOverviewDuxo8);
                                        composer2.updateRememberedValue(objRememberedValue6);
                                    }
                                    KFunction kFunction4 = (KFunction) objRememberedValue6;
                                    composer2.endReplaceGroup();
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo9 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance7 = composer2.changedInstance(managedDashboardOverviewDuxo9);
                                    Object objRememberedValue7 = composer2.rememberedValue();
                                    if (zChangedInstance7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue7 = new ManagedDashboardOverview6(managedDashboardOverviewDuxo9);
                                        composer2.updateRememberedValue(objRememberedValue7);
                                    }
                                    KFunction kFunction5 = (KFunction) objRememberedValue7;
                                    composer2.endReplaceGroup();
                                    ManagedDashboardOverviewDuxo managedDashboardOverviewDuxo10 = managedDashboardOverviewDuxo3;
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance8 = composer2.changedInstance(managedDashboardOverviewDuxo10);
                                    Object objRememberedValue8 = composer2.rememberedValue();
                                    if (zChangedInstance8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue8 = new ManagedDashboardOverview7(managedDashboardOverviewDuxo10);
                                        composer2.updateRememberedValue(objRememberedValue8);
                                    }
                                    composer2.endReplaceGroup();
                                    LoadedManagedDashboardOverview.LoadedManagedDashboardOverview(loaded, (Function1) kFunction, (Function1) kFunction2, (Function1) kFunction5, (Function0) kFunction3, (Function1) kFunction4, (Function0) ((KFunction) objRememberedValue8), TestTag3.testTag(modifier3, ManagedDashboardOverview.ManagedInvestedTestTag), composer2, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        int i7 = i4 & 14;
                        zChangedInstance = composerStartRestartGroup.changedInstance(managedDashboardOverviewDuxo3) | (i7 == 4);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new ManagedDashboardOverview8(managedDashboardOverviewDuxo3, accountNumber, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i7);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        managedDashboardOverviewDuxo4 = managedDashboardOverviewDuxo3;
                        modifier4 = modifier3;
                    } else {
                        i4 = i3;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                }
                managedDashboardOverviewDuxo3 = managedDashboardOverviewDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(managedDashboardOverviewDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0 = ManagedDashboardOverview$lambda$0(snapshotState4CollectAsStateWithLifecycle2);
                if (!(managedDashboardOverviewViewStateManagedDashboardOverview$lambda$0 instanceof ManagedDashboardOverviewViewState.Loading)) {
                }
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i72 = i4 & 14;
                zChangedInstance = composerStartRestartGroup.changedInstance(managedDashboardOverviewDuxo3) | (i72 == 4);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new ManagedDashboardOverview8(managedDashboardOverviewDuxo3, accountNumber, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(accountNumber, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, i72);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    managedDashboardOverviewDuxo4 = managedDashboardOverviewDuxo3;
                    modifier4 = modifier3;
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                managedDashboardOverviewDuxo4 = managedDashboardOverviewDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.dashboard.overview.ManagedDashboardOverviewKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ManagedDashboardOverview.ManagedDashboardOverview$lambda$2(accountNumber, modifier4, managedDashboardOverviewDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                if (i5 == 0) {
                }
                if ((i2 & 4) == 0) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final ManagedDashboardOverviewViewState ManagedDashboardOverview$lambda$0(SnapshotState4<? extends ManagedDashboardOverviewViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
