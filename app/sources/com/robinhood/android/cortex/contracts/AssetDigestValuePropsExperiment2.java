package com.robinhood.android.cortex.contracts;

import com.robinhood.enums.RhEnum;
import com.robinhood.models.p320db.KaizenExperiment;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AssetDigestValuePropsExperiment.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cortex/contracts/AssetDigestValuePropsVariant;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CONTROL", "VIDEO", "STATIC", "Companion", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cortex.contracts.AssetDigestValuePropsVariant, reason: use source file name */
/* loaded from: classes2.dex */
public final class AssetDigestValuePropsExperiment2 implements RhEnum<AssetDigestValuePropsExperiment2> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AssetDigestValuePropsExperiment2[] $VALUES;
    private final String serverValue;
    public static final AssetDigestValuePropsExperiment2 CONTROL = new AssetDigestValuePropsExperiment2("CONTROL", 0, KaizenExperiment.VARIATION_CONTROL);
    public static final AssetDigestValuePropsExperiment2 VIDEO = new AssetDigestValuePropsExperiment2("VIDEO", 1, "video");
    public static final AssetDigestValuePropsExperiment2 STATIC = new AssetDigestValuePropsExperiment2("STATIC", 2, "static");

    private static final /* synthetic */ AssetDigestValuePropsExperiment2[] $values() {
        return new AssetDigestValuePropsExperiment2[]{CONTROL, VIDEO, STATIC};
    }

    public static EnumEntries<AssetDigestValuePropsExperiment2> getEntries() {
        return $ENTRIES;
    }

    private AssetDigestValuePropsExperiment2(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AssetDigestValuePropsExperiment2[] assetDigestValuePropsExperiment2Arr$values = $values();
        $VALUES = assetDigestValuePropsExperiment2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(assetDigestValuePropsExperiment2Arr$values);
        INSTANCE = new Companion(null);
    }

    public static AssetDigestValuePropsExperiment2 valueOf(String str) {
        return (AssetDigestValuePropsExperiment2) Enum.valueOf(AssetDigestValuePropsExperiment2.class, str);
    }

    public static AssetDigestValuePropsExperiment2[] values() {
        return (AssetDigestValuePropsExperiment2[]) $VALUES.clone();
    }
}
