package com.robinhood.android.common.directdeposit;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DirectDepositSource.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/common/directdeposit/DirectDepositSource;", "", "<init>", "(Ljava/lang/String;I)V", "ALREADY_SET_UP_DD", "MANUAL_ACCOUNT_ROUTING", "MANUAL_FORM_HR", "SWITCHER", "feature-lib-direct-deposit_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class DirectDepositSource {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ DirectDepositSource[] $VALUES;
    public static final DirectDepositSource ALREADY_SET_UP_DD = new DirectDepositSource("ALREADY_SET_UP_DD", 0);
    public static final DirectDepositSource MANUAL_ACCOUNT_ROUTING = new DirectDepositSource("MANUAL_ACCOUNT_ROUTING", 1);
    public static final DirectDepositSource MANUAL_FORM_HR = new DirectDepositSource("MANUAL_FORM_HR", 2);
    public static final DirectDepositSource SWITCHER = new DirectDepositSource("SWITCHER", 3);

    private static final /* synthetic */ DirectDepositSource[] $values() {
        return new DirectDepositSource[]{ALREADY_SET_UP_DD, MANUAL_ACCOUNT_ROUTING, MANUAL_FORM_HR, SWITCHER};
    }

    public static EnumEntries<DirectDepositSource> getEntries() {
        return $ENTRIES;
    }

    private DirectDepositSource(String str, int i) {
    }

    static {
        DirectDepositSource[] directDepositSourceArr$values = $values();
        $VALUES = directDepositSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(directDepositSourceArr$values);
    }

    public static DirectDepositSource valueOf(String str) {
        return (DirectDepositSource) Enum.valueOf(DirectDepositSource.class, str);
    }

    public static DirectDepositSource[] values() {
        return (DirectDepositSource[]) $VALUES.clone();
    }
}
