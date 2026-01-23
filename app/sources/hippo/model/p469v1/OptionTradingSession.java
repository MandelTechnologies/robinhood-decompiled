package hippo.model.p469v1;

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
/* compiled from: OptionTradingSession.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lhippo/model/v1/OptionTradingSession;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OPTION_TRADING_SESSION_UNSPECIFIED", "OPTION_TRADING_SESSION_REGULAR_HOURS", "OPTION_TRADING_SESSION_REGULAR_CURB_HOURS", "OPTION_TRADING_SESSION_EXTENDED_HOURS", "OPTION_TRADING_SESSION_ALL_DAY_HOURS", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class OptionTradingSession implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ OptionTradingSession[] $VALUES;

    @JvmField
    public static final ProtoAdapter<OptionTradingSession> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final OptionTradingSession OPTION_TRADING_SESSION_ALL_DAY_HOURS;
    public static final OptionTradingSession OPTION_TRADING_SESSION_EXTENDED_HOURS;
    public static final OptionTradingSession OPTION_TRADING_SESSION_REGULAR_CURB_HOURS;
    public static final OptionTradingSession OPTION_TRADING_SESSION_REGULAR_HOURS;
    public static final OptionTradingSession OPTION_TRADING_SESSION_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ OptionTradingSession[] $values() {
        return new OptionTradingSession[]{OPTION_TRADING_SESSION_UNSPECIFIED, OPTION_TRADING_SESSION_REGULAR_HOURS, OPTION_TRADING_SESSION_REGULAR_CURB_HOURS, OPTION_TRADING_SESSION_EXTENDED_HOURS, OPTION_TRADING_SESSION_ALL_DAY_HOURS};
    }

    @JvmStatic
    public static final OptionTradingSession fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<OptionTradingSession> getEntries() {
        return $ENTRIES;
    }

    private OptionTradingSession(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final OptionTradingSession optionTradingSession = new OptionTradingSession("OPTION_TRADING_SESSION_UNSPECIFIED", 0, 0);
        OPTION_TRADING_SESSION_UNSPECIFIED = optionTradingSession;
        OPTION_TRADING_SESSION_REGULAR_HOURS = new OptionTradingSession("OPTION_TRADING_SESSION_REGULAR_HOURS", 1, 1);
        OPTION_TRADING_SESSION_REGULAR_CURB_HOURS = new OptionTradingSession("OPTION_TRADING_SESSION_REGULAR_CURB_HOURS", 2, 2);
        OPTION_TRADING_SESSION_EXTENDED_HOURS = new OptionTradingSession("OPTION_TRADING_SESSION_EXTENDED_HOURS", 3, 3);
        OPTION_TRADING_SESSION_ALL_DAY_HOURS = new OptionTradingSession("OPTION_TRADING_SESSION_ALL_DAY_HOURS", 4, 4);
        OptionTradingSession[] optionTradingSessionArr$values = $values();
        $VALUES = optionTradingSessionArr$values;
        $ENTRIES = EnumEntries2.enumEntries(optionTradingSessionArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionTradingSession.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<OptionTradingSession>(orCreateKotlinClass, syntax, optionTradingSession) { // from class: hippo.model.v1.OptionTradingSession$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public OptionTradingSession fromValue(int value) {
                return OptionTradingSession.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: OptionTradingSession.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/OptionTradingSession$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/OptionTradingSession;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final OptionTradingSession fromValue(int value) {
            if (value == 0) {
                return OptionTradingSession.OPTION_TRADING_SESSION_UNSPECIFIED;
            }
            if (value == 1) {
                return OptionTradingSession.OPTION_TRADING_SESSION_REGULAR_HOURS;
            }
            if (value == 2) {
                return OptionTradingSession.OPTION_TRADING_SESSION_REGULAR_CURB_HOURS;
            }
            if (value == 3) {
                return OptionTradingSession.OPTION_TRADING_SESSION_EXTENDED_HOURS;
            }
            if (value != 4) {
                return null;
            }
            return OptionTradingSession.OPTION_TRADING_SESSION_ALL_DAY_HOURS;
        }
    }

    public static OptionTradingSession valueOf(String str) {
        return (OptionTradingSession) Enum.valueOf(OptionTradingSession.class, str);
    }

    public static OptionTradingSession[] values() {
        return (OptionTradingSession[]) $VALUES.clone();
    }
}
