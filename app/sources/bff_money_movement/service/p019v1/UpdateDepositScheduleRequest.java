package bff_money_movement.service.p019v1;

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

/* compiled from: UpdateDepositScheduleRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbff_money_movement/service/v1/UpdateDepositScheduleRequest;", "Lcom/squareup/wire/Message;", "", "id", "", "state", "Lbff_money_movement/service/v1/DepositScheduleState;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lbff_money_movement/service/v1/DepositScheduleState;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getState", "()Lbff_money_movement/service/v1/DepositScheduleState;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bff_money_movement.service.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class UpdateDepositScheduleRequest extends Message {

    @JvmField
    public static final ProtoAdapter<UpdateDepositScheduleRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String id;

    @WireField(adapter = "bff_money_movement.service.v1.DepositScheduleState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 3)
    private final DepositScheduleState state;

    public UpdateDepositScheduleRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8528newBuilder();
    }

    public final String getId() {
        return this.id;
    }

    public /* synthetic */ UpdateDepositScheduleRequest(String str, DepositScheduleState depositScheduleState, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED : depositScheduleState, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final DepositScheduleState getState() {
        return this.state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UpdateDepositScheduleRequest(String id, DepositScheduleState state, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.id = id;
        this.state = state;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8528newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UpdateDepositScheduleRequest)) {
            return false;
        }
        UpdateDepositScheduleRequest updateDepositScheduleRequest = (UpdateDepositScheduleRequest) other;
        return Intrinsics.areEqual(unknownFields(), updateDepositScheduleRequest.unknownFields()) && Intrinsics.areEqual(this.id, updateDepositScheduleRequest.id) && this.state == updateDepositScheduleRequest.state;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.state.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("id=" + Internal.sanitize(this.id));
        arrayList.add("state=" + this.state);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UpdateDepositScheduleRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UpdateDepositScheduleRequest copy$default(UpdateDepositScheduleRequest updateDepositScheduleRequest, String str, DepositScheduleState depositScheduleState, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateDepositScheduleRequest.id;
        }
        if ((i & 2) != 0) {
            depositScheduleState = updateDepositScheduleRequest.state;
        }
        if ((i & 4) != 0) {
            byteString = updateDepositScheduleRequest.unknownFields();
        }
        return updateDepositScheduleRequest.copy(str, depositScheduleState, byteString);
    }

    public final UpdateDepositScheduleRequest copy(String id, DepositScheduleState state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UpdateDepositScheduleRequest(id, state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UpdateDepositScheduleRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UpdateDepositScheduleRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bff_money_movement.service.v1.UpdateDepositScheduleRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UpdateDepositScheduleRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                }
                return value.getState() != DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED ? size + DepositScheduleState.ADAPTER.encodedSizeWithTag(3, value.getState()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UpdateDepositScheduleRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getId(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }
                if (value.getState() != DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED) {
                    DepositScheduleState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UpdateDepositScheduleRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getState() != DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED) {
                    DepositScheduleState.ADAPTER.encodeWithTag(writer, 3, (int) value.getState());
                }
                if (Intrinsics.areEqual(value.getId(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UpdateDepositScheduleRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                DepositScheduleState depositScheduleStateDecode = DepositScheduleState.DEPOSIT_SCHEDULE_STATE_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UpdateDepositScheduleRequest(strDecode, depositScheduleStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        try {
                            depositScheduleStateDecode = DepositScheduleState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UpdateDepositScheduleRequest redact(UpdateDepositScheduleRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UpdateDepositScheduleRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
