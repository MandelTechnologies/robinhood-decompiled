package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: EmailEventData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eBM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JL\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\u00042\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u0016\u0010\t\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/EmailEventData;", "Lcom/squareup/wire/Message;", "", "email_address", "", "email_category", "test_version", "uuid", "user_agent", "masked_email_address", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getEmail_address", "()Ljava/lang/String;", "getEmail_category", "getTest_version", "getUuid", "getUser_agent", "getMasked_email_address", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class EmailEventData extends Message {

    @JvmField
    public static final ProtoAdapter<EmailEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String email_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "emailCategory", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String email_category;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedEmailAddress", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 1001)
    private final String masked_email_address;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "testVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String test_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userAgent", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String user_agent;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String uuid;

    public EmailEventData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    public /* synthetic */ EmailEventData(String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? "" : str6, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24239newBuilder();
    }

    public final String getEmail_address() {
        return this.email_address;
    }

    public final String getEmail_category() {
        return this.email_category;
    }

    public final String getTest_version() {
        return this.test_version;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public final String getUser_agent() {
        return this.user_agent;
    }

    public final String getMasked_email_address() {
        return this.masked_email_address;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailEventData(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.email_address = email_address;
        this.email_category = email_category;
        this.test_version = test_version;
        this.uuid = uuid;
        this.user_agent = user_agent;
        this.masked_email_address = masked_email_address;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24239newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EmailEventData)) {
            return false;
        }
        EmailEventData emailEventData = (EmailEventData) other;
        return Intrinsics.areEqual(unknownFields(), emailEventData.unknownFields()) && Intrinsics.areEqual(this.email_address, emailEventData.email_address) && Intrinsics.areEqual(this.email_category, emailEventData.email_category) && Intrinsics.areEqual(this.test_version, emailEventData.test_version) && Intrinsics.areEqual(this.uuid, emailEventData.uuid) && Intrinsics.areEqual(this.user_agent, emailEventData.user_agent) && Intrinsics.areEqual(this.masked_email_address, emailEventData.masked_email_address);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.email_address.hashCode()) * 37) + this.email_category.hashCode()) * 37) + this.test_version.hashCode()) * 37) + this.uuid.hashCode()) * 37) + this.user_agent.hashCode()) * 37) + this.masked_email_address.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("email_address=" + Internal.sanitize(this.email_address));
        arrayList.add("email_category=" + Internal.sanitize(this.email_category));
        arrayList.add("test_version=" + Internal.sanitize(this.test_version));
        arrayList.add("uuid=" + Internal.sanitize(this.uuid));
        arrayList.add("user_agent=" + Internal.sanitize(this.user_agent));
        arrayList.add("masked_email_address=" + Internal.sanitize(this.masked_email_address));
        return CollectionsKt.joinToString$default(arrayList, ", ", "EmailEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EmailEventData copy$default(EmailEventData emailEventData, String str, String str2, String str3, String str4, String str5, String str6, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = emailEventData.email_address;
        }
        if ((i & 2) != 0) {
            str2 = emailEventData.email_category;
        }
        if ((i & 4) != 0) {
            str3 = emailEventData.test_version;
        }
        if ((i & 8) != 0) {
            str4 = emailEventData.uuid;
        }
        if ((i & 16) != 0) {
            str5 = emailEventData.user_agent;
        }
        if ((i & 32) != 0) {
            str6 = emailEventData.masked_email_address;
        }
        if ((i & 64) != 0) {
            byteString = emailEventData.unknownFields();
        }
        String str7 = str6;
        ByteString byteString2 = byteString;
        String str8 = str5;
        String str9 = str3;
        return emailEventData.copy(str, str2, str9, str4, str8, str7, byteString2);
    }

    public final EmailEventData copy(String email_address, String email_category, String test_version, String uuid, String user_agent, String masked_email_address, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(email_address, "email_address");
        Intrinsics.checkNotNullParameter(email_category, "email_category");
        Intrinsics.checkNotNullParameter(test_version, "test_version");
        Intrinsics.checkNotNullParameter(uuid, "uuid");
        Intrinsics.checkNotNullParameter(user_agent, "user_agent");
        Intrinsics.checkNotNullParameter(masked_email_address, "masked_email_address");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EmailEventData(email_address, email_category, test_version, uuid, user_agent, masked_email_address, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EmailEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EmailEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.EmailEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EmailEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEmail_address(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEmail_address());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getEmail_category());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getUser_agent());
                }
                return !Intrinsics.areEqual(value.getMasked_email_address(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_email_address()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EmailEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEmail_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEmail_address());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEmail_category());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getMasked_email_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_email_address());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EmailEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_email_address(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_email_address());
                }
                if (!Intrinsics.areEqual(value.getUser_agent(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getUser_agent());
                }
                if (!Intrinsics.areEqual(value.getUuid(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getUuid());
                }
                if (!Intrinsics.areEqual(value.getTest_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getTest_version());
                }
                if (!Intrinsics.areEqual(value.getEmail_category(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getEmail_category());
                }
                if (Intrinsics.areEqual(value.getEmail_address(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEmail_address());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EmailEventData redact(EmailEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EmailEventData.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EmailEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EmailEventData(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1001) {
                        strDecode6 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
