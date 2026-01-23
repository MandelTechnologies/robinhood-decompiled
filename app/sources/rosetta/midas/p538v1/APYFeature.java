package rosetta.midas.p538v1;

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
/* compiled from: APYFeature.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lrosetta/midas/v1/APYFeature;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "APY_FEATURE_DISABLED", "GOLD_APY", "BOOSTED_GOLD_APY", "BOOSTED_GOLD_APY_HIGH", "Companion", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class APYFeature implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ APYFeature[] $VALUES;

    @JvmField
    public static final ProtoAdapter<APYFeature> ADAPTER;
    public static final APYFeature APY_FEATURE_DISABLED;
    public static final APYFeature BOOSTED_GOLD_APY;
    public static final APYFeature BOOSTED_GOLD_APY_HIGH;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final APYFeature GOLD_APY;
    private final int value;

    private static final /* synthetic */ APYFeature[] $values() {
        return new APYFeature[]{APY_FEATURE_DISABLED, GOLD_APY, BOOSTED_GOLD_APY, BOOSTED_GOLD_APY_HIGH};
    }

    @JvmStatic
    public static final APYFeature fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<APYFeature> getEntries() {
        return $ENTRIES;
    }

    private APYFeature(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final APYFeature aPYFeature = new APYFeature("APY_FEATURE_DISABLED", 0, 0);
        APY_FEATURE_DISABLED = aPYFeature;
        GOLD_APY = new APYFeature("GOLD_APY", 1, 1);
        BOOSTED_GOLD_APY = new APYFeature("BOOSTED_GOLD_APY", 2, 2);
        BOOSTED_GOLD_APY_HIGH = new APYFeature("BOOSTED_GOLD_APY_HIGH", 3, 3);
        APYFeature[] aPYFeatureArr$values = $values();
        $VALUES = aPYFeatureArr$values;
        $ENTRIES = EnumEntries2.enumEntries(aPYFeatureArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(APYFeature.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<APYFeature>(orCreateKotlinClass, syntax, aPYFeature) { // from class: rosetta.midas.v1.APYFeature$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public APYFeature fromValue(int value) {
                return APYFeature.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: APYFeature.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrosetta/midas/v1/APYFeature$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrosetta/midas/v1/APYFeature;", "fromValue", "value", "", "rosetta.midas.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final APYFeature fromValue(int value) {
            if (value == 0) {
                return APYFeature.APY_FEATURE_DISABLED;
            }
            if (value == 1) {
                return APYFeature.GOLD_APY;
            }
            if (value == 2) {
                return APYFeature.BOOSTED_GOLD_APY;
            }
            if (value != 3) {
                return null;
            }
            return APYFeature.BOOSTED_GOLD_APY_HIGH;
        }
    }

    public static APYFeature valueOf(String str) {
        return (APYFeature) Enum.valueOf(APYFeature.class, str);
    }

    public static APYFeature[] values() {
        return (APYFeature[]) $VALUES.clone();
    }
}
