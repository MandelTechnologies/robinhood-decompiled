package com.robinhood.android.trade.equity.p261ui.dialog;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.equityadvancedorder.sessionchange.TradingSessionChangedAlert;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.Optional;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarketSessionChangeAlertView.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J6\u0010(\u001a\u00020!2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u0010\u0010)\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u00182\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 J\r\u0010*\u001a\u00020!H\u0017¢\u0006\u0002\u0010+R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR;\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R?\u0010\u0002\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u00182\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0019j\u0002`\u001a0\u00188B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR;\u0010\"\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020!\u0018\u00010 8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b'\u0010\u0017\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&¨\u0006,"}, m3636d2 = {"Lcom/robinhood/android/trade/equity/ui/dialog/MarketSessionChangeAlertView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "<set-?>", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "content", "getContent", "()Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "setContent", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "content$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/rosetta/eventlogging/Context;", "Lcom/robinhood/rosetta/eventlogging/EventContext;", "getContext", "()Lcom/robinhood/utils/Optional;", "setContext", "(Lcom/robinhood/utils/Optional;)V", "context$delegate", "Lkotlin/Function0;", "", "onDismiss", "getOnDismiss", "()Lkotlin/jvm/functions/Function0;", "setOnDismiss", "(Lkotlin/jvm/functions/Function0;)V", "onDismiss$delegate", "bind", "loggingEquityOrderContext", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-equity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class MarketSessionChangeAlertView extends Hammer_MarketSessionChangeAlertView {
    public static final int $stable = 8;

    /* renamed from: content$delegate, reason: from kotlin metadata */
    private final SnapshotState content;

    /* renamed from: context$delegate, reason: from kotlin metadata */
    private final SnapshotState context;
    public EventLogger eventLogger;

    /* renamed from: onDismiss$delegate, reason: from kotlin metadata */
    private final SnapshotState onDismiss;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(MarketSessionChangeAlertView marketSessionChangeAlertView, int i, Composer composer, int i2) {
        marketSessionChangeAlertView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(MarketSessionChangeAlertView marketSessionChangeAlertView, int i, Composer composer, int i2) {
        marketSessionChangeAlertView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$2(MarketSessionChangeAlertView marketSessionChangeAlertView, int i, Composer composer, int i2) {
        marketSessionChangeAlertView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(MarketSessionChangeAlertView marketSessionChangeAlertView, int i, Composer composer, int i2) {
        marketSessionChangeAlertView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarketSessionChangeAlertView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.content = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.context = SnapshotState3.mutableStateOf$default(Optional.INSTANCE.m2972of(null), null, 2, null);
        this.onDismiss = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final GenericAlertContent<GenericAction> getContent() {
        return (GenericAlertContent) this.content.getValue();
    }

    private final void setContent(GenericAlertContent<? extends GenericAction> genericAlertContent) {
        this.content.setValue(genericAlertContent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Optional<com.robinhood.rosetta.eventlogging.Context> getContext() {
        return (Optional) this.context.getValue();
    }

    private final void setContext(Optional<com.robinhood.rosetta.eventlogging.Context> optional) {
        this.context.setValue(optional);
    }

    private final Function0<Unit> getOnDismiss() {
        return (Function0) this.onDismiss.getValue();
    }

    private final void setOnDismiss(Function0<Unit> function0) {
        this.onDismiss.setValue(function0);
    }

    public final void bind(GenericAlertContent<? extends GenericAction> content, Optional<com.robinhood.rosetta.eventlogging.Context> loggingEquityOrderContext, Function0<Unit> onDismiss) {
        Intrinsics.checkNotNullParameter(loggingEquityOrderContext, "loggingEquityOrderContext");
        Intrinsics.checkNotNullParameter(onDismiss, "onDismiss");
        setContent(content);
        setContext(loggingEquityOrderContext);
        setOnDismiss(onDismiss);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-882935614);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-882935614, i2, -1, "com.robinhood.android.trade.equity.ui.dialog.MarketSessionChangeAlertView.Content (MarketSessionChangeAlertView.kt:41)");
            }
            if (getContent() == null) {
                setVisibility(8);
            }
            GenericAlertContent<GenericAction> content = getContent();
            if (content == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.MarketSessionChangeAlertView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MarketSessionChangeAlertView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            com.robinhood.rosetta.eventlogging.Context orNull = getContext().getOrNull();
            if (orNull == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.MarketSessionChangeAlertView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MarketSessionChangeAlertView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            Function0<Unit> onDismiss = getOnDismiss();
            if (onDismiss == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup3 != null) {
                    scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.MarketSessionChangeAlertView$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return MarketSessionChangeAlertView.Content$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            setVisibility(0);
            TradingSessionChangedAlert.TradingSessionChangedAlertComposable(content, orNull, onDismiss, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup4 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup4 != null) {
            scopeUpdateScopeEndRestartGroup4.updateScope(new Function2() { // from class: com.robinhood.android.trade.equity.ui.dialog.MarketSessionChangeAlertView$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarketSessionChangeAlertView.Content$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
