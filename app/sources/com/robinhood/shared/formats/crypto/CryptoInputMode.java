package com.robinhood.shared.formats.crypto;

import com.robinhood.rosetta.eventlogging.CryptoStakingContext;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: CryptoInputMode.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0006\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\u0004j\u0002\b\u0005¨\u0006\u000b"}, m3636d2 = {"Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "", "<init>", "(Ljava/lang/String;I)V", "QUOTE_CURRENCY", "ASSET_CURRENCY", "other", "getOther", "()Lcom/robinhood/shared/formats/crypto/CryptoInputMode;", "mapToEntryType", "Lcom/robinhood/rosetta/eventlogging/CryptoStakingContext$OrderContext$EntryType;", "lib-formats-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes6.dex */
public final class CryptoInputMode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoInputMode[] $VALUES;
    public static final CryptoInputMode QUOTE_CURRENCY = new CryptoInputMode("QUOTE_CURRENCY", 0);
    public static final CryptoInputMode ASSET_CURRENCY = new CryptoInputMode("ASSET_CURRENCY", 1);

    /* compiled from: CryptoInputMode.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoInputMode.values().length];
            try {
                iArr[CryptoInputMode.QUOTE_CURRENCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoInputMode.ASSET_CURRENCY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static final /* synthetic */ CryptoInputMode[] $values() {
        return new CryptoInputMode[]{QUOTE_CURRENCY, ASSET_CURRENCY};
    }

    public static EnumEntries<CryptoInputMode> getEntries() {
        return $ENTRIES;
    }

    private CryptoInputMode(String str, int i) {
    }

    static {
        CryptoInputMode[] cryptoInputModeArr$values = $values();
        $VALUES = cryptoInputModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoInputModeArr$values);
    }

    public final CryptoInputMode getOther() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return ASSET_CURRENCY;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return QUOTE_CURRENCY;
    }

    public final CryptoStakingContext.OrderContext.EntryType mapToEntryType() {
        int i = WhenMappings.$EnumSwitchMapping$0[ordinal()];
        if (i == 1) {
            return CryptoStakingContext.OrderContext.EntryType.QUOTE;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return CryptoStakingContext.OrderContext.EntryType.ASSET;
    }

    public static CryptoInputMode valueOf(String str) {
        return (CryptoInputMode) Enum.valueOf(CryptoInputMode.class, str);
    }

    public static CryptoInputMode[] values() {
        return (CryptoInputMode[]) $VALUES.clone();
    }
}
