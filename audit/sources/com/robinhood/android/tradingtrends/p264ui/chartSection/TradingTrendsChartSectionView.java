package com.robinhood.android.tradingtrends.p264ui.chartSection;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.equities.contracts.tradingtrends.TradingTrendsDetailsContract;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionState3;
import com.robinhood.android.tradingtrends.p264ui.chartSection.TradingTrendsChartSectionView;
import com.robinhood.android.tradingtrends.p264ui.details.TradingTrendsDetailsFragment;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: TradingTrendsChartSectionView.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001)B\u001d\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010$\u001a\u00020%H\u0017¢\u0006\u0002\u0010&J\u0018\u0010'\u001a\u00020%2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010(\u001a\u00020\u0015H\u0002R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R/\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u00158F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u001d8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006*"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "callbacks", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView$Callback;", "getCallbacks", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView$Callback;", "setCallbacks", "(Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView$Callback;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "setNavigator", "(Lcom/robinhood/android/navigation/Navigator;)V", "<set-?>", "", "instrumentId", "getInstrumentId", "()Ljava/lang/String;", "setInstrumentId", "(Ljava/lang/String;)V", "instrumentId$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "state", "getState", "()Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;", "setState", "(Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionViewState;)V", "state$delegate", "Content", "", "(Landroidx/compose/runtime/Composer;I)V", "handleOnExpandTradingTrendsDetails", "tradingTrendsType", "Callback", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes9.dex */
public final class TradingTrendsChartSectionView extends Hammer_TradingTrendsChartSectionView {
    public static final int $stable = 8;
    private Callback callbacks;

    /* renamed from: instrumentId$delegate, reason: from kotlin metadata */
    private final SnapshotState instrumentId;
    public Navigator navigator;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* compiled from: TradingTrendsChartSectionView.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/android/tradingtrends/ui/chartSection/TradingTrendsChartSectionView$Callback;", "", "onTradingTrendsTypeSelected", "", "tradingTrendsType", "", "expandTradingTrendsDetails", "viewPagerInputEnabled", "", "fragment", "Landroidx/fragment/app/Fragment;", "lib-trading-trends_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callback {
        void expandTradingTrendsDetails(boolean viewPagerInputEnabled, Fragment fragment);

        void onTradingTrendsTypeSelected(String tradingTrendsType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public TradingTrendsChartSectionView(Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(TradingTrendsChartSectionView tradingTrendsChartSectionView, int i, Composer composer, int i2) {
        tradingTrendsChartSectionView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ TradingTrendsChartSectionView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public TradingTrendsChartSectionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
        Intrinsics.checkNotNullParameter(context, "context");
        this.instrumentId = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.state = SnapshotState3.mutableStateOf$default(TradingTrendsChartSectionState3.Disabled.INSTANCE, null, 2, null);
    }

    public final Callback getCallbacks() {
        return this.callbacks;
    }

    public final void setCallbacks(Callback callback) {
        this.callbacks = callback;
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

    /* JADX WARN: Multi-variable type inference failed */
    public final String getInstrumentId() {
        return (String) this.instrumentId.getValue();
    }

    public final void setInstrumentId(String str) {
        this.instrumentId.setValue(str);
    }

    public final TradingTrendsChartSectionState3 getState() {
        return (TradingTrendsChartSectionState3) this.state.getValue();
    }

    public final void setState(TradingTrendsChartSectionState3 tradingTrendsChartSectionState3) {
        Intrinsics.checkNotNullParameter(tradingTrendsChartSectionState3, "<set-?>");
        this.state.setValue(tradingTrendsChartSectionState3);
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1134773141);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1134773141, i2, -1, "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Content (TradingTrendsChartSectionView.kt:41)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(getNavigator()), ComposableLambda3.rememberComposableLambda(-28229333, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Content.1
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
                        ComposerKt.traceEventStart(-28229333, i3, -1, "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Content.<anonymous> (TradingTrendsChartSectionView.kt:45)");
                    }
                    AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, new Screen(Screen.Name.STOCK_DETAIL_PAGE, null, null, null, 14, null), null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(1150912598, true, new AnonymousClass1(TradingTrendsChartSectionView.this), composer2, 54), composer2, 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TradingTrendsChartSectionView.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView$Content$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ TradingTrendsChartSectionView this$0;

                    AnonymousClass1(TradingTrendsChartSectionView tradingTrendsChartSectionView) {
                        this.this$0 = tradingTrendsChartSectionView;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1150912598, i, -1, "com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView.Content.<anonymous>.<anonymous> (TradingTrendsChartSectionView.kt:50)");
                        }
                        String instrumentId = this.this$0.getInstrumentId();
                        if (instrumentId != null) {
                            final TradingTrendsChartSectionView tradingTrendsChartSectionView = this.this$0;
                            TradingTrendsChartSectionState3 state = tradingTrendsChartSectionView.getState();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer.changedInstance(tradingTrendsChartSectionView);
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView$Content$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TradingTrendsChartSectionView.C299881.AnonymousClass1.invoke$lambda$3$lambda$1$lambda$0(tradingTrendsChartSectionView, (String) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function1 = (Function1) objRememberedValue;
                            composer.endReplaceGroup();
                            composer.startReplaceGroup(5004770);
                            boolean zChangedInstance2 = composer.changedInstance(tradingTrendsChartSectionView);
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new TradingTrendsChartSectionView2(tradingTrendsChartSectionView);
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            TradingTrendsChartSection.TradingTrendsChartSection(instrumentId, state, null, function1, (Function2) ((KFunction) objRememberedValue2), composer, 0, 4);
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$3$lambda$1$lambda$0(TradingTrendsChartSectionView tradingTrendsChartSectionView, String type2) {
                        Intrinsics.checkNotNullParameter(type2, "type");
                        Callback callbacks = tradingTrendsChartSectionView.getCallbacks();
                        if (callbacks != null) {
                            callbacks.onTradingTrendsTypeSelected(type2);
                        }
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.tradingtrends.ui.chartSection.TradingTrendsChartSectionView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradingTrendsChartSectionView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleOnExpandTradingTrendsDetails(String instrumentId, String tradingTrendsType) {
        Callback callback = this.callbacks;
        if (callback != null) {
            callback.expandTradingTrendsDetails(false, TradingTrendsDetailsFragment.INSTANCE.createFragment((FragmentKey) new TradingTrendsDetailsContract.Key(instrumentId, tradingTrendsType)));
        }
    }
}
