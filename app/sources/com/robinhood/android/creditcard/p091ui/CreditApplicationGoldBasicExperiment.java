package com.robinhood.android.creditcard.p091ui;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.Experiment;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* compiled from: CreditApplicationGoldBasicExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;", "<init>", "()V", "Variant", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class CreditApplicationGoldBasicExperiment extends Experiment<Variant> {
    public static final CreditApplicationGoldBasicExperiment INSTANCE = new CreditApplicationGoldBasicExperiment();
    public static final int $stable = 8;

    private CreditApplicationGoldBasicExperiment() {
        super("credit-application-gold-basic", null, 2, null);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CreditApplicationGoldBasicExperiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/CreditApplicationGoldBasicExperiment$Variant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "CONTROL_WITH_EMAIL", "DOWNSELL_CTA", "PLAN_SELECTOR", "PLAN_SELECTOR_UPFRONT", "PLAN_SELECTOR_SUBTLE", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Variant implements RhEnum<Variant> {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Variant[] $VALUES;
        private final String serverValue;
        public static final Variant CONTROL = new Variant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
        public static final Variant CONTROL_WITH_EMAIL = new Variant("CONTROL_WITH_EMAIL", 1, "control-with-email");
        public static final Variant DOWNSELL_CTA = new Variant("DOWNSELL_CTA", 2, "downsell-cta");

        @Deprecated
        public static final Variant PLAN_SELECTOR = new Variant("PLAN_SELECTOR", 3, "plan-selector");

        @Deprecated
        public static final Variant PLAN_SELECTOR_UPFRONT = new Variant("PLAN_SELECTOR_UPFRONT", 4, "plan-selector-upfront");

        @Deprecated
        public static final Variant PLAN_SELECTOR_SUBTLE = new Variant("PLAN_SELECTOR_SUBTLE", 5, "plan-selector-subtle");

        private static final /* synthetic */ Variant[] $values() {
            return new Variant[]{CONTROL, CONTROL_WITH_EMAIL, DOWNSELL_CTA, PLAN_SELECTOR, PLAN_SELECTOR_UPFRONT, PLAN_SELECTOR_SUBTLE};
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

        public static Variant valueOf(String str) {
            return (Variant) Enum.valueOf(Variant.class, str);
        }

        public static Variant[] values() {
            return (Variant[]) $VALUES.clone();
        }
    }
}
