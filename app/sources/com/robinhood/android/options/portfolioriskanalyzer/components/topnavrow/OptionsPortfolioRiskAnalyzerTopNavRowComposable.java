package com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowEvent;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u001aQ\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\u001a5\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0013\"\u000e\u0010\u0014\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0015X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0018²\u0006\n\u0010\u0019\u001a\u00020\u001aX\u008a\u0084\u0002²\u0006\u0012\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001cX\u008a\u0084\u0002²\u0006\n\u0010\u001e\u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020\u001fX\u008a\u008e\u0002²\u0006\n\u0010!\u001a\u00020\u001fX\u008a\u008e\u0002"}, m3636d2 = {"OptionsPortfolioRiskAnalyzerTopNavRowComposable", "", "duxo", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo;", "modifier", "Landroidx/compose/ui/Modifier;", "currentUnderlyingId", "Ljava/util/UUID;", "onUnderlyingIdUpdated", "Lkotlin/Function1;", "onSearchSelected", "Lkotlin/Function0;", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowDuxo;Landroidx/compose/ui/Modifier;Ljava/util/UUID;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "NavRowItemComposable", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;", "isSelected", "", "onClick", "(Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/NavRowItemViewState;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TEST_TAG_FIXED_SEARCH", "", "TEST_TAG_NAV_ROW_LIST", "TEST_TAG_NAV_ROW_ITEM", "feature-options-portfolio-risk-analyzer_externalDebug", "viewState", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/options/portfolioriskanalyzer/components/topnavrow/OptionsPortfolioRiskAnalyzerTopNavRowEvent;", "rowWidthPx", "", "lazyRowWidthPx", "selectedItemWidthPx"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsPortfolioRiskAnalyzerTopNavRowComposable {
    public static final String TEST_TAG_FIXED_SEARCH = "search button";
    public static final String TEST_TAG_NAV_ROW_ITEM = "item";
    public static final String TEST_TAG_NAV_ROW_LIST = "list";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NavRowItemComposable$lambda$27(NavRowItemViewState navRowItemViewState, boolean z, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        NavRowItemComposable(navRowItemViewState, z, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$24(OptionsPortfolioRiskAnalyzerTopNavRowDuxo optionsPortfolioRiskAnalyzerTopNavRowDuxo, Modifier modifier, UUID uuid, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        OptionsPortfolioRiskAnalyzerTopNavRowComposable(optionsPortfolioRiskAnalyzerTopNavRowDuxo, modifier, uuid, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$1$lambda$0 */
    public static final Unit m2275xeb452579(UUID it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01c9 A[PHI: r2
      0x01c9: PHI (r2v25 java.util.UUID) = (r2v24 java.util.UUID), (r2v28 java.util.UUID) binds: [B:120:0x01d3, B:115:0x01c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:165:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x015e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionsPortfolioRiskAnalyzerTopNavRowComposable(final OptionsPortfolioRiskAnalyzerTopNavRowDuxo duxo, Modifier modifier, UUID uuid, Function1<? super UUID, Unit> function1, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        UUID uuid2;
        int i5;
        Function1<? super UUID, Unit> function12;
        int i6;
        Function0<Unit> function02;
        UUID uuid3;
        final Function1<? super UUID, Unit> function13;
        Function0<Unit> function03;
        boolean zChangedInstance;
        Object objRememberedValue;
        final Event<OptionsPortfolioRiskAnalyzerTopNavRowEvent> eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5;
        boolean zChanged;
        UUID underlyingId;
        LazyListState lazyListState;
        ImmutableList<NavRowItemViewState> immutableList;
        final SnapshotFloatState2 snapshotFloatState2;
        final Modifier modifier3;
        final UUID uuid4;
        final Function1<? super UUID, Unit> function14;
        final Function0<Unit> function04;
        EventConsumer<OptionsPortfolioRiskAnalyzerTopNavRowEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1441209823);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
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
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    uuid2 = uuid;
                    i3 |= composerStartRestartGroup.changedInstance(uuid2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 3072;
                } else {
                    if ((i & 3072) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                    }
                    i6 = i2 & 16;
                    if (i6 != 0) {
                        if ((i & 24576) == 0) {
                            function02 = function0;
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
                        }
                        if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            uuid4 = uuid2;
                            function14 = function12;
                            function04 = function02;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            uuid3 = i4 == 0 ? null : uuid2;
                            if (i5 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return OptionsPortfolioRiskAnalyzerTopNavRowComposable.m2275xeb452579((UUID) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function13 = (Function1) objRememberedValue2;
                            } else {
                                function13 = function12;
                            }
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Unit.INSTANCE;
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function03 = (Function0) objRememberedValue3;
                            } else {
                                function03 = function02;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1441209823, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable (OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt:59)");
                            }
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            SnapshotState4 snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                            ImmutableList<NavRowItemViewState> tabItems = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getTabItems();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(uuid3);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new OptionsPortfolioRiskAnalyzerTopNavRowComposable2(duxo, uuid3, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(uuid3, tabItems, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14);
                            eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5 = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5(snapshotState4CollectAsStateWithLifecycle2);
                            if (eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5 != null) {
                                if ((eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5.getData() instanceof OptionsPortfolioRiskAnalyzerTopNavRowEvent.UpdateUnderlyingId) && (eventConsumerInvoke = eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5.getGetEventConsumer().invoke()) != null) {
                                    eventConsumerInvoke.consume(eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5, new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$OptionsPortfolioRiskAnalyzerTopNavRowComposable$$inlined$consumeIfType$1
                                        @Override // kotlin.jvm.functions.Function1
                                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                                            m16996invoke(obj);
                                            return Unit.INSTANCE;
                                        }

                                        /* renamed from: invoke, reason: collision with other method in class */
                                        public final void m16996invoke(Object it) {
                                            Intrinsics.checkNotNullParameter(it, "it");
                                            function13.invoke(((OptionsPortfolioRiskAnalyzerTopNavRowEvent.UpdateUnderlyingId) eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5.getData()).getId());
                                        }
                                    });
                                }
                                Unit unit = Unit.INSTANCE;
                            }
                            ImmutableList<NavRowItemViewState> tabItems2 = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getTabItems();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(tabItems2) | composerStartRestartGroup.changed(uuid3);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                if (uuid3 == null) {
                                    NavRowItemViewState navRowItemViewState = (NavRowItemViewState) CollectionsKt.firstOrNull((List) tabItems2);
                                    if (navRowItemViewState != null) {
                                        underlyingId = navRowItemViewState.getUnderlyingId();
                                        objRememberedValue4 = underlyingId;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    } else {
                                        objRememberedValue4 = null;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                } else if (tabItems2 == null || !tabItems2.isEmpty()) {
                                    Iterator<NavRowItemViewState> it = tabItems2.iterator();
                                    while (it.hasNext()) {
                                        if (Intrinsics.areEqual(it.next().getUnderlyingId(), uuid3)) {
                                            underlyingId = uuid3;
                                            break;
                                        }
                                    }
                                    underlyingId = null;
                                    if (underlyingId == null) {
                                        objRememberedValue4 = underlyingId;
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    }
                                } else {
                                    underlyingId = null;
                                    if (underlyingId == null) {
                                    }
                                }
                            }
                            UUID uuid5 = (UUID) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            Composer.Companion companion = Composer.INSTANCE;
                            if (objRememberedValue5 == companion.getEmpty()) {
                                objRememberedValue5 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                                objRememberedValue6 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            SnapshotFloatState2 snapshotFloatState23 = (SnapshotFloatState2) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                                objRememberedValue7 = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            SnapshotFloatState2 snapshotFloatState24 = (SnapshotFloatState2) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            Float fValueOf = Float.valueOf(snapshotFloatState24.getFloatValue());
                            composerStartRestartGroup.startReplaceGroup(-1224400529);
                            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(tabItems2) | composerStartRestartGroup.changedInstance(uuid5) | composerStartRestartGroup.changed(lazyListStateRememberLazyListState);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue8 == companion.getEmpty()) {
                                lazyListState = lazyListStateRememberLazyListState;
                                objRememberedValue8 = new OptionsPortfolioRiskAnalyzerTopNavRowComposable3(tabItems2, lazyListState, uuid5, snapshotFloatState22, snapshotFloatState23, null);
                                immutableList = tabItems2;
                                snapshotFloatState2 = snapshotFloatState22;
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            } else {
                                immutableList = tabItems2;
                                lazyListState = lazyListStateRememberLazyListState;
                                snapshotFloatState2 = snapshotFloatState22;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(uuid5, fValueOf, (Function2) objRememberedValue8, composerStartRestartGroup, 0);
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue9 == companion.getEmpty()) {
                                objRememberedValue9 = new Function1() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionsPortfolioRiskAnalyzerTopNavRowComposable.m2276x6940a5eb(snapshotFloatState2, (LayoutCoordinates) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierFillMaxWidth$default, (Function1) objRememberedValue9);
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Function1<? super UUID, Unit> function15 = function13;
                            AnimatedVisibilityKt.AnimatedVisibility(Column6.INSTANCE, OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle).getShowNavRow(), (Modifier) null, (EnterTransition) null, (ExitTransition) null, (String) null, ComposableLambda3.rememberComposableLambda(-1787226001, true, new OptionsPortfolioRiskAnalyzerTopNavRowComposable4(lazyListState, immutableList, uuid5, function15, snapshotState4CollectAsStateWithLifecycle, function03, snapshotFloatState23, snapshotFloatState24), composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 30);
                            composerStartRestartGroup = composerStartRestartGroup;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), 0.0f, composerStartRestartGroup, 0, 5);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier4;
                            uuid4 = uuid3;
                            function14 = function15;
                            function04 = function03;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return OptionsPortfolioRiskAnalyzerTopNavRowComposable.OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$24(duxo, modifier3, uuid4, function14, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    function02 = function0;
                    if ((i3 & 9363) == 9362) {
                        if (i7 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle3 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        SnapshotState4 snapshotState4CollectAsStateWithLifecycle22 = FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                        ImmutableList<NavRowItemViewState> tabItems3 = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle3).getTabItems();
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        zChangedInstance = composerStartRestartGroup.changedInstance(duxo) | composerStartRestartGroup.changedInstance(uuid3);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance) {
                            objRememberedValue = new OptionsPortfolioRiskAnalyzerTopNavRowComposable2(duxo, uuid3, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            EffectsKt.LaunchedEffect(uuid3, tabItems3, (Function2) objRememberedValue, composerStartRestartGroup, (i3 >> 6) & 14);
                            eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5 = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5(snapshotState4CollectAsStateWithLifecycle22);
                            if (eventOptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5 != null) {
                            }
                            ImmutableList<NavRowItemViewState> tabItems22 = OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(snapshotState4CollectAsStateWithLifecycle3).getTabItems();
                            composerStartRestartGroup.startReplaceGroup(-1633490746);
                            zChanged = composerStartRestartGroup.changed(tabItems22) | composerStartRestartGroup.changed(uuid3);
                            Object objRememberedValue42 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                if (uuid3 == null) {
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                function12 = function1;
                i6 = i2 & 16;
                if (i6 != 0) {
                }
                function02 = function0;
                if ((i3 & 9363) == 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            uuid2 = uuid;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            function12 = function1;
            i6 = i2 & 16;
            if (i6 != 0) {
            }
            function02 = function0;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        uuid2 = uuid;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        function12 = function1;
        i6 = i2 & 16;
        if (i6 != 0) {
        }
        function02 = function0;
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OptionsPortfolioRiskAnalyzerTopNavRowViewState OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$4(SnapshotState4<OptionsPortfolioRiskAnalyzerTopNavRowViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<OptionsPortfolioRiskAnalyzerTopNavRowEvent> OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$5(SnapshotState4<Event<OptionsPortfolioRiskAnalyzerTopNavRowEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OptionsPortfolioRiskAnalyzerTopNavRowComposable$lambda$22$lambda$21 */
    public static final Unit m2276x6940a5eb(SnapshotFloatState2 snapshotFloatState2, LayoutCoordinates coordinates) {
        Intrinsics.checkNotNullParameter(coordinates, "coordinates");
        snapshotFloatState2.setFloatValue((int) (coordinates.mo7241getSizeYbymL2g() >> 32));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:87:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavRowItemComposable(NavRowItemViewState navRowItemViewState, final boolean z, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        NavRowItemViewState navRowItemViewState2;
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        long jM21371getBg0d7_KjU;
        Object objRememberedValue;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        long jM21425getFg0d7_KjU;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1917879257);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            navRowItemViewState2 = navRowItemViewState;
        } else if ((i & 6) == 0) {
            navRowItemViewState2 = navRowItemViewState;
            i3 = (composerStartRestartGroup.changedInstance(navRowItemViewState2) ? 4 : 2) | i;
        } else {
            navRowItemViewState2 = navRowItemViewState;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            } else {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1917879257, i3, -1, "com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.NavRowItemComposable (OptionsPortfolioRiskAnalyzerTopNavRowComposable.kt:194)");
                }
                Modifier modifierClip = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6)));
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(409304767);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(409370239);
                    jM21371getBg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(modifierClip, jM21371getBg0d7_KjU, null, 2, null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default, (InteractionSource3) objRememberedValue, null, false, null, null, function02, 28, null), C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(1));
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier modifier5 = modifier4;
                String symbol = navRowItemViewState2.getSymbol();
                if (!z) {
                    composerStartRestartGroup.startReplaceGroup(1246852321);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(1246909857);
                    jM21425getFg0d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                    composerStartRestartGroup.endReplaceGroup();
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(symbol, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final NavRowItemViewState navRowItemViewState3 = navRowItemViewState2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposableKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionsPortfolioRiskAnalyzerTopNavRowComposable.NavRowItemComposable$lambda$27(navRowItemViewState3, z, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) != 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierClip2 = Clip.clip(modifier4, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(6)));
            if (!z) {
            }
            Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(modifierClip2, jM21371getBg0d7_KjU, null, 2, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5143paddingVpY3zN42 = PaddingKt.m5143paddingVpY3zN4(ClickableKt.m4891clickableO2vRcR0$default(modifierM4872backgroundbw27NRU$default2, (InteractionSource3) objRememberedValue, null, false, null, null, function02, 28, null), C2002Dp.m7995constructorimpl(8), C2002Dp.m7995constructorimpl(1));
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN42);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                Modifier modifier52 = modifier4;
                String symbol2 = navRowItemViewState2.getSymbol();
                if (!z) {
                }
                composer2 = composerStartRestartGroup;
                BentoText2.m20747BentoText38GnDrw(symbol2, null, Color.m6701boximpl(jM21425getFg0d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextS(), composer2, 24576, 0, 8170);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
