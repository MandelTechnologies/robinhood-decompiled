package moneytree.p510v1;

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

/* compiled from: UpdateMembershipResponse.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lmoneytree/v1/UpdateMembershipResponse;", "Lcom/squareup/wire/Message;", "", "mmf_program_state", "Lmoneytree/v1/MMFProgramState;", "request_opt_out", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lmoneytree/v1/MMFProgramState;ZLokio/ByteString;)V", "getMmf_program_state", "()Lmoneytree/v1/MMFProgramState;", "getRequest_opt_out", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "moneytree.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class UpdateMembershipResponse extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateMembershipResponse> ADAPTER;

    @WireField(adapter = "moneytree.v1.MMFProgramState#ADAPTER", jsonName = "mmfProgramState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final MMFProgramState mmf_program_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "requestOptOut", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean request_opt_out;

    public UpdateMembershipResponse() {
        this(null, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29340newBuilder();
    }

    public final MMFProgramState getMmf_program_state() {
        return this.mmf_program_state;
    }

    public /* synthetic */ UpdateMembershipResponse(MMFProgramState mMFProgramState, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED : mMFProgramState, (i & 2) != 0 ? false : z, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final boolean getRequest_opt_out() {
        return this.request_opt_out;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateMembershipResponse(MMFProgramState mmf_program_state, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(mmf_program_state, "mmf_program_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.mmf_program_state = mmf_program_state;
        this.request_opt_out = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29340newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateMembershipResponse)) {
            return false;
        }
        UpdateMembershipResponse updateMembershipResponse = (UpdateMembershipResponse) other;
        return Intrinsics.areEqual(unknownFields(), updateMembershipResponse.unknownFields()) && this.mmf_program_state == updateMembershipResponse.mmf_program_state && this.request_opt_out == updateMembershipResponse.request_opt_out;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.mmf_program_state.hashCode()) * 37) + Boolean.hashCode(this.request_opt_out);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("mmf_program_state=" + this.mmf_program_state);
        arrayList.add("request_opt_out=" + this.request_opt_out);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateMembershipResponse{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateMembershipResponse copy$default(UpdateMembershipResponse updateMembershipResponse, MMFProgramState mMFProgramState, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            mMFProgramState = updateMembershipResponse.mmf_program_state;
        }
        if ((i & 2) != 0) {
            z = updateMembershipResponse.request_opt_out;
        }
        if ((i & 4) != 0) {
            byteString = updateMembershipResponse.unknownFields();
        }
        return updateMembershipResponse.copy(mMFProgramState, z, byteString);
    }

    public final UpdateMembershipResponse copy(MMFProgramState mmf_program_state, boolean request_opt_out, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(mmf_program_state, "mmf_program_state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateMembershipResponse(mmf_program_state, request_opt_out, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateMembershipResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateMembershipResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: moneytree.v1.UpdateMembershipResponse$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateMembershipResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getMmf_program_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    size += MMFProgramState.ADAPTER.encodedSizeWithTag(1, value.getMmf_program_state());
                }
                return value.getRequest_opt_out() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getRequest_opt_out())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateMembershipResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getMmf_program_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    MMFProgramState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMmf_program_state());
                }
                if (value.getRequest_opt_out()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getRequest_opt_out()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateMembershipResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRequest_opt_out()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getRequest_opt_out()));
                }
                if (value.getMmf_program_state() != MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED) {
                    MMFProgramState.ADAPTER.encodeWithTag(writer, 1, (int) value.getMmf_program_state());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateMembershipResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                MMFProgramState mMFProgramStateDecode = MMFProgramState.MMF_PROGRAM_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateMembershipResponse(mMFProgramStateDecode, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            mMFProgramStateDecode = MMFProgramState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateMembershipResponse redact(UpdateMembershipResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateMembershipResponse.copy$default(value, null, false, ByteString.EMPTY, 3, null);
            }
        };
    }
}
