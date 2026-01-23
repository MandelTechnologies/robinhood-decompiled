package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext;
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
import okio.ByteString;

/* compiled from: OptionWatchlistAboutContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext;", "Lcom/squareup/wire/Message;", "", "source_type", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;Lokio/ByteString;)V", "getSource_type", "()Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "SourceType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class OptionWatchlistAboutContext extends Message {

    @JvmField
    public static final ProtoAdapter<OptionWatchlistAboutContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext$SourceType#ADAPTER", jsonName = "sourceType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final SourceType source_type;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionWatchlistAboutContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24439newBuilder();
    }

    public final SourceType getSource_type() {
        return this.source_type;
    }

    public /* synthetic */ OptionWatchlistAboutContext(SourceType sourceType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? SourceType.OTHER : sourceType, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OptionWatchlistAboutContext(SourceType source_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.source_type = source_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24439newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OptionWatchlistAboutContext)) {
            return false;
        }
        OptionWatchlistAboutContext optionWatchlistAboutContext = (OptionWatchlistAboutContext) other;
        return Intrinsics.areEqual(unknownFields(), optionWatchlistAboutContext.unknownFields()) && this.source_type == optionWatchlistAboutContext.source_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.source_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("source_type=" + this.source_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "OptionWatchlistAboutContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OptionWatchlistAboutContext copy$default(OptionWatchlistAboutContext optionWatchlistAboutContext, SourceType sourceType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            sourceType = optionWatchlistAboutContext.source_type;
        }
        if ((i & 2) != 0) {
            byteString = optionWatchlistAboutContext.unknownFields();
        }
        return optionWatchlistAboutContext.copy(sourceType, byteString);
    }

    public final OptionWatchlistAboutContext copy(SourceType source_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(source_type, "source_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OptionWatchlistAboutContext(source_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OptionWatchlistAboutContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<OptionWatchlistAboutContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(OptionWatchlistAboutContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getSource_type() != OptionWatchlistAboutContext.SourceType.OTHER ? size + OptionWatchlistAboutContext.SourceType.ADAPTER.encodedSizeWithTag(1, value.getSource_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, OptionWatchlistAboutContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getSource_type() != OptionWatchlistAboutContext.SourceType.OTHER) {
                    OptionWatchlistAboutContext.SourceType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, OptionWatchlistAboutContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getSource_type() != OptionWatchlistAboutContext.SourceType.OTHER) {
                    OptionWatchlistAboutContext.SourceType.ADAPTER.encodeWithTag(writer, 1, (int) value.getSource_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public OptionWatchlistAboutContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionWatchlistAboutContext.SourceType sourceTypeDecode = OptionWatchlistAboutContext.SourceType.OTHER;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new OptionWatchlistAboutContext(sourceTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            sourceTypeDecode = OptionWatchlistAboutContext.SourceType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public OptionWatchlistAboutContext redact(OptionWatchlistAboutContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return OptionWatchlistAboutContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: OptionWatchlistAboutContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "OTHER", "EMPTY_HUB", "DOUBLE_TAP_BOTTOM_SHEET", "INVESTMENT_PAGE_CARD", "MARKETING_EMAIL", "OPTION_CHAIN_PAGE", "PUSH_NOTIFICATION", "INBOX_MESSAGE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SourceType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ SourceType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<SourceType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final SourceType DOUBLE_TAP_BOTTOM_SHEET;
        public static final SourceType EMPTY_HUB;
        public static final SourceType INBOX_MESSAGE;
        public static final SourceType INVESTMENT_PAGE_CARD;
        public static final SourceType MARKETING_EMAIL;
        public static final SourceType OPTION_CHAIN_PAGE;
        public static final SourceType OTHER;
        public static final SourceType PUSH_NOTIFICATION;
        private final int value;

        private static final /* synthetic */ SourceType[] $values() {
            return new SourceType[]{OTHER, EMPTY_HUB, DOUBLE_TAP_BOTTOM_SHEET, INVESTMENT_PAGE_CARD, MARKETING_EMAIL, OPTION_CHAIN_PAGE, PUSH_NOTIFICATION, INBOX_MESSAGE};
        }

        @JvmStatic
        public static final SourceType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<SourceType> getEntries() {
            return $ENTRIES;
        }

        private SourceType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final SourceType sourceType = new SourceType("OTHER", 0, 0);
            OTHER = sourceType;
            EMPTY_HUB = new SourceType("EMPTY_HUB", 1, 1);
            DOUBLE_TAP_BOTTOM_SHEET = new SourceType("DOUBLE_TAP_BOTTOM_SHEET", 2, 2);
            INVESTMENT_PAGE_CARD = new SourceType("INVESTMENT_PAGE_CARD", 3, 3);
            MARKETING_EMAIL = new SourceType("MARKETING_EMAIL", 4, 4);
            OPTION_CHAIN_PAGE = new SourceType("OPTION_CHAIN_PAGE", 5, 5);
            PUSH_NOTIFICATION = new SourceType("PUSH_NOTIFICATION", 6, 6);
            INBOX_MESSAGE = new SourceType("INBOX_MESSAGE", 7, 7);
            SourceType[] sourceTypeArr$values = $values();
            $VALUES = sourceTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(sourceTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SourceType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<SourceType>(orCreateKotlinClass, syntax, sourceType) { // from class: com.robinhood.rosetta.eventlogging.OptionWatchlistAboutContext$SourceType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public OptionWatchlistAboutContext.SourceType fromValue(int value) {
                    return OptionWatchlistAboutContext.SourceType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: OptionWatchlistAboutContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/OptionWatchlistAboutContext$SourceType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final SourceType fromValue(int value) {
                switch (value) {
                    case 0:
                        return SourceType.OTHER;
                    case 1:
                        return SourceType.EMPTY_HUB;
                    case 2:
                        return SourceType.DOUBLE_TAP_BOTTOM_SHEET;
                    case 3:
                        return SourceType.INVESTMENT_PAGE_CARD;
                    case 4:
                        return SourceType.MARKETING_EMAIL;
                    case 5:
                        return SourceType.OPTION_CHAIN_PAGE;
                    case 6:
                        return SourceType.PUSH_NOTIFICATION;
                    case 7:
                        return SourceType.INBOX_MESSAGE;
                    default:
                        return null;
                }
            }
        }

        public static SourceType valueOf(String str) {
            return (SourceType) Enum.valueOf(SourceType.class, str);
        }

        public static SourceType[] values() {
            return (SourceType[]) $VALUES.clone();
        }
    }
}
