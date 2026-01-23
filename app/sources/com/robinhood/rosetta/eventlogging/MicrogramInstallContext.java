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

/* compiled from: MicrogramInstallContext.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u00182\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0018B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u000f\u001a\u00020\u0002H\u0017J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0096\u0002J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0004H\u0016J.\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/MicrogramInstallContext;", "Lcom/squareup/wire/Message;", "", "identifier", "", "version", "build", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getIdentifier", "()Ljava/lang/String;", "getVersion", "getBuild", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class MicrogramInstallContext extends Message {

    @JvmField
    public static final ProtoAdapter<MicrogramInstallContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String build;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String identifier;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String version;

    public MicrogramInstallContext() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ MicrogramInstallContext(String str, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24382newBuilder();
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getVersion() {
        return this.version;
    }

    public final String getBuild() {
        return this.build;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MicrogramInstallContext(String identifier, String version, String build, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(build, "build");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.identifier = identifier;
        this.version = version;
        this.build = build;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24382newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof MicrogramInstallContext)) {
            return false;
        }
        MicrogramInstallContext microgramInstallContext = (MicrogramInstallContext) other;
        return Intrinsics.areEqual(unknownFields(), microgramInstallContext.unknownFields()) && Intrinsics.areEqual(this.identifier, microgramInstallContext.identifier) && Intrinsics.areEqual(this.version, microgramInstallContext.version) && Intrinsics.areEqual(this.build, microgramInstallContext.build);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.identifier.hashCode()) * 37) + this.version.hashCode()) * 37) + this.build.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        arrayList.add("version=" + Internal.sanitize(this.version));
        arrayList.add("build=" + Internal.sanitize(this.build));
        return CollectionsKt.joinToString$default(arrayList, ", ", "MicrogramInstallContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ MicrogramInstallContext copy$default(MicrogramInstallContext microgramInstallContext, String str, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = microgramInstallContext.identifier;
        }
        if ((i & 2) != 0) {
            str2 = microgramInstallContext.version;
        }
        if ((i & 4) != 0) {
            str3 = microgramInstallContext.build;
        }
        if ((i & 8) != 0) {
            byteString = microgramInstallContext.unknownFields();
        }
        return microgramInstallContext.copy(str, str2, str3, byteString);
    }

    public final MicrogramInstallContext copy(String identifier, String version, String build, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(version, "version");
        Intrinsics.checkNotNullParameter(build, "build");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new MicrogramInstallContext(identifier, version, build, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(MicrogramInstallContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<MicrogramInstallContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.MicrogramInstallContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(MicrogramInstallContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getVersion());
                }
                return !Intrinsics.areEqual(value.getBuild(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getBuild()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, MicrogramInstallContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVersion());
                }
                if (!Intrinsics.areEqual(value.getBuild(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBuild());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, MicrogramInstallContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getBuild(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getBuild());
                }
                if (!Intrinsics.areEqual(value.getVersion(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getVersion());
                }
                if (Intrinsics.areEqual(value.getIdentifier(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getIdentifier());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public MicrogramInstallContext redact(MicrogramInstallContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return MicrogramInstallContext.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public MicrogramInstallContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new MicrogramInstallContext(strDecode, strDecode2, strDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
