package bonfire.proto.idl.equities.p034v1;

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

/* compiled from: Killswitch.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, m3636d2 = {"Lbonfire/proto/idl/equities/v1/Killswitch;", "Lcom/squareup/wire/Message;", "", "killswitch_name", "Lbonfire/proto/idl/equities/v1/KillswitchName;", "servar_value", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lbonfire/proto/idl/equities/v1/KillswitchName;Ljava/lang/String;Lokio/ByteString;)V", "getKillswitch_name", "()Lbonfire/proto/idl/equities/v1/KillswitchName;", "getServar_value", "()Ljava/lang/String;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "bonfire.proto.idl.equities.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes16.dex */
public final class Killswitch extends Message {

    @JvmField
    public static final ProtoAdapter<Killswitch> ADAPTER;

    @WireField(adapter = "bonfire.proto.idl.equities.v1.KillswitchName#ADAPTER", jsonName = "killswitchName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final KillswitchName killswitch_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "servarValue", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String servar_value;

    public Killswitch() {
        this(null, null, null, 7, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m8970newBuilder();
    }

    public final KillswitchName getKillswitch_name() {
        return this.killswitch_name;
    }

    public /* synthetic */ Killswitch(KillswitchName killswitchName, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? KillswitchName.KILLSWITCH_UNSPECIFIED : killswitchName, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getServar_value() {
        return this.servar_value;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Killswitch(KillswitchName killswitch_name, String servar_value, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(killswitch_name, "killswitch_name");
        Intrinsics.checkNotNullParameter(servar_value, "servar_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.killswitch_name = killswitch_name;
        this.servar_value = servar_value;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m8970newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Killswitch)) {
            return false;
        }
        Killswitch killswitch = (Killswitch) other;
        return Intrinsics.areEqual(unknownFields(), killswitch.unknownFields()) && this.killswitch_name == killswitch.killswitch_name && Intrinsics.areEqual(this.servar_value, killswitch.servar_value);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((unknownFields().hashCode() * 37) + this.killswitch_name.hashCode()) * 37) + this.servar_value.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("killswitch_name=" + this.killswitch_name);
        arrayList.add("servar_value=" + Internal.sanitize(this.servar_value));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Killswitch{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Killswitch copy$default(Killswitch killswitch, KillswitchName killswitchName, String str, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            killswitchName = killswitch.killswitch_name;
        }
        if ((i & 2) != 0) {
            str = killswitch.servar_value;
        }
        if ((i & 4) != 0) {
            byteString = killswitch.unknownFields();
        }
        return killswitch.copy(killswitchName, str, byteString);
    }

    public final Killswitch copy(KillswitchName killswitch_name, String servar_value, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(killswitch_name, "killswitch_name");
        Intrinsics.checkNotNullParameter(servar_value, "servar_value");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Killswitch(killswitch_name, servar_value, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Killswitch.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Killswitch>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: bonfire.proto.idl.equities.v1.Killswitch$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Killswitch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getKillswitch_name() != KillswitchName.KILLSWITCH_UNSPECIFIED) {
                    size += KillswitchName.ADAPTER.encodedSizeWithTag(1, value.getKillswitch_name());
                }
                return !Intrinsics.areEqual(value.getServar_value(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(2, value.getServar_value()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Killswitch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getKillswitch_name() != KillswitchName.KILLSWITCH_UNSPECIFIED) {
                    KillswitchName.ADAPTER.encodeWithTag(writer, 1, (int) value.getKillswitch_name());
                }
                if (!Intrinsics.areEqual(value.getServar_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getServar_value());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Killswitch value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getServar_value(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getServar_value());
                }
                if (value.getKillswitch_name() != KillswitchName.KILLSWITCH_UNSPECIFIED) {
                    KillswitchName.ADAPTER.encodeWithTag(writer, 1, (int) value.getKillswitch_name());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Killswitch decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                KillswitchName killswitchNameDecode = KillswitchName.KILLSWITCH_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Killswitch(killswitchNameDecode, strDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            killswitchNameDecode = KillswitchName.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Killswitch redact(Killswitch value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Killswitch.copy$default(value, null, null, ByteString.EMPTY, 3, null);
            }
        };
    }
}
