package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CryptoOrderMeta;
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

/* compiled from: CryptoOrderMeta.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0018\u0019B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta;", "Lcom/squareup/wire/Message;", "", "entry_type", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType;", "message", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType;Ljava/lang/String;Lokio/ByteString;)V", "getEntry_type", "()Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType;", "getMessage", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CryptoOrderMeta extends Message {

    @JvmField
    public static final ProtoAdapter<CryptoOrderMeta> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CryptoOrderMeta$EntryType#ADAPTER", jsonName = "entryType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 100)
    private final EntryType entry_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final String message;

    public CryptoOrderMeta() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24156newBuilder();
    }

    public final EntryType getEntry_type() {
        return this.entry_type;
    }

    public /* synthetic */ CryptoOrderMeta(EntryType entryType, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EntryType.ENTRY_TYPE_UNSPECIFIED : entryType, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CryptoOrderMeta(EntryType entry_type, String message, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_type = entry_type;
        this.message = message;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24156newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CryptoOrderMeta)) {
            return false;
        }
        CryptoOrderMeta cryptoOrderMeta = (CryptoOrderMeta) other;
        return Intrinsics.areEqual(unknownFields(), cryptoOrderMeta.unknownFields()) && this.entry_type == cryptoOrderMeta.entry_type && Intrinsics.areEqual(this.message, cryptoOrderMeta.message);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.entry_type.hashCode()) * 37) + this.message.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_type=" + this.entry_type);
        arrayList.add("message=" + Internal.sanitize(this.message));
        return CollectionsKt.joinToString$default(arrayList, ", ", "CryptoOrderMeta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CryptoOrderMeta copy$default(CryptoOrderMeta cryptoOrderMeta, EntryType entryType, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryType = cryptoOrderMeta.entry_type;
        }
        if ((i & 2) != 0) {
            str = cryptoOrderMeta.message;
        }
        if ((i & 4) != 0) {
            byteString = cryptoOrderMeta.unknownFields();
        }
        return cryptoOrderMeta.copy(entryType, str, byteString);
    }

    public final CryptoOrderMeta copy(EntryType entry_type, String message, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_type, "entry_type");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CryptoOrderMeta(entry_type, message, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CryptoOrderMeta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CryptoOrderMeta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderMeta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CryptoOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEntry_type() != CryptoOrderMeta.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    size += CryptoOrderMeta.EntryType.ADAPTER.encodedSizeWithTag(100, value.getEntry_type());
                }
                return !Intrinsics.areEqual(value.getMessage(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getMessage()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CryptoOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEntry_type() != CryptoOrderMeta.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CryptoOrderMeta.EntryType.ADAPTER.encodeWithTag(writer, 100, (int) value.getEntry_type());
                }
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CryptoOrderMeta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getMessage());
                }
                if (value.getEntry_type() != CryptoOrderMeta.EntryType.ENTRY_TYPE_UNSPECIFIED) {
                    CryptoOrderMeta.EntryType.ADAPTER.encodeWithTag(writer, 100, (int) value.getEntry_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderMeta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CryptoOrderMeta.EntryType entryTypeDecode = CryptoOrderMeta.EntryType.ENTRY_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CryptoOrderMeta(entryTypeDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 100) {
                        try {
                            entryTypeDecode = CryptoOrderMeta.EntryType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CryptoOrderMeta redact(CryptoOrderMeta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CryptoOrderMeta.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CryptoOrderMeta.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_TYPE_UNSPECIFIED", "ASSET", "QUOTE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryType> ADAPTER;
        public static final EntryType ASSET;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryType ENTRY_TYPE_UNSPECIFIED;
        public static final EntryType QUOTE;
        private final int value;

        private static final /* synthetic */ EntryType[] $values() {
            return new EntryType[]{ENTRY_TYPE_UNSPECIFIED, ASSET, QUOTE};
        }

        @JvmStatic
        public static final EntryType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryType> getEntries() {
            return $ENTRIES;
        }

        private EntryType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryType entryType = new EntryType("ENTRY_TYPE_UNSPECIFIED", 0, 0);
            ENTRY_TYPE_UNSPECIFIED = entryType;
            ASSET = new EntryType("ASSET", 1, 1);
            QUOTE = new EntryType("QUOTE", 2, 2);
            EntryType[] entryTypeArr$values = $values();
            $VALUES = entryTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryType>(orCreateKotlinClass, syntax, entryType) { // from class: com.robinhood.rosetta.eventlogging.CryptoOrderMeta$EntryType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CryptoOrderMeta.EntryType fromValue(int value) {
                    return CryptoOrderMeta.EntryType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CryptoOrderMeta.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CryptoOrderMeta$EntryType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryType fromValue(int value) {
                if (value == 0) {
                    return EntryType.ENTRY_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return EntryType.ASSET;
                }
                if (value != 2) {
                    return null;
                }
                return EntryType.QUOTE;
            }
        }

        public static EntryType valueOf(String str) {
            return (EntryType) Enum.valueOf(EntryType.class, str);
        }

        public static EntryType[] values() {
            return (EntryType[]) $VALUES.clone();
        }
    }
}
