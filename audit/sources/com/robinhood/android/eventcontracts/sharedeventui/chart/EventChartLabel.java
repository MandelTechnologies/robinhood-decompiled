package com.robinhood.android.eventcontracts.sharedeventui.chart;

import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.DayNightColor;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.collections.immutable.extensions2;

/* compiled from: EventChartLabel.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EventChartLabel {
    public static final EventChartLabel INSTANCE = new EventChartLabel();
    private static Function2<Composer, Integer, Unit> lambda$176634714 = ComposableLambda3.composableLambdaInstance(176634714, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt$lambda$176634714$1
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
                ComposerKt.traceEventStart(176634714, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt.lambda$176634714.<anonymous> (EventChartLabel.kt:107)");
            }
            Color.Companion companion = Color.INSTANCE;
            EventChartLabel6.EventChartLabel(extensions2.persistentListOf(new EventChartLabelItem(new DayNightColor(companion.m6717getBlue0d7_KjU(), companion.m6724getRed0d7_KjU(), null), "Auburn", "18%"), new EventChartLabelItem(new DayNightColor(companion.m6723getMagenta0d7_KjU(), companion.m6724getRed0d7_KjU(), null), "Duke", "17%"), new EventChartLabelItem(new DayNightColor(companion.m6721getGreen0d7_KjU(), companion.m6724getRed0d7_KjU(), null), "Houston", "8%")), 3, null, false, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$907527079 = ComposableLambda3.composableLambdaInstance(907527079, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt$lambda$907527079$1
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
                ComposerKt.traceEventStart(907527079, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt.lambda$907527079.<anonymous> (EventChartLabel.kt:146)");
            }
            Color.Companion companion = Color.INSTANCE;
            EventChartLabel6.EventChartLabel(extensions2.persistentListOf(new EventChartLabelItem(new DayNightColor(companion.m6724getRed0d7_KjU(), companion.m6717getBlue0d7_KjU(), null), "Auburn", "18%"), new EventChartLabelItem(new DayNightColor(companion.m6724getRed0d7_KjU(), companion.m6723getMagenta0d7_KjU(), null), "DukeDukeDukeDuke", "17%"), new EventChartLabelItem(new DayNightColor(companion.m6724getRed0d7_KjU(), companion.m6721getGreen0d7_KjU(), null), "HoustonHoustonHoustonHoustonHouston", null)), 3, null, false, composer, 48, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });
    private static Function2<Composer, Integer, Unit> lambda$663523416 = ComposableLambda3.composableLambdaInstance(663523416, false, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt$lambda$663523416$1
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
                ComposerKt.traceEventStart(663523416, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.chart.ComposableSingletons$EventChartLabelKt.lambda$663523416.<anonymous> (EventChartLabel.kt:185)");
            }
            EventChartLabel6.EventChartLabel(null, 3, null, false, composer, 54, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    });

    public final Function2<Composer, Integer, Unit> getLambda$176634714$lib_shared_event_ui_externalDebug() {
        return lambda$176634714;
    }

    public final Function2<Composer, Integer, Unit> getLambda$663523416$lib_shared_event_ui_externalDebug() {
        return lambda$663523416;
    }

    public final Function2<Composer, Integer, Unit> getLambda$907527079$lib_shared_event_ui_externalDebug() {
        return lambda$907527079;
    }
}
