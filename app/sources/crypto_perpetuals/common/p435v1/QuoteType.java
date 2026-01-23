package crypto_perpetuals.common.p435v1;

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
/* compiled from: QuoteType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/QuoteType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "QUOTE_TYPE_UNSPECIFIED", "ASK_PRICE", "BID_PRICE", "LIMIT_PRICE", "STOP_PRICE", "Companion", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class QuoteType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ QuoteType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<QuoteType> ADAPTER;
    public static final QuoteType ASK_PRICE;
    public static final QuoteType BID_PRICE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final QuoteType LIMIT_PRICE;
    public static final QuoteType QUOTE_TYPE_UNSPECIFIED;
    public static final QuoteType STOP_PRICE;
    private final int value;

    private static final /* synthetic */ QuoteType[] $values() {
        return new QuoteType[]{QUOTE_TYPE_UNSPECIFIED, ASK_PRICE, BID_PRICE, LIMIT_PRICE, STOP_PRICE};
    }

    @JvmStatic
    public static final QuoteType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<QuoteType> getEntries() {
        return $ENTRIES;
    }

    private QuoteType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final QuoteType quoteType = new QuoteType("QUOTE_TYPE_UNSPECIFIED", 0, 0);
        QUOTE_TYPE_UNSPECIFIED = quoteType;
        ASK_PRICE = new QuoteType("ASK_PRICE", 1, 1);
        BID_PRICE = new QuoteType("BID_PRICE", 2, 2);
        LIMIT_PRICE = new QuoteType("LIMIT_PRICE", 3, 3);
        STOP_PRICE = new QuoteType("STOP_PRICE", 4, 4);
        QuoteType[] quoteTypeArr$values = $values();
        $VALUES = quoteTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(quoteTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(QuoteType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<QuoteType>(orCreateKotlinClass, syntax, quoteType) { // from class: crypto_perpetuals.common.v1.QuoteType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public QuoteType fromValue(int value) {
                return QuoteType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: QuoteType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto_perpetuals/common/v1/QuoteType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto_perpetuals/common/v1/QuoteType;", "fromValue", "value", "", "crypto_perpetuals.common.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final QuoteType fromValue(int value) {
            if (value == 0) {
                return QuoteType.QUOTE_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return QuoteType.ASK_PRICE;
            }
            if (value == 2) {
                return QuoteType.BID_PRICE;
            }
            if (value == 3) {
                return QuoteType.LIMIT_PRICE;
            }
            if (value != 4) {
                return null;
            }
            return QuoteType.STOP_PRICE;
        }
    }

    public static QuoteType valueOf(String str) {
        return (QuoteType) Enum.valueOf(QuoteType.class, str);
    }

    public static QuoteType[] values() {
        return (QuoteType[]) $VALUES.clone();
    }
}
