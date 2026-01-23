package com.robinhood.shared.crypto.transfer.enrollment;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NavigateTo.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/crypto/transfer/enrollment/NavigateTo;", "", "<init>", "(Ljava/lang/String;I)V", "PENDING_APPROVAL", "COMPLETED", "feature-crypto-transfer_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class NavigateTo {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NavigateTo[] $VALUES;
    public static final NavigateTo PENDING_APPROVAL = new NavigateTo("PENDING_APPROVAL", 0);
    public static final NavigateTo COMPLETED = new NavigateTo("COMPLETED", 1);

    private static final /* synthetic */ NavigateTo[] $values() {
        return new NavigateTo[]{PENDING_APPROVAL, COMPLETED};
    }

    public static EnumEntries<NavigateTo> getEntries() {
        return $ENTRIES;
    }

    private NavigateTo(String str, int i) {
    }

    static {
        NavigateTo[] navigateToArr$values = $values();
        $VALUES = navigateToArr$values;
        $ENTRIES = EnumEntries2.enumEntries(navigateToArr$values);
    }

    public static NavigateTo valueOf(String str) {
        return (NavigateTo) Enum.valueOf(NavigateTo.class, str);
    }

    public static NavigateTo[] values() {
        return (NavigateTo[]) $VALUES.clone();
    }
}
