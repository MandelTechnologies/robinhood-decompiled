package com.robinhood.android.equity.history.p121ui.borrowcharge;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
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
import com.robinhood.android.account.strings.C8179R;
import com.robinhood.android.common.portfolio.position.PositionListItemComposableKt;
import com.robinhood.android.equity.history.C15093R;
import com.robinhood.android.equity.history.p121ui.borrowcharge.BorrowChargeDetailViewState;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoLifecycleObserver;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowDefaults;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.duxo.DuxosKt;
import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;

/* compiled from: BorrowChargeDetailComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\u000f\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0003¢\u0006\u0002\u0010\u0014\"\u001a\u0010\t\u001a\u00020\nX\u0080\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0015²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"BorrowChargeDetailComposable", "", "onBackPressed", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "duxo", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailDuxo;Landroidx/compose/runtime/Composer;II)V", "PlaceHolderAccountDisplayName", "Lcom/robinhood/utils/resource/StringResource;", "getPlaceHolderAccountDisplayName$annotations", "()V", "getPlaceHolderAccountDisplayName", "()Lcom/robinhood/utils/resource/StringResource;", "BorrowChargeDetailContent", "viewState", "Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState;", "paddingValues", "Landroidx/compose/foundation/layout/PaddingValues;", "(Lcom/robinhood/android/equity/history/ui/borrowcharge/BorrowChargeDetailViewState;Landroidx/compose/foundation/layout/PaddingValues;Landroidx/compose/runtime/Composer;I)V", "feature-equity-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class BorrowChargeDetailComposableKt {
    private static final StringResource PlaceHolderAccountDisplayName = StringResource.INSTANCE.invoke(C8179R.string.account_individual_title, new Object[0]);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BorrowChargeDetailComposable$lambda$1(Function0 function0, Modifier modifier, BorrowChargeDetailDuxo borrowChargeDetailDuxo, int i, int i2, Composer composer, int i3) {
        BorrowChargeDetailComposable(function0, modifier, borrowChargeDetailDuxo, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BorrowChargeDetailContent$lambda$6(BorrowChargeDetailViewState borrowChargeDetailViewState, PaddingValues paddingValues, int i, Composer composer, int i2) {
        BorrowChargeDetailContent(borrowChargeDetailViewState, paddingValues, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getPlaceHolderAccountDisplayName$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BorrowChargeDetailComposable(final Function0<Unit> onBackPressed, Modifier modifier, BorrowChargeDetailDuxo borrowChargeDetailDuxo, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BorrowChargeDetailDuxo borrowChargeDetailDuxo2;
        Modifier modifier3;
        int i4;
        BorrowChargeDetailDuxo borrowChargeDetailDuxo3;
        final BorrowChargeDetailDuxo borrowChargeDetailDuxo4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1428919449);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onBackPressed) ? 4 : 2) | i;
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
                    borrowChargeDetailDuxo2 = borrowChargeDetailDuxo;
                    int i6 = composerStartRestartGroup.changedInstance(borrowChargeDetailDuxo2) ? 256 : 128;
                    i3 |= i6;
                } else {
                    borrowChargeDetailDuxo2 = borrowChargeDetailDuxo;
                }
                i3 |= i6;
            } else {
                borrowChargeDetailDuxo2 = borrowChargeDetailDuxo;
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
                        ViewModel viewModel = ViewModelKt.viewModel((KClass<ViewModel>) Reflection.getOrCreateKotlinClass(BorrowChargeDetailDuxo.class), current, (String) null, factoryCreateViewModelFactory, current instanceof HasDefaultViewModelProviderFactory ? ((HasDefaultViewModelProviderFactory) current).getDefaultViewModelCreationExtras() : CreationExtras.Empty.INSTANCE, composerStartRestartGroup, 0, 0);
                        composerStartRestartGroup.endReplaceableGroup();
                        final BaseDuxo baseDuxo = (BaseDuxo) viewModel;
                        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner())).getLifecycle();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(baseDuxo) | composerStartRestartGroup.changedInstance(lifecycle);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailComposable$$inlined$duxo$1
                                @Override // kotlin.jvm.functions.Function1
                                public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                                    Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                                    final DuxoLifecycleObserver duxoLifecycleObserver = new DuxoLifecycleObserver(baseDuxo);
                                    lifecycle.addObserver(duxoLifecycleObserver);
                                    final Lifecycle lifecycle2 = lifecycle;
                                    return new DisposableEffectResult() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailComposable$$inlined$duxo$1.1
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
                        i4 = i3 & (-897);
                        borrowChargeDetailDuxo3 = (BorrowChargeDetailDuxo) baseDuxo;
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1428919449, i4, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable (BorrowChargeDetailComposable.kt:38)");
                        }
                        final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(borrowChargeDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21371getBg0d7_KjU();
                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                        modifier2 = modifier3;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(904243755, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i8) {
                                if ((i8 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(904243755, i8, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous> (BorrowChargeDetailComposable.kt:44)");
                                }
                                Function2<Composer, Integer, Unit> lambda$741704728$feature_equity_history_externalDebug = ComposableSingletons$BorrowChargeDetailComposableKt.INSTANCE.getLambda$741704728$feature_equity_history_externalDebug();
                                final Function0<Unit> function0 = onBackPressed;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$741704728$feature_equity_history_externalDebug, null, ComposableLambda3.rememberComposableLambda(24218476, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.1.1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i9) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i9 & 6) == 0) {
                                            i9 |= (i9 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(24218476, i9, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:47)");
                                        }
                                        BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "back_button"), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i9 << 12) & 57344), 6);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, null, ComposableLambda3.rememberComposableLambda(429245558, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                                invoke(paddingValues, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues paddingValues, Composer composer2, int i8) {
                                Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                                if ((i8 & 6) == 0) {
                                    i8 |= composer2.changed(paddingValues) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(429245558, i8, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous> (BorrowChargeDetailComposable.kt:56)");
                                }
                                BorrowChargeDetailComposableKt.BorrowChargeDetailContent(BorrowChargeDetailComposableKt.BorrowChargeDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle), paddingValues, composer2, (i8 << 3) & 112);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 316);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        borrowChargeDetailDuxo4 = borrowChargeDetailDuxo3;
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
                borrowChargeDetailDuxo3 = borrowChargeDetailDuxo2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                final SnapshotState4<BorrowChargeDetailViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(borrowChargeDetailDuxo3.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                modifier2 = modifier3;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier2, ComposableLambda3.rememberComposableLambda(904243755, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(904243755, i8, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous> (BorrowChargeDetailComposable.kt:44)");
                        }
                        Function2<Composer, Integer, Unit> lambda$741704728$feature_equity_history_externalDebug = ComposableSingletons$BorrowChargeDetailComposableKt.INSTANCE.getLambda$741704728$feature_equity_history_externalDebug();
                        final Function0<Unit> function0 = onBackPressed;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$741704728$feature_equity_history_externalDebug, null, ComposableLambda3.rememberComposableLambda(24218476, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                invoke(bentoAppBarScope, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer3, int i9) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i9 & 6) == 0) {
                                    i9 |= (i9 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i9 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(24218476, i9, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:47)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "back_button"), false, null, function0, composer3, (BentoAppBarScope.$stable << 12) | 6 | ((i9 << 12) & 57344), 6);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, null, false, false, null, null, 0L, null, composer2, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, null, ComposableLambda3.rememberComposableLambda(429245558, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt.BorrowChargeDetailComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                        invoke(paddingValues, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer2, int i8) {
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i8 & 6) == 0) {
                            i8 |= composer2.changed(paddingValues) ? 4 : 2;
                        }
                        if ((i8 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(429245558, i8, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposable.<anonymous> (BorrowChargeDetailComposable.kt:56)");
                        }
                        BorrowChargeDetailComposableKt.BorrowChargeDetailContent(BorrowChargeDetailComposableKt.BorrowChargeDetailComposable$lambda$0(snapshotState4CollectAsStateWithLifecycle2), paddingValues, composer2, (i8 << 3) & 112);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i4 >> 3) & 14) | 805306416, 316);
                composerStartRestartGroup = composerStartRestartGroup;
                if (ComposerKt.isTraceInProgress()) {
                }
                borrowChargeDetailDuxo4 = borrowChargeDetailDuxo3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                borrowChargeDetailDuxo4 = borrowChargeDetailDuxo2;
            }
            final Modifier modifier4 = modifier2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BorrowChargeDetailComposableKt.BorrowChargeDetailComposable$lambda$1(onBackPressed, modifier4, borrowChargeDetailDuxo4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        final Modifier modifier42 = modifier2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final StringResource getPlaceHolderAccountDisplayName() {
        return PlaceHolderAccountDisplayName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BorrowChargeDetailContent(final BorrowChargeDetailViewState borrowChargeDetailViewState, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1372798347);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(borrowChargeDetailViewState) : composerStartRestartGroup.changedInstance(borrowChargeDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(paddingValues) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1372798347, i2, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent (BorrowChargeDetailComposable.kt:72)");
            }
            final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null), paddingValues);
            PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 1, null);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(borrowChargeDetailViewState) | composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BorrowChargeDetailComposableKt.BorrowChargeDetailContent$lambda$5$lambda$4(borrowChargeDetailViewState, context, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            LazyDslKt.LazyColumn(modifierPadding, null, paddingValuesM5137PaddingValuesYgX7TsA$default, false, null, null, null, false, null, (Function1) objRememberedValue, composerStartRestartGroup, 0, 506);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BorrowChargeDetailComposableKt.BorrowChargeDetailContent$lambda$6(borrowChargeDetailViewState, paddingValues, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BorrowChargeDetailContent$lambda$5$lambda$4(final BorrowChargeDetailViewState borrowChargeDetailViewState, final Context context, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        LazyListScope.item$default(LazyColumn, null, null, ComposableSingletons$BorrowChargeDetailComposableKt.INSTANCE.getLambda$2139910080$feature_equity_history_externalDebug(), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-407436567, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x0044  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                CharSequence text;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-407436567, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:93)");
                }
                StringResource accountDisplayName = borrowChargeDetailViewState.getAccountDisplayName();
                if (accountDisplayName != null) {
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    text = accountDisplayName.getText(resources);
                    if (text == null) {
                        StringResource placeHolderAccountDisplayName = BorrowChargeDetailComposableKt.getPlaceHolderAccountDisplayName();
                        Resources resources2 = context.getResources();
                        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
                        text = placeHolderAccountDisplayName.getText(resources2);
                    }
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.account_used_title, composer, 0), null, 2, null), null, null, null, new AnnotatedString(text.toString(), null, 2, null), null, null, null, null, borrowChargeDetailViewState.getAccountDisplayName() == null, borrowChargeDetailViewState.getAccountDisplayName() == null, 989, null), null, null, composer, BentoDataRowState.$stable, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(493631368, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$2
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(493631368, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:108)");
                }
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.borrow_charge_charge_amount_title, composer, 0), null, 2, null);
                String totalChargeAmount = borrowChargeDetailViewState.getTotalChargeAmount();
                if (totalChargeAmount == null) {
                    totalChargeAmount = "-$XXX.XXXX";
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(totalChargeAmount, null, 2, null), null, null, null, null, borrowChargeDetailViewState.getTotalChargeAmount() == null, borrowChargeDetailViewState.getTotalChargeAmount() == null, 989, null), null, null, composer, BentoDataRowState.$stable, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(1394699303, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$3
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1394699303, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:119)");
                }
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.borrow_charge_charge_date_title, composer, 0), null, 2, null);
                String paymentDate = borrowChargeDetailViewState.getPaymentDate();
                if (paymentDate == null) {
                    paymentDate = "XXX X, XXXX";
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(paymentDate, null, 2, null), null, null, null, null, borrowChargeDetailViewState.getPaymentDate() == null, borrowChargeDetailViewState.getPaymentDate() == null, 989, null), null, null, composer, BentoDataRowState.$stable, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1999200058, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$4
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                String string2;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1999200058, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:130)");
                }
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.borrow_charge_charge_period_title, composer, 0), null, 2, null);
                StringResource chargePeriod = borrowChargeDetailViewState.getChargePeriod();
                if (chargePeriod != null) {
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    CharSequence text = chargePeriod.getText(resources);
                    if (text == null || (string2 = text.toString()) == null) {
                        string2 = "XXX X, XXXX";
                    }
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string2, null, 2, null), null, null, null, null, borrowChargeDetailViewState.getChargePeriod() == null, borrowChargeDetailViewState.getChargePeriod() == null, 989, null), null, null, composer, BentoDataRowState.$stable, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-1098132123, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$5
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) throws Resources.NotFoundException {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX WARN: Removed duplicated region for block: B:18:0x005e  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final void invoke(LazyItemScope item, Composer composer, int i) throws Resources.NotFoundException {
                String string2;
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1098132123, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:143)");
                }
                AnnotatedString annotatedString = new AnnotatedString(StringResources_androidKt.stringResource(C15093R.string.borrow_charge_charge_status_title, composer, 0), null, 2, null);
                StringResource status = borrowChargeDetailViewState.getStatus();
                if (status != null) {
                    Resources resources = context.getResources();
                    Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
                    CharSequence text = status.getText(resources);
                    if (text == null || (string2 = text.toString()) == null) {
                        string2 = PositionListItemComposableKt.PlaceholderPrimaryText;
                    }
                }
                BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(string2, null, 2, null), null, null, null, null, borrowChargeDetailViewState.getStatus() == null, borrowChargeDetailViewState.getStatus() == null, 989, null), null, null, composer, BentoDataRowState.$stable, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        LazyListScope.item$default(LazyColumn, null, null, ComposableLambda3.composableLambdaInstance(-197064188, true, new Function3<LazyItemScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$1$1$6
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Composer composer, Integer num) {
                invoke(lazyItemScope, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope item, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(item, "$this$item");
                if ((i & 17) == 16 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-197064188, i, -1, "com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailContent.<anonymous>.<anonymous>.<anonymous> (BorrowChargeDetailComposable.kt:154)");
                }
                String strStringResource = StringResources_androidKt.stringResource(C15093R.string.borrow_charge_charge_instruments_title, composer, 0);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i2 = BentoTheme.$stable;
                BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(ModifiersKt.bentoPlaceholder$default(Modifier.INSTANCE, borrowChargeDetailViewState.getInstrumentBorrowCharges() == null, null, 2, null), bentoTheme.getSpacing(composer, i2).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, BentoDataRowDefaults.INSTANCE.m20963getCondensedVerticalPaddingD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 2, 0, null, 0, bentoTheme.getTypography(composer, i2).getTextS(), composer, 805306368, 0, 7672);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), 3, null);
        final List instrumentBorrowCharges = borrowChargeDetailViewState.getInstrumentBorrowCharges();
        if (instrumentBorrowCharges == null) {
            instrumentBorrowCharges = CollectionsKt.emptyList();
        }
        final C15109xfa1c6d07 c15109xfa1c6d07 = new Function1() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$lambda$5$lambda$4$$inlined$items$default$1
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(BorrowChargeDetailViewState.UiBorrowCharge uiBorrowCharge) {
                return null;
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return invoke((BorrowChargeDetailViewState.UiBorrowCharge) obj);
            }
        };
        LazyColumn.items(instrumentBorrowCharges.size(), null, new Function1<Integer, Object>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$lambda$5$lambda$4$$inlined$items$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return c15109xfa1c6d07.invoke(instrumentBorrowCharges.get(i));
            }
        }, ComposableLambda3.composableLambdaInstance(-632812321, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.equity.history.ui.borrowcharge.BorrowChargeDetailComposableKt$BorrowChargeDetailContent$lambda$5$lambda$4$$inlined$items$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer.changed(i) ? 32 : 16;
                }
                if (!composer.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-632812321, i3, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
                }
                BorrowChargeDetailViewState.UiBorrowCharge uiBorrowCharge = (BorrowChargeDetailViewState.UiBorrowCharge) instrumentBorrowCharges.get(i);
                composer.startReplaceGroup(-1040567974);
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxWidth$default, bentoTheme.getSpacing(composer, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer, i4).m21593getSmallD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getSpaceBetween(), Alignment.INSTANCE.getTop(), composer, 6);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(uiBorrowCharge.getInstrument().getSymbol(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextM(), composer, 0, 0, 8186);
                BentoText2.m20747BentoText38GnDrw(uiBorrowCharge.getChargeAmount(), null, Color.m6701boximpl(bentoTheme.getColors(composer, i4).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer, i4).getTextM(), composer, 0, 0, 8186);
                composer.endNode();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BorrowChargeDetailViewState BorrowChargeDetailComposable$lambda$0(SnapshotState4<BorrowChargeDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
