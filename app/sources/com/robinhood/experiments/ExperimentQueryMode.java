package com.robinhood.experiments;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ExperimentQueryMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/experiments/ExperimentQueryMode;", "", "<init>", "(Ljava/lang/String;I)V", "ANY_ARE_MEMBER", "ALL_ARE_MEMBER", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class ExperimentQueryMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ExperimentQueryMode[] $VALUES;
    public static final ExperimentQueryMode ANY_ARE_MEMBER = new ExperimentQueryMode("ANY_ARE_MEMBER", 0);
    public static final ExperimentQueryMode ALL_ARE_MEMBER = new ExperimentQueryMode("ALL_ARE_MEMBER", 1);

    private static final /* synthetic */ ExperimentQueryMode[] $values() {
        return new ExperimentQueryMode[]{ANY_ARE_MEMBER, ALL_ARE_MEMBER};
    }

    public static EnumEntries<ExperimentQueryMode> getEntries() {
        return $ENTRIES;
    }

    private ExperimentQueryMode(String str, int i) {
    }

    static {
        ExperimentQueryMode[] experimentQueryModeArr$values = $values();
        $VALUES = experimentQueryModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(experimentQueryModeArr$values);
    }

    public static ExperimentQueryMode valueOf(String str) {
        return (ExperimentQueryMode) Enum.valueOf(ExperimentQueryMode.class, str);
    }

    public static ExperimentQueryMode[] values() {
        return (ExperimentQueryMode[]) $VALUES.clone();
    }
}
