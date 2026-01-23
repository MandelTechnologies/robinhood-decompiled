package com.robinhood.android.optionschain.sbschain;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/NuxMode;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "DEEPLINK_ONBOARDING", "DEEPLINK_AFTER_SEARCH", "SBS_NUX_REVAMP", TransferContext3.NORMAL, "inNuxMode", "", "getInNuxMode", "()Z", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.NuxMode, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDataState4 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionSideBySideChainDataState4[] $VALUES;
    public static final OptionSideBySideChainDataState4 NONE = new OptionSideBySideChainDataState4("NONE", 0);
    public static final OptionSideBySideChainDataState4 DEEPLINK_ONBOARDING = new OptionSideBySideChainDataState4("DEEPLINK_ONBOARDING", 1);
    public static final OptionSideBySideChainDataState4 DEEPLINK_AFTER_SEARCH = new OptionSideBySideChainDataState4("DEEPLINK_AFTER_SEARCH", 2);
    public static final OptionSideBySideChainDataState4 SBS_NUX_REVAMP = new OptionSideBySideChainDataState4("SBS_NUX_REVAMP", 3);
    public static final OptionSideBySideChainDataState4 NORMAL = new OptionSideBySideChainDataState4(TransferContext3.NORMAL, 4);

    private static final /* synthetic */ OptionSideBySideChainDataState4[] $values() {
        return new OptionSideBySideChainDataState4[]{NONE, DEEPLINK_ONBOARDING, DEEPLINK_AFTER_SEARCH, SBS_NUX_REVAMP, NORMAL};
    }

    public static EnumEntries<OptionSideBySideChainDataState4> getEntries() {
        return $ENTRIES;
    }

    private OptionSideBySideChainDataState4(String str, int i) {
    }

    static {
        OptionSideBySideChainDataState4[] optionSideBySideChainDataState4Arr$values = $values();
        $VALUES = optionSideBySideChainDataState4Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionSideBySideChainDataState4Arr$values);
    }

    public final boolean getInNuxMode() {
        return this != NONE;
    }

    public static OptionSideBySideChainDataState4 valueOf(String str) {
        return (OptionSideBySideChainDataState4) Enum.valueOf(OptionSideBySideChainDataState4.class, str);
    }

    public static OptionSideBySideChainDataState4[] values() {
        return (OptionSideBySideChainDataState4[]) $VALUES.clone();
    }
}
