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
/* compiled from: Warnings.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/Warnings;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WARNING_UNSPECIFIED", "OPEN_LOT_NOT_SELECTABLE_INTRADAY", "Companion", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Warnings implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Warnings[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Warnings> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Warnings OPEN_LOT_NOT_SELECTABLE_INTRADAY;
    public static final Warnings WARNING_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ Warnings[] $values() {
        return new Warnings[]{WARNING_UNSPECIFIED, OPEN_LOT_NOT_SELECTABLE_INTRADAY};
    }

    @JvmStatic
    public static final Warnings fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Warnings> getEntries() {
        return $ENTRIES;
    }

    private Warnings(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Warnings warnings = new Warnings("WARNING_UNSPECIFIED", 0, 0);
        WARNING_UNSPECIFIED = warnings;
        OPEN_LOT_NOT_SELECTABLE_INTRADAY = new Warnings("OPEN_LOT_NOT_SELECTABLE_INTRADAY", 1, 1);
        Warnings[] warningsArr$values = $values();
        $VALUES = warningsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(warningsArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Warnings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Warnings>(orCreateKotlinClass, syntax, warnings) { // from class: equity_trading_tax_lots.proto.v1.Warnings$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Warnings fromValue(int value) {
                return Warnings.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Warnings.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lequity_trading_tax_lots/proto/v1/Warnings$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lequity_trading_tax_lots/proto/v1/Warnings;", "fromValue", "value", "", "equity_trading_tax_lots.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Warnings fromValue(int value) {
            if (value == 0) {
                return Warnings.WARNING_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return Warnings.OPEN_LOT_NOT_SELECTABLE_INTRADAY;
        }
    }

    public static Warnings valueOf(String str) {
        return (Warnings) Enum.valueOf(Warnings.class, str);
    }

    public static Warnings[] values() {
        return (Warnings[]) $VALUES.clone();
    }
}
