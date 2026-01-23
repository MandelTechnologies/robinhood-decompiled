package com.robinhood.librobinhood;

import com.robinhood.android.doc.DocUploadParentFragment;
import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CmSunsetExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u0000 \u000f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\f\u0010\u000ej\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/librobinhood/CmSunsetVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "V1", "V2", "isMember", "", "()Z", "Companion", "lib-store-mcduckling_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.librobinhood.CmSunsetVariant, reason: use source file name */
/* loaded from: classes8.dex */
public final class CmSunsetExperiment4 implements RhEnum<CmSunsetExperiment4> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CmSunsetExperiment4[] $VALUES;
    private final String serverValue;
    public static final CmSunsetExperiment4 CONTROL = new CmSunsetExperiment4("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);

    /* renamed from: V1 */
    public static final CmSunsetExperiment4 f5264V1 = new CmSunsetExperiment4("V1", 1, "v1");

    /* renamed from: V2 */
    public static final CmSunsetExperiment4 f5265V2 = new CmSunsetExperiment4("V2", 2, DocUploadParentFragment.V2_TAG);

    private static final /* synthetic */ CmSunsetExperiment4[] $values() {
        return new CmSunsetExperiment4[]{CONTROL, f5264V1, f5265V2};
    }

    public static EnumEntries<CmSunsetExperiment4> getEntries() {
        return $ENTRIES;
    }

    private CmSunsetExperiment4(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        CmSunsetExperiment4[] cmSunsetExperiment4Arr$values = $values();
        $VALUES = cmSunsetExperiment4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(cmSunsetExperiment4Arr$values);
        INSTANCE = new Companion(null);
    }

    public final boolean isMember() {
        return this != CONTROL;
    }

    public static CmSunsetExperiment4 valueOf(String str) {
        return (CmSunsetExperiment4) Enum.valueOf(CmSunsetExperiment4.class, str);
    }

    public static CmSunsetExperiment4[] values() {
        return (CmSunsetExperiment4[]) $VALUES.clone();
    }
}
