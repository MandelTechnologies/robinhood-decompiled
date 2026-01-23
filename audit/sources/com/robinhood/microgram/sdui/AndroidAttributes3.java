package com.robinhood.microgram.sdui;

import com.robinhood.enums.RhEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AndroidAttributes.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/StatusBarStyle;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "LIGHT", "DARK", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.StatusBarStyle, reason: use source file name */
/* loaded from: classes13.dex */
public final class AndroidAttributes3 implements RhEnum<AndroidAttributes3> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AndroidAttributes3[] $VALUES;
    private final String serverValue;
    public static final AndroidAttributes3 LIGHT = new AndroidAttributes3("LIGHT", 0, "LIGHT");
    public static final AndroidAttributes3 DARK = new AndroidAttributes3("DARK", 1, "DARK");

    private static final /* synthetic */ AndroidAttributes3[] $values() {
        return new AndroidAttributes3[]{LIGHT, DARK};
    }

    public static EnumEntries<AndroidAttributes3> getEntries() {
        return $ENTRIES;
    }

    private AndroidAttributes3(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        AndroidAttributes3[] androidAttributes3Arr$values = $values();
        $VALUES = androidAttributes3Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(androidAttributes3Arr$values);
        INSTANCE = new Companion(null);
    }

    public static AndroidAttributes3 valueOf(String str) {
        return (AndroidAttributes3) Enum.valueOf(AndroidAttributes3.class, str);
    }

    public static AndroidAttributes3[] values() {
        return (AndroidAttributes3[]) $VALUES.clone();
    }
}
