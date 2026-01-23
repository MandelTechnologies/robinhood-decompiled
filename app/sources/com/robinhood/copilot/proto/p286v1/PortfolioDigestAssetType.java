package com.robinhood.copilot.proto.p286v1;

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
/* compiled from: PortfolioDigestAssetType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED", "PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO", "PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY", "PORTFOLIO_DIGEST_ASSET_TYPE_OPTION", "PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT", "PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioDigestAssetType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioDigestAssetType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PortfolioDigestAssetType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_OPTION;
    public static final PortfolioDigestAssetType PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ PortfolioDigestAssetType[] $values() {
        return new PortfolioDigestAssetType[]{PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED, PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO, PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY, PORTFOLIO_DIGEST_ASSET_TYPE_OPTION, PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT, PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE};
    }

    @JvmStatic
    public static final PortfolioDigestAssetType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PortfolioDigestAssetType> getEntries() {
        return $ENTRIES;
    }

    private PortfolioDigestAssetType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PortfolioDigestAssetType portfolioDigestAssetType = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED", 0, 0);
        PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED = portfolioDigestAssetType;
        PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO", 1, 1);
        PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY", 2, 2);
        PORTFOLIO_DIGEST_ASSET_TYPE_OPTION = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_OPTION", 3, 3);
        PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT", 4, 4);
        PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE = new PortfolioDigestAssetType("PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE", 5, 5);
        PortfolioDigestAssetType[] portfolioDigestAssetTypeArr$values = $values();
        $VALUES = portfolioDigestAssetTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioDigestAssetTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestAssetType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PortfolioDigestAssetType>(orCreateKotlinClass, syntax, portfolioDigestAssetType) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestAssetType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PortfolioDigestAssetType fromValue(int value) {
                return PortfolioDigestAssetType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PortfolioDigestAssetType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestAssetType;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioDigestAssetType fromValue(int value) {
            if (value == 0) {
                return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_CRYPTO;
            }
            if (value == 2) {
                return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_EQUITY;
            }
            if (value == 3) {
                return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_OPTION;
            }
            if (value == 4) {
                return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_EVENT_CONTRACT;
            }
            if (value != 5) {
                return null;
            }
            return PortfolioDigestAssetType.PORTFOLIO_DIGEST_ASSET_TYPE_FUTURE;
        }
    }

    public static PortfolioDigestAssetType valueOf(String str) {
        return (PortfolioDigestAssetType) Enum.valueOf(PortfolioDigestAssetType.class, str);
    }

    public static PortfolioDigestAssetType[] values() {
        return (PortfolioDigestAssetType[]) $VALUES.clone();
    }
}
