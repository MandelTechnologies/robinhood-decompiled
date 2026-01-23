package identi.service.p471v1.models_workflow.p472v1;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.ContactSupport$ActionResponse;
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

/* compiled from: ContactSupport.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001c\u001dB\u001d\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u0017\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ContactSupport$ActionResponse", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "proceed", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "Companion", "Proceed", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ContactSupport$ActionResponse extends Message {

    @JvmField
    public static final ProtoAdapter<ContactSupport$ActionResponse> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$ActionResponse$Proceed#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Proceed proceed;

    /* JADX WARN: Multi-variable type inference failed */
    public ContactSupport$ActionResponse() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28285newBuilder();
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public /* synthetic */ ContactSupport$ActionResponse(Proceed proceed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proceed, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupport$ActionResponse(Proceed proceed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.proceed = proceed;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28285newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContactSupport$ActionResponse)) {
            return false;
        }
        ContactSupport$ActionResponse contactSupport$ActionResponse = (ContactSupport$ActionResponse) other;
        return Intrinsics.areEqual(unknownFields(), contactSupport$ActionResponse.unknownFields()) && Intrinsics.areEqual(this.proceed, contactSupport$ActionResponse.proceed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Proceed proceed = this.proceed;
        int iHashCode2 = iHashCode + (proceed != null ? proceed.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "ActionResponse{", "}", 0, null, null, 56, null);
    }

    public final ContactSupport$ActionResponse copy(Proceed proceed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContactSupport$ActionResponse(proceed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContactSupport$ActionResponse.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContactSupport$ActionResponse>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.ContactSupport$ActionResponse$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContactSupport$ActionResponse decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ContactSupport$ActionResponse.Proceed proceedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContactSupport$ActionResponse(proceedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        proceedDecode = ContactSupport$ActionResponse.Proceed.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContactSupport$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ContactSupport$ActionResponse.Proceed.ADAPTER.encodedSizeWithTag(1, value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContactSupport$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ContactSupport$ActionResponse.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContactSupport$ActionResponse value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ContactSupport$ActionResponse.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContactSupport$ActionResponse redact(ContactSupport$ActionResponse value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ContactSupport$ActionResponse.Proceed proceed = value.getProceed();
                return value.copy(proceed != null ? ContactSupport$ActionResponse.Proceed.ADAPTER.redact(proceed) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: ContactSupport.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016J\u001a\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupport$ActionResponse$Proceed;", "Lcom/squareup/wire/Message;", "", "exit_deeplink", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lokio/ByteString;)V", "getExit_deeplink", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "exitDeeplink", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String exit_deeplink;

        /* JADX WARN: Multi-variable type inference failed */
        public Proceed() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28286newBuilder();
        }

        public final String getExit_deeplink() {
            return this.exit_deeplink;
        }

        public /* synthetic */ Proceed(String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proceed(String exit_deeplink, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(exit_deeplink, "exit_deeplink");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.exit_deeplink = exit_deeplink;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28286newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Proceed)) {
                return false;
            }
            Proceed proceed = (Proceed) other;
            return Intrinsics.areEqual(unknownFields(), proceed.unknownFields()) && Intrinsics.areEqual(this.exit_deeplink, proceed.exit_deeplink);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (unknownFields().hashCode() * 37) + this.exit_deeplink.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("exit_deeplink=" + Internal.sanitize(this.exit_deeplink));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Proceed{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Proceed copy$default(Proceed proceed, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = proceed.exit_deeplink;
            }
            if ((i & 2) != 0) {
                byteString = proceed.unknownFields();
            }
            return proceed.copy(str, byteString);
        }

        public final Proceed copy(String exit_deeplink, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(exit_deeplink, "exit_deeplink");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Proceed(exit_deeplink, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Proceed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.ContactSupport$ActionResponse$Proceed$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$ActionResponse.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new ContactSupport$ActionResponse.Proceed(strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ContactSupport$ActionResponse.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    return !Intrinsics.areEqual(value.getExit_deeplink(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(1, value.getExit_deeplink()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ContactSupport$ActionResponse.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getExit_deeplink(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExit_deeplink());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ContactSupport$ActionResponse.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (Intrinsics.areEqual(value.getExit_deeplink(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getExit_deeplink());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$ActionResponse.Proceed redact(ContactSupport$ActionResponse.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return ContactSupport$ActionResponse.Proceed.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }
}
