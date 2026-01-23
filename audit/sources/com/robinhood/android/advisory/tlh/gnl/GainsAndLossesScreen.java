package com.robinhood.android.advisory.tlh.gnl;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
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
import com.robinhood.android.advisory.tlh.Components2;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.models.advisory.p304db.tlh.TaxGainsAndLossesResponse;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
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

/* compiled from: GainsAndLossesScreen.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u0084\u0002"}, m3636d2 = {"GainsAndLossesScreen", "", "onBackClicked", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "viewState", "Lcom/robinhood/android/advisory/tlh/gnl/GainsAndLossesViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class GainsAndLossesScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GainsAndLossesScreen$lambda$1(Function0 function0, Modifier modifier, GainsAndLossesDuxo gainsAndLossesDuxo, int i, int i2, Composer composer, int i3) {
        GainsAndLossesScreen(function0, modifier, gainsAndLossesDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GainsAndLossesScreen(final Function0<Unit> onBackClicked, Modifier modifier, GainsAndLossesDuxo gainsAndLossesDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        GainsAndLossesDuxo gainsAndLossesDuxo2;
        final Modifier modifier3;
        CreationExtras defaultViewModelCreationExtras;
        int i4;
        GainsAndLossesDuxo gainsAndLossesDuxo3;
        final GainsAndLossesDuxo gainsAndLossesDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(446784297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
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
                    gainsAndLossesDuxo2 = gainsAndLossesDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(gainsAndLossesDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    gainsAndLossesDuxo2 = gainsAndLossesDuxo;
                }
                i3 |= i6;
            } else {
                gainsAndLossesDuxo2 = gainsAndLossesDuxo;
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
                        if (current instanceof HasDefaultViewModelProviderFactory) {
                            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras();
                        } else {
                            defaultViewModelCreationExtras = CreationExtras.Empty.INSTANCE;
                        }
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(GainsAndLossesDuxo.class), current, (String) null, factoryCreateViewModelFactory, defaultViewModelCreationExtras, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt$GainsAndLossesScreen$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt$GainsAndLossesScreen$$inlined$duxo$1.1
                                        @Override // androidx.compose.runtime.DisposableEffectResult
                                        public void dispose() {
                                            lifecycle2.removeObserver(duxoLifecycleObserver);
                                        }
                                    };
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.DisposableEffect(lifecycle, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        GainsAndLossesDuxo gainsAndLossesDuxo5 = (GainsAndLossesDuxo) baseDuxo;
                        i4 = i3 & (-897);
                        gainsAndLossesDuxo3 = gainsAndLossesDuxo5;
                    }
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(446784297, i4, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen (GainsAndLossesScreen.kt:19)");
                    }
                    final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(gainsAndLossesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                    composerStartRestartGroup = composerStartRestartGroup;
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GAINS_AND_LOSSES, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1791209196, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            TaxGainsAndLossesResponse.GainsAndLossesFullScreenData fullScreenData;
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1791209196, i7, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous> (GainsAndLossesScreen.kt:29)");
                            }
                            String navigationTitle = null;
                            Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                            TaxGainsAndLossesResponse response = GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle).getResponse();
                            if (response != null && (fullScreenData = response.getFullScreenData()) != null) {
                                navigationTitle = fullScreenData.getNavigationTitle();
                            }
                            String str = navigationTitle;
                            final Function0<Unit> function0 = onBackClicked;
                            final SnapshotState4<GainsAndLossesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                            Components2.TaxLossHarvestingScaffold(function0, modifierLogScreenTransitions$default, true, false, str, null, ComposableLambda3.rememberComposableLambda(1385255051, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                    invoke(paddingValues, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                    if ((i8 & 6) == 0) {
                                        i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                    }
                                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1385255051, i8, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous>.<anonymous> (GainsAndLossesScreen.kt:35)");
                                    }
                                    GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.FULL_PAGE, GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4), PaddingKt.padding(Modifier.INSTANCE, paddingValues), function0, null, composer3, 6, 16);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 1573248, 40);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    Modifier modifier5 = modifier3;
                    gainsAndLossesDuxo4 = gainsAndLossesDuxo3;
                    modifier4 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                i4 = i3;
                gainsAndLossesDuxo3 = gainsAndLossesDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<GainsAndLossesViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(gainsAndLossesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GAINS_AND_LOSSES, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1791209196, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        TaxGainsAndLossesResponse.GainsAndLossesFullScreenData fullScreenData;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1791209196, i7, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous> (GainsAndLossesScreen.kt:29)");
                        }
                        String navigationTitle = null;
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        TaxGainsAndLossesResponse response = GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle2).getResponse();
                        if (response != null && (fullScreenData = response.getFullScreenData()) != null) {
                            navigationTitle = fullScreenData.getNavigationTitle();
                        }
                        String str = navigationTitle;
                        final Function0<Unit> function0 = onBackClicked;
                        final SnapshotState4<GainsAndLossesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                        Components2.TaxLossHarvestingScaffold(function0, modifierLogScreenTransitions$default, true, false, str, null, ComposableLambda3.rememberComposableLambda(1385255051, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1385255051, i8, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous>.<anonymous> (GainsAndLossesScreen.kt:35)");
                                }
                                GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.FULL_PAGE, GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4), PaddingKt.padding(Modifier.INSTANCE, paddingValues), function0, null, composer3, 6, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1573248, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier3;
                gainsAndLossesDuxo4 = gainsAndLossesDuxo3;
                modifier4 = modifier52;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                gainsAndLossesDuxo4 = gainsAndLossesDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GainsAndLossesScreen.GainsAndLossesScreen$lambda$1(onBackClicked, modifier4, gainsAndLossesDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
                    i4 = i3;
                    gainsAndLossesDuxo3 = gainsAndLossesDuxo2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<GainsAndLossesViewState> snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(gainsAndLossesDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composerStartRestartGroup = composerStartRestartGroup;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.GAINS_AND_LOSSES, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-1791209196, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        TaxGainsAndLossesResponse.GainsAndLossesFullScreenData fullScreenData;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1791209196, i7, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous> (GainsAndLossesScreen.kt:29)");
                        }
                        String navigationTitle = null;
                        Modifier modifierLogScreenTransitions$default = ModifiersKt.logScreenTransitions$default(modifier3, null, 1, null);
                        TaxGainsAndLossesResponse response = GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4CollectAsStateWithLifecycle22).getResponse();
                        if (response != null && (fullScreenData = response.getFullScreenData()) != null) {
                            navigationTitle = fullScreenData.getNavigationTitle();
                        }
                        String str = navigationTitle;
                        final Function0<Unit> function0 = onBackClicked;
                        final SnapshotState4<GainsAndLossesViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle22;
                        Components2.TaxLossHarvestingScaffold(function0, modifierLogScreenTransitions$default, true, false, str, null, ComposableLambda3.rememberComposableLambda(1385255051, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreenKt.GainsAndLossesScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer3, int i8) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer3.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1385255051, i8, -1, "com.robinhood.android.advisory.tlh.gnl.GainsAndLossesScreen.<anonymous>.<anonymous> (GainsAndLossesScreen.kt:35)");
                                }
                                GainsAndLossesSectionKt.GainsAndLossesMainSection(GainsAndLossesStyle.FULL_PAGE, GainsAndLossesScreen.GainsAndLossesScreen$lambda$0(snapshotState4), PaddingKt.padding(Modifier.INSTANCE, paddingValues), function0, null, composer3, 6, 16);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 1573248, 40);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier522 = modifier3;
                gainsAndLossesDuxo4 = gainsAndLossesDuxo3;
                modifier4 = modifier522;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GainsAndLossesViewState GainsAndLossesScreen$lambda$0(SnapshotState4<GainsAndLossesViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
