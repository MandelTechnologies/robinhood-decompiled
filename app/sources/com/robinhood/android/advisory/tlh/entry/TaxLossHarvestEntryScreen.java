package com.robinhood.android.advisory.tlh.entry;

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
import com.robinhood.android.advisory.tlh.nux.TaxLossHarvestNuxScreen3;
import com.robinhood.android.advisory.tlh.summary.TaxLossHarvestingDashboardScreen;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
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

/* compiled from: TaxLossHarvestEntryScreen.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aE\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\n\u0010\r\u001a\u00020\u000eX\u008a\u0084\u0002"}, m3636d2 = {"TaxLossHarvestEntryScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onInternalNavigate", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "duxo", "Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/entry/TaxLossHarvestEntryViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class TaxLossHarvestEntryScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestEntryScreen$lambda$8(Function0 function0, Modifier modifier, Function1 function1, TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo, int i, int i2, Composer composer, int i3) {
        TaxLossHarvestEntryScreen(function0, modifier, function1, taxLossHarvestEntryDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestEntryScreen$lambda$1$lambda$0(ComposableDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01db  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TaxLossHarvestEntryScreen(final Function0<Unit> onBackClicked, Modifier modifier, Function1<? super ComposableDestination, Unit> function1, TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super ComposableDestination, Unit> function12;
        TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo2;
        Function1<? super ComposableDestination, Unit> function13;
        int i5;
        int i6;
        Modifier modifier3;
        final TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo3;
        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        Modifier modifier4;
        final Modifier modifier5;
        final TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(1302044234);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
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
                        taxLossHarvestEntryDuxo2 = taxLossHarvestEntryDuxo;
                        int i8 = composerStartRestartGroup.changedInstance(taxLossHarvestEntryDuxo2) ? 2048 : 1024;
                        i3 |= i8;
                    } else {
                        taxLossHarvestEntryDuxo2 = taxLossHarvestEntryDuxo;
                    }
                    i3 |= i8;
                } else {
                    taxLossHarvestEntryDuxo2 = taxLossHarvestEntryDuxo;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    taxLossHarvestEntryDuxo4 = taxLossHarvestEntryDuxo2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier6 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i4 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$1$lambda$0((ComposableDestination) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function13 = (Function1) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function13 = function12;
                        }
                        if ((i2 & 8) == 0) {
                            composerStartRestartGroup.startReplaceGroup(-747520797);
                            ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                            if (current == null) {
                                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                            }
                            ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                            composerStartRestartGroup.startReplaceableGroup(1729797275);
                            i5 = -1633490746;
                            ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(TaxLossHarvestEntryDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                            composerStartRestartGroup = composerStartRestartGroup;
                            composerStartRestartGroup.endReplaceableGroup();
                            final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                            final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$TaxLossHarvestEntryScreen$$inlined$duxo$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                        final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                        lifecycle.addObserver(duxoLifecycleObserver);
                                        final Lifecycle lifecycle2 = lifecycle;
                                        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$TaxLossHarvestEntryScreen$$inlined$duxo$1.1
                                            @Override // androidx.compose.runtime.DisposableEffectResult
                                            public void dispose() {
                                                lifecycle2.removeObserver(duxoLifecycleObserver);
                                            }
                                        };
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue3, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier7 = modifier6;
                            i6 = i3 & (-7169);
                            modifier3 = modifier7;
                            taxLossHarvestEntryDuxo3 = (TaxLossHarvestEntryDuxo) baseDuxo;
                        } else {
                            i5 = -1633490746;
                            Modifier modifier8 = modifier6;
                            i6 = i3;
                            modifier3 = modifier8;
                            taxLossHarvestEntryDuxo3 = taxLossHarvestEntryDuxo2;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                        i6 = i3;
                        modifier3 = modifier2;
                        function13 = function12;
                        taxLossHarvestEntryDuxo3 = taxLossHarvestEntryDuxo2;
                        i5 = -1633490746;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1302044234, i6, -1, "com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreen (TaxLossHarvestEntryScreen.kt:18)");
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(taxLossHarvestEntryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Unit unit = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(taxLossHarvestEntryDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$5$lambda$4(taxLossHarvestEntryDuxo3, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                    if (TaxLossHarvestEntryScreen$lambda$2(snapshotState4CollectAsStateWithLifecycle).getHasSeenNuxScreen()) {
                        Modifier modifier9 = modifier3;
                        function12 = function13;
                        composerStartRestartGroup.startReplaceGroup(1350801030);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(taxLossHarvestEntryDuxo3);
                        Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance2 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$7$lambda$6(taxLossHarvestEntryDuxo3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        TaxLossHarvestNuxScreen3.TaxLossHarvestNuxScreen(onBackClicked, (Function0) objRememberedValue4, modifier9, composerStartRestartGroup, (i6 & 14) | ((i6 << 3) & 896), 0);
                        modifier4 = modifier9;
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(1350610783);
                        modifier4 = modifier3;
                        Function1<? super ComposableDestination, Unit> function14 = function13;
                        TaxLossHarvestingDashboardScreen.TaxLossHarvestDashboardScreen(onBackClicked, modifier4, function14, null, composerStartRestartGroup, i6 & 1022, 8);
                        function12 = function14;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier5 = modifier4;
                    taxLossHarvestEntryDuxo4 = taxLossHarvestEntryDuxo3;
                }
                final Function1<? super ComposableDestination, Unit> function15 = function12;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$8(onBackClicked, modifier5, function15, taxLossHarvestEntryDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            if ((i3 & 1171) == 1170) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if ((i2 & 8) == 0) {
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(taxLossHarvestEntryDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    Unit unit2 = Unit.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(i5);
                    zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | composerStartRestartGroup.changedInstance(taxLossHarvestEntryDuxo3);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue = new Function1() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$5$lambda$4(taxLossHarvestEntryDuxo3, snapshotState4CollectAsStateWithLifecycle, (DisposableEffectScope) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 6);
                        if (TaxLossHarvestEntryScreen$lambda$2(snapshotState4CollectAsStateWithLifecycle).getHasSeenNuxScreen()) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                        taxLossHarvestEntryDuxo4 = taxLossHarvestEntryDuxo3;
                    }
                }
            }
            final Function1 function152 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
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
        if ((i3 & 1171) == 1170) {
        }
        final Function1 function1522 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TaxLossHarvestEntryScreen$lambda$7$lambda$6(TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo) {
        taxLossHarvestEntryDuxo.markNuxSeen();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult TaxLossHarvestEntryScreen$lambda$5$lambda$4(final TaxLossHarvestEntryDuxo taxLossHarvestEntryDuxo, final SnapshotState4 snapshotState4, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.entry.TaxLossHarvestEntryScreenKt$TaxLossHarvestEntryScreen$lambda$5$lambda$4$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                if (TaxLossHarvestEntryScreen.TaxLossHarvestEntryScreen$lambda$2(snapshotState4).getHasSeenNuxScreen()) {
                    return;
                }
                taxLossHarvestEntryDuxo.markNuxSeen();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLossHarvestEntryViewState TaxLossHarvestEntryScreen$lambda$2(SnapshotState4<TaxLossHarvestEntryViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
