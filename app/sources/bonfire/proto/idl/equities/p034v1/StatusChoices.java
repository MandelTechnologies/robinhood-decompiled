package bonfire.proto.idl.equities.p034v1;

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
/* compiled from: StatusChoices.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/StatusChoices;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "STATUS_CHOICES_UNSPECIFIED", "STATUS_CHOICES_COMPLETED", "STATUS_CHOICES_PROCESSING", "STATUS_CHOICES_PENDING", "STATUS_CHOICES_NEW", "STATUS_CHOICES_INCONSISTENT", "Companion", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class StatusChoices implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ StatusChoices[] $VALUES;

    @JvmField
    public static final ProtoAdapter<StatusChoices> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final StatusChoices STATUS_CHOICES_COMPLETED;
    public static final StatusChoices STATUS_CHOICES_INCONSISTENT;
    public static final StatusChoices STATUS_CHOICES_NEW;
    public static final StatusChoices STATUS_CHOICES_PENDING;
    public static final StatusChoices STATUS_CHOICES_PROCESSING;
    public static final StatusChoices STATUS_CHOICES_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ StatusChoices[] $values() {
        return new StatusChoices[]{STATUS_CHOICES_UNSPECIFIED, STATUS_CHOICES_COMPLETED, STATUS_CHOICES_PROCESSING, STATUS_CHOICES_PENDING, STATUS_CHOICES_NEW, STATUS_CHOICES_INCONSISTENT};
    }

    @JvmStatic
    public static final StatusChoices fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<StatusChoices> getEntries() {
        return $ENTRIES;
    }

    private StatusChoices(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final StatusChoices statusChoices = new StatusChoices("STATUS_CHOICES_UNSPECIFIED", 0, 0);
        STATUS_CHOICES_UNSPECIFIED = statusChoices;
        STATUS_CHOICES_COMPLETED = new StatusChoices("STATUS_CHOICES_COMPLETED", 1, 1);
        STATUS_CHOICES_PROCESSING = new StatusChoices("STATUS_CHOICES_PROCESSING", 2, 2);
        STATUS_CHOICES_PENDING = new StatusChoices("STATUS_CHOICES_PENDING", 3, 3);
        STATUS_CHOICES_NEW = new StatusChoices("STATUS_CHOICES_NEW", 4, 4);
        STATUS_CHOICES_INCONSISTENT = new StatusChoices("STATUS_CHOICES_INCONSISTENT", 5, 5);
        StatusChoices[] statusChoicesArr$values = $values();
        $VALUES = statusChoicesArr$values;
        $ENTRIES = EnumEntries2.enumEntries(statusChoicesArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(StatusChoices.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<StatusChoices>(orCreateKotlinClass, syntax, statusChoices) { // from class: bonfire.proto.idl.equities.v1.StatusChoices$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public StatusChoices fromValue(int value) {
                return StatusChoices.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: StatusChoices.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/StatusChoices$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/equities/v1/StatusChoices;", "fromValue", "value", "", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final StatusChoices fromValue(int value) {
            if (value == 0) {
                return StatusChoices.STATUS_CHOICES_UNSPECIFIED;
            }
            if (value == 1) {
                return StatusChoices.STATUS_CHOICES_COMPLETED;
            }
            if (value == 2) {
                return StatusChoices.STATUS_CHOICES_PROCESSING;
            }
            if (value == 3) {
                return StatusChoices.STATUS_CHOICES_PENDING;
            }
            if (value == 4) {
                return StatusChoices.STATUS_CHOICES_NEW;
            }
            if (value != 5) {
                return null;
            }
            return StatusChoices.STATUS_CHOICES_INCONSISTENT;
        }
    }

    public static StatusChoices valueOf(String str) {
        return (StatusChoices) Enum.valueOf(StatusChoices.class, str);
    }

    public static StatusChoices[] values() {
        return (StatusChoices[]) $VALUES.clone();
    }
}
