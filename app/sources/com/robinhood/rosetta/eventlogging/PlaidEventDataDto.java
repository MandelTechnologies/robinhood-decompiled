package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.models.api.ErrorResponse;
import com.robinhood.rosetta.eventlogging.PlaidEventData;
import com.robinhood.rosetta.eventlogging.PlaidEventDataDto;
import com.squareup.wire.ProtoAdapter;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerialName;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptors3;
import kotlinx.serialization.encoding.Decoding2;
import kotlinx.serialization.encoding.Encoding3;
import kotlinx.serialization.encoding.Encoding4;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.json.JsonAnnotations2;

/* compiled from: PlaidEventDataDto.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b+\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 C2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0005BCDEFB\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BÇ\u0001\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u001dJÄ\u0001\u00103\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u000b2\b\b\u0002\u0010\u0010\u001a\u00020\u000b2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\b\b\u0002\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\u0015\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0018\u001a\u00020\u000b2\b\b\u0002\u0010\u0019\u001a\u00020\u000b2\b\b\u0002\u0010\u001a\u001a\u00020\u000b2\b\b\u0002\u0010\u001b\u001a\u00020\u000b2\b\b\u0002\u0010\u001c\u001a\u00020\u000bJ\b\u00104\u001a\u00020\u0002H\u0016J\b\u00105\u001a\u00020\u000bH\u0016J\u0013\u00106\u001a\u0002072\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u00020;H\u0016J\u0018\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020;H\u0016J\b\u0010A\u001a\u00020;H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b \u0010!R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\"\u0010!R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b#\u0010!R\u0011\u0010\u000e\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b$\u0010!R\u0011\u0010\u000f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b%\u0010!R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b&\u0010!R\u0011\u0010\u0011\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b'\u0010!R\u0011\u0010\u0012\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b(\u0010!R\u0011\u0010\u0013\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010!R\u0011\u0010\u0014\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b*\u0010!R\u0011\u0010\u0015\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b+\u0010!R\u0011\u0010\u0016\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b,\u0010!R\u0011\u0010\u0017\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b-\u0010!R\u0011\u0010\u0018\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b.\u0010!R\u0011\u0010\u0019\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b/\u0010!R\u0011\u0010\u001a\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b0\u0010!R\u0011\u0010\u001b\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b1\u0010!R\u0011\u0010\u001c\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b2\u0010!¨\u0006G"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate;)V", "event", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "event_name", "", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", "source_tag", "masked_accounts", "(Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "getEvent_name", "()Ljava/lang/String;", "getError_code", "getError_message", "getError_type", "getDisplay_message", "getExit_status", "getInstitution_id", "getInstitution_name", "getInstitution_search_query", "getLink_session_id", "getMfa_type", "getRequest_id", "getPlaid_timestamp", "getView_name", "getStatus", "getAccounts", "getSource_tag", "getMasked_accounts", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EventDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class PlaidEventDataDto implements Dto3<PlaidEventData>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<PlaidEventDataDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<PlaidEventDataDto, PlaidEventData>> binaryBase64Serializer$delegate;
    private static final PlaidEventDataDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ PlaidEventDataDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private PlaidEventDataDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EventDto getEvent() {
        return this.surrogate.getEvent();
    }

    public final String getEvent_name() {
        return this.surrogate.getEvent_name();
    }

    public final String getError_code() {
        return this.surrogate.getError_code();
    }

    public final String getError_message() {
        return this.surrogate.getError_message();
    }

    public final String getError_type() {
        return this.surrogate.getError_type();
    }

    public final String getDisplay_message() {
        return this.surrogate.getDisplay_message();
    }

    public final String getExit_status() {
        return this.surrogate.getExit_status();
    }

    public final String getInstitution_id() {
        return this.surrogate.getInstitution_id();
    }

    public final String getInstitution_name() {
        return this.surrogate.getInstitution_name();
    }

    public final String getInstitution_search_query() {
        return this.surrogate.getInstitution_search_query();
    }

    public final String getLink_session_id() {
        return this.surrogate.getLink_session_id();
    }

    public final String getMfa_type() {
        return this.surrogate.getMfa_type();
    }

    public final String getRequest_id() {
        return this.surrogate.getRequest_id();
    }

    public final String getPlaid_timestamp() {
        return this.surrogate.getPlaid_timestamp();
    }

    public final String getView_name() {
        return this.surrogate.getView_name();
    }

    public final String getStatus() {
        return this.surrogate.getStatus();
    }

    public final String getAccounts() {
        return this.surrogate.getAccounts();
    }

    public final String getSource_tag() {
        return this.surrogate.getSource_tag();
    }

    public final String getMasked_accounts() {
        return this.surrogate.getMasked_accounts();
    }

    public /* synthetic */ PlaidEventDataDto(EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventDto.INSTANCE.getZeroValue() : eventDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PlaidEventDataDto(EventDto event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts) {
        this(new Surrogate(event, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, source_tag, masked_accounts));
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
    }

    public static /* synthetic */ PlaidEventDataDto copy$default(PlaidEventDataDto plaidEventDataDto, EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
        String masked_accounts;
        String str19;
        EventDto event = (i & 1) != 0 ? plaidEventDataDto.surrogate.getEvent() : eventDto;
        String event_name = (i & 2) != 0 ? plaidEventDataDto.surrogate.getEvent_name() : str;
        String error_code = (i & 4) != 0 ? plaidEventDataDto.surrogate.getError_code() : str2;
        String error_message = (i & 8) != 0 ? plaidEventDataDto.surrogate.getError_message() : str3;
        String error_type = (i & 16) != 0 ? plaidEventDataDto.surrogate.getError_type() : str4;
        String display_message = (i & 32) != 0 ? plaidEventDataDto.surrogate.getDisplay_message() : str5;
        String exit_status = (i & 64) != 0 ? plaidEventDataDto.surrogate.getExit_status() : str6;
        String institution_id = (i & 128) != 0 ? plaidEventDataDto.surrogate.getInstitution_id() : str7;
        String institution_name = (i & 256) != 0 ? plaidEventDataDto.surrogate.getInstitution_name() : str8;
        String institution_search_query = (i & 512) != 0 ? plaidEventDataDto.surrogate.getInstitution_search_query() : str9;
        String link_session_id = (i & 1024) != 0 ? plaidEventDataDto.surrogate.getLink_session_id() : str10;
        String mfa_type = (i & 2048) != 0 ? plaidEventDataDto.surrogate.getMfa_type() : str11;
        String request_id = (i & 4096) != 0 ? plaidEventDataDto.surrogate.getRequest_id() : str12;
        String plaid_timestamp = (i & 8192) != 0 ? plaidEventDataDto.surrogate.getPlaid_timestamp() : str13;
        EventDto eventDto2 = event;
        String view_name = (i & 16384) != 0 ? plaidEventDataDto.surrogate.getView_name() : str14;
        String status = (i & 32768) != 0 ? plaidEventDataDto.surrogate.getStatus() : str15;
        String accounts2 = (i & 65536) != 0 ? plaidEventDataDto.surrogate.getAccounts() : str16;
        String source_tag = (i & 131072) != 0 ? plaidEventDataDto.surrogate.getSource_tag() : str17;
        if ((i & 262144) != 0) {
            str19 = source_tag;
            masked_accounts = plaidEventDataDto.surrogate.getMasked_accounts();
        } else {
            masked_accounts = str18;
            str19 = source_tag;
        }
        return plaidEventDataDto.copy(eventDto2, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, str19, masked_accounts);
    }

    public final PlaidEventDataDto copy(EventDto event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts) {
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
        return new PlaidEventDataDto(new Surrogate(event, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, source_tag, masked_accounts));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public PlaidEventData toProto() {
        return new PlaidEventData((PlaidEventData.Event) this.surrogate.getEvent().toProto(), this.surrogate.getEvent_name(), this.surrogate.getError_code(), this.surrogate.getError_message(), this.surrogate.getError_type(), this.surrogate.getDisplay_message(), this.surrogate.getExit_status(), this.surrogate.getInstitution_id(), this.surrogate.getInstitution_name(), this.surrogate.getInstitution_search_query(), this.surrogate.getLink_session_id(), this.surrogate.getMfa_type(), this.surrogate.getRequest_id(), this.surrogate.getPlaid_timestamp(), this.surrogate.getView_name(), this.surrogate.getStatus(), this.surrogate.getAccounts(), this.surrogate.getSource_tag(), this.surrogate.getMasked_accounts(), null, 524288, null);
    }

    public String toString() {
        return "[PlaidEventDataDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof PlaidEventDataDto) && Intrinsics.areEqual(((PlaidEventDataDto) other).surrogate, this.surrogate);
        }
        return true;
    }

    public int hashCode() {
        return this.surrogate.hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlaidEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 i2\u00020\u0001:\u0002hiBÅ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018BÙ\u0001\b\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u001a\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u0017\u0010\u001dJ\t\u0010G\u001a\u00020\u0003HÆ\u0003J\t\u0010H\u001a\u00020\u0005HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0005HÆ\u0003J\t\u0010K\u001a\u00020\u0005HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\u0005HÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\t\u0010R\u001a\u00020\u0005HÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\u0005HÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003JÇ\u0001\u0010Z\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\u00052\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u0005HÆ\u0001J\u0013\u0010[\u001a\u00020\\2\b\u0010]\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010^\u001a\u00020\u001aHÖ\u0001J\t\u0010_\u001a\u00020\u0005HÖ\u0001J%\u0010`\u001a\u00020a2\u0006\u0010b\u001a\u00020\u00002\u0006\u0010c\u001a\u00020d2\u0006\u0010e\u001a\u00020fH\u0001¢\u0006\u0002\bgR\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010$R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010$R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b'\u0010\u001f\u001a\u0004\b(\u0010$R\u001c\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010$R\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010$R\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u001f\u001a\u0004\b.\u0010$R\u001c\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b/\u0010\u001f\u001a\u0004\b0\u0010$R\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b1\u0010\u001f\u001a\u0004\b2\u0010$R\u001c\u0010\r\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b3\u0010\u001f\u001a\u0004\b4\u0010$R\u001c\u0010\u000e\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b5\u0010\u001f\u001a\u0004\b6\u0010$R\u001c\u0010\u000f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b7\u0010\u001f\u001a\u0004\b8\u0010$R\u001c\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b9\u0010\u001f\u001a\u0004\b:\u0010$R\u001c\u0010\u0011\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b;\u0010\u001f\u001a\u0004\b<\u0010$R\u001c\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b=\u0010\u001f\u001a\u0004\b>\u0010$R\u001c\u0010\u0013\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b?\u0010\u001f\u001a\u0004\b@\u0010$R\u001c\u0010\u0014\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bA\u0010\u001f\u001a\u0004\bB\u0010$R\u001c\u0010\u0015\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bC\u0010\u001f\u001a\u0004\bD\u0010$R\u001c\u0010\u0016\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\bE\u0010\u001f\u001a\u0004\bF\u0010$¨\u0006j"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate;", "", "event", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "event_name", "", ErrorResponse.ERROR_CODE, "error_message", "error_type", "display_message", "exit_status", "institution_id", "institution_name", "institution_search_query", "link_session_id", "mfa_type", "request_id", "plaid_timestamp", "view_name", "status", "accounts", "source_tag", "masked_accounts", "<init>", "(Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent$annotations", "()V", "getEvent", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "getEvent_name$annotations", "getEvent_name", "()Ljava/lang/String;", "getError_code$annotations", "getError_code", "getError_message$annotations", "getError_message", "getError_type$annotations", "getError_type", "getDisplay_message$annotations", "getDisplay_message", "getExit_status$annotations", "getExit_status", "getInstitution_id$annotations", "getInstitution_id", "getInstitution_name$annotations", "getInstitution_name", "getInstitution_search_query$annotations", "getInstitution_search_query", "getLink_session_id$annotations", "getLink_session_id", "getMfa_type$annotations", "getMfa_type", "getRequest_id$annotations", "getRequest_id", "getPlaid_timestamp$annotations", "getPlaid_timestamp", "getView_name$annotations", "getView_name", "getStatus$annotations", "getStatus", "getAccounts$annotations", "getAccounts", "getSource_tag$annotations", "getSource_tag", "getMasked_accounts$annotations", "getMasked_accounts", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String accounts;
        private final String display_message;
        private final String error_code;
        private final String error_message;
        private final String error_type;
        private final EventDto event;
        private final String event_name;
        private final String exit_status;
        private final String institution_id;
        private final String institution_name;
        private final String institution_search_query;
        private final String link_session_id;
        private final String masked_accounts;
        private final String mfa_type;
        private final String plaid_timestamp;
        private final String request_id;
        private final String source_tag;
        private final String status;
        private final String view_name;

        public Surrogate() {
            this((EventDto) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 524287, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, Object obj) {
            String str19;
            String str20;
            EventDto eventDto2 = (i & 1) != 0 ? surrogate.event : eventDto;
            String str21 = (i & 2) != 0 ? surrogate.event_name : str;
            String str22 = (i & 4) != 0 ? surrogate.error_code : str2;
            String str23 = (i & 8) != 0 ? surrogate.error_message : str3;
            String str24 = (i & 16) != 0 ? surrogate.error_type : str4;
            String str25 = (i & 32) != 0 ? surrogate.display_message : str5;
            String str26 = (i & 64) != 0 ? surrogate.exit_status : str6;
            String str27 = (i & 128) != 0 ? surrogate.institution_id : str7;
            String str28 = (i & 256) != 0 ? surrogate.institution_name : str8;
            String str29 = (i & 512) != 0 ? surrogate.institution_search_query : str9;
            String str30 = (i & 1024) != 0 ? surrogate.link_session_id : str10;
            String str31 = (i & 2048) != 0 ? surrogate.mfa_type : str11;
            String str32 = (i & 4096) != 0 ? surrogate.request_id : str12;
            String str33 = (i & 8192) != 0 ? surrogate.plaid_timestamp : str13;
            EventDto eventDto3 = eventDto2;
            String str34 = (i & 16384) != 0 ? surrogate.view_name : str14;
            String str35 = (i & 32768) != 0 ? surrogate.status : str15;
            String str36 = (i & 65536) != 0 ? surrogate.accounts : str16;
            String str37 = (i & 131072) != 0 ? surrogate.source_tag : str17;
            if ((i & 262144) != 0) {
                str20 = str37;
                str19 = surrogate.masked_accounts;
            } else {
                str19 = str18;
                str20 = str37;
            }
            return surrogate.copy(eventDto3, str21, str22, str23, str24, str25, str26, str27, str28, str29, str30, str31, str32, str33, str34, str35, str36, str20, str19);
        }

        @SerialName("accounts")
        @JsonAnnotations2(names = {"accounts"})
        public static /* synthetic */ void getAccounts$annotations() {
        }

        @SerialName("displayMessage")
        @JsonAnnotations2(names = {"display_message"})
        public static /* synthetic */ void getDisplay_message$annotations() {
        }

        @SerialName("errorCode")
        @JsonAnnotations2(names = {ErrorResponse.ERROR_CODE})
        public static /* synthetic */ void getError_code$annotations() {
        }

        @SerialName("errorMessage")
        @JsonAnnotations2(names = {"error_message"})
        public static /* synthetic */ void getError_message$annotations() {
        }

        @SerialName("errorType")
        @JsonAnnotations2(names = {"error_type"})
        public static /* synthetic */ void getError_type$annotations() {
        }

        @SerialName("event")
        @JsonAnnotations2(names = {"event"})
        public static /* synthetic */ void getEvent$annotations() {
        }

        @SerialName("eventName")
        @JsonAnnotations2(names = {"event_name"})
        public static /* synthetic */ void getEvent_name$annotations() {
        }

        @SerialName("exitStatus")
        @JsonAnnotations2(names = {"exit_status"})
        public static /* synthetic */ void getExit_status$annotations() {
        }

        @SerialName("institutionId")
        @JsonAnnotations2(names = {"institution_id"})
        public static /* synthetic */ void getInstitution_id$annotations() {
        }

        @SerialName("institutionName")
        @JsonAnnotations2(names = {"institution_name"})
        public static /* synthetic */ void getInstitution_name$annotations() {
        }

        @SerialName("institutionSearchQuery")
        @JsonAnnotations2(names = {"institution_search_query"})
        public static /* synthetic */ void getInstitution_search_query$annotations() {
        }

        @SerialName("linkSessionId")
        @JsonAnnotations2(names = {"link_session_id"})
        public static /* synthetic */ void getLink_session_id$annotations() {
        }

        @SerialName("maskedAccounts")
        @JsonAnnotations2(names = {"masked_accounts"})
        public static /* synthetic */ void getMasked_accounts$annotations() {
        }

        @SerialName("mfaType")
        @JsonAnnotations2(names = {"mfa_type"})
        public static /* synthetic */ void getMfa_type$annotations() {
        }

        @SerialName("plaidTimestamp")
        @JsonAnnotations2(names = {"plaid_timestamp"})
        public static /* synthetic */ void getPlaid_timestamp$annotations() {
        }

        @SerialName("requestId")
        @JsonAnnotations2(names = {"request_id"})
        public static /* synthetic */ void getRequest_id$annotations() {
        }

        @SerialName("sourceTag")
        @JsonAnnotations2(names = {"source_tag"})
        public static /* synthetic */ void getSource_tag$annotations() {
        }

        @SerialName("status")
        @JsonAnnotations2(names = {"status"})
        public static /* synthetic */ void getStatus$annotations() {
        }

        @SerialName("viewName")
        @JsonAnnotations2(names = {"view_name"})
        public static /* synthetic */ void getView_name$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EventDto getEvent() {
            return this.event;
        }

        /* renamed from: component10, reason: from getter */
        public final String getInstitution_search_query() {
            return this.institution_search_query;
        }

        /* renamed from: component11, reason: from getter */
        public final String getLink_session_id() {
            return this.link_session_id;
        }

        /* renamed from: component12, reason: from getter */
        public final String getMfa_type() {
            return this.mfa_type;
        }

        /* renamed from: component13, reason: from getter */
        public final String getRequest_id() {
            return this.request_id;
        }

        /* renamed from: component14, reason: from getter */
        public final String getPlaid_timestamp() {
            return this.plaid_timestamp;
        }

        /* renamed from: component15, reason: from getter */
        public final String getView_name() {
            return this.view_name;
        }

        /* renamed from: component16, reason: from getter */
        public final String getStatus() {
            return this.status;
        }

        /* renamed from: component17, reason: from getter */
        public final String getAccounts() {
            return this.accounts;
        }

        /* renamed from: component18, reason: from getter */
        public final String getSource_tag() {
            return this.source_tag;
        }

        /* renamed from: component19, reason: from getter */
        public final String getMasked_accounts() {
            return this.masked_accounts;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEvent_name() {
            return this.event_name;
        }

        /* renamed from: component3, reason: from getter */
        public final String getError_code() {
            return this.error_code;
        }

        /* renamed from: component4, reason: from getter */
        public final String getError_message() {
            return this.error_message;
        }

        /* renamed from: component5, reason: from getter */
        public final String getError_type() {
            return this.error_type;
        }

        /* renamed from: component6, reason: from getter */
        public final String getDisplay_message() {
            return this.display_message;
        }

        /* renamed from: component7, reason: from getter */
        public final String getExit_status() {
            return this.exit_status;
        }

        /* renamed from: component8, reason: from getter */
        public final String getInstitution_id() {
            return this.institution_id;
        }

        /* renamed from: component9, reason: from getter */
        public final String getInstitution_name() {
            return this.institution_name;
        }

        public final Surrogate copy(EventDto event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts) {
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
            return new Surrogate(event, event_name, error_code, error_message, error_type, display_message, exit_status, institution_id, institution_name, institution_search_query, link_session_id, mfa_type, request_id, plaid_timestamp, view_name, status, accounts2, source_tag, masked_accounts);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.event == surrogate.event && Intrinsics.areEqual(this.event_name, surrogate.event_name) && Intrinsics.areEqual(this.error_code, surrogate.error_code) && Intrinsics.areEqual(this.error_message, surrogate.error_message) && Intrinsics.areEqual(this.error_type, surrogate.error_type) && Intrinsics.areEqual(this.display_message, surrogate.display_message) && Intrinsics.areEqual(this.exit_status, surrogate.exit_status) && Intrinsics.areEqual(this.institution_id, surrogate.institution_id) && Intrinsics.areEqual(this.institution_name, surrogate.institution_name) && Intrinsics.areEqual(this.institution_search_query, surrogate.institution_search_query) && Intrinsics.areEqual(this.link_session_id, surrogate.link_session_id) && Intrinsics.areEqual(this.mfa_type, surrogate.mfa_type) && Intrinsics.areEqual(this.request_id, surrogate.request_id) && Intrinsics.areEqual(this.plaid_timestamp, surrogate.plaid_timestamp) && Intrinsics.areEqual(this.view_name, surrogate.view_name) && Intrinsics.areEqual(this.status, surrogate.status) && Intrinsics.areEqual(this.accounts, surrogate.accounts) && Intrinsics.areEqual(this.source_tag, surrogate.source_tag) && Intrinsics.areEqual(this.masked_accounts, surrogate.masked_accounts);
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((((((((((this.event.hashCode() * 31) + this.event_name.hashCode()) * 31) + this.error_code.hashCode()) * 31) + this.error_message.hashCode()) * 31) + this.error_type.hashCode()) * 31) + this.display_message.hashCode()) * 31) + this.exit_status.hashCode()) * 31) + this.institution_id.hashCode()) * 31) + this.institution_name.hashCode()) * 31) + this.institution_search_query.hashCode()) * 31) + this.link_session_id.hashCode()) * 31) + this.mfa_type.hashCode()) * 31) + this.request_id.hashCode()) * 31) + this.plaid_timestamp.hashCode()) * 31) + this.view_name.hashCode()) * 31) + this.status.hashCode()) * 31) + this.accounts.hashCode()) * 31) + this.source_tag.hashCode()) * 31) + this.masked_accounts.hashCode();
        }

        public String toString() {
            return "Surrogate(event=" + this.event + ", event_name=" + this.event_name + ", error_code=" + this.error_code + ", error_message=" + this.error_message + ", error_type=" + this.error_type + ", display_message=" + this.display_message + ", exit_status=" + this.exit_status + ", institution_id=" + this.institution_id + ", institution_name=" + this.institution_name + ", institution_search_query=" + this.institution_search_query + ", link_session_id=" + this.link_session_id + ", mfa_type=" + this.mfa_type + ", request_id=" + this.request_id + ", plaid_timestamp=" + this.plaid_timestamp + ", view_name=" + this.view_name + ", status=" + this.status + ", accounts=" + this.accounts + ", source_tag=" + this.source_tag + ", masked_accounts=" + this.masked_accounts + ")";
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return PlaidEventDataDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, SerializationConstructorMarker serializationConstructorMarker) {
            this.event = (i & 1) == 0 ? EventDto.INSTANCE.getZeroValue() : eventDto;
            if ((i & 2) == 0) {
                this.event_name = "";
            } else {
                this.event_name = str;
            }
            if ((i & 4) == 0) {
                this.error_code = "";
            } else {
                this.error_code = str2;
            }
            if ((i & 8) == 0) {
                this.error_message = "";
            } else {
                this.error_message = str3;
            }
            if ((i & 16) == 0) {
                this.error_type = "";
            } else {
                this.error_type = str4;
            }
            if ((i & 32) == 0) {
                this.display_message = "";
            } else {
                this.display_message = str5;
            }
            if ((i & 64) == 0) {
                this.exit_status = "";
            } else {
                this.exit_status = str6;
            }
            if ((i & 128) == 0) {
                this.institution_id = "";
            } else {
                this.institution_id = str7;
            }
            if ((i & 256) == 0) {
                this.institution_name = "";
            } else {
                this.institution_name = str8;
            }
            if ((i & 512) == 0) {
                this.institution_search_query = "";
            } else {
                this.institution_search_query = str9;
            }
            if ((i & 1024) == 0) {
                this.link_session_id = "";
            } else {
                this.link_session_id = str10;
            }
            if ((i & 2048) == 0) {
                this.mfa_type = "";
            } else {
                this.mfa_type = str11;
            }
            if ((i & 4096) == 0) {
                this.request_id = "";
            } else {
                this.request_id = str12;
            }
            if ((i & 8192) == 0) {
                this.plaid_timestamp = "";
            } else {
                this.plaid_timestamp = str13;
            }
            if ((i & 16384) == 0) {
                this.view_name = "";
            } else {
                this.view_name = str14;
            }
            if ((32768 & i) == 0) {
                this.status = "";
            } else {
                this.status = str15;
            }
            if ((65536 & i) == 0) {
                this.accounts = "";
            } else {
                this.accounts = str16;
            }
            if ((131072 & i) == 0) {
                this.source_tag = "";
            } else {
                this.source_tag = str17;
            }
            if ((i & 262144) == 0) {
                this.masked_accounts = "";
            } else {
                this.masked_accounts = str18;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.event != EventDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EventDto.Serializer.INSTANCE, self.event);
            }
            if (!Intrinsics.areEqual(self.event_name, "")) {
                output.encodeStringElement(serialDesc, 1, self.event_name);
            }
            if (!Intrinsics.areEqual(self.error_code, "")) {
                output.encodeStringElement(serialDesc, 2, self.error_code);
            }
            if (!Intrinsics.areEqual(self.error_message, "")) {
                output.encodeStringElement(serialDesc, 3, self.error_message);
            }
            if (!Intrinsics.areEqual(self.error_type, "")) {
                output.encodeStringElement(serialDesc, 4, self.error_type);
            }
            if (!Intrinsics.areEqual(self.display_message, "")) {
                output.encodeStringElement(serialDesc, 5, self.display_message);
            }
            if (!Intrinsics.areEqual(self.exit_status, "")) {
                output.encodeStringElement(serialDesc, 6, self.exit_status);
            }
            if (!Intrinsics.areEqual(self.institution_id, "")) {
                output.encodeStringElement(serialDesc, 7, self.institution_id);
            }
            if (!Intrinsics.areEqual(self.institution_name, "")) {
                output.encodeStringElement(serialDesc, 8, self.institution_name);
            }
            if (!Intrinsics.areEqual(self.institution_search_query, "")) {
                output.encodeStringElement(serialDesc, 9, self.institution_search_query);
            }
            if (!Intrinsics.areEqual(self.link_session_id, "")) {
                output.encodeStringElement(serialDesc, 10, self.link_session_id);
            }
            if (!Intrinsics.areEqual(self.mfa_type, "")) {
                output.encodeStringElement(serialDesc, 11, self.mfa_type);
            }
            if (!Intrinsics.areEqual(self.request_id, "")) {
                output.encodeStringElement(serialDesc, 12, self.request_id);
            }
            if (!Intrinsics.areEqual(self.plaid_timestamp, "")) {
                output.encodeStringElement(serialDesc, 13, self.plaid_timestamp);
            }
            if (!Intrinsics.areEqual(self.view_name, "")) {
                output.encodeStringElement(serialDesc, 14, self.view_name);
            }
            if (!Intrinsics.areEqual(self.status, "")) {
                output.encodeStringElement(serialDesc, 15, self.status);
            }
            if (!Intrinsics.areEqual(self.accounts, "")) {
                output.encodeStringElement(serialDesc, 16, self.accounts);
            }
            if (!Intrinsics.areEqual(self.source_tag, "")) {
                output.encodeStringElement(serialDesc, 17, self.source_tag);
            }
            if (Intrinsics.areEqual(self.masked_accounts, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 18, self.masked_accounts);
        }

        public Surrogate(EventDto event, String event_name, String error_code, String error_message, String error_type, String display_message, String exit_status, String institution_id, String institution_name, String institution_search_query, String link_session_id, String mfa_type, String request_id, String plaid_timestamp, String view_name, String status, String accounts2, String source_tag, String masked_accounts) {
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

        public final EventDto getEvent() {
            return this.event;
        }

        public /* synthetic */ Surrogate(EventDto eventDto, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? EventDto.INSTANCE.getZeroValue() : eventDto, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4, (i & 32) != 0 ? "" : str5, (i & 64) != 0 ? "" : str6, (i & 128) != 0 ? "" : str7, (i & 256) != 0 ? "" : str8, (i & 512) != 0 ? "" : str9, (i & 1024) != 0 ? "" : str10, (i & 2048) != 0 ? "" : str11, (i & 4096) != 0 ? "" : str12, (i & 8192) != 0 ? "" : str13, (i & 16384) != 0 ? "" : str14, (i & 32768) != 0 ? "" : str15, (i & 65536) != 0 ? "" : str16, (i & 131072) != 0 ? "" : str17, (i & 262144) != 0 ? "" : str18);
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
    }

    /* compiled from: PlaidEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<PlaidEventDataDto, PlaidEventData> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<PlaidEventDataDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidEventDataDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<PlaidEventDataDto> getBinaryBase64Serializer() {
            return (KSerializer) PlaidEventDataDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<PlaidEventData> getProtoAdapter() {
            return PlaidEventData.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidEventDataDto getZeroValue() {
            return PlaidEventDataDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public PlaidEventDataDto fromProto(PlaidEventData proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new PlaidEventDataDto(new Surrogate(EventDto.INSTANCE.fromProto(proto.getEvent()), proto.getEvent_name(), proto.getError_code(), proto.getError_message(), proto.getError_type(), proto.getDisplay_message(), proto.getExit_status(), proto.getInstitution_id(), proto.getInstitution_name(), proto.getInstitution_search_query(), proto.getLink_session_id(), proto.getMfa_type(), proto.getRequest_id(), proto.getPlaid_timestamp(), proto.getView_name(), proto.getStatus(), proto.getAccounts(), proto.getSource_tag(), proto.getMasked_accounts()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PlaidEventDataDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return PlaidEventDataDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new PlaidEventDataDto(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PlaidEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_TYPE_UNSPECIFIED", "ON_EVENT", "ON_SUCCESS", "ON_EXIT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventDto implements Dto2<PlaidEventData.Event>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventDto, PlaidEventData.Event>> binaryBase64Serializer$delegate;
        public static final EventDto EVENT_TYPE_UNSPECIFIED = new EVENT_TYPE_UNSPECIFIED("EVENT_TYPE_UNSPECIFIED", 0);
        public static final EventDto ON_EVENT = new ON_EVENT("ON_EVENT", 1);
        public static final EventDto ON_SUCCESS = new ON_SUCCESS("ON_SUCCESS", 2);
        public static final EventDto ON_EXIT = new ON_EXIT("ON_EXIT", 3);

        private static final /* synthetic */ EventDto[] $values() {
            return new EventDto[]{EVENT_TYPE_UNSPECIFIED, ON_EVENT, ON_SUCCESS, ON_EXIT};
        }

        public /* synthetic */ EventDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PlaidEventDataDto.EventDto.EVENT_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_TYPE_UNSPECIFIED extends EventDto {
            EVENT_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidEventData.Event toProto() {
                return PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED;
            }
        }

        private EventDto(String str, int i) {
        }

        static {
            EventDto[] eventDtoArr$values = $values();
            $VALUES = eventDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.PlaidEventDataDto$EventDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return PlaidEventDataDto.EventDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PlaidEventDataDto.EventDto.ON_EVENT", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ON_EVENT extends EventDto {
            ON_EVENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidEventData.Event toProto() {
                return PlaidEventData.Event.ON_EVENT;
            }
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PlaidEventDataDto.EventDto.ON_SUCCESS", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ON_SUCCESS extends EventDto {
            ON_SUCCESS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidEventData.Event toProto() {
                return PlaidEventData.Event.ON_SUCCESS;
            }
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/PlaidEventDataDto.EventDto.ON_EXIT", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ON_EXIT extends EventDto {
            ON_EXIT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public PlaidEventData.Event toProto() {
                return PlaidEventData.Event.ON_EXIT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventData$Event;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventDto, PlaidEventData.Event> {

            /* compiled from: PlaidEventDataDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[PlaidEventData.Event.values().length];
                    try {
                        iArr[PlaidEventData.Event.EVENT_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlaidEventData.Event.ON_EVENT.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[PlaidEventData.Event.ON_SUCCESS.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[PlaidEventData.Event.ON_EXIT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventDto> getBinaryBase64Serializer() {
                return (KSerializer) EventDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<PlaidEventData.Event> getProtoAdapter() {
                return PlaidEventData.Event.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventDto getZeroValue() {
                return EventDto.EVENT_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventDto fromProto(PlaidEventData.Event proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventDto.EVENT_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventDto.ON_EVENT;
                }
                if (i == 3) {
                    return EventDto.ON_SUCCESS;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventDto.ON_EXIT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: PlaidEventDataDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$EventDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventDto, PlaidEventData.Event> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.PlaidEventData.Event", EventDto.getEntries(), EventDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventDto valueOf(String str) {
            return (EventDto) Enum.valueOf(EventDto.class, str);
        }

        public static EventDto[] values() {
            return (EventDto[]) $VALUES.clone();
        }
    }

    /* compiled from: PlaidEventDataDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<PlaidEventDataDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.PlaidEventData", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, PlaidEventDataDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public PlaidEventDataDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new PlaidEventDataDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: PlaidEventDataDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/PlaidEventDataDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4184_0)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.PlaidEventDataDto";
        }
    }
}
