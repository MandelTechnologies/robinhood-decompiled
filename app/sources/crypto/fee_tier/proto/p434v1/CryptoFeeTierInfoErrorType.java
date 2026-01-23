package crypto.fee_tier.proto.p434v1;

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
/* compiled from: CryptoFeeTierInfoErrorType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoErrorType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED", "CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class CryptoFeeTierInfoErrorType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoFeeTierInfoErrorType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CryptoFeeTierInfoErrorType> ADAPTER;
    public static final CryptoFeeTierInfoErrorType CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT;
    public static final CryptoFeeTierInfoErrorType CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CryptoFeeTierInfoErrorType[] $values() {
        return new CryptoFeeTierInfoErrorType[]{CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED, CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT};
    }

    @JvmStatic
    public static final CryptoFeeTierInfoErrorType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CryptoFeeTierInfoErrorType> getEntries() {
        return $ENTRIES;
    }

    private CryptoFeeTierInfoErrorType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CryptoFeeTierInfoErrorType cryptoFeeTierInfoErrorType = new CryptoFeeTierInfoErrorType("CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED", 0, 0);
        CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED = cryptoFeeTierInfoErrorType;
        CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT = new CryptoFeeTierInfoErrorType("CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT", 1, 1);
        CryptoFeeTierInfoErrorType[] cryptoFeeTierInfoErrorTypeArr$values = $values();
        $VALUES = cryptoFeeTierInfoErrorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoFeeTierInfoErrorTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoFeeTierInfoErrorType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CryptoFeeTierInfoErrorType>(orCreateKotlinClass, syntax, cryptoFeeTierInfoErrorType) { // from class: crypto.fee_tier.proto.v1.CryptoFeeTierInfoErrorType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CryptoFeeTierInfoErrorType fromValue(int value) {
                return CryptoFeeTierInfoErrorType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CryptoFeeTierInfoErrorType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoErrorType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto/fee_tier/proto/v1/CryptoFeeTierInfoErrorType;", "fromValue", "value", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoFeeTierInfoErrorType fromValue(int value) {
            if (value == 0) {
                return CryptoFeeTierInfoErrorType.CRYPTO_FEE_TIER_INFO_ERROR_TYPE_UNSPECIFIED;
            }
            if (value != 1) {
                return null;
            }
            return CryptoFeeTierInfoErrorType.CRYPTO_FEE_TIER_INFO_ERROR_TYPE_NO_CRYPTO_ACCOUNT;
        }
    }

    public static CryptoFeeTierInfoErrorType valueOf(String str) {
        return (CryptoFeeTierInfoErrorType) Enum.valueOf(CryptoFeeTierInfoErrorType.class, str);
    }

    public static CryptoFeeTierInfoErrorType[] values() {
        return (CryptoFeeTierInfoErrorType[]) $VALUES.clone();
    }
}
