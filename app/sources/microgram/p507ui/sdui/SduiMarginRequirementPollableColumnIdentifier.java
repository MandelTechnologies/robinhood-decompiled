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
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INITIAL", "MAINTENANCE", "MARGIN_REQUIREMENT", "MARKET_VALUE", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiMarginRequirementPollableColumnIdentifier {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiMarginRequirementPollableColumnIdentifier[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("INITIAL")
    public static final SduiMarginRequirementPollableColumnIdentifier INITIAL = new SduiMarginRequirementPollableColumnIdentifier("INITIAL", 0, "INITIAL");

    @SerialName("MAINTENANCE")
    public static final SduiMarginRequirementPollableColumnIdentifier MAINTENANCE = new SduiMarginRequirementPollableColumnIdentifier("MAINTENANCE", 1, "MAINTENANCE");

    @SerialName("MARGIN_REQUIREMENT")
    public static final SduiMarginRequirementPollableColumnIdentifier MARGIN_REQUIREMENT = new SduiMarginRequirementPollableColumnIdentifier("MARGIN_REQUIREMENT", 2, "MARGIN_REQUIREMENT");

    @SerialName("MARKET_VALUE")
    public static final SduiMarginRequirementPollableColumnIdentifier MARKET_VALUE = new SduiMarginRequirementPollableColumnIdentifier("MARKET_VALUE", 3, "MARKET_VALUE");
    private final String value;

    private static final /* synthetic */ SduiMarginRequirementPollableColumnIdentifier[] $values() {
        return new SduiMarginRequirementPollableColumnIdentifier[]{INITIAL, MAINTENANCE, MARGIN_REQUIREMENT, MARKET_VALUE};
    }

    public static EnumEntries<SduiMarginRequirementPollableColumnIdentifier> getEntries() {
        return $ENTRIES;
    }

    public static SduiMarginRequirementPollableColumnIdentifier valueOf(String str) {
        return (SduiMarginRequirementPollableColumnIdentifier) Enum.valueOf(SduiMarginRequirementPollableColumnIdentifier.class, str);
    }

    public static SduiMarginRequirementPollableColumnIdentifier[] values() {
        return (SduiMarginRequirementPollableColumnIdentifier[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiMarginRequirementPollableColumnIdentifier;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiMarginRequirementPollableColumnIdentifier.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiMarginRequirementPollableColumnIdentifier> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiMarginRequirementPollableColumnIdentifier(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiMarginRequirementPollableColumnIdentifier[] sduiMarginRequirementPollableColumnIdentifierArr$values = $values();
        $VALUES = sduiMarginRequirementPollableColumnIdentifierArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiMarginRequirementPollableColumnIdentifierArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiMarginRequirementPollableColumnIdentifier.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiMarginRequirementPollableColumnIdentifier", SduiMarginRequirementPollableColumnIdentifier.values(), new String[]{"INITIAL", "MAINTENANCE", "MARGIN_REQUIREMENT", "MARKET_VALUE"}, new Annotation[][]{null, null, null, null}, null);
            }
        });
    }
}
