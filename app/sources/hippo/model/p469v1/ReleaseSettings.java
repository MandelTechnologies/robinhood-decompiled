package hippo.model.p469v1;

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
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: ReleaseSettings.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lhippo/model/v1/ReleaseSettings;", "Lcom/squareup/wire/Message;", "", "release_group", "Lhippo/model/v1/ReleaseGroup;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lhippo/model/v1/ReleaseGroup;Lokio/ByteString;)V", "getRelease_group", "()Lhippo/model/v1/ReleaseGroup;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ReleaseSettings extends Message {

    @JvmField
    public static final ProtoAdapter<ReleaseSettings> ADAPTER;

    @WireField(adapter = "hippo.model.v1.ReleaseGroup#ADAPTER", jsonName = "releaseGroup", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final ReleaseGroup release_group;

    /* JADX WARN: Multi-variable type inference failed */
    public ReleaseSettings() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28256newBuilder();
    }

    public final ReleaseGroup getRelease_group() {
        return this.release_group;
    }

    public /* synthetic */ ReleaseSettings(ReleaseGroup releaseGroup, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ReleaseGroup.RELEASE_GROUP_UNSPECIFIED : releaseGroup, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReleaseSettings(ReleaseGroup release_group, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(release_group, "release_group");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.release_group = release_group;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28256newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ReleaseSettings)) {
            return false;
        }
        ReleaseSettings releaseSettings = (ReleaseSettings) other;
        return Intrinsics.areEqual(unknownFields(), releaseSettings.unknownFields()) && this.release_group == releaseSettings.release_group;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.release_group.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("release_group=" + this.release_group);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ReleaseSettings{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ReleaseSettings copy$default(ReleaseSettings releaseSettings, ReleaseGroup releaseGroup, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            releaseGroup = releaseSettings.release_group;
        }
        if ((i & 2) != 0) {
            byteString = releaseSettings.unknownFields();
        }
        return releaseSettings.copy(releaseGroup, byteString);
    }

    public final ReleaseSettings copy(ReleaseGroup release_group, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(release_group, "release_group");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ReleaseSettings(release_group, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ReleaseSettings.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ReleaseSettings>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: hippo.model.v1.ReleaseSettings$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ReleaseSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getRelease_group() != ReleaseGroup.RELEASE_GROUP_UNSPECIFIED ? size + ReleaseGroup.ADAPTER.encodedSizeWithTag(1, value.getRelease_group()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ReleaseSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getRelease_group() != ReleaseGroup.RELEASE_GROUP_UNSPECIFIED) {
                    ReleaseGroup.ADAPTER.encodeWithTag(writer, 1, (int) value.getRelease_group());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ReleaseSettings value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getRelease_group() != ReleaseGroup.RELEASE_GROUP_UNSPECIFIED) {
                    ReleaseGroup.ADAPTER.encodeWithTag(writer, 1, (int) value.getRelease_group());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ReleaseSettings decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ReleaseGroup releaseGroupDecode = ReleaseGroup.RELEASE_GROUP_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ReleaseSettings(releaseGroupDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            releaseGroupDecode = ReleaseGroup.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ReleaseSettings redact(ReleaseSettings value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ReleaseSettings.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }
}
