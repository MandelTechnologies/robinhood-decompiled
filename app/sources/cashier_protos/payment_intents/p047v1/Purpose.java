package cashier_protos.payment_intents.p047v1;

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
/* compiled from: Purpose.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/Purpose;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PURPOSE_UNSPECIFIED", "PURPOSE_BILLING", "PURPOSE_UK_BANK_TRANSFER", "PURPOSE_SG_BANK_TRANSFER", "PURPOSE_I18N_WIRE_TRANSFER", "Companion", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Purpose implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ Purpose[] $VALUES;

    @JvmField
    public static final ProtoAdapter<Purpose> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final Purpose PURPOSE_BILLING;
    public static final Purpose PURPOSE_I18N_WIRE_TRANSFER;
    public static final Purpose PURPOSE_SG_BANK_TRANSFER;
    public static final Purpose PURPOSE_UK_BANK_TRANSFER;
    public static final Purpose PURPOSE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ Purpose[] $values() {
        return new Purpose[]{PURPOSE_UNSPECIFIED, PURPOSE_BILLING, PURPOSE_UK_BANK_TRANSFER, PURPOSE_SG_BANK_TRANSFER, PURPOSE_I18N_WIRE_TRANSFER};
    }

    @JvmStatic
    public static final Purpose fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<Purpose> getEntries() {
        return $ENTRIES;
    }

    private Purpose(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final Purpose purpose = new Purpose("PURPOSE_UNSPECIFIED", 0, 0);
        PURPOSE_UNSPECIFIED = purpose;
        PURPOSE_BILLING = new Purpose("PURPOSE_BILLING", 1, 1);
        PURPOSE_UK_BANK_TRANSFER = new Purpose("PURPOSE_UK_BANK_TRANSFER", 2, 2);
        PURPOSE_SG_BANK_TRANSFER = new Purpose("PURPOSE_SG_BANK_TRANSFER", 3, 3);
        PURPOSE_I18N_WIRE_TRANSFER = new Purpose("PURPOSE_I18N_WIRE_TRANSFER", 4, 4);
        Purpose[] purposeArr$values = $values();
        $VALUES = purposeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(purposeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Purpose.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<Purpose>(orCreateKotlinClass, syntax, purpose) { // from class: cashier_protos.payment_intents.v1.Purpose$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public Purpose fromValue(int value) {
                return Purpose.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: Purpose.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcashier_protos/payment_intents/v1/Purpose$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcashier_protos/payment_intents/v1/Purpose;", "fromValue", "value", "", "cashier_protos.payment_intents.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final Purpose fromValue(int value) {
            if (value == 0) {
                return Purpose.PURPOSE_UNSPECIFIED;
            }
            if (value == 1) {
                return Purpose.PURPOSE_BILLING;
            }
            if (value == 2) {
                return Purpose.PURPOSE_UK_BANK_TRANSFER;
            }
            if (value == 3) {
                return Purpose.PURPOSE_SG_BANK_TRANSFER;
            }
            if (value != 4) {
                return null;
            }
            return Purpose.PURPOSE_I18N_WIRE_TRANSFER;
        }
    }

    public static Purpose valueOf(String str) {
        return (Purpose) Enum.valueOf(Purpose.class, str);
    }

    public static Purpose[] values() {
        return (Purpose[]) $VALUES.clone();
    }
}
