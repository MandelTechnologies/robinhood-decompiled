package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag;
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
import okio.ByteString;

/* compiled from: SafetyLabelInfoTag.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001a\u001bB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag;", "Lcom/squareup/wire/Message;", "", "title", "", "info_tag_type", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "logging_identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;Ljava/lang/String;Lokio/ByteString;)V", "getTitle", "()Ljava/lang/String;", "getInfo_tag_type", "()Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "getLogging_identifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "InfoTagType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SafetyLabelInfoTag extends Message {

    @JvmField
    public static final ProtoAdapter<SafetyLabelInfoTag> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag$InfoTagType#ADAPTER", jsonName = "infoTagType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InfoTagType info_tag_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "loggingIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String logging_identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String title;

    public SafetyLabelInfoTag() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ SafetyLabelInfoTag(String str, InfoTagType infoTagType, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? InfoTagType.INFO_TAG_TYPE_UNSPECIFIED : infoTagType, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24555newBuilder();
    }

    public final String getTitle() {
        return this.title;
    }

    public final InfoTagType getInfo_tag_type() {
        return this.info_tag_type;
    }

    public final String getLogging_identifier() {
        return this.logging_identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyLabelInfoTag(String title, InfoTagType info_tag_type, String logging_identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.title = title;
        this.info_tag_type = info_tag_type;
        this.logging_identifier = logging_identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24555newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SafetyLabelInfoTag)) {
            return false;
        }
        SafetyLabelInfoTag safetyLabelInfoTag = (SafetyLabelInfoTag) other;
        return Intrinsics.areEqual(unknownFields(), safetyLabelInfoTag.unknownFields()) && Intrinsics.areEqual(this.title, safetyLabelInfoTag.title) && this.info_tag_type == safetyLabelInfoTag.info_tag_type && Intrinsics.areEqual(this.logging_identifier, safetyLabelInfoTag.logging_identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.title.hashCode()) * 37) + this.info_tag_type.hashCode()) * 37) + this.logging_identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("title=" + Internal.sanitize(this.title));
        arrayList.add("info_tag_type=" + this.info_tag_type);
        arrayList.add("logging_identifier=" + Internal.sanitize(this.logging_identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "SafetyLabelInfoTag{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SafetyLabelInfoTag copy$default(SafetyLabelInfoTag safetyLabelInfoTag, String str, InfoTagType infoTagType, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = safetyLabelInfoTag.title;
        }
        if ((i & 2) != 0) {
            infoTagType = safetyLabelInfoTag.info_tag_type;
        }
        if ((i & 4) != 0) {
            str2 = safetyLabelInfoTag.logging_identifier;
        }
        if ((i & 8) != 0) {
            byteString = safetyLabelInfoTag.unknownFields();
        }
        return safetyLabelInfoTag.copy(str, infoTagType, str2, byteString);
    }

    public final SafetyLabelInfoTag copy(String title, InfoTagType info_tag_type, String logging_identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(info_tag_type, "info_tag_type");
        Intrinsics.checkNotNullParameter(logging_identifier, "logging_identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SafetyLabelInfoTag(title, info_tag_type, logging_identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SafetyLabelInfoTag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SafetyLabelInfoTag>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SafetyLabelInfoTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getTitle());
                }
                if (value.getInfo_tag_type() != SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED) {
                    size += SafetyLabelInfoTag.InfoTagType.ADAPTER.encodedSizeWithTag(2, value.getInfo_tag_type());
                }
                return !Intrinsics.areEqual(value.getLogging_identifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getLogging_identifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SafetyLabelInfoTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getTitle(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
                }
                if (value.getInfo_tag_type() != SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED) {
                    SafetyLabelInfoTag.InfoTagType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag_type());
                }
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SafetyLabelInfoTag value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getLogging_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getLogging_identifier());
                }
                if (value.getInfo_tag_type() != SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED) {
                    SafetyLabelInfoTag.InfoTagType.ADAPTER.encodeWithTag(writer, 2, (int) value.getInfo_tag_type());
                }
                if (Intrinsics.areEqual(value.getTitle(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getTitle());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SafetyLabelInfoTag decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SafetyLabelInfoTag.InfoTagType infoTagTypeDecode = SafetyLabelInfoTag.InfoTagType.INFO_TAG_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SafetyLabelInfoTag(strDecode, infoTagTypeDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            infoTagTypeDecode = SafetyLabelInfoTag.InfoTagType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SafetyLabelInfoTag redact(SafetyLabelInfoTag value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SafetyLabelInfoTag.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SafetyLabelInfoTag.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "INFO_TAG_TYPE_UNSPECIFIED", "INFO_TAG_TYPE_ALERT", "INFO_TAG_TYPE_INFORM", "INFO_TAG_TYPE_INLINE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InfoTagType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ InfoTagType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<InfoTagType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final InfoTagType INFO_TAG_TYPE_ALERT;
        public static final InfoTagType INFO_TAG_TYPE_INFORM;
        public static final InfoTagType INFO_TAG_TYPE_INLINE;
        public static final InfoTagType INFO_TAG_TYPE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ InfoTagType[] $values() {
            return new InfoTagType[]{INFO_TAG_TYPE_UNSPECIFIED, INFO_TAG_TYPE_ALERT, INFO_TAG_TYPE_INFORM, INFO_TAG_TYPE_INLINE};
        }

        @JvmStatic
        public static final InfoTagType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<InfoTagType> getEntries() {
            return $ENTRIES;
        }

        private InfoTagType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final InfoTagType infoTagType = new InfoTagType("INFO_TAG_TYPE_UNSPECIFIED", 0, 0);
            INFO_TAG_TYPE_UNSPECIFIED = infoTagType;
            INFO_TAG_TYPE_ALERT = new InfoTagType("INFO_TAG_TYPE_ALERT", 1, 1);
            INFO_TAG_TYPE_INFORM = new InfoTagType("INFO_TAG_TYPE_INFORM", 2, 2);
            INFO_TAG_TYPE_INLINE = new InfoTagType("INFO_TAG_TYPE_INLINE", 3, 3);
            InfoTagType[] infoTagTypeArr$values = $values();
            $VALUES = infoTagTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(infoTagTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InfoTagType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<InfoTagType>(orCreateKotlinClass, syntax, infoTagType) { // from class: com.robinhood.rosetta.eventlogging.SafetyLabelInfoTag$InfoTagType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SafetyLabelInfoTag.InfoTagType fromValue(int value) {
                    return SafetyLabelInfoTag.InfoTagType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SafetyLabelInfoTag.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SafetyLabelInfoTag$InfoTagType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final InfoTagType fromValue(int value) {
                if (value == 0) {
                    return InfoTagType.INFO_TAG_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return InfoTagType.INFO_TAG_TYPE_ALERT;
                }
                if (value == 2) {
                    return InfoTagType.INFO_TAG_TYPE_INFORM;
                }
                if (value != 3) {
                    return null;
                }
                return InfoTagType.INFO_TAG_TYPE_INLINE;
            }
        }

        public static InfoTagType valueOf(String str) {
            return (InfoTagType) Enum.valueOf(InfoTagType.class, str);
        }

        public static InfoTagType[] values() {
            return (InfoTagType[]) $VALUES.clone();
        }
    }
}
