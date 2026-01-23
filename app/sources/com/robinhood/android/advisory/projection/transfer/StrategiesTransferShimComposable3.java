package com.robinhood.android.advisory.projection.transfer;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.material3.ScaffoldKt;
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
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.compose.duxo.DuxosKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: StrategiesTransferShimComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f²\u0006\u0012\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000eX\u008a\u0084\u0002"}, m3636d2 = {"StrategiesTransferShimComposable", "", "onBackClicked", "Lkotlin/Function0;", "onEvent", "Lkotlin/Function1;", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimDuxo;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/advisory/projection/transfer/StrategiesTransferShimDuxo;Landroidx/compose/runtime/Composer;II)V", "feature-projected-returns_externalDebug", "event", "Lcom/robinhood/android/udf/event/Event;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class StrategiesTransferShimComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StrategiesTransferShimComposable$lambda$2(Function0 function0, Function1 function1, Modifier modifier, StrategiesTransferShimDuxo strategiesTransferShimDuxo, int i, int i2, Composer composer, int i3) {
        StrategiesTransferShimComposable(function0, function1, modifier, strategiesTransferShimDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StrategiesTransferShimComposable(final Function0<Unit> onBackClicked, final Function1<? super StrategiesTransferShimEvent, Unit> onEvent, Modifier modifier, StrategiesTransferShimDuxo strategiesTransferShimDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        StrategiesTransferShimDuxo strategiesTransferShimDuxo2;
        final Modifier modifier3;
        boolean z;
        int i4;
        StrategiesTransferShimDuxo strategiesTransferShimDuxo3;
        SnapshotState4 snapshotState4CollectAsStateWithLifecycle;
        boolean zChanged;
        Object objRememberedValue;
        final StrategiesTransferShimDuxo strategiesTransferShimDuxo4;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClicked, "onBackClicked");
        Intrinsics.checkNotNullParameter(onEvent, "onEvent");
        Composer composerStartRestartGroup = composer.startRestartGroup(-27701612);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackClicked) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onEvent) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    strategiesTransferShimDuxo2 = strategiesTransferShimDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(strategiesTransferShimDuxo2) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    strategiesTransferShimDuxo2 = strategiesTransferShimDuxo;
                }
                i3 |= i6;
            } else {
                strategiesTransferShimDuxo2 = strategiesTransferShimDuxo;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if ((i2 & 8) == 0) {
                        composerStartRestartGroup.startReplaceGroup(-747520797);
                        ViewModelStoreOwner current = LocalViewModelStoreOwner.INSTANCE.getCurrent(composerStartRestartGroup, LocalViewModelStoreOwner.$stable);
                        if (current == null) {
                            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                        }
                        ViewModelProvider.Factory factoryCreateViewModelFactory = DuxosKt.createViewModelFactory(current, composerStartRestartGroup, 0);
                        composerStartRestartGroup.startReplaceableGroup(1729797275);
                        z = false;
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(StrategiesTransferShimDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$StrategiesTransferShimComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$StrategiesTransferShimComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-7169);
                        strategiesTransferShimDuxo3 = (StrategiesTransferShimDuxo) baseDuxo;
                    } else {
                        z = false;
                        i4 = i3;
                        strategiesTransferShimDuxo3 = strategiesTransferShimDuxo2;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    i4 = i3;
                    modifier3 = modifier2;
                    strategiesTransferShimDuxo3 = strategiesTransferShimDuxo2;
                    z = false;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-27701612, i4, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable (StrategiesTransferShimComposable.kt:19)");
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(strategiesTransferShimDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Composer composer2 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(125535064, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(125535064, i7, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous> (StrategiesTransferShimComposable.kt:24)");
                        }
                        Function2<Composer, Integer, Unit> lambda$301999301$feature_projected_returns_externalDebug = StrategiesTransferShimComposable.INSTANCE.getLambda$301999301$feature_projected_returns_externalDebug();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$301999301$feature_projected_returns_externalDebug, null, ComposableLambda3.rememberComposableLambda(1109604889, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1109604889, i8, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous>.<anonymous> (StrategiesTransferShimComposable.kt:27)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1827310115, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1827310115, i7, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous> (StrategiesTransferShimComposable.kt:34)");
                        }
                        LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(modifier3, paddingValues), false, composer3, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, 805306416, 509);
                composerStartRestartGroup = composer2;
                Event<StrategiesTransferShimEvent> eventStrategiesTransferShimComposable$lambda$0 = StrategiesTransferShimComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new StrategiesTransferShimComposable4(onEvent, snapshotState4CollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(eventStrategiesTransferShimComposable$lambda$0, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                Modifier modifier5 = modifier3;
                strategiesTransferShimDuxo4 = strategiesTransferShimDuxo3;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                strategiesTransferShimDuxo4 = strategiesTransferShimDuxo2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return StrategiesTransferShimComposable3.StrategiesTransferShimComposable$lambda$2(onBackClicked, onEvent, modifier4, strategiesTransferShimDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 == 0) {
                }
                if ((i2 & 8) == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(strategiesTransferShimDuxo3.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                Composer composer22 = composerStartRestartGroup;
                ScaffoldKt.m5939ScaffoldTvnljyQ(null, ComposableLambda3.rememberComposableLambda(125535064, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(125535064, i7, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous> (StrategiesTransferShimComposable.kt:24)");
                        }
                        Function2<Composer, Integer, Unit> lambda$301999301$feature_projected_returns_externalDebug = StrategiesTransferShimComposable.INSTANCE.getLambda$301999301$feature_projected_returns_externalDebug();
                        final Function0<Unit> function0 = onBackClicked;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$301999301$feature_projected_returns_externalDebug, null, ComposableLambda3.rememberComposableLambda(1109604889, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1109604889, i8, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous>.<anonymous> (StrategiesTransferShimComposable.kt:27)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1827310115, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposableKt.StrategiesTransferShimComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i7 & 6) == 0) {
                            i7 |= composer3.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i7 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1827310115, i7, -1, "com.robinhood.android.advisory.projection.transfer.StrategiesTransferShimComposable.<anonymous> (StrategiesTransferShimComposable.kt:34)");
                        }
                        LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.padding(modifier3, paddingValues), false, composer3, 0, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer22, 805306416, 509);
                composerStartRestartGroup = composer22;
                Event<StrategiesTransferShimEvent> eventStrategiesTransferShimComposable$lambda$02 = StrategiesTransferShimComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(snapshotState4CollectAsStateWithLifecycle) | ((i4 & 112) != 32);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue = new StrategiesTransferShimComposable4(onEvent, snapshotState4CollectAsStateWithLifecycle, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    EffectsKt.LaunchedEffect(eventStrategiesTransferShimComposable$lambda$02, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier3;
                    strategiesTransferShimDuxo4 = strategiesTransferShimDuxo3;
                    modifier4 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Event<StrategiesTransferShimEvent> StrategiesTransferShimComposable$lambda$0(SnapshotState4<Event<StrategiesTransferShimEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
