package io.bitdrift.capture;

import com.robinhood.android.transfers.contracts.transfercontext.TransferContext3;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: LogType.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, m3636d2 = {"Lio/bitdrift/capture/LogType;", "", "value", "", "(Ljava/lang/String;II)V", "getValue", "()I", TransferContext3.NORMAL, "REPLAY", "LIFECYCLE", "RESOURCE", "INTERNALSDK", "VIEW", "DEVICE", "UX", "SPAN", "platform_jvm_capture-log_type"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class LogType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LogType[] $VALUES;
    private final int value;
    public static final LogType NORMAL = new LogType(TransferContext3.NORMAL, 0, 0);
    public static final LogType REPLAY = new LogType("REPLAY", 1, 1);
    public static final LogType LIFECYCLE = new LogType("LIFECYCLE", 2, 2);
    public static final LogType RESOURCE = new LogType("RESOURCE", 3, 3);
    public static final LogType INTERNALSDK = new LogType("INTERNALSDK", 4, 4);
    public static final LogType VIEW = new LogType("VIEW", 5, 5);
    public static final LogType DEVICE = new LogType("DEVICE", 6, 6);

    /* renamed from: UX */
    public static final LogType f6570UX = new LogType("UX", 7, 7);
    public static final LogType SPAN = new LogType("SPAN", 8, 8);

    private static final /* synthetic */ LogType[] $values() {
        return new LogType[]{NORMAL, REPLAY, LIFECYCLE, RESOURCE, INTERNALSDK, VIEW, DEVICE, f6570UX, SPAN};
    }

    public static EnumEntries<LogType> getEntries() {
        return $ENTRIES;
    }

    public static LogType valueOf(String str) {
        return (LogType) Enum.valueOf(LogType.class, str);
    }

    public static LogType[] values() {
        return (LogType[]) $VALUES.clone();
    }

    private LogType(String str, int i, int i2) {
        this.value = i2;
    }

    public final int getValue() {
        return this.value;
    }

    static {
        LogType[] logTypeArr$values = $values();
        $VALUES = logTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(logTypeArr$values);
    }
}
