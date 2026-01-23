package bonfire.proto.idl.margin.p036v1;

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
/* compiled from: MultiAccountEligibilityContext.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY", "MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW", "Companion", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class MultiAccountEligibilityContext implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ MultiAccountEligibilityContext[] $VALUES;

    @JvmField
    public static final ProtoAdapter<MultiAccountEligibilityContext> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW;
    public static final MultiAccountEligibilityContext MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ MultiAccountEligibilityContext[] $values() {
        return new MultiAccountEligibilityContext[]{MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY, MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW};
    }

    @JvmStatic
    public static final MultiAccountEligibilityContext fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<MultiAccountEligibilityContext> getEntries() {
        return $ENTRIES;
    }

    private MultiAccountEligibilityContext(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final MultiAccountEligibilityContext multiAccountEligibilityContext = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED", 0, 0);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED = multiAccountEligibilityContext;
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS", 1, 1);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS", 2, 2);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD", 3, 3);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT", 4, 4);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS", 5, 5);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY", 6, 6);
        MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW = new MultiAccountEligibilityContext("MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW", 7, 7);
        MultiAccountEligibilityContext[] multiAccountEligibilityContextArr$values = $values();
        $VALUES = multiAccountEligibilityContextArr$values;
        $ENTRIES = EnumEntries2.enumEntries(multiAccountEligibilityContextArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MultiAccountEligibilityContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<MultiAccountEligibilityContext>(orCreateKotlinClass, syntax, multiAccountEligibilityContext) { // from class: bonfire.proto.idl.margin.v1.MultiAccountEligibilityContext$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public MultiAccountEligibilityContext fromValue(int value) {
                return MultiAccountEligibilityContext.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: MultiAccountEligibilityContext.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lbonfire/proto/idl/margin/v1/MultiAccountEligibilityContext;", "fromValue", "value", "", "bonfire.maintenance_table.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final MultiAccountEligibilityContext fromValue(int value) {
            switch (value) {
                case 0:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_UNSPECIFIED;
                case 1:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_INVESTING_SETTINGS;
                case 2:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACATS;
                case 3:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_ACCOUNT_INVESTING_CARD;
                case 4:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_IAT;
                case 5:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_MARGIN_INVESTING_SETTINGS;
                case 6:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_FEATURE_DISCOVERY;
                case 7:
                    return MultiAccountEligibilityContext.MULTI_ACCOUNT_ELIGIBILITY_CONTEXT_TRADE_FLOW;
                default:
                    return null;
            }
        }
    }

    public static MultiAccountEligibilityContext valueOf(String str) {
        return (MultiAccountEligibilityContext) Enum.valueOf(MultiAccountEligibilityContext.class, str);
    }

    public static MultiAccountEligibilityContext[] values() {
        return (MultiAccountEligibilityContext[]) $VALUES.clone();
    }
}
