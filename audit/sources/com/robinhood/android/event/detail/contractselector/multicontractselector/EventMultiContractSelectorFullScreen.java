package com.robinhood.android.event.detail.contractselector.multicontractselector;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.udf.event.Event;
import com.robinhood.compose.bento.component.AppBarType;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: EventMultiContractSelectorFullScreen.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u001a5\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\tH\u0007¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002²\u0006\u0012\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u008a\u0084\u0002"}, m3636d2 = {"EventMultiContractSelectorFullScreen", "", "duxo", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorDuxo;", "callbacks", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "onBackPressed", "Lkotlin/Function0;", "(Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorDuxo;Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorCallbacks;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "feature-event-detail_externalDebug", "state", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventContractSelectorViewState;", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/event/detail/contractselector/multicontractselector/EventMultiContractSelectorEvent;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventMultiContractSelectorFullScreen {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventMultiContractSelectorFullScreen$lambda$2(EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo, EventMultiContractSelectorFragment2 eventMultiContractSelectorFragment2, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        EventMultiContractSelectorFullScreen(eventMultiContractSelectorDuxo, eventMultiContractSelectorFragment2, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EventMultiContractSelectorFullScreen(final EventMultiContractSelectorDuxo duxo, final EventMultiContractSelectorFragment2 callbacks, Modifier modifier, final Function0<Unit> onBackPressed, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Intrinsics.checkNotNullParameter(onBackPressed, "onBackPressed");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1258509855);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onBackPressed) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                final Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1258509855, i3, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen (EventMultiContractSelectorFullScreen.kt:23)");
                }
                final SnapshotState4 snapshotState4CollectAsStateWithLifecycle = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
                callbacks.handleEvent(EventMultiContractSelectorFullScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(264827177, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(264827177, i5, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous> (EventMultiContractSelectorFullScreen.kt:29)");
                        }
                        Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null));
                        WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                        final SnapshotState4<EventContractSelectorViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle;
                        final Function0<Unit> function0 = onBackPressed;
                        ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(579995877, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1
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
                                    ComposerKt.traceEventStart(579995877, i6, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:35)");
                                }
                                final SnapshotState4<EventContractSelectorViewState> snapshotState42 = snapshotState4;
                                ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-691335656, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-691335656, i7, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:37)");
                                        }
                                        String title = EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen$lambda$0(snapshotState42).getTitle();
                                        if (title != null) {
                                            BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8190);
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                final Function0<Unit> function02 = function0;
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda3, null, ComposableLambda3.rememberComposableLambda(1429841732, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1.2
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
                                            ComposerKt.traceEventStart(1429841732, i7, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:45)");
                                        }
                                        BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54);
                        final EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo = duxo;
                        final SnapshotState4<EventContractSelectorViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle;
                        ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda2, null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1347700102, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.2
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                                invoke(paddingValues, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(PaddingValues padding, Composer composer3, int i6) {
                                Intrinsics.checkNotNullParameter(padding, "padding");
                                if ((i6 & 6) == 0) {
                                    i6 |= composer3.changed(padding) ? 4 : 2;
                                }
                                if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1347700102, i6, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:53)");
                                }
                                Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, padding);
                                EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo2 = eventMultiContractSelectorDuxo;
                                SnapshotState4<EventContractSelectorViewState> snapshotState43 = snapshotState42;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                EventContractSelectorViewState eventContractSelectorViewStateEventMultiContractSelectorFullScreen$lambda$0 = EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen$lambda$0(snapshotState43);
                                composer3.startReplaceGroup(5004770);
                                boolean zChangedInstance = composer3.changedInstance(eventMultiContractSelectorDuxo2);
                                Object objRememberedValue = composer3.rememberedValue();
                                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new EventMultiContractSelectorFullScreen2(eventMultiContractSelectorDuxo2);
                                    composer3.updateRememberedValue(objRememberedValue);
                                }
                                composer3.endReplaceGroup();
                                EventMultiContractSelectorFullScreenContent2.EventMultiContractSelectorFullScreenContent(eventContractSelectorViewStateEventMultiContractSelectorFullScreen$lambda$0, eventMultiContractSelectorDuxo2, null, false, (Function2) ((KFunction) objRememberedValue), composer3, 0, 12);
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                Modifier modifier5 = modifier4;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, composableLambdaRememberComposableLambda, composerStartRestartGroup, 100663296, 255);
                composerStartRestartGroup = composerStartRestartGroup;
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen$lambda$2(duxo, callbacks, modifier3, onBackPressed, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final SnapshotState4<EventContractSelectorViewState> snapshotState4CollectAsStateWithLifecycle2 = FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7);
            callbacks.handleEvent(EventMultiContractSelectorFullScreen$lambda$1(FlowExtKt.collectAsStateWithLifecycle(duxo.getEventFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7)));
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(264827177, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(264827177, i5, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous> (EventMultiContractSelectorFullScreen.kt:29)");
                    }
                    Modifier modifierSystemBarsPadding = WindowInsetsPadding_androidKt.systemBarsPadding(SizeKt.fillMaxSize$default(modifier4, 0.0f, 1, null));
                    WindowInsets windowInsetsWindowInsets$default = WindowInsetsKt.WindowInsets$default(0, 0, 0, 0, 14, null);
                    final SnapshotState4<EventContractSelectorViewState> snapshotState4 = snapshotState4CollectAsStateWithLifecycle2;
                    final Function0<Unit> function0 = onBackPressed;
                    ComposableLambda composableLambdaRememberComposableLambda22 = ComposableLambda3.rememberComposableLambda(579995877, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1
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
                                ComposerKt.traceEventStart(579995877, i6, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:35)");
                            }
                            final SnapshotState4<EventContractSelectorViewState> snapshotState42 = snapshotState4;
                            ComposableLambda composableLambdaRememberComposableLambda3 = ComposableLambda3.rememberComposableLambda(-691335656, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                    invoke(composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer4, int i7) {
                                    if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                        composer4.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-691335656, i7, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:37)");
                                    }
                                    String title = EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen$lambda$0(snapshotState42).getTitle();
                                    if (title != null) {
                                        BentoText2.m20747BentoText38GnDrw(title, null, null, null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), composer4, 0, 0, 8190);
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54);
                            final Function0<Unit> function02 = function0;
                            BentoAppBarKt.m20573BentoAppBarSGdaT3c(composableLambdaRememberComposableLambda3, null, ComposableLambda3.rememberComposableLambda(1429841732, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.1.2
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
                                        ComposerKt.traceEventStart(1429841732, i7, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:45)");
                                    }
                                    BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function02, composer4, (BentoAppBarScope.$stable << 12) | ((i7 << 12) & 57344), 7);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), null, null, false, false, AppBarType.CENTER_ALIGNED, null, 0L, null, composer3, 12583302, 0, 1914);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54);
                    final EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo = duxo;
                    final SnapshotState4<EventContractSelectorViewState> snapshotState42 = snapshotState4CollectAsStateWithLifecycle2;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifierSystemBarsPadding, composableLambdaRememberComposableLambda22, null, null, null, 0, 0L, 0L, windowInsetsWindowInsets$default, ComposableLambda3.rememberComposableLambda(-1347700102, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreenKt.EventMultiContractSelectorFullScreen.1.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                            invoke(paddingValues, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues padding, Composer composer3, int i6) {
                            Intrinsics.checkNotNullParameter(padding, "padding");
                            if ((i6 & 6) == 0) {
                                i6 |= composer3.changed(padding) ? 4 : 2;
                            }
                            if ((i6 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1347700102, i6, -1, "com.robinhood.android.event.detail.contractselector.multicontractselector.EventMultiContractSelectorFullScreen.<anonymous>.<anonymous> (EventMultiContractSelectorFullScreen.kt:53)");
                            }
                            Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, padding);
                            EventMultiContractSelectorDuxo eventMultiContractSelectorDuxo2 = eventMultiContractSelectorDuxo;
                            SnapshotState4<EventContractSelectorViewState> snapshotState43 = snapshotState42;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierPadding);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            EventContractSelectorViewState eventContractSelectorViewStateEventMultiContractSelectorFullScreen$lambda$0 = EventMultiContractSelectorFullScreen.EventMultiContractSelectorFullScreen$lambda$0(snapshotState43);
                            composer3.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer3.changedInstance(eventMultiContractSelectorDuxo2);
                            Object objRememberedValue = composer3.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new EventMultiContractSelectorFullScreen2(eventMultiContractSelectorDuxo2);
                                composer3.updateRememberedValue(objRememberedValue);
                            }
                            composer3.endReplaceGroup();
                            EventMultiContractSelectorFullScreenContent2.EventMultiContractSelectorFullScreenContent(eventContractSelectorViewStateEventMultiContractSelectorFullScreen$lambda$0, eventMultiContractSelectorDuxo2, null, false, (Function2) ((KFunction) objRememberedValue), composer3, 0, 12);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 805306416, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            Modifier modifier52 = modifier4;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, composableLambdaRememberComposableLambda2, composerStartRestartGroup, 100663296, 255);
            composerStartRestartGroup = composerStartRestartGroup;
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EventContractSelectorViewState EventMultiContractSelectorFullScreen$lambda$0(SnapshotState4<EventContractSelectorViewState> snapshotState4) {
        return snapshotState4.getValue();
    }

    private static final Event<EventMultiContractSelectorEvent> EventMultiContractSelectorFullScreen$lambda$1(SnapshotState4<Event<EventMultiContractSelectorEvent>> snapshotState4) {
        return snapshotState4.getValue();
    }
}
