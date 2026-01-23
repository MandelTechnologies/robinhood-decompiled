package hippo.model.p469v1;

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
/* compiled from: AnnotationDrawingType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lhippo/model/v1/AnnotationDrawingType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ANNOTATION_DRAWING_TYPE_UNSPECIFIED", "ANNOTATION_DRAWING_TYPE_CALLOUT", "ANNOTATION_DRAWING_TYPE_PRICE_LABEL", "ANNOTATION_DRAWING_TYPE_TEXT", "ANNOTATION_DRAWING_TYPE_ARROW", "ANNOTATION_DRAWING_TYPE_HIGHLIGHTER", "ANNOTATION_DRAWING_TYPE_PATH", "ANNOTATION_DRAWING_TYPE_BRUSH", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AnnotationDrawingType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ AnnotationDrawingType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<AnnotationDrawingType> ADAPTER;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_ARROW;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_BRUSH;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_CALLOUT;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_HIGHLIGHTER;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_PATH;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_PRICE_LABEL;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_TEXT;
    public static final AnnotationDrawingType ANNOTATION_DRAWING_TYPE_UNSPECIFIED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ AnnotationDrawingType[] $values() {
        return new AnnotationDrawingType[]{ANNOTATION_DRAWING_TYPE_UNSPECIFIED, ANNOTATION_DRAWING_TYPE_CALLOUT, ANNOTATION_DRAWING_TYPE_PRICE_LABEL, ANNOTATION_DRAWING_TYPE_TEXT, ANNOTATION_DRAWING_TYPE_ARROW, ANNOTATION_DRAWING_TYPE_HIGHLIGHTER, ANNOTATION_DRAWING_TYPE_PATH, ANNOTATION_DRAWING_TYPE_BRUSH};
    }

    @JvmStatic
    public static final AnnotationDrawingType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<AnnotationDrawingType> getEntries() {
        return $ENTRIES;
    }

    private AnnotationDrawingType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final AnnotationDrawingType annotationDrawingType = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_UNSPECIFIED", 0, 0);
        ANNOTATION_DRAWING_TYPE_UNSPECIFIED = annotationDrawingType;
        ANNOTATION_DRAWING_TYPE_CALLOUT = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_CALLOUT", 1, 1);
        ANNOTATION_DRAWING_TYPE_PRICE_LABEL = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_PRICE_LABEL", 2, 2);
        ANNOTATION_DRAWING_TYPE_TEXT = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_TEXT", 3, 3);
        ANNOTATION_DRAWING_TYPE_ARROW = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_ARROW", 4, 4);
        ANNOTATION_DRAWING_TYPE_HIGHLIGHTER = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_HIGHLIGHTER", 5, 5);
        ANNOTATION_DRAWING_TYPE_PATH = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_PATH", 6, 6);
        ANNOTATION_DRAWING_TYPE_BRUSH = new AnnotationDrawingType("ANNOTATION_DRAWING_TYPE_BRUSH", 7, 7);
        AnnotationDrawingType[] annotationDrawingTypeArr$values = $values();
        $VALUES = annotationDrawingTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(annotationDrawingTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnnotationDrawingType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<AnnotationDrawingType>(orCreateKotlinClass, syntax, annotationDrawingType) { // from class: hippo.model.v1.AnnotationDrawingType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public AnnotationDrawingType fromValue(int value) {
                return AnnotationDrawingType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: AnnotationDrawingType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/AnnotationDrawingType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/AnnotationDrawingType;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final AnnotationDrawingType fromValue(int value) {
            switch (value) {
                case 0:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_UNSPECIFIED;
                case 1:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_CALLOUT;
                case 2:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_PRICE_LABEL;
                case 3:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_TEXT;
                case 4:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_ARROW;
                case 5:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_HIGHLIGHTER;
                case 6:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_PATH;
                case 7:
                    return AnnotationDrawingType.ANNOTATION_DRAWING_TYPE_BRUSH;
                default:
                    return null;
            }
        }
    }

    public static AnnotationDrawingType valueOf(String str) {
        return (AnnotationDrawingType) Enum.valueOf(AnnotationDrawingType.class, str);
    }

    public static AnnotationDrawingType[] values() {
        return (AnnotationDrawingType[]) $VALUES.clone();
    }
}
