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
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL_CHARACTERS", "NONE", "SENTENCES", "UNKNOWN", "WORDS", "Companion", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@Serializable
/* loaded from: classes14.dex */
public final class SduiTextInputAutoCapitalizationType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SduiTextInputAutoCapitalizationType[] $VALUES;
    private static final Lazy<KSerializer<Object>> $cachedSerializer$delegate;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String value;

    @SerialName("ALL_CHARACTERS")
    public static final SduiTextInputAutoCapitalizationType ALL_CHARACTERS = new SduiTextInputAutoCapitalizationType("ALL_CHARACTERS", 0, "ALL_CHARACTERS");

    @SerialName("NONE")
    public static final SduiTextInputAutoCapitalizationType NONE = new SduiTextInputAutoCapitalizationType("NONE", 1, "NONE");

    @SerialName("SENTENCES")
    public static final SduiTextInputAutoCapitalizationType SENTENCES = new SduiTextInputAutoCapitalizationType("SENTENCES", 2, "SENTENCES");

    @SerialName("UNKNOWN")
    public static final SduiTextInputAutoCapitalizationType UNKNOWN = new SduiTextInputAutoCapitalizationType("UNKNOWN", 3, "UNKNOWN");

    @SerialName("WORDS")
    public static final SduiTextInputAutoCapitalizationType WORDS = new SduiTextInputAutoCapitalizationType("WORDS", 4, "WORDS");

    private static final /* synthetic */ SduiTextInputAutoCapitalizationType[] $values() {
        return new SduiTextInputAutoCapitalizationType[]{ALL_CHARACTERS, NONE, SENTENCES, UNKNOWN, WORDS};
    }

    public static EnumEntries<SduiTextInputAutoCapitalizationType> getEntries() {
        return $ENTRIES;
    }

    public static SduiTextInputAutoCapitalizationType valueOf(String str) {
        return (SduiTextInputAutoCapitalizationType) Enum.valueOf(SduiTextInputAutoCapitalizationType.class, str);
    }

    public static SduiTextInputAutoCapitalizationType[] values() {
        return (SduiTextInputAutoCapitalizationType[]) $VALUES.clone();
    }

    /* compiled from: SDUIGenerated.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m3636d2 = {"Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lmicrogram/ui/sdui/SduiTextInputAutoCapitalizationType;", "microgram-ui"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        private final /* synthetic */ KSerializer get$cachedSerializer() {
            return (KSerializer) SduiTextInputAutoCapitalizationType.$cachedSerializer$delegate.getValue();
        }

        public final KSerializer<SduiTextInputAutoCapitalizationType> serializer() {
            return get$cachedSerializer();
        }
    }

    private SduiTextInputAutoCapitalizationType(String str, int i, String str2) {
        this.value = str2;
    }

    public final String getValue() {
        return this.value;
    }

    static {
        SduiTextInputAutoCapitalizationType[] sduiTextInputAutoCapitalizationTypeArr$values = $values();
        $VALUES = sduiTextInputAutoCapitalizationTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sduiTextInputAutoCapitalizationTypeArr$values);
        INSTANCE = new Companion(null);
        $cachedSerializer$delegate = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, new Function0<KSerializer<Object>>() { // from class: microgram.ui.sdui.SduiTextInputAutoCapitalizationType.Companion.1
            @Override // kotlin.jvm.functions.Function0
            public final KSerializer<Object> invoke() {
                return Enums4.createAnnotatedEnumSerializer("microgram.ui.sdui.SduiTextInputAutoCapitalizationType", SduiTextInputAutoCapitalizationType.values(), new String[]{"ALL_CHARACTERS", "NONE", "SENTENCES", "UNKNOWN", "WORDS"}, new Annotation[][]{null, null, null, null, null}, null);
            }
        });
    }
}
