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
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "CENTER", "END", "FILL", "START", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiSecondaryAxisAlignment {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiSecondaryAxisAlignment[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("CENTER")
    public static final SduiSecondaryAxisAlignment CENTER = new SduiSecondaryAxisAlignment("CENTER", 0, "CENTER");

    @SerialName("END")
    public static final SduiSecondaryAxisAlignment END = new SduiSecondaryAxisAlignment("END", 1, "END");

    @SerialName("FILL")
    public static final SduiSecondaryAxisAlignment FILL = new SduiSecondaryAxisAlignment("FILL", 2, "FILL");

    @SerialName("START")
    public static final SduiSecondaryAxisAlignment START = new SduiSecondaryAxisAlignment("START", 3, "START");

    private static final /* synthetic */ SduiSecondaryAxisAlignment[] $values() {
        return new SduiSecondaryAxisAlignment[]{CENTER, END, FILL, START};
    }

    public static EnumEntries<SduiSecondaryAxisAlignment> getEntries() {
        return $ENTRIES;
    }

    public static SduiSecondaryAxisAlignment valueOf(String str) {
        return (SduiSecondaryAxisAlignment) Enum.valueOf(SduiSecondaryAxisAlignment.class, str);
    }

    public static SduiSecondaryAxisAlignment[] values() {
        return (SduiSecondaryAxisAlignment[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiSecondaryAxisAlignment;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiSecondaryAxisAlignment.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiSecondaryAxisAlignment> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiSecondaryAxisAlignment(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiSecondaryAxisAlignment[] sduiSecondaryAxisAlignmentArr$values = $values();
        $VALUES = sduiSecondaryAxisAlignmentArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiSecondaryAxisAlignmentArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiSecondaryAxisAlignment.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiSecondaryAxisAlignment", SduiSecondaryAxisAlignment.values(), new String[]{"CENTER", "END", "FILL", "START"}, new Annotation[][]{null, null, null, null}, null);
            }
        });
    }
}
