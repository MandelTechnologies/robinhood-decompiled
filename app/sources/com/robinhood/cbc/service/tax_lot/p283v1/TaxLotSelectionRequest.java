package com.robinhood.cbc.service.tax_lot.p283v1;

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

/* compiled from: TaxLotSelectionRequest.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0004H\u0016J4\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\nR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/cbc/service/tax_lot/v1/TaxLotSelectionRequest;", "Lcom/squareup/wire/Message;", "", "account_id", "", "instrument_id", "sub_lot_selections", "", "Lcom/robinhood/cbc/service/tax_lot/v1/SubLotSelection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lokio/ByteString;)V", "getAccount_id", "()Ljava/lang/String;", "getInstrument_id", "getSub_lot_selections", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "cbc.tax_lots_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class TaxLotSelectionRequest extends Message {

    @JvmField
    public static final ProtoAdapter<TaxLotSelectionRequest> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "accountId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String account_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "instrumentId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String instrument_id;

    @WireField(adapter = "com.robinhood.cbc.service.tax_lot.v1.SubLotSelection#ADAPTER", jsonName = "subLotSelections", label = WireField.Label.REPEATED, schemaIndex = 2, tag = 3)
    private final List<SubLotSelection> sub_lot_selections;

    public TaxLotSelectionRequest() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ TaxLotSelectionRequest(String str, String str2, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? CollectionsKt.emptyList() : list, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20239newBuilder();
    }

    public final String getAccount_id() {
        return this.account_id;
    }

    public final String getInstrument_id() {
        return this.instrument_id;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TaxLotSelectionRequest(String account_id, String instrument_id, List<SubLotSelection> sub_lot_selections, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.account_id = account_id;
        this.instrument_id = instrument_id;
        this.sub_lot_selections = Internal.immutableCopyOf("sub_lot_selections", sub_lot_selections);
    }

    public final List<SubLotSelection> getSub_lot_selections() {
        return this.sub_lot_selections;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20239newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TaxLotSelectionRequest)) {
            return false;
        }
        TaxLotSelectionRequest taxLotSelectionRequest = (TaxLotSelectionRequest) other;
        return Intrinsics.areEqual(unknownFields(), taxLotSelectionRequest.unknownFields()) && Intrinsics.areEqual(this.account_id, taxLotSelectionRequest.account_id) && Intrinsics.areEqual(this.instrument_id, taxLotSelectionRequest.instrument_id) && Intrinsics.areEqual(this.sub_lot_selections, taxLotSelectionRequest.sub_lot_selections);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.account_id.hashCode()) * 37) + this.instrument_id.hashCode()) * 37) + this.sub_lot_selections.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("account_id=" + Internal.sanitize(this.account_id));
        arrayList.add("instrument_id=" + Internal.sanitize(this.instrument_id));
        if (!this.sub_lot_selections.isEmpty()) {
            arrayList.add("sub_lot_selections=" + this.sub_lot_selections);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "TaxLotSelectionRequest{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TaxLotSelectionRequest copy$default(TaxLotSelectionRequest taxLotSelectionRequest, String str, String str2, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = taxLotSelectionRequest.account_id;
        }
        if ((i & 2) != 0) {
            str2 = taxLotSelectionRequest.instrument_id;
        }
        if ((i & 4) != 0) {
            list = taxLotSelectionRequest.sub_lot_selections;
        }
        if ((i & 8) != 0) {
            byteString = taxLotSelectionRequest.unknownFields();
        }
        return taxLotSelectionRequest.copy(str, str2, list, byteString);
    }

    public final TaxLotSelectionRequest copy(String account_id, String instrument_id, List<SubLotSelection> sub_lot_selections, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(account_id, "account_id");
        Intrinsics.checkNotNullParameter(instrument_id, "instrument_id");
        Intrinsics.checkNotNullParameter(sub_lot_selections, "sub_lot_selections");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new TaxLotSelectionRequest(account_id, instrument_id, sub_lot_selections, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(TaxLotSelectionRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TaxLotSelectionRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.cbc.service.tax_lot.v1.TaxLotSelectionRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TaxLotSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getInstrument_id());
                }
                return size + SubLotSelection.ADAPTER.asRepeated().encodedSizeWithTag(3, value.getSub_lot_selections());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TaxLotSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAccount_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
                }
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                SubLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSub_lot_selections());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TaxLotSelectionRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SubLotSelection.ADAPTER.asRepeated().encodeWithTag(writer, 3, (int) value.getSub_lot_selections());
                if (!Intrinsics.areEqual(value.getInstrument_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getInstrument_id());
                }
                if (Intrinsics.areEqual(value.getAccount_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAccount_id());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelectionRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new TaxLotSelectionRequest(strDecode, strDecode2, arrayList, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        arrayList.add(SubLotSelection.ADAPTER.decode(reader));
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TaxLotSelectionRequest redact(TaxLotSelectionRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return TaxLotSelectionRequest.copy$default(value, null, null, Internal.m26823redactElements(value.getSub_lot_selections(), SubLotSelection.ADAPTER), ByteString.EMPTY, 3, null);
            }
        };
    }
}
