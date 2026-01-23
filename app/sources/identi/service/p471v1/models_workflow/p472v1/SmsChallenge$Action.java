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
import identi.service.p471v1.models_workflow.p472v1.SmsChallenge$Action;
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

/* compiled from: SmsChallenge.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\u0018\u0000 +2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005+,-./BA\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJG\u0010\u001d\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*¨\u00060"}, m3636d2 = {"identi/service/v1/models_workflow/v1/SmsChallenge$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action;", "", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;", "proceed", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;", "fallback", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;", "resend", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;", "customer_abandon", "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action;", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;", "getProceed", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;", "getFallback", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;", "getResend", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;", "Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;", "Companion", "Proceed", "Fallback", "Resend", "CustomerAbandon", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class SmsChallenge$Action extends Message {

    @JvmField
    public static final ProtoAdapter<SmsChallenge$Action> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 3, tag = 4)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$Action$Fallback#ADAPTER", oneofName = "type", schemaIndex = 1, tag = 2)
    private final Fallback fallback;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$Action$Proceed#ADAPTER", oneofName = "type", schemaIndex = 0, tag = 1)
    private final Proceed proceed;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.SmsChallenge$Action$Resend#ADAPTER", oneofName = "type", schemaIndex = 2, tag = 3)
    private final Resend resend;

    public SmsChallenge$Action() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28391newBuilder();
    }

    public final Proceed getProceed() {
        return this.proceed;
    }

    public final Fallback getFallback() {
        return this.fallback;
    }

    public final Resend getResend() {
        return this.resend;
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public /* synthetic */ SmsChallenge$Action(Proceed proceed, Fallback fallback, Resend resend, CustomerAbandon customerAbandon, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : proceed, (i & 2) != 0 ? null : fallback, (i & 4) != 0 ? null : resend, (i & 8) != 0 ? null : customerAbandon, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SmsChallenge$Action(Proceed proceed, Fallback fallback, Resend resend, CustomerAbandon customerAbandon, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.proceed = proceed;
        this.fallback = fallback;
        this.resend = resend;
        this.customer_abandon = customerAbandon;
        if (Internal.countNonNull(proceed, fallback, resend, customerAbandon, new Object[0]) > 1) {
            throw new IllegalArgumentException("At most one of proceed, fallback, resend, customer_abandon may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28391newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SmsChallenge$Action)) {
            return false;
        }
        SmsChallenge$Action smsChallenge$Action = (SmsChallenge$Action) other;
        return Intrinsics.areEqual(unknownFields(), smsChallenge$Action.unknownFields()) && Intrinsics.areEqual(this.proceed, smsChallenge$Action.proceed) && Intrinsics.areEqual(this.fallback, smsChallenge$Action.fallback) && Intrinsics.areEqual(this.resend, smsChallenge$Action.resend) && Intrinsics.areEqual(this.customer_abandon, smsChallenge$Action.customer_abandon);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        Proceed proceed = this.proceed;
        int iHashCode2 = (iHashCode + (proceed != null ? proceed.hashCode() : 0)) * 37;
        Fallback fallback = this.fallback;
        int iHashCode3 = (iHashCode2 + (fallback != null ? fallback.hashCode() : 0)) * 37;
        Resend resend = this.resend;
        int iHashCode4 = (iHashCode3 + (resend != null ? resend.hashCode() : 0)) * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode5 = iHashCode4 + (customerAbandon != null ? customerAbandon.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Proceed proceed = this.proceed;
        if (proceed != null) {
            arrayList.add("proceed=" + proceed);
        }
        Fallback fallback = this.fallback;
        if (fallback != null) {
            arrayList.add("fallback=" + fallback);
        }
        Resend resend = this.resend;
        if (resend != null) {
            arrayList.add("resend=" + resend);
        }
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final SmsChallenge$Action copy(Proceed proceed, Fallback fallback, Resend resend, CustomerAbandon customer_abandon, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SmsChallenge$Action(proceed, fallback, resend, customer_abandon, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SmsChallenge$Action.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SmsChallenge$Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SmsChallenge$Action$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SmsChallenge$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + SmsChallenge$Action.Proceed.ADAPTER.encodedSizeWithTag(1, value.getProceed()) + SmsChallenge$Action.Fallback.ADAPTER.encodedSizeWithTag(2, value.getFallback()) + SmsChallenge$Action.Resend.ADAPTER.encodedSizeWithTag(3, value.getResend()) + SmsChallenge$Action.CustomerAbandon.ADAPTER.encodedSizeWithTag(4, value.getCustomer_abandon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SmsChallenge$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SmsChallenge$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
                SmsChallenge$Action.Fallback.ADAPTER.encodeWithTag(writer, 2, (int) value.getFallback());
                SmsChallenge$Action.Resend.ADAPTER.encodeWithTag(writer, 3, (int) value.getResend());
                SmsChallenge$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 4, (int) value.getCustomer_abandon());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SmsChallenge$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SmsChallenge$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 4, (int) value.getCustomer_abandon());
                SmsChallenge$Action.Resend.ADAPTER.encodeWithTag(writer, 3, (int) value.getResend());
                SmsChallenge$Action.Fallback.ADAPTER.encodeWithTag(writer, 2, (int) value.getFallback());
                SmsChallenge$Action.Proceed.ADAPTER.encodeWithTag(writer, 1, (int) value.getProceed());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SmsChallenge$Action redact(SmsChallenge$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                SmsChallenge$Action.Proceed proceed = value.getProceed();
                SmsChallenge$Action.Proceed proceedRedact = proceed != null ? SmsChallenge$Action.Proceed.ADAPTER.redact(proceed) : null;
                SmsChallenge$Action.Fallback fallback = value.getFallback();
                SmsChallenge$Action.Fallback fallbackRedact = fallback != null ? SmsChallenge$Action.Fallback.ADAPTER.redact(fallback) : null;
                SmsChallenge$Action.Resend resend = value.getResend();
                SmsChallenge$Action.Resend resendRedact = resend != null ? SmsChallenge$Action.Resend.ADAPTER.redact(resend) : null;
                SmsChallenge$Action.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                return value.copy(proceedRedact, fallbackRedact, resendRedact, customer_abandon != null ? SmsChallenge$Action.CustomerAbandon.ADAPTER.redact(customer_abandon) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SmsChallenge$Action decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                SmsChallenge$Action.Proceed proceedDecode = null;
                SmsChallenge$Action.Fallback fallbackDecode = null;
                SmsChallenge$Action.Resend resendDecode = null;
                SmsChallenge$Action.CustomerAbandon customerAbandonDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SmsChallenge$Action(proceedDecode, fallbackDecode, resendDecode, customerAbandonDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        proceedDecode = SmsChallenge$Action.Proceed.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        fallbackDecode = SmsChallenge$Action.Fallback.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        resendDecode = SmsChallenge$Action.Resend.ADAPTER.decode(reader);
                    } else if (iNextTag == 4) {
                        customerAbandonDecode = SmsChallenge$Action.CustomerAbandon.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: SmsChallenge.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Proceed;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Proceed extends Message {

        @JvmField
        public static final ProtoAdapter<Proceed> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Proceed() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28394newBuilder();
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
        public /* synthetic */ Void m28394newBuilder() {
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
            ADAPTER = new ProtoAdapter<Proceed>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SmsChallenge$Action$Proceed$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SmsChallenge$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SmsChallenge$Action.Proceed value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SmsChallenge$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Proceed redact(SmsChallenge$Action.Proceed value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Proceed decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new SmsChallenge$Action.Proceed(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: SmsChallenge.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Fallback;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Fallback extends Message {

        @JvmField
        public static final ProtoAdapter<Fallback> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Fallback() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28393newBuilder();
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
        public /* synthetic */ Void m28393newBuilder() {
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
            ADAPTER = new ProtoAdapter<Fallback>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SmsChallenge$Action$Fallback$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Fallback decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new SmsChallenge$Action.Fallback(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SmsChallenge$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SmsChallenge$Action.Fallback value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SmsChallenge$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Fallback redact(SmsChallenge$Action.Fallback value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: SmsChallenge.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$Resend;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Resend extends Message {

        @JvmField
        public static final ProtoAdapter<Resend> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public Resend() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28395newBuilder();
        }

        public /* synthetic */ Resend(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Resend(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28395newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof Resend) && Intrinsics.areEqual(unknownFields(), ((Resend) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "Resend{}";
        }

        public final Resend copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Resend(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Resend.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Resend>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SmsChallenge$Action$Resend$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Resend decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new SmsChallenge$Action.Resend(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SmsChallenge$Action.Resend value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SmsChallenge$Action.Resend value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SmsChallenge$Action.Resend value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.Resend redact(SmsChallenge$Action.Resend value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: SmsChallenge.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/SmsChallenge$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28392newBuilder();
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
        public /* synthetic */ Void m28392newBuilder() {
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
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.SmsChallenge$Action$CustomerAbandon$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new SmsChallenge$Action.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(SmsChallenge$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, SmsChallenge$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, SmsChallenge$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public SmsChallenge$Action.CustomerAbandon redact(SmsChallenge$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
