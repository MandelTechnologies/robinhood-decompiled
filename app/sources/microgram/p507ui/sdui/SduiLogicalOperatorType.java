package microgram.p507ui.sdui;

import java.lang.annotation.Annotation;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.Enums4;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SDUIGenerated.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "AND", "NOT", "OR", "REF", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiLogicalOperatorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiLogicalOperatorType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("AND")
    public static final SduiLogicalOperatorType AND = new SduiLogicalOperatorType("AND", 0, "AND");

    @SerialName("NOT")
    public static final SduiLogicalOperatorType NOT = new SduiLogicalOperatorType("NOT", 1, "NOT");

    /* renamed from: OR */
    @SerialName("OR")
    public static final SduiLogicalOperatorType f7107OR = new SduiLogicalOperatorType("OR", 2, "OR");

    @SerialName("REF")
    public static final SduiLogicalOperatorType REF = new SduiLogicalOperatorType("REF", 3, "REF");

    private static final /* synthetic */ SduiLogicalOperatorType[] $values() {
        return new SduiLogicalOperatorType[]{AND, NOT, f7107OR, REF};
    }

    public static EnumEntries<SduiLogicalOperatorType> getEntries() {
        return $ENTRIES;
    }

    public static SduiLogicalOperatorType valueOf(String str) {
        return (SduiLogicalOperatorType) Enum.valueOf(SduiLogicalOperatorType.class, str);
    }

    public static SduiLogicalOperatorType[] values() {
        return (SduiLogicalOperatorType[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiLogicalOperatorType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiLogicalOperatorType;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiLogicalOperatorType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiLogicalOperatorType> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiLogicalOperatorType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiLogicalOperatorType[] sduiLogicalOperatorTypeArr$values = $values();
        $VALUES = sduiLogicalOperatorTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiLogicalOperatorTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiLogicalOperatorType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiLogicalOperatorType", SduiLogicalOperatorType.values(), new String[]{"AND", "NOT", "OR", "REF"}, new Annotation[][]{null, null, null, null}, null);
            }
        });
    }
}
