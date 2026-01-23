package com.robinhood.android.advanced.chart;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.SimpleVariant;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: AdvancedChartExperiments.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments;", "", "<init>", "()V", "ChartsIndicatorImprovementP1", "ChartsIndicatorImprovementP2", "ChartsIndicatorImprovementP3", "ChartsIndicatorImprovementP4", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AdvancedChartExperiments {
    public static final AdvancedChartExperiments INSTANCE = new AdvancedChartExperiments();

    private AdvancedChartExperiments() {
    }

    /* compiled from: AdvancedChartExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP1;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class ChartsIndicatorImprovementP1 extends Experiment<SimpleVariant> {
        public static final ChartsIndicatorImprovementP1 INSTANCE = new ChartsIndicatorImprovementP1();

        private ChartsIndicatorImprovementP1() {
            super("charts-improve-indicator-p1", null, 2, null);
        }
    }

    /* compiled from: AdvancedChartExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP2;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class ChartsIndicatorImprovementP2 extends Experiment<SimpleVariant> {
        public static final ChartsIndicatorImprovementP2 INSTANCE = new ChartsIndicatorImprovementP2();

        private ChartsIndicatorImprovementP2() {
            super("charts-improve-indicator-p2", null, 2, null);
        }
    }

    /* compiled from: AdvancedChartExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;", "<init>", "()V", "Variant", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class ChartsIndicatorImprovementP3 extends Experiment<Variant> {
        public static final ChartsIndicatorImprovementP3 INSTANCE = new ChartsIndicatorImprovementP3();

        private ChartsIndicatorImprovementP3() {
            super("charts-improve-indicator-p3", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvancedChartExperiments.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP3$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "BOTTOM_BUTTON", "BOTTOM_BUTTON_WITH_TOGGLE", "isInExperiment", "", "()Z", "Companion", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant BOTTOM_BUTTON = new Variant("BOTTOM_BUTTON", 1, "move-cta-only");
            public static final Variant BOTTOM_BUTTON_WITH_TOGGLE = new Variant("BOTTOM_BUTTON_WITH_TOGGLE", 2, "move-cta-add-toggles");

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, BOTTOM_BUTTON, BOTTOM_BUTTON_WITH_TOGGLE};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public final boolean isInExperiment() {
                return this != CONTROL;
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }

    /* compiled from: AdvancedChartExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4$Variant;", "<init>", "()V", "Variant", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public static final class ChartsIndicatorImprovementP4 extends Experiment<Variant> {
        public static final ChartsIndicatorImprovementP4 INSTANCE = new ChartsIndicatorImprovementP4();

        private ChartsIndicatorImprovementP4() {
            super("charts-improve-indicator-p4", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: AdvancedChartExperiments.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/advanced/chart/AdvancedChartExperiments$ChartsIndicatorImprovementP4$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "REMOVE_ROWS", "REMOVE_ROWS_ADD_HINT", "isInExperiment", "", "()Z", "Companion", "feature-lib-advanced-chart_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes24.dex */
        public static final class Variant implements RhEnum<Variant> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variant[] $VALUES;
            private final String serverValue;
            public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variant REMOVE_ROWS = new Variant("REMOVE_ROWS", 1, "remove-rows-only");
            public static final Variant REMOVE_ROWS_ADD_HINT = new Variant("REMOVE_ROWS_ADD_HINT", 2, "remove-rows-add-hint");

            private static final /* synthetic */ Variant[] $values() {
                return new Variant[]{CONTROL, REMOVE_ROWS, REMOVE_ROWS_ADD_HINT};
            }

            public static EnumEntries<Variant> getEntries() {
                return $ENTRIES;
            }

            private Variant(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variant[] variantArr$values = $values();
                $VALUES = variantArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantArr$values);
                INSTANCE = new Companion(null);
            }

            public final boolean isInExperiment() {
                return this != CONTROL;
            }

            public static Variant valueOf(String str) {
                return (Variant) Enum.valueOf(Variant.class, str);
            }

            public static Variant[] values() {
                return (Variant[]) $VALUES.clone();
            }
        }
    }
}
