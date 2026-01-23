package com.salesforce.android.smi.network.data.domain.conversationEntry.entryPayload;

import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: NetworkErrorCode.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode;", "", "code", "", "<init>", "(Ljava/lang/String;II)V", "getCode", "()I", "PreconditionFailedError", "UnsupportedFileTypeError", "FileSizeLimitError", "ExpectationFailedError", "GeneralError", "Companion", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class NetworkErrorCode {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NetworkErrorCode[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final NetworkErrorCode[] values;
    private final int code;
    public static final NetworkErrorCode PreconditionFailedError = new NetworkErrorCode("PreconditionFailedError", 0, 412);
    public static final NetworkErrorCode UnsupportedFileTypeError = new NetworkErrorCode("UnsupportedFileTypeError", 1, 415);
    public static final NetworkErrorCode FileSizeLimitError = new NetworkErrorCode("FileSizeLimitError", 2, 413);
    public static final NetworkErrorCode ExpectationFailedError = new NetworkErrorCode("ExpectationFailedError", 3, 417);
    public static final NetworkErrorCode GeneralError = new NetworkErrorCode("GeneralError", 4, 0);

    private static final /* synthetic */ NetworkErrorCode[] $values() {
        return new NetworkErrorCode[]{PreconditionFailedError, UnsupportedFileTypeError, FileSizeLimitError, ExpectationFailedError, GeneralError};
    }

    public static EnumEntries<NetworkErrorCode> getEntries() {
        return $ENTRIES;
    }

    private NetworkErrorCode(String str, int i, int i2) {
        this.code = i2;
    }

    public final int getCode() {
        return this.code;
    }

    static {
        NetworkErrorCode[] networkErrorCodeArr$values = $values();
        $VALUES = networkErrorCodeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(networkErrorCodeArr$values);
        INSTANCE = new Companion(null);
        values = values();
    }

    /* compiled from: NetworkErrorCode.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\u0002\u0010\rR\u0019\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\b¨\u0006\u000e"}, m3636d2 = {"Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode$Companion;", "", "<init>", "()V", "values", "", "Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode;", "getValues", "()[Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode;", "[Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode;", "fromValue", "value", "", "(Ljava/lang/Integer;)Lcom/salesforce/android/smi/network/data/domain/conversationEntry/entryPayload/NetworkErrorCode;", "data_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final NetworkErrorCode[] getValues() {
            return NetworkErrorCode.values;
        }

        public final NetworkErrorCode fromValue(Integer value) {
            NetworkErrorCode networkErrorCode;
            NetworkErrorCode[] values = getValues();
            int length = values.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    networkErrorCode = null;
                    break;
                }
                networkErrorCode = values[i];
                int code = networkErrorCode.getCode();
                if (value != null && code == value.intValue()) {
                    break;
                }
                i++;
            }
            return networkErrorCode == null ? NetworkErrorCode.GeneralError : networkErrorCode;
        }
    }

    public static NetworkErrorCode valueOf(String str) {
        return (NetworkErrorCode) Enum.valueOf(NetworkErrorCode.class, str);
    }

    public static NetworkErrorCode[] values() {
        return (NetworkErrorCode[]) $VALUES.clone();
    }
}
