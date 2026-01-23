package eoy_giveaway.p456v1;

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

/* compiled from: RunScriptOnCanvasRequest.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00162\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\r\u001a\u00020\u0002H\u0017J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J$\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, m3636d2 = {"Leoy_giveaway/v1/RunScriptOnCanvasRequest;", "Lcom/squareup/wire/Message;", "", "view_id", "", "script", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getView_id", "()Ljava/lang/String;", "getScript", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "eoy_giveaway.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class RunScriptOnCanvasRequest extends Message {

    @JvmField
    public static final ProtoAdapter<RunScriptOnCanvasRequest> ADAPTER;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String script;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "viewId", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String view_id;

    public RunScriptOnCanvasRequest() {
        this(null, null, null, 7, null);
    }

    public /* synthetic */ RunScriptOnCanvasRequest(String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m27977newBuilder();
    }

    public final String getView_id() {
        return this.view_id;
    }

    public final String getScript() {
        return this.script;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RunScriptOnCanvasRequest(String view_id, String script, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(view_id, "view_id");
        Intrinsics.checkNotNullParameter(script, "script");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.view_id = view_id;
        this.script = script;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m27977newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof RunScriptOnCanvasRequest)) {
            return false;
        }
        RunScriptOnCanvasRequest runScriptOnCanvasRequest = (RunScriptOnCanvasRequest) other;
        return Intrinsics.areEqual(unknownFields(), runScriptOnCanvasRequest.unknownFields()) && Intrinsics.areEqual(this.view_id, runScriptOnCanvasRequest.view_id) && Intrinsics.areEqual(this.script, runScriptOnCanvasRequest.script);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.view_id.hashCode()) * 37) + this.script.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("view_id=" + Internal.sanitize(this.view_id));
        arrayList.add("script=" + Internal.sanitize(this.script));
        return CollectionsKt.joinToString$default(arrayList, ", ", "RunScriptOnCanvasRequest{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ RunScriptOnCanvasRequest copy$default(RunScriptOnCanvasRequest runScriptOnCanvasRequest, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = runScriptOnCanvasRequest.view_id;
        }
        if ((i & 2) != 0) {
            str2 = runScriptOnCanvasRequest.script;
        }
        if ((i & 4) != 0) {
            byteString = runScriptOnCanvasRequest.unknownFields();
        }
        return runScriptOnCanvasRequest.copy(str, str2, byteString);
    }

    public final RunScriptOnCanvasRequest copy(String view_id, String script, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(view_id, "view_id");
        Intrinsics.checkNotNullParameter(script, "script");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new RunScriptOnCanvasRequest(view_id, script, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(RunScriptOnCanvasRequest.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<RunScriptOnCanvasRequest>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: eoy_giveaway.v1.RunScriptOnCanvasRequest$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(RunScriptOnCanvasRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getView_id(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getView_id());
                }
                return !Intrinsics.areEqual(value.getScript(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getScript()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, RunScriptOnCanvasRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getView_id(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getView_id());
                }
                if (!Intrinsics.areEqual(value.getScript(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScript());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, RunScriptOnCanvasRequest value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getScript(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getScript());
                }
                if (Intrinsics.areEqual(value.getView_id(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getView_id());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public RunScriptOnCanvasRequest redact(RunScriptOnCanvasRequest value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return RunScriptOnCanvasRequest.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public RunScriptOnCanvasRequest decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new RunScriptOnCanvasRequest(strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
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
        };
    }
}
