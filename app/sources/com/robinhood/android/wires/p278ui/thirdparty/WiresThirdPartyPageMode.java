package com.robinhood.android.wires.p278ui.thirdparty;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WiresThirdPartyPageMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/wires/ui/thirdparty/WiresThirdPartyPageMode;", "", "<init>", "(Ljava/lang/String;I)V", "SCAM_PREVENTION", "SUBMIT_TITLE_DOCUMENTS_PROMPT", "DOCUMENT_UPLOAD", "INFORMATION_INTAKE", "REVIEW_SCREEN", "feature-wires_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class WiresThirdPartyPageMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ WiresThirdPartyPageMode[] $VALUES;
    public static final WiresThirdPartyPageMode SCAM_PREVENTION = new WiresThirdPartyPageMode("SCAM_PREVENTION", 0);
    public static final WiresThirdPartyPageMode SUBMIT_TITLE_DOCUMENTS_PROMPT = new WiresThirdPartyPageMode("SUBMIT_TITLE_DOCUMENTS_PROMPT", 1);
    public static final WiresThirdPartyPageMode DOCUMENT_UPLOAD = new WiresThirdPartyPageMode("DOCUMENT_UPLOAD", 2);
    public static final WiresThirdPartyPageMode INFORMATION_INTAKE = new WiresThirdPartyPageMode("INFORMATION_INTAKE", 3);
    public static final WiresThirdPartyPageMode REVIEW_SCREEN = new WiresThirdPartyPageMode("REVIEW_SCREEN", 4);

    private static final /* synthetic */ WiresThirdPartyPageMode[] $values() {
        return new WiresThirdPartyPageMode[]{SCAM_PREVENTION, SUBMIT_TITLE_DOCUMENTS_PROMPT, DOCUMENT_UPLOAD, INFORMATION_INTAKE, REVIEW_SCREEN};
    }

    public static EnumEntries<WiresThirdPartyPageMode> getEntries() {
        return $ENTRIES;
    }

    private WiresThirdPartyPageMode(String str, int i) {
    }

    static {
        WiresThirdPartyPageMode[] wiresThirdPartyPageModeArr$values = $values();
        $VALUES = wiresThirdPartyPageModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(wiresThirdPartyPageModeArr$values);
    }

    public static WiresThirdPartyPageMode valueOf(String str) {
        return (WiresThirdPartyPageMode) Enum.valueOf(WiresThirdPartyPageMode.class, str);
    }

    public static WiresThirdPartyPageMode[] values() {
        return (WiresThirdPartyPageMode[]) $VALUES.clone();
    }
}
