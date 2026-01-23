package com.robinhood.android.advisory.tlh.gnl;

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
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestDashboard;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: GainsAndLossesDashboardSection.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a9\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"GainsAndLossesDashboardSection", "", "modifier", "Landroidx/compose/ui/Modifier;", "headerData", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;", "activeYear", "", "duxo", "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesDuxo;", "(Landroidx/compose/ui/Modifier;Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestDashboard$GainsAndLossesSectionHeader;Ljava/lang/String;Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GainsAndLossesDashboardSection {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesDashboardSection$lambda$2(Modifier modifier, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, String str, GainsAndLossesDuxo gainsAndLossesDuxo, int i, int i2, Composer composer, int i3) {
        GainsAndLossesDashboardSection(modifier, gainsAndLossesSectionHeader, str, gainsAndLossesDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GainsAndLossesDashboardSection(Modifier modifier, TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader, String str, GainsAndLossesDuxo gainsAndLossesDuxo, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader2;
        int i4;
        String str2;
        GainsAndLossesDuxo gainsAndLossesDuxo2;
        Modifier modifier3;
        TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader3;
        String str3;
        boolean z;
        int i5;
        GainsAndLossesDuxo gainsAndLossesDuxo3;
        boolean zChangedInstance;
        Object objRememberedValue;
        final GainsAndLossesDuxo gainsAndLossesDuxo4;
        final String str4;
        final Modifier modifier4;
        final TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1750366558);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
                i3 |= composerStartRestartGroup.changedInstance(gainsAndLossesSectionHeader2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        gainsAndLossesDuxo2 = gainsAndLossesDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(gainsAndLossesDuxo2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        gainsAndLossesDuxo2 = gainsAndLossesDuxo;
                    }
                    i3 |= i8;
                } else {
                    gainsAndLossesDuxo2 = gainsAndLossesDuxo;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier4 = modifier2;
                    gainsAndLossesSectionHeader4 = gainsAndLossesSectionHeader2;
                    str4 = str2;
                    gainsAndLossesDuxo4 = gainsAndLossesDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        gainsAndLossesSectionHeader3 = i7 == 0 ? null : gainsAndLossesSectionHeader2;
                        str3 = i4 == 0 ? null : str2;
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            z = false;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GainsAndLossesDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt$GainsAndLossesDashboardSection$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt$GainsAndLossesDashboardSection$$inlined$duxo$1.1
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
                            i5 = i3 & (-7169);
                            gainsAndLossesDuxo3 = (GainsAndLossesDuxo) baseDuxo;
                        } else {
                            z = false;
                            i5 = i3;
                            gainsAndLossesDuxo3 = gainsAndLossesDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        modifier3 = modifier2;
                        i5 = i3;
                        gainsAndLossesSectionHeader3 = gainsAndLossesSectionHeader2;
                        str3 = str2;
                        gainsAndLossesDuxo3 = gainsAndLossesDuxo2;
                        z = false;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1750366558, i5, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSection (GainsAndLossesDashboardSection.kt:16)");
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(gainsAndLossesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    int i9 = i5;
                    Modifier modifier5 = modifier3;
                    TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader5 = gainsAndLossesSectionHeader3;
                    GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.DASHBOARD_SECTION, GainsAndLossesDashboardSection$lambda$0(snapshotState4CollectAsStateWithLifecycle), modifier5, null, gainsAndLossesSectionHeader5, composerStartRestartGroup, ((i5 << 6) & 896) | 6 | ((i5 << 9) & 57344), 8);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(gainsAndLossesDuxo3) | ((i9 & 896) != 256 ? true : z);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new GainsAndLossesDashboardSection2(gainsAndLossesDuxo3, str3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (i9 >> 6) & 14);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    String str5 = str3;
                    gainsAndLossesDuxo4 = gainsAndLossesDuxo3;
                    str4 = str5;
                    modifier4 = modifier5;
                    gainsAndLossesSectionHeader4 = gainsAndLossesSectionHeader5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesDashboardSectionKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GainsAndLossesDashboardSection.GainsAndLossesDashboardSection$lambda$2(modifier4, gainsAndLossesSectionHeader4, str4, gainsAndLossesDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            str2 = str;
            if ((i & 3072) == 0) {
            }
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(gainsAndLossesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    int i92 = i5;
                    Modifier modifier52 = modifier3;
                    TaxLossHarvestDashboard.GainsAndLossesSectionHeader gainsAndLossesSectionHeader52 = gainsAndLossesSectionHeader3;
                    GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.DASHBOARD_SECTION, GainsAndLossesDashboardSection$lambda$0(snapshotState4CollectAsStateWithLifecycle2), modifier52, null, gainsAndLossesSectionHeader52, composerStartRestartGroup, ((i5 << 6) & 896) | 6 | ((i5 << 9) & 57344), 8);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChangedInstance = composerStartRestartGroup.changedInstance(gainsAndLossesDuxo3) | ((i92 & 896) != 256 ? true : z);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue = new GainsAndLossesDashboardSection2(gainsAndLossesDuxo3, str3, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(str3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, (i92 >> 6) & 14);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        String str52 = str3;
                        gainsAndLossesDuxo4 = gainsAndLossesDuxo3;
                        str4 = str52;
                        modifier4 = modifier52;
                        gainsAndLossesSectionHeader4 = gainsAndLossesSectionHeader52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        gainsAndLossesSectionHeader2 = gainsAndLossesSectionHeader;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        str2 = str;
        if ((i & 3072) == 0) {
        }
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final GainsAndLossesViewState GainsAndLossesDashboardSection$lambda$0(SnapshotState4<GainsAndLossesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
