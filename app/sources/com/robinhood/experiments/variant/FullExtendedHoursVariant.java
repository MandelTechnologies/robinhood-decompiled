package com.robinhood.experiments.variant;

import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: FullExtendedHoursVariant.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/experiments/variant/FullExtendedHoursVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "MEMBER", "V2", "isMember", "", "()Z", "Companion", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class FullExtendedHoursVariant implements RhEnum<FullExtendedHoursVariant> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FullExtendedHoursVariant[] $VALUES;
    private final String serverValue;
    public static final FullExtendedHoursVariant CONTROL = new FullExtendedHoursVariant("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final FullExtendedHoursVariant MEMBER = new FullExtendedHoursVariant("MEMBER", 1, KaizenExperiment.VARIATION_MEMBER);

    /* renamed from: V2 */
    public static final FullExtendedHoursVariant f5248V2 = new FullExtendedHoursVariant("V2", 2, DocUploadParentFragment.V2_TAG);

    private static final /* synthetic */ FullExtendedHoursVariant[] $values() {
        return new FullExtendedHoursVariant[]{CONTROL, MEMBER, f5248V2};
    }

    public static EnumEntries<FullExtendedHoursVariant> getEntries() {
        return $ENTRIES;
    }

    private FullExtendedHoursVariant(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        FullExtendedHoursVariant[] fullExtendedHoursVariantArr$values = $values();
        $VALUES = fullExtendedHoursVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(fullExtendedHoursVariantArr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isMember() {
        return this != CONTROL;
    }

    public static FullExtendedHoursVariant valueOf(String str) {
        return (FullExtendedHoursVariant) Enum.valueOf(FullExtendedHoursVariant.class, str);
    }

    public static FullExtendedHoursVariant[] values() {
        return (FullExtendedHoursVariant[]) $VALUES.clone();
    }
}
