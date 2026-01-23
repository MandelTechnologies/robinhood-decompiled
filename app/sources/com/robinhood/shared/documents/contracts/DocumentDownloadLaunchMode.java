package com.robinhood.shared.documents.contracts;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DocumentDownloadLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/documents/contracts/DocumentDownloadLaunchMode;", "", "<init>", "(Ljava/lang/String;I)V", "OPEN", "SHARE", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class DocumentDownloadLaunchMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DocumentDownloadLaunchMode[] $VALUES;
    public static final DocumentDownloadLaunchMode OPEN = new DocumentDownloadLaunchMode("OPEN", 0);
    public static final DocumentDownloadLaunchMode SHARE = new DocumentDownloadLaunchMode("SHARE", 1);

    private static final /* synthetic */ DocumentDownloadLaunchMode[] $values() {
        return new DocumentDownloadLaunchMode[]{OPEN, SHARE};
    }

    public static EnumEntries<DocumentDownloadLaunchMode> getEntries() {
        return $ENTRIES;
    }

    private DocumentDownloadLaunchMode(String str, int i) {
    }

    static {
        DocumentDownloadLaunchMode[] documentDownloadLaunchModeArr$values = $values();
        $VALUES = documentDownloadLaunchModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(documentDownloadLaunchModeArr$values);
    }

    public static DocumentDownloadLaunchMode valueOf(String str) {
        return (DocumentDownloadLaunchMode) Enum.valueOf(DocumentDownloadLaunchMode.class, str);
    }

    public static DocumentDownloadLaunchMode[] values() {
        return (DocumentDownloadLaunchMode[]) $VALUES.clone();
    }
}
