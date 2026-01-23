package com.robinhood.ceres.p284v1;

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

/* compiled from: CreateFuturesAccountResponse.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J4\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/ceres/v1/CreateFuturesAccountResponse;", "Lcom/squareup/wire/Message;", "", "manual_review_required_response", "Lcom/robinhood/ceres/v1/ManualReviewRequiredResponse;", "successful_account_creation_response", "Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;", "application_rejected_response", "Lcom/robinhood/ceres/v1/ApplicationRejectedResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/ceres/v1/ManualReviewRequiredResponse;Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;Lcom/robinhood/ceres/v1/ApplicationRejectedResponse;Lokio/ByteString;)V", "getManual_review_required_response", "()Lcom/robinhood/ceres/v1/ManualReviewRequiredResponse;", "getSuccessful_account_creation_response", "()Lcom/robinhood/ceres/v1/SuccessfulAccountCreationResponse;", "getApplication_rejected_response", "()Lcom/robinhood/ceres/v1/ApplicationRejectedResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class CreateFuturesAccountResponse extends Message {

    @JvmField
    public static final ProtoAdapter<CreateFuturesAccountResponse> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.ApplicationRejectedResponse#ADAPTER", jsonName = "applicationRejectedResponse", oneofName = "create_futures_account_response", schemaIndex = 2, tag = 3)
    private final ApplicationRejectedResponse application_rejected_response;

    @WireField(adapter = "com.robinhood.ceres.v1.ManualReviewRequiredResponse#ADAPTER", jsonName = "manualReviewRequiredResponse", oneofName = "create_futures_account_response", schemaIndex = 0, tag = 1)
    private final ManualReviewRequiredResponse manual_review_required_response;

    @WireField(adapter = "com.robinhood.ceres.v1.SuccessfulAccountCreationResponse#ADAPTER", jsonName = "successfulAccountCreationResponse", oneofName = "create_futures_account_response", schemaIndex = 1, tag = 2)
    private final SuccessfulAccountCreationResponse successful_account_creation_response;

    public CreateFuturesAccountResponse() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20287newBuilder();
    }

    public final ManualReviewRequiredResponse getManual_review_required_response() {
        return this.manual_review_required_response;
    }

    public final SuccessfulAccountCreationResponse getSuccessful_account_creation_response() {
        return this.successful_account_creation_response;
    }

    public final ApplicationRejectedResponse getApplication_rejected_response() {
        return this.application_rejected_response;
    }

    public /* synthetic */ CreateFuturesAccountResponse(ManualReviewRequiredResponse manualReviewRequiredResponse, SuccessfulAccountCreationResponse successfulAccountCreationResponse, ApplicationRejectedResponse applicationRejectedResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : manualReviewRequiredResponse, (i & 2) != 0 ? null : successfulAccountCreationResponse, (i & 4) != 0 ? null : applicationRejectedResponse, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateFuturesAccountResponse(ManualReviewRequiredResponse manualReviewRequiredResponse, SuccessfulAccountCreationResponse successfulAccountCreationResponse, ApplicationRejectedResponse applicationRejectedResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.manual_review_required_response = manualReviewRequiredResponse;
        this.successful_account_creation_response = successfulAccountCreationResponse;
        this.application_rejected_response = applicationRejectedResponse;
        if (Internal.countNonNull(manualReviewRequiredResponse, successfulAccountCreationResponse, applicationRejectedResponse) > 1) {
            throw new IllegalArgumentException("At most one of manual_review_required_response, successful_account_creation_response, application_rejected_response may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20287newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CreateFuturesAccountResponse)) {
            return false;
        }
        CreateFuturesAccountResponse createFuturesAccountResponse = (CreateFuturesAccountResponse) other;
        return Intrinsics.areEqual(unknownFields(), createFuturesAccountResponse.unknownFields()) && Intrinsics.areEqual(this.manual_review_required_response, createFuturesAccountResponse.manual_review_required_response) && Intrinsics.areEqual(this.successful_account_creation_response, createFuturesAccountResponse.successful_account_creation_response) && Intrinsics.areEqual(this.application_rejected_response, createFuturesAccountResponse.application_rejected_response);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        ManualReviewRequiredResponse manualReviewRequiredResponse = this.manual_review_required_response;
        int iHashCode2 = (iHashCode + (manualReviewRequiredResponse != null ? manualReviewRequiredResponse.hashCode() : 0)) * 37;
        SuccessfulAccountCreationResponse successfulAccountCreationResponse = this.successful_account_creation_response;
        int iHashCode3 = (iHashCode2 + (successfulAccountCreationResponse != null ? successfulAccountCreationResponse.hashCode() : 0)) * 37;
        ApplicationRejectedResponse applicationRejectedResponse = this.application_rejected_response;
        int iHashCode4 = iHashCode3 + (applicationRejectedResponse != null ? applicationRejectedResponse.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        ManualReviewRequiredResponse manualReviewRequiredResponse = this.manual_review_required_response;
        if (manualReviewRequiredResponse != null) {
            arrayList.add("manual_review_required_response=" + manualReviewRequiredResponse);
        }
        SuccessfulAccountCreationResponse successfulAccountCreationResponse = this.successful_account_creation_response;
        if (successfulAccountCreationResponse != null) {
            arrayList.add("successful_account_creation_response=" + successfulAccountCreationResponse);
        }
        ApplicationRejectedResponse applicationRejectedResponse = this.application_rejected_response;
        if (applicationRejectedResponse != null) {
            arrayList.add("application_rejected_response=" + applicationRejectedResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CreateFuturesAccountResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CreateFuturesAccountResponse copy$default(CreateFuturesAccountResponse createFuturesAccountResponse, ManualReviewRequiredResponse manualReviewRequiredResponse, SuccessfulAccountCreationResponse successfulAccountCreationResponse, ApplicationRejectedResponse applicationRejectedResponse, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            manualReviewRequiredResponse = createFuturesAccountResponse.manual_review_required_response;
        }
        if ((i & 2) != 0) {
            successfulAccountCreationResponse = createFuturesAccountResponse.successful_account_creation_response;
        }
        if ((i & 4) != 0) {
            applicationRejectedResponse = createFuturesAccountResponse.application_rejected_response;
        }
        if ((i & 8) != 0) {
            byteString = createFuturesAccountResponse.unknownFields();
        }
        return createFuturesAccountResponse.copy(manualReviewRequiredResponse, successfulAccountCreationResponse, applicationRejectedResponse, byteString);
    }

    public final CreateFuturesAccountResponse copy(ManualReviewRequiredResponse manual_review_required_response, SuccessfulAccountCreationResponse successful_account_creation_response, ApplicationRejectedResponse application_rejected_response, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CreateFuturesAccountResponse(manual_review_required_response, successful_account_creation_response, application_rejected_response, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CreateFuturesAccountResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CreateFuturesAccountResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.CreateFuturesAccountResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CreateFuturesAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ManualReviewRequiredResponse.ADAPTER.encodedSizeWithTag(1, value.getManual_review_required_response()) + SuccessfulAccountCreationResponse.ADAPTER.encodedSizeWithTag(2, value.getSuccessful_account_creation_response()) + ApplicationRejectedResponse.ADAPTER.encodedSizeWithTag(3, value.getApplication_rejected_response());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CreateFuturesAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ManualReviewRequiredResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getManual_review_required_response());
                SuccessfulAccountCreationResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getSuccessful_account_creation_response());
                ApplicationRejectedResponse.ADAPTER.encodeWithTag(writer, 3, (int) value.getApplication_rejected_response());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CreateFuturesAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ApplicationRejectedResponse.ADAPTER.encodeWithTag(writer, 3, (int) value.getApplication_rejected_response());
                SuccessfulAccountCreationResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getSuccessful_account_creation_response());
                ManualReviewRequiredResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getManual_review_required_response());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesAccountResponse redact(CreateFuturesAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ManualReviewRequiredResponse manual_review_required_response = value.getManual_review_required_response();
                ManualReviewRequiredResponse manualReviewRequiredResponseRedact = manual_review_required_response != null ? ManualReviewRequiredResponse.ADAPTER.redact(manual_review_required_response) : null;
                SuccessfulAccountCreationResponse successful_account_creation_response = value.getSuccessful_account_creation_response();
                SuccessfulAccountCreationResponse successfulAccountCreationResponseRedact = successful_account_creation_response != null ? SuccessfulAccountCreationResponse.ADAPTER.redact(successful_account_creation_response) : null;
                ApplicationRejectedResponse application_rejected_response = value.getApplication_rejected_response();
                return value.copy(manualReviewRequiredResponseRedact, successfulAccountCreationResponseRedact, application_rejected_response != null ? ApplicationRejectedResponse.ADAPTER.redact(application_rejected_response) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CreateFuturesAccountResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ManualReviewRequiredResponse manualReviewRequiredResponseDecode = null;
                SuccessfulAccountCreationResponse successfulAccountCreationResponseDecode = null;
                ApplicationRejectedResponse applicationRejectedResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CreateFuturesAccountResponse(manualReviewRequiredResponseDecode, successfulAccountCreationResponseDecode, applicationRejectedResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        manualReviewRequiredResponseDecode = ManualReviewRequiredResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        successfulAccountCreationResponseDecode = SuccessfulAccountCreationResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        applicationRejectedResponseDecode = ApplicationRejectedResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
