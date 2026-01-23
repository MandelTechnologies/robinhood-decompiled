package futures_onboarding_value_props.proto.p463v1;

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

/* compiled from: GetMibFuturesStateResponse.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0006H\u0016J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, m3636d2 = {"Lfutures_onboarding_value_props/proto/v1/GetMibFuturesStateResponse;", "Lcom/squareup/wire/Message;", "", "has_multiple_rhs_accounts", "", "futures_allowed_rhs_account_display_name", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLjava/lang/String;Lokio/ByteString;)V", "getHas_multiple_rhs_accounts", "()Z", "getFutures_allowed_rhs_account_display_name", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "futures_onboarding_value_props.proto.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class GetMibFuturesStateResponse extends Message {

    @JvmField
    public static final ProtoAdapter<GetMibFuturesStateResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "futuresAllowedRhsAccountDisplayName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String futures_allowed_rhs_account_display_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hasMultipleRhsAccounts", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean has_multiple_rhs_accounts;

    public GetMibFuturesStateResponse() {
        this(false, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28104newBuilder();
    }

    public final boolean getHas_multiple_rhs_accounts() {
        return this.has_multiple_rhs_accounts;
    }

    public final String getFutures_allowed_rhs_account_display_name() {
        return this.futures_allowed_rhs_account_display_name;
    }

    public /* synthetic */ GetMibFuturesStateResponse(boolean z, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetMibFuturesStateResponse(boolean z, String futures_allowed_rhs_account_display_name, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(futures_allowed_rhs_account_display_name, "futures_allowed_rhs_account_display_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.has_multiple_rhs_accounts = z;
        this.futures_allowed_rhs_account_display_name = futures_allowed_rhs_account_display_name;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28104newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GetMibFuturesStateResponse)) {
            return false;
        }
        GetMibFuturesStateResponse getMibFuturesStateResponse = (GetMibFuturesStateResponse) other;
        return Intrinsics.areEqual(unknownFields(), getMibFuturesStateResponse.unknownFields()) && this.has_multiple_rhs_accounts == getMibFuturesStateResponse.has_multiple_rhs_accounts && Intrinsics.areEqual(this.futures_allowed_rhs_account_display_name, getMibFuturesStateResponse.futures_allowed_rhs_account_display_name);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.has_multiple_rhs_accounts)) * 37) + this.futures_allowed_rhs_account_display_name.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("has_multiple_rhs_accounts=" + this.has_multiple_rhs_accounts);
        arrayList.add("futures_allowed_rhs_account_display_name=" + Internal.sanitize(this.futures_allowed_rhs_account_display_name));
        return CollectionsKt.joinToString$default(arrayList, ", ", "GetMibFuturesStateResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ GetMibFuturesStateResponse copy$default(GetMibFuturesStateResponse getMibFuturesStateResponse, boolean z, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = getMibFuturesStateResponse.has_multiple_rhs_accounts;
        }
        if ((i & 2) != 0) {
            str = getMibFuturesStateResponse.futures_allowed_rhs_account_display_name;
        }
        if ((i & 4) != 0) {
            byteString = getMibFuturesStateResponse.unknownFields();
        }
        return getMibFuturesStateResponse.copy(z, str, byteString);
    }

    public final GetMibFuturesStateResponse copy(boolean has_multiple_rhs_accounts, String futures_allowed_rhs_account_display_name, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(futures_allowed_rhs_account_display_name, "futures_allowed_rhs_account_display_name");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GetMibFuturesStateResponse(has_multiple_rhs_accounts, futures_allowed_rhs_account_display_name, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GetMibFuturesStateResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GetMibFuturesStateResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: futures_onboarding_value_props.proto.v1.GetMibFuturesStateResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GetMibFuturesStateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getHas_multiple_rhs_accounts()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getHas_multiple_rhs_accounts()));
                }
                return !Intrinsics.areEqual(value.getFutures_allowed_rhs_account_display_name(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getFutures_allowed_rhs_account_display_name()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GetMibFuturesStateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getHas_multiple_rhs_accounts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getHas_multiple_rhs_accounts()));
                }
                if (!Intrinsics.areEqual(value.getFutures_allowed_rhs_account_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFutures_allowed_rhs_account_display_name());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GetMibFuturesStateResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getFutures_allowed_rhs_account_display_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getFutures_allowed_rhs_account_display_name());
                }
                if (value.getHas_multiple_rhs_accounts()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getHas_multiple_rhs_accounts()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GetMibFuturesStateResponse redact(GetMibFuturesStateResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return GetMibFuturesStateResponse.copy$default(value, false, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GetMibFuturesStateResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GetMibFuturesStateResponse(zBooleanValue, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
