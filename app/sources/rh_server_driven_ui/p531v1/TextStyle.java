package rh_server_driven_ui.p531v1;

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
/* compiled from: TextStyle.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyle;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TEXT_STYLE_UNSPECIFIED", "TEXT_STYLE_TEXT_SMALL", "TEXT_STYLE_TEXT_SMALL_BOLD", "TEXT_STYLE_TEXT_MEDIUM", "TEXT_STYLE_TEXT_MEDIUM_BOLD", "TEXT_STYLE_TEXT_LARGE", "TEXT_STYLE_TEXT_LARGE_BOLD", "TEXT_STYLE_DISPLAY_SMALL", "TEXT_STYLE_DISPLAY_MEDIUM", "TEXT_STYLE_DISPLAY_LARGE", "TEXT_STYLE_BOOK_COVER_SMALL", "TEXT_STYLE_BOOK_COVER_MEDIUM", "TEXT_STYLE_BOOK_COVER_LARGE", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class TextStyle implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ TextStyle[] $VALUES;

    @JvmField
    public static final ProtoAdapter<TextStyle> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final TextStyle TEXT_STYLE_BOOK_COVER_LARGE;
    public static final TextStyle TEXT_STYLE_BOOK_COVER_MEDIUM;
    public static final TextStyle TEXT_STYLE_BOOK_COVER_SMALL;
    public static final TextStyle TEXT_STYLE_DISPLAY_LARGE;
    public static final TextStyle TEXT_STYLE_DISPLAY_MEDIUM;
    public static final TextStyle TEXT_STYLE_DISPLAY_SMALL;
    public static final TextStyle TEXT_STYLE_TEXT_LARGE;
    public static final TextStyle TEXT_STYLE_TEXT_LARGE_BOLD;
    public static final TextStyle TEXT_STYLE_TEXT_MEDIUM;
    public static final TextStyle TEXT_STYLE_TEXT_MEDIUM_BOLD;
    public static final TextStyle TEXT_STYLE_TEXT_SMALL;
    public static final TextStyle TEXT_STYLE_TEXT_SMALL_BOLD;
    public static final TextStyle TEXT_STYLE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ TextStyle[] $values() {
        return new TextStyle[]{TEXT_STYLE_UNSPECIFIED, TEXT_STYLE_TEXT_SMALL, TEXT_STYLE_TEXT_SMALL_BOLD, TEXT_STYLE_TEXT_MEDIUM, TEXT_STYLE_TEXT_MEDIUM_BOLD, TEXT_STYLE_TEXT_LARGE, TEXT_STYLE_TEXT_LARGE_BOLD, TEXT_STYLE_DISPLAY_SMALL, TEXT_STYLE_DISPLAY_MEDIUM, TEXT_STYLE_DISPLAY_LARGE, TEXT_STYLE_BOOK_COVER_SMALL, TEXT_STYLE_BOOK_COVER_MEDIUM, TEXT_STYLE_BOOK_COVER_LARGE};
    }

    @JvmStatic
    public static final TextStyle fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<TextStyle> getEntries() {
        return $ENTRIES;
    }

    private TextStyle(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final TextStyle textStyle = new TextStyle("TEXT_STYLE_UNSPECIFIED", 0, 0);
        TEXT_STYLE_UNSPECIFIED = textStyle;
        TEXT_STYLE_TEXT_SMALL = new TextStyle("TEXT_STYLE_TEXT_SMALL", 1, 1);
        TEXT_STYLE_TEXT_SMALL_BOLD = new TextStyle("TEXT_STYLE_TEXT_SMALL_BOLD", 2, 2);
        TEXT_STYLE_TEXT_MEDIUM = new TextStyle("TEXT_STYLE_TEXT_MEDIUM", 3, 3);
        TEXT_STYLE_TEXT_MEDIUM_BOLD = new TextStyle("TEXT_STYLE_TEXT_MEDIUM_BOLD", 4, 4);
        TEXT_STYLE_TEXT_LARGE = new TextStyle("TEXT_STYLE_TEXT_LARGE", 5, 5);
        TEXT_STYLE_TEXT_LARGE_BOLD = new TextStyle("TEXT_STYLE_TEXT_LARGE_BOLD", 6, 6);
        TEXT_STYLE_DISPLAY_SMALL = new TextStyle("TEXT_STYLE_DISPLAY_SMALL", 7, 7);
        TEXT_STYLE_DISPLAY_MEDIUM = new TextStyle("TEXT_STYLE_DISPLAY_MEDIUM", 8, 8);
        TEXT_STYLE_DISPLAY_LARGE = new TextStyle("TEXT_STYLE_DISPLAY_LARGE", 9, 9);
        TEXT_STYLE_BOOK_COVER_SMALL = new TextStyle("TEXT_STYLE_BOOK_COVER_SMALL", 10, 10);
        TEXT_STYLE_BOOK_COVER_MEDIUM = new TextStyle("TEXT_STYLE_BOOK_COVER_MEDIUM", 11, 11);
        TEXT_STYLE_BOOK_COVER_LARGE = new TextStyle("TEXT_STYLE_BOOK_COVER_LARGE", 12, 12);
        TextStyle[] textStyleArr$values = $values();
        $VALUES = textStyleArr$values;
        $ENTRIES = EnumEntries2.enumEntries(textStyleArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TextStyle.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<TextStyle>(orCreateKotlinClass, syntax, textStyle) { // from class: rh_server_driven_ui.v1.TextStyle$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public TextStyle fromValue(int value) {
                return TextStyle.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: TextStyle.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/TextStyle$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/TextStyle;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final TextStyle fromValue(int value) {
            switch (value) {
                case 0:
                    return TextStyle.TEXT_STYLE_UNSPECIFIED;
                case 1:
                    return TextStyle.TEXT_STYLE_TEXT_SMALL;
                case 2:
                    return TextStyle.TEXT_STYLE_TEXT_SMALL_BOLD;
                case 3:
                    return TextStyle.TEXT_STYLE_TEXT_MEDIUM;
                case 4:
                    return TextStyle.TEXT_STYLE_TEXT_MEDIUM_BOLD;
                case 5:
                    return TextStyle.TEXT_STYLE_TEXT_LARGE;
                case 6:
                    return TextStyle.TEXT_STYLE_TEXT_LARGE_BOLD;
                case 7:
                    return TextStyle.TEXT_STYLE_DISPLAY_SMALL;
                case 8:
                    return TextStyle.TEXT_STYLE_DISPLAY_MEDIUM;
                case 9:
                    return TextStyle.TEXT_STYLE_DISPLAY_LARGE;
                case 10:
                    return TextStyle.TEXT_STYLE_BOOK_COVER_SMALL;
                case 11:
                    return TextStyle.TEXT_STYLE_BOOK_COVER_MEDIUM;
                case 12:
                    return TextStyle.TEXT_STYLE_BOOK_COVER_LARGE;
                default:
                    return null;
            }
        }
    }

    public static TextStyle valueOf(String str) {
        return (TextStyle) Enum.valueOf(TextStyle.class, str);
    }

    public static TextStyle[] values() {
        return (TextStyle[]) $VALUES.clone();
    }
}
