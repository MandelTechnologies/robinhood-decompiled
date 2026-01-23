package rosetta.nummus;

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
/* compiled from: CryptoCustodian.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrosetta/nummus/CryptoCustodian;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CRYPTO_CUSTODIAN_UNSPECIFIED", "CRYPTO_CUSTODIAN_RHT", "CRYPTO_CUSTODIAN_RHC", "CRYPTO_CUSTODIAN_RHCE", "CRYPTO_CUSTODIAN_IRA", "Companion", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class CryptoCustodian implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoCustodian[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CryptoCustodian> ADAPTER;
    public static final CryptoCustodian CRYPTO_CUSTODIAN_IRA;
    public static final CryptoCustodian CRYPTO_CUSTODIAN_RHC;
    public static final CryptoCustodian CRYPTO_CUSTODIAN_RHCE;
    public static final CryptoCustodian CRYPTO_CUSTODIAN_RHT;
    public static final CryptoCustodian CRYPTO_CUSTODIAN_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CryptoCustodian[] $values() {
        return new CryptoCustodian[]{CRYPTO_CUSTODIAN_UNSPECIFIED, CRYPTO_CUSTODIAN_RHT, CRYPTO_CUSTODIAN_RHC, CRYPTO_CUSTODIAN_RHCE, CRYPTO_CUSTODIAN_IRA};
    }

    @JvmStatic
    public static final CryptoCustodian fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CryptoCustodian> getEntries() {
        return $ENTRIES;
    }

    private CryptoCustodian(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CryptoCustodian cryptoCustodian = new CryptoCustodian("CRYPTO_CUSTODIAN_UNSPECIFIED", 0, 0);
        CRYPTO_CUSTODIAN_UNSPECIFIED = cryptoCustodian;
        CRYPTO_CUSTODIAN_RHT = new CryptoCustodian("CRYPTO_CUSTODIAN_RHT", 1, 1);
        CRYPTO_CUSTODIAN_RHC = new CryptoCustodian("CRYPTO_CUSTODIAN_RHC", 2, 2);
        CRYPTO_CUSTODIAN_RHCE = new CryptoCustodian("CRYPTO_CUSTODIAN_RHCE", 3, 3);
        CRYPTO_CUSTODIAN_IRA = new CryptoCustodian("CRYPTO_CUSTODIAN_IRA", 4, 4);
        CryptoCustodian[] cryptoCustodianArr$values = $values();
        $VALUES = cryptoCustodianArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoCustodianArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoCustodian.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CryptoCustodian>(orCreateKotlinClass, syntax, cryptoCustodian) { // from class: rosetta.nummus.CryptoCustodian$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CryptoCustodian fromValue(int value) {
                return CryptoCustodian.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CryptoCustodian.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/nummus/CryptoCustodian$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/nummus/CryptoCustodian;", "fromValue", "value", "", "rosetta.nummus.nummus_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoCustodian fromValue(int value) {
            if (value == 0) {
                return CryptoCustodian.CRYPTO_CUSTODIAN_UNSPECIFIED;
            }
            if (value == 1) {
                return CryptoCustodian.CRYPTO_CUSTODIAN_RHT;
            }
            if (value == 2) {
                return CryptoCustodian.CRYPTO_CUSTODIAN_RHC;
            }
            if (value == 3) {
                return CryptoCustodian.CRYPTO_CUSTODIAN_RHCE;
            }
            if (value != 4) {
                return null;
            }
            return CryptoCustodian.CRYPTO_CUSTODIAN_IRA;
        }
    }

    public static CryptoCustodian valueOf(String str) {
        return (CryptoCustodian) Enum.valueOf(CryptoCustodian.class, str);
    }

    public static CryptoCustodian[] values() {
        return (CryptoCustodian[]) $VALUES.clone();
    }
}
