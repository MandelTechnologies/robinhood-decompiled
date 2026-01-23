package nummus.p512v1;

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
/* compiled from: FeeTierPromoTriggerType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lnummus/v1/FeeTierPromoTriggerType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "PROMO_TRIGGER_TYPE_UNSPECIFIED", "PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP", "PROMO_TRIGGER_TYPE_RESURRECTION", "PROMO_TRIGGER_TYPE_HIGH_AUC", "Companion", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class FeeTierPromoTriggerType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeTierPromoTriggerType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeeTierPromoTriggerType> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeeTierPromoTriggerType PROMO_TRIGGER_TYPE_HIGH_AUC;
    public static final FeeTierPromoTriggerType PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP;
    public static final FeeTierPromoTriggerType PROMO_TRIGGER_TYPE_RESURRECTION;
    public static final FeeTierPromoTriggerType PROMO_TRIGGER_TYPE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FeeTierPromoTriggerType[] $values() {
        return new FeeTierPromoTriggerType[]{PROMO_TRIGGER_TYPE_UNSPECIFIED, PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP, PROMO_TRIGGER_TYPE_RESURRECTION, PROMO_TRIGGER_TYPE_HIGH_AUC};
    }

    @JvmStatic
    public static final FeeTierPromoTriggerType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeeTierPromoTriggerType> getEntries() {
        return $ENTRIES;
    }

    private FeeTierPromoTriggerType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeeTierPromoTriggerType feeTierPromoTriggerType = new FeeTierPromoTriggerType("PROMO_TRIGGER_TYPE_UNSPECIFIED", 0, 0);
        PROMO_TRIGGER_TYPE_UNSPECIFIED = feeTierPromoTriggerType;
        PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP = new FeeTierPromoTriggerType("PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP", 1, 1);
        PROMO_TRIGGER_TYPE_RESURRECTION = new FeeTierPromoTriggerType("PROMO_TRIGGER_TYPE_RESURRECTION", 2, 2);
        PROMO_TRIGGER_TYPE_HIGH_AUC = new FeeTierPromoTriggerType("PROMO_TRIGGER_TYPE_HIGH_AUC", 3, 3);
        FeeTierPromoTriggerType[] feeTierPromoTriggerTypeArr$values = $values();
        $VALUES = feeTierPromoTriggerTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeTierPromoTriggerTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTierPromoTriggerType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeeTierPromoTriggerType>(orCreateKotlinClass, syntax, feeTierPromoTriggerType) { // from class: nummus.v1.FeeTierPromoTriggerType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeeTierPromoTriggerType fromValue(int value) {
                return FeeTierPromoTriggerType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeeTierPromoTriggerType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lnummus/v1/FeeTierPromoTriggerType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lnummus/v1/FeeTierPromoTriggerType;", "fromValue", "value", "", "nummus.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeeTierPromoTriggerType fromValue(int value) {
            if (value == 0) {
                return FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_NEW_RHC_SIGNUP;
            }
            if (value == 2) {
                return FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_RESURRECTION;
            }
            if (value != 3) {
                return null;
            }
            return FeeTierPromoTriggerType.PROMO_TRIGGER_TYPE_HIGH_AUC;
        }
    }

    public static FeeTierPromoTriggerType valueOf(String str) {
        return (FeeTierPromoTriggerType) Enum.valueOf(FeeTierPromoTriggerType.class, str);
    }

    public static FeeTierPromoTriggerType[] values() {
        return (FeeTierPromoTriggerType[]) $VALUES.clone();
    }
}
