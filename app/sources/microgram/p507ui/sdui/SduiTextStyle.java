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
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextStyle;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "DISPLAY_LARGE", "DISPLAY_MEDIUM", "DISPLAY_SMALL", "TEXT_LARGE", "TEXT_LARGE_BOLD", "TEXT_MEDIUM", "TEXT_MEDIUM_BOLD", "TEXT_SMALL", "TEXT_SMALL_BOLD", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiTextStyle {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiTextStyle[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @SerialName("DISPLAY_LARGE")
    public static final SduiTextStyle DISPLAY_LARGE = new SduiTextStyle("DISPLAY_LARGE", 0, "DISPLAY_LARGE");

    @SerialName("DISPLAY_MEDIUM")
    public static final SduiTextStyle DISPLAY_MEDIUM = new SduiTextStyle("DISPLAY_MEDIUM", 1, "DISPLAY_MEDIUM");

    @SerialName("DISPLAY_SMALL")
    public static final SduiTextStyle DISPLAY_SMALL = new SduiTextStyle("DISPLAY_SMALL", 2, "DISPLAY_SMALL");

    @SerialName("TEXT_LARGE")
    public static final SduiTextStyle TEXT_LARGE = new SduiTextStyle("TEXT_LARGE", 3, "TEXT_LARGE");

    @SerialName("TEXT_LARGE_BOLD")
    public static final SduiTextStyle TEXT_LARGE_BOLD = new SduiTextStyle("TEXT_LARGE_BOLD", 4, "TEXT_LARGE_BOLD");

    @SerialName("TEXT_MEDIUM")
    public static final SduiTextStyle TEXT_MEDIUM = new SduiTextStyle("TEXT_MEDIUM", 5, "TEXT_MEDIUM");

    @SerialName("TEXT_MEDIUM_BOLD")
    public static final SduiTextStyle TEXT_MEDIUM_BOLD = new SduiTextStyle("TEXT_MEDIUM_BOLD", 6, "TEXT_MEDIUM_BOLD");

    @SerialName("TEXT_SMALL")
    public static final SduiTextStyle TEXT_SMALL = new SduiTextStyle("TEXT_SMALL", 7, "TEXT_SMALL");

    @SerialName("TEXT_SMALL_BOLD")
    public static final SduiTextStyle TEXT_SMALL_BOLD = new SduiTextStyle("TEXT_SMALL_BOLD", 8, "TEXT_SMALL_BOLD");
    private final String value;

    private static final /* synthetic */ SduiTextStyle[] $values() {
        return new SduiTextStyle[]{DISPLAY_LARGE, DISPLAY_MEDIUM, DISPLAY_SMALL, TEXT_LARGE, TEXT_LARGE_BOLD, TEXT_MEDIUM, TEXT_MEDIUM_BOLD, TEXT_SMALL, TEXT_SMALL_BOLD};
    }

    public static EnumEntries<SduiTextStyle> getEntries() {
        return $ENTRIES;
    }

    public static SduiTextStyle valueOf(String str) {
        return (SduiTextStyle) Enum.valueOf(SduiTextStyle.class, str);
    }

    public static SduiTextStyle[] values() {
        return (SduiTextStyle[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextStyle$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextStyle;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiTextStyle.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiTextStyle> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiTextStyle(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiTextStyle[] sduiTextStyleArr$values = $values();
        $VALUES = sduiTextStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiTextStyleArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiTextStyle.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiTextStyle", SduiTextStyle.values(), new String[]{"DISPLAY_LARGE", "DISPLAY_MEDIUM", "DISPLAY_SMALL", "TEXT_LARGE", "TEXT_LARGE_BOLD", "TEXT_MEDIUM", "TEXT_MEDIUM_BOLD", "TEXT_SMALL", "TEXT_SMALL_BOLD"}, new Annotation[][]{null, null, null, null, null, null, null, null, null}, null);
            }
        });
    }
}
