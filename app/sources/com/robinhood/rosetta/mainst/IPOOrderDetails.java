package com.robinhood.rosetta.mainst;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
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

/* compiled from: IPOOrderDetails.kt */
@kotlin.Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0096\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\nR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\n¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/rosetta/mainst/IPOOrderDetails;", "Lcom/squareup/wire/Message;", "", "is_ipo_access_order", "", "is_ipo_access_dsp", "unknownFields", "Lokio/ByteString;", "<init>", "(ZZLokio/ByteString;)V", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "rosetta.mainst_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class IPOOrderDetails extends Message {

    @JvmField
    public static final ProtoAdapter<IPOOrderDetails> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isIpoAccessDsp", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final boolean is_ipo_access_dsp;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "isIpoAccessOrder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final boolean is_ipo_access_order;

    public IPOOrderDetails() {
        this(false, false, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24665newBuilder();
    }

    /* renamed from: is_ipo_access_order, reason: from getter */
    public final boolean getIs_ipo_access_order() {
        return this.is_ipo_access_order;
    }

    /* renamed from: is_ipo_access_dsp, reason: from getter */
    public final boolean getIs_ipo_access_dsp() {
        return this.is_ipo_access_dsp;
    }

    public /* synthetic */ IPOOrderDetails(boolean z, boolean z2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IPOOrderDetails(boolean z, boolean z2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.is_ipo_access_order = z;
        this.is_ipo_access_dsp = z2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24665newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IPOOrderDetails)) {
            return false;
        }
        IPOOrderDetails iPOOrderDetails = (IPOOrderDetails) other;
        return Intrinsics.areEqual(unknownFields(), iPOOrderDetails.unknownFields()) && this.is_ipo_access_order == iPOOrderDetails.is_ipo_access_order && this.is_ipo_access_dsp == iPOOrderDetails.is_ipo_access_dsp;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + Boolean.hashCode(this.is_ipo_access_order)) * 37) + Boolean.hashCode(this.is_ipo_access_dsp);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("is_ipo_access_order=" + this.is_ipo_access_order);
        arrayList.add("is_ipo_access_dsp=" + this.is_ipo_access_dsp);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IPOOrderDetails{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ IPOOrderDetails copy$default(IPOOrderDetails iPOOrderDetails, boolean z, boolean z2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            z = iPOOrderDetails.is_ipo_access_order;
        }
        if ((i & 2) != 0) {
            z2 = iPOOrderDetails.is_ipo_access_dsp;
        }
        if ((i & 4) != 0) {
            byteString = iPOOrderDetails.unknownFields();
        }
        return iPOOrderDetails.copy(z, z2, byteString);
    }

    public final IPOOrderDetails copy(boolean is_ipo_access_order, boolean is_ipo_access_dsp, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IPOOrderDetails(is_ipo_access_order, is_ipo_access_dsp, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IPOOrderDetails.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IPOOrderDetails>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.mainst.IPOOrderDetails$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IPOOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getIs_ipo_access_order()) {
                    size += ProtoAdapter.BOOL.encodedSizeWithTag(1, Boolean.valueOf(value.getIs_ipo_access_order()));
                }
                return value.getIs_ipo_access_dsp() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getIs_ipo_access_dsp())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IPOOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getIs_ipo_access_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_ipo_access_order()));
                }
                if (value.getIs_ipo_access_dsp()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_ipo_access_dsp()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IPOOrderDetails value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getIs_ipo_access_dsp()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getIs_ipo_access_dsp()));
                }
                if (value.getIs_ipo_access_order()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 1, (int) Boolean.valueOf(value.getIs_ipo_access_order()));
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IPOOrderDetails redact(IPOOrderDetails value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IPOOrderDetails.copy$default(value, false, false, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IPOOrderDetails decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                boolean zBooleanValue = false;
                boolean zBooleanValue2 = false;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IPOOrderDetails(zBooleanValue, zBooleanValue2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else if (iNextTag == 2) {
                        zBooleanValue2 = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
