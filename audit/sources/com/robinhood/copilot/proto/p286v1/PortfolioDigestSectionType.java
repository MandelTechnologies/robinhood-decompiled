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
/* compiled from: PortfolioDigestSectionType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED", "PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER", "PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER", "PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER", "PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING", "PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS", "PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER", "Companion", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class PortfolioDigestSectionType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ PortfolioDigestSectionType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<PortfolioDigestSectionType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER;
    public static final PortfolioDigestSectionType PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ PortfolioDigestSectionType[] $values() {
        return new PortfolioDigestSectionType[]{PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED, PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER, PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER, PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER, PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING, PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS, PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER};
    }

    @JvmStatic
    public static final PortfolioDigestSectionType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<PortfolioDigestSectionType> getEntries() {
        return $ENTRIES;
    }

    private PortfolioDigestSectionType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final PortfolioDigestSectionType portfolioDigestSectionType = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED", 0, 0);
        PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED = portfolioDigestSectionType;
        PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER", 1, 1);
        PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER", 2, 2);
        PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER", 3, 3);
        PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING", 4, 4);
        PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS", 5, 5);
        PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER = new PortfolioDigestSectionType("PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER", 6, 6);
        PortfolioDigestSectionType[] portfolioDigestSectionTypeArr$values = $values();
        $VALUES = portfolioDigestSectionTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(portfolioDigestSectionTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PortfolioDigestSectionType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<PortfolioDigestSectionType>(orCreateKotlinClass, syntax, portfolioDigestSectionType) { // from class: com.robinhood.copilot.proto.v1.PortfolioDigestSectionType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public PortfolioDigestSectionType fromValue(int value) {
                return PortfolioDigestSectionType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: PortfolioDigestSectionType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/copilot/proto/v1/PortfolioDigestSectionType;", "fromValue", "value", "", "copilot.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final PortfolioDigestSectionType fromValue(int value) {
            switch (value) {
                case 0:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_UNSPECIFIED;
                case 1:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_MARKET_DRIVER;
                case 2:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_RETURN_DRIVER;
                case 3:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_TOP_MOVER;
                case 4:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_BREAKING;
                case 5:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_EVENTS;
                case 6:
                    return PortfolioDigestSectionType.PORTFOLIO_DIGEST_SECTION_TYPE_REVENUE_DRIVER;
                default:
                    return null;
            }
        }
    }

    public static PortfolioDigestSectionType valueOf(String str) {
        return (PortfolioDigestSectionType) Enum.valueOf(PortfolioDigestSectionType.class, str);
    }

    public static PortfolioDigestSectionType[] values() {
        return (PortfolioDigestSectionType[]) $VALUES.clone();
    }
}
