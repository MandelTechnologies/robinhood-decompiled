package com.robinhood.android.common.rhymigration;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CmSunsetIncentiveExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "<init>", "()V", "Variant", "feature-lib-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class CmSunsetIncentiveExperiment extends Experiment<Variant> {
    public static final CmSunsetIncentiveExperiment INSTANCE = new CmSunsetIncentiveExperiment();

    private CmSunsetIncentiveExperiment() {
        super("rhy-sunset-cm-incentives-segment", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CmSunsetIncentiveExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0012B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/common/rhymigration/CmSunsetIncentiveExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "HIGH_VALUE", "DIRECT_DEPOSITOR", "RECENT_TRANSACTOR", "PRIOR_TRANSACTOR", "NEVER_DD_OR_TRANSACTOR", "isInExperiment", "", "()Z", "Companion", "feature-lib-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes2.dex */
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        private final String serverValue;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
        public static final Variant HIGH_VALUE = new Variant("HIGH_VALUE", 1, "high-value");
        public static final Variant DIRECT_DEPOSITOR = new Variant("DIRECT_DEPOSITOR", 2, "direct-depositor");
        public static final Variant RECENT_TRANSACTOR = new Variant("RECENT_TRANSACTOR", 3, "recent-transactor");
        public static final Variant PRIOR_TRANSACTOR = new Variant("PRIOR_TRANSACTOR", 4, "prior-transactor");
        public static final Variant NEVER_DD_OR_TRANSACTOR = new Variant("NEVER_DD_OR_TRANSACTOR", 5, "never-dd-or-transactor");

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, HIGH_VALUE, DIRECT_DEPOSITOR, RECENT_TRANSACTOR, PRIOR_TRANSACTOR, NEVER_DD_OR_TRANSACTOR};
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
