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

/* compiled from: EvaluateCheckpointSuitabilityRequest.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/ceres/v1/EvaluateCheckpointSuitabilityRequest;", "Lcom/squareup/wire/Message;", "", "rhs_account_number", "", "checkpoint", "Lcom/robinhood/ceres/v1/SuitabilityCheckpoint;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/ceres/v1/SuitabilityCheckpoint;Lokio/ByteString;)V", "getRhs_account_number", "()Ljava/lang/String;", "getCheckpoint", "()Lcom/robinhood/ceres/v1/SuitabilityCheckpoint;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class EvaluateCheckpointSuitabilityRequest extends Message {

    @JvmField
    public static final ProtoAdapter<EvaluateCheckpointSuitabilityRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.ceres.v1.SuitabilityCheckpoint#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final SuitabilityCheckpoint checkpoint;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "rhsAccountNumber", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String rhs_account_number;

    public EvaluateCheckpointSuitabilityRequest() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20294newBuilder();
    }

    public final String getRhs_account_number() {
        return this.rhs_account_number;
    }

    public /* synthetic */ EvaluateCheckpointSuitabilityRequest(String str, SuitabilityCheckpoint suitabilityCheckpoint, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? SuitabilityCheckpoint.SUITABILITY_CHECKPOINT_UNSPECIFIED : suitabilityCheckpoint, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final SuitabilityCheckpoint getCheckpoint() {
        return this.checkpoint;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EvaluateCheckpointSuitabilityRequest(String rhs_account_number, SuitabilityCheckpoint checkpoint, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.rhs_account_number = rhs_account_number;
        this.checkpoint = checkpoint;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20294newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof EvaluateCheckpointSuitabilityRequest)) {
            return false;
        }
        EvaluateCheckpointSuitabilityRequest evaluateCheckpointSuitabilityRequest = (EvaluateCheckpointSuitabilityRequest) other;
        return Intrinsics.areEqual(unknownFields(), evaluateCheckpointSuitabilityRequest.unknownFields()) && Intrinsics.areEqual(this.rhs_account_number, evaluateCheckpointSuitabilityRequest.rhs_account_number) && this.checkpoint == evaluateCheckpointSuitabilityRequest.checkpoint;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.rhs_account_number.hashCode()) * 37) + this.checkpoint.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("rhs_account_number=" + Internal.sanitize(this.rhs_account_number));
        arrayList.add("checkpoint=" + this.checkpoint);
        return CollectionsKt.joinToString$default(arrayList, ", ", "EvaluateCheckpointSuitabilityRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ EvaluateCheckpointSuitabilityRequest copy$default(EvaluateCheckpointSuitabilityRequest evaluateCheckpointSuitabilityRequest, String str, SuitabilityCheckpoint suitabilityCheckpoint, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = evaluateCheckpointSuitabilityRequest.rhs_account_number;
        }
        if ((i & 2) != 0) {
            suitabilityCheckpoint = evaluateCheckpointSuitabilityRequest.checkpoint;
        }
        if ((i & 4) != 0) {
            byteString = evaluateCheckpointSuitabilityRequest.unknownFields();
        }
        return evaluateCheckpointSuitabilityRequest.copy(str, suitabilityCheckpoint, byteString);
    }

    public final EvaluateCheckpointSuitabilityRequest copy(String rhs_account_number, SuitabilityCheckpoint checkpoint, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(rhs_account_number, "rhs_account_number");
        Intrinsics.checkNotNullParameter(checkpoint, "checkpoint");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new EvaluateCheckpointSuitabilityRequest(rhs_account_number, checkpoint, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EvaluateCheckpointSuitabilityRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<EvaluateCheckpointSuitabilityRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.EvaluateCheckpointSuitabilityRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(EvaluateCheckpointSuitabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getRhs_account_number());
                }
                return value.getCheckpoint() != SuitabilityCheckpoint.SUITABILITY_CHECKPOINT_UNSPECIFIED ? size + SuitabilityCheckpoint.ADAPTER.encodedSizeWithTag(2, value.getCheckpoint()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, EvaluateCheckpointSuitabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
                }
                if (value.getCheckpoint() != SuitabilityCheckpoint.SUITABILITY_CHECKPOINT_UNSPECIFIED) {
                    SuitabilityCheckpoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheckpoint());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, EvaluateCheckpointSuitabilityRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getCheckpoint() != SuitabilityCheckpoint.SUITABILITY_CHECKPOINT_UNSPECIFIED) {
                    SuitabilityCheckpoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getCheckpoint());
                }
                if (Intrinsics.areEqual(value.getRhs_account_number(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getRhs_account_number());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public EvaluateCheckpointSuitabilityRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SuitabilityCheckpoint suitabilityCheckpointDecode = SuitabilityCheckpoint.SUITABILITY_CHECKPOINT_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new EvaluateCheckpointSuitabilityRequest(strDecode, suitabilityCheckpointDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        try {
                            suitabilityCheckpointDecode = SuitabilityCheckpoint.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public EvaluateCheckpointSuitabilityRequest redact(EvaluateCheckpointSuitabilityRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return EvaluateCheckpointSuitabilityRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
