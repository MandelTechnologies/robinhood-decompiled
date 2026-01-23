package com.robinhood.android.retirement.p239ui.signup;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AdvisoryIraSignUpIterationExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/retirement/ui/signup/IraSignUpIterationVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MULTI_MANAGED", "CONDITIONAL_SELF", "MULTI_SELF", "CONDITIONAL_MANAGED", "Companion", "feature-retirement-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.ui.signup.IraSignUpIterationVariant, reason: use source file name */
/* loaded from: classes5.dex */
public final class AdvisoryIraSignUpIterationExperiment2 implements RhEnum<AdvisoryIraSignUpIterationExperiment2> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AdvisoryIraSignUpIterationExperiment2[] $VALUES;
    private final String serverValue;
    public static final AdvisoryIraSignUpIterationExperiment2 CONTROL = new AdvisoryIraSignUpIterationExperiment2("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final AdvisoryIraSignUpIterationExperiment2 MULTI_MANAGED = new AdvisoryIraSignUpIterationExperiment2("MULTI_MANAGED", 1, "multi-managed");
    public static final AdvisoryIraSignUpIterationExperiment2 CONDITIONAL_SELF = new AdvisoryIraSignUpIterationExperiment2("CONDITIONAL_SELF", 2, "conditional-self");
    public static final AdvisoryIraSignUpIterationExperiment2 MULTI_SELF = new AdvisoryIraSignUpIterationExperiment2("MULTI_SELF", 3, "multi-self");
    public static final AdvisoryIraSignUpIterationExperiment2 CONDITIONAL_MANAGED = new AdvisoryIraSignUpIterationExperiment2("CONDITIONAL_MANAGED", 4, "conditional-managed");

    private static final /* synthetic */ AdvisoryIraSignUpIterationExperiment2[] $values() {
        return new AdvisoryIraSignUpIterationExperiment2[]{CONTROL, MULTI_MANAGED, CONDITIONAL_SELF, MULTI_SELF, CONDITIONAL_MANAGED};
    }

    public static EnumEntries<AdvisoryIraSignUpIterationExperiment2> getEntries() {
        return $ENTRIES;
    }

    private AdvisoryIraSignUpIterationExperiment2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AdvisoryIraSignUpIterationExperiment2[] advisoryIraSignUpIterationExperiment2Arr$values = $values();
        $VALUES = advisoryIraSignUpIterationExperiment2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(advisoryIraSignUpIterationExperiment2Arr$values);
        INSTANCE = new Companion(null);
    }

    public static AdvisoryIraSignUpIterationExperiment2 valueOf(String str) {
        return (AdvisoryIraSignUpIterationExperiment2) Enum.valueOf(AdvisoryIraSignUpIterationExperiment2.class, str);
    }

    public static AdvisoryIraSignUpIterationExperiment2[] values() {
        return (AdvisoryIraSignUpIterationExperiment2[]) $VALUES.clone();
    }
}
