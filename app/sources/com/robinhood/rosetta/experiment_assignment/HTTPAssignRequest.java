package com.robinhood.rosetta.experiment_assignment;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
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
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: HTTPAssignRequest.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 /2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001/B\u0095\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\r\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\b\u0010&\u001a\u00020\u0002H\u0017J\u0013\u0010'\u001a\u00020\t2\b\u0010(\u001a\u0004\u0018\u00010)H\u0096\u0002J\b\u0010*\u001a\u00020+H\u0016J\b\u0010,\u001a\u00020\u0004H\u0016J\u0099\u0001\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00042\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\u00042\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010.R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b\u001c\u0010\u001aR\u0016\u0010\u000b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0016\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0016\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017R\u0016\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u001a\u0010\u000f\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001b\u001a\u0004\b!\u0010\u001aR\u0016\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0017R\u0016\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0017R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "Lcom/squareup/wire/Message;", "", "entity_id", "", "names", "", "entity_type", "trigger", "", "userleap", "platform", "app_version", "os_version", "user_origin", "assignment_logging", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getEntity_id", "()Ljava/lang/String;", "getEntity_type", "getTrigger", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getUserleap", "getPlatform", "getApp_version", "getOs_version", "getUser_origin", "getAssignment_logging", "getAccount_type", "getApplication", "getNames", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignRequest;", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HTTPAssignRequest extends Message {

    @JvmField
    public static final ProtoAdapter<HTTPAssignRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final String account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final String app_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 12)
    private final String application;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "assignmentLogging", schemaIndex = 9, tag = 10)
    private final Boolean assignment_logging;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String entity_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "entityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final List<String> names;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final String os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", schemaIndex = 3, tag = 4)
    private final Boolean trigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "userOrigin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final String user_origin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", schemaIndex = 4, tag = 5)
    private final Boolean userleap;

    public HTTPAssignRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, 8191, null);
    }

    public /* synthetic */ HTTPAssignRequest(String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : bool2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? "" : str6, (i & 512) == 0 ? bool3 : null, (i & 1024) != 0 ? "" : str7, (i & 2048) == 0 ? str8 : "", (i & 4096) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24636newBuilder();
    }

    public final String getEntity_id() {
        return this.entity_id;
    }

    public final String getEntity_type() {
        return this.entity_type;
    }

    public final Boolean getTrigger() {
        return this.trigger;
    }

    public final Boolean getUserleap() {
        return this.userleap;
    }

    public final String getPlatform() {
        return this.platform;
    }

    public final String getApp_version() {
        return this.app_version;
    }

    public final String getOs_version() {
        return this.os_version;
    }

    public final String getUser_origin() {
        return this.user_origin;
    }

    public final Boolean getAssignment_logging() {
        return this.assignment_logging;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final String getApplication() {
        return this.application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPAssignRequest(String entity_id, List<String> names, String entity_type, Boolean bool, Boolean bool2, String platform, String app_version, String os_version, String user_origin, Boolean bool3, String account_type, String application, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(user_origin, "user_origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entity_id = entity_id;
        this.entity_type = entity_type;
        this.trigger = bool;
        this.userleap = bool2;
        this.platform = platform;
        this.app_version = app_version;
        this.os_version = os_version;
        this.user_origin = user_origin;
        this.assignment_logging = bool3;
        this.account_type = account_type;
        this.application = application;
        this.names = Internal.immutableCopyOf("names", names);
    }

    public final List<String> getNames() {
        return this.names;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24636newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HTTPAssignRequest)) {
            return false;
        }
        HTTPAssignRequest hTTPAssignRequest = (HTTPAssignRequest) other;
        return Intrinsics.areEqual(unknownFields(), hTTPAssignRequest.unknownFields()) && Intrinsics.areEqual(this.entity_id, hTTPAssignRequest.entity_id) && Intrinsics.areEqual(this.names, hTTPAssignRequest.names) && Intrinsics.areEqual(this.entity_type, hTTPAssignRequest.entity_type) && Intrinsics.areEqual(this.trigger, hTTPAssignRequest.trigger) && Intrinsics.areEqual(this.userleap, hTTPAssignRequest.userleap) && Intrinsics.areEqual(this.platform, hTTPAssignRequest.platform) && Intrinsics.areEqual(this.app_version, hTTPAssignRequest.app_version) && Intrinsics.areEqual(this.os_version, hTTPAssignRequest.os_version) && Intrinsics.areEqual(this.user_origin, hTTPAssignRequest.user_origin) && Intrinsics.areEqual(this.assignment_logging, hTTPAssignRequest.assignment_logging) && Intrinsics.areEqual(this.account_type, hTTPAssignRequest.account_type) && Intrinsics.areEqual(this.application, hTTPAssignRequest.application);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((unknownFields().hashCode() * 37) + this.entity_id.hashCode()) * 37) + this.names.hashCode()) * 37) + this.entity_type.hashCode()) * 37;
        Boolean bool = this.trigger;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.userleap;
        int iHashCode3 = (((((((((iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 37) + this.platform.hashCode()) * 37) + this.app_version.hashCode()) * 37) + this.os_version.hashCode()) * 37) + this.user_origin.hashCode()) * 37;
        Boolean bool3 = this.assignment_logging;
        int iHashCode4 = ((((iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 37) + this.account_type.hashCode()) * 37) + this.application.hashCode();
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("entity_id=" + Internal.sanitize(this.entity_id));
        if (!this.names.isEmpty()) {
            arrayList.add("names=" + Internal.sanitize(this.names));
        }
        arrayList.add("entity_type=" + Internal.sanitize(this.entity_type));
        Boolean bool = this.trigger;
        if (bool != null) {
            arrayList.add("trigger=" + bool);
        }
        Boolean bool2 = this.userleap;
        if (bool2 != null) {
            arrayList.add("userleap=" + bool2);
        }
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        arrayList.add("app_version=" + Internal.sanitize(this.app_version));
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("user_origin=" + Internal.sanitize(this.user_origin));
        Boolean bool3 = this.assignment_logging;
        if (bool3 != null) {
            arrayList.add("assignment_logging=" + bool3);
        }
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("application=" + Internal.sanitize(this.application));
        return CollectionsKt.joinToString$default(arrayList, ", ", "HTTPAssignRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HTTPAssignRequest copy$default(HTTPAssignRequest hTTPAssignRequest, String str, List list, String str2, Boolean bool, Boolean bool2, String str3, String str4, String str5, String str6, Boolean bool3, String str7, String str8, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTTPAssignRequest.entity_id;
        }
        return hTTPAssignRequest.copy(str, (i & 2) != 0 ? hTTPAssignRequest.names : list, (i & 4) != 0 ? hTTPAssignRequest.entity_type : str2, (i & 8) != 0 ? hTTPAssignRequest.trigger : bool, (i & 16) != 0 ? hTTPAssignRequest.userleap : bool2, (i & 32) != 0 ? hTTPAssignRequest.platform : str3, (i & 64) != 0 ? hTTPAssignRequest.app_version : str4, (i & 128) != 0 ? hTTPAssignRequest.os_version : str5, (i & 256) != 0 ? hTTPAssignRequest.user_origin : str6, (i & 512) != 0 ? hTTPAssignRequest.assignment_logging : bool3, (i & 1024) != 0 ? hTTPAssignRequest.account_type : str7, (i & 2048) != 0 ? hTTPAssignRequest.application : str8, (i & 4096) != 0 ? hTTPAssignRequest.unknownFields() : byteString);
    }

    public final HTTPAssignRequest copy(String entity_id, List<String> names, String entity_type, Boolean trigger, Boolean userleap, String platform, String app_version, String os_version, String user_origin, Boolean assignment_logging, String account_type, String application, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(entity_id, "entity_id");
        Intrinsics.checkNotNullParameter(names, "names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(user_origin, "user_origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HTTPAssignRequest(entity_id, names, entity_type, trigger, userleap, platform, app_version, os_version, user_origin, assignment_logging, account_type, application, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HTTPAssignRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HTTPAssignRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.HTTPAssignRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HTTPAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEntity_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(2, value.getNames());
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getEntity_type());
                }
                if (value.getTrigger() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(4, value.getTrigger());
                }
                if (value.getUserleap() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(5, value.getUserleap());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(6, value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(7, value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(8, value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getUser_origin(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(9, value.getUser_origin());
                }
                if (value.getAssignment_logging() != null) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(10, value.getAssignment_logging());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(11, value.getAccount_type());
                }
                return !Intrinsics.areEqual(value.getApplication(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(12, value.getApplication()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HTTPAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEntity_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEntity_id());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getNames());
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getEntity_type());
                }
                if (value.getTrigger() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getTrigger());
                }
                if (value.getUserleap() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 5, (int) value.getUserleap());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    protoAdapter.encodeWithTag(writer, 6, (int) value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    protoAdapter.encodeWithTag(writer, 7, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    protoAdapter.encodeWithTag(writer, 8, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getUser_origin(), "")) {
                    protoAdapter.encodeWithTag(writer, 9, (int) value.getUser_origin());
                }
                if (value.getAssignment_logging() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 10, (int) value.getAssignment_logging());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 11, (int) value.getAccount_type());
                }
                if (!Intrinsics.areEqual(value.getApplication(), "")) {
                    protoAdapter.encodeWithTag(writer, 12, (int) value.getApplication());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HTTPAssignRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getApplication(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getApplication());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getAccount_type());
                }
                if (value.getAssignment_logging() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 10, (int) value.getAssignment_logging());
                }
                if (!Intrinsics.areEqual(value.getUser_origin(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getUser_origin());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getPlatform());
                }
                if (value.getUserleap() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 5, (int) value.getUserleap());
                }
                if (value.getTrigger() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getTrigger());
                }
                if (!Intrinsics.areEqual(value.getEntity_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getEntity_type());
                }
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 2, (int) value.getNames());
                if (Intrinsics.areEqual(value.getEntity_id(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getEntity_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HTTPAssignRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                Boolean boolDecode3 = null;
                String strDecode8 = strDecode7;
                while (true) {
                    int iNextTag = reader.nextTag();
                    String str = strDecode;
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                break;
                            case 3:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                boolDecode = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 5:
                                boolDecode2 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 6:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 7:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 8:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 9:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 10:
                                boolDecode3 = ProtoAdapter.BOOL_VALUE.decode(reader);
                                break;
                            case 11:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 12:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                        strDecode = str;
                    } else {
                        return new HTTPAssignRequest(str, arrayList, strDecode8, boolDecode, boolDecode2, strDecode2, strDecode3, strDecode4, strDecode5, boolDecode3, strDecode6, strDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HTTPAssignRequest redact(HTTPAssignRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Boolean trigger = value.getTrigger();
                Boolean boolRedact = trigger != null ? ProtoAdapter.BOOL_VALUE.redact(trigger) : null;
                Boolean userleap = value.getUserleap();
                Boolean boolRedact2 = userleap != null ? ProtoAdapter.BOOL_VALUE.redact(userleap) : null;
                Boolean assignment_logging = value.getAssignment_logging();
                return HTTPAssignRequest.copy$default(value, null, null, null, boolRedact, boolRedact2, null, null, null, null, assignment_logging != null ? ProtoAdapter.BOOL_VALUE.redact(assignment_logging) : null, null, null, ByteString.EMPTY, 3559, null);
            }
        };
    }
}
