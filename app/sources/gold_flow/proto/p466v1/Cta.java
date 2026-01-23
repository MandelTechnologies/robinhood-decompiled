package gold_flow.proto.p466v1;

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

/* compiled from: Cta.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001f2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB?\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u0004H\u0016JC\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0015\u0010\u0013¨\u0006 "}, m3636d2 = {"Lgold_flow/proto/v1/Cta;", "Lcom/squareup/wire/Message;", "", "text", "", "action", "Lgold_flow/proto/v1/Action;", "enabled", "", "loading", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)V", "getText", "()Ljava/lang/String;", "getAction", "()Lgold_flow/proto/v1/Action;", "getEnabled", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLoading", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/Cta;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class Cta extends Message {

    @JvmField
    public static final ProtoAdapter<Cta> ADAPTER;

    @WireField(adapter = "gold_flow.proto.v1.Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Action action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 2, tag = 3)
    private final Boolean enabled;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", schemaIndex = 3, tag = 4)
    private final Boolean loading;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String text;

    public Cta() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28146newBuilder();
    }

    public final String getText() {
        return this.text;
    }

    public /* synthetic */ Cta(String str, Action action, Boolean bool, Boolean bool2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? null : action, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : bool2, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Action getAction() {
        return this.action;
    }

    public final Boolean getEnabled() {
        return this.enabled;
    }

    public final Boolean getLoading() {
        return this.loading;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Cta(String text, Action action, Boolean bool, Boolean bool2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.text = text;
        this.action = action;
        this.enabled = bool;
        this.loading = bool2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28146newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Cta)) {
            return false;
        }
        Cta cta = (Cta) other;
        return Intrinsics.areEqual(unknownFields(), cta.unknownFields()) && Intrinsics.areEqual(this.text, cta.text) && Intrinsics.areEqual(this.action, cta.action) && Intrinsics.areEqual(this.enabled, cta.enabled) && Intrinsics.areEqual(this.loading, cta.loading);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.text.hashCode()) * 37;
        Action action = this.action;
        int iHashCode2 = (iHashCode + (action != null ? action.hashCode() : 0)) * 37;
        Boolean bool = this.enabled;
        int iHashCode3 = (iHashCode2 + (bool != null ? bool.hashCode() : 0)) * 37;
        Boolean bool2 = this.loading;
        int iHashCode4 = iHashCode3 + (bool2 != null ? bool2.hashCode() : 0);
        this.hashCode = iHashCode4;
        return iHashCode4;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("text=" + Internal.sanitize(this.text));
        Action action = this.action;
        if (action != null) {
            arrayList.add("action=" + action);
        }
        Boolean bool = this.enabled;
        if (bool != null) {
            arrayList.add("enabled=" + bool);
        }
        Boolean bool2 = this.loading;
        if (bool2 != null) {
            arrayList.add("loading=" + bool2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "Cta{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Cta copy$default(Cta cta, String str, Action action, Boolean bool, Boolean bool2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cta.text;
        }
        if ((i & 2) != 0) {
            action = cta.action;
        }
        if ((i & 4) != 0) {
            bool = cta.enabled;
        }
        if ((i & 8) != 0) {
            bool2 = cta.loading;
        }
        if ((i & 16) != 0) {
            byteString = cta.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean bool3 = bool;
        return cta.copy(str, action, bool3, bool2, byteString2);
    }

    public final Cta copy(String text, Action action, Boolean enabled, Boolean loading, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Cta(text, action, enabled, loading, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Cta.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Cta>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: gold_flow.proto.v1.Cta$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Cta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getText());
                }
                if (value.getAction() != null) {
                    size += Action.ADAPTER.encodedSizeWithTag(2, value.getAction());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                return size + protoAdapter.encodedSizeWithTag(3, value.getEnabled()) + protoAdapter.encodedSizeWithTag(4, value.getLoading());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Cta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getText(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
                }
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEnabled());
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLoading());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Cta value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<Boolean> protoAdapter = ProtoAdapter.BOOL;
                protoAdapter.encodeWithTag(writer, 4, (int) value.getLoading());
                protoAdapter.encodeWithTag(writer, 3, (int) value.getEnabled());
                if (value.getAction() != null) {
                    Action.ADAPTER.encodeWithTag(writer, 2, (int) value.getAction());
                }
                if (Intrinsics.areEqual(value.getText(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getText());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Cta redact(Cta value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Action action = value.getAction();
                return Cta.copy$default(value, null, action != null ? Action.ADAPTER.redact(action) : null, null, null, ByteString.EMPTY, 13, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Cta decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                Action actionDecode = null;
                Boolean boolDecode = null;
                Boolean boolDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Cta(strDecode, actionDecode, boolDecode, boolDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        actionDecode = Action.ADAPTER.decode(reader);
                    } else if (iNextTag == 3) {
                        boolDecode = ProtoAdapter.BOOL.decode(reader);
                    } else if (iNextTag == 4) {
                        boolDecode2 = ProtoAdapter.BOOL.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
