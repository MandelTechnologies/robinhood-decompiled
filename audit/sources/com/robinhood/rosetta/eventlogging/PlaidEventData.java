package com.robinhood.rosetta.eventlogging;

import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
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

/* compiled from: PlaidEventData.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 :2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002:;BÏ\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ\b\u00101\u001a\u00020\u0002H\u0017J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u000105H\u0096\u0002J\b\u00106\u001a\u000207H\u0016J\b\u00108\u001a\u00020\u0006H\u0016JÎ\u0001\u00109\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\u00062\b\b\u0002\u0010\f\u001a\u00020\u00062\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u0010\u001a\u00020\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u00062\b\b\u0002\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00062\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0019R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001fR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001fR\u0016\u0010\t\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001fR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001fR\u0016\u0010\u000b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001fR\u0016\u0010\f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001fR\u0016\u0010\r\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001fR\u0016\u0010\u000e\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001fR\u0016\u0010\u000f\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001fR\u0016\u0010\u0010\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001fR\u0016\u0010\u0011\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001fR\u0016\u0010\u0012\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001fR\u0016\u0010\u0013\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001fR\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001fR\u0016\u0010\u0015\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001fR\u0016\u0010\u0016\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001fR\u0016\u0010\u0017\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001f¨\u0006<"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventData;", "Lcom/squareup/wire/Message;", "", "event", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "event_name", "", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", "source_tag", "masked_accounts", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "getEvent_name", "()Ljava/lang/String;", "getError_code", "getError_message", "getError_type", "getDisplay_message", "getExit_status", "getInstitution_id", "getInstitution_name", "getInstitution_search_query", "getLink_session_id", "getMfa_type", "getRequest_id", "getPlaid_timestamp", "getView_name", "getStatus", "getAccounts", "getSource_tag", "getMasked_accounts", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Event", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class PlaidEventData extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 16, tag = 16)
    private final String accounts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "displayMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final String display_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorCode", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final String error_code;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorMessage", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final String error_message;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "errorType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 4)
    private final String error_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.PlaidEventData$Event#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 18)
    private final Event event;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 1)
    private final String event_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exitStatus", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 6)
    private final String exit_status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 7)
    private final String institution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 8)
    private final String institution_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionSearchQuery", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 9, tag = 9)
    private final String institution_search_query;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "linkSessionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 10, tag = 10)
    private final String link_session_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "maskedAccounts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 18, tag = 1016)
    private final String masked_accounts;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "mfaType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 11, tag = 11)
    private final String mfa_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "plaidTimestamp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 13, tag = 13)
    private final String plaid_timestamp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "requestId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 12, tag = 12)
    private final String request_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "sourceTag", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 17, tag = 17)
    private final String source_tag;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 15, tag = 15)
    private final String status;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "viewName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 14, tag = 14)
    private final String view_name;

    public PlaidEventData() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1048575, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24501newBuilder();
    }

    public final Event getEvent() {
        return this.event;
    }

    public /* synthetic */ PlaidEventData(Event event, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Event.EVENT_TYPE_UNSPECIFIED : event, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) == 0 ? str18 : "", (i & 524288) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getEvent_name() {
        return this.event_name;
    }

    public final String getError_code() {
        return this.error_code;
    }

    public final String getError_message() {
        return this.error_message;
    }

    public final String getError_type() {
        return this.error_type;
    }

    public final String getDisplay_message() {
        return this.display_message;
    }

    public final String getExit_status() {
        return this.exit_status;
    }

    public final String getInstitution_id() {
        return this.institution_id;
    }

    public final String getInstitution_name() {
        return this.institution_name;
    }

    public final String getInstitution_search_query() {
        return this.institution_search_query;
    }

    public final String getLink_session_id() {
        return this.link_session_id;
    }

    public final String getMfa_type() {
        return this.mfa_type;
    }

    public final String getRequest_id() {
        return this.request_id;
    }

    public final String getPlaid_timestamp() {
        return this.plaid_timestamp;
    }

    public final String getView_name() {
        return this.view_name;
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getAccounts() {
        return this.accounts;
    }

    public final String getSource_tag() {
        return this.source_tag;
    }

    public final String getMasked_accounts() {
        return this.masked_accounts;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidEventData(Event event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(masked_accounts, "masked_accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event = event;
        this.event_name = event_name;
        this.error_code = error_code;
        this.error_message = error_message;
        this.error_type = error_type;
        this.display_message = display_message;
        this.exit_status = exit_status;
        this.institution_id = institution_id;
        this.institution_name = institution_name;
        this.institution_search_query = institution_search_query;
        this.link_session_id = link_session_id;
        this.mfa_type = mfa_type;
        this.request_id = request_id;
        this.plaid_timestamp = plaid_timestamp;
        this.view_name = view_name;
        this.status = status;
        this.accounts = accounts2;
        this.source_tag = source_tag;
        this.masked_accounts = masked_accounts;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24501newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidEventData)) {
            return false;
        }
        PlaidEventData plaidEventData = (PlaidEventData) other;
        return Intrinsics.areEqual(unknownFields(), plaidEventData.unknownFields()) && this.event == plaidEventData.event && Intrinsics.areEqual(this.event_name, plaidEventData.event_name) && Intrinsics.areEqual(this.error_code, plaidEventData.error_code) && Intrinsics.areEqual(this.error_message, plaidEventData.error_message) && Intrinsics.areEqual(this.error_type, plaidEventData.error_type) && Intrinsics.areEqual(this.display_message, plaidEventData.display_message) && Intrinsics.areEqual(this.exit_status, plaidEventData.exit_status) && Intrinsics.areEqual(this.institution_id, plaidEventData.institution_id) && Intrinsics.areEqual(this.institution_name, plaidEventData.institution_name) && Intrinsics.areEqual(this.institution_search_query, plaidEventData.institution_search_query) && Intrinsics.areEqual(this.link_session_id, plaidEventData.link_session_id) && Intrinsics.areEqual(this.mfa_type, plaidEventData.mfa_type) && Intrinsics.areEqual(this.request_id, plaidEventData.request_id) && Intrinsics.areEqual(this.plaid_timestamp, plaidEventData.plaid_timestamp) && Intrinsics.areEqual(this.view_name, plaidEventData.view_name) && Intrinsics.areEqual(this.status, plaidEventData.status) && Intrinsics.areEqual(this.accounts, plaidEventData.accounts) && Intrinsics.areEqual(this.source_tag, plaidEventData.source_tag) && Intrinsics.areEqual(this.masked_accounts, plaidEventData.masked_accounts);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((((((((((((((((((((((((((((unknownFields().hashCode() * 37) + this.event.hashCode()) * 37) + this.event_name.hashCode()) * 37) + this.error_code.hashCode()) * 37) + this.error_message.hashCode()) * 37) + this.error_type.hashCode()) * 37) + this.display_message.hashCode()) * 37) + this.exit_status.hashCode()) * 37) + this.institution_id.hashCode()) * 37) + this.institution_name.hashCode()) * 37) + this.institution_search_query.hashCode()) * 37) + this.link_session_id.hashCode()) * 37) + this.mfa_type.hashCode()) * 37) + this.request_id.hashCode()) * 37) + this.plaid_timestamp.hashCode()) * 37) + this.view_name.hashCode()) * 37) + this.status.hashCode()) * 37) + this.accounts.hashCode()) * 37) + this.source_tag.hashCode()) * 37) + this.masked_accounts.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event=" + this.event);
        arrayList.add("event_name=" + Internal.sanitize(this.event_name));
        arrayList.add("error_code=" + Internal.sanitize(this.error_code));
        arrayList.add("error_message=" + Internal.sanitize(this.error_message));
        arrayList.add("error_type=" + Internal.sanitize(this.error_type));
        arrayList.add("display_message=" + Internal.sanitize(this.display_message));
        arrayList.add("exit_status=" + Internal.sanitize(this.exit_status));
        arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
        arrayList.add("institution_name=" + Internal.sanitize(this.institution_name));
        arrayList.add("institution_search_query=" + Internal.sanitize(this.institution_search_query));
        arrayList.add("link_session_id=" + Internal.sanitize(this.link_session_id));
        arrayList.add("mfa_type=" + Internal.sanitize(this.mfa_type));
        arrayList.add("request_id=" + Internal.sanitize(this.request_id));
        arrayList.add("plaid_timestamp=" + Internal.sanitize(this.plaid_timestamp));
        arrayList.add("view_name=" + Internal.sanitize(this.view_name));
        arrayList.add("status=" + Internal.sanitize(this.status));
        arrayList.add("accounts=" + Internal.sanitize(this.accounts));
        arrayList.add("source_tag=" + Internal.sanitize(this.source_tag));
        arrayList.add("masked_accounts=" + Internal.sanitize(this.masked_accounts));
        return CollectionsKt.joinToString$default(arrayList, ", ", "PlaidEventData{", "}", 0, null, null, 56, null);
    }

    public final PlaidEventData copy(Event event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(event_name, "event_name");
        Intrinsics.checkNotNullParameter(error_code, "error_code");
        Intrinsics.checkNotNullParameter(error_message, "error_message");
        Intrinsics.checkNotNullParameter(error_type, "error_type");
        Intrinsics.checkNotNullParameter(display_message, "display_message");
        Intrinsics.checkNotNullParameter(exit_status, "exit_status");
        Intrinsics.checkNotNullParameter(institution_id, "institution_id");
        Intrinsics.checkNotNullParameter(institution_name, "institution_name");
        Intrinsics.checkNotNullParameter(institution_search_query, "institution_search_query");
        Intrinsics.checkNotNullParameter(link_session_id, "link_session_id");
        Intrinsics.checkNotNullParameter(mfa_type, "mfa_type");
        Intrinsics.checkNotNullParameter(request_id, "request_id");
        Intrinsics.checkNotNullParameter(plaid_timestamp, "plaid_timestamp");
        Intrinsics.checkNotNullParameter(view_name, "view_name");
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(accounts2, "accounts");
        Intrinsics.checkNotNullParameter(source_tag, "source_tag");
        Intrinsics.checkNotNullParameter(masked_accounts, "masked_accounts");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidEventData(event, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, source_tag, masked_accounts, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.PlaidEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEvent() != PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED) {
                    size += PlaidEventData.Event.ADAPTER.encodedSizeWithTag(18, value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(5, value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(6, value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(7, value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(8, value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(9, value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(10, value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(11, value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(12, value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(13, value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(14, value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(15, value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(16, value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(17, value.getSource_tag());
                }
                return !Intrinsics.areEqual(value.getMasked_accounts(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1016, value.getMasked_accounts()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent() != PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED) {
                    PlaidEventData.Event.ADAPTER.encodeWithTag(writer, 18, (int) value.getEvent());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_name());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getSource_tag());
                }
                if (!Intrinsics.areEqual(value.getMasked_accounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1016, (int) value.getMasked_accounts());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getMasked_accounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1016, (int) value.getMasked_accounts());
                }
                if (!Intrinsics.areEqual(value.getSource_tag(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 17, (int) value.getSource_tag());
                }
                if (!Intrinsics.areEqual(value.getAccounts(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 16, (int) value.getAccounts());
                }
                if (!Intrinsics.areEqual(value.getStatus(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 15, (int) value.getStatus());
                }
                if (!Intrinsics.areEqual(value.getView_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 14, (int) value.getView_name());
                }
                if (!Intrinsics.areEqual(value.getPlaid_timestamp(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 13, (int) value.getPlaid_timestamp());
                }
                if (!Intrinsics.areEqual(value.getRequest_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 12, (int) value.getRequest_id());
                }
                if (!Intrinsics.areEqual(value.getMfa_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 11, (int) value.getMfa_type());
                }
                if (!Intrinsics.areEqual(value.getLink_session_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 10, (int) value.getLink_session_id());
                }
                if (!Intrinsics.areEqual(value.getInstitution_search_query(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 9, (int) value.getInstitution_search_query());
                }
                if (!Intrinsics.areEqual(value.getInstitution_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 8, (int) value.getInstitution_name());
                }
                if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 7, (int) value.getInstitution_id());
                }
                if (!Intrinsics.areEqual(value.getExit_status(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getExit_status());
                }
                if (!Intrinsics.areEqual(value.getDisplay_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getDisplay_message());
                }
                if (!Intrinsics.areEqual(value.getError_type(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getError_type());
                }
                if (!Intrinsics.areEqual(value.getError_message(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getError_message());
                }
                if (!Intrinsics.areEqual(value.getError_code(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getError_code());
                }
                if (!Intrinsics.areEqual(value.getEvent_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_name());
                }
                if (value.getEvent() != PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED) {
                    PlaidEventData.Event.ADAPTER.encodeWithTag(writer, 18, (int) value.getEvent());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidEventData decode(ProtoReader reader) throws IOException {
                String str;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(reader, "reader");
                PlaidEventData.Event event = PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                PlaidEventData.Event eventDecode = event;
                String strDecode = "";
                String strDecode2 = strDecode;
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                String strDecode5 = strDecode4;
                String strDecode6 = strDecode5;
                String strDecode7 = strDecode6;
                String strDecode8 = strDecode7;
                String strDecode9 = strDecode8;
                String strDecode10 = strDecode9;
                String strDecode11 = strDecode10;
                String strDecode12 = strDecode11;
                String strDecode13 = strDecode12;
                String strDecode14 = strDecode13;
                String strDecode15 = strDecode14;
                String strDecode16 = strDecode15;
                String strDecode17 = strDecode16;
                String strDecode18 = strDecode17;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidEventData(eventDecode, strDecode, strDecode2, strDecode3, strDecode4, strDecode5, strDecode6, strDecode7, strDecode8, strDecode9, strDecode10, strDecode11, strDecode12, strDecode13, strDecode14, strDecode15, strDecode16, strDecode17, strDecode18, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag != 1016) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 3:
                                strDecode3 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 4:
                                strDecode4 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 5:
                                strDecode5 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 6:
                                strDecode6 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 7:
                                strDecode7 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 8:
                                strDecode8 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 9:
                                strDecode9 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 10:
                                strDecode10 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 11:
                                strDecode11 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 12:
                                strDecode12 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 13:
                                strDecode13 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 14:
                                strDecode14 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 15:
                                strDecode15 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 16:
                                strDecode16 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 17:
                                strDecode17 = ProtoAdapter.STRING.decode(reader);
                                continue;
                            case 18:
                                try {
                                    eventDecode = PlaidEventData.Event.ADAPTER.decode(reader);
                                    continue;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    str = strDecode;
                                    str2 = strDecode2;
                                    str3 = strDecode3;
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                    break;
                                }
                            default:
                                reader.readUnknownField(iNextTag);
                                str = strDecode;
                                str2 = strDecode2;
                                str3 = strDecode3;
                                break;
                        }
                        strDecode = str;
                        strDecode2 = str2;
                        strDecode3 = str3;
                    } else {
                        strDecode18 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidEventData redact(PlaidEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.copy((524287 & 1) != 0 ? value.event : null, (524287 & 2) != 0 ? value.event_name : null, (524287 & 4) != 0 ? value.error_code : null, (524287 & 8) != 0 ? value.error_message : null, (524287 & 16) != 0 ? value.error_type : null, (524287 & 32) != 0 ? value.display_message : null, (524287 & 64) != 0 ? value.exit_status : null, (524287 & 128) != 0 ? value.institution_id : null, (524287 & 256) != 0 ? value.institution_name : null, (524287 & 512) != 0 ? value.institution_search_query : null, (524287 & 1024) != 0 ? value.link_session_id : null, (524287 & 2048) != 0 ? value.mfa_type : null, (524287 & 4096) != 0 ? value.request_id : null, (524287 & 8192) != 0 ? value.plaid_timestamp : null, (524287 & 16384) != 0 ? value.view_name : null, (524287 & 32768) != 0 ? value.status : null, (524287 & 65536) != 0 ? value.accounts : null, (524287 & 131072) != 0 ? value.source_tag : null, (524287 & 262144) != 0 ? value.masked_accounts : null, (524287 & 524288) != 0 ? value.unknownFields() : ByteString.EMPTY);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaidEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "ON_EVENT", "ON_SUCCESS", "ON_EXIT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Event implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Event[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Event> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Event EVENT_TYPE_UNSPECIFIED;
        public static final Event ON_EVENT;
        public static final Event ON_EXIT;
        public static final Event ON_SUCCESS;
        private final int value;

        private static final /* synthetic */ Event[] $values() {
            return new Event[]{EVENT_TYPE_UNSPECIFIED, ON_EVENT, ON_SUCCESS, ON_EXIT};
        }

        @JvmStatic
        public static final Event fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Event> getEntries() {
            return $ENTRIES;
        }

        private Event(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Event event = new Event("EVENT_TYPE_UNSPECIFIED", 0, 0);
            EVENT_TYPE_UNSPECIFIED = event;
            ON_EVENT = new Event("ON_EVENT", 1, 1);
            ON_SUCCESS = new Event("ON_SUCCESS", 2, 2);
            ON_EXIT = new Event("ON_EXIT", 3, 3);
            Event[] eventArr$values = $values();
            $VALUES = eventArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Event.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Event>(orCreateKotlinClass, syntax, event) { // from class: com.robinhood.rosetta.eventlogging.PlaidEventData$Event$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public PlaidEventData.Event fromValue(int value) {
                    return PlaidEventData.Event.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: PlaidEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Event fromValue(int value) {
                if (value == 0) {
                    return Event.EVENT_TYPE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Event.ON_EVENT;
                }
                if (value == 2) {
                    return Event.ON_SUCCESS;
                }
                if (value != 3) {
                    return null;
                }
                return Event.ON_EXIT;
            }
        }

        public static Event valueOf(String str) {
            return (Event) Enum.valueOf(Event.class, str);
        }

        public static Event[] values() {
            return (Event[]) $VALUES.clone();
        }
    }
}
