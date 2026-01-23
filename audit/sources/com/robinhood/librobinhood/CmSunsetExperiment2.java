package com.robinhood.librobinhood;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CmSunsetExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u0000 \u00182\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0018B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0016j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/librobinhood/CmSunsetCohortVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "COHORT1", "COHORT2", "COHORT3", "COHORT4", "COHORT5", "COHORT6", "COHORT7", "COHORT8", "COHORT9", "COHORT10", "isCohortOneOrLater", "", "()Z", "isCohortTwoOrLater", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.CmSunsetCohortVariant, reason: use source file name */
/* loaded from: classes8.dex */
public final class CmSunsetExperiment2 implements RhEnum<CmSunsetExperiment2> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CmSunsetExperiment2[] $VALUES;
    private final String serverValue;
    public static final CmSunsetExperiment2 CONTROL = new CmSunsetExperiment2("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final CmSunsetExperiment2 COHORT1 = new CmSunsetExperiment2("COHORT1", 1, "cohort-1");
    public static final CmSunsetExperiment2 COHORT2 = new CmSunsetExperiment2("COHORT2", 2, "cohort-2");
    public static final CmSunsetExperiment2 COHORT3 = new CmSunsetExperiment2("COHORT3", 3, "cohort-3");
    public static final CmSunsetExperiment2 COHORT4 = new CmSunsetExperiment2("COHORT4", 4, "cohort-4");
    public static final CmSunsetExperiment2 COHORT5 = new CmSunsetExperiment2("COHORT5", 5, "cohort-5");
    public static final CmSunsetExperiment2 COHORT6 = new CmSunsetExperiment2("COHORT6", 6, "cohort-6");
    public static final CmSunsetExperiment2 COHORT7 = new CmSunsetExperiment2("COHORT7", 7, "cohort-7");
    public static final CmSunsetExperiment2 COHORT8 = new CmSunsetExperiment2("COHORT8", 8, "cohort-8");
    public static final CmSunsetExperiment2 COHORT9 = new CmSunsetExperiment2("COHORT9", 9, "cohort-9");
    public static final CmSunsetExperiment2 COHORT10 = new CmSunsetExperiment2("COHORT10", 10, "cohort-10");

    private static final /* synthetic */ CmSunsetExperiment2[] $values() {
        return new CmSunsetExperiment2[]{CONTROL, COHORT1, COHORT2, COHORT3, COHORT4, COHORT5, COHORT6, COHORT7, COHORT8, COHORT9, COHORT10};
    }

    public static EnumEntries<CmSunsetExperiment2> getEntries() {
        return $ENTRIES;
    }

    private CmSunsetExperiment2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        CmSunsetExperiment2[] cmSunsetExperiment2Arr$values = $values();
        $VALUES = cmSunsetExperiment2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(cmSunsetExperiment2Arr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isCohortOneOrLater() {
        return ordinal() > CONTROL.ordinal();
    }

    public final boolean isCohortTwoOrLater() {
        return ordinal() > COHORT1.ordinal();
    }

    public static CmSunsetExperiment2 valueOf(String str) {
        return (CmSunsetExperiment2) Enum.valueOf(CmSunsetExperiment2.class, str);
    }

    public static CmSunsetExperiment2[] values() {
        return (CmSunsetExperiment2[]) $VALUES.clone();
    }
}
