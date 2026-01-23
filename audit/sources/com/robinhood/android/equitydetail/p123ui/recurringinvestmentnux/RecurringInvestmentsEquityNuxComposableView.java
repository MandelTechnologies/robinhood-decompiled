package com.robinhood.android.equitydetail.p123ui.recurringinvestmentnux;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.common.recurring.detailPageView.RecurringInvestmentsNuxComposable;
import com.robinhood.android.equitydetail.p123ui.RecurringInvestmentNuxData;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RecurringInvestmentsEquityNuxComposableView.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0002\b\u0017J\r\u0010\u0018\u001a\u00020\u0015H\u0017¢\u0006\u0002\u0010\u0019R\u001e\u0010\b\u001a\u00020\t8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/recurringinvestmentnux/RecurringInvestmentsEquityNuxComposableView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "recurringInvestmentNuxData", "Lcom/robinhood/android/equitydetail/ui/RecurringInvestmentNuxData;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "bind", "", WebsocketGatewayConstants.DATA_KEY, "bind$feature_equity_detail_externalDebug", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes3.dex */
public final class RecurringInvestmentsEquityNuxComposableView extends Hammer_RecurringInvestmentsEquityNuxComposableView {
    public static final int $stable = 8;
    public Navigator navigator;
    private RecurringInvestmentNuxData recurringInvestmentNuxData;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(RecurringInvestmentsEquityNuxComposableView recurringInvestmentsEquityNuxComposableView, int i, Composer composer, int i2) {
        recurringInvestmentsEquityNuxComposableView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(RecurringInvestmentsEquityNuxComposableView recurringInvestmentsEquityNuxComposableView, int i, Composer composer, int i2) {
        recurringInvestmentsEquityNuxComposableView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public RecurringInvestmentsEquityNuxComposableView(Context context, ViewModelStoreOwner viewModelStoreOwner) {
        super(viewModelStoreOwner, context, null, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
    }

    public final Navigator getNavigator() {
        Navigator navigator = this.navigator;
        if (navigator != null) {
            return navigator;
        }
        Intrinsics.throwUninitializedPropertyAccessException("navigator");
        return null;
    }

    public final void setNavigator(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "<set-?>");
        this.navigator = navigator;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.RECURRING_INVESTMENTS_EQUITY_NUX, null, null, 6, null);
    }

    public final void bind$feature_equity_detail_externalDebug(RecurringInvestmentNuxData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.recurringInvestmentNuxData = data;
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-834246655);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-834246655, i2, -1, "com.robinhood.android.equitydetail.ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView.SdpContent (RecurringInvestmentsEquityNuxComposableView.kt:34)");
            }
            if (this.recurringInvestmentNuxData == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RecurringInvestmentsEquityNuxComposableView.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(445066433, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equitydetail.ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView.SdpContent.2
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
                        ComposerKt.traceEventStart(445066433, i3, -1, "com.robinhood.android.equitydetail.ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView.SdpContent.<anonymous> (RecurringInvestmentsEquityNuxComposableView.kt:38)");
                    }
                    RecurringInvestmentNuxData recurringInvestmentNuxData = RecurringInvestmentsEquityNuxComposableView.this.recurringInvestmentNuxData;
                    if (recurringInvestmentNuxData != null) {
                        RecurringInvestmentsNuxComposable.RecurringInvestmentsEquityNuxComposable(recurringInvestmentNuxData.getInstrument().getId(), recurringInvestmentNuxData.getInstrument().getSymbol(), recurringInvestmentNuxData.getAccountNumber(), null, composer2, 0, 8);
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.recurringinvestmentnux.RecurringInvestmentsEquityNuxComposableView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RecurringInvestmentsEquityNuxComposableView.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
