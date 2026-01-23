package bonfire.proto.idl.portfolio.p037v1;

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
/* compiled from: PositionsLocation.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PositionsLocation_UNSPECIFIED", "HOME_TAB", "RETIREMENT_TAB", "CRYPTO_TAB", "ASSET_HOME", "UNKNOWN", "Companion", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class PositionsLocation implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PositionsLocation[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PositionsLocation> ADAPTER;
    public static final PositionsLocation ASSET_HOME;
    public static final PositionsLocation CRYPTO_TAB;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PositionsLocation HOME_TAB;
    public static final PositionsLocation PositionsLocation_UNSPECIFIED;
    public static final PositionsLocation RETIREMENT_TAB;
    public static final PositionsLocation UNKNOWN;
    private final int value;

    private static final /* synthetic */ PositionsLocation[] $values() {
        return new PositionsLocation[]{PositionsLocation_UNSPECIFIED, HOME_TAB, RETIREMENT_TAB, CRYPTO_TAB, ASSET_HOME, UNKNOWN};
    }

    @JvmStatic
    public static final PositionsLocation fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PositionsLocation> getEntries() {
        return $ENTRIES;
    }

    private PositionsLocation(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PositionsLocation positionsLocation = new PositionsLocation("PositionsLocation_UNSPECIFIED", 0, 0);
        PositionsLocation_UNSPECIFIED = positionsLocation;
        HOME_TAB = new PositionsLocation("HOME_TAB", 1, 1);
        RETIREMENT_TAB = new PositionsLocation("RETIREMENT_TAB", 2, 2);
        CRYPTO_TAB = new PositionsLocation("CRYPTO_TAB", 3, 3);
        ASSET_HOME = new PositionsLocation("ASSET_HOME", 4, 4);
        UNKNOWN = new PositionsLocation("UNKNOWN", 5, 5);
        PositionsLocation[] positionsLocationArr$values = $values();
        $VALUES = positionsLocationArr$values;
        $ENTRIES = EnumEntries2.enumEntries(positionsLocationArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PositionsLocation.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PositionsLocation>(orCreateKotlinClass, syntax, positionsLocation) { // from class: bonfire.proto.idl.portfolio.v1.PositionsLocation$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PositionsLocation fromValue(int value) {
                return PositionsLocation.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PositionsLocation.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/portfolio/v1/PositionsLocation$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/portfolio/v1/PositionsLocation;", "fromValue", "value", "", "bonfire.proto.idl.portfolio.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PositionsLocation fromValue(int value) {
            if (value == 0) {
                return PositionsLocation.PositionsLocation_UNSPECIFIED;
            }
            if (value == 1) {
                return PositionsLocation.HOME_TAB;
            }
            if (value == 2) {
                return PositionsLocation.RETIREMENT_TAB;
            }
            if (value == 3) {
                return PositionsLocation.CRYPTO_TAB;
            }
            if (value == 4) {
                return PositionsLocation.ASSET_HOME;
            }
            if (value != 5) {
                return null;
            }
            return PositionsLocation.UNKNOWN;
        }
    }

    public static PositionsLocation valueOf(String str) {
        return (PositionsLocation) Enum.valueOf(PositionsLocation.class, str);
    }

    public static PositionsLocation[] values() {
        return (PositionsLocation[]) $VALUES.clone();
    }
}
