package com.robinhood.ceres.p284v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: GetUserSettingsResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/ceres/v1/GetUserSettingsResponse;", "Lcom/squareup/wire/Message;", "", "user_settings", "Lcom/robinhood/ceres/v1/UserSettings;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/UserSettings;Lokio/ByteString;)V", "getUser_settings", "()Lcom/robinhood/ceres/v1/UserSettings;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GetUserSettingsResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetUserSettingsResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.UserSettings#ADAPTER", jsonName = "userSettings", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UserSettings user_settings;

    /* JADX WARN: Multi-variable type inference failed */
    public GetUserSettingsResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20383newBuilder();
    }

    public final UserSettings getUser_settings() {
        return this.user_settings;
    }

    public /* synthetic */ GetUserSettingsResponse(UserSettings userSettings, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : userSettings, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetUserSettingsResponse(UserSettings userSettings, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.user_settings = userSettings;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20383newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetUserSettingsResponse)) {
            return false;
        }
        GetUserSettingsResponse getUserSettingsResponse = (GetUserSettingsResponse) other;
        return Intrinsics.areEqual(unknownFields(), getUserSettingsResponse.unknownFields()) && Intrinsics.areEqual(this.user_settings, getUserSettingsResponse.user_settings);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UserSettings userSettings = this.user_settings;
        int iHashCode2 = iHashCode + (userSettings != null ? userSettings.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UserSettings userSettings = this.user_settings;
        if (userSettings != null) {
            arrayList.add("user_settings=" + userSettings);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetUserSettingsResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetUserSettingsResponse copy$default(GetUserSettingsResponse getUserSettingsResponse, UserSettings userSettings, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            userSettings = getUserSettingsResponse.user_settings;
        }
        if ((i & 2) != 0) {
            byteString = getUserSettingsResponse.unknownFields();
        }
        return getUserSettingsResponse.copy(userSettings, byteString);
    }

    public final GetUserSettingsResponse copy(UserSettings user_settings, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetUserSettingsResponse(user_settings, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetUserSettingsResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetUserSettingsResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.GetUserSettingsResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetUserSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getUser_settings() != null ? size + UserSettings.ADAPTER.encodedSizeWithTag(1, value.getUser_settings()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetUserSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getUser_settings() != null) {
                    UserSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_settings());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetUserSettingsResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUser_settings() != null) {
                    UserSettings.ADAPTER.encodeWithTag(writer, 1, (int) value.getUser_settings());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetUserSettingsResponse redact(GetUserSettingsResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UserSettings user_settings = value.getUser_settings();
                return value.copy(user_settings != null ? UserSettings.ADAPTER.redact(user_settings) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetUserSettingsResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UserSettings userSettingsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetUserSettingsResponse(userSettingsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        userSettingsDecode = UserSettings.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
