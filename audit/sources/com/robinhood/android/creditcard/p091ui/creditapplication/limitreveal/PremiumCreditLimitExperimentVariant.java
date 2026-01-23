package com.robinhood.android.creditcard.p091ui.creditapplication.limitreveal;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PremiumCreditLimitExperimentVariant.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/creditcard/ui/creditapplication/limitreveal/PremiumCreditLimitExperimentVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "CLI_14", "CLI_12", "isInExperiment", "", "()Z", "Companion", "feature-credit-card_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class PremiumCreditLimitExperimentVariant implements RhEnum<PremiumCreditLimitExperimentVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PremiumCreditLimitExperimentVariant[] $VALUES;
    private final String serverValue;
    public static final PremiumCreditLimitExperimentVariant CONTROL = new PremiumCreditLimitExperimentVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final PremiumCreditLimitExperimentVariant CLI_14 = new PremiumCreditLimitExperimentVariant("CLI_14", 1, "cli-14");
    public static final PremiumCreditLimitExperimentVariant CLI_12 = new PremiumCreditLimitExperimentVariant("CLI_12", 2, "cli-12");

    private static final /* synthetic */ PremiumCreditLimitExperimentVariant[] $values() {
        return new PremiumCreditLimitExperimentVariant[]{CONTROL, CLI_14, CLI_12};
    }

    public static EnumEntries<PremiumCreditLimitExperimentVariant> getEntries() {
        return $ENTRIES;
    }

    private PremiumCreditLimitExperimentVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        PremiumCreditLimitExperimentVariant[] premiumCreditLimitExperimentVariantArr$values = $values();
        $VALUES = premiumCreditLimitExperimentVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(premiumCreditLimitExperimentVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isInExperiment() {
        return this != CONTROL;
    }

    public static PremiumCreditLimitExperimentVariant valueOf(String str) {
        return (PremiumCreditLimitExperimentVariant) Enum.valueOf(PremiumCreditLimitExperimentVariant.class, str);
    }

    public static PremiumCreditLimitExperimentVariant[] values() {
        return (PremiumCreditLimitExperimentVariant[]) $VALUES.clone();
    }
}
