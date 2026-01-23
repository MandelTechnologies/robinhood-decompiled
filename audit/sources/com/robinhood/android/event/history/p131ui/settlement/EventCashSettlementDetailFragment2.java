package com.robinhood.android.event.history.p131ui.settlement;

import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.event.history.p131ui.settlement.EventCashSettlementDetailDuxo3;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.shared.order.type.priceInput.OrderTypePriceInputViewState;
import com.robinhood.utils.resource.StringResource;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EventCashSettlementDetailFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"EventCashSettlementContent", "", "state", "Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/event/history/ui/settlement/EventCashSettlementDetailViewState;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-event-history_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragmentKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventCashSettlementDetailFragment2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EventCashSettlementContent$lambda$0(EventCashSettlementDetailDuxo3 eventCashSettlementDetailDuxo3, Modifier modifier, int i, int i2, Composer composer, int i3) {
        EventCashSettlementContent(eventCashSettlementDetailDuxo3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void EventCashSettlementContent(final EventCashSettlementDetailDuxo3 eventCashSettlementDetailDuxo3, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2110689145);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(eventCashSettlementDetailDuxo3) : composerStartRestartGroup.changedInstance(eventCashSettlementDetailDuxo3) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2110689145, i3, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementContent (EventCashSettlementDetailFragment.kt:78)");
            }
            if (Intrinsics.areEqual(eventCashSettlementDetailDuxo3, EventCashSettlementDetailDuxo3.Loading.INSTANCE)) {
                composerStartRestartGroup.startReplaceGroup(1147712048);
                LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-1095400831, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragmentKt.EventCashSettlementContent.1
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
                            ComposerKt.traceEventStart(-1095400831, i5, -1, "com.robinhood.android.event.history.ui.settlement.EventCashSettlementContent.<anonymous> (EventCashSettlementDetailFragment.kt:81)");
                        }
                        UUID uuidRandomUUID = UUID.randomUUID();
                        StringResource.Companion companion = StringResource.INSTANCE;
                        CashSettlementContent.CashSettlementContent(new EventCashSettlementDetailDuxo3.Loaded(uuidRandomUUID, companion.invoke("---- ----- ---"), companion.invoke("---- --- -----"), null, "--------", OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER, "-----", null, OrderTypePriceInputViewState.PriceInputRowState.DEFAULT_LOADING_PLACEHOLDER), modifier, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3078, 6);
                composerStartRestartGroup.endReplaceGroup();
            } else {
                if (!(eventCashSettlementDetailDuxo3 instanceof EventCashSettlementDetailDuxo3.Loaded)) {
                    composerStartRestartGroup.startReplaceGroup(1147710065);
                    composerStartRestartGroup.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composerStartRestartGroup.startReplaceGroup(1147734549);
                CashSettlementContent.CashSettlementContent((EventCashSettlementDetailDuxo3.Loaded) eventCashSettlementDetailDuxo3, modifier, composerStartRestartGroup, i3 & 112, 0);
                composerStartRestartGroup.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.event.history.ui.settlement.EventCashSettlementDetailFragmentKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EventCashSettlementDetailFragment2.EventCashSettlementContent$lambda$0(eventCashSettlementDetailDuxo3, modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
