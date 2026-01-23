package com.robinhood.android.lib.trade.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.models.api.BrokerageAccountType;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import com.robinhood.rosetta.eventlogging.BrokerageAccountContext;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import okio.ByteString;

/* compiled from: TradeAccountSwitcherView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0017J\r\u0010 \u001a\u00020\u001fH\u0017¢\u0006\u0002\u0010!R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R+\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000e\u001a\u00020\u00178B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001d\u0010\u0016\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "getCallbacks", "()Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "setCallbacks", "(Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;)V", "<set-?>", "Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "state", "getState", "()Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;", "setState", "(Lcom/robinhood/android/lib/trade/view/TradeAccountSwitcherState;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "", "fillMaxWidth", "getFillMaxWidth", "()Z", "setFillMaxWidth", "(Z)V", "fillMaxWidth$delegate", "bind", "", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-lib-trade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class TradeAccountSwitcherView extends GenericComposeView {
    public static final int $stable = 8;
    private AccountSwitcherCallbacks3 callbacks;

    /* renamed from: fillMaxWidth$delegate, reason: from kotlin metadata */
    private final SnapshotState fillMaxWidth;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(TradeAccountSwitcherView tradeAccountSwitcherView, int i, Composer composer, int i2) {
        tradeAccountSwitcherView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$1(TradeAccountSwitcherView tradeAccountSwitcherView, int i, Composer composer, int i2) {
        tradeAccountSwitcherView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(TradeAccountSwitcherView tradeAccountSwitcherView, int i, Composer composer, int i2) {
        tradeAccountSwitcherView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TradeAccountSwitcherView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.fillMaxWidth = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    public final AccountSwitcherCallbacks3 getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(AccountSwitcherCallbacks3 accountSwitcherCallbacks3) {
        this.callbacks = accountSwitcherCallbacks3;
    }

    private final TradeAccountSwitcherState getState() {
        return (TradeAccountSwitcherState) this.state.getValue();
    }

    private final void setState(TradeAccountSwitcherState tradeAccountSwitcherState) {
        this.state.setValue(tradeAccountSwitcherState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getFillMaxWidth() {
        return ((Boolean) this.fillMaxWidth.getValue()).booleanValue();
    }

    private final void setFillMaxWidth(boolean z) {
        this.fillMaxWidth.setValue(Boolean.valueOf(z));
    }

    public final void bind(TradeAccountSwitcherState state, AccountSwitcherCallbacks3 callbacks, boolean fillMaxWidth) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setState(state);
        this.callbacks = callbacks;
        setFillMaxWidth(fillMaxWidth);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1700988499);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1700988499, i2, -1, "com.robinhood.android.lib.trade.view.TradeAccountSwitcherView.Content (TradeAccountSwitcherView.kt:43)");
            }
            final TradeAccountSwitcherState state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TradeAccountSwitcherView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            final AccountSwitcherCallbacks3 accountSwitcherCallbacks3 = this.callbacks;
            if (accountSwitcherCallbacks3 == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TradeAccountSwitcherView.Content$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            DefaultConstructorMarker defaultConstructorMarker = null;
            String str = null;
            ByteString byteString = null;
            Screen screen = new Screen(state.getScreenName(), null, str, byteString, 14, defaultConstructorMarker);
            Component component = new Component(Component.ComponentType.ACCOUNT_SWITCHER, str, byteString, 6, defaultConstructorMarker);
            BrokerageAccountType activeAccountType = state.getActiveAccountType();
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, activeAccountType != null ? new BrokerageAccountContext(BrokerageAccountTypes3.toProtobuf(activeAccountType), null, null, null, false, false, null, null, null, null, 1022, null) : null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -257, -1, -1, 16383, null), component, null, 37, null), ComposableLambda3.rememberComposableLambda(668019810, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherView.Content.2
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
                        ComposerKt.traceEventStart(668019810, i3, -1, "com.robinhood.android.lib.trade.view.TradeAccountSwitcherView.Content.<anonymous> (TradeAccountSwitcherView.kt:64)");
                    }
                    Modifier modifierFillMaxWidth$default = Modifier.INSTANCE;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, null, true, false, false, false, false, null, 125, null);
                    TradeAccountSwitcherView tradeAccountSwitcherView = TradeAccountSwitcherView.this;
                    TradeAccountSwitcherState tradeAccountSwitcherState = state;
                    AccountSwitcherCallbacks3 accountSwitcherCallbacks32 = accountSwitcherCallbacks3;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierAutoLogEvents$default);
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (tradeAccountSwitcherView.getFillMaxWidth()) {
                        modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifierFillMaxWidth$default, 0.0f, 1, null);
                    }
                    TradeAccountSwitcher2.TradeAccountSwitcher(ModifiersKt.autoLogEvents$default(modifierFillMaxWidth$default, null, false, false, false, true, false, null, 111, null), tradeAccountSwitcherState, accountSwitcherCallbacks32, composer2, 0, 0);
                    composer2.endNode();
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
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.lib.trade.view.TradeAccountSwitcherView$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeAccountSwitcherView.Content$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
