package nummus.p512v1;

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
/* compiled from: FeeTierSource.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lnummus/v1/FeeTierSource;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEE_TIER_SOURCE_UNSPECIFIED", "FEE_TIER_SOURCE_TRADING_VOLUME", "FEE_TIER_SOURCE_DEPOSIT_INCENTIVE", "FEE_TIER_SOURCE_RH_EMPLOYEE", "FEE_TIER_SOURCE_INTRODUCTORY_PROMO", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class FeeTierSource implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeTierSource[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeeTierSource> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeeTierSource FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
    public static final FeeTierSource FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
    public static final FeeTierSource FEE_TIER_SOURCE_RH_EMPLOYEE;
    public static final FeeTierSource FEE_TIER_SOURCE_TRADING_VOLUME;
    public static final FeeTierSource FEE_TIER_SOURCE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FeeTierSource[] $values() {
        return new FeeTierSource[]{FEE_TIER_SOURCE_UNSPECIFIED, FEE_TIER_SOURCE_TRADING_VOLUME, FEE_TIER_SOURCE_DEPOSIT_INCENTIVE, FEE_TIER_SOURCE_RH_EMPLOYEE, FEE_TIER_SOURCE_INTRODUCTORY_PROMO};
    }

    @JvmStatic
    public static final FeeTierSource fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeeTierSource> getEntries() {
        return $ENTRIES;
    }

    private FeeTierSource(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeeTierSource feeTierSource = new FeeTierSource("FEE_TIER_SOURCE_UNSPECIFIED", 0, 0);
        FEE_TIER_SOURCE_UNSPECIFIED = feeTierSource;
        FEE_TIER_SOURCE_TRADING_VOLUME = new FeeTierSource("FEE_TIER_SOURCE_TRADING_VOLUME", 1, 1);
        FEE_TIER_SOURCE_DEPOSIT_INCENTIVE = new FeeTierSource("FEE_TIER_SOURCE_DEPOSIT_INCENTIVE", 2, 2);
        FEE_TIER_SOURCE_RH_EMPLOYEE = new FeeTierSource("FEE_TIER_SOURCE_RH_EMPLOYEE", 3, 3);
        FEE_TIER_SOURCE_INTRODUCTORY_PROMO = new FeeTierSource("FEE_TIER_SOURCE_INTRODUCTORY_PROMO", 4, 4);
        FeeTierSource[] feeTierSourceArr$values = $values();
        $VALUES = feeTierSourceArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeTierSourceArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTierSource.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeeTierSource>(orCreateKotlinClass, syntax, feeTierSource) { // from class: nummus.v1.FeeTierSource$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeeTierSource fromValue(int value) {
                return FeeTierSource.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeeTierSource.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnummus/v1/FeeTierSource$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnummus/v1/FeeTierSource;", "fromValue", "value", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeeTierSource fromValue(int value) {
            if (value == 0) {
                return FeeTierSource.FEE_TIER_SOURCE_UNSPECIFIED;
            }
            if (value == 1) {
                return FeeTierSource.FEE_TIER_SOURCE_TRADING_VOLUME;
            }
            if (value == 2) {
                return FeeTierSource.FEE_TIER_SOURCE_DEPOSIT_INCENTIVE;
            }
            if (value == 3) {
                return FeeTierSource.FEE_TIER_SOURCE_RH_EMPLOYEE;
            }
            if (value != 4) {
                return null;
            }
            return FeeTierSource.FEE_TIER_SOURCE_INTRODUCTORY_PROMO;
        }
    }

    public static FeeTierSource valueOf(String str) {
        return (FeeTierSource) Enum.valueOf(FeeTierSource.class, str);
    }

    public static FeeTierSource[] values() {
        return (FeeTierSource[]) $VALUES.clone();
    }
}
