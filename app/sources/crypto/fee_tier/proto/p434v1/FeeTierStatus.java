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
/* compiled from: FeeTierStatus.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierStatus;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "FEE_TIER_STATUS_UNSPECIFIED", "FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD", "FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER", "Companion", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class FeeTierStatus implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ FeeTierStatus[] $VALUES;

    @JvmField
    public static final ProtoAdapter<FeeTierStatus> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final FeeTierStatus FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER;
    public static final FeeTierStatus FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD;
    public static final FeeTierStatus FEE_TIER_STATUS_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ FeeTierStatus[] $values() {
        return new FeeTierStatus[]{FEE_TIER_STATUS_UNSPECIFIED, FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD, FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER};
    }

    @JvmStatic
    public static final FeeTierStatus fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<FeeTierStatus> getEntries() {
        return $ENTRIES;
    }

    private FeeTierStatus(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final FeeTierStatus feeTierStatus = new FeeTierStatus("FEE_TIER_STATUS_UNSPECIFIED", 0, 0);
        FEE_TIER_STATUS_UNSPECIFIED = feeTierStatus;
        FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD = new FeeTierStatus("FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD", 1, 1);
        FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER = new FeeTierStatus("FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER", 2, 2);
        FeeTierStatus[] feeTierStatusArr$values = $values();
        $VALUES = feeTierStatusArr$values;
        $ENTRIES = EnumEntries2.enumEntries(feeTierStatusArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FeeTierStatus.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<FeeTierStatus>(orCreateKotlinClass, syntax, feeTierStatus) { // from class: crypto.fee_tier.proto.v1.FeeTierStatus$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public FeeTierStatus fromValue(int value) {
                return FeeTierStatus.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: FeeTierStatus.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcrypto/fee_tier/proto/v1/FeeTierStatus$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcrypto/fee_tier/proto/v1/FeeTierStatus;", "fromValue", "value", "", "crypto.fee_tier.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final FeeTierStatus fromValue(int value) {
            if (value == 0) {
                return FeeTierStatus.FEE_TIER_STATUS_UNSPECIFIED;
            }
            if (value == 1) {
                return FeeTierStatus.FEE_TIER_STATUS_LOSE_TIER_PENDING_AFTER_LOCK_PERIOD;
            }
            if (value != 2) {
                return null;
            }
            return FeeTierStatus.FEE_TIER_STATUS_CLOSE_TO_LOSE_TIER;
        }
    }

    public static FeeTierStatus valueOf(String str) {
        return (FeeTierStatus) Enum.valueOf(FeeTierStatus.class, str);
    }

    public static FeeTierStatus[] values() {
        return (FeeTierStatus[]) $VALUES.clone();
    }
}
