package com.robinhood.android.optionschain.sbschain;

import com.robinhood.models.p320db.OptionContractType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OptionSideBySideChainDataState.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u000b\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "", "loggingIdentifier", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getLoggingIdentifier", "()Ljava/lang/String;", "CALL", "PUT", "BOTH", "getNextState", "optionContractType", "Lcom/robinhood/models/db/OptionContractType;", "isCallSideVisible", "", "isPutSideVisible", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.CallPutSwitcherState, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainDataState2 {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionSideBySideChainDataState2[] $VALUES;
    private final String loggingIdentifier;
    public static final OptionSideBySideChainDataState2 CALL = new OptionSideBySideChainDataState2("CALL", 0, "CALL");
    public static final OptionSideBySideChainDataState2 PUT = new OptionSideBySideChainDataState2("PUT", 1, "PUT");
    public static final OptionSideBySideChainDataState2 BOTH = new OptionSideBySideChainDataState2("BOTH", 2, "CALL_PUT");

    /* compiled from: OptionSideBySideChainDataState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.optionschain.sbschain.CallPutSwitcherState$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OptionContractType.values().length];
            try {
                iArr[OptionContractType.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionContractType.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[OptionSideBySideChainDataState2.values().length];
            try {
                iArr2[OptionSideBySideChainDataState2.CALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[OptionSideBySideChainDataState2.PUT.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[OptionSideBySideChainDataState2.BOTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private static final /* synthetic */ OptionSideBySideChainDataState2[] $values() {
        return new OptionSideBySideChainDataState2[]{CALL, PUT, BOTH};
    }

    public static EnumEntries<OptionSideBySideChainDataState2> getEntries() {
        return $ENTRIES;
    }

    private OptionSideBySideChainDataState2(String str, int i, String str2) {
        this.loggingIdentifier = str2;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    static {
        OptionSideBySideChainDataState2[] optionSideBySideChainDataState2Arr$values = $values();
        $VALUES = optionSideBySideChainDataState2Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionSideBySideChainDataState2Arr$values);
    }

    public final OptionSideBySideChainDataState2 getNextState(OptionContractType optionContractType) {
        Intrinsics.checkNotNullParameter(optionContractType, "optionContractType");
        int i = WhenMappings.$EnumSwitchMapping$1[ordinal()];
        if (i == 1) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
            if (i2 == 1) {
                return BOTH;
            }
            if (i2 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return PUT;
        }
        if (i == 2) {
            int i3 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
            if (i3 == 1) {
                return CALL;
            }
            if (i3 != 2) {
                throw new NoWhenBranchMatchedException();
            }
            return BOTH;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        int i4 = WhenMappings.$EnumSwitchMapping$0[optionContractType.ordinal()];
        if (i4 == 1) {
            return CALL;
        }
        if (i4 != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PUT;
    }

    public final boolean isCallSideVisible() {
        return this == BOTH || this == CALL;
    }

    public final boolean isPutSideVisible() {
        return this == BOTH || this == PUT;
    }

    public static OptionSideBySideChainDataState2 valueOf(String str) {
        return (OptionSideBySideChainDataState2) Enum.valueOf(OptionSideBySideChainDataState2.class, str);
    }

    public static OptionSideBySideChainDataState2[] values() {
        return (OptionSideBySideChainDataState2[]) $VALUES.clone();
    }
}
