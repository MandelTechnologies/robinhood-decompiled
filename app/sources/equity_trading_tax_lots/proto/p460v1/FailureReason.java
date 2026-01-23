package equity_trading_tax_lots.proto.p460v1;

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
/* compiled from: FailureReason.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/FailureReason;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FAILURE_REASON_UNSPECIFIED", "TOO_MANY_LOTS", "NOT_ENOUGH_SELECTABLE_LOTS", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FailureReason implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FailureReason[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FailureReason> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FailureReason FAILURE_REASON_UNSPECIFIED;
    public static final FailureReason NOT_ENOUGH_SELECTABLE_LOTS;
    public static final FailureReason TOO_MANY_LOTS;
    private final int value;

    private static final /* synthetic */ FailureReason[] $values() {
        return new FailureReason[]{FAILURE_REASON_UNSPECIFIED, TOO_MANY_LOTS, NOT_ENOUGH_SELECTABLE_LOTS};
    }

    @JvmStatic
    public static final FailureReason fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FailureReason> getEntries() {
        return $ENTRIES;
    }

    private FailureReason(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FailureReason failureReason = new FailureReason("FAILURE_REASON_UNSPECIFIED", 0, 0);
        FAILURE_REASON_UNSPECIFIED = failureReason;
        TOO_MANY_LOTS = new FailureReason("TOO_MANY_LOTS", 1, 1);
        NOT_ENOUGH_SELECTABLE_LOTS = new FailureReason("NOT_ENOUGH_SELECTABLE_LOTS", 2, 2);
        FailureReason[] failureReasonArr$values = $values();
        $VALUES = failureReasonArr$values;
        $ENTRIES = EnumEntries2.enumEntries(failureReasonArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FailureReason.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FailureReason>(orCreateKotlinClass, syntax, failureReason) { // from class: equity_trading_tax_lots.proto.v1.FailureReason$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FailureReason fromValue(int value) {
                return FailureReason.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FailureReason.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/FailureReason$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lequity_trading_tax_lots/proto/v1/FailureReason;", "fromValue", "value", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FailureReason fromValue(int value) {
            if (value == 0) {
                return FailureReason.FAILURE_REASON_UNSPECIFIED;
            }
            if (value == 1) {
                return FailureReason.TOO_MANY_LOTS;
            }
            if (value != 2) {
                return null;
            }
            return FailureReason.NOT_ENOUGH_SELECTABLE_LOTS;
        }
    }

    public static FailureReason valueOf(String str) {
        return (FailureReason) Enum.valueOf(FailureReason.class, str);
    }

    public static FailureReason[] values() {
        return (FailureReason[]) $VALUES.clone();
    }
}
