package com.robinhood.librobinhood.data.store.bonfire.portfolio;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: PerformanceChartExperiments.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments;", "", "<init>", "()V", "Benchmarking", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class PerformanceChartExperiments {
    public static final PerformanceChartExperiments INSTANCE = new PerformanceChartExperiments();

    private PerformanceChartExperiments() {
    }

    /* compiled from: PerformanceChartExperiments.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments$Benchmarking;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments$Benchmarking$Variants;", "<init>", "()V", "Variants", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes20.dex */
    public static final class Benchmarking extends Experiment<Variants> {
        public static final Benchmarking INSTANCE = new Benchmarking();

        private Benchmarking() {
            super("portfolio-benchmarking-android", null, 2, null);
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: PerformanceChartExperiments.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments$Benchmarking$Variants;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MEMBER_1", "MEMBER_2", "isEnabled", "", "()Z", "Companion", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes13.dex */
        public static final class Variants implements RhEnum<Variants> {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ Variants[] $VALUES;

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE;
            private final String serverValue;
            public static final Variants CONTROL = new Variants("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
            public static final Variants MEMBER_1 = new Variants("MEMBER_1", 1, KaizenExperiment.VARIATION_MEMBER);
            public static final Variants MEMBER_2 = new Variants("MEMBER_2", 2, "member2");

            private static final /* synthetic */ Variants[] $values() {
                return new Variants[]{CONTROL, MEMBER_1, MEMBER_2};
            }

            public static EnumEntries<Variants> getEntries() {
                return $ENTRIES;
            }

            private Variants(String str, int i, String str2) {
                this.serverValue = str2;
            }

            @Override // com.robinhood.enums.RhEnum
            public String getServerValue() {
                return this.serverValue;
            }

            static {
                Variants[] variantsArr$values = $values();
                $VALUES = variantsArr$values;
                $ENTRIES = EnumEntries2.enumEntries(variantsArr$values);
                INSTANCE = new Companion(null);
            }

            public final boolean isEnabled() {
                return this != CONTROL;
            }

            /* compiled from: PerformanceChartExperiments.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments$Benchmarking$Variants$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/librobinhood/data/store/bonfire/portfolio/PerformanceChartExperiments$Benchmarking$Variants;", "<init>", "()V", "lib-store-portfolio_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
            public static final class Companion extends RhEnum.Converter.Defaulted<Variants> {
                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                private Companion() {
                    super(Variants.values(), Variants.CONTROL, false, 4, null);
                }
            }

            public static Variants valueOf(String str) {
                return (Variants) Enum.valueOf(Variants.class, str);
            }

            public static Variants[] values() {
                return (Variants[]) $VALUES.clone();
            }
        }
    }
}
