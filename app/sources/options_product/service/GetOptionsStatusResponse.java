package options_product.service;

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

/* compiled from: GetOptionsStatusResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Loptions_product/service/GetOptionsStatusResponse;", "Lcom/squareup/wire/Message;", "", "status", "Loptions_product/service/OptionsStatus;", "unknownFields", "Lokio/ByteString;", "<init>", "(Loptions_product/service/OptionsStatus;Lokio/ByteString;)V", "getStatus", "()Loptions_product/service/OptionsStatus;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "options_product.service.v1.onboarding_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class GetOptionsStatusResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetOptionsStatusResponse> ADAPTER;

    @WireField(adapter = "options_product.service.OptionsStatus#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OptionsStatus status;

    /* JADX WARN: Multi-variable type inference failed */
    public GetOptionsStatusResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29496newBuilder();
    }

    public final OptionsStatus getStatus() {
        return this.status;
    }

    public /* synthetic */ GetOptionsStatusResponse(OptionsStatus optionsStatus, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OptionsStatus.OPTIONS_STATUS_UNSPECIFIED : optionsStatus, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetOptionsStatusResponse(OptionsStatus status, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.status = status;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29496newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetOptionsStatusResponse)) {
            return false;
        }
        GetOptionsStatusResponse getOptionsStatusResponse = (GetOptionsStatusResponse) other;
        return Intrinsics.areEqual(unknownFields(), getOptionsStatusResponse.unknownFields()) && this.status == getOptionsStatusResponse.status;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.status.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("status=" + this.status);
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetOptionsStatusResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetOptionsStatusResponse copy$default(GetOptionsStatusResponse getOptionsStatusResponse, OptionsStatus optionsStatus, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            optionsStatus = getOptionsStatusResponse.status;
        }
        if ((i & 2) != 0) {
            byteString = getOptionsStatusResponse.unknownFields();
        }
        return getOptionsStatusResponse.copy(optionsStatus, byteString);
    }

    public final GetOptionsStatusResponse copy(OptionsStatus status, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetOptionsStatusResponse(status, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetOptionsStatusResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetOptionsStatusResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: options_product.service.GetOptionsStatusResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetOptionsStatusResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getStatus() != OptionsStatus.OPTIONS_STATUS_UNSPECIFIED ? size + OptionsStatus.ADAPTER.encodedSizeWithTag(1, value.getStatus()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetOptionsStatusResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getStatus() != OptionsStatus.OPTIONS_STATUS_UNSPECIFIED) {
                    OptionsStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetOptionsStatusResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getStatus() != OptionsStatus.OPTIONS_STATUS_UNSPECIFIED) {
                    OptionsStatus.ADAPTER.encodeWithTag(writer, 1, (int) value.getStatus());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOptionsStatusResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                OptionsStatus optionsStatusDecode = OptionsStatus.OPTIONS_STATUS_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetOptionsStatusResponse(optionsStatusDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            optionsStatusDecode = OptionsStatus.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetOptionsStatusResponse redact(GetOptionsStatusResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetOptionsStatusResponse.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
