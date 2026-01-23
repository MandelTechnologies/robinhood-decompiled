package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.IAVContext;
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

/* compiled from: IAVContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IAVContext;", "Lcom/squareup/wire/Message;", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint;", "session_id", "", "token_type", "Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType;Lokio/ByteString;)V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint;", "getSession_id", "()Ljava/lang/String;", "getToken_type", "()Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryPoint", "TokenType", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IAVContext extends Message {

    @JvmField
    public static final ProtoAdapter<IAVContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.IAVContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 2)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final String session_id;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.IAVContext$TokenType#ADAPTER", jsonName = "tokenType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TokenType token_type;

    public IAVContext() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24306newBuilder();
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public /* synthetic */ IAVContext(EntryPoint entryPoint, String str, TokenType tokenType, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EntryPoint.ENTRY_POINT_TYPE_UNKNOWN : entryPoint, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? TokenType.TOKEN_TYPE_UNKNOWN : tokenType, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getSession_id() {
        return this.session_id;
    }

    public final TokenType getToken_type() {
        return this.token_type;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IAVContext(EntryPoint entry_point, String session_id, TokenType token_type, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entry_point = entry_point;
        this.session_id = session_id;
        this.token_type = token_type;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24306newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IAVContext)) {
            return false;
        }
        IAVContext iAVContext = (IAVContext) other;
        return Intrinsics.areEqual(unknownFields(), iAVContext.unknownFields()) && this.entry_point == iAVContext.entry_point && Intrinsics.areEqual(this.session_id, iAVContext.session_id) && this.token_type == iAVContext.token_type;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.entry_point.hashCode()) * 37) + this.session_id.hashCode()) * 37) + this.token_type.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("session_id=" + Internal.sanitize(this.session_id));
        arrayList.add("token_type=" + this.token_type);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IAVContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IAVContext copy$default(IAVContext iAVContext, EntryPoint entryPoint, String str, TokenType tokenType, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPoint = iAVContext.entry_point;
        }
        if ((i & 2) != 0) {
            str = iAVContext.session_id;
        }
        if ((i & 4) != 0) {
            tokenType = iAVContext.token_type;
        }
        if ((i & 8) != 0) {
            byteString = iAVContext.unknownFields();
        }
        return iAVContext.copy(entryPoint, str, tokenType, byteString);
    }

    public final IAVContext copy(EntryPoint entry_point, String session_id, TokenType token_type, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(session_id, "session_id");
        Intrinsics.checkNotNullParameter(token_type, "token_type");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IAVContext(entry_point, session_id, token_type, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IAVContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IAVContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IAVContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IAVContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEntry_point() != IAVContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    size += IAVContext.EntryPoint.ADAPTER.encodedSizeWithTag(2, value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getSession_id());
                }
                return value.getToken_type() != IAVContext.TokenType.TOKEN_TYPE_UNKNOWN ? size + IAVContext.TokenType.ADAPTER.encodedSizeWithTag(3, value.getToken_type()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IAVContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEntry_point() != IAVContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    IAVContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
                }
                if (value.getToken_type() != IAVContext.TokenType.TOKEN_TYPE_UNKNOWN) {
                    IAVContext.TokenType.ADAPTER.encodeWithTag(writer, 3, (int) value.getToken_type());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IAVContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getToken_type() != IAVContext.TokenType.TOKEN_TYPE_UNKNOWN) {
                    IAVContext.TokenType.ADAPTER.encodeWithTag(writer, 3, (int) value.getToken_type());
                }
                if (!Intrinsics.areEqual(value.getSession_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getSession_id());
                }
                if (value.getEntry_point() != IAVContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN) {
                    IAVContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IAVContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                IAVContext.EntryPoint entryPointDecode = IAVContext.EntryPoint.ENTRY_POINT_TYPE_UNKNOWN;
                IAVContext.TokenType tokenTypeDecode = IAVContext.TokenType.TOKEN_TYPE_UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IAVContext(entryPointDecode, strDecode, tokenTypeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            entryPointDecode = IAVContext.EntryPoint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            tokenTypeDecode = IAVContext.TokenType.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IAVContext redact(IAVContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IAVContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \u000b2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_TYPE_UNKNOWN", "FIRST_TRADE_RECOMMENDATION", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_TYPE_UNKNOWN;
        public static final EntryPoint FIRST_TRADE_RECOMMENDATION;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_TYPE_UNKNOWN, FIRST_TRADE_RECOMMENDATION};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_TYPE_UNKNOWN", 0, 0);
            ENTRY_POINT_TYPE_UNKNOWN = entryPoint;
            FIRST_TRADE_RECOMMENDATION = new EntryPoint("FIRST_TRADE_RECOMMENDATION", 1, 1);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.IAVContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public IAVContext.EntryPoint fromValue(int value) {
                    return IAVContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: IAVContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/IAVContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                if (value == 0) {
                    return EntryPoint.ENTRY_POINT_TYPE_UNKNOWN;
                }
                if (value != 1) {
                    return null;
                }
                return EntryPoint.FIRST_TRADE_RECOMMENDATION;
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: IAVContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "TOKEN_TYPE_UNKNOWN", "LINK_TOKEN", "PUBLIC_KEY", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class TokenType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ TokenType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<TokenType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final TokenType LINK_TOKEN;
        public static final TokenType PUBLIC_KEY;
        public static final TokenType TOKEN_TYPE_UNKNOWN;
        private final int value;

        private static final /* synthetic */ TokenType[] $values() {
            return new TokenType[]{TOKEN_TYPE_UNKNOWN, LINK_TOKEN, PUBLIC_KEY};
        }

        @JvmStatic
        public static final TokenType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<TokenType> getEntries() {
            return $ENTRIES;
        }

        private TokenType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final TokenType tokenType = new TokenType("TOKEN_TYPE_UNKNOWN", 0, 0);
            TOKEN_TYPE_UNKNOWN = tokenType;
            LINK_TOKEN = new TokenType("LINK_TOKEN", 1, 1);
            PUBLIC_KEY = new TokenType("PUBLIC_KEY", 2, 2);
            TokenType[] tokenTypeArr$values = $values();
            $VALUES = tokenTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(tokenTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TokenType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<TokenType>(orCreateKotlinClass, syntax, tokenType) { // from class: com.robinhood.rosetta.eventlogging.IAVContext$TokenType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public IAVContext.TokenType fromValue(int value) {
                    return IAVContext.TokenType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: IAVContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/IAVContext$TokenType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final TokenType fromValue(int value) {
                if (value == 0) {
                    return TokenType.TOKEN_TYPE_UNKNOWN;
                }
                if (value == 1) {
                    return TokenType.LINK_TOKEN;
                }
                if (value != 2) {
                    return null;
                }
                return TokenType.PUBLIC_KEY;
            }
        }

        public static TokenType valueOf(String str) {
            return (TokenType) Enum.valueOf(TokenType.class, str);
        }

        public static TokenType[] values() {
            return (TokenType[]) $VALUES.clone();
        }
    }
}
