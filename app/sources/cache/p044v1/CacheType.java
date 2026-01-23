package cache.p044v1;

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
/* compiled from: CacheType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcache/v1/CacheType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CACHE_TYPE_UNSPECIFIED", "ACCOUNTS", "PORTFOLIO", "GOLD_SUBSCRIPTION", "HOME_CARDS", "HOME_SWEEP_SECTION", "SWEEP_INTEREST", "SORTING_HAT", "Companion", "cache.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CacheType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CacheType[] $VALUES;
    public static final CacheType ACCOUNTS;

    @JvmField
    public static final ProtoAdapter<CacheType> ADAPTER;
    public static final CacheType CACHE_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final CacheType GOLD_SUBSCRIPTION;
    public static final CacheType HOME_CARDS;
    public static final CacheType HOME_SWEEP_SECTION;
    public static final CacheType PORTFOLIO;
    public static final CacheType SORTING_HAT;
    public static final CacheType SWEEP_INTEREST;
    private final int value;

    private static final /* synthetic */ CacheType[] $values() {
        return new CacheType[]{CACHE_TYPE_UNSPECIFIED, ACCOUNTS, PORTFOLIO, GOLD_SUBSCRIPTION, HOME_CARDS, HOME_SWEEP_SECTION, SWEEP_INTEREST, SORTING_HAT};
    }

    @JvmStatic
    public static final CacheType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CacheType> getEntries() {
        return $ENTRIES;
    }

    private CacheType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CacheType cacheType = new CacheType("CACHE_TYPE_UNSPECIFIED", 0, 0);
        CACHE_TYPE_UNSPECIFIED = cacheType;
        ACCOUNTS = new CacheType("ACCOUNTS", 1, 1);
        PORTFOLIO = new CacheType("PORTFOLIO", 2, 2);
        GOLD_SUBSCRIPTION = new CacheType("GOLD_SUBSCRIPTION", 3, 3);
        HOME_CARDS = new CacheType("HOME_CARDS", 4, 4);
        HOME_SWEEP_SECTION = new CacheType("HOME_SWEEP_SECTION", 5, 5);
        SWEEP_INTEREST = new CacheType("SWEEP_INTEREST", 6, 6);
        SORTING_HAT = new CacheType("SORTING_HAT", 7, 7);
        CacheType[] cacheTypeArr$values = $values();
        $VALUES = cacheTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cacheTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CacheType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CacheType>(orCreateKotlinClass, syntax, cacheType) { // from class: cache.v1.CacheType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CacheType fromValue(int value) {
                return CacheType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CacheType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcache/v1/CacheType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcache/v1/CacheType;", "fromValue", "value", "", "cache.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CacheType fromValue(int value) {
            switch (value) {
                case 0:
                    return CacheType.CACHE_TYPE_UNSPECIFIED;
                case 1:
                    return CacheType.ACCOUNTS;
                case 2:
                    return CacheType.PORTFOLIO;
                case 3:
                    return CacheType.GOLD_SUBSCRIPTION;
                case 4:
                    return CacheType.HOME_CARDS;
                case 5:
                    return CacheType.HOME_SWEEP_SECTION;
                case 6:
                    return CacheType.SWEEP_INTEREST;
                case 7:
                    return CacheType.SORTING_HAT;
                default:
                    return null;
            }
        }
    }

    public static CacheType valueOf(String str) {
        return (CacheType) Enum.valueOf(CacheType.class, str);
    }

    public static CacheType[] values() {
        return (CacheType[]) $VALUES.clone();
    }
}
