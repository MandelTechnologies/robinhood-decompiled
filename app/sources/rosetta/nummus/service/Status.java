package rosetta.nummus.service;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Status.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/nummus/service/Status;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS__UNSPECIFIED", "STATUS_ACTIVE", "STATUS_DEACTIVATED", "STATUS_SELL_ONLY", "Companion", "rosetta.nummus.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class Status implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Status[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Status> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Status STATUS_ACTIVE;
    public static final Status STATUS_DEACTIVATED;
    public static final Status STATUS_SELL_ONLY;
    public static final Status STATUS__UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ Status[] $values() {
        return new Status[]{STATUS__UNSPECIFIED, STATUS_ACTIVE, STATUS_DEACTIVATED, STATUS_SELL_ONLY};
    }

    @JvmStatic
    public static final Status fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Status> getEntries() {
        return $ENTRIES;
    }

    private Status(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Status status = new Status("STATUS__UNSPECIFIED", 0, 0);
        STATUS__UNSPECIFIED = status;
        STATUS_ACTIVE = new Status("STATUS_ACTIVE", 1, 1);
        STATUS_DEACTIVATED = new Status("STATUS_DEACTIVATED", 2, 2);
        STATUS_SELL_ONLY = new Status("STATUS_SELL_ONLY", 3, 3);
        Status[] statusArr$values = $values();
        $VALUES = statusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(statusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Status.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Status>(orCreateKotlinClass, syntax, status) { // from class: rosetta.nummus.service.Status$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Status fromValue(int value) {
                return Status.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Status.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/service/Status$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/service/Status;", "fromValue", "value", "", "rosetta.nummus.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Status fromValue(int value) {
            if (value == 0) {
                return Status.STATUS__UNSPECIFIED;
            }
            if (value == 1) {
                return Status.STATUS_ACTIVE;
            }
            if (value == 2) {
                return Status.STATUS_DEACTIVATED;
            }
            if (value != 3) {
                return null;
            }
            return Status.STATUS_SELL_ONLY;
        }
    }

    public static Status valueOf(String str) {
        return (Status) Enum.valueOf(Status.class, str);
    }

    public static Status[] values() {
        return (Status[]) $VALUES.clone();
    }
}
