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
import identi.service.p471v1.models_workflow.p472v1.GKba$Action;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: GKba.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0005&'()*B5\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ;\u0010\u001b\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%¨\u0006+"}, m3636d2 = {"identi/service/v1/models_workflow/v1/GKba$Action", "Lcom/squareup/wire/Message;", "Lidenti/service/v1/models_workflow/v1/GKba$Action;", "", "Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;", "customer_abandon", "Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;", WarningSheetContent5.TEST_TAG_PRIMARY_CTA, "Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;", WarningSheetContent5.TEST_TAG_SECONDARY_CTA, "Lokio/ByteString;", "unknownFields", "<init>", "(Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;Lokio/ByteString;)V", "newBuilder", "()Ljava/lang/Void;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "copy", "(Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;Lokio/ByteString;)Lidenti/service/v1/models_workflow/v1/GKba$Action;", "Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;", "getCustomer_abandon", "()Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;", "Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;", "getPrimary_cta", "()Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;", "Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;", "getSecondary_cta", "()Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;", "Companion", "FieldInput", "CustomerAbandon", "PrimaryCta", "SecondaryCta", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes14.dex */
public final class GKba$Action extends Message {

    @JvmField
    public static final ProtoAdapter<GKba$Action> ADAPTER;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$Action$CustomerAbandon#ADAPTER", jsonName = "customerAbandon", oneofName = "type", schemaIndex = 0, tag = 1)
    private final CustomerAbandon customer_abandon;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$Action$PrimaryCta#ADAPTER", jsonName = "primaryCta", oneofName = "type", schemaIndex = 1, tag = 2)
    private final PrimaryCta primary_cta;

    @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$Action$SecondaryCta#ADAPTER", jsonName = "secondaryCta", oneofName = "type", schemaIndex = 2, tag = 3)
    private final SecondaryCta secondary_cta;

    public GKba$Action() {
        this(null, null, null, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28326newBuilder();
    }

    public final CustomerAbandon getCustomer_abandon() {
        return this.customer_abandon;
    }

    public final PrimaryCta getPrimary_cta() {
        return this.primary_cta;
    }

    public final SecondaryCta getSecondary_cta() {
        return this.secondary_cta;
    }

    public /* synthetic */ GKba$Action(CustomerAbandon customerAbandon, PrimaryCta primaryCta, SecondaryCta secondaryCta, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : customerAbandon, (i & 2) != 0 ? null : primaryCta, (i & 4) != 0 ? null : secondaryCta, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GKba$Action(CustomerAbandon customerAbandon, PrimaryCta primaryCta, SecondaryCta secondaryCta, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.customer_abandon = customerAbandon;
        this.primary_cta = primaryCta;
        this.secondary_cta = secondaryCta;
        if (Internal.countNonNull(customerAbandon, primaryCta, secondaryCta) > 1) {
            throw new IllegalArgumentException("At most one of customer_abandon, primary_cta, secondary_cta may be non-null");
        }
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28326newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof GKba$Action)) {
            return false;
        }
        GKba$Action gKba$Action = (GKba$Action) other;
        return Intrinsics.areEqual(unknownFields(), gKba$Action.unknownFields()) && Intrinsics.areEqual(this.customer_abandon, gKba$Action.customer_abandon) && Intrinsics.areEqual(this.primary_cta, gKba$Action.primary_cta) && Intrinsics.areEqual(this.secondary_cta, gKba$Action.secondary_cta);
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
        int iHashCode3 = (iHashCode2 + (primaryCta != null ? primaryCta.hashCode() : 0)) * 37;
        SecondaryCta secondaryCta = this.secondary_cta;
        int iHashCode4 = iHashCode3 + (secondaryCta != null ? secondaryCta.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
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
        SecondaryCta secondaryCta = this.secondary_cta;
        if (secondaryCta != null) {
            arrayList.add("secondary_cta=" + secondaryCta);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Action{", "}", 0, null, null, 56, null);
    }

    public final GKba$Action copy(CustomerAbandon customer_abandon, PrimaryCta primary_cta, SecondaryCta secondary_cta, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new GKba$Action(customer_abandon, primary_cta, secondary_cta, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GKba$Action.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<GKba$Action>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$Action$Companion$ADAPTER$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public GKba$Action decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                GKba$Action.CustomerAbandon customerAbandonDecode = null;
                GKba$Action.PrimaryCta primaryCtaDecode = null;
                GKba$Action.SecondaryCta secondaryCtaDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new GKba$Action(customerAbandonDecode, primaryCtaDecode, secondaryCtaDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        customerAbandonDecode = GKba$Action.CustomerAbandon.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        primaryCtaDecode = GKba$Action.PrimaryCta.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        secondaryCtaDecode = GKba$Action.SecondaryCta.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(GKba$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return value.unknownFields().size() + GKba$Action.CustomerAbandon.ADAPTER.encodedSizeWithTag(1, value.getCustomer_abandon()) + GKba$Action.PrimaryCta.ADAPTER.encodedSizeWithTag(2, value.getPrimary_cta()) + GKba$Action.SecondaryCta.ADAPTER.encodedSizeWithTag(3, value.getSecondary_cta());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, GKba$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                GKba$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustomer_abandon());
                GKba$Action.PrimaryCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrimary_cta());
                GKba$Action.SecondaryCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getSecondary_cta());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, GKba$Action value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                GKba$Action.SecondaryCta.ADAPTER.encodeWithTag(writer, 3, (int) value.getSecondary_cta());
                GKba$Action.PrimaryCta.ADAPTER.encodeWithTag(writer, 2, (int) value.getPrimary_cta());
                GKba$Action.CustomerAbandon.ADAPTER.encodeWithTag(writer, 1, (int) value.getCustomer_abandon());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public GKba$Action redact(GKba$Action value) {
                Intrinsics.checkNotNullParameter(value, "value");
                GKba$Action.CustomerAbandon customer_abandon = value.getCustomer_abandon();
                GKba$Action.CustomerAbandon customerAbandonRedact = customer_abandon != null ? GKba$Action.CustomerAbandon.ADAPTER.redact(customer_abandon) : null;
                GKba$Action.PrimaryCta primary_cta = value.getPrimary_cta();
                GKba$Action.PrimaryCta primaryCtaRedact = primary_cta != null ? GKba$Action.PrimaryCta.ADAPTER.redact(primary_cta) : null;
                GKba$Action.SecondaryCta secondary_cta = value.getSecondary_cta();
                return value.copy(customerAbandonRedact, primaryCtaRedact, secondary_cta != null ? GKba$Action.SecondaryCta.ADAPTER.redact(secondary_cta) : null, ByteString.EMPTY);
            }
        };
    }

    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$Action$FieldInput;", "Lcom/squareup/wire/Message;", "", "id", "", "value", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getId", "()Ljava/lang/String;", "getValue", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FieldInput extends Message {

        @JvmField
        public static final ProtoAdapter<FieldInput> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final String id;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String value;

        public FieldInput() {
            this(null, null, null, 7, null);
        }

        public /* synthetic */ FieldInput(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28328newBuilder();
        }

        public final String getId() {
            return this.id;
        }

        public final String getValue() {
            return this.value;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FieldInput(String id, String value, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.id = id;
            this.value = value;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28328newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FieldInput)) {
                return false;
            }
            FieldInput fieldInput = (FieldInput) other;
            return Intrinsics.areEqual(unknownFields(), fieldInput.unknownFields()) && Intrinsics.areEqual(this.id, fieldInput.id) && Intrinsics.areEqual(this.value, fieldInput.value);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.id.hashCode()) * 37) + this.value.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            arrayList.add("id=" + Internal.sanitize(this.id));
            arrayList.add("value=" + Internal.sanitize(this.value));
            return CollectionsKt.joinToString$default(arrayList, ", ", "FieldInput{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ FieldInput copy$default(FieldInput fieldInput, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fieldInput.id;
            }
            if ((i & 2) != 0) {
                str2 = fieldInput.value;
            }
            if ((i & 4) != 0) {
                byteString = fieldInput.unknownFields();
            }
            return fieldInput.copy(str, str2, byteString);
        }

        public final FieldInput copy(String id, String value, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(value, "value");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new FieldInput(id, value, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FieldInput.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<FieldInput>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$Action$FieldInput$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.FieldInput decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    String strDecode2 = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GKba$Action.FieldInput(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
                public int encodedSize(GKba$Action.FieldInput value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getId());
                    }
                    return !Intrinsics.areEqual(value.getValue(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getValue()) : size;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GKba$Action.FieldInput value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (!Intrinsics.areEqual(value.getId(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                    }
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GKba$Action.FieldInput value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getValue(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getValue());
                    }
                    if (Intrinsics.areEqual(value.getId(), "")) {
                        return;
                    }
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getId());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.FieldInput redact(GKba$Action.FieldInput value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GKba$Action.FieldInput.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$Action$CustomerAbandon;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CustomerAbandon extends Message {

        @JvmField
        public static final ProtoAdapter<CustomerAbandon> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public CustomerAbandon() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28327newBuilder();
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
        public /* synthetic */ Void m28327newBuilder() {
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
            ADAPTER = new ProtoAdapter<CustomerAbandon>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$Action$CustomerAbandon$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.CustomerAbandon decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new GKba$Action.CustomerAbandon(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GKba$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GKba$Action.CustomerAbandon value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GKba$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.CustomerAbandon redact(GKba$Action.CustomerAbandon value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }

    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB9\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0007H\u0016J8\u0010\u001a\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$Action$PrimaryCta;", "Lcom/squareup/wire/Message;", "", "field_inputs", "", "Lidenti/service/v1/models_workflow/v1/GKba$Action$FieldInput;", "gr_token", "", "gr_key", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getGr_token", "()Ljava/lang/String;", "getGr_key", "getField_inputs", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PrimaryCta extends Message {

        @JvmField
        public static final ProtoAdapter<PrimaryCta> ADAPTER;

        @WireField(adapter = "identi.service.v1.models_workflow.v1.GKba$Action$FieldInput#ADAPTER", jsonName = "fieldInputs", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 3)
        private final List<FieldInput> field_inputs;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grKey", schemaIndex = 2, tag = 5)
        private final String gr_key;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "grToken", schemaIndex = 1, tag = 4)
        private final String gr_token;

        public PrimaryCta() {
            this(null, null, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28329newBuilder();
        }

        public /* synthetic */ PrimaryCta(List list, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getGr_token() {
            return this.gr_token;
        }

        public final String getGr_key() {
            return this.gr_key;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PrimaryCta(List<FieldInput> field_inputs, String str, String str2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(field_inputs, "field_inputs");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.gr_token = str;
            this.gr_key = str2;
            this.field_inputs = Internal.immutableCopyOf("field_inputs", field_inputs);
        }

        public final List<FieldInput> getField_inputs() {
            return this.field_inputs;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28329newBuilder() {
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
            return Intrinsics.areEqual(unknownFields(), primaryCta.unknownFields()) && Intrinsics.areEqual(this.field_inputs, primaryCta.field_inputs) && Intrinsics.areEqual(this.gr_token, primaryCta.gr_token) && Intrinsics.areEqual(this.gr_key, primaryCta.gr_key);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = ((unknownFields().hashCode() * 37) + this.field_inputs.hashCode()) * 37;
            String str = this.gr_token;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 37;
            String str2 = this.gr_key;
            int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.field_inputs.isEmpty()) {
                arrayList.add("field_inputs=" + this.field_inputs);
            }
            String str = this.gr_token;
            if (str != null) {
                arrayList.add("gr_token=" + Internal.sanitize(str));
            }
            String str2 = this.gr_key;
            if (str2 != null) {
                arrayList.add("gr_key=" + Internal.sanitize(str2));
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "PrimaryCta{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PrimaryCta copy$default(PrimaryCta primaryCta, List list, String str, String str2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = primaryCta.field_inputs;
            }
            if ((i & 2) != 0) {
                str = primaryCta.gr_token;
            }
            if ((i & 4) != 0) {
                str2 = primaryCta.gr_key;
            }
            if ((i & 8) != 0) {
                byteString = primaryCta.unknownFields();
            }
            return primaryCta.copy(list, str, str2, byteString);
        }

        public final PrimaryCta copy(List<FieldInput> field_inputs, String gr_token, String gr_key, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(field_inputs, "field_inputs");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new PrimaryCta(field_inputs, gr_token, gr_key, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PrimaryCta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<PrimaryCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$Action$PrimaryCta$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GKba$Action.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size() + GKba$Action.FieldInput.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getField_inputs());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    return size + protoAdapter.encodedSizeWithTag(4, value.getGr_token()) + protoAdapter.encodedSizeWithTag(5, value.getGr_key());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GKba$Action.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    GKba$Action.FieldInput.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getField_inputs());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getGr_token());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getGr_key());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GKba$Action.PrimaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getGr_key());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getGr_token());
                    GKba$Action.FieldInput.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getField_inputs());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.PrimaryCta decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = null;
                    String strDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new GKba$Action.PrimaryCta(arrayList, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 3) {
                            arrayList.add(GKba$Action.FieldInput.ADAPTER.decode(reader));
                        } else if (iNextTag == 4) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else if (iNextTag == 5) {
                            strDecode2 = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.PrimaryCta redact(GKba$Action.PrimaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return GKba$Action.PrimaryCta.copy$default(value, Internal.m26823redactElements(value.getField_inputs(), GKba$Action.FieldInput.ADAPTER), null, null, ByteString.EMPTY, 6, null);
                }
            };
        }
    }

    /* compiled from: GKba.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\u0007\u001a\u00020\u0002H\u0017J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0004¨\u0006\u0012"}, m3636d2 = {"Lidenti/service/v1/models_workflow/v1/GKba$Action$SecondaryCta;", "Lcom/squareup/wire/Message;", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lokio/ByteString;)V", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "identi.v1.models_workflow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SecondaryCta extends Message {

        @JvmField
        public static final ProtoAdapter<SecondaryCta> ADAPTER;

        /* JADX WARN: Multi-variable type inference failed */
        public SecondaryCta() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m28330newBuilder();
        }

        public /* synthetic */ SecondaryCta(ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SecondaryCta(ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m28330newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            return (other instanceof SecondaryCta) && Intrinsics.areEqual(unknownFields(), ((SecondaryCta) other).unknownFields());
        }

        public int hashCode() {
            return unknownFields().hashCode();
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            return "SecondaryCta{}";
        }

        public final SecondaryCta copy(ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new SecondaryCta(unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SecondaryCta.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<SecondaryCta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: identi.service.v1.models_workflow.v1.GKba$Action$SecondaryCta$Companion$ADAPTER$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.SecondaryCta decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            reader.readUnknownField(iNextTag);
                        } else {
                            return new GKba$Action.SecondaryCta(reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(GKba$Action.SecondaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, GKba$Action.SecondaryCta value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, GKba$Action.SecondaryCta value) {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public GKba$Action.SecondaryCta redact(GKba$Action.SecondaryCta value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.copy(ByteString.EMPTY);
                }
            };
        }
    }
}
