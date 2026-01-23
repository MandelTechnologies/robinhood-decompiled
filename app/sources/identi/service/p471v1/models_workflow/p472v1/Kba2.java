package identi.service.p471v1.models_workflow.p472v1;

import com.robinhood.shared.crypto.transfer.send.amount.WarningSheetContent5;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.GovernmentIdNfcScan;
import identi.service.p471v1.models_workflow.p472v1.Kba2;
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

/* compiled from: Kba.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003!\"#B)\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J/\u0010\u0019\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006$"}, m3636d2 = {"identi/service/v1/models_workflow/v1/Kba$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/Kba$Action;", "", "Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/Kba$Action;", "Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;", "getPrimary_cta", "()Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;", "Companion", "CustomerAbandon", "PrimaryCta", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: identi.service.v1.models_workflow.v1.Kba$Action, reason: use source file name */
/* loaded from: classes21.dex */
public final class Kba2 extends Message {

    @JvmField
    public static final ProtoAdapter<Kba2> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Kba$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 0, tag = 1)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.Kba$Action$PrimaryCta#ADAPTER", jsonName = "primaryCta", oneofName = "type", schemaIndex = 1, tag = 2)
    private final PrimaryCta primary_cta;

    public Kba2() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28350newBuilder();
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public final PrimaryCta getPrimary_cta() {
        return this.primary_cta;
    }

    public /* synthetic */ Kba2(CustomerAbandon customerAbandon, PrimaryCta primaryCta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerAbandon, (i & 2) != 0 ? null : primaryCta, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Kba2(CustomerAbandon customerAbandon, PrimaryCta primaryCta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.customer_abandon = customerAbandon;
        this.primary_cta = primaryCta;
        if (Internal.countNonNull(customerAbandon, primaryCta) > 1) {
            throw new IllegalArgumentException("At most one of customer_abandon, primary_cta may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28350newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Kba2)) {
            return false;
        }
        Kba2 kba2 = (Kba2) other;
        return Intrinsics.areEqual(unknownFields(), kba2.unknownFields()) && Intrinsics.areEqual(this.customer_abandon, kba2.customer_abandon) && Intrinsics.areEqual(this.primary_cta, kba2.primary_cta);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CustomerAbandon customerAbandon = this.customer_abandon;
        int iHashCode2 = (iHashCode + (customerAbandon != null ? customerAbandon.hashCode() : 0)) * 37;
        PrimaryCta primaryCta = this.primary_cta;
        int iHashCode3 = iHashCode2 + (primaryCta != null ? primaryCta.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CustomerAbandon customerAbandon = this.customer_abandon;
        if (customerAbandon != null) {
            arrayList.add("customer_abandon=" + customerAbandon);
        }
        PrimaryCta primaryCta = this.primary_cta;
        if (primaryCta != null) {
            arrayList.add("primary_cta=" + primaryCta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final Kba2 copy(CustomerAbandon customer_abandon, PrimaryCta primary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Kba2(customer_abandon, primary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Kba2.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Kba2>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Kba$Action$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Kba2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + Kba2.CustomerAbandon.ADAPTER.encodedSizeWithTag(1, value.getCustomer_abandon()) + Kba2.PrimaryCta.ADAPTER.encodedSizeWithTag(2, value.getPrimary_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Kba2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                Kba2.CustomerAbandon.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustomer_abandon());
                Kba2.PrimaryCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrimary_cta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Kba2 value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                Kba2.PrimaryCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrimary_cta());
                Kba2.CustomerAbandon.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustomer_abandon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Kba2 redact(Kba2 value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Kba2.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                Kba2.CustomerAbandon customerAbandonRedact = customer_abandon != null ? Kba2.CustomerAbandon.ADAPTER.redact(customer_abandon) : null;
                Kba2.PrimaryCta primary_cta = value.getPrimary_cta();
                return value.copy(customerAbandonRedact, primary_cta != null ? Kba2.PrimaryCta.ADAPTER.redact(primary_cta) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Kba2 decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                Kba2.CustomerAbandon customerAbandonDecode = null;
                Kba2.PrimaryCta primaryCtaDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Kba2(customerAbandonDecode, primaryCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        customerAbandonDecode = Kba2.CustomerAbandon.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        primaryCtaDecode = Kba2.PrimaryCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: Kba.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Kba$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.Kba$Action$CustomerAbandon */
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28351newBuilder();
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
        public /* synthetic */ Void m28351newBuilder() {
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
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Kba$Action$CustomerAbandon$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Kba2.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Kba2.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Kba2.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Kba2.CustomerAbandon redact(Kba2.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Kba2.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new Kba2.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            };
        }
    }

    /* compiled from: Kba.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/Kba$Action$PrimaryCta;", "Lcom/squareup/wire/Message;", "", GovernmentIdNfcScan.dateOfBirthName, "", "ssn", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getDate_of_birth", "()Ljava/lang/String;", "getSsn", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: identi.service.v1.models_workflow.v1.Kba$Action$PrimaryCta */
    public static final class PrimaryCta extends Message {

        @JvmField
        public static final ProtoAdapter<PrimaryCta> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "dateOfBirth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String date_of_birth;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String ssn;

        public PrimaryCta() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ PrimaryCta(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28352newBuilder();
        }

        public final String getDate_of_birth() {
            return this.date_of_birth;
        }

        public final String getSsn() {
            return this.ssn;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimaryCta(String date_of_birth, String ssn, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(ssn, "ssn");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.date_of_birth = date_of_birth;
            this.ssn = ssn;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28352newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof PrimaryCta)) {
                return false;
            }
            PrimaryCta primaryCta = (PrimaryCta) other;
            return Intrinsics.areEqual(unknownFields(), primaryCta.unknownFields()) && Intrinsics.areEqual(this.date_of_birth, primaryCta.date_of_birth) && Intrinsics.areEqual(this.ssn, primaryCta.ssn);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.date_of_birth.hashCode()) * 37) + this.ssn.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("date_of_birth=" + Internal.sanitize(this.date_of_birth));
            arrayList.add("ssn=" + Internal.sanitize(this.ssn));
            return CollectionsKt.joinToString$default(arrayList, ", ", "PrimaryCta{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ PrimaryCta copy$default(PrimaryCta primaryCta, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = primaryCta.date_of_birth;
            }
            if ((i & 2) != 0) {
                str2 = primaryCta.ssn;
            }
            if ((i & 4) != 0) {
                byteString = primaryCta.unknownFields();
            }
            return primaryCta.copy(str, str2, byteString);
        }

        public final PrimaryCta copy(String date_of_birth, String ssn, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(date_of_birth, "date_of_birth");
            Intrinsics.checkNotNullParameter(ssn, "ssn");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PrimaryCta(date_of_birth, ssn, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrimaryCta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PrimaryCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.Kba$Action$PrimaryCta$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public Kba2.PrimaryCta decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new Kba2.PrimaryCta(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 2) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(Kba2.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getDate_of_birth());
                    }
                    return !Intrinsics.areEqual(value.getSsn(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getSsn()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, Kba2.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDate_of_birth());
                    }
                    if (!Intrinsics.areEqual(value.getSsn(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSsn());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, Kba2.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getSsn(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSsn());
                    }
                    if (Intrinsics.areEqual(value.getDate_of_birth(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getDate_of_birth());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public Kba2.PrimaryCta redact(Kba2.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return Kba2.PrimaryCta.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }
}
