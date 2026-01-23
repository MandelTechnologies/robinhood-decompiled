package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.android.iav.p154ui.PlaidExchangeTokenFragment;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import identi.service.p471v1.models_workflow.p472v1.PlaidAuth;
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

/* compiled from: PlaidAuth.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0004&'()B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006*"}, m3636d2 = {"identi/service/v1/models_workflow/v1/PlaidAuth$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action;", "", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;", "fallback", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;", "proceed", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action;", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;", "getFallback", "()Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;", "Companion", "Fallback", "CustomerAbandon", "Proceed", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.PlaidAuth$Action, reason: use source file name */
/* loaded from: classes21.dex */
public final class PlaidAuth extends Message {

    @JvmField
    public static final ProtoAdapter<PlaidAuth> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidAuth$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 1, tag = 2)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidAuth$Action$Fallback#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Fallback fallback;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.PlaidAuth$Action$Proceed#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final Proceed proceed;

    public PlaidAuth() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28366newBuilder();
    }

    public final Fallback getFallback() {
        return this.fallback;
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public /* synthetic */ PlaidAuth(Fallback fallback, CustomerAbandon customerAbandon, Proceed proceed, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : fallback, (i & 2) != 0 ? null : customerAbandon, (i & 4) != 0 ? null : proceed, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidAuth(Fallback fallback, CustomerAbandon customerAbandon, Proceed proceed, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.fallback = fallback;
        this.customer_abandon = customerAbandon;
        this.proceed = proceed;
        if (Internal.countNonNull(fallback, customerAbandon, proceed) > 1) {
            throw new IllegalArgumentException("At most one of fallback, customer_abandon, proceed may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28366newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PlaidAuth)) {
            return false;
        }
        PlaidAuth plaidAuth = (PlaidAuth) other;
        return Intrinsics.areEqual(unknownFields(), plaidAuth.unknownFields()) && Intrinsics.areEqual(this.fallback, plaidAuth.fallback) && Intrinsics.areEqual(this.customer_abandon, plaidAuth.customer_abandon) && Intrinsics.areEqual(this.proceed, plaidAuth.proceed);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Fallback fallback = this.fallback;
        int iHashCode2 = (iHashCode + (fallback != null ? fallback.hashCode() : 0)) * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode3 = (iHashCode2 + (customerAbandon != null ? customerAbandon.hashCode() : 0)) * 37;
        Proceed proceed = this.proceed;
        int iHashCode4 = iHashCode3 + (proceed != null ? proceed.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Fallback fallback = this.fallback;
        if (fallback != null) {
            arrayList.add("fallback=" + fallback);
        }
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final PlaidAuth copy(Fallback fallback, CustomerAbandon customer_abandon, Proceed proceed, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PlaidAuth(fallback, customer_abandon, proceed, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PlaidAuth.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PlaidAuth>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidAuth$Action$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PlaidAuth value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + PlaidAuth.Fallback.ADAPTER.encodedSizeWithTag(1, value.getFallback()) + PlaidAuth.CustomerAbandon.ADAPTER.encodedSizeWithTag(2, value.getCustomer_abandon()) + PlaidAuth.Proceed.ADAPTER.encodedSizeWithTag(3, value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PlaidAuth value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidAuth.Fallback.ADAPTER.encodeWithTag(writer, 1, (int) value.getFallback());
                PlaidAuth.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                PlaidAuth.Proceed.ADAPTER.encodeWithTag(writer, 3, (int) value.getProceed());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PlaidAuth value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                PlaidAuth.Proceed.ADAPTER.encodeWithTag(writer, 3, (int) value.getProceed());
                PlaidAuth.CustomerAbandon.ADAPTER.encodeWithTag(writer, 2, (int) value.getCustomer_abandon());
                PlaidAuth.Fallback.ADAPTER.encodeWithTag(writer, 1, (int) value.getFallback());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAuth redact(PlaidAuth value) {
                Intrinsics.checkNotNullParameter(value, "value");
                PlaidAuth.Fallback fallback = value.getFallback();
                PlaidAuth.Fallback fallbackRedact = fallback != null ? PlaidAuth.Fallback.ADAPTER.redact(fallback) : null;
                PlaidAuth.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                PlaidAuth.CustomerAbandon customerAbandonRedact = customer_abandon != null ? PlaidAuth.CustomerAbandon.ADAPTER.redact(customer_abandon) : null;
                PlaidAuth.Proceed proceed = value.getProceed();
                return value.copy(fallbackRedact, customerAbandonRedact, proceed != null ? PlaidAuth.Proceed.ADAPTER.redact(proceed) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PlaidAuth decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                PlaidAuth.Fallback fallbackDecode = null;
                PlaidAuth.CustomerAbandon customerAbandonDecode = null;
                PlaidAuth.Proceed proceedDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new PlaidAuth(fallbackDecode, customerAbandonDecode, proceedDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        fallbackDecode = PlaidAuth.Fallback.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        customerAbandonDecode = PlaidAuth.CustomerAbandon.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        proceedDecode = PlaidAuth.Proceed.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: PlaidAuth.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Fallback;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.PlaidAuth$Action$Fallback */
    public static final class Fallback extends Message {

        @JvmField
        public static final ProtoAdapter<Fallback> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Fallback() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28368newBuilder();
        }

        public /* synthetic */ Fallback(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Fallback(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28368newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Fallback) && Intrinsics.areEqual(unknownFields(), ((Fallback) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Fallback{}";
        }

        public final Fallback copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Fallback(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Fallback.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Fallback>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidAuth$Action$Fallback$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidAuth.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidAuth.Fallback value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidAuth.Fallback value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.Fallback redact(PlaidAuth.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.Fallback decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new PlaidAuth.Fallback(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: PlaidAuth.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.PlaidAuth$Action$CustomerAbandon */
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28367newBuilder();
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
        public /* synthetic */ Void m28367newBuilder() {
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
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidAuth$Action$CustomerAbandon$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new PlaidAuth.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidAuth.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidAuth.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidAuth.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.CustomerAbandon redact(PlaidAuth.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: PlaidAuth.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/PlaidAuth$Action$Proceed;", "Lcom/squareup/wire/Message;", "", "institution_id", "", "iav_account_id", "public_token", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getInstitution_id", "()Ljava/lang/String;", "getIav_account_id", "getPublic_token", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.PlaidAuth$Action$Proceed */
    /* loaded from: classes14.dex */
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String iav_account_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "institutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String institution_id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "publicToken", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final String public_token;

        public Proceed() {
            this(null, null, null, null, 15, null);
        }

        public /* synthetic */ Proceed(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28369newBuilder();
        }

        public final String getInstitution_id() {
            return this.institution_id;
        }

        public final String getIav_account_id() {
            return this.iav_account_id;
        }

        public final String getPublic_token() {
            return this.public_token;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Proceed(String institution_id, String iav_account_id, String public_token, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(iav_account_id, "iav_account_id");
            Intrinsics.checkNotNullParameter(public_token, "public_token");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.institution_id = institution_id;
            this.iav_account_id = iav_account_id;
            this.public_token = public_token;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28369newBuilder() {
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
            return Intrinsics.areEqual(unknownFields(), proceed.unknownFields()) && Intrinsics.areEqual(this.institution_id, proceed.institution_id) && Intrinsics.areEqual(this.iav_account_id, proceed.iav_account_id) && Intrinsics.areEqual(this.public_token, proceed.public_token);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((((unknownFields().hashCode() * 37) + this.institution_id.hashCode()) * 37) + this.iav_account_id.hashCode()) * 37) + this.public_token.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("institution_id=" + Internal.sanitize(this.institution_id));
            arrayList.add("iav_account_id=" + Internal.sanitize(this.iav_account_id));
            arrayList.add("public_token=" + Internal.sanitize(this.public_token));
            return CollectionsKt.joinToString$default(arrayList, ", ", "Proceed{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Proceed copy$default(Proceed proceed, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = proceed.institution_id;
            }
            if ((i & 2) != 0) {
                str2 = proceed.iav_account_id;
            }
            if ((i & 4) != 0) {
                str3 = proceed.public_token;
            }
            if ((i & 8) != 0) {
                byteString = proceed.unknownFields();
            }
            return proceed.copy(str, str2, str3, byteString);
        }

        public final Proceed copy(String institution_id, String iav_account_id, String public_token, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(institution_id, "institution_id");
            Intrinsics.checkNotNullParameter(iav_account_id, "iav_account_id");
            Intrinsics.checkNotNullParameter(public_token, "public_token");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Proceed(institution_id, iav_account_id, public_token, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Proceed.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.PlaidAuth$Action$Proceed$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    String strDecode3 = strDecode2;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new PlaidAuth.Proceed(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 3) {
                            strDecode3 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(PlaidAuth.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getInstitution_id());
                    }
                    if (!Intrinsics.areEqual(value.getIav_account_id(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getIav_account_id());
                    }
                    return !Intrinsics.areEqual(value.getPublic_token(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPublic_token()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, PlaidAuth.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getInstitution_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstitution_id());
                    }
                    if (!Intrinsics.areEqual(value.getIav_account_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIav_account_id());
                    }
                    if (!Intrinsics.areEqual(value.getPublic_token(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPublic_token());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, PlaidAuth.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getPublic_token(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPublic_token());
                    }
                    if (!Intrinsics.areEqual(value.getIav_account_id(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getIav_account_id());
                    }
                    if (Intrinsics.areEqual(value.getInstitution_id(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getInstitution_id());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public PlaidAuth.Proceed redact(PlaidAuth.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return PlaidAuth.Proceed.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }
}
