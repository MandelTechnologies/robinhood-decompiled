package microgram.p507ui.p508v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import microgram.p507ui.p508v1.Theme;
import okio.ByteString;

/* compiled from: Theme.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lmicrogram/ui/v1/Theme;", "Lcom/squareup/wire/Message;", "", "common", "Lmicrogram/ui/v1/Theme$CommonTheme;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmicrogram/ui/v1/Theme$CommonTheme;Lokio/ByteString;)V", "getCommon", "()Lmicrogram/ui/v1/Theme$CommonTheme;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CommonTheme", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class Theme extends Message {

    @JvmField
    public static final ProtoAdapter<Theme> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.Theme$CommonTheme#ADAPTER", oneofName = "concrete", schemaIndex = 0, tag = 1)
    private final CommonTheme common;

    /* JADX WARN: Multi-variable type inference failed */
    public Theme() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29300newBuilder();
    }

    public final CommonTheme getCommon() {
        return this.common;
    }

    public /* synthetic */ Theme(CommonTheme commonTheme, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : commonTheme, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Theme(CommonTheme commonTheme, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.common = commonTheme;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29300newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Theme)) {
            return false;
        }
        Theme theme = (Theme) other;
        return Intrinsics.areEqual(unknownFields(), theme.unknownFields()) && this.common == theme.common;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CommonTheme commonTheme = this.common;
        int iHashCode2 = iHashCode + (commonTheme != null ? commonTheme.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CommonTheme commonTheme = this.common;
        if (commonTheme != null) {
            arrayList.add("common=" + commonTheme);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Theme{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Theme copy$default(Theme theme, CommonTheme commonTheme, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            commonTheme = theme.common;
        }
        if ((i & 2) != 0) {
            byteString = theme.unknownFields();
        }
        return theme.copy(commonTheme, byteString);
    }

    public final Theme copy(CommonTheme common2, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Theme(common2, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Theme.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Theme>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.Theme$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Theme value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Theme.CommonTheme.ADAPTER.encodedSizeWithTag(1, value.getCommon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Theme value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Theme.CommonTheme.ADAPTER.encodeWithTag(writer, 1, (int) value.getCommon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Theme value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Theme.CommonTheme.ADAPTER.encodeWithTag(writer, 1, (int) value.getCommon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Theme redact(Theme value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Theme.copy$default(value, null, ByteString.EMPTY, 1, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Theme decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Theme.CommonTheme commonThemeDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Theme(commonThemeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            commonThemeDecode = Theme.CommonTheme.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Theme.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lmicrogram/ui/v1/Theme$CommonTheme;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "THEME_UNSPECIFIED", "THEME_DEFAULT", "THEME_ACHROMATIC", "THEME_CRYPTO", "THEME_LIGHT", "THEME_DARK", "THEME_DARK_ACHROMATIC", "THEME_LIGHT_ACHROMATIC", "Companion", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes14.dex */
    public static final class CommonTheme implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CommonTheme[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CommonTheme> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CommonTheme THEME_ACHROMATIC;
        public static final CommonTheme THEME_CRYPTO;
        public static final CommonTheme THEME_DARK;
        public static final CommonTheme THEME_DARK_ACHROMATIC;
        public static final CommonTheme THEME_DEFAULT;
        public static final CommonTheme THEME_LIGHT;
        public static final CommonTheme THEME_LIGHT_ACHROMATIC;
        public static final CommonTheme THEME_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ CommonTheme[] $values() {
            return new CommonTheme[]{THEME_UNSPECIFIED, THEME_DEFAULT, THEME_ACHROMATIC, THEME_CRYPTO, THEME_LIGHT, THEME_DARK, THEME_DARK_ACHROMATIC, THEME_LIGHT_ACHROMATIC};
        }

        @JvmStatic
        public static final CommonTheme fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CommonTheme> getEntries() {
            return $ENTRIES;
        }

        private CommonTheme(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CommonTheme commonTheme = new CommonTheme("THEME_UNSPECIFIED", 0, 0);
            THEME_UNSPECIFIED = commonTheme;
            THEME_DEFAULT = new CommonTheme("THEME_DEFAULT", 1, 1);
            THEME_ACHROMATIC = new CommonTheme("THEME_ACHROMATIC", 2, 2);
            THEME_CRYPTO = new CommonTheme("THEME_CRYPTO", 3, 3);
            THEME_LIGHT = new CommonTheme("THEME_LIGHT", 4, 4);
            THEME_DARK = new CommonTheme("THEME_DARK", 5, 5);
            THEME_DARK_ACHROMATIC = new CommonTheme("THEME_DARK_ACHROMATIC", 6, 6);
            THEME_LIGHT_ACHROMATIC = new CommonTheme("THEME_LIGHT_ACHROMATIC", 7, 7);
            CommonTheme[] commonThemeArr$values = $values();
            $VALUES = commonThemeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(commonThemeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CommonTheme.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CommonTheme>(orCreateKotlinClass, syntax, commonTheme) { // from class: microgram.ui.v1.Theme$CommonTheme$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Theme.CommonTheme fromValue(int value) {
                    return Theme.CommonTheme.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Theme.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/ui/v1/Theme$CommonTheme$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/ui/v1/Theme$CommonTheme;", "fromValue", "value", "", "microgram.ui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CommonTheme fromValue(int value) {
                switch (value) {
                    case 0:
                        return CommonTheme.THEME_UNSPECIFIED;
                    case 1:
                        return CommonTheme.THEME_DEFAULT;
                    case 2:
                        return CommonTheme.THEME_ACHROMATIC;
                    case 3:
                        return CommonTheme.THEME_CRYPTO;
                    case 4:
                        return CommonTheme.THEME_LIGHT;
                    case 5:
                        return CommonTheme.THEME_DARK;
                    case 6:
                        return CommonTheme.THEME_DARK_ACHROMATIC;
                    case 7:
                        return CommonTheme.THEME_LIGHT_ACHROMATIC;
                    default:
                        return null;
                }
            }
        }

        public static CommonTheme valueOf(String str) {
            return (CommonTheme) Enum.valueOf(CommonTheme.class, str);
        }

        public static CommonTheme[] values() {
            return (CommonTheme[]) $VALUES.clone();
        }
    }
}
