package com.robinhood.experiments.variant;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigationVariant.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/experiments/variant/NavigationVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "NAVIGATION_BY_INSTITUTION", "NAVIGATION_BY_ACCOUNT", "isInExperiment", "", "()Z", "Companion", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class NavigationVariant implements RhEnum<NavigationVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigationVariant[] $VALUES;
    private final String serverValue;
    public static final NavigationVariant CONTROL = new NavigationVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final NavigationVariant NAVIGATION_BY_INSTITUTION = new NavigationVariant("NAVIGATION_BY_INSTITUTION", 1, "nbi");
    public static final NavigationVariant NAVIGATION_BY_ACCOUNT = new NavigationVariant("NAVIGATION_BY_ACCOUNT", 2, "nba");

    private static final /* synthetic */ NavigationVariant[] $values() {
        return new NavigationVariant[]{CONTROL, NAVIGATION_BY_INSTITUTION, NAVIGATION_BY_ACCOUNT};
    }

    public static EnumEntries<NavigationVariant> getEntries() {
        return $ENTRIES;
    }

    private NavigationVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        NavigationVariant[] navigationVariantArr$values = $values();
        $VALUES = navigationVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(navigationVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isInExperiment() {
        return this != CONTROL;
    }

    public static NavigationVariant valueOf(String str) {
        return (NavigationVariant) Enum.valueOf(NavigationVariant.class, str);
    }

    public static NavigationVariant[] values() {
        return (NavigationVariant[]) $VALUES.clone();
    }
}
