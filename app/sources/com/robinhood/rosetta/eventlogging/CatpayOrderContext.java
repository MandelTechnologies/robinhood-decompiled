package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.CatpayOrderContext;
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

/* compiled from: CatpayOrderContext.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0019\u001aB)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J(\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext;", "Lcom/squareup/wire/Message;", "", "order_event_data", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "amount_input_chips", "Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;Lokio/ByteString;)V", "getOrder_event_data", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderEventData;", "getAmount_input_chips", "()Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CatpayAmountInputChips", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class CatpayOrderContext extends Message {

    @JvmField
    public static final ProtoAdapter<CatpayOrderContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderContext$CatpayAmountInputChips#ADAPTER", jsonName = "amountInputChips", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CatpayAmountInputChips amount_input_chips;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.CatpayOrderEventData#ADAPTER", jsonName = "orderEventData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CatpayOrderEventData order_event_data;

    public CatpayOrderContext() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24051newBuilder();
    }

    public final CatpayOrderEventData getOrder_event_data() {
        return this.order_event_data;
    }

    public final CatpayAmountInputChips getAmount_input_chips() {
        return this.amount_input_chips;
    }

    public /* synthetic */ CatpayOrderContext(CatpayOrderEventData catpayOrderEventData, CatpayAmountInputChips catpayAmountInputChips, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : catpayOrderEventData, (i & 2) != 0 ? null : catpayAmountInputChips, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatpayOrderContext(CatpayOrderEventData catpayOrderEventData, CatpayAmountInputChips catpayAmountInputChips, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.order_event_data = catpayOrderEventData;
        this.amount_input_chips = catpayAmountInputChips;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24051newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof CatpayOrderContext)) {
            return false;
        }
        CatpayOrderContext catpayOrderContext = (CatpayOrderContext) other;
        return Intrinsics.areEqual(unknownFields(), catpayOrderContext.unknownFields()) && Intrinsics.areEqual(this.order_event_data, catpayOrderContext.order_event_data) && Intrinsics.areEqual(this.amount_input_chips, catpayOrderContext.amount_input_chips);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        CatpayOrderEventData catpayOrderEventData = this.order_event_data;
        int iHashCode2 = (iHashCode + (catpayOrderEventData != null ? catpayOrderEventData.hashCode() : 0)) * 37;
        CatpayAmountInputChips catpayAmountInputChips = this.amount_input_chips;
        int iHashCode3 = iHashCode2 + (catpayAmountInputChips != null ? catpayAmountInputChips.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        CatpayOrderEventData catpayOrderEventData = this.order_event_data;
        if (catpayOrderEventData != null) {
            arrayList.add("order_event_data=" + catpayOrderEventData);
        }
        CatpayAmountInputChips catpayAmountInputChips = this.amount_input_chips;
        if (catpayAmountInputChips != null) {
            arrayList.add("amount_input_chips=" + catpayAmountInputChips);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayOrderContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ CatpayOrderContext copy$default(CatpayOrderContext catpayOrderContext, CatpayOrderEventData catpayOrderEventData, CatpayAmountInputChips catpayAmountInputChips, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            catpayOrderEventData = catpayOrderContext.order_event_data;
        }
        if ((i & 2) != 0) {
            catpayAmountInputChips = catpayOrderContext.amount_input_chips;
        }
        if ((i & 4) != 0) {
            byteString = catpayOrderContext.unknownFields();
        }
        return catpayOrderContext.copy(catpayOrderEventData, catpayAmountInputChips, byteString);
    }

    public final CatpayOrderContext copy(CatpayOrderEventData order_event_data, CatpayAmountInputChips amount_input_chips, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new CatpayOrderContext(order_event_data, amount_input_chips, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayOrderContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<CatpayOrderContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(CatpayOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getOrder_event_data() != null) {
                    size += CatpayOrderEventData.ADAPTER.encodedSizeWithTag(1, value.getOrder_event_data());
                }
                return value.getAmount_input_chips() != null ? size + CatpayOrderContext.CatpayAmountInputChips.ADAPTER.encodedSizeWithTag(2, value.getAmount_input_chips()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, CatpayOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOrder_event_data() != null) {
                    CatpayOrderEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_event_data());
                }
                if (value.getAmount_input_chips() != null) {
                    CatpayOrderContext.CatpayAmountInputChips.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount_input_chips());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, CatpayOrderContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getAmount_input_chips() != null) {
                    CatpayOrderContext.CatpayAmountInputChips.ADAPTER.encodeWithTag(writer, 2, (int) value.getAmount_input_chips());
                }
                if (value.getOrder_event_data() != null) {
                    CatpayOrderEventData.ADAPTER.encodeWithTag(writer, 1, (int) value.getOrder_event_data());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderContext redact(CatpayOrderContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                CatpayOrderEventData order_event_data = value.getOrder_event_data();
                CatpayOrderEventData catpayOrderEventDataRedact = order_event_data != null ? CatpayOrderEventData.ADAPTER.redact(order_event_data) : null;
                CatpayOrderContext.CatpayAmountInputChips amount_input_chips = value.getAmount_input_chips();
                return value.copy(catpayOrderEventDataRedact, amount_input_chips != null ? CatpayOrderContext.CatpayAmountInputChips.ADAPTER.redact(amount_input_chips) : null, ByteString.EMPTY);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public CatpayOrderContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                CatpayOrderEventData catpayOrderEventDataDecode = null;
                CatpayOrderContext.CatpayAmountInputChips catpayAmountInputChipsDecode = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new CatpayOrderContext(catpayOrderEventDataDecode, catpayAmountInputChipsDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        catpayOrderEventDataDecode = CatpayOrderEventData.ADAPTER.decode(reader);
                    } else if (iNextTag == 2) {
                        catpayAmountInputChipsDecode = CatpayOrderContext.CatpayAmountInputChips.ADAPTER.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }

    /* compiled from: CatpayOrderContext.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B+\u0012\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0005H\u0016J*\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/CatpayOrderContext$CatpayAmountInputChips;", "Lcom/squareup/wire/Message;", "", "suggested_amounts", "", "", "selected_amount", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/List;Ljava/lang/String;Lokio/ByteString;)V", "getSelected_amount", "()Ljava/lang/String;", "getSuggested_amounts", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CatpayAmountInputChips extends Message {

        @JvmField
        public static final ProtoAdapter<CatpayAmountInputChips> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "selectedAmount", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final String selected_amount;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "suggestedAmounts", label = WireField.Label.REPEATED, schemaIndex = 0, tag = 1)
        private final java.util.List<String> suggested_amounts;

        public CatpayAmountInputChips() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m24052newBuilder();
        }

        public /* synthetic */ CatpayAmountInputChips(java.util.List list, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        public final String getSelected_amount() {
            return this.selected_amount;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CatpayAmountInputChips(java.util.List<String> suggested_amounts, String selected_amount, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
            Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.selected_amount = selected_amount;
            this.suggested_amounts = Internal.immutableCopyOf("suggested_amounts", suggested_amounts);
        }

        public final java.util.List<String> getSuggested_amounts() {
            return this.suggested_amounts;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m24052newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof CatpayAmountInputChips)) {
                return false;
            }
            CatpayAmountInputChips catpayAmountInputChips = (CatpayAmountInputChips) other;
            return Intrinsics.areEqual(unknownFields(), catpayAmountInputChips.unknownFields()) && Intrinsics.areEqual(this.suggested_amounts, catpayAmountInputChips.suggested_amounts) && Intrinsics.areEqual(this.selected_amount, catpayAmountInputChips.selected_amount);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = (((unknownFields().hashCode() * 37) + this.suggested_amounts.hashCode()) * 37) + this.selected_amount.hashCode();
            this.hashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.suggested_amounts.isEmpty()) {
                arrayList.add("suggested_amounts=" + Internal.sanitize(this.suggested_amounts));
            }
            arrayList.add("selected_amount=" + Internal.sanitize(this.selected_amount));
            return CollectionsKt.joinToString$default(arrayList, ", ", "CatpayAmountInputChips{", "}", 0, null, null, 56, null);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ CatpayAmountInputChips copy$default(CatpayAmountInputChips catpayAmountInputChips, java.util.List list, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                list = catpayAmountInputChips.suggested_amounts;
            }
            if ((i & 2) != 0) {
                str = catpayAmountInputChips.selected_amount;
            }
            if ((i & 4) != 0) {
                byteString = catpayAmountInputChips.unknownFields();
            }
            return catpayAmountInputChips.copy(list, str, byteString);
        }

        public final CatpayAmountInputChips copy(java.util.List<String> suggested_amounts, String selected_amount, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(suggested_amounts, "suggested_amounts");
            Intrinsics.checkNotNullParameter(selected_amount, "selected_amount");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new CatpayAmountInputChips(suggested_amounts, selected_amount, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CatpayAmountInputChips.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<CatpayAmountInputChips>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.CatpayOrderContext$CatpayAmountInputChips$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(CatpayOrderContext.CatpayAmountInputChips value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    int iEncodedSizeWithTag = size + protoAdapter.asRepeated().encodedSizeWithTag(1, value.getSuggested_amounts());
                    return !Intrinsics.areEqual(value.getSelected_amount(), "") ? iEncodedSizeWithTag + protoAdapter.encodedSizeWithTag(2, value.getSelected_amount()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, CatpayOrderContext.CatpayAmountInputChips value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                    protoAdapter.asRepeated().encodeWithTag(writer, 1, (int) value.getSuggested_amounts());
                    if (!Intrinsics.areEqual(value.getSelected_amount(), "")) {
                        protoAdapter.encodeWithTag(writer, 2, (int) value.getSelected_amount());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, CatpayOrderContext.CatpayAmountInputChips value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (!Intrinsics.areEqual(value.getSelected_amount(), "")) {
                        ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getSelected_amount());
                    }
                    ProtoAdapter.STRING.asRepeated().encodeWithTag(writer, 1, (int) value.getSuggested_amounts());
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // com.squareup.wire.ProtoAdapter
                public CatpayOrderContext.CatpayAmountInputChips decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    ArrayList arrayList = new ArrayList();
                    long jBeginMessage = reader.beginMessage();
                    String strDecode = "";
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new CatpayOrderContext.CatpayAmountInputChips(arrayList, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            arrayList.add(ProtoAdapter.STRING.decode(reader));
                        } else if (iNextTag == 2) {
                            strDecode = ProtoAdapter.STRING.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public CatpayOrderContext.CatpayAmountInputChips redact(CatpayOrderContext.CatpayAmountInputChips value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return CatpayOrderContext.CatpayAmountInputChips.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }
}
