package com.robinhood.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SimpleVariant.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/experiments/SimpleVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MEMBER", "Companion", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SimpleVariant implements RhEnum<SimpleVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SimpleVariant[] $VALUES;
    private final String serverValue;
    public static final SimpleVariant CONTROL = new SimpleVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final SimpleVariant MEMBER = new SimpleVariant("MEMBER", 1, KaizenExperiment.VARIATION_MEMBER);

    private static final /* synthetic */ SimpleVariant[] $values() {
        return new SimpleVariant[]{CONTROL, MEMBER};
    }

    public static EnumEntries<SimpleVariant> getEntries() {
        return $ENTRIES;
    }

    private SimpleVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        SimpleVariant[] simpleVariantArr$values = $values();
        $VALUES = simpleVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(simpleVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public static SimpleVariant valueOf(String str) {
        return (SimpleVariant) Enum.valueOf(SimpleVariant.class, str);
    }

    public static SimpleVariant[] values() {
        return (SimpleVariant[]) $VALUES.clone();
    }
}
