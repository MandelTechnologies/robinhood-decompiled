package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CatpayClient;
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

/* compiled from: CatpayClient.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u001c\u001d\u001eB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClient;", "Lcom/squareup/wire/Message;", "", "user_agent", "", "platform", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "viewport", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;Lokio/ByteString;)V", "getUser_agent", "()Ljava/lang/String;", "getPlatform", "()Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "getViewport", "()Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "CatpayClientPlatform", "CatpayClientViewport", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayClient extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayClient> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayClient$CatpayClientPlatform#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CatpayClientPlatform platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_agent;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayClient$CatpayClientViewport#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CatpayClientViewport viewport;

    public CatpayClient() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24048newBuilder();
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public /* synthetic */ CatpayClient(String str, CatpayClientPlatform catpayClientPlatform, CatpayClientViewport catpayClientViewport, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED : catpayClientPlatform, (i & 4) != 0 ? CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED : catpayClientViewport, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CatpayClientPlatform getPlatform() {
        return this.platform;
    }

    public final CatpayClientViewport getViewport() {
        return this.viewport;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayClient(String user_agent, CatpayClientPlatform platform, CatpayClientViewport viewport, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_agent = user_agent;
        this.platform = platform;
        this.viewport = viewport;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24048newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayClient)) {
            return false;
        }
        CatpayClient catpayClient = (CatpayClient) other;
        return Intrinsics.areEqual(unknownFields(), catpayClient.unknownFields()) && Intrinsics.areEqual(this.user_agent, catpayClient.user_agent) && this.platform == catpayClient.platform && this.viewport == catpayClient.viewport;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.user_agent.hashCode()) * 37) + this.platform.hashCode()) * 37) + this.viewport.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        arrayList.add("platform=" + this.platform);
        arrayList.add("viewport=" + this.viewport);
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayClient{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CatpayClient copy$default(CatpayClient catpayClient, String str, CatpayClientPlatform catpayClientPlatform, CatpayClientViewport catpayClientViewport, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = catpayClient.user_agent;
        }
        if ((i & 2) != 0) {
            catpayClientPlatform = catpayClient.platform;
        }
        if ((i & 4) != 0) {
            catpayClientViewport = catpayClient.viewport;
        }
        if ((i & 8) != 0) {
            byteString = catpayClient.unknownFields();
        }
        return catpayClient.copy(str, catpayClientPlatform, catpayClientViewport, byteString);
    }

    public final CatpayClient copy(String user_agent, CatpayClientPlatform platform, CatpayClientViewport viewport, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(viewport, "viewport");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayClient(user_agent, platform, viewport, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayClient.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayClient>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayClient$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayClient value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_agent());
                }
                if (value.getPlatform() != CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED) {
                    size += CatpayClient.CatpayClientPlatform.ADAPTER.encodedSizeWithTag(2, value.getPlatform());
                }
                return value.getViewport() != CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED ? size + CatpayClient.CatpayClientViewport.ADAPTER.encodedSizeWithTag(3, value.getViewport()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayClient value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_agent());
                }
                if (value.getPlatform() != CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED) {
                    CatpayClient.CatpayClientPlatform.ADAPTER.encodeWithTag(writer, 2, (int) value.getPlatform());
                }
                if (value.getViewport() != CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED) {
                    CatpayClient.CatpayClientViewport.ADAPTER.encodeWithTag(writer, 3, (int) value.getViewport());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayClient value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getViewport() != CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED) {
                    CatpayClient.CatpayClientViewport.ADAPTER.encodeWithTag(writer, 3, (int) value.getViewport());
                }
                if (value.getPlatform() != CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED) {
                    CatpayClient.CatpayClientPlatform.ADAPTER.encodeWithTag(writer, 2, (int) value.getPlatform());
                }
                if (Intrinsics.areEqual(value.getUser_agent(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_agent());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayClient decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                CatpayClient.CatpayClientPlatform catpayClientPlatformDecode = CatpayClient.CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED;
                CatpayClient.CatpayClientViewport catpayClientViewportDecode = CatpayClient.CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CatpayClient(strDecode, catpayClientPlatformDecode, catpayClientViewportDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            catpayClientPlatformDecode = CatpayClient.CatpayClientPlatform.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            catpayClientViewportDecode = CatpayClient.CatpayClientViewport.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayClient redact(CatpayClient value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return CatpayClient.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CATPAY_CLIENT_PLATFORM_UNSPECIFIED", "IOS_WEBVIEW", "ANDROID_WEBVIEW", "WEB", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayClientPlatform implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayClientPlatform[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CatpayClientPlatform> ADAPTER;
        public static final CatpayClientPlatform ANDROID_WEBVIEW;
        public static final CatpayClientPlatform CATPAY_CLIENT_PLATFORM_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CatpayClientPlatform IOS_WEBVIEW;
        public static final CatpayClientPlatform WEB;
        private final int value;

        private static final /* synthetic */ CatpayClientPlatform[] $values() {
            return new CatpayClientPlatform[]{CATPAY_CLIENT_PLATFORM_UNSPECIFIED, IOS_WEBVIEW, ANDROID_WEBVIEW, WEB};
        }

        @JvmStatic
        public static final CatpayClientPlatform fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CatpayClientPlatform> getEntries() {
            return $ENTRIES;
        }

        private CatpayClientPlatform(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CatpayClientPlatform catpayClientPlatform = new CatpayClientPlatform("CATPAY_CLIENT_PLATFORM_UNSPECIFIED", 0, 0);
            CATPAY_CLIENT_PLATFORM_UNSPECIFIED = catpayClientPlatform;
            IOS_WEBVIEW = new CatpayClientPlatform("IOS_WEBVIEW", 1, 1);
            ANDROID_WEBVIEW = new CatpayClientPlatform("ANDROID_WEBVIEW", 2, 2);
            WEB = new CatpayClientPlatform("WEB", 3, 3);
            CatpayClientPlatform[] catpayClientPlatformArr$values = $values();
            $VALUES = catpayClientPlatformArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayClientPlatformArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayClientPlatform.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CatpayClientPlatform>(orCreateKotlinClass, syntax, catpayClientPlatform) { // from class: com.robinhood.rosetta.eventlogging.CatpayClient$CatpayClientPlatform$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayClient.CatpayClientPlatform fromValue(int value) {
                    return CatpayClient.CatpayClientPlatform.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayClient.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientPlatform;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CatpayClientPlatform fromValue(int value) {
                if (value == 0) {
                    return CatpayClientPlatform.CATPAY_CLIENT_PLATFORM_UNSPECIFIED;
                }
                if (value == 1) {
                    return CatpayClientPlatform.IOS_WEBVIEW;
                }
                if (value == 2) {
                    return CatpayClientPlatform.ANDROID_WEBVIEW;
                }
                if (value != 3) {
                    return null;
                }
                return CatpayClientPlatform.WEB;
            }
        }

        public static CatpayClientPlatform valueOf(String str) {
            return (CatpayClientPlatform) Enum.valueOf(CatpayClientPlatform.class, str);
        }

        public static CatpayClientPlatform[] values() {
            return (CatpayClientPlatform[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatpayClient.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CATPAY_CLIENT_VIEW_UNSPECIFIED", "DESKTOP", "MOBILE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayClientViewport implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CatpayClientViewport[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CatpayClientViewport> ADAPTER;
        public static final CatpayClientViewport CATPAY_CLIENT_VIEW_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CatpayClientViewport DESKTOP;
        public static final CatpayClientViewport MOBILE;
        private final int value;

        private static final /* synthetic */ CatpayClientViewport[] $values() {
            return new CatpayClientViewport[]{CATPAY_CLIENT_VIEW_UNSPECIFIED, DESKTOP, MOBILE};
        }

        @JvmStatic
        public static final CatpayClientViewport fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CatpayClientViewport> getEntries() {
            return $ENTRIES;
        }

        private CatpayClientViewport(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CatpayClientViewport catpayClientViewport = new CatpayClientViewport("CATPAY_CLIENT_VIEW_UNSPECIFIED", 0, 0);
            CATPAY_CLIENT_VIEW_UNSPECIFIED = catpayClientViewport;
            DESKTOP = new CatpayClientViewport("DESKTOP", 1, 1);
            MOBILE = new CatpayClientViewport("MOBILE", 2, 2);
            CatpayClientViewport[] catpayClientViewportArr$values = $values();
            $VALUES = catpayClientViewportArr$values;
            $ENTRIES = EnumEntries2.enumEntries(catpayClientViewportArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayClientViewport.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CatpayClientViewport>(orCreateKotlinClass, syntax, catpayClientViewport) { // from class: com.robinhood.rosetta.eventlogging.CatpayClient$CatpayClientViewport$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public CatpayClient.CatpayClientViewport fromValue(int value) {
                    return CatpayClient.CatpayClientViewport.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: CatpayClient.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/CatpayClient$CatpayClientViewport;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CatpayClientViewport fromValue(int value) {
                if (value == 0) {
                    return CatpayClientViewport.CATPAY_CLIENT_VIEW_UNSPECIFIED;
                }
                if (value == 1) {
                    return CatpayClientViewport.DESKTOP;
                }
                if (value != 2) {
                    return null;
                }
                return CatpayClientViewport.MOBILE;
            }
        }

        public static CatpayClientViewport valueOf(String str) {
            return (CatpayClientViewport) Enum.valueOf(CatpayClientViewport.class, str);
        }

        public static CatpayClientViewport[] values() {
            return (CatpayClientViewport[]) $VALUES.clone();
        }
    }
}
