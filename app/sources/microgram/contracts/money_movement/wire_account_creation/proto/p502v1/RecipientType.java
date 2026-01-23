package microgram.contracts.money_movement.wire_account_creation.proto.p502v1;

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
/* compiled from: RecipientType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RECIPIENT_TYPE_UNSPECIFIED", "RECIPIENT_TYPE_FIRST_PARTY", "RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING", "RECIPIENT_TYPE_THIRD_PARTY_OTHER", "Companion", "microgram.contracts.money_movement.wire_account_creation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class RecipientType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RecipientType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<RecipientType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final RecipientType RECIPIENT_TYPE_FIRST_PARTY;
    public static final RecipientType RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING;
    public static final RecipientType RECIPIENT_TYPE_THIRD_PARTY_OTHER;
    public static final RecipientType RECIPIENT_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ RecipientType[] $values() {
        return new RecipientType[]{RECIPIENT_TYPE_UNSPECIFIED, RECIPIENT_TYPE_FIRST_PARTY, RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING, RECIPIENT_TYPE_THIRD_PARTY_OTHER};
    }

    @JvmStatic
    public static final RecipientType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<RecipientType> getEntries() {
        return $ENTRIES;
    }

    private RecipientType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final RecipientType recipientType = new RecipientType("RECIPIENT_TYPE_UNSPECIFIED", 0, 0);
        RECIPIENT_TYPE_UNSPECIFIED = recipientType;
        RECIPIENT_TYPE_FIRST_PARTY = new RecipientType("RECIPIENT_TYPE_FIRST_PARTY", 1, 1);
        RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING = new RecipientType("RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING", 2, 2);
        RECIPIENT_TYPE_THIRD_PARTY_OTHER = new RecipientType("RECIPIENT_TYPE_THIRD_PARTY_OTHER", 3, 3);
        RecipientType[] recipientTypeArr$values = $values();
        $VALUES = recipientTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(recipientTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RecipientType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<RecipientType>(orCreateKotlinClass, syntax, recipientType) { // from class: microgram.contracts.money_movement.wire_account_creation.proto.v1.RecipientType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public RecipientType fromValue(int value) {
                return RecipientType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: RecipientType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/contracts/money_movement/wire_account_creation/proto/v1/RecipientType;", "fromValue", "value", "", "microgram.contracts.money_movement.wire_account_creation.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final RecipientType fromValue(int value) {
            if (value == 0) {
                return RecipientType.RECIPIENT_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return RecipientType.RECIPIENT_TYPE_FIRST_PARTY;
            }
            if (value == 2) {
                return RecipientType.RECIPIENT_TYPE_THIRD_PARTY_HOME_CLOSING;
            }
            if (value != 3) {
                return null;
            }
            return RecipientType.RECIPIENT_TYPE_THIRD_PARTY_OTHER;
        }
    }

    public static RecipientType valueOf(String str) {
        return (RecipientType) Enum.valueOf(RecipientType.class, str);
    }

    public static RecipientType[] values() {
        return (RecipientType[]) $VALUES.clone();
    }
}
