package rosetta.mainst;

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
/* compiled from: InstrumentState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lrosetta/mainst/InstrumentState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INSTRUMENT_STATE_UNSPECIFIED", "STATE_ACTIVE", "STATE_INACTIVE", "STATE_UNLISTED", "STATE_EXPIRED", "STATE_PENDING", "STATE_LIMITED", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class InstrumentState implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ InstrumentState[] $VALUES;

    @JvmField
    public static final ProtoAdapter<InstrumentState> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final InstrumentState INSTRUMENT_STATE_UNSPECIFIED;
    public static final InstrumentState STATE_ACTIVE;
    public static final InstrumentState STATE_EXPIRED;
    public static final InstrumentState STATE_INACTIVE;
    public static final InstrumentState STATE_LIMITED;
    public static final InstrumentState STATE_PENDING;
    public static final InstrumentState STATE_UNLISTED;
    private final int value;

    private static final /* synthetic */ InstrumentState[] $values() {
        return new InstrumentState[]{INSTRUMENT_STATE_UNSPECIFIED, STATE_ACTIVE, STATE_INACTIVE, STATE_UNLISTED, STATE_EXPIRED, STATE_PENDING, STATE_LIMITED};
    }

    @JvmStatic
    public static final InstrumentState fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<InstrumentState> getEntries() {
        return $ENTRIES;
    }

    private InstrumentState(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final InstrumentState instrumentState = new InstrumentState("INSTRUMENT_STATE_UNSPECIFIED", 0, 0);
        INSTRUMENT_STATE_UNSPECIFIED = instrumentState;
        STATE_ACTIVE = new InstrumentState("STATE_ACTIVE", 1, 1);
        STATE_INACTIVE = new InstrumentState("STATE_INACTIVE", 2, 2);
        STATE_UNLISTED = new InstrumentState("STATE_UNLISTED", 3, 3);
        STATE_EXPIRED = new InstrumentState("STATE_EXPIRED", 4, 4);
        STATE_PENDING = new InstrumentState("STATE_PENDING", 5, 5);
        STATE_LIMITED = new InstrumentState("STATE_LIMITED", 6, 6);
        InstrumentState[] instrumentStateArr$values = $values();
        $VALUES = instrumentStateArr$values;
        $ENTRIES = EnumEntries2.enumEntries(instrumentStateArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InstrumentState.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<InstrumentState>(orCreateKotlinClass, syntax, instrumentState) { // from class: rosetta.mainst.InstrumentState$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public InstrumentState fromValue(int value) {
                return InstrumentState.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: InstrumentState.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/InstrumentState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/InstrumentState;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final InstrumentState fromValue(int value) {
            switch (value) {
                case 0:
                    return InstrumentState.INSTRUMENT_STATE_UNSPECIFIED;
                case 1:
                    return InstrumentState.STATE_ACTIVE;
                case 2:
                    return InstrumentState.STATE_INACTIVE;
                case 3:
                    return InstrumentState.STATE_UNLISTED;
                case 4:
                    return InstrumentState.STATE_EXPIRED;
                case 5:
                    return InstrumentState.STATE_PENDING;
                case 6:
                    return InstrumentState.STATE_LIMITED;
                default:
                    return null;
            }
        }
    }

    public static InstrumentState valueOf(String str) {
        return (InstrumentState) Enum.valueOf(InstrumentState.class, str);
    }

    public static InstrumentState[] values() {
        return (InstrumentState[]) $VALUES.clone();
    }
}
