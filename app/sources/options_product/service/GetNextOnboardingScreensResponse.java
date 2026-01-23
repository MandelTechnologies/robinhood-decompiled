package options_product.service;

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

/* compiled from: GetNextOnboardingScreensResponse.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, m3636d2 = {"Loptions_product/service/GetNextOnboardingScreensResponse;", "Lcom/squareup/wire/Message;", "", "screen_response", "Loptions_product/service/OnboardingScreenListResponse;", "error_response", "Loptions_product/service/OnboardingErrorResponse;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/OnboardingScreenListResponse;Loptions_product/service/OnboardingErrorResponse;Lokio/ByteString;)V", "getScreen_response", "()Loptions_product/service/OnboardingScreenListResponse;", "getError_response", "()Loptions_product/service/OnboardingErrorResponse;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes23.dex */
public final class GetNextOnboardingScreensResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetNextOnboardingScreensResponse> ADAPTER;

    @WireField(adapter = "options_product.service.OnboardingErrorResponse#ADAPTER", jsonName = "errorResponse", oneofName = "response", schemaIndex = 1, tag = 2)
    private final OnboardingErrorResponse error_response;

    @WireField(adapter = "options_product.service.OnboardingScreenListResponse#ADAPTER", jsonName = "screenResponse", oneofName = "response", schemaIndex = 0, tag = 1)
    private final OnboardingScreenListResponse screen_response;

    public GetNextOnboardingScreensResponse() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29494newBuilder();
    }

    public final OnboardingScreenListResponse getScreen_response() {
        return this.screen_response;
    }

    public final OnboardingErrorResponse getError_response() {
        return this.error_response;
    }

    public /* synthetic */ GetNextOnboardingScreensResponse(OnboardingScreenListResponse onboardingScreenListResponse, OnboardingErrorResponse onboardingErrorResponse, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : onboardingScreenListResponse, (i & 2) != 0 ? null : onboardingErrorResponse, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetNextOnboardingScreensResponse(OnboardingScreenListResponse onboardingScreenListResponse, OnboardingErrorResponse onboardingErrorResponse, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen_response = onboardingScreenListResponse;
        this.error_response = onboardingErrorResponse;
        if (Internal.countNonNull(onboardingScreenListResponse, onboardingErrorResponse) > 1) {
            throw new IllegalArgumentException("At most one of screen_response, error_response may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29494newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetNextOnboardingScreensResponse)) {
            return false;
        }
        GetNextOnboardingScreensResponse getNextOnboardingScreensResponse = (GetNextOnboardingScreensResponse) other;
        return Intrinsics.areEqual(unknownFields(), getNextOnboardingScreensResponse.unknownFields()) && Intrinsics.areEqual(this.screen_response, getNextOnboardingScreensResponse.screen_response) && Intrinsics.areEqual(this.error_response, getNextOnboardingScreensResponse.error_response);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        OnboardingScreenListResponse onboardingScreenListResponse = this.screen_response;
        int iHashCode2 = (iHashCode + (onboardingScreenListResponse != null ? onboardingScreenListResponse.hashCode() : 0)) * 37;
        OnboardingErrorResponse onboardingErrorResponse = this.error_response;
        int iHashCode3 = iHashCode2 + (onboardingErrorResponse != null ? onboardingErrorResponse.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        OnboardingScreenListResponse onboardingScreenListResponse = this.screen_response;
        if (onboardingScreenListResponse != null) {
            arrayList.add("screen_response=" + onboardingScreenListResponse);
        }
        OnboardingErrorResponse onboardingErrorResponse = this.error_response;
        if (onboardingErrorResponse != null) {
            arrayList.add("error_response=" + onboardingErrorResponse);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetNextOnboardingScreensResponse{", "}", 0, null, null, 56, null);
    }

    public final GetNextOnboardingScreensResponse copy(OnboardingScreenListResponse screen_response, OnboardingErrorResponse error_response, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetNextOnboardingScreensResponse(screen_response, error_response, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetNextOnboardingScreensResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetNextOnboardingScreensResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.GetNextOnboardingScreensResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetNextOnboardingScreensResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + OnboardingScreenListResponse.ADAPTER.encodedSizeWithTag(1, value.getScreen_response()) + OnboardingErrorResponse.ADAPTER.encodedSizeWithTag(2, value.getError_response());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetNextOnboardingScreensResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                OnboardingScreenListResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen_response());
                OnboardingErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_response());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetNextOnboardingScreensResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                OnboardingErrorResponse.ADAPTER.encodeWithTag(writer, 2, (int) value.getError_response());
                OnboardingScreenListResponse.ADAPTER.encodeWithTag(writer, 1, (int) value.getScreen_response());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNextOnboardingScreensResponse redact(GetNextOnboardingScreensResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                OnboardingScreenListResponse screen_response = value.getScreen_response();
                OnboardingScreenListResponse onboardingScreenListResponseRedact = screen_response != null ? OnboardingScreenListResponse.ADAPTER.redact(screen_response) : null;
                OnboardingErrorResponse error_response = value.getError_response();
                return value.copy(onboardingScreenListResponseRedact, error_response != null ? OnboardingErrorResponse.ADAPTER.redact(error_response) : null, ByteString.EMPTY);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetNextOnboardingScreensResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                OnboardingScreenListResponse onboardingScreenListResponseDecode = null;
                OnboardingErrorResponse onboardingErrorResponseDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetNextOnboardingScreensResponse(onboardingScreenListResponseDecode, onboardingErrorResponseDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        onboardingScreenListResponseDecode = OnboardingScreenListResponse.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        onboardingErrorResponseDecode = OnboardingErrorResponse.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
