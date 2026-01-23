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
/* compiled from: BackgroundAuraVariant.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lhippo/model/v1/BackgroundAuraVariant;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "BACKGROUND_AURA_VARIANT_UNSPECIFIED", "BACKGROUND_AURA_VARIANT_TRADING_SESSION", "BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE", "BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE", "BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE", "BACKGROUND_AURA_VARIANT_NO_AURA", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class BackgroundAuraVariant implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ BackgroundAuraVariant[] $VALUES;

    @JvmField
    public static final ProtoAdapter<BackgroundAuraVariant> ADAPTER;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_NO_AURA;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_TRADING_SESSION;
    public static final BackgroundAuraVariant BACKGROUND_AURA_VARIANT_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ BackgroundAuraVariant[] $values() {
        return new BackgroundAuraVariant[]{BACKGROUND_AURA_VARIANT_UNSPECIFIED, BACKGROUND_AURA_VARIANT_TRADING_SESSION, BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE, BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE, BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE, BACKGROUND_AURA_VARIANT_NO_AURA};
    }

    @JvmStatic
    public static final BackgroundAuraVariant fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<BackgroundAuraVariant> getEntries() {
        return $ENTRIES;
    }

    private BackgroundAuraVariant(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final BackgroundAuraVariant backgroundAuraVariant = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_UNSPECIFIED", 0, 0);
        BACKGROUND_AURA_VARIANT_UNSPECIFIED = backgroundAuraVariant;
        BACKGROUND_AURA_VARIANT_TRADING_SESSION = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_TRADING_SESSION", 1, 1);
        BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE", 2, 2);
        BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE", 3, 3);
        BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE", 4, 4);
        BACKGROUND_AURA_VARIANT_NO_AURA = new BackgroundAuraVariant("BACKGROUND_AURA_VARIANT_NO_AURA", 5, 5);
        BackgroundAuraVariant[] backgroundAuraVariantArr$values = $values();
        $VALUES = backgroundAuraVariantArr$values;
        $ENTRIES = EnumEntries2.enumEntries(backgroundAuraVariantArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(BackgroundAuraVariant.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<BackgroundAuraVariant>(orCreateKotlinClass, syntax, backgroundAuraVariant) { // from class: hippo.model.v1.BackgroundAuraVariant$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public BackgroundAuraVariant fromValue(int value) {
                return BackgroundAuraVariant.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: BackgroundAuraVariant.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/BackgroundAuraVariant$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/BackgroundAuraVariant;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final BackgroundAuraVariant fromValue(int value) {
            if (value == 0) {
                return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_UNSPECIFIED;
            }
            if (value == 1) {
                return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_TRADING_SESSION;
            }
            if (value == 2) {
                return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_PORTFOLIO_PERFORMANCE;
            }
            if (value == 3) {
                return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_SP500_PERFORMANCE;
            }
            if (value == 4) {
                return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_BTC_PERFORMANCE;
            }
            if (value != 5) {
                return null;
            }
            return BackgroundAuraVariant.BACKGROUND_AURA_VARIANT_NO_AURA;
        }
    }

    public static BackgroundAuraVariant valueOf(String str) {
        return (BackgroundAuraVariant) Enum.valueOf(BackgroundAuraVariant.class, str);
    }

    public static BackgroundAuraVariant[] values() {
        return (BackgroundAuraVariant[]) $VALUES.clone();
    }
}
