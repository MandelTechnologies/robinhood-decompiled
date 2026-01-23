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
import identi.service.p471v1.models_workflow.p472v1.ContactSupport$Action;
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
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003!\"#B)\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"identi/service/v1/models_workflow/v1/ContactSupport$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action;", "", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;", "proceed", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;", "customer_abandon", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/ContactSupport$Action;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;", "Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;", "Companion", "Proceed", "CustomerAbandon", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class ContactSupport$Action extends Message {

    @JvmField
    public static final ProtoAdapter<ContactSupport$Action> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 1, tag = 2)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.ContactSupport$Action$Proceed#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Proceed proceed;

    public ContactSupport$Action() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28282newBuilder();
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public /* synthetic */ ContactSupport$Action(Proceed proceed, CustomerAbandon customerAbandon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proceed, (i & 2) != 0 ? null : customerAbandon, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContactSupport$Action(Proceed proceed, CustomerAbandon customerAbandon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.proceed = proceed;
        this.customer_abandon = customerAbandon;
        if (Internal.countNonNull(proceed, customerAbandon) > 1) {
            throw new IllegalArgumentException("At most one of proceed, customer_abandon may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28282newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContactSupport$Action)) {
            return false;
        }
        ContactSupport$Action contactSupport$Action = (ContactSupport$Action) other;
        return Intrinsics.areEqual(unknownFields(), contactSupport$Action.unknownFields()) && Intrinsics.areEqual(this.proceed, contactSupport$Action.proceed) && Intrinsics.areEqual(this.customer_abandon, contactSupport$Action.customer_abandon);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Proceed proceed = this.proceed;
        int iHashCode2 = (iHashCode + (proceed != null ? proceed.hashCode() : 0)) * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode3 = iHashCode2 + (customerAbandon != null ? customerAbandon.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final ContactSupport$Action copy(Proceed proceed, CustomerAbandon customer_abandon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContactSupport$Action(proceed, customer_abandon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContactSupport$Action.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContactSupport$Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.ContactSupport$Action$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContactSupport$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + ContactSupport$Action.Proceed.ADAPTER.encodedSizeWithTag(1, value.getProceed()) + ContactSupport$Action.CustomerAbandon.ADAPTER.encodedSizeWithTag(2, value.getCustomer_abandon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContactSupport$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                ContactSupport$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
                ContactSupport$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContactSupport$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ContactSupport$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                ContactSupport$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContactSupport$Action redact(ContactSupport$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                ContactSupport$Action.Proceed proceed = value.getProceed();
                ContactSupport$Action.Proceed proceedRedact = proceed != null ? ContactSupport$Action.Proceed.ADAPTER.redact(proceed) : null;
                ContactSupport$Action.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                return value.copy(proceedRedact, customer_abandon != null ? ContactSupport$Action.CustomerAbandon.ADAPTER.redact(customer_abandon) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContactSupport$Action decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                ContactSupport$Action.Proceed proceedDecode = null;
                ContactSupport$Action.CustomerAbandon customerAbandonDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContactSupport$Action(proceedDecode, customerAbandonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        proceedDecode = ContactSupport$Action.Proceed.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        customerAbandonDecode = ContactSupport$Action.CustomerAbandon.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: ContactSupport.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$Proceed;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Proceed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28284newBuilder();
        }

        public /* synthetic */ Proceed(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proceed(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28284newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Proceed) && Intrinsics.areEqual(unknownFields(), ((Proceed) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Proceed{}";
        }

        public final Proceed copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Proceed(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Proceed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.ContactSupport$Action$Proceed$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ContactSupport$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ContactSupport$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ContactSupport$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$Action.Proceed redact(ContactSupport$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$Action.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new ContactSupport$Action.Proceed(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: ContactSupport.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/ContactSupport$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28283newBuilder();
        }

        public /* synthetic */ CustomerAbandon(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CustomerAbandon(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28283newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof CustomerAbandon) && Intrinsics.areEqual(unknownFields(), ((CustomerAbandon) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "CustomerAbandon{}";
        }

        public final CustomerAbandon copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CustomerAbandon(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CustomerAbandon.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.ContactSupport$Action$CustomerAbandon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(ContactSupport$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, ContactSupport$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$Action.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new ContactSupport$Action.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, ContactSupport$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public ContactSupport$Action.CustomerAbandon redact(ContactSupport$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
