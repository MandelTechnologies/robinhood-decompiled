package com.robinhood.android.internalassettransfers.customselection.equity;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ShareSelection.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/internalassettransfers/customselection/equity/SelectionType;", "", "identifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getIdentifier", "()Ljava/lang/String;", "ALL_SHARES", "SPECIFIC_AMOUNT", "feature-internal-asset-transfers_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.internalassettransfers.customselection.equity.SelectionType, reason: use source file name */
/* loaded from: classes10.dex */
public final class ShareSelection2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ShareSelection2[] $VALUES;
    public static final ShareSelection2 ALL_SHARES = new ShareSelection2("ALL_SHARES", 0, "full");
    public static final ShareSelection2 SPECIFIC_AMOUNT = new ShareSelection2("SPECIFIC_AMOUNT", 1, "partial");
    private final String identifier;

    private static final /* synthetic */ ShareSelection2[] $values() {
        return new ShareSelection2[]{ALL_SHARES, SPECIFIC_AMOUNT};
    }

    public static EnumEntries<ShareSelection2> getEntries() {
        return $ENTRIES;
    }

    private ShareSelection2(String str, int i, String str2) {
        this.identifier = str2;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    static {
        ShareSelection2[] shareSelection2Arr$values = $values();
        $VALUES = shareSelection2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(shareSelection2Arr$values);
    }

    public static ShareSelection2 valueOf(String str) {
        return (ShareSelection2) Enum.valueOf(ShareSelection2.class, str);
    }

    public static ShareSelection2[] values() {
        return (ShareSelection2[]) $VALUES.clone();
    }
}
