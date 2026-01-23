package com.robinhood.android.equitytradeladder.quickconversion;

import androidx.compose.material3.SnackbarHostState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.equities.equitytrade.EquityOrderIntent;
import com.robinhood.android.equitytradeladder.EquityTradeLadderEvent;
import com.robinhood.android.mcw.contracts.QuickConversionKey;
import com.robinhood.android.mcw.mcwquickconversion.QuickConversionBottomSheet;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.GenericOrderCheckAction;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: QuickConversionEventHandler.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001aK\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u001a\u0010\t\u001a\u0016\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0004\u0012\u00020\u00030\n2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0010²\u0006\f\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u008a\u008e\u0002"}, m3636d2 = {"TAG_QUICK_CONVERSION_BOTTOM_SHEET", "", "QuickConversionEventHandler", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/equitytradeladder/EquityTradeLadderEvent;", "snackbarHostState", "Landroidx/compose/material3/SnackbarHostState;", "onOrderCheckAction", "Lkotlin/Function2;", "Lcom/robinhood/android/equities/equitytrade/EquityOrderIntent;", "Lcom/robinhood/models/serverdriven/db/GenericAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/udf/event/Event;Landroidx/compose/material3/SnackbarHostState;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-equity-trade-ladder_externalDebug", "quickConversionEvent", "Lcom/robinhood/android/equitytradeladder/quickconversion/QuickConversionEventData;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class QuickConversionEventHandler2 {
    public static final String TAG_QUICK_CONVERSION_BOTTOM_SHEET = "quick-conversion-bottom-sheet";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionEventHandler$lambda$11(Event event, SnackbarHostState snackbarHostState, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        QuickConversionEventHandler(event, snackbarHostState, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x019c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void QuickConversionEventHandler(final Event<EquityTradeLadderEvent> event, final SnackbarHostState snackbarHostState, final Function2<? super EquityOrderIntent, ? super GenericAction, Unit> onOrderCheckAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        final QuickConversionEventData quickConversionEventDataQuickConversionEventHandler$lambda$1;
        final Modifier modifier3;
        EventConsumer<EquityTradeLadderEvent> eventConsumerInvoke;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(snackbarHostState, "snackbarHostState");
        Intrinsics.checkNotNullParameter(onOrderCheckAction, "onOrderCheckAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1772542527);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(event) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(snackbarHostState) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onOrderCheckAction) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1772542527, i3, -1, "com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandler (QuickConversionEventHandler.kt:33)");
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                if (event != null && (event.getData() instanceof EquityTradeLadderEvent.OrderCheckBottomSheet) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                    eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$QuickConversionEventHandler$$inlined$consumeIfType$1
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                            m14069invoke(obj);
                            return Unit.INSTANCE;
                        }

                        /* renamed from: invoke, reason: collision with other method in class */
                        public final void m14069invoke(Object it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            EquityTradeLadderEvent.OrderCheckBottomSheet orderCheckBottomSheet = (EquityTradeLadderEvent.OrderCheckBottomSheet) event.getData();
                            if (orderCheckBottomSheet.getKey() instanceof QuickConversionKey) {
                                snapshotState.setValue(new QuickConversionEventData((QuickConversionKey) orderCheckBottomSheet.getKey(), orderCheckBottomSheet.getEquityOrderIntent()));
                            }
                        }
                    });
                }
                quickConversionEventDataQuickConversionEventHandler$lambda$1 = QuickConversionEventHandler$lambda$1(snapshotState);
                if (quickConversionEventDataQuickConversionEventHandler$lambda$1 != null) {
                    QuickConversionKey key = quickConversionEventDataQuickConversionEventHandler$lambda$1.getKey();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return QuickConversionEventHandler2.QuickConversionEventHandler$lambda$10$lambda$5$lambda$4(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | ((i3 & 112) == 32);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QuickConversionEventHandler2.QuickConversionEventHandler$lambda$10$lambda$7$lambda$6(coroutineScope, snapshotState, snackbarHostState, (StringResource) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    Function1 function1 = (Function1) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(quickConversionEventDataQuickConversionEventHandler$lambda$1);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function1() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return QuickConversionEventHandler2.QuickConversionEventHandler$lambda$10$lambda$9$lambda$8(onOrderCheckAction, quickConversionEventDataQuickConversionEventHandler$lambda$1, snapshotState, (GenericOrderCheckAction) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    QuickConversionBottomSheet.QuickConversionBottomSheet(key, function0, function1, (Function1) objRememberedValue5, TestTag3.testTag(modifier4, TAG_QUICK_CONVERSION_BOTTOM_SHEET), null, composerStartRestartGroup, 48, 32);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return QuickConversionEventHandler2.QuickConversionEventHandler$lambda$11(event, snackbarHostState, onOrderCheckAction, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final CoroutineScope coroutineScope2 = (CoroutineScope) objRememberedValue;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            if (event != null) {
                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.equitytradeladder.quickconversion.QuickConversionEventHandlerKt$QuickConversionEventHandler$$inlined$consumeIfType$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                        m14069invoke(obj);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: collision with other method in class */
                    public final void m14069invoke(Object it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        EquityTradeLadderEvent.OrderCheckBottomSheet orderCheckBottomSheet = (EquityTradeLadderEvent.OrderCheckBottomSheet) event.getData();
                        if (orderCheckBottomSheet.getKey() instanceof QuickConversionKey) {
                            snapshotState.setValue(new QuickConversionEventData((QuickConversionKey) orderCheckBottomSheet.getKey(), orderCheckBottomSheet.getEquityOrderIntent()));
                        }
                    }
                });
            }
            quickConversionEventDataQuickConversionEventHandler$lambda$1 = QuickConversionEventHandler$lambda$1(snapshotState);
            if (quickConversionEventDataQuickConversionEventHandler$lambda$1 != null) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionEventHandler$lambda$10$lambda$5$lambda$4(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionEventHandler$lambda$10$lambda$7$lambda$6(CoroutineScope coroutineScope, SnapshotState snapshotState, SnackbarHostState snackbarHostState, StringResource message) {
        Intrinsics.checkNotNullParameter(message, "message");
        snapshotState.setValue(null);
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new QuickConversionEventHandler3(snackbarHostState, message, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit QuickConversionEventHandler$lambda$10$lambda$9$lambda$8(Function2 function2, QuickConversionEventData quickConversionEventData, SnapshotState snapshotState, GenericOrderCheckAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        snapshotState.setValue(null);
        function2.invoke(quickConversionEventData.getEquityOrderIntent(), new GenericAction.OrderCheckAction(action));
        return Unit.INSTANCE;
    }

    private static final QuickConversionEventData QuickConversionEventHandler$lambda$1(SnapshotState<QuickConversionEventData> snapshotState) {
        return snapshotState.getValue();
    }
}
