package com.robinhood.rosetta.mainst;

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
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: PinnacleCorrectionDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001&By\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u001d\u001a\u00020\u0002H\u0017J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\b\u0010$\u001a\u00020\u0004H\u0016Jx\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016¨\u0006'"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/PinnacleCorrectionDetails;", "Lcom/squareup/wire/Message;", "", "previous_venue_execution_id", "", "new_venue_execution_id", "new_price", "Lcom/robinhood/rosetta/mainst/Decimal;", "new_quantity", "new_sec_fee", "new_taf_fee", "new_rounded_notional", "new_or_fee", "new_occ_fee", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lcom/robinhood/rosetta/mainst/Decimal;Lokio/ByteString;)V", "getPrevious_venue_execution_id", "()Ljava/lang/String;", "getNew_venue_execution_id", "getNew_price", "()Lcom/robinhood/rosetta/mainst/Decimal;", "getNew_quantity", "getNew_sec_fee", "getNew_taf_fee", "getNew_rounded_notional", "getNew_or_fee", "getNew_occ_fee", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PinnacleCorrectionDetails extends Message {

    @JvmField
    public static final ProtoAdapter<PinnacleCorrectionDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newOccFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 8, tag = 9)
    private final Decimal new_occ_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newOrFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final Decimal new_or_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newPrice", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Decimal new_price;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newQuantity", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Decimal new_quantity;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newRoundedNotional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final Decimal new_rounded_notional;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newSecFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Decimal new_sec_fee;

    @WireField(adapter = "com.robinhood.rosetta.mainst.Decimal#ADAPTER", jsonName = "newTafFee", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final Decimal new_taf_fee;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "newVenueExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String new_venue_execution_id;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "previousVenueExecutionId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String previous_venue_execution_id;

    public PinnacleCorrectionDetails() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public /* synthetic */ PinnacleCorrectionDetails(String str, String str2, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : decimal, (i & 8) != 0 ? null : decimal2, (i & 16) != 0 ? null : decimal3, (i & 32) != 0 ? null : decimal4, (i & 64) != 0 ? null : decimal5, (i & 128) != 0 ? null : decimal6, (i & 256) != 0 ? null : decimal7, (i & 512) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24696newBuilder();
    }

    public final String getPrevious_venue_execution_id() {
        return this.previous_venue_execution_id;
    }

    public final String getNew_venue_execution_id() {
        return this.new_venue_execution_id;
    }

    public final Decimal getNew_price() {
        return this.new_price;
    }

    public final Decimal getNew_quantity() {
        return this.new_quantity;
    }

    public final Decimal getNew_sec_fee() {
        return this.new_sec_fee;
    }

    public final Decimal getNew_taf_fee() {
        return this.new_taf_fee;
    }

    public final Decimal getNew_rounded_notional() {
        return this.new_rounded_notional;
    }

    public final Decimal getNew_or_fee() {
        return this.new_or_fee;
    }

    public final Decimal getNew_occ_fee() {
        return this.new_occ_fee;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PinnacleCorrectionDetails(String previous_venue_execution_id, String new_venue_execution_id, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
        Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.previous_venue_execution_id = previous_venue_execution_id;
        this.new_venue_execution_id = new_venue_execution_id;
        this.new_price = decimal;
        this.new_quantity = decimal2;
        this.new_sec_fee = decimal3;
        this.new_taf_fee = decimal4;
        this.new_rounded_notional = decimal5;
        this.new_or_fee = decimal6;
        this.new_occ_fee = decimal7;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24696newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PinnacleCorrectionDetails)) {
            return false;
        }
        PinnacleCorrectionDetails pinnacleCorrectionDetails = (PinnacleCorrectionDetails) other;
        return Intrinsics.areEqual(unknownFields(), pinnacleCorrectionDetails.unknownFields()) && Intrinsics.areEqual(this.previous_venue_execution_id, pinnacleCorrectionDetails.previous_venue_execution_id) && Intrinsics.areEqual(this.new_venue_execution_id, pinnacleCorrectionDetails.new_venue_execution_id) && Intrinsics.areEqual(this.new_price, pinnacleCorrectionDetails.new_price) && Intrinsics.areEqual(this.new_quantity, pinnacleCorrectionDetails.new_quantity) && Intrinsics.areEqual(this.new_sec_fee, pinnacleCorrectionDetails.new_sec_fee) && Intrinsics.areEqual(this.new_taf_fee, pinnacleCorrectionDetails.new_taf_fee) && Intrinsics.areEqual(this.new_rounded_notional, pinnacleCorrectionDetails.new_rounded_notional) && Intrinsics.areEqual(this.new_or_fee, pinnacleCorrectionDetails.new_or_fee) && Intrinsics.areEqual(this.new_occ_fee, pinnacleCorrectionDetails.new_occ_fee);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((unknownFields().hashCode() * 37) + this.previous_venue_execution_id.hashCode()) * 37) + this.new_venue_execution_id.hashCode()) * 37;
        Decimal decimal = this.new_price;
        int iHashCode2 = (iHashCode + (decimal != null ? decimal.hashCode() : 0)) * 37;
        Decimal decimal2 = this.new_quantity;
        int iHashCode3 = (iHashCode2 + (decimal2 != null ? decimal2.hashCode() : 0)) * 37;
        Decimal decimal3 = this.new_sec_fee;
        int iHashCode4 = (iHashCode3 + (decimal3 != null ? decimal3.hashCode() : 0)) * 37;
        Decimal decimal4 = this.new_taf_fee;
        int iHashCode5 = (iHashCode4 + (decimal4 != null ? decimal4.hashCode() : 0)) * 37;
        Decimal decimal5 = this.new_rounded_notional;
        int iHashCode6 = (iHashCode5 + (decimal5 != null ? decimal5.hashCode() : 0)) * 37;
        Decimal decimal6 = this.new_or_fee;
        int iHashCode7 = (iHashCode6 + (decimal6 != null ? decimal6.hashCode() : 0)) * 37;
        Decimal decimal7 = this.new_occ_fee;
        int iHashCode8 = iHashCode7 + (decimal7 != null ? decimal7.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("previous_venue_execution_id=" + Internal.sanitize(this.previous_venue_execution_id));
        arrayList.add("new_venue_execution_id=" + Internal.sanitize(this.new_venue_execution_id));
        Decimal decimal = this.new_price;
        if (decimal != null) {
            arrayList.add("new_price=" + decimal);
        }
        Decimal decimal2 = this.new_quantity;
        if (decimal2 != null) {
            arrayList.add("new_quantity=" + decimal2);
        }
        Decimal decimal3 = this.new_sec_fee;
        if (decimal3 != null) {
            arrayList.add("new_sec_fee=" + decimal3);
        }
        Decimal decimal4 = this.new_taf_fee;
        if (decimal4 != null) {
            arrayList.add("new_taf_fee=" + decimal4);
        }
        Decimal decimal5 = this.new_rounded_notional;
        if (decimal5 != null) {
            arrayList.add("new_rounded_notional=" + decimal5);
        }
        Decimal decimal6 = this.new_or_fee;
        if (decimal6 != null) {
            arrayList.add("new_or_fee=" + decimal6);
        }
        Decimal decimal7 = this.new_occ_fee;
        if (decimal7 != null) {
            arrayList.add("new_occ_fee=" + decimal7);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PinnacleCorrectionDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PinnacleCorrectionDetails copy$default(PinnacleCorrectionDetails pinnacleCorrectionDetails, String str, String str2, Decimal decimal, Decimal decimal2, Decimal decimal3, Decimal decimal4, Decimal decimal5, Decimal decimal6, Decimal decimal7, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = pinnacleCorrectionDetails.previous_venue_execution_id;
        }
        if ((i & 2) != 0) {
            str2 = pinnacleCorrectionDetails.new_venue_execution_id;
        }
        if ((i & 4) != 0) {
            decimal = pinnacleCorrectionDetails.new_price;
        }
        if ((i & 8) != 0) {
            decimal2 = pinnacleCorrectionDetails.new_quantity;
        }
        if ((i & 16) != 0) {
            decimal3 = pinnacleCorrectionDetails.new_sec_fee;
        }
        if ((i & 32) != 0) {
            decimal4 = pinnacleCorrectionDetails.new_taf_fee;
        }
        if ((i & 64) != 0) {
            decimal5 = pinnacleCorrectionDetails.new_rounded_notional;
        }
        if ((i & 128) != 0) {
            decimal6 = pinnacleCorrectionDetails.new_or_fee;
        }
        if ((i & 256) != 0) {
            decimal7 = pinnacleCorrectionDetails.new_occ_fee;
        }
        if ((i & 512) != 0) {
            byteString = pinnacleCorrectionDetails.unknownFields();
        }
        Decimal decimal8 = decimal7;
        ByteString byteString2 = byteString;
        Decimal decimal9 = decimal5;
        Decimal decimal10 = decimal6;
        Decimal decimal11 = decimal3;
        Decimal decimal12 = decimal4;
        return pinnacleCorrectionDetails.copy(str, str2, decimal, decimal2, decimal11, decimal12, decimal9, decimal10, decimal8, byteString2);
    }

    public final PinnacleCorrectionDetails copy(String previous_venue_execution_id, String new_venue_execution_id, Decimal new_price, Decimal new_quantity, Decimal new_sec_fee, Decimal new_taf_fee, Decimal new_rounded_notional, Decimal new_or_fee, Decimal new_occ_fee, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(previous_venue_execution_id, "previous_venue_execution_id");
        Intrinsics.checkNotNullParameter(new_venue_execution_id, "new_venue_execution_id");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PinnacleCorrectionDetails(previous_venue_execution_id, new_venue_execution_id, new_price, new_quantity, new_sec_fee, new_taf_fee, new_rounded_notional, new_or_fee, new_occ_fee, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(PinnacleCorrectionDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<PinnacleCorrectionDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.PinnacleCorrectionDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(PinnacleCorrectionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getPrevious_venue_execution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getPrevious_venue_execution_id());
                }
                if (!Intrinsics.areEqual(value.getNew_venue_execution_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getNew_venue_execution_id());
                }
                if (value.getNew_price() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(3, value.getNew_price());
                }
                if (value.getNew_quantity() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(4, value.getNew_quantity());
                }
                if (value.getNew_sec_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(5, value.getNew_sec_fee());
                }
                if (value.getNew_taf_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(6, value.getNew_taf_fee());
                }
                if (value.getNew_rounded_notional() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(7, value.getNew_rounded_notional());
                }
                if (value.getNew_or_fee() != null) {
                    size += Decimal.ADAPTER.encodedSizeWithTag(8, value.getNew_or_fee());
                }
                return value.getNew_occ_fee() != null ? size + Decimal.ADAPTER.encodedSizeWithTag(9, value.getNew_occ_fee()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, PinnacleCorrectionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getPrevious_venue_execution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrevious_venue_execution_id());
                }
                if (!Intrinsics.areEqual(value.getNew_venue_execution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_venue_execution_id());
                }
                if (value.getNew_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getNew_price());
                }
                if (value.getNew_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getNew_quantity());
                }
                if (value.getNew_sec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getNew_sec_fee());
                }
                if (value.getNew_taf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getNew_taf_fee());
                }
                if (value.getNew_rounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getNew_rounded_notional());
                }
                if (value.getNew_or_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getNew_or_fee());
                }
                if (value.getNew_occ_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getNew_occ_fee());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, PinnacleCorrectionDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getNew_occ_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 9, (int) value.getNew_occ_fee());
                }
                if (value.getNew_or_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 8, (int) value.getNew_or_fee());
                }
                if (value.getNew_rounded_notional() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 7, (int) value.getNew_rounded_notional());
                }
                if (value.getNew_taf_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 6, (int) value.getNew_taf_fee());
                }
                if (value.getNew_sec_fee() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 5, (int) value.getNew_sec_fee());
                }
                if (value.getNew_quantity() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 4, (int) value.getNew_quantity());
                }
                if (value.getNew_price() != null) {
                    Decimal.ADAPTER.encodeWithTag(writer, 3, (int) value.getNew_price());
                }
                if (!Intrinsics.areEqual(value.getNew_venue_execution_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getNew_venue_execution_id());
                }
                if (Intrinsics.areEqual(value.getPrevious_venue_execution_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getPrevious_venue_execution_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleCorrectionDetails redact(PinnacleCorrectionDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Decimal new_price = value.getNew_price();
                Decimal decimalRedact = new_price != null ? Decimal.ADAPTER.redact(new_price) : null;
                Decimal new_quantity = value.getNew_quantity();
                Decimal decimalRedact2 = new_quantity != null ? Decimal.ADAPTER.redact(new_quantity) : null;
                Decimal new_sec_fee = value.getNew_sec_fee();
                Decimal decimalRedact3 = new_sec_fee != null ? Decimal.ADAPTER.redact(new_sec_fee) : null;
                Decimal new_taf_fee = value.getNew_taf_fee();
                Decimal decimalRedact4 = new_taf_fee != null ? Decimal.ADAPTER.redact(new_taf_fee) : null;
                Decimal new_rounded_notional = value.getNew_rounded_notional();
                Decimal decimalRedact5 = new_rounded_notional != null ? Decimal.ADAPTER.redact(new_rounded_notional) : null;
                Decimal new_or_fee = value.getNew_or_fee();
                Decimal decimalRedact6 = new_or_fee != null ? Decimal.ADAPTER.redact(new_or_fee) : null;
                Decimal new_occ_fee = value.getNew_occ_fee();
                return PinnacleCorrectionDetails.copy$default(value, null, null, decimalRedact, decimalRedact2, decimalRedact3, decimalRedact4, decimalRedact5, decimalRedact6, new_occ_fee != null ? Decimal.ADAPTER.redact(new_occ_fee) : null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public PinnacleCorrectionDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Decimal decimalDecode = null;
                Decimal decimalDecode2 = null;
                Decimal decimalDecode3 = null;
                Decimal decimalDecode4 = null;
                Decimal decimalDecode5 = null;
                Decimal decimalDecode6 = null;
                Decimal decimalDecode7 = null;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 2:
                                strDecode2 = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 3:
                                decimalDecode = Decimal.ADAPTER.decode(reader);
                                break;
                            case 4:
                                decimalDecode2 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 5:
                                decimalDecode3 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 6:
                                decimalDecode4 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 7:
                                decimalDecode5 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 8:
                                decimalDecode6 = Decimal.ADAPTER.decode(reader);
                                break;
                            case 9:
                                decimalDecode7 = Decimal.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new PinnacleCorrectionDetails(strDecode, strDecode2, decimalDecode, decimalDecode2, decimalDecode3, decimalDecode4, decimalDecode5, decimalDecode6, decimalDecode7, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }
}
