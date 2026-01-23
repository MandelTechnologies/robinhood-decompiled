package com.robinhood.rosetta.experiment_assignment;

import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import com.robinhood.rosetta.experiment_assignment.AssignmentParameter;
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
import java.util.List;
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

/* compiled from: AssignmentParameter.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 12\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u00041234B\u0085\u0001\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010)\u001a\u00020\u0002H\u0017J\u0013\u0010*\u001a\u00020\u000e2\b\u0010+\u001a\u0004\u0018\u00010,H\u0096\u0002J\b\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020\u0005H\u0016J\u0084\u0001\u00100\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0016\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010!R\u0016\u0010\u0010\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010!R\u0016\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010(¨\u00065"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter;", "Lcom/squareup/wire/Message;", "", "experiment_names", "", "", "entity_type", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "platform", "app_version", "os_version", "origin", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "assignment_logging", "", "whitelist_lookup", "trigger", InstantCashConstants.ACCOUNT_TYPE_KEY, "application", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;ZZZLjava/lang/String;Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;Lokio/ByteString;)V", "getEntity_type", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "getPlatform", "()Ljava/lang/String;", "getApp_version", "getOs_version", "getOrigin", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "getAssignment_logging", "()Z", "getWhitelist_lookup", "getTrigger", "getAccount_type", "getApplication", "()Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "getExperiment_names", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntityType", "UserOrigin", "Application", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class AssignmentParameter extends Message {

    @JvmField
    public static final ProtoAdapter<AssignmentParameter> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 10)
    private final String account_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "appVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String app_version;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter$Application#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 11)
    private final Application application;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "assignmentLogging", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final boolean assignment_logging;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter$EntityType#ADAPTER", jsonName = "entityType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EntityType entity_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "experimentNames", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
    private final List<String> experiment_names;

    @WireField(adapter = "com.robinhood.rosetta.experiment_assignment.AssignmentParameter$UserOrigin#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final UserOrigin origin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "osVersion", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final String os_version;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String platform;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final boolean trigger;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "whitelistLookup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final boolean whitelist_lookup;

    public AssignmentParameter() {
        this(null, null, null, null, null, null, false, false, false, null, null, null, 4095, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24624newBuilder();
    }

    public /* synthetic */ AssignmentParameter(List list, EntityType entityType, String str, String str2, String str3, UserOrigin userOrigin, boolean z, boolean z2, boolean z3, String str4, Application application, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? EntityType.USER_UUID : entityType, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? "" : str3, (i & 32) != 0 ? UserOrigin.f6025US : userOrigin, (i & 64) != 0 ? false : z, (i & 128) != 0 ? false : z2, (i & 256) == 0 ? z3 : false, (i & 512) == 0 ? str4 : "", (i & 1024) != 0 ? Application.UNKNOWN : application, (i & 2048) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EntityType getEntity_type() {
        return this.entity_type;
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

    public final UserOrigin getOrigin() {
        return this.origin;
    }

    public final boolean getAssignment_logging() {
        return this.assignment_logging;
    }

    public final boolean getWhitelist_lookup() {
        return this.whitelist_lookup;
    }

    public final boolean getTrigger() {
        return this.trigger;
    }

    public final String getAccount_type() {
        return this.account_type;
    }

    public final Application getApplication() {
        return this.application;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssignmentParameter(List<String> experiment_names, EntityType entity_type, String platform, String app_version, String os_version, UserOrigin origin, boolean z, boolean z2, boolean z3, String account_type, Application application, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.entity_type = entity_type;
        this.platform = platform;
        this.app_version = app_version;
        this.os_version = os_version;
        this.origin = origin;
        this.assignment_logging = z;
        this.whitelist_lookup = z2;
        this.trigger = z3;
        this.account_type = account_type;
        this.application = application;
        this.experiment_names = Internal.immutableCopyOf("experiment_names", experiment_names);
    }

    public final List<String> getExperiment_names() {
        return this.experiment_names;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24624newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AssignmentParameter)) {
            return false;
        }
        AssignmentParameter assignmentParameter = (AssignmentParameter) other;
        return Intrinsics.areEqual(unknownFields(), assignmentParameter.unknownFields()) && Intrinsics.areEqual(this.experiment_names, assignmentParameter.experiment_names) && this.entity_type == assignmentParameter.entity_type && Intrinsics.areEqual(this.platform, assignmentParameter.platform) && Intrinsics.areEqual(this.app_version, assignmentParameter.app_version) && Intrinsics.areEqual(this.os_version, assignmentParameter.os_version) && this.origin == assignmentParameter.origin && this.assignment_logging == assignmentParameter.assignment_logging && this.whitelist_lookup == assignmentParameter.whitelist_lookup && this.trigger == assignmentParameter.trigger && Intrinsics.areEqual(this.account_type, assignmentParameter.account_type) && this.application == assignmentParameter.application;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((unknownFields().hashCode() * 37) + this.experiment_names.hashCode()) * 37) + this.entity_type.hashCode()) * 37) + this.platform.hashCode()) * 37) + this.app_version.hashCode()) * 37) + this.os_version.hashCode()) * 37) + this.origin.hashCode()) * 37) + Boolean.hashCode(this.assignment_logging)) * 37) + Boolean.hashCode(this.whitelist_lookup)) * 37) + Boolean.hashCode(this.trigger)) * 37) + this.account_type.hashCode()) * 37) + this.application.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        if (!this.experiment_names.isEmpty()) {
            arrayList.add("experiment_names=" + Internal.sanitize(this.experiment_names));
        }
        arrayList.add("entity_type=" + this.entity_type);
        arrayList.add("platform=" + Internal.sanitize(this.platform));
        arrayList.add("app_version=" + Internal.sanitize(this.app_version));
        arrayList.add("os_version=" + Internal.sanitize(this.os_version));
        arrayList.add("origin=" + this.origin);
        arrayList.add("assignment_logging=" + this.assignment_logging);
        arrayList.add("whitelist_lookup=" + this.whitelist_lookup);
        arrayList.add("trigger=" + this.trigger);
        arrayList.add("account_type=" + Internal.sanitize(this.account_type));
        arrayList.add("application=" + this.application);
        return CollectionsKt.joinToString$default(arrayList, ", ", "AssignmentParameter{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AssignmentParameter copy$default(AssignmentParameter assignmentParameter, List list, EntityType entityType, String str, String str2, String str3, UserOrigin userOrigin, boolean z, boolean z2, boolean z3, String str4, Application application, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            list = assignmentParameter.experiment_names;
        }
        if ((i & 2) != 0) {
            entityType = assignmentParameter.entity_type;
        }
        if ((i & 4) != 0) {
            str = assignmentParameter.platform;
        }
        if ((i & 8) != 0) {
            str2 = assignmentParameter.app_version;
        }
        if ((i & 16) != 0) {
            str3 = assignmentParameter.os_version;
        }
        if ((i & 32) != 0) {
            userOrigin = assignmentParameter.origin;
        }
        if ((i & 64) != 0) {
            z = assignmentParameter.assignment_logging;
        }
        if ((i & 128) != 0) {
            z2 = assignmentParameter.whitelist_lookup;
        }
        if ((i & 256) != 0) {
            z3 = assignmentParameter.trigger;
        }
        if ((i & 512) != 0) {
            str4 = assignmentParameter.account_type;
        }
        if ((i & 1024) != 0) {
            application = assignmentParameter.application;
        }
        if ((i & 2048) != 0) {
            byteString = assignmentParameter.unknownFields();
        }
        Application application2 = application;
        ByteString byteString2 = byteString;
        boolean z4 = z3;
        String str5 = str4;
        boolean z5 = z;
        boolean z6 = z2;
        String str6 = str3;
        UserOrigin userOrigin2 = userOrigin;
        return assignmentParameter.copy(list, entityType, str, str2, str6, userOrigin2, z5, z6, z4, str5, application2, byteString2);
    }

    public final AssignmentParameter copy(List<String> experiment_names, EntityType entity_type, String platform, String app_version, String os_version, UserOrigin origin, boolean assignment_logging, boolean whitelist_lookup, boolean trigger, String account_type, Application application, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(experiment_names, "experiment_names");
        Intrinsics.checkNotNullParameter(entity_type, "entity_type");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(app_version, "app_version");
        Intrinsics.checkNotNullParameter(os_version, "os_version");
        Intrinsics.checkNotNullParameter(origin, "origin");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        Intrinsics.checkNotNullParameter(application, "application");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AssignmentParameter(experiment_names, entity_type, platform, app_version, os_version, origin, assignment_logging, whitelist_lookup, trigger, account_type, application, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AssignmentParameter.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AssignmentParameter>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameter$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AssignmentParameter value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getExperiment_names());
                if (value.getEntity_type() != AssignmentParameter.EntityType.USER_UUID) {
                    iEncodedSizeWithTag += AssignmentParameter.EntityType.ADAPTER.encodedSizeWithTag(2, value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(3, value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(4, value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(5, value.getOs_version());
                }
                if (value.getOrigin() != AssignmentParameter.UserOrigin.f6025US) {
                    iEncodedSizeWithTag += AssignmentParameter.UserOrigin.ADAPTER.encodedSizeWithTag(6, value.getOrigin());
                }
                if (value.getAssignment_logging()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(7, Boolean.valueOf(value.getAssignment_logging()));
                }
                if (value.getWhitelist_lookup()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(8, Boolean.valueOf(value.getWhitelist_lookup()));
                }
                if (value.getTrigger()) {
                    iEncodedSizeWithTag += ProtoAdapter.BOOL.encodedSizeWithTag(9, Boolean.valueOf(value.getTrigger()));
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(10, value.getAccount_type());
                }
                return value.getApplication() != AssignmentParameter.Application.UNKNOWN ? iEncodedSizeWithTag + AssignmentParameter.Application.ADAPTER.encodedSizeWithTag(11, value.getApplication()) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AssignmentParameter value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getExperiment_names());
                if (value.getEntity_type() != AssignmentParameter.EntityType.USER_UUID) {
                    AssignmentParameter.EntityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntity_type());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getPlatform());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getOs_version());
                }
                if (value.getOrigin() != AssignmentParameter.UserOrigin.f6025US) {
                    AssignmentParameter.UserOrigin.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrigin());
                }
                if (value.getAssignment_logging()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAssignment_logging()));
                }
                if (value.getWhitelist_lookup()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getWhitelist_lookup()));
                }
                if (value.getTrigger()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getTrigger()));
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    protoAdapter.encodeWithTag(writer, 10, (int) value.getAccount_type());
                }
                if (value.getApplication() != AssignmentParameter.Application.UNKNOWN) {
                    AssignmentParameter.Application.ADAPTER.encodeWithTag(writer, 11, (int) value.getApplication());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AssignmentParameter value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getApplication() != AssignmentParameter.Application.UNKNOWN) {
                    AssignmentParameter.Application.ADAPTER.encodeWithTag(writer, 11, (int) value.getApplication());
                }
                if (!Intrinsics.areEqual(value.getAccount_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getAccount_type());
                }
                if (value.getTrigger()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 9, (int) Boolean.valueOf(value.getTrigger()));
                }
                if (value.getWhitelist_lookup()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 8, (int) Boolean.valueOf(value.getWhitelist_lookup()));
                }
                if (value.getAssignment_logging()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 7, (int) Boolean.valueOf(value.getAssignment_logging()));
                }
                if (value.getOrigin() != AssignmentParameter.UserOrigin.f6025US) {
                    AssignmentParameter.UserOrigin.ADAPTER.encodeWithTag(writer, 6, (int) value.getOrigin());
                }
                if (!Intrinsics.areEqual(value.getOs_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getOs_version());
                }
                if (!Intrinsics.areEqual(value.getApp_version(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getApp_version());
                }
                if (!Intrinsics.areEqual(value.getPlatform(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPlatform());
                }
                if (value.getEntity_type() != AssignmentParameter.EntityType.USER_UUID) {
                    AssignmentParameter.EntityType.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntity_type());
                }
                ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getExperiment_names());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public AssignmentParameter decode(ProtoReader reader) throws IOException {
                AssignmentParameter.EntityType entityType;
                AssignmentParameter.Application application;
                String str;
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                AssignmentParameter.EntityType entityType2 = AssignmentParameter.EntityType.USER_UUID;
                AssignmentParameter.UserOrigin userOrigin = AssignmentParameter.UserOrigin.f6025US;
                AssignmentParameter.Application application2 = AssignmentParameter.Application.UNKNOWN;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                boolean zBooleanValue3 = false;
                AssignmentParameter.Application applicationDecode = application2;
                String strDecode4 = strDecode3;
                AssignmentParameter.UserOrigin userOriginDecode = userOrigin;
                AssignmentParameter.EntityType entityTypeDecode = entityType2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                entityType = entityTypeDecode;
                                application = applicationDecode;
                                str = strDecode4;
                                arrayList.add(ProtoAdapter.STRING.decode(reader));
                                entityTypeDecode = entityType;
                                strDecode4 = str;
                                applicationDecode = application;
                                break;
                            case 2:
                                entityType = entityTypeDecode;
                                application = applicationDecode;
                                str = strDecode4;
                                try {
                                    entityTypeDecode = AssignmentParameter.EntityType.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                                strDecode4 = str;
                                applicationDecode = application;
                                break;
                            case 3:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 6:
                                entityType = entityTypeDecode;
                                application = applicationDecode;
                                str = strDecode4;
                                try {
                                    userOriginDecode = AssignmentParameter.UserOrigin.ADAPTER.decode(reader);
                                } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                }
                                entityTypeDecode = entityType;
                                strDecode4 = str;
                                applicationDecode = application;
                                break;
                            case 7:
                                zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 8:
                                zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 9:
                                zBooleanValue3 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                                break;
                            case 10:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 11:
                                try {
                                    applicationDecode = AssignmentParameter.Application.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                    entityType = entityTypeDecode;
                                    application = applicationDecode;
                                    str = strDecode4;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                entityType = entityTypeDecode;
                                application = applicationDecode;
                                str = strDecode4;
                                entityTypeDecode = entityType;
                                strDecode4 = str;
                                applicationDecode = application;
                                break;
                        }
                    } else {
                        return new AssignmentParameter(arrayList, entityTypeDecode, strDecode4, strDecode, strDecode2, userOriginDecode, zBooleanValue, zBooleanValue2, zBooleanValue3, strDecode3, applicationDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AssignmentParameter redact(AssignmentParameter value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return AssignmentParameter.copy$default(value, null, null, null, null, null, null, false, false, false, null, null, ByteString.EMPTY, 2047, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "USER_UUID", "DEVICE_ID", "EMAIL", "MO_USER_UUID", "NCW_ID", "ACCOUNT_NUMBER", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntityType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntityType[] $VALUES;
        public static final EntityType ACCOUNT_NUMBER;

        @JvmField
        public static final ProtoAdapter<EntityType> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntityType DEVICE_ID;
        public static final EntityType EMAIL;
        public static final EntityType MO_USER_UUID;
        public static final EntityType NCW_ID;
        public static final EntityType USER_UUID;
        private final int value;

        private static final /* synthetic */ EntityType[] $values() {
            return new EntityType[]{USER_UUID, DEVICE_ID, EMAIL, MO_USER_UUID, NCW_ID, ACCOUNT_NUMBER};
        }

        @JvmStatic
        public static final EntityType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntityType> getEntries() {
            return $ENTRIES;
        }

        private EntityType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntityType entityType = new EntityType("USER_UUID", 0, 0);
            USER_UUID = entityType;
            DEVICE_ID = new EntityType("DEVICE_ID", 1, 1);
            EMAIL = new EntityType("EMAIL", 2, 2);
            MO_USER_UUID = new EntityType("MO_USER_UUID", 3, 3);
            NCW_ID = new EntityType("NCW_ID", 4, 4);
            ACCOUNT_NUMBER = new EntityType("ACCOUNT_NUMBER", 5, 5);
            EntityType[] entityTypeArr$values = $values();
            $VALUES = entityTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entityTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntityType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntityType>(orCreateKotlinClass, syntax, entityType) { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameter$EntityType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AssignmentParameter.EntityType fromValue(int value) {
                    return AssignmentParameter.EntityType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AssignmentParameter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$EntityType;", "fromValue", "value", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntityType fromValue(int value) {
                if (value == 0) {
                    return EntityType.USER_UUID;
                }
                if (value == 1) {
                    return EntityType.DEVICE_ID;
                }
                if (value == 2) {
                    return EntityType.EMAIL;
                }
                if (value == 3) {
                    return EntityType.MO_USER_UUID;
                }
                if (value == 4) {
                    return EntityType.NCW_ID;
                }
                if (value != 5) {
                    return null;
                }
                return EntityType.ACCOUNT_NUMBER;
            }
        }

        public static EntityType valueOf(String str) {
            return (EntityType) Enum.valueOf(EntityType.class, str);
        }

        public static EntityType[] values() {
            return (EntityType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b0\b\u0086\u0081\u0002\u0018\u0000 32\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u00013B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2¨\u00064"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", CountryCode.COUNTRY_CODE_US, CountryCode.COUNTRY_CODE_GB, "EU", CountryCode.COUNTRY_CODE_AT, CountryCode.COUNTRY_CODE_BE, CountryCode.COUNTRY_CODE_BG, CountryCode.COUNTRY_CODE_HR, CountryCode.COUNTRY_CODE_CY, CountryCode.COUNTRY_CODE_CZ, CountryCode.COUNTRY_CODE_DK, CountryCode.COUNTRY_CODE_EE, CountryCode.COUNTRY_CODE_FI, CountryCode.COUNTRY_CODE_FR, CountryCode.COUNTRY_CODE_DE, CountryCode.COUNTRY_CODE_GR, CountryCode.COUNTRY_CODE_HU, CountryCode.COUNTRY_CODE_IE, CountryCode.COUNTRY_CODE_IT, CountryCode.COUNTRY_CODE_LV, CountryCode.COUNTRY_CODE_LT, CountryCode.COUNTRY_CODE_LU, CountryCode.COUNTRY_CODE_MT, CountryCode.COUNTRY_CODE_NL, CountryCode.COUNTRY_CODE_PL, CountryCode.COUNTRY_CODE_PT, CountryCode.COUNTRY_CODE_RO, CountryCode.COUNTRY_CODE_SK, CountryCode.COUNTRY_CODE_SI, CountryCode.COUNTRY_CODE_ES, CountryCode.COUNTRY_CODE_SE, CountryCode.COUNTRY_CODE_SG, "APAC", CountryCode.COUNTRY_CODE_HK, CountryCode.COUNTRY_CODE_ID, CountryCode.COUNTRY_CODE_MY, CountryCode.COUNTRY_CODE_TH, CountryCode.COUNTRY_CODE_TW, CountryCode.COUNTRY_CODE_VN, CountryCode.COUNTRY_CODE_LI, CountryCode.COUNTRY_CODE_NO, CountryCode.COUNTRY_CODE_IS, CountryCode.COUNTRY_CODE_IN, "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class UserOrigin implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ UserOrigin[] $VALUES;

        @JvmField
        public static final ProtoAdapter<UserOrigin> ADAPTER;
        public static final UserOrigin APAC;

        /* renamed from: AT */
        public static final UserOrigin f5986AT;

        /* renamed from: BE */
        public static final UserOrigin f5987BE;

        /* renamed from: BG */
        public static final UserOrigin f5988BG;

        /* renamed from: CY */
        public static final UserOrigin f5989CY;

        /* renamed from: CZ */
        public static final UserOrigin f5990CZ;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        /* renamed from: DE */
        public static final UserOrigin f5991DE;

        /* renamed from: DK */
        public static final UserOrigin f5992DK;

        /* renamed from: EE */
        public static final UserOrigin f5993EE;

        /* renamed from: ES */
        public static final UserOrigin f5994ES;

        /* renamed from: EU */
        public static final UserOrigin f5995EU;

        /* renamed from: FI */
        public static final UserOrigin f5996FI;

        /* renamed from: FR */
        public static final UserOrigin f5997FR;

        /* renamed from: GB */
        public static final UserOrigin f5998GB;

        /* renamed from: GR */
        public static final UserOrigin f5999GR;

        /* renamed from: HK */
        public static final UserOrigin f6000HK;

        /* renamed from: HR */
        public static final UserOrigin f6001HR;

        /* renamed from: HU */
        public static final UserOrigin f6002HU;

        /* renamed from: ID */
        public static final UserOrigin f6003ID;

        /* renamed from: IE */
        public static final UserOrigin f6004IE;

        /* renamed from: IN */
        public static final UserOrigin f6005IN;

        /* renamed from: IS */
        public static final UserOrigin f6006IS;

        /* renamed from: IT */
        public static final UserOrigin f6007IT;

        /* renamed from: LI */
        public static final UserOrigin f6008LI;

        /* renamed from: LT */
        public static final UserOrigin f6009LT;

        /* renamed from: LU */
        public static final UserOrigin f6010LU;

        /* renamed from: LV */
        public static final UserOrigin f6011LV;

        /* renamed from: MT */
        public static final UserOrigin f6012MT;

        /* renamed from: MY */
        public static final UserOrigin f6013MY;

        /* renamed from: NL */
        public static final UserOrigin f6014NL;

        /* renamed from: NO */
        public static final UserOrigin f6015NO;

        /* renamed from: PL */
        public static final UserOrigin f6016PL;

        /* renamed from: PT */
        public static final UserOrigin f6017PT;

        /* renamed from: RO */
        public static final UserOrigin f6018RO;

        /* renamed from: SE */
        public static final UserOrigin f6019SE;

        /* renamed from: SG */
        public static final UserOrigin f6020SG;

        /* renamed from: SI */
        public static final UserOrigin f6021SI;

        /* renamed from: SK */
        public static final UserOrigin f6022SK;

        /* renamed from: TH */
        public static final UserOrigin f6023TH;

        /* renamed from: TW */
        public static final UserOrigin f6024TW;

        /* renamed from: US */
        public static final UserOrigin f6025US;

        /* renamed from: VN */
        public static final UserOrigin f6026VN;
        private final int value;

        private static final /* synthetic */ UserOrigin[] $values() {
            return new UserOrigin[]{f6025US, f5998GB, f5995EU, f5986AT, f5987BE, f5988BG, f6001HR, f5989CY, f5990CZ, f5992DK, f5993EE, f5996FI, f5997FR, f5991DE, f5999GR, f6002HU, f6004IE, f6007IT, f6011LV, f6009LT, f6010LU, f6012MT, f6014NL, f6016PL, f6017PT, f6018RO, f6022SK, f6021SI, f5994ES, f6019SE, f6020SG, APAC, f6000HK, f6003ID, f6013MY, f6023TH, f6024TW, f6026VN, f6008LI, f6015NO, f6006IS, f6005IN};
        }

        @JvmStatic
        public static final UserOrigin fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<UserOrigin> getEntries() {
            return $ENTRIES;
        }

        private UserOrigin(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final UserOrigin userOrigin = new UserOrigin(CountryCode.COUNTRY_CODE_US, 0, 0);
            f6025US = userOrigin;
            f5998GB = new UserOrigin(CountryCode.COUNTRY_CODE_GB, 1, 1);
            f5995EU = new UserOrigin("EU", 2, 2);
            f5986AT = new UserOrigin(CountryCode.COUNTRY_CODE_AT, 3, 3);
            f5987BE = new UserOrigin(CountryCode.COUNTRY_CODE_BE, 4, 4);
            f5988BG = new UserOrigin(CountryCode.COUNTRY_CODE_BG, 5, 5);
            f6001HR = new UserOrigin(CountryCode.COUNTRY_CODE_HR, 6, 6);
            f5989CY = new UserOrigin(CountryCode.COUNTRY_CODE_CY, 7, 7);
            f5990CZ = new UserOrigin(CountryCode.COUNTRY_CODE_CZ, 8, 8);
            f5992DK = new UserOrigin(CountryCode.COUNTRY_CODE_DK, 9, 9);
            f5993EE = new UserOrigin(CountryCode.COUNTRY_CODE_EE, 10, 10);
            f5996FI = new UserOrigin(CountryCode.COUNTRY_CODE_FI, 11, 11);
            f5997FR = new UserOrigin(CountryCode.COUNTRY_CODE_FR, 12, 12);
            f5991DE = new UserOrigin(CountryCode.COUNTRY_CODE_DE, 13, 13);
            f5999GR = new UserOrigin(CountryCode.COUNTRY_CODE_GR, 14, 14);
            f6002HU = new UserOrigin(CountryCode.COUNTRY_CODE_HU, 15, 15);
            f6004IE = new UserOrigin(CountryCode.COUNTRY_CODE_IE, 16, 16);
            f6007IT = new UserOrigin(CountryCode.COUNTRY_CODE_IT, 17, 17);
            f6011LV = new UserOrigin(CountryCode.COUNTRY_CODE_LV, 18, 18);
            f6009LT = new UserOrigin(CountryCode.COUNTRY_CODE_LT, 19, 19);
            f6010LU = new UserOrigin(CountryCode.COUNTRY_CODE_LU, 20, 20);
            f6012MT = new UserOrigin(CountryCode.COUNTRY_CODE_MT, 21, 21);
            f6014NL = new UserOrigin(CountryCode.COUNTRY_CODE_NL, 22, 22);
            f6016PL = new UserOrigin(CountryCode.COUNTRY_CODE_PL, 23, 23);
            f6017PT = new UserOrigin(CountryCode.COUNTRY_CODE_PT, 24, 24);
            f6018RO = new UserOrigin(CountryCode.COUNTRY_CODE_RO, 25, 25);
            f6022SK = new UserOrigin(CountryCode.COUNTRY_CODE_SK, 26, 26);
            f6021SI = new UserOrigin(CountryCode.COUNTRY_CODE_SI, 27, 27);
            f5994ES = new UserOrigin(CountryCode.COUNTRY_CODE_ES, 28, 28);
            f6019SE = new UserOrigin(CountryCode.COUNTRY_CODE_SE, 29, 29);
            f6020SG = new UserOrigin(CountryCode.COUNTRY_CODE_SG, 30, 30);
            APAC = new UserOrigin("APAC", 31, 31);
            f6000HK = new UserOrigin(CountryCode.COUNTRY_CODE_HK, 32, 32);
            f6003ID = new UserOrigin(CountryCode.COUNTRY_CODE_ID, 33, 33);
            f6013MY = new UserOrigin(CountryCode.COUNTRY_CODE_MY, 34, 34);
            f6023TH = new UserOrigin(CountryCode.COUNTRY_CODE_TH, 35, 35);
            f6024TW = new UserOrigin(CountryCode.COUNTRY_CODE_TW, 36, 36);
            f6026VN = new UserOrigin(CountryCode.COUNTRY_CODE_VN, 37, 37);
            f6008LI = new UserOrigin(CountryCode.COUNTRY_CODE_LI, 38, 38);
            f6015NO = new UserOrigin(CountryCode.COUNTRY_CODE_NO, 39, 39);
            f6006IS = new UserOrigin(CountryCode.COUNTRY_CODE_IS, 40, 40);
            f6005IN = new UserOrigin(CountryCode.COUNTRY_CODE_IN, 41, 41);
            UserOrigin[] userOriginArr$values = $values();
            $VALUES = userOriginArr$values;
            $ENTRIES = EnumEntries2.enumEntries(userOriginArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserOrigin.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<UserOrigin>(orCreateKotlinClass, syntax, userOrigin) { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameter$UserOrigin$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AssignmentParameter.UserOrigin fromValue(int value) {
                    return AssignmentParameter.UserOrigin.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AssignmentParameter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$UserOrigin;", "fromValue", "value", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final UserOrigin fromValue(int value) {
                switch (value) {
                    case 0:
                        return UserOrigin.f6025US;
                    case 1:
                        return UserOrigin.f5998GB;
                    case 2:
                        return UserOrigin.f5995EU;
                    case 3:
                        return UserOrigin.f5986AT;
                    case 4:
                        return UserOrigin.f5987BE;
                    case 5:
                        return UserOrigin.f5988BG;
                    case 6:
                        return UserOrigin.f6001HR;
                    case 7:
                        return UserOrigin.f5989CY;
                    case 8:
                        return UserOrigin.f5990CZ;
                    case 9:
                        return UserOrigin.f5992DK;
                    case 10:
                        return UserOrigin.f5993EE;
                    case 11:
                        return UserOrigin.f5996FI;
                    case 12:
                        return UserOrigin.f5997FR;
                    case 13:
                        return UserOrigin.f5991DE;
                    case 14:
                        return UserOrigin.f5999GR;
                    case 15:
                        return UserOrigin.f6002HU;
                    case 16:
                        return UserOrigin.f6004IE;
                    case 17:
                        return UserOrigin.f6007IT;
                    case 18:
                        return UserOrigin.f6011LV;
                    case 19:
                        return UserOrigin.f6009LT;
                    case 20:
                        return UserOrigin.f6010LU;
                    case 21:
                        return UserOrigin.f6012MT;
                    case 22:
                        return UserOrigin.f6014NL;
                    case 23:
                        return UserOrigin.f6016PL;
                    case 24:
                        return UserOrigin.f6017PT;
                    case 25:
                        return UserOrigin.f6018RO;
                    case 26:
                        return UserOrigin.f6022SK;
                    case 27:
                        return UserOrigin.f6021SI;
                    case 28:
                        return UserOrigin.f5994ES;
                    case 29:
                        return UserOrigin.f6019SE;
                    case 30:
                        return UserOrigin.f6020SG;
                    case 31:
                        return UserOrigin.APAC;
                    case 32:
                        return UserOrigin.f6000HK;
                    case 33:
                        return UserOrigin.f6003ID;
                    case 34:
                        return UserOrigin.f6013MY;
                    case 35:
                        return UserOrigin.f6023TH;
                    case 36:
                        return UserOrigin.f6024TW;
                    case 37:
                        return UserOrigin.f6026VN;
                    case 38:
                        return UserOrigin.f6008LI;
                    case 39:
                        return UserOrigin.f6015NO;
                    case 40:
                        return UserOrigin.f6006IS;
                    case 41:
                        return UserOrigin.f6005IN;
                    default:
                        return null;
                }
            }
        }

        public static UserOrigin valueOf(String str) {
            return (UserOrigin) Enum.valueOf(UserOrigin.class, str);
        }

        public static UserOrigin[] values() {
            return (UserOrigin[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AssignmentParameter.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "UNKNOWN", TradingTrendsType.ROBINHOOD, "ROBINHOOD_CREDIT_CARD", "ROBINHOOD_GLOBAL", "ROBINHOOD_WALLET", "ROBINHOOD_BANKING", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Application implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Application[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Application> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Application ROBINHOOD;
        public static final Application ROBINHOOD_BANKING;
        public static final Application ROBINHOOD_CREDIT_CARD;
        public static final Application ROBINHOOD_GLOBAL;
        public static final Application ROBINHOOD_WALLET;
        public static final Application UNKNOWN;
        private final int value;

        private static final /* synthetic */ Application[] $values() {
            return new Application[]{UNKNOWN, ROBINHOOD, ROBINHOOD_CREDIT_CARD, ROBINHOOD_GLOBAL, ROBINHOOD_WALLET, ROBINHOOD_BANKING};
        }

        @JvmStatic
        public static final Application fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Application> getEntries() {
            return $ENTRIES;
        }

        private Application(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Application application = new Application("UNKNOWN", 0, 0);
            UNKNOWN = application;
            ROBINHOOD = new Application(TradingTrendsType.ROBINHOOD, 1, 1);
            ROBINHOOD_CREDIT_CARD = new Application("ROBINHOOD_CREDIT_CARD", 2, 2);
            ROBINHOOD_GLOBAL = new Application("ROBINHOOD_GLOBAL", 3, 3);
            ROBINHOOD_WALLET = new Application("ROBINHOOD_WALLET", 4, 4);
            ROBINHOOD_BANKING = new Application("ROBINHOOD_BANKING", 5, 5);
            Application[] applicationArr$values = $values();
            $VALUES = applicationArr$values;
            $ENTRIES = EnumEntries2.enumEntries(applicationArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Application.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Application>(orCreateKotlinClass, syntax, application) { // from class: com.robinhood.rosetta.experiment_assignment.AssignmentParameter$Application$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AssignmentParameter.Application fromValue(int value) {
                    return AssignmentParameter.Application.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AssignmentParameter.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/experiment_assignment/AssignmentParameter$Application;", "fromValue", "value", "", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Application fromValue(int value) {
                if (value == 0) {
                    return Application.UNKNOWN;
                }
                if (value == 1) {
                    return Application.ROBINHOOD;
                }
                if (value == 2) {
                    return Application.ROBINHOOD_CREDIT_CARD;
                }
                if (value == 3) {
                    return Application.ROBINHOOD_GLOBAL;
                }
                if (value == 4) {
                    return Application.ROBINHOOD_WALLET;
                }
                if (value != 5) {
                    return null;
                }
                return Application.ROBINHOOD_BANKING;
            }
        }

        public static Application valueOf(String str) {
            return (Application) Enum.valueOf(Application.class, str);
        }

        public static Application[] values() {
            return (Application[]) $VALUES.clone();
        }
    }
}
