package com.robinhood.rosetta.eventlogging;

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

/* compiled from: User.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001cBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0016\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/User;", "Lcom/squareup/wire/Message;", "", "username", "", "secret", "account_number", "masked_username", "masked_secret", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getUsername", "()Ljava/lang/String;", "getSecret", "getAccount_number", "getMasked_username", "getMasked_secret", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class User extends Message {

    @JvmField
    public static final ProtoAdapter<User> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String account_number;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedSecret", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 1002)
    private final String masked_secret;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedUsername", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 1001)
    private final String masked_username;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String secret;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String username;

    public User() {
        this(null, null, null, null, null, null, 63, null);
    }

    public /* synthetic */ User(String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? "" : str5, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24597newBuilder();
    }

    public final String getUsername() {
        return this.username;
    }

    public final String getSecret() {
        return this.secret;
    }

    public final String getAccount_number() {
        return this.account_number;
    }

    public final String getMasked_username() {
        return this.masked_username;
    }

    public final String getMasked_secret() {
        return this.masked_secret;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public User(String username, String secret, String account_number, String masked_username, String masked_secret, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(masked_username, "masked_username");
        Intrinsics.checkNotNullParameter(masked_secret, "masked_secret");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.username = username;
        this.secret = secret;
        this.account_number = account_number;
        this.masked_username = masked_username;
        this.masked_secret = masked_secret;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24597newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof User)) {
            return false;
        }
        User user = (User) other;
        return Intrinsics.areEqual(unknownFields(), user.unknownFields()) && Intrinsics.areEqual(this.username, user.username) && Intrinsics.areEqual(this.secret, user.secret) && Intrinsics.areEqual(this.account_number, user.account_number) && Intrinsics.areEqual(this.masked_username, user.masked_username) && Intrinsics.areEqual(this.masked_secret, user.masked_secret);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.username.hashCode()) * 37) + this.secret.hashCode()) * 37) + this.account_number.hashCode()) * 37) + this.masked_username.hashCode()) * 37) + this.masked_secret.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("username=" + Internal.sanitize(this.username));
        arrayList.add("secret=" + Internal.sanitize(this.secret));
        arrayList.add("account_number=" + Internal.sanitize(this.account_number));
        arrayList.add("masked_username=" + Internal.sanitize(this.masked_username));
        arrayList.add("masked_secret=" + Internal.sanitize(this.masked_secret));
        return CollectionsKt.joinToString$default(arrayList, ", ", "User{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ User copy$default(User user, String str, String str2, String str3, String str4, String str5, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = user.username;
        }
        if ((i & 2) != 0) {
            str2 = user.secret;
        }
        if ((i & 4) != 0) {
            str3 = user.account_number;
        }
        if ((i & 8) != 0) {
            str4 = user.masked_username;
        }
        if ((i & 16) != 0) {
            str5 = user.masked_secret;
        }
        if ((i & 32) != 0) {
            byteString = user.unknownFields();
        }
        String str6 = str5;
        ByteString byteString2 = byteString;
        return user.copy(str, str2, str3, str4, str6, byteString2);
    }

    public final User copy(String username, String secret, String account_number, String masked_username, String masked_secret, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(secret, "secret");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(masked_username, "masked_username");
        Intrinsics.checkNotNullParameter(masked_secret, "masked_secret");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new User(username, secret, account_number, masked_username, masked_secret, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(User.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<User>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.User$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(User value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUsername(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUsername());
                }
                if (!Intrinsics.areEqual(value.getSecret(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSecret());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getMasked_username(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1001, value.getMasked_username());
                }
                return !Intrinsics.areEqual(value.getMasked_secret(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1002, value.getMasked_secret()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, User value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUsername(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUsername());
                }
                if (!Intrinsics.areEqual(value.getSecret(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecret());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getMasked_username(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_username());
                }
                if (!Intrinsics.areEqual(value.getMasked_secret(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_secret());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, User value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_secret(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1002, (int) value.getMasked_secret());
                }
                if (!Intrinsics.areEqual(value.getMasked_username(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1001, (int) value.getMasked_username());
                }
                if (!Intrinsics.areEqual(value.getAccount_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getAccount_number());
                }
                if (!Intrinsics.areEqual(value.getSecret(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSecret());
                }
                if (Intrinsics.areEqual(value.getUsername(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUsername());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public User redact(User value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return User.copy$default(value, null, null, null, null, null, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public User decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new User(strDecode, strDecode2, strDecode3, strDecode4, strDecode5, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1001) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 1002) {
                        strDecode5 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
