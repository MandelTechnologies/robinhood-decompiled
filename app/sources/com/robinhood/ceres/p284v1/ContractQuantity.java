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

/* compiled from: ContractQuantity.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/ceres/v1/ContractQuantity;", "Lcom/squareup/wire/Message;", "", "contract_id", "", "held_quantity", "pending_quantity", "net_quantity", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getContract_id", "()Ljava/lang/String;", "getHeld_quantity", "getPending_quantity", "getNet_quantity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "ceres.entity.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ContractQuantity extends Message {

    @JvmField
    public static final ProtoAdapter<ContractQuantity> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "contractId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String contract_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "heldQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String held_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "netQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String net_quantity;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "pendingQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String pending_quantity;

    public ContractQuantity() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ ContractQuantity(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m20283newBuilder();
    }

    public final String getContract_id() {
        return this.contract_id;
    }

    public final String getHeld_quantity() {
        return this.held_quantity;
    }

    public final String getPending_quantity() {
        return this.pending_quantity;
    }

    public final String getNet_quantity() {
        return this.net_quantity;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContractQuantity(String contract_id, String held_quantity, String pending_quantity, String net_quantity, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(held_quantity, "held_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(net_quantity, "net_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.contract_id = contract_id;
        this.held_quantity = held_quantity;
        this.pending_quantity = pending_quantity;
        this.net_quantity = net_quantity;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m20283newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ContractQuantity)) {
            return false;
        }
        ContractQuantity contractQuantity = (ContractQuantity) other;
        return Intrinsics.areEqual(unknownFields(), contractQuantity.unknownFields()) && Intrinsics.areEqual(this.contract_id, contractQuantity.contract_id) && Intrinsics.areEqual(this.held_quantity, contractQuantity.held_quantity) && Intrinsics.areEqual(this.pending_quantity, contractQuantity.pending_quantity) && Intrinsics.areEqual(this.net_quantity, contractQuantity.net_quantity);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.contract_id.hashCode()) * 37) + this.held_quantity.hashCode()) * 37) + this.pending_quantity.hashCode()) * 37) + this.net_quantity.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("contract_id=" + Internal.sanitize(this.contract_id));
        arrayList.add("held_quantity=" + Internal.sanitize(this.held_quantity));
        arrayList.add("pending_quantity=" + Internal.sanitize(this.pending_quantity));
        arrayList.add("net_quantity=" + Internal.sanitize(this.net_quantity));
        return CollectionsKt.joinToString$default(arrayList, ", ", "ContractQuantity{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ContractQuantity copy$default(ContractQuantity contractQuantity, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contractQuantity.contract_id;
        }
        if ((i & 2) != 0) {
            str2 = contractQuantity.held_quantity;
        }
        if ((i & 4) != 0) {
            str3 = contractQuantity.pending_quantity;
        }
        if ((i & 8) != 0) {
            str4 = contractQuantity.net_quantity;
        }
        if ((i & 16) != 0) {
            byteString = contractQuantity.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return contractQuantity.copy(str, str2, str5, str4, byteString2);
    }

    public final ContractQuantity copy(String contract_id, String held_quantity, String pending_quantity, String net_quantity, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(contract_id, "contract_id");
        Intrinsics.checkNotNullParameter(held_quantity, "held_quantity");
        Intrinsics.checkNotNullParameter(pending_quantity, "pending_quantity");
        Intrinsics.checkNotNullParameter(net_quantity, "net_quantity");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ContractQuantity(contract_id, held_quantity, pending_quantity, net_quantity, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ContractQuantity.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ContractQuantity>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.ceres.v1.ContractQuantity$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ContractQuantity value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getHeld_quantity());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPending_quantity());
                }
                return !Intrinsics.areEqual(value.getNet_quantity(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getNet_quantity()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ContractQuantity value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getContract_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeld_quantity());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPending_quantity());
                }
                if (!Intrinsics.areEqual(value.getNet_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNet_quantity());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ContractQuantity value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getNet_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getNet_quantity());
                }
                if (!Intrinsics.areEqual(value.getPending_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPending_quantity());
                }
                if (!Intrinsics.areEqual(value.getHeld_quantity(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getHeld_quantity());
                }
                if (Intrinsics.areEqual(value.getContract_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getContract_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ContractQuantity redact(ContractQuantity value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ContractQuantity.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ContractQuantity decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ContractQuantity(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
