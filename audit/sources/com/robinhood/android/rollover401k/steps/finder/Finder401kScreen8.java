package com.robinhood.android.rollover401k.steps.finder;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import coil.compose.AsyncImagePainter;
import coil.compose.SingletonAsyncImagePainter;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.models.retirement.p194db.NoResultsViewModel;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResult;
import com.robinhood.android.models.retirement.p194db.Retirement401kFinderResultsViewmodel;
import com.robinhood.android.rollover401k.C27696R;
import com.robinhood.android.rollover401k.steps.finder.Finder401kState3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.rosetta.eventlogging.Screen;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: Finder401kScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u0006\u001a)\u0010\u0007\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\f\u001a+\u0010\r\u001a\u00020\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0013²\u0006\n\u0010\u0014\u001a\u00020\u0015X\u008a\u0084\u0002"}, m3636d2 = {"Finder401kScreen", "", "duxo", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/rollover401k/steps/finder/Finder401kDuxo;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FinderResults", "viewModel", "Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;", "callbacks", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kScreenCallbacks;", "(Lcom/robinhood/android/models/retirement/db/Retirement401kFinderResultsViewmodel;Lcom/robinhood/android/rollover401k/steps/finder/Finder401kScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "NoFinderResults", "Lcom/robinhood/android/models/retirement/db/NoResultsViewModel;", "(Lcom/robinhood/android/models/retirement/db/NoResultsViewModel;Lcom/robinhood/android/rollover401k/steps/finder/Finder401kScreenCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "FinderResultsPreview", "(Landroidx/compose/runtime/Composer;I)V", "NoFinderResultsPreview", "feature-rollover-401k_externalDebug", "state", "Lcom/robinhood/android/rollover401k/steps/finder/Finder401kResultsViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class Finder401kScreen8 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Finder401kScreen$lambda$1(Finder401kDuxo finder401kDuxo, Modifier modifier, int i, int i2, Composer composer, int i3) {
        Finder401kScreen(finder401kDuxo, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinderResults$lambda$7(Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, Finder401kScreen7 finder401kScreen7, Modifier modifier, int i, int i2, Composer composer, int i3) {
        FinderResults(retirement401kFinderResultsViewmodel, finder401kScreen7, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinderResultsPreview$lambda$13(int i, Composer composer, int i2) {
        FinderResultsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoFinderResults$lambda$12(NoResultsViewModel noResultsViewModel, Finder401kScreen7 finder401kScreen7, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NoFinderResults(noResultsViewModel, finder401kScreen7, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoFinderResultsPreview$lambda$14(int i, Composer composer, int i2) {
        NoFinderResultsPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Finder401kScreen(final Finder401kDuxo duxo, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1653967171);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1653967171, i4, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen (Finder401kScreen.kt:56)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                composer2 = composerStartRestartGroup;
                modifier3 = modifier4;
                ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-1361446791, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i6) {
                        if ((i6 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1361446791, i6, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous> (Finder401kScreen.kt:62)");
                        }
                        Function2<Composer, Integer, Unit> function2M18441getLambda$1217614292$feature_rollover_401k_externalDebug = Finder401kScreen.INSTANCE.m18441getLambda$1217614292$feature_rollover_401k_externalDebug();
                        final Finder401kDuxo finder401kDuxo = duxo;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M18441getLambda$1217614292$feature_rollover_401k_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1699931816, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i7 & 6) == 0) {
                                    i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1699931816, i7, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous>.<anonymous> (Finder401kScreen.kt:65)");
                                }
                                Finder401kDuxo finder401kDuxo2 = finder401kDuxo;
                                composer4.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer4.changedInstance(finder401kDuxo2);
                                Object objRememberedValue = composer4.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Finder401kScreen9(finder401kDuxo2);
                                    composer4.updateRememberedValue(objRememberedValue);
                                }
                                composer4.endReplaceGroup();
                                BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1796310414, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                        int i7;
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        if ((i6 & 6) == 0) {
                            i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                        } else {
                            i7 = i6;
                        }
                        if ((i7 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1796310414, i7, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous> (Finder401kScreen.kt:70)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                        Finder401kDuxo finder401kDuxo = duxo;
                        SnapshotState4<Finder401kState3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Finder401kState3 finder401kState3Finder401kScreen$lambda$0 = Finder401kScreen8.Finder401kScreen$lambda$0(snapshotState4);
                        if (Intrinsics.areEqual(finder401kState3Finder401kScreen$lambda$0, Finder401kState3.Loading.INSTANCE)) {
                            composer4.startReplaceGroup(1471663528);
                            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer3, 0, 15);
                            composer4 = composer3;
                            composer4.endReplaceGroup();
                        } else if (finder401kState3Finder401kScreen$lambda$0 instanceof Finder401kState3.NoResults) {
                            composer4.startReplaceGroup(-1622958356);
                            Finder401kScreen8.NoFinderResults(((Finder401kState3.NoResults) finder401kState3Finder401kScreen$lambda$0).getViewModel(), finder401kDuxo, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_NO_RESULTS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, true, false, null, 108, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        } else {
                            if (!(finder401kState3Finder401kScreen$lambda$0 instanceof Finder401kState3.Results)) {
                                composer4.startReplaceGroup(1471662146);
                                composer4.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer4.startReplaceGroup(-1622342479);
                            Finder401kScreen8.FinderResults(((Finder401kState3.Results) finder401kState3Finder401kScreen$lambda$0).getViewModel(), finder401kDuxo, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_RESULTS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, true, false, null, 108, null), composer4, 0, 0);
                            composer4.endReplaceGroup();
                        }
                        composer4.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, ((i4 >> 3) & 14) | 805306416, 508);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Finder401kScreen8.Finder401kScreen$lambda$1(duxo, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<? extends Finder401kState3> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            composer2 = composerStartRestartGroup;
            modifier3 = modifier4;
            ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, ComposableLambda3.rememberComposableLambda(-1361446791, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i6) {
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1361446791, i6, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous> (Finder401kScreen.kt:62)");
                    }
                    Function2<Composer, Integer, Unit> function2M18441getLambda$1217614292$feature_rollover_401k_externalDebug = Finder401kScreen.INSTANCE.m18441getLambda$1217614292$feature_rollover_401k_externalDebug();
                    final Finder401kDuxo finder401kDuxo = duxo;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M18441getLambda$1217614292$feature_rollover_401k_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1699931816, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i7) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i7 & 6) == 0) {
                                i7 |= (i7 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i7 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1699931816, i7, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous>.<anonymous> (Finder401kScreen.kt:65)");
                            }
                            Finder401kDuxo finder401kDuxo2 = finder401kDuxo;
                            composer4.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer4.changedInstance(finder401kDuxo2);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Finder401kScreen9(finder401kDuxo2);
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            composer4.endReplaceGroup();
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, (Function0) ((KFunction) objRememberedValue), composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 390, 0, 2042);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, 0L, 0L, null, ComposableLambda3.rememberComposableLambda(1796310414, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt.Finder401kScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i6) {
                    int i7;
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i6 & 6) == 0) {
                        i7 = i6 | (composer4.changed(paddingValues) ? 4 : 2);
                    } else {
                        i7 = i6;
                    }
                    if ((i7 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1796310414, i7, -1, "com.robinhood.android.rollover401k.steps.finder.Finder401kScreen.<anonymous> (Finder401kScreen.kt:70)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxSize$default(companion, 0.0f, 1, null), paddingValues);
                    Finder401kDuxo finder401kDuxo = duxo;
                    SnapshotState4<Finder401kState3> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierPadding);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Finder401kState3 finder401kState3Finder401kScreen$lambda$0 = Finder401kScreen8.Finder401kScreen$lambda$0(snapshotState4);
                    if (Intrinsics.areEqual(finder401kState3Finder401kScreen$lambda$0, Finder401kState3.Loading.INSTANCE)) {
                        composer4.startReplaceGroup(1471663528);
                        LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(null, null, false, false, composer3, 0, 15);
                        composer4 = composer3;
                        composer4.endReplaceGroup();
                    } else if (finder401kState3Finder401kScreen$lambda$0 instanceof Finder401kState3.NoResults) {
                        composer4.startReplaceGroup(-1622958356);
                        Finder401kScreen8.NoFinderResults(((Finder401kState3.NoResults) finder401kState3Finder401kScreen$lambda$0).getViewModel(), finder401kDuxo, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_NO_RESULTS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, true, false, null, 108, null), composer4, 0, 0);
                        composer4.endReplaceGroup();
                    } else {
                        if (!(finder401kState3Finder401kScreen$lambda$0 instanceof Finder401kState3.Results)) {
                            composer4.startReplaceGroup(1471662146);
                            composer4.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer4.startReplaceGroup(-1622342479);
                        Finder401kScreen8.FinderResults(((Finder401kState3.Results) finder401kState3Finder401kScreen$lambda$0).getViewModel(), finder401kDuxo, ModifiersKt.autoLogEvents$default(companion, new UserInteractionEventDescriptor(null, new Screen(Screen.Name.RETIREMENT_401K_FINDER_RESULTS, null, null, null, 14, null), null, null, null, null, 61, null), true, false, false, true, false, null, 108, null), composer4, 0, 0);
                        composer4.endReplaceGroup();
                    }
                    composer4.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, ((i4 >> 3) & 14) | 805306416, 508);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Finder401kState3 Finder401kScreen$lambda$0(SnapshotState4<? extends Finder401kState3> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0357  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x03c4  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x024e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void FinderResults(final Retirement401kFinderResultsViewmodel retirement401kFinderResultsViewmodel, final Finder401kScreen7 callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        String title;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        List<Retirement401kFinderResult> finderResults;
        int i4;
        BentoBaseRowState.Start image;
        Composer composer3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(-936162064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(retirement401kFinderResultsViewmodel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-936162064, i3, -1, "com.robinhood.android.rollover401k.steps.finder.FinderResults (Finder401kScreen.kt:116)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                title = retirement401kFinderResultsViewmodel == null ? retirement401kFinderResultsViewmodel.getTitle() : null;
                if (title == null) {
                    title = "";
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifier5 = modifier4;
                int i7 = i3;
                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                String subtitle = retirement401kFinderResultsViewmodel == null ? retirement401kFinderResultsViewmodel.getSubtitle() : null;
                BentoText2.m20747BentoText38GnDrw(subtitle != null ? "" : subtitle, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion3, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composer2 = composerStartRestartGroup;
                int i8 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion3, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                finderResults = retirement401kFinderResultsViewmodel == null ? retirement401kFinderResultsViewmodel.getFinderResults() : null;
                composer2.startReplaceGroup(155693247);
                if (finderResults != null) {
                    i4 = 0;
                } else {
                    for (final Retirement401kFinderResult retirement401kFinderResult : finderResults) {
                        if ((retirement401kFinderResult.getLogoUrl().length() == 0 ? 1 : i8) != 0) {
                            composer2.startReplaceGroup(-2012168604);
                            image = new BentoBaseRowState.Start.Drawable(C27696R.drawable.default_broker_logo, null, null, ContentScale.INSTANCE.getFit(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), 6, null);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-2011859565);
                            image = new BentoBaseRowState.Start.Image(retirement401kFinderResult.getLogoUrl(), retirement401kFinderResult.getName(), null, ContentScale.INSTANCE.getInside(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21593getSmallD9Ej5fM()), null, 36, null);
                            composer2.endReplaceGroup();
                        }
                        String name = retirement401kFinderResult.getName();
                        String statusText = retirement401kFinderResult.getStatusText();
                        composer2.startReplaceGroup(-1633490746);
                        int i9 = (((i7 & 112) == 32 || ((i7 & 64) != 0 && composer2.changedInstance(callbacks))) ? 1 : i8) | (composer2.changedInstance(retirement401kFinderResult) ? 1 : 0);
                        Object objRememberedValue = composer2.rememberedValue();
                        if (i9 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Finder401kScreen8.FinderResults$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(callbacks, retirement401kFinderResult);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        Composer composer4 = composer2;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, image, name, statusText, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composer4, BentoBaseRowState.Start.$stable << 3, 0, 2033);
                        i8 = i8;
                        composer2 = composer4;
                    }
                    i4 = i8;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                composer2.endNode();
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Spacer2.Spacer(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), composer2, i4);
                String ctaText = retirement401kFinderResultsViewmodel == null ? retirement401kFinderResultsViewmodel.getCtaText() : null;
                String str = ctaText != null ? ctaText : "";
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion4, 0.0f, 1, null);
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i10 = BentoTheme.$stable;
                Composer composer5 = composer2;
                composer3 = composer5;
                BentoMarkdownText2.BentoMarkdownText(str, PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i10).m21590getDefaultD9Ej5fM(), 7, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme2.getTypography(composer2, i10).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, bentoTheme2.getColors(composer2, i10).m21426getFg20d7_KjU(), false, composer5, BentoMarkdownText.$stable << 15, 20), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                composer3 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Finder401kScreen8.FinderResults$lambda$7(retirement401kFinderResultsViewmodel, callbacks, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion5.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (retirement401kFinderResultsViewmodel == null) {
                }
                if (title == null) {
                }
                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                int i62 = BentoTheme.$stable;
                TextStyle displayCapsuleMedium2 = bentoTheme3.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifier52 = modifier4;
                int i72 = i3;
                BentoText2.m20747BentoText38GnDrw(title, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                if (retirement401kFinderResultsViewmodel == null) {
                }
                BentoText2.m20747BentoText38GnDrw(subtitle != null ? "" : subtitle, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion32, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16380);
                composer2 = composerStartRestartGroup;
                int i82 = 0;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composer2, i62).m21590getDefaultD9Ej5fM()), composer2, 0);
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(companion32, ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion5.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composer2.getApplier() == null) {
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    if (retirement401kFinderResultsViewmodel == null) {
                    }
                    composer2.startReplaceGroup(155693247);
                    if (finderResults != null) {
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    Modifier.Companion companion42 = Modifier.INSTANCE;
                    Spacer2.Spacer(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), composer2, i4);
                    if (retirement401kFinderResultsViewmodel == null) {
                    }
                    if (ctaText != null) {
                    }
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion42, 0.0f, 1, null);
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i102 = BentoTheme.$stable;
                    Composer composer52 = composer2;
                    composer3 = composer52;
                    BentoMarkdownText2.BentoMarkdownText(str, PaddingKt.m5146paddingqDBjuR0$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer2, i102).m21590getDefaultD9Ej5fM(), 7, null), BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme22.getTypography(composer2, i102).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0L, bentoTheme22.getColors(composer2, i102).m21426getFg20d7_KjU(), false, composer52, BentoMarkdownText.$stable << 15, 20), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 24);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FinderResults$lambda$6$lambda$5$lambda$4$lambda$3$lambda$2(Finder401kScreen7 finder401kScreen7, Retirement401kFinderResult retirement401kFinderResult) {
        finder401kScreen7.onInstitutionSelected(retirement401kFinderResult.getPlaidInstitutionId(), retirement401kFinderResult.getName());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02bd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoFinderResults(final NoResultsViewModel noResultsViewModel, final Finder401kScreen7 finder401kScreen7, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        boolean z;
        String text;
        int i4;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1838004253);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(noResultsViewModel) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(finder401kScreen7) : composerStartRestartGroup.changedInstance(finder401kScreen7) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1838004253, i3, -1, "com.robinhood.android.rollover401k.steps.finder.NoFinderResults (Finder401kScreen.kt:187)");
                }
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5162requiredSize3ABfNKs(companion3, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE)), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null);
                String ctaText = null;
                z = true;
                Modifier modifier5 = modifier4;
                AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(noResultsViewModel == null ? noResultsViewModel.getImageUrl() : null, null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                ColorFilter colorFilterM6729tintxETnrds$default = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU(), 0, 2, null);
                text = noResultsViewModel == null ? noResultsViewModel.getText() : null;
                if (text == null) {
                    text = "";
                }
                BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg, text, modifierM4872backgroundbw27NRU$default2, null, null, 0.0f, colorFilterM6729tintxETnrds$default, composerStartRestartGroup, 0, 56);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion3, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                String text2 = noResultsViewModel == null ? noResultsViewModel.getText() : null;
                String str = text2 != null ? "" : text2;
                TextAlign.Companion companion4 = TextAlign.INSTANCE;
                i4 = i3;
                BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i6).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                String subtext = noResultsViewModel == null ? noResultsViewModel.getSubtext() : null;
                BentoText2.m20747BentoText38GnDrw(subtext != null ? "" : subtext, null, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16318);
                composerStartRestartGroup.endNode();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM());
                if (noResultsViewModel != null) {
                    ctaText = noResultsViewModel.getCtaText();
                }
                String str2 = ctaText != null ? "" : ctaText;
                BentoButtons.Type type2 = BentoButtons.Type.Primary;
                composerStartRestartGroup.startReplaceGroup(5004770);
                if ((i4 & 112) != 32 && ((i4 & 64) == 0 || !composerStartRestartGroup.changedInstance(finder401kScreen7))) {
                    z = false;
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Finder401kScreen8.NoFinderResults$lambda$11$lambda$10$lambda$9(finder401kScreen7);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str2, modifierM21618defaultFillMaxWidthPadding3ABfNKs, null, type2, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return Finder401kScreen8.NoFinderResults$lambda$12(noResultsViewModel, finder401kScreen7, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            Modifier modifierM4872backgroundbw27NRU$default3 = Background3.m4872backgroundbw27NRU$default(modifierFillMaxSize$default2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion5.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default3);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(Column5.weight$default(column62, companion32, 1.0f, false, 2, null), bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getCenter(), companion5.getCenterHorizontally(), composerStartRestartGroup, 54);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5144paddingVpY3zN4$default2);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Modifier modifierM4872backgroundbw27NRU$default22 = Background3.m4872backgroundbw27NRU$default(SizeKt.m5162requiredSize3ABfNKs(companion32, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE)), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null);
                    String ctaText2 = null;
                    z = true;
                    Modifier modifier52 = modifier4;
                    AsyncImagePainter asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2 = SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(noResultsViewModel == null ? noResultsViewModel.getImageUrl() : null, null, null, null, 0, null, composerStartRestartGroup, 0, 62);
                    ColorFilter colorFilterM6729tintxETnrds$default2 = ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU(), 0, 2, null);
                    if (noResultsViewModel == null) {
                    }
                    if (text == null) {
                    }
                    BentoImage.BentoImage(asyncImagePainterM9120rememberAsyncImagePainterEHKIwbg2, text, modifierM4872backgroundbw27NRU$default22, null, null, 0.0f, colorFilterM6729tintxETnrds$default2, composerStartRestartGroup, 0, 56);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(companion32, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21596getXxlargeD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    if (noResultsViewModel == null) {
                    }
                    if (text2 != null) {
                    }
                    TextAlign.Companion companion42 = TextAlign.INSTANCE;
                    i4 = i3;
                    BentoText2.m20747BentoText38GnDrw(str, modifierM5146paddingqDBjuR0$default2, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i62).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    if (noResultsViewModel == null) {
                    }
                    BentoText2.m20747BentoText38GnDrw(subtext != null ? "" : subtext, null, null, null, null, null, TextAlign.m7912boximpl(companion42.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16318);
                    composerStartRestartGroup.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierM21618defaultFillMaxWidthPadding3ABfNKs2 = com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM());
                    if (noResultsViewModel != null) {
                    }
                    if (ctaText2 != null) {
                    }
                    BentoButtons.Type type22 = BentoButtons.Type.Primary;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i4 & 112) != 32) {
                        z = false;
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Finder401kScreen8.NoFinderResults$lambda$11$lambda$10$lambda$9(finder401kScreen7);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, str2, modifierM21618defaultFillMaxWidthPadding3ABfNKs2, null, type22, false, false, null, null, null, null, false, null, composerStartRestartGroup, 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NoFinderResults$lambda$11$lambda$10$lambda$9(Finder401kScreen7 finder401kScreen7) {
        if (finder401kScreen7 != null) {
            finder401kScreen7.onNoResultsCtaTapped();
        }
        return Unit.INSTANCE;
    }

    private static final void FinderResultsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1492109614);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1492109614, i, -1, "com.robinhood.android.rollover401k.steps.finder.FinderResultsPreview (Finder401kScreen.kt:233)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, Finder401kScreen.INSTANCE.m18442getLambda$762813302$feature_rollover_401k_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Finder401kScreen8.FinderResultsPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void NoFinderResultsPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-398613167);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-398613167, i, -1, "com.robinhood.android.rollover401k.steps.finder.NoFinderResultsPreview (Finder401kScreen.kt:270)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, Finder401kScreen.INSTANCE.getLambda$375473417$feature_rollover_401k_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.rollover401k.steps.finder.Finder401kScreenKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return Finder401kScreen8.NoFinderResultsPreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
