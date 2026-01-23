package bff_crypto_trading.service.p018v1;

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
/* compiled from: CryptoAssetType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoAssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CRYPTO_ASSET_TYPE_UNSPECIFIED", "CRYPTO_ASSET_TYPE_CRYPTO", "CRYPTO_ASSET_TYPE_TOKENIZED_STOCK", "CRYPTO_ASSET_TYPE_TOKENIZED_ETF", "Companion", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class CryptoAssetType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ CryptoAssetType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<CryptoAssetType> ADAPTER;
    public static final CryptoAssetType CRYPTO_ASSET_TYPE_CRYPTO;
    public static final CryptoAssetType CRYPTO_ASSET_TYPE_TOKENIZED_ETF;
    public static final CryptoAssetType CRYPTO_ASSET_TYPE_TOKENIZED_STOCK;
    public static final CryptoAssetType CRYPTO_ASSET_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ CryptoAssetType[] $values() {
        return new CryptoAssetType[]{CRYPTO_ASSET_TYPE_UNSPECIFIED, CRYPTO_ASSET_TYPE_CRYPTO, CRYPTO_ASSET_TYPE_TOKENIZED_STOCK, CRYPTO_ASSET_TYPE_TOKENIZED_ETF};
    }

    @JvmStatic
    public static final CryptoAssetType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<CryptoAssetType> getEntries() {
        return $ENTRIES;
    }

    private CryptoAssetType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final CryptoAssetType cryptoAssetType = new CryptoAssetType("CRYPTO_ASSET_TYPE_UNSPECIFIED", 0, 0);
        CRYPTO_ASSET_TYPE_UNSPECIFIED = cryptoAssetType;
        CRYPTO_ASSET_TYPE_CRYPTO = new CryptoAssetType("CRYPTO_ASSET_TYPE_CRYPTO", 1, 1);
        CRYPTO_ASSET_TYPE_TOKENIZED_STOCK = new CryptoAssetType("CRYPTO_ASSET_TYPE_TOKENIZED_STOCK", 2, 2);
        CRYPTO_ASSET_TYPE_TOKENIZED_ETF = new CryptoAssetType("CRYPTO_ASSET_TYPE_TOKENIZED_ETF", 3, 3);
        CryptoAssetType[] cryptoAssetTypeArr$values = $values();
        $VALUES = cryptoAssetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(cryptoAssetTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoAssetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<CryptoAssetType>(orCreateKotlinClass, syntax, cryptoAssetType) { // from class: bff_crypto_trading.service.v1.CryptoAssetType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public CryptoAssetType fromValue(int value) {
                return CryptoAssetType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: CryptoAssetType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbff_crypto_trading/service/v1/CryptoAssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbff_crypto_trading/service/v1/CryptoAssetType;", "fromValue", "value", "", "bff_crypto_trading.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final CryptoAssetType fromValue(int value) {
            if (value == 0) {
                return CryptoAssetType.CRYPTO_ASSET_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return CryptoAssetType.CRYPTO_ASSET_TYPE_CRYPTO;
            }
            if (value == 2) {
                return CryptoAssetType.CRYPTO_ASSET_TYPE_TOKENIZED_STOCK;
            }
            if (value != 3) {
                return null;
            }
            return CryptoAssetType.CRYPTO_ASSET_TYPE_TOKENIZED_ETF;
        }
    }

    public static CryptoAssetType valueOf(String str) {
        return (CryptoAssetType) Enum.valueOf(CryptoAssetType.class, str);
    }

    public static CryptoAssetType[] values() {
        return (CryptoAssetType[]) $VALUES.clone();
    }
}
