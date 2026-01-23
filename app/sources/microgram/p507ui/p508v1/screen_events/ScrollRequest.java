package microgram.p507ui.p508v1.screen_events;

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
import com.squareup.wire.internal.Internal;
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
import microgram.p507ui.p508v1.screen_events.ScrollRequest;
import okio.ByteString;

/* compiled from: ScrollRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ScrollRequest;", "Lcom/squareup/wire/Message;", "", "identifier", "", "alignment", "Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getAlignment", "()Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Alignment", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class ScrollRequest extends Message {

    @JvmField
    public static final ProtoAdapter<ScrollRequest> ADAPTER;

    @WireField(adapter = "microgram.ui.v1.screen_events.ScrollRequest$Alignment#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Alignment alignment;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String identifier;

    public ScrollRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29309newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ ScrollRequest(String str, Alignment alignment, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? Alignment.ALIGNMENT_UNSPECIFIED : alignment, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Alignment getAlignment() {
        return this.alignment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScrollRequest(String identifier, Alignment alignment, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = identifier;
        this.alignment = alignment;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29309newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ScrollRequest)) {
            return false;
        }
        ScrollRequest scrollRequest = (ScrollRequest) other;
        return Intrinsics.areEqual(unknownFields(), scrollRequest.unknownFields()) && Intrinsics.areEqual(this.identifier, scrollRequest.identifier) && this.alignment == scrollRequest.alignment;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.identifier.hashCode()) * 37) + this.alignment.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("alignment=" + this.alignment);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ScrollRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ScrollRequest copy$default(ScrollRequest scrollRequest, String str, Alignment alignment, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = scrollRequest.identifier;
        }
        if ((i & 2) != 0) {
            alignment = scrollRequest.alignment;
        }
        if ((i & 4) != 0) {
            byteString = scrollRequest.unknownFields();
        }
        return scrollRequest.copy(str, alignment, byteString);
    }

    public final ScrollRequest copy(String identifier, Alignment alignment, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ScrollRequest(identifier, alignment, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ScrollRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ScrollRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: microgram.ui.v1.screen_events.ScrollRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ScrollRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
                }
                return value.getAlignment() != ScrollRequest.Alignment.ALIGNMENT_UNSPECIFIED ? size + ScrollRequest.Alignment.ADAPTER.encodedSizeWithTag(2, value.getAlignment()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ScrollRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }
                if (value.getAlignment() != ScrollRequest.Alignment.ALIGNMENT_UNSPECIFIED) {
                    ScrollRequest.Alignment.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlignment());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ScrollRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAlignment() != ScrollRequest.Alignment.ALIGNMENT_UNSPECIFIED) {
                    ScrollRequest.Alignment.ADAPTER.encodeWithTag(writer, 2, (int) value.getAlignment());
                }
                if (Intrinsics.areEqual(value.getIdentifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScrollRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ScrollRequest.Alignment alignmentDecode = ScrollRequest.Alignment.ALIGNMENT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ScrollRequest(strDecode, alignmentDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            alignmentDecode = ScrollRequest.Alignment.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ScrollRequest redact(ScrollRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ScrollRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ScrollRequest.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ALIGNMENT_UNSPECIFIED", "ALIGNMENT_TOP", "ALIGNMENT_CENTER", "ALIGNMENT_BOTTOM", "Companion", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Alignment implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Alignment[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Alignment> ADAPTER;
        public static final Alignment ALIGNMENT_BOTTOM;
        public static final Alignment ALIGNMENT_CENTER;
        public static final Alignment ALIGNMENT_TOP;
        public static final Alignment ALIGNMENT_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ Alignment[] $values() {
            return new Alignment[]{ALIGNMENT_UNSPECIFIED, ALIGNMENT_TOP, ALIGNMENT_CENTER, ALIGNMENT_BOTTOM};
        }

        @JvmStatic
        public static final Alignment fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Alignment> getEntries() {
            return $ENTRIES;
        }

        private Alignment(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Alignment alignment = new Alignment("ALIGNMENT_UNSPECIFIED", 0, 0);
            ALIGNMENT_UNSPECIFIED = alignment;
            ALIGNMENT_TOP = new Alignment("ALIGNMENT_TOP", 1, 1);
            ALIGNMENT_CENTER = new Alignment("ALIGNMENT_CENTER", 2, 2);
            ALIGNMENT_BOTTOM = new Alignment("ALIGNMENT_BOTTOM", 3, 3);
            Alignment[] alignmentArr$values = $values();
            $VALUES = alignmentArr$values;
            $ENTRIES = EnumEntries2.enumEntries(alignmentArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Alignment.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Alignment>(orCreateKotlinClass, syntax, alignment) { // from class: microgram.ui.v1.screen_events.ScrollRequest$Alignment$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ScrollRequest.Alignment fromValue(int value) {
                    return ScrollRequest.Alignment.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ScrollRequest.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lmicrogram/ui/v1/screen_events/ScrollRequest$Alignment;", "fromValue", "value", "", "microgram.ui.v1.screen_events_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Alignment fromValue(int value) {
                if (value == 0) {
                    return Alignment.ALIGNMENT_UNSPECIFIED;
                }
                if (value == 1) {
                    return Alignment.ALIGNMENT_TOP;
                }
                if (value == 2) {
                    return Alignment.ALIGNMENT_CENTER;
                }
                if (value != 3) {
                    return null;
                }
                return Alignment.ALIGNMENT_BOTTOM;
            }
        }

        public static Alignment valueOf(String str) {
            return (Alignment) Enum.valueOf(Alignment.class, str);
        }

        public static Alignment[] values() {
            return (Alignment[]) $VALUES.clone();
        }
    }
}
