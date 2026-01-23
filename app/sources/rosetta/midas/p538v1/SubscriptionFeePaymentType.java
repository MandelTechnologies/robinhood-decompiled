package rosetta.midas.p538v1;

import com.robinhood.android.futures.charts.DisplaySpans;
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
/* compiled from: SubscriptionFeePaymentType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeePaymentType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PAYMENT_TYPE_UNSPECIFIED", "BUYING_POWER", "CREDIT_CARD", DisplaySpans.ALL, "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class SubscriptionFeePaymentType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SubscriptionFeePaymentType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SubscriptionFeePaymentType> ADAPTER;
    public static final SubscriptionFeePaymentType ALL;
    public static final SubscriptionFeePaymentType BUYING_POWER;
    public static final SubscriptionFeePaymentType CREDIT_CARD;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SubscriptionFeePaymentType PAYMENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ SubscriptionFeePaymentType[] $values() {
        return new SubscriptionFeePaymentType[]{PAYMENT_TYPE_UNSPECIFIED, BUYING_POWER, CREDIT_CARD, ALL};
    }

    @JvmStatic
    public static final SubscriptionFeePaymentType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SubscriptionFeePaymentType> getEntries() {
        return $ENTRIES;
    }

    private SubscriptionFeePaymentType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SubscriptionFeePaymentType subscriptionFeePaymentType = new SubscriptionFeePaymentType("PAYMENT_TYPE_UNSPECIFIED", 0, 0);
        PAYMENT_TYPE_UNSPECIFIED = subscriptionFeePaymentType;
        BUYING_POWER = new SubscriptionFeePaymentType("BUYING_POWER", 1, 1);
        CREDIT_CARD = new SubscriptionFeePaymentType("CREDIT_CARD", 2, 2);
        ALL = new SubscriptionFeePaymentType(DisplaySpans.ALL, 3, 3);
        SubscriptionFeePaymentType[] subscriptionFeePaymentTypeArr$values = $values();
        $VALUES = subscriptionFeePaymentTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(subscriptionFeePaymentTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SubscriptionFeePaymentType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SubscriptionFeePaymentType>(orCreateKotlinClass, syntax, subscriptionFeePaymentType) { // from class: rosetta.midas.v1.SubscriptionFeePaymentType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SubscriptionFeePaymentType fromValue(int value) {
                return SubscriptionFeePaymentType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SubscriptionFeePaymentType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/SubscriptionFeePaymentType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/SubscriptionFeePaymentType;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SubscriptionFeePaymentType fromValue(int value) {
            if (value == 0) {
                return SubscriptionFeePaymentType.PAYMENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return SubscriptionFeePaymentType.BUYING_POWER;
            }
            if (value == 2) {
                return SubscriptionFeePaymentType.CREDIT_CARD;
            }
            if (value != 3) {
                return null;
            }
            return SubscriptionFeePaymentType.ALL;
        }
    }

    public static SubscriptionFeePaymentType valueOf(String str) {
        return (SubscriptionFeePaymentType) Enum.valueOf(SubscriptionFeePaymentType.class, str);
    }

    public static SubscriptionFeePaymentType[] values() {
        return (SubscriptionFeePaymentType[]) $VALUES.clone();
    }
}
