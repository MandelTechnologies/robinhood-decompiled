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
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\rB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextAlignment;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CENTER", "END", "JUSTIFIED", "LEFT", "RIGHT", "START", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiTextAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiTextAlignment[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("CENTER")
    public static final SduiTextAlignment CENTER = new SduiTextAlignment("CENTER", 0, "CENTER");

    @SerialName("END")
    public static final SduiTextAlignment END = new SduiTextAlignment("END", 1, "END");

    @SerialName("JUSTIFIED")
    public static final SduiTextAlignment JUSTIFIED = new SduiTextAlignment("JUSTIFIED", 2, "JUSTIFIED");

    @SerialName("LEFT")
    public static final SduiTextAlignment LEFT = new SduiTextAlignment("LEFT", 3, "LEFT");

    @SerialName("RIGHT")
    public static final SduiTextAlignment RIGHT = new SduiTextAlignment("RIGHT", 4, "RIGHT");

    @SerialName("START")
    public static final SduiTextAlignment START = new SduiTextAlignment("START", 5, "START");

    private static final /* synthetic */ SduiTextAlignment[] $values() {
        return new SduiTextAlignment[]{CENTER, END, JUSTIFIED, LEFT, RIGHT, START};
    }

    public static EnumEntries<SduiTextAlignment> getEntries() {
        return $ENTRIES;
    }

    public static SduiTextAlignment valueOf(String str) {
        return (SduiTextAlignment) Enum.valueOf(SduiTextAlignment.class, str);
    }

    public static SduiTextAlignment[] values() {
        return (SduiTextAlignment[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextAlignment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextAlignment;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiTextAlignment.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiTextAlignment> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiTextAlignment(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiTextAlignment[] sduiTextAlignmentArr$values = $values();
        $VALUES = sduiTextAlignmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiTextAlignmentArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiTextAlignment.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiTextAlignment", SduiTextAlignment.values(), new String[]{"CENTER", "END", "JUSTIFIED", "LEFT", "RIGHT", "START"}, new Annotation[][]{null, null, null, null, null, null}, null);
            }
        });
    }
}
