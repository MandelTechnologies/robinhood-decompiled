package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.models.api.ErrorResponse;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import identi.service.p471v1.models_workflow.p472v1.DeviceApprovalChallenge$ActionResponse;
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

/* compiled from: DeviceApprovalChallenge.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001dB\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"identi/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse;", "", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;", "resend", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse;", "Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;", "getResend", "()Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;", "Companion", "Resend", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class DeviceApprovalChallenge$ActionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<DeviceApprovalChallenge$ActionResponse> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$ActionResponse$Resend#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Resend resend;

    /* JADX WARN: Multi-variable type inference failed */
    public DeviceApprovalChallenge$ActionResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28293newBuilder();
    }

    public final Resend getResend() {
        return this.resend;
    }

    public /* synthetic */ DeviceApprovalChallenge$ActionResponse(Resend resend, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : resend, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceApprovalChallenge$ActionResponse(Resend resend, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.resend = resend;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28293newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof DeviceApprovalChallenge$ActionResponse)) {
            return false;
        }
        DeviceApprovalChallenge$ActionResponse deviceApprovalChallenge$ActionResponse = (DeviceApprovalChallenge$ActionResponse) other;
        return Intrinsics.areEqual(unknownFields(), deviceApprovalChallenge$ActionResponse.unknownFields()) && Intrinsics.areEqual(this.resend, deviceApprovalChallenge$ActionResponse.resend);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Resend resend = this.resend;
        int iHashCode2 = iHashCode + (resend != null ? resend.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Resend resend = this.resend;
        if (resend != null) {
            arrayList.add("resend=" + resend);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionResponse{", "}", 0, null, null, 56, null);
    }

    public final DeviceApprovalChallenge$ActionResponse copy(Resend resend, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new DeviceApprovalChallenge$ActionResponse(resend, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(DeviceApprovalChallenge$ActionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<DeviceApprovalChallenge$ActionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$ActionResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public DeviceApprovalChallenge$ActionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                DeviceApprovalChallenge$ActionResponse.Resend resendDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new DeviceApprovalChallenge$ActionResponse(resendDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        resendDecode = DeviceApprovalChallenge$ActionResponse.Resend.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(DeviceApprovalChallenge$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + DeviceApprovalChallenge$ActionResponse.Resend.ADAPTER.encodedSizeWithTag(1, value.getResend());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, DeviceApprovalChallenge$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                DeviceApprovalChallenge$ActionResponse.Resend.ADAPTER.encodeWithTag(writer, 1, (int) value.getResend());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, DeviceApprovalChallenge$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                DeviceApprovalChallenge$ActionResponse.Resend.ADAPTER.encodeWithTag(writer, 1, (int) value.getResend());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public DeviceApprovalChallenge$ActionResponse redact(DeviceApprovalChallenge$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                DeviceApprovalChallenge$ActionResponse.Resend resend = value.getResend();
                return value.copy(resend != null ? DeviceApprovalChallenge$ActionResponse.Resend.ADAPTER.redact(resend) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: DeviceApprovalChallenge.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001c\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/DeviceApprovalChallenge$ActionResponse$Resend;", "Lcom/squareup/wire/Message;", "", ErrorResponse.CHALLENGE, "Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lidenti/service/v1/models_workflow/v1/SheriffChallenge;Lokio/ByteString;)V", "getChallenge", "()Lidenti/service/v1/models_workflow/v1/SheriffChallenge;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Resend extends Message {

        @JvmField
        public static final ProtoAdapter<Resend> ADAPTER;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.SheriffChallenge#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final SheriffChallenge challenge;

        /* JADX WARN: Multi-variable type inference failed */
        public Resend() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28294newBuilder();
        }

        public final SheriffChallenge getChallenge() {
            return this.challenge;
        }

        public /* synthetic */ Resend(SheriffChallenge sheriffChallenge, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : sheriffChallenge, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resend(SheriffChallenge sheriffChallenge, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.challenge = sheriffChallenge;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28294newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Resend)) {
                return false;
            }
            Resend resend = (Resend) other;
            return Intrinsics.areEqual(unknownFields(), resend.unknownFields()) && Intrinsics.areEqual(this.challenge, resend.challenge);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            SheriffChallenge sheriffChallenge = this.challenge;
            int iHashCode2 = iHashCode + (sheriffChallenge != null ? sheriffChallenge.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            SheriffChallenge sheriffChallenge = this.challenge;
            if (sheriffChallenge != null) {
                arrayList.add("challenge=" + sheriffChallenge);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Resend{", "}", 0, null, null, 56, null);
        }

        public final Resend copy(SheriffChallenge challenge, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Resend(challenge, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Resend.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Resend>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.DeviceApprovalChallenge$ActionResponse$Resend$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public DeviceApprovalChallenge$ActionResponse.Resend decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    SheriffChallenge sheriffChallengeDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new DeviceApprovalChallenge$ActionResponse.Resend(sheriffChallengeDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            sheriffChallengeDecode = SheriffChallenge.ADAPTER.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(DeviceApprovalChallenge$ActionResponse.Resend value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return value.getChallenge() != null ? size + SheriffChallenge.ADAPTER.encodedSizeWithTag(1, value.getChallenge()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, DeviceApprovalChallenge$ActionResponse.Resend value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getChallenge() != null) {
                        SheriffChallenge.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, DeviceApprovalChallenge$ActionResponse.Resend value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getChallenge() != null) {
                        SheriffChallenge.ADAPTER.encodeWithTag(writer, 1, (int) value.getChallenge());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public DeviceApprovalChallenge$ActionResponse.Resend redact(DeviceApprovalChallenge$ActionResponse.Resend value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    SheriffChallenge challenge = value.getChallenge();
                    return value.copy(challenge != null ? SheriffChallenge.ADAPTER.redact(challenge) : null, ByteString.EMPTY);
                }
            };
        }
    }
}
