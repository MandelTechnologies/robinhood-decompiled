package com.robinhood.ceres.p284v1;

import com.robinhood.android.matcha.p177ui.p178qr.MatchaQrCodeDuxo6;
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

/* compiled from: UserSettings.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016J?\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/UserSettings;", "Lcom/squareup/wire/Message;", "", MatchaQrCodeDuxo6.USER_ID_KEY, "", "created_at", "updated_at", "enable_sports_event_contracts", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)V", "getUser_id", "()Ljava/lang/String;", "getCreated_at", "getUpdated_at", "getEnable_sports_event_contracts", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lokio/ByteString;)Lcom/robinhood/ceres/v1/UserSettings;", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class UserSettings extends Message {

    @JvmField
    public static final ProtoAdapter<UserSettings> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "createdAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String created_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "enableSportsEventContracts", schemaIndex = 3, tag = 4)
    private final Boolean enable_sports_event_contracts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "updatedAt", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String updated_at;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String user_id;

    public UserSettings() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ UserSettings(String str, String str2, String str3, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20427newBuilder();
    }

    public final String getUser_id() {
        return this.user_id;
    }

    public final String getCreated_at() {
        return this.created_at;
    }

    public final String getUpdated_at() {
        return this.updated_at;
    }

    public final Boolean getEnable_sports_event_contracts() {
        return this.enable_sports_event_contracts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserSettings(String user_id, String created_at, String updated_at, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_id = user_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.enable_sports_event_contracts = bool;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20427newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserSettings)) {
            return false;
        }
        UserSettings userSettings = (UserSettings) other;
        return Intrinsics.areEqual(unknownFields(), userSettings.unknownFields()) && Intrinsics.areEqual(this.user_id, userSettings.user_id) && Intrinsics.areEqual(this.created_at, userSettings.created_at) && Intrinsics.areEqual(this.updated_at, userSettings.updated_at) && Intrinsics.areEqual(this.enable_sports_event_contracts, userSettings.enable_sports_event_contracts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.user_id.hashCode()) * 37) + this.created_at.hashCode()) * 37) + this.updated_at.hashCode()) * 37;
        Boolean bool = this.enable_sports_event_contracts;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("user_id=" + Internal.sanitize(this.user_id));
        arrayList.add("created_at=" + Internal.sanitize(this.created_at));
        arrayList.add("updated_at=" + Internal.sanitize(this.updated_at));
        Boolean bool = this.enable_sports_event_contracts;
        if (bool != null) {
            arrayList.add("enable_sports_event_contracts=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserSettings copy$default(UserSettings userSettings, String str, String str2, String str3, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userSettings.user_id;
        }
        if ((i & 2) != 0) {
            str2 = userSettings.created_at;
        }
        if ((i & 4) != 0) {
            str3 = userSettings.updated_at;
        }
        if ((i & 8) != 0) {
            bool = userSettings.enable_sports_event_contracts;
        }
        if ((i & 16) != 0) {
            byteString = userSettings.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str3;
        return userSettings.copy(str, str2, str4, bool, byteString2);
    }

    public final UserSettings copy(String user_id, String created_at, String updated_at, Boolean enable_sports_event_contracts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(user_id, "user_id");
        Intrinsics.checkNotNullParameter(created_at, "created_at");
        Intrinsics.checkNotNullParameter(updated_at, "updated_at");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserSettings(user_id, created_at, updated_at, enable_sports_event_contracts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.UserSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getUpdated_at());
                }
                return size + ProtoAdapter.BOOL.encodedSizeWithTag(4, value.getEnable_sports_event_contracts());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getUser_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getEnable_sports_event_contracts());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter.BOOL.encodeWithTag(writer, 4, (int) value.getEnable_sports_event_contracts());
                if (!Intrinsics.areEqual(value.getUpdated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getUpdated_at());
                }
                if (!Intrinsics.areEqual(value.getCreated_at(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getCreated_at());
                }
                if (Intrinsics.areEqual(value.getUser_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getUser_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserSettings redact(UserSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UserSettings.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UserSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                Boolean boolDecode = null;
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UserSettings(strDecode, strDecode3, strDecode2, boolDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
