package com.robinhood.android.trade.equity.p261ui.share;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.recurring.bottomsheet.frequency.RecurringFrequencyBottomSheet;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.designsystem.compose.ThemesFromScarlet;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.composables.ExpandableEstimatedCostRow3;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ExpandableEstimatedCostRowView.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\u0019\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001bR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR;\u0010\u0013\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u000e\u0010\b\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00128F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/share/ExpandableEstimatedCostRowView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "state", "getState", "()Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;", "setState", "(Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$ExpandableEstimatedCost;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", RecurringFrequencyBottomSheet.ARG_LOGGING_CONTEXT, "getLoggingContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "setLoggingContext", "(Lcom/robinhood/rosetta/eventlogging/Context;)V", "loggingContext$delegate", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class ExpandableEstimatedCostRowView extends GenericComposeView {
    public static final int $stable = GenericComposeView.$stable;

    /* renamed from: loggingContext$delegate, reason: from kotlin metadata */
    private final SnapshotState loggingContext;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(ExpandableEstimatedCostRowView expandableEstimatedCostRowView, int i, Composer composer, int i2) {
        expandableEstimatedCostRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(ExpandableEstimatedCostRowView expandableEstimatedCostRowView, int i, Composer composer, int i2) {
        expandableEstimatedCostRowView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ ExpandableEstimatedCostRowView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExpandableEstimatedCostRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.loggingContext = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final EquityOrderFormRowState.ExpandableEstimatedCost getState() {
        return (EquityOrderFormRowState.ExpandableEstimatedCost) this.state.getValue();
    }

    public final void setState(EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost) {
        this.state.setValue(expandableEstimatedCost);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final com.robinhood.rosetta.eventlogging.Context getLoggingContext() {
        return (com.robinhood.rosetta.eventlogging.Context) this.loggingContext.getValue();
    }

    public final void setLoggingContext(com.robinhood.rosetta.eventlogging.Context context) {
        this.loggingContext.setValue(context);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-559904691);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(this) : composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-559904691, i2, -1, "com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView.Content (ExpandableEstimatedCostRowView.kt:28)");
            }
            final EquityOrderFormRowState.ExpandableEstimatedCost state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ExpandableEstimatedCostRowView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.EQUITY_ORDER_ENTRY, null, null, null, 14, null), null, getLoggingContext(), null, null, 53, null), ComposableLambda3.rememberComposableLambda(506963832, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView.Content.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(506963832, i3, -1, "com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView.Content.<anonymous> (ExpandableEstimatedCostRowView.kt:37)");
                    }
                    Observable<ThemesFromScarlet> observableThemeChangesForCompose = ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(ExpandableEstimatedCostRowView.this));
                    ThemesFromScarlet themesFromScarletThemesForCompose = ScarletComposeInterop.themesForCompose(ScarletManager2.getScarletManager(ExpandableEstimatedCostRowView.this));
                    final EquityOrderFormRowState.ExpandableEstimatedCost expandableEstimatedCost = state;
                    BentoTheme2.BentoTheme(observableThemeChangesForCompose, themesFromScarletThemesForCompose, ComposableLambda3.rememberComposableLambda(1773737734, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView.Content.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1773737734, i4, -1, "com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView.Content.<anonymous>.<anonymous> (ExpandableEstimatedCostRowView.kt:41)");
                            }
                            ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow(expandableEstimatedCost, null, composer3, EquityOrderFormRowState.ExpandableEstimatedCost.$stable, 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.share.ExpandableEstimatedCostRowView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ExpandableEstimatedCostRowView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
