package com.robinhood.android.advancedchart;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AbstractComposeView;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.advancedchart.AdvancedChartView;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.sdui.chartgroup.AdvancedChartGroupState;
import com.robinhood.android.sdui.chartgroup.AdvancedChartZoomKeys;
import com.robinhood.android.sdui.chartgroup.SduiAdvancedChartKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.ChartGroup;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.scarlet.ScarletManager2;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Ranges3;

/* compiled from: AdvancedChartView.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u00015B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u00100\u001a\u0002012\u0018\u0010\u000f\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0006\u0010\u0017\u001a\u00020\u0016J\u000e\u00102\u001a\u0002012\u0006\u0010\u001e\u001a\u00020\u001dJ\r\u00103\u001a\u000201H\u0017¢\u0006\u0002\u00104RS\u0010\u000f\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u001a\u0010\n\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0017\u001a\u00020\u00162\u0006\u0010\n\u001a\u00020\u00168B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u001c\u0010\u0015\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR/\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\u0010\n\u001a\u0004\u0018\u00010\u001d8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b#\u0010\u0015\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001c\u0010$\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010&0&0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010(\u001a\u0010\u0012\f\u0012\n '*\u0004\u0018\u00010)0)0%X\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010*\u001a\b\u0012\u0004\u0012\u00020&0+¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0017\u0010.\u001a\b\u0012\u0004\u0012\u00020)0+¢\u0006\b\n\u0000\u001a\u0004\b/\u0010-¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartView;", "Landroidx/compose/ui/platform/AbstractComposeView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyle", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "<set-?>", "Lkotlin/Pair;", "Lcom/robinhood/models/serverdriven/experimental/api/ChartGroup;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartZoomKeys;", "chartGroupWithZoomKeys", "getChartGroupWithZoomKeys", "()Lkotlin/Pair;", "setChartGroupWithZoomKeys", "(Lkotlin/Pair;)V", "chartGroupWithZoomKeys$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "advancedChartState", "getAdvancedChartState", "()Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;", "setAdvancedChartState", "(Lcom/robinhood/android/sdui/chartgroup/AdvancedChartGroupState;)V", "advancedChartState$delegate", "Lcom/robinhood/android/advancedchart/AdvancedChartView$Callbacks;", "callbacks", "getCallbacks", "()Lcom/robinhood/android/advancedchart/AdvancedChartView$Callbacks;", "setCallbacks", "(Lcom/robinhood/android/advancedchart/AdvancedChartView$Callbacks;)V", "callbacks$delegate", "scrubbingProgressRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "scrubbingModeRelay", "", "scrubbingProgressObs", "Lio/reactivex/Observable;", "getScrubbingProgressObs", "()Lio/reactivex/Observable;", "scrubbingModeObs", "getScrubbingModeObs", "setData", "", "setCallback", "Content", "(Landroidx/compose/runtime/Composer;I)V", "Callbacks", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AdvancedChartView extends AbstractComposeView {
    public static final int $stable = 8;

    /* renamed from: advancedChartState$delegate, reason: from kotlin metadata */
    private final SnapshotState advancedChartState;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final SnapshotState callbacks;

    /* renamed from: chartGroupWithZoomKeys$delegate, reason: from kotlin metadata */
    private final SnapshotState chartGroupWithZoomKeys;
    private final Observable<Boolean> scrubbingModeObs;
    private final BehaviorRelay<Boolean> scrubbingModeRelay;
    private final Observable<Float> scrubbingProgressObs;
    private final BehaviorRelay<Float> scrubbingProgressRelay;

    /* compiled from: AdvancedChartView.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advancedchart/AdvancedChartView$Callbacks;", "", "onXAxisZoomed", "", "newXAxisZoomRange", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "onXAxisZoomEnd", "feature-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onXAxisZoomEnd();

        void onXAxisZoomed(Ranges3<Float> newXAxisZoomRange);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdvancedChartView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdvancedChartView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$0(AdvancedChartView advancedChartView, int i, Composer composer, int i2) {
        advancedChartView.Content(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public /* synthetic */ AdvancedChartView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AdvancedChartView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.chartGroupWithZoomKeys = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        this.advancedChartState = SnapshotState3.mutableStateOf$default(new AdvancedChartGroupState(null, null, null, 0, false, 31, null), null, 2, null);
        this.callbacks = SnapshotState3.mutableStateOf$default(null, null, 2, null);
        BehaviorRelay<Float> behaviorRelayCreateDefault = BehaviorRelay.createDefault(Float.valueOf(0.0f));
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.scrubbingProgressRelay = behaviorRelayCreateDefault;
        BehaviorRelay<Boolean> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.scrubbingModeRelay = behaviorRelayCreate;
        this.scrubbingProgressObs = behaviorRelayCreateDefault;
        this.scrubbingModeObs = behaviorRelayCreate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final Tuples2<ChartGroup<GenericAction>, AdvancedChartZoomKeys> getChartGroupWithZoomKeys() {
        return (Tuples2) this.chartGroupWithZoomKeys.getValue();
    }

    private final void setChartGroupWithZoomKeys(Tuples2<? extends ChartGroup<? extends GenericAction>, AdvancedChartZoomKeys> tuples2) {
        this.chartGroupWithZoomKeys.setValue(tuples2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final AdvancedChartGroupState getAdvancedChartState() {
        return (AdvancedChartGroupState) this.advancedChartState.getValue();
    }

    private final void setAdvancedChartState(AdvancedChartGroupState advancedChartGroupState) {
        this.advancedChartState.setValue(advancedChartGroupState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue();
    }

    private final void setCallbacks(Callbacks callbacks) {
        this.callbacks.setValue(callbacks);
    }

    public final Observable<Float> getScrubbingProgressObs() {
        return this.scrubbingProgressObs;
    }

    public final Observable<Boolean> getScrubbingModeObs() {
        return this.scrubbingModeObs;
    }

    public final void setData(Tuples2<? extends ChartGroup<? extends GenericAction>, AdvancedChartZoomKeys> chartGroupWithZoomKeys, AdvancedChartGroupState advancedChartState) {
        Intrinsics.checkNotNullParameter(chartGroupWithZoomKeys, "chartGroupWithZoomKeys");
        Intrinsics.checkNotNullParameter(advancedChartState, "advancedChartState");
        setChartGroupWithZoomKeys(chartGroupWithZoomKeys);
        setAdvancedChartState(advancedChartState);
    }

    public final void setCallback(Callbacks callbacks) {
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        setCallbacks(callbacks);
    }

    /* compiled from: AdvancedChartView.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advancedchart.AdvancedChartView$Content$1 */
    static final class C84961 implements Function2<Composer, Integer, Unit> {
        C84961() {
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
                ComposerKt.traceEventStart(-193134929, i, -1, "com.robinhood.android.advancedchart.AdvancedChartView.Content.<anonymous> (AdvancedChartView.kt:62)");
            }
            Tuples2 chartGroupWithZoomKeys = AdvancedChartView.this.getChartGroupWithZoomKeys();
            if (chartGroupWithZoomKeys != null) {
                final AdvancedChartView advancedChartView = AdvancedChartView.this;
                ChartGroup chartGroup = (ChartGroup) chartGroupWithZoomKeys.getFirst();
                AdvancedChartGroupState advancedChartState = advancedChartView.getAdvancedChartState();
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21593getSmallD9Ej5fM(), 0.0f, 11, null);
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(advancedChartView);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartView$Content$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvancedChartView.C84961.invoke$lambda$8$lambda$1$lambda$0(advancedChartView, ((Float) obj).floatValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance2 = composer.changedInstance(advancedChartView);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartView$Content$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvancedChartView.C84961.invoke$lambda$8$lambda$3$lambda$2(advancedChartView, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance3 = composer.changedInstance(advancedChartView);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advancedchart.AdvancedChartView$Content$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return AdvancedChartView.C84961.invoke$lambda$8$lambda$5$lambda$4(advancedChartView, (Ranges3) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function13 = (Function1) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance4 = composer.changedInstance(advancedChartView);
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.advancedchart.AdvancedChartView$Content$1$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvancedChartView.C84961.invoke$lambda$8$lambda$7$lambda$6(advancedChartView);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                SduiAdvancedChartKt.SduiAdvancedChartGroup(chartGroup, modifierM5146paddingqDBjuR0$default, chartGroupWithZoomKeys, advancedChartState, function1, function12, null, function13, (Function0) objRememberedValue4, composer, AdvancedChartGroupState.$stable << 9, 64);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$1$lambda$0(AdvancedChartView advancedChartView, float f) {
            advancedChartView.scrubbingProgressRelay.accept(Float.valueOf(f));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$3$lambda$2(AdvancedChartView advancedChartView, boolean z) {
            advancedChartView.scrubbingModeRelay.accept(Boolean.valueOf(z));
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$5$lambda$4(AdvancedChartView advancedChartView, Ranges3 newXAxisZoomRange) {
            Intrinsics.checkNotNullParameter(newXAxisZoomRange, "newXAxisZoomRange");
            Callbacks callbacks = advancedChartView.getCallbacks();
            if (callbacks != null) {
                callbacks.onXAxisZoomed(newXAxisZoomRange);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(AdvancedChartView advancedChartView) {
            Callbacks callbacks = advancedChartView.getCallbacks();
            if (callbacks != null) {
                callbacks.onXAxisZoomEnd();
            }
            return Unit.INSTANCE;
        }
    }

    @Override // androidx.compose.p011ui.platform.AbstractComposeView
    public void Content(Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1252746237);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1252746237, i2, -1, "com.robinhood.android.advancedchart.AdvancedChartView.Content (AdvancedChartView.kt:61)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(ScarletManager2.getScarletManager(this)), null, ComposableLambda3.rememberComposableLambda(-193134929, true, new C84961(), composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advancedchart.AdvancedChartView$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvancedChartView.Content$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
