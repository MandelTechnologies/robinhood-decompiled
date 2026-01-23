package rosetta.blockchain.p533v1;

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
/* compiled from: AddressType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/blockchain/v1/AddressType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ADDRESS_TYPE_UNSPECIFIED", "P2PKH", "P2SH", "BECH32", "ZEROX", "Companion", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class AddressType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AddressType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AddressType> ADAPTER;
    public static final AddressType ADDRESS_TYPE_UNSPECIFIED;
    public static final AddressType BECH32;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final AddressType P2PKH;
    public static final AddressType P2SH;
    public static final AddressType ZEROX;
    private final int value;

    private static final /* synthetic */ AddressType[] $values() {
        return new AddressType[]{ADDRESS_TYPE_UNSPECIFIED, P2PKH, P2SH, BECH32, ZEROX};
    }

    @JvmStatic
    public static final AddressType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AddressType> getEntries() {
        return $ENTRIES;
    }

    private AddressType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AddressType addressType = new AddressType("ADDRESS_TYPE_UNSPECIFIED", 0, 0);
        ADDRESS_TYPE_UNSPECIFIED = addressType;
        P2PKH = new AddressType("P2PKH", 1, 1);
        P2SH = new AddressType("P2SH", 2, 2);
        BECH32 = new AddressType("BECH32", 3, 3);
        ZEROX = new AddressType("ZEROX", 4, 4);
        AddressType[] addressTypeArr$values = $values();
        $VALUES = addressTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(addressTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AddressType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AddressType>(orCreateKotlinClass, syntax, addressType) { // from class: rosetta.blockchain.v1.AddressType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AddressType fromValue(int value) {
                return AddressType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AddressType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/blockchain/v1/AddressType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/blockchain/v1/AddressType;", "fromValue", "value", "", "rosetta.blockchain.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AddressType fromValue(int value) {
            if (value == 0) {
                return AddressType.ADDRESS_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return AddressType.P2PKH;
            }
            if (value == 2) {
                return AddressType.P2SH;
            }
            if (value == 3) {
                return AddressType.BECH32;
            }
            if (value != 4) {
                return null;
            }
            return AddressType.ZEROX;
        }
    }

    public static AddressType valueOf(String str) {
        return (AddressType) Enum.valueOf(AddressType.class, str);
    }

    public static AddressType[] values() {
        return (AddressType[]) $VALUES.clone();
    }
}
