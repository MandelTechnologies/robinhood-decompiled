package bonfire.proto.idl.accounts.p028v1;

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

/* compiled from: IsUserEligibleForAccountResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\bH\u0016J.\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, m3636d2 = {"Lbonfire/proto/idl/accounts/v1/IsUserEligibleForAccountResponse;", "Lcom/squareup/wire/Message;", "", "is_eligible", "", "reason", "Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "info_sheet_id", "", "unknownFields", "Lokio/ByteString;", "<init>", "(ZLbonfire/proto/idl/accounts/v1/IneligibilityReason;Ljava/lang/String;Lokio/ByteString;)V", "()Z", "getReason", "()Lbonfire/proto/idl/accounts/v1/IneligibilityReason;", "getInfo_sheet_id", "()Ljava/lang/String;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.rhuk_isa.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class IsUserEligibleForAccountResponse extends Message {

    @JvmField
    public static final ProtoAdapter<IsUserEligibleForAccountResponse> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "infoSheetId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String info_sheet_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isEligible", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_eligible;

    @WireField(adapter = "bonfire.proto.idl.accounts.v1.IneligibilityReason#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final IneligibilityReason reason;

    public IsUserEligibleForAccountResponse() {
        this(false, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8728newBuilder();
    }

    /* renamed from: is_eligible, reason: from getter */
    public final boolean getIs_eligible() {
        return this.is_eligible;
    }

    public final IneligibilityReason getReason() {
        return this.reason;
    }

    public /* synthetic */ IsUserEligibleForAccountResponse(boolean z, IneligibilityReason ineligibilityReason, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED : ineligibilityReason, (i & 4) != 0 ? "" : str, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getInfo_sheet_id() {
        return this.info_sheet_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsUserEligibleForAccountResponse(boolean z, IneligibilityReason reason, String info_sheet_id, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(info_sheet_id, "info_sheet_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_eligible = z;
        this.reason = reason;
        this.info_sheet_id = info_sheet_id;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8728newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IsUserEligibleForAccountResponse)) {
            return false;
        }
        IsUserEligibleForAccountResponse isUserEligibleForAccountResponse = (IsUserEligibleForAccountResponse) other;
        return Intrinsics.areEqual(unknownFields(), isUserEligibleForAccountResponse.unknownFields()) && this.is_eligible == isUserEligibleForAccountResponse.is_eligible && this.reason == isUserEligibleForAccountResponse.reason && Intrinsics.areEqual(this.info_sheet_id, isUserEligibleForAccountResponse.info_sheet_id);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_eligible)) * 37) + this.reason.hashCode()) * 37) + this.info_sheet_id.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_eligible=" + this.is_eligible);
        arrayList.add("reason=" + this.reason);
        arrayList.add("info_sheet_id=" + Internal.sanitize(this.info_sheet_id));
        return CollectionsKt.joinToString$default(arrayList, ", ", "IsUserEligibleForAccountResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IsUserEligibleForAccountResponse copy$default(IsUserEligibleForAccountResponse isUserEligibleForAccountResponse, boolean z, IneligibilityReason ineligibilityReason, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = isUserEligibleForAccountResponse.is_eligible;
        }
        if ((i & 2) != 0) {
            ineligibilityReason = isUserEligibleForAccountResponse.reason;
        }
        if ((i & 4) != 0) {
            str = isUserEligibleForAccountResponse.info_sheet_id;
        }
        if ((i & 8) != 0) {
            byteString = isUserEligibleForAccountResponse.unknownFields();
        }
        return isUserEligibleForAccountResponse.copy(z, ineligibilityReason, str, byteString);
    }

    public final IsUserEligibleForAccountResponse copy(boolean is_eligible, IneligibilityReason reason, String info_sheet_id, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(info_sheet_id, "info_sheet_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IsUserEligibleForAccountResponse(is_eligible, reason, info_sheet_id, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IsUserEligibleForAccountResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IsUserEligibleForAccountResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.accounts.v1.IsUserEligibleForAccountResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IsUserEligibleForAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_eligible()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getReason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    size += IneligibilityReason.ADAPTER.encodedSizeWithTag(2, value.getReason());
                }
                return !Intrinsics.areEqual(value.getInfo_sheet_id(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getInfo_sheet_id()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IsUserEligibleForAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_eligible()));
                }
                if (value.getReason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    IneligibilityReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getInfo_sheet_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInfo_sheet_id());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IsUserEligibleForAccountResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getInfo_sheet_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getInfo_sheet_id());
                }
                if (value.getReason() != IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED) {
                    IneligibilityReason.ADAPTER.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (value.getIs_eligible()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_eligible()));
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IsUserEligibleForAccountResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                IneligibilityReason ineligibilityReasonDecode = IneligibilityReason.INELIGIBILITY_REASON_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IsUserEligibleForAccountResponse(zBooleanValue, ineligibilityReasonDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        try {
                            ineligibilityReasonDecode = IneligibilityReason.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 3) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IsUserEligibleForAccountResponse redact(IsUserEligibleForAccountResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IsUserEligibleForAccountResponse.copy$default(value, false, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }
}
