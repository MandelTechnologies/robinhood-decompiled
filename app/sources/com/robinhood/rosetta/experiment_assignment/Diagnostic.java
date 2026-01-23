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

/* compiled from: Diagnostic.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0004H\u0016J8\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/rosetta/experiment_assignment/Diagnostic;", "Lcom/squareup/wire/Message;", "", "variant", "", "reason", "listName", "errorMessage", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getVariant", "()Ljava/lang/String;", "getReason", "getListName", "getErrorMessage", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "experiment_assignment.service_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class Diagnostic extends Message {

    @JvmField
    public static final ProtoAdapter<Diagnostic> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String errorMessage;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String listName;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String reason;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String variant;

    public Diagnostic() {
        this(null, null, null, null, null, 31, null);
    }

    public /* synthetic */ Diagnostic(String str, String str2, String str3, String str4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24629newBuilder();
    }

    public final String getVariant() {
        return this.variant;
    }

    public final String getReason() {
        return this.reason;
    }

    public final String getListName() {
        return this.listName;
    }

    public final String getErrorMessage() {
        return this.errorMessage;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Diagnostic(String variant, String reason, String listName, String errorMessage, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.variant = variant;
        this.reason = reason;
        this.listName = listName;
        this.errorMessage = errorMessage;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24629newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Diagnostic)) {
            return false;
        }
        Diagnostic diagnostic = (Diagnostic) other;
        return Intrinsics.areEqual(unknownFields(), diagnostic.unknownFields()) && Intrinsics.areEqual(this.variant, diagnostic.variant) && Intrinsics.areEqual(this.reason, diagnostic.reason) && Intrinsics.areEqual(this.listName, diagnostic.listName) && Intrinsics.areEqual(this.errorMessage, diagnostic.errorMessage);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.variant.hashCode()) * 37) + this.reason.hashCode()) * 37) + this.listName.hashCode()) * 37) + this.errorMessage.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("variant=" + Internal.sanitize(this.variant));
        arrayList.add("reason=" + Internal.sanitize(this.reason));
        arrayList.add("listName=" + Internal.sanitize(this.listName));
        arrayList.add("errorMessage=" + Internal.sanitize(this.errorMessage));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Diagnostic{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Diagnostic copy$default(Diagnostic diagnostic, String str, String str2, String str3, String str4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = diagnostic.variant;
        }
        if ((i & 2) != 0) {
            str2 = diagnostic.reason;
        }
        if ((i & 4) != 0) {
            str3 = diagnostic.listName;
        }
        if ((i & 8) != 0) {
            str4 = diagnostic.errorMessage;
        }
        if ((i & 16) != 0) {
            byteString = diagnostic.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str5 = str3;
        return diagnostic.copy(str, str2, str5, str4, byteString2);
    }

    public final Diagnostic copy(String variant, String reason, String listName, String errorMessage, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(variant, "variant");
        Intrinsics.checkNotNullParameter(reason, "reason");
        Intrinsics.checkNotNullParameter(listName, "listName");
        Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Diagnostic(variant, reason, listName, errorMessage, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Diagnostic.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Diagnostic>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.experiment_assignment.Diagnostic$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Diagnostic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getVariant());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getReason());
                }
                if (!Intrinsics.areEqual(value.getListName(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getListName());
                }
                return !Intrinsics.areEqual(value.getErrorMessage(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(4, value.getErrorMessage()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Diagnostic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getVariant(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVariant());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (!Intrinsics.areEqual(value.getListName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getListName());
                }
                if (!Intrinsics.areEqual(value.getErrorMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getErrorMessage());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Diagnostic value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getErrorMessage(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getErrorMessage());
                }
                if (!Intrinsics.areEqual(value.getListName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getListName());
                }
                if (!Intrinsics.areEqual(value.getReason(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getReason());
                }
                if (Intrinsics.areEqual(value.getVariant(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getVariant());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Diagnostic redact(Diagnostic value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Diagnostic.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Diagnostic decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Diagnostic(strDecode, strDecode2, strDecode3, strDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
