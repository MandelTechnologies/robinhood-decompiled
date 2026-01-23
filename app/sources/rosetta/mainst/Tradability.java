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
/* compiled from: Tradability.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lrosetta/mainst/Tradability;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TRADABILITY_UNSPECIFIED", "TRADABLE", "UNTRADABLE", "PCO", "POO", "LIMITED", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Tradability implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Tradability[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Tradability> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Tradability LIMITED;
    public static final Tradability PCO;
    public static final Tradability POO;
    public static final Tradability TRADABILITY_UNSPECIFIED;
    public static final Tradability TRADABLE;
    public static final Tradability UNTRADABLE;
    private final int value;

    private static final /* synthetic */ Tradability[] $values() {
        return new Tradability[]{TRADABILITY_UNSPECIFIED, TRADABLE, UNTRADABLE, PCO, POO, LIMITED};
    }

    @JvmStatic
    public static final Tradability fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Tradability> getEntries() {
        return $ENTRIES;
    }

    private Tradability(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Tradability tradability = new Tradability("TRADABILITY_UNSPECIFIED", 0, 0);
        TRADABILITY_UNSPECIFIED = tradability;
        TRADABLE = new Tradability("TRADABLE", 1, 1);
        UNTRADABLE = new Tradability("UNTRADABLE", 2, 2);
        PCO = new Tradability("PCO", 3, 3);
        POO = new Tradability("POO", 4, 4);
        LIMITED = new Tradability("LIMITED", 5, 5);
        Tradability[] tradabilityArr$values = $values();
        $VALUES = tradabilityArr$values;
        $ENTRIES = EnumEntries2.enumEntries(tradabilityArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Tradability.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Tradability>(orCreateKotlinClass, syntax, tradability) { // from class: rosetta.mainst.Tradability$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Tradability fromValue(int value) {
                return Tradability.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Tradability.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/mainst/Tradability$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/mainst/Tradability;", "fromValue", "value", "", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Tradability fromValue(int value) {
            if (value == 0) {
                return Tradability.TRADABILITY_UNSPECIFIED;
            }
            if (value == 1) {
                return Tradability.TRADABLE;
            }
            if (value == 2) {
                return Tradability.UNTRADABLE;
            }
            if (value == 3) {
                return Tradability.PCO;
            }
            if (value == 4) {
                return Tradability.POO;
            }
            if (value != 5) {
                return null;
            }
            return Tradability.LIMITED;
        }
    }

    public static Tradability valueOf(String str) {
        return (Tradability) Enum.valueOf(Tradability.class, str);
    }

    public static Tradability[] values() {
        return (Tradability[]) $VALUES.clone();
    }
}
