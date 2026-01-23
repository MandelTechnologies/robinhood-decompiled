package com.robinhood.android.advancedchart;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.advancedchart.InstrumentSpanSelectorView;
import com.robinhood.android.charts.span.SpanSelector3;
import com.robinhood.android.charts.span.SpanSelector5;
import com.robinhood.android.designsystem.tooltip.RdsTooltipView;
import com.robinhood.android.equitydetail.C15314R;
import com.robinhood.android.equitydetail.p123ui.chart.InstrumentChartSpansDynamicSelector;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.app.GenericComposeView;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartIntervals;
import com.robinhood.models.p320db.bonfire.instrument.InstrumentChartSpans;
import com.robinhood.models.serverdriven.experimental.api.DisplaySpan;
import com.robinhood.tooltips.ModifiersKt;
import com.robinhood.tooltips.TooltipData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import p479j$.time.Duration;

/* compiled from: InstrumentSpanSelectorView.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010A\u001a\u00020(H\u0017¢\u0006\u0002\u0010BR/\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\t8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR/\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\b\u001a\u0004\u0018\u00010\u00118F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R/\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\b\u001a\u0004\u0018\u00010\u00188F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR+\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u001f8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010\u0010\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020(0'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u008f\u0001\u00102\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020(\u0018\u00010-28\u0010\b\u001a4\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(0\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b.\u0012\b\b/\u0012\u0004\b\b(1\u0012\u0004\u0012\u00020(\u0018\u00010-8F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b7\u0010\u0010\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00108\u001a\b\u0012\u0004\u0012\u00020(09X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R \u0010>\u001a\b\u0012\u0004\u0012\u00020(09X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010;\"\u0004\b@\u0010=¨\u0006C"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/InstrumentSpanSelectorView;", "Lcom/robinhood/compose/app/GenericComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "<set-?>", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "chartSpans", "getChartSpans", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;", "setChartSpans", "(Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartSpans;)V", "chartSpans$delegate", "Landroidx/compose/runtime/MutableState;", "", "displaySpan", "getDisplaySpan", "()Ljava/lang/String;", "setDisplaySpan", "(Ljava/lang/String;)V", "displaySpan$delegate", "Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "chartIntervals", "getChartIntervals", "()Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;", "setChartIntervals", "(Lcom/robinhood/models/db/bonfire/instrument/InstrumentChartIntervals;)V", "chartIntervals$delegate", "", "showCustomIntervalTooltip", "getShowCustomIntervalTooltip", "()Z", "setShowCustomIntervalTooltip", "(Z)V", "showCustomIntervalTooltip$delegate", "onSpanSelected", "Lkotlin/Function1;", "", "getOnSpanSelected", "()Lkotlin/jvm/functions/Function1;", "setOnSpanSelected", "(Lkotlin/jvm/functions/Function1;)V", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "instrumentId", "spanId", "onOpenCustomIntervals", "getOnOpenCustomIntervals", "()Lkotlin/jvm/functions/Function2;", "setOnOpenCustomIntervals", "(Lkotlin/jvm/functions/Function2;)V", "onOpenCustomIntervals$delegate", "onChartSettingsClicked", "Lkotlin/Function0;", "getOnChartSettingsClicked", "()Lkotlin/jvm/functions/Function0;", "setOnChartSettingsClicked", "(Lkotlin/jvm/functions/Function0;)V", "onCustomIntervalTooltipDismissed", "getOnCustomIntervalTooltipDismissed", "setOnCustomIntervalTooltipDismissed", "Content", "(Landroidx/compose/runtime/Composer;I)V", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class InstrumentSpanSelectorView extends GenericComposeView {
    public static final int $stable = 8;

    /* renamed from: chartIntervals$delegate, reason: from kotlin metadata */
    private final SnapshotState chartIntervals;

    /* renamed from: chartSpans$delegate, reason: from kotlin metadata */
    private final SnapshotState chartSpans;

    /* renamed from: displaySpan$delegate, reason: from kotlin metadata */
    private final SnapshotState displaySpan;
    private Function0<Unit> onChartSettingsClicked;
    private Function0<Unit> onCustomIntervalTooltipDismissed;

    /* renamed from: onOpenCustomIntervals$delegate, reason: from kotlin metadata */
    private final SnapshotState onOpenCustomIntervals;
    private Function1<? super String, Unit> onSpanSelected;

    /* renamed from: showCustomIntervalTooltip$delegate, reason: from kotlin metadata */
    private final SnapshotState showCustomIntervalTooltip;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$3(InstrumentSpanSelectorView instrumentSpanSelectorView, int i, Composer composer, int i2) {
        instrumentSpanSelectorView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$4(InstrumentSpanSelectorView instrumentSpanSelectorView, int i, Composer composer, int i2) {
        instrumentSpanSelectorView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$9(InstrumentSpanSelectorView instrumentSpanSelectorView, int i, Composer composer, int i2) {
        instrumentSpanSelectorView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstrumentSpanSelectorView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartSpans = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.displaySpan = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.chartIntervals = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.showCustomIntervalTooltip = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
        this.onSpanSelected = new Function1() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return InstrumentSpanSelectorView.onSpanSelected$lambda$0((String) obj);
            }
        };
        this.onOpenCustomIntervals = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.onChartSettingsClicked = new Function0() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
        this.onCustomIntervalTooltipDismissed = new Function0() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InstrumentChartSpans getChartSpans() {
        return (InstrumentChartSpans) this.chartSpans.getValue();
    }

    public final void setChartSpans(InstrumentChartSpans instrumentChartSpans) {
        this.chartSpans.setValue(instrumentChartSpans);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getDisplaySpan() {
        return (String) this.displaySpan.getValue();
    }

    public final void setDisplaySpan(String str) {
        this.displaySpan.setValue(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final InstrumentChartIntervals getChartIntervals() {
        return (InstrumentChartIntervals) this.chartIntervals.getValue();
    }

    public final void setChartIntervals(InstrumentChartIntervals instrumentChartIntervals) {
        this.chartIntervals.setValue(instrumentChartIntervals);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getShowCustomIntervalTooltip() {
        return ((Boolean) this.showCustomIntervalTooltip.getValue()).booleanValue();
    }

    public final void setShowCustomIntervalTooltip(boolean z) {
        this.showCustomIntervalTooltip.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onSpanSelected$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    public final Function1<String, Unit> getOnSpanSelected() {
        return this.onSpanSelected;
    }

    public final void setOnSpanSelected(Function1<? super String, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSpanSelected = function1;
    }

    public final Function2<String, String, Unit> getOnOpenCustomIntervals() {
        return (Function2) this.onOpenCustomIntervals.getValue();
    }

    public final void setOnOpenCustomIntervals(Function2<? super String, ? super String, Unit> function2) {
        this.onOpenCustomIntervals.setValue(function2);
    }

    public final Function0<Unit> getOnChartSettingsClicked() {
        return this.onChartSettingsClicked;
    }

    public final void setOnChartSettingsClicked(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChartSettingsClicked = function0;
    }

    public final Function0<Unit> getOnCustomIntervalTooltipDismissed() {
        return this.onCustomIntervalTooltipDismissed;
    }

    public final void setOnCustomIntervalTooltipDismissed(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCustomIntervalTooltipDismissed = function0;
    }

    @Override // com.robinhood.compose.app.GenericComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(2018524543);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2018524543, i2, -1, "com.robinhood.android.advancedchart.InstrumentSpanSelectorView.Content (InstrumentSpanSelectorView.kt:37)");
            }
            String displaySpan = getDisplaySpan();
            if (displaySpan == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentSpanSelectorView.Content$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            InstrumentChartSpans chartSpans = getChartSpans();
            if (chartSpans == null) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup2 != null) {
                    scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return InstrumentSpanSelectorView.Content$lambda$4(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            InstrumentChartIntervals chartIntervals = getChartIntervals();
            C85001 c85001 = new C85001(displaySpan);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InstrumentSpanSelectorView.Content$lambda$6$lambda$5(this.f$0, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            Function1 function1 = (Function1) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(this);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InstrumentSpanSelectorView.Content$lambda$8$lambda$7(this.f$0, (String) obj, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            InstrumentChartSpansDynamicSelector.InstrumentChartSpansDynamicSelector(chartSpans, displaySpan, null, chartIntervals, c85001, function1, (Function2) objRememberedValue2, null, ComposableLambda3.rememberComposableLambda(1028179280, true, new C85014(), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup3 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup3 != null) {
            scopeUpdateScopeEndRestartGroup3.updateScope(new Function2() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InstrumentSpanSelectorView.Content$lambda$9(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: InstrumentSpanSelectorView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$Content$1 */
    static final class C85001 implements Function4<Integer, DisplaySpan, Composer, Integer, Modifier> {
        final /* synthetic */ String $selectedSpanId;

        C85001(String str) {
            this.$selectedSpanId = str;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Modifier invoke(Integer num, DisplaySpan displaySpan, Composer composer, Integer num2) {
            return invoke(num.intValue(), displaySpan, composer, num2.intValue());
        }

        public final Modifier invoke(int i, DisplaySpan spanId, Composer composer, int i2) {
            InstrumentChartIntervals chartIntervals;
            Intrinsics.checkNotNullParameter(spanId, "spanId");
            composer.startReplaceGroup(58881122);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(58881122, i2, -1, "com.robinhood.android.advancedchart.InstrumentSpanSelectorView.Content.<anonymous> (InstrumentSpanSelectorView.kt:46)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            String strStringResource = StringResources_androidKt.stringResource(C15314R.string.chart_intervals_tooltip, composer, 0);
            InstrumentSpanSelectorView instrumentSpanSelectorView = InstrumentSpanSelectorView.this;
            String str = this.$selectedSpanId;
            if (!instrumentSpanSelectorView.getShowCustomIntervalTooltip() || !Intrinsics.areEqual(spanId.getServerValue(), str) || (chartIntervals = instrumentSpanSelectorView.getChartIntervals()) == null || !chartIntervals.containsCustomIntervals(str)) {
                strStringResource = null;
            }
            String str2 = strStringResource;
            TooltipData.Layout layout = new TooltipData.Layout(RdsTooltipView.NibDirection.DOWN, 0.0f, null, null, 14, null);
            Long lValueOf = Long.valueOf(Duration.ofSeconds(10L).toMillis());
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(InstrumentSpanSelectorView.this);
            final InstrumentSpanSelectorView instrumentSpanSelectorView2 = InstrumentSpanSelectorView.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$Content$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstrumentSpanSelectorView.C85001.invoke$lambda$2$lambda$1(instrumentSpanSelectorView2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifier = ModifiersKt.tooltip$default(companion, str2, layout, new TooltipData.Behavior(null, lValueOf, null, (Function0) objRememberedValue, 5, null), null, false, 24, null);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return modifier;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1(InstrumentSpanSelectorView instrumentSpanSelectorView) {
            instrumentSpanSelectorView.getOnCustomIntervalTooltipDismissed().invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$6$lambda$5(InstrumentSpanSelectorView instrumentSpanSelectorView, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        instrumentSpanSelectorView.onCustomIntervalTooltipDismissed.invoke();
        instrumentSpanSelectorView.onSpanSelected.invoke(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$8$lambda$7(InstrumentSpanSelectorView instrumentSpanSelectorView, String instrumentId, String spanId) {
        Intrinsics.checkNotNullParameter(instrumentId, "instrumentId");
        Intrinsics.checkNotNullParameter(spanId, "spanId");
        instrumentSpanSelectorView.onCustomIntervalTooltipDismissed.invoke();
        Function2<String, String, Unit> onOpenCustomIntervals = instrumentSpanSelectorView.getOnOpenCustomIntervals();
        if (onOpenCustomIntervals != null) {
            onOpenCustomIntervals.invoke(instrumentId, spanId);
        }
        return Unit.INSTANCE;
    }

    /* compiled from: InstrumentSpanSelectorView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$Content$4 */
    static final class C85014 implements Function3<Row5, Composer, Integer, Unit> {
        C85014() {
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
            invoke(row5, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Row5 InstrumentChartSpansDynamicSelector, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(InstrumentChartSpansDynamicSelector, "$this$InstrumentChartSpansDynamicSelector");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1028179280, i, -1, "com.robinhood.android.advancedchart.InstrumentSpanSelectorView.Content.<anonymous> (InstrumentSpanSelectorView.kt:68)");
            }
            SpanSelector5.BentoIcon bentoIcon = new SpanSelector5.BentoIcon(new BentoIcon4.Size16(ServerToBentoAssetMapper2.SETTINGS_16), StringResources_androidKt.stringResource(C15314R.string.chart_options_settings, composer, 0));
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(InstrumentSpanSelectorView.this);
            final InstrumentSpanSelectorView instrumentSpanSelectorView = InstrumentSpanSelectorView.this;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.advancedchart.InstrumentSpanSelectorView$Content$4$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InstrumentSpanSelectorView.C85014.invoke$lambda$1$lambda$0(instrumentSpanSelectorView);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            SpanSelector3.ChartSpanTrailingButton(bentoIcon, (Function0) objRememberedValue, null, composer, SpanSelector5.BentoIcon.$stable, 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(InstrumentSpanSelectorView instrumentSpanSelectorView) {
            instrumentSpanSelectorView.getOnCustomIntervalTooltipDismissed().invoke();
            instrumentSpanSelectorView.getOnChartSettingsClicked().invoke();
            return Unit.INSTANCE;
        }
    }
}
