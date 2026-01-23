package com.robinhood.android.options.contracts;

import com.robinhood.models.crypto.p314db.home.CryptoHomeCtaButtons;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionsDetailPageLaunchMode.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/options/contracts/OptionsDetailPageSource;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "HOME", "OTHER", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.options.contracts.OptionsDetailPageSource, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionsDetailPageLaunchMode4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionsDetailPageLaunchMode4[] $VALUES;
    public static final OptionsDetailPageLaunchMode4 HOME = new OptionsDetailPageLaunchMode4("HOME", 0, CryptoHomeCtaButtons.DEFAULT_ID);
    public static final OptionsDetailPageLaunchMode4 OTHER = new OptionsDetailPageLaunchMode4("OTHER", 1, "other");
    private final String serverValue;

    private static final /* synthetic */ OptionsDetailPageLaunchMode4[] $values() {
        return new OptionsDetailPageLaunchMode4[]{HOME, OTHER};
    }

    public static EnumEntries<OptionsDetailPageLaunchMode4> getEntries() {
        return $ENTRIES;
    }

    private OptionsDetailPageLaunchMode4(String str, int i, String str2) {
        this.serverValue = str2;
    }

    public final String getServerValue() {
        return this.serverValue;
    }

    static {
        OptionsDetailPageLaunchMode4[] optionsDetailPageLaunchMode4Arr$values = $values();
        $VALUES = optionsDetailPageLaunchMode4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionsDetailPageLaunchMode4Arr$values);
    }

    public static OptionsDetailPageLaunchMode4 valueOf(String str) {
        return (OptionsDetailPageLaunchMode4) Enum.valueOf(OptionsDetailPageLaunchMode4.class, str);
    }

    public static OptionsDetailPageLaunchMode4[] values() {
        return (OptionsDetailPageLaunchMode4[]) $VALUES.clone();
    }
}
