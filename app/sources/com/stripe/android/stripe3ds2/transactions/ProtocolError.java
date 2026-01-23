package com.stripe.android.stripe3ds2.transactions;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProtocolError.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0017\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012¨\u0006\u0013"}, m3636d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ProtocolError;", "", "code", "", "description", "", "(Ljava/lang/String;IILjava/lang/String;)V", "getCode", "()I", "getDescription", "()Ljava/lang/String;", "InvalidMessageReceived", "UnsupportedMessageVersion", "RequiredDataElementMissing", "UnrecognizedCriticalMessageExtensions", "InvalidDataElementFormat", "InvalidTransactionId", "DataDecryptionFailure", "TransactionTimedout", "3ds2sdk_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ProtocolError {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProtocolError[] $VALUES;
    private final int code;
    private final String description;
    public static final ProtocolError InvalidMessageReceived = new ProtocolError("InvalidMessageReceived", 0, 101, "Message is not AReq, ARes, CReq, CRes, PReq, PRes, RReq, or RRes");
    public static final ProtocolError UnsupportedMessageVersion = new ProtocolError("UnsupportedMessageVersion", 1, 102, "Message Version Number received is not valid for the receiving component.");
    public static final ProtocolError RequiredDataElementMissing = new ProtocolError("RequiredDataElementMissing", 2, 201, "A message element required as defined in Table A.1 is missing from the message.");
    public static final ProtocolError UnrecognizedCriticalMessageExtensions = new ProtocolError("UnrecognizedCriticalMessageExtensions", 3, 202, "Critical message extension not recognised.");
    public static final ProtocolError InvalidDataElementFormat = new ProtocolError("InvalidDataElementFormat", 4, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, "Data element not in the required format or value is invalid as defined in Table A.1");
    public static final ProtocolError InvalidTransactionId = new ProtocolError("InvalidTransactionId", 5, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, "Transaction ID received is not valid for the receiving component.");
    public static final ProtocolError DataDecryptionFailure = new ProtocolError("DataDecryptionFailure", 6, 302, "Data could not be decrypted by the receiving system due to technical or other reason.");
    public static final ProtocolError TransactionTimedout = new ProtocolError("TransactionTimedout", 7, 402, "Transaction timed-out.");

    private static final /* synthetic */ ProtocolError[] $values() {
        return new ProtocolError[]{InvalidMessageReceived, UnsupportedMessageVersion, RequiredDataElementMissing, UnrecognizedCriticalMessageExtensions, InvalidDataElementFormat, InvalidTransactionId, DataDecryptionFailure, TransactionTimedout};
    }

    public static EnumEntries<ProtocolError> getEntries() {
        return $ENTRIES;
    }

    public static ProtocolError valueOf(String str) {
        return (ProtocolError) Enum.valueOf(ProtocolError.class, str);
    }

    public static ProtocolError[] values() {
        return (ProtocolError[]) $VALUES.clone();
    }

    private ProtocolError(String str, int i, int i2, String str2) {
        this.code = i2;
        this.description = str2;
    }

    public final int getCode() {
        return this.code;
    }

    public final String getDescription() {
        return this.description;
    }

    static {
        ProtocolError[] protocolErrorArr$values = $values();
        $VALUES = protocolErrorArr$values;
        $ENTRIES = EnumEntries2.enumEntries(protocolErrorArr$values);
    }
}
