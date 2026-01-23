package com.robinhood.rosetta.experiment_assignment;

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

/* compiled from: HTTPAssignResult.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0004H\u0016J.\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/HTTPAssignResult;", "Lcom/squareup/wire/Message;", "", "name", "", "variation", "userleap", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getVariation", "getUserleap", "()Z", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class HTTPAssignResult extends Message {

    @JvmField
    public static final ProtoAdapter<HTTPAssignResult> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final boolean userleap;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String variation;

    public HTTPAssignResult() {
        this(null, null, false, null, 15, null);
    }

    public /* synthetic */ HTTPAssignResult(String str, String str2, boolean z, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24638newBuilder();
    }

    public final String getName() {
        return this.name;
    }

    public final String getVariation() {
        return this.variation;
    }

    public final boolean getUserleap() {
        return this.userleap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HTTPAssignResult(String name, String variation, boolean z, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variation, "variation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.variation = variation;
        this.userleap = z;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24638newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof HTTPAssignResult)) {
            return false;
        }
        HTTPAssignResult hTTPAssignResult = (HTTPAssignResult) other;
        return Intrinsics.areEqual(unknownFields(), hTTPAssignResult.unknownFields()) && Intrinsics.areEqual(this.name, hTTPAssignResult.name) && Intrinsics.areEqual(this.variation, hTTPAssignResult.variation) && this.userleap == hTTPAssignResult.userleap;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.variation.hashCode()) * 37) + Boolean.hashCode(this.userleap);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + Internal.sanitize(this.name));
        arrayList.add("variation=" + Internal.sanitize(this.variation));
        arrayList.add("userleap=" + this.userleap);
        return CollectionsKt.joinToString$default(arrayList, ", ", "HTTPAssignResult{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ HTTPAssignResult copy$default(HTTPAssignResult hTTPAssignResult, String str, String str2, boolean z, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hTTPAssignResult.name;
        }
        if ((i & 2) != 0) {
            str2 = hTTPAssignResult.variation;
        }
        if ((i & 4) != 0) {
            z = hTTPAssignResult.userleap;
        }
        if ((i & 8) != 0) {
            byteString = hTTPAssignResult.unknownFields();
        }
        return hTTPAssignResult.copy(str, str2, z, byteString);
    }

    public final HTTPAssignResult copy(String name, String variation, boolean userleap, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(variation, "variation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new HTTPAssignResult(name, variation, userleap, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(HTTPAssignResult.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<HTTPAssignResult>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.HTTPAssignResult$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(HTTPAssignResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getVariation(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVariation());
                }
                return value.getUserleap() ? size + ProtoAdapter.BOOL.encodedSizeWithTag(3, Boolean.valueOf(value.getUserleap())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, HTTPAssignResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getVariation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariation());
                }
                if (value.getUserleap()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getUserleap()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, HTTPAssignResult value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getUserleap()) {
                    ProtoAdapter.BOOL.encodeWithTag(writer, 3, (int) Boolean.valueOf(value.getUserleap()));
                }
                if (!Intrinsics.areEqual(value.getVariation(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVariation());
                }
                if (Intrinsics.areEqual(value.getName(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public HTTPAssignResult redact(HTTPAssignResult value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return HTTPAssignResult.copy$default(value, null, null, false, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public HTTPAssignResult decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                boolean zBooleanValue = false;
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new HTTPAssignResult(strDecode, strDecode2, zBooleanValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        zBooleanValue = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
