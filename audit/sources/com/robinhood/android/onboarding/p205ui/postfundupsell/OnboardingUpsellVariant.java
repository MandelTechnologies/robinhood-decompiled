package com.robinhood.android.onboarding.p205ui.postfundupsell;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnboardingUpsellVariant.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/onboarding/ui/postfundupsell/OnboardingUpsellVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "RETIREMENT_VARIANT2", "GOLD_NATIVE_FUNDING_UPSELL", "Companion", "feature-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class OnboardingUpsellVariant implements RhEnum<OnboardingUpsellVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OnboardingUpsellVariant[] $VALUES;
    private final String serverValue;
    public static final OnboardingUpsellVariant CONTROL = new OnboardingUpsellVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final OnboardingUpsellVariant RETIREMENT_VARIANT2 = new OnboardingUpsellVariant("RETIREMENT_VARIANT2", 1, "retirement_variant2");
    public static final OnboardingUpsellVariant GOLD_NATIVE_FUNDING_UPSELL = new OnboardingUpsellVariant("GOLD_NATIVE_FUNDING_UPSELL", 2, "gold_native_funding_upsell");

    private static final /* synthetic */ OnboardingUpsellVariant[] $values() {
        return new OnboardingUpsellVariant[]{CONTROL, RETIREMENT_VARIANT2, GOLD_NATIVE_FUNDING_UPSELL};
    }

    public static EnumEntries<OnboardingUpsellVariant> getEntries() {
        return $ENTRIES;
    }

    private OnboardingUpsellVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        OnboardingUpsellVariant[] onboardingUpsellVariantArr$values = $values();
        $VALUES = onboardingUpsellVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(onboardingUpsellVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public static OnboardingUpsellVariant valueOf(String str) {
        return (OnboardingUpsellVariant) Enum.valueOf(OnboardingUpsellVariant.class, str);
    }

    public static OnboardingUpsellVariant[] values() {
        return (OnboardingUpsellVariant[]) $VALUES.clone();
    }
}
