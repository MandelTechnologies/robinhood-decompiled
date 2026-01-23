package com.robinhood.rosetta.eventlogging;

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

/* compiled from: IpoaParticipationGraphContext.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016J4\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphContext;", "Lcom/squareup/wire/Message;", "", "graph_identifier", "", "prisms", "", "Lcom/robinhood/rosetta/eventlogging/IpoaParticipationGraphPrismContext;", "average_value", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/util/List;FLokio/ByteString;)V", "getGraph_identifier", "()Ljava/lang/String;", "getAverage_value", "()F", "getPrisms", "()Ljava/util/List;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class IpoaParticipationGraphContext extends Message {

    @JvmField
    public static final ProtoAdapter<IpoaParticipationGraphContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#FLOAT", jsonName = "averageValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final float average_value;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "graphIdentifier", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String graph_identifier;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.IpoaParticipationGraphPrismContext#ADAPTER", label = WireField.Label.REPEATED, schemaIndex = 1, tag = 2)
    private final java.util.List<IpoaParticipationGraphPrismContext> prisms;

    public IpoaParticipationGraphContext() {
        this(null, null, 0.0f, null, 15, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24323newBuilder();
    }

    public final String getGraph_identifier() {
        return this.graph_identifier;
    }

    public /* synthetic */ IpoaParticipationGraphContext(String str, java.util.List list, float f, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list, (i & 4) != 0 ? 0.0f : f, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final float getAverage_value() {
        return this.average_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IpoaParticipationGraphContext(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContext> prisms, float f, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
        Intrinsics.checkNotNullParameter(prisms, "prisms");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.graph_identifier = graph_identifier;
        this.average_value = f;
        this.prisms = Internal.immutableCopyOf("prisms", prisms);
    }

    public final java.util.List<IpoaParticipationGraphPrismContext> getPrisms() {
        return this.prisms;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24323newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof IpoaParticipationGraphContext)) {
            return false;
        }
        IpoaParticipationGraphContext ipoaParticipationGraphContext = (IpoaParticipationGraphContext) other;
        return Intrinsics.areEqual(unknownFields(), ipoaParticipationGraphContext.unknownFields()) && Intrinsics.areEqual(this.graph_identifier, ipoaParticipationGraphContext.graph_identifier) && Intrinsics.areEqual(this.prisms, ipoaParticipationGraphContext.prisms) && this.average_value == ipoaParticipationGraphContext.average_value;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.graph_identifier.hashCode()) * 37) + this.prisms.hashCode()) * 37) + Float.hashCode(this.average_value);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("graph_identifier=" + Internal.sanitize(this.graph_identifier));
        if (!this.prisms.isEmpty()) {
            arrayList.add("prisms=" + this.prisms);
        }
        arrayList.add("average_value=" + this.average_value);
        return CollectionsKt.joinToString$default(arrayList, ", ", "IpoaParticipationGraphContext{", "}", 0, null, null, 56, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IpoaParticipationGraphContext copy$default(IpoaParticipationGraphContext ipoaParticipationGraphContext, String str, java.util.List list, float f, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ipoaParticipationGraphContext.graph_identifier;
        }
        if ((i & 2) != 0) {
            list = ipoaParticipationGraphContext.prisms;
        }
        if ((i & 4) != 0) {
            f = ipoaParticipationGraphContext.average_value;
        }
        if ((i & 8) != 0) {
            byteString = ipoaParticipationGraphContext.unknownFields();
        }
        return ipoaParticipationGraphContext.copy(str, list, f, byteString);
    }

    public final IpoaParticipationGraphContext copy(String graph_identifier, java.util.List<IpoaParticipationGraphPrismContext> prisms, float average_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(graph_identifier, "graph_identifier");
        Intrinsics.checkNotNullParameter(prisms, "prisms");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new IpoaParticipationGraphContext(graph_identifier, prisms, average_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(IpoaParticipationGraphContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<IpoaParticipationGraphContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.IpoaParticipationGraphContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(IpoaParticipationGraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getGraph_identifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getGraph_identifier());
                }
                int iEncodedSizeWithTag = size + IpoaParticipationGraphPrismContext.ADAPTER.asRepeated().encodedSizeWithTag(2, value.getPrisms());
                return !Float.valueOf(value.getAverage_value()).equals(Float.valueOf(0.0f)) ? iEncodedSizeWithTag + ProtoAdapter.FLOAT.encodedSizeWithTag(3, Float.valueOf(value.getAverage_value())) : iEncodedSizeWithTag;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, IpoaParticipationGraphContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getGraph_identifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGraph_identifier());
                }
                IpoaParticipationGraphPrismContext.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPrisms());
                if (!Float.valueOf(value.getAverage_value()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getAverage_value()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, IpoaParticipationGraphContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Float.valueOf(value.getAverage_value()).equals(Float.valueOf(0.0f))) {
                    ProtoAdapter.FLOAT.encodeWithTag(writer, 3, (int) Float.valueOf(value.getAverage_value()));
                }
                IpoaParticipationGraphPrismContext.ADAPTER.asRepeated().encodeWithTag(writer, 2, (int) value.getPrisms());
                if (Intrinsics.areEqual(value.getGraph_identifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getGraph_identifier());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public IpoaParticipationGraphContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ArrayList arrayList = new ArrayList();
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                float fFloatValue = 0.0f;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new IpoaParticipationGraphContext(strDecode, arrayList, fFloatValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        arrayList.add(IpoaParticipationGraphPrismContext.ADAPTER.decode(reader));
                    } else if (iNextTag == 3) {
                        fFloatValue = ProtoAdapter.FLOAT.decode(reader).floatValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public IpoaParticipationGraphContext redact(IpoaParticipationGraphContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return IpoaParticipationGraphContext.copy$default(value, null, Internal.m26823redactElements(value.getPrisms(), IpoaParticipationGraphPrismContext.ADAPTER), 0.0f, ByteString.EMPTY, 5, null);
            }
        };
    }
}
