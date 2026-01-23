package com.robinhood.android.equitydetail.p123ui.statistics;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.ViewModelStoreOwner;
import com.robinhood.android.educationtour.ComposeEducationTourScreen;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.educationtour.compose.LocalEducationTourScreen;
import com.robinhood.android.educationtour.extensions.ViewsKt;
import com.robinhood.android.equitydetail.p123ui.StatsViewData;
import com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView;
import com.robinhood.android.equitydetail.p123ui.statistics.InstrumentStatisticsView;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InstrumentStatisticsView.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001dB#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0018J\r\u0010\u001b\u001a\u00020\u001aH\u0017¢\u0006\u0002\u0010\u001cR\u0014\u0010\n\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR/\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/InstrumentStatisticsView;", "Lcom/robinhood/android/equitydetail/ui/analytics/LoggableSdpComposeView;", "context", "Landroid/content/Context;", "viewModelStoreOwner", "Landroidx/lifecycle/ViewModelStoreOwner;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroidx/lifecycle/ViewModelStoreOwner;Landroid/util/AttributeSet;)V", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "<set-?>", "Lcom/robinhood/android/equitydetail/ui/StatsViewData;", "state", "getState", "()Lcom/robinhood/android/equitydetail/ui/StatsViewData;", "setState", "(Lcom/robinhood/android/equitydetail/ui/StatsViewData;)V", "state$delegate", "Landroidx/compose/runtime/MutableState;", "callbacks", "Lcom/robinhood/android/equitydetail/ui/statistics/InstrumentStatisticsView$Callbacks;", "bind", "", "SdpContent", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SuppressLint({"ViewConstructor"})
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class InstrumentStatisticsView extends LoggableSdpComposeView {
    public static final int $stable = 8;
    private Callbacks callbacks;

    /* renamed from: state$delegate, reason: from kotlin metadata */
    private final SnapshotState state;

    /* compiled from: InstrumentStatisticsView.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/statistics/InstrumentStatisticsView$Callbacks;", "", "onBidAskClicked", "", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBidAskClicked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$0(InstrumentStatisticsView instrumentStatisticsView, int i, Composer composer, int i2) {
        instrumentStatisticsView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SdpContent$lambda$1(InstrumentStatisticsView instrumentStatisticsView, int i, Composer composer, int i2) {
        instrumentStatisticsView.SdpContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ InstrumentStatisticsView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, viewModelStoreOwner, (i & 4) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentStatisticsView(Context context, ViewModelStoreOwner viewModelStoreOwner, AttributeSet attributeSet) {
        super(viewModelStoreOwner, context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(viewModelStoreOwner, "viewModelStoreOwner");
        this.state = SnapshotState3.mutableStateOf$default(null, null, 2, null);
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public Component getComponent() {
        return new Component(Component.ComponentType.STATS_SECTION, null, null, 6, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final StatsViewData getState() {
        return (StatsViewData) this.state.getValue();
    }

    private final void setState(StatsViewData statsViewData) {
        this.state.setValue(statsViewData);
    }

    public final void bind(StatsViewData state, Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setState(state);
        this.callbacks = callbacks;
        ViewsKt.setEducationTourIds(this, state.getElementIds());
    }

    @Override // com.robinhood.android.equitydetail.p123ui.analytics.LoggableSdpComposeView
    public void SdpContent(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-361329629);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-361329629, i2, -1, "com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView.SdpContent (InstrumentStatisticsView.kt:49)");
            }
            StatsViewData state = getState();
            if (state == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentStatisticsView.SdpContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            LocalEducationTourScreen.ProvideEducationTourScreens(new ComposeEducationTourScreen[]{new ComposeEducationTourScreen(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, null, 2, null)}, ComposableLambda3.rememberComposableLambda(1304174495, true, new C155821(state, this), composerStartRestartGroup, 54), composerStartRestartGroup, ComposeEducationTourScreen.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentStatisticsView.SdpContent$lambda$1(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InstrumentStatisticsView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView$SdpContent$1 */
    static final class C155821 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ StatsViewData $adapterState;
        final /* synthetic */ InstrumentStatisticsView this$0;

        C155821(StatsViewData statsViewData, InstrumentStatisticsView instrumentStatisticsView) {
            this.$adapterState = statsViewData;
            this.this$0 = instrumentStatisticsView;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1304174495, i, -1, "com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView.SdpContent.<anonymous> (InstrumentStatisticsView.kt:56)");
            }
            Instrument instrument = this.$adapterState.getInstrument();
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(this.this$0);
            final InstrumentStatisticsView instrumentStatisticsView = this.this$0;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equitydetail.ui.statistics.InstrumentStatisticsView$SdpContent$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstrumentStatisticsView.C155821.invoke$lambda$1$lambda$0(instrumentStatisticsView);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            StatisticsSection.StatisticsSection(instrument, (Function0) objRememberedValue, null, null, composer, 0, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InstrumentStatisticsView instrumentStatisticsView) {
            Callbacks callbacks = instrumentStatisticsView.callbacks;
            if (callbacks != null) {
                callbacks.onBidAskClicked();
            }
            return Unit.INSTANCE;
        }
    }
}
