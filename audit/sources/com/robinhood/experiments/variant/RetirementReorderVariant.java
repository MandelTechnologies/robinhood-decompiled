package com.robinhood.experiments.variant;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RetirementReorderVariant.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/experiments/variant/RetirementReorderVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "HEADER_META", "POST_LIST", "Companion", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class RetirementReorderVariant implements RhEnum<RetirementReorderVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RetirementReorderVariant[] $VALUES;
    private final String serverValue;
    public static final RetirementReorderVariant CONTROL = new RetirementReorderVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final RetirementReorderVariant HEADER_META = new RetirementReorderVariant("HEADER_META", 1, "header-meta");
    public static final RetirementReorderVariant POST_LIST = new RetirementReorderVariant("POST_LIST", 2, "post-list");

    private static final /* synthetic */ RetirementReorderVariant[] $values() {
        return new RetirementReorderVariant[]{CONTROL, HEADER_META, POST_LIST};
    }

    public static EnumEntries<RetirementReorderVariant> getEntries() {
        return $ENTRIES;
    }

    private RetirementReorderVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RetirementReorderVariant[] retirementReorderVariantArr$values = $values();
        $VALUES = retirementReorderVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(retirementReorderVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public static RetirementReorderVariant valueOf(String str) {
        return (RetirementReorderVariant) Enum.valueOf(RetirementReorderVariant.class, str);
    }

    public static RetirementReorderVariant[] values() {
        return (RetirementReorderVariant[]) $VALUES.clone();
    }
}
